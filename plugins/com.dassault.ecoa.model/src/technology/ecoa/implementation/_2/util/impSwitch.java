/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import technology.ecoa.implementation._2.*;

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
 * @see technology.ecoa.implementation._2.impPackage
 * @generated
 */
public class impSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static impPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impSwitch() {
		if (modelPackage == null) {
			modelPackage = impPackage.eINSTANCE;
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
			case impPackage.CLIENTS_TYPE: {
				ClientsType clientsType = (ClientsType)theEObject;
				T result = caseClientsType(clientsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.COMPONENT_IMPLEMENTATION: {
				ComponentImplementation componentImplementation = (ComponentImplementation)theEObject;
				T result = caseComponentImplementation(componentImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.DATA_LINK: {
				DataLink dataLink = (DataLink)theEObject;
				T result = caseDataLink(dataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.DATA_READ_TYPE: {
				DataReadType dataReadType = (DataReadType)theEObject;
				T result = caseDataReadType(dataReadType);
				if (result == null) result = caseVersionedData(dataReadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.DATA_WRITTEN_TYPE: {
				DataWrittenType dataWrittenType = (DataWrittenType)theEObject;
				T result = caseDataWrittenType(dataWrittenType);
				if (result == null) result = caseVersionedData(dataWrittenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.DYNAMIC_TRIGGER_INSTANCE: {
				DynamicTriggerInstance dynamicTriggerInstance = (DynamicTriggerInstance)theEObject;
				T result = caseDynamicTriggerInstance(dynamicTriggerInstance);
				if (result == null) result = caseInstance(dynamicTriggerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.EVENT_LINK: {
				EventLink eventLink = (EventLink)theEObject;
				T result = caseEventLink(eventLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.EVENT_RECEIVED_TYPE: {
				EventReceivedType eventReceivedType = (EventReceivedType)theEObject;
				T result = caseEventReceivedType(eventReceivedType);
				if (result == null) result = caseEvent(eventReceivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.MODULE_IMPLEMENTATION: {
				ModuleImplementation moduleImplementation = (ModuleImplementation)theEObject;
				T result = caseModuleImplementation(moduleImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.MODULE_INSTANCE: {
				ModuleInstance moduleInstance = (ModuleInstance)theEObject;
				T result = caseModuleInstance(moduleInstance);
				if (result == null) result = caseInstance(moduleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.MODULE_TYPE: {
				ModuleType moduleType = (ModuleType)theEObject;
				T result = caseModuleType(moduleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OPERATIONS_TYPE: {
				OperationsType operationsType = (OperationsType)theEObject;
				T result = caseOperationsType(operationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF: {
				OpRef opRef = (OpRef)theEObject;
				T result = caseOpRef(opRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF_ACTIVATABLE: {
				OpRefActivatable opRefActivatable = (OpRefActivatable)theEObject;
				T result = caseOpRefActivatable(opRefActivatable);
				if (result == null) result = caseOpRef(opRefActivatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF_ACTIVATABLE_FIFO: {
				OpRefActivatableFifo opRefActivatableFifo = (OpRefActivatableFifo)theEObject;
				T result = caseOpRefActivatableFifo(opRefActivatableFifo);
				if (result == null) result = caseOpRefActivatable(opRefActivatableFifo);
				if (result == null) result = caseOpRef(opRefActivatableFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF_ACTIVATING_FIFO: {
				OpRefActivatingFifo opRefActivatingFifo = (OpRefActivatingFifo)theEObject;
				T result = caseOpRefActivatingFifo(opRefActivatingFifo);
				if (result == null) result = caseOpRef(opRefActivatingFifo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF_EXTERNAL: {
				OpRefExternal opRefExternal = (OpRefExternal)theEObject;
				T result = caseOpRefExternal(opRefExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.OP_REF_TRIGGER: {
				OpRefTrigger opRefTrigger = (OpRefTrigger)theEObject;
				T result = caseOpRefTrigger(opRefTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PINFO_TYPE: {
				PinfoType pinfoType = (PinfoType)theEObject;
				T result = casePinfoType(pinfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PINFO_TYPE1: {
				PinfoType1 pinfoType1 = (PinfoType1)theEObject;
				T result = casePinfoType1(pinfoType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PINFO_VALUE: {
				PinfoValue pinfoValue = (PinfoValue)theEObject;
				T result = casePinfoValue(pinfoValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PRIVATE_PINFO: {
				PrivatePinfo privatePinfo = (PrivatePinfo)theEObject;
				T result = casePrivatePinfo(privatePinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				T result = casePropertyValue(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PROPERTY_VALUES: {
				PropertyValues propertyValues = (PropertyValues)theEObject;
				T result = casePropertyValues(propertyValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.PUBLIC_PINFO: {
				PublicPinfo publicPinfo = (PublicPinfo)theEObject;
				T result = casePublicPinfo(publicPinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.READERS_TYPE: {
				ReadersType readersType = (ReadersType)theEObject;
				T result = caseReadersType(readersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.RECEIVERS_TYPE: {
				ReceiversType receiversType = (ReceiversType)theEObject;
				T result = caseReceiversType(receiversType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.REQUEST_LINK: {
				RequestLink requestLink = (RequestLink)theEObject;
				T result = caseRequestLink(requestLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.REQUEST_RECEIVED_TYPE: {
				RequestReceivedType requestReceivedType = (RequestReceivedType)theEObject;
				T result = caseRequestReceivedType(requestReceivedType);
				if (result == null) result = caseRequestResponse(requestReceivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.REQUEST_RESPONSE: {
				RequestResponse requestResponse = (RequestResponse)theEObject;
				T result = caseRequestResponse(requestResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.REQUEST_SENT_TYPE: {
				RequestSentType requestSentType = (RequestSentType)theEObject;
				T result = caseRequestSentType(requestSentType);
				if (result == null) result = caseRequestResponse(requestSentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.SENDERS_TYPE: {
				SendersType sendersType = (SendersType)theEObject;
				T result = caseSendersType(sendersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.SERVER_TYPE: {
				ServerType serverType = (ServerType)theEObject;
				T result = caseServerType(serverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.SERVICE_QO_S: {
				ServiceQoS serviceQoS = (ServiceQoS)theEObject;
				T result = caseServiceQoS(serviceQoS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.TRIGGER_INSTANCE: {
				TriggerInstance triggerInstance = (TriggerInstance)theEObject;
				T result = caseTriggerInstance(triggerInstance);
				if (result == null) result = caseInstance(triggerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.USE_TYPE: {
				UseType useType = (UseType)theEObject;
				T result = caseUseType(useType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.VERSIONED_DATA: {
				VersionedData versionedData = (VersionedData)theEObject;
				T result = caseVersionedData(versionedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case impPackage.WRITERS_TYPE: {
				WritersType writersType = (WritersType)theEObject;
				T result = caseWritersType(writersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientsType(ClientsType object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Read Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Read Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReadType(DataReadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Written Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Written Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataWrittenType(DataWrittenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Received Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Received Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReceivedType(EventReceivedType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsType(OperationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRef(OpRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref Activatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref Activatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRefActivatable(OpRefActivatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref Activatable Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref Activatable Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRefActivatableFifo(OpRefActivatableFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref Activating Fifo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref Activating Fifo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRefActivatingFifo(OpRefActivatingFifo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRefExternal(OpRefExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Ref Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Ref Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpRefTrigger(OpRefTrigger object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pinfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinfoType(PinfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pinfo Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pinfo Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinfoType1(PinfoType1 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Property Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValues(PropertyValues object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Readers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadersType(ReadersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receivers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receivers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiversType(ReceiversType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Request Received Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Received Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestReceivedType(RequestReceivedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestResponse(RequestResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Sent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Sent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSentType(RequestSentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Senders Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Senders Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendersType(SendersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerType(ServerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Qo S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Qo S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceQoS(ServiceQoS object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseType(UseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedData(VersionedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritersType(WritersType object) {
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

} //impSwitch
