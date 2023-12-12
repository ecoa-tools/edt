/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtinterface.OperationType;
import edtinterface.ServiceDefinition;
import edtproject.Contract;
import edtproject.EDTProjectPackage;
import edtqos.Data;
import edtqos.EdtqosFactory;
import edtqos.EdtqosPackage;
import edtqos.Event;
import edtqos.Operation;
import edtqos.RequestResponse;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service
 * Instance Qos</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtqos.impl.ServiceInstanceQosImpl#getOperations
 * <em>Operations</em>}</li>
 * <li>{@link edtqos.impl.ServiceInstanceQosImpl#getServiceDefinition
 * <em>Service Definition</em>}</li>
 * <li>{@link edtqos.impl.ServiceInstanceQosImpl#getName <em>Name</em>}</li>
 * <li>{@link edtqos.impl.ServiceInstanceQosImpl#getInterfaceLink <em>Interface
 * Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceQosImpl extends MinimalEObjectImpl.Container implements ServiceInstanceQos {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getServiceDefinition() <em>Service
	 * Definition</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceDefinition()
	 * @generated
	 * @ordered
	 */
	protected ServiceDefinition serviceDefinition;

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
	 * The cached value of the '{@link #getInterfaceLink() <em>Interface Link</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInterfaceLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> interfaceLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ServiceInstanceQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtqosPackage.Literals.SERVICE_INSTANCE_QOS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOTgit
	 */
	@SuppressWarnings("serial")
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS) {
				@Override
				public void addUnique(Operation object) {
					Iterator<Operation> iterator = operations.iterator();
					while (iterator.hasNext()) {
						Operation operation = iterator.next();
						if (isAlreadyPresentInQoS(operation, object)) {
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
	 * @param object
	 * @param operation
	 * @return
	 */
	private boolean isAlreadyPresentInQoS(Operation operation, Operation object) {
		return (object instanceof Data newObject && operation instanceof Data op
				&& (newObject.getServiceDefinitionData() != null && op.getServiceDefinitionData() != null
						&& Objects.equals(op.getServiceDefinitionData(), newObject.getServiceDefinitionData())))
				|| (object instanceof Event newObject && operation instanceof Event op
						&& (newObject.getServiceDefinitionEvent() != null && op.getServiceDefinitionEvent() != null
								&& Objects.equals(op.getServiceDefinitionEvent(),
										newObject.getServiceDefinitionEvent())))
				|| (object instanceof RequestResponse newObject && operation instanceof RequestResponse op
						&& (newObject.getServiceDefinitionRequestResponse() != null
								&& op.getServiceDefinitionRequestResponse() != null
								&& Objects.equals(op.getServiceDefinitionRequestResponse(),
										newObject.getServiceDefinitionRequestResponse())));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ServiceDefinition getServiceDefinition() {
		if (serviceDefinition != null && serviceDefinition.eIsProxy()) {
			InternalEObject oldServiceDefinition = (InternalEObject) serviceDefinition;
			serviceDefinition = (ServiceDefinition) eResolveProxy(oldServiceDefinition);
			if (serviceDefinition != oldServiceDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION, oldServiceDefinition,
							serviceDefinition));
			}
		}
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceDefinition basicGetServiceDefinition() {
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setServiceDefinition(ServiceDefinition newServiceDefinition) {
		ServiceDefinition oldServiceDefinition = serviceDefinition;
		serviceDefinition = newServiceDefinition;
		createOpFromDef();
		// If QOS referenced in ComponentDefinition, the new ServiceDefinition
		// has to correspond
		if (interfaceLink != null) {
			for (Contract contract : interfaceLink.toArray(new Contract[0])) {
				if (!Objects.equals(contract.getSyntax(), newServiceDefinition)) {
					contract.setQos(null);
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION, oldServiceDefinition, serviceDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Use getOperations() instead of
	 * operations, in case operations is not initialized
	 * 
	 * @generated NOT
	 */
	public void createOpFromDef() {
		if (serviceDefinition != null) {
			EList<OperationType> edtServiceDefinitionOperations = serviceDefinition.getOperations();
			if (operations != null) {
				cleanQoSOperation(edtServiceDefinitionOperations);
			}
			for (OperationType operationType : edtServiceDefinitionOperations) {
				if (operationType instanceof edtinterface.Data sdData) {
					Data data = EdtqosFactory.eINSTANCE.createData();
					data.setServiceDefinitionData(sdData);
					getOperations().add(data);
				} else if (operationType instanceof edtinterface.Event sdEvent) {
					Event event = EdtqosFactory.eINSTANCE.createEvent();
					event.setServiceDefinitionEvent(sdEvent);
					getOperations().add(event);
				} else if (operationType instanceof edtinterface.RequestResponse sdRequest) {
					RequestResponse requestResponse = EdtqosFactory.eINSTANCE.createRequestResponse();
					requestResponse.setServiceDefinitionRequestResponse(sdRequest);
					getOperations().add(requestResponse);
				}
			}
		} else {
			getOperations().clear();
		}
	}

	/**
	 * @param edtServiceDefinitionOperations
	 */
	private void cleanQoSOperation(EList<OperationType> edtServiceDefinitionOperations) {
		Iterator<Operation> each = operations.iterator();
		while (each.hasNext()) {
			Operation op = each.next();
			if ((op instanceof Data data && data.getServiceDefinitionData() != null
					&& !edtServiceDefinitionOperations.contains(data.getServiceDefinitionData()))
					|| (op instanceof Event event && event.getServiceDefinitionEvent() != null
							&& !edtServiceDefinitionOperations.contains(event.getServiceDefinitionEvent()))
					|| (op instanceof RequestResponse requestResponse
							&& requestResponse.getServiceDefinitionRequestResponse() != null
							&& !edtServiceDefinitionOperations
									.contains(requestResponse.getServiceDefinitionRequestResponse()))) {
				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.SERVICE_INSTANCE_QOS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Contract> getInterfaceLink() {
		if (interfaceLink == null) {
			interfaceLink = new EObjectWithInverseResolvingEList<Contract>(Contract.class, this,
					EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK, EDTProjectPackage.CONTRACT__QOS);
		}
		return interfaceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceLink()).basicAdd(otherEnd, msgs);
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
		case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			return ((InternalEList<?>) getInterfaceLink()).basicRemove(otherEnd, msgs);
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
		case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
			return getOperations();
		case EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION:
			if (resolve)
				return getServiceDefinition();
			return basicGetServiceDefinition();
		case EdtqosPackage.SERVICE_INSTANCE_QOS__NAME:
			return getName();
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			return getInterfaceLink();
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
		case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION:
			setServiceDefinition((ServiceDefinition) newValue);
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__NAME:
			setName((String) newValue);
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			getInterfaceLink().clear();
			getInterfaceLink().addAll((Collection<? extends Contract>) newValue);
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
		case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
			getOperations().clear();
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION:
			setServiceDefinition((ServiceDefinition) null);
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			getInterfaceLink().clear();
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
		case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case EdtqosPackage.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION:
			return serviceDefinition != null;
		case EdtqosPackage.SERVICE_INSTANCE_QOS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdtqosPackage.SERVICE_INSTANCE_QOS__INTERFACE_LINK:
			return interfaceLink != null && !interfaceLink.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ServiceInstanceQosImpl
