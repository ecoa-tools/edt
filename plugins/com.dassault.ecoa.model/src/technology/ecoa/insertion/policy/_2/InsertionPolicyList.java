/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insertion Policy List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicyList#getInsertionPolicy <em>Insertion Policy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicyList#getComponentImplementation <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicyList()
 * @model extendedMetaData="name='InsertionPolicyList' kind='elementOnly'"
 * @generated
 */
public interface InsertionPolicyList extends EObject {
	/**
	 * Returns the value of the '<em><b>Insertion Policy</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.InsertionPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insertion policy entry
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insertion Policy</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicyList_InsertionPolicy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='insertionPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsertionPolicy> getInsertionPolicy();

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the component implementation
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Implementation</em>' attribute.
	 * @see #setComponentImplementation(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicyList_ComponentImplementation()
	 * @model dataType="technology.ecoa.insertion.policy._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='componentImplementation'"
	 * @generated
	 */
	String getComponentImplementation();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicyList#getComponentImplementation <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation</em>' attribute.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(String value);

} // InsertionPolicyList
