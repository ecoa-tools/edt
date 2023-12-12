/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtudp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edtudp.EdtudpFactory
 * @model kind="package"
 * @generated
 */
public interface EdtudpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtudp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edtudp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edtudp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtudpPackage eINSTANCE = edtudp.impl.EdtudpPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtudp.impl.UDPBindingImpl <em>UDP Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtudp.impl.UDPBindingImpl
	 * @see edtudp.impl.EdtudpPackageImpl#getUDPBinding()
	 * @generated
	 */
	int UDP_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING__PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>UDP Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UDP Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edtudp.UDPBinding <em>UDP Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Binding</em>'.
	 * @see edtudp.UDPBinding
	 * @generated
	 */
	EClass getUDPBinding();

	/**
	 * Returns the meta object for the attribute '{@link edtudp.UDPBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtudp.UDPBinding#getName()
	 * @see #getUDPBinding()
	 * @generated
	 */
	EAttribute getUDPBinding_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edtudp.UDPBinding#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform</em>'.
	 * @see edtudp.UDPBinding#getPlatform()
	 * @see #getUDPBinding()
	 * @generated
	 */
	EReference getUDPBinding_Platform();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtudpFactory getEdtudpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edtudp.impl.UDPBindingImpl <em>UDP Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtudp.impl.UDPBindingImpl
		 * @see edtudp.impl.EdtudpPackageImpl#getUDPBinding()
		 * @generated
		 */
		EClass UDP_BINDING = eINSTANCE.getUDPBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_BINDING__NAME = eINSTANCE.getUDPBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDP_BINDING__PLATFORM = eINSTANCE.getUDPBinding_Platform();

	}

} //EdtudpPackage
