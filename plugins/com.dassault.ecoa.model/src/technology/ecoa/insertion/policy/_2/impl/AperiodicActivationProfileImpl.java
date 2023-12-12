/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.AperiodicActivationProfile;
import technology.ecoa.insertion.policy._2.HighestActivationRate;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aperiodic Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl#getWcet <em>Wcet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AperiodicActivationProfileImpl extends MinimalEObjectImpl.Container implements AperiodicActivationProfile {
	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected HighestActivationRate rate;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final double DEADLINE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected double deadline = DEADLINE_EDEFAULT;

	/**
	 * This is true if the Deadline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadlineESet;

	/**
	 * The default value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RELATIVE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger relativePriority = RELATIVE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected static final double WCET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected double wcet = WCET_EDEFAULT;

	/**
	 * This is true if the Wcet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wcetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AperiodicActivationProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.APERIODIC_ACTIVATION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestActivationRate getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(HighestActivationRate newRate, NotificationChain msgs) {
		HighestActivationRate oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.APERIODIC_ACTIVATION_PROFILE__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(HighestActivationRate newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.APERIODIC_ACTIVATION_PROFILE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.APERIODIC_ACTIVATION_PROFILE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.APERIODIC_ACTIVATION_PROFILE__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(double newDeadline) {
		double oldDeadline = deadline;
		deadline = newDeadline;
		boolean oldDeadlineESet = deadlineESet;
		deadlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadline() {
		double oldDeadline = deadline;
		boolean oldDeadlineESet = deadlineESet;
		deadline = DEADLINE_EDEFAULT;
		deadlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadline() {
		return deadlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRelativePriority() {
		return relativePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePriority(BigInteger newRelativePriority) {
		BigInteger oldRelativePriority = relativePriority;
		relativePriority = newRelativePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(double newWcet) {
		double oldWcet = wcet;
		wcet = newWcet;
		boolean oldWcetESet = wcetESet;
		wcetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.APERIODIC_ACTIVATION_PROFILE__WCET, oldWcet, wcet, !oldWcetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWcet() {
		double oldWcet = wcet;
		boolean oldWcetESet = wcetESet;
		wcet = WCET_EDEFAULT;
		wcetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.APERIODIC_ACTIVATION_PROFILE__WCET, oldWcet, WCET_EDEFAULT, oldWcetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWcet() {
		return wcetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RATE:
				return basicSetRate(null, msgs);
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
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RATE:
				return getRate();
			case polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE:
				return getDeadline();
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY:
				return getRelativePriority();
			case polPackage.APERIODIC_ACTIVATION_PROFILE__WCET:
				return getWcet();
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
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RATE:
				setRate((HighestActivationRate)newValue);
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE:
				setDeadline((Double)newValue);
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY:
				setRelativePriority((BigInteger)newValue);
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__WCET:
				setWcet((Double)newValue);
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
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RATE:
				setRate((HighestActivationRate)null);
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE:
				unsetDeadline();
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
				return;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__WCET:
				unsetWcet();
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
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RATE:
				return rate != null;
			case polPackage.APERIODIC_ACTIVATION_PROFILE__DEADLINE:
				return isSetDeadline();
			case polPackage.APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY:
				return RELATIVE_PRIORITY_EDEFAULT == null ? relativePriority != null : !RELATIVE_PRIORITY_EDEFAULT.equals(relativePriority);
			case polPackage.APERIODIC_ACTIVATION_PROFILE__WCET:
				return isSetWcet();
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
		result.append(" (deadline: ");
		if (deadlineESet) result.append(deadline); else result.append("<unset>");
		result.append(", relativePriority: ");
		result.append(relativePriority);
		result.append(", wcet: ");
		if (wcetESet) result.append(wcet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AperiodicActivationProfileImpl
