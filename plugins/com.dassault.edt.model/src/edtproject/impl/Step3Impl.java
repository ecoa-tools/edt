/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.Step3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.Step3Impl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link edtproject.impl.Step3Impl#getInitialAssembly <em>Initial Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Step3Impl extends MinimalEObjectImpl.Container implements Step3 {
	/**
	 * The default value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected String folderName = FOLDER_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInitialAssembly() <em>Initial Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialAssembly()
	 * @generated
	 * @ordered
	 */
	protected Composite initialAssembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Step3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFolderName() {
		return folderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolderName(String newFolderName) {
		String oldFolderName = folderName;
		folderName = newFolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP3__FOLDER_NAME, oldFolderName, folderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite getInitialAssembly() {
		return initialAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialAssembly(Composite newInitialAssembly, NotificationChain msgs) {
		Composite oldInitialAssembly = initialAssembly;
		initialAssembly = newInitialAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP3__INITIAL_ASSEMBLY, oldInitialAssembly, newInitialAssembly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialAssembly(Composite newInitialAssembly) {
		if (newInitialAssembly != initialAssembly) {
			NotificationChain msgs = null;
			if (initialAssembly != null)
				msgs = ((InternalEObject)initialAssembly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP3__INITIAL_ASSEMBLY, null, msgs);
			if (newInitialAssembly != null)
				msgs = ((InternalEObject)newInitialAssembly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP3__INITIAL_ASSEMBLY, null, msgs);
			msgs = basicSetInitialAssembly(newInitialAssembly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP3__INITIAL_ASSEMBLY, newInitialAssembly, newInitialAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDTProjectPackage.STEP3__INITIAL_ASSEMBLY:
				return basicSetInitialAssembly(null, msgs);
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
			case EDTProjectPackage.STEP3__FOLDER_NAME:
				return getFolderName();
			case EDTProjectPackage.STEP3__INITIAL_ASSEMBLY:
				return getInitialAssembly();
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
			case EDTProjectPackage.STEP3__FOLDER_NAME:
				setFolderName((String)newValue);
				return;
			case EDTProjectPackage.STEP3__INITIAL_ASSEMBLY:
				setInitialAssembly((Composite)newValue);
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
			case EDTProjectPackage.STEP3__FOLDER_NAME:
				setFolderName(FOLDER_NAME_EDEFAULT);
				return;
			case EDTProjectPackage.STEP3__INITIAL_ASSEMBLY:
				setInitialAssembly((Composite)null);
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
			case EDTProjectPackage.STEP3__FOLDER_NAME:
				return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
			case EDTProjectPackage.STEP3__INITIAL_ASSEMBLY:
				return initialAssembly != null;
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
		result.append(" (FolderName: ");
		result.append(folderName);
		result.append(')');
		return result.toString();
	}

} //Step3Impl
