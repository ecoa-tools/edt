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

import technology.ecoa.insertion.policy._2.ModulePINFOType;
import technology.ecoa.insertion.policy._2.PINFOValue;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module PINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl#getPublicPINFO <em>Public PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl#getPrivatePINFO <em>Private PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModulePINFOTypeImpl extends MinimalEObjectImpl.Container implements ModulePINFOType {
	/**
	 * The cached value of the '{@link #getPublicPINFO() <em>Public PINFO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicPINFO()
	 * @generated
	 * @ordered
	 */
	protected EList<PINFOValue> publicPINFO;

	/**
	 * The cached value of the '{@link #getPrivatePINFO() <em>Private PINFO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatePINFO()
	 * @generated
	 * @ordered
	 */
	protected EList<PINFOValue> privatePINFO;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePINFOTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULE_PINFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PINFOValue> getPublicPINFO() {
		if (publicPINFO == null) {
			publicPINFO = new EObjectContainmentEList<PINFOValue>(PINFOValue.class, this, polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO);
		}
		return publicPINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PINFOValue> getPrivatePINFO() {
		if (privatePINFO == null) {
			privatePINFO = new EObjectContainmentEList<PINFOValue>(PINFOValue.class, this, polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO);
		}
		return privatePINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_PINFO_TYPE__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO:
				return ((InternalEList<?>)getPublicPINFO()).basicRemove(otherEnd, msgs);
			case polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO:
				return ((InternalEList<?>)getPrivatePINFO()).basicRemove(otherEnd, msgs);
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
			case polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO:
				return getPublicPINFO();
			case polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO:
				return getPrivatePINFO();
			case polPackage.MODULE_PINFO_TYPE__INSTANCE_NAME:
				return getInstanceName();
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
			case polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO:
				getPublicPINFO().clear();
				getPublicPINFO().addAll((Collection<? extends PINFOValue>)newValue);
				return;
			case polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO:
				getPrivatePINFO().clear();
				getPrivatePINFO().addAll((Collection<? extends PINFOValue>)newValue);
				return;
			case polPackage.MODULE_PINFO_TYPE__INSTANCE_NAME:
				setInstanceName((String)newValue);
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
			case polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO:
				getPublicPINFO().clear();
				return;
			case polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO:
				getPrivatePINFO().clear();
				return;
			case polPackage.MODULE_PINFO_TYPE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
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
			case polPackage.MODULE_PINFO_TYPE__PUBLIC_PINFO:
				return publicPINFO != null && !publicPINFO.isEmpty();
			case polPackage.MODULE_PINFO_TYPE__PRIVATE_PINFO:
				return privatePINFO != null && !privatePINFO.isEmpty();
			case polPackage.MODULE_PINFO_TYPE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
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
		result.append(" (instanceName: ");
		result.append(instanceName);
		result.append(')');
		return result.toString();
	}

} //ModulePINFOTypeImpl
