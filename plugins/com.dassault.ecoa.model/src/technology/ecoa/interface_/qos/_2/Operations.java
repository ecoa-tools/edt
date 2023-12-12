/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of named operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.Operations#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Operations#getData <em>Data</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Operations#getEvent <em>Event</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.Operations#getRequestresponse <em>Requestresponse</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperations()
 * @model extendedMetaData="name='Operations' kind='elementOnly'"
 * @generated
 */
public interface Operations extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperations_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_.qos._2.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperations_Data()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_.qos._2.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperations_Event()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Requestresponse</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_.qos._2.RequestResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestresponse</em>' containment reference list.
	 * @see technology.ecoa.interface_.qos._2.qosPackage#getOperations_Requestresponse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requestresponse' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RequestResponse> getRequestresponse();

} // Operations
