/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Pinfo Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.PublicPinfoValue#getPublicPinfoFromModuleType <em>Public Pinfo From Module Type</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getPublicPinfoValue()
 * @model
 * @generated
 */
public interface PublicPinfoValue extends PinfoValue {
	/**
	 * Returns the value of the '<em><b>Public Pinfo From Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Pinfo From Module Type</em>' reference.
	 * @see #setPublicPinfoFromModuleType(PublicPinfo)
	 * @see edtimplementation.EdtimplementationPackage#getPublicPinfoValue_PublicPinfoFromModuleType()
	 * @model required="true"
	 * @generated
	 */
	PublicPinfo getPublicPinfoFromModuleType();

	/**
	 * Sets the value of the '{@link edtimplementation.PublicPinfoValue#getPublicPinfoFromModuleType <em>Public Pinfo From Module Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Pinfo From Module Type</em>' reference.
	 * @see #getPublicPinfoFromModuleType()
	 * @generated
	 */
	void setPublicPinfoFromModuleType(PublicPinfo value);

} // PublicPinfoValue
