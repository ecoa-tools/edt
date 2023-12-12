/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A possible value of an enumerated type
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.EnumValue#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.EnumValue#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.EnumValue#getValnum <em>Valnum</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getEnumValue()
 * @model extendedMetaData="name='EnumValue' kind='empty'"
 * @generated
 */
public interface EnumValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see technology.ecoa.types._2.typPackage#getEnumValue_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.EnumValue#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.types._2.typPackage#getEnumValue_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.EnumValue#getName <em>Name</em>}' attribute.
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
	 * @see technology.ecoa.types._2.typPackage#getEnumValue_Valnum()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrIntegerValue"
	 *        extendedMetaData="kind='attribute' name='valnum'"
	 * @generated
	 */
	String getValnum();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.EnumValue#getValnum <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valnum</em>' attribute.
	 * @see #getValnum()
	 * @generated
	 */
	void setValnum(String value);

} // EnumValue
