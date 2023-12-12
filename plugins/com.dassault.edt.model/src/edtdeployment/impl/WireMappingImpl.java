/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtdeployment.EdtdeploymentPackage;
import edtdeployment.WireMapping;
import edtlogical.LogicalComputingPlatformLink;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Wire
 * Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.WireMappingImpl#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 *   <li>{@link edtdeployment.impl.WireMappingImpl#getWire <em>Wire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireMappingImpl extends MinimalEObjectImpl.Container implements WireMapping {
	/**
	 * The cached value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingPlatformLink mappedOnLinkId;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected ServiceLink wire;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WireMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.WIRE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingPlatformLink getMappedOnLinkId() {
		if (mappedOnLinkId != null && mappedOnLinkId.eIsProxy()) {
			InternalEObject oldMappedOnLinkId = (InternalEObject)mappedOnLinkId;
			mappedOnLinkId = (LogicalComputingPlatformLink)eResolveProxy(oldMappedOnLinkId);
			if (mappedOnLinkId != oldMappedOnLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
			}
		}
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingPlatformLink basicGetMappedOnLinkId() {
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedOnLinkId(LogicalComputingPlatformLink newMappedOnLinkId) {
		LogicalComputingPlatformLink oldMappedOnLinkId = mappedOnLinkId;
		mappedOnLinkId = newMappedOnLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLink getWire() {
		if (wire != null && wire.eIsProxy()) {
			InternalEObject oldWire = (InternalEObject)wire;
			wire = (ServiceLink)eResolveProxy(oldWire);
			if (wire != oldWire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.WIRE_MAPPING__WIRE, oldWire, wire));
			}
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLink basicGetWire() {
		return wire;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWire(ServiceLink newWire) {
		ServiceLink oldWire = wire;
		wire = newWire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.WIRE_MAPPING__WIRE, oldWire, wire));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				if (resolve) return getMappedOnLinkId();
				return basicGetMappedOnLinkId();
			case EdtdeploymentPackage.WIRE_MAPPING__WIRE:
				if (resolve) return getWire();
				return basicGetWire();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((LogicalComputingPlatformLink)newValue);
				return;
			case EdtdeploymentPackage.WIRE_MAPPING__WIRE:
				setWire((ServiceLink)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((LogicalComputingPlatformLink)null);
				return;
			case EdtdeploymentPackage.WIRE_MAPPING__WIRE:
				setWire((ServiceLink)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtdeploymentPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				return mappedOnLinkId != null;
			case EdtdeploymentPackage.WIRE_MAPPING__WIRE:
				return wire != null;
		}
		return super.eIsSet(featureID);
	}

} // WireMappingImpl
