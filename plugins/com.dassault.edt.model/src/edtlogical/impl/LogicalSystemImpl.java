/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalSystem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Logical
 * System</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtlogical.impl.LogicalSystemImpl#getFileNamePrefix <em>File Name
 * Prefix</em>}</li>
 * <li>{@link edtlogical.impl.LogicalSystemImpl#getLogicalComputingPlatforms
 * <em>Logical Computing Platforms</em>}</li>
 * <li>{@link edtlogical.impl.LogicalSystemImpl#getLogicalComputingPlatformLinks
 * <em>Logical Computing Platform Links</em>}</li>
 * <li>{@link edtlogical.impl.LogicalSystemImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalSystemImpl extends MinimalEObjectImpl.Container implements LogicalSystem {
	/**
	 * The default value of the '{@link #getFileNamePrefix() <em>File Name
	 * Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFileNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileNamePrefix() <em>File Name
	 * Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFileNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String fileNamePrefix = FILE_NAME_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalComputingPlatforms() <em>Logical
	 * Computing Platforms</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLogicalComputingPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingPlatform> logicalComputingPlatforms;

	/**
	 * The cached value of the '{@link #getLogicalComputingPlatformLinks()
	 * <em>Logical Computing Platform Links</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogicalComputingPlatformLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingPlatformLink> logicalComputingPlatformLinks;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtlogicalPackage.Literals.LOGICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFileNamePrefix() {
		return fileNamePrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFileNamePrefix(String newFileNamePrefix) {
		String oldFileNamePrefix = fileNamePrefix;
		fileNamePrefix = newFileNamePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_SYSTEM__FILE_NAME_PREFIX,
					oldFileNamePrefix, fileNamePrefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalComputingPlatform> getLogicalComputingPlatforms() {
		if (logicalComputingPlatforms == null) {
			logicalComputingPlatforms = new EObjectContainmentEList<LogicalComputingPlatform>(
					LogicalComputingPlatform.class, this,
					EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS);
		}
		return logicalComputingPlatforms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalComputingPlatformLink> getLogicalComputingPlatformLinks() {
		if (logicalComputingPlatformLinks == null) {
			logicalComputingPlatformLinks = new EObjectContainmentEList<LogicalComputingPlatformLink>(
					LogicalComputingPlatformLink.class, this,
					EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS);
		}
		return logicalComputingPlatformLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_SYSTEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS:
			return ((InternalEList<?>) getLogicalComputingPlatforms()).basicRemove(otherEnd, msgs);
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
			return ((InternalEList<?>) getLogicalComputingPlatformLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_SYSTEM__FILE_NAME_PREFIX:
			return getFileNamePrefix();
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS:
			return getLogicalComputingPlatforms();
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
			return getLogicalComputingPlatformLinks();
		case EdtlogicalPackage.LOGICAL_SYSTEM__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_SYSTEM__FILE_NAME_PREFIX:
			setFileNamePrefix((String) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS:
			getLogicalComputingPlatforms().clear();
			getLogicalComputingPlatforms().addAll((Collection<? extends LogicalComputingPlatform>) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
			getLogicalComputingPlatformLinks().clear();
			getLogicalComputingPlatformLinks().addAll((Collection<? extends LogicalComputingPlatformLink>) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_SYSTEM__FILE_NAME_PREFIX:
			setFileNamePrefix(FILE_NAME_PREFIX_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS:
			getLogicalComputingPlatforms().clear();
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
			getLogicalComputingPlatformLinks().clear();
			return;
		case EdtlogicalPackage.LOGICAL_SYSTEM__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_SYSTEM__FILE_NAME_PREFIX:
			return FILE_NAME_PREFIX_EDEFAULT == null ? fileNamePrefix != null
					: !FILE_NAME_PREFIX_EDEFAULT.equals(fileNamePrefix);
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS:
			return logicalComputingPlatforms != null && !logicalComputingPlatforms.isEmpty();
		case EdtlogicalPackage.LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS:
			return logicalComputingPlatformLinks != null && !logicalComputingPlatformLinks.isEmpty();
		case EdtlogicalPackage.LOGICAL_SYSTEM__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (FileNamePrefix: ");
		result.append(fileNamePrefix);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find LogicalComputingPlatform by Name
	 *
	 * @param logicalComputingPlatformId : name of LogicalComputingPlatform to find
	 * @return LogicalComputingPlatform found
	 */
	@Override
	public LogicalComputingPlatform findLogicalComputingPlatformById(String logicalComputingPlatformId) {
		for (edtlogical.LogicalComputingPlatform logicalComputingPlatform : logicalComputingPlatforms) {
			if (Objects.equals(logicalComputingPlatform.getId(), logicalComputingPlatformId)) {
				return logicalComputingPlatform;
			}
		}
		return null;

	}

	/**
	 * Find LogicalComputingPlatformLink by Name
	 *
	 * @param logicalComputingPlatformLinkId : name of LogicalComputingPlatform to
	 *                                       find
	 * @return LogicalComputingPlatformLink found
	 */
	@Override
	public LogicalComputingPlatformLink findLogicalComputingPlatformLinkById(String logicalComputingPlatformLinkId) {
		for (LogicalComputingPlatformLink logicalComputingPlatformLink : logicalComputingPlatformLinks) {
			if (Objects.equals(logicalComputingPlatformLink.getId(), logicalComputingPlatformLinkId)) {
				return logicalComputingPlatformLink;
			}
		}
		return null;

	}

} // LogicalSystemImpl
