/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.open.oasis.docs.ns.opencsa.sca.sca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage
 * @generated
 */
public class scaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final scaValidator INSTANCE = new scaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.ns.opencsa.sca.sca";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return scaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case scaPackage.COMMON_EXTENSION_BASE:
				return validateCommonExtensionBase((CommonExtensionBase)value, diagnostics, context);
			case scaPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case scaPackage.COMPONENT_REFERENCE:
				return validateComponentReference((ComponentReference)value, diagnostics, context);
			case scaPackage.COMPONENT_SERVICE:
				return validateComponentService((ComponentService)value, diagnostics, context);
			case scaPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case scaPackage.COMPONENT_TYPE_REFERENCE:
				return validateComponentTypeReference((ComponentTypeReference)value, diagnostics, context);
			case scaPackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case scaPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case scaPackage.CONTRIBUTION_TYPE:
				return validateContributionType((ContributionType)value, diagnostics, context);
			case scaPackage.DEPLOYABLE_TYPE:
				return validateDeployableType((DeployableType)value, diagnostics, context);
			case scaPackage.DOCUMENTATION:
				return validateDocumentation((Documentation)value, diagnostics, context);
			case scaPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case scaPackage.EXTENSIONS_TYPE:
				return validateExtensionsType((ExtensionsType)value, diagnostics, context);
			case scaPackage.IMPLEMENTATION:
				return validateImplementation((Implementation)value, diagnostics, context);
			case scaPackage.IMPLEMENTATION_TYPE:
				return validateImplementationType((ImplementationType)value, diagnostics, context);
			case scaPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case scaPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case scaPackage.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case scaPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case scaPackage.SCA_IMPLEMENTATION:
				return validateSCAImplementation((SCAImplementation)value, diagnostics, context);
			case scaPackage.SCA_PROPERTY_BASE:
				return validateSCAPropertyBase((SCAPropertyBase)value, diagnostics, context);
			case scaPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case scaPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case scaPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case scaPackage.WIRE:
				return validateWire((Wire)value, diagnostics, context);
			case scaPackage.WIRE_FORMAT_TYPE:
				return validateWireFormatType((WireFormatType)value, diagnostics, context);
			case scaPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			case scaPackage.LIST_OF_ANY_UR_IS:
				return validateListOfAnyURIs((List<?>)value, diagnostics, context);
			case scaPackage.LIST_OF_QNAMES:
				return validateListOfQNames((List<?>)value, diagnostics, context);
			case scaPackage.MULTIPLICITY_OBJECT:
				return validateMultiplicityObject((Multiplicity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonExtensionBase(CommonExtensionBase commonExtensionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonExtensionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentReference(ComponentReference componentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentService(ComponentService componentService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentTypeReference(ComponentTypeReference componentTypeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributionType(ContributionType contributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployableType(DeployableType deployableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionsType(ExtensionsType extensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation(Implementation implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationType(ImplementationType implementationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCAImplementation(SCAImplementation scaImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCAPropertyBase(SCAPropertyBase scaPropertyBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaPropertyBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWire(Wire wire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireFormatType(WireFormatType wireFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfAnyURIs(List<?> listOfAnyURIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListOfAnyURIs_ItemType(listOfAnyURIs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>List Of Any UR Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfAnyURIs_ItemType(List<?> listOfAnyURIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = listOfAnyURIs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfQNames(List<?> listOfQNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListOfQNames_ItemType(listOfQNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>List Of QNames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfQNames_ItemType(List<?> listOfQNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = listOfQNames.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityObject(Multiplicity multiplicityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //scaValidator
