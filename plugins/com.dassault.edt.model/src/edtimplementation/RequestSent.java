/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Sent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.RequestSent#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link edtimplementation.RequestSent#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link edtimplementation.RequestSent#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getRequestSent()
 * @model
 * @generated
 */
public interface RequestSent extends RequestResponseType {
	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getRequestSent_IsSynchronous()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestSent#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #isSetMaxConcurrentRequests()
	 * @see #unsetMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getRequestSent_MaxConcurrentRequests()
	 * @model default="10" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getMaxConcurrentRequests();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestSent#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
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
	 * Unsets the value of the '{@link edtimplementation.RequestSent#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxConcurrentRequests()
	 * @see #getMaxConcurrentRequests()
	 * @see #setMaxConcurrentRequests(BigInteger)
	 * @generated
	 */
	void unsetMaxConcurrentRequests();

	/**
	 * Returns whether the value of the '{@link edtimplementation.RequestSent#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute is set.
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
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(double)
	 * @see edtimplementation.EdtimplementationPackage#getRequestSent_Timeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getTimeout();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestSent#getTimeout <em>Timeout</em>}' attribute.
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
	 * Unsets the value of the '{@link edtimplementation.RequestSent#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(double)
	 * @generated
	 */
	void unsetTimeout();

	/**
	 * Returns whether the value of the '{@link edtimplementation.RequestSent#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(double)
	 * @generated
	 */
	boolean isSetTimeout();

} // RequestSent
