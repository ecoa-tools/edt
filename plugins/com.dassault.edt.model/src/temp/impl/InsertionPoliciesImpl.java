/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.InsertionPolicyList;

import temp.InsertionPolicies;
import temp.TempPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insertion Policies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link temp.impl.InsertionPoliciesImpl#getInsertionPolicy <em>Insertion Policy</em>}</li>
 *   <li>{@link temp.impl.InsertionPoliciesImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertionPoliciesImpl extends MinimalEObjectImpl.Container implements InsertionPolicies {
	/**
	 * The cached value of the '{@link #getInsertionPolicy() <em>Insertion Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected InsertionPolicyList insertionPolicy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionPoliciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TempPackage.Literals.INSERTION_POLICIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.INSERTION_POLICIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertionPolicyList getInsertionPolicy() {
		return insertionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertionPolicy(InsertionPolicyList newInsertionPolicy, NotificationChain msgs) {
		InsertionPolicyList oldInsertionPolicy = insertionPolicy;
		insertionPolicy = newInsertionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TempPackage.INSERTION_POLICIES__INSERTION_POLICY, oldInsertionPolicy, newInsertionPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsertionPolicy(InsertionPolicyList newInsertionPolicy) {
		if (newInsertionPolicy != insertionPolicy) {
			NotificationChain msgs = null;
			if (insertionPolicy != null)
				msgs = ((InternalEObject)insertionPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TempPackage.INSERTION_POLICIES__INSERTION_POLICY, null, msgs);
			if (newInsertionPolicy != null)
				msgs = ((InternalEObject)newInsertionPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TempPackage.INSERTION_POLICIES__INSERTION_POLICY, null, msgs);
			msgs = basicSetInsertionPolicy(newInsertionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.INSERTION_POLICIES__INSERTION_POLICY, newInsertionPolicy, newInsertionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TempPackage.INSERTION_POLICIES__INSERTION_POLICY:
				return basicSetInsertionPolicy(null, msgs);
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
			case TempPackage.INSERTION_POLICIES__INSERTION_POLICY:
				return getInsertionPolicy();
			case TempPackage.INSERTION_POLICIES__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TempPackage.INSERTION_POLICIES__INSERTION_POLICY:
				setInsertionPolicy((InsertionPolicyList)newValue);
				return;
			case TempPackage.INSERTION_POLICIES__NAME:
				setName((String)newValue);
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
			case TempPackage.INSERTION_POLICIES__INSERTION_POLICY:
				setInsertionPolicy((InsertionPolicyList)null);
				return;
			case TempPackage.INSERTION_POLICIES__NAME:
				setName(NAME_EDEFAULT);
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
			case TempPackage.INSERTION_POLICIES__INSERTION_POLICY:
				return insertionPolicy != null;
			case TempPackage.INSERTION_POLICIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InsertionPoliciesImpl
