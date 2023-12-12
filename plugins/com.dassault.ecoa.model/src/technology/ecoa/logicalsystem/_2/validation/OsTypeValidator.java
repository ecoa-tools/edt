/**
 *
 * $Id$
 */
package technology.ecoa.logicalsystem._2.validation;

import technology.ecoa.logicalsystem._2.NameType;

/**
 * A sample validator interface for {@link technology.ecoa.logicalsystem._2.OsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OsTypeValidator {
	boolean validate();

	boolean validateName(NameType value);
	boolean validateVersion(String value);
}