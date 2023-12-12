/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModuleOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getModuleOperation_Name()
	 * @model dataType="technology.ecoa.types._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // ModuleOperation
