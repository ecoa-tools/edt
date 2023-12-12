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
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variable-size (bounded capacity) array
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.Array#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Array#getItemType <em>Item Type</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Array#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Array#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getArray()
 * @model extendedMetaData="name='Array' kind='empty'"
 * @generated
 */
public interface Array extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see technology.ecoa.types._2.typPackage#getArray_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Array#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(String)
	 * @see technology.ecoa.types._2.typPackage#getArray_ItemType()
	 * @model dataType="technology.ecoa.types._2.TypeQName" required="true"
	 *        extendedMetaData="kind='attribute' name='itemType'"
	 * @generated
	 */
	String getItemType();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Array#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(String value);

	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(String)
	 * @see technology.ecoa.types._2.typPackage#getArray_MaxNumber()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrPositiveIntegerValue" required="true"
	 *        extendedMetaData="kind='attribute' name='maxNumber'"
	 * @generated
	 */
	String getMaxNumber();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Array#getMaxNumber <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number</em>' attribute.
	 * @see #getMaxNumber()
	 * @generated
	 */
	void setMaxNumber(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.types._2.typPackage#getArray_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Array#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Array
