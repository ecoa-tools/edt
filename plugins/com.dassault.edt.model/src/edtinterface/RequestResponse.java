/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtinterface.RequestResponse#getInput <em>Input</em>}</li>
 *   <li>{@link edtinterface.RequestResponse#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getRequestResponse()
 * @model
 * @generated
 */
public interface RequestResponse extends OperationType {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edtinterface.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edtinterface.EDTInterfacePackage#getRequestResponse_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link edtinterface.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see edtinterface.EDTInterfacePackage#getRequestResponse_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOutput();

} // RequestResponse
