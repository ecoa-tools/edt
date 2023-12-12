/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import technology.ecoa.logicalsystem._2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.logicalsystem._2.logPackage
 * @generated
 */
public class logValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final logValidator INSTANCE = new logValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "technology.ecoa.logicalsystem._2";

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
	public logValidator() {
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
	  return logPackage.eINSTANCE;
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
			case logPackage.AVAILABLE_MEMORY_TYPE:
				return validateAvailableMemoryType((AvailableMemoryType)value, diagnostics, context);
			case logPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case logPackage.ENDIANESS_TYPE:
				return validateEndianessType((EndianessType)value, diagnostics, context);
			case logPackage.LATENCY_TYPE:
				return validateLatencyType((LatencyType)value, diagnostics, context);
			case logPackage.LATENCY_TYPE1:
				return validateLatencyType1((LatencyType1)value, diagnostics, context);
			case logPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case logPackage.LINK_TYPE1:
				return validateLinkType1((LinkType1)value, diagnostics, context);
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS:
				return validateLogicalComputingNodeLinks((LogicalComputingNodeLinks)value, diagnostics, context);
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE:
				return validateLogicalComputingNodeType((LogicalComputingNodeType)value, diagnostics, context);
			case logPackage.LOGICAL_COMPUTING_PLATFORM:
				return validateLogicalComputingPlatform((LogicalComputingPlatform)value, diagnostics, context);
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS:
				return validateLogicalComputingPlatformLinks((LogicalComputingPlatformLinks)value, diagnostics, context);
			case logPackage.LOGICAL_PROCESSORS_TYPE:
				return validateLogicalProcessorsType((LogicalProcessorsType)value, diagnostics, context);
			case logPackage.LOGICAL_SYSTEM:
				return validateLogicalSystem((LogicalSystem)value, diagnostics, context);
			case logPackage.MODULE_SWITCH_TIME_TYPE:
				return validateModuleSwitchTimeType((ModuleSwitchTimeType)value, diagnostics, context);
			case logPackage.OS_TYPE:
				return validateOsType((OsType)value, diagnostics, context);
			case logPackage.STEP_DURATION_TYPE:
				return validateStepDurationType((StepDurationType)value, diagnostics, context);
			case logPackage.THROUGHPUT_TYPE:
				return validateThroughputType((ThroughputType)value, diagnostics, context);
			case logPackage.THROUGHPUT_TYPE1:
				return validateThroughputType1((ThroughputType1)value, diagnostics, context);
			case logPackage.TRANSPORT_BINDING_TYPE:
				return validateTransportBindingType((TransportBindingType)value, diagnostics, context);
			case logPackage.USE_TYPE:
				return validateUseType((UseType)value, diagnostics, context);
			case logPackage.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case logPackage.PROGRAMMING_LANGUAGE:
				return validateProgrammingLanguage((ProgrammingLanguage)value, diagnostics, context);
			case logPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case logPackage.HEX_OR_DEC_VALUE:
				return validateHexOrDecValue((String)value, diagnostics, context);
			case logPackage.LIBRARY_NAME:
				return validateLibraryName((String)value, diagnostics, context);
			case logPackage.NAME_ID:
				return validateNameId((String)value, diagnostics, context);
			case logPackage.NAME_TYPE_OBJECT:
				return validateNameTypeObject((NameType)value, diagnostics, context);
			case logPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return validateProgrammingLanguageObject((ProgrammingLanguage)value, diagnostics, context);
			case logPackage.STEPS:
				return validateSteps((Double)value, diagnostics, context);
			case logPackage.STEPS_OBJECT:
				return validateStepsObject((Double)value, diagnostics, context);
			case logPackage.TIME_DURATION:
				return validateTimeDuration((Double)value, diagnostics, context);
			case logPackage.TIME_DURATION_OBJECT:
				return validateTimeDurationObject((Double)value, diagnostics, context);
			case logPackage.TYPE_NAME:
				return validateTypeName((String)value, diagnostics, context);
			case logPackage.TYPE_QNAME:
				return validateTypeQName((String)value, diagnostics, context);
			case logPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailableMemoryType(AvailableMemoryType availableMemoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availableMemoryType, diagnostics, context);
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
	public boolean validateEndianessType(EndianessType endianessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endianessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyType(LatencyType latencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyType1(LatencyType1 latencyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType1(LinkType1 linkType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalComputingNodeLinks(LogicalComputingNodeLinks logicalComputingNodeLinks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalComputingNodeLinks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalComputingNodeType(LogicalComputingNodeType logicalComputingNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalComputingNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalComputingPlatform(LogicalComputingPlatform logicalComputingPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalComputingPlatform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalComputingPlatformLinks(LogicalComputingPlatformLinks logicalComputingPlatformLinks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalComputingPlatformLinks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalProcessorsType(LogicalProcessorsType logicalProcessorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalProcessorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalSystem(LogicalSystem logicalSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleSwitchTimeType(ModuleSwitchTimeType moduleSwitchTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleSwitchTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsType(OsType osType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepDurationType(StepDurationType stepDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepDurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputType(ThroughputType throughputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(throughputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputType1(ThroughputType1 throughputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(throughputType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportBindingType(TransportBindingType transportBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseType(UseType useType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguage(ProgrammingLanguage programmingLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexOrDecValue_Pattern(hexOrDecValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexOrDecValue_Pattern
	 */
	public static final  PatternMatcher [][] HEX_OR_DEC_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]+|[1-9][0-9]*|0")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hex Or Dec Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue_Pattern(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(logPackage.Literals.HEX_OR_DEC_VALUE, hexOrDecValue, HEX_OR_DEC_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLibraryName_Pattern(libraryName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLibraryName_Pattern
	 */
	public static final  PatternMatcher [][] LIBRARY_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_\\.]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Library Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName_Pattern(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(logPackage.Literals.LIBRARY_NAME, libraryName, LIBRARY_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(nameId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNameId_Pattern
	 */
	public static final  PatternMatcher [][] NAME_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId_Pattern(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(logPackage.Literals.NAME_ID, nameId, NAME_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameTypeObject(NameType nameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguageObject(ProgrammingLanguage programmingLanguageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(steps, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSteps_Min
	 */
	public static final double STEPS__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps_Min(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = steps >= STEPS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(logPackage.Literals.STEPS, steps, STEPS__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepsObject(Double stepsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(stepsObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDuration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeDuration_Min
	 */
	public static final double TIME_DURATION__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration_Min(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeDuration >= TIME_DURATION__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(logPackage.Literals.TIME_DURATION, timeDuration, TIME_DURATION__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDurationObject(Double timeDurationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDurationObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeName(String typeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(typeName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeQName_Pattern(typeQName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeQName_Pattern
	 */
	public static final  PatternMatcher [][] TYPE_QNAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Type QName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName_Pattern(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(logPackage.Literals.TYPE_QNAME, typeQName, TYPE_QNAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //logValidator
