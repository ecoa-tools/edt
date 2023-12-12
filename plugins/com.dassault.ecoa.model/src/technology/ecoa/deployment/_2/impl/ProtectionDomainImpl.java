/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.deployment._2.DeployedModuleInstanceType;
import technology.ecoa.deployment._2.DeployedTriggerInstanceType;
import technology.ecoa.deployment._2.ExecuteOnType;
import technology.ecoa.deployment._2.ProtectionDomain;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl#getExecuteOn <em>Execute On</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl#getDeployedModuleInstance <em>Deployed Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl#getDeployedTriggerInstance <em>Deployed Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionDomainImpl extends MinimalEObjectImpl.Container implements ProtectionDomain {
	/**
	 * The cached value of the '{@link #getExecuteOn() <em>Execute On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteOn()
	 * @generated
	 * @ordered
	 */
	protected ExecuteOnType executeOn;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.PROTECTION_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteOnType getExecuteOn() {
		return executeOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecuteOn(ExecuteOnType newExecuteOn, NotificationChain msgs) {
		ExecuteOnType oldExecuteOn = executeOn;
		executeOn = newExecuteOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, depPackage.PROTECTION_DOMAIN__EXECUTE_ON, oldExecuteOn, newExecuteOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteOn(ExecuteOnType newExecuteOn) {
		if (newExecuteOn != executeOn) {
			NotificationChain msgs = null;
			if (executeOn != null)
				msgs = ((InternalEObject)executeOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - depPackage.PROTECTION_DOMAIN__EXECUTE_ON, null, msgs);
			if (newExecuteOn != null)
				msgs = ((InternalEObject)newExecuteOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - depPackage.PROTECTION_DOMAIN__EXECUTE_ON, null, msgs);
			msgs = basicSetExecuteOn(newExecuteOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PROTECTION_DOMAIN__EXECUTE_ON, newExecuteOn, newExecuteOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, depPackage.PROTECTION_DOMAIN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedModuleInstanceType> getDeployedModuleInstance() {
		return getGroup().list(depPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedTriggerInstanceType> getDeployedTriggerInstance() {
		return getGroup().list(depPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PROTECTION_DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.PROTECTION_DOMAIN__EXECUTE_ON:
				return basicSetExecuteOn(null, msgs);
			case depPackage.PROTECTION_DOMAIN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE:
				return ((InternalEList<?>)getDeployedModuleInstance()).basicRemove(otherEnd, msgs);
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE:
				return ((InternalEList<?>)getDeployedTriggerInstance()).basicRemove(otherEnd, msgs);
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
			case depPackage.PROTECTION_DOMAIN__EXECUTE_ON:
				return getExecuteOn();
			case depPackage.PROTECTION_DOMAIN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE:
				return getDeployedModuleInstance();
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE:
				return getDeployedTriggerInstance();
			case depPackage.PROTECTION_DOMAIN__NAME:
				return getName();
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
			case depPackage.PROTECTION_DOMAIN__EXECUTE_ON:
				setExecuteOn((ExecuteOnType)newValue);
				return;
			case depPackage.PROTECTION_DOMAIN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE:
				getDeployedModuleInstance().clear();
				getDeployedModuleInstance().addAll((Collection<? extends DeployedModuleInstanceType>)newValue);
				return;
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE:
				getDeployedTriggerInstance().clear();
				getDeployedTriggerInstance().addAll((Collection<? extends DeployedTriggerInstanceType>)newValue);
				return;
			case depPackage.PROTECTION_DOMAIN__NAME:
				setName((String)newValue);
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
			case depPackage.PROTECTION_DOMAIN__EXECUTE_ON:
				setExecuteOn((ExecuteOnType)null);
				return;
			case depPackage.PROTECTION_DOMAIN__GROUP:
				getGroup().clear();
				return;
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE:
				getDeployedModuleInstance().clear();
				return;
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE:
				getDeployedTriggerInstance().clear();
				return;
			case depPackage.PROTECTION_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
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
			case depPackage.PROTECTION_DOMAIN__EXECUTE_ON:
				return executeOn != null;
			case depPackage.PROTECTION_DOMAIN__GROUP:
				return group != null && !group.isEmpty();
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE:
				return !getDeployedModuleInstance().isEmpty();
			case depPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE:
				return !getDeployedTriggerInstance().isEmpty();
			case depPackage.PROTECTION_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProtectionDomainImpl
