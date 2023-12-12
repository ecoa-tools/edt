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
 * A representation of the model object '<em><b>Service Instance Qo S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of an ECOA service, including a
 *         set of operations.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.ServiceInstanceQoS#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getServiceInstanceQoS()
 * @model extendedMetaData="name='ServiceInstanceQoS' kind='elementOnly'"
 * @generated
 */
public interface ServiceInstanceQoS extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(Operations)
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getServiceInstanceQoS_Operations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operations' namespace='##targetNamespace'"
	 * @generated
	 */
	Operations getOperations();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_.qos._2.ServiceInstanceQoS#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(Operations value);

} // ServiceInstanceQoS
