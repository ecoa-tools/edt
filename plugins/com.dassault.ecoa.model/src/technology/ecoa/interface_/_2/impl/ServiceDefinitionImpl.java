/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.interface_._2.Operations;
import technology.ecoa.interface_._2.ServiceDefinition;
import technology.ecoa.interface_._2.UseType;
import technology.ecoa.interface_._2.interPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.impl.ServiceDefinitionImpl#getUse <em>Use</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.impl.ServiceDefinitionImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefinitionImpl extends MinimalEObjectImpl.Container implements ServiceDefinition {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<UseType> use;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected Operations operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return interPackage.Literals.SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseType> getUse() {
		if (use == null) {
			use = new EObjectContainmentEList<UseType>(UseType.class, this, interPackage.SERVICE_DEFINITION__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperations(Operations newOperations, NotificationChain msgs) {
		Operations oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, interPackage.SERVICE_DEFINITION__OPERATIONS, oldOperations, newOperations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperations(Operations newOperations) {
		if (newOperations != operations) {
			NotificationChain msgs = null;
			if (operations != null)
				msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - interPackage.SERVICE_DEFINITION__OPERATIONS, null, msgs);
			if (newOperations != null)
				msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - interPackage.SERVICE_DEFINITION__OPERATIONS, null, msgs);
			msgs = basicSetOperations(newOperations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, interPackage.SERVICE_DEFINITION__OPERATIONS, newOperations, newOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case interPackage.SERVICE_DEFINITION__USE:
				return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
			case interPackage.SERVICE_DEFINITION__OPERATIONS:
				return basicSetOperations(null, msgs);
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
			case interPackage.SERVICE_DEFINITION__USE:
				return getUse();
			case interPackage.SERVICE_DEFINITION__OPERATIONS:
				return getOperations();
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
			case interPackage.SERVICE_DEFINITION__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends UseType>)newValue);
				return;
			case interPackage.SERVICE_DEFINITION__OPERATIONS:
				setOperations((Operations)newValue);
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
			case interPackage.SERVICE_DEFINITION__USE:
				getUse().clear();
				return;
			case interPackage.SERVICE_DEFINITION__OPERATIONS:
				setOperations((Operations)null);
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
			case interPackage.SERVICE_DEFINITION__USE:
				return use != null && !use.isEmpty();
			case interPackage.SERVICE_DEFINITION__OPERATIONS:
				return operations != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceDefinitionImpl
