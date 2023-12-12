/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

import edtproject.ComponentDefinitionReference;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Implementation Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ComponentImplementationReference#getNewQos <em>New Qos</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementationReference#getComponentDefinitionReference <em>Component Definition Reference</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationReference()
 * @model
 * @generated
 */
public interface ComponentImplementationReference extends EObject {
	/**
	 * Returns the value of the '<em><b>New Qos</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>New Qos</em>' reference.
	 * @see #setNewQos(ServiceInstanceQos)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationReference_NewQos()
	 * @model required="true"
	 * @generated
	 */
	ServiceInstanceQos getNewQos();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementationReference#getNewQos <em>New Qos</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Qos</em>' reference.
	 * @see #getNewQos()
	 * @generated
	 */
	void setNewQos(ServiceInstanceQos value);

	/**
	 * Returns the value of the '<em><b>Component Definition Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Reference</em>' reference.
	 * @see #setComponentDefinitionReference(ComponentDefinitionReference)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationReference_ComponentDefinitionReference()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionReference getComponentDefinitionReference();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementationReference#getComponentDefinitionReference <em>Component Definition Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Reference</em>' reference.
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	void setComponentDefinitionReference(ComponentDefinitionReference value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // ComponentImplementationReference
