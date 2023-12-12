/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.udpbinding._2.PlatformType;
import technology.ecoa.udpbinding._2.UDPBindingType;
import technology.ecoa.udpbinding._2.udpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDP Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.UDPBindingTypeImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UDPBindingTypeImpl extends MinimalEObjectImpl.Container implements UDPBindingType {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformType> platform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return udpPackage.Literals.UDP_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformType> getPlatform() {
		if (platform == null) {
			platform = new EObjectContainmentEList<PlatformType>(PlatformType.class, this, udpPackage.UDP_BINDING_TYPE__PLATFORM);
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case udpPackage.UDP_BINDING_TYPE__PLATFORM:
				return ((InternalEList<?>)getPlatform()).basicRemove(otherEnd, msgs);
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
			case udpPackage.UDP_BINDING_TYPE__PLATFORM:
				return getPlatform();
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
			case udpPackage.UDP_BINDING_TYPE__PLATFORM:
				getPlatform().clear();
				getPlatform().addAll((Collection<? extends PlatformType>)newValue);
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
			case udpPackage.UDP_BINDING_TYPE__PLATFORM:
				getPlatform().clear();
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
			case udpPackage.UDP_BINDING_TYPE__PLATFORM:
				return platform != null && !platform.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UDPBindingTypeImpl
