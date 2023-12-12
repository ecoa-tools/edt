/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtimplementationFactoryImpl extends EFactoryImpl implements EdtimplementationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdtimplementationFactory init() {
		try {
			EdtimplementationFactory theEdtimplementationFactory = (EdtimplementationFactory)EPackage.Registry.INSTANCE.getEFactory(EdtimplementationPackage.eNS_URI);
			if (theEdtimplementationFactory != null) {
				return theEdtimplementationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtimplementationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtimplementationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION: return createComponentImplementation();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE: return createComponentImplementationReference();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE: return createComponentImplementationService();
			case EdtimplementationPackage.MODULE_TYPE: return createModuleType();
			case EdtimplementationPackage.EVENT_TYPE: return createEventType();
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE: return createRequestResponseType();
			case EdtimplementationPackage.VERSIONED_DATA_TYPE: return createVersionedDataType();
			case EdtimplementationPackage.PARAMETER: return createParameter();
			case EdtimplementationPackage.EVENT_SENT: return createEventSent();
			case EdtimplementationPackage.EVENT_RECEIVED: return createEventReceived();
			case EdtimplementationPackage.VERSIONED_DATA_WRITTEN: return createVersionedDataWritten();
			case EdtimplementationPackage.VERSIONED_DATA_READ: return createVersionedDataRead();
			case EdtimplementationPackage.REQUEST_SENT: return createRequestSent();
			case EdtimplementationPackage.REQUEST_RECEIVED: return createRequestReceived();
			case EdtimplementationPackage.MODULE_IMPLEMENTATION: return createModuleImplementation();
			case EdtimplementationPackage.TRIGGER_INSTANCE: return createTriggerInstance();
			case EdtimplementationPackage.TRIGGER_SENDER: return createTriggerSender();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE: return createDynamicTriggerInstance();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE: return createDynamicTriggerEventReceiverInstance();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE: return createDynamicTriggerEventSenderInstance();
			case EdtimplementationPackage.MODULE_INSTANCE: return createModuleInstance();
			case EdtimplementationPackage.EVENT_SENDER_INSTANCE: return createEventSenderInstance();
			case EdtimplementationPackage.EVENT_RECEIVER_INSTANCE: return createEventReceiverInstance();
			case EdtimplementationPackage.REQUEST_CLIENT_INSTANCE: return createRequestClientInstance();
			case EdtimplementationPackage.REQUEST_SERVER_INSTANCE: return createRequestServerInstance();
			case EdtimplementationPackage.DATA_WRITER_INSTANCE: return createDataWriterInstance();
			case EdtimplementationPackage.DATA_READER_INSTANCE: return createDataReaderInstance();
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION: return createReferenceOfLinkedComponentDefinition();
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION: return createServiceOfLinkedComponentDefinition();
			case EdtimplementationPackage.EVENT_DEFINITION_INSTANCE: return createEventDefinitionInstance();
			case EdtimplementationPackage.REQUEST_REFERENCE_INSTANCE: return createRequestReferenceInstance();
			case EdtimplementationPackage.REQUEST_SERVICE_INSTANCE: return createRequestServiceInstance();
			case EdtimplementationPackage.VERSIONED_DATA_REFERENCE_INSTANCE: return createVersionedDataReferenceInstance();
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE: return createVersionedDataServiceInstance();
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION: return createExternalSenderOperation();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO: return createDataLinkActivatableFifo();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION: return createDataLinkToServiceOperation();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO: return createEventLinkActivatableFifo();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO: return createEventLinkActivatingFifo();
			case EdtimplementationPackage.EVENT_LINK_TO_DEFINITION_OPERATION: return createEventLinkToDefinitionOperation();
			case EdtimplementationPackage.EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER: return createEventLinkToDefinitionOperationFromTrigger();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER: return createEventLinkActivatingFifoFromTrigger();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER: return createEventLinkActivatableFifoFromTrigger();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATABLE_FIFO: return createRequestLinkActivatableFifo();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO: return createRequestLinkActivatingActivatableFifo();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION: return createRequestLinkActivatingToReferenceOperation();
			case EdtimplementationPackage.PUBLIC_PINFO_VALUE: return createPublicPinfoValue();
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE: return createPrivatePinfoValue();
			case EdtimplementationPackage.PRIVATE_PINFO: return createPrivatePinfo();
			case EdtimplementationPackage.PUBLIC_PINFO: return createPublicPinfo();
			case EdtimplementationPackage.PROPERTY_VALUE: return createPropertyValue();
			case EdtimplementationPackage.MODULE_TYPE_PROPERTY: return createModuleTypeProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation createComponentImplementation() {
		ComponentImplementationImpl componentImplementation = new ComponentImplementationImpl();
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementationReference createComponentImplementationReference() {
		ComponentImplementationReferenceImpl componentImplementationReference = new ComponentImplementationReferenceImpl();
		return componentImplementationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementationService createComponentImplementationService() {
		ComponentImplementationServiceImpl componentImplementationService = new ComponentImplementationServiceImpl();
		return componentImplementationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleType createModuleType() {
		ModuleTypeImpl moduleType = new ModuleTypeImpl();
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResponseType createRequestResponseType() {
		RequestResponseTypeImpl requestResponseType = new RequestResponseTypeImpl();
		return requestResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventSent createEventSent() {
		EventSentImpl eventSent = new EventSentImpl();
		return eventSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventReceived createEventReceived() {
		EventReceivedImpl eventReceived = new EventReceivedImpl();
		return eventReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataWritten createVersionedDataWritten() {
		VersionedDataWrittenImpl versionedDataWritten = new VersionedDataWrittenImpl();
		return versionedDataWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataRead createVersionedDataRead() {
		VersionedDataReadImpl versionedDataRead = new VersionedDataReadImpl();
		return versionedDataRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestSent createRequestSent() {
		RequestSentImpl requestSent = new RequestSentImpl();
		return requestSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestReceived createRequestReceived() {
		RequestReceivedImpl requestReceived = new RequestReceivedImpl();
		return requestReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataType createVersionedDataType() {
		VersionedDataTypeImpl versionedDataType = new VersionedDataTypeImpl();
		return versionedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleImplementation createModuleImplementation() {
		ModuleImplementationImpl moduleImplementation = new ModuleImplementationImpl();
		return moduleImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleInstance createModuleInstance() {
		ModuleInstanceImpl moduleInstance = new ModuleInstanceImpl();
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerInstance createTriggerInstance() {
		TriggerInstanceImpl triggerInstance = new TriggerInstanceImpl();
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerSender createTriggerSender() {
		TriggerSenderImpl triggerSender = new TriggerSenderImpl();
		return triggerSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicTriggerInstance createDynamicTriggerInstance() {
		DynamicTriggerInstanceImpl dynamicTriggerInstance = new DynamicTriggerInstanceImpl();
		return dynamicTriggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventSenderInstance createEventSenderInstance() {
		EventSenderInstanceImpl eventSenderInstance = new EventSenderInstanceImpl();
		return eventSenderInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventReceiverInstance createEventReceiverInstance() {
		EventReceiverInstanceImpl eventReceiverInstance = new EventReceiverInstanceImpl();
		return eventReceiverInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestClientInstance createRequestClientInstance() {
		RequestClientInstanceImpl requestClientInstance = new RequestClientInstanceImpl();
		return requestClientInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestServerInstance createRequestServerInstance() {
		RequestServerInstanceImpl requestServerInstance = new RequestServerInstanceImpl();
		return requestServerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataWriterInstance createDataWriterInstance() {
		DataWriterInstanceImpl dataWriterInstance = new DataWriterInstanceImpl();
		return dataWriterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataReaderInstance createDataReaderInstance() {
		DataReaderInstanceImpl dataReaderInstance = new DataReaderInstanceImpl();
		return dataReaderInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicTriggerEventReceiverInstance createDynamicTriggerEventReceiverInstance() {
		DynamicTriggerEventReceiverInstanceImpl dynamicTriggerEventReceiverInstance = new DynamicTriggerEventReceiverInstanceImpl();
		return dynamicTriggerEventReceiverInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicTriggerEventSenderInstance createDynamicTriggerEventSenderInstance() {
		DynamicTriggerEventSenderInstanceImpl dynamicTriggerEventSenderInstance = new DynamicTriggerEventSenderInstanceImpl();
		return dynamicTriggerEventSenderInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceOfLinkedComponentDefinition createReferenceOfLinkedComponentDefinition() {
		ReferenceOfLinkedComponentDefinitionImpl referenceOfLinkedComponentDefinition = new ReferenceOfLinkedComponentDefinitionImpl();
		return referenceOfLinkedComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOfLinkedComponentDefinition createServiceOfLinkedComponentDefinition() {
		ServiceOfLinkedComponentDefinitionImpl serviceOfLinkedComponentDefinition = new ServiceOfLinkedComponentDefinitionImpl();
		return serviceOfLinkedComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinitionInstance createEventDefinitionInstance() {
		EventDefinitionInstanceImpl eventDefinitionInstance = new EventDefinitionInstanceImpl();
		return eventDefinitionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestReferenceInstance createRequestReferenceInstance() {
		RequestReferenceInstanceImpl requestReferenceInstance = new RequestReferenceInstanceImpl();
		return requestReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestServiceInstance createRequestServiceInstance() {
		RequestServiceInstanceImpl requestServiceInstance = new RequestServiceInstanceImpl();
		return requestServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataReferenceInstance createVersionedDataReferenceInstance() {
		VersionedDataReferenceInstanceImpl versionedDataReferenceInstance = new VersionedDataReferenceInstanceImpl();
		return versionedDataReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataServiceInstance createVersionedDataServiceInstance() {
		VersionedDataServiceInstanceImpl versionedDataServiceInstance = new VersionedDataServiceInstanceImpl();
		return versionedDataServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLinkActivatableFifo createDataLinkActivatableFifo() {
		DataLinkActivatableFifoImpl dataLinkActivatableFifo = new DataLinkActivatableFifoImpl();
		return dataLinkActivatableFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLinkToServiceOperation createDataLinkToServiceOperation() {
		DataLinkToServiceOperationImpl dataLinkToServiceOperation = new DataLinkToServiceOperationImpl();
		return dataLinkToServiceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkActivatableFifo createEventLinkActivatableFifo() {
		EventLinkActivatableFifoImpl eventLinkActivatableFifo = new EventLinkActivatableFifoImpl();
		return eventLinkActivatableFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkActivatingFifo createEventLinkActivatingFifo() {
		EventLinkActivatingFifoImpl eventLinkActivatingFifo = new EventLinkActivatingFifoImpl();
		return eventLinkActivatingFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkToDefinitionOperation createEventLinkToDefinitionOperation() {
		EventLinkToDefinitionOperationImpl eventLinkToDefinitionOperation = new EventLinkToDefinitionOperationImpl();
		return eventLinkToDefinitionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkToDefinitionOperationFromTrigger createEventLinkToDefinitionOperationFromTrigger() {
		EventLinkToDefinitionOperationFromTriggerImpl eventLinkToDefinitionOperationFromTrigger = new EventLinkToDefinitionOperationFromTriggerImpl();
		return eventLinkToDefinitionOperationFromTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkActivatingFifoFromTrigger createEventLinkActivatingFifoFromTrigger() {
		EventLinkActivatingFifoFromTriggerImpl eventLinkActivatingFifoFromTrigger = new EventLinkActivatingFifoFromTriggerImpl();
		return eventLinkActivatingFifoFromTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkActivatableFifoFromTrigger createEventLinkActivatableFifoFromTrigger() {
		EventLinkActivatableFifoFromTriggerImpl eventLinkActivatableFifoFromTrigger = new EventLinkActivatableFifoFromTriggerImpl();
		return eventLinkActivatableFifoFromTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestLinkActivatableFifo createRequestLinkActivatableFifo() {
		RequestLinkActivatableFifoImpl requestLinkActivatableFifo = new RequestLinkActivatableFifoImpl();
		return requestLinkActivatableFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestLinkActivatingActivatableFifo createRequestLinkActivatingActivatableFifo() {
		RequestLinkActivatingActivatableFifoImpl requestLinkActivatingActivatableFifo = new RequestLinkActivatingActivatableFifoImpl();
		return requestLinkActivatingActivatableFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestLinkActivatingToReferenceOperation createRequestLinkActivatingToReferenceOperation() {
		RequestLinkActivatingToReferenceOperationImpl requestLinkActivatingToReferenceOperation = new RequestLinkActivatingToReferenceOperationImpl();
		return requestLinkActivatingToReferenceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicPinfoValue createPublicPinfoValue() {
		PublicPinfoValueImpl publicPinfoValue = new PublicPinfoValueImpl();
		return publicPinfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePinfoValue createPrivatePinfoValue() {
		PrivatePinfoValueImpl privatePinfoValue = new PrivatePinfoValueImpl();
		return privatePinfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePinfo createPrivatePinfo() {
		PrivatePinfoImpl privatePinfo = new PrivatePinfoImpl();
		return privatePinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicPinfo createPublicPinfo() {
		PublicPinfoImpl publicPinfo = new PublicPinfoImpl();
		return publicPinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleTypeProperty createModuleTypeProperty() {
		ModuleTypePropertyImpl moduleTypeProperty = new ModuleTypePropertyImpl();
		return moduleTypeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalSenderOperation createExternalSenderOperation() {
		ExternalSenderOperationImpl externalSenderOperation = new ExternalSenderOperationImpl();
		return externalSenderOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtimplementationPackage getEdtimplementationPackage() {
		return (EdtimplementationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtimplementationPackage getPackage() {
		return EdtimplementationPackage.eINSTANCE;
	}

} //EdtimplementationFactoryImpl
