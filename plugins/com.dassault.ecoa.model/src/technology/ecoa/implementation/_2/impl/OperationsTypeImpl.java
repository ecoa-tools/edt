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

import technology.ecoa.implementation._2.DataReadType;
import technology.ecoa.implementation._2.DataWrittenType;
import technology.ecoa.implementation._2.Event;
import technology.ecoa.implementation._2.EventReceivedType;
import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.RequestReceivedType;
import technology.ecoa.implementation._2.RequestSentType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getDataWritten <em>Data Written</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getDataRead <em>Data Read</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getEventSent <em>Event Sent</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getEventReceived <em>Event Received</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getRequestSent <em>Request Sent</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl#getRequestReceived <em>Request Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsTypeImpl extends MinimalEObjectImpl.Container implements OperationsType {
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
	protected OperationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.OPERATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, impPackage.OPERATIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataWrittenType> getDataWritten() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__DATA_WRITTEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataReadType> getDataRead() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__DATA_READ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEventSent() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__EVENT_SENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventReceivedType> getEventReceived() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__EVENT_RECEIVED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestSentType> getRequestSent() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__REQUEST_SENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestReceivedType> getRequestReceived() {
		return getGroup().list(impPackage.Literals.OPERATIONS_TYPE__REQUEST_RECEIVED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.OPERATIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__DATA_WRITTEN:
				return ((InternalEList<?>)getDataWritten()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__DATA_READ:
				return ((InternalEList<?>)getDataRead()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__EVENT_SENT:
				return ((InternalEList<?>)getEventSent()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__EVENT_RECEIVED:
				return ((InternalEList<?>)getEventReceived()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__REQUEST_SENT:
				return ((InternalEList<?>)getRequestSent()).basicRemove(otherEnd, msgs);
			case impPackage.OPERATIONS_TYPE__REQUEST_RECEIVED:
				return ((InternalEList<?>)getRequestReceived()).basicRemove(otherEnd, msgs);
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
			case impPackage.OPERATIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case impPackage.OPERATIONS_TYPE__DATA_WRITTEN:
				return getDataWritten();
			case impPackage.OPERATIONS_TYPE__DATA_READ:
				return getDataRead();
			case impPackage.OPERATIONS_TYPE__EVENT_SENT:
				return getEventSent();
			case impPackage.OPERATIONS_TYPE__EVENT_RECEIVED:
				return getEventReceived();
			case impPackage.OPERATIONS_TYPE__REQUEST_SENT:
				return getRequestSent();
			case impPackage.OPERATIONS_TYPE__REQUEST_RECEIVED:
				return getRequestReceived();
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
			case impPackage.OPERATIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case impPackage.OPERATIONS_TYPE__DATA_WRITTEN:
				getDataWritten().clear();
				getDataWritten().addAll((Collection<? extends DataWrittenType>)newValue);
				return;
			case impPackage.OPERATIONS_TYPE__DATA_READ:
				getDataRead().clear();
				getDataRead().addAll((Collection<? extends DataReadType>)newValue);
				return;
			case impPackage.OPERATIONS_TYPE__EVENT_SENT:
				getEventSent().clear();
				getEventSent().addAll((Collection<? extends Event>)newValue);
				return;
			case impPackage.OPERATIONS_TYPE__EVENT_RECEIVED:
				getEventReceived().clear();
				getEventReceived().addAll((Collection<? extends EventReceivedType>)newValue);
				return;
			case impPackage.OPERATIONS_TYPE__REQUEST_SENT:
				getRequestSent().clear();
				getRequestSent().addAll((Collection<? extends RequestSentType>)newValue);
				return;
			case impPackage.OPERATIONS_TYPE__REQUEST_RECEIVED:
				getRequestReceived().clear();
				getRequestReceived().addAll((Collection<? extends RequestReceivedType>)newValue);
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
			case impPackage.OPERATIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case impPackage.OPERATIONS_TYPE__DATA_WRITTEN:
				getDataWritten().clear();
				return;
			case impPackage.OPERATIONS_TYPE__DATA_READ:
				getDataRead().clear();
				return;
			case impPackage.OPERATIONS_TYPE__EVENT_SENT:
				getEventSent().clear();
				return;
			case impPackage.OPERATIONS_TYPE__EVENT_RECEIVED:
				getEventReceived().clear();
				return;
			case impPackage.OPERATIONS_TYPE__REQUEST_SENT:
				getRequestSent().clear();
				return;
			case impPackage.OPERATIONS_TYPE__REQUEST_RECEIVED:
				getRequestReceived().clear();
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
			case impPackage.OPERATIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case impPackage.OPERATIONS_TYPE__DATA_WRITTEN:
				return !getDataWritten().isEmpty();
			case impPackage.OPERATIONS_TYPE__DATA_READ:
				return !getDataRead().isEmpty();
			case impPackage.OPERATIONS_TYPE__EVENT_SENT:
				return !getEventSent().isEmpty();
			case impPackage.OPERATIONS_TYPE__EVENT_RECEIVED:
				return !getEventReceived().isEmpty();
			case impPackage.OPERATIONS_TYPE__REQUEST_SENT:
				return !getRequestSent().isEmpty();
			case impPackage.OPERATIONS_TYPE__REQUEST_RECEIVED:
				return !getRequestReceived().isEmpty();
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

} //OperationsTypeImpl
