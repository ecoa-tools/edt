/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type based on a predefined type (simple or
 *         E_basic) with a name, min/max constraints, and a unit.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.Simple#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getMaxRange <em>Max Range</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getMinRange <em>Min Range</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getPrecision <em>Precision</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getType <em>Type</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Simple#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getSimple()
 * @model extendedMetaData="name='Simple' kind='empty'"
 * @generated
 */
public interface Simple extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see technology.ecoa.types._2.typPackage#getSimple_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Max Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Range</em>' attribute.
	 * @see #setMaxRange(Object)
	 * @see technology.ecoa.types._2.typPackage#getSimple_MaxRange()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 *        extendedMetaData="kind='attribute' name='maxRange'"
	 * @generated
	 */
	Object getMaxRange();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getMaxRange <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Range</em>' attribute.
	 * @see #getMaxRange()
	 * @generated
	 */
	void setMaxRange(Object value);

	/**
	 * Returns the value of the '<em><b>Min Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Range</em>' attribute.
	 * @see #setMinRange(Object)
	 * @see technology.ecoa.types._2.typPackage#getSimple_MinRange()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 *        extendedMetaData="kind='attribute' name='minRange'"
	 * @generated
	 */
	Object getMinRange();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getMinRange <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Range</em>' attribute.
	 * @see #getMinRange()
	 * @generated
	 */
	void setMinRange(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.types._2.typPackage#getSimple_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precision of values
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Object)
	 * @see technology.ecoa.types._2.typPackage#getSimple_Precision()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.types._2.typPackage#getSimple_Type()
	 * @model dataType="technology.ecoa.types._2.TypeQName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use of International System units is
	 *           recommended.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see technology.ecoa.types._2.typPackage#getSimple_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Simple#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Simple
