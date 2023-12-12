/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

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

import edtproject.Component;
import edtproject.ComponentDefinitionService;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.ComponentServiceImpl#getComponentDefinitionService <em>Component Definition Service</em>}</li>
 *   <li>{@link edtproject.impl.ComponentServiceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentServiceImpl extends MinimalEObjectImpl.Container implements ComponentService {
	/**
	 * The cached value of the '{@link #getComponentDefinitionService() <em>Component Definition Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionService()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionService componentDefinitionService;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionService getComponentDefinitionService() {
		if (componentDefinitionService != null && componentDefinitionService.eIsProxy()) {
			InternalEObject oldComponentDefinitionService = (InternalEObject)componentDefinitionService;
			componentDefinitionService = (ComponentDefinitionService)eResolveProxy(oldComponentDefinitionService);
			if (componentDefinitionService != oldComponentDefinitionService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE, oldComponentDefinitionService, componentDefinitionService));
			}
		}
		return componentDefinitionService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionService basicGetComponentDefinitionService() {
		return componentDefinitionService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionService(ComponentDefinitionService newComponentDefinitionService) {
		ComponentDefinitionService oldComponentDefinitionService = componentDefinitionService;
		componentDefinitionService = newComponentDefinitionService;
		/*
		 * The ComponentDefinitionService property shall become null, only if it is
		 * removed (Sirius deletes the crossreference before, removing from the list
		 */
		if (componentDefinitionService != null) {
			name = componentDefinitionService.getName();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE, oldComponentDefinitionService,
					componentDefinitionService));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE:
				if (resolve) return getComponentDefinitionService();
				return basicGetComponentDefinitionService();
			case EDTProjectPackage.COMPONENT_SERVICE__NAME:
				return getName();
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
			case EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE:
				setComponentDefinitionService((ComponentDefinitionService)newValue);
				return;
			case EDTProjectPackage.COMPONENT_SERVICE__NAME:
				setName((String)newValue);
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
			case EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE:
				setComponentDefinitionService((ComponentDefinitionService)null);
				return;
			case EDTProjectPackage.COMPONENT_SERVICE__NAME:
				setName(NAME_EDEFAULT);
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
			case EDTProjectPackage.COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE:
				return componentDefinitionService != null;
			case EDTProjectPackage.COMPONENT_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * return name of ComponentDefinitionService
	 * 
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_SERVICE__NAME, oldName, name));
	}

	public EList<ServiceLink> getServiceLink() {
		EList<ServiceLink> serviceLinks = new BasicEList<>();
		if (this.eContainer() != null && this.eContainer().eContainer() != null) {
			Composite composite = (Composite) this.eContainer().eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, composite);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ServiceLink serviceLink) {
					serviceLinks.add(serviceLink);
				}
			}
		}
		return serviceLinks;
	}

	/**
	 * get Name as component_Name/service_Name
	 */
	public String getWireString() {
		return ((Component) eContainer).getName() + "/" + getName();
	}

} // ComponentServiceImpl
