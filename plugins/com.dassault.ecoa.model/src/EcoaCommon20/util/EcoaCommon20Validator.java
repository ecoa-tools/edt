/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package EcoaCommon20.util;

import EcoaCommon20.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see EcoaCommon20.EcoaCommon20Package
 * @generated
 */
public class EcoaCommon20Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoaCommon20Validator INSTANCE = new EcoaCommon20Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "EcoaCommon20";

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
	public EcoaCommon20Validator() {
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
	  return EcoaCommon20Package.eINSTANCE;
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
			case EcoaCommon20Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case EcoaCommon20Package.USE_TYPE:
				return validateUseType((UseType)value, diagnostics, context);
			case EcoaCommon20Package.PROGRAMMING_LANGUAGE:
				return validateProgrammingLanguage((ProgrammingLanguage)value, diagnostics, context);
			case EcoaCommon20Package.HEX_OR_DEC_VALUE:
				return validateHexOrDecValue((String)value, diagnostics, context);
			case EcoaCommon20Package.LIBRARY_NAME:
				return validateLibraryName((String)value, diagnostics, context);
			case EcoaCommon20Package.NAME_ID:
				return validateNameId((String)value, diagnostics, context);
			case EcoaCommon20Package.PROGRAMMING_LANGUAGE_OBJECT:
				return validateProgrammingLanguageObject((ProgrammingLanguage)value, diagnostics, context);
			case EcoaCommon20Package.STEPS:
				return validateSteps((Double)value, diagnostics, context);
			case EcoaCommon20Package.STEPS_OBJECT:
				return validateStepsObject((Double)value, diagnostics, context);
			case EcoaCommon20Package.TIME_DURATION:
				return validateTimeDuration((Double)value, diagnostics, context);
			case EcoaCommon20Package.TIME_DURATION_OBJECT:
				return validateTimeDurationObject((Double)value, diagnostics, context);
			case EcoaCommon20Package.TYPE_NAME:
				return validateTypeName((String)value, diagnostics, context);
			case EcoaCommon20Package.TYPE_QNAME:
				return validateTypeQName((String)value, diagnostics, context);
			default:
				return true;
		}
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
	public boolean validateUseType(UseType useType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useType, diagnostics, context);
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
		return validatePattern(EcoaCommon20Package.Literals.HEX_OR_DEC_VALUE, hexOrDecValue, HEX_OR_DEC_VALUE__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(EcoaCommon20Package.Literals.LIBRARY_NAME, libraryName, LIBRARY_NAME__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(EcoaCommon20Package.Literals.NAME_ID, nameId, NAME_ID__PATTERN__VALUES, diagnostics, context);
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
			reportMinViolation(EcoaCommon20Package.Literals.STEPS, steps, STEPS__MIN__VALUE, true, diagnostics, context);
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
			reportMinViolation(EcoaCommon20Package.Literals.TIME_DURATION, timeDuration, TIME_DURATION__MIN__VALUE, true, diagnostics, context);
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
		return validatePattern(EcoaCommon20Package.Literals.TYPE_QNAME, typeQName, TYPE_QNAME__PATTERN__VALUES, diagnostics, context);
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

} //EcoaCommon20Validator
