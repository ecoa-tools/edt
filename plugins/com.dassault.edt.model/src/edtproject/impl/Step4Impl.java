/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

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

import edtimplementation.ComponentImplementation;
import edtproject.EDTProjectPackage;
import edtproject.Step4;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Step4</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.Step4Impl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link edtproject.impl.Step4Impl#getComponentImplementations <em>Component Implementations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Step4Impl extends MinimalEObjectImpl.Container implements Step4 {
	/**
	 * The default value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected String folderName = FOLDER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentImplementations() <em>Component Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementation> componentImplementations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Step4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEP4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFolderName() {
		return folderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolderName(String newFolderName) {
		String oldFolderName = folderName;
		folderName = newFolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP4__FOLDER_NAME, oldFolderName, folderName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentImplementation> getComponentImplementations() {
		if (componentImplementations == null) {
			componentImplementations = new EObjectContainmentEList<ComponentImplementation>(ComponentImplementation.class, this, EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS);
		}
		return componentImplementations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS:
				return ((InternalEList<?>)getComponentImplementations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.STEP4__FOLDER_NAME:
				return getFolderName();
			case EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS:
				return getComponentImplementations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EDTProjectPackage.STEP4__FOLDER_NAME:
				setFolderName((String)newValue);
				return;
			case EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS:
				getComponentImplementations().clear();
				getComponentImplementations().addAll((Collection<? extends ComponentImplementation>)newValue);
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
			case EDTProjectPackage.STEP4__FOLDER_NAME:
				setFolderName(FOLDER_NAME_EDEFAULT);
				return;
			case EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS:
				getComponentImplementations().clear();
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
			case EDTProjectPackage.STEP4__FOLDER_NAME:
				return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
			case EDTProjectPackage.STEP4__COMPONENT_IMPLEMENTATIONS:
				return componentImplementations != null && !componentImplementations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	/**
	 * 
	 * @param edtComponentImplementation
	 * @param implementationName
	 * @return
	 */
	public edtimplementation.ComponentImplementation findComponentImplementationByName(String implementationName) {
		for (edtimplementation.ComponentImplementation edtComponentImplementation : componentImplementations) {
			if (Objects.equals(edtComponentImplementation.getName(), implementationName)) {
				return edtComponentImplementation;
			}
		}
		return null;
	}

} // Step4Impl
