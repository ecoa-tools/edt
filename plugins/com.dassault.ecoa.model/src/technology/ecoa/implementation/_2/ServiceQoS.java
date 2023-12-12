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
 * A representation of the model object '<em><b>Service Qo S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To define a new QoS for a provided or required
 *         service
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ServiceQoS#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ServiceQoS#getNewQoS <em>New Qo S</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getServiceQoS()
 * @model extendedMetaData="name='ServiceQoS' kind='empty'"
 * @generated
 */
public interface ServiceQoS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getServiceQoS_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ServiceQoS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>New Qo S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Qo S</em>' attribute.
	 * @see #setNewQoS(String)
	 * @see technology.ecoa.implementation._2.impPackage#getServiceQoS_NewQoS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='newQoS'"
	 * @generated
	 */
	String getNewQoS();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ServiceQoS#getNewQoS <em>New Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Qo S</em>' attribute.
	 * @see #getNewQoS()
	 * @generated
	 */
	void setNewQoS(String value);

} // ServiceQoS
