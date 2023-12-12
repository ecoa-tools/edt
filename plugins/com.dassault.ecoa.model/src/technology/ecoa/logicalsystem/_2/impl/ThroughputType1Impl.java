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

import technology.ecoa.logicalsystem._2.ThroughputType1;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throughput Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.ThroughputType1Impl#getMegaBytesPerSecond <em>Mega Bytes Per Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThroughputType1Impl extends MinimalEObjectImpl.Container implements ThroughputType1 {
	/**
	 * The default value of the '{@link #getMegaBytesPerSecond() <em>Mega Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMegaBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEGA_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMegaBytesPerSecond() <em>Mega Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMegaBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected BigInteger megaBytesPerSecond = MEGA_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThroughputType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.THROUGHPUT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMegaBytesPerSecond() {
		return megaBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMegaBytesPerSecond(BigInteger newMegaBytesPerSecond) {
		BigInteger oldMegaBytesPerSecond = megaBytesPerSecond;
		megaBytesPerSecond = newMegaBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND, oldMegaBytesPerSecond, megaBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case logPackage.THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND:
				return getMegaBytesPerSecond();
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
			case logPackage.THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND:
				setMegaBytesPerSecond((BigInteger)newValue);
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
			case logPackage.THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND:
				setMegaBytesPerSecond(MEGA_BYTES_PER_SECOND_EDEFAULT);
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
			case logPackage.THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND:
				return MEGA_BYTES_PER_SECOND_EDEFAULT == null ? megaBytesPerSecond != null : !MEGA_BYTES_PER_SECOND_EDEFAULT.equals(megaBytesPerSecond);
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
		result.append(" (megaBytesPerSecond: ");
		result.append(megaBytesPerSecond);
		result.append(')');
		return result.toString();
	}

} //ThroughputType1Impl
