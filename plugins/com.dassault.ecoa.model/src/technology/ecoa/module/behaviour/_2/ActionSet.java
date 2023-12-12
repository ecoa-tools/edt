/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of actions to be sequentially executed by the
 *         module.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.ActionSet#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.ActionSet#getLoop <em>Loop</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.ActionSet#getComputing <em>Computing</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.ActionSet#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.module.behaviour._2.modPackage#getActionSet()
 * @model extendedMetaData="name='ActionSet' kind='elementOnly'"
 * @generated
 */
public interface ActionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getActionSet_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loop of actions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getActionSet_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Loop> getLoop();

	/**
	 * Returns the value of the '<em><b>Computing</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.Computing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing internal to the module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computing</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getActionSet_Computing()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='computing' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Computing> getComputing();

	/**
	 * Returns the value of the '<em><b>Operation Call</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.module.behaviour._2.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Call to an operation outside of the module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Call</em>' containment reference list.
	 * @see technology.ecoa.module.behaviour._2.modPackage#getActionSet_OperationCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationCall' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OperationCall> getOperationCall();

} // ActionSet
