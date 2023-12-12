/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

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

import technology.ecoa.logicalsystem._2.LogicalComputingPlatform;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.LogicalSystem;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl#getLogicalComputingPlatform <em>Logical Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl#getLogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalSystemImpl extends MinimalEObjectImpl.Container implements LogicalSystem {
	/**
	 * The cached value of the '{@link #getLogicalComputingPlatform() <em>Logical Computing Platform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingPlatform> logicalComputingPlatform;

	/**
	 * The cached value of the '{@link #getLogicalComputingPlatformLinks() <em>Logical Computing Platform Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalComputingPlatformLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingPlatformLinks> logicalComputingPlatformLinks;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComputingPlatform> getLogicalComputingPlatform() {
		if (logicalComputingPlatform == null) {
			logicalComputingPlatform = new EObjectContainmentEList<LogicalComputingPlatform>(LogicalComputingPlatform.class, this, logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM);
		}
		return logicalComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComputingPlatformLinks> getLogicalComputingPlatformLinks() {
		if (logicalComputingPlatformLinks == null) {
			logicalComputingPlatformLinks = new EObjectContainmentEList<LogicalComputingPlatformLinks>(LogicalComputingPlatformLinks.class, this, logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS);
		}
		return logicalComputingPlatformLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_SYSTEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM:
				return ((InternalEList<?>)getLogicalComputingPlatform()).basicRemove(otherEnd, msgs);
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
				return ((InternalEList<?>)getLogicalComputingPlatformLinks()).basicRemove(otherEnd, msgs);
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
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM:
				return getLogicalComputingPlatform();
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
				return getLogicalComputingPlatformLinks();
			case logPackage.LOGICAL_SYSTEM__ID:
				return getId();
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
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM:
				getLogicalComputingPlatform().clear();
				getLogicalComputingPlatform().addAll((Collection<? extends LogicalComputingPlatform>)newValue);
				return;
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
				getLogicalComputingPlatformLinks().clear();
				getLogicalComputingPlatformLinks().addAll((Collection<? extends LogicalComputingPlatformLinks>)newValue);
				return;
			case logPackage.LOGICAL_SYSTEM__ID:
				setId((String)newValue);
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
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM:
				getLogicalComputingPlatform().clear();
				return;
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
				getLogicalComputingPlatformLinks().clear();
				return;
			case logPackage.LOGICAL_SYSTEM__ID:
				setId(ID_EDEFAULT);
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
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM:
				return logicalComputingPlatform != null && !logicalComputingPlatform.isEmpty();
			case logPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
				return logicalComputingPlatformLinks != null && !logicalComputingPlatformLinks.isEmpty();
			case logPackage.LOGICAL_SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LogicalSystemImpl
