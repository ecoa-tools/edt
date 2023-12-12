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

import technology.ecoa.interface_.qos._2.Event;
import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.qosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.EventImpl#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.EventImpl#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.EventImpl#getMaxHandlingTime <em>Max Handling Time</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.EventImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The default value of the '{@link #getMaxHandlingTime() <em>Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxHandlingTime() <em>Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double maxHandlingTime = MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Max Handling Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxHandlingTimeESet;

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
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return qosPackage.Literals.EVENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__HIGHEST_RATE, oldHighestRate, newHighestRate);
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
				msgs = ((InternalEObject)highestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.EVENT__HIGHEST_RATE, null, msgs);
			if (newHighestRate != null)
				msgs = ((InternalEObject)newHighestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.EVENT__HIGHEST_RATE, null, msgs);
			msgs = basicSetHighestRate(newHighestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__HIGHEST_RATE, newHighestRate, newHighestRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__LOWEST_RATE, oldLowestRate, newLowestRate);
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
				msgs = ((InternalEObject)lowestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.EVENT__LOWEST_RATE, null, msgs);
			if (newLowestRate != null)
				msgs = ((InternalEObject)newLowestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.EVENT__LOWEST_RATE, null, msgs);
			msgs = basicSetLowestRate(newLowestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__LOWEST_RATE, newLowestRate, newLowestRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxHandlingTime() {
		return maxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHandlingTime(double newMaxHandlingTime) {
		double oldMaxHandlingTime = maxHandlingTime;
		maxHandlingTime = newMaxHandlingTime;
		boolean oldMaxHandlingTimeESet = maxHandlingTimeESet;
		maxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__MAX_HANDLING_TIME, oldMaxHandlingTime, maxHandlingTime, !oldMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxHandlingTime() {
		double oldMaxHandlingTime = maxHandlingTime;
		boolean oldMaxHandlingTimeESet = maxHandlingTimeESet;
		maxHandlingTime = MAX_HANDLING_TIME_EDEFAULT;
		maxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.EVENT__MAX_HANDLING_TIME, oldMaxHandlingTime, MAX_HANDLING_TIME_EDEFAULT, oldMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxHandlingTime() {
		return maxHandlingTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case qosPackage.EVENT__HIGHEST_RATE:
				return basicSetHighestRate(null, msgs);
			case qosPackage.EVENT__LOWEST_RATE:
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
			case qosPackage.EVENT__HIGHEST_RATE:
				return getHighestRate();
			case qosPackage.EVENT__LOWEST_RATE:
				return getLowestRate();
			case qosPackage.EVENT__MAX_HANDLING_TIME:
				return getMaxHandlingTime();
			case qosPackage.EVENT__NAME:
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
			case qosPackage.EVENT__HIGHEST_RATE:
				setHighestRate((OperationRate)newValue);
				return;
			case qosPackage.EVENT__LOWEST_RATE:
				setLowestRate((OperationRate)newValue);
				return;
			case qosPackage.EVENT__MAX_HANDLING_TIME:
				setMaxHandlingTime((Double)newValue);
				return;
			case qosPackage.EVENT__NAME:
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
			case qosPackage.EVENT__HIGHEST_RATE:
				setHighestRate((OperationRate)null);
				return;
			case qosPackage.EVENT__LOWEST_RATE:
				setLowestRate((OperationRate)null);
				return;
			case qosPackage.EVENT__MAX_HANDLING_TIME:
				unsetMaxHandlingTime();
				return;
			case qosPackage.EVENT__NAME:
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
			case qosPackage.EVENT__HIGHEST_RATE:
				return highestRate != null;
			case qosPackage.EVENT__LOWEST_RATE:
				return lowestRate != null;
			case qosPackage.EVENT__MAX_HANDLING_TIME:
				return isSetMaxHandlingTime();
			case qosPackage.EVENT__NAME:
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
		result.append(" (maxHandlingTime: ");
		if (maxHandlingTimeESet) result.append(maxHandlingTime); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EventImpl
