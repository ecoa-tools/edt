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

import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefExternal;
import technology.ecoa.implementation._2.OpRefTrigger;
import technology.ecoa.implementation._2.SendersType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Senders Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getDynamicTrigger <em>Dynamic Trigger</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.SendersTypeImpl#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendersTypeImpl extends MinimalEObjectImpl.Container implements SendersType {
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
	protected SendersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.SENDERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, impPackage.SENDERS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRef> getService() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRef> getReference() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRef> getModuleInstance() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__MODULE_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRefTrigger> getTrigger() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__TRIGGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRef> getDynamicTrigger() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__DYNAMIC_TRIGGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpRefExternal> getExternal() {
		return getGroup().list(impPackage.Literals.SENDERS_TYPE__EXTERNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.SENDERS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__MODULE_INSTANCE:
				return ((InternalEList<?>)getModuleInstance()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__DYNAMIC_TRIGGER:
				return ((InternalEList<?>)getDynamicTrigger()).basicRemove(otherEnd, msgs);
			case impPackage.SENDERS_TYPE__EXTERNAL:
				return ((InternalEList<?>)getExternal()).basicRemove(otherEnd, msgs);
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
			case impPackage.SENDERS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case impPackage.SENDERS_TYPE__SERVICE:
				return getService();
			case impPackage.SENDERS_TYPE__REFERENCE:
				return getReference();
			case impPackage.SENDERS_TYPE__MODULE_INSTANCE:
				return getModuleInstance();
			case impPackage.SENDERS_TYPE__TRIGGER:
				return getTrigger();
			case impPackage.SENDERS_TYPE__DYNAMIC_TRIGGER:
				return getDynamicTrigger();
			case impPackage.SENDERS_TYPE__EXTERNAL:
				return getExternal();
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
			case impPackage.SENDERS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case impPackage.SENDERS_TYPE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends OpRef>)newValue);
				return;
			case impPackage.SENDERS_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends OpRef>)newValue);
				return;
			case impPackage.SENDERS_TYPE__MODULE_INSTANCE:
				getModuleInstance().clear();
				getModuleInstance().addAll((Collection<? extends OpRef>)newValue);
				return;
			case impPackage.SENDERS_TYPE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends OpRefTrigger>)newValue);
				return;
			case impPackage.SENDERS_TYPE__DYNAMIC_TRIGGER:
				getDynamicTrigger().clear();
				getDynamicTrigger().addAll((Collection<? extends OpRef>)newValue);
				return;
			case impPackage.SENDERS_TYPE__EXTERNAL:
				getExternal().clear();
				getExternal().addAll((Collection<? extends OpRefExternal>)newValue);
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
			case impPackage.SENDERS_TYPE__GROUP:
				getGroup().clear();
				return;
			case impPackage.SENDERS_TYPE__SERVICE:
				getService().clear();
				return;
			case impPackage.SENDERS_TYPE__REFERENCE:
				getReference().clear();
				return;
			case impPackage.SENDERS_TYPE__MODULE_INSTANCE:
				getModuleInstance().clear();
				return;
			case impPackage.SENDERS_TYPE__TRIGGER:
				getTrigger().clear();
				return;
			case impPackage.SENDERS_TYPE__DYNAMIC_TRIGGER:
				getDynamicTrigger().clear();
				return;
			case impPackage.SENDERS_TYPE__EXTERNAL:
				getExternal().clear();
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
			case impPackage.SENDERS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case impPackage.SENDERS_TYPE__SERVICE:
				return !getService().isEmpty();
			case impPackage.SENDERS_TYPE__REFERENCE:
				return !getReference().isEmpty();
			case impPackage.SENDERS_TYPE__MODULE_INSTANCE:
				return !getModuleInstance().isEmpty();
			case impPackage.SENDERS_TYPE__TRIGGER:
				return !getTrigger().isEmpty();
			case impPackage.SENDERS_TYPE__DYNAMIC_TRIGGER:
				return !getDynamicTrigger().isEmpty();
			case impPackage.SENDERS_TYPE__EXTERNAL:
				return !getExternal().isEmpty();
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

} //SendersTypeImpl
