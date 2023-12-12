/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.implementation._2.ComponentImplementation;
import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.ModuleImplementation;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.ModuleType;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.TriggerInstance;
import technology.ecoa.implementation._2.UseType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getUse <em>Use</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getService <em>Service</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getModuleImplementation <em>Module Implementation</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getTriggerInstance <em>Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getDynamicTriggerInstance <em>Dynamic Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getEventLink <em>Event Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getRequestLink <em>Request Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationImpl extends MinimalEObjectImpl.Container implements ComponentImplementation {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<UseType> use;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceQoS> service;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceQoS> reference;

	/**
	 * The cached value of the '{@link #getModuleType() <em>Module Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleType> moduleType;

	/**
	 * The cached value of the '{@link #getModuleImplementation() <em>Module Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleImplementation> moduleImplementation;

	/**
	 * The cached value of the '{@link #getModuleInstance() <em>Module Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInstance> moduleInstance;

	/**
	 * The cached value of the '{@link #getTriggerInstance() <em>Trigger Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerInstance> triggerInstance;

	/**
	 * The cached value of the '{@link #getDynamicTriggerInstance() <em>Dynamic Trigger Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicTriggerInstance> dynamicTriggerInstance;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected String componentDefinition = COMPONENT_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.COMPONENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseType> getUse() {
		if (use == null) {
			use = new EObjectContainmentEList<UseType>(UseType.class, this, impPackage.COMPONENT_IMPLEMENTATION__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceQoS> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<ServiceQoS>(ServiceQoS.class, this, impPackage.COMPONENT_IMPLEMENTATION__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceQoS> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<ServiceQoS>(ServiceQoS.class, this, impPackage.COMPONENT_IMPLEMENTATION__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleType> getModuleType() {
		if (moduleType == null) {
			moduleType = new EObjectContainmentEList<ModuleType>(ModuleType.class, this, impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE);
		}
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImplementation> getModuleImplementation() {
		if (moduleImplementation == null) {
			moduleImplementation = new EObjectContainmentEList<ModuleImplementation>(ModuleImplementation.class, this, impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION);
		}
		return moduleImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleInstance> getModuleInstance() {
		if (moduleInstance == null) {
			moduleInstance = new EObjectContainmentEList<ModuleInstance>(ModuleInstance.class, this, impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE);
		}
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerInstance> getTriggerInstance() {
		if (triggerInstance == null) {
			triggerInstance = new EObjectContainmentEList<TriggerInstance>(TriggerInstance.class, this, impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE);
		}
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicTriggerInstance> getDynamicTriggerInstance() {
		if (dynamicTriggerInstance == null) {
			dynamicTriggerInstance = new EObjectContainmentEList<DynamicTriggerInstance>(DynamicTriggerInstance.class, this, impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE);
		}
		return dynamicTriggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, impPackage.COMPONENT_IMPLEMENTATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataLink> getDataLink() {
		return getGroup().list(impPackage.Literals.COMPONENT_IMPLEMENTATION__DATA_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventLink> getEventLink() {
		return getGroup().list(impPackage.Literals.COMPONENT_IMPLEMENTATION__EVENT_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestLink> getRequestLink() {
		return getGroup().list(impPackage.Literals.COMPONENT_IMPLEMENTATION__REQUEST_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentDefinition() {
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentDefinition(String newComponentDefinition) {
		String oldComponentDefinition = componentDefinition;
		componentDefinition = newComponentDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
				return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
				return ((InternalEList<?>)getModuleType()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
				return ((InternalEList<?>)getModuleImplementation()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
				return ((InternalEList<?>)getModuleInstance()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
				return ((InternalEList<?>)getTriggerInstance()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
				return ((InternalEList<?>)getDynamicTriggerInstance()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__DATA_LINK:
				return ((InternalEList<?>)getDataLink()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__EVENT_LINK:
				return ((InternalEList<?>)getEventLink()).basicRemove(otherEnd, msgs);
			case impPackage.COMPONENT_IMPLEMENTATION__REQUEST_LINK:
				return ((InternalEList<?>)getRequestLink()).basicRemove(otherEnd, msgs);
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
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
				return getUse();
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
				return getService();
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
				return getReference();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
				return getModuleType();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
				return getModuleImplementation();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
				return getModuleInstance();
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
				return getTriggerInstance();
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
				return getDynamicTriggerInstance();
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case impPackage.COMPONENT_IMPLEMENTATION__DATA_LINK:
				return getDataLink();
			case impPackage.COMPONENT_IMPLEMENTATION__EVENT_LINK:
				return getEventLink();
			case impPackage.COMPONENT_IMPLEMENTATION__REQUEST_LINK:
				return getRequestLink();
			case impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				return getComponentDefinition();
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
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends UseType>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ServiceQoS>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ServiceQoS>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
				getModuleType().clear();
				getModuleType().addAll((Collection<? extends ModuleType>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
				getModuleImplementation().clear();
				getModuleImplementation().addAll((Collection<? extends ModuleImplementation>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
				getModuleInstance().clear();
				getModuleInstance().addAll((Collection<? extends ModuleInstance>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
				getTriggerInstance().clear();
				getTriggerInstance().addAll((Collection<? extends TriggerInstance>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
				getDynamicTriggerInstance().clear();
				getDynamicTriggerInstance().addAll((Collection<? extends DynamicTriggerInstance>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__DATA_LINK:
				getDataLink().clear();
				getDataLink().addAll((Collection<? extends DataLink>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__EVENT_LINK:
				getEventLink().clear();
				getEventLink().addAll((Collection<? extends EventLink>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__REQUEST_LINK:
				getRequestLink().clear();
				getRequestLink().addAll((Collection<? extends RequestLink>)newValue);
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				setComponentDefinition((String)newValue);
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
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
				getUse().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
				getService().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
				getReference().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
				getModuleType().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
				getModuleImplementation().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
				getModuleInstance().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
				getTriggerInstance().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
				getDynamicTriggerInstance().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				getGroup().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__DATA_LINK:
				getDataLink().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__EVENT_LINK:
				getEventLink().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__REQUEST_LINK:
				getRequestLink().clear();
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				setComponentDefinition(COMPONENT_DEFINITION_EDEFAULT);
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
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
				return use != null && !use.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
				return service != null && !service.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
				return reference != null && !reference.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
				return moduleType != null && !moduleType.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
				return moduleImplementation != null && !moduleImplementation.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
				return moduleInstance != null && !moduleInstance.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
				return triggerInstance != null && !triggerInstance.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
				return dynamicTriggerInstance != null && !dynamicTriggerInstance.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				return group != null && !group.isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__DATA_LINK:
				return !getDataLink().isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__EVENT_LINK:
				return !getEventLink().isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__REQUEST_LINK:
				return !getRequestLink().isEmpty();
			case impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				return COMPONENT_DEFINITION_EDEFAULT == null ? componentDefinition != null : !COMPONENT_DEFINITION_EDEFAULT.equals(componentDefinition);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", componentDefinition: ");
		result.append(componentDefinition);
		result.append(')');
		return result.toString();
	}

} //ComponentImplementationImpl
