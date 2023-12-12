/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

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
 *   <li>{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getComputingNodeConfiguration()
 * @model extendedMetaData="name='ComputingNodeConfiguration' kind='empty'"
 * @generated
 */
public interface ComputingNodeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Computing Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of a logical computing node
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computing Node</em>' attribute.
	 * @see #setComputingNode(String)
	 * @see technology.ecoa.deployment._2.depPackage#getComputingNodeConfiguration_ComputingNode()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='computingNode'"
	 * @generated
	 */
	String getComputingNode();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Node</em>' attribute.
	 * @see #getComputingNode()
	 * @generated
	 */
	void setComputingNode(String value);

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
	 * @see technology.ecoa.deployment._2.depPackage#getComputingNodeConfiguration_SchedulingInformation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='schedulingInformation'"
	 * @generated
	 */
	String getSchedulingInformation();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Information</em>' attribute.
	 * @see #getSchedulingInformation()
	 * @generated
	 */
	void setSchedulingInformation(String value);

} // ComputingNodeConfiguration
