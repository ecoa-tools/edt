/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.AllocationType;
import technology.ecoa.insertion.policy._2.DynamicMemoryType;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Memory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicMemoryTypeImpl extends MinimalEObjectImpl.Container implements DynamicMemoryType {
	/**
	 * The default value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final AllocationType ALLOCATION_EDEFAULT = AllocationType.YES;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected AllocationType allocation = ALLOCATION_EDEFAULT;

	/**
	 * This is true if the Allocation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allocationESet;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicMemoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.DYNAMIC_MEMORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationType getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(AllocationType newAllocation) {
		AllocationType oldAllocation = allocation;
		allocation = newAllocation == null ? ALLOCATION_EDEFAULT : newAllocation;
		boolean oldAllocationESet = allocationESet;
		allocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION, oldAllocation, allocation, !oldAllocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllocation() {
		AllocationType oldAllocation = allocation;
		boolean oldAllocationESet = allocationESet;
		allocation = ALLOCATION_EDEFAULT;
		allocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION, oldAllocation, ALLOCATION_EDEFAULT, oldAllocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllocation() {
		return allocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(BigInteger newMaxSize) {
		BigInteger oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.DYNAMIC_MEMORY_TYPE__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION:
				return getAllocation();
			case polPackage.DYNAMIC_MEMORY_TYPE__MAX_SIZE:
				return getMaxSize();
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
			case polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION:
				setAllocation((AllocationType)newValue);
				return;
			case polPackage.DYNAMIC_MEMORY_TYPE__MAX_SIZE:
				setMaxSize((BigInteger)newValue);
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
			case polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION:
				unsetAllocation();
				return;
			case polPackage.DYNAMIC_MEMORY_TYPE__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
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
			case polPackage.DYNAMIC_MEMORY_TYPE__ALLOCATION:
				return isSetAllocation();
			case polPackage.DYNAMIC_MEMORY_TYPE__MAX_SIZE:
				return MAX_SIZE_EDEFAULT == null ? maxSize != null : !MAX_SIZE_EDEFAULT.equals(maxSize);
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
		result.append(" (allocation: ");
		if (allocationESet) result.append(allocation); else result.append("<unset>");
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(')');
		return result.toString();
	}

} //DynamicMemoryTypeImpl
