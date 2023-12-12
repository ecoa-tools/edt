/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.module.behaviour._2.ActionSet;
import technology.ecoa.module.behaviour._2.Computing;
import technology.ecoa.module.behaviour._2.Loop;
import technology.ecoa.module.behaviour._2.OperationCall;
import technology.ecoa.module.behaviour._2.modPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl#getComputing <em>Computing</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionSetImpl extends MinimalEObjectImpl.Container implements ActionSet {
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
	protected ActionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modPackage.Literals.ACTION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, modPackage.ACTION_SET__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loop> getLoop() {
		return getGroup().list(modPackage.Literals.ACTION_SET__LOOP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computing> getComputing() {
		return getGroup().list(modPackage.Literals.ACTION_SET__COMPUTING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCall() {
		return getGroup().list(modPackage.Literals.ACTION_SET__OPERATION_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modPackage.ACTION_SET__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case modPackage.ACTION_SET__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case modPackage.ACTION_SET__COMPUTING:
				return ((InternalEList<?>)getComputing()).basicRemove(otherEnd, msgs);
			case modPackage.ACTION_SET__OPERATION_CALL:
				return ((InternalEList<?>)getOperationCall()).basicRemove(otherEnd, msgs);
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
			case modPackage.ACTION_SET__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case modPackage.ACTION_SET__LOOP:
				return getLoop();
			case modPackage.ACTION_SET__COMPUTING:
				return getComputing();
			case modPackage.ACTION_SET__OPERATION_CALL:
				return getOperationCall();
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
			case modPackage.ACTION_SET__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case modPackage.ACTION_SET__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends Loop>)newValue);
				return;
			case modPackage.ACTION_SET__COMPUTING:
				getComputing().clear();
				getComputing().addAll((Collection<? extends Computing>)newValue);
				return;
			case modPackage.ACTION_SET__OPERATION_CALL:
				getOperationCall().clear();
				getOperationCall().addAll((Collection<? extends OperationCall>)newValue);
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
			case modPackage.ACTION_SET__GROUP:
				getGroup().clear();
				return;
			case modPackage.ACTION_SET__LOOP:
				getLoop().clear();
				return;
			case modPackage.ACTION_SET__COMPUTING:
				getComputing().clear();
				return;
			case modPackage.ACTION_SET__OPERATION_CALL:
				getOperationCall().clear();
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
			case modPackage.ACTION_SET__GROUP:
				return group != null && !group.isEmpty();
			case modPackage.ACTION_SET__LOOP:
				return !getLoop().isEmpty();
			case modPackage.ACTION_SET__COMPUTING:
				return !getComputing().isEmpty();
			case modPackage.ACTION_SET__OPERATION_CALL:
				return !getOperationCall().isEmpty();
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

} //ActionSetImpl
