/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.ComponentProperty;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.EDTProjectPackage;
import edtproject.Property;
import edtproject.Steps;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.ComponentDefinitionImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link edtproject.impl.ComponentDefinitionImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link edtproject.impl.ComponentDefinitionImpl#getReferences
 * <em>References</em>}</li>
 * <li>{@link edtproject.impl.ComponentDefinitionImpl#getServices
 * <em>Services</em>}</li>
 * <li>{@link edtproject.impl.ComponentDefinitionImpl#getAssociatedServiceQos
 * <em>Associated Service Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentDefinitionReference> references;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentDefinitionService> services;

	/**
	 * The cached value of the '{@link #getAssociatedServiceQos() <em>Associated
	 * Service Qos</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAssociatedServiceQos()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInstanceQos> associatedServiceQos;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentDefinitionImpl() {
		super();
	}

	protected EList<EObject> getCrossRef() {
		return this.eCrossReferences();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES) {
				@Override
				public void addUnique(Property object) {
					EList<Component> associatedComponent = ((ComponentDefinition) this.owner).findAssociatedComponent();
					for (Component component : associatedComponent) {
						ComponentProperty componentProperty = edtproject.EDTProjectFactory.eINSTANCE
								.createComponentProperty();
						componentProperty.setComponentDefinitionProperty(object);
						componentProperty.setValue(object.getValue());
						component.getProperties().add(componentProperty);

					}

					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<Component> associatedComponent = findAssociatedComponent();
					for (Component component : associatedComponent) {
						cleanComponentProperties(object, component);
					}
					return super.remove(object);
				}

				/**
				 * @param object
				 * @param component
				 */
				private void cleanComponentProperties(Object object, Component component) {
					EList<ComponentProperty> edtComponentProperties = component.getProperties();
					Iterator<ComponentProperty> each = edtComponentProperties.iterator();
					while (each.hasNext()) {
						ComponentProperty prop = each.next();
						if (Objects.equals(prop.getName(), ((Property) object).getName())) {
							each.remove();
						}
					}
				}
			};
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ComponentDefinitionReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<ComponentDefinitionReference>(ComponentDefinitionReference.class,
					this, EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES) {
				@Override
				public void addUnique(ComponentDefinitionReference object) {
					EList<Component> associatedComponent = ((ComponentDefinition) this.owner).findAssociatedComponent();
					for (Component component : associatedComponent) {
						ComponentReference reference = edtproject.EDTProjectFactory.eINSTANCE
								.createComponentReference();
						reference.setComponentDefinitionReference(object);
						component.getComponentReferences().add(reference);
					}

					EList<ComponentImplementation> associatedComponentImplementation = findAssociatedComponentImplementation();
					for (ComponentImplementation componentImplementation : associatedComponentImplementation) {
						ReferenceOfLinkedComponentDefinition referenceOfLinkedComponentDefinition = EdtimplementationFactory.eINSTANCE
								.createReferenceOfLinkedComponentDefinition();
						referenceOfLinkedComponentDefinition.setComponentDefinitionReferenceLink(object);
						referenceOfLinkedComponentDefinition.setName(object.getName());
						componentImplementation.getComponentDefinitionReferences()
								.add(referenceOfLinkedComponentDefinition);
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<Component> associatedComponent = findAssociatedComponent();
					for (Component component : associatedComponent) {
						cleanComponentReferences(object, component);
					}

					EList<ComponentImplementation> associatedComponentImplementation = findAssociatedComponentImplementation();
					for (ComponentImplementation componentImplementation : associatedComponentImplementation) {
						cleanComponentImplementationReferences(object, componentImplementation);

					}
					return super.remove(object);
				}
			};
		}
		return references;
	}

	/**
	 * @param object
	 * @param component
	 */
	private void cleanComponentReferences(Object object, Component component) {
		EList<ComponentReference> edtComponentReferences = component.getComponentReferences();
		Iterator<ComponentReference> each = edtComponentReferences.iterator();
		while (each.hasNext()) {
			ComponentReference ref = each.next();
			if (Objects.equals(ref.getName(), ((ComponentDefinitionReference) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * @param object
	 * @param componentImplementation
	 */
	private void cleanComponentImplementationReferences(Object object,
			ComponentImplementation componentImplementation) {
		EList<ReferenceOfLinkedComponentDefinition> edtComponentImplementationReferences = componentImplementation
				.getComponentDefinitionReferences();
		Iterator<ReferenceOfLinkedComponentDefinition> each = edtComponentImplementationReferences.iterator();
		while (each.hasNext()) {
			ReferenceOfLinkedComponentDefinition serv = each.next();
			if (Objects.equals(serv.getName(), ((ComponentDefinitionReference) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ComponentDefinitionService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ComponentDefinitionService>(ComponentDefinitionService.class, this,
					EDTProjectPackage.COMPONENT_DEFINITION__SERVICES) {
				@Override
				public void addUnique(ComponentDefinitionService object) {
					EList<Component> associatedComponent = ((ComponentDefinition) this.owner).findAssociatedComponent();
					for (Component component : associatedComponent) {
						ComponentService service = edtproject.EDTProjectFactory.eINSTANCE.createComponentService();
						service.setComponentDefinitionService(object);
						component.getComponentServices().add(service);
					}

					EList<ComponentImplementation> associatedComponentImplementation = findAssociatedComponentImplementation();
					for (ComponentImplementation componentImplementation : associatedComponentImplementation) {
						ServiceOfLinkedComponentDefinition serviceOfLinkedComponentDefinition = EdtimplementationFactory.eINSTANCE
								.createServiceOfLinkedComponentDefinition();
						serviceOfLinkedComponentDefinition.setComponentDefinitionServiceLink(object);
						serviceOfLinkedComponentDefinition.setName(object.getName());
						componentImplementation.getComponentDefinitionServices()
								.add(serviceOfLinkedComponentDefinition);
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<Component> associatedComponent = findAssociatedComponent();
					for (Component component : associatedComponent) {
						cleanComponentServices(object, component);
					}

					EList<ComponentImplementation> associatedComponentImplementation = findAssociatedComponentImplementation();
					for (ComponentImplementation componentImplementation : associatedComponentImplementation) {
						cleanComponentImplementationServices(object, componentImplementation);
					}
					return super.remove(object);
				}

			};
		}
		return services;
	}

	/**
	 * @param object
	 * @param componentImplementation
	 */
	private void cleanComponentImplementationServices(Object object, ComponentImplementation componentImplementation) {
		EList<ServiceOfLinkedComponentDefinition> edtComponentImplementationServices = componentImplementation
				.getComponentDefinitionServices();
		Iterator<ServiceOfLinkedComponentDefinition> each = edtComponentImplementationServices.iterator();
		while (each.hasNext()) {
			ServiceOfLinkedComponentDefinition serv = each.next();
			if (Objects.equals(serv.getName(), ((ComponentDefinitionService) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * @param object
	 * @param component
	 */
	private void cleanComponentServices(Object object, Component component) {
		EList<ComponentService> edtComponentServices = component.getComponentServices();
		Iterator<ComponentService> each = edtComponentServices.iterator();
		while (each.hasNext()) {
			ComponentService serv = each.next();
			if (Objects.equals(serv.getName(), ((ComponentDefinitionService) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<Component> findAssociatedComponent() {
		EList<Component> componentAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof Component component) {
					componentAssociated.add(component);
				}
			}
		}
		return componentAssociated;
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<ComponentImplementation> findAssociatedComponentImplementation() {
		EList<ComponentImplementation> componentImplementationAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ComponentImplementation componentImplementation) {
					componentImplementationAssociated.add(componentImplementation);
				}
			}
		}
		return componentImplementationAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<ServiceInstanceQos> getAssociatedServiceQos() {
		if (associatedServiceQos == null) {
			associatedServiceQos = new EObjectContainmentEList<ServiceInstanceQos>(ServiceInstanceQos.class, this,
					EDTProjectPackage.COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS);
		}
		return associatedServiceQos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPONENT_DEFINITION__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS:
			return ((InternalEList<?>) getAssociatedServiceQos()).basicRemove(otherEnd, msgs);
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
		case EDTProjectPackage.COMPONENT_DEFINITION__NAME:
			return getName();
		case EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES:
			return getProperties();
		case EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES:
			return getReferences();
		case EDTProjectPackage.COMPONENT_DEFINITION__SERVICES:
			return getServices();
		case EDTProjectPackage.COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS:
			return getAssociatedServiceQos();
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
		case EDTProjectPackage.COMPONENT_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES:
			getReferences().clear();
			getReferences().addAll((Collection<? extends ComponentDefinitionReference>) newValue);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends ComponentDefinitionService>) newValue);
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
		case EDTProjectPackage.COMPONENT_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES:
			getProperties().clear();
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES:
			getReferences().clear();
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION__SERVICES:
			getServices().clear();
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
		case EDTProjectPackage.COMPONENT_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTProjectPackage.COMPONENT_DEFINITION__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case EDTProjectPackage.COMPONENT_DEFINITION__REFERENCES:
			return references != null && !references.isEmpty();
		case EDTProjectPackage.COMPONENT_DEFINITION__SERVICES:
			return services != null && !services.isEmpty();
		case EDTProjectPackage.COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS:
			return associatedServiceQos != null && !associatedServiceQos.isEmpty();
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
	 * Find componentDefinitionProperty by name
	 * 
	 * @param name                 : name of ComponentDefinitionProperty to link
	 * @param edtPropertyArrayList : list of ComponentDefinitionProperty
	 * @return ComponentDefinitionProperty to link
	 */
	public edtproject.Property findComponentDefinitionPropertyByName(String name) {
		for (edtproject.Property edtProperty : properties) {
			if (Objects.equals(edtProperty.getName(), name)) {
				return edtProperty;
			}
		}

		return null;
	}

	/**
	 * Find componentDefinitionService by name
	 * 
	 * @param name                               : name of
	 *                                           ComponentDefinitionService to link
	 * @param edtComponentDefinitionServicesList : list of
	 *                                           ComponentDefinitionServices
	 * @return ComponentDefinitionService to link
	 */
	public ComponentDefinitionService findComponentDefinitionServiceByName(String name) {
		for (ComponentDefinitionService edtService : services) {
			if (Objects.equals(edtService.getName(), name)) {
				return edtService;
			}
		}

		return null;
	}

	/**
	 * Find ComponentDefinitionReference by name
	 * 
	 * @param name                          : name of ComponentDefinitionReference
	 *                                      to link
	 * @param componentDefinitionReferences :list of ComponentDefinitionReference
	 * @return ComponentDefinitionReference to link
	 */
	public ComponentDefinitionReference findComponentDefinitionReferenceByName(String name) {
		for (ComponentDefinitionReference edtReference : references) {
			if (Objects.equals(edtReference.getName(), name)) {
				return edtReference;
			}
		}

		return null;
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank()
				&& (!this.getReferences().isEmpty() || !this.getServices().isEmpty()));
	}

} // ComponentDefinitionImpl
