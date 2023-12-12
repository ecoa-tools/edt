/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.export;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.dassault.edt.converters.AssemblyExportConverter;
import com.dassault.edt.converters.BinDescExportConverter;
import com.dassault.edt.converters.ComponentDefinitionExportConverter;
import com.dassault.edt.converters.ComponentImplementationExportConverter;
import com.dassault.edt.converters.DeploymentExportConverter;
import com.dassault.edt.converters.EDTProjectExportConverter;
import com.dassault.edt.converters.LogicalSystemExportConverter;
import com.dassault.edt.converters.ServiceDefinitionExportConverter;
import com.dassault.edt.converters.ServiceQosExportConverter;
import com.dassault.edt.converters.TypesExportConverter;
import com.dassault.edt.converters.UDPBindingExportConverter;
import com.dassault.edt.converters.UIDExportConverter;
import com.dassault.edt.log.EDTLog;

import edtbin.BinDesc;
import edtimplementation.ComponentImplementation;
import edtinterface.ServiceDefinition;
import edtproject.ComponentDefinition;
import edtproject.Composite;
import edtproject.Step;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step3;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;
import edtqos.ServiceInstanceQos;
import edttype.Library;
import edtudp.UDPBinding;
import edtuid.IDMap;
import technology.ecoa.insertion.policy._2.polFactory;
import technology.ecoa.types._2.DocumentRoot;
import temp.CrossPlatformView;
import temp.ModuleBehaviour;

/**
 * Class to export XML that converts EDT Objects (from graphicalView) to ECOA
 * Objects
 * 
 */
public class XMLExporter {

	private static final String IS_EXPORTING = " is exporting";

	/**
	 * Read ECOADTModel, convert it to Steps and export the project
	 * 
	 * @param path        : path of model.Ecoadt
	 * @param outputPath  : path to export
	 * @param projectName : name of project given by user
	 * @throws IOException : thrown when creating Folders and exporting files
	 * @return 0-5 The level of ecoa-exvt verification step
	 */
	public int launchFromEcoadtFile(String path, String outputPath, String projectName) throws IOException {
		Steps edtProject = XMLExporterHelper.readEcoADTFile(path);
		return launchFromObject(edtProject, outputPath, projectName, 5);
	}

	/**
	 * Export from EDT Object
	 * 
	 * @param edtProject      : Project object to be exported
	 * @param outputPath      : path the project folder will be exported to.
	 * @param projectName     : name of the project
	 * @param maxExportedStep : id of last step to be exported
	 * @throws IOException : thrown when creating file or exporting
	 * @return 0-5 The level of ecoa-exvt verification step
	 */
	public int launchFromObject(Steps edtProject, String outputPath, String projectName, int maxExportedStep)
			throws IOException {
		EDTLog.toConsoleSeparationLine();
		EDTLog.toConsoleSeparationLine();
		int exportStep = -1;
		EList<Step> steps = edtProject.getStep();
		String stepsRelativePath = projectName + File.separator + "Steps";

		// Export EcoaProject
		var projectFilePath = new File(new File(outputPath, stepsRelativePath), projectName + ".project.xml");
		XMLExporterHelper.exportContent(projectFilePath,
				EDTProjectExportConverter.recreateEcoaProject(edtProject, projectName), "xml");

		for (Step stepImplementation : steps) {
			var path = Paths.get(outputPath, stepsRelativePath, stepImplementation.getFolderName());
			Files.createDirectories(path);

			if (stepImplementation instanceof Step0 step) {
				exportStep = exportStep0(exportStep, path, step);

			} else if (stepImplementation instanceof Step1 step && maxExportedStep > 0) {
				exportStep = exportStep1(exportStep, path, step);

			} else if (stepImplementation instanceof Step2 step && maxExportedStep > 1) {
				exportStep = exportStep2(exportStep, path, step);

			} else if (stepImplementation instanceof Step3 step && maxExportedStep > 2) {
				exportStep = exportStep3(exportStep, path, step);
			} else if (stepImplementation instanceof Step4 step && maxExportedStep > 3) {
				exportStep = exportStep4(exportStep, path, step);
			} else if (stepImplementation instanceof Step5 step && maxExportedStep > 4) {
				exportStep = exportStep5(exportStep, path, step);
			}
		}
		EDTLog.toConsoleSeparationLine();
		EDTLog.toConsoleSeparationLine();
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step5
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep5(int exportStep, Path path, Step5 step) throws IOException {
		EDTLog.toConsoleSeparationLine();
		Composite edtFinalAssembly = step.getFinalAssembly().getFinalAssembly();
		if (edtFinalAssembly != null && EDTProjectExportConverter.implementationSetInComponent(edtFinalAssembly)) {
			var filePath = new File(path.toFile(), step.getFinalAssembly().getName() + ".impl.composite");
			EDTLog.toConsole("\nFinalAssembly " + filePath.getName() + IS_EXPORTING);

			org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot ecoaComposite = AssemblyExportConverter
					.recreateComposite(edtFinalAssembly, true, step.getFinalAssembly().getName());
			XMLExporterHelper.exportContent(filePath, ecoaComposite, "composite");
			exportStep = Math.max(exportStep, 5);

		}
		edtlogical.LogicalSystem edtLogicalSystem = step.getLogicalSystem();
		if (edtLogicalSystem != null) {
			technology.ecoa.logicalsystem._2.DocumentRoot ecoaLogicalSystem = LogicalSystemExportConverter
					.recreateECOALogicalSystem(edtLogicalSystem);
			var filePath = new File(path.toFile(), step.getLogicalSystem().getFileNamePrefix() + ".logical-system.xml");
			EDTLog.toConsole("\nLogicalSystem " + filePath.getName() + IS_EXPORTING);

			XMLExporterHelper.exportContent(filePath, ecoaLogicalSystem, "xml");
			exportStep = Math.max(exportStep, 5);
		}
		EList<UDPBinding> udpBindings = step.getUDPBindings();
		if (udpBindings != null && !udpBindings.isEmpty()) {
			for (UDPBinding udpBinding : udpBindings) {
				technology.ecoa.udpbinding._2.DocumentRoot documentRoot = UDPBindingExportConverter
						.recreateECOAUDPBinding(udpBinding);
				var filePath = new File(path.toFile(), udpBinding.getName());
				EDTLog.toConsole("\nUDPBinding " + filePath.getName() + IS_EXPORTING);

				XMLExporterHelper.exportContent(filePath, documentRoot, "xml");
				exportStep = Math.max(exportStep, 5);
			}
		}

		edtdeployment.Deployment deployment = step.getDeployment();
		if (deployment != null) {
			technology.ecoa.deployment._2.DocumentRoot documentRoot = DeploymentExportConverter
					.recreateECOADeployment(deployment);

			var filePath = new File(path.toFile(), deployment.getName() + ".deployment.xml");
			EDTLog.toConsole("\nDeployment " + filePath.getName() + IS_EXPORTING);

			XMLExporterHelper.exportContent(filePath, documentRoot, "xml");
			exportStep = Math.max(exportStep, 5);
		}

		CrossPlatformView crossPlatformView = step.getCrossPlatformView();
		if (crossPlatformView != null && crossPlatformView.getECOACrossPlatformView() != null) {
			technology.ecoa.cross.platforms.view._2.DocumentRoot documentRoot = technology.ecoa.cross.platforms.view._2.viewFactory.eINSTANCE
					.createDocumentRoot();
			documentRoot.setView(crossPlatformView.getECOACrossPlatformView());

			var filePath = new File(path.toFile(), crossPlatformView.getName());
			EDTLog.toConsole("\nCrossPlatformView " + filePath.getName() + IS_EXPORTING);

			XMLExporterHelper.exportContent(filePath, documentRoot, "xml");
			exportStep = Math.max(exportStep, 5);
		}

		EList<IDMap> ids = step.getIDS();
		for (IDMap id : ids) {
			exportIDMap(path, id);
			exportStep = Math.max(exportStep, 5);
		}
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step4
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep4(int exportStep, Path path, Step4 step) throws IOException {
		// Export ComponentType with conversion from EDT model instance
		// to EcoA model instance
		EDTLog.toConsoleSeparationLine();
		EList<ComponentImplementation> componentImplementations = step.getComponentImplementations();
		for (ComponentImplementation edtComponentImplementation : componentImplementations) {
			exportComponentImplementationAndSiblings(path, edtComponentImplementation);
		}
		if (!componentImplementations.isEmpty()) {
			exportStep = Math.max(exportStep, 4);
		}
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step3
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep3(int exportStep, Path path, Step3 step) throws IOException {
		// Export initialAssembly composite with conversion from EDT
		// model instance to EcoA model instance
		/* Export only if Composite contains components */
		EDTLog.toConsoleSeparationLine();
		Composite edtInitialAssembly = step.getInitialAssembly();
		if (edtInitialAssembly != null && !(edtInitialAssembly.getComponents().isEmpty())) {
			var filePath = new File(path.toFile(), edtInitialAssembly.getName() + ".composite");
			EDTLog.toConsole("\nInitialAssembly " + filePath.getName() + IS_EXPORTING);

			org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot ecoaComposite = AssemblyExportConverter
					.recreateComposite(edtInitialAssembly, false, edtInitialAssembly.getName());
			XMLExporterHelper.exportContent(filePath, ecoaComposite, "composite");
			exportStep = Math.max(exportStep, 3);
		}
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step2
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep2(int exportStep, Path path, Step2 step) throws IOException {
		// Export ComponentType with conversion from EDT model instance
		// to EcoA model instance
		EDTLog.toConsoleSeparationLine();
		EList<ComponentDefinition> componentDefinitions = step.getComponentDefinitions();
		for (ComponentDefinition edtComponentType : componentDefinitions) {
			exportComponentDefinitionAndQOS(path, edtComponentType);
		}
		if (!componentDefinitions.isEmpty()) {
			exportStep = Math.max(exportStep, 2);
		}
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step1
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep1(int exportStep, Path path, Step1 step) throws IOException {
		// Export service definition with conversion from EDT model
		// instance to EcoA model instance
		EDTLog.toConsoleSeparationLine();
		EList<edtinterface.ServiceDefinition> services = step.getServices();
		for (ServiceDefinition edtServiceDefinition : services) {
			exportServiceDefinition(path, edtServiceDefinition);
		}
		if (!services.isEmpty()) {
			exportStep = Math.max(exportStep, 1);
		}
		return exportStep;
	}

	/**
	 * @param exportStep : current last exported step
	 * @param path       : path of file
	 * @param step       : step0
	 * @return last exported step
	 * @throws IOException : if file can not be written
	 */
	protected int exportStep0(int exportStep, Path path, Step0 step) throws IOException {
		// Export types with conversion from EDT model instance to EcoA
		// model instance
		EDTLog.toConsoleSeparationLine();
		EList<Library> types = step.getTypes();
		for (Library edtLibrary : types) {
			exportTypes(path, edtLibrary);
		}
		if (!types.isEmpty()) {
			exportStep = Math.max(exportStep, 0);
		}
		return exportStep;
	}

	/**
	 * Convert EDT Library and export it
	 * 
	 * @param path
	 * @param edtLibrary
	 * @throws IOException
	 */
	private void exportTypes(Path path, Library edtLibrary) throws IOException {
		var filePath = new File(path.toFile(), edtLibrary.getName().replaceAll("\\.", "__") + ".types.xml");
		EDTLog.toConsole("\nNameSpace " + filePath.getName() + IS_EXPORTING);

		DocumentRoot ecoaLibrary = TypesExportConverter.recreateLibrary(edtLibrary);

		XMLExporterHelper.exportContent(filePath, ecoaLibrary, "xml");
	}

	/**
	 * Convert EDT ServiceDefinition and export it
	 * 
	 * @param path
	 * @param edtServiceDefinition
	 * @throws IOException
	 */
	private void exportServiceDefinition(Path path, edtinterface.ServiceDefinition edtServiceDefinition)
			throws IOException {
		var filePath = new File(path.toFile(), edtServiceDefinition.getName() + ".interface.xml");
		EDTLog.toConsole("\nServiceDefinition " + filePath.getName() + IS_EXPORTING);

		technology.ecoa.interface_._2.DocumentRoot ecoaServiceDefinition = ServiceDefinitionExportConverter
				.recreateServiceDefinition(edtServiceDefinition);

		XMLExporterHelper.exportContent(filePath, ecoaServiceDefinition, "xml");
	}

	/**
	 * Convert EDT ComponentDefinition and ServiceInstanceQos to ECOA and export
	 * them
	 * 
	 * @param path             : path of ComponentDefinition
	 * @param edtComponentType
	 * @throws IOException if error when exporting
	 */
	private void exportComponentDefinitionAndQOS(Path path, ComponentDefinition edtComponentType) throws IOException {
		var subdirectoryPath = new File(path.toFile(), edtComponentType.getName());

		var filePath = new File(subdirectoryPath, edtComponentType.getName() + ".componentType");
		EDTLog.toConsole("\nComponentDefinition " + filePath.getName() + IS_EXPORTING);

		org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot ecoaComponentDefinition = ComponentDefinitionExportConverter
				.recreateComponentType(edtComponentType);

		for (ServiceInstanceQos serviceInstanceQos : edtComponentType.getAssociatedServiceQos()) {
			exportServiceInstanceQos(subdirectoryPath, serviceInstanceQos);
		}

		XMLExporterHelper.exportContent(filePath, ecoaComponentDefinition, "xml");
	}

	/**
	 * Convert EDT ServiceInstanceQoS and export them
	 * 
	 * @param componentDefinitionSubDirectory
	 * @param edtQoS
	 * @throws IOException
	 */
	private void exportServiceInstanceQos(File componentDefinitionSubDirectory, ServiceInstanceQos edtQoS)
			throws IOException {
		var filePath = new File(componentDefinitionSubDirectory, edtQoS.getName() + ".interface.qos.xml");
		EDTLog.toConsole("\nService Instance QoS " + filePath.getName() + IS_EXPORTING);

		technology.ecoa.interface_.qos._2.DocumentRoot ecoaQoS = ServiceQosExportConverter.recreateQos(edtQoS);

		XMLExporterHelper.exportContent(filePath, ecoaQoS, "xml");
	}

	/**
	 * Convert EDT ComponentImplementation and ServiceInstanceQos to ECOA and export
	 * them
	 * 
	 * @param path                       : path of ComponentImplementation
	 * @param edtComponentImplementation
	 * @throws IOException if error when exporting
	 */
	private void exportComponentImplementationAndSiblings(Path path, ComponentImplementation edtComponentImplementation)
			throws IOException {
		var subdirectoryPath = new File(path.toFile(), edtComponentImplementation.getName());

		var filePath = new File(subdirectoryPath, edtComponentImplementation.getName() + ".impl.xml");
		EDTLog.toConsole("\nComponentImplementation " + filePath.getName() + IS_EXPORTING);

		// Export ComponentImplementation
		technology.ecoa.implementation._2.DocumentRoot ecoaComponentImplementation = ComponentImplementationExportConverter
				.recreateComponentImplementation(edtComponentImplementation);
		XMLExporterHelper.exportContent(filePath, ecoaComponentImplementation, "xml");

		// ExportQoS
		for (ServiceInstanceQos serviceInstanceQos : edtComponentImplementation.getAssociatedServiceQos()) {
			exportServiceInstanceQos(subdirectoryPath, serviceInstanceQos);
		}

		// Export ModuleBehaviours
		for (ModuleBehaviour moduleBehaviour : edtComponentImplementation.getModuleBehaviours()) {
			technology.ecoa.module.behaviour._2.DocumentRoot documentRoot = technology.ecoa.module.behaviour._2.modFactory.eINSTANCE
					.createDocumentRoot();
			documentRoot.setModuleBehaviour(EcoreUtil.copy(moduleBehaviour.getModuleBehaviour()));
			var moduleBehaviourFilePath = new File(subdirectoryPath, moduleBehaviour.getName() + ".behaviour.xml");
			EDTLog.toConsole("\nModuleBehaviour " + moduleBehaviourFilePath.getName() + IS_EXPORTING);
			XMLExporterHelper.exportContent(moduleBehaviourFilePath, documentRoot, "xml");
		}

		// Export BinDesc
		EList<BinDesc> binDescs = edtComponentImplementation.getBinDesc();
		for (BinDesc binDesc : binDescs) {
			technology.ecoa.bin.desc._2.DocumentRoot documentRoot = BinDescExportConverter.recreateECOABinDesc(binDesc,
					edtComponentImplementation.getName());
			var binDescFilePath = new File(subdirectoryPath, binDesc.getFileName());
			EDTLog.toConsole("\nBinDesc " + binDescFilePath.getName() + IS_EXPORTING);

			XMLExporterHelper.exportContent(binDescFilePath, documentRoot, "xml");
		}

		// Export InsertionPolicies
		if (edtComponentImplementation.getInsertionPolicyList() != null) {
			technology.ecoa.insertion.policy._2.DocumentRoot documentRoot = polFactory.eINSTANCE.createDocumentRoot();
			documentRoot.setInsertionPolicies(edtComponentImplementation.getInsertionPolicyList().getInsertionPolicy());
			var insertPolFilePath = new File(subdirectoryPath,
					edtComponentImplementation.getInsertionPolicyList().getName());
			XMLExporterHelper.exportContent(insertPolFilePath, documentRoot, "xml");
		}

	}

	/**
	 * Convert EDT IDMap and export it
	 * 
	 * @param path
	 * @param edtIDMap
	 * @throws IOException
	 */
	private void exportIDMap(Path path, edtuid.IDMap edtIDMap) throws IOException {
		var filePath = new File(path.toFile(), edtIDMap.getName() + ".ids.xml");
		EDTLog.toConsole("\nID " + filePath.getName() + IS_EXPORTING);

		technology.ecoa.uid._2.DocumentRoot ecoaIDMap = UIDExportConverter.recreateECOAIDMap(edtIDMap);

		XMLExporterHelper.exportContent(filePath, ecoaIDMap, "xml");
	}

}
