/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getDataNotification <em>Data Notification</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getResponseNotification <em>Response Notification</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.module.behaviour._2.modPackage#getModuleBehaviour()
 * @model extendedMetaData="name='ModuleBehaviour' kind='elementOnly'"
 * @generated
 */
public interface ModuleBehaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming operation (event or request received)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getModuleBehaviour_EntryPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryPoint> getEntryPoint();

	/**
	 * Returns the value of the '<em><b>Data Notification</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.DataNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming versioned data update
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Notification</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getModuleBehaviour_DataNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataNotification> getDataNotification();

	/**
	 * Returns the value of the '<em><b>Response Notification</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.ResponseNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming response
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Notification</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getModuleBehaviour_ResponseNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResponseNotification> getResponseNotification();

} // ModuleBehaviour
