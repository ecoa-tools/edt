/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getDataWritten <em>Data Written</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getDataRead <em>Data Read</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getEventSent <em>Event Sent</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getEventReceived <em>Event Received</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getRequestSent <em>Request Sent</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OperationsType#getRequestReceived <em>Request Received</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOperationsType()
 * @model extendedMetaData="name='operations_._type' kind='elementOnly'"
 * @generated
 */
public interface OperationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Data Written</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.DataWrittenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read+Write access to a versioned
	 *                   data if writeonly=false. Write only access to a
	 *                   versioned data if writeonly=true.
	 *                   Note: the writeonly attribute is ignored by the
	 *                   Infrastructure if controlled=false on the dataLink. 
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Written</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_DataWritten()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataWritten' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DataWrittenType> getDataWritten();

	/**
	 * Returns the value of the '<em><b>Data Read</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.DataReadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read-only access to a versioned data.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Read</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_DataRead()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataRead' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DataReadType> getDataRead();

	/**
	 * Returns the value of the '<em><b>Event Sent</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Sent</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_EventSent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventSent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Event> getEventSent();

	/**
	 * Returns the value of the '<em><b>Event Received</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.EventReceivedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Received</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_EventReceived()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventReceived' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EventReceivedType> getEventReceived();

	/**
	 * Returns the value of the '<em><b>Request Sent</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.RequestSentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Sent</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_RequestSent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requestSent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RequestSentType> getRequestSent();

	/**
	 * Returns the value of the '<em><b>Request Received</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.RequestReceivedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Received</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getOperationsType_RequestReceived()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requestReceived' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RequestReceivedType> getRequestReceived();

} // OperationsType
