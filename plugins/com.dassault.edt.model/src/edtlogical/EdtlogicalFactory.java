/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edtlogical.EdtlogicalPackage
 * @generated
 */
public interface EdtlogicalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtlogicalFactory eINSTANCE = edtlogical.impl.EdtlogicalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logical System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical System</em>'.
	 * @generated
	 */
	LogicalSystem createLogicalSystem();

	/**
	 * Returns a new object of class '<em>Logical Computing Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Computing Platform</em>'.
	 * @generated
	 */
	LogicalComputingPlatform createLogicalComputingPlatform();

	/**
	 * Returns a new object of class '<em>Logical Computing Platform Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Computing Platform Link</em>'.
	 * @generated
	 */
	LogicalComputingPlatformLink createLogicalComputingPlatformLink();

	/**
	 * Returns a new object of class '<em>Logical Computing Node Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Computing Node Link</em>'.
	 * @generated
	 */
	LogicalComputingNodeLink createLogicalComputingNodeLink();

	/**
	 * Returns a new object of class '<em>Logical Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Computing Node</em>'.
	 * @generated
	 */
	LogicalComputingNode createLogicalComputingNode();

	/**
	 * Returns a new object of class '<em>Logical Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Processor</em>'.
	 * @generated
	 */
	LogicalProcessor createLogicalProcessor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdtlogicalPackage getEdtlogicalPackage();

} //EdtlogicalFactory
