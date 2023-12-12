/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edtdeployment.EdtdeploymentPackage
 * @generated
 */
public interface EdtdeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtdeploymentFactory eINSTANCE = edtdeployment.impl.EdtdeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Protection Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Domain</em>'.
	 * @generated
	 */
	ProtectionDomain createProtectionDomain();

	/**
	 * Returns a new object of class '<em>Deployed Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Module Instance</em>'.
	 * @generated
	 */
	DeployedModuleInstance createDeployedModuleInstance();

	/**
	 * Returns a new object of class '<em>Deployed Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Trigger Instance</em>'.
	 * @generated
	 */
	DeployedTriggerInstance createDeployedTriggerInstance();

	/**
	 * Returns a new object of class '<em>Log Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Policy</em>'.
	 * @generated
	 */
	LogPolicy createLogPolicy();

	/**
	 * Returns a new object of class '<em>Component Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Log</em>'.
	 * @generated
	 */
	ComponentLog createComponentLog();

	/**
	 * Returns a new object of class '<em>Module Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Log</em>'.
	 * @generated
	 */
	ModuleLog createModuleLog();

	/**
	 * Returns a new object of class '<em>Platform Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Configuration</em>'.
	 * @generated
	 */
	PlatformConfiguration createPlatformConfiguration();

	/**
	 * Returns a new object of class '<em>Platform Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Message</em>'.
	 * @generated
	 */
	PlatformMessage createPlatformMessage();

	/**
	 * Returns a new object of class '<em>Computing Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Node Configuration</em>'.
	 * @generated
	 */
	ComputingNodeConfiguration createComputingNodeConfiguration();

	/**
	 * Returns a new object of class '<em>Wire Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Mapping</em>'.
	 * @generated
	 */
	WireMapping createWireMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdtdeploymentPackage getEdtdeploymentPackage();

} //EdtdeploymentFactory
