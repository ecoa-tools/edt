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

import edtdeployment.DeployedTriggerInstance;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtimplementation.ComponentImplementation;
import edtimplementation.Trigger;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Deployed Trigger Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.impl.DeployedTriggerInstanceImpl#getTriggerPriority
 * <em>Trigger Priority</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedTriggerInstanceImpl#getTriggerInstance
 * <em>Trigger Instance</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedTriggerInstanceImpl#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * <li>{@link edtdeployment.impl.DeployedTriggerInstanceImpl#getComponent
 * <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedTriggerInstanceImpl extends MinimalEObjectImpl.Container implements DeployedTriggerInstance {
	/**
	 * The default value of the '{@link #getTriggerPriority() <em>Trigger
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTriggerPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TRIGGER_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerPriority() <em>Trigger
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTriggerPriority()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal triggerPriority = TRIGGER_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggerInstance() <em>Trigger
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTriggerInstance()
	 * @generated
	 * @ordered
	 */
	protected Trigger triggerInstance;

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
	protected DeployedTriggerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.DEPLOYED_TRIGGER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getTriggerPriority() {
		return triggerPriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTriggerPriority(BigDecimal newTriggerPriority) {
		BigDecimal oldTriggerPriority = triggerPriority;
		triggerPriority = newTriggerPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY, oldTriggerPriority,
					triggerPriority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Trigger getTriggerInstance() {
		if (triggerInstance != null && triggerInstance.eIsProxy()) {
			InternalEObject oldTriggerInstance = (InternalEObject) triggerInstance;
			triggerInstance = (Trigger) eResolveProxy(oldTriggerInstance);
			if (triggerInstance != oldTriggerInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE, oldTriggerInstance,
							triggerInstance));
			}
		}
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Trigger basicGetTriggerInstance() {
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTriggerInstance(Trigger newTriggerInstance) {
		Trigger oldTriggerInstance = triggerInstance;
		triggerInstance = newTriggerInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE, oldTriggerInstance,
					triggerInstance));
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
							EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION,
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
		if (oldComponentImplementation != null && triggerInstance != null
				&& !Objects.equals(triggerInstance.eContainer(), newComponentImplementation)) {
			EDTLog.toConsole("The Trigger Instance of the Deployed Trigger Instance of " + component.getName()
					+ " in the Protection Domain " + ((ProtectionDomain) this.eContainer()).getName()
					+ " has been cleared.");
			triggerInstance = null;
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION,
					oldComponentImplementation, componentImplementation));
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
							EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT, oldComponent, component));
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
					EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY:
			return getTriggerPriority();
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE:
			if (resolve)
				return getTriggerInstance();
			return basicGetTriggerInstance();
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION:
			if (resolve)
				return getComponentImplementation();
			return basicGetComponentImplementation();
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT:
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
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY:
			setTriggerPriority((BigDecimal) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE:
			setTriggerInstance((Trigger) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) newValue);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT:
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
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY:
			setTriggerPriority(TRIGGER_PRIORITY_EDEFAULT);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE:
			setTriggerInstance((Trigger) null);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) null);
			return;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT:
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
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY:
			return TRIGGER_PRIORITY_EDEFAULT == null ? triggerPriority != null
					: !TRIGGER_PRIORITY_EDEFAULT.equals(triggerPriority);
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE:
			return triggerInstance != null;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION:
			return componentImplementation != null;
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__COMPONENT:
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
		result.append(" (triggerPriority: ");
		result.append(triggerPriority);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getComponent() != null && this.getTriggerInstance() != null && this.getTriggerPriority() != null);
	}

} // DeployedTriggerInstanceImpl
