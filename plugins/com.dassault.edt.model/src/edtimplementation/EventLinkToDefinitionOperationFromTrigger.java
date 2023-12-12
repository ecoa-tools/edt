/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Link To Definition Operation From Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getTriggerPeriod <em>Trigger Period</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperationFromTrigger()
 * @model
 * @generated
 */
public interface EventLinkToDefinitionOperationFromTrigger extends EventLink {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(TriggerSender)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperationFromTrigger_Sender()
	 * @model required="true"
	 * @generated
	 */
	TriggerSender getSender();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(TriggerSender value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(EventDefinitionInstance)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperationFromTrigger_Receiver()
	 * @model required="true"
	 * @generated
	 */
	EventDefinitionInstance getReceiver();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(EventDefinitionInstance value);

	/**
	 * Returns the value of the '<em><b>Trigger Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Period</em>' attribute.
	 * @see #setTriggerPeriod(double)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkToDefinitionOperationFromTrigger_TriggerPeriod()
	 * @model dataType="technology.ecoa.implementation._2.TimeDuration" required="true"
	 * @generated
	 */
	double getTriggerPeriod();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getTriggerPeriod <em>Trigger Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Period</em>' attribute.
	 * @see #getTriggerPeriod()
	 * @generated
	 */
	void setTriggerPeriod(double value);

} // EventLinkToDefinitionOperationFromTrigger
