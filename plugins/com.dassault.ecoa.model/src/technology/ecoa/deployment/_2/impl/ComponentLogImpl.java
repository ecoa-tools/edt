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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.deployment._2.ComponentLog;
import technology.ecoa.deployment._2.ModuleLog;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.ComponentLogImpl#getModuleLog <em>Module Log</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ComponentLogImpl#getEnabledLevels <em>Enabled Levels</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ComponentLogImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentLogImpl extends MinimalEObjectImpl.Container implements ComponentLog {
	/**
	 * The cached value of the '{@link #getModuleLog() <em>Module Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleLog()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleLog> moduleLog;

	/**
	 * The default value of the '{@link #getEnabledLevels() <em>Enabled Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledLevels() <em>Enabled Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected String enabledLevels = ENABLED_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.COMPONENT_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleLog> getModuleLog() {
		if (moduleLog == null) {
			moduleLog = new EObjectContainmentEList<ModuleLog>(ModuleLog.class, this, depPackage.COMPONENT_LOG__MODULE_LOG);
		}
		return moduleLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnabledLevels() {
		return enabledLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledLevels(String newEnabledLevels) {
		String oldEnabledLevels = enabledLevels;
		enabledLevels = newEnabledLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.COMPONENT_LOG__ENABLED_LEVELS, oldEnabledLevels, enabledLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.COMPONENT_LOG__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.COMPONENT_LOG__MODULE_LOG:
				return ((InternalEList<?>)getModuleLog()).basicRemove(otherEnd, msgs);
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
			case depPackage.COMPONENT_LOG__MODULE_LOG:
				return getModuleLog();
			case depPackage.COMPONENT_LOG__ENABLED_LEVELS:
				return getEnabledLevels();
			case depPackage.COMPONENT_LOG__INSTANCE_NAME:
				return getInstanceName();
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
			case depPackage.COMPONENT_LOG__MODULE_LOG:
				getModuleLog().clear();
				getModuleLog().addAll((Collection<? extends ModuleLog>)newValue);
				return;
			case depPackage.COMPONENT_LOG__ENABLED_LEVELS:
				setEnabledLevels((String)newValue);
				return;
			case depPackage.COMPONENT_LOG__INSTANCE_NAME:
				setInstanceName((String)newValue);
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
			case depPackage.COMPONENT_LOG__MODULE_LOG:
				getModuleLog().clear();
				return;
			case depPackage.COMPONENT_LOG__ENABLED_LEVELS:
				setEnabledLevels(ENABLED_LEVELS_EDEFAULT);
				return;
			case depPackage.COMPONENT_LOG__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
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
			case depPackage.COMPONENT_LOG__MODULE_LOG:
				return moduleLog != null && !moduleLog.isEmpty();
			case depPackage.COMPONENT_LOG__ENABLED_LEVELS:
				return ENABLED_LEVELS_EDEFAULT == null ? enabledLevels != null : !ENABLED_LEVELS_EDEFAULT.equals(enabledLevels);
			case depPackage.COMPONENT_LOG__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
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
		result.append(" (enabledLevels: ");
		result.append(enabledLevels);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(')');
		return result.toString();
	}

} //ComponentLogImpl
