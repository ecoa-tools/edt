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
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use of the "versionned data" exchange
 *         mechanism.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.Data#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Data#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Data#getMaxAgeing <em>Max Ageing</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Data#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getData()
 * @model extendedMetaData="name='Data' kind='elementOnly'"
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Highest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of occurrences within a
	 *             reference time
	 *             frame
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highest Rate</em>' containment reference.
	 * @see #setHighestRate(OperationRate)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getData_HighestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getHighestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getHighestRate <em>Highest Rate</em>}' containment reference.
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
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getData_LowestRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowestRate' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationRate getLowestRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getLowestRate <em>Lowest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowest Rate</em>' containment reference.
	 * @see #getLowestRate()
	 * @generated
	 */
	void setLowestRate(OperationRate value);

	/**
	 * Returns the value of the '<em><b>Max Ageing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation Provided : max duration between
	 *           Data production (from the source) and the end of writing
	 *           process.
	 *           Operation Required : max duration between Data
	 *           production
	 *           (from the source) and the end of reading process.
	 *           Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Ageing</em>' attribute.
	 * @see #isSetMaxAgeing()
	 * @see #unsetMaxAgeing()
	 * @see #setMaxAgeing(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getData_MaxAgeing()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='maxAgeing'"
	 * @generated
	 */
	double getMaxAgeing();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getMaxAgeing <em>Max Ageing</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getMaxAgeing <em>Max Ageing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAgeing()
	 * @see #getMaxAgeing()
	 * @see #setMaxAgeing(double)
	 * @generated
	 */
	void unsetMaxAgeing();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.Data#getMaxAgeing <em>Max Ageing</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getData_Name()
	 * @model dataType="technology.ecoa.interface_.qos._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notification Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notifying data case: maxHandlingTime for
	 *           notification event. Unit is second.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Max Handling Time</em>' attribute.
	 * @see #isSetNotificationMaxHandlingTime()
	 * @see #unsetNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getData_NotificationMaxHandlingTime()
	 * @model unsettable="true" dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='notificationMaxHandlingTime'"
	 * @generated
	 */
	double getNotificationMaxHandlingTime();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationMaxHandlingTime()
	 * @see #getNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @generated
	 */
	void unsetNotificationMaxHandlingTime();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Max Handling Time</em>' attribute is set.
	 * @see #unsetNotificationMaxHandlingTime()
	 * @see #getNotificationMaxHandlingTime()
	 * @see #setNotificationMaxHandlingTime(double)
	 * @generated
	 */
	boolean isSetNotificationMaxHandlingTime();

} // Data
