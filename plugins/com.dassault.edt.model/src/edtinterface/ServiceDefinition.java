/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edttype.Library;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service
 * Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtinterface.ServiceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link edtinterface.ServiceDefinition#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtinterface.ServiceDefinition#getUsedLibraries <em>Used Libraries</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getServiceDefinition()
 * @model
 * @generated
 */
public interface ServiceDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtinterface.EDTInterfacePackage#getServiceDefinition_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtinterface.ServiceDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference
	 * list. The list contents are of type {@link edtinterface.OperationType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtinterface.EDTInterfacePackage#getServiceDefinition_Operations()
	 * @model containment="true" extendedMetaData="kind='element' name='operations'
	 *        namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationType> getOperations();

	/**
	 * Returns the value of the '<em><b>Used Libraries</b></em>' reference list.
	 * The list contents are of type {@link edttype.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Libraries</em>' reference list.
	 * @see edtinterface.EDTInterfacePackage#getServiceDefinition_UsedLibraries()
	 * @model
	 * @generated
	 */
	EList<Library> getUsedLibraries();

	/**
	 * Find ServiceDefinition OperationType by Name
	 * 
	 * @param name
	 * @param operations
	 * @return edtServiceDefinition corresponding to Name
	 */
	public edtinterface.OperationType findServiceDefinitionOperation(String name);

} // ServiceDefinition
