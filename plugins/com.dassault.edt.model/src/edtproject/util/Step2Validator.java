/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import org.eclipse.emf.common.util.EList;

import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.Property;
import edtqos.Data;
import edtqos.Event;
import edtqos.Operation;
import edtqos.ServiceInstanceQos;

public class Step2Validator {

	private static final String OF_THE_COMPONENT_DEFINITION = " of the ComponentDefinition ";

	private Step2Validator() {

	}

	/**
	 * @param errorMessageForConsole
	 * @param componentDefinition
	 */
	protected static void verifyComponentDefinitions(ComponentDefinition componentDefinition,
			StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (!componentDefinition.isComplete()) {
			errorMessageForConsole.append("The ComponentDefinition " + componentDefinition.getName()
					+ " is missing attributes : it must contain a name, and at least a Reference or a Service.\n");
		}

		EList<Property> properties = componentDefinition.getProperties();
		for (Property property : properties) {
			if (!property.isComplete()) {
				errorMessageForConsole.append("The Property " + property.getName() + OF_THE_COMPONENT_DEFINITION
						+ componentDefinition.getName()
						+ " is missing attributes : it must contain a name, a ecoa-sca:type and if the ecoa-sca:type is not a BasicType or a ECOA Predefined Type, a ecoa-sca:library (that must correspond to the library containing the ecoa-sca type).\n");

			}
		}
		EList<ComponentDefinitionReference> references = componentDefinition.getReferences();
		for (ComponentDefinitionReference componentDefinitionReference : references) {
			if (!componentDefinitionReference.isComplete()) {
				errorMessageForConsole.append("The Reference " + componentDefinitionReference.getName()
						+ OF_THE_COMPONENT_DEFINITION + componentDefinition.getName()
						+ " is missing attributes : it must contain a name and a syntax.\n");

			}
		}

		EList<ComponentDefinitionService> services = componentDefinition.getServices();
		for (ComponentDefinitionService componentDefinitionService : services) {
			if (!componentDefinitionService.isComplete()) {
				errorMessageForConsole.append("The Service " + componentDefinitionService.getName()
						+ OF_THE_COMPONENT_DEFINITION + componentDefinition.getName()
						+ " is missing attributes : it must contain a name and a syntax.\n");

			}
		}

		if (!errorMessageForConsole.isEmpty()) {
//			EDTLog.toConsoleSeparationLine();
			finalConsoleMessage.append("The ComponentDefinition " + componentDefinition.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}
		EList<ServiceInstanceQos> associatedServiceQos = componentDefinition.getAssociatedServiceQos();
		for (ServiceInstanceQos serviceInstanceQos : associatedServiceQos) {
			verifyServiceQoS(serviceInstanceQos, finalConsoleMessage);
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param serviceInstanceQos
	 * @param finalConsoleMessage
	 */
	protected static void verifyServiceQoS(ServiceInstanceQos serviceInstanceQos, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		EList<Operation> operations = serviceInstanceQos.getOperations();
		if (operations.isEmpty()) {
			errorMessageForConsole.append("The Service QoS " + serviceInstanceQos.getName()
					+ " is missing attributes : it must contain a name and at least one operation.\n");
		}
		for (Operation operation : operations) {
			if (!operation.isComplete()) {
				String typeOfOperation = null;
				if (operation instanceof Data) {
					typeOfOperation = "The Versioned Data ";
				} else if (operation instanceof Event) {
					typeOfOperation = "The Event ";
				} else {
					typeOfOperation = "The Request Response ";
				}

				errorMessageForConsole.append(typeOfOperation + "of the Service QoS " + serviceInstanceQos.getName()
						+ " is missing a name.\n");
			}
		}
		if (!errorMessageForConsole.isEmpty()) {
//			EDTLog.toConsoleSeparationLine();
			finalConsoleMessage.append("\n\nThe ServiceInstanceQoS " + serviceInstanceQos.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}

	}
}
