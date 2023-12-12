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
 * A representation of the model object '<em><b>Request Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Link between RR operations. Must have exactly
 *         one server. Can have many clients.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.RequestLink#getClients <em>Clients</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.RequestLink#getServer <em>Server</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.RequestLink#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getRequestLink()
 * @model extendedMetaData="name='RequestLink' kind='elementOnly'"
 * @generated
 */
public interface RequestLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference.
	 * @see #setClients(ClientsType)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestLink_Clients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='clients' namespace='##targetNamespace'"
	 * @generated
	 */
	ClientsType getClients();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestLink#getClients <em>Clients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clients</em>' containment reference.
	 * @see #getClients()
	 * @generated
	 */
	void setClients(ClientsType value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(ServerType)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestLink_Server()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='server' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerType getServer();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestLink#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(ServerType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see technology.ecoa.implementation._2.impPackage#getRequestLink_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.RequestLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.RequestLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.RequestLink#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

} // RequestLink
