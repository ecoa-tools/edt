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

import org.open.oasis.docs.ns.opencsa.sca.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceImpl#getPromote <em>Promote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ContractImpl implements Service {
	/**
	 * The default value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected String promote = PROMOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPromote() {
		return promote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromote(String newPromote) {
		String oldPromote = promote;
		promote = newPromote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.SERVICE__PROMOTE, oldPromote, promote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scaPackage.SERVICE__PROMOTE:
				return getPromote();
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
			case scaPackage.SERVICE__PROMOTE:
				setPromote((String)newValue);
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
			case scaPackage.SERVICE__PROMOTE:
				setPromote(PROMOTE_EDEFAULT);
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
			case scaPackage.SERVICE__PROMOTE:
				return PROMOTE_EDEFAULT == null ? promote != null : !PROMOTE_EDEFAULT.equals(promote);
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
		result.append(" (promote: ");
		result.append(promote);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
