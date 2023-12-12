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
 * A representation of the model object '<em><b>Step Duration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.StepDurationType#getNanoSeconds <em>Nano Seconds</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getStepDurationType()
 * @model extendedMetaData="name='stepDuration_._type' kind='empty'"
 * @generated
 */
public interface StepDurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nano Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nano Seconds</em>' attribute.
	 * @see #setNanoSeconds(BigInteger)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getStepDurationType_NanoSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='nanoSeconds'"
	 * @generated
	 */
	BigInteger getNanoSeconds();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.StepDurationType#getNanoSeconds <em>Nano Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nano Seconds</em>' attribute.
	 * @see #getNanoSeconds()
	 * @generated
	 */
	void setNanoSeconds(BigInteger value);

} // StepDurationType
