/**
 *
 * $Id$
 */
package technology.ecoa.implementation._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.implementation._2.PrivatePinfo;
import technology.ecoa.implementation._2.PublicPinfo;

/**
 * A sample validator interface for {@link technology.ecoa.implementation._2.PinfoType1}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PinfoType1Validator {
	boolean validate();

	boolean validatePublicPinfo(EList<PublicPinfo> value);
	boolean validatePrivatePinfo(EList<PrivatePinfo> value);
}
