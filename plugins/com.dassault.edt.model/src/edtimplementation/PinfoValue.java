/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pinfo
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.PinfoValue#getValue <em>Value</em>}</li>
 *   <li>{@link edtimplementation.PinfoValue#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getPinfoValue()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PinfoValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edtimplementation.EdtimplementationPackage#getPinfoValue_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edtimplementation.PinfoValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getPinfoValue_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.PinfoValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // PinfoValue
