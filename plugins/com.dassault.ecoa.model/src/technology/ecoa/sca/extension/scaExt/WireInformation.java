/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any additional wire information parameters required
 *         by the system integrator (non-defined by ECOA) e.g.
 *         CIA (Confidentiality, Integrity and Availability)
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.WireInformation#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getWireInformation()
 * @model extendedMetaData="name='wireInformation' kind='empty'"
 * @generated
 */
public interface WireInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to any external file containing parameters
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getWireInformation_Link()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='link'"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.WireInformation#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // WireInformation
