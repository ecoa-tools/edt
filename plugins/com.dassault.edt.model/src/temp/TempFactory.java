/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see temp.TempPackage
 * @generated
 */
public interface TempFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TempFactory eINSTANCE = temp.impl.TempFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Behaviour</em>'.
	 * @generated
	 */
	ModuleBehaviour createModuleBehaviour();

	/**
	 * Returns a new object of class '<em>Insertion Policies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insertion Policies</em>'.
	 * @generated
	 */
	InsertionPolicies createInsertionPolicies();

	/**
	 * Returns a new object of class '<em>Cross Platform View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Platform View</em>'.
	 * @generated
	 */
	CrossPlatformView createCrossPlatformView();

	/**
	 * Returns a new object of class '<em>EUID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EUID</em>'.
	 * @generated
	 */
	EUID createEUID();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TempPackage getTempPackage();

} //TempFactory
