/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.deployment._2.ComponentLog;
import technology.ecoa.deployment._2.LogPolicy;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.LogPolicyImpl#getComponentLog <em>Component Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogPolicyImpl extends MinimalEObjectImpl.Container implements LogPolicy {
	/**
	 * The cached value of the '{@link #getComponentLog() <em>Component Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentLog()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentLog> componentLog;

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
		return depPackage.Literals.LOG_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentLog> getComponentLog() {
		if (componentLog == null) {
			componentLog = new EObjectContainmentEList<ComponentLog>(ComponentLog.class, this, depPackage.LOG_POLICY__COMPONENT_LOG);
		}
		return componentLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.LOG_POLICY__COMPONENT_LOG:
				return ((InternalEList<?>)getComponentLog()).basicRemove(otherEnd, msgs);
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
			case depPackage.LOG_POLICY__COMPONENT_LOG:
				return getComponentLog();
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
			case depPackage.LOG_POLICY__COMPONENT_LOG:
				getComponentLog().clear();
				getComponentLog().addAll((Collection<? extends ComponentLog>)newValue);
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
			case depPackage.LOG_POLICY__COMPONENT_LOG:
				getComponentLog().clear();
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
			case depPackage.LOG_POLICY__COMPONENT_LOG:
				return componentLog != null && !componentLog.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogPolicyImpl
