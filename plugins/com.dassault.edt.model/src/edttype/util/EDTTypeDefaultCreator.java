/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edtproject.Step0;
import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.EDTDataType;
import edttype.EDTTypeFactory;
import edttype.EnumPredefined;
import edttype.EnumValuePredefined;
import edttype.FieldPredefined;
import edttype.PredefinedType;
import edttype.RecordPredefined;
import edttype.SimplePredefined;

public class EDTTypeDefaultCreator {
	private static final EDTTypeFactory EDTTYPESFACTORY = EDTTypeFactory.eINSTANCE;

	private static List<String> basicTypesNames = Arrays.asList("boolean8", "int8", "int16", "int32", "int64", "uint8",
			"uint16", "uint32", "uint64", "char8", "byte", "float32", "double64");

	private EDTTypeDefaultCreator() {

	}

	/**
	 * Create all the BasicTypes from the String List
	 * 
	 * @return list of created BasicTypes
	 */
	public static EList<BasicType> createBasicTypes() {
		EList<BasicType> basicTypeList = new BasicEList<>();
		BasicType basicType;
		for (String name : basicTypesNames) {
			basicType = EDTTYPESFACTORY.createBasicType();
			basicType.setName(name);
			basicTypeList.add(basicType);
		}
		return basicTypeList;
	}

	/**
	 * Create all the PredefinedTypes
	 * 
	 * @param typesStep : basicTypes
	 * @return list of PredefinedTypes
	 */
	public static EList<PredefinedType> createPredefinedTypes(Step0 typesStep) {
		EList<PredefinedType> predefinedTypeList = new BasicEList<>();
		EDTDataType uint32 = typesStep.findBasicType("uint32");
		EDTDataType char8 = typesStep.findBasicType("char8");

		RecordPredefined hrTime = EDTTYPESFACTORY.createRecordPredefined();
		hrTime.setName("hr_time");
		hrTime.getField().addAll(createSecondsFields(uint32));

		predefinedTypeList.add(hrTime);
		RecordPredefined globalTime = EDTTYPESFACTORY.createRecordPredefined();
		globalTime.setName("global_time");
		globalTime.getField().addAll(createSecondsFields(uint32));
		predefinedTypeList.add(globalTime);

		RecordPredefined duration = EDTTYPESFACTORY.createRecordPredefined();
		duration.setName("duration");
		duration.getField().addAll(createSecondsFields(uint32));
		predefinedTypeList.add(duration);

		ArrayPredefined log = EDTTYPESFACTORY.createArrayPredefined();
		log.setItemType(char8);
		log.setName("log");
		log.setMaxNumber("256");
		predefinedTypeList.add(log);

		ArrayPredefined pinfoFilename = EDTTYPESFACTORY.createArrayPredefined();
		pinfoFilename.setItemType(char8);
		pinfoFilename.setName("pinfo_filename");
		pinfoFilename.setMaxNumber("256");
		predefinedTypeList.add(pinfoFilename);

		SimplePredefined errorID = EDTTYPESFACTORY.createSimplePredefined();
		errorID.setType(uint32);
		errorID.setName("error_id");
		predefinedTypeList.add(errorID);

		SimplePredefined errorCode = EDTTYPESFACTORY.createSimplePredefined();
		errorCode.setType(uint32);
		errorCode.setName("error_code");
		predefinedTypeList.add(errorCode);

		SimplePredefined assetID = EDTTYPESFACTORY.createSimplePredefined();
		assetID.setType(uint32);
		assetID.setName("asset_id");
		predefinedTypeList.add(assetID);

		EnumPredefined assetType = EDTTYPESFACTORY.createEnumPredefined();
		assetType.setName("asset_type");
		assetType.setType(uint32);
		List<String> assetTypeValues = Arrays.asList("COMPONENT", "PROTECTION_DOMAIN", "NODE", "PLATFORM", "SERVICE",
				"DEPLOYMENT");
		assetType.getValue().addAll(createEnumValuePredefinedFromList(assetTypeValues));
		predefinedTypeList.add(assetType);

		EnumPredefined errorType = EDTTYPESFACTORY.createEnumPredefined();
		errorType.setName("error_type");
		errorType.setType(uint32);
		List<String> errorTypeValues = Arrays.asList("RESOURCE_NOT_AVAILABLE", "UNAVAILABLE", "MEMORY_VIOLATION",
				"NUMERICAL_ERROR", "ILLEGAL_INSTRUCTION", "STACK_OVERFLOW", "DEADLINE_VIOLATION", "OVERFLOW",
				"UNDERFLOW", "ILLEGAL_INPUT_ARGS", "ILLEGAL_OUTPUT_ARGS", "ERROR", "FATAL_ERROR", "HARDWARE_FAULT",
				"POWER_FAIL", "COMMUNICATION_ERROR", "INVALID_CONFIG", "INITIALISATION_PROBLEM", "CLOCK_UNSYNCHRONIZED",
				"UNKNOWN_OPERATION", "OPERATION_OVERRATED", "OPERATION_UNDERRATED");
		errorType.getValue().addAll(createEnumValuePredefinedFromList(errorTypeValues));
		predefinedTypeList.add(errorType);

		EnumPredefined recoveryActionType = EDTTYPESFACTORY.createEnumPredefined();
		recoveryActionType.setName("recovery_action_type");
		recoveryActionType.setType(uint32);
		List<String> recoveryActionTypeValues = Arrays.asList("SHUTDOWN", "COLD_RESTART", "WARM_RESTART",
				"CHANGE_DEPLOYMENT");
		recoveryActionType.getValue().addAll(createEnumValuePredefinedFromList(recoveryActionTypeValues));
		predefinedTypeList.add(recoveryActionType);

		EnumPredefined seekWhenceType = EDTTYPESFACTORY.createEnumPredefined();
		seekWhenceType.setName("seek_whence_type");
		seekWhenceType.setType(uint32);
		List<String> seekWhenceTypeValues = Arrays.asList("SEEK_SET", "SEEK_CUR", "SEEK_END");
		seekWhenceType.getValue().addAll(createEnumValuePredefinedFromList(seekWhenceTypeValues));
		predefinedTypeList.add(seekWhenceType);

		EnumPredefined returnStatus = EDTTYPESFACTORY.createEnumPredefined();
		returnStatus.setName("return_status");
		returnStatus.setType(uint32);
		List<String> returnStatusValues = Arrays.asList("OK", "INVALID_HANDLE", "DATA_NOT_INITIALIZED", "NO_DATA",
				"INVALID_IDENTIFIER", "NO_RESPONSE", "OPERATION_ALREADY_PENDING", "CLOCK_UNSYNCHRONIZED",
				"RESOURCE_NOT_AVAILABLE", "OPERATION_NOT_AVAILABLE", "INVALID_PARAMETER");
		returnStatus.getValue().addAll(createEnumValuePredefinedFromList(returnStatusValues));
		predefinedTypeList.add(returnStatus);

		return predefinedTypeList;
	}

	/**
	 * Create all the PredefinedTypes
	 * 
	 * @param uint32 : basicType
	 * @return list of PredefinedTypes
	 */
	public static EList<FieldPredefined> createSecondsFields(EDTDataType uint32) {
		EList<FieldPredefined> fields = new BasicEList<>();
		FieldPredefined seconds = EDTTYPESFACTORY.createFieldPredefined();
		seconds.setName("seconds");
		seconds.setType(uint32);
		fields.add(seconds);
		FieldPredefined nanoseconds = EDTTYPESFACTORY.createFieldPredefined();
		nanoseconds.setName("nanoseconds");
		nanoseconds.setType(uint32);
		fields.add(nanoseconds);
		return fields;
	}

	/**
	 * Create list of EnumValuePredefined from List of names with incrementing value
	 * 
	 * @param names : list of names
	 * @return list of EnumValue for PredefinedTypes
	 */
	public static EList<EnumValuePredefined> createEnumValuePredefinedFromList(List<String> names) {
		EList<EnumValuePredefined> enumValues = new BasicEList<>();
		int value = 0;
		for (String name : names) {
			EnumValuePredefined enumValuePredefined = EDTTYPESFACTORY.createEnumValuePredefined();
			enumValuePredefined.setName(name);
			enumValuePredefined.setValnum(Integer.toString(value));
			enumValues.add(enumValuePredefined);
			value++;
		}
		return enumValues;
	}

} // EDTTypesValidator
