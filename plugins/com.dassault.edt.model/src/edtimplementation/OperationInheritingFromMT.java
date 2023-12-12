/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Inheriting From MT</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtimplementation.OperationInheritingFromMT#getMTOperationRef
 * <em>MT Operation Ref</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getOperationInheritingFromMT()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationInheritingFromMT extends EObject {
	/**
	 * Returns the value of the '<em><b>MT Operation Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>MT Operation Ref</em>' reference.
	 * @see #setMTOperationRef(ModuleOperation)
	 * @see edtimplementation.EdtimplementationPackage#getOperationInheritingFromMT_MTOperationRef()
	 * @model required="true"
	 * @generated
	 */
	ModuleOperation getMTOperationRef();

	/**
	 * Sets the value of the
	 * '{@link edtimplementation.OperationInheritingFromMT#getMTOperationRef <em>MT
	 * Operation Ref</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>MT Operation Ref</em>' reference.
	 * @see #getMTOperationRef()
	 * @generated
	 */
	void setMTOperationRef(ModuleOperation value);

} // OperationInheritingFromMT
