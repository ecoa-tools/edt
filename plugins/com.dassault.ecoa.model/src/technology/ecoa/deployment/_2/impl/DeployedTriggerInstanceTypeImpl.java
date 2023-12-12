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

import technology.ecoa.deployment._2.DeployedTriggerInstanceType;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Trigger Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl#getTriggerInstanceName <em>Trigger Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl#getTriggerPriority <em>Trigger Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedTriggerInstanceTypeImpl extends MinimalEObjectImpl.Container implements DeployedTriggerInstanceType {
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
	 * The default value of the '{@link #getTriggerInstanceName() <em>Trigger Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerInstanceName() <em>Trigger Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String triggerInstanceName = TRIGGER_INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerPriority() <em>Trigger Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TRIGGER_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerPriority() <em>Trigger Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPriority()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal triggerPriority = TRIGGER_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedTriggerInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.DEPLOYED_TRIGGER_INSTANCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerInstanceName() {
		return triggerInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerInstanceName(String newTriggerInstanceName) {
		String oldTriggerInstanceName = triggerInstanceName;
		triggerInstanceName = newTriggerInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME, oldTriggerInstanceName, triggerInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTriggerPriority() {
		return triggerPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerPriority(BigDecimal newTriggerPriority) {
		BigDecimal oldTriggerPriority = triggerPriority;
		triggerPriority = newTriggerPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY, oldTriggerPriority, triggerPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME:
				return getComponentName();
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME:
				return getTriggerInstanceName();
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY:
				return getTriggerPriority();
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
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME:
				setTriggerInstanceName((String)newValue);
				return;
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY:
				setTriggerPriority((BigDecimal)newValue);
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
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME:
				setTriggerInstanceName(TRIGGER_INSTANCE_NAME_EDEFAULT);
				return;
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY:
				setTriggerPriority(TRIGGER_PRIORITY_EDEFAULT);
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
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME:
				return TRIGGER_INSTANCE_NAME_EDEFAULT == null ? triggerInstanceName != null : !TRIGGER_INSTANCE_NAME_EDEFAULT.equals(triggerInstanceName);
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY:
				return TRIGGER_PRIORITY_EDEFAULT == null ? triggerPriority != null : !TRIGGER_PRIORITY_EDEFAULT.equals(triggerPriority);
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
		result.append(", triggerInstanceName: ");
		result.append(triggerInstanceName);
		result.append(", triggerPriority: ");
		result.append(triggerPriority);
		result.append(')');
		return result.toString();
	}

} //DeployedTriggerInstanceTypeImpl
