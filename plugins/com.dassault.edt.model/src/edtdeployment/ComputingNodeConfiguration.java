/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import edtlogical.LogicalComputingNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Node Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}</li>
 *   <li>{@link edtdeployment.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getComputingNodeConfiguration()
 * @model
 * @generated
 */
public interface ComputingNodeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to any external file containing any
	 *           additional scheduling parameters required by the system
	 *           integrator (non-defined by ECOA)
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduling Information</em>' attribute.
	 * @see #setSchedulingInformation(String)
	 * @see edtdeployment.EdtdeploymentPackage#getComputingNodeConfiguration_SchedulingInformation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='schedulingInformation'"
	 * @generated
	 */
	String getSchedulingInformation();

	/**
	 * Sets the value of the '{@link edtdeployment.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Information</em>' attribute.
	 * @see #getSchedulingInformation()
	 * @generated
	 */
	void setSchedulingInformation(String value);

	/**
	 * Returns the value of the '<em><b>Computing Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Node</em>' reference.
	 * @see #setComputingNode(LogicalComputingNode)
	 * @see edtdeployment.EdtdeploymentPackage#getComputingNodeConfiguration_ComputingNode()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingNode getComputingNode();

	/**
	 * Sets the value of the '{@link edtdeployment.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Node</em>' reference.
	 * @see #getComputingNode()
	 * @generated
	 */
	void setComputingNode(LogicalComputingNode value);

} // ComputingNodeConfiguration
