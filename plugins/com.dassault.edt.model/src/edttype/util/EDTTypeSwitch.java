/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see edttype.EDTTypePackage
 * @generated
 */
public class EDTTypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDTTypePackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EDTTypeSwitch() {
		if (modelPackage == null) {
			modelPackage = EDTTypePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EDTTypePackage.EDT_DATA_TYPE: {
				EDTDataType edtDataType = (EDTDataType)theEObject;
				T result = caseEDTDataType(edtDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				T result = caseSimple(simple);
				if (result == null) result = caseEDTDataType(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.RECORD: {
				edttype.Record record = (edttype.Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseEDTDataType(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseEDTDataType(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.VARIANT_RECORD: {
				VariantRecord variantRecord = (VariantRecord)theEObject;
				T result = caseVariantRecord(variantRecord);
				if (result == null) result = caseEDTDataType(variantRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseEDTDataType(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.FIXED_ARRAY: {
				FixedArray fixedArray = (FixedArray)theEObject;
				T result = caseFixedArray(fixedArray);
				if (result == null) result = caseEDTDataType(fixedArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ENUM: {
				edttype.Enum enum_ = (edttype.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseEDTDataType(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.BASIC_TYPE: {
				BasicType basicType = (BasicType)theEObject;
				T result = caseBasicType(basicType);
				if (result == null) result = caseEDTDataType(basicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.PREDEFINED_TYPE: {
				PredefinedType predefinedType = (PredefinedType)theEObject;
				T result = casePredefinedType(predefinedType);
				if (result == null) result = caseEDTDataType(predefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ENUM_PREDEFINED: {
				EnumPredefined enumPredefined = (EnumPredefined)theEObject;
				T result = caseEnumPredefined(enumPredefined);
				if (result == null) result = casePredefinedType(enumPredefined);
				if (result == null) result = caseEDTDataType(enumPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ENUM_VALUE_PREDEFINED: {
				EnumValuePredefined enumValuePredefined = (EnumValuePredefined)theEObject;
				T result = caseEnumValuePredefined(enumValuePredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.RECORD_PREDEFINED: {
				RecordPredefined recordPredefined = (RecordPredefined)theEObject;
				T result = caseRecordPredefined(recordPredefined);
				if (result == null) result = casePredefinedType(recordPredefined);
				if (result == null) result = caseEDTDataType(recordPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.FIELD_PREDEFINED: {
				FieldPredefined fieldPredefined = (FieldPredefined)theEObject;
				T result = caseFieldPredefined(fieldPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.SIMPLE_PREDEFINED: {
				SimplePredefined simplePredefined = (SimplePredefined)theEObject;
				T result = caseSimplePredefined(simplePredefined);
				if (result == null) result = casePredefinedType(simplePredefined);
				if (result == null) result = caseEDTDataType(simplePredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTTypePackage.ARRAY_PREDEFINED: {
				ArrayPredefined arrayPredefined = (ArrayPredefined)theEObject;
				T result = caseArrayPredefined(arrayPredefined);
				if (result == null) result = casePredefinedType(arrayPredefined);
				if (result == null) result = caseEDTDataType(arrayPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDT Data Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDT Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDTDataType(EDTDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(edttype.Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantRecord(VariantRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Array</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedArray(FixedArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(edttype.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicType(BasicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedType(PredefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumPredefined(EnumPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValuePredefined(EnumValuePredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordPredefined(RecordPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldPredefined(FieldPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePredefined(SimplePredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayPredefined(ArrayPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last
	 * case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // EDTTypesSwitch
