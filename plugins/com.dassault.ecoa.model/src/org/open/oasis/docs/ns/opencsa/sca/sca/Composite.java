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
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getService <em>Service</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getComponent <em>Component</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getWire <em>Wire</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite()
 * @model extendedMetaData="name='Composite' kind='elementOnly'"
 * @generated
 */
public interface Composite extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Service()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Component()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Reference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Wire()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wire' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Wire> getWire();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComposite_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // Composite
