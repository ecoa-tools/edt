/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Constant</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Constant#getValue <em>Value</em>}</li>
 *   <li>{@link edttype.Constant#getType <em>Type</em>}</li>
 *   <li>{@link edttype.Constant#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see edttype.EDTTypePackage#getConstant_Value()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 *        required="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link edttype.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getConstant_Type()
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
	 * Sets the value of the '{@link edttype.Constant#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(Constant)
	 * @see edttype.EDTTypePackage#getConstant_ValueType()
	 * @model
	 * @generated
	 */
	Constant getValueType();

	/**
	 * Sets the value of the '{@link edttype.Constant#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(Constant value);


} // Constant
