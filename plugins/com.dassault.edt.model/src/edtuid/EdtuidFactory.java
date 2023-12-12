/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see edtuid.EdtuidPackage
 * @generated
 */
public interface EdtuidFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EdtuidFactory eINSTANCE = edtuid.impl.EdtuidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ID Map</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>ID Map</em>'.
	 * @generated
	 */
	IDMap createIDMap();

	/**
	 * Returns a new object of class '<em>ID</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>ID</em>'.
	 * @generated
	 */
	ID createID();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdtuidPackage getEdtuidPackage();

} // EdtuidFactory
