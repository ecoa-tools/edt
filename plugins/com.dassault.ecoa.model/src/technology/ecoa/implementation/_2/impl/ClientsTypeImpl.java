/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.implementation._2.ClientsType;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatable;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ClientsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ClientsTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ClientsTypeImpl#getModuleInstance <em>Module Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientsTypeImpl extends MinimalEObjectImpl.Container implements ClientsType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.CLIENTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, impPackage.CLIENTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRef> getService() {
		return getGroup().list(impPackage.Literals.CLIENTS_TYPE__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRefActivatable> getModuleInstance() {
		return getGroup().list(impPackage.Literals.CLIENTS_TYPE__MODULE_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.CLIENTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case impPackage.CLIENTS_TYPE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case impPackage.CLIENTS_TYPE__MODULE_INSTANCE:
				return ((InternalEList<?>)getModuleInstance()).basicRemove(otherEnd, msgs);
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
			case impPackage.CLIENTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case impPackage.CLIENTS_TYPE__SERVICE:
				return getService();
			case impPackage.CLIENTS_TYPE__MODULE_INSTANCE:
				return getModuleInstance();
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
			case impPackage.CLIENTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case impPackage.CLIENTS_TYPE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends OpRef>)newValue);
				return;
			case impPackage.CLIENTS_TYPE__MODULE_INSTANCE:
				getModuleInstance().clear();
				getModuleInstance().addAll((Collection<? extends OpRefActivatable>)newValue);
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
			case impPackage.CLIENTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case impPackage.CLIENTS_TYPE__SERVICE:
				getService().clear();
				return;
			case impPackage.CLIENTS_TYPE__MODULE_INSTANCE:
				getModuleInstance().clear();
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
			case impPackage.CLIENTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case impPackage.CLIENTS_TYPE__SERVICE:
				return !getService().isEmpty();
			case impPackage.CLIENTS_TYPE__MODULE_INSTANCE:
				return !getModuleInstance().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClientsTypeImpl
