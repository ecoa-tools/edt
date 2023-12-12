/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtqos.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}</li>
 *   <li>{@link edtqos.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link edtqos.RequestResponse#getServiceDefinitionRequestResponse <em>Service Definition Request Response</em>}</li>
 * </ul>
 *
 * @see edtqos.EdtqosPackage#getRequestResponse()
 * @model
 * @generated
 */
public interface RequestResponse extends Operation {
	/**
	 * Returns the value of the '<em><b>Callback Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Max Handling Time</em>' attribute.
	 * @see #isSetCallbackMaxHandlingTime()
	 * @see #unsetCallbackMaxHandlingTime()
	 * @see #setCallbackMaxHandlingTime(double)
	 * @see edtqos.EdtqosPackage#getRequestResponse_CallbackMaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getCallbackMaxHandlingTime();

	/**
	 * Sets the value of the '{@link edtqos.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute.
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
	 * Unsets the value of the '{@link edtqos.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallbackMaxHandlingTime()
	 * @see #getCallbackMaxHandlingTime()
	 * @see #setCallbackMaxHandlingTime(double)
	 * @generated
	 */
	void unsetCallbackMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link edtqos.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}' attribute is set.
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
	 * @return the value of the '<em>Max Response Time</em>' attribute.
	 * @see #isSetMaxResponseTime()
	 * @see #unsetMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @see edtqos.EdtqosPackage#getRequestResponse_MaxResponseTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getMaxResponseTime();

	/**
	 * Sets the value of the '{@link edtqos.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute.
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
	 * Unsets the value of the '{@link edtqos.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @generated
	 */
	void unsetMaxResponseTime();

	/**
	 * Returns whether the value of the '{@link edtqos.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Service Definition Request Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition Request Response</em>' reference.
	 * @see #setServiceDefinitionRequestResponse(edtinterface.RequestResponse)
	 * @see edtqos.EdtqosPackage#getRequestResponse_ServiceDefinitionRequestResponse()
	 * @model required="true"
	 * @generated
	 */
	edtinterface.RequestResponse getServiceDefinitionRequestResponse();

	/**
	 * Sets the value of the '{@link edtqos.RequestResponse#getServiceDefinitionRequestResponse <em>Service Definition Request Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition Request Response</em>' reference.
	 * @see #getServiceDefinitionRequestResponse()
	 * @generated
	 */
	void setServiceDefinitionRequestResponse(edtinterface.RequestResponse value);

} // RequestResponse
