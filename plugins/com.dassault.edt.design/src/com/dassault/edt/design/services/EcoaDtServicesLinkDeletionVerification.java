/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.dassault.edt.log.EDTLog;

import edtdeployment.WireMapping;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifo;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkToDefinitionOperation;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestLinkActivatableFifo;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.TriggerInstance;
import edtinterface.OperationType;
import edtproject.Component;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Contract;
import edtproject.ServiceLink;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesLinkDeletionVerification {

	private static final String REQUIRES = " requires ";
	private static final String AND = " and ";
	private static final String REQUEST_RESPONSE = "Request Response";
	private static final String DATA = "Data";
	private static final String EVENT = "Event";

	/**
	 * Verify for :
	 * 
	 * Operations of ServiceDefinition, if it is not involved in an OperationLink
	 * 
	 * ModuleOperation, if it is not involved in an OperationLink
	 * 
	 * ModuleInstance, TriggerInstance, DynamicTriggerInstance, if it contains
	 * Operations involved in a OperationLink
	 * 
	 * @param eObject : ComponentDefinitionReference or Service
	 * @return true if no ServiceLink affected, else false + error message
	 */
	public static StringBuilder hasNoOperationLink(EObject eObject) {
		boolean hasNoOperationLinkAssociated = true;
		StringBuilder errorMessage = new StringBuilder();
		if (eObject instanceof ModuleOperation operation) {
			EList<EObject> associatedModuleInstanceOperations = EcoaDtServicesUtils.findCrossReferences(operation);

			for (EObject associatedModuleInstanceOperation : associatedModuleInstanceOperations) {
				if (associatedModuleInstanceOperation instanceof OperationInstance operationInstance) {
					hasNoOperationLinkAssociated = findOperationsLinksAndCreateErrorMessage(eObject,
							hasNoOperationLinkAssociated, errorMessage, operationInstance);
				}
			}

		} else if (eObject instanceof OperationType operation) {
			EList<EObject> associatedComponentImplementationServiceOperations = EcoaDtServicesUtils
					.findCrossReferences(operation);

			for (EObject associatedComponentImplementationServiceOperation : associatedComponentImplementationServiceOperations) {
				if (associatedComponentImplementationServiceOperation instanceof OperationInstance operationInstance) {
					hasNoOperationLinkAssociated = findOperationsLinksAndCreateErrorMessage(eObject,
							hasNoOperationLinkAssociated, errorMessage, operationInstance);
				}
			}

		} else if (eObject instanceof ExternalSenderOperation external) {
			hasNoOperationLinkAssociated = findOperationsLinksAndCreateErrorMessage(eObject,
					hasNoOperationLinkAssociated, errorMessage, external);
		} else if (eObject instanceof ModuleInstance moduleInstance) {
			EList<OperationLink> operationLinks = moduleInstance.findOperationLinks();
			for (OperationLink operationLink : operationLinks) {
				hasNoOperationLinkAssociated = false;
				errorMessage.append(getOperationLinkErrorMessage(eObject, operationLink));
			}

			errorMessage.append(EcoaDtServicesDeletionVerification.findCrossReferenceAndCreateMessages(eObject,
					EcoaDtServicesUtils.getObjectName(eObject)));
		} else if (eObject instanceof TriggerInstance triggerInstance) {
			EList<OperationLink> operationLinks = triggerInstance.findOperationLinks();
			for (OperationLink operationLink : operationLinks) {
				hasNoOperationLinkAssociated = false;
				errorMessage.append(getOperationLinkErrorMessage(eObject, operationLink));
			}

		} else if (eObject instanceof DynamicTriggerInstance dynamicTriggerInstance) {

			EList<OperationLink> operationLinks = dynamicTriggerInstance.findOperationLinks();
			for (OperationLink operationLink : operationLinks) {
				hasNoOperationLinkAssociated = false;
				errorMessage.append(getOperationLinkErrorMessage(eObject, operationLink));
			}

		} else if (eObject instanceof Contract contract) {
			EList<EObject> associatedComponentImplementationServices = EcoaDtServicesUtils
					.findCrossReferences(contract);
			for (EObject associatedComponentImplementationService : associatedComponentImplementationServices) {
				if (associatedComponentImplementationService instanceof ServiceOfLinkedComponentDefinition service) {
					EList<OperationInstance> operationInstances = service.getOperations();
					for (OperationInstance operationInstance : operationInstances) {
						hasNoOperationLinkAssociated = findOperationsLinksAndCreateErrorMessage(eObject,
								hasNoOperationLinkAssociated, errorMessage, operationInstance);
					}

				} else if (associatedComponentImplementationService instanceof ReferenceOfLinkedComponentDefinition reference) {
					EList<OperationInstance> operationInstances = reference.getOperations();
					for (OperationInstance operationInstance : operationInstances) {
						hasNoOperationLinkAssociated = findOperationsLinksAndCreateErrorMessage(eObject,
								hasNoOperationLinkAssociated, errorMessage, operationInstance);
					}
				}
			}

		}
		return errorMessage;
	}

	/**
	 * @param eObject
	 * @param hasNoOperationLinkAssociated
	 * @param errorMessage
	 * @param operationInstance
	 * @return
	 */
	private static boolean findOperationsLinksAndCreateErrorMessage(EObject eObject,
			boolean hasNoOperationLinkAssociated, StringBuilder errorMessage, OperationInstance operationInstance) {
		EList<EObject> operationLinks = EcoaDtServicesUtils.findCrossReferences(operationInstance);
		for (EObject operationLink : operationLinks) {
			if (operationLink instanceof OperationLink link) {
				hasNoOperationLinkAssociated = false;
				errorMessage.append(getOperationLinkErrorMessage(eObject, link));
			}
		}
		return hasNoOperationLinkAssociated;
	}

	/**
	 * @param eObject
	 * @param and
	 * @param operationInstance
	 * @param link
	 * @return
	 */
	private static String getOperationLinkErrorMessage(EObject eObject, OperationLink link) {
		String typeOfLink = "";
		String firstElement = "";
		String secondElement = "";

//		DataLink
		if (link instanceof DataLinkActivatableFifo dataLinkActivatable) {
			typeOfLink = DATA;
			firstElement = EcoaDtServicesDeletionVerification.errorMessageObjectName(dataLinkActivatable.getWriter());
			secondElement = EcoaDtServicesDeletionVerification.errorMessageObjectName(dataLinkActivatable.getReader());

		} else if (link instanceof DataLinkToServiceOperation dataLinkToService) {
			typeOfLink = DATA;
			firstElement = EcoaDtServicesDeletionVerification.errorMessageObjectName(dataLinkToService.getWriter());
			secondElement = EcoaDtServicesDeletionVerification.errorMessageObjectName(dataLinkToService.getReader());

//		EventLink
		} else if (link instanceof EventLinkActivatableFifo eventLinkActivatableFifo) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatableFifo.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatableFifo.getReceiver());

		} else if (link instanceof EventLinkActivatableFifoFromTrigger eventLinkActivatableFifoFromTrigger) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatableFifoFromTrigger.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatableFifoFromTrigger.getReceiver());

		} else if (link instanceof EventLinkActivatingFifo eventLinkActivatingFifo) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatingFifo.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatingFifo.getReceiver());

		} else if (link instanceof EventLinkActivatingFifoFromTrigger eventLinkActivatingFifoFromTrigger) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatingFifoFromTrigger.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkActivatingFifoFromTrigger.getReceiver());

		} else if (link instanceof EventLinkToDefinitionOperation eventLinkToDefinitionOperation) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkToDefinitionOperation.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkToDefinitionOperation.getReceiver());

		} else if (link instanceof EventLinkToDefinitionOperationFromTrigger eventLinkToDefinitionOperationFromTrigger) {
			typeOfLink = EVENT;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkToDefinitionOperationFromTrigger.getSender());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(eventLinkToDefinitionOperationFromTrigger.getReceiver());

//		RequestLink
		} else if (link instanceof RequestLinkActivatingActivatableFifo requestLinkActivatingActivatableFifo) {
			typeOfLink = REQUEST_RESPONSE;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatingActivatableFifo.getServer());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatingActivatableFifo.getClient());

		} else if (link instanceof RequestLinkActivatableFifo requestLinkActivatableFifo) {
			typeOfLink = REQUEST_RESPONSE;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatableFifo.getServer());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatableFifo.getClient());

		} else if (link instanceof RequestLinkActivatingToReferenceOperation requestLinkActivatingToReference) {
			typeOfLink = REQUEST_RESPONSE;
			firstElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatingToReference.getServer());
			secondElement = EcoaDtServicesDeletionVerification
					.errorMessageObjectName(requestLinkActivatingToReference.getClient());
		}
		return "The " + typeOfLink + " Link between " + firstElement + AND + secondElement + REQUIRES
				+ EcoaDtServicesUtils.getObjectName(eObject) + ".\n";
	}

	/**
	 * Verifies that there is no ServiceLink or OperationLink that depends on object
	 * 
	 * @param eObject : ComponentDefinitionService or Reference
	 * @return : true if no link, else false
	 */
	public boolean hasNoServiceOrOperationLink(EObject eObject) {
		StringBuilder noServices = hasNoServiceLink(eObject);
		StringBuilder noOperation = hasNoOperationLink(eObject);
		noServices.append(noOperation);
		String nameObject = EcoaDtServicesUtils.getObjectName(eObject);

		if (!noServices.isEmpty() || !noOperation.isEmpty()) {
			EDTLog.toPopUpAndConsole("The " + eObject.eClass().getName() + " " + nameObject
					+ " can not be deleted, there are other element(s) refering to it. See console to see more details.",
					noServices.toString());
		}
		return noServices.isEmpty();
	}

	/**
	 * Verifies that ServiceLink is not used in Deployment WireMapping or IDs
	 * 
	 * @param serviceLink : componentReference of ServiceLink
	 * @return true if no WireMapping
	 */
	public boolean isNotInWireMapping(ServiceLink serviceLink) {
		ComponentReference source = serviceLink.getSource();
		EList<EObject> crossReferences = EcoaDtServicesUtils.findCrossReferences(source);
		for (EObject eObject : crossReferences) {
			if (eObject instanceof WireMapping) {
				EDTLog.toPopUpAndConsole("The ServiceLink can not be deleted. There is WireMapping refering to it.",
						"The ServiceLink between " + EcoaDtServicesUtils.getObjectName(serviceLink.getSource()) + AND
								+ EcoaDtServicesUtils.getObjectName(serviceLink.getTarget())
								+ " can not be deleted. There is WireMapping refering to it.");
				return false;
			}
		}
		return true;
	}

	/**
	 * Verify for :
	 * 
	 * ComponentDefinitionReference or ComponentDefinitionService, if it is not
	 * referenced by ComponentReference/Service involved in a ServiceLink
	 * 
	 * Component if it contains ComponentReference/Service involved in a ServiceLink
	 * 
	 * @param eObject : Component, ComponentDefinitionReference or Service
	 * @return true if no ServiceLink affected, else false + error message
	 */
	public StringBuilder hasNoServiceLink(EObject eObject) {
		StringBuilder errorMessage = new StringBuilder();
		String and = AND;
		if (eObject instanceof ComponentDefinitionService service) {
			EList<EObject> associatedDerivedService = EcoaDtServicesUtils.findCrossReferences(service);
			for (EObject associatedToServ : associatedDerivedService) {
				if (associatedToServ instanceof ComponentService componentService
						&& !componentService.getServiceLink().isEmpty()) {
					for (ServiceLink serviceLink : componentService.getServiceLink()) {
						errorMessage.append("The Service Link between "
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(serviceLink.getSource())
								+ and + EcoaDtServicesDeletionVerification.errorMessageObjectName(componentService)
								+ REQUIRES + EcoaDtServicesUtils.getObjectName(eObject) + "\n");
					}
				}
			}

		} else if (eObject instanceof ComponentDefinitionReference reference) {
			EList<EObject> associatedDerivedReference = EcoaDtServicesUtils.findCrossReferences(reference);
			for (EObject associatedToRef : associatedDerivedReference) {
				if (associatedToRef instanceof ComponentReference componentReference
						&& !componentReference.getServiceLink().isEmpty()) {
					for (ServiceLink serviceLink : componentReference.getServiceLink()) {
						errorMessage.append("The Service Link between "
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(componentReference) + and
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(serviceLink.getTarget())
								+ REQUIRES + EcoaDtServicesUtils.getObjectName(eObject) + "\n");
					}
				}
			}

		} else if (eObject instanceof Component component) {
			EList<ComponentReference> componentReferences = component.getComponentReferences();
			for (ComponentReference componentReference : componentReferences) {
				if (!componentReference.getServiceLink().isEmpty()) {
					for (ServiceLink serviceLink : componentReference.getServiceLink()) {
						errorMessage.append("There is a Service Link between "
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(componentReference) + and
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(serviceLink.getTarget())
								+ "\n");
					}
				}
			}

			EList<ComponentService> componentServices = component.getComponentServices();
			for (ComponentService componentService : componentServices) {
				if (!componentService.getServiceLink().isEmpty()) {
					for (ServiceLink serviceLink : componentService.getServiceLink()) {
						errorMessage.append("There is a Service Link between "
								+ EcoaDtServicesDeletionVerification.errorMessageObjectName(serviceLink.getSource())
								+ and + EcoaDtServicesDeletionVerification.errorMessageObjectName(componentService)
								+ "\n");
					}
				}
			}

		}
		return errorMessage;
	}

}
