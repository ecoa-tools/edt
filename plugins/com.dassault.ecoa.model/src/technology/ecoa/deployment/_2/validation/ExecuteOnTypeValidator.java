/**
 *
 * $Id$
 */
package technology.ecoa.deployment._2.validation;


/**
 * A sample validator interface for {@link technology.ecoa.deployment._2.ExecuteOnType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExecuteOnTypeValidator {
	boolean validate();

	boolean validateComputingNode(String value);
	boolean validateComputingPlatform(String value);
}
