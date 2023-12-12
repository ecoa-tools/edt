/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.open.oasis.docs.ns.opencsa.sca.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService;
import org.open.oasis.docs.ns.opencsa.sca.sca.Composite;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;
import org.open.oasis.docs.ns.opencsa.sca.sca.Reference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.sca.Wire;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtproject.ComponentProperty;
import edtproject.CompositeReference;
import edtproject.CompositeService;
import edtproject.EDTProjectFactory;
import edtproject.ServiceLink;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step4;
import technology.ecoa.sca.extension.scaExt.ImplementationType;
import technology.ecoa.sca.extension.scaExt.Instance;

/**
 * Convert imported ECOA InitialAssembly objects to EDT objects
 *
 */
public class AssemblyImportConverter {
	private static final String WAS_NOT_FOUND = " was not found";
	private static final String IN_THE_COMPONENT_DEFINITION = " in the ComponentDefinition ";
	private static final EDTProjectFactory EDTFACTORY = EDTProjectFactory.eINSTANCE;

	private AssemblyImportConverter() {

	}

	/**
	 * Create a EDT model Composite from a ECOA model Composite
	 * 
	 * @param ecoaComposite        : imported ECOA Composite to convert to EDT
	 * @param step2                : list of ComponentDefinition to associate
	 *                             Components
	 * @param typeStep             : Libraries + BasicTypes
	 * @param step1                : list of ServiceDefinition
	 * @param missingElementsToLog : missing elements error message to append
	 * @return edtComposite
	 * @throws FailedImportException if no ComponentDefinition or Type are found
	 *                               corresponding to the names given
	 */
	public static edtproject.Composite createEDTComposite(Composite ecoaComposite, Step2 step2, Step0 typeStep,
			Step1 step1, StringBuilder missingElementsToLog) throws FailedImportException {
		// Create empty EDT Composite
		var edtComposite = EDTFACTORY.createComposite();

		// Fill edtComposite from ecoaComposite
		edtComposite.setName(ecoaComposite.getName());
		edtComposite.setTargetNamespace(ecoaComposite.getTargetNamespace());

		EList<Property> properties = ecoaComposite.getProperty();
		for (Property property : properties) {
			edtComposite.getProperties()
					.add(EDTProjectImportConverter.createEDTProperty(property, typeStep, missingElementsToLog));
		}

		EList<Reference> references = ecoaComposite.getReference();
		for (Reference reference : references) {
			edtComposite.getReferences().add(createCompositeReference(step1, reference));
		}

		EList<Service> services = ecoaComposite.getService();
		for (Service service : services) {
			edtComposite.getServices().add(createCompositeService(step1, service));
		}

		// Create EDTComponents
		EList<Component> ecoaComponents = ecoaComposite.getComponent();

		for (Component ecoaComponent : ecoaComponents) {
			edtComposite.getComponents().add(createEDTComponent(step2, ecoaComponent));
		}

		// Convert Wire to links
		EList<Wire> ecoaWires = ecoaComposite.getWire();
		for (Wire ecoaWire : ecoaWires) {
			String source = ecoaWire.getSource();
			String target = ecoaWire.getTarget();
			edtproject.ComponentReference findComponentReferenceFromWire = edtComposite
					.findComponentReferenceFromWire(source);
			if (findComponentReferenceFromWire == null) {
				throw new FailedImportException("The ComponentReference " + source + WAS_NOT_FOUND);
			}
			edtproject.ComponentService findComponentServiceFromWire = edtComposite
					.findComponentServiceFromWire(target);
			if (findComponentServiceFromWire == null) {
				throw new FailedImportException("The ComponentService " + target + WAS_NOT_FOUND);
			}

			ServiceLink serviceLink = EDTFACTORY.createServiceLink();
			serviceLink.setSource(findComponentReferenceFromWire);
			serviceLink.setTarget(findComponentServiceFromWire);
			edtComposite.getServiceLinks().add(serviceLink);
		}

		return edtComposite;
	}

	/**
	 * Create a EDT model CompositeService from a ECOA model CompositeService
	 * 
	 * @param edtServiceDefinitionList
	 * @param ecoaCompositeService
	 * @return edtCompositeService
	 * @throws FailedImportException if no ServiceDefinition found
	 */
	private static CompositeService createCompositeService(Step1 step1, Service ecoaCompositeService)
			throws FailedImportException {
		// Create empty EDT CompositeService
		CompositeService edtCompositeService = EDTFACTORY.createCompositeService();

		// Fill EDTCompositeService from ECOACompositeService
		if (ecoaCompositeService.getInterface() != null) {
			EDTProjectImportConverter.createEDTInterface(edtCompositeService, ecoaCompositeService.getInterface(), null,
					step1);
		}

		edtCompositeService.setName(ecoaCompositeService.getName());
		edtCompositeService.setPromote(ecoaCompositeService.getPromote());

		return edtCompositeService;
	}

	/**
	 * Create a EDT model CompositeReference from a ECOA model CompositeReference
	 * 
	 * @param edtServiceDefinitionList
	 * @param edtComposite
	 * @param ecoaCompositeReference
	 * @return edtCompositeReference
	 * @throws FailedImportException if no ServiceDefinition found
	 */
	private static CompositeReference createCompositeReference(Step1 step1, Reference ecoaCompositeReference)
			throws FailedImportException {

		// Create empty EDT CompositeReference
		CompositeReference edtCompositeReference = EDTFACTORY.createCompositeReference();

		// Fill EDTCompositeReference from ECOACompositeReference
		if (ecoaCompositeReference.getInterface() != null) {
			EDTProjectImportConverter.createEDTInterface(edtCompositeReference, ecoaCompositeReference.getInterface(),
					null, step1);
		}

		edtCompositeReference.setMultiplicity(ecoaCompositeReference.getMultiplicity());
		edtCompositeReference.setName(ecoaCompositeReference.getName());
		edtCompositeReference.setPromote(ecoaCompositeReference.getPromote());

		return edtCompositeReference;
	}

	/**
	 * Create a EDT model Component from a ECOA model Component
	 * 
	 * @param edtComponentDefinitionList
	 * @param ecoaComponent
	 * @param wireToRefMap               : map of correspondence between potential
	 *                                   name in Wire and EDTComponentReference
	 * @param wireToServMap              : map of correspondence between potential
	 *                                   name in Wire and EDTComponentService
	 * @return edtComponent
	 * @throws FailedImportException if no ComponentDefinition or EDTDataType are
	 *                               found
	 */
	private static edtproject.Component createEDTComponent(Step2 step2, Component ecoaComponent)
			throws FailedImportException {

		// Create empty EDT Component
		var edtComponent = edtproject.EDTProjectFactory.eINSTANCE.createComponent();

		// Fill EDTComponent with ECOAComponent attributes
		String componentName = ecoaComponent.getName();
		EList<PropertyValue> properties = ecoaComponent.getProperty();
		EList<ComponentReference> references = ecoaComponent.getReference();
		EList<ComponentService> services = ecoaComponent.getService();
		FeatureMap implementationGroup = ecoaComponent.getImplementationGroup();

		// Find ComponentDefinitionName and version
		edtComponent.setName(componentName);
		if (implementationGroup != null) {
			for (var i = 0; i < implementationGroup.size(); i++) {
				Object value2 = implementationGroup.get(i).getValue();
				if (value2 instanceof Instance instance) {
					setEDTInstance(step2, edtComponent, instance);
				}
			}
		}

		// Create ComponentProperties
		ComponentProperty edtProperty;
		for (PropertyValue property : properties) {
			edtProperty = createEDTPropertyValue(edtComponent, property);
			edtComponent.getProperties().add(edtProperty);
		}

		// Create ComponentReferences and preparation for wire association :
		// associate potential name in wire to object
		edtproject.ComponentReference edtComponentReference;
		for (ComponentReference reference : references) {
			edtComponentReference = createEDTComponentReference(edtComponent, reference);
			edtComponent.getComponentReferences().add(edtComponentReference);
		}

		// Create ComponentServices and preparation for wire association :
		// associate potential name in wire to object
		edtproject.ComponentService edtComponentService;
		for (ComponentService service : services) {
			edtComponentService = createEDTComponentService(edtComponent, service);
			edtComponent.getComponentServices().add(edtComponentService);
		}

		return edtComponent;
	}

	/**
	 * Create a EDT model PropertyValue from a ECOA model Property Value
	 * 
	 * @param edtComponent
	 * @param ecoaProperty
	 * @return edtComponentProperty
	 * @throws FailedImportExceptionif no ComponentDefinitionProperty or EDTDataType
	 *                                 are found
	 */
	static edtproject.ComponentProperty createEDTPropertyValue(edtproject.Component edtComponent,
			PropertyValue ecoaProperty) throws FailedImportException {

		// Create empty ComponentProperty
		ComponentProperty edtProperty = EDTFACTORY.createComponentProperty();

		// Find ComponentDefinitionProperty
		String propertyName = ecoaProperty.getName();
		var edtPropertyOfCT = edtComponent.getComponentDefinition().findComponentDefinitionPropertyByName(propertyName);

		// Fill edtComponentProperty from ecoaComponentProperty
		if (edtPropertyOfCT != null) {
			edtProperty.setComponentDefinitionProperty(edtPropertyOfCT);
		} else {
			throw new FailedImportException("No Property was found with the name " + propertyName
					+ IN_THE_COMPONENT_DEFINITION + edtComponent.getComponentDefinition().getName());
		}

		edtProperty.setFile(ecoaProperty.getFile());
		edtProperty.setSource(ecoaProperty.getSource());

		// Get property value
		FeatureMap values = ecoaProperty.getAny();
		edtProperty.setValue(EDTProjectImportConverter.createPropertyEDTValue(values));

		return edtProperty;
	}

	/**
	 * Create a EDT model ComponentReference from a ECOA model ComponentReference
	 * 
	 * @param edtComponent
	 * @param ecoaComponentReference
	 * @return edtComponentReference
	 * @throws FailedImportException if no ComponentDefinitionReference are found
	 */
	private static edtproject.ComponentReference createEDTComponentReference(edtproject.Component edtComponent,
			ComponentReference ecoaComponentReference) throws FailedImportException {

		// Create empty edtComponentReference
		var edtComponentReference = edtproject.EDTProjectFactory.eINSTANCE.createComponentReference();

		// Find ComponentDefinitionReference
		var edtComponentTypeReference = edtComponent.getComponentDefinition()
				.findComponentDefinitionReferenceByName(ecoaComponentReference.getName());
		// Fill edtComponentReference from ecoaComponentReference
		if (edtComponentTypeReference != null) {
			edtComponentReference.setComponentDefinitionReference(edtComponentTypeReference);
		} else {
			throw new FailedImportException("No Reference was found with the name " + ecoaComponentReference.getName()
					+ IN_THE_COMPONENT_DEFINITION + edtComponent.getComponentDefinition().getName());
		}

		if (ecoaComponentReference.isSetMultiplicity()) {
			edtComponentReference.setMultiplicity(ecoaComponentReference.getMultiplicity());
		}

		return edtComponentReference;
	}

	/**
	 * Create a EDT model ComponentService from a ECOA model ComponentService
	 * 
	 * @param edtComponent
	 * @param ecoaComponentService
	 * @return edtComponentService
	 * @throws FailedImportExceptionif no ComponentDefinitionService are found
	 */
	private static edtproject.ComponentService createEDTComponentService(edtproject.Component edtComponent,
			ComponentService ecoaComponentService) throws FailedImportException {

		// Create empty edtComponentService
		var edtComponentService = edtproject.EDTProjectFactory.eINSTANCE.createComponentService();

		// Find ComponentDefinitionService
		var edtComponentTypeService = edtComponent.getComponentDefinition()
				.findComponentDefinitionServiceByName(ecoaComponentService.getName());
		// Fill edtComponentService from ecoaComponentService
		if (edtComponentTypeService != null) {
			edtComponentService.setComponentDefinitionService(edtComponentTypeService);

		} else {
			throw new FailedImportException("No Service was found with the name " + ecoaComponentService.getName()
					+ IN_THE_COMPONENT_DEFINITION + edtComponent.getComponentDefinition().getName());
		}

		return edtComponentService;
	}

	/**
	 * Set a EDT model Instance from a ECOA model Instance
	 * 
	 * @param edtComponentDefinitionList : list of ComponentDefinition
	 * @param edtComponent
	 * @param ecoaInstance
	 * @throws FailedImportException
	 */
	private static void setEDTInstance(Step2 step2, edtproject.Component edtComponent, Instance ecoaInstance)
			throws FailedImportException {

		// Find ComponentDefinition
		String componentTypeName = ecoaInstance.getComponentType();
		var edtComponentType = step2.findComponentDefinitionByName(componentTypeName);

		// Set componentDefinition or throw exception if not found
		if (edtComponentType != null) {
			edtComponent.setComponentDefinition(edtComponentType);
		} else {
			throw new FailedImportException("No ComponentDefinition was found with the name : " + componentTypeName);
		}

		// Set version
		edtComponent.setComponentDefinitionVersion(ecoaInstance.getVersion());
	}

	/**
	 * Complete Assembly with FinalAssembly ECOA model Composite
	 * 
	 * @param finalAssembly        : ECOA final Assembly that completes ECOA
	 *                             InitialAssembly
	 * @param edtInitialAssembly   : imported EDT InitialAssembly
	 * 
	 * @param step4                : list of ComponentImplementation to associate
	 *                             Components
	 * 
	 * @param typeStep             : libraries
	 * @param missingElementsToLog : log of missing elements for error message
	 * @throws FailedImportException if no ComponentImplementation or Component are
	 *                               found corresponding to the names given
	 */
	public static void addImplementationToInitialAssembly(Composite finalAssembly,
			edtproject.Composite edtInitialAssembly, Step4 step4, Step0 typeStep, StringBuilder missingElementsToLog)
			throws FailedImportException {

		EList<Property> properties = finalAssembly.getProperty();
		for (Property property : properties) {
			edtproject.Property findPropertyByName = edtInitialAssembly.findPropertyByName(property.getName());
			if (findPropertyByName == null) {
				edtInitialAssembly.getProperties()
						.add(EDTProjectImportConverter.createEDTProperty(property, typeStep, missingElementsToLog));
			}
		}

		EList<Component> ecoaComponents = finalAssembly.getComponent();
		for (Component ecoaComponent : ecoaComponents) {
//			Find Component In InitialAssembly
			edtproject.Component initialAssemblyComponent = edtInitialAssembly
					.findComponentByName(ecoaComponent.getName());
			if (initialAssemblyComponent == null) {
				throw new FailedImportException(
						"No Component was found in the initial assembly with the name : " + ecoaComponent.getName());
			}

//			Add ComponentImplementation Link
			FeatureMap implementationGroup = ecoaComponent.getImplementationGroup();
			if (implementationGroup != null) {
				for (var i = 0; i < implementationGroup.size(); i++) {
					Object value2 = implementationGroup.get(i).getValue();
					if (value2 instanceof Instance instance && instance.getImplementation() != null) {
						ImplementationType implementation = instance.getImplementation();
						ComponentImplementation edtImplementation = step4
								.findComponentImplementationByName(implementation.getName());
						if (edtImplementation != null) {
							initialAssemblyComponent.setComponentImplementation(edtImplementation);
						} else {
							throw new FailedImportException(
									"No ComponentImplementation was found with the name : " + implementation.getName());
						}
					}
				}
			}

			EList<PropertyValue> componentProperties = ecoaComponent.getProperty();
			for (PropertyValue componentProperty : componentProperties) {
				initialAssemblyComponent.getProperties()
						.add(createEDTPropertyValue(initialAssemblyComponent, componentProperty));
			}

		}

		EList<Wire> ecoaWires = finalAssembly.getWire();
		// Convert Wire to links
		for (Wire ecoaWire : ecoaWires) {
			String source = ecoaWire.getSource();
			String target = ecoaWire.getTarget();
			edtproject.ComponentReference findComponentReferenceFromWire = edtInitialAssembly
					.findComponentReferenceFromWire(source);
			if (findComponentReferenceFromWire == null) {
				throw new FailedImportException("The ComponentReference " + source + WAS_NOT_FOUND);
			}
			edtproject.ComponentService findComponentServiceFromWire = edtInitialAssembly
					.findComponentServiceFromWire(target);
			if (findComponentServiceFromWire == null) {
				throw new FailedImportException("The ComponentService " + target + WAS_NOT_FOUND);
			}

			ServiceLink findServiceLink = edtInitialAssembly.findServiceLink(findComponentReferenceFromWire,
					findComponentServiceFromWire);
			if (findServiceLink == null) {
				ServiceLink serviceLink = EDTFACTORY.createServiceLink();
				serviceLink.setSource(findComponentReferenceFromWire);
				serviceLink.setTarget(findComponentServiceFromWire);
				edtInitialAssembly.getServiceLinks().add(serviceLink);
			}
		}
	}

}
