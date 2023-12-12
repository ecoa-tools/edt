/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getFile <em>File</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getPropertyValue()
 * @model extendedMetaData="name='PropertyValue' kind='mixed'"
 * @generated
 */
public interface PropertyValue extends SCAPropertyBase {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getPropertyValue_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='file'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getPropertyValue_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // PropertyValue
