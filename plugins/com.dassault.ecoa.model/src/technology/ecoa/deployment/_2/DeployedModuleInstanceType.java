/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Module Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModuleInstanceName <em>Module Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModulePriority <em>Module Priority</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getDeployedModuleInstanceType()
 * @model extendedMetaData="name='deployedModuleInstance_._type' kind='empty'"
 * @generated
 */
public interface DeployedModuleInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedModuleInstanceType_ComponentName()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='componentName'"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Module Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Instance Name</em>' attribute.
	 * @see #setModuleInstanceName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedModuleInstanceType_ModuleInstanceName()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='moduleInstanceName'"
	 * @generated
	 */
	String getModuleInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModuleInstanceName <em>Module Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Instance Name</em>' attribute.
	 * @see #getModuleInstanceName()
	 * @generated
	 */
	void setModuleInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Module Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstract module priority that can be
	 *                   used by the platform to map the module on an
	 *                   actual OS priority
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Priority</em>' attribute.
	 * @see #setModulePriority(BigDecimal)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedModuleInstanceType_ModulePriority()
	 * @model dataType="technology.ecoa.deployment._2.ModulePriority" required="true"
	 *        extendedMetaData="kind='attribute' name='modulePriority'"
	 * @generated
	 */
	BigDecimal getModulePriority();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModulePriority <em>Module Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Priority</em>' attribute.
	 * @see #getModulePriority()
	 * @generated
	 */
	void setModulePriority(BigDecimal value);

} // DeployedModuleInstanceType
