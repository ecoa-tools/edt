/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Array</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Array#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link edttype.Array#getItemType <em>Item Type</em>}</li>
 *   <li>{@link edttype.Array#getMaxNumberType <em>Max Number Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(String)
	 * @see edttype.EDTTypePackage#getArray_MaxNumber()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrPositiveIntegerValue"
	 *        required="true"
	 * @generated
	 */
	String getMaxNumber();

	/**
	 * Sets the value of the '{@link edttype.Array#getMaxNumber <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number</em>' attribute.
	 * @see #getMaxNumber()
	 * @generated
	 */
	void setMaxNumber(String value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Item Type</em>' reference.
	 * @see #setItemType(EDTDataType)
	 * @see edttype.EDTTypePackage#getArray_ItemType()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getItemType();

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
	 * Sets the value of the '{@link edttype.Array#getItemType <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' reference.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>Max Number Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Number Type</em>' reference.
	 * @see #setMaxNumberType(Constant)
	 * @see edttype.EDTTypePackage#getArray_MaxNumberType()
	 * @model
	 * @generated
	 */
	Constant getMaxNumberType();

	/**
	 * Sets the value of the '{@link edttype.Array#getMaxNumberType <em>Max Number Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Type</em>' reference.
	 * @see #getMaxNumberType()
	 * @generated
	 */
	void setMaxNumberType(Constant value);
} // Array
