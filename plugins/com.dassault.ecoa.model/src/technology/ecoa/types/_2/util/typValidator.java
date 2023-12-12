/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import technology.ecoa.types._2.Array;
import technology.ecoa.types._2.Constant;
import technology.ecoa.types._2.DataTypes;
import technology.ecoa.types._2.DocumentRoot;
import technology.ecoa.types._2.EBasic;
import technology.ecoa.types._2.EnumValue;
import technology.ecoa.types._2.Field;
import technology.ecoa.types._2.FixedArray;
import technology.ecoa.types._2.Library;
import technology.ecoa.types._2.ProgrammingLanguage;
import technology.ecoa.types._2.Simple;
import technology.ecoa.types._2.Union;
import technology.ecoa.types._2.UseType;
import technology.ecoa.types._2.VariantRecord;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.types._2.typPackage
 * @generated
 */
public class typValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final typValidator INSTANCE = new typValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "technology.ecoa.types._2";

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
	public typValidator() {
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
	  return typPackage.eINSTANCE;
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
			case typPackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case typPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case typPackage.DATA_TYPES:
				return validateDataTypes((DataTypes)value, diagnostics, context);
			case typPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case typPackage.ENUM:
				return validateEnum((technology.ecoa.types._2.Enum)value, diagnostics, context);
			case typPackage.ENUM_VALUE:
				return validateEnumValue((EnumValue)value, diagnostics, context);
			case typPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case typPackage.FIXED_ARRAY:
				return validateFixedArray((FixedArray)value, diagnostics, context);
			case typPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case typPackage.RECORD:
				return validateRecord((technology.ecoa.types._2.Record)value, diagnostics, context);
			case typPackage.SIMPLE:
				return validateSimple((Simple)value, diagnostics, context);
			case typPackage.UNION:
				return validateUnion((Union)value, diagnostics, context);
			case typPackage.USE_TYPE:
				return validateUseType((UseType)value, diagnostics, context);
			case typPackage.VARIANT_RECORD:
				return validateVariantRecord((VariantRecord)value, diagnostics, context);
			case typPackage.EBASIC:
				return validateEBasic((EBasic)value, diagnostics, context);
			case typPackage.PROGRAMMING_LANGUAGE:
				return validateProgrammingLanguage((ProgrammingLanguage)value, diagnostics, context);
			case typPackage.CHAR_CONSTANT_TYPE:
				return validateCharConstantType((String)value, diagnostics, context);
			case typPackage.CONSTANT_REFERENCE:
				return validateConstantReference((String)value, diagnostics, context);
			case typPackage.CONSTANT_REFERENCE_OR_INTEGER_VALUE:
				return validateConstantReferenceOrIntegerValue((String)value, diagnostics, context);
			case typPackage.CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE:
				return validateConstantReferenceOrPositiveIntegerValue((String)value, diagnostics, context);
			case typPackage.CONSTANT_REFERENCE_OR_VALUE:
				return validateConstantReferenceOrValue(value, diagnostics, context);
			case typPackage.CONSTANT_VALUE:
				return validateConstantValue(value, diagnostics, context);
			case typPackage.EBASIC_OBJECT:
				return validateEBasicObject((EBasic)value, diagnostics, context);
			case typPackage.HEXA_CHAR_CONSTANT_TYPE:
				return validateHexaCharConstantType((String)value, diagnostics, context);
			case typPackage.HEX_OR_DEC_VALUE:
				return validateHexOrDecValue((String)value, diagnostics, context);
			case typPackage.LIBRARY_NAME:
				return validateLibraryName((String)value, diagnostics, context);
			case typPackage.NAME_ID:
				return validateNameId((String)value, diagnostics, context);
			case typPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return validateProgrammingLanguageObject((ProgrammingLanguage)value, diagnostics, context);
			case typPackage.STEPS:
				return validateSteps((Double)value, diagnostics, context);
			case typPackage.STEPS_OBJECT:
				return validateStepsObject((Double)value, diagnostics, context);
			case typPackage.TIME_DURATION:
				return validateTimeDuration((Double)value, diagnostics, context);
			case typPackage.TIME_DURATION_OBJECT:
				return validateTimeDurationObject((Double)value, diagnostics, context);
			case typPackage.TYPE_NAME:
				return validateTypeName((String)value, diagnostics, context);
			case typPackage.TYPE_QNAME:
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
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypes(DataTypes dataTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypes, diagnostics, context);
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
	public boolean validateEnum(technology.ecoa.types._2.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enum_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumValue(EnumValue enumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedArray(FixedArray fixedArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedArray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecord(technology.ecoa.types._2.Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(record, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimple(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnion(Union union, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(union, diagnostics, context);
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
	public boolean validateVariantRecord(VariantRecord variantRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantRecord, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBasic(EBasic eBasic, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateCharConstantType(String charConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharConstantType_Pattern(charConstantType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharConstantType_MinLength(charConstantType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharConstantType_MaxLength(charConstantType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCharConstantType_Pattern
	 */
	public static final  PatternMatcher [][] CHAR_CONSTANT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{IsBasicLatin}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Char Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharConstantType_Pattern(String charConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(typPackage.Literals.CHAR_CONSTANT_TYPE, charConstantType, CHAR_CONSTANT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Char Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharConstantType_MinLength(String charConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = charConstantType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(typPackage.Literals.CHAR_CONSTANT_TYPE, charConstantType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Char Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharConstantType_MaxLength(String charConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = charConstantType.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(typPackage.Literals.CHAR_CONSTANT_TYPE, charConstantType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReference(String constantReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstantReference_Pattern(constantReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConstantReference_Pattern
	 */
	public static final  PatternMatcher [][] CONSTANT_REFERENCE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("%([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Constant Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReference_Pattern(String constantReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(typPackage.Literals.CONSTANT_REFERENCE, constantReference, CONSTANT_REFERENCE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrIntegerValue(String constantReferenceOrIntegerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstantReferenceOrIntegerValue_Pattern(constantReferenceOrIntegerValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConstantReferenceOrIntegerValue_Pattern
	 */
	public static final  PatternMatcher [][] CONSTANT_REFERENCE_OR_INTEGER_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("%([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%|(\\+|-)?[0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Constant Reference Or Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrIntegerValue_Pattern(String constantReferenceOrIntegerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(typPackage.Literals.CONSTANT_REFERENCE_OR_INTEGER_VALUE, constantReferenceOrIntegerValue, CONSTANT_REFERENCE_OR_INTEGER_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrPositiveIntegerValue(String constantReferenceOrPositiveIntegerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstantReferenceOrPositiveIntegerValue_Pattern(constantReferenceOrPositiveIntegerValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConstantReferenceOrPositiveIntegerValue_Pattern
	 */
	public static final  PatternMatcher [][] CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("%([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*%|[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Constant Reference Or Positive Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrPositiveIntegerValue_Pattern(String constantReferenceOrPositiveIntegerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(typPackage.Literals.CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE, constantReferenceOrPositiveIntegerValue, CONSTANT_REFERENCE_OR_POSITIVE_INTEGER_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrValue(Object constantReferenceOrValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstantReferenceOrValue_MemberTypes(constantReferenceOrValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Constant Reference Or Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantReferenceOrValue_MemberTypes(Object constantReferenceOrValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (typPackage.Literals.CONSTANT_REFERENCE.isInstance(constantReferenceOrValue)) {
				if (validateConstantReference((String)constantReferenceOrValue, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(constantReferenceOrValue)) {
				if (xmlTypeValidator.validateDouble((Double)constantReferenceOrValue, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(constantReferenceOrValue)) {
				if (xmlTypeValidator.validateInteger((BigInteger)constantReferenceOrValue, tempDiagnostics, context)) return true;
			}
			if (typPackage.Literals.CHAR_CONSTANT_TYPE.isInstance(constantReferenceOrValue)) {
				if (validateCharConstantType((String)constantReferenceOrValue, tempDiagnostics, context)) return true;
			}
			if (typPackage.Literals.HEXA_CHAR_CONSTANT_TYPE.isInstance(constantReferenceOrValue)) {
				if (validateHexaCharConstantType((String)constantReferenceOrValue, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (typPackage.Literals.CONSTANT_REFERENCE.isInstance(constantReferenceOrValue)) {
				if (validateConstantReference((String)constantReferenceOrValue, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(constantReferenceOrValue)) {
				if (xmlTypeValidator.validateDouble((Double)constantReferenceOrValue, null, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(constantReferenceOrValue)) {
				if (xmlTypeValidator.validateInteger((BigInteger)constantReferenceOrValue, null, context)) return true;
			}
			if (typPackage.Literals.CHAR_CONSTANT_TYPE.isInstance(constantReferenceOrValue)) {
				if (validateCharConstantType((String)constantReferenceOrValue, null, context)) return true;
			}
			if (typPackage.Literals.HEXA_CHAR_CONSTANT_TYPE.isInstance(constantReferenceOrValue)) {
				if (validateHexaCharConstantType((String)constantReferenceOrValue, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantValue(Object constantValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstantValue_MemberTypes(constantValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantValue_MemberTypes(Object constantValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(constantValue)) {
				if (xmlTypeValidator.validateDouble((Double)constantValue, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(constantValue)) {
				if (xmlTypeValidator.validateInteger((BigInteger)constantValue, tempDiagnostics, context)) return true;
			}
			if (typPackage.Literals.CHAR_CONSTANT_TYPE.isInstance(constantValue)) {
				if (validateCharConstantType((String)constantValue, tempDiagnostics, context)) return true;
			}
			if (typPackage.Literals.HEXA_CHAR_CONSTANT_TYPE.isInstance(constantValue)) {
				if (validateHexaCharConstantType((String)constantValue, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DOUBLE.isInstance(constantValue)) {
				if (xmlTypeValidator.validateDouble((Double)constantValue, null, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(constantValue)) {
				if (xmlTypeValidator.validateInteger((BigInteger)constantValue, null, context)) return true;
			}
			if (typPackage.Literals.CHAR_CONSTANT_TYPE.isInstance(constantValue)) {
				if (validateCharConstantType((String)constantValue, null, context)) return true;
			}
			if (typPackage.Literals.HEXA_CHAR_CONSTANT_TYPE.isInstance(constantValue)) {
				if (validateHexaCharConstantType((String)constantValue, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBasicObject(EBasic eBasicObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexaCharConstantType(String hexaCharConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexaCharConstantType_Pattern(hexaCharConstantType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexaCharConstantType_Pattern
	 */
	public static final  PatternMatcher [][] HEXA_CHAR_CONSTANT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f][0-9A-Fa-f]|0x[0-9A-Fa-f]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hexa Char Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexaCharConstantType_Pattern(String hexaCharConstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(typPackage.Literals.HEXA_CHAR_CONSTANT_TYPE, hexaCharConstantType, HEXA_CHAR_CONSTANT_TYPE__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(typPackage.Literals.HEX_OR_DEC_VALUE, hexOrDecValue, HEX_OR_DEC_VALUE__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(typPackage.Literals.LIBRARY_NAME, libraryName, LIBRARY_NAME__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(typPackage.Literals.NAME_ID, nameId, NAME_ID__PATTERN__VALUES, diagnostics, context);
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
			reportMinViolation(typPackage.Literals.STEPS, steps, STEPS__MIN__VALUE, true, diagnostics, context);
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
			reportMinViolation(typPackage.Literals.TIME_DURATION, timeDuration, TIME_DURATION__MIN__VALUE, true, diagnostics, context);
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
		return validatePattern(typPackage.Literals.TYPE_QNAME, typeQName, TYPE_QNAME__PATTERN__VALUES, diagnostics, context);
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

} //typValidator
