/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.RequestResponseType#getInput <em>Input</em>}</li>
 *   <li>{@link edtimplementation.RequestResponseType#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getRequestResponseType()
 * @model
 * @generated
 */
public interface RequestResponseType extends ModuleOperation {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getRequestResponseType_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getRequestResponseType_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOutput();

} // RequestResponseType
