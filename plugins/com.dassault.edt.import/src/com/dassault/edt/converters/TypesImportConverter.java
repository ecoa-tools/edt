/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.xmlimport.FailedImportException;

import edtproject.Step0;
import edttype.EDTDataType;
import edttype.EDTTypeFactory;
import technology.ecoa.types._2.Array;
import technology.ecoa.types._2.Constant;
import technology.ecoa.types._2.DataTypes;
import technology.ecoa.types._2.Enum;
import technology.ecoa.types._2.EnumValue;
import technology.ecoa.types._2.Field;
import technology.ecoa.types._2.FixedArray;
import technology.ecoa.types._2.Library;
import technology.ecoa.types._2.Record;
import technology.ecoa.types._2.Simple;
import technology.ecoa.types._2.Union;
import technology.ecoa.types._2.UseType;
import technology.ecoa.types._2.VariantRecord;

/**
 * Convert imported ECOA Types object to EDT Objects
 * 
 */
public class TypesImportConverter {
	private static final String WAS_FOUND = " was found.";
	private static final String THERE_IS_NO_CONSTANT_CORRESPONDING_TO = "There is no Constant corresponding to ";
	private static final EDTTypeFactory EDTTYPESFACTORY = EDTTypeFactory.eINSTANCE;
	private static List<String> basicTypesNames = Arrays.asList("boolean8", "int8", "int16", "int32", "int64", "uint8",
			"uint16", "uint32", "uint64", "char8", "byte", "float32", "double64");

	private TypesImportConverter() {

	}

	/**
	 * Create a EDT model library of types from a Ecoa model Library
	 * 
	 * @param library                   : Ecoa Library that has been imported
	 * @param fileName                  : name of the file
	 * @param associatedUsedLibraries   : Map of created library object and name of
	 *                                  used library to create association later
	 * @param associatedUsedTypes       : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param associatedConstantToTypes : DataTypes using Constant types
	 * @return EDT library
	 */
	public static edttype.Library createEDTLibrary(Library library, String fileName,
			Map<edttype.Library, ArrayList<String>> associatedUsedLibraries, Map<EObject, String> associatedUsedTypes,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty EDT library
		var edtLibrary = EDTTYPESFACTORY.createLibrary();

		// Set name of Library from file name
		String libraryName = EDTProjectImportConverter.getObjectName(fileName, ".types.xml");
		edtLibrary.setName(libraryName.replaceAll("__", "."));

		// Get used Libraries to associate when all the libraries are created
		EList<UseType> use = library.getUse();
		associatedUsedLibraries.put(edtLibrary, new ArrayList<>());
		for (UseType useType : use) {
			associatedUsedLibraries.get(edtLibrary).add(useType.getLibrary());
		}

		// Create types contained in Ecoa Library
		DataTypes types = library.getTypes();

		EList<Array> arrays = types.getArray();
		arrays.forEach(type -> edtLibrary.getDataTypes()
				.add(createEDTArray(type, associatedUsedTypes, associatedConstantToTypes)));

		EList<Constant> constants = types.getConstant();
		constants.forEach(type -> edtLibrary.getDataTypes()
				.add(createEDTConstant(type, associatedUsedTypes, associatedConstantToTypes)));

		EList<Enum> enumDatas = types.getEnum();
		enumDatas.forEach(type -> edtLibrary.getDataTypes()
				.add(createEDTEnum(type, associatedUsedTypes, associatedConstantToTypes)));

		EList<FixedArray> fixedArrays = types.getFixedArray();
		fixedArrays.forEach(type -> edtLibrary.getDataTypes()
				.add(createEDTFixedArray(type, associatedUsedTypes, associatedConstantToTypes)));

		EList<Record> records = types.getRecord();
		records.forEach(type -> edtLibrary.getDataTypes().add(createEDTRecord(type, associatedUsedTypes)));

		EList<Simple> simples = types.getSimple();
		simples.forEach(type -> edtLibrary.getDataTypes()
				.add(createEDTSimple(type, associatedUsedTypes, associatedConstantToTypes)));

		EList<VariantRecord> variantRecords = types.getVariantRecord();
		variantRecords
				.forEach(type -> edtLibrary.getDataTypes().add(createEDTVariantRecord(type, associatedUsedTypes)));
		return edtLibrary;
	}

	/**
	 * Create a EDT model Array from a Ecoa model Array
	 * 
	 * @param ecoaArray
	 * @param associatedUsedTypes       : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param associatedConstantToTypes
	 * @return edtArray
	 */
	private static edttype.Array createEDTArray(Array ecoaArray, Map<EObject, String> associatedUsedTypes,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtArray
		var edtArray = EDTTYPESFACTORY.createArray();

		// Fill edtArray with ecoaArray attributes
		edtArray.setName(ecoaArray.getName());
		edtArray.setComment(ecoaArray.getComment());
		edtArray.setMaxNumber(ecoaArray.getMaxNumber());
		if (ecoaArray.getMaxNumber().contains("%")) {
			associatedConstantToTypes.add(edtArray);
		}

		// Get all the referenced type to associate later
		associatedUsedTypes.put(edtArray, ecoaArray.getItemType());
		return edtArray;
	}

	/**
	 * Create a EDT model Constant from a Ecoa model Constant
	 * 
	 * @param ecoaConstant
	 * @param associatedUsedTypes : Map of created EDTDataType object and name of
	 *                            type referenced to create association later
	 * @return edtConstant
	 */
	private static edttype.Constant createEDTConstant(Constant ecoaConstant, Map<EObject, String> associatedUsedTypes,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtConstant
		var edtConstant = EDTTYPESFACTORY.createConstant();

		// Fill edtConstant with ecoaConstant attributes
		edtConstant.setName(ecoaConstant.getName());
		edtConstant.setComment(ecoaConstant.getComment());
		edtConstant.setValue(ecoaConstant.getValue());
		if (ecoaConstant.getValue() instanceof String && ((String) ecoaConstant.getValue()).contains("%")) {
			associatedConstantToTypes.add(edtConstant);
		}

		// Get all the referenced type to associate later
		associatedUsedTypes.put(edtConstant, ecoaConstant.getType());
		return edtConstant;
	}

	/**
	 * Create a EDT model Enum from a Ecoa model Enum
	 * 
	 * @param ecoaEnum
	 * @param associateUsedTypes        : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param associatedConstantToTypes
	 * @return edtEnum
	 */
	private static edttype.Enum createEDTEnum(Enum ecoaEnum, Map<EObject, String> associateUsedTypes,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtEnum
		var edtEnum = EDTTYPESFACTORY.createEnum();

		// Fill edtEnum with ecoaEnum attributes
		edtEnum.setName(ecoaEnum.getName());
		edtEnum.setComment(ecoaEnum.getComment());

		// Convert ecoaEnumValues to edtEnumValues
		EList<EnumValue> ecoaValues = ecoaEnum.getValue();
		ecoaValues.forEach(
				ecoaEnumValue -> edtEnum.getValue().add(createEDTEnumValue(ecoaEnumValue, associatedConstantToTypes)));

		// Get all the referenced type to associate later
		associateUsedTypes.put(edtEnum, ecoaEnum.getType());

		return edtEnum;
	}

	/**
	 * Create a EDT model EnumValue from a Ecoa model EnumValue
	 * 
	 * @param ecoaEnumValue
	 * @param associatedConstantToTypes
	 * @return edtEnumValue
	 */
	private static edttype.EnumValue createEDTEnumValue(EnumValue ecoaEnumValue,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtEnumValue
		edttype.EnumValue edtEnumValue = EDTTYPESFACTORY.createEnumValue();

		// Fill edtEnumValue with ecoaEnumValue attributes
		edtEnumValue.setComment(ecoaEnumValue.getComment());
		edtEnumValue.setName(ecoaEnumValue.getName());
		edtEnumValue.setValnum(ecoaEnumValue.getValnum());
		if (ecoaEnumValue.getValnum() != null && ecoaEnumValue.getValnum().contains("%")) {
			associatedConstantToTypes.add(edtEnumValue);
		}

		return edtEnumValue;
	}

	/**
	 * Create a EDT model FixedArray from a Ecoa model FixedArray
	 * 
	 * @param ecoaFixedArray
	 * @param associateUsedTypes        : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param associatedConstantToTypes
	 * @return edtFixedArray
	 */
	private static edttype.FixedArray createEDTFixedArray(FixedArray ecoaFixedArray,
			Map<EObject, String> associateUsedTypes, ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtFixedArray
		var edtFixedArray = EDTTYPESFACTORY.createFixedArray();

		// Fill edtFixedArray with ecoaFixedArray attributes
		edtFixedArray.setName(ecoaFixedArray.getName());
		edtFixedArray.setComment(ecoaFixedArray.getComment());
		edtFixedArray.setMaxNumber(ecoaFixedArray.getMaxNumber());
		if (ecoaFixedArray.getMaxNumber() != null && ecoaFixedArray.getMaxNumber().contains("%")) {
			associatedConstantToTypes.add(edtFixedArray);
		}

		// Get all the referenced type to associate later
		associateUsedTypes.put(edtFixedArray, ecoaFixedArray.getItemType());

		return edtFixedArray;
	}

	/**
	 * Create a EDT model Record from a Ecoa model Record
	 * 
	 * @param ecoaRecord
	 * @param associateUsedTypes : Map of created EDTDataType object and name of
	 *                           type referenced to create association later
	 * @return edtRecord
	 */
	private static edttype.Record createEDTRecord(Record ecoaRecord, Map<EObject, String> associateUsedTypes) {
		// Create empty edtRecord
		var edtRecord = EDTTYPESFACTORY.createRecord();

		// Fill edtRecord with ecoaRecord attributes
		edtRecord.setName(ecoaRecord.getName());
		edtRecord.setComment(ecoaRecord.getComment());

		// Convert ecoaFields to edtFields
		EList<Field> ecoaFields = ecoaRecord.getField();
		ecoaFields.forEach(ecoaField -> edtRecord.getField().add(createEDTField(ecoaField, associateUsedTypes)));

		return edtRecord;
	}

	/**
	 * Create a EDT model Field from a Ecoa model Field
	 * 
	 * @param ecoaField
	 * @param associateUsedTypes : Map of created EDTDataType object and name of
	 *                           type referenced to create association later
	 * @return edtField
	 */
	private static edttype.Field createEDTField(Field ecoaField, Map<EObject, String> associateUsedTypes) {
		// Create empty edtField
		var edtField = EDTTYPESFACTORY.createField();

		// Fill edtField with ecoaField attributes
		edtField.setComment(ecoaField.getComment());
		edtField.setName(ecoaField.getName());

		// Get all the referenced type to associate later
		associateUsedTypes.put(edtField, ecoaField.getType());

		return edtField;

	}

	/**
	 * Create a EDT model Simple from a Ecoa model Simple
	 * 
	 * @param ecoaSimple
	 * @param associatedUsedTypes       : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param associatedConstantToTypes
	 * @return edtSimple
	 */
	private static edttype.Simple createEDTSimple(Simple ecoaSimple, Map<EObject, String> associatedUsedTypes,
			ArrayList<EObject> associatedConstantToTypes) {
		// Create empty edtSimple
		var edtSimple = EDTTYPESFACTORY.createSimple();

		// Fill edtSimple with ecoaSimple attributes
		edtSimple.setName(ecoaSimple.getName());
		edtSimple.setComment(ecoaSimple.getComment());
		edtSimple.setMaxRange(ecoaSimple.getMaxRange());
		edtSimple.setMinRange(ecoaSimple.getMinRange());
		edtSimple.setPrecision(ecoaSimple.getPrecision());
		edtSimple.setUnit(ecoaSimple.getUnit());

		if ((ecoaSimple.getMaxRange() instanceof String && ((String) ecoaSimple.getMaxRange()).contains("%"))
				|| (ecoaSimple.getMinRange() instanceof String && ((String) ecoaSimple.getMinRange()).contains("%"))
				|| (ecoaSimple.getPrecision() instanceof String
						&& ((String) ecoaSimple.getPrecision()).contains("%"))) {
			associatedConstantToTypes.add(edtSimple);
		}

		// Get all the referenced type to associate later
		associatedUsedTypes.put(edtSimple, ecoaSimple.getType());

		return edtSimple;
	}

	/**
	 * Create a EDT model VariantRecord from a Ecoa model VariantRecord
	 * 
	 * @param ecoaVariantRecord
	 * @param associateUsedTypes : Map of created EDTDataType object and name of
	 *                           type referenced to create association later
	 * @return edtVariantRecord
	 */
	private static edttype.VariantRecord createEDTVariantRecord(VariantRecord ecoaVariantRecord,
			Map<EObject, String> associateUsedTypes) {
		// Create empty edtVariantRecord
		var edtVariantRecord = EDTTYPESFACTORY.createVariantRecord();

		// Fill edtVariantRecord with ecoaVariantRecord attributes
		edtVariantRecord.setName(ecoaVariantRecord.getName());
		edtVariantRecord.setComment(ecoaVariantRecord.getComment());
		edtVariantRecord.setSelectName(ecoaVariantRecord.getSelectName());

		// Convert ecoaFields to edtFields
		EList<Field> ecoaFields = ecoaVariantRecord.getField();
		ecoaFields.forEach(ecoaField -> edtVariantRecord.getField().add(createEDTField(ecoaField, associateUsedTypes)));

		// Convert ecoaUnions to edtUnions
		EList<Union> ecoaUnions = ecoaVariantRecord.getUnion();
		ecoaUnions.forEach(ecoaUnion -> edtVariantRecord.getUnion().add(createEDTUnion(ecoaUnion, associateUsedTypes)));

		// Get all the referenced type to associate later
		associateUsedTypes.put(edtVariantRecord, ecoaVariantRecord.getSelectType());

		return edtVariantRecord;
	}

	/**
	 * Create a EDT model Union from a Ecoa model Union
	 * 
	 * @param ecoaUnion
	 * @param associateUsedTypes : Map of created EDTDataType object and name of
	 *                           type referenced to create association later
	 * @return edtUnion
	 */
	private static edttype.Union createEDTUnion(Union ecoaUnion, Map<EObject, String> associateUsedTypes) {
		// Create empty edtUnion
		var edtUnion = EDTTYPESFACTORY.createUnion();

		// Fill edtUnion with ecoaUnion attributes
		edtUnion.setComment(ecoaUnion.getComment());
		edtUnion.setName(ecoaUnion.getName());
		edtUnion.setWhen(ecoaUnion.getWhen());

		// Get all the referenced type to associate later
		associateUsedTypes.put(edtUnion, ecoaUnion.getType());

		return edtUnion;
	}

	/**
	 * Associated used Library to Library
	 * 
	 * @param associatedUsedLibraries : Map of created library object and name of
	 *                                used library to create association later
	 * @param step0                   : list of EDT libraries created
	 * @throws FailedImportException if no library corresponds to the name
	 */
	public static void findAndAssociateUsedLibraries(Map<edttype.Library, ArrayList<String>> associatedUsedLibraries,
			Step0 step0) throws FailedImportException {

		// Loop on Map with the key being the referencing Library and the value
		// the name
		// of the used library
		for (Entry<edttype.Library, ArrayList<String>> entry : associatedUsedLibraries.entrySet()) {
			var edtLibrary = entry.getKey();
			ArrayList<String> namesOfAssociatedLibraries = entry.getValue();
			for (String nameOfAssociatedLibrary : namesOfAssociatedLibraries) {
				if (nameOfAssociatedLibrary.equals("ECOA")) {
					continue;
				}
				edttype.Library libraryToBeAssociated = step0.findLibrary(nameOfAssociatedLibrary);
				if (libraryToBeAssociated != null) {
					edtLibrary.getUsedLibraries().add(libraryToBeAssociated);
				} else {
					throw new FailedImportException("No Library was found with the name " + nameOfAssociatedLibrary);
				}
			}
		}
	}

	/**
	 * Associated used EDTDataType to type
	 * 
	 * @param associatedUsedTypes : Map of created EDTDataType object and name of
	 *                            type referenced to create association later
	 * @param typeStep            : all libraries created + BasicTypes
	 * @throws FailedImportException if no EDTDataType corresponds to the name
	 */
	public static void findAndAssociateTypes(Map<EObject, String> associatedUsedTypes, Step0 typeStep)
			throws FailedImportException {

		// Loop on Map with the key being the referencing Type and the value the
		// name of
		// the referenced EDTDataType
		for (Entry<EObject, String> entry : associatedUsedTypes.entrySet()) {
			String nameOfType = entry.getValue();
			EObject edtDataType = entry.getKey();

			EDTDataType edtDataTypeToAssociated;

			// If referenced Type is from another library or BasicType with
			// namespace written
			if (nameOfType.contains(":")) {
				String[] split = nameOfType.split(":");
				if (split.length != 2) {
					EDTLog.toConsole("ERROR: there are multiple ':' in :" + nameOfType);
					throw new FailedImportException("There is a problem with finding a type");
				}
				edtDataTypeToAssociated = typeStep.findInAllLibraries(split[0], split[1]);

				// If referenced type from same Library or BasicType without
				// namespace written
			} else if (edtDataType instanceof EDTDataType type) { /* EDTDataType */
				edttype.Library edtLibrary = (edttype.Library) edtDataType.eContainer();
				if (Objects.equals(type.getName(), nameOfType)) {
					edtDataTypeToAssociated = typeStep.findBasicType(nameOfType);
				} else {
					edtDataTypeToAssociated = findAndAssociateTypesInSameLibraryOrBasicTypes(nameOfType,
							edtLibrary.getDataTypes(), typeStep);
				}

			} else { /* Field, Union */
				edttype.Library edtLibrary = (edttype.Library) edtDataType.eContainer().eContainer();
				edtDataTypeToAssociated = findAndAssociateTypesInSameLibraryOrBasicTypes(nameOfType,
						edtLibrary.getDataTypes(), typeStep);
			}

			// Associate and if none found, throw error
			if (edtDataTypeToAssociated != null) {
				associateEDTType(edtDataType, edtDataTypeToAssociated);
			} else {
				throw new FailedImportException("No type corresponding to " + nameOfType + WAS_FOUND);
			}
		}
	}

	/**
	 * Associated EDTDataType associated in the correct attribute depending of the
	 * referencing type
	 * 
	 * @param edtDataType            : type that is referencing
	 * @param edtDataTypeToAssociate : type that is referenced
	 */
	private static void associateEDTType(EObject edtDataType, EDTDataType edtDataTypeToAssociate) {
		if (edtDataType instanceof edttype.Array type) {
			type.setItemType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.Constant type) {
			type.setType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.Enum type) {
			type.setType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.FixedArray type) {
			type.setItemType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.Simple type) {
			type.setType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.VariantRecord type) {
			type.setSelectType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.Field type) {
			type.setType(edtDataTypeToAssociate);
		} else if (edtDataType instanceof edttype.Union type) {
			type.setType(edtDataTypeToAssociate);
		}
	}

	/**
	 * Find type when no namespace is given
	 * 
	 * @param nameOfAssociatedType : name to find
	 * @param dataTypes            : dataType in the library
	 * @param typeStep
	 * @param type
	 * @return EDTDataType corresponding to the name
	 */
	private static EDTDataType findAndAssociateTypesInSameLibraryOrBasicTypes(String nameOfAssociatedType,
			EList<EDTDataType> dataTypes, Step0 typeStep) {
		// A DataType can overload a BasicType, XML-TYP-2 Legality Rules forces
		// the
		// check to be in the local namespace first
		for (EDTDataType dataTypeToCheck : dataTypes) {
			if (Objects.equals(dataTypeToCheck.getName(), (nameOfAssociatedType))) {
				return dataTypeToCheck;
			}
		}
		return typeStep.findBasicType(nameOfAssociatedType);
	}

	/**
	 * Find EDTDataType when the referencing element is not a Type
	 * 
	 * @param typeStep
	 * @param ecoaType
	 * @return EDTDataType
	 */
	static EDTDataType findEDTDataTypeForNonTypes(Step0 typeStep, String ecoaType) {
		if (ecoaType.contains(":")) {
			String[] split = ecoaType.split(":");
			if (split.length != 2) {
				EDTLog.toConsole("ERROR: there are multiple ':' in :" + ecoaType);
				return null;
			}
			return typeStep.findInAllLibraries(split[0], split[1]);
		} else {
			return typeStep.findBasicType(ecoaType);
		}
	}

	/**
	 * Associated used Constant to type
	 * 
	 * @param associatedConstantToTypes : Map of created EDTDataType object and name
	 *                                  of type referenced to create association
	 *                                  later
	 * @param typeStep                  : all libraries created + BasicTypes
	 * @throws FailedImportException if no EDTDataType corresponds to the name
	 */
	public static void findAndAssociateConstant(ArrayList<EObject> associatedConstantToTypes)
			throws FailedImportException {

		for (EObject eObject : associatedConstantToTypes) {
			if (eObject instanceof edttype.Array array) {
				edttype.Constant constantType = EDTDataType.findConstantValue(array.getMaxNumber(),
						(edttype.Library) array.eContainer());
				if (constantType == null) {
					throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + array.getMaxNumber());
				} else {
					array.setMaxNumberType(constantType);
				}

			} else if (eObject instanceof edttype.Constant constant) {
				edttype.Constant constantType = EDTDataType.findConstantValue((String) constant.getValue(),
						(edttype.Library) constant.eContainer());
				if (constantType == null) {
					throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + constant.getValue());
				} else {
					constant.setValueType(constantType);
				}
			} else if (eObject instanceof edttype.EnumValue enumValue) {
				edttype.Constant constantType = EDTDataType.findConstantValue(enumValue.getValnum(),
						(edttype.Library) enumValue.eContainer().eContainer());
				if (constantType == null) {
					throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + enumValue.getValnum());
				} else {
					enumValue.setValnumType(constantType);
				}
			} else if (eObject instanceof edttype.FixedArray fixedArray) {
				edttype.Constant constantType = EDTDataType.findConstantValue(fixedArray.getMaxNumber(),
						(edttype.Library) fixedArray.eContainer());
				if (constantType == null) {
					throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + fixedArray.getMaxNumber());
				} else {
					fixedArray.setMaxNumberType(constantType);
				}
			} else if (eObject instanceof edttype.Simple simple) {
				if (simple.getMaxRange() instanceof String maxRange && maxRange.contains("%")) {
					edttype.Constant constantType = EDTDataType.findConstantValue(maxRange,
							(edttype.Library) simple.eContainer());
					if (constantType == null) {
						throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + simple.getMaxRange());
					} else {
						simple.setMaxRangeType(constantType);
					}
				}

				if (simple.getMinRange() instanceof String minRange && minRange.contains("%")) {
					edttype.Constant constantType = EDTDataType.findConstantValue(minRange,
							(edttype.Library) simple.eContainer());
					if (constantType == null) {
						throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + simple.getMinRange());
					} else {
						simple.setMinRangeType(constantType);
					}
				}

				if (simple.getPrecision() instanceof String precision && precision.contains("%")) {
					edttype.Constant constantType = EDTDataType.findConstantValue(precision,
							(edttype.Library) simple.eContainer());
					if (constantType == null) {
						throw new FailedImportException(THERE_IS_NO_CONSTANT_CORRESPONDING_TO + simple.getPrecision());
					} else {
						simple.setPrecisionType(constantType);
					}
				}
			}
		}
	}
}
