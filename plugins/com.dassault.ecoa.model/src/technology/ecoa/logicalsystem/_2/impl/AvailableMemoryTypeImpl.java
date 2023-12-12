/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.logicalsystem._2.AvailableMemoryType;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Available Memory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.AvailableMemoryTypeImpl#getGigaBytes <em>Giga Bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailableMemoryTypeImpl extends MinimalEObjectImpl.Container implements AvailableMemoryType {
	/**
	 * The default value of the '{@link #getGigaBytes() <em>Giga Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGigaBytes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GIGA_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGigaBytes() <em>Giga Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGigaBytes()
	 * @generated
	 * @ordered
	 */
	protected BigInteger gigaBytes = GIGA_BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableMemoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.AVAILABLE_MEMORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getGigaBytes() {
		return gigaBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGigaBytes(BigInteger newGigaBytes) {
		BigInteger oldGigaBytes = gigaBytes;
		gigaBytes = newGigaBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.AVAILABLE_MEMORY_TYPE__GIGA_BYTES, oldGigaBytes, gigaBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case logPackage.AVAILABLE_MEMORY_TYPE__GIGA_BYTES:
				return getGigaBytes();
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
			case logPackage.AVAILABLE_MEMORY_TYPE__GIGA_BYTES:
				setGigaBytes((BigInteger)newValue);
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
			case logPackage.AVAILABLE_MEMORY_TYPE__GIGA_BYTES:
				setGigaBytes(GIGA_BYTES_EDEFAULT);
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
			case logPackage.AVAILABLE_MEMORY_TYPE__GIGA_BYTES:
				return GIGA_BYTES_EDEFAULT == null ? gigaBytes != null : !GIGA_BYTES_EDEFAULT.equals(gigaBytes);
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
		result.append(" (gigaBytes: ");
		result.append(gigaBytes);
		result.append(')');
		return result.toString();
	}

} //AvailableMemoryTypeImpl
