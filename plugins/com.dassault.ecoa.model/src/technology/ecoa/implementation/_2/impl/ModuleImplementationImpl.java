/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.ModuleImplementation;
import technology.ecoa.implementation._2.ProgrammingLanguage;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleImplementationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleImplementationImpl#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleImplementationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImplementationImpl extends MinimalEObjectImpl.Container implements ModuleImplementation {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammingLanguage LANGUAGE_EDEFAULT = ProgrammingLanguage.C;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

	/**
	 * The default value of the '{@link #getModuleType() <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleType() <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected String moduleType = MODULE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.MODULE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_IMPLEMENTATION__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguage() {
		ProgrammingLanguage oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.MODULE_IMPLEMENTATION__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleType() {
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleType(String newModuleType) {
		String oldModuleType = moduleType;
		moduleType = newModuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_IMPLEMENTATION__MODULE_TYPE, oldModuleType, moduleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				return getLanguage();
			case impPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				return getModuleType();
			case impPackage.MODULE_IMPLEMENTATION__NAME:
				return getName();
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
			case impPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				setLanguage((ProgrammingLanguage)newValue);
				return;
			case impPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				setModuleType((String)newValue);
				return;
			case impPackage.MODULE_IMPLEMENTATION__NAME:
				setName((String)newValue);
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
			case impPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				unsetLanguage();
				return;
			case impPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				setModuleType(MODULE_TYPE_EDEFAULT);
				return;
			case impPackage.MODULE_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
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
			case impPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				return isSetLanguage();
			case impPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				return MODULE_TYPE_EDEFAULT == null ? moduleType != null : !MODULE_TYPE_EDEFAULT.equals(moduleType);
			case impPackage.MODULE_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", moduleType: ");
		result.append(moduleType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImplementationImpl
