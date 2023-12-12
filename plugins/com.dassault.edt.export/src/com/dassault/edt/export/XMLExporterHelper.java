/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.export;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.dassault.edt.log.EDTLog;

import edtproject.EDTProjectPackage;

/**
 * Class to help export XML that converts EDT Objects (from graphicalView) to
 * ECOA Objects
 * 
 */
public class XMLExporterHelper {

	/**
	 * Export files
	 * 
	 * @param filePath  : path to export to
	 * @param object    : object to export
	 * @param extension : extension of file
	 * @throws IOException : if error when writing file
	 */
	public static void exportContent(File filePath, EObject object, String extension) throws IOException {
		// Register the XMI resource factory for the . extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		String filename = filePath.getAbsolutePath();
		var resource = resSet.createResource(URI.createFileURI(filename));

		// Get the first model element and cast it to the right type
		resource.getContents().add(object);

		// now save the content.
		Map<String, Object> saveOptions = new HashMap<>();
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

		resource.save(saveOptions);

	}

	/**
	 * read model.ecoadt and convert it to Steps
	 * 
	 * @param filePath : path of model.ecoadt
	 * @return Steps
	 */
	public static edtproject.Steps readEcoADTFile(String filePath) {
		var uri = URI.createFileURI(filePath);
		// Create a resource set to hold the resources.

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(EDTProjectPackage.eNS_URI, EDTProjectPackage.eINSTANCE);

		// Get the resource from URI/Parse XML
		Map<String, Object> saveOptions = new HashMap<>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");

		resourceSet.getLoadOptions().putAll(saveOptions);
		var resource = resourceSet.getResource(uri, true);

		// Get content of the xml
		EObject object = resource.getContents().get(0);
		if (object instanceof edtproject.Steps steps) {
			return steps;
		} else {
			EDTLog.toConsole("There is a problem with EDTProject reading");
		}
		return null;
	}

}
