/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edtimplementation.EdtimplementationPackage
 * @generated
 */
public interface EdtimplementationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtimplementationFactory eINSTANCE = edtimplementation.impl.EdtimplementationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation</em>'.
	 * @generated
	 */
	ComponentImplementation createComponentImplementation();

	/**
	 * Returns a new object of class '<em>Component Implementation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation Reference</em>'.
	 * @generated
	 */
	ComponentImplementationReference createComponentImplementationReference();

	/**
	 * Returns a new object of class '<em>Component Implementation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation Service</em>'.
	 * @generated
	 */
	ComponentImplementationService createComponentImplementationService();

	/**
	 * Returns a new object of class '<em>Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Type</em>'.
	 * @generated
	 */
	ModuleType createModuleType();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	EventType createEventType();

	/**
	 * Returns a new object of class '<em>Request Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Response Type</em>'.
	 * @generated
	 */
	RequestResponseType createRequestResponseType();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Event Sent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Sent</em>'.
	 * @generated
	 */
	EventSent createEventSent();

	/**
	 * Returns a new object of class '<em>Event Received</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Received</em>'.
	 * @generated
	 */
	EventReceived createEventReceived();

	/**
	 * Returns a new object of class '<em>Versioned Data Written</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data Written</em>'.
	 * @generated
	 */
	VersionedDataWritten createVersionedDataWritten();

	/**
	 * Returns a new object of class '<em>Versioned Data Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data Read</em>'.
	 * @generated
	 */
	VersionedDataRead createVersionedDataRead();

	/**
	 * Returns a new object of class '<em>Request Sent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Sent</em>'.
	 * @generated
	 */
	RequestSent createRequestSent();

	/**
	 * Returns a new object of class '<em>Request Received</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Received</em>'.
	 * @generated
	 */
	RequestReceived createRequestReceived();

	/**
	 * Returns a new object of class '<em>Versioned Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data Type</em>'.
	 * @generated
	 */
	VersionedDataType createVersionedDataType();

	/**
	 * Returns a new object of class '<em>Module Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Implementation</em>'.
	 * @generated
	 */
	ModuleImplementation createModuleImplementation();

	/**
	 * Returns a new object of class '<em>Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Instance</em>'.
	 * @generated
	 */
	ModuleInstance createModuleInstance();

	/**
	 * Returns a new object of class '<em>Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Instance</em>'.
	 * @generated
	 */
	TriggerInstance createTriggerInstance();

	/**
	 * Returns a new object of class '<em>Trigger Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Sender</em>'.
	 * @generated
	 */
	TriggerSender createTriggerSender();

	/**
	 * Returns a new object of class '<em>Dynamic Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Trigger Instance</em>'.
	 * @generated
	 */
	DynamicTriggerInstance createDynamicTriggerInstance();

	/**
	 * Returns a new object of class '<em>Event Sender Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Sender Instance</em>'.
	 * @generated
	 */
	EventSenderInstance createEventSenderInstance();

	/**
	 * Returns a new object of class '<em>Event Receiver Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Receiver Instance</em>'.
	 * @generated
	 */
	EventReceiverInstance createEventReceiverInstance();

	/**
	 * Returns a new object of class '<em>Request Client Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Client Instance</em>'.
	 * @generated
	 */
	RequestClientInstance createRequestClientInstance();

	/**
	 * Returns a new object of class '<em>Request Server Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Server Instance</em>'.
	 * @generated
	 */
	RequestServerInstance createRequestServerInstance();

	/**
	 * Returns a new object of class '<em>Data Writer Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Writer Instance</em>'.
	 * @generated
	 */
	DataWriterInstance createDataWriterInstance();

	/**
	 * Returns a new object of class '<em>Data Reader Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Reader Instance</em>'.
	 * @generated
	 */
	DataReaderInstance createDataReaderInstance();

	/**
	 * Returns a new object of class '<em>Dynamic Trigger Event Receiver Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Trigger Event Receiver Instance</em>'.
	 * @generated
	 */
	DynamicTriggerEventReceiverInstance createDynamicTriggerEventReceiverInstance();

	/**
	 * Returns a new object of class '<em>Dynamic Trigger Event Sender Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Trigger Event Sender Instance</em>'.
	 * @generated
	 */
	DynamicTriggerEventSenderInstance createDynamicTriggerEventSenderInstance();

	/**
	 * Returns a new object of class '<em>Reference Of Linked Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Of Linked Component Definition</em>'.
	 * @generated
	 */
	ReferenceOfLinkedComponentDefinition createReferenceOfLinkedComponentDefinition();

	/**
	 * Returns a new object of class '<em>Service Of Linked Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Of Linked Component Definition</em>'.
	 * @generated
	 */
	ServiceOfLinkedComponentDefinition createServiceOfLinkedComponentDefinition();

	/**
	 * Returns a new object of class '<em>Event Definition Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Definition Instance</em>'.
	 * @generated
	 */
	EventDefinitionInstance createEventDefinitionInstance();

	/**
	 * Returns a new object of class '<em>Request Reference Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Reference Instance</em>'.
	 * @generated
	 */
	RequestReferenceInstance createRequestReferenceInstance();

	/**
	 * Returns a new object of class '<em>Request Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Service Instance</em>'.
	 * @generated
	 */
	RequestServiceInstance createRequestServiceInstance();

	/**
	 * Returns a new object of class '<em>Versioned Data Reference Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data Reference Instance</em>'.
	 * @generated
	 */
	VersionedDataReferenceInstance createVersionedDataReferenceInstance();

	/**
	 * Returns a new object of class '<em>Versioned Data Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data Service Instance</em>'.
	 * @generated
	 */
	VersionedDataServiceInstance createVersionedDataServiceInstance();

	/**
	 * Returns a new object of class '<em>Data Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Link Activatable Fifo</em>'.
	 * @generated
	 */
	DataLinkActivatableFifo createDataLinkActivatableFifo();

	/**
	 * Returns a new object of class '<em>Data Link To Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Link To Service Operation</em>'.
	 * @generated
	 */
	DataLinkToServiceOperation createDataLinkToServiceOperation();

	/**
	 * Returns a new object of class '<em>Event Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Activatable Fifo</em>'.
	 * @generated
	 */
	EventLinkActivatableFifo createEventLinkActivatableFifo();

	/**
	 * Returns a new object of class '<em>Event Link Activating Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Activating Fifo</em>'.
	 * @generated
	 */
	EventLinkActivatingFifo createEventLinkActivatingFifo();

	/**
	 * Returns a new object of class '<em>Event Link To Definition Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link To Definition Operation</em>'.
	 * @generated
	 */
	EventLinkToDefinitionOperation createEventLinkToDefinitionOperation();

	/**
	 * Returns a new object of class '<em>Event Link To Definition Operation From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link To Definition Operation From Trigger</em>'.
	 * @generated
	 */
	EventLinkToDefinitionOperationFromTrigger createEventLinkToDefinitionOperationFromTrigger();

	/**
	 * Returns a new object of class '<em>Event Link Activating Fifo From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Activating Fifo From Trigger</em>'.
	 * @generated
	 */
	EventLinkActivatingFifoFromTrigger createEventLinkActivatingFifoFromTrigger();

	/**
	 * Returns a new object of class '<em>Event Link Activatable Fifo From Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link Activatable Fifo From Trigger</em>'.
	 * @generated
	 */
	EventLinkActivatableFifoFromTrigger createEventLinkActivatableFifoFromTrigger();

	/**
	 * Returns a new object of class '<em>Request Link Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Link Activatable Fifo</em>'.
	 * @generated
	 */
	RequestLinkActivatableFifo createRequestLinkActivatableFifo();

	/**
	 * Returns a new object of class '<em>Request Link Activating Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Link Activating Activatable Fifo</em>'.
	 * @generated
	 */
	RequestLinkActivatingActivatableFifo createRequestLinkActivatingActivatableFifo();

	/**
	 * Returns a new object of class '<em>Request Link Activating To Reference Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Link Activating To Reference Operation</em>'.
	 * @generated
	 */
	RequestLinkActivatingToReferenceOperation createRequestLinkActivatingToReferenceOperation();

	/**
	 * Returns a new object of class '<em>Public Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Pinfo Value</em>'.
	 * @generated
	 */
	PublicPinfoValue createPublicPinfoValue();

	/**
	 * Returns a new object of class '<em>Private Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Pinfo Value</em>'.
	 * @generated
	 */
	PrivatePinfoValue createPrivatePinfoValue();

	/**
	 * Returns a new object of class '<em>Private Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Pinfo</em>'.
	 * @generated
	 */
	PrivatePinfo createPrivatePinfo();

	/**
	 * Returns a new object of class '<em>Public Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Pinfo</em>'.
	 * @generated
	 */
	PublicPinfo createPublicPinfo();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	PropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Module Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Type Property</em>'.
	 * @generated
	 */
	ModuleTypeProperty createModuleTypeProperty();

	/**
	 * Returns a new object of class '<em>External Sender Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Sender Operation</em>'.
	 * @generated
	 */
	ExternalSenderOperation createExternalSenderOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdtimplementationPackage getEdtimplementationPackage();

} //EdtimplementationFactory
