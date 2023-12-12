/**
 *
 * $Id$
 */
package technology.ecoa.implementation._2.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link technology.ecoa.implementation._2.VersionedData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VersionedDataValidator {
	boolean validate();

	boolean validateMaxVersions(BigInteger value);
	boolean validateName(String value);
	boolean validateType(String value);
}