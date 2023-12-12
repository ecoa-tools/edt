/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingPlatform;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Protection Domain</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.ProtectionDomain#getDeployedModuleInstances
 * <em>Deployed Module Instances</em>}</li>
 * <li>{@link edtdeployment.ProtectionDomain#getDeployedTriggerInstances
 * <em>Deployed Trigger Instances</em>}</li>
 * <li>{@link edtdeployment.ProtectionDomain#getName <em>Name</em>}</li>
 * <li>{@link edtdeployment.ProtectionDomain#getExecuteOnComputingNode
 * <em>Execute On Computing Node</em>}</li>
 * <li>{@link edtdeployment.ProtectionDomain#getExecuteOnComputingPlatform
 * <em>Execute On Computing Platform</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain()
 * @model
 * @generated
 */
public interface ProtectionDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployed Module Instances</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edtdeployment.DeployedModuleInstance}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Deployed Module Instances</em>' containment
	 *         reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain_DeployedModuleInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedModuleInstance> getDeployedModuleInstances();

	/**
	 * Returns the value of the '<em><b>Deployed Trigger Instances</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edtdeployment.DeployedTriggerInstance}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Deployed Trigger Instances</em>' containment
	 *         reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain_DeployedTriggerInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedTriggerInstance> getDeployedTriggerInstances();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain_Name()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtdeployment.ProtectionDomain#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Execute On Computing Node</b></em>'
	 * reference. It is bidirectional and its opposite is
	 * '{@link edtlogical.LogicalComputingNode#getProtectionDomainLink
	 * <em>Protection Domain Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the value of the '<em>Execute On Computing Node</em>' reference.
	 * @see #setExecuteOnComputingNode(LogicalComputingNode)
	 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain_ExecuteOnComputingNode()
	 * @see edtlogical.LogicalComputingNode#getProtectionDomainLink
	 * @model opposite="ProtectionDomainLink" required="true"
	 * @generated
	 */
	LogicalComputingNode getExecuteOnComputingNode();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.ProtectionDomain#getExecuteOnComputingNode <em>Execute
	 * On Computing Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Execute On Computing Node</em>'
	 *              reference.
	 * @see #getExecuteOnComputingNode()
	 * @generated
	 */
	void setExecuteOnComputingNode(LogicalComputingNode value);

	/**
	 * Returns the value of the '<em><b>Execute On Computing Platform</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Execute On Computing Platform</em>' reference.
	 * @see #setExecuteOnComputingPlatform(LogicalComputingPlatform)
	 * @see edtdeployment.EdtdeploymentPackage#getProtectionDomain_ExecuteOnComputingPlatform()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatform getExecuteOnComputingPlatform();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.ProtectionDomain#getExecuteOnComputingPlatform
	 * <em>Execute On Computing Platform</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Execute On Computing Platform</em>'
	 *              reference.
	 * @see #getExecuteOnComputingPlatform()
	 * @generated
	 */
	void setExecuteOnComputingPlatform(LogicalComputingPlatform value);

	/**
	 * 
	 * @return true if missing no attributes
	 */
	boolean isComplete();

} // ProtectionDomain
