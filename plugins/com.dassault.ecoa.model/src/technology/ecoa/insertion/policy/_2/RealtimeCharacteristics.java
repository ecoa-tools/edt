/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getModuleActivationProfiles <em>Module Activation Profiles</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getRealtimeCharacteristics()
 * @model extendedMetaData="name='RealtimeCharacteristics' kind='elementOnly'"
 * @generated
 */
public interface RealtimeCharacteristics extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A scheduling policy for which the component
	 *             was
	 *             validated
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' containment reference.
	 * @see #setSchedulingPolicy(SchedulingPolicyType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getRealtimeCharacteristics_SchedulingPolicy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schedulingPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	SchedulingPolicyType getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getSchedulingPolicy <em>Scheduling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' containment reference.
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicyType value);

	/**
	 * Returns the value of the '<em><b>Module Activation Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of module activation profiles
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Activation Profiles</em>' containment reference.
	 * @see #setModuleActivationProfiles(ModuleActivationProfiles)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getRealtimeCharacteristics_ModuleActivationProfiles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleActivationProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleActivationProfiles getModuleActivationProfiles();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getModuleActivationProfiles <em>Module Activation Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Activation Profiles</em>' containment reference.
	 * @see #getModuleActivationProfiles()
	 * @generated
	 */
	void setModuleActivationProfiles(ModuleActivationProfiles value);

} // RealtimeCharacteristics
