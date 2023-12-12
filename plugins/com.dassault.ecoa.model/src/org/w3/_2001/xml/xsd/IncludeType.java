/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.xsd.IncludeType#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.xsd.SchemaPackage#getIncludeType()
 * @model extendedMetaData="name='include_._type' kind='elementOnly'"
 * @generated
 */
public interface IncludeType extends Annotated {
	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getIncludeType_SchemaLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='schemaLocation'"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.IncludeType#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

} // IncludeType
