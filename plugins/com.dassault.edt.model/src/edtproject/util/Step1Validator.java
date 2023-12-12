/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import edtinterface.Data;
import edtinterface.Event;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;
import edttype.EDTDataType;
import edttype.Library;

public class Step1Validator {

	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME = " is missing attributes : it must contain a name.\n";
	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE = " is missing attributes : it must contain a name and a type.\n";

	private Step1Validator() {

	}

	/**
	 * @param errorMessageForConsole
	 * @param serviceDefinition
	 */
	protected static void verifyServiceDefinitions(ServiceDefinition serviceDefinition,
			StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (serviceDefinition.getName() == null || serviceDefinition.getName().isBlank()) {
			errorMessageForConsole.append("The ServiceDefinition " + serviceDefinition.getName()
					+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);
		}
		EList<Library> usedLibraries = serviceDefinition.getUsedLibraries();
		EList<OperationType> operations = serviceDefinition.getOperations();
		ArrayList<Library> missingLibrary = new ArrayList<>();
		for (OperationType operation : operations) {
			if (operation instanceof Data op) {
				verifyData(errorMessageForConsole, usedLibraries, missingLibrary, op);
			} else if (operation instanceof Event op) {
				verifyEvent(errorMessageForConsole, usedLibraries, missingLibrary, op);
			} else if (operation instanceof RequestResponse op) {
				verifyRequestResponse(errorMessageForConsole, usedLibraries, missingLibrary, op);
			}
		}
		if (!missingLibrary.isEmpty()) {
			for (Library library : missingLibrary) {
				errorMessageForConsole.append("The library/namespace " + library.getName()
						+ " is used by Operations in the Service Definition " + serviceDefinition.getName()
						+ ", but is not in the used libraries\n");
			}
		}
		if (!errorMessageForConsole.isEmpty()) {
//			EDTLog.toConsoleSeparationLine();
			finalConsoleMessage.append("\n\nThe ServiceDefinition " + serviceDefinition.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param usedLibraries
	 * @param missingLibrary
	 * @param op
	 */
	protected static void verifyRequestResponse(StringBuilder errorMessageForConsole, EList<Library> usedLibraries,
			ArrayList<Library> missingLibrary, RequestResponse op) {
		EList<Parameter> inputs = op.getInput();
		for (Parameter input : inputs) {
			if (!input.isComplete()) {
				errorMessageForConsole.append("The Input " + input.getName() + " of the RequestResponse " + op.getName()
						+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);
			}
			EDTDataType type = input.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, type);

		}
		EList<Parameter> outputs = op.getOutput();
		for (Parameter output : outputs) {
			if (!output.isComplete()) {
				errorMessageForConsole.append("The Output " + output.getName() + " of the RequestResponse "
						+ op.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);
			}
			EDTDataType type = output.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, type);
		}
		if (!op.isComplete()) {
			errorMessageForConsole.append("The Event " + op.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param usedLibraries
	 * @param missingLibrary
	 * @param op
	 */
	protected static void verifyEvent(StringBuilder errorMessageForConsole, EList<Library> usedLibraries,
			ArrayList<Library> missingLibrary, Event op) {
		EList<Parameter> inputs = op.getInput();
		for (Parameter input : inputs) {
			if (!input.isComplete()) {
				errorMessageForConsole.append("The Input " + input.getName() + " of the Event " + op.getName()
						+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);
			}
			EDTDataType type = input.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, type);
		}
		if (!op.isComplete()) {
			errorMessageForConsole.append("The Event " + op.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param usedLibraries
	 * @param missingLibrary
	 * @param op
	 */
	protected static void verifyData(StringBuilder errorMessageForConsole, EList<Library> usedLibraries,
			ArrayList<Library> missingLibrary, Data op) {
		EDTDataType type = op.getType();
		if (!op.isComplete()) {
			errorMessageForConsole.append(
					"The Versioned Data " + op.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);
		}
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, type);
	}

}
