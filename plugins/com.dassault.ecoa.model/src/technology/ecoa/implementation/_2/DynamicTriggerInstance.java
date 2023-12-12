/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Trigger Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getParameter <em>Parameter</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getDynamicTriggerInstance()
 * @model extendedMetaData="name='DynamicTriggerInstance' kind='elementOnly'"
 * @generated
 */
public interface DynamicTriggerInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getDynamicTriggerInstance_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of events waiting for delay
	 *               expiration in the trigger
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getDynamicTriggerInstance_Size()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	boolean isSetSize();

} // DynamicTriggerInstance
