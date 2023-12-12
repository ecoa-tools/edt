/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.deployment._2.depPackage
 * @generated
 */
public interface depFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	depFactory eINSTANCE = technology.ecoa.deployment._2.impl.depFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Log</em>'.
	 * @generated
	 */
	ComponentLog createComponentLog();

	/**
	 * Returns a new object of class '<em>Computing Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Node Configuration</em>'.
	 * @generated
	 */
	ComputingNodeConfiguration createComputingNodeConfiguration();

	/**
	 * Returns a new object of class '<em>Deployed Module Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Module Instance Type</em>'.
	 * @generated
	 */
	DeployedModuleInstanceType createDeployedModuleInstanceType();

	/**
	 * Returns a new object of class '<em>Deployed Trigger Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Trigger Instance Type</em>'.
	 * @generated
	 */
	DeployedTriggerInstanceType createDeployedTriggerInstanceType();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Execute On Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute On Type</em>'.
	 * @generated
	 */
	ExecuteOnType createExecuteOnType();

	/**
	 * Returns a new object of class '<em>Log Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Policy</em>'.
	 * @generated
	 */
	LogPolicy createLogPolicy();

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
	 * Returns a new object of class '<em>Platform Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Messages</em>'.
	 * @generated
	 */
	PlatformMessages createPlatformMessages();

	/**
	 * Returns a new object of class '<em>Protection Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Domain</em>'.
	 * @generated
	 */
	ProtectionDomain createProtectionDomain();

	/**
	 * Returns a new object of class '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Type</em>'.
	 * @generated
	 */
	UseType createUseType();

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
	depPackage getdepPackage();

} //depFactory
