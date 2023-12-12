/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.VersionedDataRead;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Data Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.VersionedDataReadImpl#isNotifying <em>Notifying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedDataReadImpl extends VersionedDataTypeImpl implements VersionedDataRead {
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
	protected VersionedDataReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.VERSIONED_DATA_READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotifying() {
		return notifying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifying(boolean newNotifying) {
		boolean oldNotifying = notifying;
		notifying = newNotifying;
		boolean oldNotifyingESet = notifyingESet;
		notifyingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING, oldNotifying, notifying, !oldNotifyingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNotifying() {
		boolean oldNotifying = notifying;
		boolean oldNotifyingESet = notifyingESet;
		notifying = NOTIFYING_EDEFAULT;
		notifyingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING, oldNotifying, NOTIFYING_EDEFAULT, oldNotifyingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			case EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING:
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
			case EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING:
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
			case EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING:
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
			case EdtimplementationPackage.VERSIONED_DATA_READ__NOTIFYING:
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

} //VersionedDataReadImpl
