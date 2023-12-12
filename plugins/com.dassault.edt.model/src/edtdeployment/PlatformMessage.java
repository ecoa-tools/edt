/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import edtlogical.LogicalComputingPlatformLink;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.PlatformMessage#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getPlatformMessage()
 * @model
 * @generated
 */
public interface PlatformMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapped On Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped On Link Id</em>' reference.
	 * @see #setMappedOnLinkId(LogicalComputingPlatformLink)
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformMessage_MappedOnLinkId()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatformLink getMappedOnLinkId();

	/**
	 * Sets the value of the '{@link edtdeployment.PlatformMessage#getMappedOnLinkId <em>Mapped On Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped On Link Id</em>' reference.
	 * @see #getMappedOnLinkId()
	 * @generated
	 */
	void setMappedOnLinkId(LogicalComputingPlatformLink value);

} // PlatformMessage
