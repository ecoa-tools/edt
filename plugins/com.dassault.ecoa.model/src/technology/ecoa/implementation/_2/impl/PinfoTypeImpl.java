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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.implementation._2.PinfoType;
import technology.ecoa.implementation._2.PinfoValue;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pinfo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.PinfoTypeImpl#getPublicPinfo <em>Public Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.PinfoTypeImpl#getPrivatePinfo <em>Private Pinfo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinfoTypeImpl extends MinimalEObjectImpl.Container implements PinfoType {
	/**
	 * The cached value of the '{@link #getPublicPinfo() <em>Public Pinfo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicPinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<PinfoValue> publicPinfo;

	/**
	 * The cached value of the '{@link #getPrivatePinfo() <em>Private Pinfo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatePinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<PinfoValue> privatePinfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.PINFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinfoValue> getPublicPinfo() {
		if (publicPinfo == null) {
			publicPinfo = new EObjectContainmentEList<PinfoValue>(PinfoValue.class, this, impPackage.PINFO_TYPE__PUBLIC_PINFO);
		}
		return publicPinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinfoValue> getPrivatePinfo() {
		if (privatePinfo == null) {
			privatePinfo = new EObjectContainmentEList<PinfoValue>(PinfoValue.class, this, impPackage.PINFO_TYPE__PRIVATE_PINFO);
		}
		return privatePinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.PINFO_TYPE__PUBLIC_PINFO:
				return ((InternalEList<?>)getPublicPinfo()).basicRemove(otherEnd, msgs);
			case impPackage.PINFO_TYPE__PRIVATE_PINFO:
				return ((InternalEList<?>)getPrivatePinfo()).basicRemove(otherEnd, msgs);
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
			case impPackage.PINFO_TYPE__PUBLIC_PINFO:
				return getPublicPinfo();
			case impPackage.PINFO_TYPE__PRIVATE_PINFO:
				return getPrivatePinfo();
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
			case impPackage.PINFO_TYPE__PUBLIC_PINFO:
				getPublicPinfo().clear();
				getPublicPinfo().addAll((Collection<? extends PinfoValue>)newValue);
				return;
			case impPackage.PINFO_TYPE__PRIVATE_PINFO:
				getPrivatePinfo().clear();
				getPrivatePinfo().addAll((Collection<? extends PinfoValue>)newValue);
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
			case impPackage.PINFO_TYPE__PUBLIC_PINFO:
				getPublicPinfo().clear();
				return;
			case impPackage.PINFO_TYPE__PRIVATE_PINFO:
				getPrivatePinfo().clear();
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
			case impPackage.PINFO_TYPE__PUBLIC_PINFO:
				return publicPinfo != null && !publicPinfo.isEmpty();
			case impPackage.PINFO_TYPE__PRIVATE_PINFO:
				return privatePinfo != null && !privatePinfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PinfoTypeImpl
