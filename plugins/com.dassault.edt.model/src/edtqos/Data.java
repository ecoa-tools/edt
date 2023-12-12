/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtqos.Data#getMaxAgeing <em>Max Ageing</em>}</li>
 *   <li>{@link edtqos.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}</li>
 *   <li>{@link edtqos.Data#getServiceDefinitionData <em>Service Definition Data</em>}</li>
 * </ul>
 *
 * @see edtqos.EdtqosPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Operation {
	/**
	 * Returns the value of the '<em><b>Max Ageing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ageing</em>' attribute.
	 * @see #isSetMaxAgeing()
	 * @see #unsetMaxAgeing()
	 * @see #setMaxAgeing(double)
	 * @see edtqos.EdtqosPackage#getData_MaxAgeing()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getMaxAgeing();

	/**
	 * Sets the value of the '{@link edtqos.Data#getMaxAgeing <em>Max Ageing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ageing</em>' attribute.
	 * @see #isSetMaxAgeing()
	 * @see #unsetMaxAgeing()
	 * @see #getMaxAgeing()
	 * @generated
	 */
	void setMaxAgeing(double value);

	/**
	 * Unsets the value of the '{@link edtqos.Data#getMaxAgeing <em>Max Ageing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAgeing()
	 * @see #getMaxAgeing()
	 * @see #setMaxAgeing(double)
	 * @generated
	 */
	void unsetMaxAgeing();

	/**
	 * Returns whether the value of the '{@link edtqos.Data#getMaxAgeing <em>Max Ageing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Ageing</em>' attribute is set.
	 * @see #unsetMaxAgeing()
	 * @see #getMaxAgeing()
	 * @see #setMaxAgeing(double)
	 * @generated
	 */
	boolean isSetMaxAgeing();

	/**
	 * Returns the value of the '<em><b>Notification Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Max Handling Time</em>' attribute.
	 * @see #isSetNotificationMaxHandlingTime()
	 * @see #unsetNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @see edtqos.EdtqosPackage#getData_NotificationMaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getNotificationMaxHandlingTime();

	/**
	 * Sets the value of the '{@link edtqos.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Max Handling Time</em>' attribute.
	 * @see #isSetNotificationMaxHandlingTime()
	 * @see #unsetNotificationMaxHandlingTime()
	 * @see #getNotificationMaxHandlingTime()
	 * @generated
	 */
	void setNotificationMaxHandlingTime(double value);

	/**
	 * Unsets the value of the '{@link edtqos.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationMaxHandlingTime()
	 * @see #getNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @generated
	 */
	void unsetNotificationMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link edtqos.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Max Handling Time</em>' attribute is set.
	 * @see #unsetNotificationMaxHandlingTime()
	 * @see #getNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @generated
	 */
	boolean isSetNotificationMaxHandlingTime();

	/**
	 * Returns the value of the '<em><b>Service Definition Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition Data</em>' reference.
	 * @see #setServiceDefinitionData(edtinterface.Data)
	 * @see edtqos.EdtqosPackage#getData_ServiceDefinitionData()
	 * @model required="true"
	 * @generated
	 */
	edtinterface.Data getServiceDefinitionData();

	/**
	 * Sets the value of the '{@link edtqos.Data#getServiceDefinitionData <em>Service Definition Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition Data</em>' reference.
	 * @see #getServiceDefinitionData()
	 * @generated
	 */
	void setServiceDefinitionData(edtinterface.Data value);

} // Data
