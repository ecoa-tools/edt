/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtdeployment.EdtdeploymentPackage;
import edtdeployment.PlatformMessage;

import edtlogical.LogicalComputingPlatformLink;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.PlatformMessageImpl#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformMessageImpl extends MinimalEObjectImpl.Container implements PlatformMessage {
	/**
	 * The cached value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingPlatformLink mappedOnLinkId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.PLATFORM_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingPlatformLink getMappedOnLinkId() {
		if (mappedOnLinkId != null && mappedOnLinkId.eIsProxy()) {
			InternalEObject oldMappedOnLinkId = (InternalEObject)mappedOnLinkId;
			mappedOnLinkId = (LogicalComputingPlatformLink)eResolveProxy(oldMappedOnLinkId);
			if (mappedOnLinkId != oldMappedOnLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
			}
		}
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingPlatformLink basicGetMappedOnLinkId() {
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedOnLinkId(LogicalComputingPlatformLink newMappedOnLinkId) {
		LogicalComputingPlatformLink oldMappedOnLinkId = mappedOnLinkId;
		mappedOnLinkId = newMappedOnLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID:
				if (resolve) return getMappedOnLinkId();
				return basicGetMappedOnLinkId();
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
			case EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((LogicalComputingPlatformLink)newValue);
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
			case EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((LogicalComputingPlatformLink)null);
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
			case EdtdeploymentPackage.PLATFORM_MESSAGE__MAPPED_ON_LINK_ID:
				return mappedOnLinkId != null;
		}
		return super.eIsSet(featureID);
	}

} //PlatformMessageImpl
