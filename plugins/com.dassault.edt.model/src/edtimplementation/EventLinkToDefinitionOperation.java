/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Link To Definition Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.EventLinkToDefinitionOperation#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.EventLinkToDefinitionOperation#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperation()
 * @model
 * @generated
 */
public interface EventLinkToDefinitionOperation extends EventLink {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(EventLinkSender)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperation_Sender()
	 * @model required="true"
	 * @generated
	 */
	EventLinkSender getSender();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkToDefinitionOperation#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(EventLinkSender value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(EventDefinitionInstance)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperation_Receiver()
	 * @model required="true"
	 * @generated
	 */
	EventDefinitionInstance getReceiver();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkToDefinitionOperation#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(EventDefinitionInstance value);

} // EventLinkToDefinitionOperation
