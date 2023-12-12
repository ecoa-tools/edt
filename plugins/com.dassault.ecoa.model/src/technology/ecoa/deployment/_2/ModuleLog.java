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
 * A representation of the model object '<em><b>Module Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines level of logging for a deployed module
 *         instance
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.ModuleLog#getEnabledLevels <em>Enabled Levels</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ModuleLog#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getModuleLog()
 * @model extendedMetaData="name='ModuleLog' kind='empty'"
 * @generated
 */
public interface ModuleLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Levels</em>' attribute.
	 * @see #setEnabledLevels(String)
	 * @see technology.ecoa.deployment._2.depPackage#getModuleLog_EnabledLevels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='enabledLevels'"
	 * @generated
	 */
	String getEnabledLevels();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ModuleLog#getEnabledLevels <em>Enabled Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Levels</em>' attribute.
	 * @see #getEnabledLevels()
	 * @generated
	 */
	void setEnabledLevels(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.deployment._2.depPackage#getModuleLog_InstanceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ModuleLog#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

} // ModuleLog
