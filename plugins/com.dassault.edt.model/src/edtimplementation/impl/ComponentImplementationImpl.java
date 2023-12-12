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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtbin.BinDesc;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleType;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtqos.ServiceInstanceQos;
import edttype.Library;
import temp.InsertionPolicies;
import temp.ModuleBehaviour;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Implementation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getAssociatedServiceQos <em>Associated Service Qos</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getReferences <em>References</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getModuleTypes <em>Module Types</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getModuleImplementations <em>Module Implementations</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getComponentDefinitionReferences <em>Component Definition References</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getComponentDefinitionServices <em>Component Definition Services</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getOperationLinks <em>Operation Links</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getExternalSenders <em>External Senders</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getModuleBehaviours <em>Module Behaviours</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getBinDesc <em>Bin Desc</em>}</li>
 *   <li>{@link edtimplementation.impl.ComponentImplementationImpl#getInsertionPolicyList <em>Insertion Policy List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationImpl extends MinimalEObjectImpl.Container implements ComponentImplementation {
	/**
	 * The cached value of the '{@link #getUsedLibraries() <em>Used Libraries</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> usedLibraries;

	/**
	 * The cached value of the '{@link #getAssociatedServiceQos() <em>Associated Service Qos</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAssociatedServiceQos()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInstanceQos> associatedServiceQos;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementationService> services;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementationReference> references;

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
	 * The cached value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition componentDefinition;

	/**
	 * The cached value of the '{@link #getModuleTypes() <em>Module Types</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleType> moduleTypes;

	/**
	 * The cached value of the '{@link #getModuleImplementations() <em>Module Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleImplementation> moduleImplementations;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getComponentDefinitionReferences()
	 * <em>Component Definition References</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponentDefinitionReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceOfLinkedComponentDefinition> componentDefinitionReferences;

	/**
	 * The cached value of the '{@link #getComponentDefinitionServices()
	 * <em>Component Definition Services</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponentDefinitionServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOfLinkedComponentDefinition> componentDefinitionServices;

	/**
	 * The cached value of the '{@link #getOperationLinks() <em>Operation Links</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOperationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationLink> operationLinks;

	/**
	 * The cached value of the '{@link #getExternalSenders() <em>External Senders</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getExternalSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalSenderOperation> externalSenders;

	/**
	 * The cached value of the '{@link #getModuleBehaviours() <em>Module Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getModuleBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleBehaviour> moduleBehaviours;

	/**
	 * The cached value of the '{@link #getBinDesc() <em>Bin Desc</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBinDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<BinDesc> binDesc;

	/**
	 * The cached value of the '{@link #getInsertionPolicyList() <em>Insertion Policy List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInsertionPolicyList()
	 * @generated
	 * @ordered
	 */
	protected InsertionPolicies insertionPolicyList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Library> getUsedLibraries() {
		if (usedLibraries == null) {
			usedLibraries = new EObjectResolvingEList<Library>(Library.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__USED_LIBRARIES);
		}
		return usedLibraries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInstanceQos> getAssociatedServiceQos() {
		if (associatedServiceQos == null) {
			associatedServiceQos = new EObjectContainmentEList<ServiceInstanceQos>(ServiceInstanceQos.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS);
		}
		return associatedServiceQos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentImplementationService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ComponentImplementationService>(ComponentImplementationService.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentImplementationReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<ComponentImplementationReference>(ComponentImplementationReference.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition getComponentDefinition() {
		if (componentDefinition != null && componentDefinition.eIsProxy()) {
			InternalEObject oldComponentDefinition = (InternalEObject)componentDefinition;
			componentDefinition = (ComponentDefinition)eResolveProxy(oldComponentDefinition);
			if (componentDefinition != oldComponentDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
			}
		}
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition basicGetComponentDefinition() {
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinition(ComponentDefinition newComponentDefinition) {
		ComponentDefinition oldComponentDefinition = componentDefinition;
		componentDefinition = newComponentDefinition;

		if (services != null) {
			Iterator<ComponentImplementationService> eachServices = services.iterator();

//		Remove ComponentImplementationService QoS override if ComponentDefinition changed
			while (eachServices.hasNext()) {
				ComponentImplementationService service = eachServices.next();
				if (newComponentDefinition == null
						|| !newComponentDefinition.getServices().contains(service.getComponentDefinitionService())) {
					eachServices.remove();
				}
			}
		}

		if (references != null) {
			Iterator<ComponentImplementationReference> eachReferences = references.iterator();
//		Remove ComponentImplementationReference QoS override if ComponentDefinition changed
			while (eachReferences.hasNext()) {
				ComponentImplementationReference reference = eachReferences.next();
				if (newComponentDefinition == null || !newComponentDefinition.getReferences()
						.contains(reference.getComponentDefinitionReference())) {
					eachReferences.remove();
				}
			}
		}

//		Create inherited Services and References operations
		createRefServFromDef();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION, oldComponentDefinition,
					componentDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Use getXX instead of XX, in
	 * case XX is not initialized yet
	 * 
	 * Can not clear the refs or Serv, because the reading by Sirius and EMF of the
	 * model.ecoadt ends by setting the ComponentDefinition
	 * 
	 * @generated NOT
	 */
	public void createRefServFromDef() {
		// Get items from ComponentDefinition
		if (componentDefinition != null) {
			EList<ComponentDefinitionReference> edtComponentDefinitionReferences = componentDefinition.getReferences();
			EList<ComponentDefinitionService> edtComponentDefinitionServices = componentDefinition.getServices();

			// Remove unnecessary items
			if (componentDefinitionReferences != null) {
				cleanComponentImplementationReferences(edtComponentDefinitionReferences);
			}
			if (componentDefinitionServices != null) {
				cleanComponentImplementationServices(edtComponentDefinitionServices);
			}

			ReferenceOfLinkedComponentDefinition edtComponentReference;
			for (ComponentDefinitionReference edtComponentDefinitionReference : edtComponentDefinitionReferences) {
				edtComponentReference = EdtimplementationFactory.eINSTANCE.createReferenceOfLinkedComponentDefinition();
				edtComponentReference.setComponentDefinitionReferenceLink(edtComponentDefinitionReference);
				edtComponentReference.setName(edtComponentDefinitionReference.getName());
				edtComponentReference.setServiceDefinitionLink(edtComponentDefinitionReference.getSyntax());
				getComponentDefinitionReferences().add(edtComponentReference);
			}
			ServiceOfLinkedComponentDefinition edtComponentService;
			for (ComponentDefinitionService edtComponentDefinitionService : edtComponentDefinitionServices) {
				edtComponentService = EdtimplementationFactory.eINSTANCE.createServiceOfLinkedComponentDefinition();
				edtComponentService.setComponentDefinitionServiceLink(edtComponentDefinitionService);
				edtComponentService.setServiceDefinitionLink(edtComponentDefinitionService.getSyntax());
				edtComponentService.setName(edtComponentDefinitionService.getName());
				getComponentDefinitionServices().add(edtComponentService);

			}
		} else {
			getComponentDefinitionReferences().clear();
			getComponentDefinitionServices().clear();
		}
	}

	/**
	 * @param edtComponentDefinitionServices
	 */
	private void cleanComponentImplementationServices(
			EList<ComponentDefinitionService> edtComponentDefinitionServices) {
		Iterator<ServiceOfLinkedComponentDefinition> each = componentDefinitionServices.iterator();
		while (each.hasNext()) {
			ServiceOfLinkedComponentDefinition serv = each.next();
			if (serv.getComponentDefinitionServiceLink() != null
					&& !edtComponentDefinitionServices.contains(serv.getComponentDefinitionServiceLink())) {
				EList<OperationLink> findOperationLinks = serv.findOperationLinks();
				operationLinks.removeAll(findOperationLinks);
				each.remove();
			}
		}
	}

	/**
	 * @param edtComponentDefinitionReferences
	 */
	private void cleanComponentImplementationReferences(
			EList<ComponentDefinitionReference> edtComponentDefinitionReferences) {
		Iterator<ReferenceOfLinkedComponentDefinition> each = componentDefinitionReferences.iterator();
		while (each.hasNext()) {
			ReferenceOfLinkedComponentDefinition ref = each.next();
			if (ref.getComponentDefinitionReferenceLink() != null
					&& !edtComponentDefinitionReferences.contains(ref.getComponentDefinitionReferenceLink())) {
				EList<OperationLink> findOperationLinks = ref.findOperationLinks();
				operationLinks.removeAll(findOperationLinks);
				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleType> getModuleTypes() {
		if (moduleTypes == null) {
			moduleTypes = new EObjectContainmentEList<ModuleType>(ModuleType.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES);
		}
		return moduleTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleImplementation> getModuleImplementations() {
		if (moduleImplementations == null) {
			moduleImplementations = new EObjectContainmentEList<ModuleImplementation>(ModuleImplementation.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS);
		}
		return moduleImplementations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ReferenceOfLinkedComponentDefinition> getComponentDefinitionReferences() {
		if (componentDefinitionReferences == null) {
			componentDefinitionReferences = new EObjectContainmentEList<ReferenceOfLinkedComponentDefinition>(
					ReferenceOfLinkedComponentDefinition.class, this,
					EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES) {
				@Override
				public void addUnique(ReferenceOfLinkedComponentDefinition object) {
					for (ReferenceOfLinkedComponentDefinition edtReference : componentDefinitionReferences) {
						if (object.getComponentDefinitionReferenceLink() != null
								&& edtReference.getComponentDefinitionReferenceLink() != null
								&& Objects.equals(edtReference.getComponentDefinitionReferenceLink(),
										object.getComponentDefinitionReferenceLink())) {
							return;
						}
					}
					super.addUnique(object);
				}
			};
		}
		return componentDefinitionReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ServiceOfLinkedComponentDefinition> getComponentDefinitionServices() {
		if (componentDefinitionServices == null) {
			componentDefinitionServices = new EObjectContainmentEList<ServiceOfLinkedComponentDefinition>(
					ServiceOfLinkedComponentDefinition.class, this,
					EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES) {
				@Override
				public void addUnique(ServiceOfLinkedComponentDefinition object) {
					for (ServiceOfLinkedComponentDefinition edtService : componentDefinitionServices) {
						if (object.getComponentDefinitionServiceLink() != null
								&& edtService.getComponentDefinitionServiceLink() != null
								&& Objects.equals(edtService.getComponentDefinitionServiceLink(),
										object.getComponentDefinitionServiceLink())) {
							return;
						}
					}
					super.addUnique(object);
				}
			};
		}
		return componentDefinitionServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationLink> getOperationLinks() {
		if (operationLinks == null) {
			operationLinks = new EObjectContainmentEList<OperationLink>(OperationLink.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS);
		}
		return operationLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalSenderOperation> getExternalSenders() {
		if (externalSenders == null) {
			externalSenders = new EObjectContainmentEList<ExternalSenderOperation>(ExternalSenderOperation.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS);
		}
		return externalSenders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleBehaviour> getModuleBehaviours() {
		if (moduleBehaviours == null) {
			moduleBehaviours = new EObjectContainmentEList<ModuleBehaviour>(ModuleBehaviour.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS);
		}
		return moduleBehaviours;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinDesc> getBinDesc() {
		if (binDesc == null) {
			binDesc = new EObjectContainmentEList<BinDesc>(BinDesc.class, this, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC);
		}
		return binDesc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertionPolicies getInsertionPolicyList() {
		return insertionPolicyList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertionPolicyList(InsertionPolicies newInsertionPolicyList,
			NotificationChain msgs) {
		InsertionPolicies oldInsertionPolicyList = insertionPolicyList;
		insertionPolicyList = newInsertionPolicyList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST, oldInsertionPolicyList, newInsertionPolicyList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsertionPolicyList(InsertionPolicies newInsertionPolicyList) {
		if (newInsertionPolicyList != insertionPolicyList) {
			NotificationChain msgs = null;
			if (insertionPolicyList != null)
				msgs = ((InternalEObject)insertionPolicyList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST, null, msgs);
			if (newInsertionPolicyList != null)
				msgs = ((InternalEObject)newInsertionPolicyList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST, null, msgs);
			msgs = basicSetInsertionPolicyList(newInsertionPolicyList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST, newInsertionPolicyList, newInsertionPolicyList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS:
				return ((InternalEList<?>)getAssociatedServiceQos()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES:
				return ((InternalEList<?>)getModuleTypes()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getModuleImplementations()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
				return ((InternalEList<?>)getComponentDefinitionReferences()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
				return ((InternalEList<?>)getComponentDefinitionServices()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
				return ((InternalEList<?>)getOperationLinks()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
				return ((InternalEList<?>)getExternalSenders()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS:
				return ((InternalEList<?>)getModuleBehaviours()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
				return ((InternalEList<?>)getBinDesc()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
				return basicSetInsertionPolicyList(null, msgs);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__USED_LIBRARIES:
				return getUsedLibraries();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS:
				return getAssociatedServiceQos();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
				return getServices();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
				return getReferences();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME:
				return getName();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				if (resolve) return getComponentDefinition();
				return basicGetComponentDefinition();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES:
				return getModuleTypes();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
				return getModuleImplementations();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
				return getInstances();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
				return getComponentDefinitionReferences();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
				return getComponentDefinitionServices();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
				return getOperationLinks();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
				return getExternalSenders();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS:
				return getModuleBehaviours();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
				return getBinDesc();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
				return getInsertionPolicyList();
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__USED_LIBRARIES:
				getUsedLibraries().clear();
				getUsedLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ComponentImplementationService>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends ComponentImplementationReference>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES:
				getModuleTypes().clear();
				getModuleTypes().addAll((Collection<? extends ModuleType>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
				getModuleImplementations().clear();
				getModuleImplementations().addAll((Collection<? extends ModuleImplementation>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
				getComponentDefinitionReferences().clear();
				getComponentDefinitionReferences().addAll((Collection<? extends ReferenceOfLinkedComponentDefinition>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
				getComponentDefinitionServices().clear();
				getComponentDefinitionServices().addAll((Collection<? extends ServiceOfLinkedComponentDefinition>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
				getOperationLinks().clear();
				getOperationLinks().addAll((Collection<? extends OperationLink>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
				getExternalSenders().clear();
				getExternalSenders().addAll((Collection<? extends ExternalSenderOperation>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
				getBinDesc().clear();
				getBinDesc().addAll((Collection<? extends BinDesc>)newValue);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
				setInsertionPolicyList((InsertionPolicies)newValue);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__USED_LIBRARIES:
				getUsedLibraries().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
				getServices().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
				getReferences().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)null);
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES:
				getModuleTypes().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
				getModuleImplementations().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
				getInstances().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
				getComponentDefinitionReferences().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
				getComponentDefinitionServices().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
				getOperationLinks().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
				getExternalSenders().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
				getBinDesc().clear();
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
				setInsertionPolicyList((InsertionPolicies)null);
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
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__USED_LIBRARIES:
				return usedLibraries != null && !usedLibraries.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS:
				return associatedServiceQos != null && !associatedServiceQos.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
				return services != null && !services.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
				return references != null && !references.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				return componentDefinition != null;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPES:
				return moduleTypes != null && !moduleTypes.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
				return moduleImplementations != null && !moduleImplementations.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
				return instances != null && !instances.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
				return componentDefinitionReferences != null && !componentDefinitionReferences.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
				return componentDefinitionServices != null && !componentDefinitionServices.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
				return operationLinks != null && !operationLinks.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
				return externalSenders != null && !externalSenders.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS:
				return moduleBehaviours != null && !moduleBehaviours.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
				return binDesc != null && !binDesc.isEmpty();
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
				return insertionPolicyList != null;
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

	/**
	 * 
	 * @param moduleImplementationName
	 * @return
	 */
	public edtimplementation.ModuleImplementation findModuleImplementationByName(String moduleImplementationName) {
		for (edtimplementation.ModuleImplementation moduleImplementation : moduleImplementations) {
			if (Objects.equals(moduleImplementation.getName(), moduleImplementationName)) {
				return moduleImplementation;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param moduleTypeName
	 * @return
	 */
	public edtimplementation.ModuleType findModuleTypeByName(String moduleTypeName) {
		for (edtimplementation.ModuleType moduleType : moduleTypes) {
			if (Objects.equals(moduleType.getName(), moduleTypeName)) {
				return moduleType;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param instanceName
	 * @return
	 */
	public edtimplementation.Instance findInstanceByName(String instanceName) {
		for (edtimplementation.Instance instance : instances) {
			if (Objects.equals(instance.getName(), instanceName)) {
				return instance;
			}
		}
		return null;
	}

	/**
	 * find operation by name in list
	 * 
	 * @param edtInstances
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInModuleInstances(String instanceName,
			String operationName) {
		for (Instance instance : instances) {
			if (instance instanceof edtimplementation.ModuleInstance moduleInstance
					&& Objects.equals(moduleInstance.getName(), instanceName)) {
				EList<OperationInstance> operations = moduleInstance.getOperations();
				for (OperationInstance operation : operations) {
					if (Objects.equals(operation.getName(), operationName)) {
						return operation;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Find operation by name in list
	 * 
	 * @param edtInstances
	 * @param instanceName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInTriggerInstances(String instanceName) {
		for (Instance instance : instances) {
			if (instance instanceof edtimplementation.TriggerInstance triggerInstance
					&& Objects.equals(triggerInstance.getName(), instanceName)) {
				return triggerInstance.getOperations();
			}
		}
		return null;
	}

	/**
	 * Find operation by name in list
	 * 
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInDynamicTriggerInstances(String instanceName,
			String operationName) {
		for (Instance instance : instances) {
			if (instance instanceof edtimplementation.DynamicTriggerInstance dynamicTriggerInstance
					&& Objects.equals(dynamicTriggerInstance.getName(), instanceName)) {
				EList<OperationInstance> operations = dynamicTriggerInstance.getOperations();
				for (OperationInstance operation : operations) {
					if (Objects.equals(operation.getName(), operationName)) {
						return operation;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Find operationInstance by name in List
	 * 
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInReferences(String instanceName,
			String operationName) {
		for (ReferenceOfLinkedComponentDefinition edtDefRef : componentDefinitionReferences) {
			if (Objects.equals(edtDefRef.getComponentDefinitionReferenceLink().getName(), instanceName)) {
				EList<OperationInstance> operations = edtDefRef.getOperations();
				for (OperationInstance operation : operations) {
					if (Objects.equals(operation.getName(), operationName)) {
						return operation;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Find operationInstance by name in List
	 * 
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInServices(String instanceName,
			String operationName) {
		for (ServiceOfLinkedComponentDefinition edtDefServ : componentDefinitionServices) {
			if (Objects.equals(edtDefServ.getComponentDefinitionServiceLink().getName(), instanceName)) {
				EList<OperationInstance> operations = edtDefServ.getOperations();
				for (OperationInstance operation : operations) {
					if (Objects.equals(operation.getName(), operationName)) {
						return operation;
					}
				}
			}
		}
		return null;
	}

	@Override
	public OperationInstance findOperationInstanceInExternal(String operationName) {
		for (ExternalSenderOperation externalSender : externalSenders) {
			if (Objects.equals(externalSender.getName(), operationName)) {
				return externalSender;
			}
		}
		return null;
	}
} // ComponentImplementationImpl
