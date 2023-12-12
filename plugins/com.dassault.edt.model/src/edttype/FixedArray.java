/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fixed
 * Array</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.FixedArray#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link edttype.FixedArray#getItemType <em>Item Type</em>}</li>
 *   <li>{@link edttype.FixedArray#getMaxNumberType <em>Max Number Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getFixedArray()
 * @model
 * @generated
 */
public interface FixedArray extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(String)
	 * @see edttype.EDTTypePackage#getFixedArray_MaxNumber()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrPositiveIntegerValue"
	 *        required="true"
	 * @generated
	 */
	String getMaxNumber();

	/**
	 * Sets the value of the '{@link edttype.FixedArray#getMaxNumber <em>Max Number</em>}' attribute.
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
	 * @see edttype.EDTTypePackage#getFixedArray_ItemType()
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
	 * Sets the value of the '{@link edttype.FixedArray#getItemType <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' reference.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>Max Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Type</em>' reference.
	 * @see #setMaxNumberType(Constant)
	 * @see edttype.EDTTypePackage#getFixedArray_MaxNumberType()
	 * @model
	 * @generated
	 */
	Constant getMaxNumberType();

	/**
	 * Sets the value of the '{@link edttype.FixedArray#getMaxNumberType <em>Max Number Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Type</em>' reference.
	 * @see #getMaxNumberType()
	 * @generated
	 */
	void setMaxNumberType(Constant value);


} // FixedArray
