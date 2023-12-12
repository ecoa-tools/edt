/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.EdtimplementationFactory;
import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.Step0;
import edtqos.ServiceInstanceQos;
import edttype.EDTDataType;
import edttype.Library;
import technology.ecoa.implementation._2.ComponentImplementation;
import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.ModuleImplementation;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.ModuleType;
import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.Parameter;
import technology.ecoa.implementation._2.PinfoType1;
import technology.ecoa.implementation._2.PrivatePinfo;
import technology.ecoa.implementation._2.PropertiesType;
import technology.ecoa.implementation._2.PublicPinfo;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.TriggerInstance;
import technology.ecoa.implementation._2.UseType;
import temp.ModuleBehaviour;

/**
 * 
 * Helper class to convert ECOA Model Objects to EDT.
 * 
 */
public class ComponentImplementationImportConverter {
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationImportConverter() {
	}

	/**
	 * Create a EDT model ComponentImplementation from a Ecoa model
	 * ComponentImplementation
	 * 
	 * @param ecoaImp                          : ecoa ComponentImplementation
	 * @param fileName                         : name of ComponentImplementation
	 * @param componentDefinitionList          : list of imported
	 *                                         ComponentDefinition
	 * @param edtServiceQosList                : list of imported QoS in same
	 *                                         directory
	 * @param typeStep                         : types and BasicTypes
	 * @param edtComponentDefinition           : definition of implementation
	 * @param edtModuleBehaviours              : moduleBehaviours to associate
	 * @param edtComponentDefinitionReferences :
	 * @param edtComponentDefinitionServices   :
	 * @return EDT ComponentImplementation
	 * @throws FailedImportException : thrown if no ComponentDefinition, Library or
	 *                               Service QoS found
	 */
	public static edtimplementation.ComponentImplementation createEDTComponentImplementation(
			ComponentImplementation ecoaImp, String fileName, ComponentDefinition edtComponentDefinition,
			List<edtqos.ServiceInstanceQos> edtServiceQosList, Step0 typeStep,
			ArrayList<ModuleBehaviour> edtModuleBehaviours) throws FailedImportException {
		// Create empty EDT ComponentImplementation
		edtimplementation.ComponentImplementation edtComponentImplementation = EDTIMPFACTORY
				.createComponentImplementation();

		// Set name
		edtComponentImplementation.setName(EDTProjectImportConverter.getObjectName(fileName, ".impl.xml"));

		// Set Associated ServiceQoS
		edtComponentImplementation.getAssociatedServiceQos().addAll(edtServiceQosList);

		// Set ModuleBehaviours
		edtComponentImplementation.getModuleBehaviours().addAll(edtModuleBehaviours);

		// Get Libraries used in the ComponentImplementation
		EList<UseType> usedLibraries = ecoaImp.getUse();
		for (UseType useType : usedLibraries) {
			if (useType.equals("ECOA")) {
				continue;
			}
			Library libraryToBeAssociated = typeStep.findLibrary(useType.getLibrary());
			if (libraryToBeAssociated != null) {
				edtComponentImplementation.getUsedLibraries().add(libraryToBeAssociated);
			} else {
				throw new FailedImportException("No Library was found with the name " + useType.getLibrary());
			}
		}

		// Set References
		EList<ServiceQoS> ecoaReferences = ecoaImp.getReference();
		for (ServiceQoS ecoaServiceQoS : ecoaReferences) {
			edtComponentImplementation.getReferences().add(createEDTComponentImplementationReference(edtServiceQosList,
					ecoaServiceQoS, edtComponentDefinition.getReferences()));
		}

		// Set Services
		EList<ServiceQoS> ecoaServices = ecoaImp.getService();
		for (ServiceQoS ecoaServiceQoS : ecoaServices) {
			edtComponentImplementation.getServices().add(createEDTComponentImplementationService(edtServiceQosList,
					ecoaServiceQoS, edtComponentDefinition.getServices()));
		}

		// Set ComponentDefinition
		edtComponentImplementation.setComponentDefinition(edtComponentDefinition);

		// Set ModuleTypes
		EList<ModuleType> moduleTypes = ecoaImp.getModuleType();
		for (ModuleType moduleType : moduleTypes) {
			edtComponentImplementation.getModuleTypes().add(createEDTModuleType(moduleType, typeStep));
		}

//		Set ModuleImplementation
		EList<ModuleImplementation> moduleImplementations = ecoaImp.getModuleImplementation();
		for (ModuleImplementation moduleImplementation : moduleImplementations) {
			edtComponentImplementation.getModuleImplementations()
					.add(createEDTModuleImplementation(moduleImplementation, edtComponentImplementation));
		}

//		Set ModuleInstance
		EList<ModuleInstance> moduleInstances = ecoaImp.getModuleInstance();
		for (ModuleInstance moduleInstance : moduleInstances) {
			edtComponentImplementation.getInstances().add(ComponentImplementationInstanceImportConverter
					.createEDTModuleInstance(moduleInstance, edtComponentImplementation));
		}

//		Set TriggerInstance
		EList<TriggerInstance> triggerInstances = ecoaImp.getTriggerInstance();
		for (TriggerInstance triggerInstance : triggerInstances) {
			edtComponentImplementation.getInstances()
					.add(ComponentImplementationInstanceImportConverter.createEDTTriggerInstance(triggerInstance));
		}

//		Set DynamicTriggerInstance
		EList<DynamicTriggerInstance> dynamicTriggerInstances = ecoaImp.getDynamicTriggerInstance();
		for (DynamicTriggerInstance dynamicTriggerInstance : dynamicTriggerInstances) {
			edtComponentImplementation.getInstances().add(ComponentImplementationInstanceImportConverter
					.createEDTDynamicTriggerInstance(dynamicTriggerInstance, typeStep));
		}

//		Set links
		EList<DataLink> dataLinks = ecoaImp.getDataLink();
		for (DataLink dataLink : dataLinks) {
			edtComponentImplementation.getOperationLinks().addAll(ComponentImplementationDataLinkImportConverter
					.createEDTDataLink(dataLink, edtComponentImplementation));
		}
		EList<EventLink> eventLinks = ecoaImp.getEventLink();
		for (EventLink eventLink : eventLinks) {
			edtComponentImplementation.getOperationLinks().addAll(ComponentImplementationEventLinkImportConverter
					.createEDTEventLink(eventLink, edtComponentImplementation));
		}

		EList<RequestLink> requestLinks = ecoaImp.getRequestLink();
		for (RequestLink requestLink : requestLinks) {
			edtComponentImplementation.getOperationLinks().addAll(ComponentImplementationRequestLinkImportConverter
					.createEDTRequestLink(requestLink, edtComponentImplementation));
		}
		return edtComponentImplementation;
	}

	/**
	 * 
	 * @param edtServiceQosList
	 * @param ecoaServiceQoS
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.ComponentImplementationReference createEDTComponentImplementationReference(
			List<edtqos.ServiceInstanceQos> edtServiceQosList, ServiceQoS ecoaServiceQoS,
			List<ComponentDefinitionReference> componentDefinitionReferences) throws FailedImportException {
		edtimplementation.ComponentImplementationReference edtReference = EDTIMPFACTORY
				.createComponentImplementationReference();
		for (ComponentDefinitionReference componentDefinitionReference : componentDefinitionReferences) {
			if (Objects.equals(componentDefinitionReference.getName(), ecoaServiceQoS.getName())) {
				edtReference.setComponentDefinitionReference(componentDefinitionReference);
			}
		}
		edtqos.ServiceInstanceQos edtQoS = ServiceInstanceQos.findQoS(edtServiceQosList, ecoaServiceQoS.getNewQoS());
		if (edtQoS != null) {
			edtReference.setNewQos(edtQoS);
			return edtReference;
		} else {
			throw new FailedImportException(
					"No ServiceInstanceQos was found with the name:" + ecoaServiceQoS.getNewQoS());
		}
	}

	/**
	 * 
	 * @param edtServiceQosList
	 * @param ecoaServiceQoS
	 * @param componentDefinitionServices
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.ComponentImplementationService createEDTComponentImplementationService(
			List<edtqos.ServiceInstanceQos> edtServiceQosList, ServiceQoS ecoaServiceQoS,
			List<ComponentDefinitionService> componentDefinitionServices) throws FailedImportException {
		edtimplementation.ComponentImplementationService edtService = EDTIMPFACTORY
				.createComponentImplementationService();
		for (ComponentDefinitionService componentDefinitionService : componentDefinitionServices) {
			if (Objects.equals(componentDefinitionService.getName(), ecoaServiceQoS.getName())) {
				edtService.setComponentDefinitionService(componentDefinitionService);
			}
		}
		edtqos.ServiceInstanceQos edtQoS = ServiceInstanceQos.findQoS(edtServiceQosList, ecoaServiceQoS.getNewQoS());
		if (edtQoS != null) {
			edtService.setNewQos(edtQoS);
			return edtService;
		} else {
			throw new FailedImportException(
					"No ServiceInstanceQos was found with the name:" + ecoaServiceQoS.getNewQoS());
		}
	}

	/**
	 * 
	 * @param ecoaModuleType
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.ModuleType createEDTModuleType(ModuleType ecoaModuleType, Step0 typeStep)
			throws FailedImportException {
		edtimplementation.ModuleType edtModuleType = EDTIMPFACTORY.createModuleType();
		if (ecoaModuleType.isSetActivatingFaultNotifs()) {
			edtModuleType.setActivatingFaultNotifs(ecoaModuleType.isActivatingFaultNotifs());
		}

		if (ecoaModuleType.isSetHasUserContext()) {
			edtModuleType.setHasUserContext(ecoaModuleType.isHasUserContext());
		}

		if (ecoaModuleType.isSetHasWarmStartContext()) {
			edtModuleType.setHasWarmStartContext(ecoaModuleType.isHasWarmStartContext());
		}

		if (ecoaModuleType.isSetIsFaultHandler()) {
			edtModuleType.setIsFaultHandler(ecoaModuleType.isIsFaultHandler());
		}

		edtModuleType.setName(ecoaModuleType.getName());

		PinfoType1 pinfoType = ecoaModuleType.getPinfo();
		if (pinfoType != null) {
			EList<PrivatePinfo> ecoaPrivatePinfos = pinfoType.getPrivatePinfo();
			for (PrivatePinfo ecoaPrivatePinfo : ecoaPrivatePinfos) {
				edtimplementation.PrivatePinfo edtPrivatePinfo = EDTIMPFACTORY.createPrivatePinfo();
				edtPrivatePinfo.setName(ecoaPrivatePinfo.getName());
				edtModuleType.getPinfo().add(edtPrivatePinfo);
			}
			EList<PublicPinfo> ecoaPublicPinfos = pinfoType.getPublicPinfo();
			for (PublicPinfo ecoaPublicPinfo : ecoaPublicPinfos) {
				edtimplementation.PublicPinfo edtPublicPinfo = EDTIMPFACTORY.createPublicPinfo();
				edtPublicPinfo.setName(ecoaPublicPinfo.getName());
				edtModuleType.getPinfo().add(edtPublicPinfo);
			}
		}

		OperationsType operations = ecoaModuleType.getOperations();
		ComponentImplementationOperationsImportConverter.createEDTOperations(typeStep, edtModuleType, operations);

		PropertiesType ecoaPropertiesType = ecoaModuleType.getProperties();
		if (ecoaPropertiesType != null) {
			EList<Parameter> ecoaProperties = ecoaPropertiesType.getProperty();
			for (Parameter ecoaProperty : ecoaProperties) {
				edtModuleType.getProperties().add(createEDTPropertyType(ecoaProperty, typeStep));
			}
		}

		return edtModuleType;
	}

	/**
	 * 
	 * @param ecoaParameter
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.ModuleTypeProperty createEDTPropertyType(Parameter ecoaParameter, Step0 typeStep)
			throws FailedImportException {
		edtimplementation.ModuleTypeProperty edtProperty = EDTIMPFACTORY.createModuleTypeProperty();
		edtProperty.setName(ecoaParameter.getName());
		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaParameter.getType());
		if (edtDataType != null) {
			edtProperty.setType(edtDataType);
		} else {
			throw new FailedImportException("No Type was found with the name :" + ecoaParameter.getType());
		}

		return edtProperty;
	}

	/**
	 * 
	 * @param ecoaModuleImplementation
	 * @param edtComponentImplementation
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.ModuleImplementation createEDTModuleImplementation(
			ModuleImplementation ecoaModuleImplementation,
			edtimplementation.ComponentImplementation edtComponentImplementation) throws FailedImportException {
		edtimplementation.ModuleImplementation edtModuleImplementation = EDTIMPFACTORY.createModuleImplementation();

		edtModuleImplementation.setName(ecoaModuleImplementation.getName());
		edtModuleImplementation.setLanguage(ecoaModuleImplementation.getLanguage());
		String moduleTypeName = ecoaModuleImplementation.getModuleType();
		edtimplementation.ModuleType moduleType = edtComponentImplementation.findModuleTypeByName(moduleTypeName);
		if (moduleType != null) {
			edtModuleImplementation.setModuleType(moduleType);
		} else {
			throw new FailedImportException("No ModuleType was found with the name :" + moduleTypeName);
		}
		return edtModuleImplementation;
	}

}
