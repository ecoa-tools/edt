/**
 *
 * $Id$
 */
package technology.ecoa.deployment._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.deployment._2.ModuleLog;

/**
 * A sample validator interface for {@link technology.ecoa.deployment._2.ComponentLog}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentLogValidator {
	boolean validate();

	boolean validateModuleLog(EList<ModuleLog> value);
	boolean validateEnabledLevels(String value);
	boolean validateInstanceName(String value);
}