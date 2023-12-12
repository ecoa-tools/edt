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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.module.behaviour._2.DataNotification;
import technology.ecoa.module.behaviour._2.EntryPoint;
import technology.ecoa.module.behaviour._2.ModuleBehaviour;
import technology.ecoa.module.behaviour._2.ResponseNotification;
import technology.ecoa.module.behaviour._2.modPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl#getDataNotification <em>Data Notification</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl#getResponseNotification <em>Response Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleBehaviourImpl extends MinimalEObjectImpl.Container implements ModuleBehaviour {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint> entryPoint;

	/**
	 * The cached value of the '{@link #getDataNotification() <em>Data Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<DataNotification> dataNotification;

	/**
	 * The cached value of the '{@link #getResponseNotification() <em>Response Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseNotification> responseNotification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modPackage.Literals.MODULE_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint> getEntryPoint() {
		if (entryPoint == null) {
			entryPoint = new EObjectContainmentEList<EntryPoint>(EntryPoint.class, this, modPackage.MODULE_BEHAVIOUR__ENTRY_POINT);
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataNotification> getDataNotification() {
		if (dataNotification == null) {
			dataNotification = new EObjectContainmentEList<DataNotification>(DataNotification.class, this, modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION);
		}
		return dataNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseNotification> getResponseNotification() {
		if (responseNotification == null) {
			responseNotification = new EObjectContainmentEList<ResponseNotification>(ResponseNotification.class, this, modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION);
		}
		return responseNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modPackage.MODULE_BEHAVIOUR__ENTRY_POINT:
				return ((InternalEList<?>)getEntryPoint()).basicRemove(otherEnd, msgs);
			case modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION:
				return ((InternalEList<?>)getDataNotification()).basicRemove(otherEnd, msgs);
			case modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION:
				return ((InternalEList<?>)getResponseNotification()).basicRemove(otherEnd, msgs);
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
			case modPackage.MODULE_BEHAVIOUR__ENTRY_POINT:
				return getEntryPoint();
			case modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION:
				return getDataNotification();
			case modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION:
				return getResponseNotification();
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
			case modPackage.MODULE_BEHAVIOUR__ENTRY_POINT:
				getEntryPoint().clear();
				getEntryPoint().addAll((Collection<? extends EntryPoint>)newValue);
				return;
			case modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION:
				getDataNotification().clear();
				getDataNotification().addAll((Collection<? extends DataNotification>)newValue);
				return;
			case modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION:
				getResponseNotification().clear();
				getResponseNotification().addAll((Collection<? extends ResponseNotification>)newValue);
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
			case modPackage.MODULE_BEHAVIOUR__ENTRY_POINT:
				getEntryPoint().clear();
				return;
			case modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION:
				getDataNotification().clear();
				return;
			case modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION:
				getResponseNotification().clear();
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
			case modPackage.MODULE_BEHAVIOUR__ENTRY_POINT:
				return entryPoint != null && !entryPoint.isEmpty();
			case modPackage.MODULE_BEHAVIOUR__DATA_NOTIFICATION:
				return dataNotification != null && !dataNotification.isEmpty();
			case modPackage.MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION:
				return responseNotification != null && !responseNotification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleBehaviourImpl
