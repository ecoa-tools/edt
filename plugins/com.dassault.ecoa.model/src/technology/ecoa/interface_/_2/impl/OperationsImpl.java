/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.interface_._2.Data;
import technology.ecoa.interface_._2.Event;
import technology.ecoa.interface_._2.Operations;
import technology.ecoa.interface_._2.RequestResponse;
import technology.ecoa.interface_._2.interPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.impl.OperationsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.impl.OperationsImpl#getData <em>Data</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.impl.OperationsImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.impl.OperationsImpl#getRequestresponse <em>Requestresponse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsImpl extends MinimalEObjectImpl.Container implements Operations {
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
	protected OperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return interPackage.Literals.OPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, interPackage.OPERATIONS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		return getGroup().list(interPackage.Literals.OPERATIONS__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		return getGroup().list(interPackage.Literals.OPERATIONS__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestResponse> getRequestresponse() {
		return getGroup().list(interPackage.Literals.OPERATIONS__REQUESTRESPONSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case interPackage.OPERATIONS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case interPackage.OPERATIONS__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case interPackage.OPERATIONS__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case interPackage.OPERATIONS__REQUESTRESPONSE:
				return ((InternalEList<?>)getRequestresponse()).basicRemove(otherEnd, msgs);
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
			case interPackage.OPERATIONS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case interPackage.OPERATIONS__DATA:
				return getData();
			case interPackage.OPERATIONS__EVENT:
				return getEvent();
			case interPackage.OPERATIONS__REQUESTRESPONSE:
				return getRequestresponse();
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
			case interPackage.OPERATIONS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case interPackage.OPERATIONS__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case interPackage.OPERATIONS__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case interPackage.OPERATIONS__REQUESTRESPONSE:
				getRequestresponse().clear();
				getRequestresponse().addAll((Collection<? extends RequestResponse>)newValue);
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
			case interPackage.OPERATIONS__GROUP:
				getGroup().clear();
				return;
			case interPackage.OPERATIONS__DATA:
				getData().clear();
				return;
			case interPackage.OPERATIONS__EVENT:
				getEvent().clear();
				return;
			case interPackage.OPERATIONS__REQUESTRESPONSE:
				getRequestresponse().clear();
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
			case interPackage.OPERATIONS__GROUP:
				return group != null && !group.isEmpty();
			case interPackage.OPERATIONS__DATA:
				return !getData().isEmpty();
			case interPackage.OPERATIONS__EVENT:
				return !getEvent().isEmpty();
			case interPackage.OPERATIONS__REQUESTRESPONSE:
				return !getRequestresponse().isEmpty();
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

} //OperationsImpl
