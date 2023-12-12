/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Ref Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OpRefTrigger#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OpRefTrigger#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOpRefTrigger()
 * @model extendedMetaData="name='OpRef_Trigger' kind='empty'"
 * @generated
 */
public interface OpRefTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefTrigger_InstanceName()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefTrigger#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * period in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(double)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefTrigger_Period()
	 * @model unsettable="true" dataType="technology.ecoa.implementation._2.TimeDuration" required="true"
	 *        extendedMetaData="kind='attribute' name='period'"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefTrigger#getPeriod <em>Period</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.OpRefTrigger#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(double)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.OpRefTrigger#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(double)
	 * @generated
	 */
	boolean isSetPeriod();

} // OpRefTrigger
