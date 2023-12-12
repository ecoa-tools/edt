/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin;

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
 * @see edtbin.EdtbinFactory
 * @model kind="package"
 * @generated
 */
public interface EdtbinPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "edtbin";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "edtbin";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "edtbin";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EdtbinPackage eINSTANCE = edtbin.impl.EdtbinPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtbin.impl.BinaryModuleImpl <em>Binary
	 * Module</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see edtbin.impl.BinaryModuleImpl
	 * @see edtbin.impl.EdtbinPackageImpl#getBinaryModule()
	 * @generated
	 */
	int BINARY_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Binary Dependencies</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__BINARY_DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__CHECKSUM = 1;

	/**
	 * The feature id for the '<em><b>Heap Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__HEAP_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Stack Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__STACK_SIZE = 4;

	/**
	 * The feature id for the '<em><b>User Context Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__USER_CONTEXT_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Warm Start Context Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__WARM_START_CONTEXT_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Binary Module</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Binary Module</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtbin.impl.BinDescImpl <em>Bin
	 * Desc</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see edtbin.impl.BinDescImpl
	 * @see edtbin.impl.EdtbinPackageImpl#getBinDesc()
	 * @generated
	 */
	int BIN_DESC = 1;

	/**
	 * The feature id for the '<em><b>Binary Modules</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__BINARY_MODULES = 0;

	/**
	 * The feature id for the '<em><b>Insertion Policy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__INSERTION_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Processor Target Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__PROCESSOR_TARGET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Bin Desc</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bin Desc</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIN_DESC_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edtbin.BinaryModule <em>Binary
	 * Module</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Binary Module</em>'.
	 * @see edtbin.BinaryModule
	 * @generated
	 */
	EClass getBinaryModule();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edtbin.BinaryModule#getBinaryDependencies <em>Binary
	 * Dependencies</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Binary
	 *         Dependencies</em>'.
	 * @see edtbin.BinaryModule#getBinaryDependencies()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EReference getBinaryModule_BinaryDependencies();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getChecksum <em>Checksum</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see edtbin.BinaryModule#getChecksum()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_Checksum();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getHeapSize <em>Heap Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Heap Size</em>'.
	 * @see edtbin.BinaryModule#getHeapSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_HeapSize();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getObject <em>Object</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see edtbin.BinaryModule#getObject()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_Object();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getStackSize <em>Stack Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stack Size</em>'.
	 * @see edtbin.BinaryModule#getStackSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_StackSize();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getUserContextSize <em>User Context Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>User Context Size</em>'.
	 * @see edtbin.BinaryModule#getUserContextSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_UserContextSize();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinaryModule#getWarmStartContextSize <em>Warm Start Context
	 * Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Warm Start Context Size</em>'.
	 * @see edtbin.BinaryModule#getWarmStartContextSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_WarmStartContextSize();

	/**
	 * Returns the meta object for the reference
	 * '{@link edtbin.BinaryModule#getReference <em>Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see edtbin.BinaryModule#getReference()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EReference getBinaryModule_Reference();

	/**
	 * Returns the meta object for class '{@link edtbin.BinDesc <em>Bin Desc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bin Desc</em>'.
	 * @see edtbin.BinDesc
	 * @generated
	 */
	EClass getBinDesc();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edtbin.BinDesc#getBinaryModules <em>Binary Modules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Binary
	 *         Modules</em>'.
	 * @see edtbin.BinDesc#getBinaryModules()
	 * @see #getBinDesc()
	 * @generated
	 */
	EReference getBinDesc_BinaryModules();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinDesc#getInsertionPolicy <em>Insertion Policy</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Insertion Policy</em>'.
	 * @see edtbin.BinDesc#getInsertionPolicy()
	 * @see #getBinDesc()
	 * @generated
	 */
	EAttribute getBinDesc_InsertionPolicy();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtbin.BinDesc#getProcessorTargetType <em>Processor Target
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Processor Target Type</em>'.
	 * @see edtbin.BinDesc#getProcessorTargetType()
	 * @see #getBinDesc()
	 * @generated
	 */
	EAttribute getBinDesc_ProcessorTargetType();

	/**
	 * Returns the meta object for the attribute '{@link edtbin.BinDesc#getFileName
	 * <em>File Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see edtbin.BinDesc#getFileName()
	 * @see #getBinDesc()
	 * @generated
	 */
	EAttribute getBinDesc_FileName();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtbinFactory getEdtbinFactory();

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
		 * The meta object literal for the '{@link edtbin.impl.BinaryModuleImpl
		 * <em>Binary Module</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see edtbin.impl.BinaryModuleImpl
		 * @see edtbin.impl.EdtbinPackageImpl#getBinaryModule()
		 * @generated
		 */
		EClass BINARY_MODULE = eINSTANCE.getBinaryModule();

		/**
		 * The meta object literal for the '<em><b>Binary Dependencies</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference BINARY_MODULE__BINARY_DEPENDENCIES = eINSTANCE.getBinaryModule_BinaryDependencies();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__CHECKSUM = eINSTANCE.getBinaryModule_Checksum();

		/**
		 * The meta object literal for the '<em><b>Heap Size</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__HEAP_SIZE = eINSTANCE.getBinaryModule_HeapSize();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__OBJECT = eINSTANCE.getBinaryModule_Object();

		/**
		 * The meta object literal for the '<em><b>Stack Size</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__STACK_SIZE = eINSTANCE.getBinaryModule_StackSize();

		/**
		 * The meta object literal for the '<em><b>User Context Size</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__USER_CONTEXT_SIZE = eINSTANCE.getBinaryModule_UserContextSize();

		/**
		 * The meta object literal for the '<em><b>Warm Start Context Size</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BINARY_MODULE__WARM_START_CONTEXT_SIZE = eINSTANCE.getBinaryModule_WarmStartContextSize();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BINARY_MODULE__REFERENCE = eINSTANCE.getBinaryModule_Reference();

		/**
		 * The meta object literal for the '{@link edtbin.impl.BinDescImpl <em>Bin
		 * Desc</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see edtbin.impl.BinDescImpl
		 * @see edtbin.impl.EdtbinPackageImpl#getBinDesc()
		 * @generated
		 */
		EClass BIN_DESC = eINSTANCE.getBinDesc();

		/**
		 * The meta object literal for the '<em><b>Binary Modules</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BIN_DESC__BINARY_MODULES = eINSTANCE.getBinDesc_BinaryModules();

		/**
		 * The meta object literal for the '<em><b>Insertion Policy</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BIN_DESC__INSERTION_POLICY = eINSTANCE.getBinDesc_InsertionPolicy();

		/**
		 * The meta object literal for the '<em><b>Processor Target Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BIN_DESC__PROCESSOR_TARGET_TYPE = eINSTANCE.getBinDesc_ProcessorTargetType();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BIN_DESC__FILE_NAME = eINSTANCE.getBinDesc_FileName();

	}

} // EdtbinPackage
