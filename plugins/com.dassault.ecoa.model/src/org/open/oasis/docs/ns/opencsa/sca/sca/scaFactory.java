/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage
 * @generated
 */
public interface scaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scaFactory eINSTANCE = org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Common Extension Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Extension Base</em>'.
	 * @generated
	 */
	CommonExtensionBase createCommonExtensionBase();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Reference</em>'.
	 * @generated
	 */
	ComponentReference createComponentReference();

	/**
	 * Returns a new object of class '<em>Component Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Service</em>'.
	 * @generated
	 */
	ComponentService createComponentService();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Component Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Reference</em>'.
	 * @generated
	 */
	ComponentTypeReference createComponentTypeReference();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

	/**
	 * Returns a new object of class '<em>Contribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contribution Type</em>'.
	 * @generated
	 */
	ContributionType createContributionType();

	/**
	 * Returns a new object of class '<em>Deployable Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployable Type</em>'.
	 * @generated
	 */
	DeployableType createDeployableType();

	/**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extensions Type</em>'.
	 * @generated
	 */
	ExtensionsType createExtensionsType();

	/**
	 * Returns a new object of class '<em>Implementation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Type</em>'.
	 * @generated
	 */
	ImplementationType createImplementationType();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	PropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>SCA Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCA Implementation</em>'.
	 * @generated
	 */
	SCAImplementation createSCAImplementation();

	/**
	 * Returns a new object of class '<em>SCA Property Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCA Property Base</em>'.
	 * @generated
	 */
	SCAPropertyBase createSCAPropertyBase();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Type</em>'.
	 * @generated
	 */
	ServiceType createServiceType();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns a new object of class '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire</em>'.
	 * @generated
	 */
	Wire createWire();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	scaPackage getscaPackage();

} //scaFactory
