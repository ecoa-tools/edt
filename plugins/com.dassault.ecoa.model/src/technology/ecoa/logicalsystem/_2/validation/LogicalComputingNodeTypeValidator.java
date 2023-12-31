/**
 *
 * $Id$
 */
package technology.ecoa.logicalsystem._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.logicalsystem._2.AvailableMemoryType;
import technology.ecoa.logicalsystem._2.EndianessType;
import technology.ecoa.logicalsystem._2.LogicalProcessorsType;
import technology.ecoa.logicalsystem._2.ModuleSwitchTimeType;
import technology.ecoa.logicalsystem._2.OsType;

/**
 * A sample validator interface for {@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogicalComputingNodeTypeValidator {
	boolean validate();

	boolean validateEndianess(EndianessType value);
	boolean validateLogicalProcessors(EList<LogicalProcessorsType> value);
	boolean validateOs(OsType value);
	boolean validateAvailableMemory(AvailableMemoryType value);
	boolean validateModuleSwitchTime(ModuleSwitchTimeType value);
	boolean validateId(String value);
}
