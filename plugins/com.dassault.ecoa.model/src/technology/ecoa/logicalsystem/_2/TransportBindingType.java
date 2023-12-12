/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.TransportBindingType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.TransportBindingType#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getTransportBindingType()
 * @model extendedMetaData="name='transportBinding_._type' kind='empty'"
 * @generated
 */
public interface TransportBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getTransportBindingType_Parameters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='parameters'"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.TransportBindingType#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getTransportBindingType_Protocol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.TransportBindingType#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // TransportBindingType
