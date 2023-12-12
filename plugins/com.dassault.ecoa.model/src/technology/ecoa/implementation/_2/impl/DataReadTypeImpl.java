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

import technology.ecoa.implementation._2.DataReadType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Read Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.DataReadTypeImpl#isNotifying <em>Notifying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataReadTypeImpl extends VersionedDataImpl implements DataReadType {
	/**
	 * The default value of the '{@link #isNotifying() <em>Notifying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotifying()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOTIFYING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotifying() <em>Notifying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotifying()
	 * @generated
	 * @ordered
	 */
	protected boolean notifying = NOTIFYING_EDEFAULT;

	/**
	 * This is true if the Notifying attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notifyingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataReadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.DATA_READ_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotifying() {
		return notifying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifying(boolean newNotifying) {
		boolean oldNotifying = notifying;
		notifying = newNotifying;
		boolean oldNotifyingESet = notifyingESet;
		notifyingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.DATA_READ_TYPE__NOTIFYING, oldNotifying, notifying, !oldNotifyingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotifying() {
		boolean oldNotifying = notifying;
		boolean oldNotifyingESet = notifyingESet;
		notifying = NOTIFYING_EDEFAULT;
		notifyingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.DATA_READ_TYPE__NOTIFYING, oldNotifying, NOTIFYING_EDEFAULT, oldNotifyingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotifying() {
		return notifyingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.DATA_READ_TYPE__NOTIFYING:
				return isNotifying();
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
			case impPackage.DATA_READ_TYPE__NOTIFYING:
				setNotifying((Boolean)newValue);
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
			case impPackage.DATA_READ_TYPE__NOTIFYING:
				unsetNotifying();
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
			case impPackage.DATA_READ_TYPE__NOTIFYING:
				return isSetNotifying();
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
		result.append(" (notifying: ");
		if (notifyingESet) result.append(notifying); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataReadTypeImpl
