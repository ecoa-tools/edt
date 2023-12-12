/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

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
 * @see temp.TempFactory
 * @model kind="package"
 * @generated
 */
public interface TempPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "temp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "temp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "temp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TempPackage eINSTANCE = temp.impl.TempPackageImpl.init();

	/**
	 * The meta object id for the '{@link temp.impl.ModuleBehaviourImpl <em>Module Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see temp.impl.ModuleBehaviourImpl
	 * @see temp.impl.TempPackageImpl#getModuleBehaviour()
	 * @generated
	 */
	int MODULE_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR__MODULE_BEHAVIOUR = 1;

	/**
	 * The number of structural features of the '<em>Module Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link temp.impl.InsertionPoliciesImpl <em>Insertion Policies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see temp.impl.InsertionPoliciesImpl
	 * @see temp.impl.TempPackageImpl#getInsertionPolicies()
	 * @generated
	 */
	int INSERTION_POLICIES = 1;

	/**
	 * The feature id for the '<em><b>Insertion Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICIES__INSERTION_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICIES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Insertion Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Insertion Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICIES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link temp.impl.CrossPlatformViewImpl <em>Cross Platform View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see temp.impl.CrossPlatformViewImpl
	 * @see temp.impl.TempPackageImpl#getCrossPlatformView()
	 * @generated
	 */
	int CROSS_PLATFORM_VIEW = 2;

	/**
	 * The feature id for the '<em><b>ECOA Cross Platform View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_PLATFORM_VIEW__NAME = 1;

	/**
	 * The number of structural features of the '<em>Cross Platform View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_PLATFORM_VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cross Platform View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_PLATFORM_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link temp.impl.EUIDImpl <em>EUID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see temp.impl.EUIDImpl
	 * @see temp.impl.TempPackageImpl#getEUID()
	 * @generated
	 */
	int EUID = 3;

	/**
	 * The feature id for the '<em><b>UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUID__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUID__NAME = 1;

	/**
	 * The number of structural features of the '<em>EUID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EUID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUID_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link temp.ModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Behaviour</em>'.
	 * @see temp.ModuleBehaviour
	 * @generated
	 */
	EClass getModuleBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link temp.ModuleBehaviour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see temp.ModuleBehaviour#getName()
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	EAttribute getModuleBehaviour_Name();

	/**
	 * Returns the meta object for the containment reference '{@link temp.ModuleBehaviour#getModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Behaviour</em>'.
	 * @see temp.ModuleBehaviour#getModuleBehaviour()
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	EReference getModuleBehaviour_ModuleBehaviour();

	/**
	 * Returns the meta object for class '{@link temp.InsertionPolicies <em>Insertion Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Policies</em>'.
	 * @see temp.InsertionPolicies
	 * @generated
	 */
	EClass getInsertionPolicies();

	/**
	 * Returns the meta object for the attribute '{@link temp.InsertionPolicies#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see temp.InsertionPolicies#getName()
	 * @see #getInsertionPolicies()
	 * @generated
	 */
	EAttribute getInsertionPolicies_Name();

	/**
	 * Returns the meta object for class '{@link temp.CrossPlatformView <em>Cross Platform View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Platform View</em>'.
	 * @see temp.CrossPlatformView
	 * @generated
	 */
	EClass getCrossPlatformView();

	/**
	 * Returns the meta object for the containment reference '{@link temp.CrossPlatformView#getECOACrossPlatformView <em>ECOA Cross Platform View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECOA Cross Platform View</em>'.
	 * @see temp.CrossPlatformView#getECOACrossPlatformView()
	 * @see #getCrossPlatformView()
	 * @generated
	 */
	EReference getCrossPlatformView_ECOACrossPlatformView();

	/**
	 * Returns the meta object for the attribute '{@link temp.CrossPlatformView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see temp.CrossPlatformView#getName()
	 * @see #getCrossPlatformView()
	 * @generated
	 */
	EAttribute getCrossPlatformView_Name();

	/**
	 * Returns the meta object for class '{@link temp.EUID <em>EUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EUID</em>'.
	 * @see temp.EUID
	 * @generated
	 */
	EClass getEUID();

	/**
	 * Returns the meta object for the containment reference '{@link temp.EUID#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UID</em>'.
	 * @see temp.EUID#getUID()
	 * @see #getEUID()
	 * @generated
	 */
	EReference getEUID_UID();

	/**
	 * Returns the meta object for the attribute '{@link temp.EUID#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see temp.EUID#getName()
	 * @see #getEUID()
	 * @generated
	 */
	EAttribute getEUID_Name();

	/**
	 * Returns the meta object for the containment reference '{@link temp.InsertionPolicies#getInsertionPolicy <em>Insertion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion Policy</em>'.
	 * @see temp.InsertionPolicies#getInsertionPolicy()
	 * @see #getInsertionPolicies()
	 * @generated
	 */
	EReference getInsertionPolicies_InsertionPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TempFactory getTempFactory();

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
		 * The meta object literal for the '{@link temp.impl.ModuleBehaviourImpl <em>Module Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see temp.impl.ModuleBehaviourImpl
		 * @see temp.impl.TempPackageImpl#getModuleBehaviour()
		 * @generated
		 */
		EClass MODULE_BEHAVIOUR = eINSTANCE.getModuleBehaviour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_BEHAVIOUR__NAME = eINSTANCE.getModuleBehaviour_Name();

		/**
		 * The meta object literal for the '<em><b>Module Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_BEHAVIOUR__MODULE_BEHAVIOUR = eINSTANCE.getModuleBehaviour_ModuleBehaviour();

		/**
		 * The meta object literal for the '{@link temp.impl.InsertionPoliciesImpl <em>Insertion Policies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see temp.impl.InsertionPoliciesImpl
		 * @see temp.impl.TempPackageImpl#getInsertionPolicies()
		 * @generated
		 */
		EClass INSERTION_POLICIES = eINSTANCE.getInsertionPolicies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_POLICIES__NAME = eINSTANCE.getInsertionPolicies_Name();

		/**
		 * The meta object literal for the '{@link temp.impl.CrossPlatformViewImpl <em>Cross Platform View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see temp.impl.CrossPlatformViewImpl
		 * @see temp.impl.TempPackageImpl#getCrossPlatformView()
		 * @generated
		 */
		EClass CROSS_PLATFORM_VIEW = eINSTANCE.getCrossPlatformView();

		/**
		 * The meta object literal for the '<em><b>ECOA Cross Platform View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW = eINSTANCE.getCrossPlatformView_ECOACrossPlatformView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_PLATFORM_VIEW__NAME = eINSTANCE.getCrossPlatformView_Name();

		/**
		 * The meta object literal for the '{@link temp.impl.EUIDImpl <em>EUID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see temp.impl.EUIDImpl
		 * @see temp.impl.TempPackageImpl#getEUID()
		 * @generated
		 */
		EClass EUID = eINSTANCE.getEUID();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUID__UID = eINSTANCE.getEUID_UID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUID__NAME = eINSTANCE.getEUID_Name();

		/**
		 * The meta object literal for the '<em><b>Insertion Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICIES__INSERTION_POLICY = eINSTANCE.getInsertionPolicies_InsertionPolicy();

	}

} //TempPackage
