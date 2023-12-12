/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import edtimplementation.ComponentImplementation;
import edtimplementation.Trigger;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Deployed
 * Trigger Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.DeployedTriggerInstance#getTriggerPriority
 * <em>Trigger Priority</em>}</li>
 * <li>{@link edtdeployment.DeployedTriggerInstance#getTriggerInstance
 * <em>Trigger Instance</em>}</li>
 * <li>{@link edtdeployment.DeployedTriggerInstance#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * <li>{@link edtdeployment.DeployedTriggerInstance#getComponent
 * <em>Component</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getDeployedTriggerInstance()
 * @model
 * @generated
 */
public interface DeployedTriggerInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger Priority</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Abstract
	 * trigger priority that can be used by the platform to map the trigger on an
	 * actual OS priority
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Trigger Priority</em>' attribute.
	 * @see #setTriggerPriority(BigDecimal)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedTriggerInstance_TriggerPriority()
	 * @model dataType="technology.ecoa.deployment._2.ModulePriority"
	 *        required="true" extendedMetaData="kind='attribute'
	 *        name='triggerPriority'"
	 * @generated
	 */
	BigDecimal getTriggerPriority();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedTriggerInstance#getTriggerPriority <em>Trigger
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Trigger Priority</em>' attribute.
	 * @see #getTriggerPriority()
	 * @generated
	 */
	void setTriggerPriority(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Trigger Instance</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Trigger Instance</em>' reference.
	 * @see #setTriggerInstance(Trigger)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedTriggerInstance_TriggerInstance()
	 * @model required="true"
	 * @generated
	 */
	Trigger getTriggerInstance();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedTriggerInstance#getTriggerInstance <em>Trigger
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Trigger Instance</em>' reference.
	 * @see #getTriggerInstance()
	 * @generated
	 */
	void setTriggerInstance(Trigger value);

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Implementation</em>' reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedTriggerInstance_ComponentImplementation()
	 * @model required="true"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedTriggerInstance#getComponentImplementation
	 * <em>Component Implementation</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Component Implementation</em>'
	 *              reference.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedTriggerInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedTriggerInstance#getComponent
	 * <em>Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * 
	 * @return true if missing no attributes
	 */
	boolean isComplete();

} // DeployedTriggerInstance
