/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtimplementation.ComponentImplementationService;
import edtimplementation.EdtimplementationPackage;
import edtproject.ComponentDefinitionService;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Implementation Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ComponentImplementationServiceImpl#getNewQos <em>New Qos</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationServiceImpl#getComponentDefinitionService <em>Component Definition Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationServiceImpl extends MinimalEObjectImpl.Container
		implements ComponentImplementationService {
	/**
	 * The cached value of the '{@link #getNewQos() <em>New Qos</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNewQos()
	 * @generated
	 * @ordered
	 */
	protected ServiceInstanceQos newQos;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInstanceQos getNewQos() {
		if (newQos != null && newQos.eIsProxy()) {
			InternalEObject oldNewQos = (InternalEObject)newQos;
			newQos = (ServiceInstanceQos)eResolveProxy(oldNewQos);
			if (newQos != oldNewQos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS, oldNewQos, newQos));
			}
		}
		return newQos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstanceQos basicGetNewQos() {
		return newQos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewQos(ServiceInstanceQos newNewQos) {
		ServiceInstanceQos oldNewQos = newQos;
		newQos = newNewQos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS, oldNewQos, newQos));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE, oldComponentDefinitionService, componentDefinitionService));
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

		if (newComponentDefinitionService != null && newQos != null && newComponentDefinitionService.getSyntax() != null
				&& !Objects.equals(newQos.getServiceDefinition(), newComponentDefinitionService.getSyntax())) {
			setNewQos(null);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE,
					oldComponentDefinitionService, componentDefinitionService));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS:
				if (resolve) return getNewQos();
				return basicGetNewQos();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE:
				if (resolve) return getComponentDefinitionService();
				return basicGetComponentDefinitionService();
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS:
				setNewQos((ServiceInstanceQos)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE:
				setComponentDefinitionService((ComponentDefinitionService)newValue);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS:
				setNewQos((ServiceInstanceQos)null);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE:
				setComponentDefinitionService((ComponentDefinitionService)null);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS:
				return newQos != null;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE:
				return componentDefinitionService != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean isComplete() {
		return (this.getComponentDefinitionService() != null && this.getNewQos() != null);
	}

} // ComponentImplementationServiceImpl
