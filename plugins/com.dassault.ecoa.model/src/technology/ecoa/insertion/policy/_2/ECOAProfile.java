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
 * A representation of the model object '<em><b>ECOA Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ECOAProfile#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getECOAProfile()
 * @model extendedMetaData="name='ECOAProfile' kind='empty'"
 * @generated
 */
public interface ECOAProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.ProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           ECOA Profile
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @see #isSetProfile()
	 * @see #unsetProfile()
	 * @see #setProfile(ProfileType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getECOAProfile_Profile()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='profile'"
	 * @generated
	 */
	ProfileType getProfile();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ECOAProfile#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @see #isSetProfile()
	 * @see #unsetProfile()
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(ProfileType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.ECOAProfile#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfile()
	 * @see #getProfile()
	 * @see #setProfile(ProfileType)
	 * @generated
	 */
	void unsetProfile();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.ECOAProfile#getProfile <em>Profile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile</em>' attribute is set.
	 * @see #unsetProfile()
	 * @see #getProfile()
	 * @see #setProfile(ProfileType)
	 * @generated
	 */
	boolean isSetProfile();

} // ECOAProfile
