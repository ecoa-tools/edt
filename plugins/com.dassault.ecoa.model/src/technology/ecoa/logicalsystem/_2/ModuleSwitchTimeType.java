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
 * A representation of the model object '<em><b>Module Switch Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.ModuleSwitchTimeType#getMicroSeconds <em>Micro Seconds</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getModuleSwitchTimeType()
 * @model extendedMetaData="name='moduleSwitchTime_._type' kind='empty'"
 * @generated
 */
public interface ModuleSwitchTimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micro Seconds</em>' attribute.
	 * @see #setMicroSeconds(BigInteger)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getModuleSwitchTimeType_MicroSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='microSeconds'"
	 * @generated
	 */
	BigInteger getMicroSeconds();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.ModuleSwitchTimeType#getMicroSeconds <em>Micro Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Micro Seconds</em>' attribute.
	 * @see #getMicroSeconds()
	 * @generated
	 */
	void setMicroSeconds(BigInteger value);

} // ModuleSwitchTimeType
