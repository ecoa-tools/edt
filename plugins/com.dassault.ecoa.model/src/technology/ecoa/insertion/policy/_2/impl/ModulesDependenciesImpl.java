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

import technology.ecoa.insertion.policy._2.ModuleDependencies;
import technology.ecoa.insertion.policy._2.ModulesDependencies;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modules Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModulesDependenciesImpl#getModuleDependencies <em>Module Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModulesDependenciesImpl extends MinimalEObjectImpl.Container implements ModulesDependencies {
	/**
	 * The cached value of the '{@link #getModuleDependencies() <em>Module Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDependencies> moduleDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULES_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDependencies> getModuleDependencies() {
		if (moduleDependencies == null) {
			moduleDependencies = new EObjectContainmentEList<ModuleDependencies>(ModuleDependencies.class, this, polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES);
		}
		return moduleDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES:
				return ((InternalEList<?>)getModuleDependencies()).basicRemove(otherEnd, msgs);
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
			case polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES:
				return getModuleDependencies();
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
			case polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES:
				getModuleDependencies().clear();
				getModuleDependencies().addAll((Collection<? extends ModuleDependencies>)newValue);
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
			case polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES:
				getModuleDependencies().clear();
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
			case polPackage.MODULES_DEPENDENCIES__MODULE_DEPENDENCIES:
				return moduleDependencies != null && !moduleDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModulesDependenciesImpl
