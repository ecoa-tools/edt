/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edttype.EDTTypePackage
 * @generated
 */
public interface EDTTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDTTypeFactory eINSTANCE = edttype.impl.EDTTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple</em>'.
	 * @generated
	 */
	Simple createSimple();

	/**
	 * Returns a new object of class '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record</em>'.
	 * @generated
	 */
	Record createRecord();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Variant Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant Record</em>'.
	 * @generated
	 */
	VariantRecord createVariantRecord();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Fixed Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Array</em>'.
	 * @generated
	 */
	FixedArray createFixedArray();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Type</em>'.
	 * @generated
	 */
	BasicType createBasicType();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Enum Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Predefined</em>'.
	 * @generated
	 */
	EnumPredefined createEnumPredefined();

	/**
	 * Returns a new object of class '<em>Enum Value Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value Predefined</em>'.
	 * @generated
	 */
	EnumValuePredefined createEnumValuePredefined();

	/**
	 * Returns a new object of class '<em>Record Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Predefined</em>'.
	 * @generated
	 */
	RecordPredefined createRecordPredefined();

	/**
	 * Returns a new object of class '<em>Field Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Predefined</em>'.
	 * @generated
	 */
	FieldPredefined createFieldPredefined();

	/**
	 * Returns a new object of class '<em>Simple Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Predefined</em>'.
	 * @generated
	 */
	SimplePredefined createSimplePredefined();

	/**
	 * Returns a new object of class '<em>Array Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Predefined</em>'.
	 * @generated
	 */
	ArrayPredefined createArrayPredefined();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EDTTypePackage getEDTTypePackage();

} //EDTTypesFactory
