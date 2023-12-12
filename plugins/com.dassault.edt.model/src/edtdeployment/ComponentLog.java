/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtimplementation.ComponentImplementation;
import edtproject.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Log</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.ComponentLog#getModuleLogs <em>Module
 * Logs</em>}</li>
 * <li>{@link edtdeployment.ComponentLog#getEnabledLevels <em>Enabled
 * Levels</em>}</li>
 * <li>{@link edtdeployment.ComponentLog#getComponentInstance <em>Component
 * Instance</em>}</li>
 * <li>{@link edtdeployment.ComponentLog#getComponentImplementation
 * <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getComponentLog()
 * @model
 * @generated
 */
public interface ComponentLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Logs</b></em>' containment reference
	 * list. The list contents are of type {@link edtdeployment.ModuleLog}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Logs</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getComponentLog_ModuleLogs()
	 * @model containment="true" extendedMetaData="kind='element' name='moduleLog'
	 *        namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleLog> getModuleLogs();

	/**
	 * Returns the value of the '<em><b>Enabled Levels</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enabled Levels</em>' attribute.
	 * @see #setEnabledLevels(String)
	 * @see edtdeployment.EdtdeploymentPackage#getComponentLog_EnabledLevels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='enabledLevels'"
	 * @generated
	 */
	String getEnabledLevels();

	/**
	 * Sets the value of the '{@link edtdeployment.ComponentLog#getEnabledLevels
	 * <em>Enabled Levels</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Enabled Levels</em>' attribute.
	 * @see #getEnabledLevels()
	 * @generated
	 */
	void setEnabledLevels(String value);

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(Component)
	 * @see edtdeployment.EdtdeploymentPackage#getComponentLog_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentInstance();

	/**
	 * Sets the value of the '{@link edtdeployment.ComponentLog#getComponentInstance
	 * <em>Component Instance</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(Component value);

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Implementation</em>' reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see edtdeployment.EdtdeploymentPackage#getComponentLog_ComponentImplementation()
	 * @model required="true"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the
	 * '{@link edtdeployment.ComponentLog#getComponentImplementation <em>Component
	 * Implementation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Component Implementation</em>'
	 *              reference.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(ComponentImplementation value);

	/**
	 * 
	 * @return true if missing no attributes
	 */
	boolean isComplete();

} // ComponentLog
