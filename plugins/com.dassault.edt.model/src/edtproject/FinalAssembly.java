/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.FinalAssembly#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link edtproject.FinalAssembly#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getFinalAssembly()
 * @model
 * @generated
 */
public interface FinalAssembly extends EObject {
	/**
	 * Returns the value of the '<em><b>Final Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Assembly</em>' reference.
	 * @see #setFinalAssembly(Composite)
	 * @see edtproject.EDTProjectPackage#getFinalAssembly_FinalAssembly()
	 * @model required="true"
	 * @generated
	 */
	Composite getFinalAssembly();

	/**
	 * Sets the value of the '{@link edtproject.FinalAssembly#getFinalAssembly <em>Final Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Assembly</em>' reference.
	 * @see #getFinalAssembly()
	 * @generated
	 */
	void setFinalAssembly(Composite value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getFinalAssembly_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.FinalAssembly#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FinalAssembly
