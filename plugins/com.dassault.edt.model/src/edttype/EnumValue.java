/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enum
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.EnumValue#getComment <em>Comment</em>}</li>
 *   <li>{@link edttype.EnumValue#getName <em>Name</em>}</li>
 *   <li>{@link edttype.EnumValue#getValnum <em>Valnum</em>}</li>
 *   <li>{@link edttype.EnumValue#getValnumType <em>Valnum Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends EObject {

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see edttype.EDTTypePackage#getEnumValue_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link edttype.EnumValue#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edttype.EDTTypePackage#getEnumValue_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edttype.EnumValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valnum</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Valnum</em>' attribute.
	 * @see #setValnum(String)
	 * @see edttype.EDTTypePackage#getEnumValue_Valnum()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrIntegerValue"
	 * @generated
	 */
	String getValnum();

	/**
	 * Sets the value of the '{@link edttype.EnumValue#getValnum <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valnum</em>' attribute.
	 * @see #getValnum()
	 * @generated
	 */
	void setValnum(String value);

	/**
	 * Returns the value of the '<em><b>Valnum Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Valnum Type</em>' reference.
	 * @see #setValnumType(Constant)
	 * @see edttype.EDTTypePackage#getEnumValue_ValnumType()
	 * @model
	 * @generated
	 */
	Constant getValnumType();

	/**
	 * Sets the value of the '{@link edttype.EnumValue#getValnumType <em>Valnum Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valnum Type</em>' reference.
	 * @see #getValnumType()
	 * @generated
	 */
	void setValnumType(Constant value);

	/**
	 * 
	 * @return true if all the required fields are filled
	 */
	boolean isComplete();
} // EnumValue
