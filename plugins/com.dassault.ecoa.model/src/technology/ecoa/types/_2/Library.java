/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of data types in a library
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.Library#getUse <em>Use</em>}</li>
 *   <li>{@link technology.ecoa.types._2.Library#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.types._2.typPackage#getLibrary()
 * @model extendedMetaData="name='Library' kind='elementOnly'"
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.types._2.UseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declares the use of a library of data types. A
	 *         type T defined in a library L will be denoted "L:T".
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see technology.ecoa.types._2.typPackage#getLibrary_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UseType> getUse();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(DataTypes)
	 * @see technology.ecoa.types._2.typPackage#getLibrary_Types()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='types' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypes getTypes();

	/**
	 * Sets the value of the '{@link technology.ecoa.types._2.Library#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(DataTypes value);

} // Library
