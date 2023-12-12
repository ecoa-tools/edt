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
 * A representation of the model object '<em><b>Variant Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record with variable parts: each "union"
 *         exists only if the selector has the value given by the "when"
 *         attribute.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getField <em>Field</em>}</li>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getUnion <em>Union</em>}</li>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getSelectName <em>Select Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.VariantRecord#getSelectType <em>Select Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getVariantRecord()
 * @model extendedMetaData="name='VariantRecord' kind='elementOnly'"
 * @generated
 */
public interface VariantRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_Field()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Union}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_Union()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='union' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Union> getUnion();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.VariantRecord#getComment <em>Comment</em>}' attribute.
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
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.VariantRecord#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Select Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Name</em>' attribute.
	 * @see #setSelectName(String)
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_SelectName()
	 * @model dataType="technology.ecoa.types._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='selectName'"
	 * @generated
	 */
	String getSelectName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.VariantRecord#getSelectName <em>Select Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Name</em>' attribute.
	 * @see #getSelectName()
	 * @generated
	 */
	void setSelectName(String value);

	/**
	 * Returns the value of the '<em><b>Select Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Type</em>' attribute.
	 * @see #setSelectType(String)
	 * @see technology.ecoa.types._2.typPackage#getVariantRecord_SelectType()
	 * @model dataType="technology.ecoa.types._2.TypeQName" required="true"
	 *        extendedMetaData="kind='attribute' name='selectType'"
	 * @generated
	 */
	String getSelectType();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.VariantRecord#getSelectType <em>Select Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Type</em>' attribute.
	 * @see #getSelectType()
	 * @generated
	 */
	void setSelectType(String value);

} // VariantRecord
