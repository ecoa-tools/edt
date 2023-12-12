/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.util;

import edtdeployment.*;

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
 * @see edtdeployment.EdtdeploymentPackage
 * @generated
 */
public class EdtdeploymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtdeploymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtdeploymentSwitch() {
		if (modelPackage == null) {
			modelPackage = EdtdeploymentPackage.eINSTANCE;
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
			case EdtdeploymentPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.PROTECTION_DOMAIN: {
				ProtectionDomain protectionDomain = (ProtectionDomain)theEObject;
				T result = caseProtectionDomain(protectionDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE: {
				DeployedModuleInstance deployedModuleInstance = (DeployedModuleInstance)theEObject;
				T result = caseDeployedModuleInstance(deployedModuleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE: {
				DeployedTriggerInstance deployedTriggerInstance = (DeployedTriggerInstance)theEObject;
				T result = caseDeployedTriggerInstance(deployedTriggerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.LOG_POLICY: {
				LogPolicy logPolicy = (LogPolicy)theEObject;
				T result = caseLogPolicy(logPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.COMPONENT_LOG: {
				ComponentLog componentLog = (ComponentLog)theEObject;
				T result = caseComponentLog(componentLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.MODULE_LOG: {
				ModuleLog moduleLog = (ModuleLog)theEObject;
				T result = caseModuleLog(moduleLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION: {
				PlatformConfiguration platformConfiguration = (PlatformConfiguration)theEObject;
				T result = casePlatformConfiguration(platformConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.PLATFORM_MESSAGE: {
				PlatformMessage platformMessage = (PlatformMessage)theEObject;
				T result = casePlatformMessage(platformMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION: {
				ComputingNodeConfiguration computingNodeConfiguration = (ComputingNodeConfiguration)theEObject;
				T result = caseComputingNodeConfiguration(computingNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtdeploymentPackage.WIRE_MAPPING: {
				WireMapping wireMapping = (WireMapping)theEObject;
				T result = caseWireMapping(wireMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionDomain(ProtectionDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Module Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedModuleInstance(DeployedModuleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Trigger Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedTriggerInstance(DeployedTriggerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogPolicy(LogPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentLog(ComponentLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleLog(ModuleLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformConfiguration(PlatformConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformMessage(PlatformMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingNodeConfiguration(ComputingNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireMapping(WireMapping object) {
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

} //EdtdeploymentSwitch
