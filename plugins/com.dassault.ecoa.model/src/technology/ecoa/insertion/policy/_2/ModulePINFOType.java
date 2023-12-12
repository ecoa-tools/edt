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
 * A representation of the model object '<em><b>Module PINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getPublicPINFO <em>Public PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getPrivatePINFO <em>Private PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModulePINFOType()
 * @model extendedMetaData="name='modulePINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface ModulePINFOType extends EObject {
	/**
	 * Returns the value of the '<em><b>Public PINFO</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.PINFOValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public PINFO used by the module
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public PINFO</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModulePINFOType_PublicPINFO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicPINFO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PINFOValue> getPublicPINFO();

	/**
	 * Returns the value of the '<em><b>Private PINFO</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.PINFOValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Private PINFO used by the module
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private PINFO</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModulePINFOType_PrivatePINFO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='privatePINFO' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PINFOValue> getPrivatePINFO();

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Reference to the module instance
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModulePINFOType_InstanceName()
	 * @model dataType="technology.ecoa.insertion.policy._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

} // ModulePINFOType
