/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Service</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.ComponentService#getComponentDefinitionService <em>Component Definition Service</em>}</li>
 *   <li>{@link edtproject.ComponentService#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentService()
 * @model
 * @generated
 */
public interface ComponentService extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Definition Service</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Service</em>' reference.
	 * @see #setComponentDefinitionService(ComponentDefinitionService)
	 * @see edtproject.EDTProjectPackage#getComponentService_ComponentDefinitionService()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionService getComponentDefinitionService();

	/**
	 * Sets the value of the '{@link edtproject.ComponentService#getComponentDefinitionService <em>Component Definition Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Service</em>' reference.
	 * @see #getComponentDefinitionService()
	 * @generated
	 */
	void setComponentDefinitionService(ComponentDefinitionService value);

	/**
	 * 
	 * @return name of referenced ComponentDefinitionService
	 * @generated NOT
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return serviceLink
	 */
	EList<ServiceLink> getServiceLink();

	/**
	 * get Name as component_Name/service_Name
	 * 
	 * @return
	 */
	String getWireString();

} // ComponentService
