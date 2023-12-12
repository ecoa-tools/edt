/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import edtproject.Step0;
import edttype.Array;
import edttype.Constant;
import edttype.EDTDataType;
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
public class EcoaDtServicesDefaultNameStep0 {

	/**
	 * Count the amount of Libraries contained in Step0.
	 *
	 * @param library - active Library
	 * @return the amount of Libraries contained in Step0
	 */
	public String countLibraries(Library library) {
		Step0 step0 = ((Step0) library.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Library" + step0.getTypes().size(),
				step0.getTypes().toArray(new Library[0]), step0.getTypes().size());

	}

	/**
	 * Count the amount of Constants contained in a Library.
	 *
	 * @param constant - active Constant
	 * @return the amount of Constants contained in the Library
	 */
	public String countConstants(Constant constant) {
		Library library = ((Library) constant.eContainer());
		int constantCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof Constant) {
				constantCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Constant" + constantCount,
				library.getDataTypes().toArray(new EDTDataType[0]), constantCount);
	}

	/**
	 * Count the amount of Simples contained in a Library.
	 *
	 * @param simple - active Simple
	 * @return the amount of Simples contained in the Library
	 */
	public String countSimples(Simple simple) {
		Library library = ((Library) simple.eContainer());
		int simpleCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof Simple) {
				simpleCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Simple" + simpleCount,
				library.getDataTypes().toArray(new EDTDataType[0]), simpleCount);
	}

	/**
	 * Count the amount of Arrays contained in a Library.
	 *
	 * @param array - active Array
	 * @return the amount of Arrays contained in the Library
	 */
	public String countArrays(Array array) {
		Library library = ((Library) array.eContainer());
		int arrayCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof Array) {
				arrayCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Array" + arrayCount,
				library.getDataTypes().toArray(new EDTDataType[0]), arrayCount);
	}

	/**
	 * Count the amount of FixedArrays contained in a Library.
	 *
	 * @param fixedArray - active FixedArray
	 * @return the amount of FixedArrays contained in the Library
	 */
	public String countFixedArrays(FixedArray fixedArray) {
		Library library = ((Library) fixedArray.eContainer());
		int fixedArrayCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof FixedArray) {
				fixedArrayCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("FixedArray" + fixedArrayCount,
				library.getDataTypes().toArray(new EDTDataType[0]), fixedArrayCount);
	}

	/**
	 * Count the amount of Records contained in a Library.
	 *
	 * @param records - active Record
	 * @return the amount of Records contained in the Library
	 */
	public String countRecords(Record records) {
		Library library = ((Library) records.eContainer());
		int recordCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof Record) {
				recordCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Record" + recordCount,
				library.getDataTypes().toArray(new EDTDataType[0]), recordCount);
	}

	/**
	 * Count the amount of Fields contained in a Record or VariantRecord
	 *
	 * @param field - active Field
	 * @return the amount of Fields contained in the Record or VariantRecord
	 */
	public String countFields(Field field) {
		if (field.eContainer() instanceof Record record) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("Field" + record.getField().size(),
					record.getField().toArray(new Field[0]), record.getField().size());
		} else if (field.eContainer() instanceof VariantRecord variantRecord) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("Field" + variantRecord.getField().size(),
					variantRecord.getField().toArray(new Field[0]), variantRecord.getField().size());
		}
		return "";
	}

	/**
	 * Count the amount of Enums contained in a Library.
	 *
	 * @param enums - active Enum
	 * @return the amount of Enums contained in the Library
	 */
	public String countEnums(Enum enums) {
		Library library = ((Library) enums.eContainer());
		int enumCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof Enum) {
				enumCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Enum" + enumCount,
				library.getDataTypes().toArray(new EDTDataType[0]), enumCount);
	}

	/**
	 * Count the amount of EnumValues contained in a Enum.
	 *
	 * @param enumValue - active EnumValue
	 * @return the amount of EnumValues contained in the Enum
	 */
	public String countEnumValues(EnumValue enumValue) {
		Enum enums = ((Enum) enumValue.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("EnumValue" + enums.getValue().size(),
				enums.getValue().toArray(new EnumValue[0]), enums.getValue().size());
	}

	/**
	 * Create default valnum
	 *
	 * @param enumValue - active EnumValue
	 * @return the amount of EnumValues contained in the Enum
	 */
	public String createEnumValueValnum(EnumValue enumValue) {
		Enum enums = ((Enum) enumValue.eContainer());
		int size = enums.getValue().size();
		if (size == 1) {
			return "0";
		}
		EnumValue enumValueLast = enums.getValue().get(size - 2);
		String valnum = enumValueLast.getValnum();
		if (valnum != null) {
			return "" + (Integer.parseInt(valnum) + 1);
		} else {
			return "";
		}
	}

	/**
	 * Count the amount of VariantRecords contained in a Library.
	 *
	 * @param variantRecord - active VariantRecord
	 * @return the amount of VariantRecords contained in the Library
	 */
	public String countVariantRecords(VariantRecord variantRecord) {
		Library library = ((Library) variantRecord.eContainer());
		int variantRecordCount = 0;
		for (int i = 0; i < library.getDataTypes().size(); i++) {
			if ((library.getDataTypes().get(i)) instanceof VariantRecord) {
				variantRecordCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("VariantRecord" + variantRecordCount,
				library.getDataTypes().toArray(new EDTDataType[0]), variantRecordCount);
	}

	/**
	 * Count the amount of Unions contained in a VariantRecord.
	 *
	 * @param union - active Union
	 * @return the amount of Unions contained in the VariantRecord
	 */
	public String countVariantRecordUnions(Union union) {
		VariantRecord variantRecord = ((VariantRecord) union.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Union" + variantRecord.getUnion().size(),
				variantRecord.getUnion().toArray(new Union[0]), variantRecord.getUnion().size());
	}
}
