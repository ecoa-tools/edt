/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Objects;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.ComponentImplementation;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.ComponentProperty;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.EDTProjectFactory;
import edtproject.Property;
import edtqos.Operation;
import edtqos.ServiceInstanceQos;
import technology.ecoa.interface_.qos._2.ServiceInstanceQoS;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopy {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Creates copy of Operation of QoS
	 * 
	 * @param qosToCopy : element copied
	 * @return list of copies
	 */
	public static EList<Operation> copyQoSOperations(ServiceInstanceQos qosToCopy) {
		EList<Operation> dataTypesToCopy = qosToCopy.getOperations();
		EList<Operation> copiedEList = new BasicEList<>();
		copiedEList.addAll(EcoreUtil.copyAll(dataTypesToCopy));
		return copiedEList;
	}

	/**
	 * Create Copy of Component and creates name
	 * 
	 * @param newComponent  : component created
	 * @param copiedElement : component copied
	 * @return copied Component
	 */
	public String copyComponentAndRename(Component newComponent, Component copiedElement) {
		Composite composite = ((Composite) newComponent.eContainer());
		newComponent.setComponentDefinition(copiedElement.getComponentDefinition());
		newComponent.setComponentDefinitionVersion(copiedElement.getComponentDefinitionVersion());
		newComponent.setComponentImplementation(copiedElement.getComponentImplementation());
		EList<ComponentReference> componentReferences = copiedElement.getComponentReferences();
		for (ComponentReference componentReference : componentReferences) {
			newComponent.getComponentReferences().add(copyComponentReference(componentReference));
		}

		EList<ComponentService> componentServices = copiedElement.getComponentServices();
		for (ComponentService componentService : componentServices) {
			newComponent.getComponentServices().add(copyComponentService(componentService));
		}

		EList<ComponentProperty> componentProperties = copiedElement.getProperties();
		for (ComponentProperty componentProperty : componentProperties) {
			newComponent.getProperties().add(copyComponentProperty(componentProperty));
		}
		return checkNameWhenCopy(COPY_OF + copiedElement.getName(), composite.getComponents().toArray(new Component[0]),
				0);
	}

	/**
	 *
	 * Creates copy of References of Component
	 * 
	 * @param componentReferenceToCopy : element copied
	 * @return list of copies
	 */
	public ComponentReference copyComponentReference(ComponentReference componentReferenceToCopy) {
		ComponentReference copied;
		copied = EDTProjectFactory.eINSTANCE.createComponentReference();
		copied.setName(componentReferenceToCopy.getName());
		if (componentReferenceToCopy.isSetMultiplicity()) {
			copied.setMultiplicity(componentReferenceToCopy.getMultiplicity());
		}
		copied.setComponentDefinitionReference(componentReferenceToCopy.getComponentDefinitionReference());
		return copied;
	}

	/**
	 * Creates copy of Services of Component
	 * 
	 * @param componentServiceToCopy : element copied
	 * @return list of copies
	 */
	public ComponentService copyComponentService(ComponentService componentServiceToCopy) {
		ComponentService copied;
		copied = EDTProjectFactory.eINSTANCE.createComponentService();
		copied.setComponentDefinitionService(componentServiceToCopy.getComponentDefinitionService());
		copied.setName(componentServiceToCopy.getName());
		return copied;
	}

	/**
	 * Creates copy of Properties of Component
	 * 
	 * @param componentPropertyToCopy : element copied
	 * @return list of copies
	 */
	public ComponentProperty copyComponentProperty(ComponentProperty componentPropertyToCopy) {
		ComponentProperty copied;
		copied = EDTProjectFactory.eINSTANCE.createComponentProperty();
		copied.setName(componentPropertyToCopy.getName());
		copied.setValue(componentPropertyToCopy.getValue());
		copied.setFile(componentPropertyToCopy.getFile());
		copied.setSource(componentPropertyToCopy.getSource());
		copied.setComponentDefinitionProperty(componentPropertyToCopy.getComponentDefinitionProperty());
		return copied;
	}

	/**
	 * Creates copy of Properties of ComponentDefinition
	 * 
	 * @param compositeToCopy : element copied
	 * @return list of copies
	 */
	public EList<Property> copyCompositeProperties(Composite compositeToCopy) {
		EList<Property> propertiesToCopy = compositeToCopy.getProperties();
		EList<Property> copiedEList = new BasicEList<>();
		Property copied;
		for (Property property : propertiesToCopy) {
			copied = EDTProjectFactory.eINSTANCE.createProperty();
			copied.setName(property.getName());
			copied.setECOASCALibrary(property.getECOASCALibrary());
			copied.setECOASCAType(property.getECOASCAType());
			if (property.isSetMustSupply()) {
				copied.setMustSupply(property.isMustSupply());
			}
			copied.setType(property.getType());
			copied.setValue(property.getValue());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Set name of a service QoS when performing a "Create Copy Of"
	 * 
	 * @param serviceInstanceQos : The service QoS that must receive a name
	 * @return the new service QoS name
	 */

	public String setNameToCopyOfServiceQoS(ServiceInstanceQoS serviceInstanceQos) {
		int size = 0;
		if (serviceInstanceQos.eContainer() instanceof ComponentDefinition componentDefinition) {
			size = componentDefinition.getAssociatedServiceQos().size();
			return checkNameWhenCopy(COPY_OF + EcoaDtServicesUtils.getObjectName(serviceInstanceQos),
					componentDefinition.getAssociatedServiceQos().toArray(new ServiceInstanceQos[0]), size);
		} else if (serviceInstanceQos.eContainer() instanceof ComponentImplementation componentImplementation) {
			size = componentImplementation.getAssociatedServiceQos().size();
			return checkNameWhenCopy(COPY_OF + EcoaDtServicesUtils.getObjectName(serviceInstanceQos),
					componentImplementation.getAssociatedServiceQos().toArray(new ServiceInstanceQos[0]), size);
		}
		return "";
	}

	/**
	 * Set name of a component when performing a "Create Copy Of"
	 * 
	 * @param component : The component that must receive a name
	 * @return the new component name
	 */

	public String setNameToCopyOfComponent(Component component) {
		Composite composite = ((Composite) component.eContainer());
		return checkNameWhenCopy(COPY_OF + component.getName(), composite.getComponents().toArray(new Component[0]), 0);
	}

	/**
	 * Check if generated name already exist when performing a "Create Copy Of"
	 * 
	 * @param name    : The name to be tested
	 * @param objects : List of objects of the father of the tested object
	 * @param i       : object occurrence
	 * @return the new element name
	 */

	public static String checkNameWhenCopy(String name, EObject[] objects, int i) {
		for (int j = 0; j < objects.length; j++) {
			String objectName = EcoaDtServicesUtils.getObjectName(objects[j]);
			if (Objects.equals(name, objectName)) {
				if (i == 0) {
					return checkNameWhenCopy(name.replaceFirst("Copy", "Copy" + (i + 2)), objects, (i + 1));
				}
				return checkNameWhenCopy(name.replaceFirst("Copy" + i, "Copy" + (i + 1)), objects, (i + 1));
			}
		}
		return name;
	}

}
