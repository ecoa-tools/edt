/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;

import edtinterface.ServiceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step1</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Step1#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep1()
 * @model
 * @generated
 */
public interface Step1 extends Step {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link edtinterface.ServiceDefinition}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep1_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceDefinition> getServices();

	/**
	 * Find ServiceDefinition by Name
	 *
	 * @param serviceDefinitionName  : name of ServiceDefinition to find
	 * @param serviceDefinitionsList : list of ServiceDefinition
	 * @return ServiceDefinition found
	 */
	public edtinterface.ServiceDefinition findServiceDefinitionByName(String serviceDefinitionName);
} // Step1
