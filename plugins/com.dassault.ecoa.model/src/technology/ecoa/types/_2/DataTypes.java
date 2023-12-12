/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of data type definitions
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getSimple <em>Simple</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getRecord <em>Record</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getConstant <em>Constant</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getVariantRecord <em>Variant Record</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getArray <em>Array</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getFixedArray <em>Fixed Array</em>}</li>
 *   <li>{@link technology.ecoa.types._2.DataTypes#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getDataTypes()
 * @model extendedMetaData="name='DataTypes' kind='elementOnly'"
 * @generated
 */
public interface DataTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Simple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Simple()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Simple> getSimple();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Record}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Record()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='record' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<technology.ecoa.types._2.Record> getRecord();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Constant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Constant> getConstant();

	/**
	 * Returns the value of the '<em><b>Variant Record</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.VariantRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Record</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_VariantRecord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variantRecord' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VariantRecord> getVariantRecord();

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Array()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Array> getArray();

	/**
	 * Returns the value of the '<em><b>Fixed Array</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.FixedArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Array</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_FixedArray()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fixedArray' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FixedArray> getFixedArray();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getDataTypes_Enum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<technology.ecoa.types._2.Enum> getEnum();

} // DataTypes
