/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Link Activating To Reference Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getClient <em>Client</em>}</li>
 *   <li>{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getServer <em>Server</em>}</li>
 *   <li>{@link edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating <em>Client Activating</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatingToReferenceOperation()
 * @model
 * @generated
 */
public interface RequestLinkActivatingToReferenceOperation extends RequestLink {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(RequestClientInstance)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatingToReferenceOperation_Client()
	 * @model required="true"
	 * @generated
	 */
	RequestClientInstance getClient();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(RequestClientInstance value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(RequestReferenceInstance)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatingToReferenceOperation_Server()
	 * @model required="true"
	 * @generated
	 */
	RequestReferenceInstance getServer();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(RequestReferenceInstance value);

	/**
	 * Returns the value of the '<em><b>Client Activating</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Activating</em>' attribute.
	 * @see #isSetClientActivating()
	 * @see #unsetClientActivating()
	 * @see #setClientActivating(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatingToReferenceOperation_ClientActivating()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isClientActivating();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating <em>Client Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Activating</em>' attribute.
	 * @see #isSetClientActivating()
	 * @see #unsetClientActivating()
	 * @see #isClientActivating()
	 * @generated
	 */
	void setClientActivating(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating <em>Client Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientActivating()
	 * @see #isClientActivating()
	 * @see #setClientActivating(boolean)
	 * @generated
	 */
	void unsetClientActivating();

	/**
	 * Returns whether the value of the '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating <em>Client Activating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Activating</em>' attribute is set.
	 * @see #unsetClientActivating()
	 * @see #isClientActivating()
	 * @see #setClientActivating(boolean)
	 * @generated
	 */
	boolean isSetClientActivating();

} // RequestLinkActivatingToReferenceOperation
