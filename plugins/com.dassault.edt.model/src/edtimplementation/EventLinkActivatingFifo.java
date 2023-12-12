/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Link Activating Fifo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatingFifo#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatingFifo#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifo()
 * @model
 * @generated
 */
public interface EventLinkActivatingFifo extends EventLink {
	/**
	 * Returns the value of the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Fifo Size</em>' attribute.
	 * @see #isSetReceiverFifoSize()
	 * @see #unsetReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifo_ReceiverFifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getReceiverFifoSize();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Fifo Size</em>' attribute.
	 * @see #isSetReceiverFifoSize()
	 * @see #unsetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @generated
	 */
	void setReceiverFifoSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @generated
	 */
	void unsetReceiverFifoSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receiver Fifo Size</em>' attribute is set.
	 * @see #unsetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @generated
	 */
	boolean isSetReceiverFifoSize();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(EventLinkSender)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifo_Sender()
	 * @model required="true"
	 * @generated
	 */
	EventLinkSender getSender();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifo#getSender <em>Sender</em>}' reference.
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
	 * @see #setReceiver(DynamicTriggerEventReceiverInstance)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifo_Receiver()
	 * @model required="true"
	 * @generated
	 */
	DynamicTriggerEventReceiverInstance getReceiver();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifo#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(DynamicTriggerEventReceiverInstance value);

} // EventLinkActivatingFifo
