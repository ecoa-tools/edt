/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Pinfo Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.PrivatePinfoValue#getPrivatePinfoFromModuleType <em>Private Pinfo From Module Type</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getPrivatePinfoValue()
 * @model
 * @generated
 */
public interface PrivatePinfoValue extends PinfoValue {
	/**
	 * Returns the value of the '<em><b>Private Pinfo From Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Pinfo From Module Type</em>' reference.
	 * @see #setPrivatePinfoFromModuleType(PrivatePinfo)
	 * @see edtimplementation.EdtimplementationPackage#getPrivatePinfoValue_PrivatePinfoFromModuleType()
	 * @model required="true"
	 * @generated
	 */
	PrivatePinfo getPrivatePinfoFromModuleType();

	/**
	 * Sets the value of the '{@link edtimplementation.PrivatePinfoValue#getPrivatePinfoFromModuleType <em>Private Pinfo From Module Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Pinfo From Module Type</em>' reference.
	 * @see #getPrivatePinfoFromModuleType()
	 * @generated
	 */
	void setPrivatePinfoFromModuleType(PrivatePinfo value);

} // PrivatePinfoValue
