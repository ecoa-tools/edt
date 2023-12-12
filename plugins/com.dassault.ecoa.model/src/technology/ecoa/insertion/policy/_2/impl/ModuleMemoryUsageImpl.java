/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.DynamicMemoryType;
import technology.ecoa.insertion.policy._2.ModuleMemoryUsage;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getUserContextSize <em>User Context Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getWarmStartContextSize <em>Warm Start Context Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getDynamicMemory <em>Dynamic Memory</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getHeapSize <em>Heap Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleMemoryUsageImpl extends MinimalEObjectImpl.Container implements ModuleMemoryUsage {
	/**
	 * The cached value of the '{@link #getUserContextSize() <em>User Context Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserContextSize()
	 * @generated
	 * @ordered
	 */
	protected EObject userContextSize;

	/**
	 * The cached value of the '{@link #getWarmStartContextSize() <em>Warm Start Context Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarmStartContextSize()
	 * @generated
	 * @ordered
	 */
	protected EObject warmStartContextSize;

	/**
	 * The cached value of the '{@link #getDynamicMemory() <em>Dynamic Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMemory()
	 * @generated
	 * @ordered
	 */
	protected DynamicMemoryType dynamicMemory;

	/**
	 * The cached value of the '{@link #getStackSize() <em>Stack Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected EObject stackSize;

	/**
	 * The cached value of the '{@link #getHeapSize() <em>Heap Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSize()
	 * @generated
	 * @ordered
	 */
	protected EObject heapSize;

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
	protected ModuleMemoryUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULE_MEMORY_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUserContextSize() {
		return userContextSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserContextSize(EObject newUserContextSize, NotificationChain msgs) {
		EObject oldUserContextSize = userContextSize;
		userContextSize = newUserContextSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE, oldUserContextSize, newUserContextSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserContextSize(EObject newUserContextSize) {
		if (newUserContextSize != userContextSize) {
			NotificationChain msgs = null;
			if (userContextSize != null)
				msgs = ((InternalEObject)userContextSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE, null, msgs);
			if (newUserContextSize != null)
				msgs = ((InternalEObject)newUserContextSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE, null, msgs);
			msgs = basicSetUserContextSize(newUserContextSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE, newUserContextSize, newUserContextSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWarmStartContextSize() {
		return warmStartContextSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarmStartContextSize(EObject newWarmStartContextSize, NotificationChain msgs) {
		EObject oldWarmStartContextSize = warmStartContextSize;
		warmStartContextSize = newWarmStartContextSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE, oldWarmStartContextSize, newWarmStartContextSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarmStartContextSize(EObject newWarmStartContextSize) {
		if (newWarmStartContextSize != warmStartContextSize) {
			NotificationChain msgs = null;
			if (warmStartContextSize != null)
				msgs = ((InternalEObject)warmStartContextSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE, null, msgs);
			if (newWarmStartContextSize != null)
				msgs = ((InternalEObject)newWarmStartContextSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE, null, msgs);
			msgs = basicSetWarmStartContextSize(newWarmStartContextSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE, newWarmStartContextSize, newWarmStartContextSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMemoryType getDynamicMemory() {
		return dynamicMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicMemory(DynamicMemoryType newDynamicMemory, NotificationChain msgs) {
		DynamicMemoryType oldDynamicMemory = dynamicMemory;
		dynamicMemory = newDynamicMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY, oldDynamicMemory, newDynamicMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicMemory(DynamicMemoryType newDynamicMemory) {
		if (newDynamicMemory != dynamicMemory) {
			NotificationChain msgs = null;
			if (dynamicMemory != null)
				msgs = ((InternalEObject)dynamicMemory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY, null, msgs);
			if (newDynamicMemory != null)
				msgs = ((InternalEObject)newDynamicMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY, null, msgs);
			msgs = basicSetDynamicMemory(newDynamicMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY, newDynamicMemory, newDynamicMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStackSize() {
		return stackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStackSize(EObject newStackSize, NotificationChain msgs) {
		EObject oldStackSize = stackSize;
		stackSize = newStackSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__STACK_SIZE, oldStackSize, newStackSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackSize(EObject newStackSize) {
		if (newStackSize != stackSize) {
			NotificationChain msgs = null;
			if (stackSize != null)
				msgs = ((InternalEObject)stackSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__STACK_SIZE, null, msgs);
			if (newStackSize != null)
				msgs = ((InternalEObject)newStackSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__STACK_SIZE, null, msgs);
			msgs = basicSetStackSize(newStackSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__STACK_SIZE, newStackSize, newStackSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getHeapSize() {
		return heapSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeapSize(EObject newHeapSize, NotificationChain msgs) {
		EObject oldHeapSize = heapSize;
		heapSize = newHeapSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE, oldHeapSize, newHeapSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeapSize(EObject newHeapSize) {
		if (newHeapSize != heapSize) {
			NotificationChain msgs = null;
			if (heapSize != null)
				msgs = ((InternalEObject)heapSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE, null, msgs);
			if (newHeapSize != null)
				msgs = ((InternalEObject)newHeapSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE, null, msgs);
			msgs = basicSetHeapSize(newHeapSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE, newHeapSize, newHeapSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_MEMORY_USAGE__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE:
				return basicSetUserContextSize(null, msgs);
			case polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE:
				return basicSetWarmStartContextSize(null, msgs);
			case polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY:
				return basicSetDynamicMemory(null, msgs);
			case polPackage.MODULE_MEMORY_USAGE__STACK_SIZE:
				return basicSetStackSize(null, msgs);
			case polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE:
				return basicSetHeapSize(null, msgs);
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
			case polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE:
				return getUserContextSize();
			case polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE:
				return getWarmStartContextSize();
			case polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY:
				return getDynamicMemory();
			case polPackage.MODULE_MEMORY_USAGE__STACK_SIZE:
				return getStackSize();
			case polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE:
				return getHeapSize();
			case polPackage.MODULE_MEMORY_USAGE__INSTANCE_NAME:
				return getInstanceName();
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
			case polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE:
				setUserContextSize((EObject)newValue);
				return;
			case polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE:
				setWarmStartContextSize((EObject)newValue);
				return;
			case polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY:
				setDynamicMemory((DynamicMemoryType)newValue);
				return;
			case polPackage.MODULE_MEMORY_USAGE__STACK_SIZE:
				setStackSize((EObject)newValue);
				return;
			case polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE:
				setHeapSize((EObject)newValue);
				return;
			case polPackage.MODULE_MEMORY_USAGE__INSTANCE_NAME:
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
			case polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE:
				setUserContextSize((EObject)null);
				return;
			case polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE:
				setWarmStartContextSize((EObject)null);
				return;
			case polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY:
				setDynamicMemory((DynamicMemoryType)null);
				return;
			case polPackage.MODULE_MEMORY_USAGE__STACK_SIZE:
				setStackSize((EObject)null);
				return;
			case polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE:
				setHeapSize((EObject)null);
				return;
			case polPackage.MODULE_MEMORY_USAGE__INSTANCE_NAME:
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
			case polPackage.MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE:
				return userContextSize != null;
			case polPackage.MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE:
				return warmStartContextSize != null;
			case polPackage.MODULE_MEMORY_USAGE__DYNAMIC_MEMORY:
				return dynamicMemory != null;
			case polPackage.MODULE_MEMORY_USAGE__STACK_SIZE:
				return stackSize != null;
			case polPackage.MODULE_MEMORY_USAGE__HEAP_SIZE:
				return heapSize != null;
			case polPackage.MODULE_MEMORY_USAGE__INSTANCE_NAME:
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

} //ModuleMemoryUsageImpl
