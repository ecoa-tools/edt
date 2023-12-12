/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *           memberTypes attribute must be non-empty or there must be
 *           at least one simpleType child
 *         
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.xsd.UnionType#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.UnionType#getMemberTypes <em>Member Types</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.xsd.SchemaPackage#getUnionType()
 * @model extendedMetaData="name='union_._type' kind='elementOnly'"
 * @generated
 */
public interface UnionType extends Annotated {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.LocalSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getUnionType_SimpleType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simpleType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalSimpleType> getSimpleType();

	/**
	 * Returns the value of the '<em><b>Member Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Types</em>' attribute.
	 * @see #setMemberTypes(List)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getUnionType_MemberTypes()
	 * @model dataType="org.w3._2001.xml.xsd.MemberTypesType" many="false"
	 *        extendedMetaData="kind='attribute' name='memberTypes'"
	 * @generated
	 */
	List<QName> getMemberTypes();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.UnionType#getMemberTypes <em>Member Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Types</em>' attribute.
	 * @see #getMemberTypes()
	 * @generated
	 */
	void setMemberTypes(List<QName> value);

} // UnionType
