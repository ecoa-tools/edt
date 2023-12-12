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
 * A representation of the model object '<em><b>Deployed Trigger Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerInstanceName <em>Trigger Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerPriority <em>Trigger Priority</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getDeployedTriggerInstanceType()
 * @model extendedMetaData="name='deployedTriggerInstance_._type' kind='empty'"
 * @generated
 */
public interface DeployedTriggerInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedTriggerInstanceType_ComponentName()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='componentName'"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Instance Name</em>' attribute.
	 * @see #setTriggerInstanceName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedTriggerInstanceType_TriggerInstanceName()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='triggerInstanceName'"
	 * @generated
	 */
	String getTriggerInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerInstanceName <em>Trigger Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Instance Name</em>' attribute.
	 * @see #getTriggerInstanceName()
	 * @generated
	 */
	void setTriggerInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstract trigger priority that can be
	 *                   used by the platform to map the trigger on an actual
	 *                   OS priority
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Priority</em>' attribute.
	 * @see #setTriggerPriority(BigDecimal)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployedTriggerInstanceType_TriggerPriority()
	 * @model dataType="technology.ecoa.deployment._2.ModulePriority" required="true"
	 *        extendedMetaData="kind='attribute' name='triggerPriority'"
	 * @generated
	 */
	BigDecimal getTriggerPriority();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerPriority <em>Trigger Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Priority</em>' attribute.
	 * @see #getTriggerPriority()
	 * @generated
	 */
	void setTriggerPriority(BigDecimal value);

} // DeployedTriggerInstanceType
