/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.LogPolicy#getComponentLogs <em>Component Logs</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getLogPolicy()
 * @model
 * @generated
 */
public interface LogPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Logs</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.ComponentLog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Logs</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getLogPolicy_ComponentLogs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentLog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentLog> getComponentLogs();

} // LogPolicy
