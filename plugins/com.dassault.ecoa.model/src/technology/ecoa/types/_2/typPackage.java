/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see technology.ecoa.types._2.typFactory
 * @model kind="package"
 * @generated
 */
public interface typPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/types-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	typPackage eINSTANCE = technology.ecoa.types._2.impl.typPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.ArrayImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MAX_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.ConstantImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.DataTypesImpl <em>Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.DataTypesImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__SIMPLE = 1;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__RECORD = 2;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Variant Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__VARIANT_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Fixed Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__FIXED_ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES__ENUM = 7;

	/**
	 * The number of structural features of the '<em>Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.DocumentRootImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.EnumImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.EnumValueImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Valnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALNUM = 2;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.FieldImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.FixedArrayImpl <em>Fixed Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.FixedArrayImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getFixedArray()
	 * @generated
	 */
	int FIXED_ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__MAX_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Fixed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fixed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.LibraryImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USE = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.RecordImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 9;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.SimpleImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Max Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MAX_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Min Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MIN_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__PRECISION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__UNIT = 6;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.UnionImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__WHEN = 3;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.UseTypeImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.impl.VariantRecordImpl <em>Variant Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.VariantRecordImpl
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getVariantRecord()
	 * @generated
	 */
	int VARIANT_RECORD = 13;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__UNION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__NAME = 3;

	/**
	 * The feature id for the '<em><b>Select Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__SELECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__SELECT_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Variant Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Variant Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.EBasic <em>EBasic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.EBasic
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getEBasic()
	 * @generated
	 */
	int EBASIC = 14;

	/**
	 * The meta object id for the '{@link technology.ecoa.types._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.ProgrammingLanguage
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 15;

	/**
	 * The meta object id for the '<em>Char Constant Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getCharConstantType()
	 * @generated
	 */
	int CHAR_CONSTANT_TYPE = 16;

	/**
	 * The meta object id for the '<em>Constant Reference</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReference()
	 * @generated
	 */
	int CONSTANT_REFERENCE = 17;

	/**
	 * The meta object id for the '<em>Constant Reference Or Integer Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrIntegerValue()
	 * @generated
	 */
	int CONSTANT_REFERENCE_OR_INTEGER_VALUE = 18;

	/**
	 * The meta object id for the '<em>Constant Reference Or Positive Integer Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrPositiveIntegerValue()
	 * @generated
	 */
	int CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE = 19;

	/**
	 * The meta object id for the '<em>Constant Reference Or Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrValue()
	 * @generated
	 */
	int CONSTANT_REFERENCE_OR_VALUE = 20;

	/**
	 * The meta object id for the '<em>Constant Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 21;

	/**
	 * The meta object id for the '<em>EBasic Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.EBasic
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getEBasicObject()
	 * @generated
	 */
	int EBASIC_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Hexa Char Constant Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getHexaCharConstantType()
	 * @generated
	 */
	int HEXA_CHAR_CONSTANT_TYPE = 23;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 24;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 25;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 26;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.ProgrammingLanguage
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 28;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 30;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 32;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.types._2.impl.typPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 33;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see technology.ecoa.types._2.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Array#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Array#getComment()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Array#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see technology.ecoa.types._2.Array#getItemType()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_ItemType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Array#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see technology.ecoa.types._2.Array#getMaxNumber()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Array#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Array#getName()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see technology.ecoa.types._2.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Constant#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Constant#getComment()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Constant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Constant#getName()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.types._2.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.types._2.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Types</em>'.
	 * @see technology.ecoa.types._2.DataTypes
	 * @generated
	 */
	EClass getDataTypes();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.types._2.DataTypes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getGroup()
	 * @see #getDataTypes()
	 * @generated
	 */
	EAttribute getDataTypes_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getSimple()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_Simple();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getRecord()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getConstant()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getVariantRecord <em>Variant Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant Record</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getVariantRecord()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_VariantRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getArray()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getFixedArray <em>Fixed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Array</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getFixedArray()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_FixedArray();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.DataTypes#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum</em>'.
	 * @see technology.ecoa.types._2.DataTypes#getEnum()
	 * @see #getDataTypes()
	 * @generated
	 */
	EReference getDataTypes_Enum();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.types._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.types._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.types._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.types._2.DocumentRoot#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot#getLibrary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Library();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.types._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.types._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see technology.ecoa.types._2.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.Enum#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see technology.ecoa.types._2.Enum#getValue()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Enum#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Enum#getComment()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Enum#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.types._2.Enum#getType()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see technology.ecoa.types._2.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.EnumValue#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.EnumValue#getComment()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.EnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.EnumValue#getName()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.EnumValue#getValnum <em>Valnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valnum</em>'.
	 * @see technology.ecoa.types._2.EnumValue#getValnum()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Valnum();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see technology.ecoa.types._2.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Field#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Field#getComment()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.types._2.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.FixedArray <em>Fixed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Array</em>'.
	 * @see technology.ecoa.types._2.FixedArray
	 * @generated
	 */
	EClass getFixedArray();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.FixedArray#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.FixedArray#getComment()
	 * @see #getFixedArray()
	 * @generated
	 */
	EAttribute getFixedArray_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.FixedArray#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see technology.ecoa.types._2.FixedArray#getItemType()
	 * @see #getFixedArray()
	 * @generated
	 */
	EAttribute getFixedArray_ItemType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.FixedArray#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see technology.ecoa.types._2.FixedArray#getMaxNumber()
	 * @see #getFixedArray()
	 * @generated
	 */
	EAttribute getFixedArray_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.FixedArray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.FixedArray#getName()
	 * @see #getFixedArray()
	 * @generated
	 */
	EAttribute getFixedArray_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see technology.ecoa.types._2.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.Library#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use</em>'.
	 * @see technology.ecoa.types._2.Library#getUse()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Use();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.types._2.Library#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see technology.ecoa.types._2.Library#getTypes()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Types();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see technology.ecoa.types._2.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.Record#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see technology.ecoa.types._2.Record#getField()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Field();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Record#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Record#getComment()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Record#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Record#getName()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see technology.ecoa.types._2.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Simple#getComment()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getMaxRange <em>Max Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Range</em>'.
	 * @see technology.ecoa.types._2.Simple#getMaxRange()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_MaxRange();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getMinRange <em>Min Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Range</em>'.
	 * @see technology.ecoa.types._2.Simple#getMinRange()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_MinRange();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Simple#getName()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see technology.ecoa.types._2.Simple#getPrecision()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Precision();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.types._2.Simple#getType()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Type();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Simple#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see technology.ecoa.types._2.Simple#getUnit()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Unit();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see technology.ecoa.types._2.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Union#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.Union#getComment()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Union#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.Union#getName()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Union#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.types._2.Union#getType()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Type();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.Union#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see technology.ecoa.types._2.Union#getWhen()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_When();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.types._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.types._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.types._2.VariantRecord <em>Variant Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Record</em>'.
	 * @see technology.ecoa.types._2.VariantRecord
	 * @generated
	 */
	EClass getVariantRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.VariantRecord#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getField()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EReference getVariantRecord_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.types._2.VariantRecord#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getUnion()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EReference getVariantRecord_Union();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.VariantRecord#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getComment()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EAttribute getVariantRecord_Comment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.VariantRecord#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getName()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EAttribute getVariantRecord_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.VariantRecord#getSelectName <em>Select Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Name</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getSelectName()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EAttribute getVariantRecord_SelectName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.types._2.VariantRecord#getSelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Type</em>'.
	 * @see technology.ecoa.types._2.VariantRecord#getSelectType()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EAttribute getVariantRecord_SelectType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.types._2.EBasic <em>EBasic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBasic</em>'.
	 * @see technology.ecoa.types._2.EBasic
	 * @generated
	 */
	EEnum getEBasic();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.types._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.types._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Char Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Character Constant Type
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Char Constant Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CharConstantType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1' pattern='\\p{IsBasicLatin}'"
	 * @generated
	 */
	EDataType getCharConstantType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Constant Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Constant reference
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Constant Reference</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConstantReference' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='%25([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%25'"
	 * @generated
	 */
	EDataType getConstantReference();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Constant Reference Or Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Use of a constant or of an integer value.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Constant Reference Or Integer Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConstantReferenceOrIntegerValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='%25([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%25|(\\+|-)?[0-9]*'"
	 * @generated
	 */
	EDataType getConstantReferenceOrIntegerValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Constant Reference Or Positive Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Use of a constant or of a positive integer
     *         value.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Constant Reference Or Positive Integer Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConstantReferenceOrPositiveIntegerValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='%25([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%25|[0-9]+'"
	 * @generated
	 */
	EDataType getConstantReferenceOrPositiveIntegerValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Constant Reference Or Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Use of a constant reference or of any constant
     *         value.
     *         Note: the ConstantValue type is replaced by its flattened
     *         union members.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Constant Reference Or Value</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ConstantReferenceOrValue' memberTypes='ConstantReference http://www.eclipse.org/emf/2003/XMLType#double http://www.eclipse.org/emf/2003/XMLType#integer CharConstantType HexaCharConstantType'"
	 * @generated
	 */
	EDataType getConstantReferenceOrValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type allowing inputs of decimal values and
     *         character values
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Constant Value</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ConstantValue' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double http://www.eclipse.org/emf/2003/XMLType#integer CharConstantType HexaCharConstantType'"
	 * @generated
	 */
	EDataType getConstantValue();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.types._2.EBasic <em>EBasic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBasic Object</em>'.
	 * @see technology.ecoa.types._2.EBasic
	 * @model instanceClass="technology.ecoa.types._2.EBasic"
	 *        extendedMetaData="name='E_basic:Object' baseType='E_basic'"
	 * @generated
	 */
	EDataType getEBasicObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hexa Char Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         char value.
     *         This hex-encoded binary value contains the mandatory
     *         string 0x followed by a sequence of 1 or 2 characters 0–9 and
     *         a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hexa Char Constant Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexaCharConstantType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f][0-9A-Fa-f]|0x[0-9A-Fa-f]'"
	 * @generated
	 */
	EDataType getHexaCharConstantType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Or Dec Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         binary value or a decimal-coded binary value.
     *         This hex-encoded binary value contains the mandatory string 0x
     *         followed by a finite-length sequence of characters 0–9 and a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex Or Dec Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexOrDecValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[1-9][0-9]*|0'"
	 * @generated
	 */
	EDataType getHexOrDecValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Library Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LibraryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_\\.]*'"
	 * @generated
	 */
	EDataType getLibraryName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getNameId();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.types._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.types._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.types._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number of logical steps
     *         This allows to size
     *         durations in an abstract way.
     *         See stepDuration in the logical
     *         system
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steps</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Steps' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getSteps();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Steps Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steps Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Steps:Object' baseType='Steps'"
	 * @generated
	 */
	EDataType getStepsObject();

	/**
	 * Returns the meta object for data type '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit is in seconds
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='TimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTimeDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Time Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='TimeDuration:Object' baseType='TimeDuration'"
	 * @generated
	 */
	EDataType getTimeDurationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeName' baseType='NameId'"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type QName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeQName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getTypeQName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	typFactory gettypFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.ArrayImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__COMMENT = eINSTANCE.getArray_Comment();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__ITEM_TYPE = eINSTANCE.getArray_ItemType();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__MAX_NUMBER = eINSTANCE.getArray_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__NAME = eINSTANCE.getArray_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.ConstantImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__COMMENT = eINSTANCE.getConstant_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.DataTypesImpl <em>Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.DataTypesImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getDataTypes()
		 * @generated
		 */
		EClass DATA_TYPES = eINSTANCE.getDataTypes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPES__GROUP = eINSTANCE.getDataTypes_Group();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__SIMPLE = eINSTANCE.getDataTypes_Simple();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__RECORD = eINSTANCE.getDataTypes_Record();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__CONSTANT = eINSTANCE.getDataTypes_Constant();

		/**
		 * The meta object literal for the '<em><b>Variant Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__VARIANT_RECORD = eINSTANCE.getDataTypes_VariantRecord();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__ARRAY = eINSTANCE.getDataTypes_Array();

		/**
		 * The meta object literal for the '<em><b>Fixed Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__FIXED_ARRAY = eINSTANCE.getDataTypes_FixedArray();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES__ENUM = eINSTANCE.getDataTypes_Enum();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.DocumentRootImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIBRARY = eINSTANCE.getDocumentRoot_Library();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.EnumImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__VALUE = eINSTANCE.getEnum_Value();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__COMMENT = eINSTANCE.getEnum_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__TYPE = eINSTANCE.getEnum_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.EnumValueImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__COMMENT = eINSTANCE.getEnumValue_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Valnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALNUM = eINSTANCE.getEnumValue_Valnum();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.FieldImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__COMMENT = eINSTANCE.getField_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.FixedArrayImpl <em>Fixed Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.FixedArrayImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getFixedArray()
		 * @generated
		 */
		EClass FIXED_ARRAY = eINSTANCE.getFixedArray();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ARRAY__COMMENT = eINSTANCE.getFixedArray_Comment();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ARRAY__ITEM_TYPE = eINSTANCE.getFixedArray_ItemType();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ARRAY__MAX_NUMBER = eINSTANCE.getFixedArray_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ARRAY__NAME = eINSTANCE.getFixedArray_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.LibraryImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__USE = eINSTANCE.getLibrary_Use();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TYPES = eINSTANCE.getLibrary_Types();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.RecordImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELD = eINSTANCE.getRecord_Field();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__COMMENT = eINSTANCE.getRecord_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.SimpleImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__COMMENT = eINSTANCE.getSimple_Comment();

		/**
		 * The meta object literal for the '<em><b>Max Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__MAX_RANGE = eINSTANCE.getSimple_MaxRange();

		/**
		 * The meta object literal for the '<em><b>Min Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__MIN_RANGE = eINSTANCE.getSimple_MinRange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__NAME = eINSTANCE.getSimple_Name();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__PRECISION = eINSTANCE.getSimple_Precision();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__TYPE = eINSTANCE.getSimple_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__UNIT = eINSTANCE.getSimple_Unit();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.UnionImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__COMMENT = eINSTANCE.getUnion_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__NAME = eINSTANCE.getUnion_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__TYPE = eINSTANCE.getUnion_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__WHEN = eINSTANCE.getUnion_When();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.UseTypeImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getUseType()
		 * @generated
		 */
		EClass USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_TYPE__LIBRARY = eINSTANCE.getUseType_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.impl.VariantRecordImpl <em>Variant Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.VariantRecordImpl
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getVariantRecord()
		 * @generated
		 */
		EClass VARIANT_RECORD = eINSTANCE.getVariantRecord();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_RECORD__FIELD = eINSTANCE.getVariantRecord_Field();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_RECORD__UNION = eINSTANCE.getVariantRecord_Union();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_RECORD__COMMENT = eINSTANCE.getVariantRecord_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_RECORD__NAME = eINSTANCE.getVariantRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Select Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_RECORD__SELECT_NAME = eINSTANCE.getVariantRecord_SelectName();

		/**
		 * The meta object literal for the '<em><b>Select Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_RECORD__SELECT_TYPE = eINSTANCE.getVariantRecord_SelectType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.EBasic <em>EBasic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.EBasic
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getEBasic()
		 * @generated
		 */
		EEnum EBASIC = eINSTANCE.getEBasic();

		/**
		 * The meta object literal for the '{@link technology.ecoa.types._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.ProgrammingLanguage
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Char Constant Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getCharConstantType()
		 * @generated
		 */
		EDataType CHAR_CONSTANT_TYPE = eINSTANCE.getCharConstantType();

		/**
		 * The meta object literal for the '<em>Constant Reference</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReference()
		 * @generated
		 */
		EDataType CONSTANT_REFERENCE = eINSTANCE.getConstantReference();

		/**
		 * The meta object literal for the '<em>Constant Reference Or Integer Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrIntegerValue()
		 * @generated
		 */
		EDataType CONSTANT_REFERENCE_OR_INTEGER_VALUE = eINSTANCE.getConstantReferenceOrIntegerValue();

		/**
		 * The meta object literal for the '<em>Constant Reference Or Positive Integer Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrPositiveIntegerValue()
		 * @generated
		 */
		EDataType CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE = eINSTANCE.getConstantReferenceOrPositiveIntegerValue();

		/**
		 * The meta object literal for the '<em>Constant Reference Or Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantReferenceOrValue()
		 * @generated
		 */
		EDataType CONSTANT_REFERENCE_OR_VALUE = eINSTANCE.getConstantReferenceOrValue();

		/**
		 * The meta object literal for the '<em>Constant Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getConstantValue()
		 * @generated
		 */
		EDataType CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em>EBasic Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.EBasic
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getEBasicObject()
		 * @generated
		 */
		EDataType EBASIC_OBJECT = eINSTANCE.getEBasicObject();

		/**
		 * The meta object literal for the '<em>Hexa Char Constant Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getHexaCharConstantType()
		 * @generated
		 */
		EDataType HEXA_CHAR_CONSTANT_TYPE = eINSTANCE.getHexaCharConstantType();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.ProgrammingLanguage
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.types._2.impl.typPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //typPackage
