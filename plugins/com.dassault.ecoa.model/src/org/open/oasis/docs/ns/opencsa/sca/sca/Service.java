/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Service#getPromote <em>Promote</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getService()
 * @model extendedMetaData="name='Service' kind='elementOnly'"
 * @generated
 */
public interface Service extends Contract {
	/**
	 * Returns the value of the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' attribute.
	 * @see #setPromote(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getService_Promote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='promote'"
	 * @generated
	 */
	String getPromote();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Service#getPromote <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' attribute.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(String value);

} // Service
