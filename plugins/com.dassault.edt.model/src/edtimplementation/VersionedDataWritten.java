/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Data Written</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.VersionedDataWritten#isWriteOnly <em>Write Only</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getVersionedDataWritten()
 * @model
 * @generated
 */
public interface VersionedDataWritten extends VersionedDataType {
	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #isSetWriteOnly()
	 * @see #unsetWriteOnly()
	 * @see #setWriteOnly(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getVersionedDataWritten_WriteOnly()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link edtimplementation.VersionedDataWritten#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isSetWriteOnly()
	 * @see #unsetWriteOnly()
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.VersionedDataWritten#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteOnly()
	 * @see #isWriteOnly()
	 * @see #setWriteOnly(boolean)
	 * @generated
	 */
	void unsetWriteOnly();

	/**
	 * Returns whether the value of the '{@link edtimplementation.VersionedDataWritten#isWriteOnly <em>Write Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Only</em>' attribute is set.
	 * @see #unsetWriteOnly()
	 * @see #isWriteOnly()
	 * @see #setWriteOnly(boolean)
	 * @generated
	 */
	boolean isSetWriteOnly();

} // VersionedDataWritten
