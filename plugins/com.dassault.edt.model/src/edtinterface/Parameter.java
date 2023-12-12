/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import org.eclipse.emf.ecore.EObject;

import edttype.EDTDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtinterface.Parameter#getName <em>Name</em>}</li>
 * <li>{@link edtinterface.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtinterface.EDTInterfacePackage#getParameter_Name()
	 * @model dataType="technology.ecoa.interface_._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtinterface.Parameter#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edtinterface.EDTInterfacePackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edtinterface.Parameter#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // Parameter
