/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.insertion.policy._2.InsertionPolicyList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insertion Policies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link temp.InsertionPolicies#getInsertionPolicy <em>Insertion Policy</em>}</li>
 *   <li>{@link temp.InsertionPolicies#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see temp.TempPackage#getInsertionPolicies()
 * @model
 * @generated
 */
public interface InsertionPolicies extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see temp.TempPackage#getInsertionPolicies_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link temp.InsertionPolicies#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Insertion Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Policy</em>' containment reference.
	 * @see #setInsertionPolicy(InsertionPolicyList)
	 * @see temp.TempPackage#getInsertionPolicies_InsertionPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InsertionPolicyList getInsertionPolicy();

	/**
	 * Sets the value of the '{@link temp.InsertionPolicies#getInsertionPolicy <em>Insertion Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Policy</em>' containment reference.
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	void setInsertionPolicy(InsertionPolicyList value);

} // InsertionPolicies
