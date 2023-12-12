/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.log.EDTLog;

import edtdeployment.Deployment;
import edtimplementation.ComponentImplementation;
import edtinterface.ServiceDefinition;
import edtlogical.LogicalSystem;
import edtproject.ComponentDefinition;
import edtproject.Composite;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step3;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;
import edttype.EDTDataType;
import edttype.Library;
import edtuid.IDMap;

public class EDTProjectValidator {

	private EDTProjectValidator() {

	}

	/**
	 * Check coherence of project
	 * 
	 * @param steps
	 */
	public static void checkSteps(Steps steps) {
		StringBuilder finalErrorMessage = new StringBuilder();
		Step0 step0 = steps.getStep0();
		EList<Library> types = step0.getTypes();
		for (Library library : types) {
			Step0Validator.verifyLibraries(library, finalErrorMessage);
		}

		Step1 step1 = steps.getStep1();
		EList<ServiceDefinition> services = step1.getServices();
		for (ServiceDefinition serviceDefinition : services) {
			Step1Validator.verifyServiceDefinitions(serviceDefinition, finalErrorMessage);
		}

		Step2 step2 = steps.getStep2();
		EList<ComponentDefinition> componentDefinitions = step2.getComponentDefinitions();
		for (ComponentDefinition componentDefinition : componentDefinitions) {
			Step2Validator.verifyComponentDefinitions(componentDefinition, finalErrorMessage);
		}

		Step3 step3 = steps.getStep3();
		Composite initialAssembly = step3.getInitialAssembly();
		Step3Validator.verifyComposite(initialAssembly, finalErrorMessage);

		Step4 step4 = steps.getStep4();
		EList<ComponentImplementation> componentImplementations = step4.getComponentImplementations();
		for (ComponentImplementation componentImplementation : componentImplementations) {
			Step4Validator.verifyComponentImplementation(componentImplementation, finalErrorMessage);
		}

		Step5 step5 = steps.getStep5();

		Deployment deployment = step5.getDeployment();
		if (deployment != null) {
			Step5Validator.verifyDeployment(deployment, finalErrorMessage);
		}

		LogicalSystem logicalSystem = step5.getLogicalSystem();
		if (logicalSystem != null) {
			Step5Validator.verifyLogicalSystem(logicalSystem, finalErrorMessage);
		}

		EList<IDMap> ids = step5.getIDS();
		for (IDMap idMap : ids) {
			Step5Validator.verifyIDs(idMap, finalErrorMessage);
		}

		if (!finalErrorMessage.isEmpty()) {
			EDTLog.toPopUpAndConsole("Some errors were found in the project. See console for more details",
					finalErrorMessage.toString());
		}
	}

	/**
	 * @param usedLibraries
	 * @param missingLibrary
	 * @param itemType
	 */
	protected static void verifyIfMissingLibrary(EList<Library> usedLibraries, ArrayList<Library> missingLibrary,
			EDTDataType itemType) {
		if (itemType != null && itemType.eContainer() instanceof Library libraryType
				&& !usedLibraries.contains(libraryType) && !missingLibrary.contains(libraryType)) {

			missingLibrary.add(libraryType);
		}
	}

}
