/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.deployment._2.DeployedModuleInstanceType;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Module Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl#getModuleInstanceName <em>Module Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl#getModulePriority <em>Module Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedModuleInstanceTypeImpl extends MinimalEObjectImpl.Container implements DeployedModuleInstanceType {
	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleInstanceName() <em>Module Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleInstanceName() <em>Module Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String moduleInstanceName = MODULE_INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulePriority() <em>Module Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODULE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulePriority() <em>Module Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePriority()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modulePriority = MODULE_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedModuleInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.DEPLOYED_MODULE_INSTANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleInstanceName() {
		return moduleInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleInstanceName(String newModuleInstanceName) {
		String oldModuleInstanceName = moduleInstanceName;
		moduleInstanceName = newModuleInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME, oldModuleInstanceName, moduleInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getModulePriority() {
		return modulePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulePriority(BigDecimal newModulePriority) {
		BigDecimal oldModulePriority = modulePriority;
		modulePriority = newModulePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY, oldModulePriority, modulePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME:
				return getComponentName();
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME:
				return getModuleInstanceName();
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY:
				return getModulePriority();
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
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME:
				setModuleInstanceName((String)newValue);
				return;
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY:
				setModulePriority((BigDecimal)newValue);
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
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME:
				setModuleInstanceName(MODULE_INSTANCE_NAME_EDEFAULT);
				return;
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY:
				setModulePriority(MODULE_PRIORITY_EDEFAULT);
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
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME:
				return MODULE_INSTANCE_NAME_EDEFAULT == null ? moduleInstanceName != null : !MODULE_INSTANCE_NAME_EDEFAULT.equals(moduleInstanceName);
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY:
				return MODULE_PRIORITY_EDEFAULT == null ? modulePriority != null : !MODULE_PRIORITY_EDEFAULT.equals(modulePriority);
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
		result.append(" (componentName: ");
		result.append(componentName);
		result.append(", moduleInstanceName: ");
		result.append(moduleInstanceName);
		result.append(", modulePriority: ");
		result.append(modulePriority);
		result.append(')');
		return result.toString();
	}

} //DeployedModuleInstanceTypeImpl
