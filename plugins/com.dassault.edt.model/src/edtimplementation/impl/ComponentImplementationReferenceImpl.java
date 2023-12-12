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

import edtimplementation.ComponentImplementationReference;
import edtimplementation.EdtimplementationPackage;
import edtproject.ComponentDefinitionReference;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Implementation Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ComponentImplementationReferenceImpl#getNewQos <em>New Qos</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationReferenceImpl#getComponentDefinitionReference <em>Component Definition Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationReferenceImpl extends MinimalEObjectImpl.Container
		implements ComponentImplementationReference {
	/**
	 * The cached value of the '{@link #getNewQos() <em>New Qos</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNewQos()
	 * @generated
	 * @ordered
	 */
	protected ServiceInstanceQos newQos;

	/**
	 * The cached value of the '{@link #getComponentDefinitionReference() <em>Component Definition Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionReference componentDefinitionReference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS, oldNewQos, newQos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS, oldNewQos, newQos));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionReference getComponentDefinitionReference() {
		if (componentDefinitionReference != null && componentDefinitionReference.eIsProxy()) {
			InternalEObject oldComponentDefinitionReference = (InternalEObject)componentDefinitionReference;
			componentDefinitionReference = (ComponentDefinitionReference)eResolveProxy(oldComponentDefinitionReference);
			if (componentDefinitionReference != oldComponentDefinitionReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE, oldComponentDefinitionReference, componentDefinitionReference));
			}
		}
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference basicGetComponentDefinitionReference() {
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionReference(ComponentDefinitionReference newComponentDefinitionReference) {
		ComponentDefinitionReference oldComponentDefinitionReference = componentDefinitionReference;
		componentDefinitionReference = newComponentDefinitionReference;
		if (newComponentDefinitionReference != null && newQos != null
				&& newComponentDefinitionReference.getSyntax() != null
				&& !Objects.equals(newQos.getServiceDefinition(), newComponentDefinitionReference.getSyntax())) {
			setNewQos(null);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE,
					oldComponentDefinitionReference, componentDefinitionReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS:
				if (resolve) return getNewQos();
				return basicGetNewQos();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				if (resolve) return getComponentDefinitionReference();
				return basicGetComponentDefinitionReference();
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS:
				setNewQos((ServiceInstanceQos)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				setComponentDefinitionReference((ComponentDefinitionReference)newValue);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS:
				setNewQos((ServiceInstanceQos)null);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				setComponentDefinitionReference((ComponentDefinitionReference)null);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS:
				return newQos != null;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				return componentDefinitionReference != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean isComplete() {
		return (this.getComponentDefinitionReference() != null && this.getNewQos() != null);
	}

} // ComponentImplementationReferenceImpl
