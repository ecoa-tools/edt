/**
 *
 * $Id$
 */
package technology.ecoa.module.behaviour._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.module.behaviour._2.DataNotification;
import technology.ecoa.module.behaviour._2.EntryPoint;
import technology.ecoa.module.behaviour._2.ResponseNotification;

/**
 * A sample validator interface for {@link technology.ecoa.module.behaviour._2.ModuleBehaviour}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModuleBehaviourValidator {
	boolean validate();

	boolean validateEntryPoint(EList<EntryPoint> value);
	boolean validateDataNotification(EList<DataNotification> value);
	boolean validateResponseNotification(EList<ResponseNotification> value);
}
