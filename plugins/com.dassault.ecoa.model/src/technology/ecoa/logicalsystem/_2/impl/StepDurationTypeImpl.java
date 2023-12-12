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

import technology.ecoa.logicalsystem._2.StepDurationType;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Duration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.StepDurationTypeImpl#getNanoSeconds <em>Nano Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepDurationTypeImpl extends MinimalEObjectImpl.Container implements StepDurationType {
	/**
	 * The default value of the '{@link #getNanoSeconds() <em>Nano Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanoSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NANO_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNanoSeconds() <em>Nano Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanoSeconds()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nanoSeconds = NANO_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepDurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.STEP_DURATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNanoSeconds() {
		return nanoSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanoSeconds(BigInteger newNanoSeconds) {
		BigInteger oldNanoSeconds = nanoSeconds;
		nanoSeconds = newNanoSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.STEP_DURATION_TYPE__NANO_SECONDS, oldNanoSeconds, nanoSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case logPackage.STEP_DURATION_TYPE__NANO_SECONDS:
				return getNanoSeconds();
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
			case logPackage.STEP_DURATION_TYPE__NANO_SECONDS:
				setNanoSeconds((BigInteger)newValue);
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
			case logPackage.STEP_DURATION_TYPE__NANO_SECONDS:
				setNanoSeconds(NANO_SECONDS_EDEFAULT);
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
			case logPackage.STEP_DURATION_TYPE__NANO_SECONDS:
				return NANO_SECONDS_EDEFAULT == null ? nanoSeconds != null : !NANO_SECONDS_EDEFAULT.equals(nanoSeconds);
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
		result.append(" (nanoSeconds: ");
		result.append(nanoSeconds);
		result.append(')');
		return result.toString();
	}

} //StepDurationTypeImpl
