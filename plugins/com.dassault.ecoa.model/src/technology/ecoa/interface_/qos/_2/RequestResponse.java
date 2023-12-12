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
 * A representation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use of the "request-reply" exchange mechanism.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.RequestResponse#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.RequestResponse#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.RequestResponse#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse()
 * @model extendedMetaData="name='RequestResponse' kind='elementOnly'"
 * @generated
 */
public interface RequestResponse extends EObject {
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
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse_HighestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getHighestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getHighestRate <em>Highest Rate</em>}' containment reference.
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
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse_LowestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getLowestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getLowestRate <em>Lowest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowest Rate</em>' containment reference.
	 * @see #getLowestRate()
	 * @generated
	 */
	void setLowestRate(OperationRate value);

	/**
	 * Returns the value of the '<em><b>Callback Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maxHandlingTime to execute the callback
	 *           entry-point.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Callback Max Handling Time</em>' attribute.
	 * @see #isSetCallbackMaxHandlingTime()
	 * @see #unsetCallbackMaxHandlingTime()
	 * @see #setCallbackMaxHandlingTime(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse_CallbackMaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='callbackMaxHandlingTime'"
	 * @generated
	 */
	double getCallbackMaxHandlingTime();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Max Handling Time</em>' attribute.
	 * @see #isSetCallbackMaxHandlingTime()
	 * @see #unsetCallbackMaxHandlingTime()
	 * @see #getCallbackMaxHandlingTime()
	 * @generated
	 */
	void setCallbackMaxHandlingTime(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallbackMaxHandlingTime()
	 * @see #getCallbackMaxHandlingTime()
	 * @see #setCallbackMaxHandlingTime(double)
	 * @generated
	 */
	void unsetCallbackMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Callback Max Handling Time</em>' attribute is set.
	 * @see #unsetCallbackMaxHandlingTime()
	 * @see #getCallbackMaxHandlingTime()
	 * @see #setCallbackMaxHandlingTime(double)
	 * @generated
	 */
	boolean isSetCallbackMaxHandlingTime();

	/**
	 * Returns the value of the '<em><b>Max Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation Provided : maximal duration between
	 *           Request Reception and Callback Sent
	 *           Operation Required : maximal duration between Request Sent
	 *           and Callback reception.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Response Time</em>' attribute.
	 * @see #isSetMaxResponseTime()
	 * @see #unsetMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse_MaxResponseTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='maxResponseTime'"
	 * @generated
	 */
	double getMaxResponseTime();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Response Time</em>' attribute.
	 * @see #isSetMaxResponseTime()
	 * @see #unsetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @generated
	 */
	void setMaxResponseTime(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @generated
	 */
	void unsetMaxResponseTime();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Response Time</em>' attribute is set.
	 * @see #unsetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @generated
	 */
	boolean isSetMaxResponseTime();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getRequestResponse_Name()
	 * @model dataType="technology.ecoa.interface_.qos._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.RequestResponse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RequestResponse
