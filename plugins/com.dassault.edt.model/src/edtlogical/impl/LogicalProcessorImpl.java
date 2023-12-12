/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Logical
 * Processor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtlogical.impl.LogicalProcessorImpl#getNumber
 * <em>Number</em>}</li>
 * <li>{@link edtlogical.impl.LogicalProcessorImpl#getType <em>Type</em>}</li>
 * <li>{@link edtlogical.impl.LogicalProcessorImpl#getStepDurationNanoSeconds
 * <em>Step Duration Nano Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalProcessorImpl extends MinimalEObjectImpl.Container implements LogicalProcessor {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepDurationNanoSeconds() <em>Step
	 * Duration Nano Seconds</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStepDurationNanoSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEP_DURATION_NANO_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepDurationNanoSeconds() <em>Step
	 * Duration Nano Seconds</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStepDurationNanoSeconds()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stepDurationNanoSeconds = STEP_DURATION_NANO_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtlogicalPackage.Literals.LOGICAL_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_PROCESSOR__NUMBER,
					oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_PROCESSOR__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getStepDurationNanoSeconds() {
		return stepDurationNanoSeconds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStepDurationNanoSeconds(BigInteger newStepDurationNanoSeconds) {
		BigInteger oldStepDurationNanoSeconds = stepDurationNanoSeconds;
		stepDurationNanoSeconds = newStepDurationNanoSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS, oldStepDurationNanoSeconds,
					stepDurationNanoSeconds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_PROCESSOR__NUMBER:
			return getNumber();
		case EdtlogicalPackage.LOGICAL_PROCESSOR__TYPE:
			return getType();
		case EdtlogicalPackage.LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS:
			return getStepDurationNanoSeconds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_PROCESSOR__NUMBER:
			setNumber((BigInteger) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_PROCESSOR__TYPE:
			setType((String) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS:
			setStepDurationNanoSeconds((BigInteger) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_PROCESSOR__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_PROCESSOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS:
			setStepDurationNanoSeconds(STEP_DURATION_NANO_SECONDS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_PROCESSOR__NUMBER:
			return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
		case EdtlogicalPackage.LOGICAL_PROCESSOR__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case EdtlogicalPackage.LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS:
			return STEP_DURATION_NANO_SECONDS_EDEFAULT == null ? stepDurationNanoSeconds != null
					: !STEP_DURATION_NANO_SECONDS_EDEFAULT.equals(stepDurationNanoSeconds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(", type: ");
		result.append(type);
		result.append(", StepDurationNanoSeconds: ");
		result.append(stepDurationNanoSeconds);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getStepDurationNanoSeconds() != null && this.getNumber() != null && this.getType() != null
				&& !this.getType().isBlank());
	}

} // LogicalProcessorImpl
