/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import edttype.EDTDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtinterface.Data#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getData()
 * @model
 * @generated
 */
public interface Data extends OperationType {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edtinterface.EDTInterfacePackage#getData_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edtinterface.Data#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);
} // Data
