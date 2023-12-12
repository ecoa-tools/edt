/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;

import edtimplementation.ComponentImplementation;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step4</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Step4#getComponentImplementations <em>Component Implementations</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep4()
 * @model
 * @generated
 */
public interface Step4 extends Step {

	/**
	 * Returns the value of the '<em><b>Component Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ComponentImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementations</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep4_ComponentImplementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentImplementation> getComponentImplementations();

	/**
	 * 
	 * @param edtComponentImplementation
	 * @param implementationName
	 * @return
	 */
	public edtimplementation.ComponentImplementation findComponentImplementationByName(String implementationName);
} // Step4
