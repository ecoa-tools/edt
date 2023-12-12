/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

import edttype.EDTDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Type Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleTypeProperty#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.ModuleTypeProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleTypeProperty()
 * @model
 * @generated
 */
public interface ModuleTypeProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getModuleTypeProperty_Name()
	 * @model dataType="technology.ecoa.interface_._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleTypeProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edtimplementation.EdtimplementationPackage#getModuleTypeProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleTypeProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // ModuleTypeProperty
