/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.dassault.edt.converters.EDTProjectImportConverter;
import com.dassault.edt.converters.TypesImportConverter;
import com.dassault.edt.log.EDTLog;

import edttype.Library;
import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;

/**
 * Class to import XML and convert them to EDT for graphical view
 * 
 */
public class XmlImporter {
	private static final String HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED = "have been detected. Only the first one, will be stored.";
	private static final String THE_FILE = "The file ";
	public static final String CAN_NOT_BE_IMPORTED_OR_EXPORTED_AT_THE_MOMENT = " is not supported by ECOA Design Tool. It will not be imported or exported.\n";
	private EcoaProject ecoaProject = null;
	private edtproject.Steps steps;
	private XMLImporterExtracter extracter;

	private String stepDirectory;

	/**
	 * Choice of method to use to import according to path being a directory or a
	 * project.xml
	 * 
	 * @param path                  : path of directory containing Steps or
	 *                              project.xml
	 * @param numberOfStepsToImport : 0 -> import only Step0, 1-> import only Step1,
	 *                              and so on
	 * @param missingElementsToLog  : log elements that can not be used in EDT
	 * @param trueSteps             : true number of Steps that could have been
	 *                              imported
	 * @return Steps object containing the ECOA-based XML converted to EDT model
	 * @throws FileNotFoundException : thrown if files does not exists, but in
	 *                               project.xml
	 * @throws FailedImportException : error during conversion
	 */
	public edtproject.Steps getEDTProject(String path, int numberOfStepsToImport, StringBuilder missingElementsToLog,
			int trueSteps) throws FileNotFoundException, FailedImportException {
		if (new File(path).isDirectory()) {
			return getEDTProjectFromDirectory(path, numberOfStepsToImport, missingElementsToLog, trueSteps);
		} else {
			return getEDTProjectFromProjectFile(path, numberOfStepsToImport, missingElementsToLog, trueSteps);
		}
	}

	/**
	 * Create EDTProject from Imported directory
	 * 
	 * @param directoryPath         : path of project directory containing Steps
	 *                              subdirectory
	 * @param numberOfStepsToImport : 0 -> import only Step0, 1-> import only Step1,
	 *                              and so on
	 * @param missingElementsToLog  : log elements that can not be used in EDT
	 * @param trueSteps             : true number of Steps that could have been
	 *                              imported
	 * @return EObject with Types, serviceDefinitions, ComponentDefinitions,
	 *         ServiceInstanceQoS and InitialAssembly from EDT model
	 * @throws FailedImportException : if no Steps directory was found or error
	 *                               during conversion
	 * @throws FileNotFoundException : if file present in project.xml does not
	 *                               exists
	 */
	public edtproject.Steps getEDTProjectFromDirectory(String directoryPath, int numberOfStepsToImport,
			StringBuilder missingElementsToLog, int trueSteps) throws FailedImportException, FileNotFoundException {
		// Verify that the directory contains steps subdirectory else throws
		// error
		if (new File(directoryPath, ImportUtils.STEPS_SUBDIR).exists()) {
			// Steps sub-directory creation
			stepDirectory = new File(directoryPath, ImportUtils.STEPS_SUBDIR).getAbsolutePath();

			// Find EcoaProject or create it from parsing
			ecoaProject = EcoaProjectImporter.getEcoaProject(stepDirectory);

			// Create basic Steps structure with all folder names and BasicTypes
			steps = EDTProjectImportConverter.createEDTProject(ecoaProject);
			extracter = new XMLImporterExtracter(steps);

			// Import all the files and convert them to EDT
			importAllFromProject(numberOfStepsToImport, missingElementsToLog);
			return steps;
		} else {
			throw new FailedImportException("No Steps directory was found");
		}
	}

	/**
	 * Create EDTProject from Imported project file
	 * 
	 * @param projectFilePath       : path of project directory containing Steps
	 *                              subdirectory
	 * @param numberOfStepsToImport : 0 -> import only Step0, 1-> import only Step1,
	 *                              and so on
	 * @param missingElementsToLog  : log elements that are not usable in EDT
	 * @param trueSteps             : true number of Steps that could have been
	 *                              imported
	 * @param projectName           : name of the project given by user
	 * @return EObject with Types, serviceDefinitions, ComponentDefinitions,
	 *         ServiceInstanceQoS and InitialAssembly from EDT model
	 * @throws FailedImportException : if no Steps directory was found or error
	 *                               during conversion
	 * @throws FileNotFoundException : if file present in project.xml does not
	 *                               exists
	 */
	public edtproject.Steps getEDTProjectFromProjectFile(String projectFilePath, int numberOfStepsToImport,
			StringBuilder missingElementsToLog, int trueSteps) throws FailedImportException, FileNotFoundException {
		File projectFile = new File(projectFilePath);
		// Verify that the directory contains steps subdirectory else throws
		// error
		if (projectFile.exists() && projectFile.getName().endsWith(".project.xml")) {
			// Steps sub-directory creation
			stepDirectory = projectFile.getParentFile().getAbsolutePath();

			// Find EcoaProject or create it from parsing
			ecoaProject = EcoaProjectImporter.extractEcoaProjectFromFile(projectFile);
			if (trueSteps != numberOfStepsToImport) {
				trueSteps = getTrueNumberOfStepsToImport();
			}
			// Create basic Steps structure with all folder names and BasicTypes
			steps = EDTProjectImportConverter.createEDTProject(ecoaProject);
			extracter = new XMLImporterExtracter(steps);

			// Import all the files and convert them to EDT
			importAllFromProject(numberOfStepsToImport, missingElementsToLog);
			return steps;
		} else {
			throw new FailedImportException("The project.xml does not exists");
		}
	}

	/**
	 * Find number of Steps present in project.xml
	 * 
	 * @return number of Steps
	 */
	private int getTrueNumberOfStepsToImport() {
		if ((ecoaProject.getDeploymentSchema() != null && !ecoaProject.getDeploymentSchema().isEmpty())
				|| (ecoaProject.getLogicalSystem() != null && !ecoaProject.getLogicalSystem().isEmpty())
				|| (ecoaProject.getImplementationAssembly() != null
						&& !ecoaProject.getImplementationAssembly().isEmpty())
				|| (ecoaProject.getEUIDs() != null && !ecoaProject.getEUIDs().isEmpty())
				|| (ecoaProject.getCrossPlatformsView() != null && !ecoaProject.getCrossPlatformsView().isEmpty())) {
			return 5;
		} else if (ecoaProject.getComponentImplementations() != null
				&& !ecoaProject.getComponentImplementations().isEmpty()) {
			return 4;
		} else if (ecoaProject.getInitialAssembly() != null && !ecoaProject.getInitialAssembly().isEmpty()) {
			return 3;
		} else if (ecoaProject.getComponentDefinitions() != null && !ecoaProject.getComponentDefinitions().isEmpty()) {
			return 2;
		} else if (ecoaProject.getServiceDefinitions() != null && !ecoaProject.getServiceDefinitions().isEmpty()) {
			return 1;
		}
		return 0;
	}

	/**
	 * Import all files and converts them and add them to Steps
	 * 
	 * WARNING only one directory per element is possible
	 * 
	 * @param numberOfStepsToImport : 0 -> import only Step0, 1-> import only Step1,
	 *                              and so on
	 * @param missingElementsToLog  : log elements that are not usable in EDT
	 * 
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	private void importAllFromProject(int numberOfStepsToImport, StringBuilder missingElementsToLog)
			throws FailedImportException, FileNotFoundException {

		EDTLog.toConsoleSeparationLine();

		StringBuilder popupToDisplay = new StringBuilder();
		boolean initialAssemblyExists = false;
		EList<String> outputDirectory = ecoaProject.getOutputDirectory();
		if (outputDirectory.size() > 1) {
			missingElementsToLog
					.append("Multiple outputDirectory " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (outputDirectory.size() > 0) {
			steps.getOutputDirectory().setName(outputDirectory.get(0));
		}
		if (numberOfStepsToImport >= 0) {
			importStep0();
		}

		if (numberOfStepsToImport >= 1) {
			importStep1();
		}

		if (numberOfStepsToImport >= 2) {
			importStep2(missingElementsToLog);
		}

		if (numberOfStepsToImport >= 3) {
			initialAssemblyExists = importStep3(missingElementsToLog, initialAssemblyExists);
		}

		if (numberOfStepsToImport >= 4) {
			importStep4(missingElementsToLog, popupToDisplay);
		}

		if (numberOfStepsToImport >= 5) {
			importStep5(missingElementsToLog, initialAssemblyExists, popupToDisplay);

		}
		if (!popupToDisplay.isEmpty()) {
			EDTLog.displayPopUp(popupToDisplay.toString());
		}
		EDTLog.toConsole("The import is finished.");
		EDTLog.toConsoleSeparationLine();
		EDTLog.toConsoleSeparationLine();
	}

	/**
	 * @param missingElementsToLog
	 * @param initialAssemblyExists
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void importStep5(StringBuilder missingElementsToLog, boolean initialAssemblyExists,
			StringBuilder popupToDisplay) throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
//			Get finalAssembly

		EList<String> implementationAssembly = ecoaProject.getImplementationAssembly();
		if (implementationAssembly.size() > 1) {
			missingElementsToLog
					.append("Multiple implementationAssembly " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (implementationAssembly.size() > 0) {
			String fileName = implementationAssembly.get(0);
			if (!fileName.isBlank()) {

				fileName = fileName.replace("\\", "/");
				var file = new File(stepDirectory, fileName);

				extracter.extractFinalAssembly(file, missingElementsToLog, initialAssemblyExists);
			}
		}

//			Get LogicalSystem
		EList<String> logicalSystem = ecoaProject.getLogicalSystem();
		if (logicalSystem.size() > 1) {
			missingElementsToLog
					.append("Multiple LogicalSystem " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (logicalSystem.size() > 0) {
			String fileName = logicalSystem.get(0);
			if (!fileName.isBlank()) {

				fileName = fileName.replace("\\", "/");
				var file = new File(stepDirectory, fileName);
				extracter.extractLogicalSystem(file, missingElementsToLog);
			}
		}

//			Get Deployment
		EList<String> deployment = ecoaProject.getDeploymentSchema();
		if (deployment.size() > 1) {
			missingElementsToLog.append("Multiple Deployment " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (deployment.size() > 0) {
			String fileName = deployment.get(0);
			if (!fileName.isBlank()) {

				fileName = fileName.replace("\\", "/");
				var file = new File(stepDirectory, fileName);
				steps.getStep5().setDeployment(extracter.extractDeployment(file, missingElementsToLog));
			}
		}

//			Get CrossPlatformView
		EList<String> crossPlatformView = ecoaProject.getCrossPlatformsView();
		if (crossPlatformView.size() > 1) {
			missingElementsToLog
					.append("Multiple CrossPlatformView " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (crossPlatformView.size() > 0) {
			String fileName = crossPlatformView.get(0);
			if (!fileName.isBlank()) {

				fileName = fileName.replace("\\", "/");
				var file = new File(stepDirectory, fileName);
				steps.getStep5().setCrossPlatformView(
						XMLImporterSecondaryExtracter.extractCrossPlatformView(file, missingElementsToLog));
			}
		}

//		Get IDs
		EList<ELIEUIDs> euiDs = ecoaProject.getEUIDs();
		for (ELIEUIDs elieuiDs : euiDs) {
			EList<String> euid = elieuiDs.getEUID();
			for (String fileName : euid) {
				if (!fileName.isBlank()) {

					fileName = fileName.replace("\\", "/");
					var file = new File(stepDirectory, fileName);
					steps.getStep5().getIDS().add(XMLImporterSecondaryExtracter.extractEUID(file, steps));
				}
			}
		}

		String folderName = steps.getStep5().getFolderName();
		File intStepFolder = new File(stepDirectory, folderName);
		File scaContributionFile = new File(intStepFolder, "sca-contribution.xml");
		if (scaContributionFile.exists()) {
			missingElementsToLog
					.append(THE_FILE + scaContributionFile.getName() + CAN_NOT_BE_IMPORTED_OR_EXPORTED_AT_THE_MOMENT);
			popupToDisplay
					.append(THE_FILE + scaContributionFile.getName() + CAN_NOT_BE_IMPORTED_OR_EXPORTED_AT_THE_MOMENT);

		}
	}

	/**
	 * @param missingElementsToLog
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void importStep4(StringBuilder missingElementsToLog, StringBuilder popupToDisplay)
			throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
		// Get ComponentImplementations
		EList<Files> componentImplementations = ecoaProject.getComponentImplementations();
		for (Files files : componentImplementations) {
			EList<String> componentImplementationFileList = files.getFile();
			for (String fileName : componentImplementationFileList) {
				if (!fileName.isBlank()) {
					fileName = fileName.replace("\\", "/");

					var file = new File(stepDirectory, fileName);
					steps.getStep4().getComponentImplementations()
							.add(extracter.extractComponentImplementation(file, missingElementsToLog, popupToDisplay));
				}
			}
		}
	}

	/**
	 * @param missingElementsToLog
	 * @param initialAssemblyExists
	 * @return
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private boolean importStep3(StringBuilder missingElementsToLog, boolean initialAssemblyExists)
			throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
		// Get initial assembly
		EList<String> initialAssembly = ecoaProject.getInitialAssembly();
		if (initialAssembly.size() > 1) {
			missingElementsToLog
					.append("Multiple Initial Assembly " + HAVE_BEEN_DETECTED_ONLY_THE_FIRST_ONE_WILL_BE_STORED);
		}
		if (initialAssembly.size() > 0) {
			String fileName = initialAssembly.get(0);
			if (!fileName.isBlank()) {
				initialAssemblyExists = true;
				fileName = fileName.replace("\\", "/");
				var file = new File(stepDirectory, fileName);
				extracter.extractInitialAssembly(file, missingElementsToLog);
			}
		}
		return initialAssemblyExists;
	}

	/**
	 * @param missingElementsToLog
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void importStep2(StringBuilder missingElementsToLog) throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
		// Get componentType
		EList<Files> componentType = ecoaProject.getComponentDefinitions();
		for (Files files : componentType) {
			EList<String> componentTypeFileList = files.getFile();
			for (String fileName : componentTypeFileList) {
				if (!fileName.isBlank()) {
					fileName = fileName.replace("\\", "/");

					var file = new File(stepDirectory, fileName);
					steps.getStep2().getComponentDefinitions()
							.add(extracter.extractComponentDefinition(file, missingElementsToLog));
				}
			}
		}
	}

	/**
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void importStep1() throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
		// Get serviceDefinitions
		EList<Files> service = ecoaProject.getServiceDefinitions();
		for (Files files : service) {
			EList<String> serviceFileList = files.getFile();
			for (String fileName : serviceFileList) {
				if (!fileName.isBlank()) {

					fileName = fileName.replace("\\", "/");
					var file = new File(stepDirectory, fileName);
					steps.getStep1().getServices().add(extracter.extractServiceDefinition(file));
				}
			}
		}
	}

	/**
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void importStep0() throws FailedImportException, FileNotFoundException {
		EDTLog.toConsoleSeparationLine();
		// Get types
		EList<Files> type = ecoaProject.getTypes();
		Map<Library, ArrayList<String>> associatedUsedLibraries = new HashMap<>();
		HashMap<EObject, String> associatedUsedTypes = new HashMap<>();
		ArrayList<EObject> associatedConstantToTypes = new ArrayList<>();

		for (Files files : type) {
			EList<String> typeFileList = files.getFile();
			for (String fileName : typeFileList) {
				if (!fileName.isBlank()) {

					fileName = fileName.replace("\\", "/");
					var file = new File(stepDirectory, fileName);
					steps.getStep0().getTypes().add(XMLImporterSecondaryExtracter.extractTypes(file,
							associatedUsedLibraries, associatedUsedTypes, associatedConstantToTypes));
				}
			}
		}
		// Associate Types to referenced type and libraries to used Libraries
		// after every libraries and types are created
		TypesImportConverter.findAndAssociateUsedLibraries(associatedUsedLibraries, steps.getStep0());
		TypesImportConverter.findAndAssociateTypes(associatedUsedTypes, steps.getStep0());
		TypesImportConverter.findAndAssociateConstant(associatedConstantToTypes);
	}

	/**
	 * Extract content of XML
	 * 
	 * @param file                : file to be read
	 * @param resourceFactoryImpl : EMF ResourceFactory to be used to read
	 * @param nameSpaceUri        : namespace of file
	 * @param eINSTANCE           : eInstance of package to be used
	 * @return EObject corresponding to file
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	static EObject extractContent(File file, ResourceFactoryImpl resourceFactoryImpl, String nameSpaceUri,
			EPackage eINSTANCE) throws FailedImportException, FileNotFoundException {
		if (file.exists()) {
			var uri = URI.createFileURI(file.getAbsolutePath());
			// Create ResourceSet
			ResourceSet resourceSet = new ResourceSetImpl();

			// Register the appropriate resource factory to handle all file
			// extensions.
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, resourceFactoryImpl);

			// Register the package to ensure it is available during loading.
			resourceSet.getPackageRegistry().put(nameSpaceUri, eINSTANCE);
			// Get the resource from URI/Parse XML
			Resource resource;
			try {
				resource = resourceSet.getResource(uri, true);
				resource.load(Collections.emptyMap());
			} catch (IOException | WrappedException e) {
				e.printStackTrace();
				throw new FailedImportException("Error during XML reading of " + file.getName(), e);
			}
			// Get content of the xml
			return resource.getContents().get(0);
		} else {
			throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + " does not exist.");
		}
	}
}
