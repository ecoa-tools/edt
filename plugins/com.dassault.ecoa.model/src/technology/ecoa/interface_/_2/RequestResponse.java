/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use of the "request-response" exchange
 *         mechanism.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.RequestResponse#getInput <em>Input</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.RequestResponse#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_._2.interPackage#getRequestResponse()
 * @model extendedMetaData="name='RequestResponse' kind='elementOnly'"
 * @generated
 */
public interface RequestResponse extends Operation {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_._2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see technology.ecoa.interface_._2.interPackage#getRequestResponse_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_._2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see technology.ecoa.interface_._2.interPackage#getRequestResponse_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getOutput();

} // RequestResponse
