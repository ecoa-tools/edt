/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Variant
 * Record</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.VariantRecord#getField <em>Field</em>}</li>
 *   <li>{@link edttype.VariantRecord#getUnion <em>Union</em>}</li>
 *   <li>{@link edttype.VariantRecord#getSelectName <em>Select Name</em>}</li>
 *   <li>{@link edttype.VariantRecord#getSelectType <em>Select Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getVariantRecord()
 * @model
 * @generated
 */
public interface VariantRecord extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getVariantRecord_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.Union}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getVariantRecord_Union()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Union> getUnion();

	/**
	 * Returns the value of the '<em><b>Select Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Select Name</em>' attribute.
	 * @see #setSelectName(String)
	 * @see edttype.EDTTypePackage#getVariantRecord_SelectName()
	 * @model dataType="technology.ecoa.types._2.NameId" required="true"
	 * @generated
	 */
	String getSelectName();

	/**
	 * Sets the value of the '{@link edttype.VariantRecord#getSelectName <em>Select Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Name</em>' attribute.
	 * @see #getSelectName()
	 * @generated
	 */
	void setSelectName(String value);

	/**
	 * Returns the value of the '<em><b>Select Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Select Type</em>' reference.
	 * @see #setSelectType(EDTDataType)
	 * @see edttype.EDTTypePackage#getVariantRecord_SelectType()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getSelectType();

	/**
	 * Sets the value of the '{@link edttype.VariantRecord#getSelectType <em>Select Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Type</em>' reference.
	 * @see #getSelectType()
	 * @generated
	 */
	void setSelectType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>BasicType</b></em>' derived reference. <!--
	 * begin-user-doc --> return null for easier verification <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>BasicType</em>' reference.
	 * @generated NOT
	 */
	BasicType getBasicType();

} // VariantRecord
