/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Step3#getInitialAssembly <em>Initial Assembly</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep3()
 * @model
 * @generated
 */
public interface Step3 extends Step {
	/**
	 * Returns the value of the '<em><b>Initial Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Assembly</em>' containment reference.
	 * @see #setInitialAssembly(Composite)
	 * @see edtproject.EDTProjectPackage#getStep3_InitialAssembly()
	 * @model containment="true"
	 * @generated
	 */
	Composite getInitialAssembly();

	/**
	 * Sets the value of the '{@link edtproject.Step3#getInitialAssembly <em>Initial Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Assembly</em>' containment reference.
	 * @see #getInitialAssembly()
	 * @generated
	 */
	void setInitialAssembly(Composite value);

} // Step3
