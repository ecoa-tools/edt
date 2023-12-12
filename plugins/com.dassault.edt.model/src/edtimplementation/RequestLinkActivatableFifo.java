/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Link Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.RequestLinkActivatableFifo#getClient <em>Client</em>}</li>
 *   <li>{@link edtimplementation.RequestLinkActivatableFifo#getServer <em>Server</em>}</li>
 *   <li>{@link edtimplementation.RequestLinkActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.RequestLinkActivatableFifo#isServerActivating <em>Server Activating</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatableFifo()
 * @model
 * @generated
 */
public interface RequestLinkActivatableFifo extends RequestLink {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(RequestServiceInstance)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatableFifo_Client()
	 * @model required="true"
	 * @generated
	 */
	RequestServiceInstance getClient();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(RequestServiceInstance value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(RequestServerInstance)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatableFifo_Server()
	 * @model required="true"
	 * @generated
	 */
	RequestServerInstance getServer();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(RequestServerInstance value);

	/**
	 * Returns the value of the '<em><b>Server Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Fifo Size</em>' attribute.
	 * @see #isSetServerFifoSize()
	 * @see #unsetServerFifoSize()
	 * @see #setServerFifoSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatableFifo_ServerFifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getServerFifoSize();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Fifo Size</em>' attribute.
	 * @see #isSetServerFifoSize()
	 * @see #unsetServerFifoSize()
	 * @see #getServerFifoSize()
	 * @generated
	 */
	void setServerFifoSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerFifoSize()
	 * @see #getServerFifoSize()
	 * @see #setServerFifoSize(BigInteger)
	 * @generated
	 */
	void unsetServerFifoSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.RequestLinkActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Fifo Size</em>' attribute is set.
	 * @see #unsetServerFifoSize()
	 * @see #getServerFifoSize()
	 * @see #setServerFifoSize(BigInteger)
	 * @generated
	 */
	boolean isSetServerFifoSize();

	/**
	 * Returns the value of the '<em><b>Server Activating</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Activating</em>' attribute.
	 * @see #isSetServerActivating()
	 * @see #unsetServerActivating()
	 * @see #setServerActivating(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getRequestLinkActivatableFifo_ServerActivating()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isServerActivating();

	/**
	 * Sets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#isServerActivating <em>Server Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Activating</em>' attribute.
	 * @see #isSetServerActivating()
	 * @see #unsetServerActivating()
	 * @see #isServerActivating()
	 * @generated
	 */
	void setServerActivating(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.RequestLinkActivatableFifo#isServerActivating <em>Server Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerActivating()
	 * @see #isServerActivating()
	 * @see #setServerActivating(boolean)
	 * @generated
	 */
	void unsetServerActivating();

	/**
	 * Returns whether the value of the '{@link edtimplementation.RequestLinkActivatableFifo#isServerActivating <em>Server Activating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Activating</em>' attribute is set.
	 * @see #unsetServerActivating()
	 * @see #isServerActivating()
	 * @see #setServerActivating(boolean)
	 * @generated
	 */
	boolean isSetServerActivating();

} // RequestLinkActivatableFifo
