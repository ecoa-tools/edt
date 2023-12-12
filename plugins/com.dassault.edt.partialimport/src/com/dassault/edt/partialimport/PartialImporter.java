/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package com.dassault.edt.partialimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;

import com.dassault.edt.converters.EDTProjectImportConverter;
import com.dassault.edt.converters.TypesImportConverter;
import com.dassault.edt.export.XMLExporterHelper;
import com.dassault.edt.log.EDTLog;
import com.dassault.edt.xmlimport.EcoaProjectImporter;
import com.dassault.edt.xmlimport.FailedImportException;
import com.dassault.edt.xmlimport.XMLImporterExtracter;
import com.dassault.edt.xmlimport.XMLImporterSecondaryExtracter;

import edtimplementation.ComponentImplementation;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;
import edttype.Library;
import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;
import technology.ecoa.project._2.projFactory;

/**
 * 
 * Partial Import
 *
 */
public class PartialImporter {

	private static final String THE_FILE = "The file ";
	private static final String DOES_NOT_EXIST = " does not exist.";
	private static final String EUID_MAP_ID = "ID";
	private static final String COMPONENT_IMPLEMENTATION_MAP_ID = "CI";
	private static final String COMPONENT_DEFINITION_MAP_ID = "CD";
	private static final String SERVICE_DEFINITION_MAP_ID = "SD";
	private static final String TYPE_MAP_ID = "TYPE";
	private EcoaProject ecoaProject;
	private String stepDirectory;
	private Steps steps;
	private LinkedHashMap<String, ArrayList<String>> findFilesToImport;

	/**
	 * Constructor
	 * 
	 * @param importPath     : path of ECOA project.xml
	 * @param currentProject : current project open in EDT
	 * @throws FileNotFoundException : if project.xml not found
	 * @throws FailedImportException : if problem during project.xml reading
	 */
	public PartialImporter(String importPath, Steps currentProject)
			throws FileNotFoundException, FailedImportException {
		steps = currentProject;
		setEcoaProject(importPath);
	}

	/**
	 * Get all files that are not present in current project and find last step id
	 * that will be modified
	 * 
	 * @param projectFilePath : filepath of project.xml
	 * @param currentProject  : current model
	 * @throws FailedImportException : if failure when importing
	 * @throws FileNotFoundException : if ECOA project not found
	 * @return id of last step added
	 */
	public int findNumberOfStepsToImport() throws FailedImportException, FileNotFoundException {
		int numberOfStepsToExport = -1;
		if (ecoaProject != null) {
			numberOfStepsToExport = findFilesToImport(ecoaProject);
			if (findFilesToImport != null && !findFilesToImport.isEmpty()) {
				EDTLog.toConsole("The following file will be imported:");
				for (Entry<String, ArrayList<String>> entry : findFilesToImport.entrySet()) {
					String key = entry.getKey();
					ArrayList<String> val = entry.getValue();
					for (String file : val) {
						EDTLog.toConsole(file);
					}
				}
			} else {
				EDTLog.toPopUpAndConsole("No file(s) to import were found.", "");
			}
		}

		return numberOfStepsToExport;
	}

	/**
	 * Add new files to previously exported project to create overall project to
	 * verify
	 * 
	 * @param path : path of temporary export directory
	 * @throws FailedImportException : if ECOA Project.xml is not readable
	 * @throws IOException           : if copy does not work
	 */
	public void verifyWithNewFiles(String path) throws FailedImportException, IOException {
		File newStepDirectory = new File(path + File.separator + "exportTest" + File.separator + "Steps");
		File projectFile = new File(newStepDirectory, "exportTest.project.xml");
		// Verify that the directory contains steps subdirectory else throws
		// error
		if (projectFile.exists() && projectFile.getName().endsWith(".project.xml")) {

			// Find EcoaProject or create it from parsing
			EcoaProject exportedEcoaProject = EcoaProjectImporter.extractEcoaProjectFromFile(projectFile);
			for (Entry<String, ArrayList<String>> entry : findFilesToImport.entrySet()) {
				String key = entry.getKey();
				ArrayList<String> val = entry.getValue();
				if (key.equals(TYPE_MAP_ID)) {
					copyTypesAndAddToProjectXML(newStepDirectory, exportedEcoaProject, val);
				} else if (key.equals(SERVICE_DEFINITION_MAP_ID)) {
					copyServiceDefinitionAndAddToProjectXML(newStepDirectory, exportedEcoaProject, val);
				} else if (key.equals(COMPONENT_DEFINITION_MAP_ID)) {
					copyComponentDefinitionAndAddToProjectXML(newStepDirectory, exportedEcoaProject, val);
				} else if (key.equals(COMPONENT_IMPLEMENTATION_MAP_ID)) {
					copyComponentImplementationAndAddToProjectXML(newStepDirectory, exportedEcoaProject, val);
				} else if (key.equals(EUID_MAP_ID)) {
					copyEUIDAndAddToProjectXML(newStepDirectory, exportedEcoaProject, val);
				}
			}
			XMLExporterHelper.exportContent(projectFile, exportedEcoaProject, "xml");
		}
	}

	/**
	 * @param newStepDirectory
	 * @param exportedEcoaProject
	 * @param val
	 * @throws IOException
	 */
	protected void copyEUIDAndAddToProjectXML(File newStepDirectory, EcoaProject exportedEcoaProject,
			ArrayList<String> val) throws IOException {
		boolean needToCreate = false;
		ELIEUIDs elieuiDs;
		if (exportedEcoaProject.getEUIDs().isEmpty()) {
			elieuiDs = projFactory.eINSTANCE.createELIEUIDs();
			needToCreate = true;
		} else {
			elieuiDs = exportedEcoaProject.getEUIDs().get(0);
		}
		for (String fileRelativePath : val) {
			elieuiDs.getEUID().add(fileRelativePath);
			File file = new File(stepDirectory, fileRelativePath);
			File newFile = new File(newStepDirectory, fileRelativePath);
			File newParentFile = newFile.getParentFile();
			newParentFile.mkdirs();
			java.nio.file.Files.copy(file.toPath(), newFile.toPath());
		}
		if (needToCreate) {
			exportedEcoaProject.getEUIDs().add(elieuiDs);
		}
	}

	/**
	 * @param newStepDirectory
	 * @param exportedEcoaProject
	 * @param val
	 * @throws IOException
	 */
	protected void copyComponentImplementationAndAddToProjectXML(File newStepDirectory, EcoaProject exportedEcoaProject,
			ArrayList<String> val) throws IOException {
		boolean needToCreate = false;
		Files ciFiles;
		if (exportedEcoaProject.getComponentImplementations().isEmpty()) {
			ciFiles = projFactory.eINSTANCE.createFiles();
			needToCreate = true;
		} else {
			ciFiles = exportedEcoaProject.getComponentImplementations().get(0);
		}
		for (String fileRelativePath : val) {
			ciFiles.getFile().add(fileRelativePath);
			File file = new File(stepDirectory, fileRelativePath);
			File newFile = new File(newStepDirectory, fileRelativePath);
			File parentFile = file.getParentFile();
			File newParentFile = newFile.getParentFile();
			newParentFile.mkdirs();
			java.nio.file.Files.copy(file.toPath(), newFile.toPath());
			File[] dependenciesToCopy = parentFile.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					return (name.toLowerCase().endsWith(".interface.qos.xml")
							|| name.toLowerCase().endsWith(".behaviour.xml")
							|| name.toLowerCase().endsWith("bin-desc.xml"));
				}
			});
			for (File dependency : dependenciesToCopy) {
				File newFileDependency = new File(newParentFile, dependency.getName());
				java.nio.file.Files.copy(dependency.toPath(), newFileDependency.toPath());
			}
		}
		if (needToCreate) {
			exportedEcoaProject.getComponentImplementations().add(ciFiles);
		}
	}

	/**
	 * @param newStepDirectory
	 * @param exportedEcoaProject
	 * @param val
	 * @throws IOException
	 */
	protected void copyComponentDefinitionAndAddToProjectXML(File newStepDirectory, EcoaProject exportedEcoaProject,
			ArrayList<String> val) throws IOException {
		boolean needToCreate = false;
		Files cdFiles;
		if (exportedEcoaProject.getComponentDefinitions().isEmpty()) {
			cdFiles = projFactory.eINSTANCE.createFiles();
			needToCreate = true;
		} else {
			cdFiles = exportedEcoaProject.getComponentDefinitions().get(0);
		}
		for (String fileRelativePath : val) {
			cdFiles.getFile().add(fileRelativePath);
			File file = new File(stepDirectory, fileRelativePath);
			File newFile = new File(newStepDirectory, fileRelativePath);
			File parentFile = file.getParentFile();
			File newParentFile = newFile.getParentFile();
			newParentFile.mkdirs();
			java.nio.file.Files.copy(file.toPath(), newFile.toPath());
			File[] dependenciesToCopy = parentFile.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".interface.qos.xml");
				}
			});
			for (File dependency : dependenciesToCopy) {
				File newFileDependency = new File(newParentFile, dependency.getName());
				java.nio.file.Files.copy(dependency.toPath(), newFileDependency.toPath());
			}
		}
		if (needToCreate) {
			exportedEcoaProject.getComponentDefinitions().add(cdFiles);
		}
	}

	/**
	 * @param newStepDirectory
	 * @param exportedEcoaProject
	 * @param val
	 * @throws IOException
	 */
	protected void copyServiceDefinitionAndAddToProjectXML(File newStepDirectory, EcoaProject exportedEcoaProject,
			ArrayList<String> val) throws IOException {
		boolean needToCreate = false;
		Files sdFiles;
		if (exportedEcoaProject.getServiceDefinitions().isEmpty()) {
			sdFiles = projFactory.eINSTANCE.createFiles();
			needToCreate = true;
		} else {
			sdFiles = exportedEcoaProject.getServiceDefinitions().get(0);
		}
		for (String fileRelativePath : val) {
			sdFiles.getFile().add(fileRelativePath);
			File file = new File(stepDirectory, fileRelativePath);
			File newFile = new File(newStepDirectory, fileRelativePath);
			File newParentFile = newFile.getParentFile();
			newParentFile.mkdirs();
			java.nio.file.Files.copy(file.toPath(), newFile.toPath());
		}
		if (needToCreate) {
			exportedEcoaProject.getServiceDefinitions().add(sdFiles);
		}
	}

	/**
	 * @param newStepDirectory
	 * @param exportedEcoaProject
	 * @param val
	 * @throws IOException
	 */
	protected void copyTypesAndAddToProjectXML(File newStepDirectory, EcoaProject exportedEcoaProject,
			ArrayList<String> val) throws IOException {
		boolean needToCreate = false;
		Files typeFiles;
		if (exportedEcoaProject.getTypes().isEmpty()) {
			typeFiles = projFactory.eINSTANCE.createFiles();
			needToCreate = true;
		} else {
			typeFiles = exportedEcoaProject.getTypes().get(0);
		}
		for (String fileRelativePath : val) {
			typeFiles.getFile().add(fileRelativePath);
			File file = new File(stepDirectory, fileRelativePath);
			File newFile = new File(newStepDirectory, fileRelativePath);
			File newParentFile = newFile.getParentFile();
			newParentFile.mkdirs();
			java.nio.file.Files.copy(file.toPath(), newFile.toPath());
		}
		if (needToCreate) {

			exportedEcoaProject.getTypes().add(typeFiles);
		}
	}

	/**
	 * Import the files and add them to current project
	 * 
	 * @param session                          : Sirius session
	 * @param missingElementsToLog             : elements that are not imported
	 * @param componentImplementationToDiagram
	 */
	public void addToCurrentProject(Session session, StringBuilder missingElementsToLog,
			ArrayList<ComponentImplementation> componentImplementationToDiagram) {
		StringBuilder popupToDisplay = new StringBuilder();
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
		CommandStack commandStack = transactionalEditingDomain.getCommandStack();
		RecordingCommand recordingCommand = new RecordingCommand(transactionalEditingDomain) {

			@Override
			protected void doExecute() {
				ArrayList<String> importedSuccessfully = new ArrayList<>();
				int numberOfFilesToImport = 0;
				try {
					XMLImporterExtracter extracter = new XMLImporterExtracter(steps);
					if (findFilesToImport != null && !findFilesToImport.isEmpty()) {

//						Import types
						if (findFilesToImport.containsKey(TYPE_MAP_ID)) {
							importTypes(importedSuccessfully);
							numberOfFilesToImport = numberOfFilesToImport + findFilesToImport.get(TYPE_MAP_ID).size();
						}

//						Import ServiceDefinitions
						if (findFilesToImport.containsKey(SERVICE_DEFINITION_MAP_ID)) {
							importSD(extracter, importedSuccessfully);
							numberOfFilesToImport = numberOfFilesToImport
									+ findFilesToImport.get(SERVICE_DEFINITION_MAP_ID).size();
						}

//						Import ComponentDefinitions
						if (findFilesToImport.containsKey(COMPONENT_DEFINITION_MAP_ID)) {
							importCD(missingElementsToLog, extracter, importedSuccessfully);
							numberOfFilesToImport = numberOfFilesToImport
									+ findFilesToImport.get(COMPONENT_DEFINITION_MAP_ID).size();
						}

//						Import ComponentImplementations
						if (findFilesToImport.containsKey(COMPONENT_IMPLEMENTATION_MAP_ID)) {
							importCI(missingElementsToLog, popupToDisplay, extracter, importedSuccessfully,
									componentImplementationToDiagram);
							numberOfFilesToImport = numberOfFilesToImport
									+ findFilesToImport.get(COMPONENT_IMPLEMENTATION_MAP_ID).size();
						}

//						Import EUIDS
						if (findFilesToImport.containsKey(EUID_MAP_ID)) {
							importIDs(extracter, importedSuccessfully);
							numberOfFilesToImport = numberOfFilesToImport + findFilesToImport.get(EUID_MAP_ID).size();
						}
					}
					if (!popupToDisplay.isEmpty()) {
						EDTLog.displayPopUp(popupToDisplay.toString());
					}
					EDTLog.toConsoleSeparationLine();
					String message = null;
					if (!missingElementsToLog.isEmpty()) {
						message = "Partial Import successful but with missing elements. See console for more details.";
					} else {
						message = "Partial Import successful";
					}
					EDTLog.toPopUpAndConsole(message, "");
				} catch (FileNotFoundException | FailedImportException e) {
					String message = null;
					if (importedSuccessfully.size() > 0) {
						int filesToImportSize = findFilesToImport.values().stream().mapToInt(List::size).sum();
						message = "Partial import failed for some files : " + importedSuccessfully.size() + "/"
								+ filesToImportSize + " files were successfully imported, see console for more details";
					} else {
						message = "Partial Import failed. See console for more informations";
					}
					EDTLog.toPopUpAndConsole(message, e.getMessage());
					for (Entry<String, ArrayList<String>> entry : findFilesToImport.entrySet()) {
						String key = entry.getKey();
						ArrayList<String> val = entry.getValue();
						for (String string : val) {
							if (!importedSuccessfully.contains(string)) {
								EDTLog.toConsole("The file " + string + " was not imported.");
							} else {
								EDTLog.toConsole("The file " + string + " was imported successfully.");
							}
						}
					}
					e.printStackTrace();
				}

			}
		};
		commandStack.execute(recordingCommand);

	}

	/**
	 * @param extracter
	 * @param importedSuccessfully
	 * @throws FileNotFoundException
	 * @throws FailedImportException
	 */
	protected void importIDs(XMLImporterExtracter extracter, ArrayList<String> importedSuccessfully)
			throws FileNotFoundException, FailedImportException {
		ArrayList<String> val = findFilesToImport.get(EUID_MAP_ID);
		EDTLog.toConsoleSeparationLine();
		for (String fileName : val) {
			File file = new File(stepDirectory, fileName);
			steps.getStep5().getIDS().add(XMLImporterSecondaryExtracter.extractEUID(file, steps));
			importedSuccessfully.add(fileName);
		}
	}

	/**
	 * @param missingElementsToLog
	 * @param extracter
	 * @param importedSuccessfully
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	protected void importCD(StringBuilder missingElementsToLog, XMLImporterExtracter extracter,
			ArrayList<String> importedSuccessfully) throws FailedImportException, FileNotFoundException {
		ArrayList<String> val = findFilesToImport.get(COMPONENT_DEFINITION_MAP_ID);
		EDTLog.toConsoleSeparationLine();
		for (String fileName : val) {
			File file = new File(stepDirectory, fileName);
			steps.getStep2().getComponentDefinitions()
					.add(extracter.extractComponentDefinition(file, missingElementsToLog));
			importedSuccessfully.add(fileName);
		}
	}

	/**
	 * @param projectFilePath
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	private void setEcoaProject(String projectFilePath) throws FailedImportException, FileNotFoundException {
		File projectFile = new File(projectFilePath);
		// Verify that the directory contains steps subdirectory else throws
		// error
		if (projectFile.exists() && projectFile.getName().endsWith(".project.xml")) {
			// Steps sub-directory creation
			stepDirectory = projectFile.getParentFile().getAbsolutePath();

			// Find EcoaProject or create it from parsing
			ecoaProject = EcoaProjectImporter.extractEcoaProjectFromFile(projectFile);
		}
	}

	/**
	 * Find files to import (not in current project)
	 * 
	 * @param currentProject : Steps already in project
	 * @param newProject     : ECOA Project.xml
	 * @return Hashmap of file path to import
	 * @throws FileNotFoundException : if files are not found
	 */
	public int findFilesToImport(EcoaProject newProject) throws FileNotFoundException {
		int addedSteps = -1;
		findFilesToImport = new LinkedHashMap<>();
		EList<Files> types = newProject.getTypes();
		for (Files files : types) {
			EList<String> typeFileList = files.getFile();
			for (String filePath : typeFileList) {
				if (findTypesToImport(filePath)) {
					addedSteps = 0;
				}
			}
		}

		EList<Files> serviceDefinitions = newProject.getServiceDefinitions();
		for (Files files : serviceDefinitions) {
			EList<String> sdFilesList = files.getFile();
			for (String filePath : sdFilesList) {
				if (findSDToImport(filePath)) {
					addedSteps = 1;
				}
			}
		}

		EList<Files> componentDefinitions = newProject.getComponentDefinitions();
		for (Files files : componentDefinitions) {
			EList<String> cdFilesList = files.getFile();
			for (String filePath : cdFilesList) {
				if (findCDToImport(filePath)) {
					addedSteps = 2;
				}
			}
		}

		EList<Files> componentImplementations = newProject.getComponentImplementations();
		for (Files files : componentImplementations) {
			EList<String> ciFilesList = files.getFile();
			for (String filePath : ciFilesList) {
				if (findCIToImport(filePath)) {
					addedSteps = 4;
				}
			}
		}

		EList<ELIEUIDs> euiDs = newProject.getEUIDs();
		for (ELIEUIDs elieuiDes : euiDs) {
			EList<String> euid = elieuiDes.getEUID();
			for (String filePath : euid) {
				if (findEUIDToImport(filePath)) {
					addedSteps = 5;
				}
				;
			}
		}

		return addedSteps;
	}

	/**
	 * @param addedSteps
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected boolean findEUIDToImport(String filePath) throws FileNotFoundException {
		boolean added = false;
		if (!filePath.isBlank()) {
			var file = new File(stepDirectory, filePath);
			String filename = file.getName();
			String idName = EDTProjectImportConverter.getObjectName(filename, ".ids.xml");
			Step5 step5 = steps.getStep5();
			if (step5.findIDMap(idName) == null && file.exists()) {
				addToHashmap(filePath, EUID_MAP_ID);

				added = true;
			} else if (!file.exists()) {
				throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + DOES_NOT_EXIST);
			}
		}
		return added;
	}

	/**
	 * @param addedSteps
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected boolean findCIToImport(String filePath) throws FileNotFoundException {
		boolean added = false;
		if (!filePath.isBlank()) {
			var file = new File(stepDirectory, filePath);
			String filename = file.getName();
			String cdName = EDTProjectImportConverter.getObjectName(filename, ".impl.xml");
			Step4 step4 = steps.getStep4();
			if (step4.findComponentImplementationByName(cdName) == null && file.exists()) {
				addToHashmap(filePath, COMPONENT_IMPLEMENTATION_MAP_ID);
				added = true;
			} else if (!file.exists()) {
				throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + DOES_NOT_EXIST);
			}
		}
		return added;
	}

	/**
	 * @param addedSteps
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected boolean findCDToImport(String filePath) throws FileNotFoundException {
		boolean added = false;
		if (!filePath.isBlank()) {
			var file = new File(stepDirectory, filePath);
			String filename = file.getName();
			String cdName = EDTProjectImportConverter.getObjectName(filename, ".componentType");
			Step2 step2 = steps.getStep2();
			if (step2.findComponentDefinitionByName(cdName) == null && file.exists()) {
				addToHashmap(filePath, COMPONENT_DEFINITION_MAP_ID);
				added = true;
			} else if (!file.exists()) {
				throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + DOES_NOT_EXIST);
			}
		}
		return added;
	}

	/**
	 * @param addedSteps
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected boolean findSDToImport(String filePath) throws FileNotFoundException {
		boolean added = false;
		if (!filePath.isBlank()) {

			var file = new File(stepDirectory, filePath);
			String filename = file.getName();
			String sdName = EDTProjectImportConverter.getObjectName(filename, ".interface.xml");
			Step1 step1 = steps.getStep1();
			if (step1.findServiceDefinitionByName(sdName) == null && file.exists()) {
				addToHashmap(filePath, SERVICE_DEFINITION_MAP_ID);
				added = true;
			} else if (!file.exists()) {
				throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + DOES_NOT_EXIST);
			}
		}
		return added;
	}

	/**
	 * @param addedSteps
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected boolean findTypesToImport(String filePath) throws FileNotFoundException {
		boolean added = false;
		if (!filePath.isBlank()) {

			var file = new File(stepDirectory, filePath);
			String filename = file.getName();
			String typeName = EDTProjectImportConverter.getObjectName(filename, ".types.xml");
			Step0 step0 = steps.getStep0();
			if (step0.findLibrary(typeName) == null && file.exists()) {
				addToHashmap(filePath, TYPE_MAP_ID);
				added = true;
			} else if (!file.exists()) {
				throw new FileNotFoundException(THE_FILE + file.getAbsolutePath() + DOES_NOT_EXIST);
			}
		}
		return added;
	}

	/**
	 * @param filePath
	 */
	private void addToHashmap(String filePath, String key) {
		filePath = filePath.replace("\\", "/");
		if (!findFilesToImport.containsKey(key)) {
			findFilesToImport.put(key, new ArrayList<>());
		}
		findFilesToImport.get(key).add(filePath);
	}

	/**
	 * @param importedSuccessfully
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	protected void importTypes(ArrayList<String> importedSuccessfully)
			throws FailedImportException, FileNotFoundException {
		ArrayList<String> val = findFilesToImport.get(TYPE_MAP_ID);
		EDTLog.toConsoleSeparationLine();
		Map<Library, ArrayList<String>> associatedUsedLibraries = new HashMap<>();
		HashMap<EObject, String> associatedUsedTypes = new HashMap<>();
		ArrayList<EObject> associatedConstantToTypes = new ArrayList<>();
		ArrayList<edttype.Library> librariesToAdd = new ArrayList<>();
		for (String fileName : val) {
			File file = new File(stepDirectory, fileName);
			Library extractedType = XMLImporterSecondaryExtracter.extractTypes(file, associatedUsedLibraries,
					associatedUsedTypes, associatedConstantToTypes);
			steps.getStep0().getTypes().add(extractedType);
			librariesToAdd.add(extractedType);
		}
		try {
			// Associate Types to referenced type and libraries to used Libraries
			// after every libraries and types are created
			TypesImportConverter.findAndAssociateUsedLibraries(associatedUsedLibraries, steps.getStep0());
			TypesImportConverter.findAndAssociateTypes(associatedUsedTypes, steps.getStep0());
			TypesImportConverter.findAndAssociateConstant(associatedConstantToTypes);
			steps.getStep0().getTypes().addAll(librariesToAdd);
		} catch (FailedImportException e) {
			steps.getStep0().getTypes().removeAll(librariesToAdd);
			throw e;
		}
		importedSuccessfully.addAll(val);
	}

	/**
	 * @param extracter
	 * @param importedSuccessfully
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	protected void importSD(XMLImporterExtracter extracter, ArrayList<String> importedSuccessfully)
			throws FailedImportException, FileNotFoundException {
		ArrayList<String> val = findFilesToImport.get(SERVICE_DEFINITION_MAP_ID);
		EDTLog.toConsoleSeparationLine();
		for (String fileName : val) {
			File file = new File(stepDirectory, fileName);
			steps.getStep1().getServices().add(extracter.extractServiceDefinition(file));
			importedSuccessfully.add(fileName);
		}
	}

	/**
	 * @param missingElementsToLog
	 * @param popupToDisplay
	 * @param extracter
	 * @param importedSuccessfully
	 * @param componentImplementationToDiagram
	 * @throws FailedImportException
	 * @throws FileNotFoundException
	 */
	protected void importCI(StringBuilder missingElementsToLog, StringBuilder popupToDisplay,
			XMLImporterExtracter extracter, ArrayList<String> importedSuccessfully,
			ArrayList<ComponentImplementation> componentImplementationToDiagram)
			throws FailedImportException, FileNotFoundException {
		ArrayList<String> val = findFilesToImport.get(COMPONENT_IMPLEMENTATION_MAP_ID);
		EDTLog.toConsoleSeparationLine();
		for (String fileName : val) {
			File file = new File(stepDirectory, fileName);
			ComponentImplementation newComponentImplementation = extracter.extractComponentImplementation(file,
					missingElementsToLog, popupToDisplay);
			steps.getStep4().getComponentImplementations().add(newComponentImplementation);
			importedSuccessfully.add(fileName);
			componentImplementationToDiagram.add(newComponentImplementation);
		}
	}

}
