/**
 *
 * $Id$
 */
package technology.ecoa.sca.extension.scaExt.validation;


/**
 * A sample validator interface for {@link technology.ecoa.sca.extension.scaExt.WireInformation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WireInformationValidator {
	boolean validate();

	boolean validateLink(String value);
}
