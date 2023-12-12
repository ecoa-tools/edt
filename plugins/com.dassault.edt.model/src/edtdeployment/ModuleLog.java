/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.ecore.EObject;

import edtimplementation.ModuleInstance;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Log</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.ModuleLog#getEnabledLevels <em>Enabled
 * Levels</em>}</li>
 * <li>{@link edtdeployment.ModuleLog#getModuleInstance <em>Module
 * Instance</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getModuleLog()
 * @model
 * @generated
 */
public interface ModuleLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled Levels</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enabled Levels</em>' attribute.
	 * @see #setEnabledLevels(String)
	 * @see edtdeployment.EdtdeploymentPackage#getModuleLog_EnabledLevels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='enabledLevels'"
	 * @generated
	 */
	String getEnabledLevels();

	/**
	 * Sets the value of the '{@link edtdeployment.ModuleLog#getEnabledLevels
	 * <em>Enabled Levels</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Enabled Levels</em>' attribute.
	 * @see #getEnabledLevels()
	 * @generated
	 */
	void setEnabledLevels(String value);

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Instance</em>' reference.
	 * @see #setModuleInstance(ModuleInstance)
	 * @see edtdeployment.EdtdeploymentPackage#getModuleLog_ModuleInstance()
	 * @model required="true"
	 * @generated
	 */
	ModuleInstance getModuleInstance();

	/**
	 * Sets the value of the '{@link edtdeployment.ModuleLog#getModuleInstance
	 * <em>Module Instance</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Module Instance</em>' reference.
	 * @see #getModuleInstance()
	 * @generated
	 */
	void setModuleInstance(ModuleInstance value);

	/**
	 * 
	 * @return true if missing no attributes
	 */
	boolean isComplete();

} // ModuleLog
