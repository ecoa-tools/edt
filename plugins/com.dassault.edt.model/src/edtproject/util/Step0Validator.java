/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import edttype.Array;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EnumValue;
import edttype.Field;
import edttype.FixedArray;
import edttype.Library;
import edttype.Record;
import edttype.Simple;
import edttype.Union;
import edttype.VariantRecord;

public class Step0Validator {

	private static final String THE_LIBRARY_NAMESPACE = "The library/namespace ";
	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME = " is missing attributes : it must contain a name.";
	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE = " is missing attributes : it must contain a name and a type.";

	private Step0Validator() {

	}

	/**
	 * Verify if library is complete
	 * 
	 * @param library                 : library to verify
	 * @param errorMessageForConsole2
	 */
	public static void verifyLibraries(Library library, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (library.getName() == null || library.getName().isBlank()) {
			errorMessageForConsole.append(THE_LIBRARY_NAMESPACE + library.getName() + " is missing a name.\n");
		}
		EList<Library> usedLibraries = library.getUsedLibraries();

		checkUsedLibraries(library, usedLibraries, errorMessageForConsole);

		EList<EDTDataType> dataTypes = library.getDataTypes();
		ArrayList<Library> missingLibrary = new ArrayList<>();
		for (EDTDataType edtDataType : dataTypes) {
			if (edtDataType instanceof Array type) {
				verifyArray(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof FixedArray type) {
				verifyFixedArray(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof Constant type) {
				verifyConstant(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof Simple type) {
				verifySimple(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof Record type) {
				verifyRecord(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof VariantRecord type) {
				verifyVariantRecord(usedLibraries, errorMessageForConsole, missingLibrary, type);
			} else if (edtDataType instanceof edttype.Enum type) {
				verifyEnum(usedLibraries, errorMessageForConsole, missingLibrary, type);
			}
		}
		missingLibrary.remove(library);
		if (!missingLibrary.isEmpty()) {
			for (Library library2 : missingLibrary) {
				errorMessageForConsole.append(
						THE_LIBRARY_NAMESPACE + library2.getName() + " is used by Data Types in the library/namespace "
								+ library.getName() + ", but is not in the used libraries\n");
			}
		}

		if (!errorMessageForConsole.isEmpty()) {
//			EDTLog.toConsoleSeparationLine();
			finalConsoleMessage.append("\n\nThe library " + library.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}
	}

	/**
	 * @param library
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 */
	protected static void checkUsedLibraries(Library library, EList<Library> usedLibraries,
			StringBuilder errorMessageForConsole) {
		ArrayList<Library> verifiedLibraries = new ArrayList<>();
		for (Library libraryToAdd : usedLibraries) {
			if (isLibraryUsedInDependencies(library, libraryToAdd, verifiedLibraries)) {
				errorMessageForConsole.append(THE_LIBRARY_NAMESPACE + libraryToAdd.getName()
						+ " has a cyclic dependency with the library/namespace " + library.getName() + "\n");
			}
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyEnum(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, edttype.Enum type) {
		EDTDataType itemType = type.getType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);

		if (!type.isComplete()) {
			errorMessageForConsole.append("The Enum " + type.getFullName()
					+ " is missing attributes : it must contain a name, a type and at least one EnumValue.\n");
		}

		EList<EnumValue> value = type.getValue();
		for (EnumValue enumValue : value) {
			if (!enumValue.isComplete()) {
				errorMessageForConsole.append("The EnumValue " + enumValue.getName() + " of the Enum "
						+ type.getFullName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME + "\n");

			}
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyVariantRecord(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, VariantRecord type) {
		EList<Field> fields = type.getField();
		for (Field field : fields) {
			EDTDataType itemType = field.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
			if (!field.isComplete()) {
				errorMessageForConsole.append("The Field " + field.getName() + " of the VariantRecord "
						+ type.getFullName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE + "\n");

			}
		}
		EList<Union> unions = type.getUnion();
		for (Union union : unions) {
			EDTDataType itemType = union.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
			if (!union.isComplete()) {
				errorMessageForConsole.append("The Union " + union.getName() + " of the VariantRecord "
						+ type.getFullName() + " is missing attributes : it must contain a name, a when and a type.\n");

			}
		}
		EDTDataType selectType = type.getSelectType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, selectType);
		if (!type.isComplete()) {
			errorMessageForConsole.append("The VariantRecord " + type.getFullName()
					+ " is missing attributes : it must contain a name, a selectName, a selectType and at least an Union.\n");
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyRecord(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, Record type) {
		if (!type.isComplete()) {
			errorMessageForConsole.append("The Record " + type.getFullName()
					+ " is missing attributes : it must contain a name and at least a field.\n");
		}
		EList<Field> fields = type.getField();
		for (Field field : fields) {
			EDTDataType itemType = field.getType();
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
			if (!field.isComplete()) {
				errorMessageForConsole.append("The Field " + field.getName() + " of the Record " + type.getFullName()
						+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE + "\n");

			}
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifySimple(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, Simple type) {
		EDTDataType itemType = type.getType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);

		EDTDataType maxRangeType = type.getMaxRangeType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, maxRangeType);

		EDTDataType minRangeType = type.getMinRangeType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, minRangeType);

		EDTDataType precisionType = type.getPrecisionType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, precisionType);
		if (!type.isComplete()) {
			errorMessageForConsole.append("The Simple " + type.getFullName()
					+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE + "\n");
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyConstant(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, Constant type) {
		EDTDataType itemType = type.getType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
		EDTDataType valueType = type.getValueType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, valueType);
		if (!type.isComplete()) {
			errorMessageForConsole.append("The Constant " + type.getFullName()
					+ " is missing attributes : it must contain a name, a type and a value.\n");
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyFixedArray(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, FixedArray type) {
		EDTDataType itemType = type.getItemType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
		if (!type.isComplete()) {
			errorMessageForConsole.append("The Fixed Array " + type.getFullName()
					+ " is missing attributes : it must contain an itemType, a name and a maxNumber.\n");
		}
	}

	/**
	 * @param usedLibraries
	 * @param errorMessageForConsole
	 * @param missingLibrary
	 * @param type
	 */
	protected static void verifyArray(EList<Library> usedLibraries, StringBuilder errorMessageForConsole,
			ArrayList<Library> missingLibrary, Array type) {
		EDTDataType itemType = type.getItemType();
		EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, itemType);
		if (!type.isComplete()) {
			errorMessageForConsole.append("The Array " + type.getFullName()
					+ " is missing attributes : it must contain an itemType, a name and a maxNumber.\n");
		}
	}

	/**
	 * Looks for cyclic Dependencies
	 * 
	 * @param libraryToFind   : library that will depend on libraryToVerify
	 * @param libraryToVerify : library that can already depend on libraryToFind
	 * @return : true if cyclic dependency would be created
	 */
	public static boolean isLibraryUsedInDependencies(Library libraryToFind, Library libraryToVerify,
			ArrayList<Library> verified) {
		EList<Library> usedLibraries = libraryToVerify.getUsedLibraries();
		if (usedLibraries.contains(libraryToFind)) {
			return true;
		} else {
			verified.add(libraryToVerify);
		}
		for (Library libraryDependency : usedLibraries) {
			if (!verified.contains(libraryDependency)
					&& isLibraryUsedInDependencies(libraryToFind, libraryDependency, verified)) {
				return true;
			}
		}
		return false;
	}
}
