/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.OperationLink#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getOperationLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see edtimplementation.EdtimplementationPackage#getOperationLink_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link edtimplementation.OperationLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link edtimplementation.OperationLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link edtimplementation.OperationLink#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

} // OperationLink
