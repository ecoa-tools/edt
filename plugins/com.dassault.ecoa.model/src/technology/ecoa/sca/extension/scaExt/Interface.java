/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.Interface#getQos <em>Qos</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.Interface#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInterface()
 * @model extendedMetaData="name='Interface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends org.open.oasis.docs.ns.opencsa.sca.sca.Interface {
	/**
	 * Returns the value of the '<em><b>Qos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos</em>' attribute.
	 * @see #setQos(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInterface_Qos()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='qos'"
	 * @generated
	 */
	String getQos();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.Interface#getQos <em>Qos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qos</em>' attribute.
	 * @see #getQos()
	 * @generated
	 */
	void setQos(String value);

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' attribute.
	 * @see #setSyntax(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInterface_Syntax()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='syntax'"
	 * @generated
	 */
	String getSyntax();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.Interface#getSyntax <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' attribute.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(String value);

} // Interface
