/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

import edtinterface.OperationType;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Inheriting From SD</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtimplementation.OperationInheritingFromSD#getSDOperationRef
 * <em>SD Operation Ref</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getOperationInheritingFromSD()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationInheritingFromSD extends EObject {
	/**
	 * Returns the value of the '<em><b>SD Operation Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>SD Operation Ref</em>' reference.
	 * @see #setSDOperationRef(OperationType)
	 * @see edtimplementation.EdtimplementationPackage#getOperationInheritingFromSD_SDOperationRef()
	 * @model required="true"
	 * @generated
	 */
	OperationType getSDOperationRef();

	/**
	 * Sets the value of the
	 * '{@link edtimplementation.OperationInheritingFromSD#getSDOperationRef <em>SD
	 * Operation Ref</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>SD Operation Ref</em>' reference.
	 * @see #getSDOperationRef()
	 * @generated
	 */
	void setSDOperationRef(OperationType value);

} // OperationInheritingFromSD
