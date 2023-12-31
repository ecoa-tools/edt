/**
 *
 * $Id$
 */
package org.w3._2001.xml.xsd.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2001.xml.xsd.AnnotationType;
import org.w3._2001.xml.xsd.NamedAttributeGroup;
import org.w3._2001.xml.xsd.NamedGroup;
import org.w3._2001.xml.xsd.TopLevelComplexType;
import org.w3._2001.xml.xsd.TopLevelSimpleType;

/**
 * A sample validator interface for {@link org.w3._2001.xml.xsd.RedefineType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RedefineTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateAnnotation(EList<AnnotationType> value);
	boolean validateSimpleType(EList<TopLevelSimpleType> value);
	boolean validateComplexType(EList<TopLevelComplexType> value);
	boolean validateGroup1(EList<NamedGroup> value);
	boolean validateAttributeGroup(EList<NamedAttributeGroup> value);
	boolean validateId(String value);
	boolean validateSchemaLocation(String value);
}
