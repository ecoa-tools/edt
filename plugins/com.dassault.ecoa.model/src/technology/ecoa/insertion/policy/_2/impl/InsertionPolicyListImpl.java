/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

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

import technology.ecoa.insertion.policy._2.InsertionPolicy;
import technology.ecoa.insertion.policy._2.InsertionPolicyList;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insertion Policy List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl#getInsertionPolicy <em>Insertion Policy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl#getComponentImplementation <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertionPolicyListImpl extends MinimalEObjectImpl.Container implements InsertionPolicyList {
	/**
	 * The cached value of the '{@link #getInsertionPolicy() <em>Insertion Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<InsertionPolicy> insertionPolicy;

	/**
	 * The default value of the '{@link #getComponentImplementation() <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentImplementation() <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected String componentImplementation = COMPONENT_IMPLEMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionPolicyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.INSERTION_POLICY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsertionPolicy> getInsertionPolicy() {
		if (insertionPolicy == null) {
			insertionPolicy = new EObjectContainmentEList<InsertionPolicy>(InsertionPolicy.class, this, polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY);
		}
		return insertionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentImplementation() {
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentImplementation(String newComponentImplementation) {
		String oldComponentImplementation = componentImplementation;
		componentImplementation = newComponentImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION, oldComponentImplementation, componentImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY:
				return ((InternalEList<?>)getInsertionPolicy()).basicRemove(otherEnd, msgs);
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
			case polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY:
				return getInsertionPolicy();
			case polPackage.INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION:
				return getComponentImplementation();
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
			case polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY:
				getInsertionPolicy().clear();
				getInsertionPolicy().addAll((Collection<? extends InsertionPolicy>)newValue);
				return;
			case polPackage.INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION:
				setComponentImplementation((String)newValue);
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
			case polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY:
				getInsertionPolicy().clear();
				return;
			case polPackage.INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION:
				setComponentImplementation(COMPONENT_IMPLEMENTATION_EDEFAULT);
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
			case polPackage.INSERTION_POLICY_LIST__INSERTION_POLICY:
				return insertionPolicy != null && !insertionPolicy.isEmpty();
			case polPackage.INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION:
				return COMPONENT_IMPLEMENTATION_EDEFAULT == null ? componentImplementation != null : !COMPONENT_IMPLEMENTATION_EDEFAULT.equals(componentImplementation);
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
		result.append(" (componentImplementation: ");
		result.append(componentImplementation);
		result.append(')');
		return result.toString();
	}

} //InsertionPolicyListImpl
