/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.PlatformMessages#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getPlatformMessages()
 * @model extendedMetaData="name='PlatformMessages' kind='empty'"
 * @generated
 */
public interface PlatformMessages extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapped On Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the inter-platforms link
	 *           on which the platform-level management messages
	 *           are mapped. The link is defined in
	 *           the logical system.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped On Link Id</em>' attribute.
	 * @see #setMappedOnLinkId(String)
	 * @see technology.ecoa.deployment._2.depPackage#getPlatformMessages_MappedOnLinkId()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='mappedOnLinkId'"
	 * @generated
	 */
	String getMappedOnLinkId();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.PlatformMessages#getMappedOnLinkId <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped On Link Id</em>' attribute.
	 * @see #getMappedOnLinkId()
	 * @generated
	 */
	void setMappedOnLinkId(String value);

} // PlatformMessages
