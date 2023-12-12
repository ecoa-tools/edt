/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Definition Service</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.ComponentDefinitionService#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentDefinitionService()
 * @model
 * @generated
 */
public interface ComponentDefinitionService extends Contract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComponentDefinitionService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentDefinitionService#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return true if no missing element
	 */
	boolean isComplete();

} // ComponentDefinitionService
