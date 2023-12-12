/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtudp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.udpbinding._2.PlatformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtudp.UDPBinding#getName <em>Name</em>}</li>
 *   <li>{@link edtudp.UDPBinding#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @see edtudp.EdtudpPackage#getUDPBinding()
 * @model
 * @generated
 */
public interface UDPBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtudp.EdtudpPackage#getUDPBinding_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtudp.UDPBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.udpbinding._2.PlatformType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference list.
	 * @see edtudp.EdtudpPackage#getUDPBinding_Platform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='platform' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlatformType> getPlatform();

} // UDPBinding
