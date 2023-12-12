/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use of the "event" exchange mechanism.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.Event#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Event#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime <em>Max Handling Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Event#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getEvent()
 * @model extendedMetaData="name='Event' kind='elementOnly'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Highest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of occurrences within a
	 *             reference time frame
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highest Rate</em>' containment reference.
	 * @see #setHighestRate(OperationRate)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getEvent_HighestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getHighestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Event#getHighestRate <em>Highest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Rate</em>' containment reference.
	 * @see #getHighestRate()
	 * @generated
	 */
	void setHighestRate(OperationRate value);

	/**
	 * Returns the value of the '<em><b>Lowest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Min number of occurrences within a
	 *             reference time frame
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lowest Rate</em>' containment reference.
	 * @see #setLowestRate(OperationRate)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getEvent_LowestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getLowestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Event#getLowestRate <em>Lowest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowest Rate</em>' containment reference.
	 * @see #getLowestRate()
	 * @generated
	 */
	void setLowestRate(OperationRate value);

	/**
	 * Returns the value of the '<em><b>Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event Sent : specifies an intent on receivers
	 *           for maximal duration between Event Reception and end of
	 *           related processing
	 *           Event Received : maximal duration between
	 *           Event Received and end of related processing.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Handling Time</em>' attribute.
	 * @see #isSetMaxHandlingTime()
	 * @see #unsetMaxHandlingTime()
	 * @see #setMaxHandlingTime(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getEvent_MaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='maxHandlingTime'"
	 * @generated
	 */
	double getMaxHandlingTime();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Handling Time</em>' attribute.
	 * @see #isSetMaxHandlingTime()
	 * @see #unsetMaxHandlingTime()
	 * @see #getMaxHandlingTime()
	 * @generated
	 */
	void setMaxHandlingTime(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxHandlingTime()
	 * @see #getMaxHandlingTime()
	 * @see #setMaxHandlingTime(double)
	 * @generated
	 */
	void unsetMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Handling Time</em>' attribute is set.
	 * @see #unsetMaxHandlingTime()
	 * @see #getMaxHandlingTime()
	 * @see #setMaxHandlingTime(double)
	 * @generated
	 */
	boolean isSetMaxHandlingTime();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getEvent_Name()
	 * @model dataType="technology.ecoa.interface_.qos._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Event
