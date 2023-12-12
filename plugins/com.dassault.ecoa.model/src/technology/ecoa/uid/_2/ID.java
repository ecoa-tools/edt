/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.uid._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.uid._2.ID#getKey <em>Key</em>}</li>
 *   <li>{@link technology.ecoa.uid._2.ID#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.uid._2.uidPackage#getID()
 * @model extendedMetaData="name='ID' kind='empty'"
 * @generated
 */
public interface ID extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see technology.ecoa.uid._2.uidPackage#getID_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link technology.ecoa.uid._2.ID#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @see technology.ecoa.uid._2.uidPackage#getID_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link technology.ecoa.uid._2.ID#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.uid._2.ID#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.uid._2.ID#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	boolean isSetValue();

} // ID
