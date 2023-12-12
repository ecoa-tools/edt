/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

import java.io.File;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.dassault.edt.log.EDTLog;

import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;
import technology.ecoa.project._2.projFactory;
import technology.ecoa.project._2.projPackage;
import technology.ecoa.project._2.util.projResourceFactoryImpl;

/**
 * Class to find or create EcoaProject from parsed imported directory
 * 
 */
public class EcoaProjectImporter {

	private EcoaProjectImporter() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Find or create EcoaProject
	 * 
	 * @return EcoaProject found or created
	 * @throws FailedImportException
	 * @throws FileNotFoundException if FileNotFound
	 */
	static EcoaProject getEcoaProject(String stepDirectory) throws FailedImportException, FileNotFoundException {
		File ecoaProjectFile = findEcoAProject(stepDirectory);
		if (ecoaProjectFile != null) {
			return extractEcoaProjectFromFile(ecoaProjectFile);
		} else {
			EDTLog.toConsole("No project.xml was found, the files were parsed.");
			return createEcoaProject(stepDirectory);
		}
	}

	/**
	 * Search for project.xml file
	 * 
	 * @param stepDirectory : path of the Step directory
	 * @return true if file found
	 */
	private static File findEcoAProject(String stepDirectory) {
		var folder = new File(stepDirectory);
		for (File file : folder.listFiles()) {
			if (file.isFile() && file.getName().endsWith("project.xml")) {
				return file;
			}
		}
		return null;
	}

	/**
	 * Create EcoaProject object by parsing the Steps directory export
	 * 
	 * @param stepDirectory : path of the Step Directory
	 * @return ecoaProject
	 */
	private static EcoaProject createEcoaProject(String stepDirectory) {
		projFactory einstance = projFactory.eINSTANCE;
		EcoaProject createdEcoaProject = einstance.createEcoaProject();

//		Get .types.xml from 0-Types files
		Files typesFiles = getFileList(stepDirectory, ImportUtils.ZERO_TYPES, ImportUtils.TYPES_EXT);
		createdEcoaProject.getTypes().add(typesFiles);

//		Get .interface.xml from 1-Services files
		Files sdFiles = getFileList(stepDirectory, ImportUtils.ONE_SERVICES, ImportUtils.SERVICES_EXT);
		createdEcoaProject.getServiceDefinitions().add(sdFiles);

//		Get .componentType from 2-ComponentDefinitions files
		Files cdFiles = getFileList(stepDirectory, ImportUtils.TWO_COMPONENT_DEFINITIONS,
				ImportUtils.COMPONENT_DEFINITION_EXT);
		createdEcoaProject.getComponentDefinitions().add(cdFiles);

//		Get .composite from 3-InitialAssembly 
		String pathName = new File(stepDirectory, ImportUtils.THREE_INITIAL_ASSEMBLY).getAbsolutePath();
		EList<String> initialAssemblyFileList = createdEcoaProject.getInitialAssembly();
		initialAssemblyFileList
				.addAll(extractFiles(pathName, ImportUtils.THREE_INITIAL_ASSEMBLY, ImportUtils.COMPOSITE_EXTENSION));

//		Get .impl.xml from 4-ComponentImplementations files
		Files ciFiles = getFileList(stepDirectory, ImportUtils.FOUR_COMPONENT_IMPLEMENTATIONS,
				ImportUtils.COMPONENT_IMPLEMENTATION_EXT);
		createdEcoaProject.getComponentImplementations().add(ciFiles);

//		Get files from 5-Integration
		pathName = new File(stepDirectory, ImportUtils.FIVE_INTEGRATION).getAbsolutePath();

//		Get .impl.xml from 5-Integration files
		EList<String> implementationAssemblyFilesList = createdEcoaProject.getImplementationAssembly();
		implementationAssemblyFilesList.addAll(
				extractFiles(pathName, ImportUtils.FIVE_INTEGRATION, ImportUtils.IMPLEMENTATION_COMPOSITE_EXTENSION));

//		Get .logicalsystem.xml from 5-Integration files
		EList<String> logicalSystemFilesList = createdEcoaProject.getLogicalSystem();
		logicalSystemFilesList
				.addAll(extractFiles(pathName, ImportUtils.FIVE_INTEGRATION, ImportUtils.LOGICAL_SYSTEM_EXTENSION));

//		Get .cross_platform_view.xml from 5-Integration files
		EList<String> crossPlatformsViewFilesList = createdEcoaProject.getCrossPlatformsView();
		crossPlatformsViewFilesList.addAll(
				extractFiles(pathName, ImportUtils.FIVE_INTEGRATION, ImportUtils.CROSS_PLATFORM_VIEW_EXTENSION));

//		Get .deployment.xml from 5-Integration files
		EList<String> deploymentSchemaFilesList = createdEcoaProject.getDeploymentSchema();
		deploymentSchemaFilesList
				.addAll(extractFiles(pathName, ImportUtils.FIVE_INTEGRATION, ImportUtils.DEPLOYMENT_EXTENSION));

//		Get .ids.xml from 5-Integration files
		EList<ELIEUIDs> euiDsList = createdEcoaProject.getEUIDs();
		for (ELIEUIDs elieuiDs : euiDsList) {
			EList<String> euidFilesList = elieuiDs.getEUID();
			euidFilesList.addAll(extractFiles(pathName, ImportUtils.FIVE_INTEGRATION, ImportUtils.EUIDS_EXTENSION));
		}

		return createdEcoaProject;
	}

	/**
	 * Create Files object containing list of string
	 * 
	 * @param stepDirectory : Steps directory
	 * @param folderName    : folder name to search in
	 * @param extension     : extension of files to search for
	 * @return Files
	 */
	static Files getFileList(String stepDirectory, String folderName, String extension) {

//		Create empty Files
		projFactory einstance = projFactory.eINSTANCE;
		var files = einstance.createFiles();

//		Path to search the files in
		String directoryPath = new File(stepDirectory, folderName).getAbsolutePath();

//		Search files
		EList<String> filesList = extractFiles(directoryPath, folderName, extension);

//		Only add if non empty list
		if (!filesList.isEmpty()) {
			files.getFile().addAll(filesList);
		}

		return files;
	}

	/**
	 * Read and convert file to EcoaProject object
	 * 
	 * @param projectFile : ecoaProject XML
	 * @return EcoaProject
	 * @throws FailedImportException : if problem with reading ecoaProject file
	 * @throws FileNotFoundException : if ecoa file not found
	 */
	public static EcoaProject extractEcoaProjectFromFile(File projectFile)
			throws FailedImportException, FileNotFoundException {
//		Read content and extract to object
		EObject extractedContent = XmlImporter.extractContent(projectFile, new projResourceFactoryImpl(),
				projPackage.eNS_URI, projPackage.eINSTANCE);

		if (extractedContent instanceof technology.ecoa.project._2.DocumentRoot documentRoot) {
			return documentRoot.getECOAProject();
		} else {
			throw new FailedImportException("The EcoaProjectFile could not be read.");
		}
	}

	/**
	 * Get all files in list
	 * 
	 * @param directoryPath : path of directory
	 * @param subStepName   :
	 * @param extension
	 */
	private static EList<String> extractFiles(String directoryPath, String subStepName, String extension) {
//		Create files relative path list
		EList<String> filesList = new BasicEList<>();

//		Search for files
		var directoryFile = new File(directoryPath);
		for (File file : directoryFile.listFiles()) {
			String fileName = file.getAbsolutePath();

//			Remove till "Steps/" to have relative path
			if (file.isFile() && fileName.endsWith(extension)) {
				var relativePath = fileName.substring(fileName.lastIndexOf(subStepName));
				filesList.add(relativePath);

//				If subdirectory exists, it is also parsed
			} else if (file.isDirectory()) {
				filesList.addAll(extractFiles(file.getAbsolutePath(), subStepName, extension));
			}
		}
		return filesList;
	}
}
