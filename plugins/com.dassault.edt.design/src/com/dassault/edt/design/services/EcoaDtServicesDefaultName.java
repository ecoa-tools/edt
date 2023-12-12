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

import edtimplementation.ComponentImplementation;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.Composite;
import edtproject.Property;
import edtqos.ServiceInstanceQos;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDefaultName {

	/**
	 * Count the amount of Components contained in a Composite.
	 *
	 * @param composite - Composite containing the Components
	 * @return the amount of Components contained in the Composite
	 */
	public String countComponent(Composite composite) {
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Component" + composite.getComponents().size(),
				composite.getComponents().toArray(new Component[0]), composite.getComponents().size());
	}

	/**
	 * Count the amount of Components contained in a Composite.
	 *
	 * @param component - active Component
	 * @return the amount of Components contained in the Composite
	 */
	public String countComponent(Component component) {
		Composite composite = ((Composite) component.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Component" + composite.getComponents().size(),
				composite.getComponents().toArray(new Component[0]), composite.getComponents().size());
	}

	/**
	 * Count the amount of Property contained in a ComponentDefinition or Composite.
	 *
	 * @param property - active Property
	 * @return the amount of Properties contained in the ComponentDefinition or
	 *         Composite
	 */
	public String countComponentDefinitionOrCompositeProperties(Property property) {
		EList<Property> properties = new BasicEList<>();
		if (property.eContainer() instanceof ComponentDefinition cptDef) {
			properties = cptDef.getProperties();
			return EcoaDtServicesDefaultName.checkNameWhenCreate("Property" + properties.size(),
					cptDef.getProperties().toArray(new Property[0]), properties.size());
		} else if (property.eContainer() instanceof Composite composite) {
			properties = composite.getProperties();
			return EcoaDtServicesDefaultName.checkNameWhenCreate("Property" + properties.size(),
					composite.getProperties().toArray(new Property[0]), properties.size());
		}
		return "";
	}

	/**
	 * Count the amount of ServiceQos for a ComponentDefinition.
	 *
	 * @param serviceInstanceQos - active ServiceInstanceQos
	 * @return the amount of ServiceInstanceQos contained in the ComponentDefinition
	 */
	public String countServiceQoS(ServiceInstanceQos serviceInstanceQos) {
		int size = 0;
		if (serviceInstanceQos.eContainer() instanceof ComponentDefinition componentDefinition) {
			size = componentDefinition.getAssociatedServiceQos().size();
			return EcoaDtServicesDefaultName.checkNameWhenCreate("S" + size,
					componentDefinition.getAssociatedServiceQos().toArray(new ServiceInstanceQos[0]), size);
		} else if (serviceInstanceQos.eContainer() instanceof ComponentImplementation componentImplementation) {
			size = componentImplementation.getAssociatedServiceQos().size();
			return EcoaDtServicesDefaultName.checkNameWhenCreate("S" + size,
					componentImplementation.getAssociatedServiceQos().toArray(new ServiceInstanceQos[0]), size);
		}
		return "";
	}

	/**
	 * Check if new default name does not already exists, if it does increment the
	 * index
	 * 
	 * @param name    : name to test
	 * @param objects : list of objects containing the new created
	 * @param i       : current index
	 * @return unique name
	 */
	public static String checkNameWhenCreate(String name, EObject[] objects, int i) {
		for (int j = 0; j < objects.length; j++) {
			String objectName = EcoaDtServicesUtils.getObjectName(objects[j]);
			if (Objects.equals(name, objectName)) {
				return checkNameWhenCreate(name.replaceAll("" + i, "" + (i + 1)), objects, (i + 1));
			}
		}
		return name;
	}
}
