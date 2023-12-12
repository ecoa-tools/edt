/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.DataLink;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventLink;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationLink;
import edtimplementation.Parameter;
import edtimplementation.PrivatePinfo;
import edtimplementation.PublicPinfo;
import edtimplementation.RequestLink;
import edtimplementation.TriggerInstance;
import edttype.EDTDataType;
import edttype.Library;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationExportConverter() {

	}

	/**
	 * Convert EDT ComponentImplementation to ECOA ComponentImplementation
	 * 
	 * @param edtComponentImplementation : EDT object to convert
	 * @return ecoaComponentDefinition : Converted object
	 */
	public static technology.ecoa.implementation._2.DocumentRoot recreateComponentImplementation(
			ComponentImplementation edtComponentImplementation) {
//		Create empty ECOA ComponentImplementation
		technology.ecoa.implementation._2.ComponentImplementation ecoaComponentImplementation = IMPFACTORY
				.createComponentImplementation();

//		Set ComponentDefinition
		if (edtComponentImplementation.getComponentDefinition() != null) {
			ecoaComponentImplementation
					.setComponentDefinition(edtComponentImplementation.getComponentDefinition().getName());
		}

//		Set used libraries (conversion from link to string)
		EList<Library> usedLibraries = edtComponentImplementation.getUsedLibraries();
		usedLibraries.forEach(edtLibrary -> ecoaComponentImplementation.getUse().add(recreateUseType(edtLibrary)));

//		Recreate References
		EList<ComponentImplementationReference> edtReferences = edtComponentImplementation.getReferences();
		for (ComponentImplementationReference edtComponentImplementationReference : edtReferences) {
			technology.ecoa.implementation._2.ServiceQoS ecoaReference = IMPFACTORY.createServiceQoS();
			if (edtComponentImplementationReference.getComponentDefinitionReference() != null
					&& edtComponentImplementationReference.getNewQos() != null) {
				ecoaReference.setName(edtComponentImplementationReference.getComponentDefinitionReference().getName());
				ecoaReference.setNewQoS(edtComponentImplementationReference.getNewQos().getName());
			}
			ecoaComponentImplementation.getReference().add(ecoaReference);
		}

//		Recreate Services
		EList<ComponentImplementationService> edtServices = edtComponentImplementation.getServices();
		for (ComponentImplementationService edtComponentImplementationService : edtServices) {
			technology.ecoa.implementation._2.ServiceQoS ecoaService = IMPFACTORY.createServiceQoS();
			if (edtComponentImplementationService.getComponentDefinitionService() != null
					&& edtComponentImplementationService.getNewQos() != null) {
				ecoaService.setName(edtComponentImplementationService.getComponentDefinitionService().getName());
				ecoaService.setNewQoS(edtComponentImplementationService.getNewQos().getName());
			}

			ecoaComponentImplementation.getService().add(ecoaService);
		}

//		Recreate ModuleTypes
		EList<ModuleType> moduleTypes = edtComponentImplementation.getModuleTypes();
		for (ModuleType edtModuleType : moduleTypes) {
			ecoaComponentImplementation.getModuleType().add(recreateModuleType(edtModuleType));
		}

//		Recreate ModuleImplementations
		EList<ModuleImplementation> edtModuleImplementations = edtComponentImplementation.getModuleImplementations();
		for (ModuleImplementation edtModuleImplementation : edtModuleImplementations) {
			ecoaComponentImplementation.getModuleImplementation()
					.add(recreateECOAModuleImplementation(edtModuleImplementation));
		}

//		Recreate ModuleInstance
		EList<Instance> edtInstances = edtComponentImplementation.getInstances();
		for (Instance edtInstance : edtInstances) {
			if (edtInstance instanceof ModuleInstance edtModuleInstance) {
				ecoaComponentImplementation.getModuleInstance().add(
						ComponentImplementationInstanceExportConverter.recreateECOAModuleInstance(edtModuleInstance));
			} else if (edtInstance instanceof DynamicTriggerInstance edtDynamicTriggerInstance) {
				ecoaComponentImplementation.getDynamicTriggerInstance()
						.add(ComponentImplementationInstanceExportConverter
								.recreateECOADynamicTriggerInstance(edtDynamicTriggerInstance));
			} else if (edtInstance instanceof TriggerInstance edtTriggerInstance) {
				ecoaComponentImplementation.getTriggerInstance().add(
						ComponentImplementationInstanceExportConverter.recreateECOATriggerInstance(edtTriggerInstance));
			}
		}

//		Recreate links
		EList<OperationLink> edtOperationLinks = edtComponentImplementation.getOperationLinks();
		ArrayList<DataLink> edtDataLinks = new ArrayList<>();
		ArrayList<RequestLink> edtRequestLinks = new ArrayList<>();
		ArrayList<EventLink> edtEventLinks = new ArrayList<>();
		for (OperationLink edtOperationLink : edtOperationLinks) {
			if (edtOperationLink instanceof DataLink dataLink) {
				edtDataLinks.add(dataLink);
			} else if (edtOperationLink instanceof EventLink eventLink) {
				edtEventLinks.add(eventLink);
			} else if (edtOperationLink instanceof RequestLink requestLink) {
				edtRequestLinks.add(requestLink);
			}
		}
		ArrayList<technology.ecoa.implementation._2.DataLink> ecoaDataLinks = ComponentImplementationDataLinkExportConverter
				.recreateDataLinks(edtDataLinks);
		ecoaComponentImplementation.getDataLink().addAll(ecoaDataLinks);

		ArrayList<technology.ecoa.implementation._2.EventLink> ecoaEventLinks = ComponentImplementationEventLinkExportConverter
				.recreateEventLinks(edtEventLinks);
		ecoaComponentImplementation.getEventLink().addAll(ecoaEventLinks);

		ArrayList<technology.ecoa.implementation._2.RequestLink> ecoaRequestLinks = ComponentImplementationRequestLinkExportConverter
				.recreateECOARequestLinks(edtRequestLinks);
		ecoaComponentImplementation.getRequestLink().addAll(ecoaRequestLinks);

		// Create DocumentRoot to add ComponentImplementation
		technology.ecoa.implementation._2.DocumentRoot documentRoot = IMPFACTORY.createDocumentRoot();
		documentRoot.setComponentImplementation(ecoaComponentImplementation);

		return documentRoot;
	}

	/**
	 * @param edtModuleType
	 * @return
	 */
	private static technology.ecoa.implementation._2.ModuleType recreateModuleType(ModuleType edtModuleType) {
		technology.ecoa.implementation._2.ModuleType ecoaModuleType = IMPFACTORY.createModuleType();

		ecoaModuleType.setName(edtModuleType.getName());

//		Set optional attributes
		if (edtModuleType.isSetActivatingFaultNotifs()) {
			ecoaModuleType.setActivatingFaultNotifs(edtModuleType.isActivatingFaultNotifs());
		}

		if (edtModuleType.isSetHasUserContext()) {
			ecoaModuleType.setHasUserContext(edtModuleType.isHasUserContext());
		}

		if (edtModuleType.isSetHasWarmStartContext()) {
			ecoaModuleType.setHasWarmStartContext(edtModuleType.isHasWarmStartContext());
		}

		if (edtModuleType.isSetIsFaultHandler()) {
			ecoaModuleType.setIsFaultHandler(edtModuleType.isIsFaultHandler());
		}

//		Recreate PINFOs
		EList<ModuleTypePinfo> edtPinfos = edtModuleType.getPinfo();
		if (!edtPinfos.isEmpty()) {
			technology.ecoa.implementation._2.PinfoType1 ecoaPinfoType = IMPFACTORY.createPinfoType1();
			for (ModuleTypePinfo edtPinfoType : edtPinfos) {
				if (edtPinfoType instanceof PublicPinfo edtPublicPinfo) {
					technology.ecoa.implementation._2.PublicPinfo ecoaPublicPinfo = IMPFACTORY.createPublicPinfo();
					ecoaPublicPinfo.setName(edtPublicPinfo.getName());
					ecoaPinfoType.getPublicPinfo().add(ecoaPublicPinfo);
				} else if (edtPinfoType instanceof PrivatePinfo edtPrivatePinfo) {
					technology.ecoa.implementation._2.PrivatePinfo ecoaPrivatePinfo = IMPFACTORY.createPrivatePinfo();
					ecoaPrivatePinfo.setName(edtPrivatePinfo.getName());
					ecoaPinfoType.getPrivatePinfo().add(ecoaPrivatePinfo);
				}
			}
			ecoaModuleType.setPinfo(ecoaPinfoType);
		}

//		Recreate Operations
		EList<ModuleOperation> edtOperations = edtModuleType.getOperations();
		technology.ecoa.implementation._2.OperationsType ecoaOperationsType = IMPFACTORY.createOperationsType();
		for (ModuleOperation moduleOperation : edtOperations) {
			ComponentImplementationOperationsExportConverter.recreateECOAOperations(ecoaOperationsType,
					moduleOperation);
		}
		ecoaModuleType.setOperations(ecoaOperationsType);

//		Recreate Properties
		EList<ModuleTypeProperty> edtProperties = edtModuleType.getProperties();
		if (!edtProperties.isEmpty()) {
			technology.ecoa.implementation._2.PropertiesType ecoaPropertiesType = IMPFACTORY.createPropertiesType();
			for (ModuleTypeProperty edtPropertyType : edtProperties) {
				technology.ecoa.implementation._2.Parameter ecoaProperty = IMPFACTORY.createParameter();
				ecoaProperty.setName(edtPropertyType.getName());

//			Convert EDTDataType link to String
				EDTDataType type = edtPropertyType.getType();
				if (type != null) {
					ecoaProperty.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
				}
				ecoaPropertiesType.getProperty().add(ecoaProperty);

			}
			ecoaModuleType.setProperties(ecoaPropertiesType);
		}

		return ecoaModuleType;
	}

	/**
	 * Convert EDT used Library to ECOA UseType
	 * 
	 * @param usedLibrary : EDT library linked
	 * @return useType : object corresponding to library used
	 */
	public static technology.ecoa.implementation._2.UseType recreateUseType(edttype.Library usedLibrary) {
//		Create empty ecoa UseType
		var useType = IMPFACTORY.createUseType();

//		Converted referenced Library to useType
		useType.setLibrary(usedLibrary.getName());

		return useType;
	}

	/**
	 * 
	 * @param edtParameter
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.Parameter recreateECOAParameter(Parameter edtParameter) {
		technology.ecoa.implementation._2.Parameter ecoaParameter = IMPFACTORY.createParameter();
		ecoaParameter.setName(edtParameter.getName());

//		Convert EDTDataType link to String
		EDTDataType type = edtParameter.getType();
		if (type != null) {
			ecoaParameter.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
		}
		return ecoaParameter;
	}

	/**
	 * 
	 * @param edtModuleImplementation
	 * @param edtModuleTypes
	 * @return
	 * @throws FailedImportException
	 */
	private static technology.ecoa.implementation._2.ModuleImplementation recreateECOAModuleImplementation(
			ModuleImplementation edtModuleImplementation) {
		technology.ecoa.implementation._2.ModuleImplementation ecoaModuleImplementation = IMPFACTORY
				.createModuleImplementation();

		ecoaModuleImplementation.setName(edtModuleImplementation.getName());
		ecoaModuleImplementation.setLanguage(edtModuleImplementation.getLanguage());
		if (edtModuleImplementation.getModuleType() != null) {
			ecoaModuleImplementation.setModuleType(edtModuleImplementation.getModuleType().getName());
		}

		return ecoaModuleImplementation;
	}

}
