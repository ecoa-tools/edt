/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Type Pinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleTypePinfo#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleTypePinfo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModuleTypePinfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getModuleTypePinfo_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleTypePinfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModuleTypePinfo
