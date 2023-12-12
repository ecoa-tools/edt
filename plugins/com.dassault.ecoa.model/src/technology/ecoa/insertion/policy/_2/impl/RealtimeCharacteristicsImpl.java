/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.ModuleActivationProfiles;
import technology.ecoa.insertion.policy._2.RealtimeCharacteristics;
import technology.ecoa.insertion.policy._2.SchedulingPolicyType;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl#getModuleActivationProfiles <em>Module Activation Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealtimeCharacteristicsImpl extends MinimalEObjectImpl.Container implements RealtimeCharacteristics {
	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicyType schedulingPolicy;

	/**
	 * The cached value of the '{@link #getModuleActivationProfiles() <em>Module Activation Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleActivationProfiles()
	 * @generated
	 * @ordered
	 */
	protected ModuleActivationProfiles moduleActivationProfiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.REALTIME_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyType getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingPolicy(SchedulingPolicyType newSchedulingPolicy, NotificationChain msgs) {
		SchedulingPolicyType oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY, oldSchedulingPolicy, newSchedulingPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(SchedulingPolicyType newSchedulingPolicy) {
		if (newSchedulingPolicy != schedulingPolicy) {
			NotificationChain msgs = null;
			if (schedulingPolicy != null)
				msgs = ((InternalEObject)schedulingPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY, null, msgs);
			if (newSchedulingPolicy != null)
				msgs = ((InternalEObject)newSchedulingPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY, null, msgs);
			msgs = basicSetSchedulingPolicy(newSchedulingPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY, newSchedulingPolicy, newSchedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleActivationProfiles getModuleActivationProfiles() {
		return moduleActivationProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleActivationProfiles(ModuleActivationProfiles newModuleActivationProfiles, NotificationChain msgs) {
		ModuleActivationProfiles oldModuleActivationProfiles = moduleActivationProfiles;
		moduleActivationProfiles = newModuleActivationProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES, oldModuleActivationProfiles, newModuleActivationProfiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleActivationProfiles(ModuleActivationProfiles newModuleActivationProfiles) {
		if (newModuleActivationProfiles != moduleActivationProfiles) {
			NotificationChain msgs = null;
			if (moduleActivationProfiles != null)
				msgs = ((InternalEObject)moduleActivationProfiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES, null, msgs);
			if (newModuleActivationProfiles != null)
				msgs = ((InternalEObject)newModuleActivationProfiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES, null, msgs);
			msgs = basicSetModuleActivationProfiles(newModuleActivationProfiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES, newModuleActivationProfiles, newModuleActivationProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY:
				return basicSetSchedulingPolicy(null, msgs);
			case polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES:
				return basicSetModuleActivationProfiles(null, msgs);
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
			case polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY:
				return getSchedulingPolicy();
			case polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES:
				return getModuleActivationProfiles();
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
			case polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY:
				setSchedulingPolicy((SchedulingPolicyType)newValue);
				return;
			case polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES:
				setModuleActivationProfiles((ModuleActivationProfiles)newValue);
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
			case polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY:
				setSchedulingPolicy((SchedulingPolicyType)null);
				return;
			case polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES:
				setModuleActivationProfiles((ModuleActivationProfiles)null);
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
			case polPackage.REALTIME_CHARACTERISTICS__SCHEDULING_POLICY:
				return schedulingPolicy != null;
			case polPackage.REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES:
				return moduleActivationProfiles != null;
		}
		return super.eIsSet(featureID);
	}

} //RealtimeCharacteristicsImpl
