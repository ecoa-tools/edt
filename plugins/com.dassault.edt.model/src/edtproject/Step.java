/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Step#getFolderName <em>Folder Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Name</em>' attribute.
	 * @see #setFolderName(String)
	 * @see edtproject.EDTProjectPackage#getStep_FolderName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFolderName();

	/**
	 * Sets the value of the '{@link edtproject.Step#getFolderName <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Name</em>' attribute.
	 * @see #getFolderName()
	 * @generated
	 */
	void setFolderName(String value);

} // Step
