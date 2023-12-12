/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleType;
import technology.ecoa.implementation._2.ProgrammingLanguage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module
 * Implementation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ModuleImplementationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleImplementationImpl#getModuleType <em>Module Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImplementationImpl extends MinimalEObjectImpl.Container implements ModuleImplementation {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammingLanguage LANGUAGE_EDEFAULT = ProgrammingLanguage.C;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleType() <em>Module Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected ModuleType moduleType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.MODULE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammingLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLanguage() {
		ProgrammingLanguage oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleType getModuleType() {
		if (moduleType != null && moduleType.eIsProxy()) {
			InternalEObject oldModuleType = (InternalEObject)moduleType;
			moduleType = (ModuleType)eResolveProxy(oldModuleType);
			if (moduleType != oldModuleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE, oldModuleType, moduleType));
			}
		}
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType basicGetModuleType() {
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setModuleType(ModuleType newModuleType) {
		ModuleType oldModuleType = moduleType;
		moduleType = newModuleType;
		EList<ModuleInstance> findAssociatedModuleInstance = findAssociatedModuleInstance();
		for (ModuleInstance moduleInstance : findAssociatedModuleInstance) {
			moduleInstance.setModuleType(newModuleType);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE, oldModuleType, moduleType));
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<ModuleInstance> findAssociatedModuleInstance() {
		EList<ModuleInstance> instanceAssociated = new BasicEList<>();
		if (this.eContainer() != null) {
			ComponentImplementation componentImplementation = (ComponentImplementation) this.eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, componentImplementation);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ModuleInstance moduleInstance) {
					instanceAssociated.add(moduleInstance);
				}
			}
		}
		return instanceAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				return getLanguage();
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME:
				return getName();
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				if (resolve) return getModuleType();
				return basicGetModuleType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				setLanguage((ProgrammingLanguage)newValue);
				return;
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				setModuleType((ModuleType)newValue);
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
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				unsetLanguage();
				return;
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				setModuleType((ModuleType)null);
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
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE:
				return isSetLanguage();
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__MODULE_TYPE:
				return moduleType != null;
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
		result.append(" (language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getLanguage() != null
				&& this.getModuleType() != null);
	}

} // ModuleImplementationImpl
