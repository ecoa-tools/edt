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
 * A representation of the model object '<em><b>Periodic Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod <em>Period</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet <em>Wcet</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getPeriodicActivationProfile()
 * @model extendedMetaData="name='PeriodicActivationProfile' kind='empty'"
 * @generated
 */
public interface PeriodicActivationProfile extends EObject {
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
	 * @see technology.ecoa.insertion.policy._2.polPackage#getPeriodicActivationProfile_Deadline()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.Deadline"
	 *        extendedMetaData="kind='attribute' name='deadline'"
	 * @generated
	 */
	double getDeadline();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline <em>Deadline</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(double)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline <em>Deadline</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Period of the module in steps. Expected time
	 *           between
	 *           the
	 *           arrival of two activating operations.
	 *           Value to be taken into account
	 *           by
	 *           the
	 *           system integrator.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(double)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getPeriodicActivationProfile_Period()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.Period"
	 *        extendedMetaData="kind='attribute' name='period'"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(double)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(double)
	 * @generated
	 */
	boolean isSetPeriod();

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
	 * @see technology.ecoa.insertion.policy._2.polPackage#getPeriodicActivationProfile_RelativePriority()
	 * @model dataType="technology.ecoa.insertion.policy._2.RelativePriority"
	 *        extendedMetaData="kind='attribute' name='relativePriority'"
	 * @generated
	 */
	BigInteger getRelativePriority();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getRelativePriority <em>Relative Priority</em>}' attribute.
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
	 * @see technology.ecoa.insertion.policy._2.polPackage#getPeriodicActivationProfile_Wcet()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.WCET"
	 *        extendedMetaData="kind='attribute' name='wcet'"
	 * @generated
	 */
	double getWcet();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet <em>Wcet</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWcet()
	 * @see #getWcet()
	 * @see #setWcet(double)
	 * @generated
	 */
	void unsetWcet();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet <em>Wcet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wcet</em>' attribute is set.
	 * @see #unsetWcet()
	 * @see #getWcet()
	 * @see #setWcet(double)
	 * @generated
	 */
	boolean isSetWcet();

} // PeriodicActivationProfile
