/**
 *
 * $Id$
 */
package technology.ecoa.logicalsystem._2.validation;

import technology.ecoa.logicalsystem._2.LatencyType;
import technology.ecoa.logicalsystem._2.ThroughputType;
import technology.ecoa.logicalsystem._2.TransportBindingType;

/**
 * A sample validator interface for {@link technology.ecoa.logicalsystem._2.LinkType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LinkTypeValidator {
	boolean validate();

	boolean validateThroughput(ThroughputType value);
	boolean validateLatency(LatencyType value);
	boolean validateTransportBinding(TransportBindingType value);
	boolean validateFrom(String value);
	boolean validateId(String value);
	boolean validateTo(String value);
}
