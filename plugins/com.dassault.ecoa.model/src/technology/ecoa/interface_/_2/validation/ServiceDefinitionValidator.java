/**
 *
 * $Id$
 */
package technology.ecoa.interface_._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.interface_._2.Operations;
import technology.ecoa.interface_._2.UseType;

/**
 * A sample validator interface for {@link technology.ecoa.interface_._2.ServiceDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServiceDefinitionValidator {
	boolean validate();

	boolean validateUse(EList<UseType> value);
	boolean validateOperations(Operations value);
}
