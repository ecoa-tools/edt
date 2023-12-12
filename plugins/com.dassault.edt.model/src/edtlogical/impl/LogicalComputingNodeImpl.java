/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalProcessor;
import technology.ecoa.logicalsystem._2.NameType;
import technology.ecoa.logicalsystem._2.TypeType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Logical
 * Computing Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getLogicalProcessors
 * <em>Logical Processors</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getId <em>Id</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getEndianessType
 * <em>Endianess Type</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getModuleSwitchTimeMicroSeconds
 * <em>Module Switch Time Micro Seconds</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getAvailableMemoryGigaBytes
 * <em>Available Memory Giga Bytes</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getOsName <em>Os
 * Name</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getOsVersion <em>Os
 * Version</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeImpl#getProtectionDomainLink
 * <em>Protection Domain Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingNodeImpl extends MinimalEObjectImpl.Container implements LogicalComputingNode {
	/**
	 * The cached value of the '{@link #getLogicalProcessors() <em>Logical
	 * Processors</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLogicalProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalProcessor> logicalProcessors;

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
	 * The default value of the '{@link #getEndianessType() <em>Endianess
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndianessType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType ENDIANESS_TYPE_EDEFAULT = TypeType.BIG;

	/**
	 * The cached value of the '{@link #getEndianessType() <em>Endianess Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndianessType()
	 * @generated
	 * @ordered
	 */
	protected TypeType endianessType = ENDIANESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleSwitchTimeMicroSeconds()
	 * <em>Module Switch Time Micro Seconds</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleSwitchTimeMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODULE_SWITCH_TIME_MICRO_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleSwitchTimeMicroSeconds() <em>Module
	 * Switch Time Micro Seconds</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getModuleSwitchTimeMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected BigInteger moduleSwitchTimeMicroSeconds = MODULE_SWITCH_TIME_MICRO_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableMemoryGigaBytes() <em>Available
	 * Memory Giga Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getAvailableMemoryGigaBytes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AVAILABLE_MEMORY_GIGA_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableMemoryGigaBytes() <em>Available
	 * Memory Giga Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getAvailableMemoryGigaBytes()
	 * @generated
	 * @ordered
	 */
	protected BigInteger availableMemoryGigaBytes = AVAILABLE_MEMORY_GIGA_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected static final NameType OS_NAME_EDEFAULT = NameType.FASTOS;

	/**
	 * The cached value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected NameType osName = OS_NAME_EDEFAULT;

	/**
	 * This is true if the Os Name attribute has been set. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean osNameESet;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectionDomainLink() <em>Protection
	 * Domain Link</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getProtectionDomainLink()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionDomain> protectionDomainLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalComputingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalProcessor> getLogicalProcessors() {
		if (logicalProcessors == null) {
			logicalProcessors = new EObjectContainmentEList<LogicalProcessor>(LogicalProcessor.class, this,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS);
		}
		return logicalProcessors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TypeType getEndianessType() {
		return endianessType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEndianessType(TypeType newEndianessType) {
		TypeType oldEndianessType = endianessType;
		endianessType = newEndianessType == null ? ENDIANESS_TYPE_EDEFAULT : newEndianessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE, oldEndianessType, endianessType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getModuleSwitchTimeMicroSeconds() {
		return moduleSwitchTimeMicroSeconds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setModuleSwitchTimeMicroSeconds(BigInteger newModuleSwitchTimeMicroSeconds) {
		BigInteger oldModuleSwitchTimeMicroSeconds = moduleSwitchTimeMicroSeconds;
		moduleSwitchTimeMicroSeconds = newModuleSwitchTimeMicroSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS,
					oldModuleSwitchTimeMicroSeconds, moduleSwitchTimeMicroSeconds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getAvailableMemoryGigaBytes() {
		return availableMemoryGigaBytes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAvailableMemoryGigaBytes(BigInteger newAvailableMemoryGigaBytes) {
		BigInteger oldAvailableMemoryGigaBytes = availableMemoryGigaBytes;
		availableMemoryGigaBytes = newAvailableMemoryGigaBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES, oldAvailableMemoryGigaBytes,
					availableMemoryGigaBytes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NameType getOsName() {
		return osName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOsName(NameType newOsName) {
		NameType oldOsName = osName;
		osName = newOsName == null ? OS_NAME_EDEFAULT : newOsName;
		boolean oldOsNameESet = osNameESet;
		osNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME,
					oldOsName, osName, !oldOsNameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetOsName() {
		NameType oldOsName = osName;
		boolean oldOsNameESet = osNameESet;
		osName = OS_NAME_EDEFAULT;
		osNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME,
					oldOsName, OS_NAME_EDEFAULT, oldOsNameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOsName() {
		return osNameESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_VERSION,
					oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<ProtectionDomain> getProtectionDomainLink() {
		if (protectionDomainLink == null) {
			protectionDomainLink = new EObjectWithInverseResolvingEList<ProtectionDomain>(ProtectionDomain.class, this,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK,
					EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE);
		}
		return protectionDomainLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProtectionDomainLink()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS:
			return ((InternalEList<?>) getLogicalProcessors()).basicRemove(otherEnd, msgs);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			return ((InternalEList<?>) getProtectionDomainLink()).basicRemove(otherEnd, msgs);
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
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS:
			return getLogicalProcessors();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ID:
			return getId();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE:
			return getEndianessType();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS:
			return getModuleSwitchTimeMicroSeconds();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES:
			return getAvailableMemoryGigaBytes();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME:
			return getOsName();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_VERSION:
			return getOsVersion();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			return getProtectionDomainLink();
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
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS:
			getLogicalProcessors().clear();
			getLogicalProcessors().addAll((Collection<? extends LogicalProcessor>) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ID:
			setId((String) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE:
			setEndianessType((TypeType) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS:
			setModuleSwitchTimeMicroSeconds((BigInteger) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES:
			setAvailableMemoryGigaBytes((BigInteger) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME:
			setOsName((NameType) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_VERSION:
			setOsVersion((String) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			getProtectionDomainLink().clear();
			getProtectionDomainLink().addAll((Collection<? extends ProtectionDomain>) newValue);
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
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS:
			getLogicalProcessors().clear();
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ID:
			setId(ID_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE:
			setEndianessType(ENDIANESS_TYPE_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS:
			setModuleSwitchTimeMicroSeconds(MODULE_SWITCH_TIME_MICRO_SECONDS_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES:
			setAvailableMemoryGigaBytes(AVAILABLE_MEMORY_GIGA_BYTES_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME:
			unsetOsName();
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_VERSION:
			setOsVersion(OS_VERSION_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			getProtectionDomainLink().clear();
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
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS:
			return logicalProcessors != null && !logicalProcessors.isEmpty();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE:
			return endianessType != ENDIANESS_TYPE_EDEFAULT;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS:
			return MODULE_SWITCH_TIME_MICRO_SECONDS_EDEFAULT == null ? moduleSwitchTimeMicroSeconds != null
					: !MODULE_SWITCH_TIME_MICRO_SECONDS_EDEFAULT.equals(moduleSwitchTimeMicroSeconds);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES:
			return AVAILABLE_MEMORY_GIGA_BYTES_EDEFAULT == null ? availableMemoryGigaBytes != null
					: !AVAILABLE_MEMORY_GIGA_BYTES_EDEFAULT.equals(availableMemoryGigaBytes);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_NAME:
			return isSetOsName();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__OS_VERSION:
			return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK:
			return protectionDomainLink != null && !protectionDomainLink.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", EndianessType: ");
		result.append(endianessType);
		result.append(", ModuleSwitchTimeMicroSeconds: ");
		result.append(moduleSwitchTimeMicroSeconds);
		result.append(", AvailableMemoryGigaBytes: ");
		result.append(availableMemoryGigaBytes);
		result.append(", osName: ");
		if (osNameESet)
			result.append(osName);
		else
			result.append("<unset>");
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getEndianessType() != null && !this.getLogicalProcessors().isEmpty() && this.getOsName() != null
				&& this.getAvailableMemoryGigaBytes() != null && this.getModuleSwitchTimeMicroSeconds() != null
				&& this.getId() != null && !this.getId().isBlank());
	}

} // LogicalComputingNodeImpl
