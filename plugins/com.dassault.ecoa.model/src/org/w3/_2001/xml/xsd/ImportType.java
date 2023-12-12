/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.xsd.ImportType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.ImportType#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.xsd.SchemaPackage#getImportType()
 * @model extendedMetaData="name='import_._type' kind='elementOnly'"
 * @generated
 */
public interface ImportType extends Annotated {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getImportType_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.ImportType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getImportType_SchemaLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='schemaLocation'"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.ImportType#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

} // ImportType
