/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtqos.Event#getMaxHandlingTime <em>Max Handling Time</em>}</li>
 *   <li>{@link edtqos.Event#getServiceDefinitionEvent <em>Service Definition Event</em>}</li>
 * </ul>
 *
 * @see edtqos.EdtqosPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Operation {
	/**
	 * Returns the value of the '<em><b>Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Handling Time</em>' attribute.
	 * @see #isSetMaxHandlingTime()
	 * @see #unsetMaxHandlingTime()
	 * @see #setMaxHandlingTime(double)
	 * @see edtqos.EdtqosPackage#getEvent_MaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getMaxHandlingTime();

	/**
	 * Sets the value of the '{@link edtqos.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute.
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
	 * Unsets the value of the '{@link edtqos.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxHandlingTime()
	 * @see #getMaxHandlingTime()
	 * @see #setMaxHandlingTime(double)
	 * @generated
	 */
	void unsetMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link edtqos.Event#getMaxHandlingTime <em>Max Handling Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Service Definition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition Event</em>' reference.
	 * @see #setServiceDefinitionEvent(edtinterface.Event)
	 * @see edtqos.EdtqosPackage#getEvent_ServiceDefinitionEvent()
	 * @model required="true"
	 * @generated
	 */
	edtinterface.Event getServiceDefinitionEvent();

	/**
	 * Sets the value of the '{@link edtqos.Event#getServiceDefinitionEvent <em>Service Definition Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition Event</em>' reference.
	 * @see #getServiceDefinitionEvent()
	 * @generated
	 */
	void setServiceDefinitionEvent(edtinterface.Event value);

} // Event
