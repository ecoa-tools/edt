/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Array
 * Predefined</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edttype.ArrayPredefined#getMaxNumber <em>Max Number</em>}</li>
 * <li>{@link edttype.ArrayPredefined#getItemType <em>Item Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getArrayPredefined()
 * @model
 * @generated
 */
public interface ArrayPredefined extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(String)
	 * @see edttype.EDTTypePackage#getArrayPredefined_MaxNumber()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrPositiveIntegerValue"
	 *        required="true"
	 * @generated
	 */
	String getMaxNumber();

	/**
	 * Sets the value of the '{@link edttype.ArrayPredefined#getMaxNumber <em>Max
	 * Number</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * @see edttype.EDTTypePackage#getArrayPredefined_ItemType()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getItemType();

	/**
	 * Sets the value of the '{@link edttype.ArrayPredefined#getItemType <em>Item
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Item Type</em>' reference.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(EDTDataType value);

} // ArrayPredefined
