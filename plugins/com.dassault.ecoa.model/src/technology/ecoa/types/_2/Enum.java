/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enumerated type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.Enum#getValue <em>Value</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Enum#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Enum#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Enum#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getEnum()
 * @model extendedMetaData="name='Enum' kind='elementOnly'"
 * @generated
 */
public interface Enum extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getEnum_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumValue> getValue();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see technology.ecoa.types._2.typPackage#getEnum_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Enum#getComment <em>Comment</em>}' attribute.
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
	 * @see technology.ecoa.types._2.typPackage#getEnum_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Enum#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.types._2.typPackage#getEnum_Type()
	 * @model dataType="technology.ecoa.types._2.TypeQName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Enum#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Enum
