/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.uid._2.IDMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EUID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link temp.EUID#getUID <em>UID</em>}</li>
 *   <li>{@link temp.EUID#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see temp.TempPackage#getEUID()
 * @model
 * @generated
 */
public interface EUID extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' containment reference.
	 * @see #setUID(IDMap)
	 * @see temp.TempPackage#getEUID_UID()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IDMap getUID();

	/**
	 * Sets the value of the '{@link temp.EUID#getUID <em>UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' containment reference.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(IDMap value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see temp.TempPackage#getEUID_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link temp.EUID#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EUID
