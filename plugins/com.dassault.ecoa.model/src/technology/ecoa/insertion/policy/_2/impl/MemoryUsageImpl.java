/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.insertion.policy._2.MemoryUsage;
import technology.ecoa.insertion.policy._2.ModuleMemoryUsage;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.MemoryUsageImpl#getModuleMemoryUsage <em>Module Memory Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryUsageImpl extends MinimalEObjectImpl.Container implements MemoryUsage {
	/**
	 * The cached value of the '{@link #getModuleMemoryUsage() <em>Module Memory Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMemoryUsage> moduleMemoryUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MEMORY_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMemoryUsage> getModuleMemoryUsage() {
		if (moduleMemoryUsage == null) {
			moduleMemoryUsage = new EObjectContainmentEList<ModuleMemoryUsage>(ModuleMemoryUsage.class, this, polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE);
		}
		return moduleMemoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE:
				return ((InternalEList<?>)getModuleMemoryUsage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE:
				return getModuleMemoryUsage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE:
				getModuleMemoryUsage().clear();
				getModuleMemoryUsage().addAll((Collection<? extends ModuleMemoryUsage>)newValue);
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
			case polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE:
				getModuleMemoryUsage().clear();
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
			case polPackage.MEMORY_USAGE__MODULE_MEMORY_USAGE:
				return moduleMemoryUsage != null && !moduleMemoryUsage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryUsageImpl
