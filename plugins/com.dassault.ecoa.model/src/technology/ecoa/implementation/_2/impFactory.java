/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.implementation._2.impPackage
 * @generated
 */
public interface impFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	impFactory eINSTANCE = technology.ecoa.implementation._2.impl.impFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clients Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clients Type</em>'.
	 * @generated
	 */
	ClientsType createClientsType();

	/**
	 * Returns a new object of class '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation</em>'.
	 * @generated
	 */
	ComponentImplementation createComponentImplementation();

	/**
	 * Returns a new object of class '<em>Data Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Link</em>'.
	 * @generated
	 */
	DataLink createDataLink();

	/**
	 * Returns a new object of class '<em>Data Read Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Read Type</em>'.
	 * @generated
	 */
	DataReadType createDataReadType();

	/**
	 * Returns a new object of class '<em>Data Written Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Written Type</em>'.
	 * @generated
	 */
	DataWrittenType createDataWrittenType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Dynamic Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Trigger Instance</em>'.
	 * @generated
	 */
	DynamicTriggerInstance createDynamicTriggerInstance();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Link</em>'.
	 * @generated
	 */
	EventLink createEventLink();

	/**
	 * Returns a new object of class '<em>Event Received Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Received Type</em>'.
	 * @generated
	 */
	EventReceivedType createEventReceivedType();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

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
	 * Returns a new object of class '<em>Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Type</em>'.
	 * @generated
	 */
	ModuleType createModuleType();

	/**
	 * Returns a new object of class '<em>Operations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operations Type</em>'.
	 * @generated
	 */
	OperationsType createOperationsType();

	/**
	 * Returns a new object of class '<em>Op Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref</em>'.
	 * @generated
	 */
	OpRef createOpRef();

	/**
	 * Returns a new object of class '<em>Op Ref Activatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref Activatable</em>'.
	 * @generated
	 */
	OpRefActivatable createOpRefActivatable();

	/**
	 * Returns a new object of class '<em>Op Ref Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref Activatable Fifo</em>'.
	 * @generated
	 */
	OpRefActivatableFifo createOpRefActivatableFifo();

	/**
	 * Returns a new object of class '<em>Op Ref Activating Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref Activating Fifo</em>'.
	 * @generated
	 */
	OpRefActivatingFifo createOpRefActivatingFifo();

	/**
	 * Returns a new object of class '<em>Op Ref External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref External</em>'.
	 * @generated
	 */
	OpRefExternal createOpRefExternal();

	/**
	 * Returns a new object of class '<em>Op Ref Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Ref Trigger</em>'.
	 * @generated
	 */
	OpRefTrigger createOpRefTrigger();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Pinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pinfo Type</em>'.
	 * @generated
	 */
	PinfoType createPinfoType();

	/**
	 * Returns a new object of class '<em>Pinfo Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pinfo Type1</em>'.
	 * @generated
	 */
	PinfoType1 createPinfoType1();

	/**
	 * Returns a new object of class '<em>Pinfo Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pinfo Value</em>'.
	 * @generated
	 */
	PinfoValue createPinfoValue();

	/**
	 * Returns a new object of class '<em>Private Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Pinfo</em>'.
	 * @generated
	 */
	PrivatePinfo createPrivatePinfo();

	/**
	 * Returns a new object of class '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Type</em>'.
	 * @generated
	 */
	PropertiesType createPropertiesType();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	PropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Property Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Values</em>'.
	 * @generated
	 */
	PropertyValues createPropertyValues();

	/**
	 * Returns a new object of class '<em>Public Pinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Pinfo</em>'.
	 * @generated
	 */
	PublicPinfo createPublicPinfo();

	/**
	 * Returns a new object of class '<em>Readers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readers Type</em>'.
	 * @generated
	 */
	ReadersType createReadersType();

	/**
	 * Returns a new object of class '<em>Receivers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receivers Type</em>'.
	 * @generated
	 */
	ReceiversType createReceiversType();

	/**
	 * Returns a new object of class '<em>Request Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Link</em>'.
	 * @generated
	 */
	RequestLink createRequestLink();

	/**
	 * Returns a new object of class '<em>Request Received Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Received Type</em>'.
	 * @generated
	 */
	RequestReceivedType createRequestReceivedType();

	/**
	 * Returns a new object of class '<em>Request Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Response</em>'.
	 * @generated
	 */
	RequestResponse createRequestResponse();

	/**
	 * Returns a new object of class '<em>Request Sent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Sent Type</em>'.
	 * @generated
	 */
	RequestSentType createRequestSentType();

	/**
	 * Returns a new object of class '<em>Senders Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Senders Type</em>'.
	 * @generated
	 */
	SendersType createSendersType();

	/**
	 * Returns a new object of class '<em>Server Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Type</em>'.
	 * @generated
	 */
	ServerType createServerType();

	/**
	 * Returns a new object of class '<em>Service Qo S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Qo S</em>'.
	 * @generated
	 */
	ServiceQoS createServiceQoS();

	/**
	 * Returns a new object of class '<em>Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Instance</em>'.
	 * @generated
	 */
	TriggerInstance createTriggerInstance();

	/**
	 * Returns a new object of class '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Type</em>'.
	 * @generated
	 */
	UseType createUseType();

	/**
	 * Returns a new object of class '<em>Versioned Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Data</em>'.
	 * @generated
	 */
	VersionedData createVersionedData();

	/**
	 * Returns a new object of class '<em>Writers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writers Type</em>'.
	 * @generated
	 */
	WritersType createWritersType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	impPackage getimpPackage();

} //impFactory
