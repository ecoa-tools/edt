/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;

import com.dassault.edt.xmlimport.FailedImportException;

import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.EDTProjectFactory;
import edtproject.Step0;
import edtproject.Step1;
import edtqos.ServiceInstanceQos;

/**
 * Convert imported ECOA ComponentDefinition objects to EDT objects
 *
 */
public class ComponentDefinitionImportConverter {
	private static final EDTProjectFactory EDTFACTORY = EDTProjectFactory.eINSTANCE;

	private ComponentDefinitionImportConverter() {

	}

	/**
	 * Create EDT ComponentDefinition from Ecoa ComponentDefinition
	 * 
	 * @param ecoaComponentDefinition : XML ComponentDefinition
	 * @param fileName                : name of file, that corresponds to
	 *                                ComponentDefinition name
	 * @param typeStep                : Libraries + BasicType
	 * @param missingElementsToLog    : log for elements that are not usable in EDT
	 * @param edtServiceQosList       : list of QoS
	 * @param step1                   : list of ServiceDefinition
	 * @return edtComponentDefinition
	 * @throws FailedImportException if Library or Type or ServiceDefinition not
	 *                               found
	 */
	public static edtproject.ComponentDefinition createEDTComponentDefinition(ComponentType ecoaComponentDefinition,
			String fileName, Step0 typeStep, List<edtqos.ServiceInstanceQos> edtServiceQosList, Step1 step1,
			StringBuilder missingElementsToLog) throws FailedImportException {
		// Create empty EDTComponentDefinition
		edtproject.ComponentDefinition edtComponentDefinition = EDTFACTORY.createComponentDefinition();

		// Add QoS
		edtComponentDefinition.getAssociatedServiceQos().addAll(edtServiceQosList);

		// Fill EDTComponentDefinition from Ecoa ComponentDefinition
		String name = EDTProjectImportConverter.getObjectName(fileName, ".componentType");
		edtComponentDefinition.setName(name);

		EList<Property> ecoaProperties = ecoaComponentDefinition.getProperty();
		for (Property ecoaProperty : ecoaProperties) {
			edtComponentDefinition.getProperties()
					.add(EDTProjectImportConverter.createEDTProperty(ecoaProperty, typeStep, missingElementsToLog));
		}

		EList<ComponentTypeReference> ecoaComponentTypeReferences = ecoaComponentDefinition.getReference();
		for (ComponentTypeReference ecoaComponentTypeReference : ecoaComponentTypeReferences) {
			edtComponentDefinition.getReferences()
					.add(createEDTComponentDefinitionReference(step1, ecoaComponentTypeReference, edtServiceQosList));
		}

		EList<ServiceType> ecoaComponentTypeServices = ecoaComponentDefinition.getService();
		for (ServiceType ecoaComponentTypeService : ecoaComponentTypeServices) {
			edtComponentDefinition.getServices()
					.add(createEDTComponentDefinitionService(step1, ecoaComponentTypeService, edtServiceQosList));
		}

		return edtComponentDefinition;
	}

	/**
	 * Create a EDT model ComponentDefinitionService from a Ecoa model
	 * ComponentDefinitionService
	 * 
	 * @param edtServiceDefinitionList
	 * @param componentTypeService
	 * @param edtServiceQosList
	 * @return edtCompositeService
	 * @throws FailedImportException if no ServiceDefinition found
	 */
	private static ComponentDefinitionService createEDTComponentDefinitionService(Step1 step1,
			ServiceType componentTypeService, List<ServiceInstanceQos> edtServiceQosList) throws FailedImportException {
		// Create empty EDT ComponentDefinitionService
		ComponentDefinitionService edtComponentDefinitionService = EDTFACTORY.createComponentDefinitionService();

		// Fill EDTComponentDefinitionService from
		// EcoaComponentDefinitionService
		EDTProjectImportConverter.createEDTInterface(edtComponentDefinitionService, componentTypeService.getInterface(),
				edtServiceQosList, step1);

		edtComponentDefinitionService.setName(componentTypeService.getName());

		return edtComponentDefinitionService;
	}

	/**
	 * Create a EDT model ComponentDefinitionReference from a Ecoa model
	 * ComponentDefinitionReference
	 * 
	 * @param edtServiceDefinitionList
	 * @param edtComposite
	 * @param componentTypeReference
	 * @param edtServiceQosList
	 * @return edtCompositeReference
	 * @throws FailedImportException if no ServiceDefinition found
	 */
	private static ComponentDefinitionReference createEDTComponentDefinitionReference(Step1 step1,
			ComponentTypeReference componentTypeReference, List<ServiceInstanceQos> edtServiceQosList)
			throws FailedImportException {

		// Create empty EDT ComponentDefinitionReference
		ComponentDefinitionReference edtComponentDefinitionReference = EDTFACTORY.createComponentDefinitionReference();

		// Fill EDTComponentDefinitionReference from
		// EcoaComponentDefinitionReference
		EDTProjectImportConverter.createEDTInterface(edtComponentDefinitionReference,
				componentTypeReference.getInterface(), edtServiceQosList, step1);

		edtComponentDefinitionReference.setMultiplicity(componentTypeReference.getMultiplicity());
		edtComponentDefinitionReference.setName(componentTypeReference.getName());

		return edtComponentDefinitionReference;
	}

}
