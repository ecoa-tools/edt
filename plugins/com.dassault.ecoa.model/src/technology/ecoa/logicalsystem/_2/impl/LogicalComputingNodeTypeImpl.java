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

import technology.ecoa.logicalsystem._2.AvailableMemoryType;
import technology.ecoa.logicalsystem._2.EndianessType;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeType;
import technology.ecoa.logicalsystem._2.LogicalProcessorsType;
import technology.ecoa.logicalsystem._2.ModuleSwitchTimeType;
import technology.ecoa.logicalsystem._2.OsType;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Computing Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getEndianess <em>Endianess</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getLogicalProcessors <em>Logical Processors</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getModuleSwitchTime <em>Module Switch Time</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingNodeTypeImpl extends MinimalEObjectImpl.Container implements LogicalComputingNodeType {
	/**
	 * The cached value of the '{@link #getEndianess() <em>Endianess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianess()
	 * @generated
	 * @ordered
	 */
	protected EndianessType endianess;

	/**
	 * The cached value of the '{@link #getLogicalProcessors() <em>Logical Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalProcessorsType> logicalProcessors;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OsType os;

	/**
	 * The cached value of the '{@link #getAvailableMemory() <em>Available Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableMemory()
	 * @generated
	 * @ordered
	 */
	protected AvailableMemoryType availableMemory;

	/**
	 * The cached value of the '{@link #getModuleSwitchTime() <em>Module Switch Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSwitchTime()
	 * @generated
	 * @ordered
	 */
	protected ModuleSwitchTimeType moduleSwitchTime;

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
	protected LogicalComputingNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType getEndianess() {
		return endianess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndianess(EndianessType newEndianess, NotificationChain msgs) {
		EndianessType oldEndianess = endianess;
		endianess = newEndianess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS, oldEndianess, newEndianess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndianess(EndianessType newEndianess) {
		if (newEndianess != endianess) {
			NotificationChain msgs = null;
			if (endianess != null)
				msgs = ((InternalEObject)endianess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS, null, msgs);
			if (newEndianess != null)
				msgs = ((InternalEObject)newEndianess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS, null, msgs);
			msgs = basicSetEndianess(newEndianess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS, newEndianess, newEndianess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalProcessorsType> getLogicalProcessors() {
		if (logicalProcessors == null) {
			logicalProcessors = new EObjectContainmentEList<LogicalProcessorsType>(LogicalProcessorsType.class, this, logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS);
		}
		return logicalProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsType getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOs(OsType newOs, NotificationChain msgs) {
		OsType oldOs = os;
		os = newOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS, oldOs, newOs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OsType newOs) {
		if (newOs != os) {
			NotificationChain msgs = null;
			if (os != null)
				msgs = ((InternalEObject)os).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS, null, msgs);
			if (newOs != null)
				msgs = ((InternalEObject)newOs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS, null, msgs);
			msgs = basicSetOs(newOs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS, newOs, newOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableMemoryType getAvailableMemory() {
		return availableMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableMemory(AvailableMemoryType newAvailableMemory, NotificationChain msgs) {
		AvailableMemoryType oldAvailableMemory = availableMemory;
		availableMemory = newAvailableMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY, oldAvailableMemory, newAvailableMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableMemory(AvailableMemoryType newAvailableMemory) {
		if (newAvailableMemory != availableMemory) {
			NotificationChain msgs = null;
			if (availableMemory != null)
				msgs = ((InternalEObject)availableMemory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY, null, msgs);
			if (newAvailableMemory != null)
				msgs = ((InternalEObject)newAvailableMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY, null, msgs);
			msgs = basicSetAvailableMemory(newAvailableMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY, newAvailableMemory, newAvailableMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSwitchTimeType getModuleSwitchTime() {
		return moduleSwitchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleSwitchTime(ModuleSwitchTimeType newModuleSwitchTime, NotificationChain msgs) {
		ModuleSwitchTimeType oldModuleSwitchTime = moduleSwitchTime;
		moduleSwitchTime = newModuleSwitchTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME, oldModuleSwitchTime, newModuleSwitchTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleSwitchTime(ModuleSwitchTimeType newModuleSwitchTime) {
		if (newModuleSwitchTime != moduleSwitchTime) {
			NotificationChain msgs = null;
			if (moduleSwitchTime != null)
				msgs = ((InternalEObject)moduleSwitchTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME, null, msgs);
			if (newModuleSwitchTime != null)
				msgs = ((InternalEObject)newModuleSwitchTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME, null, msgs);
			msgs = basicSetModuleSwitchTime(newModuleSwitchTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME, newModuleSwitchTime, newModuleSwitchTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
				return basicSetEndianess(null, msgs);
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
				return ((InternalEList<?>)getLogicalProcessors()).basicRemove(otherEnd, msgs);
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
				return basicSetOs(null, msgs);
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
				return basicSetAvailableMemory(null, msgs);
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
				return basicSetModuleSwitchTime(null, msgs);
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
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
				return getEndianess();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
				return getLogicalProcessors();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
				return getOs();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
				return getAvailableMemory();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
				return getModuleSwitchTime();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID:
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
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
				setEndianess((EndianessType)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
				getLogicalProcessors().clear();
				getLogicalProcessors().addAll((Collection<? extends LogicalProcessorsType>)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
				setOs((OsType)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
				setAvailableMemory((AvailableMemoryType)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
				setModuleSwitchTime((ModuleSwitchTimeType)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID:
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
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
				setEndianess((EndianessType)null);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
				getLogicalProcessors().clear();
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
				setOs((OsType)null);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
				setAvailableMemory((AvailableMemoryType)null);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
				setModuleSwitchTime((ModuleSwitchTimeType)null);
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID:
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
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
				return endianess != null;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
				return logicalProcessors != null && !logicalProcessors.isEmpty();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
				return os != null;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
				return availableMemory != null;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
				return moduleSwitchTime != null;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID:
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

} //LogicalComputingNodeTypeImpl
