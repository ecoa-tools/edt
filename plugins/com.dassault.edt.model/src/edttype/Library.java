/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtproject.Step;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Library</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Library#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link edttype.Library#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link edttype.Library#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference
	 * list. The list contents are of type {@link edttype.EDTDataType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getLibrary_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDTDataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Used Libraries</b></em>' reference list.
	 * The list contents are of type {@link edttype.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Libraries</em>' reference list.
	 * @see edttype.EDTTypePackage#getLibrary_UsedLibraries()
	 * @model
	 * @generated
	 */
	EList<Library> getUsedLibraries();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edttype.EDTTypePackage#getLibrary_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edttype.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	static Library getLibrary(Object object) {
		if (object instanceof Library) {
			return (Library) object;
		} else if (object instanceof Step || object instanceof Steps) {
			return null;
		} else if (object instanceof EObject eObject) {
			return getLibrary(eObject.eContainer());
		}
		return null;
	}

} // Library
