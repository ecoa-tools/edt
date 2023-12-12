/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

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
 * @see edttype.EDTTypeFactory
 * @model kind="package"
 * @generated
 */
public interface EDTTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edttype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "EDTTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EDTTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDTTypePackage eINSTANCE = edttype.impl.EDTTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link edttype.EDTDataType <em>EDT Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.EDTDataType
	 * @see edttype.impl.EDTTypePackageImpl#getEDTDataType()
	 * @generated
	 */
	int EDT_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDT_DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDT_DATA_TYPE__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>EDT Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDT_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDT Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDT_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edttype.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.SimpleImpl
	 * @see edttype.impl.EDTTypePackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Max Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MAX_RANGE = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MIN_RANGE = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__PRECISION = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__UNIT = EDT_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Range Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MAX_RANGE_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Range Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MIN_RANGE_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Precision Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__PRECISION_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.RecordImpl
	 * @see edttype.impl.EDTTypePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELD = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.ConstantImpl
	 * @see edttype.impl.EDTTypePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.VariantRecordImpl <em>Variant Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.VariantRecordImpl
	 * @see edttype.impl.EDTTypePackageImpl#getVariantRecord()
	 * @generated
	 */
	int VARIANT_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__FIELD = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__UNION = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Select Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__SELECT_NAME = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD__SELECT_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variant Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variant Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_RECORD_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.ArrayImpl
	 * @see edttype.impl.EDTTypePackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MAX_NUMBER = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ITEM_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MAX_NUMBER_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.FixedArrayImpl <em>Fixed Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.FixedArrayImpl
	 * @see edttype.impl.EDTTypePackageImpl#getFixedArray()
	 * @generated
	 */
	int FIXED_ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__MAX_NUMBER = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__ITEM_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY__MAX_NUMBER_TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fixed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ARRAY_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.EnumImpl
	 * @see edttype.impl.EDTTypePackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUE = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE = EDT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.BasicTypeImpl
	 * @see edttype.impl.EDTTypePackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.LibraryImpl
	 * @see edttype.impl.EDTTypePackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 9;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DATA_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Used Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USED_LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edttype.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.UnionImpl
	 * @see edttype.impl.EDTTypePackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 10;

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
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__WHEN = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__TYPE = 3;

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
	 * The meta object id for the '{@link edttype.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.FieldImpl
	 * @see edttype.impl.EDTTypePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 11;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
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
	 * The meta object id for the '{@link edttype.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.EnumValueImpl
	 * @see edttype.impl.EDTTypePackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 12;

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
	 * The feature id for the '<em><b>Valnum Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALNUM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edttype.PredefinedType <em>Predefined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.PredefinedType
	 * @see edttype.impl.EDTTypePackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__NAME = EDT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE__COMMENT = EDT_DATA_TYPE__COMMENT;

	/**
	 * The number of structural features of the '<em>Predefined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE_FEATURE_COUNT = EDT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predefined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_TYPE_OPERATION_COUNT = EDT_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.EnumPredefinedImpl <em>Enum Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.EnumPredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getEnumPredefined()
	 * @generated
	 */
	int ENUM_PREDEFINED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED__NAME = PREDEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED__COMMENT = PREDEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED__VALUE = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED__TYPE = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PREDEFINED_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.EnumValuePredefinedImpl <em>Enum Value Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.EnumValuePredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getEnumValuePredefined()
	 * @generated
	 */
	int ENUM_VALUE_PREDEFINED = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_PREDEFINED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_PREDEFINED__VALNUM = 1;

	/**
	 * The number of structural features of the '<em>Enum Value Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_PREDEFINED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Value Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_PREDEFINED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edttype.impl.RecordPredefinedImpl <em>Record Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.RecordPredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getRecordPredefined()
	 * @generated
	 */
	int RECORD_PREDEFINED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PREDEFINED__NAME = PREDEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PREDEFINED__COMMENT = PREDEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PREDEFINED__FIELD = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PREDEFINED_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PREDEFINED_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.FieldPredefinedImpl <em>Field Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.FieldPredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getFieldPredefined()
	 * @generated
	 */
	int FIELD_PREDEFINED = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PREDEFINED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PREDEFINED__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PREDEFINED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PREDEFINED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edttype.impl.SimplePredefinedImpl <em>Simple Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.SimplePredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getSimplePredefined()
	 * @generated
	 */
	int SIMPLE_PREDEFINED = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PREDEFINED__NAME = PREDEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PREDEFINED__COMMENT = PREDEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PREDEFINED__TYPE = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PREDEFINED_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PREDEFINED_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edttype.impl.ArrayPredefinedImpl <em>Array Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edttype.impl.ArrayPredefinedImpl
	 * @see edttype.impl.EDTTypePackageImpl#getArrayPredefined()
	 * @generated
	 */
	int ARRAY_PREDEFINED = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED__NAME = PREDEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED__COMMENT = PREDEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED__MAX_NUMBER = PREDEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED__ITEM_TYPE = PREDEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PREDEFINED_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edttype.EDTDataType <em>EDT Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDT Data Type</em>'.
	 * @see edttype.EDTDataType
	 * @generated
	 */
	EClass getEDTDataType();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EDTDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.EDTDataType#getName()
	 * @see #getEDTDataType()
	 * @generated
	 */
	EAttribute getEDTDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EDTDataType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edttype.EDTDataType#getComment()
	 * @see #getEDTDataType()
	 * @generated
	 */
	EAttribute getEDTDataType_Comment();

	/**
	 * Returns the meta object for class '{@link edttype.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see edttype.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Simple#getMaxRange <em>Max Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Range</em>'.
	 * @see edttype.Simple#getMaxRange()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_MaxRange();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Simple#getMinRange <em>Min Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Range</em>'.
	 * @see edttype.Simple#getMinRange()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_MinRange();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Simple#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see edttype.Simple#getPrecision()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Precision();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Simple#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see edttype.Simple#getUnit()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Unit();

	/**
	 * Returns the meta object for the reference '{@link edttype.Simple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.Simple#getType()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Type();

	/**
	 * Returns the meta object for the reference '{@link edttype.Simple#getMaxRangeType <em>Max Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Range Type</em>'.
	 * @see edttype.Simple#getMaxRangeType()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_MaxRangeType();

	/**
	 * Returns the meta object for the reference '{@link edttype.Simple#getMinRangeType <em>Min Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Range Type</em>'.
	 * @see edttype.Simple#getMinRangeType()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_MinRangeType();

	/**
	 * Returns the meta object for the reference '{@link edttype.Simple#getPrecisionType <em>Precision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precision Type</em>'.
	 * @see edttype.Simple#getPrecisionType()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_PrecisionType();

	/**
	 * Returns the meta object for class '{@link edttype.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see edttype.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.Record#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see edttype.Record#getField()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Field();

	/**
	 * Returns the meta object for class '{@link edttype.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see edttype.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edttype.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for the reference '{@link edttype.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Type();

	/**
	 * Returns the meta object for the reference '{@link edttype.Constant#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see edttype.Constant#getValueType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_ValueType();

	/**
	 * Returns the meta object for class '{@link edttype.VariantRecord <em>Variant Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Record</em>'.
	 * @see edttype.VariantRecord
	 * @generated
	 */
	EClass getVariantRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.VariantRecord#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see edttype.VariantRecord#getField()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EReference getVariantRecord_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.VariantRecord#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union</em>'.
	 * @see edttype.VariantRecord#getUnion()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EReference getVariantRecord_Union();

	/**
	 * Returns the meta object for the attribute '{@link edttype.VariantRecord#getSelectName <em>Select Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Name</em>'.
	 * @see edttype.VariantRecord#getSelectName()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EAttribute getVariantRecord_SelectName();

	/**
	 * Returns the meta object for the reference '{@link edttype.VariantRecord#getSelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Type</em>'.
	 * @see edttype.VariantRecord#getSelectType()
	 * @see #getVariantRecord()
	 * @generated
	 */
	EReference getVariantRecord_SelectType();

	/**
	 * Returns the meta object for class '{@link edttype.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see edttype.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Array#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see edttype.Array#getMaxNumber()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_MaxNumber();

	/**
	 * Returns the meta object for the reference '{@link edttype.Array#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see edttype.Array#getItemType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ItemType();

	/**
	 * Returns the meta object for the reference '{@link edttype.Array#getMaxNumberType <em>Max Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Number Type</em>'.
	 * @see edttype.Array#getMaxNumberType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_MaxNumberType();

	/**
	 * Returns the meta object for class '{@link edttype.FixedArray <em>Fixed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Array</em>'.
	 * @see edttype.FixedArray
	 * @generated
	 */
	EClass getFixedArray();

	/**
	 * Returns the meta object for the attribute '{@link edttype.FixedArray#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see edttype.FixedArray#getMaxNumber()
	 * @see #getFixedArray()
	 * @generated
	 */
	EAttribute getFixedArray_MaxNumber();

	/**
	 * Returns the meta object for the reference '{@link edttype.FixedArray#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see edttype.FixedArray#getItemType()
	 * @see #getFixedArray()
	 * @generated
	 */
	EReference getFixedArray_ItemType();

	/**
	 * Returns the meta object for the reference '{@link edttype.FixedArray#getMaxNumberType <em>Max Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Number Type</em>'.
	 * @see edttype.FixedArray#getMaxNumberType()
	 * @see #getFixedArray()
	 * @generated
	 */
	EReference getFixedArray_MaxNumberType();

	/**
	 * Returns the meta object for class '{@link edttype.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edttype.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.Enum#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see edttype.Enum#getValue()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Value();

	/**
	 * Returns the meta object for the reference '{@link edttype.Enum#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.Enum#getType()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Type();

	/**
	 * Returns the meta object for class '{@link edttype.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see edttype.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link edttype.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see edttype.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.Library#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see edttype.Library#getDataTypes()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_DataTypes();

	/**
	 * Returns the meta object for the reference list '{@link edttype.Library#getUsedLibraries <em>Used Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Libraries</em>'.
	 * @see edttype.Library#getUsedLibraries()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_UsedLibraries();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for class '{@link edttype.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see edttype.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Union#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edttype.Union#getComment()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Comment();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Union#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.Union#getName()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Name();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Union#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see edttype.Union#getWhen()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_When();

	/**
	 * Returns the meta object for the reference '{@link edttype.Union#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.Union#getType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Type();

	/**
	 * Returns the meta object for class '{@link edttype.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see edttype.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Field#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edttype.Field#getComment()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Comment();

	/**
	 * Returns the meta object for the attribute '{@link edttype.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link edttype.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link edttype.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see edttype.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EnumValue#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edttype.EnumValue#getComment()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Comment();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.EnumValue#getName()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EnumValue#getValnum <em>Valnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valnum</em>'.
	 * @see edttype.EnumValue#getValnum()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Valnum();

	/**
	 * Returns the meta object for the reference '{@link edttype.EnumValue#getValnumType <em>Valnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valnum Type</em>'.
	 * @see edttype.EnumValue#getValnumType()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_ValnumType();

	/**
	 * Returns the meta object for class '{@link edttype.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Type</em>'.
	 * @see edttype.PredefinedType
	 * @generated
	 */
	EClass getPredefinedType();

	/**
	 * Returns the meta object for class '{@link edttype.EnumPredefined <em>Enum Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Predefined</em>'.
	 * @see edttype.EnumPredefined
	 * @generated
	 */
	EClass getEnumPredefined();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.EnumPredefined#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see edttype.EnumPredefined#getValue()
	 * @see #getEnumPredefined()
	 * @generated
	 */
	EReference getEnumPredefined_Value();

	/**
	 * Returns the meta object for the reference '{@link edttype.EnumPredefined#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.EnumPredefined#getType()
	 * @see #getEnumPredefined()
	 * @generated
	 */
	EReference getEnumPredefined_Type();

	/**
	 * Returns the meta object for class '{@link edttype.EnumValuePredefined <em>Enum Value Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value Predefined</em>'.
	 * @see edttype.EnumValuePredefined
	 * @generated
	 */
	EClass getEnumValuePredefined();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EnumValuePredefined#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.EnumValuePredefined#getName()
	 * @see #getEnumValuePredefined()
	 * @generated
	 */
	EAttribute getEnumValuePredefined_Name();

	/**
	 * Returns the meta object for the attribute '{@link edttype.EnumValuePredefined#getValnum <em>Valnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valnum</em>'.
	 * @see edttype.EnumValuePredefined#getValnum()
	 * @see #getEnumValuePredefined()
	 * @generated
	 */
	EAttribute getEnumValuePredefined_Valnum();

	/**
	 * Returns the meta object for class '{@link edttype.RecordPredefined <em>Record Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Predefined</em>'.
	 * @see edttype.RecordPredefined
	 * @generated
	 */
	EClass getRecordPredefined();

	/**
	 * Returns the meta object for the containment reference list '{@link edttype.RecordPredefined#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see edttype.RecordPredefined#getField()
	 * @see #getRecordPredefined()
	 * @generated
	 */
	EReference getRecordPredefined_Field();

	/**
	 * Returns the meta object for class '{@link edttype.FieldPredefined <em>Field Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Predefined</em>'.
	 * @see edttype.FieldPredefined
	 * @generated
	 */
	EClass getFieldPredefined();

	/**
	 * Returns the meta object for the attribute '{@link edttype.FieldPredefined#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edttype.FieldPredefined#getName()
	 * @see #getFieldPredefined()
	 * @generated
	 */
	EAttribute getFieldPredefined_Name();

	/**
	 * Returns the meta object for the reference '{@link edttype.FieldPredefined#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.FieldPredefined#getType()
	 * @see #getFieldPredefined()
	 * @generated
	 */
	EReference getFieldPredefined_Type();

	/**
	 * Returns the meta object for class '{@link edttype.SimplePredefined <em>Simple Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Predefined</em>'.
	 * @see edttype.SimplePredefined
	 * @generated
	 */
	EClass getSimplePredefined();

	/**
	 * Returns the meta object for the reference '{@link edttype.SimplePredefined#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edttype.SimplePredefined#getType()
	 * @see #getSimplePredefined()
	 * @generated
	 */
	EReference getSimplePredefined_Type();

	/**
	 * Returns the meta object for class '{@link edttype.ArrayPredefined <em>Array Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Predefined</em>'.
	 * @see edttype.ArrayPredefined
	 * @generated
	 */
	EClass getArrayPredefined();

	/**
	 * Returns the meta object for the attribute '{@link edttype.ArrayPredefined#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see edttype.ArrayPredefined#getMaxNumber()
	 * @see #getArrayPredefined()
	 * @generated
	 */
	EAttribute getArrayPredefined_MaxNumber();

	/**
	 * Returns the meta object for the reference '{@link edttype.ArrayPredefined#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see edttype.ArrayPredefined#getItemType()
	 * @see #getArrayPredefined()
	 * @generated
	 */
	EReference getArrayPredefined_ItemType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDTTypeFactory getEDTTypeFactory();

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
		 * The meta object literal for the '{@link edttype.EDTDataType <em>EDT Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.EDTDataType
		 * @see edttype.impl.EDTTypePackageImpl#getEDTDataType()
		 * @generated
		 */
		EClass EDT_DATA_TYPE = eINSTANCE.getEDTDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDT_DATA_TYPE__NAME = eINSTANCE.getEDTDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDT_DATA_TYPE__COMMENT = eINSTANCE.getEDTDataType_Comment();

		/**
		 * The meta object literal for the '{@link edttype.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.SimpleImpl
		 * @see edttype.impl.EDTTypePackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

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
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__PRECISION = eINSTANCE.getSimple_Precision();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__UNIT = eINSTANCE.getSimple_Unit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__TYPE = eINSTANCE.getSimple_Type();

		/**
		 * The meta object literal for the '<em><b>Max Range Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__MAX_RANGE_TYPE = eINSTANCE.getSimple_MaxRangeType();

		/**
		 * The meta object literal for the '<em><b>Min Range Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__MIN_RANGE_TYPE = eINSTANCE.getSimple_MinRangeType();

		/**
		 * The meta object literal for the '<em><b>Precision Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__PRECISION_TYPE = eINSTANCE.getSimple_PrecisionType();

		/**
		 * The meta object literal for the '{@link edttype.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.RecordImpl
		 * @see edttype.impl.EDTTypePackageImpl#getRecord()
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
		 * The meta object literal for the '{@link edttype.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.ConstantImpl
		 * @see edttype.impl.EDTTypePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE_TYPE = eINSTANCE.getConstant_ValueType();

		/**
		 * The meta object literal for the '{@link edttype.impl.VariantRecordImpl <em>Variant Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.VariantRecordImpl
		 * @see edttype.impl.EDTTypePackageImpl#getVariantRecord()
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
		 * The meta object literal for the '<em><b>Select Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_RECORD__SELECT_NAME = eINSTANCE.getVariantRecord_SelectName();

		/**
		 * The meta object literal for the '<em><b>Select Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_RECORD__SELECT_TYPE = eINSTANCE.getVariantRecord_SelectType();

		/**
		 * The meta object literal for the '{@link edttype.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.ArrayImpl
		 * @see edttype.impl.EDTTypePackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__MAX_NUMBER = eINSTANCE.getArray_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ITEM_TYPE = eINSTANCE.getArray_ItemType();

		/**
		 * The meta object literal for the '<em><b>Max Number Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__MAX_NUMBER_TYPE = eINSTANCE.getArray_MaxNumberType();

		/**
		 * The meta object literal for the '{@link edttype.impl.FixedArrayImpl <em>Fixed Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.FixedArrayImpl
		 * @see edttype.impl.EDTTypePackageImpl#getFixedArray()
		 * @generated
		 */
		EClass FIXED_ARRAY = eINSTANCE.getFixedArray();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ARRAY__MAX_NUMBER = eINSTANCE.getFixedArray_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ARRAY__ITEM_TYPE = eINSTANCE.getFixedArray_ItemType();

		/**
		 * The meta object literal for the '<em><b>Max Number Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ARRAY__MAX_NUMBER_TYPE = eINSTANCE.getFixedArray_MaxNumberType();

		/**
		 * The meta object literal for the '{@link edttype.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.EnumImpl
		 * @see edttype.impl.EDTTypePackageImpl#getEnum()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__TYPE = eINSTANCE.getEnum_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.BasicTypeImpl
		 * @see edttype.impl.EDTTypePackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link edttype.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.LibraryImpl
		 * @see edttype.impl.EDTTypePackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__DATA_TYPES = eINSTANCE.getLibrary_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Used Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__USED_LIBRARIES = eINSTANCE.getLibrary_UsedLibraries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '{@link edttype.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.UnionImpl
		 * @see edttype.impl.EDTTypePackageImpl#getUnion()
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
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__WHEN = eINSTANCE.getUnion_When();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__TYPE = eINSTANCE.getUnion_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.FieldImpl
		 * @see edttype.impl.EDTTypePackageImpl#getField()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.EnumValueImpl
		 * @see edttype.impl.EDTTypePackageImpl#getEnumValue()
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
		 * The meta object literal for the '<em><b>Valnum Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__VALNUM_TYPE = eINSTANCE.getEnumValue_ValnumType();

		/**
		 * The meta object literal for the '{@link edttype.PredefinedType <em>Predefined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.PredefinedType
		 * @see edttype.impl.EDTTypePackageImpl#getPredefinedType()
		 * @generated
		 */
		EClass PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

		/**
		 * The meta object literal for the '{@link edttype.impl.EnumPredefinedImpl <em>Enum Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.EnumPredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getEnumPredefined()
		 * @generated
		 */
		EClass ENUM_PREDEFINED = eINSTANCE.getEnumPredefined();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_PREDEFINED__VALUE = eINSTANCE.getEnumPredefined_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_PREDEFINED__TYPE = eINSTANCE.getEnumPredefined_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.EnumValuePredefinedImpl <em>Enum Value Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.EnumValuePredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getEnumValuePredefined()
		 * @generated
		 */
		EClass ENUM_VALUE_PREDEFINED = eINSTANCE.getEnumValuePredefined();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE_PREDEFINED__NAME = eINSTANCE.getEnumValuePredefined_Name();

		/**
		 * The meta object literal for the '<em><b>Valnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE_PREDEFINED__VALNUM = eINSTANCE.getEnumValuePredefined_Valnum();

		/**
		 * The meta object literal for the '{@link edttype.impl.RecordPredefinedImpl <em>Record Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.RecordPredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getRecordPredefined()
		 * @generated
		 */
		EClass RECORD_PREDEFINED = eINSTANCE.getRecordPredefined();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_PREDEFINED__FIELD = eINSTANCE.getRecordPredefined_Field();

		/**
		 * The meta object literal for the '{@link edttype.impl.FieldPredefinedImpl <em>Field Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.FieldPredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getFieldPredefined()
		 * @generated
		 */
		EClass FIELD_PREDEFINED = eINSTANCE.getFieldPredefined();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_PREDEFINED__NAME = eINSTANCE.getFieldPredefined_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_PREDEFINED__TYPE = eINSTANCE.getFieldPredefined_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.SimplePredefinedImpl <em>Simple Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.SimplePredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getSimplePredefined()
		 * @generated
		 */
		EClass SIMPLE_PREDEFINED = eINSTANCE.getSimplePredefined();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PREDEFINED__TYPE = eINSTANCE.getSimplePredefined_Type();

		/**
		 * The meta object literal for the '{@link edttype.impl.ArrayPredefinedImpl <em>Array Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edttype.impl.ArrayPredefinedImpl
		 * @see edttype.impl.EDTTypePackageImpl#getArrayPredefined()
		 * @generated
		 */
		EClass ARRAY_PREDEFINED = eINSTANCE.getArrayPredefined();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_PREDEFINED__MAX_NUMBER = eINSTANCE.getArrayPredefined_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_PREDEFINED__ITEM_TYPE = eINSTANCE.getArrayPredefined_ItemType();

	}

} //EDTTypesPackage
