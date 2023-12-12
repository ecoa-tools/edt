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
 * A representation of the model object '<em><b>Request Sent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.RequestSentType#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.RequestSentType#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getRequestSentType()
 * @model extendedMetaData="name='requestSent_._type' kind='elementOnly'"
 * @generated
 */
public interface RequestSentType extends RequestResponse {
	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isSetIsSynchronous()
	 * @see #unsetIsSynchronous()
	 * @see #setIsSynchronous(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestSentType_IsSynchronous()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isSynchronous'"
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isSetIsSynchronous()
	 * @see #unsetIsSynchronous()
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSynchronous()
	 * @see #isIsSynchronous()
	 * @see #setIsSynchronous(boolean)
	 * @generated
	 */
	void unsetIsSynchronous();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.RequestSentType#isIsSynchronous <em>Is Synchronous</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Synchronous</em>' attribute is set.
	 * @see #unsetIsSynchronous()
	 * @see #isIsSynchronous()
	 * @see #setIsSynchronous(boolean)
	 * @generated
	 */
	boolean isSetIsSynchronous();

	/**
	 * Returns the value of the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of concurrent
	 *                           requests that the module may handle for the
	 *                           related container call.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #isSetMaxConcurrentRequests()
	 * @see #unsetMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestSentType_MaxConcurrentRequests()
	 * @model default="10" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maxConcurrentRequests'"
	 * @generated
	 */
	BigInteger getMaxConcurrentRequests();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @generated
	 */
	void unsetMaxConcurrentRequests();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Concurrent Requests</em>' attribute is set.
	 * @see #unsetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @generated
	 */
	boolean isSetMaxConcurrentRequests();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timeout value to
	 *                           unblock/inform respectively a
	 *                           synchronous/asynchronous RR
	 *                           If the value is
	 *                           negative, the timeout
	 *                           is infinite.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(double)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestSentType_Timeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	double getTimeout();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(double)
	 * @generated
	 */
	void unsetTimeout();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.RequestSentType#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(double)
	 * @generated
	 */
	boolean isSetTimeout();

} // RequestSentType
