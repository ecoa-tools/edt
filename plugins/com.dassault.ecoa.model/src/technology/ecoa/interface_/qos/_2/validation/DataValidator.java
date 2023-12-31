/**
 *
 * $Id$
 */
package technology.ecoa.interface_.qos._2.validation;

import technology.ecoa.interface_.qos._2.OperationRate;

/**
 * A sample validator interface for {@link technology.ecoa.interface_.qos._2.Data}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataValidator {
	boolean validate();

	boolean validateHighestRate(OperationRate value);
	boolean validateLowestRate(OperationRate value);
	boolean validateMaxAgeing(double value);
	boolean validateName(String value);
	boolean validateNotificationMaxHandlingTime(double value);
}
