/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Enum</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Enum#getValue <em>Value</em>}</li>
 *   <li>{@link edttype.Enum#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.EnumValue}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getEnum_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumValue> getValue();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getEnum_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Returns the value of the '<em><b>BasicType</b></em>' derived reference. <!--
	 * begin-user-doc --> Search for the BasicType that the Simple is derived from
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>BasicType</em>' reference.
	 * @generated NOT
	 */
	BasicType getBasicType();

	/**
	 * Sets the value of the '{@link edttype.Enum#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

} // Enum
