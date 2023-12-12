/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import technology.ecoa.implementation._2.OpRefActivatingFifo;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Ref Activating Fifo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.OpRefActivatingFifoImpl#getFifoSize <em>Fifo Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpRefActivatingFifoImpl extends OpRefImpl implements OpRefActivatingFifo {
	/**
	 * The default value of the '{@link #getFifoSize() <em>Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIFO_SIZE_EDEFAULT = new BigInteger("8");

	/**
	 * The cached value of the '{@link #getFifoSize() <em>Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fifoSize = FIFO_SIZE_EDEFAULT;

	/**
	 * This is true if the Fifo Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fifoSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpRefActivatingFifoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.OP_REF_ACTIVATING_FIFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFifoSize() {
		return fifoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFifoSize(BigInteger newFifoSize) {
		BigInteger oldFifoSize = fifoSize;
		fifoSize = newFifoSize;
		boolean oldFifoSizeESet = fifoSizeESet;
		fifoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE, oldFifoSize, fifoSize, !oldFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFifoSize() {
		BigInteger oldFifoSize = fifoSize;
		boolean oldFifoSizeESet = fifoSizeESet;
		fifoSize = FIFO_SIZE_EDEFAULT;
		fifoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE, oldFifoSize, FIFO_SIZE_EDEFAULT, oldFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFifoSize() {
		return fifoSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE:
				return getFifoSize();
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
			case impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE:
				setFifoSize((BigInteger)newValue);
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
			case impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE:
				unsetFifoSize();
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
			case impPackage.OP_REF_ACTIVATING_FIFO__FIFO_SIZE:
				return isSetFifoSize();
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
		result.append(" (fifoSize: ");
		if (fifoSizeESet) result.append(fifoSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OpRefActivatingFifoImpl
