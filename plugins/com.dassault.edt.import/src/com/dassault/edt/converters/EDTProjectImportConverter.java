/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.ValueType;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.xmlimport.FailedImportException;
import com.dassault.edt.xmlimport.ImportUtils;

import edtinterface.ServiceDefinition;
import edtproject.Composite;
import edtproject.Contract;
import edtproject.EDTProjectFactory;
import edtproject.FinalAssembly;
import edtproject.OutputDirectory;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Steps;
import edtqos.ServiceInstanceQos;
import edttype.EDTDataType;
import edttype.util.EDTTypeDefaultCreator;
import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;
import technology.ecoa.sca.extension.scaExt.Interface;

/**
 * Functions useful for multiple Object Conversions
 * 
 */
public class EDTProjectImportConverter {

	private static final String COMPOSITE2 = "Composite";
	private static final EDTProjectFactory EDTFACTORY = EDTProjectFactory.eINSTANCE;

	private EDTProjectImportConverter() {

	}

	/**
	 * Creation the EDTProject structure with default name
	 * 
	 * @return EDTProject will all the folderSteps and BasicType created
	 */
	public static Steps createEDTProject() {
		// Get Factory instance to instantiate all the objects
		EDTProjectFactory einstance = edtproject.EDTProjectFactory.eINSTANCE;

		// Instantiate the steps
		var steps = einstance.createSteps();

		// Instantiate and the set the different directories of the project
		var typesStep = einstance.createStep0();
		var serviceDefinitionStep = einstance.createStep1();
		var componentDefinitionStep = einstance.createStep2();
		var initialAssemblyStep = einstance.createStep3();
		var componentImplementationStep = einstance.createStep4();
		var integrationStep = einstance.createStep5();
		OutputDirectory outputDirectory = einstance.createOutputDirectory();
		typesStep.setFolderName(ImportUtils.ZERO_TYPES);
		serviceDefinitionStep.setFolderName(ImportUtils.ONE_SERVICES);
		componentDefinitionStep.setFolderName(ImportUtils.TWO_COMPONENT_DEFINITIONS);
		initialAssemblyStep.setFolderName(ImportUtils.THREE_INITIAL_ASSEMBLY);
		componentImplementationStep.setFolderName(ImportUtils.FOUR_COMPONENT_IMPLEMENTATIONS);
		integrationStep.setFolderName(ImportUtils.FIVE_INTEGRATION);

		// Set BasicTypes
		typesStep.getBasicTypes().addAll(EDTTypeDefaultCreator.createBasicTypes());
		typesStep.getEcoaPredefinedTypes().addAll(EDTTypeDefaultCreator.createPredefinedTypes(typesStep));

		// Set Composite
		Composite composite = einstance.createComposite();
		composite.setName(COMPOSITE2);
		composite.setTargetNamespace("http://www.ecoa.technology/default");
		initialAssemblyStep.setInitialAssembly(composite);

		// Add the steps
		steps.getStep().add(typesStep);
		steps.getStep().add(serviceDefinitionStep);
		steps.getStep().add(componentDefinitionStep);
		steps.getStep().add(initialAssemblyStep);
		steps.getStep().add(componentImplementationStep);
		steps.getStep().add(integrationStep);
		steps.setOutputDirectory(outputDirectory);
		return steps;
	}

	/**
	 * Creation the EDTProject structure from EcoaProject
	 * 
	 * @param ecoaProject : content of project.xml
	 * 
	 * @return EDTProject with all the folderSteps and BasicType created
	 */
	public static Steps createEDTProject(EcoaProject ecoaProject) {
		// Get Factory instance to instantiate all the objects
		EDTProjectFactory einstance = edtproject.EDTProjectFactory.eINSTANCE;

		// Instantiate the steps
		var steps = einstance.createSteps();

		// Instantiate and the set the different directories of the project
		var typesStep = einstance.createStep0();
		var serviceDefinitionStep = einstance.createStep1();
		var componentDefinitionStep = einstance.createStep2();
		var initialAssemblyStep = einstance.createStep3();
		var componentImplementationStep = einstance.createStep4();
		var integrationStep = einstance.createStep5();

		OutputDirectory outputDirectory = einstance.createOutputDirectory();

		String typesFolderName = getFolderNameFromFilesList(ecoaProject.getTypes(), false);
		if (typesFolderName != null) {
			typesStep.setFolderName(typesFolderName);
		} else {
			typesStep.setFolderName(ImportUtils.ZERO_TYPES);
		}

		String serviceFolderName = getFolderNameFromFilesList(ecoaProject.getServiceDefinitions(), false);
		if (serviceFolderName != null) {
			serviceDefinitionStep.setFolderName(serviceFolderName);
		} else {
			serviceDefinitionStep.setFolderName(ImportUtils.ONE_SERVICES);
		}

		String componentDefFolderName = getFolderNameFromFilesList(ecoaProject.getComponentDefinitions(), true);
		if (componentDefFolderName != null) {
			componentDefinitionStep.setFolderName(componentDefFolderName);
		} else {
			componentDefinitionStep.setFolderName(ImportUtils.TWO_COMPONENT_DEFINITIONS);
		}

		String initialAssemblyFolderName = getFolderNameFromStringList(ecoaProject.getInitialAssembly(), false);
		if (initialAssemblyFolderName != null) {
			initialAssemblyStep.setFolderName(initialAssemblyFolderName);
		} else {
			initialAssemblyStep.setFolderName(ImportUtils.THREE_INITIAL_ASSEMBLY);
		}

		String componentImpFolderName = getFolderNameFromFilesList(ecoaProject.getComponentImplementations(), true);
		if (componentImpFolderName != null) {
			componentImplementationStep.setFolderName(componentImpFolderName);
		} else {
			componentImplementationStep.setFolderName(ImportUtils.FOUR_COMPONENT_IMPLEMENTATIONS);
		}

		String implAssFolderName = getFolderNameFromStringList(ecoaProject.getImplementationAssembly(), false);
		String depFolderName = getFolderNameFromStringList(ecoaProject.getDeploymentSchema(), false);
		String logFolderName = getFolderNameFromStringList(ecoaProject.getLogicalSystem(), false);
		String crossPlatFolderName = getFolderNameFromStringList(ecoaProject.getCrossPlatformsView(), false);
		if (implAssFolderName != null) {
			integrationStep.setFolderName(implAssFolderName);
		} else if (depFolderName != null) {
			integrationStep.setFolderName(depFolderName);
		} else if (logFolderName != null) {
			integrationStep.setFolderName(logFolderName);
		} else if (crossPlatFolderName != null) {
			integrationStep.setFolderName(crossPlatFolderName);
		} else if (ecoaProject.getEUIDs() != null && !ecoaProject.getEUIDs().isEmpty()) {
			ELIEUIDs euidsList = ecoaProject.getEUIDs().get(0);
			EList<String> elieuiDs = euidsList.getEUID();
			String euidFolderName = getFolderNameFromStringList(elieuiDs, false);
			if (euidFolderName != null) {
				integrationStep.setFolderName(euidFolderName);
			} else {
				integrationStep.setFolderName(ImportUtils.FIVE_INTEGRATION);
			}
		} else {
			integrationStep.setFolderName(ImportUtils.FIVE_INTEGRATION);
		}

		// Set BasicTypes
		typesStep.getBasicTypes().addAll(EDTTypeDefaultCreator.createBasicTypes());
		typesStep.getEcoaPredefinedTypes().addAll(EDTTypeDefaultCreator.createPredefinedTypes(typesStep));

		// Set Composite
		Composite composite = einstance.createComposite();
		composite.setName(COMPOSITE2);
		composite.setTargetNamespace("http://www.ecoa.technology/default");
		initialAssemblyStep.setInitialAssembly(composite);
		FinalAssembly finalAssembly = einstance.createFinalAssembly();
		finalAssembly.setFinalAssembly(composite);
		finalAssembly.setName(COMPOSITE2);
		integrationStep.setFinalAssembly(finalAssembly);
//		 Create automatically InitialAssembly

		// Add the steps
		steps.getStep().add(typesStep);
		steps.getStep().add(serviceDefinitionStep);
		steps.getStep().add(componentDefinitionStep);
		steps.getStep().add(initialAssemblyStep);
		steps.getStep().add(componentImplementationStep);
		steps.getStep().add(integrationStep);
		steps.setOutputDirectory(outputDirectory);
		return steps;
	}

	/**
	 * Find folder name from multiple Files List
	 * 
	 * @param filesList
	 * @return
	 */
	static String getFolderNameFromFilesList(EList<Files> filesList, boolean subdirectory) {
		if (filesList != null && !filesList.isEmpty()) {
			Files filesFiles = filesList.get(0);
			EList<String> files = filesFiles.getFile();
			return getFolderNameFromStringList(files, subdirectory);
		}
		return null;
	}

	/**
	 * Find folder name from files list
	 * 
	 * @param files
	 * @return
	 */
	static String getFolderNameFromStringList(EList<String> files, boolean subdirectoryExist) {
		if (files != null && !files.isEmpty()) {
			String firstTypeFile = files.get(0);
			if (firstTypeFile.isBlank()) {
				return null;
			}
			Path file = Path.of(firstTypeFile);
			Path parent = file.getParent();
			int nameCount = file.getNameCount();
			if (nameCount > 1) {
				if (subdirectoryExist && nameCount > 2) {
					return file.getName(nameCount - 3).toString();
				}
				return file.getName(nameCount - 2).toString();
			}
		}
		return null;
	}

	/**
	 * Get name of file without extension
	 * 
	 * @param fileName  : fileName
	 * @param extension : what to remove at the end
	 * @return name of object without extension
	 */
	public static String getObjectName(String fileName, String extension) {
		if (fileName.contains(extension)) {
			return fileName.substring(0, fileName.lastIndexOf(extension));
		} else if (fileName.contains(".")) {
			String substring = fileName.substring(0, fileName.indexOf("."));
			EDTLog.toConsole("Warning : the filename " + fileName + " does not contain " + extension
					+ ". The name will be " + substring);
			return substring;
		} else {
			EDTLog.toPopUpAndConsole("ERROR : the filename " + fileName + " does not contain " + extension,
					"The filename does not contain the expected extension and no name was found without extension.");
			return fileName;
		}
	}

	/**
	 * Convert ValueType(s) to a String with the supposition that there is only one
	 * value
	 * 
	 * @param values : values of Property attribute
	 * @return the String without the comment
	 */
	static String createPropertyEDTValue(FeatureMap values) {
		var valueToPut = new StringBuilder();
		for (var i = 0; i < values.size(); i++) {
			if (values.getValue(i) instanceof ValueType value) {
				FeatureMap mixed = value.getMixed();
				for (var j = 0; j < mixed.size(); j++) {
					if (!Objects.equals(mixed.getEStructuralFeature(j).getName(), "comment")) {
						valueToPut.append(mixed.getValue(j));
					}
				}
			}
		}
		return valueToPut.toString();
	}

	/**
	 * Create EDT property from Ecoa property
	 * 
	 * @param ecoaProperty
	 * @param typeStep
	 * @param missingElementsToLog
	 * @return edtProperty
	 * @throws FailedImportException if EDTDataType not found when ecoa-sca:type
	 *                               present
	 */
	static edtproject.Property createEDTProperty(Property ecoaProperty, Step0 typeStep,
			StringBuilder missingElementsToLog) throws FailedImportException {
		// Create empty edtProperty
		edtproject.Property edtProperty = EDTFACTORY.createProperty();

		// Fill edtProperty from ecoaProperty
		edtProperty.setName(ecoaProperty.getName());
		if (ecoaProperty.isSetMustSupply()) {
			edtProperty.setMustSupply(ecoaProperty.isMustSupply());
		}

		// Verify and set type
		if (!(ecoaProperty.getType() != null
				&& Objects.equals(ecoaProperty.getType().getNamespaceURI(), "http://www.w3.org/2001/XMLSchema")
				&& Objects.equals(ecoaProperty.getType().getLocalPart(), "string"))) {
			EDTLog.toConsole("The type of a property should have been xsd:string, it was corrected");
		}
		edtProperty.setType("xsd:string");

		// Get property value
		FeatureMap values = ecoaProperty.getAny();
		edtProperty.setValue(createPropertyEDTValue(values));

		// Get property any attribute : type and library are the only accepted
		FeatureMap propertyAnyAttribute = ecoaProperty.getAnyAttribute();
		for (int i = 0; i < propertyAnyAttribute.size(); i++) {
			Object name = propertyAnyAttribute.get(i).getEStructuralFeature().getName();

			if (Objects.equals(name, "type")) {
				String value = (String) propertyAnyAttribute.get(i).getValue();

				// Find associated EDTDataType
				EDTDataType edtType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, value);
				if (edtType != null) {
					edtProperty.setECOASCAType(edtType);
				} else {
					throw new FailedImportException("The type " + value + " was not found");
				}

			} else if (Objects.equals(name, "library")) {
				String value = (String) propertyAnyAttribute.get(i).getValue();

				// Find associated Library
				edttype.Library libraryToBeAssociated = typeStep.findLibrary(value);
				if (libraryToBeAssociated != null) {
					edtProperty.setECOASCALibrary(libraryToBeAssociated);
				} else {
					throw new FailedImportException("No Library was found with the name " + value);
				}

			} else {
				missingElementsToLog.append("WARNING : The attribute " + name
						+ " is not managed in EDT (only type and library are managed), it will not be reexported\n");
			}
		}
		return edtProperty;
	}

	/**
	 * 
	 * @param contract
	 * @param ecoaInterface
	 * @param edtServiceQosList     : list of Qos
	 * @param serviceDefinitionList : list of ServiceDefinition
	 * @return edtInterface
	 * @throws FailedImportException if ServiceDefinition or Qos not found
	 */
	static void createEDTInterface(Contract contract, Interface ecoaInterface,
			List<ServiceInstanceQos> edtServiceQosList, Step1 step1) throws FailedImportException {
		String qos = ecoaInterface.getQos();
		if (qos != null) {
			edtqos.ServiceInstanceQos edtQoS = ServiceInstanceQos.findQoS(edtServiceQosList, qos);
			if (edtQoS != null) {
				contract.setSyntax(edtQoS.getServiceDefinition());
				contract.setQos(edtQoS);
			} else {
				throw new FailedImportException("No ServiceInstanceQos was found with the name:" + qos);
			}
		} else {
			String serviceDefinitionName = ecoaInterface.getSyntax();
			ServiceDefinition serviceDefinition = step1.findServiceDefinitionByName(serviceDefinitionName);
			if (serviceDefinition != null) {
				contract.setSyntax(serviceDefinition);
			} else {
				throw new FailedImportException("No ServiceInstanceQos was found with the name:" + qos);
			}

		}
	}

}
