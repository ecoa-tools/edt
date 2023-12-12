/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.VersionedDataReferenceInstance;
import edtinterface.OperationType;
import edtinterface.ServiceDefinition;
import edtproject.ComponentDefinitionReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Reference Of Linked Component Definition</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl#getOperations
 * <em>Operations</em>}</li>
 * <li>{@link edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl#getComponentDefinitionReferenceLink
 * <em>Component Definition Reference Link</em>}</li>
 * <li>{@link edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl#getServiceDefinitionLink
 * <em>Service Definition Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceOfLinkedComponentDefinitionImpl extends MinimalEObjectImpl.Container
		implements ReferenceOfLinkedComponentDefinition {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInstance> operations;

	/**
	 * The cached value of the '{@link #getServiceDefinitionLink() <em>Service
	 * Definition Link</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getServiceDefinitionLink()
	 * @generated
	 * @ordered
	 */
	protected ServiceDefinition serviceDefinitionLink;

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
	 * The cached value of the '{@link #getComponentDefinitionReferenceLink() <em>Component Definition Reference Link</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getComponentDefinitionReferenceLink()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionReference componentDefinitionReferenceLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceOfLinkedComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.REFERENCE_OF_LINKED_COMPONENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<OperationInstance> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationInstance>(OperationInstance.class, this,
					EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS) {
				@Override
				public void addUnique(OperationInstance object) {
					Iterator<OperationInstance> iterator = operations.iterator();
					while (iterator.hasNext()) {
						OperationInstance operation = iterator.next();
						if (alreadyExistsInReference(object, operation)) {
							iterator.remove();

						}
					}
					super.addUnique(object);
				}

			};

		}
		return operations;

	}

	/**
	 * @param operation
	 * @param object
	 * @return
	 */
	private boolean alreadyExistsInReference(OperationInstance object, OperationInstance operation) {
		return (object instanceof VersionedDataReferenceInstance newObject
				&& operation instanceof VersionedDataReferenceInstance op
				&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
						&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())))
				|| (object instanceof EventDefinitionInstance newObject
						&& operation instanceof EventDefinitionInstance op
						&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
								&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())))
				|| (object instanceof RequestReferenceInstance newObject
						&& operation instanceof RequestReferenceInstance op
						&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
								&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionReference getComponentDefinitionReferenceLink() {
		if (componentDefinitionReferenceLink != null && componentDefinitionReferenceLink.eIsProxy()) {
			InternalEObject oldComponentDefinitionReferenceLink = (InternalEObject)componentDefinitionReferenceLink;
			componentDefinitionReferenceLink = (ComponentDefinitionReference)eResolveProxy(oldComponentDefinitionReferenceLink);
			if (componentDefinitionReferenceLink != oldComponentDefinitionReferenceLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK, oldComponentDefinitionReferenceLink, componentDefinitionReferenceLink));
			}
		}
		return componentDefinitionReferenceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference basicGetComponentDefinitionReferenceLink() {
		return componentDefinitionReferenceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionReferenceLink(ComponentDefinitionReference newComponentDefinitionReferenceLink) {
		ComponentDefinitionReference oldComponentDefinitionReferenceLink = componentDefinitionReferenceLink;
		componentDefinitionReferenceLink = newComponentDefinitionReferenceLink;

		if (newComponentDefinitionReferenceLink != null && newComponentDefinitionReferenceLink.getSyntax() != null) {
			setServiceDefinitionLink(newComponentDefinitionReferenceLink.getSyntax());
		} else {
			setServiceDefinitionLink(null);
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK,
					oldComponentDefinitionReferenceLink, componentDefinitionReferenceLink));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefinition getServiceDefinitionLink() {
		if (serviceDefinitionLink != null && serviceDefinitionLink.eIsProxy()) {
			InternalEObject oldServiceDefinitionLink = (InternalEObject)serviceDefinitionLink;
			serviceDefinitionLink = (ServiceDefinition)eResolveProxy(oldServiceDefinitionLink);
			if (serviceDefinitionLink != oldServiceDefinitionLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK, oldServiceDefinitionLink, serviceDefinitionLink));
			}
		}
		return serviceDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition basicGetServiceDefinitionLink() {
		return serviceDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setServiceDefinitionLink(ServiceDefinition newServiceDefinitionLink) {
		ServiceDefinition oldServiceDefinitionLink = serviceDefinitionLink;
		serviceDefinitionLink = newServiceDefinitionLink;
		createOpFromServiceDefinition();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK,
					oldServiceDefinitionLink, serviceDefinitionLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Use getOperations() instead of
	 * operations, in case operations is not initialized
	 * 
	 * @generated NOT
	 */
	public void createOpFromServiceDefinition() {
		if (serviceDefinitionLink != null) {
			EList<OperationType> edtServiceDefinitionOperations = serviceDefinitionLink.getOperations();
			if (operations != null) {
				cleanReferenceOperations(edtServiceDefinitionOperations);
			}
			for (OperationType operationType : edtServiceDefinitionOperations) {
				if (operationType instanceof edtinterface.Data data) {
					VersionedDataReferenceInstance dataInstance = EdtimplementationFactory.eINSTANCE
							.createVersionedDataReferenceInstance();
					dataInstance.setSDOperationRef(data);
					dataInstance.setName(data.getName());
					getOperations().add(dataInstance);
				} else if (operationType instanceof edtinterface.Event event) {
					EventDefinitionInstance eventInstance = EdtimplementationFactory.eINSTANCE
							.createEventDefinitionInstance();
					eventInstance.setSDOperationRef(event);
					eventInstance.setName(event.getName());
					getOperations().add(eventInstance);
				} else if (operationType instanceof edtinterface.RequestResponse request) {
					RequestReferenceInstance requestResponseInstance = EdtimplementationFactory.eINSTANCE
							.createRequestReferenceInstance();
					requestResponseInstance.setSDOperationRef(request);
					requestResponseInstance.setName(request.getName());
					getOperations().add(requestResponseInstance);
				}
			}
		} else {
			getOperations().clear();
		}
	}

	/**
	 * @param edtServiceDefinitionOperations
	 */
	private void cleanReferenceOperations(EList<OperationType> edtServiceDefinitionOperations) {
		Iterator<OperationInstance> each = operations.iterator();
		while (each.hasNext()) {
			OperationInstance op = each.next();
			if (alreadyInherited(edtServiceDefinitionOperations, op)) {

				each.remove();
			}
		}
	}

	/**
	 * @param edtServiceDefinitionOperations
	 * @param op
	 * @return
	 */
	private boolean alreadyInherited(EList<OperationType> edtServiceDefinitionOperations, OperationInstance op) {
		return (op instanceof VersionedDataReferenceInstance data && data.getSDOperationRef() != null
				&& !edtServiceDefinitionOperations.contains(data.getSDOperationRef()))

				|| (op instanceof EventDefinitionInstance event && event.getSDOperationRef() != null
						&& !edtServiceDefinitionOperations.contains(event.getSDOperationRef()))

				|| (op instanceof RequestReferenceInstance request && request.getSDOperationRef() != null
						&& !edtServiceDefinitionOperations.contains(request.getSDOperationRef()));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				return getOperations();
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				if (resolve) return getServiceDefinitionLink();
				return basicGetServiceDefinitionLink();
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				return getName();
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK:
				if (resolve) return getComponentDefinitionReferenceLink();
				return basicGetComponentDefinitionReferenceLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationInstance>)newValue);
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				setServiceDefinitionLink((ServiceDefinition)newValue);
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK:
				setComponentDefinitionReferenceLink((ComponentDefinitionReference)newValue);
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
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				getOperations().clear();
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				setServiceDefinitionLink((ServiceDefinition)null);
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK:
				setComponentDefinitionReferenceLink((ComponentDefinitionReference)null);
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
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				return serviceDefinitionLink != null;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK:
				return componentDefinitionReferenceLink != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public EList<OperationLink> findOperationLinks() {
		EList<OperationLink> findOperationLink = new BasicEList<>();
		for (OperationInstance operationInstance : operations) {
			findOperationLink.addAll(operationInstance.findOperationLink());
		}
		return findOperationLink;

	}

} // ReferenceOfLinkedComponentDefinitionImpl
