/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.implementation._2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.implementation._2.impPackage
 * @generated
 */
public class impAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static impPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = impPackage.eINSTANCE;
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
	protected impSwitch<Adapter> modelSwitch =
		new impSwitch<Adapter>() {
			@Override
			public Adapter caseClientsType(ClientsType object) {
				return createClientsTypeAdapter();
			}
			@Override
			public Adapter caseComponentImplementation(ComponentImplementation object) {
				return createComponentImplementationAdapter();
			}
			@Override
			public Adapter caseDataLink(DataLink object) {
				return createDataLinkAdapter();
			}
			@Override
			public Adapter caseDataReadType(DataReadType object) {
				return createDataReadTypeAdapter();
			}
			@Override
			public Adapter caseDataWrittenType(DataWrittenType object) {
				return createDataWrittenTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicTriggerInstance(DynamicTriggerInstance object) {
				return createDynamicTriggerInstanceAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventLink(EventLink object) {
				return createEventLinkAdapter();
			}
			@Override
			public Adapter caseEventReceivedType(EventReceivedType object) {
				return createEventReceivedTypeAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseModuleImplementation(ModuleImplementation object) {
				return createModuleImplementationAdapter();
			}
			@Override
			public Adapter caseModuleInstance(ModuleInstance object) {
				return createModuleInstanceAdapter();
			}
			@Override
			public Adapter caseModuleType(ModuleType object) {
				return createModuleTypeAdapter();
			}
			@Override
			public Adapter caseOperationsType(OperationsType object) {
				return createOperationsTypeAdapter();
			}
			@Override
			public Adapter caseOpRef(OpRef object) {
				return createOpRefAdapter();
			}
			@Override
			public Adapter caseOpRefActivatable(OpRefActivatable object) {
				return createOpRefActivatableAdapter();
			}
			@Override
			public Adapter caseOpRefActivatableFifo(OpRefActivatableFifo object) {
				return createOpRefActivatableFifoAdapter();
			}
			@Override
			public Adapter caseOpRefActivatingFifo(OpRefActivatingFifo object) {
				return createOpRefActivatingFifoAdapter();
			}
			@Override
			public Adapter caseOpRefExternal(OpRefExternal object) {
				return createOpRefExternalAdapter();
			}
			@Override
			public Adapter caseOpRefTrigger(OpRefTrigger object) {
				return createOpRefTriggerAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePinfoType(PinfoType object) {
				return createPinfoTypeAdapter();
			}
			@Override
			public Adapter casePinfoType1(PinfoType1 object) {
				return createPinfoType1Adapter();
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
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter casePropertyValues(PropertyValues object) {
				return createPropertyValuesAdapter();
			}
			@Override
			public Adapter casePublicPinfo(PublicPinfo object) {
				return createPublicPinfoAdapter();
			}
			@Override
			public Adapter caseReadersType(ReadersType object) {
				return createReadersTypeAdapter();
			}
			@Override
			public Adapter caseReceiversType(ReceiversType object) {
				return createReceiversTypeAdapter();
			}
			@Override
			public Adapter caseRequestLink(RequestLink object) {
				return createRequestLinkAdapter();
			}
			@Override
			public Adapter caseRequestReceivedType(RequestReceivedType object) {
				return createRequestReceivedTypeAdapter();
			}
			@Override
			public Adapter caseRequestResponse(RequestResponse object) {
				return createRequestResponseAdapter();
			}
			@Override
			public Adapter caseRequestSentType(RequestSentType object) {
				return createRequestSentTypeAdapter();
			}
			@Override
			public Adapter caseSendersType(SendersType object) {
				return createSendersTypeAdapter();
			}
			@Override
			public Adapter caseServerType(ServerType object) {
				return createServerTypeAdapter();
			}
			@Override
			public Adapter caseServiceQoS(ServiceQoS object) {
				return createServiceQoSAdapter();
			}
			@Override
			public Adapter caseTriggerInstance(TriggerInstance object) {
				return createTriggerInstanceAdapter();
			}
			@Override
			public Adapter caseUseType(UseType object) {
				return createUseTypeAdapter();
			}
			@Override
			public Adapter caseVersionedData(VersionedData object) {
				return createVersionedDataAdapter();
			}
			@Override
			public Adapter caseWritersType(WritersType object) {
				return createWritersTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ClientsType <em>Clients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ClientsType
	 * @generated
	 */
	public Adapter createClientsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ComponentImplementation
	 * @generated
	 */
	public Adapter createComponentImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.DataLink
	 * @generated
	 */
	public Adapter createDataLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.DataReadType <em>Data Read Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.DataReadType
	 * @generated
	 */
	public Adapter createDataReadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.DataWrittenType <em>Data Written Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.DataWrittenType
	 * @generated
	 */
	public Adapter createDataWrittenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.DynamicTriggerInstance <em>Dynamic Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.DynamicTriggerInstance
	 * @generated
	 */
	public Adapter createDynamicTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.EventLink <em>Event Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.EventLink
	 * @generated
	 */
	public Adapter createEventLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.EventReceivedType <em>Event Received Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.EventReceivedType
	 * @generated
	 */
	public Adapter createEventReceivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ModuleImplementation
	 * @generated
	 */
	public Adapter createModuleImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ModuleInstance
	 * @generated
	 */
	public Adapter createModuleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ModuleType
	 * @generated
	 */
	public Adapter createModuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OperationsType <em>Operations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OperationsType
	 * @generated
	 */
	public Adapter createOperationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRef <em>Op Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRef
	 * @generated
	 */
	public Adapter createOpRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRefActivatable <em>Op Ref Activatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRefActivatable
	 * @generated
	 */
	public Adapter createOpRefActivatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRefActivatableFifo <em>Op Ref Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRefActivatableFifo
	 * @generated
	 */
	public Adapter createOpRefActivatableFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRefActivatingFifo <em>Op Ref Activating Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRefActivatingFifo
	 * @generated
	 */
	public Adapter createOpRefActivatingFifoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRefExternal <em>Op Ref External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRefExternal
	 * @generated
	 */
	public Adapter createOpRefExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.OpRefTrigger <em>Op Ref Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.OpRefTrigger
	 * @generated
	 */
	public Adapter createOpRefTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PinfoType <em>Pinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PinfoType
	 * @generated
	 */
	public Adapter createPinfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PinfoType1 <em>Pinfo Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PinfoType1
	 * @generated
	 */
	public Adapter createPinfoType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PinfoValue <em>Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PinfoValue
	 * @generated
	 */
	public Adapter createPinfoValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PrivatePinfo
	 * @generated
	 */
	public Adapter createPrivatePinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PropertyValues
	 * @generated
	 */
	public Adapter createPropertyValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.PublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.PublicPinfo
	 * @generated
	 */
	public Adapter createPublicPinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ReadersType <em>Readers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ReadersType
	 * @generated
	 */
	public Adapter createReadersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ReceiversType <em>Receivers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ReceiversType
	 * @generated
	 */
	public Adapter createReceiversTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.RequestLink <em>Request Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.RequestLink
	 * @generated
	 */
	public Adapter createRequestLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.RequestReceivedType <em>Request Received Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.RequestReceivedType
	 * @generated
	 */
	public Adapter createRequestReceivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.RequestResponse
	 * @generated
	 */
	public Adapter createRequestResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.RequestSentType <em>Request Sent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.RequestSentType
	 * @generated
	 */
	public Adapter createRequestSentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.SendersType <em>Senders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.SendersType
	 * @generated
	 */
	public Adapter createSendersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ServerType
	 * @generated
	 */
	public Adapter createServerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.ServiceQoS <em>Service Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.ServiceQoS
	 * @generated
	 */
	public Adapter createServiceQoSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.TriggerInstance
	 * @generated
	 */
	public Adapter createTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.UseType
	 * @generated
	 */
	public Adapter createUseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.VersionedData <em>Versioned Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.VersionedData
	 * @generated
	 */
	public Adapter createVersionedDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.implementation._2.WritersType <em>Writers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.implementation._2.WritersType
	 * @generated
	 */
	public Adapter createWritersTypeAdapter() {
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

} //impAdapterFactory
