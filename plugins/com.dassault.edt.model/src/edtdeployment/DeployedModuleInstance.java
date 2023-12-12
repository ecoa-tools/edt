/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import edtimplementation.ComponentImplementation;
import edtimplementation.ModuleInstance;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Deployed
 * Module Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.DeployedModuleInstance#getModulePriority <em>Module
 * Priority</em>}</li>
 * <li>{@link edtdeployment.DeployedModuleInstance#getModuleInstance <em>Module
 * Instance</em>}</li>
 * <li>{@link edtdeployment.DeployedModuleInstance#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * <li>{@link edtdeployment.DeployedModuleInstance#getComponent
 * <em>Component</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getDeployedModuleInstance()
 * @model
 * @generated
 */
public interface DeployedModuleInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Priority</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Abstract
	 * module priority that can be used by the platform to map the module on an
	 * actual OS priority
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Module Priority</em>' attribute.
	 * @see #setModulePriority(BigDecimal)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedModuleInstance_ModulePriority()
	 * @model dataType="technology.ecoa.deployment._2.ModulePriority"
	 *        required="true" extendedMetaData="kind='attribute'
	 *        name='modulePriority'"
	 * @generated
	 */
	BigDecimal getModulePriority();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedModuleInstance#getModulePriority <em>Module
	 * Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Module Priority</em>' attribute.
	 * @see #getModulePriority()
	 * @generated
	 */
	void setModulePriority(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Instance</em>' reference.
	 * @see #setModuleInstance(ModuleInstance)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedModuleInstance_ModuleInstance()
	 * @model required="true"
	 * @generated
	 */
	ModuleInstance getModuleInstance();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedModuleInstance#getModuleInstance <em>Module
	 * Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Module Instance</em>' reference.
	 * @see #getModuleInstance()
	 * @generated
	 */
	void setModuleInstance(ModuleInstance value);

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Implementation</em>' reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedModuleInstance_ComponentImplementation()
	 * @model required="true"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedModuleInstance#getComponentImplementation
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
	 * @see edtdeployment.EdtdeploymentPackage#getDeployedModuleInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.DeployedModuleInstance#getComponent
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

} // DeployedModuleInstance
