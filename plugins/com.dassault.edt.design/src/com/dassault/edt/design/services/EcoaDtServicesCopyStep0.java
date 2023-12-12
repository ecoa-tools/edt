/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtproject.Step0;
import edttype.Array;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypeFactory;
import edttype.Enum;
import edttype.EnumValue;
import edttype.Field;
import edttype.FixedArray;
import edttype.Library;
import edttype.Record;
import edttype.Simple;
import edttype.Union;
import edttype.VariantRecord;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopyStep0 {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Set name of a library when performing a "Create Copy Of"
	 * 
	 * @param libraryToCopy : The library that must receive a name
	 * @return the new library name
	 */

	public String setNameToCopyOfLibrary(Library libraryToCopy) {
		Step0 step0 = ((Step0) libraryToCopy.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + libraryToCopy.getName(),
				step0.getTypes().toArray(new Library[0]), 0);
	}

	/**
	 * Creates copy of EDTDataType of Library
	 * 
	 * @param libraryToCopy : element copied
	 * @return list of copies
	 */
	public EList<EDTDataType> copyLibraryDataTypes(Library libraryToCopy) {
		EList<EDTDataType> dataTypesToCopy = libraryToCopy.getDataTypes();
		EList<EDTDataType> copiedEList = new BasicEList<>();
		copiedEList.addAll(EcoreUtil.copyAll(dataTypesToCopy));
		return copiedEList;
	}

	/**
	 * Set name of a constant when performing a "Create Copy Of"
	 * 
	 * @param constant : The constant that must receive a name
	 * @return the new constant name
	 */

	public String setNameToCopyOfConstant(Constant constant) {
		Library library = ((Library) constant.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + constant.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Set name of a simple when performing a "Create Copy Of"
	 * 
	 * @param simple : The simple that must receive a name
	 * @return the new simple name
	 */

	public String setNameToCopyOfSimple(Simple simple) {
		Library library = ((Library) simple.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + simple.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Creates copy of EnumValue of Enum
	 * 
	 * @param enumToCopy : element copied
	 * @return list of copies
	 */
	public EList<EnumValue> copyEnumValue(Enum enumToCopy) {
		EList<EnumValue> enumValuesToCopy = enumToCopy.getValue();
		EList<EnumValue> copiedEList = new BasicEList<>();
		EnumValue copied;
		for (EnumValue enumValue : enumValuesToCopy) {
			copied = EDTTypeFactory.eINSTANCE.createEnumValue();
			copied.setName(enumValue.getName());
			copied.setValnum(enumValue.getValnum());
			copied.setComment(enumValue.getComment());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Set name of an array when performing a "Create Copy Of"
	 * 
	 * @param array : The array that must receive a name
	 * @return the new array name
	 */

	public String setNameToCopyOfArray(Array array) {
		Library library = ((Library) array.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + array.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Set name of a fixed array when performing a "Create Copy Of"
	 * 
	 * @param fixedArray : The fixed array that must receive a name
	 * @return the new fixed array name
	 */

	public String setNameToCopyOfFixedArray(FixedArray fixedArray) {
		Library library = ((Library) fixedArray.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + fixedArray.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Set name of an enum when performing a "Create Copy Of"
	 * 
	 * @param enums : The enum that must receive a name
	 * @return the new enum name
	 */

	public String setNameToCopyOfEnum(Enum enums) {
		Library library = ((Library) enums.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + enums.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Set name of an enum value when performing a "Create Copy Of"
	 * 
	 * @param enumValue : The enum value that must receive a name
	 * @return the new enum value name
	 */

	public String setNameToCopyOfEnumValue(EnumValue enumValue) {
		Enum enums = ((Enum) enumValue.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + enumValue.getName(),
				enums.getValue().toArray(new EnumValue[0]), 0);
	}

	/**
	 * Set name of a record when performing a "Create Copy Of"
	 * 
	 * @param record : The record that must receive a name
	 * @return the new record name
	 */

	public String setNameToCopyOfRecord(Record record) {
		Library library = ((Library) record.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + record.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Creates copy of Fields of Record
	 * 
	 * @param recordToCopy : element copied
	 * @return list of copies
	 */
	public EList<Field> copyRecordField(Record recordToCopy) {
		EList<Field> fieldsToCopy = recordToCopy.getField();
		EList<Field> copiedEList = new BasicEList<>();
		Field copied;
		for (Field field : fieldsToCopy) {
			copied = EDTTypeFactory.eINSTANCE.createField();
			copied.setName(field.getName());
			copied.setType(field.getType());
			copied.setComment(field.getComment());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Set name of a record field when performing a "Create Copy Of"
	 * 
	 * @param field : The record field that must receive a name
	 * @return the new record field name
	 */

	public String setNameToCopyOfRecordField(Field field) {
		Record record = ((Record) field.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + field.getName(), record.getField().toArray(new Field[0]),
				0);
	}

	/**
	 * Set name of a variant record when performing a "Create Copy Of"
	 * 
	 * @param variantRecord : The variant record that must receive a name
	 * @return the new variant record name
	 */

	public String setNameToCopyOfVariantRecord(VariantRecord variantRecord) {
		Library library = ((Library) variantRecord.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + variantRecord.getName(),
				library.getDataTypes().toArray(new EDTDataType[0]), 0);
	}

	/**
	 * Creates copy of Fields of VariantRecord
	 * 
	 * @param variantRecordToCopy : element copied
	 * @return list of copies
	 */
	public EList<Field> copyVariantRecordField(VariantRecord variantRecordToCopy) {
		EList<Field> fieldsToCopy = variantRecordToCopy.getField();
		EList<Field> copiedEList = new BasicEList<>();
		Field copied;
		for (Field field : fieldsToCopy) {
			copied = EDTTypeFactory.eINSTANCE.createField();
			copied.setName(field.getName());
			copied.setType(field.getType());
			copied.setComment(field.getComment());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Set name of a variant record field when performing a "Create Copy Of"
	 * 
	 * @param field : The variant record field that must receive a name
	 * @return the new variant record field name
	 */

	public String setNameToCopyOfVariantRecordField(Field field) {
		VariantRecord variantRecord = ((VariantRecord) field.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + field.getName(),
				variantRecord.getField().toArray(new Field[0]), 0);
	}

	/**
	 * Set name of a variant record union when performing a "Create Copy Of"
	 * 
	 * @param union : The variant record union that must receive a name
	 * @return the new variant union field name
	 */

	public String setNameToCopyOfVariantRecordUnion(Union union) {
		VariantRecord variantRecord = ((VariantRecord) union.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + union.getName(),
				variantRecord.getUnion().toArray(new Union[0]), 0);
	}

	/**
	 * Creates copy of Unions of VariantRecord
	 * 
	 * @param variantRecordToCopy : element copied
	 * @return list of copies
	 */
	public EList<Union> copyVariantRecordUnion(VariantRecord variantRecordToCopy) {
		EList<Union> unionsToCopy = variantRecordToCopy.getUnion();
		EList<Union> copiedEList = new BasicEList<>();
		Union copied;
		for (Union union : unionsToCopy) {
			copied = EDTTypeFactory.eINSTANCE.createUnion();
			copied.setName(union.getName());
			copied.setType(union.getType());
			copied.setComment(union.getComment());
			copied.setWhen(union.getWhen());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

}
