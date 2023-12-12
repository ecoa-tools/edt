/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

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

import com.dassault.edt.log.EDTLog;

import edtdeployment.ComponentLog;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ModuleLog;
import edtimplementation.ComponentImplementation;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Log</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.impl.ComponentLogImpl#getModuleLogs <em>Module
 * Logs</em>}</li>
 * <li>{@link edtdeployment.impl.ComponentLogImpl#getEnabledLevels <em>Enabled
 * Levels</em>}</li>
 * <li>{@link edtdeployment.impl.ComponentLogImpl#getComponentInstance
 * <em>Component Instance</em>}</li>
 * <li>{@link edtdeployment.impl.ComponentLogImpl#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentLogImpl extends MinimalEObjectImpl.Container implements ComponentLog {
	/**
	 * The cached value of the '{@link #getModuleLogs() <em>Module Logs</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleLog> moduleLogs;

	/**
	 * The default value of the '{@link #getEnabledLevels() <em>Enabled
	 * Levels</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledLevels() <em>Enabled Levels</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnabledLevels()
	 * @generated
	 * @ordered
	 */
	protected String enabledLevels = ENABLED_LEVELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected Component componentInstance;

	/**
	 * The cached value of the '{@link #getComponentImplementation() <em>Component
	 * Implementation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation componentImplementation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.COMPONENT_LOG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<ModuleLog> getModuleLogs() {
		if (moduleLogs == null) {
			moduleLogs = new EObjectContainmentEList<ModuleLog>(ModuleLog.class, this,
					EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS);
		}
		return moduleLogs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEnabledLevels() {
		return enabledLevels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEnabledLevels(String newEnabledLevels) {
		String oldEnabledLevels = enabledLevels;
		enabledLevels = newEnabledLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.COMPONENT_LOG__ENABLED_LEVELS,
					oldEnabledLevels, enabledLevels));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Component getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject) componentInstance;
			componentInstance = (Component) eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE, oldComponentInstance,
							componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Component basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentInstance(Component newComponentInstance) {
		Component oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (componentInstance != null) {
			componentImplementation = newComponentInstance.getComponentImplementation();
		} else {
			componentImplementation = null;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ComponentImplementation getComponentImplementation() {
		if (componentImplementation != null && componentImplementation.eIsProxy()) {
			InternalEObject oldComponentImplementation = (InternalEObject) componentImplementation;
			componentImplementation = (ComponentImplementation) eResolveProxy(oldComponentImplementation);
			if (componentImplementation != oldComponentImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION, oldComponentImplementation,
							componentImplementation));
			}
		}
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentImplementation basicGetComponentImplementation() {
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentImplementation(ComponentImplementation newComponentImplementation) {
		ComponentImplementation oldComponentImplementation = componentImplementation;
		componentImplementation = newComponentImplementation;
		if (oldComponentImplementation != null
				&& !Objects.equals(newComponentImplementation, oldComponentImplementation)) {
			EDTLog.toConsole("The Module Instance of the Module Logs of the Component Log of "
					+ componentInstance.getName() + " have been cleared.");
			for (ModuleLog moduleLog : moduleLogs) {
				moduleLog.setModuleInstance(null);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION, oldComponentImplementation,
					componentImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS:
			return ((InternalEList<?>) getModuleLogs()).basicRemove(otherEnd, msgs);
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
		case EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS:
			return getModuleLogs();
		case EdtdeploymentPackage.COMPONENT_LOG__ENABLED_LEVELS:
			return getEnabledLevels();
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE:
			if (resolve)
				return getComponentInstance();
			return basicGetComponentInstance();
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION:
			if (resolve)
				return getComponentImplementation();
			return basicGetComponentImplementation();
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
		case EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS:
			getModuleLogs().clear();
			getModuleLogs().addAll((Collection<? extends ModuleLog>) newValue);
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__ENABLED_LEVELS:
			setEnabledLevels((String) newValue);
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE:
			setComponentInstance((Component) newValue);
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) newValue);
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
		case EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS:
			getModuleLogs().clear();
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__ENABLED_LEVELS:
			setEnabledLevels(ENABLED_LEVELS_EDEFAULT);
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE:
			setComponentInstance((Component) null);
			return;
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) null);
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
		case EdtdeploymentPackage.COMPONENT_LOG__MODULE_LOGS:
			return moduleLogs != null && !moduleLogs.isEmpty();
		case EdtdeploymentPackage.COMPONENT_LOG__ENABLED_LEVELS:
			return ENABLED_LEVELS_EDEFAULT == null ? enabledLevels != null
					: !ENABLED_LEVELS_EDEFAULT.equals(enabledLevels);
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_INSTANCE:
			return componentInstance != null;
		case EdtdeploymentPackage.COMPONENT_LOG__COMPONENT_IMPLEMENTATION:
			return componentImplementation != null;
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
		result.append(" (enabledLevels: ");
		result.append(enabledLevels);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getComponentInstance() != null && this.getEnabledLevels() != null
				&& !this.getEnabledLevels().isBlank());
	}

} // ComponentLogImpl
