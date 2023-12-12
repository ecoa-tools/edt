/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aperiodic Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRate <em>Rate</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet <em>Wcet</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getAperiodicActivationProfile()
 * @model extendedMetaData="name='AperiodicActivationProfile' kind='elementOnly'"
 * @generated
 */
public interface AperiodicActivationProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Highest activation rate
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(HighestActivationRate)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getAperiodicActivationProfile_Rate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rate' namespace='##targetNamespace'"
	 * @generated
	 */
	HighestActivationRate getRate();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(HighestActivationRate value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Deadline of the module in steps. It shall
	 *           cover the
	 *           processing of all non activating operations and the
	 *           activating one
	 *           which
	 *           initiates the processing.
	 *           Value to be taken into account by the
	 *           system
	 *           integrator.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(double)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getAperiodicActivationProfile_Deadline()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.Deadline"
	 *        extendedMetaData="kind='attribute' name='deadline'"
	 * @generated
	 */
	double getDeadline();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(double)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(double)
	 * @generated
	 */
	boolean isSetDeadline();

	/**
	 * Returns the value of the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Relative priority of this module instance to
	 *           others
	 *           module instances
	 *           To help to distinguish several module
	 *           instances sharing
	 *           the same profile
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Priority</em>' attribute.
	 * @see #setRelativePriority(BigInteger)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getAperiodicActivationProfile_RelativePriority()
	 * @model dataType="technology.ecoa.insertion.policy._2.RelativePriority"
	 *        extendedMetaData="kind='attribute' name='relativePriority'"
	 * @generated
	 */
	BigInteger getRelativePriority();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRelativePriority <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Priority</em>' attribute.
	 * @see #getRelativePriority()
	 * @generated
	 */
	void setRelativePriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           WCET of the module in steps. It shall cover
	 *           the
	 *           processing of all non activating operations and the
	 *           activating one
	 *           which
	 *           initiates the processing.
	 *           Value to be taken into account by the
	 *           system
	 *           integrator.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet</em>' attribute.
	 * @see #isSetWcet()
	 * @see #unsetWcet()
	 * @see #setWcet(double)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getAperiodicActivationProfile_Wcet()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.WCET"
	 *        extendedMetaData="kind='attribute' name='wcet'"
	 * @generated
	 */
	double getWcet();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' attribute.
	 * @see #isSetWcet()
	 * @see #unsetWcet()
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWcet()
	 * @see #getWcet()
	 * @see #setWcet(double)
	 * @generated
	 */
	void unsetWcet();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet <em>Wcet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wcet</em>' attribute is set.
	 * @see #unsetWcet()
	 * @see #getWcet()
	 * @see #setWcet(double)
	 * @generated
	 */
	boolean isSetWcet();

} // AperiodicActivationProfile
