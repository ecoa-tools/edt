/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.SchedulingPolicy;
import technology.ecoa.insertion.policy._2.SchedulingPolicyType;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Policy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.SchedulingPolicyTypeImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingPolicyTypeImpl extends MinimalEObjectImpl.Container implements SchedulingPolicyType {
	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingPolicy POLICY_EDEFAULT = SchedulingPolicy.RTFIFO;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicy policy = POLICY_EDEFAULT;

	/**
	 * This is true if the Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean policyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.SCHEDULING_POLICY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(SchedulingPolicy newPolicy) {
		SchedulingPolicy oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		boolean oldPolicyESet = policyESet;
		policyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.SCHEDULING_POLICY_TYPE__POLICY, oldPolicy, policy, !oldPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolicy() {
		SchedulingPolicy oldPolicy = policy;
		boolean oldPolicyESet = policyESet;
		policy = POLICY_EDEFAULT;
		policyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.SCHEDULING_POLICY_TYPE__POLICY, oldPolicy, POLICY_EDEFAULT, oldPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolicy() {
		return policyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.SCHEDULING_POLICY_TYPE__POLICY:
				return getPolicy();
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
			case polPackage.SCHEDULING_POLICY_TYPE__POLICY:
				setPolicy((SchedulingPolicy)newValue);
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
			case polPackage.SCHEDULING_POLICY_TYPE__POLICY:
				unsetPolicy();
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
			case polPackage.SCHEDULING_POLICY_TYPE__POLICY:
				return isSetPolicy();
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
		result.append(" (policy: ");
		if (policyESet) result.append(policy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SchedulingPolicyTypeImpl
