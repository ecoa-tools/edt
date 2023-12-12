/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.VersionedData#getMaxVersions <em>Max Versions</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.VersionedData#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.VersionedData#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getVersionedData()
 * @model extendedMetaData="name='VersionedData' kind='empty'"
 * @generated
 */
public interface VersionedData extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Versions</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of versions accessed at the same
	 *           time.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Versions</em>' attribute.
	 * @see #isSetMaxVersions()
	 * @see #unsetMaxVersions()
	 * @see #setMaxVersions(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getVersionedData_MaxVersions()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maxVersions'"
	 * @generated
	 */
	BigInteger getMaxVersions();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.VersionedData#getMaxVersions <em>Max Versions</em>}' attribute.
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
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.VersionedData#getMaxVersions <em>Max Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxVersions()
	 * @see #getMaxVersions()
	 * @see #setMaxVersions(BigInteger)
	 * @generated
	 */
	void unsetMaxVersions();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.VersionedData#getMaxVersions <em>Max Versions</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getVersionedData_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.VersionedData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type stored by the versioned data.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.implementation._2.impPackage#getVersionedData_Type()
	 * @model dataType="technology.ecoa.implementation._2.TypeQName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.VersionedData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // VersionedData
