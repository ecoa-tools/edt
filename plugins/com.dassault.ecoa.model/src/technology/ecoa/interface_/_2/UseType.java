/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.UseType#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_._2.interPackage#getUseType()
 * @model extendedMetaData="name='use_._type' kind='empty'"
 * @generated
 */
public interface UseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see technology.ecoa.interface_._2.interPackage#getUseType_Library()
	 * @model dataType="technology.ecoa.interface_._2.LibraryName" required="true"
	 *        extendedMetaData="kind='attribute' name='library'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_._2.UseType#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

} // UseType
