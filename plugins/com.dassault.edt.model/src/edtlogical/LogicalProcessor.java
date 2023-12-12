/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Logical
 * Processor</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtlogical.LogicalProcessor#getNumber <em>Number</em>}</li>
 * <li>{@link edtlogical.LogicalProcessor#getType <em>Type</em>}</li>
 * <li>{@link edtlogical.LogicalProcessor#getStepDurationNanoSeconds <em>Step
 * Duration Nano Seconds</em>}</li>
 * </ul>
 *
 * @see edtlogical.EdtlogicalPackage#getLogicalProcessor()
 * @model extendedMetaData="name='logicalProcessors_._type' kind='elementOnly'"
 * @generated
 */
public interface LogicalProcessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalProcessor_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalProcessor#getNumber
	 * <em>Number</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalProcessor_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalProcessor#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Step Duration Nano Seconds</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Step Duration Nano Seconds</em>' attribute.
	 * @see #setStepDurationNanoSeconds(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalProcessor_StepDurationNanoSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='nanoSeconds'"
	 * @generated
	 */
	BigInteger getStepDurationNanoSeconds();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalProcessor#getStepDurationNanoSeconds <em>Step
	 * Duration Nano Seconds</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Step Duration Nano Seconds</em>'
	 *              attribute.
	 * @see #getStepDurationNanoSeconds()
	 * @generated
	 */
	void setStepDurationNanoSeconds(BigInteger value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	public boolean isComplete();
} // LogicalProcessor
