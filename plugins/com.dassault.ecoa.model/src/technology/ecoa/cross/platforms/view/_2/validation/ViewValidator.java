/**
 *
 * $Id$
 */
package technology.ecoa.cross.platforms.view._2.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import technology.ecoa.cross.platforms.view._2.Composite;
import technology.ecoa.cross.platforms.view._2.EUIDsBinding;
import technology.ecoa.cross.platforms.view._2.WireMapping;

/**
 * A sample validator interface for {@link technology.ecoa.cross.platforms.view._2.View}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateComposite(EList<Composite> value);
	boolean validateWireMapping(EList<WireMapping> value);
	boolean validateEuidsBinding(EList<EUIDsBinding> value);
	boolean validateAssembly(String value);
	boolean validateLogicalSystem(String value);
	boolean validateName(String value);
}
