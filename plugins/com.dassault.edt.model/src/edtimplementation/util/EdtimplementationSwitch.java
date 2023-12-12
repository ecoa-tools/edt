/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.util;

import edtimplementation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edtimplementation.EdtimplementationPackage
 * @generated
 */
public class EdtimplementationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtimplementationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtimplementationSwitch() {
		if (modelPackage == null) {
			modelPackage = EdtimplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION: {
				ComponentImplementation componentImplementation = (ComponentImplementation)theEObject;
				T result = caseComponentImplementation(componentImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE: {
				ComponentImplementationReference componentImplementationReference = (ComponentImplementationReference)theEObject;
				T result = caseComponentImplementationReference(componentImplementationReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE: {
				ComponentImplementationService componentImplementationService = (ComponentImplementationService)theEObject;
				T result = caseComponentImplementationService(componentImplementationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_TYPE: {
				ModuleType moduleType = (ModuleType)theEObject;
				T result = caseModuleType(moduleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_OPERATION: {
				ModuleOperation moduleOperation = (ModuleOperation)theEObject;
				T result = caseModuleOperation(moduleOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = caseModuleOperation(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE: {
				RequestResponseType requestResponseType = (RequestResponseType)theEObject;
				T result = caseRequestResponseType(requestResponseType);
				if (result == null) result = caseModuleOperation(requestResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.VERSIONED_DATA_TYPE: {
				VersionedDataType versionedDataType = (VersionedDataType)theEObject;
				T result = caseVersionedDataType(versionedDataType);
				if (result == null) result = caseModuleOperation(versionedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_SENT: {
				EventSent eventSent = (EventSent)theEObject;
				T result = caseEventSent(eventSent);
				if (result == null) result = caseEventType(eventSent);
				if (result == null) result = caseModuleOperation(eventSent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_RECEIVED: {
				EventReceived eventReceived = (EventReceived)theEObject;
				T result = caseEventReceived(eventReceived);
				if (result == null) result = caseEventType(eventReceived);
				if (result == null) result = caseModuleOperation(eventReceived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.VERSIONED_DATA_WRITTEN: {
				VersionedDataWritten versionedDataWritten = (VersionedDataWritten)theEObject;
				T result = caseVersionedDataWritten(versionedDataWritten);
				if (result == null) result = caseVersionedDataType(versionedDataWritten);
				if (result == null) result = caseModuleOperation(versionedDataWritten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.VERSIONED_DATA_READ: {
				VersionedDataRead versionedDataRead = (VersionedDataRead)theEObject;
				T result = caseVersionedDataRead(versionedDataRead);
				if (result == null) result = caseVersionedDataType(versionedDataRead);
				if (result == null) result = caseModuleOperation(versionedDataRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_SENT: {
				RequestSent requestSent = (RequestSent)theEObject;
				T result = caseRequestSent(requestSent);
				if (result == null) result = caseRequestResponseType(requestSent);
				if (result == null) result = caseModuleOperation(requestSent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_RECEIVED: {
				RequestReceived requestReceived = (RequestReceived)theEObject;
				T result = caseRequestReceived(requestReceived);
				if (result == null) result = caseRequestResponseType(requestReceived);
				if (result == null) result = caseModuleOperation(requestReceived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_IMPLEMENTATION: {
				ModuleImplementation moduleImplementation = (ModuleImplementation)theEObject;
				T result = caseModuleImplementation(moduleImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.TRIGGER_INSTANCE: {
				TriggerInstance triggerInstance = (TriggerInstance)theEObject;
				T result = caseTriggerInstance(triggerInstance);
				if (result == null) result = caseTrigger(triggerInstance);
				if (result == null) result = caseInstance(triggerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.TRIGGER_SENDER: {
				TriggerSender triggerSender = (TriggerSender)theEObject;
				T result = caseTriggerSender(triggerSender);
				if (result == null) result = caseEventLinkSender(triggerSender);
				if (result == null) result = caseOperationInstance(triggerSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE: {
				DynamicTriggerInstance dynamicTriggerInstance = (DynamicTriggerInstance)theEObject;
				T result = caseDynamicTriggerInstance(dynamicTriggerInstance);
				if (result == null) result = caseTrigger(dynamicTriggerInstance);
				if (result == null) result = caseInstance(dynamicTriggerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE: {
				DynamicTriggerEventReceiverInstance dynamicTriggerEventReceiverInstance = (DynamicTriggerEventReceiverInstance)theEObject;
				T result = caseDynamicTriggerEventReceiverInstance(dynamicTriggerEventReceiverInstance);
				if (result == null) result = caseEventLinkReceiver(dynamicTriggerEventReceiverInstance);
				if (result == null) result = caseOperationInstance(dynamicTriggerEventReceiverInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE: {
				DynamicTriggerEventSenderInstance dynamicTriggerEventSenderInstance = (DynamicTriggerEventSenderInstance)theEObject;
				T result = caseDynamicTriggerEventSenderInstance(dynamicTriggerEventSenderInstance);
				if (result == null) result = caseEventLinkSender(dynamicTriggerEventSenderInstance);
				if (result == null) result = caseOperationInstance(dynamicTriggerEventSenderInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_INSTANCE: {
				ModuleInstance moduleInstance = (ModuleInstance)theEObject;
				T result = caseModuleInstance(moduleInstance);
				if (result == null) result = caseInstance(moduleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.OPERATION_INSTANCE: {
				OperationInstance operationInstance = (OperationInstance)theEObject;
				T result = caseOperationInstance(operationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_SENDER_INSTANCE: {
				EventSenderInstance eventSenderInstance = (EventSenderInstance)theEObject;
				T result = caseEventSenderInstance(eventSenderInstance);
				if (result == null) result = caseEventLinkSender(eventSenderInstance);
				if (result == null) result = caseOperationInheritingFromMT(eventSenderInstance);
				if (result == null) result = caseOperationInstance(eventSenderInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_RECEIVER_INSTANCE: {
				EventReceiverInstance eventReceiverInstance = (EventReceiverInstance)theEObject;
				T result = caseEventReceiverInstance(eventReceiverInstance);
				if (result == null) result = caseEventLinkReceiver(eventReceiverInstance);
				if (result == null) result = caseOperationInheritingFromMT(eventReceiverInstance);
				if (result == null) result = caseOperationInstance(eventReceiverInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_CLIENT_INSTANCE: {
				RequestClientInstance requestClientInstance = (RequestClientInstance)theEObject;
				T result = caseRequestClientInstance(requestClientInstance);
				if (result == null) result = caseRequestLinkClient(requestClientInstance);
				if (result == null) result = caseOperationInheritingFromMT(requestClientInstance);
				if (result == null) result = caseOperationInstance(requestClientInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_SERVER_INSTANCE: {
				RequestServerInstance requestServerInstance = (RequestServerInstance)theEObject;
				T result = caseRequestServerInstance(requestServerInstance);
				if (result == null) result = caseRequestLinkServer(requestServerInstance);
				if (result == null) result = caseOperationInheritingFromMT(requestServerInstance);
				if (result == null) result = caseOperationInstance(requestServerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_WRITER_INSTANCE: {
				DataWriterInstance dataWriterInstance = (DataWriterInstance)theEObject;
				T result = caseDataWriterInstance(dataWriterInstance);
				if (result == null) result = caseDataLinkWriter(dataWriterInstance);
				if (result == null) result = caseOperationInheritingFromMT(dataWriterInstance);
				if (result == null) result = caseOperationInstance(dataWriterInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_READER_INSTANCE: {
				DataReaderInstance dataReaderInstance = (DataReaderInstance)theEObject;
				T result = caseDataReaderInstance(dataReaderInstance);
				if (result == null) result = caseDataLinkReader(dataReaderInstance);
				if (result == null) result = caseOperationInheritingFromMT(dataReaderInstance);
				if (result == null) result = caseOperationInstance(dataReaderInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.SERV_REF_OF_LINKED_COMPONENT_DEFINITION: {
				ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition = (ServRefOfLinkedComponentDefinition)theEObject;
				T result = caseServRefOfLinkedComponentDefinition(servRefOfLinkedComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION: {
				ReferenceOfLinkedComponentDefinition referenceOfLinkedComponentDefinition = (ReferenceOfLinkedComponentDefinition)theEObject;
				T result = caseReferenceOfLinkedComponentDefinition(referenceOfLinkedComponentDefinition);
				if (result == null) result = caseServRefOfLinkedComponentDefinition(referenceOfLinkedComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION: {
				ServiceOfLinkedComponentDefinition serviceOfLinkedComponentDefinition = (ServiceOfLinkedComponentDefinition)theEObject;
				T result = caseServiceOfLinkedComponentDefinition(serviceOfLinkedComponentDefinition);
				if (result == null) result = caseServRefOfLinkedComponentDefinition(serviceOfLinkedComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_DEFINITION_INSTANCE: {
				EventDefinitionInstance eventDefinitionInstance = (EventDefinitionInstance)theEObject;
				T result = caseEventDefinitionInstance(eventDefinitionInstance);
				if (result == null) result = caseEventLinkReceiver(eventDefinitionInstance);
				if (result == null) result = caseEventLinkSender(eventDefinitionInstance);
				if (result == null) result = caseOperationInheritingFromSD(eventDefinitionInstance);
				if (result == null) result = caseOperationInstance(eventDefinitionInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_REFERENCE_INSTANCE: {
				RequestReferenceInstance requestReferenceInstance = (RequestReferenceInstance)theEObject;
				T result = caseRequestReferenceInstance(requestReferenceInstance);
				if (result == null) result = caseRequestLinkServer(requestReferenceInstance);
				if (result == null) result = caseOperationInheritingFromSD(requestReferenceInstance);
				if (result == null) result = caseOperationInstance(requestReferenceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_SERVICE_INSTANCE: {
				RequestServiceInstance requestServiceInstance = (RequestServiceInstance)theEObject;
				T result = caseRequestServiceInstance(requestServiceInstance);
				if (result == null) result = caseRequestLinkClient(requestServiceInstance);
				if (result == null) result = caseOperationInheritingFromSD(requestServiceInstance);
				if (result == null) result = caseOperationInstance(requestServiceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.VERSIONED_DATA_REFERENCE_INSTANCE: {
				VersionedDataReferenceInstance versionedDataReferenceInstance = (VersionedDataReferenceInstance)theEObject;
				T result = caseVersionedDataReferenceInstance(versionedDataReferenceInstance);
				if (result == null) result = caseDataLinkWriter(versionedDataReferenceInstance);
				if (result == null) result = caseOperationInheritingFromSD(versionedDataReferenceInstance);
				if (result == null) result = caseOperationInstance(versionedDataReferenceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE: {
				VersionedDataServiceInstance versionedDataServiceInstance = (VersionedDataServiceInstance)theEObject;
				T result = caseVersionedDataServiceInstance(versionedDataServiceInstance);
				if (result == null) result = caseDataLinkReader(versionedDataServiceInstance);
				if (result == null) result = caseOperationInheritingFromSD(versionedDataServiceInstance);
				if (result == null) result = caseOperationInstance(versionedDataServiceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.OPERATION_LINK: {
				OperationLink operationLink = (OperationLink)theEObject;
				T result = caseOperationLink(operationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_LINK: {
				DataLink dataLink = (DataLink)theEObject;
				T result = caseDataLink(dataLink);
				if (result == null) result = caseOperationLink(dataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK: {
				RequestLink requestLink = (RequestLink)theEObject;
				T result = caseRequestLink(requestLink);
				if (result == null) result = caseOperationLink(requestLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK: {
				EventLink eventLink = (EventLink)theEObject;
				T result = caseEventLink(eventLink);
				if (result == null) result = caseOperationLink(eventLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_LINK_WRITER: {
				DataLinkWriter dataLinkWriter = (DataLinkWriter)theEObject;
				T result = caseDataLinkWriter(dataLinkWriter);
				if (result == null) result = caseOperationInstance(dataLinkWriter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_LINK_READER: {
				DataLinkReader dataLinkReader = (DataLinkReader)theEObject;
				T result = caseDataLinkReader(dataLinkReader);
				if (result == null) result = caseOperationInstance(dataLinkReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_SENDER: {
				EventLinkSender eventLinkSender = (EventLinkSender)theEObject;
				T result = caseEventLinkSender(eventLinkSender);
				if (result == null) result = caseOperationInstance(eventLinkSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION: {
				ExternalSenderOperation externalSenderOperation = (ExternalSenderOperation)theEObject;
				T result = caseExternalSenderOperation(externalSenderOperation);
				if (result == null) result = caseEventLinkSender(externalSenderOperation);
				if (result == null) result = caseOperationInstance(externalSenderOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_RECEIVER: {
				EventLinkReceiver eventLinkReceiver = (EventLinkReceiver)theEObject;
				T result = caseEventLinkReceiver(eventLinkReceiver);
				if (result == null) result = caseOperationInstance(eventLinkReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK_CLIENT: {
				RequestLinkClient requestLinkClient = (RequestLinkClient)theEObject;
				T result = caseRequestLinkClient(requestLinkClient);
				if (result == null) result = caseOperationInstance(requestLinkClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK_SERVER: {
				RequestLinkServer requestLinkServer = (RequestLinkServer)theEObject;
				T result = caseRequestLinkServer(requestLinkServer);
				if (result == null) result = caseOperationInstance(requestLinkServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO: {
				DataLinkActivatableFifo dataLinkActivatableFifo = (DataLinkActivatableFifo)theEObject;
				T result = caseDataLinkActivatableFifo(dataLinkActivatableFifo);
				if (result == null) result = caseDataLink(dataLinkActivatableFifo);
				if (result == null) result = caseOperationLink(dataLinkActivatableFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION: {
				DataLinkToServiceOperation dataLinkToServiceOperation = (DataLinkToServiceOperation)theEObject;
				T result = caseDataLinkToServiceOperation(dataLinkToServiceOperation);
				if (result == null) result = caseDataLink(dataLinkToServiceOperation);
				if (result == null) result = caseOperationLink(dataLinkToServiceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO: {
				EventLinkActivatableFifo eventLinkActivatableFifo = (EventLinkActivatableFifo)theEObject;
				T result = caseEventLinkActivatableFifo(eventLinkActivatableFifo);
				if (result == null) result = caseEventLink(eventLinkActivatableFifo);
				if (result == null) result = caseOperationLink(eventLinkActivatableFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO: {
				EventLinkActivatingFifo eventLinkActivatingFifo = (EventLinkActivatingFifo)theEObject;
				T result = caseEventLinkActivatingFifo(eventLinkActivatingFifo);
				if (result == null) result = caseEventLink(eventLinkActivatingFifo);
				if (result == null) result = caseOperationLink(eventLinkActivatingFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_TO_DEFINITION_OPERATION: {
				EventLinkToDefinitionOperation eventLinkToDefinitionOperation = (EventLinkToDefinitionOperation)theEObject;
				T result = caseEventLinkToDefinitionOperation(eventLinkToDefinitionOperation);
				if (result == null) result = caseEventLink(eventLinkToDefinitionOperation);
				if (result == null) result = caseOperationLink(eventLinkToDefinitionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER: {
				EventLinkToDefinitionOperationFromTrigger eventLinkToDefinitionOperationFromTrigger = (EventLinkToDefinitionOperationFromTrigger)theEObject;
				T result = caseEventLinkToDefinitionOperationFromTrigger(eventLinkToDefinitionOperationFromTrigger);
				if (result == null) result = caseEventLink(eventLinkToDefinitionOperationFromTrigger);
				if (result == null) result = caseOperationLink(eventLinkToDefinitionOperationFromTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER: {
				EventLinkActivatingFifoFromTrigger eventLinkActivatingFifoFromTrigger = (EventLinkActivatingFifoFromTrigger)theEObject;
				T result = caseEventLinkActivatingFifoFromTrigger(eventLinkActivatingFifoFromTrigger);
				if (result == null) result = caseEventLink(eventLinkActivatingFifoFromTrigger);
				if (result == null) result = caseOperationLink(eventLinkActivatingFifoFromTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER: {
				EventLinkActivatableFifoFromTrigger eventLinkActivatableFifoFromTrigger = (EventLinkActivatableFifoFromTrigger)theEObject;
				T result = caseEventLinkActivatableFifoFromTrigger(eventLinkActivatableFifoFromTrigger);
				if (result == null) result = caseEventLink(eventLinkActivatableFifoFromTrigger);
				if (result == null) result = caseOperationLink(eventLinkActivatableFifoFromTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATABLE_FIFO: {
				RequestLinkActivatableFifo requestLinkActivatableFifo = (RequestLinkActivatableFifo)theEObject;
				T result = caseRequestLinkActivatableFifo(requestLinkActivatableFifo);
				if (result == null) result = caseRequestLink(requestLinkActivatableFifo);
				if (result == null) result = caseOperationLink(requestLinkActivatableFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO: {
				RequestLinkActivatingActivatableFifo requestLinkActivatingActivatableFifo = (RequestLinkActivatingActivatableFifo)theEObject;
				T result = caseRequestLinkActivatingActivatableFifo(requestLinkActivatingActivatableFifo);
				if (result == null) result = caseRequestLink(requestLinkActivatingActivatableFifo);
				if (result == null) result = caseOperationLink(requestLinkActivatingActivatableFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION: {
				RequestLinkActivatingToReferenceOperation requestLinkActivatingToReferenceOperation = (RequestLinkActivatingToReferenceOperation)theEObject;
				T result = caseRequestLinkActivatingToReferenceOperation(requestLinkActivatingToReferenceOperation);
				if (result == null) result = caseRequestLink(requestLinkActivatingToReferenceOperation);
				if (result == null) result = caseOperationLink(requestLinkActivatingToReferenceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PUBLIC_PINFO_VALUE: {
				PublicPinfoValue publicPinfoValue = (PublicPinfoValue)theEObject;
				T result = casePublicPinfoValue(publicPinfoValue);
				if (result == null) result = casePinfoValue(publicPinfoValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE: {
				PrivatePinfoValue privatePinfoValue = (PrivatePinfoValue)theEObject;
				T result = casePrivatePinfoValue(privatePinfoValue);
				if (result == null) result = casePinfoValue(privatePinfoValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PINFO_VALUE: {
				PinfoValue pinfoValue = (PinfoValue)theEObject;
				T result = casePinfoValue(pinfoValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PRIVATE_PINFO: {
				PrivatePinfo privatePinfo = (PrivatePinfo)theEObject;
				T result = casePrivatePinfo(privatePinfo);
				if (result == null) result = caseModuleTypePinfo(privatePinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PUBLIC_PINFO: {
				PublicPinfo publicPinfo = (PublicPinfo)theEObject;
				T result = casePublicPinfo(publicPinfo);
				if (result == null) result = caseModuleTypePinfo(publicPinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_TYPE_PINFO: {
				ModuleTypePinfo moduleTypePinfo = (ModuleTypePinfo)theEObject;
				T result = caseModuleTypePinfo(moduleTypePinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				T result = casePropertyValue(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.MODULE_TYPE_PROPERTY: {
				ModuleTypeProperty moduleTypeProperty = (ModuleTypeProperty)theEObject;
				T result = caseModuleTypeProperty(moduleTypeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseInstance(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.OPERATION_INHERITING_FROM_SD: {
				OperationInheritingFromSD operationInheritingFromSD = (OperationInheritingFromSD)theEObject;
				T result = caseOperationInheritingFromSD(operationInheritingFromSD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtimplementationPackage.OPERATION_INHERITING_FROM_MT: {
				OperationInheritingFromMT operationInheritingFromMT = (OperationInheritingFromMT)theEObject;
				T result = caseOperationInheritingFromMT(operationInheritingFromMT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementation(ComponentImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implementation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implementation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementationReference(ComponentImplementationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implementation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implementation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementationService(ComponentImplementationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleType(ModuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleOperation(ModuleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestResponseType(RequestResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Sent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Sent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventSent(EventSent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Received</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Received</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReceived(EventReceived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data Written</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data Written</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedDataWritten(VersionedDataWritten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedDataRead(VersionedDataRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Sent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Sent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSent(RequestSent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Received</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Received</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestReceived(RequestReceived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedDataType(VersionedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleImplementation(ModuleImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInstance(ModuleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerInstance(TriggerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerSender(TriggerSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Trigger Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicTriggerInstance(DynamicTriggerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Sender Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Sender Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventSenderInstance(EventSenderInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Receiver Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Receiver Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReceiverInstance(EventReceiverInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Client Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Client Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestClientInstance(RequestClientInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Server Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Server Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestServerInstance(RequestServerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInstance(OperationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Writer Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Writer Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataWriterInstance(DataWriterInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Reader Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Reader Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReaderInstance(DataReaderInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Ref Of Linked Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Ref Of Linked Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServRefOfLinkedComponentDefinition(ServRefOfLinkedComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Trigger Event Receiver Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Trigger Event Receiver Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicTriggerEventReceiverInstance(DynamicTriggerEventReceiverInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Trigger Event Sender Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Trigger Event Sender Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicTriggerEventSenderInstance(DynamicTriggerEventSenderInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Of Linked Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Of Linked Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceOfLinkedComponentDefinition(ReferenceOfLinkedComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Of Linked Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Of Linked Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOfLinkedComponentDefinition(ServiceOfLinkedComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinitionInstance(EventDefinitionInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Reference Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Reference Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestReferenceInstance(RequestReferenceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestServiceInstance(RequestServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data Reference Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data Reference Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedDataReferenceInstance(VersionedDataReferenceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedDataServiceInstance(VersionedDataServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationLink(OperationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLink(DataLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLink(RequestLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLink(EventLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkWriter(DataLinkWriter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkReader(DataLinkReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkSender(EventLinkSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkReceiver(EventLinkReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLinkClient(RequestLinkClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLinkServer(RequestLinkServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link Activatable Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkActivatableFifo(DataLinkActivatableFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link To Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link To Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkToServiceOperation(DataLinkToServiceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Activatable Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkActivatableFifo(EventLinkActivatableFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Activating Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Activating Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkActivatingFifo(EventLinkActivatingFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link To Definition Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link To Definition Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkToDefinitionOperation(EventLinkToDefinitionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link To Definition Operation From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link To Definition Operation From Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkToDefinitionOperationFromTrigger(EventLinkToDefinitionOperationFromTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Activating Fifo From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Activating Fifo From Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkActivatingFifoFromTrigger(EventLinkActivatingFifoFromTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Link Activatable Fifo From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Link Activatable Fifo From Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLinkActivatableFifoFromTrigger(EventLinkActivatableFifoFromTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link Activatable Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLinkActivatableFifo(RequestLinkActivatableFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link Activating Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link Activating Activatable Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLinkActivatingActivatableFifo(RequestLinkActivatingActivatableFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Link Activating To Reference Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Link Activating To Reference Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestLinkActivatingToReferenceOperation(RequestLinkActivatingToReferenceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Pinfo Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicPinfoValue(PublicPinfoValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Pinfo Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivatePinfoValue(PrivatePinfoValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pinfo Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinfoValue(PinfoValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Pinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivatePinfo(PrivatePinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Pinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicPinfo(PublicPinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Type Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Type Pinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleTypePinfo(ModuleTypePinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValue(PropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Type Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleTypeProperty(ModuleTypeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Inheriting From SD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Inheriting From SD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInheritingFromSD(OperationInheritingFromSD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Inheriting From MT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Inheriting From MT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInheritingFromMT(OperationInheritingFromMT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Sender Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Sender Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSenderOperation(ExternalSenderOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EdtimplementationSwitch
