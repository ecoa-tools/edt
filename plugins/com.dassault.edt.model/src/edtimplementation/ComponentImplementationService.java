/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

import edtproject.ComponentDefinitionService;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Implementation Service</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ComponentImplementationService#getNewQos <em>New Qos</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementationService#getComponentDefinitionService <em>Component Definition Service</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationService()
 * @model
 * @generated
 */
public interface ComponentImplementationService extends EObject {
	/**
	 * Returns the value of the '<em><b>New Qos</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>New Qos</em>' reference.
	 * @see #setNewQos(ServiceInstanceQos)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationService_NewQos()
	 * @model required="true"
	 * @generated
	 */
	ServiceInstanceQos getNewQos();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementationService#getNewQos <em>New Qos</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Qos</em>' reference.
	 * @see #getNewQos()
	 * @generated
	 */
	void setNewQos(ServiceInstanceQos value);

	/**
	 * Returns the value of the '<em><b>Component Definition Service</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Service</em>' reference.
	 * @see #setComponentDefinitionService(ComponentDefinitionService)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementationService_ComponentDefinitionService()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionService getComponentDefinitionService();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementationService#getComponentDefinitionService <em>Component Definition Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Service</em>' reference.
	 * @see #getComponentDefinitionService()
	 * @generated
	 */
	void setComponentDefinitionService(ComponentDefinitionService value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // ComponentImplementationService
