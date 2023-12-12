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
 * A representation of the model object '<em><b>Default PINFO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.DefaultPINFO#getModulePINFO <em>Module PINFO</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getDefaultPINFO()
 * @model extendedMetaData="name='DefaultPINFO' kind='elementOnly'"
 * @generated
 */
public interface DefaultPINFO extends EObject {
	/**
	 * Returns the value of the '<em><b>Module PINFO</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.ModulePINFOType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of PINFOs used by the module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module PINFO</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDefaultPINFO_ModulePINFO()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modulePINFO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModulePINFOType> getModulePINFO();

} // DefaultPINFO
