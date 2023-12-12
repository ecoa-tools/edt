/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;

import edttype.BasicType;
import edttype.EDTDataType;
import edttype.Library;
import edttype.PredefinedType;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step0</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.Step0#getTypes <em>Types</em>}</li>
 * <li>{@link edtproject.Step0#getBasicTypes <em>Basic Types</em>}</li>
 * <li>{@link edtproject.Step0#getEcoaPredefinedTypes <em>Ecoa Predefined
 * Types</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep0()
 * @model
 * @generated
 */
public interface Step0 extends Step {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.Library}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep0_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getTypes();

	/**
	 * Returns the value of the '<em><b>Basic Types</b></em>' containment reference
	 * list. The list contents are of type {@link edttype.BasicType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Basic Types</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep0_BasicTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicType> getBasicTypes();

	/**
	 * Returns the value of the '<em><b>Ecoa Predefined Types</b></em>' containment
	 * reference list. The list contents are of type {@link edttype.PredefinedType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ecoa Predefined Types</em>' containment
	 *         reference list.
	 * @see edtproject.EDTProjectPackage#getStep0_EcoaPredefinedTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PredefinedType> getEcoaPredefinedTypes();

	/**
	 * Find type when ECOA:basicType/predefinedTypes or Library:type names are used
	 *
	 * @param nameOfAssociatedLibrary : name of Library to find (split[0])
	 * @param nameOfType              : name of type to find (split[1])
	 * @return EDTDataType corresponding to the name
	 */
	EDTDataType findInAllLibraries(String nameOfAssociatedLibrary, String nameOfType);

	/**
	 * Find basicType or predefined type in ECOA namespace
	 * 
	 * @param nameOfAssociatedType
	 * @return
	 */
	EDTDataType findBasicTypeOrPredefined(String nameOfAssociatedType);

	/**
	 * Find basicType by name
	 * 
	 * @param nameOfAssociatedType
	 * @return
	 */
	EDTDataType findBasicType(String nameOfAssociatedType);

	/**
	 * Find Library by name
	 * 
	 * @param nameLibrary
	 * @return
	 */
	Library findLibrary(String nameLibrary);
} // Step0
