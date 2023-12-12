/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.dassault.edt.log.EDTLog;

import edtproject.Steps;
import edttype.Array;
import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Enum;
import edttype.EnumPredefined;
import edttype.EnumValue;
import edttype.Field;
import edttype.FixedArray;
import edttype.Library;
import edttype.Simple;
import edttype.SimplePredefined;
import edttype.Union;
import edttype.VariantRecord;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see edttype.EDTTypePackage
 * @generated
 */
public class EDTTypeValidator extends EObjectValidator {

	private static final String THE_VALUE2 = ": \nThe value";

	private static final String ONE_OF_THE_VALUE_OF_THE_ARRAY = "One of the value of the array (";

	private static final String THE_VALUE = "The value ";

	private static final String ENTERED_IS_NOT_VALID_WITH_THE_TYPE = ") entered is not valid with the type ";

	private static final String UINT8 = "uint8";

	private static final String INT64 = "int64";

	private static final String UINT16 = "uint16";

	private static final String BYTE = "byte";

	private static final String CHAR8 = "char8";

	private static final String UINT64 = "uint64";

	private static final String UINT32 = "uint32";

	private static final String FLOAT32 = "float32";

	private static final String DOUBLE64 = "double64";

	private static final String INT32 = "int32";

	private static final String INT16 = "int16";

	private static final String INT8 = "int8";

	private static final String BOOLEAN8 = "boolean8";

	private static final String ERROR_NAME_IS_NOT_UNIQUE = "ERROR : Name is not unique";

	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final EDTTypeValidator INSTANCE = new EDTTypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource()
	 * source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode()
	 * codes} from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edttype";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Name Is Unique' of 'EDT Data Type'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EDT_DATA_TYPE__NAME_IS_UNIQUE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EDTTypeValidator() {
		super();
	}

	private static double[] int8RANGE = { -127.0, 127.0 };
	private static double[] int16RANGE = { -32767.0, 32767.0 };
	private static double[] int32RANGE = { -2147483647.0, 2147483647.0 };
	private static double[] int64RANGE = { -9223372036854775807.0, 9223372036854775807.0 };
	private static double[] byteRANGE = { 0, 255.0 };
	private static double[] uint8RANGE = { 0, 255.0 };
	private static double[] uint16RANGE = { 0, 65535.0 };
	private static double[] uint32RANGE = { 0, 4294967295.0 };
	private static double[] uint64RANGE = { 0, 18446744073709551615.0 };
	private static double[] float32RANGE = { -3.402823466e+38, 3.402823466e+38 };
	private static double[] double64RANGE = { -1.7976931348623157e+308, 1.7976931348623157e+308 };

	final protected static List<String> numericBasicType = Arrays.asList(INT8, INT16, INT32, INT64, UINT8, UINT16,
			UINT32, UINT64, BYTE, FLOAT32, DOUBLE64);

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EDTTypePackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEnumValue(EnumValue enumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumValue, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this
		// validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * 
	 * @param object
	 * @param value
	 * @generated NOT
	 * @return 0 if unique, 1 if not unique, 2 if BasicType Name, 3 if
	 *         predefinedType name
	 */
	public int validateName(Object object, Object value) {
		List<String> basicTypesNames = Arrays.asList(BOOLEAN8, INT8, INT16, INT32, INT64, UINT8, UINT16, UINT32, UINT64,
				CHAR8, BYTE, FLOAT32, DOUBLE64);
		List<String> predefinedTypeNames = Arrays.asList("hr_time", "global_time", "duration", "log", "pinfo_filename",
				"error_id", "error_code", "asset_id", "asset_type", "error_type", "recovery_action_type",
				"seek_whence_type", "return_status", "seconds", "nanoseconds", "COMPONENT", "PROTECTION_DOMAIN", "NODE",
				"PLATFORM", "SERVICE", "DEPLOYMENT", "RESOURCE_NOT_AVAILABLE", "UNAVAILABLE", "MEMORY_VIOLATION",
				"NUMERICAL_ERROR", "ILLEGAL_INSTRUCTION", "STACK_OVERFLOW", "DEADLINE_VIOLATION", "OVERFLOW",
				"UNDERFLOW", "ILLEGAL_INPUT_ARGS", "ILLEGAL_OUTPUT_ARGS", "ERROR", "FATAL_ERROR", "HARDWARE_FAULT",
				"POWER_FAIL", "COMMUNICATION_ERROR", "INVALID_CONFIG", "INITIALISATION_PROBLEM", "CLOCK_UNSYNCHRONIZED",
				"UNKNOWN_OPERATION", "OPERATION_OVERRATED", "OPERATION_UNDERRATED", "SHUTDOWN", "COLD_RESTART",
				"WARM_RESTART", "CHANGE_DEPLOYMENT", "SEEK_SET", "SEEK_CUR", "SEEK_END", "OK", "INVALID_HANDLE",
				"DATA_NOT_INITIALIZED", "NO_DATA", "INVALID_IDENTIFIER", "NO_RESPONSE", "OPERATION_ALREADY_PENDING",
				"CLOCK_UNSYNCHRONIZED", "RESOURCE_NOT_AVAILABLE", "OPERATION_NOT_AVAILABLE", "INVALID_PARAMETER");
		if (basicTypesNames.contains(value)) {
			if (object instanceof EDTDataType) {
				EDTLog.toPopUpAndConsole("Warning : Name is a BasicType name",
						"There is a BasicType with the name " + value + ", the BasicType will be overloaded");
			} else if (object instanceof Field || object instanceof Record || object instanceof Union) {
				EDTLog.toPopUpAndConsole("ERROR : Name is a BasicType name",
						"There is a BasicType with the name " + value);
			}
			return 2;
		} else if (predefinedTypeNames.contains(value)) {
			EDTLog.toPopUpAndConsole("ERROR : Name is restricted to ECOA Predefined Types",
					"There is a ECOA Predefined Type/Field/EnumValue with the name " + value);
			return 3;
		}
		Library library = Library.getLibrary(object);
		if (library != null) {
			EList<EDTDataType> dataTypes = library.getDataTypes();
			for (EDTDataType edtDataType : dataTypes) {
				if (!edtDataType.equals(object) && Objects.equals(value, edtDataType.getName())) {
					EDTLog.toPopUpAndConsole(ERROR_NAME_IS_NOT_UNIQUE,
							"There is a " + edtDataType.getClass().getSimpleName() + " with the name " + value);
					return 1;
				}

				EList<Field> fields = new BasicEList<>();
				if (edtDataType instanceof edttype.Record recordType) {
					fields = recordType.getField();
				}
				if (edtDataType instanceof edttype.VariantRecord recordType) {
					fields = recordType.getField();
				}
				for (Field field : fields) {
					if (!field.equals(object) && Objects.equals(value, field.getName())) {
						EDTLog.toPopUpAndConsole(ERROR_NAME_IS_NOT_UNIQUE, "There is a Field with the name " + value);
						return 1;
					}
				}

				if (edtDataType instanceof edttype.VariantRecord recordType) {
					EList<Union> unions = recordType.getUnion();
					for (Union union : unions) {
						if (!union.equals(object) && Objects.equals(value, union.getName())) {
							EDTLog.toPopUpAndConsole(ERROR_NAME_IS_NOT_UNIQUE,
									"There is an Union with the name " + value);
							return 1;
						}
					}
				}

				if (edtDataType instanceof edttype.Enum enumType) {
					EList<EnumValue> enumValues = enumType.getValue();
					for (EnumValue enumValue : enumValues) {
						if (!enumValue.equals(object) && Objects.equals(value, enumValue.getName())) {
							EDTLog.toPopUpAndConsole(ERROR_NAME_IS_NOT_UNIQUE,
									"There is an EnumValue with the name " + value);
							return 1;
						}
					}
				}
			}
		}
		return 0;

	}

	/**
	 * Validate type
	 * 
	 * @param typeRef
	 * @param dataType
	 * @return if the new typeref is valid
	 * @generated NOT
	 */
	public static boolean validateType(Object typeRef, Object dataType) {
//		ARRAY
		if (dataType instanceof Array)
			return (!Objects.equals(typeRef, dataType));
//		FIXED ARRAY
		else if (dataType instanceof FixedArray)
			return (!Objects.equals(typeRef, dataType));
//		CONSTANT
		else if (dataType instanceof Constant)
			return ((typeRef instanceof Simple simple && simple.getBasicType() != null
					&& !Objects.equals(simple.getBasicType().getName(), BOOLEAN8))
					|| (typeRef instanceof SimplePredefined simple
							&& !Objects.equals(simple.getBasicType().getName(), BOOLEAN8))
					|| (typeRef instanceof BasicType basicType && !Objects.equals(basicType.getName(), BOOLEAN8)));
//		ENUM
		else if (dataType instanceof Enum)
			return ((typeRef instanceof Simple simple && simple.getBasicType() != null
					&& simple.getBasicType().getName().contains("int"))
					|| (typeRef instanceof SimplePredefined simple
							&& !Objects.equals(simple.getBasicType().getName(), "int"))
					|| (typeRef instanceof BasicType basicType && basicType.getName().contains("int")));
//		SIMPLE
		else if (dataType instanceof Simple)
			return (!Objects.equals(typeRef, dataType) && (typeRef instanceof Simple
					|| typeRef instanceof SimplePredefined || typeRef instanceof BasicType));
//		VARIANT RECORD
		else if (dataType instanceof VariantRecord) {
			BasicType basic = null;
			if (typeRef instanceof Enum || typeRef instanceof EnumPredefined) {
				return true;
			} else {
				if (typeRef instanceof BasicType basicType)
					basic = basicType;
				else if (typeRef instanceof Simple simple)
					basic = simple.getBasicType();
				else if (typeRef instanceof SimplePredefined simple)
					basic = simple.getBasicType();
				else if (typeRef instanceof Constant constant)
					basic = constant.getBasicType();
				else if (typeRef instanceof Array array)
					basic = array.getBasicType();
				else if (typeRef instanceof ArrayPredefined array)
					basic = array.getBasicType();
				else if (typeRef instanceof FixedArray fixedArray)
					basic = fixedArray.getBasicType();
				return (basic != null && ((basic.getName().contains("boolean")) || basic.getName().contains("int")));
			}
		}
		return false;
	}

	/**
	 * Get Error String
	 * 
	 * @param dataType
	 * @return
	 * @generated NOT
	 */
	public static String getTypeReferenceError(Object dataType) {
		if (dataType instanceof Array array)
			return "The referenced type for the Array " + array.getFullName() + " can not be itself";
		else if (dataType instanceof FixedArray fixedArray)
			return "The referenced type for the FixedArray " + fixedArray.getFullName() + " can not be itself";
		else if (dataType instanceof Constant constant)
			return "The referenced type for the Constant " + constant.getFullName()
					+ " can only be a Basic Type or a Simple, both not boolean";
		else if (dataType instanceof Enum enumType)
			return "The referenced type for the Enum " + enumType.getFullName()
					+ " can only be a Basic Type or a Simple corresponding to Integer";
		else if (dataType instanceof Simple simple)
			return "The referenced type for the Simple " + simple.getFullName()
					+ " can only be Basic Type or Simple and not itself";
		else if (dataType instanceof VariantRecord variantRecord)
			return "The select type for the VariantRecord " + variantRecord.getFullName()
					+ " can only be a Basic Type, an enum or a type derived from boolean or integer";
		return "";
	}

	/**
	 * 
	 * @param value                 : value to test
	 * @param type                  : supposed type of value
	 * @param basicTypeName         : name of BasicType
	 * @param errorMessageToConsole : error message to display afterwards
	 * @return true if correct
	 */
	public static boolean verifyValueAccordingToBasicType(String value, String basicTypeName,
			StringBuilder errorMessageToConsole) {
		switch (basicTypeName) {
		case CHAR8: { /* the char can only take the ascii value between 0 and 127 */
			return isChar8(value);
		}
		case BOOLEAN8: { /* the boolean can only take 0 or 1 as value */
			if (!Objects.equals("0", value) && !Objects.equals("1", value)) {
				errorMessageToConsole.append("A boolean can only take 0 or 1 as value.");
				return false;
			}
			break;
		}

		case BYTE, INT8, INT16, INT32, INT64, UINT8, UINT16, UINT32, UINT64, FLOAT32,
				DOUBLE64: { /*
							 * the numeric value must be in a certain range and not contain alphabetical
							 * characters
							 */
			return verifyNumber(value, basicTypeName, errorMessageToConsole);

		}
		default:
			EDTLog.toConsole("WARNING : The name " + basicTypeName
					+ " does not correspond to a BasicType name, the value could not be verified.");
			return true;
		}
		return false;
	}

	/**
	 * @param str
	 * @param type
	 * @param errorMessageToConsole
	 */
	public static boolean verifyNumber(String str, String nameBasicType, StringBuilder errorMessageToConsole) {
		if (!isNumeric(str)) {
			errorMessageToConsole.append(THE_VALUE + str + " is not a numeric value.");
			return false;
		}

		double parseDouble = Double.parseDouble(str);
		double[] range = getRangeOfBasicType(nameBasicType);
		if (range.length != 2) {
			errorMessageToConsole.append(
					"WARNING : the value can not be verified. There was a problem with finding range of values for :"
							+ nameBasicType);
			return true;
		}
		if (parseDouble <= range[0] || parseDouble >= range[1]) {
			errorMessageToConsole.append(THE_VALUE + str + " is not in the " + nameBasicType + " range value ["
					+ range[0] + ";" + range[1] + "]");
			return false;
		}
		return true;
	}

	public static double[] getRangeOfBasicType(String name) {
		switch (name) {
		case BYTE:
			return byteRANGE;
		case INT8:
			return int8RANGE;
		case INT16:
			return int16RANGE;
		case INT32:
			return int32RANGE;
		case INT64:
			return int64RANGE;
		case UINT8:
			return uint8RANGE;
		case UINT16:
			return uint16RANGE;
		case UINT32:
			return uint32RANGE;
		case UINT64:
			return uint64RANGE;
		case FLOAT32:
			return float32RANGE;
		case DOUBLE64:
			return double64RANGE;
		default:
			return new double[0];
		}

	}

	/**
	 * Validate value
	 * 
	 * - if simple : according to BasicType
	 * 
	 * - if enum : must be an enumValue
	 * 
	 * @param value
	 * @param propertyType
	 */
	public static boolean validateValueAccordingToType(String value, EDTDataType type, String errorMessageToPopUp) {
		StringBuilder errorMessageToConsole = new StringBuilder();
		if (value.startsWith("%") && value.endsWith("%")) {
			if (!verifyConstant(value, type, errorMessageToConsole)) {
				EDTLog.toPopUpAndConsole(errorMessageToPopUp, errorMessageToConsole.toString());
				return false;
			} else {
				return true;
			}
		}
		if ((type instanceof BasicType basic
				&& !verifyValueAccordingToBasicType(value, basic.getName(), errorMessageToConsole))
				|| (type instanceof Enum enumType
						&& !verifyValueAccordingToEnumValue(value, enumType, errorMessageToConsole))
				|| (type instanceof Array array && !verifyValueOfArray(value, array, errorMessageToConsole))
				|| (type instanceof FixedArray array
						&& !verifyValueOfFixedArray(value, array, errorMessageToConsole))) {
			EDTLog.toPopUpAndConsole(errorMessageToPopUp, errorMessageToConsole.toString());
			return false;
		} else if (type instanceof Simple simple && simple.getBasicType() != null) {
			BasicType basicType = simple.getBasicType();
			String name = basicType.getName();
			if (!verifyValueAccordingToBasicType(value, name, errorMessageToConsole)
					|| !isSimpleRangeVerified(value, simple, name, errorMessageToConsole)) {
				EDTLog.toPopUpAndConsole(errorMessageToPopUp, errorMessageToConsole.toString());
				return false;
			}
		}
		return true;
	}

	/**
	 * @param value
	 * @param propertyType
	 * @param type
	 * @param errorMessageToConsole
	 */
	protected static boolean verifyConstant(String value, EDTDataType type, StringBuilder errorMessageToConsole) {
		Constant constantType = EDTDataType.findConstantValue(value,
				Steps.findStepsContainer(type).getStep0().getTypes().get(0));
		if (constantType == null) {
			errorMessageToConsole
					.append("ERROR : there is no Constant with the name " + value.substring(1, value.length() - 1)
							+ " : the value has to be a Constant with the format '%XY%'");
			return false;
		}
		if (!Objects.equals(constantType.getBasicType(), type.getBasicType())) {
			errorMessageToConsole.append("The constant is not a " + type.getBasicType().getName());
			return false;
		}
		return true;
	}

	/**
	 * Verifies that the value corresponds to one of the enumValue name
	 * 
	 * @param value                 : value entered
	 * @param enumType              : type of value
	 * @param errorMessageToConsole
	 */
	public static boolean verifyValueAccordingToEnumValue(String value, Enum enumType,
			StringBuilder errorMessageToConsole) {
		EList<EnumValue> enumValues = enumType.getValue();
		for (EnumValue enumValue : enumValues) {
			String enumValueName = enumValue.getName();
			if (Objects.equals(enumValueName, value)) {
				return true;
			}
		}
		errorMessageToConsole.append("The value" + value + " does not correspond to one of the enum value.");
		return false;
	}

	public static boolean verifyValueOfArray(String value, Array array, StringBuilder errorMessageToConsole) {
		double maxNumberDouble = getMaxNumberDouble(array.getMaxNumber(), array.getMaxNumberType());
		if (maxNumberDouble == Double.NaN) {
			EDTLog.toConsole("WARNING : The max number value could not be found, thus the value " + value
					+ " could not be verified.");
			return true;
		}
		BasicType basicType = array.getBasicType();
		if (value.contains("[") && value.contains("]")) {
			String substring = value.substring(1, value.length() - 1);
			String[] split = substring.split(",");
			if (split.length > maxNumberDouble) {
				errorMessageToConsole.append("The number of values in the array (" + value
						+ ENTERED_IS_NOT_VALID_WITH_THE_TYPE + array.getFullName() + " : the value" + value
						+ " does not respect the max number of items : " + maxNumberDouble + ".");
				return false;
			}
			for (String string : split) {
				if (!verifySplit(value, array.getName(), array.getItemType(), basicType, string,
						errorMessageToConsole)) {
					return false;
				}
			}
		} else if (basicType != null && basicType.getName().equals(CHAR8) && !value.contains("[")
				&& !value.contains("]")) {
			if (!value.chars().allMatch(c -> c < 128)) {
				errorMessageToConsole.append(THE_VALUE + value + " is not a valid character string.");
				return false;
			}
			if (value.length() > maxNumberDouble) {
				errorMessageToConsole.append(
						THE_VALUE + value + " does not respect the max number of items :  " + maxNumberDouble + ".");
				return false;
			}
		} else {
			errorMessageToConsole
					.append(THE_VALUE + value + " is not in the format \"[X,Y]\" and/or is not of char8 type.");
			return false;
		}
		return true;
	}

	public static double getMaxNumberDouble(String maxNumber, Constant maxNumberType) {
		if (maxNumberType != null) {
			return getConstantNumericValue(maxNumberType.getValue(), maxNumberType.getValueType());
		} else if (isNumeric(maxNumber)) {
			return Double.parseDouble(maxNumber);
		}
		return Double.NaN;
	}

	public static double getConstantNumericValue(Object value, Constant valueType) {
		if (valueType != null && value instanceof String) {
			return getConstantNumericValue(valueType.getValue(), valueType.getValueType());
		} else if (value instanceof Double d) {
			return d;
		}
		return Double.NaN;
	}

	public static Integer getConstantCharValue(Object value, Constant valueType) {
		if (valueType != null && value instanceof String string && string.contains("%")) {
			return getConstantCharValue(valueType.getValue(), valueType.getValueType());
		} else {
			return decodeChar8(value.toString());
		}
	}

	public static boolean verifyValueOfFixedArray(String value, FixedArray array, StringBuilder errorMessageToConsole) {
		double maxNumberDouble = getMaxNumberDouble(array.getMaxNumber(), array.getMaxNumberType());
		if (maxNumberDouble == Double.NaN) {
			EDTLog.toConsole("WARNING :The max number value could not be found, thus the value " + value
					+ " could not be verified.");
			return true;
		}
		BasicType basicType = array.getBasicType();
		if (value.contains("[") && value.contains("]")) {
			String substring = value.substring(1, value.length() - 1);
			String[] split = substring.split(",");
			if (split.length != maxNumberDouble) {
				errorMessageToConsole.append("The number of values in the array (" + value
						+ ENTERED_IS_NOT_VALID_WITH_THE_TYPE + array.getFullName() + ". The value " + value
						+ " does not respect the size of " + maxNumberDouble + ".");
				return false;
			}
			for (String string : split) {
				if (!verifySplit(value, array.getName(), array.getItemType(), basicType, string,
						errorMessageToConsole)) {
					return false;
				}
			}
		} else if (basicType != null && basicType.getName().equals(CHAR8) && !value.contains("[")
				&& !value.contains("]")) {
			if (!value.chars().allMatch(c -> c < 128)) {
				errorMessageToConsole.append(
						THE_VALUE + value + " is not in the format \"[X,Y]\" and is not a valid character string.");
				return false;
			}
			if (value.length() != maxNumberDouble) {
				errorMessageToConsole.append("The length of the string (" + value + ENTERED_IS_NOT_VALID_WITH_THE_TYPE
						+ array.getFullName() + " : the value does not respect the size of " + maxNumberDouble + ".");
				return false;

			}
		} else {
			errorMessageToConsole
					.append(THE_VALUE + value + " is not in the format \"[X,Y]\" and is not a valid character string.");
			return false;
		}
		return true;
	}

	/**
	 * @param value
	 * @param array
	 * @param basicType
	 * @param string
	 * @param errorMessageToConsole
	 */
	protected static boolean verifySplit(String value, String arrayName, EDTDataType itemType, BasicType basicType,
			String string, StringBuilder errorMessageToConsole) {
		String trim = string.trim();
		if (itemType instanceof Enum enumType
				&& !verifyValueAccordingToEnumValue(trim, enumType, errorMessageToConsole)) {
			EDTLog.toConsole(ONE_OF_THE_VALUE_OF_THE_ARRAY + value + ENTERED_IS_NOT_VALID_WITH_THE_TYPE + arrayName
					+ THE_VALUE2 + trim + " is not a value of the ItemType " + enumType.getFullName() + ".");
			return false;
		} else if (itemType instanceof Simple simple
				&& (!verifyValueAccordingToBasicType(trim, basicType.getName(), errorMessageToConsole)
						|| !isSimpleRangeVerified(trim, simple, basicType.getName(), errorMessageToConsole))) {
			EDTLog.toConsole(ONE_OF_THE_VALUE_OF_THE_ARRAY + value + ENTERED_IS_NOT_VALID_WITH_THE_TYPE + arrayName
					+ THE_VALUE2 + trim + " is not valid with the ItemType " + simple.getFullName() + ".\n"
					+ errorMessageToConsole.toString());
			return false;
		} else if (itemType instanceof BasicType basic
				&& !verifyValueAccordingToBasicType(trim, basicType.getName(), errorMessageToConsole)) {
			EDTLog.toConsole(ONE_OF_THE_VALUE_OF_THE_ARRAY + value + ENTERED_IS_NOT_VALID_WITH_THE_TYPE + arrayName
					+ THE_VALUE2 + trim + " is not valid with the ItemType " + basic.getFullName() + ".\n"
					+ errorMessageToConsole.toString());
			return false;
		}
		return true;
	}

	public static boolean isChar8(String value) {
		if (value.length() > 1) {
			try {
				Integer decode = Integer.decode(value);
				if (decode < 128) {
					return true;
				} else {
					EDTLog.toConsole("A char8 can only be a ASCII character of value [0;127].");
				}
			} catch (NumberFormatException e) {
				EDTLog.toConsole("The value does not correspond to a valid hexadecimal or integer value");
				return false;
			}
		} else if (value.length() == 1) {
			if (value.chars().allMatch(c -> c < 128)) {
				return true;
			} else {
				EDTLog.toConsole("A char8 can only be a ASCII character of value [0;127].");
			}
		}
		return false;
	}

	public static Integer decodeChar8(String value) {
		if (value.length() > 1) {
			Integer decode = Integer.decode(value);
			if (decode < 128) {
				return decode;
			} else {
				return null;
			}
		} else if (value.length() == 1) {
			if (value.chars().allMatch(c -> c < 128)) {
				return (int) value.charAt(0);
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * Verify if value is numeric
	 * 
	 * @param value : String entered as value
	 * @return true if numeric
	 */
	public static boolean isNumeric(String value) {
//		Assert if value is not null
		if (value == null) {
			return false;
		}

//		Try to convert to double and catch error if not
		try {
			Double.parseDouble(value);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isAPropertyType(EDTDataType type) {
		return (type instanceof BasicType || type instanceof Simple || type instanceof Enum
				|| (type instanceof FixedArray fixed && (fixed.getItemType() instanceof BasicType
						|| fixed.getItemType() instanceof Enum || fixed.getItemType() instanceof Simple))
				|| (type instanceof Array array && (array.getItemType() instanceof BasicType
						|| array.getItemType() instanceof Enum || array.getItemType() instanceof Simple)));
	}

	public static boolean isSimpleRangeVerified(String value, Simple simple, String basicTypeName,
			StringBuilder errorMessageToConsole) {
		if (numericBasicType.contains(basicTypeName)) {
			Double maxRange = simple.getMaxRange() == null ? null
					: getConstantNumericValue(simple.getMaxRange(), simple.getMaxRangeType());
			Double minRange = simple.getMinRange() == null ? null
					: getConstantNumericValue(simple.getMinRange(), simple.getMinRangeType());
			double parseDouble = Double.parseDouble(value);
			if (minRange != null && parseDouble < minRange) {
				errorMessageToConsole.append("The value must be higher than " + minRange + ".");
				return false;
			}
			if (maxRange != null && parseDouble > maxRange) {
				errorMessageToConsole.append("The value must be lower than " + maxRange + ".");

				return false;
			}
		} else if (basicTypeName.equals(CHAR8)) {
			Integer decodeChar8 = decodeChar8(value);
			Integer decodeChar8minRange = getConstantCharValue(simple.getMinRange(), simple.getMinRangeType());
			Integer decodeChar8maxRange = getConstantCharValue(simple.getMaxRange(), simple.getMaxRangeType());
			if (decodeChar8minRange != null && decodeChar8 < decodeChar8minRange) {
				errorMessageToConsole.append("The char value must be higher than " + decodeChar8minRange + " ("
						+ (char) (decodeChar8minRange.intValue()) + ").");
				return false;
			}
			if (decodeChar8maxRange != null && decodeChar8 > decodeChar8maxRange) {
				errorMessageToConsole.append("The char value must be lower than " + decodeChar8maxRange + " ("
						+ (char) (decodeChar8maxRange.intValue()) + ").");

				return false;
			}
		}
		return true;
	}

} // EDTTypesValidator
