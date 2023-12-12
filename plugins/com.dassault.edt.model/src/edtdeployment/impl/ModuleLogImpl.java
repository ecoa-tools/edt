/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ModuleLog;
import edtimplementation.ModuleInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module
 * Log</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.impl.ModuleLogImpl#getEnabledLevels <em>Enabled
 * Levels</em>}</li>
 * <li>{@link edtdeployment.impl.ModuleLogImpl#getModuleInstance <em>Module
 * Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleLogImpl extends MinimalEObjectImpl.Container implements ModuleLog {
	/**
	 * The default value of the '{@link #getEnabledLevels() <em>Enabled
	 * Levels</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledLevels() <em>Enabled Levels</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected String enabledLevels = ENABLED_LEVELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleInstance() <em>Module
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected ModuleInstance moduleInstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModuleLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.MODULE_LOG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEnabledLevels() {
		return enabledLevels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEnabledLevels(String newEnabledLevels) {
		String oldEnabledLevels = enabledLevels;
		enabledLevels = newEnabledLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.MODULE_LOG__ENABLED_LEVELS,
					oldEnabledLevels, enabledLevels));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ModuleInstance getModuleInstance() {
		if (moduleInstance != null && moduleInstance.eIsProxy()) {
			InternalEObject oldModuleInstance = (InternalEObject) moduleInstance;
			moduleInstance = (ModuleInstance) eResolveProxy(oldModuleInstance);
			if (moduleInstance != oldModuleInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE, oldModuleInstance, moduleInstance));
			}
		}
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleInstance basicGetModuleInstance() {
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setModuleInstance(ModuleInstance newModuleInstance) {
		ModuleInstance oldModuleInstance = moduleInstance;
		moduleInstance = newModuleInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE,
					oldModuleInstance, moduleInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtdeploymentPackage.MODULE_LOG__ENABLED_LEVELS:
			return getEnabledLevels();
		case EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE:
			if (resolve)
				return getModuleInstance();
			return basicGetModuleInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtdeploymentPackage.MODULE_LOG__ENABLED_LEVELS:
			setEnabledLevels((String) newValue);
			return;
		case EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE:
			setModuleInstance((ModuleInstance) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EdtdeploymentPackage.MODULE_LOG__ENABLED_LEVELS:
			setEnabledLevels(ENABLED_LEVELS_EDEFAULT);
			return;
		case EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE:
			setModuleInstance((ModuleInstance) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EdtdeploymentPackage.MODULE_LOG__ENABLED_LEVELS:
			return ENABLED_LEVELS_EDEFAULT == null ? enabledLevels != null
					: !ENABLED_LEVELS_EDEFAULT.equals(enabledLevels);
		case EdtdeploymentPackage.MODULE_LOG__MODULE_INSTANCE:
			return moduleInstance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (enabledLevels: ");
		result.append(enabledLevels);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getModuleInstance() != null && this.getEnabledLevels() != null
				&& !this.getEnabledLevels().isBlank());
	}

} // ModuleLogImpl
