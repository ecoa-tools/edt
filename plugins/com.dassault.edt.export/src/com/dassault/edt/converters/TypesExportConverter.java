/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edttype.EDTDataType;
import technology.ecoa.types._2.Array;
import technology.ecoa.types._2.Constant;
import technology.ecoa.types._2.Enum;
import technology.ecoa.types._2.EnumValue;
import technology.ecoa.types._2.Field;
import technology.ecoa.types._2.FixedArray;
import technology.ecoa.types._2.Record;
import technology.ecoa.types._2.Simple;
import technology.ecoa.types._2.Union;
import technology.ecoa.types._2.UseType;
import technology.ecoa.types._2.VariantRecord;
import technology.ecoa.types._2.typFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class TypesExportConverter {
	private static final String ECOA_NAMESPACE = "ECOA:";
	private static final typFactory TYPFACTORY = typFactory.eINSTANCE;

	private TypesExportConverter() {

	}

	/**
	 * Convert EDT Library to Ecoa Library
	 * 
	 * @param edtLibrary : library to convert
	 * @return ecoaLibrary in DocumentRoot
	 */
	public static technology.ecoa.types._2.DocumentRoot recreateLibrary(edttype.Library edtLibrary) {
//		Create empty ecoa Library
		var ecoaLibrary = TYPFACTORY.createLibrary();

//		Recreate Used Library in Ecoa Style
		EList<edttype.Library> usedLibraries = edtLibrary.getUsedLibraries();
		usedLibraries.forEach(edtLibraryUsed -> ecoaLibrary.getUse().add(recreateUseType(edtLibraryUsed)));

//		Recreate DataTypes
		var types = TYPFACTORY.createDataTypes();
		EList<EDTDataType> dataTypes = edtLibrary.getDataTypes();
		for (EDTDataType edtDataType : dataTypes) {

			if (edtDataType instanceof edttype.Array type) {
				types.getArray().add(recreateArray(type));

			} else if (edtDataType instanceof edttype.Constant type) {
				types.getConstant().add(recreateConstant(type));

			} else if (edtDataType instanceof edttype.Enum type) {
				types.getEnum().add(recreateEnum(type));

			} else if (edtDataType instanceof edttype.FixedArray type) {
				types.getFixedArray().add(recreateFixedArray(type));

			} else if (edtDataType instanceof edttype.Record type) {
				types.getRecord().add(recreateRecord(type));

			} else if (edtDataType instanceof edttype.Simple type) {
				types.getSimple().add(recreateSimple(type));

			} else if (edtDataType instanceof edttype.VariantRecord type) {
				types.getVariantRecord().add(recreateVariantRecord(type));
			}
		}
		ecoaLibrary.setTypes(types);

//		Create DocumentRoot to add Library
		var documentRoot = TYPFACTORY.createDocumentRoot();
		documentRoot.setLibrary(ecoaLibrary);
		return documentRoot;
	}

	/**
	 * Convert EDT Library reference to Ecoa UseType
	 * 
	 * @param usedLibrary
	 * @return useType with used Library name
	 */
	private static UseType recreateUseType(edttype.Library usedLibrary) {
//		Create empty ecoa UseType
		UseType useType = TYPFACTORY.createUseType();

//		Set used Library name
		useType.setLibrary(usedLibrary.getName().replaceAll("\\.", "__"));

		return useType;
	}

	/**
	 * Convert EDT Array to Ecoa Array
	 * 
	 * @param edtArray
	 * @return ecoaArray
	 */
	private static Array recreateArray(edttype.Array edtArray) {
//		Create empty ecoa Library
		var ecoaArray = TYPFACTORY.createArray();

//		Fill ecoaArray from edtArray
		ecoaArray.setName(edtArray.getName());
		if (edtArray.getComment() != null && !edtArray.getComment().isBlank()) {
			ecoaArray.setComment(edtArray.getComment());
		}
		if (edtArray.getMaxNumber() != null && !edtArray.getMaxNumber().isBlank()) {
			ecoaArray.setMaxNumber(edtArray.getMaxNumber());
		}
//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtArray.getItemType();
		if (edtTypeAssociated != null) {
			ecoaArray.setItemType(recreateTypeAssociation(edtArray, edtTypeAssociated));
		}
		return ecoaArray;
	}

	/**
	 * Convert EDT FixedArray to Ecoa FixedArray
	 * 
	 * @param edtFixedArray
	 * @return ecoaFixedArray
	 */
	private static FixedArray recreateFixedArray(edttype.FixedArray edtFixedArray) {
//		Create empty ecoa Library
		var ecoaFixedArray = TYPFACTORY.createFixedArray();

//		Fill ecoaFixedArray from edtFixedArray
		ecoaFixedArray.setName(edtFixedArray.getName());
		if (edtFixedArray.getComment() != null && !edtFixedArray.getComment().isBlank()) {
			ecoaFixedArray.setComment(edtFixedArray.getComment());
		}
		if (edtFixedArray.getMaxNumber() != null && !edtFixedArray.getMaxNumber().isBlank()) {
			ecoaFixedArray.setMaxNumber(edtFixedArray.getMaxNumber());
		}
//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtFixedArray.getItemType();
		if (edtTypeAssociated != null) {
			ecoaFixedArray.setItemType(recreateTypeAssociation(edtFixedArray, edtTypeAssociated));
		}

		return ecoaFixedArray;
	}

	/**
	 * Convert EDT Constant to Ecoa Constant
	 * 
	 * @param edtConstant
	 * @return ecoaConstant
	 */
	private static Constant recreateConstant(edttype.Constant edtConstant) {
//		Create empty ecoa Library
		var ecoaConstant = TYPFACTORY.createConstant();

//		Fill ecoaConstant with edtConstant
		ecoaConstant.setName(edtConstant.getName());
		if (edtConstant.getComment() != null && !edtConstant.getComment().isBlank()) {
			ecoaConstant.setComment(edtConstant.getComment());
		}
		ecoaConstant.setValue(edtConstant.getValue());

//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtConstant.getType();
		if (edtTypeAssociated != null) {
			ecoaConstant.setType(recreateTypeAssociation(edtConstant, edtTypeAssociated));
		}

		return ecoaConstant;
	}

	/**
	 * Convert EDT Simple to Ecoa Simple
	 * 
	 * @param edtSimple
	 * @return ecoaSimple
	 */
	private static Simple recreateSimple(edttype.Simple edtSimple) {
//		Create empty ecoa Simple
		var ecoaSimple = TYPFACTORY.createSimple();

//		Fill ecoaSimple with edtSimple
		ecoaSimple.setName(edtSimple.getName());
		if (edtSimple.getComment() != null && !edtSimple.getComment().isBlank()) {
			ecoaSimple.setComment(edtSimple.getComment());
		}
		ecoaSimple.setMaxRange(edtSimple.getMaxRange());
		ecoaSimple.setMinRange(edtSimple.getMinRange());
		ecoaSimple.setPrecision(edtSimple.getPrecision());
		if (edtSimple.getUnit() != null && !edtSimple.getUnit().isBlank()) {
			ecoaSimple.setUnit(edtSimple.getUnit());
		}
//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtSimple.getType();
		if (edtTypeAssociated != null) {
			ecoaSimple.setType(recreateTypeAssociation(edtSimple, edtTypeAssociated));
		}

		return ecoaSimple;
	}

	/**
	 * Convert EDT Enum to Ecoa Enum
	 * 
	 * @param edtEnum
	 * @return ecoaEnum
	 */
	private static Enum recreateEnum(edttype.Enum edtEnum) {
//		Create empty ecoa Library
		var ecoaEnum = TYPFACTORY.createEnum();

//		Fill ecoaEnum from edtEnum
		ecoaEnum.setName(edtEnum.getName());
		if (edtEnum.getComment() != null && !edtEnum.getComment().isBlank()) {
			ecoaEnum.setComment(edtEnum.getComment());
		}
//		Recreate Enum Values
		EList<edttype.EnumValue> edtEnumValues = edtEnum.getValue();
		edtEnumValues.forEach(edtEnumValue -> ecoaEnum.getValue().add(recreateEnumValue(edtEnumValue)));

//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtEnum.getType();
		if (edtTypeAssociated != null) {
			ecoaEnum.setType(recreateTypeAssociation(edtEnum, edtTypeAssociated));
		}

		return ecoaEnum;
	}

	/**
	 * Convert EDT EnumValue to Ecoa EnumValue
	 * 
	 * @param edtEnumValue
	 * @return ecoaEnumValue
	 */
	private static EnumValue recreateEnumValue(edttype.EnumValue edtEnumValue) {
//		Create empty ecoa Library
		EnumValue ecoaEnumValue = TYPFACTORY.createEnumValue();

//		Fill ecoaEnumValue from edtEnumValue
		if (edtEnumValue.getComment() != null && !edtEnumValue.getComment().isBlank()) {
			ecoaEnumValue.setComment(edtEnumValue.getComment());
		}
		ecoaEnumValue.setName(edtEnumValue.getName());
		if (edtEnumValue.getValnum() != null && !edtEnumValue.getValnum().isBlank()) {
			ecoaEnumValue.setValnum(edtEnumValue.getValnum());
		}
		return ecoaEnumValue;
	}

	/**
	 * Convert EDT Record to Ecoa Record
	 * 
	 * @param edtRecord
	 * @return
	 */
	private static Record recreateRecord(edttype.Record edtRecord) {
//		Create empty ecoa Library
		var ecoaRecord = TYPFACTORY.createRecord();

//		Fill ecoaRecord from edtRecord
		ecoaRecord.setName(edtRecord.getName());
		if (edtRecord.getComment() != null && !edtRecord.getComment().isBlank()) {
			ecoaRecord.setComment(edtRecord.getComment());
		}
//		Recreate Record Fields
		EList<edttype.Field> fields = edtRecord.getField();
		for (edttype.Field field : fields) {
			ecoaRecord.getField().add(recreateField(field));
		}

		return ecoaRecord;
	}

	/**
	 * Convert EDT Field to Ecoa Field
	 * 
	 * @param edtField
	 * @return ecoaField
	 */
	private static Field recreateField(edttype.Field edtField) {
//		Create empty ecoa Field
		var ecoaField = TYPFACTORY.createField();

//		Fill ecoaField with edtField
		if (edtField.getComment() != null && !edtField.getComment().isBlank()) {
			ecoaField.setComment(edtField.getComment());
		}
		ecoaField.setName(edtField.getName());

//		Convert referenced EDTDataType to string
		EDTDataType edtType = edtField.getType();

		if (edtType != null) {
			EObject associatedTypeContainer = edtType.eContainer();

			if (EDTDataType.isBasicOrPredefined(edtType)) {
				/* No need to precise namespace */
				ecoaField.setType(ECOA_NAMESPACE + edtField.getType().getName());
			} else {
				String namespace = ((edttype.Library) associatedTypeContainer).getName();
				ecoaField.setType(namespace + ":" + edtType.getName());
			}
		}
		return ecoaField;
	}

	/**
	 * Convert EDT VariantRecord to Ecoa VariantRecord
	 * 
	 * @param edtVariantRecord
	 * @return ecoaVariantRecord
	 */
	private static VariantRecord recreateVariantRecord(edttype.VariantRecord edtVariantRecord) {
//		Create empty ecoa VariantRecord
		var ecoaVariantRecord = TYPFACTORY.createVariantRecord();

//		Fill ecoaVariantRecord with edtVariantRecord
		ecoaVariantRecord.setName(edtVariantRecord.getName());
		if (edtVariantRecord.getComment() != null && !edtVariantRecord.getComment().isBlank()) {
			ecoaVariantRecord.setComment(edtVariantRecord.getComment());
		}
		if (edtVariantRecord.getSelectName() != null && !edtVariantRecord.getSelectName().isBlank()) {
			ecoaVariantRecord.setSelectName(edtVariantRecord.getSelectName());
		}

//		Recreate VariantRecord Fields
		EList<edttype.Field> fields = edtVariantRecord.getField();
		for (edttype.Field field : fields) {
			ecoaVariantRecord.getField().add(recreateField(field));
		}

//		Recreate VariantRecord Unions
		EList<edttype.Union> unions = edtVariantRecord.getUnion();
		for (edttype.Union union : unions) {
			ecoaVariantRecord.getUnion().add(recreateUnion(union));
		}

//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtVariantRecord.getSelectType();
		if (edtTypeAssociated != null) {
			ecoaVariantRecord.setSelectType(recreateTypeAssociation(edtVariantRecord, edtTypeAssociated));
		}

		return ecoaVariantRecord;
	}

	/**
	 * Convert EDT Union to Ecoa Union
	 * 
	 * @param edtUnion
	 * @return ecoaUnion
	 */
	private static Union recreateUnion(edttype.Union edtUnion) {
//		Create empty ecoa Union
		var ecoaUnion = TYPFACTORY.createUnion();

//		Fill ecoaUnion with edtUnion
		if (edtUnion.getComment() != null && !edtUnion.getComment().isBlank()) {
			ecoaUnion.setComment(edtUnion.getComment());
		}
		ecoaUnion.setName(edtUnion.getName());
		if (edtUnion.getWhen() != null && !edtUnion.getWhen().isBlank()) {
			ecoaUnion.setWhen(edtUnion.getWhen());
		}
//		Convert referenced EDTDataType to string
		EDTDataType edtTypeAssociated = edtUnion.getType();

		if (edtTypeAssociated != null) {
			EObject associatedTypeContainer = edtTypeAssociated.eContainer();
			if (EDTDataType.isBasicOrPredefined(edtTypeAssociated)) {
				/* No need to precise namespace */
				ecoaUnion.setType(ECOA_NAMESPACE + edtTypeAssociated.getName());
			} else {
				String namespace = ((edttype.Library) associatedTypeContainer).getName();
				ecoaUnion.setType(namespace + ":" + edtTypeAssociated.getName());
			}
		}
		return ecoaUnion;
	}

	/**
	 * Convert EDT DataType to Ecoa type String
	 * 
	 * @param edtType
	 * @param edtTypeAssociated
	 * @return
	 */
	private static String recreateTypeAssociation(EDTDataType edtType, EDTDataType edtTypeAssociated) {

		if (edtTypeAssociated != null) {
			EObject associatedTypeContainer = edtTypeAssociated.eContainer();

			if (Objects.equals(associatedTypeContainer, edtType.eContainer())) {
				/* No need to precise namespace */
				return edtTypeAssociated.getName();

			} else if (EDTDataType.isBasicOrPredefined(edtTypeAssociated)) {
				return ECOA_NAMESPACE + edtTypeAssociated.getName();
			} else {
				String namespace = ((edttype.Library) associatedTypeContainer).getName();
				return namespace + ":" + edtTypeAssociated.getName();
			}
		}
		return null;
	}

	/**
	 * @param type
	 * @return
	 */
	static String recreateDataTypeNameForNonTypes(EDTDataType type) {
		String dataTypeName = "";
		if (EDTDataType.isBasicOrPredefined(type)) {
			dataTypeName = ECOA_NAMESPACE + type.getName();
		} else if (type instanceof EDTDataType) {
			String namespace = ((edttype.Library) type.eContainer()).getName();
			dataTypeName = namespace + ":" + type.getName();
		}
		return dataTypeName;
	}

}
