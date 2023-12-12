/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import technology.ecoa.sca.extension.scaExt.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getContract()
 * @model abstract="true"
 *        extendedMetaData="name='Contract' kind='elementOnly'"
 * @generated
 */
public interface Contract extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getContract_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interface' namespace='http://www.ecoa.technology/sca-extension-2.0'"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getContract_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Contract
