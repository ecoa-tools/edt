/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.deployment._2.PlatformMessages;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Messages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformMessagesImpl#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformMessagesImpl extends MinimalEObjectImpl.Container implements PlatformMessages {
	/**
	 * The default value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_ON_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected String mappedOnLinkId = MAPPED_ON_LINK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformMessagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.PLATFORM_MESSAGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedOnLinkId() {
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedOnLinkId(String newMappedOnLinkId) {
		String oldMappedOnLinkId = mappedOnLinkId;
		mappedOnLinkId = newMappedOnLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PLATFORM_MESSAGES__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.PLATFORM_MESSAGES__MAPPED_ON_LINK_ID:
				return getMappedOnLinkId();
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
			case depPackage.PLATFORM_MESSAGES__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((String)newValue);
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
			case depPackage.PLATFORM_MESSAGES__MAPPED_ON_LINK_ID:
				setMappedOnLinkId(MAPPED_ON_LINK_ID_EDEFAULT);
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
			case depPackage.PLATFORM_MESSAGES__MAPPED_ON_LINK_ID:
				return MAPPED_ON_LINK_ID_EDEFAULT == null ? mappedOnLinkId != null : !MAPPED_ON_LINK_ID_EDEFAULT.equals(mappedOnLinkId);
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
		result.append(" (mappedOnLinkId: ");
		result.append(mappedOnLinkId);
		result.append(')');
		return result.toString();
	}

} //PlatformMessagesImpl
