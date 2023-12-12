/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.dassault.edt.log.EDTLog;

import edtimplementation.ComponentImplementation;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.DynamicTriggerEventSenderInstance;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifo;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkSender;
import edtimplementation.EventLinkToDefinitionOperation;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.EventReceiverInstance;
import edtimplementation.EventSenderInstance;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.ModuleInstance;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLinkActivatableFifo;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestServerInstance;
import edtimplementation.RequestServiceInstance;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.TriggerInstance;
import edtimplementation.TriggerSender;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopyOperationLinks {
	private static final String DATA_LINK_COULD_NOT_BE_COPIED = "DataLink could not be copied";
	private static final String EVENT_LINK_COULD_NOT_BE_COPIED = "EventLink could not be copied";
	private static final String REQUEST_LINK_COULD_NOT_BE_COPIED = "RequestLink could not be copied";

	/**
	 * Copied Operation Links
	 * 
	 * @param componentImplementationToCopy : element to copy
	 * @param newComponentImplementation    : copy
	 * @return copy of operation links with correct reference
	 */
	public static EList<OperationLink> copyOperationLinks(ComponentImplementation componentImplementationToCopy,
			ComponentImplementation newComponentImplementation) {
		EList<OperationLink> copiedEList = new BasicEList<>();
		EList<OperationLink> operationLinksToCopy = componentImplementationToCopy.getOperationLinks();
		for (OperationLink operationLink : operationLinksToCopy) {
			if (operationLink instanceof DataLinkActivatableFifo dataLink) {
				copyDataLinkActivatableFifo(newComponentImplementation, copiedEList, dataLink);

			} else if (operationLink instanceof DataLinkToServiceOperation dataLink) {
				copyDataLinkToServiceOperation(newComponentImplementation, copiedEList, dataLink);

			} else if (operationLink instanceof EventLinkActivatableFifo eventLink) {
				copyEventLinkActivatableFifo(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof EventLinkActivatableFifoFromTrigger eventLink) {
				copyEventLinkActivatableFifoFromTrigger(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof EventLinkActivatingFifo eventLink) {
				copyEventLinkActivatingFiFo(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof EventLinkActivatingFifoFromTrigger eventLink) {
				copyEventLinkActivatingFifoFromTrigger(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof EventLinkToDefinitionOperation eventLink) {
				copyEventLinkToDefinitionOperation(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof EventLinkToDefinitionOperationFromTrigger eventLink) {
				copyEventLinkToDefinitionOperationFromTrigger(newComponentImplementation, copiedEList, eventLink);

			} else if (operationLink instanceof RequestLinkActivatableFifo requestLink) {
				copyRequestLinkActivatableFifo(newComponentImplementation, copiedEList, requestLink);

			} else if (operationLink instanceof RequestLinkActivatingActivatableFifo requestLink) {
				copyRequestLinkActivatingActivatableFifo(newComponentImplementation, copiedEList, requestLink);

			} else if (operationLink instanceof RequestLinkActivatingToReferenceOperation requestLink) {
				copyRequestLinkActivatingToReference(newComponentImplementation, copiedEList, requestLink);

			}
		}
		return copiedEList;
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param requestLink
	 */
	private static void copyRequestLinkActivatableFifo(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, RequestLinkActivatableFifo requestLink) {
		RequestLinkActivatableFifo copy = EcoreUtil.copy(requestLink);

		if (requestLink.getServer() == null || requestLink.getClient() == null) {
			return;
		}

//				Find server
		RequestServerInstance server = requestLink.getServer();
		OperationInstance newServer = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) server.eContainer()).getName(), server.getName());

//				Find client
		RequestServiceInstance client = requestLink.getClient();
		OperationInstance newClient = newComponentImplementation.findOperationInstanceInServices(
				((ServiceOfLinkedComponentDefinition) client.eContainer()).getName(), client.getName());

//				Set server and client
		if (newServer instanceof RequestServerInstance && newClient instanceof RequestServiceInstance) {
			copy.setServer((RequestServerInstance) newServer);
			copy.setClient((RequestServiceInstance) newClient);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(REQUEST_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param requestLink
	 */
	private static void copyRequestLinkActivatingActivatableFifo(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, RequestLinkActivatingActivatableFifo requestLink) {
		RequestLinkActivatingActivatableFifo copy = EcoreUtil.copy(requestLink);

		if (requestLink.getServer() == null || requestLink.getClient() == null) {
			return;
		}

//				Find server
		RequestServerInstance server = requestLink.getServer();
		OperationInstance newServer = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) server.eContainer()).getName(), server.getName());

//				Find client
		RequestClientInstance client = requestLink.getClient();
		OperationInstance newClient = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) client.eContainer()).getName(), client.getName());

//				Set server and client
		if (newServer instanceof RequestServerInstance && newClient instanceof RequestClientInstance) {
			copy.setServer((RequestServerInstance) newServer);
			copy.setClient((RequestClientInstance) newClient);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(REQUEST_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param requestLink
	 */
	private static void copyRequestLinkActivatingToReference(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, RequestLinkActivatingToReferenceOperation requestLink) {
		RequestLinkActivatingToReferenceOperation copy = EcoreUtil.copy(requestLink);

		if (requestLink.getServer() == null || requestLink.getClient() == null) {
			return;
		}
//				Find server
		RequestReferenceInstance server = requestLink.getServer();
		OperationInstance newServer = newComponentImplementation.findOperationInstanceInReferences(
				((ReferenceOfLinkedComponentDefinition) server.eContainer()).getName(), server.getName());

//				Find client
		RequestClientInstance client = requestLink.getClient();
		OperationInstance newClient = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) client.eContainer()).getName(), client.getName());

//				Set server and client
		if (newServer instanceof RequestReferenceInstance && newClient instanceof RequestClientInstance) {
			copy.setServer((RequestReferenceInstance) newServer);
			copy.setClient((RequestClientInstance) newClient);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(REQUEST_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkToDefinitionOperation(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, EventLinkToDefinitionOperation eventLink) {
		EventLinkToDefinitionOperation copy = EcoreUtil.copy(eventLink);

		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}

//				Find receiver
		EventDefinitionInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = null;
		if (receiver.eContainer() instanceof ServiceOfLinkedComponentDefinition serv) {
			newReceiver = newComponentImplementation.findOperationInstanceInServices(serv.getName(),
					receiver.getName());

		} else if (receiver.eContainer() instanceof ReferenceOfLinkedComponentDefinition ref) {
			newReceiver = newComponentImplementation.findOperationInstanceInReferences(ref.getName(),
					receiver.getName());

		}

//				Find sender
		EventLinkSender sender = eventLink.getSender();
		OperationInstance newSender = findEventLinkSenderOtherThanTrigger(newComponentImplementation, sender);

//				Set receiver and sender
		if (newReceiver instanceof EventDefinitionInstance && newSender instanceof EventLinkSender) {
			copy.setReceiver((EventDefinitionInstance) newReceiver);
			copy.setSender((EventLinkSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkToDefinitionOperationFromTrigger(
			ComponentImplementation newComponentImplementation, EList<OperationLink> operationLinksToCopy,
			EventLinkToDefinitionOperationFromTrigger eventLink) {
		EventLinkToDefinitionOperationFromTrigger copy = EcoreUtil.copy(eventLink);
		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}
//				Find receiver
		EventDefinitionInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = null;
		if (receiver.eContainer() instanceof ServiceOfLinkedComponentDefinition serv) {
			newReceiver = newComponentImplementation.findOperationInstanceInServices(serv.getName(),
					receiver.getName());

		} else if (receiver.eContainer() instanceof ReferenceOfLinkedComponentDefinition ref) {
			newReceiver = newComponentImplementation.findOperationInstanceInReferences(ref.getName(),
					receiver.getName());

		}

//				Find sender
		TriggerSender sender = eventLink.getSender();
		OperationInstance newSender = newComponentImplementation
				.findOperationInstanceInTriggerInstances(((TriggerInstance) sender.eContainer()).getName());

//				Set receiver and sender
		if (newReceiver instanceof EventDefinitionInstance && newSender instanceof TriggerSender) {
			copy.setReceiver((EventDefinitionInstance) newReceiver);
			copy.setSender((TriggerSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkActivatingFifoFromTrigger(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, EventLinkActivatingFifoFromTrigger eventLink) {
		EventLinkActivatingFifoFromTrigger copy = EcoreUtil.copy(eventLink);

		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}
//				Find receiver
		DynamicTriggerEventReceiverInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = newComponentImplementation.findOperationInstanceInDynamicTriggerInstances(
				((DynamicTriggerInstance) receiver.eContainer()).getName(), receiver.getName());

//				Find sender
		TriggerSender sender = eventLink.getSender();
		OperationInstance newSender = newComponentImplementation
				.findOperationInstanceInTriggerInstances(((TriggerInstance) sender.eContainer()).getName());

//				Set receiver and sender
		if (newReceiver instanceof DynamicTriggerEventReceiverInstance && newSender instanceof TriggerSender) {
			copy.setReceiver((DynamicTriggerEventReceiverInstance) newReceiver);
			copy.setSender((TriggerSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkActivatingFiFo(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, EventLinkActivatingFifo eventLink) {
		EventLinkActivatingFifo copy = EcoreUtil.copy(eventLink);

		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}
//				Find receiver
		DynamicTriggerEventReceiverInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = newComponentImplementation.findOperationInstanceInDynamicTriggerInstances(
				((DynamicTriggerInstance) receiver.eContainer()).getName(), receiver.getName());

//				Find sender
		EventLinkSender sender = eventLink.getSender();
		OperationInstance newSender = findEventLinkSenderOtherThanTrigger(newComponentImplementation, sender);

//				Set receiver and sender
		if (newReceiver instanceof DynamicTriggerEventReceiverInstance && newSender instanceof EventLinkSender) {
			copy.setReceiver((DynamicTriggerEventReceiverInstance) newReceiver);
			copy.setSender((EventLinkSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkActivatableFifoFromTrigger(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, EventLinkActivatableFifoFromTrigger eventLink) {
		EventLinkActivatableFifoFromTrigger copy = EcoreUtil.copy(eventLink);

		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}

//				Find receiver
		EventReceiverInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) receiver.eContainer()).getName(), receiver.getName());

//				Find sender
		TriggerSender sender = eventLink.getSender();
		OperationInstance newSender = newComponentImplementation
				.findOperationInstanceInTriggerInstances(((TriggerInstance) sender.eContainer()).getName());

//				Set receiver and sender
		if (newReceiver instanceof EventReceiverInstance && newSender instanceof TriggerSender) {
			copy.setReceiver((EventReceiverInstance) newReceiver);
			copy.setSender((TriggerSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param eventLink
	 */
	private static void copyEventLinkActivatableFifo(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, EventLinkActivatableFifo eventLink) {
		EventLinkActivatableFifo copy = EcoreUtil.copy(eventLink);

		if (eventLink.getReceiver() == null || eventLink.getSender() == null) {
			return;
		}
//				Find receiver
		EventReceiverInstance receiver = eventLink.getReceiver();
		OperationInstance newReceiver = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) receiver.eContainer()).getName(), receiver.getName());

//				Find sender
		EventLinkSender sender = eventLink.getSender();
		OperationInstance newSender = findEventLinkSenderOtherThanTrigger(newComponentImplementation, sender);

//				Set receiver and sender
		if (newReceiver instanceof EventReceiverInstance && newSender instanceof EventLinkSender) {
			copy.setReceiver((EventReceiverInstance) newReceiver);
			copy.setSender((EventLinkSender) newSender);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(EVENT_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param sender
	 * @return
	 */
	private static OperationInstance findEventLinkSenderOtherThanTrigger(
			ComponentImplementation newComponentImplementation, EventLinkSender sender) {
		OperationInstance newSender = null;
		if (sender instanceof EventSenderInstance) {
			newSender = newComponentImplementation.findOperationInstanceInModuleInstances(
					((ModuleInstance) sender.eContainer()).getName(), sender.getName());
		} else if (sender instanceof EventDefinitionInstance
				&& sender.eContainer() instanceof ReferenceOfLinkedComponentDefinition ref) {
			newSender = newComponentImplementation.findOperationInstanceInReferences(ref.getName(), sender.getName());
		} else if (sender instanceof EventDefinitionInstance
				&& sender.eContainer() instanceof ServiceOfLinkedComponentDefinition serv) {
			newSender = newComponentImplementation.findOperationInstanceInServices(serv.getName(), sender.getName());

		} else if (sender instanceof ExternalSenderOperation) {
			newSender = newComponentImplementation.findOperationInstanceInExternal(sender.getName());
		} else if (sender instanceof DynamicTriggerEventSenderInstance) {
			newSender = newComponentImplementation.findOperationInstanceInDynamicTriggerInstances(
					((DynamicTriggerInstance) sender.eContainer()).getName(), sender.getName());
		}
		return newSender;
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param dataLink
	 */
	private static void copyDataLinkToServiceOperation(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, DataLinkToServiceOperation dataLink) {
		DataLinkToServiceOperation copy = EcoreUtil.copy(dataLink);

		if (dataLink.getReader() == null || dataLink.getWriter() == null) {
			return;
		}
//				Find reader
		VersionedDataServiceInstance reader = dataLink.getReader();
		OperationInstance newReader = newComponentImplementation.findOperationInstanceInServices(
				((ServiceOfLinkedComponentDefinition) reader.eContainer()).getName(), reader.getName());

//				Find writer
		DataWriterInstance writer = dataLink.getWriter();
		OperationInstance newWriter = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) writer.eContainer()).getName(), writer.getName());

//				Set reader and writer
		if (newReader instanceof VersionedDataServiceInstance && newWriter instanceof DataWriterInstance) {
			copy.setReader((VersionedDataServiceInstance) newReader);
			copy.setWriter((DataWriterInstance) newWriter);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(DATA_LINK_COULD_NOT_BE_COPIED);
		}
	}

	/**
	 * @param newComponentImplementation
	 * @param operationLinksToCopy
	 * @param dataLink
	 */
	private static void copyDataLinkActivatableFifo(ComponentImplementation newComponentImplementation,
			EList<OperationLink> operationLinksToCopy, DataLinkActivatableFifo dataLink) {
		DataLinkActivatableFifo copy = EcoreUtil.copy(dataLink);

		if (dataLink.getReader() == null || dataLink.getWriter() == null) {
			return;
		}
//				Find reader
		DataReaderInstance reader = dataLink.getReader();
		OperationInstance newReader = newComponentImplementation.findOperationInstanceInModuleInstances(
				((ModuleInstance) reader.eContainer()).getName(), reader.getName());

//				Find writer
		DataLinkWriter writer = dataLink.getWriter();
		OperationInstance newWriter = null;
		if (writer instanceof VersionedDataReferenceInstance) {
			newWriter = newComponentImplementation.findOperationInstanceInReferences(
					((ReferenceOfLinkedComponentDefinition) writer.eContainer()).getName(), writer.getName());
		} else if (writer instanceof DataWriterInstance) {
			newWriter = newComponentImplementation.findOperationInstanceInModuleInstances(
					((ModuleInstance) writer.eContainer()).getName(), writer.getName());
		}

//				Set reader and writer
		if (newReader instanceof DataReaderInstance && newWriter instanceof DataLinkWriter) {
			copy.setReader((DataReaderInstance) newReader);
			copy.setWriter((DataLinkWriter) newWriter);
			operationLinksToCopy.add(copy);
		} else {
			EDTLog.toConsole(DATA_LINK_COULD_NOT_BE_COPIED);
		}
	}
}
