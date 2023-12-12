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

import technology.ecoa.interface_.qos._2.Data;
import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.qosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.DataImpl#getHighestRate <em>Highest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.DataImpl#getLowestRate <em>Lowest Rate</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.DataImpl#getMaxAgeing <em>Max Ageing</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.DataImpl#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The default value of the '{@link #getMaxAgeing() <em>Max Ageing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAgeing()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_AGEING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAgeing() <em>Max Ageing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAgeing()
	 * @generated
	 * @ordered
	 */
	protected double maxAgeing = MAX_AGEING_EDEFAULT;

	/**
	 * This is true if the Max Ageing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAgeingESet;

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
	 * The default value of the '{@link #getNotificationMaxHandlingTime() <em>Notification Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNotificationMaxHandlingTime() <em>Notification Max Handling Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double notificationMaxHandlingTime = NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Notification Max Handling Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationMaxHandlingTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return qosPackage.Literals.DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.DATA__HIGHEST_RATE, oldHighestRate, newHighestRate);
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
				msgs = ((InternalEObject)highestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.DATA__HIGHEST_RATE, null, msgs);
			if (newHighestRate != null)
				msgs = ((InternalEObject)newHighestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.DATA__HIGHEST_RATE, null, msgs);
			msgs = basicSetHighestRate(newHighestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.DATA__HIGHEST_RATE, newHighestRate, newHighestRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, qosPackage.DATA__LOWEST_RATE, oldLowestRate, newLowestRate);
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
				msgs = ((InternalEObject)lowestRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - qosPackage.DATA__LOWEST_RATE, null, msgs);
			if (newLowestRate != null)
				msgs = ((InternalEObject)newLowestRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - qosPackage.DATA__LOWEST_RATE, null, msgs);
			msgs = basicSetLowestRate(newLowestRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.DATA__LOWEST_RATE, newLowestRate, newLowestRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAgeing() {
		return maxAgeing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAgeing(double newMaxAgeing) {
		double oldMaxAgeing = maxAgeing;
		maxAgeing = newMaxAgeing;
		boolean oldMaxAgeingESet = maxAgeingESet;
		maxAgeingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.DATA__MAX_AGEING, oldMaxAgeing, maxAgeing, !oldMaxAgeingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAgeing() {
		double oldMaxAgeing = maxAgeing;
		boolean oldMaxAgeingESet = maxAgeingESet;
		maxAgeing = MAX_AGEING_EDEFAULT;
		maxAgeingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.DATA__MAX_AGEING, oldMaxAgeing, MAX_AGEING_EDEFAULT, oldMaxAgeingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAgeing() {
		return maxAgeingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNotificationMaxHandlingTime() {
		return notificationMaxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationMaxHandlingTime(double newNotificationMaxHandlingTime) {
		double oldNotificationMaxHandlingTime = notificationMaxHandlingTime;
		notificationMaxHandlingTime = newNotificationMaxHandlingTime;
		boolean oldNotificationMaxHandlingTimeESet = notificationMaxHandlingTimeESet;
		notificationMaxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME, oldNotificationMaxHandlingTime, notificationMaxHandlingTime, !oldNotificationMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationMaxHandlingTime() {
		double oldNotificationMaxHandlingTime = notificationMaxHandlingTime;
		boolean oldNotificationMaxHandlingTimeESet = notificationMaxHandlingTimeESet;
		notificationMaxHandlingTime = NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT;
		notificationMaxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME, oldNotificationMaxHandlingTime, NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT, oldNotificationMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationMaxHandlingTime() {
		return notificationMaxHandlingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case qosPackage.DATA__HIGHEST_RATE:
				return basicSetHighestRate(null, msgs);
			case qosPackage.DATA__LOWEST_RATE:
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
			case qosPackage.DATA__HIGHEST_RATE:
				return getHighestRate();
			case qosPackage.DATA__LOWEST_RATE:
				return getLowestRate();
			case qosPackage.DATA__MAX_AGEING:
				return getMaxAgeing();
			case qosPackage.DATA__NAME:
				return getName();
			case qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
				return getNotificationMaxHandlingTime();
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
			case qosPackage.DATA__HIGHEST_RATE:
				setHighestRate((OperationRate)newValue);
				return;
			case qosPackage.DATA__LOWEST_RATE:
				setLowestRate((OperationRate)newValue);
				return;
			case qosPackage.DATA__MAX_AGEING:
				setMaxAgeing((Double)newValue);
				return;
			case qosPackage.DATA__NAME:
				setName((String)newValue);
				return;
			case qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
				setNotificationMaxHandlingTime((Double)newValue);
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
			case qosPackage.DATA__HIGHEST_RATE:
				setHighestRate((OperationRate)null);
				return;
			case qosPackage.DATA__LOWEST_RATE:
				setLowestRate((OperationRate)null);
				return;
			case qosPackage.DATA__MAX_AGEING:
				unsetMaxAgeing();
				return;
			case qosPackage.DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
				unsetNotificationMaxHandlingTime();
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
			case qosPackage.DATA__HIGHEST_RATE:
				return highestRate != null;
			case qosPackage.DATA__LOWEST_RATE:
				return lowestRate != null;
			case qosPackage.DATA__MAX_AGEING:
				return isSetMaxAgeing();
			case qosPackage.DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case qosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
				return isSetNotificationMaxHandlingTime();
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
		result.append(" (maxAgeing: ");
		if (maxAgeingESet) result.append(maxAgeing); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", notificationMaxHandlingTime: ");
		if (notificationMaxHandlingTimeESet) result.append(notificationMaxHandlingTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataImpl
