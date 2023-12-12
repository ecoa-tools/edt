/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.OperationInstance;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestServiceInstance;
import edtimplementation.ServRefOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;
import edtinterface.Data;
import edtinterface.EDTInterfacePackage;
import edtinterface.Event;
import edtinterface.OperationType;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;
import edtproject.Steps;
import edtqos.Operation;
import edtqos.ServiceInstanceQos;
import edttype.Library;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service
 * Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtinterface.impl.ServiceDefinitionImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link edtinterface.impl.ServiceDefinitionImpl#getOperations
 * <em>Operations</em>}</li>
 * <li>{@link edtinterface.impl.ServiceDefinitionImpl#getUsedLibraries <em>Used
 * Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefinitionImpl extends MinimalEObjectImpl.Container implements ServiceDefinition {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationType> operations;

	/**
	 * The cached value of the '{@link #getUsedLibraries() <em>Used Libraries</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUsedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> usedLibraries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTInterfacePackage.Literals.SERVICE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.SERVICE_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<OperationType> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationType>(OperationType.class, this,
					EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS) {
				@Override
				public void addUnique(OperationType object) {
					EList<ServiceInstanceQos> associatedQoS = findAssociatedQoS();
					EList<ServRefOfLinkedComponentDefinition> associatedComponentImplementation = findAssociatedComponentImplementation();
					if (object instanceof Data data) {
						addData(associatedQoS, associatedComponentImplementation, data);
					} else if (object instanceof Event event) {
						addEvent(associatedQoS, associatedComponentImplementation, event);
					} else if (object instanceof RequestResponse requestResponse) {
						addRequestResponse(associatedQoS, associatedComponentImplementation, requestResponse);
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<ServiceInstanceQos> associatedQoS = findAssociatedQoS();
					for (ServiceInstanceQos qos : associatedQoS) {
						EList<Operation> operationsQoS = qos.getOperations();
						Iterator<Operation> each = operationsQoS.iterator();
						while (each.hasNext()) {
							Operation op = each.next();
							String opName = op.getName();
							if (Objects.equals(opName, ((OperationType) object).getName())) {
								each.remove();
							}
						}
					}

					EList<ServRefOfLinkedComponentDefinition> associatedComponentImplementation = findAssociatedComponentImplementation();
					for (ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition : associatedComponentImplementation) {
						EList<OperationInstance> operationsCI = servRefOfLinkedComponentDefinition.getOperations();
						Iterator<OperationInstance> each = operationsCI.iterator();
						while (each.hasNext()) {
							OperationInstance op = each.next();
							String opName = op.getName();
							if (Objects.equals(opName, ((OperationType) object).getName())) {
								each.remove();
							}
						}
					}
					return super.remove(object);
				}

			};
		}
		return operations;
	}

	/**
	 * @param associatedQoS
	 * @param associatedComponentImplementation
	 * @param data
	 */
	private void addData(EList<ServiceInstanceQos> associatedQoS,
			EList<ServRefOfLinkedComponentDefinition> associatedComponentImplementation, Data data) {
		for (ServiceInstanceQos qos : associatedQoS) {
			edtqos.Data qosData = edtqos.EdtqosFactory.eINSTANCE.createData();
			qosData.setServiceDefinitionData(data);
			qosData.setName(data.getName());
			qos.getOperations().add(qosData);
		}

		for (ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition : associatedComponentImplementation) {
			if (servRefOfLinkedComponentDefinition instanceof ServiceOfLinkedComponentDefinition) {
				VersionedDataServiceInstance versionedDataServiceInstance = EdtimplementationFactory.eINSTANCE
						.createVersionedDataServiceInstance();
				versionedDataServiceInstance.setSDOperationRef(data);
				versionedDataServiceInstance.setName(data.getName());
				servRefOfLinkedComponentDefinition.getOperations().add(versionedDataServiceInstance);
			} else {
				VersionedDataReferenceInstance versionedDataReferenceInstance = EdtimplementationFactory.eINSTANCE
						.createVersionedDataReferenceInstance();
				versionedDataReferenceInstance.setSDOperationRef(data);
				versionedDataReferenceInstance.setName(data.getName());
				servRefOfLinkedComponentDefinition.getOperations().add(versionedDataReferenceInstance);
			}
		}
	}

	/**
	 * 
	 * @param associatedQoS
	 * @param associatedComponentImplementation
	 * @param event
	 */
	private void addEvent(EList<ServiceInstanceQos> associatedQoS,
			EList<ServRefOfLinkedComponentDefinition> associatedComponentImplementation, Event event) {
		for (ServiceInstanceQos qos : associatedQoS) {
			edtqos.Event qosEvent = edtqos.EdtqosFactory.eINSTANCE.createEvent();
			qosEvent.setServiceDefinitionEvent(event);
			qosEvent.setName(event.getName());
			qos.getOperations().add(qosEvent);
		}
		for (ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition : associatedComponentImplementation) {
			EventDefinitionInstance eventDefinitionInstance = EdtimplementationFactory.eINSTANCE
					.createEventDefinitionInstance();
			eventDefinitionInstance.setSDOperationRef(event);
			eventDefinitionInstance.setName(event.getName());
			servRefOfLinkedComponentDefinition.getOperations().add(eventDefinitionInstance);
		}
	}

	/**
	 * 
	 * @param associatedQoS
	 * @param associatedComponentImplementation
	 * @param requestResponse
	 */
	private void addRequestResponse(EList<ServiceInstanceQos> associatedQoS,
			EList<ServRefOfLinkedComponentDefinition> associatedComponentImplementation,
			RequestResponse requestResponse) {
		for (ServiceInstanceQos qos : associatedQoS) {
			edtqos.RequestResponse qosRequestResponse = edtqos.EdtqosFactory.eINSTANCE.createRequestResponse();
			qosRequestResponse.setServiceDefinitionRequestResponse(requestResponse);
			qosRequestResponse.setName(requestResponse.getName());
			qos.getOperations().add(qosRequestResponse);
		}

		for (ServRefOfLinkedComponentDefinition servRefOfLinkedComponentDefinition : associatedComponentImplementation) {
			if (servRefOfLinkedComponentDefinition instanceof ServiceOfLinkedComponentDefinition) {
				RequestServiceInstance requestServiceInstance = EdtimplementationFactory.eINSTANCE
						.createRequestServiceInstance();
				requestServiceInstance.setSDOperationRef(requestResponse);
				requestServiceInstance.setName(requestResponse.getName());
				servRefOfLinkedComponentDefinition.getOperations().add(requestServiceInstance);
			} else {
				RequestReferenceInstance requestReferenceInstance = EdtimplementationFactory.eINSTANCE
						.createRequestReferenceInstance();
				requestReferenceInstance.setSDOperationRef(requestResponse);
				requestReferenceInstance.setName(requestResponse.getName());
				servRefOfLinkedComponentDefinition.getOperations().add(requestReferenceInstance);
			}
		}
	}

	/**
	 * Finds all QoS that inherit from this ServiceDefinition
	 * 
	 * @param serviceDefinition :
	 * @return list of QoS that inherit from this ServiceDefinition
	 * @generated NOT
	 */
	public EList<ServiceInstanceQos> findAssociatedQoS() {
		EList<ServiceInstanceQos> qosAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ServiceInstanceQos serviceInstanceQoS) {
					qosAssociated.add(serviceInstanceQoS);
				}
			}
		}

		return qosAssociated;
	}

	/**
	 * Finds all ComponentImplementation References and Services that inherit from
	 * this ServiceDefinition
	 * 
	 * @param serviceDefinition :
	 * @return list of References and Services that inherit from this
	 *         ServiceDefinition
	 * @generated NOT
	 */
	public EList<ServRefOfLinkedComponentDefinition> findAssociatedComponentImplementation() {
		EList<ServRefOfLinkedComponentDefinition> componentImplementationCptDefAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ServRefOfLinkedComponentDefinition servRefCI) {
					componentImplementationCptDefAssociated.add(servRefCI);
				}
			}
		}

		return componentImplementationCptDefAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Library> getUsedLibraries() {
		if (usedLibraries == null) {
			usedLibraries = new EObjectResolvingEList<Library>(Library.class, this,
					EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES);
		}
		return usedLibraries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
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
		case EDTInterfacePackage.SERVICE_DEFINITION__NAME:
			return getName();
		case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			return getOperations();
		case EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES:
			return getUsedLibraries();
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
		case EDTInterfacePackage.SERVICE_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends OperationType>) newValue);
			return;
		case EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES:
			getUsedLibraries().clear();
			getUsedLibraries().addAll((Collection<? extends Library>) newValue);
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
		case EDTInterfacePackage.SERVICE_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			getOperations().clear();
			return;
		case EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES:
			getUsedLibraries().clear();
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
		case EDTInterfacePackage.SERVICE_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES:
			return usedLibraries != null && !usedLibraries.isEmpty();
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

	/**
	 * Find ServiceDefinition OperationType by Name
	 * 
	 * @param name
	 * @param operations
	 * @return edtServiceDefinition corresponding to Name
	 */
	public edtinterface.OperationType findServiceDefinitionOperation(String name) {
		for (edtinterface.OperationType operation : operations) {
			if (Objects.equals(operation.getName(), name)) {
				return operation;
			}
		}
		return null;
	}

} // ServiceDefinitionImpl
