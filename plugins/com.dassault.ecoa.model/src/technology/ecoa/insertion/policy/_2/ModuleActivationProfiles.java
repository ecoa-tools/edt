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
 * A representation of the model object '<em><b>Module Activation Profiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles#getActivationProfile <em>Activation Profile</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfiles()
 * @model extendedMetaData="name='ModuleActivationProfiles' kind='elementOnly'"
 * @generated
 */
public interface ModuleActivationProfiles extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Profile</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.ModuleActivationProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Module activation profile entry
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Profile</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfiles_ActivationProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activationProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleActivationProfile> getActivationProfile();

} // ModuleActivationProfiles
