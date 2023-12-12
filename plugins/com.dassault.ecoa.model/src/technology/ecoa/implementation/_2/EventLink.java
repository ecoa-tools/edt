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
 * A representation of the model object '<em><b>Event Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Link between EVENT operations.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.EventLink#getSenders <em>Senders</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.EventLink#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.EventLink#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getEventLink()
 * @model extendedMetaData="name='EventLink' kind='elementOnly'"
 * @generated
 */
public interface EventLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Senders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders</em>' containment reference.
	 * @see #setSenders(SendersType)
	 * @see technology.ecoa.implementation._2.impPackage#getEventLink_Senders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='senders' namespace='##targetNamespace'"
	 * @generated
	 */
	SendersType getSenders();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.EventLink#getSenders <em>Senders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senders</em>' containment reference.
	 * @see #getSenders()
	 * @generated
	 */
	void setSenders(SendersType value);

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference.
	 * @see #setReceivers(ReceiversType)
	 * @see technology.ecoa.implementation._2.impPackage#getEventLink_Receivers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='receivers' namespace='##targetNamespace'"
	 * @generated
	 */
	ReceiversType getReceivers();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.EventLink#getReceivers <em>Receivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivers</em>' containment reference.
	 * @see #getReceivers()
	 * @generated
	 */
	void setReceivers(ReceiversType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see technology.ecoa.implementation._2.impPackage#getEventLink_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.EventLink#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.EventLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.EventLink#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

} // EventLink
