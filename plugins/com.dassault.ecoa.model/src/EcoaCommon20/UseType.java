/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package EcoaCommon20;

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
 *   <li>{@link EcoaCommon20.UseType#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see EcoaCommon20.EcoaCommon20Package#getUseType()
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
	 * @see EcoaCommon20.EcoaCommon20Package#getUseType_Library()
	 * @model dataType="EcoaCommon20.LibraryName" required="true"
	 *        extendedMetaData="kind='attribute' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link EcoaCommon20.UseType#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

} // UseType
