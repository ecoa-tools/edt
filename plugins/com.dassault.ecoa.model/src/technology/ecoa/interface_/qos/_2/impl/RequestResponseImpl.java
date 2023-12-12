/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.RequestResponse;
import technology.ecoa.interface_.qos._2.qosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestResponseImpl extends MinimalEObjectImpl.Container implements RequestResponse {
	/**
	 * The cached value of the '{@link #getHighestRate() <em>Highest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestRate()
	 * @generated
	 * @ordered
	 */
	protected OperationRate highestRate;

	/**
	 * The cached value of the '{@link #getLowestRate() <em>Lowest Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowestRate()
	 * @generated
	 * @ordered
	 */
	protected OperationRate lowestRate;

	/**
	 * The default value of the '{@link #getCallbackMaxHandlingTime() <em>Callback Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double CALLBACK_MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCallbackMaxHandlingTime() <em>Callback Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double callbackMaxHandlingTime = CALLBACK_MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Callback Max Handling Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callbackMaxHandlingTimeESet;

	/**
	 * The default value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_RESPONSE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected double maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Max Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResponseTimeESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return qosPackage.Literals.REQUEST_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRate getHighestRate() {
		return highestRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighestRate(OperationRate newHighestRate, NotificationChain msgs) {
		OperationRate oldHighestRate = highestRate;
		highestRate = newHighestRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__HIGHEST_RATE, oldHighestRate, newHighestRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighestRate(OperationRate newHighestRate) {
		if (newHighestRate != highestRate) {
			NotificationChain msgs = null;
			if (highestRate != null)
				msgs = ((InternalEObject)highestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.REQUEST_RESPONSE__HIGHEST_RATE, null, msgs);
			if (newHighestRate != null)
				msgs = ((InternalEObject)newHighestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.REQUEST_RESPONSE__HIGHEST_RATE, null, msgs);
			msgs = basicSetHighestRate(newHighestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__HIGHEST_RATE, newHighestRate, newHighestRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRate getLowestRate() {
		return lowestRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowestRate(OperationRate newLowestRate, NotificationChain msgs) {
		OperationRate oldLowestRate = lowestRate;
		lowestRate = newLowestRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__LOWEST_RATE, oldLowestRate, newLowestRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowestRate(OperationRate newLowestRate) {
		if (newLowestRate != lowestRate) {
			NotificationChain msgs = null;
			if (lowestRate != null)
				msgs = ((InternalEObject)lowestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.REQUEST_RESPONSE__LOWEST_RATE, null, msgs);
			if (newLowestRate != null)
				msgs = ((InternalEObject)newLowestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.REQUEST_RESPONSE__LOWEST_RATE, null, msgs);
			msgs = basicSetLowestRate(newLowestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__LOWEST_RATE, newLowestRate, newLowestRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCallbackMaxHandlingTime() {
		return callbackMaxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallbackMaxHandlingTime(double newCallbackMaxHandlingTime) {
		double oldCallbackMaxHandlingTime = callbackMaxHandlingTime;
		callbackMaxHandlingTime = newCallbackMaxHandlingTime;
		boolean oldCallbackMaxHandlingTimeESet = callbackMaxHandlingTimeESet;
		callbackMaxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME, oldCallbackMaxHandlingTime, callbackMaxHandlingTime, !oldCallbackMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallbackMaxHandlingTime() {
		double oldCallbackMaxHandlingTime = callbackMaxHandlingTime;
		boolean oldCallbackMaxHandlingTimeESet = callbackMaxHandlingTimeESet;
		callbackMaxHandlingTime = CALLBACK_MAX_HANDLING_TIME_EDEFAULT;
		callbackMaxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME, oldCallbackMaxHandlingTime, CALLBACK_MAX_HANDLING_TIME_EDEFAULT, oldCallbackMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallbackMaxHandlingTime() {
		return callbackMaxHandlingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxResponseTime() {
		return maxResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResponseTime(double newMaxResponseTime) {
		double oldMaxResponseTime = maxResponseTime;
		maxResponseTime = newMaxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME, oldMaxResponseTime, maxResponseTime, !oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResponseTime() {
		double oldMaxResponseTime = maxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;
		maxResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME, oldMaxResponseTime, MAX_RESPONSE_TIME_EDEFAULT, oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResponseTime() {
		return maxResponseTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.REQUEST_RESPONSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case qosPackage.REQUEST_RESPONSE__HIGHEST_RATE:
				return basicSetHighestRate(null, msgs);
			case qosPackage.REQUEST_RESPONSE__LOWEST_RATE:
				return basicSetLowestRate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case qosPackage.REQUEST_RESPONSE__HIGHEST_RATE:
				return getHighestRate();
			case qosPackage.REQUEST_RESPONSE__LOWEST_RATE:
				return getLowestRate();
			case qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
				return getCallbackMaxHandlingTime();
			case qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
				return getMaxResponseTime();
			case qosPackage.REQUEST_RESPONSE__NAME:
				return getName();
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
			case qosPackage.REQUEST_RESPONSE__HIGHEST_RATE:
				setHighestRate((OperationRate)newValue);
				return;
			case qosPackage.REQUEST_RESPONSE__LOWEST_RATE:
				setLowestRate((OperationRate)newValue);
				return;
			case qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
				setCallbackMaxHandlingTime((Double)newValue);
				return;
			case qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
				setMaxResponseTime((Double)newValue);
				return;
			case qosPackage.REQUEST_RESPONSE__NAME:
				setName((String)newValue);
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
			case qosPackage.REQUEST_RESPONSE__HIGHEST_RATE:
				setHighestRate((OperationRate)null);
				return;
			case qosPackage.REQUEST_RESPONSE__LOWEST_RATE:
				setLowestRate((OperationRate)null);
				return;
			case qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
				unsetCallbackMaxHandlingTime();
				return;
			case qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
				unsetMaxResponseTime();
				return;
			case qosPackage.REQUEST_RESPONSE__NAME:
				setName(NAME_EDEFAULT);
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
			case qosPackage.REQUEST_RESPONSE__HIGHEST_RATE:
				return highestRate != null;
			case qosPackage.REQUEST_RESPONSE__LOWEST_RATE:
				return lowestRate != null;
			case qosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
				return isSetCallbackMaxHandlingTime();
			case qosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
				return isSetMaxResponseTime();
			case qosPackage.REQUEST_RESPONSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (callbackMaxHandlingTime: ");
		if (callbackMaxHandlingTimeESet) result.append(callbackMaxHandlingTime); else result.append("<unset>");
		result.append(", maxResponseTime: ");
		if (maxResponseTimeESet) result.append(maxResponseTime); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RequestResponseImpl
