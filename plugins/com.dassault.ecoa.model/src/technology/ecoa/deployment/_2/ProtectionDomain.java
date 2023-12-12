/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an OS executable, offering memory (and
 *         possibly also temporal) protection
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.ProtectionDomain#getExecuteOn <em>Execute On</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ProtectionDomain#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ProtectionDomain#getDeployedModuleInstance <em>Deployed Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ProtectionDomain#getDeployedTriggerInstance <em>Deployed Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ProtectionDomain#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain()
 * @model extendedMetaData="name='ProtectionDomain' kind='elementOnly'"
 * @generated
 */
public interface ProtectionDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Execute On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute On</em>' containment reference.
	 * @see #setExecuteOn(ExecuteOnType)
	 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain_ExecuteOn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='executeOn' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecuteOnType getExecuteOn();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ProtectionDomain#getExecuteOn <em>Execute On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute On</em>' containment reference.
	 * @see #getExecuteOn()
	 * @generated
	 */
	void setExecuteOn(ExecuteOnType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Deployed Module Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.DeployedModuleInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Module Instance</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain_DeployedModuleInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deployedModuleInstance' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DeployedModuleInstanceType> getDeployedModuleInstance();

	/**
	 * Returns the value of the '<em><b>Deployed Trigger Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.DeployedTriggerInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Trigger Instance</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain_DeployedTriggerInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deployedTriggerInstance' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DeployedTriggerInstanceType> getDeployedTriggerInstance();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getProtectionDomain_Name()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ProtectionDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProtectionDomain
