/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edttype.Array;
import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTTypeFactory;
import edttype.EDTTypePackage;
import edttype.EnumPredefined;
import edttype.EnumValue;
import edttype.EnumValuePredefined;
import edttype.Field;
import edttype.FieldPredefined;
import edttype.FixedArray;
import edttype.Library;
import edttype.RecordPredefined;
import edttype.Simple;
import edttype.SimplePredefined;
import edttype.Union;
import edttype.VariantRecord;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EDTTypeFactoryImpl extends EFactoryImpl implements EDTTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static EDTTypeFactory init() {
		try {
			EDTTypeFactory theEDTTypeFactory = (EDTTypeFactory)EPackage.Registry.INSTANCE.getEFactory(EDTTypePackage.eNS_URI);
			if (theEDTTypeFactory != null) {
				return theEDTTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EDTTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EDTTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EDTTypePackage.SIMPLE: return createSimple();
			case EDTTypePackage.RECORD: return createRecord();
			case EDTTypePackage.CONSTANT: return createConstant();
			case EDTTypePackage.VARIANT_RECORD: return createVariantRecord();
			case EDTTypePackage.ARRAY: return createArray();
			case EDTTypePackage.FIXED_ARRAY: return createFixedArray();
			case EDTTypePackage.ENUM: return createEnum();
			case EDTTypePackage.BASIC_TYPE: return createBasicType();
			case EDTTypePackage.LIBRARY: return createLibrary();
			case EDTTypePackage.UNION: return createUnion();
			case EDTTypePackage.FIELD: return createField();
			case EDTTypePackage.ENUM_VALUE: return createEnumValue();
			case EDTTypePackage.ENUM_PREDEFINED: return createEnumPredefined();
			case EDTTypePackage.ENUM_VALUE_PREDEFINED: return createEnumValuePredefined();
			case EDTTypePackage.RECORD_PREDEFINED: return createRecordPredefined();
			case EDTTypePackage.FIELD_PREDEFINED: return createFieldPredefined();
			case EDTTypePackage.SIMPLE_PREDEFINED: return createSimplePredefined();
			case EDTTypePackage.ARRAY_PREDEFINED: return createArrayPredefined();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edttype.Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantRecord createVariantRecord() {
		VariantRecordImpl variantRecord = new VariantRecordImpl();
		return variantRecord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedArray createFixedArray() {
		FixedArrayImpl fixedArray = new FixedArrayImpl();
		return fixedArray;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edttype.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicType createBasicType() {
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumPredefined createEnumPredefined() {
		EnumPredefinedImpl enumPredefined = new EnumPredefinedImpl();
		return enumPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValuePredefined createEnumValuePredefined() {
		EnumValuePredefinedImpl enumValuePredefined = new EnumValuePredefinedImpl();
		return enumValuePredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordPredefined createRecordPredefined() {
		RecordPredefinedImpl recordPredefined = new RecordPredefinedImpl();
		return recordPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldPredefined createFieldPredefined() {
		FieldPredefinedImpl fieldPredefined = new FieldPredefinedImpl();
		return fieldPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplePredefined createSimplePredefined() {
		SimplePredefinedImpl simplePredefined = new SimplePredefinedImpl();
		return simplePredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayPredefined createArrayPredefined() {
		ArrayPredefinedImpl arrayPredefined = new ArrayPredefinedImpl();
		return arrayPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDTTypePackage getEDTTypePackage() {
		return (EDTTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EDTTypePackage getPackage() {
		return EDTTypePackage.eINSTANCE;
	}

} // EDTTypesFactoryImpl
