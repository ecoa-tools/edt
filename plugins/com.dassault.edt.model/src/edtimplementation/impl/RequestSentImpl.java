/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.RequestSent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Request
 * Sent</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.RequestSentImpl#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestSentImpl#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestSentImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestSentImpl extends RequestResponseTypeImpl implements RequestSent {
	/**
	 * The default value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronous = IS_SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_CONCURRENT_REQUESTS_EDEFAULT = new BigInteger("10");

	/**
	 * The cached value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;

	/**
	 * This is true if the Max Concurrent Requests attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxConcurrentRequestsESet;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected double timeout = TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestSentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.REQUEST_SENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSynchronous(boolean newIsSynchronous) {
		boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_SENT__IS_SYNCHRONOUS, oldIsSynchronous, isSynchronous));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxConcurrentRequests() {
		return maxConcurrentRequests;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxConcurrentRequests(BigInteger newMaxConcurrentRequests) {
		BigInteger oldMaxConcurrentRequests = maxConcurrentRequests;
		maxConcurrentRequests = newMaxConcurrentRequests;
		boolean oldMaxConcurrentRequestsESet = maxConcurrentRequestsESet;
		maxConcurrentRequestsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, maxConcurrentRequests, !oldMaxConcurrentRequestsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxConcurrentRequests() {
		BigInteger oldMaxConcurrentRequests = maxConcurrentRequests;
		boolean oldMaxConcurrentRequestsESet = maxConcurrentRequestsESet;
		maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;
		maxConcurrentRequestsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, MAX_CONCURRENT_REQUESTS_EDEFAULT, oldMaxConcurrentRequestsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxConcurrentRequests() {
		return maxConcurrentRequestsESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(double newTimeout) {
		double oldTimeout = timeout;
		timeout = newTimeout;
		boolean oldTimeoutESet = timeoutESet;
		timeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_SENT__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeout() {
		double oldTimeout = timeout;
		boolean oldTimeoutESet = timeoutESet;
		timeout = TIMEOUT_EDEFAULT;
		timeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_SENT__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeout() {
		return timeoutESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_SENT__IS_SYNCHRONOUS:
				return isIsSynchronous();
			case EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS:
				return getMaxConcurrentRequests();
			case EdtimplementationPackage.REQUEST_SENT__TIMEOUT:
				return getTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_SENT__IS_SYNCHRONOUS:
				setIsSynchronous((Boolean)newValue);
				return;
			case EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests((BigInteger)newValue);
				return;
			case EdtimplementationPackage.REQUEST_SENT__TIMEOUT:
				setTimeout((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_SENT__IS_SYNCHRONOUS:
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS:
				unsetMaxConcurrentRequests();
				return;
			case EdtimplementationPackage.REQUEST_SENT__TIMEOUT:
				unsetTimeout();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_SENT__IS_SYNCHRONOUS:
				return isSynchronous != IS_SYNCHRONOUS_EDEFAULT;
			case EdtimplementationPackage.REQUEST_SENT__MAX_CONCURRENT_REQUESTS:
				return isSetMaxConcurrentRequests();
			case EdtimplementationPackage.REQUEST_SENT__TIMEOUT:
				return isSetTimeout();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isSynchronous: ");
		result.append(isSynchronous);
		result.append(", maxConcurrentRequests: ");
		if (maxConcurrentRequestsESet) result.append(maxConcurrentRequests); else result.append("<unset>");
		result.append(", timeout: ");
		if (timeoutESet) result.append(timeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RequestSentImpl
