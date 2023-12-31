/**
 *
 * $Id$
 */
package technology.ecoa.implementation._2.validation;

import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.PinfoType1;
import technology.ecoa.implementation._2.PropertiesType;

/**
 * A sample validator interface for {@link technology.ecoa.implementation._2.ModuleType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModuleTypeValidator {
	boolean validate();

	boolean validateProperties(PropertiesType value);
	boolean validatePinfo(PinfoType1 value);
	boolean validateOperations(OperationsType value);
	boolean validateActivatingFaultNotifs(boolean value);
	boolean validateHasUserContext(boolean value);
	boolean validateHasWarmStartContext(boolean value);
	boolean validateIsFaultHandler(boolean value);
	boolean validateName(String value);
}
