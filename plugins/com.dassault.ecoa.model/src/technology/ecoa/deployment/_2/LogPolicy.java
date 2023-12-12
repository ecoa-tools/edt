/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the log policy for deployed components
 *         and modules
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.LogPolicy#getComponentLog <em>Component Log</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getLogPolicy()
 * @model extendedMetaData="name='LogPolicy' kind='elementOnly'"
 * @generated
 */
public interface LogPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Log</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.ComponentLog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Log</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getLogPolicy_ComponentLog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentLog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentLog> getComponentLog();

} // LogPolicy
