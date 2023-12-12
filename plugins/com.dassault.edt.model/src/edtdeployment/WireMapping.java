/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.ecore.EObject;

import edtlogical.LogicalComputingPlatformLink;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Wire
 * Mapping</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.WireMapping#getMappedOnLinkId <em>Mapped On Link
 * Id</em>}</li>
 * <li>{@link edtdeployment.WireMapping#getWire <em>Wire</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getWireMapping()
 * @model
 * @generated
 */
public interface WireMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapped On Link Id</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mapped On Link Id</em>' reference.
	 * @see #setMappedOnLinkId(LogicalComputingPlatformLink)
	 * @see edtdeployment.EdtdeploymentPackage#getWireMapping_MappedOnLinkId()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatformLink getMappedOnLinkId();

	/**
	 * Sets the value of the '{@link edtdeployment.WireMapping#getMappedOnLinkId
	 * <em>Mapped On Link Id</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Mapped On Link Id</em>' reference.
	 * @see #getMappedOnLinkId()
	 * @generated
	 */
	void setMappedOnLinkId(LogicalComputingPlatformLink value);

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Wire</em>' reference.
	 * @see #setWire(ServiceLink)
	 * @see edtdeployment.EdtdeploymentPackage#getWireMapping_Wire()
	 * @model required="true"
	 * @generated
	 */
	ServiceLink getWire();

	/**
	 * Sets the value of the '{@link edtdeployment.WireMapping#getWire
	 * <em>Wire</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Wire</em>' reference.
	 * @see #getWire()
	 * @generated
	 */
	void setWire(ServiceLink value);

} // WireMapping
