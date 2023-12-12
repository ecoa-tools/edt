/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;

import edtproject.ComponentDefinitionService;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service
 * Of Linked Component Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ServiceOfLinkedComponentDefinition#getComponentDefinitionServiceLink <em>Component Definition Service Link</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getServiceOfLinkedComponentDefinition()
 * @model
 * @generated
 */
public interface ServiceOfLinkedComponentDefinition extends ServRefOfLinkedComponentDefinition {
	/**
	 * Returns the value of the '<em><b>Component Definition Service Link</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Service Link</em>' reference.
	 * @see #setComponentDefinitionServiceLink(ComponentDefinitionService)
	 * @see edtimplementation.EdtimplementationPackage#getServiceOfLinkedComponentDefinition_ComponentDefinitionServiceLink()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionService getComponentDefinitionServiceLink();

	/**
	 * Sets the value of the '{@link edtimplementation.ServiceOfLinkedComponentDefinition#getComponentDefinitionServiceLink <em>Component Definition Service Link</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Service Link</em>' reference.
	 * @see #getComponentDefinitionServiceLink()
	 * @generated
	 */
	void setComponentDefinitionServiceLink(ComponentDefinitionService value);

	public EList<OperationLink> findOperationLinks();

} // ServiceOfLinkedComponentDefinition
