/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package edttype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.EnumValuePredefined#getName <em>Name</em>}</li>
 *   <li>{@link edttype.EnumValuePredefined#getValnum <em>Valnum</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getEnumValuePredefined()
 * @model
 * @generated
 */
public interface EnumValuePredefined extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edttype.EDTTypePackage#getEnumValuePredefined_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edttype.EnumValuePredefined#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valnum</em>' attribute.
	 * @see #setValnum(String)
	 * @see edttype.EDTTypePackage#getEnumValuePredefined_Valnum()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrIntegerValue"
	 * @generated
	 */
	String getValnum();

	/**
	 * Sets the value of the '{@link edttype.EnumValuePredefined#getValnum <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valnum</em>' attribute.
	 * @see #getValnum()
	 * @generated
	 */
	void setValnum(String value);

} // EnumValuePredefined
