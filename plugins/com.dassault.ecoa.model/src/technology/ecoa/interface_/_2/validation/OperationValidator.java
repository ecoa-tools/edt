/**
 *
 * $Id$
 */
package technology.ecoa.interface_._2.validation;


/**
 * A sample validator interface for {@link technology.ecoa.interface_._2.Operation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationValidator {
	boolean validate();

	boolean validateComment(String value);
	boolean validateName(String value);
}