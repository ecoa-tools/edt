/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import java.math.BigDecimal;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.dassault.edt.log.EDTLog;

import edtdeployment.DeployedModuleInstance;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtimplementation.ComponentImplementation;
import edtimplementation.ModuleInstance;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Deployed Module Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.impl.DeployedModuleInstanceImpl#getModulePriority
 * <em>Module Priority</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedModuleInstanceImpl#getModuleInstance
 * <em>Module Instance</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedModuleInstanceImpl#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedModuleInstanceImpl#getComponent
 * <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedModuleInstanceImpl extends MinimalEObjectImpl.Container implements DeployedModuleInstance {
	/**
	 * The default value of the '{@link #getModulePriority() <em>Module
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModulePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODULE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulePriority() <em>Module
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModulePriority()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modulePriority = MODULE_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleInstance() <em>Module
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected ModuleInstance moduleInstance;

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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DeployedModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.DEPLOYED_MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getModulePriority() {
		return modulePriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setModulePriority(BigDecimal newModulePriority) {
		BigDecimal oldModulePriority = modulePriority;
		modulePriority = newModulePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY, oldModulePriority, modulePriority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ModuleInstance getModuleInstance() {
		if (moduleInstance != null && moduleInstance.eIsProxy()) {
			InternalEObject oldModuleInstance = (InternalEObject) moduleInstance;
			moduleInstance = (ModuleInstance) eResolveProxy(oldModuleInstance);
			if (moduleInstance != oldModuleInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE, oldModuleInstance,
							moduleInstance));
			}
		}
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleInstance basicGetModuleInstance() {
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setModuleInstance(ModuleInstance newModuleInstance) {
		ModuleInstance oldModuleInstance = moduleInstance;
		moduleInstance = newModuleInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE, oldModuleInstance, moduleInstance));
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
							EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION,
							oldComponentImplementation, componentImplementation));
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
		if (oldComponentImplementation != null && moduleInstance != null
				&& !Objects.equals(moduleInstance.eContainer(), newComponentImplementation)) {
			EDTLog.toConsole("The Module Instance of the Deployed Module Instance of " + component.getName()
					+ " in the Protection Domain " + ((ProtectionDomain) this.eContainer()).getName()
					+ " has been cleared.");
			moduleInstance = null;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION, oldComponentImplementation,
					componentImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (component != null) {
			componentImplementation = component.getComponentImplementation();
		} else {
			componentImplementation = null;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY:
			return getModulePriority();
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE:
			if (resolve)
				return getModuleInstance();
			return basicGetModuleInstance();
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION:
			if (resolve)
				return getComponentImplementation();
			return basicGetComponentImplementation();
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY:
			setModulePriority((BigDecimal) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE:
			setModuleInstance((ModuleInstance) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT:
			setComponent((Component) newValue);
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
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY:
			setModulePriority(MODULE_PRIORITY_EDEFAULT);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE:
			setModuleInstance((ModuleInstance) null);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) null);
			return;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT:
			setComponent((Component) null);
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
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY:
			return MODULE_PRIORITY_EDEFAULT == null ? modulePriority != null
					: !MODULE_PRIORITY_EDEFAULT.equals(modulePriority);
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE:
			return moduleInstance != null;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION:
			return componentImplementation != null;
		case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE__COMPONENT:
			return component != null;
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
		result.append(" (modulePriority: ");
		result.append(modulePriority);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getComponent() != null && this.getModuleInstance() != null && this.getModulePriority() != null);
	}
} // DeployedModuleInstanceImpl
