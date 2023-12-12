/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtdeployment.ComponentLog;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.LogPolicy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.LogPolicyImpl#getComponentLogs <em>Component Logs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogPolicyImpl extends MinimalEObjectImpl.Container implements LogPolicy {
	/**
	 * The cached value of the '{@link #getComponentLogs() <em>Component Logs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentLog> componentLogs;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.LOG_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentLog> getComponentLogs() {
		if (componentLogs == null) {
			componentLogs = new EObjectContainmentEList<ComponentLog>(ComponentLog.class, this, EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS);
		}
		return componentLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS:
				return ((InternalEList<?>)getComponentLogs()).basicRemove(otherEnd, msgs);
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
			case EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS:
				return getComponentLogs();
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
			case EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS:
				getComponentLogs().clear();
				getComponentLogs().addAll((Collection<? extends ComponentLog>)newValue);
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
			case EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS:
				getComponentLogs().clear();
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
			case EdtdeploymentPackage.LOG_POLICY__COMPONENT_LOGS:
				return componentLogs != null && !componentLogs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogPolicyImpl
