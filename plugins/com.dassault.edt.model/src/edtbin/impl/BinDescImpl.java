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

import edtbin.BinDesc;
import edtbin.BinaryModule;
import edtbin.EdtbinPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bin
 * Desc</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtbin.impl.BinDescImpl#getBinaryModules <em>Binary
 * Modules</em>}</li>
 * <li>{@link edtbin.impl.BinDescImpl#getInsertionPolicy <em>Insertion
 * Policy</em>}</li>
 * <li>{@link edtbin.impl.BinDescImpl#getProcessorTargetType <em>Processor
 * Target Type</em>}</li>
 * <li>{@link edtbin.impl.BinDescImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinDescImpl extends MinimalEObjectImpl.Container implements BinDesc {
	/**
	 * The cached value of the '{@link #getBinaryModules() <em>Binary Modules</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBinaryModules()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryModule> binaryModules;

	/**
	 * The default value of the '{@link #getInsertionPolicy() <em>Insertion
	 * Policy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERTION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertionPolicy() <em>Insertion
	 * Policy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected String insertionPolicy = INSERTION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorTargetType() <em>Processor
	 * Target Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcessorTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_TARGET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorTargetType() <em>Processor
	 * Target Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcessorTargetType()
	 * @generated
	 * @ordered
	 */
	protected String processorTargetType = PROCESSOR_TARGET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BinDescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtbinPackage.Literals.BIN_DESC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BinaryModule> getBinaryModules() {
		if (binaryModules == null) {
			binaryModules = new EObjectContainmentEList<BinaryModule>(BinaryModule.class, this,
					EdtbinPackage.BIN_DESC__BINARY_MODULES);
		}
		return binaryModules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getInsertionPolicy() {
		return insertionPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInsertionPolicy(String newInsertionPolicy) {
		String oldInsertionPolicy = insertionPolicy;
		insertionPolicy = newInsertionPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BIN_DESC__INSERTION_POLICY,
					oldInsertionPolicy, insertionPolicy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getProcessorTargetType() {
		return processorTargetType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setProcessorTargetType(String newProcessorTargetType) {
		String oldProcessorTargetType = processorTargetType;
		processorTargetType = newProcessorTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BIN_DESC__PROCESSOR_TARGET_TYPE,
					oldProcessorTargetType, processorTargetType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtbinPackage.BIN_DESC__FILE_NAME, oldFileName,
					fileName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtbinPackage.BIN_DESC__BINARY_MODULES:
			return ((InternalEList<?>) getBinaryModules()).basicRemove(otherEnd, msgs);
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
		case EdtbinPackage.BIN_DESC__BINARY_MODULES:
			return getBinaryModules();
		case EdtbinPackage.BIN_DESC__INSERTION_POLICY:
			return getInsertionPolicy();
		case EdtbinPackage.BIN_DESC__PROCESSOR_TARGET_TYPE:
			return getProcessorTargetType();
		case EdtbinPackage.BIN_DESC__FILE_NAME:
			return getFileName();
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
		case EdtbinPackage.BIN_DESC__BINARY_MODULES:
			getBinaryModules().clear();
			getBinaryModules().addAll((Collection<? extends BinaryModule>) newValue);
			return;
		case EdtbinPackage.BIN_DESC__INSERTION_POLICY:
			setInsertionPolicy((String) newValue);
			return;
		case EdtbinPackage.BIN_DESC__PROCESSOR_TARGET_TYPE:
			setProcessorTargetType((String) newValue);
			return;
		case EdtbinPackage.BIN_DESC__FILE_NAME:
			setFileName((String) newValue);
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
		case EdtbinPackage.BIN_DESC__BINARY_MODULES:
			getBinaryModules().clear();
			return;
		case EdtbinPackage.BIN_DESC__INSERTION_POLICY:
			setInsertionPolicy(INSERTION_POLICY_EDEFAULT);
			return;
		case EdtbinPackage.BIN_DESC__PROCESSOR_TARGET_TYPE:
			setProcessorTargetType(PROCESSOR_TARGET_TYPE_EDEFAULT);
			return;
		case EdtbinPackage.BIN_DESC__FILE_NAME:
			setFileName(FILE_NAME_EDEFAULT);
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
		case EdtbinPackage.BIN_DESC__BINARY_MODULES:
			return binaryModules != null && !binaryModules.isEmpty();
		case EdtbinPackage.BIN_DESC__INSERTION_POLICY:
			return INSERTION_POLICY_EDEFAULT == null ? insertionPolicy != null
					: !INSERTION_POLICY_EDEFAULT.equals(insertionPolicy);
		case EdtbinPackage.BIN_DESC__PROCESSOR_TARGET_TYPE:
			return PROCESSOR_TARGET_TYPE_EDEFAULT == null ? processorTargetType != null
					: !PROCESSOR_TARGET_TYPE_EDEFAULT.equals(processorTargetType);
		case EdtbinPackage.BIN_DESC__FILE_NAME:
			return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (insertionPolicy: ");
		result.append(insertionPolicy);
		result.append(", processorTargetType: ");
		result.append(processorTargetType);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getFileName() != null && !this.getFileName().isBlank() && this.getProcessorTargetType() != null
				&& !this.getProcessorTargetType().isBlank() && !this.getBinaryModules().isEmpty());
	}

} // BinDescImpl
