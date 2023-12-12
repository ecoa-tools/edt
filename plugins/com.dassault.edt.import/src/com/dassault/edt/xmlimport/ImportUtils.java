/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

import java.io.File;

/**
 * Class to store utility methods pertaining to the import XML feature.
 * 
 */
public class ImportUtils {

	/**
	 * Static field containing the generic error message, when the selected folder
	 * does not contain a valid ECOA Project.
	 */
	public static final String NOT_ECOA_PROJECT = "The selected folder does not contain a valid ECOA Project";
	public static final String STEPS_SUBDIR = "Steps";
	public static final String ZERO_TYPES = "0-Types";
	public static final String TYPES_EXT = ".types.xml";

	public static final String ONE_SERVICES = "1-Services";
	public static final String SERVICES_EXT = ".interface.xml";

	public static final String TWO_COMPONENT_DEFINITIONS = "2-ComponentDefinitions";
	public static final String COMPONENT_DEFINITION_EXT = ".componentType";
	public static final String QOS_EXT = ".interface.qos.xml";

	public static final String THREE_INITIAL_ASSEMBLY = "3-InitialAssembly";
	public static final String COMPOSITE_EXTENSION = ".composite";

	public static final String FOUR_COMPONENT_IMPLEMENTATIONS = "4-ComponentImplementations";
	public static final String COMPONENT_IMPLEMENTATION_EXT = ".impl.xml";
	public static final String BEHAVIOUR_EXT = ".behaviour.xml";
	public static final String BINARY_FILE = "bin-desc.xml";
	public static final String INSERTION_POLICIES_EXT = "_insertion_policies.xml";

	public static final String FIVE_INTEGRATION = "5-Integration";
	public static final String IMPLEMENTATION_COMPOSITE_EXTENSION = ".impl.composite";
	public static final String LOGICAL_SYSTEM_EXTENSION = ".logical-system.xml";
	public static final String DEPLOYMENT_EXTENSION = ".deployment.xml";
	public static final String CONTRIBUTION_NAME = "sca-contribution.xml";
	public static final String CROSS_PLATFORM_VIEW_EXTENSION = ".cross_platform_view.xml";
	public static final String EUIDS_EXTENSION = ".ids.xml";

	private ImportUtils() {

	}

	/**
	 * Guess what could be project name based on XML import directory.
	 * 
	 * @param importPath The XML import directory.
	 * @return A guessed project name or empty if could not guess.
	 */
	public static String guessProjectName(String importPath) {
		var importDirectory = new File(importPath);
		var stepsDirectory = new File(importDirectory, STEPS_SUBDIR);
		if (!stepsDirectory.exists()) {
			stepsDirectory = importDirectory;
		}
		var pattern = ".project.xml";
		String projectName = null;
		for (File file : stepsDirectory.listFiles()) {
			if (file.isFile() && file.getName().endsWith(pattern)) {
				projectName = file.getName().substring(0, file.getName().length() - pattern.length());
			}
		}

		if (projectName != null) {
			return projectName;
		}
		var parentDirectory = importDirectory.getParentFile();
		if (parentDirectory != null) {
			// avoid return empty string for root directory
			return importDirectory.getName();
		}

		return "";
	}

	/**
	 * Guess what could be project name based on XML import project file.
	 * 
	 * @param importPath The XML import directory.
	 * @return A guessed project name or empty if could not guess.
	 */
	public static String guessProjectNameFromProjectFile(String importPath) {
		var projectXmlFile = new File(importPath);
		var pattern = ".project.xml";
		String projectName = projectXmlFile.getName().substring(0,
				projectXmlFile.getName().length() - pattern.length());

		if (projectName != null) {
			return projectName;
		}

		return "";
	}
}
