/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.logicalsystem._2.LogicalProcessorsType;
import technology.ecoa.logicalsystem._2.StepDurationType;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Processors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl#getStepDuration <em>Step Duration</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalProcessorsTypeImpl extends MinimalEObjectImpl.Container implements LogicalProcessorsType {
	/**
	 * The cached value of the '{@link #getStepDuration() <em>Step Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDuration()
	 * @generated
	 * @ordered
	 */
	protected StepDurationType stepDuration;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalProcessorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_PROCESSORS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDurationType getStepDuration() {
		return stepDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepDuration(StepDurationType newStepDuration, NotificationChain msgs) {
		StepDurationType oldStepDuration = stepDuration;
		stepDuration = newStepDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION, oldStepDuration, newStepDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDuration(StepDurationType newStepDuration) {
		if (newStepDuration != stepDuration) {
			NotificationChain msgs = null;
			if (stepDuration != null)
				msgs = ((InternalEObject)stepDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION, null, msgs);
			if (newStepDuration != null)
				msgs = ((InternalEObject)newStepDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION, null, msgs);
			msgs = basicSetStepDuration(newStepDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION, newStepDuration, newStepDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_PROCESSORS_TYPE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_PROCESSORS_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION:
				return basicSetStepDuration(null, msgs);
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
			case logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION:
				return getStepDuration();
			case logPackage.LOGICAL_PROCESSORS_TYPE__NUMBER:
				return getNumber();
			case logPackage.LOGICAL_PROCESSORS_TYPE__TYPE:
				return getType();
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
			case logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION:
				setStepDuration((StepDurationType)newValue);
				return;
			case logPackage.LOGICAL_PROCESSORS_TYPE__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case logPackage.LOGICAL_PROCESSORS_TYPE__TYPE:
				setType((String)newValue);
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
			case logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION:
				setStepDuration((StepDurationType)null);
				return;
			case logPackage.LOGICAL_PROCESSORS_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case logPackage.LOGICAL_PROCESSORS_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case logPackage.LOGICAL_PROCESSORS_TYPE__STEP_DURATION:
				return stepDuration != null;
			case logPackage.LOGICAL_PROCESSORS_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case logPackage.LOGICAL_PROCESSORS_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (number: ");
		result.append(number);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LogicalProcessorsTypeImpl
