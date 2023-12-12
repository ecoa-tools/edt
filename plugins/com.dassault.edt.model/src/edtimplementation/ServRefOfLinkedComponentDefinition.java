/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import edtinterface.ServiceDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serv Ref Of Linked Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ServRefOfLinkedComponentDefinition#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.ServRefOfLinkedComponentDefinition#getServiceDefinitionLink <em>Service Definition Link</em>}</li>
 *   <li>{@link edtimplementation.ServRefOfLinkedComponentDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getServRefOfLinkedComponentDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServRefOfLinkedComponentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.OperationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getServRefOfLinkedComponentDefinition_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationInstance> getOperations();

	/**
	 * Returns the value of the '<em><b>Service Definition Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition Link</em>' reference.
	 * @see #setServiceDefinitionLink(ServiceDefinition)
	 * @see edtimplementation.EdtimplementationPackage#getServRefOfLinkedComponentDefinition_ServiceDefinitionLink()
	 * @model required="true"
	 * @generated
	 */
	ServiceDefinition getServiceDefinitionLink();

	/**
	 * Sets the value of the '{@link edtimplementation.ServRefOfLinkedComponentDefinition#getServiceDefinitionLink <em>Service Definition Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition Link</em>' reference.
	 * @see #getServiceDefinitionLink()
	 * @generated
	 */
	void setServiceDefinitionLink(ServiceDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getServRefOfLinkedComponentDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ServRefOfLinkedComponentDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ServRefOfLinkedComponentDefinition
