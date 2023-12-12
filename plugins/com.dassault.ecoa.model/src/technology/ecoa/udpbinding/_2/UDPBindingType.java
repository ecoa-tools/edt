/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.udpbinding._2.UDPBindingType#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.udpbinding._2.udpPackage#getUDPBindingType()
 * @model extendedMetaData="name='UDPBinding_._type' kind='elementOnly'"
 * @generated
 */
public interface UDPBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.udpbinding._2.PlatformType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference list.
	 * @see technology.ecoa.udpbinding._2.udpPackage#getUDPBindingType_Platform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='platform' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlatformType> getPlatform();

} // UDPBindingType
