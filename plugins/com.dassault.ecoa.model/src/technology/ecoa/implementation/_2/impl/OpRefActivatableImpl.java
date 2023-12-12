/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import technology.ecoa.implementation._2.OpRefActivatable;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Ref Activatable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.OpRefActivatableImpl#isActivating <em>Activating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpRefActivatableImpl extends OpRefImpl implements OpRefActivatable {
	/**
	 * The default value of the '{@link #isActivating() <em>Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivating() <em>Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivating()
	 * @generated
	 * @ordered
	 */
	protected boolean activating = ACTIVATING_EDEFAULT;

	/**
	 * This is true if the Activating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpRefActivatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.OP_REF_ACTIVATABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivating() {
		return activating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivating(boolean newActivating) {
		boolean oldActivating = activating;
		activating = newActivating;
		boolean oldActivatingESet = activatingESet;
		activatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.OP_REF_ACTIVATABLE__ACTIVATING, oldActivating, activating, !oldActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivating() {
		boolean oldActivating = activating;
		boolean oldActivatingESet = activatingESet;
		activating = ACTIVATING_EDEFAULT;
		activatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.OP_REF_ACTIVATABLE__ACTIVATING, oldActivating, ACTIVATING_EDEFAULT, oldActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivating() {
		return activatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.OP_REF_ACTIVATABLE__ACTIVATING:
				return isActivating();
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
			case impPackage.OP_REF_ACTIVATABLE__ACTIVATING:
				setActivating((Boolean)newValue);
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
			case impPackage.OP_REF_ACTIVATABLE__ACTIVATING:
				unsetActivating();
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
			case impPackage.OP_REF_ACTIVATABLE__ACTIVATING:
				return isSetActivating();
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
		result.append(" (activating: ");
		if (activatingESet) result.append(activating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OpRefActivatableImpl
