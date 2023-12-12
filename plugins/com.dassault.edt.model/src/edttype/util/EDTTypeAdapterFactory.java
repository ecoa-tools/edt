/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import edttype.Array;
import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.EnumPredefined;
import edttype.EnumValue;
import edttype.EnumValuePredefined;
import edttype.Field;
import edttype.FieldPredefined;
import edttype.FixedArray;
import edttype.Library;
import edttype.PredefinedType;
import edttype.RecordPredefined;
import edttype.Simple;
import edttype.SimplePredefined;
import edttype.Union;
import edttype.VariantRecord;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see edttype.EDTTypePackage
 * @generated
 */
public class EDTTypeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDTTypePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public EDTTypeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EDTTypePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!--
	 * begin-user-doc --> This implementation returns <code>true</code> if the
	 * object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EDTTypeSwitch<Adapter> modelSwitch = new EDTTypeSwitch<Adapter>() {
			@Override
			public Adapter caseEDTDataType(EDTDataType object) {
				return createEDTDataTypeAdapter();
			}
			@Override
			public Adapter caseSimple(Simple object) {
				return createSimpleAdapter();
			}
			@Override
			public Adapter caseRecord(edttype.Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseVariantRecord(VariantRecord object) {
				return createVariantRecordAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseFixedArray(FixedArray object) {
				return createFixedArrayAdapter();
			}
			@Override
			public Adapter caseEnum(edttype.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseBasicType(BasicType object) {
				return createBasicTypeAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter casePredefinedType(PredefinedType object) {
				return createPredefinedTypeAdapter();
			}
			@Override
			public Adapter caseEnumPredefined(EnumPredefined object) {
				return createEnumPredefinedAdapter();
			}
			@Override
			public Adapter caseEnumValuePredefined(EnumValuePredefined object) {
				return createEnumValuePredefinedAdapter();
			}
			@Override
			public Adapter caseRecordPredefined(RecordPredefined object) {
				return createRecordPredefinedAdapter();
			}
			@Override
			public Adapter caseFieldPredefined(FieldPredefined object) {
				return createFieldPredefinedAdapter();
			}
			@Override
			public Adapter caseSimplePredefined(SimplePredefined object) {
				return createSimplePredefinedAdapter();
			}
			@Override
			public Adapter caseArrayPredefined(ArrayPredefined object) {
				return createArrayPredefinedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.EDTDataType <em>EDT Data Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.EDTDataType
	 * @generated
	 */
	public Adapter createEDTDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Record <em>Record</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.VariantRecord <em>Variant Record</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.VariantRecord
	 * @generated
	 */
	public Adapter createVariantRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Array <em>Array</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.FixedArray <em>Fixed Array</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.FixedArray
	 * @generated
	 */
	public Adapter createFixedArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.BasicType
	 * @generated
	 */
	public Adapter createBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Library <em>Library</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Union <em>Union</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.Field <em>Field</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.PredefinedType
	 * @generated
	 */
	public Adapter createPredefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.EnumPredefined <em>Enum Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.EnumPredefined
	 * @generated
	 */
	public Adapter createEnumPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.EnumValuePredefined <em>Enum Value Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.EnumValuePredefined
	 * @generated
	 */
	public Adapter createEnumValuePredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.RecordPredefined <em>Record Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.RecordPredefined
	 * @generated
	 */
	public Adapter createRecordPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.FieldPredefined <em>Field Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.FieldPredefined
	 * @generated
	 */
	public Adapter createFieldPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.SimplePredefined <em>Simple Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.SimplePredefined
	 * @generated
	 */
	public Adapter createSimplePredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edttype.ArrayPredefined <em>Array Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edttype.ArrayPredefined
	 * @generated
	 */
	public Adapter createArrayPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // EDTTypesAdapterFactory
