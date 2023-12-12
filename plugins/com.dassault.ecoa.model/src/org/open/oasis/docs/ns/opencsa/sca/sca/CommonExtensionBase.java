/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Extension Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getCommonExtensionBase()
 * @model extendedMetaData="name='CommonExtensionBase' kind='elementOnly'"
 * @generated
 */
public interface CommonExtensionBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getCommonExtensionBase_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

} // CommonExtensionBase
