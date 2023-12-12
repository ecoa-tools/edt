/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see edtuid.EdtuidFactory
 * @model kind="package"
 * @generated
 */
public interface EdtuidPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "edtuid";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "edtuid";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "edtuid";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EdtuidPackage eINSTANCE = edtuid.impl.EdtuidPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtuid.impl.IDMapImpl <em>ID Map</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see edtuid.impl.IDMapImpl
	 * @see edtuid.impl.EdtuidPackageImpl#getIDMap()
	 * @generated
	 */
	int ID_MAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_MAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>IDs</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_MAP__IDS = 1;

	/**
	 * The number of structural features of the '<em>ID Map</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ID Map</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtuid.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see edtuid.impl.IDImpl
	 * @see edtuid.impl.EdtuidPackageImpl#getID()
	 * @generated
	 */
	int ID = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Service Link</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID__SERVICE_LINK = 2;

	/**
	 * The number of structural features of the '<em>ID</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ID</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edtuid.IDMap <em>ID Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ID Map</em>'.
	 * @see edtuid.IDMap
	 * @generated
	 */
	EClass getIDMap();

	/**
	 * Returns the meta object for the attribute '{@link edtuid.IDMap#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtuid.IDMap#getName()
	 * @see #getIDMap()
	 * @generated
	 */
	EAttribute getIDMap_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edtuid.IDMap#getIDs <em>IDs</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>IDs</em>'.
	 * @see edtuid.IDMap#getIDs()
	 * @see #getIDMap()
	 * @generated
	 */
	EReference getIDMap_IDs();

	/**
	 * Returns the meta object for class '{@link edtuid.ID <em>ID</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ID</em>'.
	 * @see edtuid.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for the attribute '{@link edtuid.ID#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edtuid.ID#getValue()
	 * @see #getID()
	 * @generated
	 */
	EAttribute getID_Value();

	/**
	 * Returns the meta object for the reference '{@link edtuid.ID#getOperation
	 * <em>Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edtuid.ID#getOperation()
	 * @see #getID()
	 * @generated
	 */
	EReference getID_Operation();

	/**
	 * Returns the meta object for the reference '{@link edtuid.ID#getServiceLink
	 * <em>Service Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Service Link</em>'.
	 * @see edtuid.ID#getServiceLink()
	 * @see #getID()
	 * @generated
	 */
	EReference getID_ServiceLink();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtuidFactory getEdtuidFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edtuid.impl.IDMapImpl <em>ID
		 * Map</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see edtuid.impl.IDMapImpl
		 * @see edtuid.impl.EdtuidPackageImpl#getIDMap()
		 * @generated
		 */
		EClass ID_MAP = eINSTANCE.getIDMap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ID_MAP__NAME = eINSTANCE.getIDMap_Name();

		/**
		 * The meta object literal for the '<em><b>IDs</b></em>' containment reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ID_MAP__IDS = eINSTANCE.getIDMap_IDs();

		/**
		 * The meta object literal for the '{@link edtuid.impl.IDImpl <em>ID</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see edtuid.impl.IDImpl
		 * @see edtuid.impl.EdtuidPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ID__VALUE = eINSTANCE.getID_Value();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ID__OPERATION = eINSTANCE.getID_Operation();

		/**
		 * The meta object literal for the '<em><b>Service Link</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ID__SERVICE_LINK = eINSTANCE.getID_ServiceLink();

	}

} // EdtuidPackage
