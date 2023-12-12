/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyImpl#isMustSupply <em>Must Supply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends SCAPropertyBaseImpl implements Property {
	/**
	 * The default value of the '{@link #isMustSupply() <em>Must Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustSupply() <em>Must Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustSupply()
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupply = MUST_SUPPLY_EDEFAULT;

	/**
	 * This is true if the Must Supply attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupplyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustSupply() {
		return mustSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupply(boolean newMustSupply) {
		boolean oldMustSupply = mustSupply;
		mustSupply = newMustSupply;
		boolean oldMustSupplyESet = mustSupplyESet;
		mustSupplyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.PROPERTY__MUST_SUPPLY, oldMustSupply, mustSupply, !oldMustSupplyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMustSupply() {
		boolean oldMustSupply = mustSupply;
		boolean oldMustSupplyESet = mustSupplyESet;
		mustSupply = MUST_SUPPLY_EDEFAULT;
		mustSupplyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scaPackage.PROPERTY__MUST_SUPPLY, oldMustSupply, MUST_SUPPLY_EDEFAULT, oldMustSupplyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMustSupply() {
		return mustSupplyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scaPackage.PROPERTY__MUST_SUPPLY:
				return isMustSupply();
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
			case scaPackage.PROPERTY__MUST_SUPPLY:
				setMustSupply((Boolean)newValue);
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
			case scaPackage.PROPERTY__MUST_SUPPLY:
				unsetMustSupply();
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
			case scaPackage.PROPERTY__MUST_SUPPLY:
				return isSetMustSupply();
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
		result.append(" (mustSupply: ");
		if (mustSupplyESet) result.append(mustSupply); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
