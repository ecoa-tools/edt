/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Link Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatableFifo#isReceiverActivating <em>Receiver Activating</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatableFifo#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatableFifo#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatableFifo()
 * @model
 * @generated
 */
public interface EventLinkActivatableFifo extends EventLink {
	/**
	 * Returns the value of the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Fifo Size</em>' attribute.
	 * @see #isSetReceiverFifoSize()
	 * @see #unsetReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatableFifo_ReceiverFifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getReceiverFifoSize();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
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
	 * Unsets the value of the '{@link edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @generated
	 */
	void unsetReceiverFifoSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Receiver Activating</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Activating</em>' attribute.
	 * @see #isSetReceiverActivating()
	 * @see #unsetReceiverActivating()
	 * @see #setReceiverActivating(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatableFifo_ReceiverActivating()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReceiverActivating();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatableFifo#isReceiverActivating <em>Receiver Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Activating</em>' attribute.
	 * @see #isSetReceiverActivating()
	 * @see #unsetReceiverActivating()
	 * @see #isReceiverActivating()
	 * @generated
	 */
	void setReceiverActivating(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.EventLinkActivatableFifo#isReceiverActivating <em>Receiver Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverActivating()
	 * @see #isReceiverActivating()
	 * @see #setReceiverActivating(boolean)
	 * @generated
	 */
	void unsetReceiverActivating();

	/**
	 * Returns whether the value of the '{@link edtimplementation.EventLinkActivatableFifo#isReceiverActivating <em>Receiver Activating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receiver Activating</em>' attribute is set.
	 * @see #unsetReceiverActivating()
	 * @see #isReceiverActivating()
	 * @see #setReceiverActivating(boolean)
	 * @generated
	 */
	boolean isSetReceiverActivating();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(EventLinkSender)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatableFifo_Sender()
	 * @model required="true"
	 * @generated
	 */
	EventLinkSender getSender();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatableFifo#getSender <em>Sender</em>}' reference.
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
	 * @see #setReceiver(EventReceiverInstance)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatableFifo_Receiver()
	 * @model required="true"
	 * @generated
	 */
	EventReceiverInstance getReceiver();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatableFifo#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(EventReceiverInstance value);

} // EventLinkActivatableFifo
