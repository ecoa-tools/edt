/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import technology.ecoa.implementation._2.ProgrammingLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Sender Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ExternalSenderOperation#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getExternalSenderOperation()
 * @model
 * @generated
 */
public interface ExternalSenderOperation extends EventLinkSender {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.implementation._2.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see edtimplementation.EdtimplementationPackage#getExternalSenderOperation_Language()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link edtimplementation.ExternalSenderOperation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ExternalSenderOperation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link edtimplementation.ExternalSenderOperation#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	boolean isSetLanguage();

} // ExternalSenderOperation
