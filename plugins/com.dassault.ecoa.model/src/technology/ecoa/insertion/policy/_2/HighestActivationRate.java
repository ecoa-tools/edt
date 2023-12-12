/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highest Activation Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations <em>Number Of Activations</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getHighestActivationRate()
 * @model extendedMetaData="name='HighestActivationRate' kind='empty'"
 * @generated
 */
public interface HighestActivationRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Activations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Min or max number of activations occurring during a
	 *           specified duration
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Activations</em>' attribute.
	 * @see #isSetNumberOfActivations()
	 * @see #unsetNumberOfActivations()
	 * @see #setNumberOfActivations(BigDecimal)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getHighestActivationRate_NumberOfActivations()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='numberOfActivations'"
	 * @generated
	 */
	BigDecimal getNumberOfActivations();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations <em>Number Of Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Activations</em>' attribute.
	 * @see #isSetNumberOfActivations()
	 * @see #unsetNumberOfActivations()
	 * @see #getNumberOfActivations()
	 * @generated
	 */
	void setNumberOfActivations(BigDecimal value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations <em>Number Of Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfActivations()
	 * @see #getNumberOfActivations()
	 * @see #setNumberOfActivations(BigDecimal)
	 * @generated
	 */
	void unsetNumberOfActivations();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations <em>Number Of Activations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Activations</em>' attribute is set.
	 * @see #unsetNumberOfActivations()
	 * @see #getNumberOfActivations()
	 * @see #setNumberOfActivations(BigDecimal)
	 * @generated
	 */
	boolean isSetNumberOfActivations();

	/**
	 * Returns the value of the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equal to min or max inter-arrival time when
	 *           NumberOfActivations value is 1.
	 *           In other cases, specifies a sizing
	 *           duration for activations
	 *           bursts.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Frame</em>' attribute.
	 * @see #isSetTimeFrame()
	 * @see #unsetTimeFrame()
	 * @see #setTimeFrame(double)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getHighestActivationRate_TimeFrame()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='timeFrame'"
	 * @generated
	 */
	double getTimeFrame();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Frame</em>' attribute.
	 * @see #isSetTimeFrame()
	 * @see #unsetTimeFrame()
	 * @see #getTimeFrame()
	 * @generated
	 */
	void setTimeFrame(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeFrame()
	 * @see #getTimeFrame()
	 * @see #setTimeFrame(double)
	 * @generated
	 */
	void unsetTimeFrame();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame <em>Time Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Frame</em>' attribute is set.
	 * @see #unsetTimeFrame()
	 * @see #getTimeFrame()
	 * @see #setTimeFrame(double)
	 * @generated
	 */
	boolean isSetTimeFrame();

} // HighestActivationRate
