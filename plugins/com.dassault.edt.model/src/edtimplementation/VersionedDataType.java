/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import edttype.EDTDataType;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.VersionedDataType#getMaxVersions <em>Max Versions</em>}</li>
 *   <li>{@link edtimplementation.VersionedDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getVersionedDataType()
 * @model
 * @generated
 */
public interface VersionedDataType extends ModuleOperation {
	/**
	 * Returns the value of the '<em><b>Max Versions</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Versions</em>' attribute.
	 * @see #isSetMaxVersions()
	 * @see #unsetMaxVersions()
	 * @see #setMaxVersions(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getVersionedDataType_MaxVersions()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getMaxVersions();

	/**
	 * Sets the value of the '{@link edtimplementation.VersionedDataType#getMaxVersions <em>Max Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Versions</em>' attribute.
	 * @see #isSetMaxVersions()
	 * @see #unsetMaxVersions()
	 * @see #getMaxVersions()
	 * @generated
	 */
	void setMaxVersions(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.VersionedDataType#getMaxVersions <em>Max Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxVersions()
	 * @see #getMaxVersions()
	 * @see #setMaxVersions(BigInteger)
	 * @generated
	 */
	void unsetMaxVersions();

	/**
	 * Returns whether the value of the '{@link edtimplementation.VersionedDataType#getMaxVersions <em>Max Versions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Versions</em>' attribute is set.
	 * @see #unsetMaxVersions()
	 * @see #getMaxVersions()
	 * @see #setMaxVersions(BigInteger)
	 * @generated
	 */
	boolean isSetMaxVersions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edtimplementation.EdtimplementationPackage#getVersionedDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edtimplementation.VersionedDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

} // VersionedDataType
