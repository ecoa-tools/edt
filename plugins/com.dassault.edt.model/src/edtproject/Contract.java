/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EObject;

import edtinterface.ServiceDefinition;
import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Contract</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.Contract#getSyntax <em>Syntax</em>}</li>
 * <li>{@link edtproject.Contract#getQos <em>Qos</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Syntax</em>' reference.
	 * @see #setSyntax(ServiceDefinition)
	 * @see edtproject.EDTProjectPackage#getContract_Syntax()
	 * @model required="true"
	 * @generated
	 */
	ServiceDefinition getSyntax();

	/**
	 * Sets the value of the '{@link edtproject.Contract#getSyntax <em>Syntax</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Syntax</em>' reference.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(ServiceDefinition value);

	/**
	 * Returns the value of the '<em><b>Qos</b></em>' reference. It is bidirectional
	 * and its opposite is '{@link edtqos.ServiceInstanceQos#getInterfaceLink
	 * <em>Interface Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Qos</em>' reference.
	 * @see #setQos(ServiceInstanceQos)
	 * @see edtproject.EDTProjectPackage#getContract_Qos()
	 * @see edtqos.ServiceInstanceQos#getInterfaceLink
	 * @model opposite="InterfaceLink"
	 * @generated
	 */
	ServiceInstanceQos getQos();

	/**
	 * Sets the value of the '{@link edtproject.Contract#getQos <em>Qos</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Qos</em>' reference.
	 * @see #getQos()
	 * @generated
	 */
	void setQos(ServiceInstanceQos value);

} // Contract
