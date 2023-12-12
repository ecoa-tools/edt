/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.logicalsystem._2.LatencyType1;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LatencyType1Impl#getMicroSeconds <em>Micro Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyType1Impl extends MinimalEObjectImpl.Container implements LatencyType1 {
	/**
	 * The default value of the '{@link #getMicroSeconds() <em>Micro Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MICRO_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMicroSeconds() <em>Micro Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected BigInteger microSeconds = MICRO_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LATENCY_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMicroSeconds() {
		return microSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroSeconds(BigInteger newMicroSeconds) {
		BigInteger oldMicroSeconds = microSeconds;
		microSeconds = newMicroSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LATENCY_TYPE1__MICRO_SECONDS, oldMicroSeconds, microSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case logPackage.LATENCY_TYPE1__MICRO_SECONDS:
				return getMicroSeconds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case logPackage.LATENCY_TYPE1__MICRO_SECONDS:
				setMicroSeconds((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case logPackage.LATENCY_TYPE1__MICRO_SECONDS:
				setMicroSeconds(MICRO_SECONDS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case logPackage.LATENCY_TYPE1__MICRO_SECONDS:
				return MICRO_SECONDS_EDEFAULT == null ? microSeconds != null : !MICRO_SECONDS_EDEFAULT.equals(microSeconds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (microSeconds: ");
		result.append(microSeconds);
		result.append(')');
		return result.toString();
	}

} //LatencyType1Impl
