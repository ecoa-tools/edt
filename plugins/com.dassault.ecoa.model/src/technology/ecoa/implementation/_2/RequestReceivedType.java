/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Received Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getRequestReceivedType()
 * @model extendedMetaData="name='requestReceived_._type' kind='elementOnly'"
 * @generated
 */
public interface RequestReceivedType extends RequestResponse {
	/**
	 * Returns the value of the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of concurrent
	 *                           responses that the module may handle for the
	 *                           related entry-point, regardless of incoming
	 *                           requestLinks related to that entry-point.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #isSetMaxConcurrentRequests()
	 * @see #unsetMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestReceivedType_MaxConcurrentRequests()
	 * @model default="10" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maxConcurrentRequests'"
	 * @generated
	 */
	BigInteger getMaxConcurrentRequests();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #isSetMaxConcurrentRequests()
	 * @see #unsetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 */
	void setMaxConcurrentRequests(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @generated
	 */
	void unsetMaxConcurrentRequests();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Concurrent Requests</em>' attribute is set.
	 * @see #unsetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @generated
	 */
	boolean isSetMaxConcurrentRequests();

} // RequestReceivedType
