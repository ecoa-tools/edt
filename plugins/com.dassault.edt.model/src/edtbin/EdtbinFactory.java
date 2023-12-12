/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see edtbin.EdtbinPackage
 * @generated
 */
public interface EdtbinFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EdtbinFactory eINSTANCE = edtbin.impl.EdtbinFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binary Module</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Binary Module</em>'.
	 * @generated
	 */
	BinaryModule createBinaryModule();

	/**
	 * Returns a new object of class '<em>Bin Desc</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bin Desc</em>'.
	 * @generated
	 */
	BinDesc createBinDesc();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdtbinPackage getEdtbinPackage();

} // EdtbinFactory
