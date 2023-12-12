/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package edttype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.SimplePredefined#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getSimplePredefined()
 * @model
 * @generated
 */
public interface SimplePredefined extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getSimplePredefined_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edttype.SimplePredefined#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

} // SimplePredefined
