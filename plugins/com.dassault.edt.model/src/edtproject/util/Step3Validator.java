/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.log.EDTLog;

import edtproject.Component;
import edtproject.ComponentProperty;
import edtproject.Composite;
import edtproject.Property;

public class Step3Validator {

	private static final String OF_THE_COMPONENT = " of the Component ";

	private Step3Validator() {

	}

	protected static void verifyComposite(Composite composite, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (composite.getName() == null || composite.getName().isBlank()) {
			errorMessageForConsole.append(
					"The Composite " + composite.getName() + " is missing attributes : it must contain a name.\n");
		}

		EList<Component> components = composite.getComponents();
		for (Component component : components) {
			verifyComponent(component, errorMessageForConsole);
		}

		EList<Property> properties = composite.getProperties();
		for (Property property : properties) {
			if (!property.isComplete()) {
				errorMessageForConsole.append("The Property " + property.getName() + " of the Assembly"
						+ " is missing attributes : it must contain a name, a ecoa-sca:type and if the ecoa-sca:type is not a BasicType or a ECOA Predefined Type, a ecoa-sca:library (that must correspond to the library containing the ecoa-sca type).\n");

			}
		}

		if (!errorMessageForConsole.isEmpty()) {
//			EDTLog.toConsoleSeparationLine();
			finalConsoleMessage.append("\n\nThe Composite " + composite.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param component
	 */
	protected static void verifyComponent(Component component, StringBuilder errorMessageForConsole) {
		if (component.getName() == null || component.getName().isBlank()
				|| component.getComponentDefinition() == null) {
			errorMessageForConsole.append("The Component " + component.getName()
					+ " is missing attributes : it must contain a name and a Definition.\n");
		}
		if (component.getComponentImplementation() == null) {
			EDTLog.toConsole("WARNING : no Implementation was given for the Component " + component.getName() + "\n");
		}

		EList<ComponentProperty> properties = component.getProperties();
		for (ComponentProperty property : properties) {
			if (property.getValue() == null || property.getValue().isBlank()) {
				errorMessageForConsole.append("The Property " + property.getName() + OF_THE_COMPONENT
						+ component.getName() + " is missing attributes : it must contain a name and a value.\n");

			}
		}
	}
}
