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

import com.dassault.edt.log.EDTLog;

import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.Composite;
import edtproject.Contract;
import edtproject.EDTProjectFactory;
import edtproject.Property;
import edtproject.Step2;
import edtqos.EdtqosFactory;
import edtqos.ServiceInstanceQos;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopyStep2 {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Creates copy of Properties of ComponentDefinition
	 * 
	 * @param componentDefinitionToCopy : element copied
	 * @return list of copies
	 */
	public EList<Property> copyComponentDefinitionProperties(ComponentDefinition componentDefinitionToCopy) {
		EList<Property> propertiesToCopy = componentDefinitionToCopy.getProperties();
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
	 *
	 * Creates copy of References of ComponentDefinition
	 * 
	 * @param componentDefinitionToCopy : element copied
	 * @return list of copies
	 */
	public EList<ComponentDefinitionReference> copyComponentDefinitionReferences(
			ComponentDefinition componentDefinitionToCopy) {
		EList<ComponentDefinitionReference> referencesToCopy = componentDefinitionToCopy.getReferences();
		EList<ComponentDefinitionReference> copiedEList = new BasicEList<>();
		ComponentDefinitionReference copied;
		for (ComponentDefinitionReference ref : referencesToCopy) {
			copied = EDTProjectFactory.eINSTANCE.createComponentDefinitionReference();
			copied.setName(ref.getName());
			if (ref.isSetMultiplicity()) {
				copied.setMultiplicity(ref.getMultiplicity());
			}
			copied.setSyntax(ref.getSyntax());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Services of ComponentDefinition
	 * 
	 * @param componentDefinitionToCopy : element copied
	 * @return list of copies
	 */
	public EList<ComponentDefinitionService> copyComponentDefinitionServices(
			ComponentDefinition componentDefinitionToCopy) {
		EList<ComponentDefinitionService> servicesToCopy = componentDefinitionToCopy.getServices();
		EList<ComponentDefinitionService> copiedEList = new BasicEList<>();
		ComponentDefinitionService copied;
		for (ComponentDefinitionService serv : servicesToCopy) {
			copied = EDTProjectFactory.eINSTANCE.createComponentDefinitionService();
			copied.setName(serv.getName());
			copied.setSyntax(serv.getSyntax());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Associated QoS of ComponentDefinition
	 * 
	 * @param componentDefinitionToCopy : element copied
	 * @param newComponentDefinition    :
	 * 
	 * @return list of copies
	 */
	public EList<ServiceInstanceQos> copyComponentDefinitionAssociatedQoS(ComponentDefinition componentDefinitionToCopy,
			ComponentDefinition newComponentDefinition) {
		EList<ServiceInstanceQos> qosToCopy = componentDefinitionToCopy.getAssociatedServiceQos();
		EList<ServiceInstanceQos> copiedEList = new BasicEList<>();
		ServiceInstanceQos copied;
		for (ServiceInstanceQos qos : qosToCopy) {
			copied = EdtqosFactory.eINSTANCE.createServiceInstanceQos();
			copied.setName(qos.getName());
			copied.getOperations().addAll(EcoaDtServicesCopy.copyQoSOperations(qos));
			copied.setServiceDefinition(qos.getServiceDefinition());
			EList<Contract> interfaceLinks = qos.getInterfaceLink();
			for (Contract interfaceLink : interfaceLinks) {
				if (interfaceLink instanceof ComponentDefinitionReference ref) {
					copied.getInterfaceLink().add(findCopiedComponentDefinitionReference(
							newComponentDefinition.getReferences(), ref.getName()));
				} else if (interfaceLink instanceof ComponentDefinitionService serv) {
					copied.getInterfaceLink().add(
							findCopiedComponentDefinitionService(newComponentDefinition.getServices(), serv.getName()));
				}
			}
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Search in copied ComponentDefinitionReferences to recreate link with QoS
	 * 
	 * @param refList : list of copied ComponentDefinitionReference
	 * @param name    : name of ComponentDefinitionReference to find
	 * @return copied ComponentDefinitionReference with the correct name
	 */
	public ComponentDefinitionReference findCopiedComponentDefinitionReference(
			EList<ComponentDefinitionReference> refList, String name) {
		for (ComponentDefinitionReference componentDefinitionReference : refList) {
			if (Objects.equals(componentDefinitionReference.getName(), name)) {
				return componentDefinitionReference;
			}
		}
		EDTLog.toConsole("There was a problem with recreating the ComponentDefinitionReference interface.");
		return null;
	}

	/**
	 * Search in copied ComponentDefinitionServices to recreate link with QoS
	 * 
	 * @param servList : list of copied ComponentDefinitionService
	 * @param name     : name of ComponentDefinitionService to find
	 * @return copied ComponentDefinitionService with the correct name
	 */
	public ComponentDefinitionService findCopiedComponentDefinitionService(EList<ComponentDefinitionService> servList,
			String name) {
		for (ComponentDefinitionService componentDefinitionService : servList) {
			if (Objects.equals(componentDefinitionService.getName(), name)) {
				return componentDefinitionService;
			}
		}
		EDTLog.toConsole("There was a problem with recreating the ComponentDefinitionReference interface.");
		return null;
	}

	/**
	 * Set name of a component definition when performing a "Create Copy Of"
	 * 
	 * @param componentDefinition : The component definition that must receive a
	 *                            name
	 * @return the new component definition name
	 */

	public String setNameToCopyOfComponentDefinition(ComponentDefinition componentDefinition) {
		Step2 step2 = ((Step2) componentDefinition.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + componentDefinition.getName(),
				step2.getComponentDefinitions().toArray(new ComponentDefinition[0]), 0);
	}

	/**
	 * Set name of a component definition service when performing a "Create Copy Of"
	 * 
	 * @param componentDefinitionService : The component definition service that
	 *                                   must receive a name
	 * @return the new component definition service name
	 */

	public String setNameToCopyOfComponentDefinitionService(ComponentDefinitionService componentDefinitionService) {
		ComponentDefinition componentDefinition = ((ComponentDefinition) componentDefinitionService.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + componentDefinitionService.getName(),
				componentDefinition.getServices().toArray(new ComponentDefinitionService[0]), 0);
	}

	/**
	 * Set name of a component definition reference when performing a "Create Copy
	 * Of"
	 * 
	 * @param componentDefinitionReference : The component definition reference that
	 *                                     must receive a name
	 * @return the new component definition reference name
	 */

	public String setNameToCopyOfComponentDefinitionReference(
			ComponentDefinitionReference componentDefinitionReference) {
		ComponentDefinition componentDefinition = ((ComponentDefinition) componentDefinitionReference.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + componentDefinitionReference.getName(),
				componentDefinition.getServices().toArray(new ComponentDefinitionReference[0]), 0);
	}

	/**
	 * Set name of a component definition or composite property when performing a
	 * "Create Copy Of"
	 * 
	 * @param property : The component definition or composite property that must
	 *                 receive a name
	 * @return the new component definition or composite property name
	 */

	public String setNameToCopyOfComponentDefinitionOrCompositeProperties(Property property) {
		EList<Property> properties = new BasicEList<>();
		if (property.eContainer() instanceof ComponentDefinition cptDef) {
			properties = cptDef.getProperties();
			return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + property.getName(),
					cptDef.getProperties().toArray(new Property[0]), properties.size());
		} else if (property.eContainer() instanceof Composite composite) {
			properties = composite.getProperties();
			return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + property.getName(),
					composite.getProperties().toArray(new Property[0]), properties.size());
		}
		return "";
	}

}
