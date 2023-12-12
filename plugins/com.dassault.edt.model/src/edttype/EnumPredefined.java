/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package edttype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.EnumPredefined#getValue <em>Value</em>}</li>
 *   <li>{@link edttype.EnumPredefined#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getEnumPredefined()
 * @model
 * @generated
 */
public interface EnumPredefined extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.EnumValuePredefined}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getEnumPredefined_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumValuePredefined> getValue();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getEnumPredefined_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edttype.EnumPredefined#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

} // EnumPredefined
