/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.ServRefOfLinkedComponentDefinition;
import edtinterface.ServiceDefinition;
import edtproject.Contract;
import edtproject.EDTProjectPackage;
import edtproject.Steps;
import edtqos.EdtqosPackage;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Contract</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.ContractImpl#getSyntax <em>Syntax</em>}</li>
 * <li>{@link edtproject.impl.ContractImpl#getQos <em>Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
	/**
	 * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected ServiceDefinition syntax;

	/**
	 * The cached value of the '{@link #getQos() <em>Qos</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQos()
	 * @generated
	 * @ordered
	 */
	protected ServiceInstanceQos qos;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ServiceDefinition getSyntax() {
		if (syntax != null && syntax.eIsProxy()) {
			InternalEObject oldSyntax = (InternalEObject) syntax;
			syntax = (ServiceDefinition) eResolveProxy(oldSyntax);
			if (syntax != oldSyntax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.CONTRACT__SYNTAX,
							oldSyntax, syntax));
			}
		}
		return syntax;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceDefinition basicGetSyntax() {
		return syntax;
	}

	/**
	 * When setting new ServiceDefinition, the Service and References of the
	 * ComponentImplementation need to be updated
	 * 
	 * @generated NOT
	 */
	@Override
	public void setSyntax(ServiceDefinition newSyntax) {
		ServiceDefinition oldSyntax = syntax;
		if (qos != null && !Objects.equals(qos.getServiceDefinition(), newSyntax)) {
			setQos(null);
		}

		EList<EObject> associatedComponentImplementationRefServ = findAssociatedComponentImplementationServRef();
		for (EObject servRef : associatedComponentImplementationRefServ) {

			if (servRef instanceof ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition) {
				servRefOfLinkedComponentDefinition.setServiceDefinitionLink(newSyntax);

			} else if (servRef instanceof ComponentImplementationReference ref
					&& (ref.getNewQos() != null && ref.getNewQos().getServiceDefinition() != null
							&& !Objects.equals(ref.getNewQos().getServiceDefinition(), newSyntax))) {
				ref.setNewQos(null);

			} else if (servRef instanceof ComponentImplementationService serv
					&& (serv.getNewQos() != null && serv.getNewQos().getServiceDefinition() != null
							&& !Objects.equals(serv.getNewQos().getServiceDefinition(), newSyntax))) {
				serv.setNewQos(null);
			}

		}
		syntax = newSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.CONTRACT__SYNTAX, oldSyntax,
					syntax));
	}

	/**
	 * Finds all ComponentImplementation References and Services that inherit from
	 * this Contract
	 * 
	 * @return list of References and Services that inherit from this Contract
	 * @generated NOT
	 */
	public EList<EObject> findAssociatedComponentImplementationServRef() {
		EList<EObject> componentImplementationServRef = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ServRefOfLinkedComponentDefinition
						|| crossReference.getEObject() instanceof ComponentImplementationReference
						|| crossReference.getEObject() instanceof ComponentImplementationService) {
					componentImplementationServRef.add(crossReference.getEObject());
				}
			}
		}

		return componentImplementationServRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ServiceInstanceQos getQos() {
		if (qos != null && qos.eIsProxy()) {
			InternalEObject oldQos = (InternalEObject) qos;
			qos = (ServiceInstanceQos) eResolveProxy(oldQos);
			if (qos != oldQos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.CONTRACT__QOS, oldQos,
							qos));
			}
		}
		return qos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceInstanceQos basicGetQos() {
		return qos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetQos(ServiceInstanceQos newQos, NotificationChain msgs) {
		ServiceInstanceQos oldQos = qos;
		qos = newQos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.CONTRACT__QOS, oldQos, newQos);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setQos(ServiceInstanceQos newQos) {
		if (newQos != qos) {
			NotificationChain msgs = null;
			if (qos != null)
				msgs = ((InternalEObject) qos).eInverseRemove(this, EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK,
						ServiceInstanceQos.class, msgs);
			if (newQos != null)
				msgs = ((InternalEObject) newQos).eInverseAdd(this, EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK,
						ServiceInstanceQos.class, msgs);
			msgs = basicSetQos(newQos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.CONTRACT__QOS, newQos, newQos));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.CONTRACT__QOS:
			if (qos != null)
				msgs = ((InternalEObject) qos).eInverseRemove(this, EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK,
						ServiceInstanceQos.class, msgs);
			return basicSetQos((ServiceInstanceQos) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.CONTRACT__QOS:
			return basicSetQos(null, msgs);
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
		case EDTProjectPackage.CONTRACT__SYNTAX:
			if (resolve)
				return getSyntax();
			return basicGetSyntax();
		case EDTProjectPackage.CONTRACT__QOS:
			if (resolve)
				return getQos();
			return basicGetQos();
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
		case EDTProjectPackage.CONTRACT__SYNTAX:
			setSyntax((ServiceDefinition) newValue);
			return;
		case EDTProjectPackage.CONTRACT__QOS:
			setQos((ServiceInstanceQos) newValue);
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
		case EDTProjectPackage.CONTRACT__SYNTAX:
			setSyntax((ServiceDefinition) null);
			return;
		case EDTProjectPackage.CONTRACT__QOS:
			setQos((ServiceInstanceQos) null);
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
		case EDTProjectPackage.CONTRACT__SYNTAX:
			return syntax != null;
		case EDTProjectPackage.CONTRACT__QOS:
			return qos != null;
		}
		return super.eIsSet(featureID);
	}

} // ContractImpl
