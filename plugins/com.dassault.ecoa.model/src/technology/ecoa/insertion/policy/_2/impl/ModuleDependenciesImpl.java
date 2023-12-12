/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.insertion.policy._2.LanguageLibraries;
import technology.ecoa.insertion.policy._2.ModuleCompilationOptions;
import technology.ecoa.insertion.policy._2.ModuleDependencies;
import technology.ecoa.insertion.policy._2.OSAPIType;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl#getLanguageRuntime <em>Language Runtime</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl#getLanguageLibraries <em>Language Libraries</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl#getDirectOSAccess <em>Direct OS Access</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl#getModuleCompilationOptions <em>Module Compilation Options</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDependenciesImpl extends MinimalEObjectImpl.Container implements ModuleDependencies {
	/**
	 * The cached value of the '{@link #getLanguageRuntime() <em>Language Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageRuntime()
	 * @generated
	 * @ordered
	 */
	protected EObject languageRuntime;

	/**
	 * The cached value of the '{@link #getLanguageLibraries() <em>Language Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageLibraries()
	 * @generated
	 * @ordered
	 */
	protected LanguageLibraries languageLibraries;

	/**
	 * The cached value of the '{@link #getDirectOSAccess() <em>Direct OS Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectOSAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<OSAPIType> directOSAccess;

	/**
	 * The cached value of the '{@link #getModuleCompilationOptions() <em>Module Compilation Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCompilationOptions()
	 * @generated
	 * @ordered
	 */
	protected ModuleCompilationOptions moduleCompilationOptions;

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
	protected ModuleDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULE_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLanguageRuntime() {
		return languageRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageRuntime(EObject newLanguageRuntime, NotificationChain msgs) {
		EObject oldLanguageRuntime = languageRuntime;
		languageRuntime = newLanguageRuntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME, oldLanguageRuntime, newLanguageRuntime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageRuntime(EObject newLanguageRuntime) {
		if (newLanguageRuntime != languageRuntime) {
			NotificationChain msgs = null;
			if (languageRuntime != null)
				msgs = ((InternalEObject)languageRuntime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME, null, msgs);
			if (newLanguageRuntime != null)
				msgs = ((InternalEObject)newLanguageRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME, null, msgs);
			msgs = basicSetLanguageRuntime(newLanguageRuntime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME, newLanguageRuntime, newLanguageRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageLibraries getLanguageLibraries() {
		return languageLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageLibraries(LanguageLibraries newLanguageLibraries, NotificationChain msgs) {
		LanguageLibraries oldLanguageLibraries = languageLibraries;
		languageLibraries = newLanguageLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES, oldLanguageLibraries, newLanguageLibraries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageLibraries(LanguageLibraries newLanguageLibraries) {
		if (newLanguageLibraries != languageLibraries) {
			NotificationChain msgs = null;
			if (languageLibraries != null)
				msgs = ((InternalEObject)languageLibraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES, null, msgs);
			if (newLanguageLibraries != null)
				msgs = ((InternalEObject)newLanguageLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES, null, msgs);
			msgs = basicSetLanguageLibraries(newLanguageLibraries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES, newLanguageLibraries, newLanguageLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSAPIType> getDirectOSAccess() {
		if (directOSAccess == null) {
			directOSAccess = new EObjectContainmentEList<OSAPIType>(OSAPIType.class, this, polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS);
		}
		return directOSAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCompilationOptions getModuleCompilationOptions() {
		return moduleCompilationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleCompilationOptions(ModuleCompilationOptions newModuleCompilationOptions, NotificationChain msgs) {
		ModuleCompilationOptions oldModuleCompilationOptions = moduleCompilationOptions;
		moduleCompilationOptions = newModuleCompilationOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS, oldModuleCompilationOptions, newModuleCompilationOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleCompilationOptions(ModuleCompilationOptions newModuleCompilationOptions) {
		if (newModuleCompilationOptions != moduleCompilationOptions) {
			NotificationChain msgs = null;
			if (moduleCompilationOptions != null)
				msgs = ((InternalEObject)moduleCompilationOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS, null, msgs);
			if (newModuleCompilationOptions != null)
				msgs = ((InternalEObject)newModuleCompilationOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS, null, msgs);
			msgs = basicSetModuleCompilationOptions(newModuleCompilationOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS, newModuleCompilationOptions, newModuleCompilationOptions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
				return basicSetLanguageRuntime(null, msgs);
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
				return basicSetLanguageLibraries(null, msgs);
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
				return ((InternalEList<?>)getDirectOSAccess()).basicRemove(otherEnd, msgs);
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
				return basicSetModuleCompilationOptions(null, msgs);
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
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
				return getLanguageRuntime();
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
				return getLanguageLibraries();
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
				return getDirectOSAccess();
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
				return getModuleCompilationOptions();
			case polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME:
				return getInstanceName();
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
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
				setLanguageRuntime((EObject)newValue);
				return;
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
				setLanguageLibraries((LanguageLibraries)newValue);
				return;
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
				getDirectOSAccess().clear();
				getDirectOSAccess().addAll((Collection<? extends OSAPIType>)newValue);
				return;
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
				setModuleCompilationOptions((ModuleCompilationOptions)newValue);
				return;
			case polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME:
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
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
				setLanguageRuntime((EObject)null);
				return;
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
				setLanguageLibraries((LanguageLibraries)null);
				return;
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
				getDirectOSAccess().clear();
				return;
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
				setModuleCompilationOptions((ModuleCompilationOptions)null);
				return;
			case polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME:
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
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
				return languageRuntime != null;
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
				return languageLibraries != null;
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
				return directOSAccess != null && !directOSAccess.isEmpty();
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
				return moduleCompilationOptions != null;
			case polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME:
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

} //ModuleDependenciesImpl
