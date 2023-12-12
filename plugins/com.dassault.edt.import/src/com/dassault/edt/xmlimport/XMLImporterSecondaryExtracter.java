/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.dassault.edt.converters.BinDescImportConverter;
import com.dassault.edt.converters.LogicalSystemImportConverter;
import com.dassault.edt.converters.ServiceQosImportConverter;
import com.dassault.edt.converters.TypesImportConverter;
import com.dassault.edt.converters.UDPBindingImportConverter;
import com.dassault.edt.converters.UIDImportConverter;
import com.dassault.edt.log.EDTLog;

import edtimplementation.ComponentImplementation;
import edtproject.Steps;
import edttype.Library;
import technology.ecoa.bin.desc._2.BinDesc;
import technology.ecoa.bin.desc._2.binPackage;
import technology.ecoa.bin.desc._2.util.binResourceFactoryImpl;
import technology.ecoa.cross.platforms.view._2.View;
import technology.ecoa.cross.platforms.view._2.viewPackage;
import technology.ecoa.cross.platforms.view._2.util.viewResourceFactoryImpl;
import technology.ecoa.interface_.qos._2.ServiceInstanceQoS;
import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.LogicalSystem;
import technology.ecoa.logicalsystem._2.TransportBindingType;
import technology.ecoa.logicalsystem._2.logPackage;
import technology.ecoa.logicalsystem._2.util.logResourceFactoryImpl;
import technology.ecoa.module.behaviour._2.ModuleBehaviour;
import technology.ecoa.module.behaviour._2.modPackage;
import technology.ecoa.module.behaviour._2.util.modResourceFactoryImpl;
import technology.ecoa.udpbinding._2.UDPBindingType;
import technology.ecoa.udpbinding._2.udpPackage;
import technology.ecoa.udpbinding._2.util.udpResourceFactoryImpl;
import technology.ecoa.uid._2.IDMap;
import technology.ecoa.uid._2.uidPackage;
import technology.ecoa.uid._2.util.uidResourceFactoryImpl;
import temp.TempFactory;

/**
 * Class to import XML and convert them to EDT for graphical view
 * 
 */
public class XMLImporterSecondaryExtracter {
	private static final String IS_IMPORTING = " is importing...";
	private static final String WILL_BE_IMPORTED_AND_EXPORTED_BUT_IS_NOT_MODIFIABLE = " will be imported and exported, but is not modifiable.\n";
	private static final String COULD_NOT_BE_READ = " could not be read";

	private edtproject.Steps steps;

	/**
	 * Get all contents from XX.types.xml
	 * 
	 * @param file                      : Library file
	 * @param associatedUsedLibraries   : association between referencing library
	 *                                  and referenced libraries name
	 * @param associatedUsedTypes       : association between referencing type and
	 *                                  referenced type name
	 * @param associatedConstantToTypes : constant with their string types to
	 *                                  convert to objects
	 * @return the EDT Library
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	public static Library extractTypes(File file, Map<Library, ArrayList<String>> associatedUsedLibraries,
			HashMap<EObject, String> associatedUsedTypes, ArrayList<EObject> associatedConstantToTypes)
			throws FailedImportException, FileNotFoundException {

		EDTLog.toConsole("NameSpace " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		var typeObject = XmlImporter.extractContent(file, new technology.ecoa.types._2.util.typResourceFactoryImpl(),
				technology.ecoa.types._2.typPackage.eNS_URI, technology.ecoa.types._2.typPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (typeObject instanceof technology.ecoa.types._2.DocumentRoot documentRoot) {
			var library = documentRoot.getLibrary();
			Library edtLibrary = TypesImportConverter.createEDTLibrary(library, file.getName(), associatedUsedLibraries,
					associatedUsedTypes, associatedConstantToTypes);
			return edtLibrary;

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.qos.xml
	 * 
	 * @param file                           : QoS file to read
	 * @param interfaceQOSName               : name of QoS
	 * @param interfaceServiceDefinitionName : name of ServiceDefinition to
	 *                                       associate
	 * @return edtQoS
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	static edtqos.ServiceInstanceQos extractServiceInstanceQOS(File file, String interfaceQOSName,
			edtinterface.ServiceDefinition edtServiceDefinition) throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("Service Instance QoS " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		var serviceObject = XmlImporter.extractContent(file,
				new technology.ecoa.interface_.qos._2.util.qosResourceFactoryImpl(),
				technology.ecoa.interface_.qos._2.qosPackage.eNS_URI,
				technology.ecoa.interface_.qos._2.qosPackage.eINSTANCE);

		// Convert ecoa to edt object
		if (serviceObject instanceof technology.ecoa.interface_.qos._2.DocumentRoot documentRoot) {
			ServiceInstanceQoS serviceInstanceQOS = documentRoot.getServiceInstanceQoS();
			return ServiceQosImportConverter.createEDTQos(serviceInstanceQOS, interfaceQOSName, edtServiceDefinition);
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * 
	 * @param file
	 * @param missingElementsToLog
	 * @throws FileNotFoundException
	 * @throws FailedImportException
	 */
	static temp.ModuleBehaviour extractModuleBehaviour(File file, String moduleBehaviourName,
			StringBuilder missingElementsToLog) throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("ModuleBehaviour " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject moduleBehaviourContent = XmlImporter.extractContent(file, new modResourceFactoryImpl(),
				modPackage.eNS_URI, modPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (moduleBehaviourContent instanceof technology.ecoa.module.behaviour._2.DocumentRoot documentRoot) {
			ModuleBehaviour moduleBehaviour = documentRoot.getModuleBehaviour();
			temp.ModuleBehaviour edtModuleBehaviour = TempFactory.eINSTANCE.createModuleBehaviour();
			edtModuleBehaviour.setModuleBehaviour(moduleBehaviour);
			edtModuleBehaviour.setName(moduleBehaviourName);
			missingElementsToLog.append(
					"The Module Behaviour " + file.getName() + WILL_BE_IMPORTED_AND_EXPORTED_BUT_IS_NOT_MODIFIABLE);

			return edtModuleBehaviour;
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * @param file
	 * @param missingElementsToLog
	 * @param edtComponentImplementation
	 * @throws FileNotFoundException
	 * @throws FailedImportException
	 */
	static void findBinDescAndImport(File file, StringBuilder missingElementsToLog,
			ComponentImplementation edtComponentImplementation, StringBuilder popupToDisplay)
			throws FileNotFoundException, FailedImportException {
		File parentFile = file.getParentFile();
		File[] binDescListFiles = parentFile.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.contains(ImportUtils.BINARY_FILE);
			}
		});
		for (File binDescFile : binDescListFiles) {
			BinDesc binaryDescription = extractBinaryDescription(binDescFile);
			if (Objects.equals(binaryDescription.getComponentImplementation(), edtComponentImplementation.getName())) {
				String insertionPolicy = binaryDescription.getInsertionPolicy();

//				Add insertion policies
				if (insertionPolicy != null) {
					missingElementsToLog.append("The InsertionPolicy " + insertionPolicy
							+ XmlImporter.CAN_NOT_BE_IMPORTED_OR_EXPORTED_AT_THE_MOMENT);
					popupToDisplay.append(
							"The file " + insertionPolicy + XmlImporter.CAN_NOT_BE_IMPORTED_OR_EXPORTED_AT_THE_MOMENT);
				}
				edtComponentImplementation.getBinDesc().add(BinDescImportConverter.createEDTBinDesc(binaryDescription,
						edtComponentImplementation, binDescFile.getName()));
				break;
			} else {
				EDTLog.toConsole("INFO: The BinaryDescription file " + binDescFile.getName()
						+ " does not correspond to the ComponentImplementation "
						+ edtComponentImplementation.getName());
			}
		}

	}

	/**
	 * Get all contents from XX.bin-desc.xml
	 * 
	 * 
	 * @param file                 : BinaryDescription file to be read
	 * @param missingElementsToLog : log Elements that are not usable in EDT
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	static BinDesc extractBinaryDescription(File file) throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("BinaryDescription " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject binDescContent = XmlImporter.extractContent(file, new binResourceFactoryImpl(), binPackage.eNS_URI,
				binPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (binDescContent instanceof technology.ecoa.bin.desc._2.DocumentRoot documentRoot) {
			BinDesc binDesc = documentRoot.getBinDesc();
			return binDesc;

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.logical-system.xml
	 * 
	 * 
	 * @param file                 : LogicalSystem file to be read
	 * @param missingElementsToLog : log Elements that are not usable in EDT
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	void extractLogicalSystem(File file, StringBuilder missingElementsToLog)
			throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("Logical System " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject logicalSystemContent = XmlImporter.extractContent(file, new logResourceFactoryImpl(),
				logPackage.eNS_URI, logPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (logicalSystemContent instanceof technology.ecoa.logicalsystem._2.DocumentRoot documentRoot) {
			LogicalSystem logicalSystem = documentRoot.getLogicalSystem();

			edtlogical.LogicalSystem edtLogicalSystem = LogicalSystemImportConverter
					.createEDTLogicalSystem(logicalSystem, file.getName());

			steps.getStep5().setLogicalSystem(edtLogicalSystem);
			EList<LogicalComputingPlatformLinks> logicalComputingPlatformLinks = logicalSystem
					.getLogicalComputingPlatformLinks();
			for (LogicalComputingPlatformLinks logicalComputingPlatformLinks2 : logicalComputingPlatformLinks) {
				EList<LinkType> links = logicalComputingPlatformLinks2.getLink();
				for (LinkType linkType : links) {
					TransportBindingType transportBinding = linkType.getTransportBinding();
					String parameters = transportBinding.getParameters();
					extractUDPBinding(new File(file.getParentFile(), parameters));

				}
			}
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}

	}

	/**
	 * Get all contents from ??.xml
	 * 
	 * 
	 * @param file : udp-binding file to be read
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	static edtudp.UDPBinding extractUDPBinding(File file) throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("UDP Binding " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject udpBindingContent = XmlImporter.extractContent(file, new udpResourceFactoryImpl(), udpPackage.eNS_URI,
				udpPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (udpBindingContent instanceof technology.ecoa.udpbinding._2.DocumentRoot documentRoot) {
			UDPBindingType udpBinding = documentRoot.getUDPBinding();

			edtudp.UDPBinding edtUDPBinding = UDPBindingImportConverter.createEDTUDPBinding(udpBinding, file.getName());
			edtUDPBinding.setName(file.getName());

			return edtUDPBinding;
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from crossPlatformView.xml
	 * 
	 * 
	 * @param file                 : View file to be read
	 * @param missingElementsToLog : log Elements that are not usable in EDT
	 * @return
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */

	static temp.CrossPlatformView extractCrossPlatformView(File file, StringBuilder missingElementsToLog)
			throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("CrossPlatformView " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject crossPlatformView = XmlImporter.extractContent(file, new viewResourceFactoryImpl(), viewPackage.eNS_URI,
				viewPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (crossPlatformView instanceof technology.ecoa.cross.platforms.view._2.DocumentRoot documentRoot) {
			View view = documentRoot.getView();

			missingElementsToLog.append(
					"The CrossPlatformView " + file.getName() + WILL_BE_IMPORTED_AND_EXPORTED_BUT_IS_NOT_MODIFIABLE);

			temp.CrossPlatformView edtCrossPlatformView = TempFactory.eINSTANCE.createCrossPlatformView();
			edtCrossPlatformView.setECOACrossPlatformView(view);
			edtCrossPlatformView.setName(file.getName());
			return edtCrossPlatformView;
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from ids.xml
	 * 
	 * 
	 * @param file  : View file to be read
	 * @param steps : steps
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 * @return IDMap to import
	 */

	public static edtuid.IDMap extractEUID(File file, Steps steps) throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("EUID " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject euid = XmlImporter.extractContent(file, new uidResourceFactoryImpl(), uidPackage.eNS_URI,
				uidPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (euid instanceof technology.ecoa.uid._2.DocumentRoot documentRoot) {
			IDMap idMap = documentRoot.getIDMap();

			edtuid.IDMap edtEUID = UIDImportConverter.createEDTIDMap(idMap, file.getName(),
					steps.getStep3().getInitialAssembly());
			return edtEUID;
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

}
