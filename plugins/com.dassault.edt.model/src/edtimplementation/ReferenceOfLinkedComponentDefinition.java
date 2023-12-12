/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;

import edtproject.ComponentDefinitionReference;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Reference Of Linked Component Definition</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtimplementation.ReferenceOfLinkedComponentDefinition#getComponentDefinitionReferenceLink
 * <em>Component Definition Reference Link</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getReferenceOfLinkedComponentDefinition()
 * @model
 * @generated
 */
public interface ReferenceOfLinkedComponentDefinition extends ServRefOfLinkedComponentDefinition {
	/**
	 * Returns the value of the '<em><b>Component Definition Reference Link</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Reference Link</em>' reference.
	 * @see #setComponentDefinitionReferenceLink(ComponentDefinitionReference)
	 * @see edtimplementation.EdtimplementationPackage#getReferenceOfLinkedComponentDefinition_ComponentDefinitionReferenceLink()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionReference getComponentDefinitionReferenceLink();

	/**
	 * Sets the value of the '{@link edtimplementation.ReferenceOfLinkedComponentDefinition#getComponentDefinitionReferenceLink <em>Component Definition Reference Link</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Reference Link</em>' reference.
	 * @see #getComponentDefinitionReferenceLink()
	 * @generated
	 */
	void setComponentDefinitionReferenceLink(ComponentDefinitionReference value);

	public EList<OperationLink> findOperationLinks();

} // ReferenceOfLinkedComponentDefinition
