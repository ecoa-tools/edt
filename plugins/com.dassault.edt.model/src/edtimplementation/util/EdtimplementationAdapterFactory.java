/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.util;

import edtimplementation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edtimplementation.EdtimplementationPackage
 * @generated
 */
public class EdtimplementationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtimplementationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtimplementationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdtimplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdtimplementationSwitch<Adapter> modelSwitch =
		new EdtimplementationSwitch<Adapter>() {
			@Override
			public Adapter caseComponentImplementation(ComponentImplementation object) {
				return createComponentImplementationAdapter();
			}
			@Override
			public Adapter caseComponentImplementationReference(ComponentImplementationReference object) {
				return createComponentImplementationReferenceAdapter();
			}
			@Override
			public Adapter caseComponentImplementationService(ComponentImplementationService object) {
				return createComponentImplementationServiceAdapter();
			}
			@Override
			public Adapter caseModuleType(ModuleType object) {
				return createModuleTypeAdapter();
			}
			@Override
			public Adapter caseModuleOperation(ModuleOperation object) {
				return createModuleOperationAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseRequestResponseType(RequestResponseType object) {
				return createRequestResponseTypeAdapter();
			}
			@Override
			public Adapter caseVersionedDataType(VersionedDataType object) {
				return createVersionedDataTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseEventSent(EventSent object) {
				return createEventSentAdapter();
			}
			@Override
			public Adapter caseEventReceived(EventReceived object) {
				return createEventReceivedAdapter();
			}
			@Override
			public Adapter caseVersionedDataWritten(VersionedDataWritten object) {
				return createVersionedDataWrittenAdapter();
			}
			@Override
			public Adapter caseVersionedDataRead(VersionedDataRead object) {
				return createVersionedDataReadAdapter();
			}
			@Override
			public Adapter caseRequestSent(RequestSent object) {
				return createRequestSentAdapter();
			}
			@Override
			public Adapter caseRequestReceived(RequestReceived object) {
				return createRequestReceivedAdapter();
			}
			@Override
			public Adapter caseModuleImplementation(ModuleImplementation object) {
				return createModuleImplementationAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseTriggerInstance(TriggerInstance object) {
				return createTriggerInstanceAdapter();
			}
			@Override
			public Adapter caseTriggerSender(TriggerSender object) {
				return createTriggerSenderAdapter();
			}
			@Override
			public Adapter caseDynamicTriggerInstance(DynamicTriggerInstance object) {
				return createDynamicTriggerInstanceAdapter();
			}
			@Override
			public Adapter caseDynamicTriggerEventReceiverInstance(DynamicTriggerEventReceiverInstance object) {
				return createDynamicTriggerEventReceiverInstanceAdapter();
			}
			@Override
			public Adapter caseDynamicTriggerEventSenderInstance(DynamicTriggerEventSenderInstance object) {
				return createDynamicTriggerEventSenderInstanceAdapter();
			}
			@Override
			public Adapter caseModuleInstance(ModuleInstance object) {
				return createModuleInstanceAdapter();
			}
			@Override
			public Adapter caseOperationInstance(OperationInstance object) {
				return createOperationInstanceAdapter();
			}
			@Override
			public Adapter caseEventSenderInstance(EventSenderInstance object) {
				return createEventSenderInstanceAdapter();
			}
			@Override
			public Adapter caseEventReceiverInstance(EventReceiverInstance object) {
				return createEventReceiverInstanceAdapter();
			}
			@Override
			public Adapter caseRequestClientInstance(RequestClientInstance object) {
				return createRequestClientInstanceAdapter();
			}
			@Override
			public Adapter caseRequestServerInstance(RequestServerInstance object) {
				return createRequestServerInstanceAdapter();
			}
			@Override
			public Adapter caseDataWriterInstance(DataWriterInstance object) {
				return createDataWriterInstanceAdapter();
			}
			@Override
			public Adapter caseDataReaderInstance(DataReaderInstance object) {
				return createDataReaderInstanceAdapter();
			}
			@Override
			public Adapter caseServRefOfLinkedComponentDefinition(ServRefOfLinkedComponentDefinition object) {
				return createServRefOfLinkedComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseReferenceOfLinkedComponentDefinition(ReferenceOfLinkedComponentDefinition object) {
				return createReferenceOfLinkedComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseServiceOfLinkedComponentDefinition(ServiceOfLinkedComponentDefinition object) {
				return createServiceOfLinkedComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseEventDefinitionInstance(EventDefinitionInstance object) {
				return createEventDefinitionInstanceAdapter();
			}
			@Override
			public Adapter caseRequestReferenceInstance(RequestReferenceInstance object) {
				return createRequestReferenceInstanceAdapter();
			}
			@Override
			public Adapter caseRequestServiceInstance(RequestServiceInstance object) {
				return createRequestServiceInstanceAdapter();
			}
			@Override
			public Adapter caseVersionedDataReferenceInstance(VersionedDataReferenceInstance object) {
				return createVersionedDataReferenceInstanceAdapter();
			}
			@Override
			public Adapter caseVersionedDataServiceInstance(VersionedDataServiceInstance object) {
				return createVersionedDataServiceInstanceAdapter();
			}
			@Override
			public Adapter caseOperationLink(OperationLink object) {
				return createOperationLinkAdapter();
			}
			@Override
			public Adapter caseDataLink(DataLink object) {
				return createDataLinkAdapter();
			}
			@Override
			public Adapter caseRequestLink(RequestLink object) {
				return createRequestLinkAdapter();
			}
			@Override
			public Adapter caseEventLink(EventLink object) {
				return createEventLinkAdapter();
			}
			@Override
			public Adapter caseDataLinkWriter(DataLinkWriter object) {
				return createDataLinkWriterAdapter();
			}
			@Override
			public Adapter caseDataLinkReader(DataLinkReader object) {
				return createDataLinkReaderAdapter();
			}
			@Override
			public Adapter caseEventLinkSender(EventLinkSender object) {
				return createEventLinkSenderAdapter();
			}
			@Override
			public Adapter caseExternalSenderOperation(ExternalSenderOperation object) {
				return createExternalSenderOperationAdapter();
			}
			@Override
			public Adapter caseEventLinkReceiver(EventLinkReceiver object) {
				return createEventLinkReceiverAdapter();
			}
			@Override
			public Adapter caseRequestLinkClient(RequestLinkClient object) {
				return createRequestLinkClientAdapter();
			}
			@Override
			public Adapter caseRequestLinkServer(RequestLinkServer object) {
				return createRequestLinkServerAdapter();
			}
			@Override
			public Adapter caseDataLinkActivatableFifo(DataLinkActivatableFifo object) {
				return createDataLinkActivatableFifoAdapter();
			}
			@Override
			public Adapter caseDataLinkToServiceOperation(DataLinkToServiceOperation object) {
				return createDataLinkToServiceOperationAdapter();
			}
			@Override
			public Adapter caseEventLinkActivatableFifo(EventLinkActivatableFifo object) {
				return createEventLinkActivatableFifoAdapter();
			}
			@Override
			public Adapter caseEventLinkActivatingFifo(EventLinkActivatingFifo object) {
				return createEventLinkActivatingFifoAdapter();
			}
			@Override
			public Adapter caseEventLinkToDefinitionOperation(EventLinkToDefinitionOperation object) {
				return createEventLinkToDefinitionOperationAdapter();
			}
			@Override
			public Adapter caseEventLinkToDefinitionOperationFromTrigger(EventLinkToDefinitionOperationFromTrigger object) {
				return createEventLinkToDefinitionOperationFromTriggerAdapter();
			}
			@Override
			public Adapter caseEventLinkActivatingFifoFromTrigger(EventLinkActivatingFifoFromTrigger object) {
				return createEventLinkActivatingFifoFromTriggerAdapter();
			}
			@Override
			public Adapter caseEventLinkActivatableFifoFromTrigger(EventLinkActivatableFifoFromTrigger object) {
				return createEventLinkActivatableFifoFromTriggerAdapter();
			}
			@Override
			public Adapter caseRequestLinkActivatableFifo(RequestLinkActivatableFifo object) {
				return createRequestLinkActivatableFifoAdapter();
			}
			@Override
			public Adapter caseRequestLinkActivatingActivatableFifo(RequestLinkActivatingActivatableFifo object) {
				return createRequestLinkActivatingActivatableFifoAdapter();
			}
			@Override
			public Adapter caseRequestLinkActivatingToReferenceOperation(RequestLinkActivatingToReferenceOperation object) {
				return createRequestLinkActivatingToReferenceOperationAdapter();
			}
			@Override
			public Adapter casePublicPinfoValue(PublicPinfoValue object) {
				return createPublicPinfoValueAdapter();
			}
			@Override
			public Adapter casePrivatePinfoValue(PrivatePinfoValue object) {
				return createPrivatePinfoValueAdapter();
			}
			@Override
			public Adapter casePinfoValue(PinfoValue object) {
				return createPinfoValueAdapter();
			}
			@Override
			public Adapter casePrivatePinfo(PrivatePinfo object) {
				return createPrivatePinfoAdapter();
			}
			@Override
			public Adapter casePublicPinfo(PublicPinfo object) {
				return createPublicPinfoAdapter();
			}
			@Override
			public Adapter caseModuleTypePinfo(ModuleTypePinfo object) {
				return createModuleTypePinfoAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseModuleTypeProperty(ModuleTypeProperty object) {
				return createModuleTypePropertyAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseOperationInheritingFromSD(OperationInheritingFromSD object) {
				return createOperationInheritingFromSDAdapter();
			}
			@Override
			public Adapter caseOperationInheritingFromMT(OperationInheritingFromMT object) {
				return createOperationInheritingFromMTAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ComponentImplementation
	 * @generated
	 */
	public Adapter createComponentImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ComponentImplementationReference <em>Component Implementation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ComponentImplementationReference
	 * @generated
	 */
	public Adapter createComponentImplementationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ComponentImplementationService <em>Component Implementation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ComponentImplementationService
	 * @generated
	 */
	public Adapter createComponentImplementationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleType
	 * @generated
	 */
	public Adapter createModuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleOperation <em>Module Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleOperation
	 * @generated
	 */
	public Adapter createModuleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestResponseType <em>Request Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestResponseType
	 * @generated
	 */
	public Adapter createRequestResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventSent <em>Event Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventSent
	 * @generated
	 */
	public Adapter createEventSentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventReceived <em>Event Received</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventReceived
	 * @generated
	 */
	public Adapter createEventReceivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.VersionedDataWritten <em>Versioned Data Written</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.VersionedDataWritten
	 * @generated
	 */
	public Adapter createVersionedDataWrittenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.VersionedDataRead <em>Versioned Data Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.VersionedDataRead
	 * @generated
	 */
	public Adapter createVersionedDataReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestSent <em>Request Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestSent
	 * @generated
	 */
	public Adapter createRequestSentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestReceived <em>Request Received</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestReceived
	 * @generated
	 */
	public Adapter createRequestReceivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.VersionedDataType <em>Versioned Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.VersionedDataType
	 * @generated
	 */
	public Adapter createVersionedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleImplementation
	 * @generated
	 */
	public Adapter createModuleImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleInstance
	 * @generated
	 */
	public Adapter createModuleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.TriggerInstance
	 * @generated
	 */
	public Adapter createTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.TriggerSender <em>Trigger Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.TriggerSender
	 * @generated
	 */
	public Adapter createTriggerSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DynamicTriggerInstance <em>Dynamic Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DynamicTriggerInstance
	 * @generated
	 */
	public Adapter createDynamicTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventSenderInstance <em>Event Sender Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventSenderInstance
	 * @generated
	 */
	public Adapter createEventSenderInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventReceiverInstance <em>Event Receiver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventReceiverInstance
	 * @generated
	 */
	public Adapter createEventReceiverInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestClientInstance <em>Request Client Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestClientInstance
	 * @generated
	 */
	public Adapter createRequestClientInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestServerInstance <em>Request Server Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestServerInstance
	 * @generated
	 */
	public Adapter createRequestServerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.OperationInstance <em>Operation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.OperationInstance
	 * @generated
	 */
	public Adapter createOperationInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataWriterInstance <em>Data Writer Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataWriterInstance
	 * @generated
	 */
	public Adapter createDataWriterInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataReaderInstance <em>Data Reader Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataReaderInstance
	 * @generated
	 */
	public Adapter createDataReaderInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ServRefOfLinkedComponentDefinition <em>Serv Ref Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition
	 * @generated
	 */
	public Adapter createServRefOfLinkedComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DynamicTriggerEventReceiverInstance <em>Dynamic Trigger Event Receiver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DynamicTriggerEventReceiverInstance
	 * @generated
	 */
	public Adapter createDynamicTriggerEventReceiverInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DynamicTriggerEventSenderInstance <em>Dynamic Trigger Event Sender Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DynamicTriggerEventSenderInstance
	 * @generated
	 */
	public Adapter createDynamicTriggerEventSenderInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ReferenceOfLinkedComponentDefinition <em>Reference Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ReferenceOfLinkedComponentDefinition
	 * @generated
	 */
	public Adapter createReferenceOfLinkedComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ServiceOfLinkedComponentDefinition <em>Service Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ServiceOfLinkedComponentDefinition
	 * @generated
	 */
	public Adapter createServiceOfLinkedComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventDefinitionInstance <em>Event Definition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventDefinitionInstance
	 * @generated
	 */
	public Adapter createEventDefinitionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestReferenceInstance <em>Request Reference Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestReferenceInstance
	 * @generated
	 */
	public Adapter createRequestReferenceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestServiceInstance <em>Request Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestServiceInstance
	 * @generated
	 */
	public Adapter createRequestServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.VersionedDataReferenceInstance <em>Versioned Data Reference Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.VersionedDataReferenceInstance
	 * @generated
	 */
	public Adapter createVersionedDataReferenceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.VersionedDataServiceInstance <em>Versioned Data Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.VersionedDataServiceInstance
	 * @generated
	 */
	public Adapter createVersionedDataServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.OperationLink <em>Operation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.OperationLink
	 * @generated
	 */
	public Adapter createOperationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataLink
	 * @generated
	 */
	public Adapter createDataLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLink <em>Request Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLink
	 * @generated
	 */
	public Adapter createRequestLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLink <em>Event Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLink
	 * @generated
	 */
	public Adapter createEventLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataLinkWriter <em>Data Link Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataLinkWriter
	 * @generated
	 */
	public Adapter createDataLinkWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataLinkReader <em>Data Link Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataLinkReader
	 * @generated
	 */
	public Adapter createDataLinkReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkSender <em>Event Link Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkSender
	 * @generated
	 */
	public Adapter createEventLinkSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkReceiver <em>Event Link Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkReceiver
	 * @generated
	 */
	public Adapter createEventLinkReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLinkClient <em>Request Link Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLinkClient
	 * @generated
	 */
	public Adapter createRequestLinkClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLinkServer <em>Request Link Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLinkServer
	 * @generated
	 */
	public Adapter createRequestLinkServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataLinkActivatableFifo <em>Data Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataLinkActivatableFifo
	 * @generated
	 */
	public Adapter createDataLinkActivatableFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.DataLinkToServiceOperation <em>Data Link To Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.DataLinkToServiceOperation
	 * @generated
	 */
	public Adapter createDataLinkToServiceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkActivatableFifo <em>Event Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkActivatableFifo
	 * @generated
	 */
	public Adapter createEventLinkActivatableFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkActivatingFifo <em>Event Link Activating Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkActivatingFifo
	 * @generated
	 */
	public Adapter createEventLinkActivatingFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkToDefinitionOperation <em>Event Link To Definition Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkToDefinitionOperation
	 * @generated
	 */
	public Adapter createEventLinkToDefinitionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger <em>Event Link To Definition Operation From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkToDefinitionOperationFromTrigger
	 * @generated
	 */
	public Adapter createEventLinkToDefinitionOperationFromTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkActivatingFifoFromTrigger <em>Event Link Activating Fifo From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger
	 * @generated
	 */
	public Adapter createEventLinkActivatingFifoFromTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.EventLinkActivatableFifoFromTrigger <em>Event Link Activatable Fifo From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger
	 * @generated
	 */
	public Adapter createEventLinkActivatableFifoFromTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLinkActivatableFifo <em>Request Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLinkActivatableFifo
	 * @generated
	 */
	public Adapter createRequestLinkActivatableFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLinkActivatingActivatableFifo <em>Request Link Activating Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo
	 * @generated
	 */
	public Adapter createRequestLinkActivatingActivatableFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.RequestLinkActivatingToReferenceOperation <em>Request Link Activating To Reference Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.RequestLinkActivatingToReferenceOperation
	 * @generated
	 */
	public Adapter createRequestLinkActivatingToReferenceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PublicPinfoValue <em>Public Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PublicPinfoValue
	 * @generated
	 */
	public Adapter createPublicPinfoValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PrivatePinfoValue <em>Private Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PrivatePinfoValue
	 * @generated
	 */
	public Adapter createPrivatePinfoValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PinfoValue <em>Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PinfoValue
	 * @generated
	 */
	public Adapter createPinfoValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PrivatePinfo
	 * @generated
	 */
	public Adapter createPrivatePinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PublicPinfo
	 * @generated
	 */
	public Adapter createPublicPinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleTypePinfo <em>Module Type Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleTypePinfo
	 * @generated
	 */
	public Adapter createModuleTypePinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ModuleTypeProperty <em>Module Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ModuleTypeProperty
	 * @generated
	 */
	public Adapter createModuleTypePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.OperationInheritingFromSD <em>Operation Inheriting From SD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.OperationInheritingFromSD
	 * @generated
	 */
	public Adapter createOperationInheritingFromSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.OperationInheritingFromMT <em>Operation Inheriting From MT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.OperationInheritingFromMT
	 * @generated
	 */
	public Adapter createOperationInheritingFromMTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtimplementation.ExternalSenderOperation <em>External Sender Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtimplementation.ExternalSenderOperation
	 * @generated
	 */
	public Adapter createExternalSenderOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EdtimplementationAdapterFactory
