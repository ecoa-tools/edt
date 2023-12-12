/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.module.behaviour._2.modPackage
 * @generated
 */
public interface modFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modFactory eINSTANCE = technology.ecoa.module.behaviour._2.impl.modFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Set</em>'.
	 * @generated
	 */
	ActionSet createActionSet();

	/**
	 * Returns a new object of class '<em>Computing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing</em>'.
	 * @generated
	 */
	Computing createComputing();

	/**
	 * Returns a new object of class '<em>Data Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Notification</em>'.
	 * @generated
	 */
	DataNotification createDataNotification();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point</em>'.
	 * @generated
	 */
	EntryPoint createEntryPoint();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Module Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Behaviour</em>'.
	 * @generated
	 */
	ModuleBehaviour createModuleBehaviour();

	/**
	 * Returns a new object of class '<em>Module Life Cycle Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Life Cycle Notification</em>'.
	 * @generated
	 */
	ModuleLifeCycleNotification createModuleLifeCycleNotification();

	/**
	 * Returns a new object of class '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call</em>'.
	 * @generated
	 */
	OperationCall createOperationCall();

	/**
	 * Returns a new object of class '<em>Response Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Notification</em>'.
	 * @generated
	 */
	ResponseNotification createResponseNotification();

	/**
	 * Returns a new object of class '<em>Service Management Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Management Notification</em>'.
	 * @generated
	 */
	ServiceManagementNotification createServiceManagementNotification();

	/**
	 * Returns a new object of class '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Type</em>'.
	 * @generated
	 */
	UseType createUseType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modPackage getmodPackage();

} //modFactory
