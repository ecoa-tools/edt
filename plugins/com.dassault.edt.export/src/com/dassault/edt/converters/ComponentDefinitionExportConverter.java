/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;

import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentDefinitionExportConverter {
	private static final scaFactory SCAFACTORY = scaFactory.eINSTANCE;

	private ComponentDefinitionExportConverter() {

	}

	/**
	 * Convert EDT ComponentDefinition to ECOA ComponentDefinition
	 * 
	 * @param edtComponentDefinition : object to convert to ECOA
	 * @return ecoaComponentDefinition
	 */
	public static org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot recreateComponentType(
			ComponentDefinition edtComponentDefinition) {
//		Create empty ECOA ComponentDefinition
		ComponentType ecoaComponentDefinition = SCAFACTORY.createComponentType();

//		Recreate ECOA Property
		EList<edtproject.Property> edtProperties = edtComponentDefinition.getProperties();
		for (edtproject.Property edtProperty : edtProperties) {
			ecoaComponentDefinition.getProperty().add(EDTProjectExportConverter.recreateProperty(edtProperty));
		}

//		Recreate ECOA ComponentDefinitionReference
		EList<ComponentDefinitionReference> edtReferences = edtComponentDefinition.getReferences();
		for (ComponentDefinitionReference edtComponentTypeReference : edtReferences) {
			ecoaComponentDefinition.getReference().add(recreateComponentDefinitionReference(edtComponentTypeReference));
		}

//		Recreate ECOA ComponentDefinitionService
		EList<ComponentDefinitionService> edtServices = edtComponentDefinition.getServices();
		for (ComponentDefinitionService edtComponentTypeService : edtServices) {
			ecoaComponentDefinition.getService().add(recreateComponentDefinitionService(edtComponentTypeService));
		}

//		Create DocumentRoot to add ComponentDefinition
		org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot documentRoot = SCAFACTORY.createDocumentRoot();
		documentRoot.setComponentType(ecoaComponentDefinition);

		return documentRoot;
	}

	private static ServiceType recreateComponentDefinitionService(ComponentDefinitionService edtComponentTypeService) {
//		Create empty ECOA ComponentDefinitionService
		ServiceType componentTypeService = SCAFACTORY.createServiceType();

		componentTypeService.setInterface(EDTProjectExportConverter.recreateInterface(edtComponentTypeService));
		componentTypeService.setName(edtComponentTypeService.getName());

		return componentTypeService;
	}

	private static ComponentTypeReference recreateComponentDefinitionReference(
			ComponentDefinitionReference edtComponentTypeReference) {
//		Create empty ECOA ComponentDefinitionReference
		ComponentTypeReference componentTypeReference = SCAFACTORY.createComponentTypeReference();

		componentTypeReference.setInterface(EDTProjectExportConverter.recreateInterface(edtComponentTypeReference));
		componentTypeReference.setName(edtComponentTypeReference.getName());

		return componentTypeReference;
	}

}
