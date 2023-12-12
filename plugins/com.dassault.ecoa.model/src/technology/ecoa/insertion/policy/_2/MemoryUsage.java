/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.MemoryUsage#getModuleMemoryUsage <em>Module Memory Usage</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getMemoryUsage()
 * @model extendedMetaData="name='MemoryUsage' kind='elementOnly'"
 * @generated
 */
public interface MemoryUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Memory Usage</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Module memory usage entry
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Memory Usage</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getMemoryUsage_ModuleMemoryUsage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleMemoryUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleMemoryUsage> getModuleMemoryUsage();

} // MemoryUsage
