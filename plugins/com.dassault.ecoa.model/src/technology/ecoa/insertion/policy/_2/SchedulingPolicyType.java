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
 * A representation of the model object '<em><b>Scheduling Policy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getSchedulingPolicyType()
 * @model extendedMetaData="name='schedulingPolicy_._type' kind='empty'"
 * @generated
 */
public interface SchedulingPolicyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OS-level scheduling policy used to schedule
	 *                 modules
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @see #isSetPolicy()
	 * @see #unsetPolicy()
	 * @see #setPolicy(SchedulingPolicy)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getSchedulingPolicyType_Policy()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='policy'"
	 * @generated
	 */
	SchedulingPolicy getPolicy();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @see #isSetPolicy()
	 * @see #unsetPolicy()
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SchedulingPolicy value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolicy()
	 * @see #getPolicy()
	 * @see #setPolicy(SchedulingPolicy)
	 * @generated
	 */
	void unsetPolicy();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy <em>Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Policy</em>' attribute is set.
	 * @see #unsetPolicy()
	 * @see #getPolicy()
	 * @see #setPolicy(SchedulingPolicy)
	 * @generated
	 */
	boolean isSetPolicy();

} // SchedulingPolicyType
