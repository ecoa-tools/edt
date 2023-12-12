/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of files
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.project._2.Files#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.project._2.projPackage#getFiles()
 * @model extendedMetaData="name='Files' kind='elementOnly'"
 * @generated
 */
public interface Files extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getFiles_File()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFile();

} // Files
