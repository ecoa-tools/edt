/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.LanguageLibraries#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibraries()
 * @model extendedMetaData="name='LanguageLibraries' kind='elementOnly'"
 * @generated
 */
public interface LanguageLibraries extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.LanguageLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library entry
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibraries_Library()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LanguageLibrary> getLibrary();

} // LanguageLibraries
