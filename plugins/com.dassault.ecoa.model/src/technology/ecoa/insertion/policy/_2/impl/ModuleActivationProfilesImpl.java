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

import technology.ecoa.insertion.policy._2.ModuleActivationProfile;
import technology.ecoa.insertion.policy._2.ModuleActivationProfiles;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Activation Profiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfilesImpl#getActivationProfile <em>Activation Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleActivationProfilesImpl extends MinimalEObjectImpl.Container implements ModuleActivationProfiles {
	/**
	 * The cached value of the '{@link #getActivationProfile() <em>Activation Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleActivationProfile> activationProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleActivationProfilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULE_ACTIVATION_PROFILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleActivationProfile> getActivationProfile() {
		if (activationProfile == null) {
			activationProfile = new EObjectContainmentEList<ModuleActivationProfile>(ModuleActivationProfile.class, this, polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE);
		}
		return activationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE:
				return ((InternalEList<?>)getActivationProfile()).basicRemove(otherEnd, msgs);
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
			case polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE:
				return getActivationProfile();
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
			case polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE:
				getActivationProfile().clear();
				getActivationProfile().addAll((Collection<? extends ModuleActivationProfile>)newValue);
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
			case polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE:
				getActivationProfile().clear();
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
			case polPackage.MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE:
				return activationProfile != null && !activationProfile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleActivationProfilesImpl
