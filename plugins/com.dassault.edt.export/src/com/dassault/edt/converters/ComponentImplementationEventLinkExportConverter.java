/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpActivatableFifo;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpAnySender;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpDef;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpDynamicReceiver;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpReceiver;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpSender;
import com.dassault.edt.converters.ComponentImplementationEventLinkExportConverterHelper.OpTriggerSender;

import edtimplementation.DynamicTriggerEventSenderInstance;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLink;
import edtimplementation.EventSenderInstance;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.ModuleInstance;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.TriggerInstance;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.OpRefActivatingFifo;
import technology.ecoa.implementation._2.OpRefExternal;
import technology.ecoa.implementation._2.OpRefTrigger;
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.implementation._2.SendersType;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationEventLinkExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationEventLinkExportConverter() {

	}

	/**
	 * Convert EDT EventLinks to ECOA EventLinks
	 * 
	 * @param edtEventLinks : EDT objects to convert
	 * @return ecoaEventLinks : Converted objects
	 */
	public static ArrayList<technology.ecoa.implementation._2.EventLink> recreateEventLinks(
			ArrayList<EventLink> edtEventLinks) {
		ArrayList<technology.ecoa.implementation._2.EventLink> ecoaEventLinks = new ArrayList<>();
		ConcurrentHashMap<OpReceiver, ArrayList<OpSender>> eventLinkAssociationFromReceiver = new ConcurrentHashMap<>();
		ConcurrentHashMap<OpSender, ArrayList<OpReceiver>> eventLinkAssociationFromSender = new ConcurrentHashMap<>();

//		Recreate links
		for (EventLink edtOperationLink : edtEventLinks) {
			ComponentImplementationEventLinkExportConverterHelper.convertEventLinksToHashMap(
					eventLinkAssociationFromSender, eventLinkAssociationFromReceiver, edtOperationLink);
		}

		ArrayList<OpReceiver> toJump = new ArrayList<>();
		ArrayList<OpReceiver> nonUniqueReceivers = new ArrayList<>();
		for (Entry<OpReceiver, ArrayList<OpSender>> entry : eventLinkAssociationFromReceiver.entrySet()) {
			if (!toJump.contains(entry.getKey())) {
				recreateEventLinkForUniqueReceiver(ecoaEventLinks, eventLinkAssociationFromReceiver,
						eventLinkAssociationFromSender, nonUniqueReceivers, entry, toJump);
			}

		}

		Iterator<OpReceiver> iterator = nonUniqueReceivers.iterator();
		while (iterator.hasNext()) {
			OpReceiver opReceiver = iterator.next();
			if (!toJump.contains(opReceiver)) {
				technology.ecoa.implementation._2.EventLink ecoaEventLink = recreateEventLinkForNonUniqueReceiver(
						eventLinkAssociationFromReceiver, eventLinkAssociationFromSender, toJump, opReceiver);
				if (ecoaEventLink != null) {
					ecoaEventLinks.add(ecoaEventLink);
				}
			}
		}

		return ecoaEventLinks;

	}

	/**
	 * @param eventLinkAssociationFromReceiver
	 * @param eventLinkAssociationFromSender
	 * @param toJump
	 * @param opReceiver
	 * @return
	 */
	private static technology.ecoa.implementation._2.EventLink recreateEventLinkForNonUniqueReceiver(
			ConcurrentHashMap<OpReceiver, ArrayList<OpSender>> eventLinkAssociationFromReceiver,
			ConcurrentHashMap<OpSender, ArrayList<OpReceiver>> eventLinkAssociationFromSender,
			ArrayList<OpReceiver> toJump, OpReceiver opReceiver) {

		ArrayList<OpSender> senders = eventLinkAssociationFromReceiver.get(opReceiver);
		ArrayList<OpReceiver> trueReceivers = new ArrayList<>();
		trueReceivers.add(opReceiver);
		for (OpSender sender : senders) {
			ArrayList<OpReceiver> receiversOfSender = eventLinkAssociationFromSender.get(sender);

//				Suppose that if EventReceiverInstance, contains exactly the same readers, else problem of unicity
			for (OpReceiver receiverOfSender : receiversOfSender) {
				if (!Objects.equals(opReceiver, receiverOfSender) && !toJump.contains(receiverOfSender)
						&& eventLinkAssociationFromReceiver.get(receiverOfSender) != null
						&& Objects.equals(eventLinkAssociationFromReceiver.get(receiverOfSender), senders)
//						&& eventLinkAssociationFromReceiver.get(receiverOfSender).containsAll(senders)
						&& Objects.equals(opReceiver.getId(), receiverOfSender.getId())) {
					trueReceivers.add(receiverOfSender);
					if (Objects.equals(eventLinkAssociationFromReceiver.get(receiverOfSender), senders)) {
						eventLinkAssociationFromReceiver.remove(receiverOfSender);
						toJump.add(receiverOfSender);
					} else {
						eventLinkAssociationFromReceiver.get(receiverOfSender).removeAll(senders);
					}
				}
			}
		}
		eventLinkAssociationFromReceiver.remove(opReceiver);
		if (senders.isEmpty() || trueReceivers.isEmpty()) {
			return null;
		}
		technology.ecoa.implementation._2.EventLink ecoaEventLink = recreateECOAEventLink(opReceiver, senders,
				trueReceivers);
		return ecoaEventLink;
	}

	/**
	 * @param ecoaEventLinks
	 * @param eventLinkAssociationFromReceiver
	 * @param eventLinkAssociationFromSender
	 * @param nonUniqueReceivers
	 * @param entry
	 * @param toJump
	 */
	private static void recreateEventLinkForUniqueReceiver(
			ArrayList<technology.ecoa.implementation._2.EventLink> ecoaEventLinks,
			ConcurrentHashMap<OpReceiver, ArrayList<OpSender>> eventLinkAssociationFromReceiver,
			ConcurrentHashMap<OpSender, ArrayList<OpReceiver>> eventLinkAssociationFromSender,
			ArrayList<OpReceiver> nonUniqueReceivers, Entry<OpReceiver, ArrayList<OpSender>> entry,
			ArrayList<OpReceiver> toJump) {
		OpReceiver receiver = entry.getKey();
		ArrayList<OpSender> senders = entry.getValue();
		if (receiver instanceof OpActivatableFifo uniqueReceiver) {
			ArrayList<OpReceiver> trueReceivers = new ArrayList<>();
			trueReceivers.add(receiver);

			for (OpSender sender : senders) {
				ArrayList<OpReceiver> receiversOfSender = eventLinkAssociationFromSender.get(sender);

//					Suppose that if EventReceiverInstance, contains exactly the same Senders, else problem of unicity
				for (OpReceiver receiverOfSender : receiversOfSender) {
					if (!Objects.equals(receiver, receiverOfSender) && !toJump.contains(receiverOfSender)
							&& eventLinkAssociationFromReceiver.get(receiverOfSender) != null
//							&& eventLinkAssociationFromReceiver.get(receiverOfSender).containsAll(senders)
							&& Objects.equals(eventLinkAssociationFromReceiver.get(receiverOfSender), senders)
							&& Objects.equals(receiver.getId(), receiverOfSender.getId())) {
						trueReceivers.add(receiverOfSender);
						if (Objects.equals(eventLinkAssociationFromReceiver.get(receiverOfSender), senders)) {
							eventLinkAssociationFromReceiver.remove(receiverOfSender);
							nonUniqueReceivers.remove(receiverOfSender);
							toJump.add(receiverOfSender);
						} else {
							eventLinkAssociationFromReceiver.get(receiverOfSender).removeAll(senders);
						}
					}
				}
			}
			if (!senders.isEmpty() && !trueReceivers.isEmpty()) {
				technology.ecoa.implementation._2.EventLink ecoaEventLink = recreateECOAEventLink(receiver, senders,
						trueReceivers);
				ecoaEventLinks.add(ecoaEventLink);
			}
			eventLinkAssociationFromReceiver.remove(receiver);
		} else {
			nonUniqueReceivers.add(receiver);
		}
	}

	/**
	 * @param sender
	 * @param senders
	 * @param trueReceivers
	 * @return
	 */
	private static technology.ecoa.implementation._2.EventLink recreateECOAEventLink(OpReceiver receiver,
			ArrayList<OpSender> senders, ArrayList<OpReceiver> trueReceivers) {
		technology.ecoa.implementation._2.EventLink ecoaEventLink = IMPFACTORY.createEventLink();
		SendersType sendersType = IMPFACTORY.createSendersType();
		ReceiversType receiversType = IMPFACTORY.createReceiversType();
		if (receiver.getId() != null) {
			ecoaEventLink.setId(receiver.getId());
		}

		for (OpReceiver opReceiver : trueReceivers) {
			if (opReceiver instanceof OpActivatableFifo op) {
				OpRefActivatableFifo opRefActivatableFifo = IMPFACTORY.createOpRefActivatableFifo();

				if (op.activating != null) {
					opRefActivatableFifo.setActivating(op.activating);
				}

				if (op.fifo != null) {
					opRefActivatableFifo.setFifoSize(op.fifo);
				}

				opRefActivatableFifo.setInstanceName(((ModuleInstance) op.receiver.eContainer()).getName());
				opRefActivatableFifo.setOperationName(op.receiver.getName());

				receiversType.getModuleInstance().add(opRefActivatableFifo);

			} else if (opReceiver instanceof OpDef op) {
				OpRef opRef = IMPFACTORY.createOpRef();
				opRef.setOperationName(op.receiver.getName());
				if (op.receiver.eContainer() instanceof ServiceOfLinkedComponentDefinition service) {
					opRef.setInstanceName(service.getName());
					receiversType.getService().add(opRef);

				} else if (op.receiver.eContainer() instanceof ReferenceOfLinkedComponentDefinition reference) {
					opRef.setInstanceName(reference.getName());
					receiversType.getReference().add(opRef);
				}
			} else if (opReceiver instanceof OpDynamicReceiver op) {
				OpRefActivatingFifo opRefActivatingFifo = IMPFACTORY.createOpRefActivatingFifo();

				if (op.fifo != null) {
					opRefActivatingFifo.setFifoSize(op.fifo);
				}
				opRefActivatingFifo.setInstanceName(((DynamicTriggerInstance) op.receiver.eContainer()).getName());
				opRefActivatingFifo.setOperationName(op.receiver.getName());

				receiversType.getDynamicTrigger().add(opRefActivatingFifo);
			}
		}
		for (OpSender opSender : senders) {
			if (opSender instanceof OpTriggerSender op) {
				OpRefTrigger opRefTrigger = IMPFACTORY.createOpRefTrigger();

				if (op.period != null) {
					opRefTrigger.setPeriod(op.period);
				}

				opRefTrigger.setInstanceName(((TriggerInstance) op.sender.eContainer()).getName());

				sendersType.getTrigger().add(opRefTrigger);
			} else if (opSender instanceof OpAnySender op) {

				if (op.sender instanceof EventSenderInstance opMI) {
					OpRef opRef = IMPFACTORY.createOpRef();
					opRef.setOperationName(op.sender.getName());
					opRef.setInstanceName(((ModuleInstance) opMI.eContainer()).getName());

					sendersType.getModuleInstance().add(opRef);

				} else if (op.sender instanceof EventDefinitionInstance opDef) {
					OpRef opRef = IMPFACTORY.createOpRef();
					opRef.setOperationName(opDef.getName());
					if (opDef.eContainer() instanceof ServiceOfLinkedComponentDefinition service) {
						opRef.setInstanceName(service.getName());
						sendersType.getService().add(opRef);

					} else if (opDef.eContainer() instanceof ReferenceOfLinkedComponentDefinition reference) {
						opRef.setInstanceName(reference.getName());
						sendersType.getReference().add(opRef);
					}

				} else if (op.sender instanceof ExternalSenderOperation opExt) {
					OpRefExternal opRefExternal = IMPFACTORY.createOpRefExternal();
					if (opExt.isSetLanguage()) {
						opRefExternal.setLanguage(opExt.getLanguage());
					}

					opRefExternal.setOperationName(opExt.getName());
					sendersType.getExternal().add(opRefExternal);

				} else if (op.sender instanceof DynamicTriggerEventSenderInstance opDynamic) {
					OpRef opRef = IMPFACTORY.createOpRef();

					opRef.setInstanceName(((DynamicTriggerInstance) opDynamic.eContainer()).getName());
					opRef.setOperationName(opDynamic.getName());
					sendersType.getDynamicTrigger().add(opRef);

				}

			}
		}
		ecoaEventLink.setSenders(sendersType);
		ecoaEventLink.setReceivers(receiversType);
		return ecoaEventLink;
	}
}
