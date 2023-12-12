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

import com.dassault.edt.log.EDTLog;

import edtdeployment.ComponentLog;
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtimplementation.ComponentImplementation;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.ComponentProperty;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.EDTProjectFactory;
import edtproject.EDTProjectPackage;
import edtproject.Property;
import edtproject.ServiceLink;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.ComponentImpl#getComponentDefinition <em>Component
 * Definition</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getComponentReferences <em>Component
 * References</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getComponentServices <em>Component
 * Services</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getName <em>Name</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * <li>{@link edtproject.impl.ComponentImpl#getComponentDefinitionVersion
 * <em>Component Definition Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getComponentDefinition() <em>Component
	 * Definition</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition componentDefinition;

	/**
	 * The cached value of the '{@link #getComponentReferences() <em>Component
	 * References</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComponentReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentReference> componentReferences;

	/**
	 * The cached value of the '{@link #getComponentServices() <em>Component
	 * Services</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComponentServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentService> componentServices;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProperty> properties;

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
	 * The cached value of the '{@link #getComponentImplementation() <em>Component
	 * Implementation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation componentImplementation;

	/**
	 * The default value of the '{@link #getComponentDefinitionVersion()
	 * <em>Component Definition Version</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComponentDefinitionVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_DEFINITION_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentDefinitionVersion()
	 * <em>Component Definition Version</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComponentDefinitionVersion()
	 * @generated
	 * @ordered
	 */
	protected String componentDefinitionVersion = COMPONENT_DEFINITION_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ComponentDefinition getComponentDefinition() {
		if (componentDefinition != null && componentDefinition.eIsProxy()) {
			InternalEObject oldComponentDefinition = (InternalEObject) componentDefinition;
			componentDefinition = (ComponentDefinition) eResolveProxy(oldComponentDefinition);
			if (componentDefinition != oldComponentDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION, oldComponentDefinition,
							componentDefinition));
			}
		}
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		if (componentImplementation != null && componentImplementation.getComponentDefinition() != null
				&& !Objects.equals(componentImplementation.getComponentDefinition(), newComponentDefinition)) {
			EDTLog.toPopUpAndConsole(
					"Warning : the new ComponentDefinition does not correspond to the ComponentImplementation Definition",
					"You have to change the ComponentImplementation, its definition or revert to the old ComponentDefinition.");
		}
		createRefServPropFromDef();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION,
					oldComponentDefinition, componentDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Use getXX instead of XX, in
	 * case XX is not initialized yet Can not clear the properties, refs or Serv,
	 * because the reading by Sirius and EMF of the model.ecoadt ends by setting the
	 * ComponentDefinition
	 * 
	 * @generated NOT
	 */
	public void createRefServPropFromDef() {
		// Get items from ComponentDefinition
		EList<ComponentDefinitionReference> edtComponentDefinitionReferences = new BasicEList<>();
		EList<ComponentDefinitionService> edtComponentDefinitionServices = new BasicEList<>();
		EList<Property> edtComponentDefinitionProperties = new BasicEList<>();
		if (componentDefinition != null) {
			edtComponentDefinitionReferences = componentDefinition.getReferences();
			edtComponentDefinitionServices = componentDefinition.getServices();
			edtComponentDefinitionProperties = componentDefinition.getProperties();
		}
		// Remove unnecessary items
		if (componentReferences != null) {
			cleanComponentReferences(edtComponentDefinitionReferences);
		}
		if (componentServices != null) {
			cleanComponentServices(edtComponentDefinitionServices);
		}
		if (properties != null) {
			cleanComponentProperties(edtComponentDefinitionProperties);
		}
		ComponentReference edtComponentReference;
		for (ComponentDefinitionReference edtComponentDefinitionReference : edtComponentDefinitionReferences) {
			edtComponentReference = EDTProjectFactory.eINSTANCE.createComponentReference();
			edtComponentReference.setComponentDefinitionReference(edtComponentDefinitionReference);
			getComponentReferences().add(edtComponentReference);
		}
		ComponentService edtComponentService;
		for (ComponentDefinitionService edtService : edtComponentDefinitionServices) {
			edtComponentService = EDTProjectFactory.eINSTANCE.createComponentService();
			edtComponentService.setComponentDefinitionService(edtService);
			getComponentServices().add(edtComponentService);

		}
		ComponentProperty edtComponentProperty;
		for (Property edtProperty : edtComponentDefinitionProperties) {
			edtComponentProperty = EDTProjectFactory.eINSTANCE.createComponentProperty();
			edtComponentProperty.setComponentDefinitionProperty(edtProperty);
			edtComponentProperty.setValue(edtProperty.getValue());
			getProperties().add(edtComponentProperty);
		}
	}

	/**
	 * @param edtComponentDefinitionProperties
	 */
	private void cleanComponentProperties(EList<Property> edtComponentDefinitionProperties) {
		Iterator<ComponentProperty> each = properties.iterator();
		while (each.hasNext()) {
			ComponentProperty prop = each.next();
			if (prop.getComponentDefinitionProperty() != null
					&& !edtComponentDefinitionProperties.contains(prop.getComponentDefinitionProperty())) {
				each.remove();
			}
		}
	}

	/**
	 * Remove ComponentService and ServiceLink associated
	 * 
	 * @param edtComponentDefinitionServices
	 */
	private void cleanComponentServices(EList<ComponentDefinitionService> edtComponentDefinitionServices) {
		Iterator<ComponentService> each = componentServices.iterator();
		while (each.hasNext()) {
			ComponentService service = each.next();
			if (service.getComponentDefinitionService() != null
					&& !edtComponentDefinitionServices.contains(service.getComponentDefinitionService())) {
				EList<ServiceLink> serviceLink = service.getServiceLink();
				Composite composite = (Composite) service.eContainer().eContainer();
				composite.getServiceLinks().removeAll(serviceLink);
				each.remove();
			}
		}
	}

	/**
	 * Remove componentReference and ServiceLink associated
	 * 
	 * @param edtComponentDefinitionReferences
	 */
	private void cleanComponentReferences(EList<ComponentDefinitionReference> edtComponentDefinitionReferences) {
		Iterator<ComponentReference> each = componentReferences.iterator();
		while (each.hasNext()) {
			ComponentReference ref = each.next();
			if (ref.getComponentDefinitionReference() != null
					&& !edtComponentDefinitionReferences.contains(ref.getComponentDefinitionReference())) {
				EList<ServiceLink> serviceLink = ref.getServiceLink();
				Composite composite = (Composite) ref.eContainer().eContainer();
				composite.getServiceLinks().removeAll(serviceLink);
				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Modify adding, to not have
	 * doubles
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<ComponentReference> getComponentReferences() {
		if (componentReferences == null) {
			componentReferences = new EObjectContainmentEList<ComponentReference>(ComponentReference.class, this,
					EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES) {
				@Override
				public void addUnique(ComponentReference object) {
					for (ComponentReference componentReference : componentReferences) {
						if (!Objects.equals(componentReference, object)
								&& object.getComponentDefinitionReference() != null
								&& componentReference.getComponentDefinitionReference() != null
								&& Objects.equals(componentReference.getComponentDefinitionReference(),
										object.getComponentDefinitionReference())) {
							if (object.isSetMultiplicity()) {
								componentReference.setMultiplicity(object.getMultiplicity());
							}
							return;
						}
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					ComponentReference ref = (ComponentReference) object;
					EList<ServiceLink> serviceLink = ref.getServiceLink();
					Composite composite = (Composite) ref.eContainer().eContainer();
					composite.getServiceLinks().removeAll(serviceLink);
					return super.remove(object);
				}

			};
		}
		return componentReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Modify adding, to not have
	 * doubles
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<ComponentService> getComponentServices() {
		if (componentServices == null) {
			componentServices = new EObjectContainmentEList<ComponentService>(ComponentService.class, this,
					EDTProjectPackage.COMPONENT__COMPONENT_SERVICES) {
				@Override
				public void addUnique(ComponentService object) {

					for (ComponentService componentService : componentServices) {
						if (!Objects.equals(componentService, object)
								&& componentService.getComponentDefinitionService() != null
								&& object.getComponentDefinitionService() != null
								&& Objects.equals(componentService.getComponentDefinitionService(),
										object.getComponentDefinitionService())) {
							return;
						}
					}

					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					ComponentService service = (ComponentService) object;
					EList<ServiceLink> serviceLink = service.getServiceLink();
					Composite composite = (Composite) service.eContainer().eContainer();
					composite.getServiceLinks().removeAll(serviceLink);
					return super.remove(object);
				}

			};
		}
		return componentServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Modify adding, to not have
	 * doubles
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<ComponentProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ComponentProperty>(ComponentProperty.class, this,
					EDTProjectPackage.COMPONENT__PROPERTIES) {
				@Override
				public void addUnique(ComponentProperty object) {
					for (ComponentProperty componentProperty : properties) {
						if (!Objects.equals(componentProperty, object)
								&& object.getComponentDefinitionProperty() != null
								&& componentProperty.getComponentDefinitionProperty() != null
								&& (Objects.equals(componentProperty.getComponentDefinitionProperty(),
										object.getComponentDefinitionProperty()))) {
							if (object.getFile() != null && !object.getFile().isBlank()) {
								componentProperty.setFile(object.getFile());
							}

							if (object.getSource() != null && !object.getSource().isBlank()) {
								componentProperty.setSource(object.getSource());
							}

							if (object.getValue() != null && !object.getValue().isBlank()) {
								componentProperty.setValue(object.getValue());
							}
							return;
						}
					}
					super.addUnique(object);
				}

			};
		}
		return properties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ComponentImplementation getComponentImplementation() {
		if (componentImplementation != null && componentImplementation.eIsProxy()) {
			InternalEObject oldComponentImplementation = (InternalEObject) componentImplementation;
			componentImplementation = (ComponentImplementation) eResolveProxy(oldComponentImplementation);
			if (componentImplementation != oldComponentImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION, oldComponentImplementation,
							componentImplementation));
			}
		}
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentImplementation basicGetComponentImplementation() {
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentImplementation(ComponentImplementation newComponentImplementation) {
		ComponentImplementation oldComponentImplementation = componentImplementation;
		componentImplementation = newComponentImplementation;
		EList<EObject> findDeployedModuleAndTriggerInstance = findComponentLogOrDeployedModuleOrTriggerInstance();
		boolean modificationOccured = false;
		for (EObject eObject : findDeployedModuleAndTriggerInstance) {
			if (eObject instanceof DeployedModuleInstance deployedModule) {
				if (deployedModule.getComponentImplementation() != null
						&& deployedModule.getComponentImplementation() != newComponentImplementation) {
					modificationOccured = true;
				}
				deployedModule.setComponentImplementation(newComponentImplementation);
			} else if (eObject instanceof DeployedTriggerInstance deployedTrigger) {
				if (deployedTrigger.getComponentImplementation() != null
						&& deployedTrigger.getComponentImplementation() != newComponentImplementation) {
					modificationOccured = true;
				}
				deployedTrigger.setComponentImplementation(newComponentImplementation);
			} else if (eObject instanceof ComponentLog componentLog) {
				if (componentLog.getComponentImplementation() != null
						&& componentLog.getComponentImplementation() != newComponentImplementation) {
					modificationOccured = true;
				}
				componentLog.setComponentImplementation(newComponentImplementation);
			}
		}
		if (modificationOccured) {
			EDTLog.displayPopUp(
					"Warning : The modification of Component Implementation had impacts on other elements, see console for more details.");
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION,
					oldComponentImplementation, componentImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getComponentDefinitionVersion() {
		return componentDefinitionVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setComponentDefinitionVersion(String newComponentDefinitionVersion) {
		String oldComponentDefinitionVersion = componentDefinitionVersion;
		componentDefinitionVersion = newComponentDefinitionVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION, oldComponentDefinitionVersion,
					componentDefinitionVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
			return ((InternalEList<?>) getComponentReferences()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
			return ((InternalEList<?>) getComponentServices()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION:
			if (resolve)
				return getComponentDefinition();
			return basicGetComponentDefinition();
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
			return getComponentReferences();
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
			return getComponentServices();
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			return getProperties();
		case EDTProjectPackage.COMPONENT__NAME:
			return getName();
		case EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION:
			if (resolve)
				return getComponentImplementation();
			return basicGetComponentImplementation();
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION:
			return getComponentDefinitionVersion();
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
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION:
			setComponentDefinition((ComponentDefinition) newValue);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
			getComponentReferences().clear();
			getComponentReferences().addAll((Collection<? extends ComponentReference>) newValue);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
			getComponentServices().clear();
			getComponentServices().addAll((Collection<? extends ComponentService>) newValue);
			return;
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends ComponentProperty>) newValue);
			return;
		case EDTProjectPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) newValue);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION:
			setComponentDefinitionVersion((String) newValue);
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
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION:
			setComponentDefinition((ComponentDefinition) null);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
			getComponentReferences().clear();
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
			getComponentServices().clear();
			return;
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			getProperties().clear();
			return;
		case EDTProjectPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION:
			setComponentImplementation((ComponentImplementation) null);
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION:
			setComponentDefinitionVersion(COMPONENT_DEFINITION_VERSION_EDEFAULT);
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
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION:
			return componentDefinition != null;
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
			return componentReferences != null && !componentReferences.isEmpty();
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
			return componentServices != null && !componentServices.isEmpty();
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case EDTProjectPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTProjectPackage.COMPONENT__COMPONENT_IMPLEMENTATION:
			return componentImplementation != null;
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION:
			return COMPONENT_DEFINITION_VERSION_EDEFAULT == null ? componentDefinitionVersion != null
					: !COMPONENT_DEFINITION_VERSION_EDEFAULT.equals(componentDefinitionVersion);
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
		result.append(", ComponentDefinitionVersion: ");
		result.append(componentDefinitionVersion);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find all derivedReference associated to the ComponentDefinitionReference
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<EObject> findComponentLogOrDeployedModuleOrTriggerInstance() {
		EList<EObject> deployedAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof DeployedModuleInstance
						|| crossReference.getEObject() instanceof DeployedTriggerInstance
						|| crossReference.getEObject() instanceof ComponentLog) {
					deployedAssociated.add(crossReference.getEObject());
				}
			}
		}
		return deployedAssociated;
	}

} // ComponentImpl
