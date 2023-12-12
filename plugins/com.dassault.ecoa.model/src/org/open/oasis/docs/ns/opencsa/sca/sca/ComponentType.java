/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getService <em>Service</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentType()
 * @model extendedMetaData="name='ComponentType' kind='elementOnly'"
 * @generated
 */
public interface ComponentType extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentType_Service()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ServiceType> getService();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentType_Reference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ComponentTypeReference> getReference();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Property> getProperty();

} // ComponentType
