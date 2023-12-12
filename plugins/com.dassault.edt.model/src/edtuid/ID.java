/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid;

import org.eclipse.emf.ecore.EObject;

import edtinterface.OperationType;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>ID</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtuid.ID#getValue <em>Value</em>}</li>
 * <li>{@link edtuid.ID#getOperation <em>Operation</em>}</li>
 * <li>{@link edtuid.ID#getServiceLink <em>Service Link</em>}</li>
 * </ul>
 *
 * @see edtuid.EdtuidPackage#getID()
 * @model
 * @generated
 */
public interface ID extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @see edtuid.EdtuidPackage#getID_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link edtuid.ID#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Unsets the value of the '{@link edtuid.ID#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link edtuid.ID#getValue <em>Value</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(OperationType)
	 * @see edtuid.EdtuidPackage#getID_Operation()
	 * @model required="true"
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link edtuid.ID#getOperation <em>Operation</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

	/**
	 * Returns the value of the '<em><b>Service Link</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Link</em>' reference.
	 * @see #setServiceLink(ServiceLink)
	 * @see edtuid.EdtuidPackage#getID_ServiceLink()
	 * @model required="true"
	 * @generated
	 */
	ServiceLink getServiceLink();

	/**
	 * Sets the value of the '{@link edtuid.ID#getServiceLink <em>Service
	 * Link</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Service Link</em>' reference.
	 * @see #getServiceLink()
	 * @generated
	 */
	void setServiceLink(ServiceLink value);

} // ID
