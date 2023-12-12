/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.Loop#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.module.behaviour._2.modPackage#getLoop()
 * @model extendedMetaData="name='Loop' kind='elementOnly'"
 * @generated
 */
public interface Loop extends ActionSet {
	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of iterations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(BigInteger)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getLoop_Iterations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='Iterations'"
	 * @generated
	 */
	BigInteger getIterations();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.Loop#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(BigInteger value);

} // Loop
