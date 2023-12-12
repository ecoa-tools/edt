/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step2</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Step2#getComponentDefinitions <em>Component Definitions</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep2()
 * @model
 * @generated
 */
public interface Step2 extends Step {
	/**
	 * Returns the value of the '<em><b>Component Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edtproject.ComponentDefinition}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Component Definitions</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep2_ComponentDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentDefinition> getComponentDefinitions();

	/**
	 * Find ComponentDefinition
	 * 
	 * @param name                    : name of ComponentDefinition to link
	 * @param componentDefinitionList : list of ComponentDefinition imported
	 * @return : ComponentDefinition to link
	 */
	public ComponentDefinition findComponentDefinitionByName(String name);

} // Step2
