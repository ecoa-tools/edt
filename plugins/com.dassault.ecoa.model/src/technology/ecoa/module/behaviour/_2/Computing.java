/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps <em>Max Computing Steps</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps <em>Min Computing Steps</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.module.behaviour._2.modPackage#getComputing()
 * @model extendedMetaData="name='Computing' kind='empty'"
 * @generated
 */
public interface Computing extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of computing steps
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Computing Steps</em>' attribute.
	 * @see #isSetMaxComputingSteps()
	 * @see #unsetMaxComputingSteps()
	 * @see #setMaxComputingSteps(double)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getComputing_MaxComputingSteps()
	 * @model unsettable="true" dataType="technology.ecoa.module.behaviour._2.Steps" required="true"
	 *        extendedMetaData="kind='attribute' name='maxComputingSteps'"
	 * @generated
	 */
	double getMaxComputingSteps();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps <em>Max Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Computing Steps</em>' attribute.
	 * @see #isSetMaxComputingSteps()
	 * @see #unsetMaxComputingSteps()
	 * @see #getMaxComputingSteps()
	 * @generated
	 */
	void setMaxComputingSteps(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps <em>Max Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxComputingSteps()
	 * @see #getMaxComputingSteps()
	 * @see #setMaxComputingSteps(double)
	 * @generated
	 */
	void unsetMaxComputingSteps();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps <em>Max Computing Steps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Computing Steps</em>' attribute is set.
	 * @see #unsetMaxComputingSteps()
	 * @see #getMaxComputingSteps()
	 * @see #setMaxComputingSteps(double)
	 * @generated
	 */
	boolean isSetMaxComputingSteps();

	/**
	 * Returns the value of the '<em><b>Min Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of computing steps
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Computing Steps</em>' attribute.
	 * @see #isSetMinComputingSteps()
	 * @see #unsetMinComputingSteps()
	 * @see #setMinComputingSteps(double)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getComputing_MinComputingSteps()
	 * @model unsettable="true" dataType="technology.ecoa.module.behaviour._2.Steps" required="true"
	 *        extendedMetaData="kind='attribute' name='minComputingSteps'"
	 * @generated
	 */
	double getMinComputingSteps();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps <em>Min Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Computing Steps</em>' attribute.
	 * @see #isSetMinComputingSteps()
	 * @see #unsetMinComputingSteps()
	 * @see #getMinComputingSteps()
	 * @generated
	 */
	void setMinComputingSteps(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps <em>Min Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinComputingSteps()
	 * @see #getMinComputingSteps()
	 * @see #setMinComputingSteps(double)
	 * @generated
	 */
	void unsetMinComputingSteps();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps <em>Min Computing Steps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Computing Steps</em>' attribute is set.
	 * @see #unsetMinComputingSteps()
	 * @see #getMinComputingSteps()
	 * @see #setMinComputingSteps(double)
	 * @generated
	 */
	boolean isSetMinComputingSteps();

} // Computing
