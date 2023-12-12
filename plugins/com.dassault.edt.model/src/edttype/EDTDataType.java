/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.dassault.edt.log.EDTLog;

import edtproject.Step0;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EDT Data
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edttype.EDTDataType#getName <em>Name</em>}</li>
 * <li>{@link edttype.EDTDataType#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getEDTDataType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EDTDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edttype.EDTTypePackage#getEDTDataType_Name()
	 * @model dataType="technology.ecoa.types._2.TypeName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edttype.EDTDataType#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see edttype.EDTTypePackage#getEDTDataType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link edttype.EDTDataType#getComment
	 * <em>Comment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>BasicType</b></em>' derived reference. <!--
	 * begin-user-doc --> Search for the BasicType that the Simple is derived from
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>BasicType</em>' reference.
	 * @generated NOT
	 */
	BasicType getBasicType();

	/**
	 * Finds constant by name
	 * 
	 * @param constantNameWithPerc: name of constant (without namespace)
	 * @param sameLibrary           : library of EDTDataType referencing the
	 *                              Constant
	 * @return Constant with correct name or null
	 * @generated NOT
	 */
	static Constant findConstantValue(String constantNameWithPerc, Library sameLibrary) {
		String constantNameWOPerc = constantNameWithPerc.substring(1, constantNameWithPerc.length() - 1);
		if (!constantNameWOPerc.contains(":")) {
			EList<EDTDataType> siblingDataTypes = sameLibrary.getDataTypes();

			return findConstantInLibrary(constantNameWOPerc, siblingDataTypes);

		} else if (sameLibrary.eContainer() != null) {
			Step0 step0 = (Step0) sameLibrary.eContainer();
			String[] split = constantNameWOPerc.split(":");
			if (split.length != 2) {
				EDTLog.toConsole("ERROR: there are multiple ':' in :" + constantNameWOPerc);
				return null;
			}
			EDTDataType findInAllLibraries = step0.findInAllLibraries(split[0], split[1]);
			if (findInAllLibraries instanceof Constant constant) {
				return constant;
			}
		}
		return null;
	}

	/**
	 * @param constantNameWOPerc : name of constant (without namespace)
	 * @param libraryDataTypes   : list of DataType in library
	 * @return Constant with correct name or null
	 * @generated NOT
	 */
	static Constant findConstantInLibrary(String constantNameWOPerc, EList<EDTDataType> libraryDataTypes) {
		for (EDTDataType dataType : libraryDataTypes) {
			if (dataType instanceof Constant constant && Objects.equals(constant.getName(), constantNameWOPerc)) {
				return constant;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public String getFullName();

	/**
	 * 
	 * @return true if all the required fields are filled
	 */
	boolean isComplete();

	static boolean isBasicOrPredefined(EDTDataType type) {
		return (type instanceof BasicType || type instanceof PredefinedType);
	}

} // EDTDataType
