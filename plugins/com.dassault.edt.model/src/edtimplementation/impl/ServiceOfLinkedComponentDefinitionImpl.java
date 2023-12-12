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
import edtimplementation.RequestServiceInstance;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.VersionedDataServiceInstance;
import edtinterface.OperationType;
import edtinterface.ServiceDefinition;
import edtproject.ComponentDefinitionService;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service
 * Of Linked Component Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl#getServiceDefinitionLink <em>Service Definition Link</em>}</li>
 *   <li>{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl#getComponentDefinitionServiceLink <em>Component Definition Service Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOfLinkedComponentDefinitionImpl extends MinimalEObjectImpl.Container
		implements ServiceOfLinkedComponentDefinition {
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
	 * The cached value of the '{@link #getComponentDefinitionServiceLink() <em>Component Definition Service Link</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getComponentDefinitionServiceLink()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionService componentDefinitionServiceLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOfLinkedComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.SERVICE_OF_LINKED_COMPONENT_DEFINITION;
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
					EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS) {
				@Override
				public void addUnique(OperationInstance object) {
					Iterator<OperationInstance> iterator = operations.iterator();
					while (iterator.hasNext()) {
						OperationInstance operation = iterator.next();
						if (alreadyExistsInService(object, operation)) {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionService getComponentDefinitionServiceLink() {
		if (componentDefinitionServiceLink != null && componentDefinitionServiceLink.eIsProxy()) {
			InternalEObject oldComponentDefinitionServiceLink = (InternalEObject)componentDefinitionServiceLink;
			componentDefinitionServiceLink = (ComponentDefinitionService)eResolveProxy(oldComponentDefinitionServiceLink);
			if (componentDefinitionServiceLink != oldComponentDefinitionServiceLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK, oldComponentDefinitionServiceLink, componentDefinitionServiceLink));
			}
		}
		return componentDefinitionServiceLink;
	}

	/**
	 * @param operation
	 * @param object
	 * @return
	 */
	private boolean alreadyExistsInService(OperationInstance object, OperationInstance operation) {
		return (object instanceof VersionedDataServiceInstance newObject
				&& operation instanceof VersionedDataServiceInstance op
				&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
						&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())))
				|| (object instanceof EventDefinitionInstance newObject
						&& operation instanceof EventDefinitionInstance op
						&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
								&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())))
				|| (object instanceof RequestServiceInstance newObject && operation instanceof RequestServiceInstance op
						&& (newObject.getSDOperationRef() != null && op.getSDOperationRef() != null
								&& Objects.equals(op.getSDOperationRef(), newObject.getSDOperationRef())));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionService basicGetComponentDefinitionServiceLink() {
		return componentDefinitionServiceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionServiceLink(ComponentDefinitionService newComponentDefinitionServiceLink) {
		ComponentDefinitionService oldComponentDefinitionServiceLink = componentDefinitionServiceLink;
		componentDefinitionServiceLink = newComponentDefinitionServiceLink;
		if (newComponentDefinitionServiceLink != null && newComponentDefinitionServiceLink.getSyntax() != null) {
			setServiceDefinitionLink(newComponentDefinitionServiceLink.getSyntax());
		} else {
			setServiceDefinitionLink(null);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK,
					oldComponentDefinitionServiceLink, componentDefinitionServiceLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK, oldServiceDefinitionLink, serviceDefinitionLink));
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
					EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME, oldName, name));
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
				cleanServiceOperations(edtServiceDefinitionOperations);
			}
			for (OperationType operationType : edtServiceDefinitionOperations) {
				if (operationType instanceof edtinterface.Data data) {
					VersionedDataServiceInstance dataInstance = EdtimplementationFactory.eINSTANCE
							.createVersionedDataServiceInstance();
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
					RequestServiceInstance requestResponseInstance = EdtimplementationFactory.eINSTANCE
							.createRequestServiceInstance();
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
	private void cleanServiceOperations(EList<OperationType> edtServiceDefinitionOperations) {
		Iterator<OperationInstance> each = operations.iterator();
		while (each.hasNext()) {
			OperationInstance op = each.next();
			if ((op instanceof VersionedDataServiceInstance data && data.getSDOperationRef() != null
					&& !edtServiceDefinitionOperations.contains(data.getSDOperationRef()))

					|| (op instanceof EventDefinitionInstance event && event.getSDOperationRef() != null
							&& !edtServiceDefinitionOperations.contains(event.getSDOperationRef()))

					|| (op instanceof RequestServiceInstance request && request.getSDOperationRef() != null
							&& !edtServiceDefinitionOperations.contains(request.getSDOperationRef()))) {

				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
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
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				return getOperations();
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				if (resolve) return getServiceDefinitionLink();
				return basicGetServiceDefinitionLink();
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				return getName();
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK:
				if (resolve) return getComponentDefinitionServiceLink();
				return basicGetComponentDefinitionServiceLink();
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
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationInstance>)newValue);
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				setServiceDefinitionLink((ServiceDefinition)newValue);
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK:
				setComponentDefinitionServiceLink((ComponentDefinitionService)newValue);
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
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				getOperations().clear();
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				setServiceDefinitionLink((ServiceDefinition)null);
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK:
				setComponentDefinitionServiceLink((ComponentDefinitionService)null);
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
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK:
				return serviceDefinitionLink != null;
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK:
				return componentDefinitionServiceLink != null;
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

} // ServiceOfLinkedComponentDefinitionImpl
