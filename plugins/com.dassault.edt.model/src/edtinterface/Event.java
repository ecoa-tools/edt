/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.interface_._2.EEventDirection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtinterface.Event#getInput <em>Input</em>}</li>
 *   <li>{@link edtinterface.Event#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends OperationType {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edtinterface.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edtinterface.EDTInterfacePackage#getEvent_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInput();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.interface_._2.EEventDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see technology.ecoa.interface_._2.EEventDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(EEventDirection)
	 * @see edtinterface.EDTInterfacePackage#getEvent_Direction()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	EEventDirection getDirection();

	/**
	 * Sets the value of the '{@link edtinterface.Event#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see technology.ecoa.interface_._2.EEventDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EEventDirection value);

	/**
	 * Unsets the value of the '{@link edtinterface.Event#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EEventDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link edtinterface.Event#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EEventDirection)
	 * @generated
	 */
	boolean isSetDirection();

} // Event
