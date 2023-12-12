/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;
import org.open.oasis.docs.ns.opencsa.sca.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService;
import org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot;
import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;
import org.open.oasis.docs.ns.opencsa.sca.sca.Reference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.sca.Wire;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

import edtproject.ComponentProperty;
import edtproject.CompositeReference;
import edtproject.CompositeService;
import edtproject.ServiceLink;
import technology.ecoa.sca.extension.scaExt.ImplementationType;
import technology.ecoa.sca.extension.scaExt.Interface;
import technology.ecoa.sca.extension.scaExt.scaExtPackage;

/**
 * Convert assembly to initial or final Assembly
 * 
 */
public class AssemblyExportConverter {
	private static final scaFactory SCAFACTORY = scaFactory.eINSTANCE;

	private AssemblyExportConverter() {

	}

	/**
	 * Convert EDT Composite to ECOA Composite
	 * 
	 * @param edtComposite    : EDT Composite to convert
	 * @param isFinalAssembly : true if finalAssembly and not initial
	 * @param name            : name of Composite
	 * @return ecoaComposite
	 */
	public static DocumentRoot recreateComposite(edtproject.Composite edtComposite, boolean isFinalAssembly,
			String name) {
//		Create empty Ecoa Composite
		var ecoaComposite = SCAFACTORY.createComposite();

//		Fill ecoa Composite from EDT Composite
		ecoaComposite.setName(name);
		ecoaComposite.setTargetNamespace(edtComposite.getTargetNamespace());

//		Create ECOA CompositeReference
		EList<CompositeReference> edtReferences = edtComposite.getReferences();
		for (CompositeReference edtCompositeReference : edtReferences) {
			ecoaComposite.getReference().add(recreateCompositeReference(edtCompositeReference));
		}

//		Create ECOA CompositeService
		EList<CompositeService> edtServices = edtComposite.getServices();
		for (CompositeService edtCompositeService : edtServices) {
			ecoaComposite.getService().add(recreateCompositeService(edtCompositeService));
		}

//		Create ECOA CompositeProperty
		EList<edtproject.Property> edtProperties = edtComposite.getProperties();
		for (edtproject.Property edtProperty : edtProperties) {
			ecoaComposite.getProperty().add(EDTProjectExportConverter.recreateProperty(edtProperty));
		}

//		Create ECOA Component and get Wire
		EList<edtproject.Component> edtComponents = edtComposite.getComponents();
		for (edtproject.Component edtComponent : edtComponents) {
			ecoaComposite.getComponent().add(recreateComponent(edtComponent, isFinalAssembly));
		}

//		Recreate Wire
		EList<ServiceLink> edtServiceLinks = edtComposite.getServiceLinks();
		for (ServiceLink edtServiceLink : edtServiceLinks) {
			ecoaComposite.getWire().add(recreateWire(edtServiceLink));
		}

//		Create DocumentRoot to add Composite
		var documentRoot = SCAFACTORY.createDocumentRoot();
		documentRoot.setComposite(ecoaComposite);

		return documentRoot;
	}

	/**
	 * Convert EDT Links to Ecoa Wire
	 * 
	 * @param entry of Hashmap with the key being the ComponentReference name and
	 *              the target the ComponentService name
	 * @return ecoa Wire
	 */
	private static Wire recreateWire(ServiceLink edtServiceLink) {
//		Create empty Ecoa Wire
		Wire ecoaWire = SCAFACTORY.createWire();

		if (edtServiceLink.getSource() != null) {
			ecoaWire.setSource(edtServiceLink.getSource().getWireString());
		}

		if (edtServiceLink.getTarget() != null) {
			ecoaWire.setTarget(edtServiceLink.getTarget().getWireString());
		}

		return ecoaWire;
	}

	/**
	 * Convert EDT CompositeService to ECOA CompositeService
	 * 
	 * @param edtCompositeService
	 * @return ecoaCompositeService
	 */
	private static Service recreateCompositeService(CompositeService edtCompositeService) {
//		Create empty ECOA Composite Service
		Service ecoaCompositeService = SCAFACTORY.createService();

//		Fill ECOA Service with EDT attributes
		Interface ecoaInterface = EDTProjectExportConverter.recreateInterface(edtCompositeService);
		ecoaCompositeService.setInterface(ecoaInterface);
		ecoaCompositeService.setName(edtCompositeService.getName());
		ecoaCompositeService.setPromote(edtCompositeService.getPromote());

		return ecoaCompositeService;
	}

	/**
	 * Convert EDT CompositeReference to ECOA CompositeReference
	 * 
	 * @param edtCompositeReference
	 * @return ecoaCompositeReference
	 */
	private static Reference recreateCompositeReference(CompositeReference edtCompositeReference) {
//		Create empty ECOA Composite Reference
		Reference ecoaCompositeReference = SCAFACTORY.createReference();

//		Fill ECOA Reference with EDT attributes
		Interface ecoaInterface = EDTProjectExportConverter.recreateInterface(edtCompositeReference);
		ecoaCompositeReference.setInterface(ecoaInterface);
		ecoaCompositeReference.setName(edtCompositeReference.getName());
		ecoaCompositeReference.setMultiplicity(edtCompositeReference.getMultiplicity());
		ecoaCompositeReference.setPromote(edtCompositeReference.getPromote());

		return ecoaCompositeReference;
	}

	/**
	 * Convert EDT Component to Ecoa Component
	 * 
	 * @param edtComponent
	 * @param finalAssembly
	 * @return ecoaComponent
	 */
	private static Component recreateComponent(edtproject.Component edtComponent, boolean finalAssembly) {
//		Create Empty ECOA Component
		var ecoaComponent = SCAFACTORY.createComponent();

		ecoaComponent.setName(edtComponent.getName());
//		Recreate ComponentProperty
		EList<ComponentProperty> edtProperties = edtComponent.getProperties();
		for (ComponentProperty edtProperty : edtProperties) {
			ecoaComponent.getProperty().add(recreatePropertyValue(edtProperty));
		}

//		Recreate ComponentReference
		EList<edtproject.ComponentReference> edtComponentReferences = edtComponent.getComponentReferences();
		for (edtproject.ComponentReference edtComponentReference : edtComponentReferences) {
			ecoaComponent.getReference().add(recreateComponentReference(edtComponentReference));
		}

//		Recreate ComponentService
		EList<edtproject.ComponentService> edtComponentServices = edtComponent.getComponentServices();
		for (edtproject.ComponentService edtComponentService : edtComponentServices) {
			ecoaComponent.getService().add(recreateComponentService(edtComponentService));
		}

//		ReCreate ECOA instance with ComponentDefinition Link
		var ecoaInstance = technology.ecoa.sca.extension.scaExt.scaExtFactory.eINSTANCE.createInstance();
		if (edtComponent.getComponentDefinition() != null) {
			ecoaInstance.setComponentType(edtComponent.getComponentDefinition().getName());
		}
		if (finalAssembly && edtComponent.getComponentImplementation() != null) {
			ImplementationType implementationType = technology.ecoa.sca.extension.scaExt.scaExtFactory.eINSTANCE
					.createImplementationType();
			implementationType.setName(edtComponent.getComponentImplementation().getName());
			ecoaInstance.setImplementation(implementationType);
		}
		ecoaInstance.setVersion(edtComponent.getComponentDefinitionVersion());
		ecoaComponent.getImplementationGroup().add(scaExtPackage.Literals.DOCUMENT_ROOT__INSTANCE, ecoaInstance);

		return ecoaComponent;
	}

	/**
	 * Convert EDT ComponentService to ECOA ComponentService
	 * 
	 * @param edtComponentService
	 * @return ecoaComponentService
	 */
	private static ComponentService recreateComponentService(edtproject.ComponentService edtComponentService) {
		ComponentService ecoaComponentService = SCAFACTORY.createComponentService();
		if (edtComponentService.getComponentDefinitionService() != null) {
			ecoaComponentService.setName(edtComponentService.getComponentDefinitionService().getName());
		}
		return ecoaComponentService;
	}

	/**
	 * Convert EDT ComponentReference to ECOA ComponentReference
	 * 
	 * @param edtComponentReference
	 * @param edtComponent
	 * @return ecoaComponentReference
	 */
	private static ComponentReference recreateComponentReference(edtproject.ComponentReference edtComponentReference) {
//		Create empty ECOA ComponentReference
		ComponentReference ecoaComponentReference = SCAFACTORY.createComponentReference();

//		Fill ECOA ComponentReference with EDT attributes
		if (edtComponentReference.isSetMultiplicity()) {
			ecoaComponentReference.setMultiplicity(edtComponentReference.getMultiplicity());
		}

		if (edtComponentReference.getComponentDefinitionReference() != null) {
			ecoaComponentReference.setName(edtComponentReference.getComponentDefinitionReference().getName());
		}

		return ecoaComponentReference;
	}

	/**
	 * Convert EDT PropertyValue to ECOA PropertyValue
	 * 
	 * @param edtProperty
	 * @return ecoaProperty
	 */
	private static PropertyValue recreatePropertyValue(edtproject.ComponentProperty edtProperty) {
//		Create empty PropertyValue
		PropertyValue ecoaProperty = SCAFACTORY.createPropertyValue();

//		Fill ECOA PropertyValue with EDT attributes
		if (edtProperty.getFile() != null && !edtProperty.getFile().isBlank()) {
			ecoaProperty.setFile(edtProperty.getFile());
		}
		if (edtProperty.getSource() != null && !edtProperty.getSource().isBlank()) {
			ecoaProperty.setSource(edtProperty.getSource());
		}
		ecoaProperty.setName(edtProperty.getComponentDefinitionProperty().getName());

//		Recreate Value
		if (edtProperty.getValue() != null && !edtProperty.getValue().isBlank()) {
			ecoaProperty.getAny().add(scaPackage.Literals.DOCUMENT_ROOT__VALUE,
					EDTProjectExportConverter.recreateValueType(edtProperty.getValue()));
		}

		return ecoaProperty;
	}
}
