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

import edtproject.ComponentDefinition;
import edtproject.EDTProjectPackage;
import edtproject.Step2;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Step2</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.Step2Impl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link edtproject.impl.Step2Impl#getComponentDefinitions <em>Component Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Step2Impl extends MinimalEObjectImpl.Container implements Step2 {
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
	 * The cached value of the '{@link #getComponentDefinitions() <em>Component Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getComponentDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentDefinition> componentDefinitions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Step2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEP2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP2__FOLDER_NAME, oldFolderName, folderName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentDefinition> getComponentDefinitions() {
		if (componentDefinitions == null) {
			componentDefinitions = new EObjectContainmentEList<ComponentDefinition>(ComponentDefinition.class, this, EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS);
		}
		return componentDefinitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS:
				return ((InternalEList<?>)getComponentDefinitions()).basicRemove(otherEnd, msgs);
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
			case EDTProjectPackage.STEP2__FOLDER_NAME:
				return getFolderName();
			case EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS:
				return getComponentDefinitions();
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
			case EDTProjectPackage.STEP2__FOLDER_NAME:
				setFolderName((String)newValue);
				return;
			case EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS:
				getComponentDefinitions().clear();
				getComponentDefinitions().addAll((Collection<? extends ComponentDefinition>)newValue);
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
			case EDTProjectPackage.STEP2__FOLDER_NAME:
				setFolderName(FOLDER_NAME_EDEFAULT);
				return;
			case EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS:
				getComponentDefinitions().clear();
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
			case EDTProjectPackage.STEP2__FOLDER_NAME:
				return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
			case EDTProjectPackage.STEP2__COMPONENT_DEFINITIONS:
				return componentDefinitions != null && !componentDefinitions.isEmpty();
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

	@Override
	public ComponentDefinition findComponentDefinitionByName(String name) {
		for (ComponentDefinition edtComponentType : componentDefinitions) {
			if (Objects.equals(edtComponentType.getName(), name)) {
				return edtComponentType;
			}
		}

		return null;
	}

} // Step2Impl
