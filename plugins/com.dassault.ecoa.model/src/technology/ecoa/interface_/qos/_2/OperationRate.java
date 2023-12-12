/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.OperationRate#getNumberOfOccurrences <em>Number Of Occurrences</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperationRate()
 * @model extendedMetaData="name='OperationRate' kind='empty'"
 * @generated
 */
public interface OperationRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Min or max number of operations occurring
	 *           during a specified duration
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Occurrences</em>' attribute.
	 * @see #setNumberOfOccurrences(BigDecimal)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperationRate_NumberOfOccurrences()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='numberOfOccurrences'"
	 * @generated
	 */
	BigDecimal getNumberOfOccurrences();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.OperationRate#getNumberOfOccurrences <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Occurrences</em>' attribute.
	 * @see #getNumberOfOccurrences()
	 * @generated
	 */
	void setNumberOfOccurrences(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equal to min or max inter-arrival time when
	 *           NumberOfOccurrences value is 1.
	 *           In other cases, specifies a sizing duration for operations
	 *           bursts.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Frame</em>' attribute.
	 * @see #isSetTimeFrame()
	 * @see #unsetTimeFrame()
	 * @see #setTimeFrame(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperationRate_TimeFrame()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='timeFrame'"
	 * @generated
	 */
	double getTimeFrame();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame <em>Time Frame</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeFrame()
	 * @see #getTimeFrame()
	 * @see #setTimeFrame(double)
	 * @generated
	 */
	void unsetTimeFrame();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame <em>Time Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Frame</em>' attribute is set.
	 * @see #unsetTimeFrame()
	 * @see #getTimeFrame()
	 * @see #setTimeFrame(double)
	 * @generated
	 */
	boolean isSetTimeFrame();

} // OperationRate
