/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Processors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getStepDuration <em>Step Duration</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getNumber <em>Number</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalProcessorsType()
 * @model extendedMetaData="name='logicalProcessors_._type' kind='elementOnly'"
 * @generated
 */
public interface LogicalProcessorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Duration</em>' containment reference.
	 * @see #setStepDuration(StepDurationType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalProcessorsType_StepDuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stepDuration'"
	 * @generated
	 */
	StepDurationType getStepDuration();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getStepDuration <em>Step Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Duration</em>' containment reference.
	 * @see #getStepDuration()
	 * @generated
	 */
	void setStepDuration(StepDurationType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalProcessorsType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalProcessorsType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // LogicalProcessorsType
