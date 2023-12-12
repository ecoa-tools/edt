/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use of the "event" exchange mechanism.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.Event#getInput <em>Input</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.Event#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_._2.interPackage#getEvent()
 * @model extendedMetaData="name='Event' kind='elementOnly'"
 * @generated
 */
public interface Event extends Operation {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_._2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see technology.ecoa.interface_._2.interPackage#getEvent_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
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
	 * @see technology.ecoa.interface_._2.interPackage#getEvent_Direction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	EEventDirection getDirection();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_._2.Event#getDirection <em>Direction</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.interface_._2.Event#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EEventDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.interface_._2.Event#getDirection <em>Direction</em>}' attribute is set.
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
