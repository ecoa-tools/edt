/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin.impl;

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

import edtbin.BinaryModule;
import edtbin.EdtbinPackage;
import edtimplementation.ModuleImplementation;
import technology.ecoa.bin.desc._2.BinaryDependency;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Binary
 * Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getBinaryDependencies <em>Binary
 * Dependencies</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getChecksum <em>Checksum</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getHeapSize <em>Heap Size</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getObject <em>Object</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getStackSize <em>Stack
 * Size</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getUserContextSize <em>User Context
 * Size</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getWarmStartContextSize <em>Warm
 * Start Context Size</em>}</li>
 * <li>{@link edtbin.impl.BinaryModuleImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryModuleImpl extends MinimalEObjectImpl.Container implements BinaryModule {
	/**
	 * The cached value of the '{@link #getBinaryDependencies() <em>Binary
	 * Dependencies</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBinaryDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryDependency> binaryDependencies;

	/**
	 * The default value of the '{@link #getChecksum() <em>Checksum</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected String checksum = CHECKSUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapSize() <em>Heap Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeapSize()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSize() <em>Heap Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeapSize()
	 * @generated
	 * @ordered
	 */
	protected String heapSize = HEAP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackSize() <em>Stack Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackSize() <em>Stack Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected String stackSize = STACK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserContextSize() <em>User Context
	 * Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUserContextSize()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_CONTEXT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserContextSize() <em>User Context
	 * Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUserContextSize()
	 * @generated
	 * @ordered
	 */
	protected String userContextSize = USER_CONTEXT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarmStartContextSize() <em>Warm Start
	 * Context Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWarmStartContextSize()
	 * @generated
	 * @ordered
	 */
	protected static final String WARM_START_CONTEXT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarmStartContextSize() <em>Warm Start
	 * Context Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWarmStartContextSize()
	 * @generated
	 * @ordered
	 */
	protected String warmStartContextSize = WARM_START_CONTEXT_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ModuleImplementation reference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BinaryModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtbinPackage.Literals.BINARY_MODULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BinaryDependency> getBinaryDependencies() {
		if (binaryDependencies == null) {
			binaryDependencies = new EObjectContainmentEList<BinaryDependency>(BinaryDependency.class, this,
					EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES);
		}
		return binaryDependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setChecksum(String newChecksum) {
		String oldChecksum = checksum;
		checksum = newChecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__CHECKSUM, oldChecksum,
					checksum));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHeapSize() {
		return heapSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHeapSize(String newHeapSize) {
		String oldHeapSize = heapSize;
		heapSize = newHeapSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__HEAP_SIZE, oldHeapSize,
					heapSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__OBJECT, oldObject,
					object));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getStackSize() {
		return stackSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStackSize(String newStackSize) {
		String oldStackSize = stackSize;
		stackSize = newStackSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__STACK_SIZE, oldStackSize,
					stackSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getUserContextSize() {
		return userContextSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setUserContextSize(String newUserContextSize) {
		String oldUserContextSize = userContextSize;
		userContextSize = newUserContextSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__USER_CONTEXT_SIZE,
					oldUserContextSize, userContextSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getWarmStartContextSize() {
		return warmStartContextSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setWarmStartContextSize(String newWarmStartContextSize) {
		String oldWarmStartContextSize = warmStartContextSize;
		warmStartContextSize = newWarmStartContextSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__WARM_START_CONTEXT_SIZE,
					oldWarmStartContextSize, warmStartContextSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ModuleImplementation getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (ModuleImplementation) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtbinPackage.BINARY_MODULE__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleImplementation basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReference(ModuleImplementation newReference) {
		ModuleImplementation oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BINARY_MODULE__REFERENCE, oldReference,
					reference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES:
			return ((InternalEList<?>) getBinaryDependencies()).basicRemove(otherEnd, msgs);
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
		case EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES:
			return getBinaryDependencies();
		case EdtbinPackage.BINARY_MODULE__CHECKSUM:
			return getChecksum();
		case EdtbinPackage.BINARY_MODULE__HEAP_SIZE:
			return getHeapSize();
		case EdtbinPackage.BINARY_MODULE__OBJECT:
			return getObject();
		case EdtbinPackage.BINARY_MODULE__STACK_SIZE:
			return getStackSize();
		case EdtbinPackage.BINARY_MODULE__USER_CONTEXT_SIZE:
			return getUserContextSize();
		case EdtbinPackage.BINARY_MODULE__WARM_START_CONTEXT_SIZE:
			return getWarmStartContextSize();
		case EdtbinPackage.BINARY_MODULE__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
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
		case EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES:
			getBinaryDependencies().clear();
			getBinaryDependencies().addAll((Collection<? extends BinaryDependency>) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__CHECKSUM:
			setChecksum((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__HEAP_SIZE:
			setHeapSize((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__OBJECT:
			setObject((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__STACK_SIZE:
			setStackSize((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__USER_CONTEXT_SIZE:
			setUserContextSize((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__WARM_START_CONTEXT_SIZE:
			setWarmStartContextSize((String) newValue);
			return;
		case EdtbinPackage.BINARY_MODULE__REFERENCE:
			setReference((ModuleImplementation) newValue);
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
		case EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES:
			getBinaryDependencies().clear();
			return;
		case EdtbinPackage.BINARY_MODULE__CHECKSUM:
			setChecksum(CHECKSUM_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__HEAP_SIZE:
			setHeapSize(HEAP_SIZE_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__OBJECT:
			setObject(OBJECT_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__STACK_SIZE:
			setStackSize(STACK_SIZE_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__USER_CONTEXT_SIZE:
			setUserContextSize(USER_CONTEXT_SIZE_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__WARM_START_CONTEXT_SIZE:
			setWarmStartContextSize(WARM_START_CONTEXT_SIZE_EDEFAULT);
			return;
		case EdtbinPackage.BINARY_MODULE__REFERENCE:
			setReference((ModuleImplementation) null);
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
		case EdtbinPackage.BINARY_MODULE__BINARY_DEPENDENCIES:
			return binaryDependencies != null && !binaryDependencies.isEmpty();
		case EdtbinPackage.BINARY_MODULE__CHECKSUM:
			return CHECKSUM_EDEFAULT == null ? checksum != null : !CHECKSUM_EDEFAULT.equals(checksum);
		case EdtbinPackage.BINARY_MODULE__HEAP_SIZE:
			return HEAP_SIZE_EDEFAULT == null ? heapSize != null : !HEAP_SIZE_EDEFAULT.equals(heapSize);
		case EdtbinPackage.BINARY_MODULE__OBJECT:
			return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		case EdtbinPackage.BINARY_MODULE__STACK_SIZE:
			return STACK_SIZE_EDEFAULT == null ? stackSize != null : !STACK_SIZE_EDEFAULT.equals(stackSize);
		case EdtbinPackage.BINARY_MODULE__USER_CONTEXT_SIZE:
			return USER_CONTEXT_SIZE_EDEFAULT == null ? userContextSize != null
					: !USER_CONTEXT_SIZE_EDEFAULT.equals(userContextSize);
		case EdtbinPackage.BINARY_MODULE__WARM_START_CONTEXT_SIZE:
			return WARM_START_CONTEXT_SIZE_EDEFAULT == null ? warmStartContextSize != null
					: !WARM_START_CONTEXT_SIZE_EDEFAULT.equals(warmStartContextSize);
		case EdtbinPackage.BINARY_MODULE__REFERENCE:
			return reference != null;
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
		result.append(" (checksum: ");
		result.append(checksum);
		result.append(", heapSize: ");
		result.append(heapSize);
		result.append(", object: ");
		result.append(object);
		result.append(", stackSize: ");
		result.append(stackSize);
		result.append(", userContextSize: ");
		result.append(userContextSize);
		result.append(", warmStartContextSize: ");
		result.append(warmStartContextSize);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getReference() != null && this.getObject() != null && !this.getObject().isBlank()
				&& this.getUserContextSize() != null && !this.getUserContextSize().isBlank()
				&& this.getWarmStartContextSize() != null && !this.getWarmStartContextSize().isBlank()
				&& this.getStackSize() != null && !this.getStackSize().isBlank() && this.getHeapSize() != null
				&& !this.getHeapSize().isBlank() && this.getChecksum() != null && !this.getChecksum().isBlank());
	}

} // BinaryModuleImpl
