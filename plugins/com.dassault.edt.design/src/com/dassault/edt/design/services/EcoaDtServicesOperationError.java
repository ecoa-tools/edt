/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.dassault.edt.utils.EcoadtServices;

import edtimplementation.ComponentImplementation;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.DynamicTriggerEventSenderInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLink;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkReceiver;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.EventReceiverInstance;
import edtimplementation.EventSenderInstance;
import edtimplementation.EventType;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.OperationInstance;
import edtimplementation.Parameter;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestResponseType;
import edtimplementation.RequestServerInstance;
import edtimplementation.RequestServiceInstance;
import edtimplementation.TriggerSender;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;
import edtimplementation.VersionedDataType;
import edtinterface.Data;
import edtinterface.Event;
import edtinterface.RequestResponse;
import edtproject.Component;
import edtproject.Step4;
import edtproject.Steps;

/**
 * Helper functions to verify for errors
 * 
 */
public class EcoaDtServicesOperationError {
	private EcoadtServices service = new EcoadtServices();

	/**
	 * Check DataLink coherence of parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isDataLinkCorrect(EObject source, EObject target) {
		if (verifyDataInstanceLink(source, target) || verifyDataInstanceLink(target, source)
				|| verifyDataWithRefLink(source, target) || verifyDataWithRefLink(target, source)
				|| verifyDataWithServLink(source, target) || verifyDataWithServLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check DataLink coherence of parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isDataLinkCorrect(OperationInstance source, OperationInstance target) {
		if (verifyDataInstanceLink(source, target) || verifyDataInstanceLink(target, source)
				|| verifyDataWithRefLink(source, target) || verifyDataWithRefLink(target, source)
				|| verifyDataWithServLink(source, target) || verifyDataWithServLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check link between DataReader and DataWriter from ModuleInstance
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if type are identical
	 */
	private static boolean verifyDataInstanceLink(EObject source, EObject target) {
		return source instanceof DataReaderInstance reader && target instanceof DataWriterInstance writer
				&& reader.getMTOperationRef() instanceof VersionedDataType readerDef
				&& writer.getMTOperationRef() instanceof VersionedDataType writerDef
				&& Objects.equals(readerDef.getType(), writerDef.getType());
	}

	/**
	 * Check link between DataReader from Module and DataWriter from Reference
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if type are identical
	 */
	private static boolean verifyDataWithRefLink(EObject source, EObject target) {
		return source instanceof DataReaderInstance reader && target instanceof VersionedDataReferenceInstance writer
				&& reader.getMTOperationRef() instanceof VersionedDataType readerDef
				&& writer.getSDOperationRef() instanceof Data writerDef
				&& Objects.equals(readerDef.getType(), writerDef.getType());
	}

	/**
	 * Check link between DataReader and DataWriter from ModuleInstance
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if type are identical
	 */
	private static boolean verifyDataWithServLink(EObject source, EObject target) {
		return source instanceof VersionedDataServiceInstance reader && target instanceof DataWriterInstance writer
				&& reader.getSDOperationRef() instanceof Data readerDef
				&& writer.getMTOperationRef() instanceof VersionedDataType writerDef
				&& Objects.equals(readerDef.getType(), writerDef.getType());
	}

	/**
	 * Check RequestLink coherence of parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isRequestLinkCorrect(EObject source, EObject target) {
		if (verifyRequestInstanceLink(source, target) || verifyRequestInstanceLink(target, source)
				|| verifyRequestWithRefLink(source, target) || verifyRequestWithRefLink(target, source)
				|| verifyRequestWithServLink(source, target) || verifyRequestWithServLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check RequestLink coherence of parameters when Sirius needs more precise
	 * parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isRequestLinkCorrect(OperationInstance source, OperationInstance target) {
		if (verifyRequestInstanceLink(source, target) || verifyRequestInstanceLink(target, source)
				|| verifyRequestWithRefLink(source, target) || verifyRequestWithRefLink(target, source)
				|| verifyRequestWithServLink(source, target) || verifyRequestWithServLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check link between RequestServer and RequestClient from ModuleInstance
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyRequestInstanceLink(EObject source, EObject target) {
		if (source instanceof RequestClientInstance client && target instanceof RequestServerInstance server
				&& client.getMTOperationRef() instanceof RequestResponseType clientDef
				&& server.getMTOperationRef() instanceof RequestResponseType serverDef
				&& Objects.equals(clientDef.getInput().size(), serverDef.getInput().size())
				&& Objects.equals(clientDef.getOutput().size(), serverDef.getOutput().size())) {
			for (int i = 0; i < clientDef.getInput().size(); i++) {
				Parameter clientInput = clientDef.getInput().get(i);
				Parameter serverInput = serverDef.getInput().get(i);
				if (!Objects.equals(clientInput.getType(), serverInput.getType())) {
					return false;
				}
			}

			for (int i = 0; i < clientDef.getOutput().size(); i++) {
				Parameter clientOutput = clientDef.getOutput().get(i);
				Parameter serverOutput = serverDef.getOutput().get(i);
				if (!Objects.equals(clientOutput.getType(), serverOutput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check link between RequestServer from Reference and RequestClient from
	 * ModuleInstance
	 *
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyRequestWithRefLink(EObject source, EObject target) {
		if (source instanceof RequestClientInstance client && target instanceof RequestReferenceInstance server
				&& client.getMTOperationRef() instanceof RequestResponseType clientDef
				&& server.getSDOperationRef() instanceof RequestResponse serverDef
				&& Objects.equals(clientDef.getInput().size(), serverDef.getInput().size())
				&& Objects.equals(clientDef.getOutput().size(), serverDef.getOutput().size())) {
			for (int i = 0; i < clientDef.getInput().size(); i++) {
				Parameter clientInput = clientDef.getInput().get(i);
				edtinterface.Parameter serverInput = serverDef.getInput().get(i);
				if (!Objects.equals(clientInput.getType(), serverInput.getType())) {
					return false;
				}
			}

			for (int i = 0; i < clientDef.getOutput().size(); i++) {
				Parameter clientOutput = clientDef.getOutput().get(i);
				edtinterface.Parameter serverOutput = serverDef.getOutput().get(i);
				if (!Objects.equals(clientOutput.getType(), serverOutput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check link between RequestServer from ModuleInstance and RequestClient from
	 * Service
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyRequestWithServLink(EObject source, EObject target) {
		if (source instanceof RequestServiceInstance client && target instanceof RequestServerInstance server
				&& client.getSDOperationRef() instanceof RequestResponse clientDef
				&& server.getMTOperationRef() instanceof RequestResponseType serverDef
				&& Objects.equals(clientDef.getInput().size(), serverDef.getInput().size())
				&& Objects.equals(clientDef.getOutput().size(), serverDef.getOutput().size())) {
			for (int i = 0; i < clientDef.getInput().size(); i++) {
				edtinterface.Parameter clientInput = clientDef.getInput().get(i);
				Parameter serverInput = serverDef.getInput().get(i);
				if (!Objects.equals(clientInput.getType(), serverInput.getType())) {
					return false;
				}
			}

			for (int i = 0; i < clientDef.getOutput().size(); i++) {
				edtinterface.Parameter clientOutput = clientDef.getOutput().get(i);
				Parameter serverOutput = serverDef.getOutput().get(i);
				if (!Objects.equals(clientOutput.getType(), serverOutput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check EventLink coherence of parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isEventLinkCorrect(EObject source, EObject target) {
		if (verifyEventInstanceLink(source, target) || verifyEventInstanceLink(target, source)
				|| verifyEventWithServReceiverLink(source, target) || verifyEventWithServReceiverLink(target, source)
				|| verifyEventWithServSenderLink(source, target) || verifyEventWithServSenderLink(target, source)
				|| verifyEventWithExternalLink(source, target) || verifyEventWithExternalLink(target, source)
				|| verifyEventWithTriggerLink(source, target) || verifyEventWithTriggerLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check EventLink coherence of parameters when Sirius needs more precise
	 * parameters
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return : true if link is valid
	 */
	public static boolean isEventLinkCorrect(OperationInstance source, OperationInstance target) {
		if (verifyEventInstanceLink(source, target) || verifyEventInstanceLink(target, source)
				|| verifyEventWithServReceiverLink(source, target) || verifyEventWithServReceiverLink(target, source)
				|| verifyEventWithServSenderLink(source, target) || verifyEventWithServSenderLink(target, source)
				|| verifyEventWithExternalLink(source, target) || verifyEventWithExternalLink(target, source)
				|| verifyEventWithTriggerLink(source, target) || verifyEventWithTriggerLink(target, source)) {
			return true;
		}
		return false;
	}

	/**
	 * Check link between EventSender and EventReceiver from
	 * ModuleInstance/DynamicTrigger
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyEventInstanceLink(EObject source, EObject target) {
		if (source instanceof EventSenderInstance sender && target instanceof EventReceiverInstance receiver
				&& sender.getMTOperationRef() instanceof EventType senderDef
				&& receiver.getMTOperationRef() instanceof EventType receiverDef
				&& Objects.equals(senderDef.getInput().size(), receiverDef.getInput().size())) {
			for (int i = 0; i < senderDef.getInput().size(); i++) {
				Parameter senderInput = senderDef.getInput().get(i);
				Parameter receiverInput = receiverDef.getInput().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else if (source instanceof EventSenderInstance sender
				&& target instanceof DynamicTriggerEventReceiverInstance receiver
				&& sender.getMTOperationRef() instanceof EventType senderDef
				&& senderDef.getInput().size() == receiver.getInputs().size()) {
			for (int i = 0; i < senderDef.getInput().size(); i++) {
				Parameter senderInput = senderDef.getInput().get(i);
				Parameter receiverInput = receiver.getInputs().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else if (source instanceof DynamicTriggerEventSenderInstance sender
				&& target instanceof EventReceiverInstance receiver
				&& receiver.getMTOperationRef() instanceof EventType receiverDef
				&& Objects.equals(sender.getInputs().size(), receiverDef.getInput().size())) {
			for (int i = 0; i < sender.getInputs().size(); i++) {
				Parameter senderInput = sender.getInputs().get(i);
				Parameter receiverInput = receiverDef.getInput().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check link between EventSender from ModuleInstance or DynamicTriggerInstance
	 * and EventReceiver from Reference/Service
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyEventWithServReceiverLink(EObject source, EObject target) {
		if (source instanceof EventSenderInstance sender && target instanceof EventDefinitionInstance receiver
				&& EcoaDtServicesUtils.checkReceiver(receiver)
				&& sender.getMTOperationRef() instanceof EventType senderDef
				&& receiver.getSDOperationRef() instanceof Event receiverDef
				&& Objects.equals(senderDef.getInput().size(), receiverDef.getInput().size())) {
			for (int i = 0; i < senderDef.getInput().size(); i++) {
				Parameter senderInput = senderDef.getInput().get(i);
				edtinterface.Parameter receiverInput = receiverDef.getInput().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else if (source instanceof DynamicTriggerEventSenderInstance sender
				&& target instanceof EventDefinitionInstance receiver && EcoaDtServicesUtils.checkReceiver(receiver)
				&& receiver.getSDOperationRef() instanceof Event receiverDef
				&& Objects.equals(sender.getInputs().size(), receiverDef.getInput().size())) {
			for (int i = 0; i < sender.getInputs().size(); i++) {
				Parameter senderInput = sender.getInputs().get(i);
				edtinterface.Parameter receiverInput = receiverDef.getInput().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check link between EventSender from Service/Reference and EventReceiver from
	 * ModuleInstance
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyEventWithServSenderLink(EObject source, EObject target) {
		if (source instanceof EventDefinitionInstance sender && target instanceof EventReceiverInstance receiver
				&& EcoaDtServicesUtils.checkSender(sender) && sender.getSDOperationRef() instanceof Event senderDef
				&& receiver.getMTOperationRef() instanceof EventType receiverDef
				&& Objects.equals(senderDef.getInput().size(), receiverDef.getInput().size())) {
			for (int i = 0; i < senderDef.getInput().size(); i++) {
				edtinterface.Parameter senderInput = senderDef.getInput().get(i);
				Parameter receiverInput = receiverDef.getInput().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else if (source instanceof EventDefinitionInstance sender
				&& target instanceof DynamicTriggerEventReceiverInstance receiver
				&& EcoaDtServicesUtils.checkSender(sender) && sender.getSDOperationRef() instanceof Event senderDef
				&& senderDef.getInput().size() == receiver.getInputs().size()) {
			for (int i = 0; i < senderDef.getInput().size(); i++) {
				edtinterface.Parameter senderInput = senderDef.getInput().get(i);
				Parameter receiverInput = receiver.getInputs().get(i);
				if (!Objects.equals(senderInput.getType(), receiverInput.getType())) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Check link between External Sender EventLinkReceiver ModuleInstance
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	private static boolean verifyEventWithExternalLink(EObject source, EObject target) {
		if (source instanceof ExternalSenderOperation sender
				&& (target instanceof EventReceiverInstance || target instanceof DynamicTriggerEventReceiverInstance)) {
			return true;
		}
		return false;
	}

	/**
	 * Verify Component (presence of ComponentDefinition and ComponentImplementation
	 * if one is available)
	 * 
	 * @param component : component to verify
	 * @return true if no ComponentDefinition or no ComponentImplementation and one
	 *         exists with the same definition
	 */
	public boolean assemblyGraphicalViewWithError(Component component) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {

			if (component.getComponentDefinition() == null) {
				return true;
			}

			if (component.getComponentImplementation() == null) {
				XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) service.getSession().getSemanticResources()
						.iterator().next();
				Collection<ComponentImplementation> componentImplementations = ((Step4) ((Steps) xmiressourceImpl
						.getContents().get(0)).getStep().get(4)).getComponentImplementations();
				for (ComponentImplementation componentImplementation : componentImplementations) {
					if (Objects.equals(componentImplementation.getComponentDefinition(),
							component.getComponentDefinition())) {
						return true;
					}
				}
			} else {
				return !(Objects.equals(component.getComponentImplementation().getComponentDefinition(),
						component.getComponentDefinition()));
			}
		}
		return false;
	}

	/**
	 * Check link between Trigger and Module or Dynamic
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if parameters are identical
	 */
	public static boolean verifyEventWithTriggerLink(EObject source, EObject target) {
		if (source instanceof TriggerSender sender && target instanceof EventLinkReceiver receiver
				&& (!(target instanceof EventDefinitionInstance)
						|| (target instanceof OperationInstance opIns && EcoaDtServicesUtils.checkReceiver(opIns)))) {
			if (receiver instanceof DynamicTriggerEventReceiverInstance dynReceiver
					&& Objects.equals(dynReceiver.getName(), "in")) {
				return false;
			} else if ((receiver instanceof DynamicTriggerEventReceiverInstance dynReceiver
					&& Objects.equals(dynReceiver.getName(), "reset"))
					|| (receiver instanceof EventReceiverInstance instanceReceiver
							&& instanceReceiver.getMTOperationRef() instanceof EventType receiverDef
							&& receiverDef.getInput().isEmpty())
					|| (receiver instanceof EventDefinitionInstance defReceiver
							&& defReceiver.getSDOperationRef() instanceof Event receiverDef
							&& receiverDef.getInput().isEmpty())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Assert if Operation links has no link
	 * 
	 * @param op : operation to verify
	 * @return true if no links
	 */
	public boolean operationsWithError(OperationInstance op) {
		return EcoaDtServicesUtils.hasNoLinks(op);
	}

	/**
	 * Assert if Operation has no links and warning must be displayed
	 * 
	 * @param op : operation to verify
	 * @return true if no links and graphical warning enabled
	 */
	public boolean operationsWithWarning(OperationInstance op) {
		if (EcoaDtServicesUtils.isGraphicalWarningDisplayEnabled()) {
			return EcoaDtServicesUtils.hasNoLinks(op);
		}
		return false;
	}

	/**
	 * Assert if event sender has an error
	 * 
	 * @param op : operation to verify
	 * @return true if no links and direction sent
	 */
	public boolean senderWithError(OperationInstance op) {
		if (Boolean.TRUE.equals((EcoaDtServicesUtils.checkDirectionSent(op)))) {
			return EcoaDtServicesUtils.hasNoLinks(op);
		}
		return false;
	}

	/**
	 * Assert if event sender has an error
	 * 
	 * @param op : operation to verify
	 * @return true if links and direction sent
	 */
	public boolean senderWithoutError(OperationInstance op) {
		if (Boolean.TRUE.equals(EcoaDtServicesUtils.checkDirectionSent(op)) && !EcoaDtServicesUtils.hasNoLinks(op)) {
			return true;
		}
		return false;
	}

	/**
	 * Assert if eventSent has errors
	 * 
	 * @param op : operation to verify
	 * @return true if error
	 */
	public boolean eventSentWithError(OperationInstance op) {
		return EcoaDtServicesUtils.checkSender(op) && EcoaDtServicesUtils.hasNoLinks(op);
	}

	/**
	 * Assert if eventSent has not errors
	 * 
	 * @param op : operation to verify
	 * @return true if no error
	 */
	public boolean eventSentWithoutError(OperationInstance op) {
		if (!EcoaDtServicesUtils.hasNoLinks(op) && EcoaDtServicesUtils.checkSender(op)) {
			return true;
		}
		return false;
	}

	/**
	 * Assert if eventReceived has errors
	 * 
	 * @param op : operation to verify
	 * @return true if error
	 */
	public boolean eventReceivedWithError(OperationInstance op) {
		return EcoaDtServicesUtils.checkReceiver(op) && EcoaDtServicesUtils.hasNoLinks(op);
	}

	/**
	 * Assert if eventReceived has no errors
	 * 
	 * @param op : operation to verify
	 * @return true if no error
	 */
	public boolean eventReceivedWithoutError(OperationInstance op) {
		if (!EcoaDtServicesUtils.hasNoLinks(op) && EcoaDtServicesUtils.checkReceiver(op)) {
			return true;
		}
		return false;
	}

	/**
	 * Assert if datalink is controlled and has no errors
	 * 
	 * @param dataLink : datalink to verify
	 * @param source   : source of datalink
	 * @param target   : target of datalink
	 * @return true if controlled and no error
	 */
	public boolean dataLinkControlledWithoutError(DataLinkActivatableFifo dataLink, EObject source, EObject target) {
		if (isDataLinkCorrect(source, target) && dataLink.isControlled()) {
			return true;
		}
		return false;
	}

	/***
	 * Assert if datalink is controlled and has errors
	 * 
	 * @param dataLink : datalink to verify
	 * @param source   : source of datalink
	 * @param target   : target of datalink
	 * @return true if controlled and error
	 */
	public boolean dataLinkUnControlledWithoutError(DataLinkActivatableFifo dataLink, EObject source, EObject target) {
		if (isDataLinkCorrect(source, target) && !dataLink.isControlled()) {
			return true;
		}
		return false;
	}

	/**
	 * Assert if event link connected to trigger is activated
	 * 
	 * @param eventLink : eventlink to verify
	 * @return true if is activated
	 */
	public boolean triggerEventLinkIsActivated(EventLink eventLink) {
		if (eventLink instanceof EventLinkActivatableFifoFromTrigger link) {
			return link.isReceiverActivating();
		} else if (eventLink instanceof EventLinkActivatingFifoFromTrigger link) {
			return true;
		} else if (eventLink instanceof EventLinkToDefinitionOperationFromTrigger link) {
			return false;
		}
		return false;
	}

}
