/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.DataLink#isControlled <em>Controlled</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getDataLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataLink extends OperationLink {
	/**
	 * Returns the value of the '<em><b>Controlled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled</em>' attribute.
	 * @see #isSetControlled()
	 * @see #unsetControlled()
	 * @see #setControlled(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getDataLink_Controlled()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isControlled();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLink#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled</em>' attribute.
	 * @see #isSetControlled()
	 * @see #unsetControlled()
	 * @see #isControlled()
	 * @generated
	 */
	void setControlled(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.DataLink#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlled()
	 * @see #isControlled()
	 * @see #setControlled(boolean)
	 * @generated
	 */
	void unsetControlled();

	/**
	 * Returns whether the value of the '{@link edtimplementation.DataLink#isControlled <em>Controlled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controlled</em>' attribute is set.
	 * @see #unsetControlled()
	 * @see #isControlled()
	 * @see #setControlled(boolean)
	 * @generated
	 */
	boolean isSetControlled();

} // DataLink
