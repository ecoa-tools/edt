/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Memory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.AvailableMemoryType#getGigaBytes <em>Giga Bytes</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getAvailableMemoryType()
 * @model extendedMetaData="name='availableMemory_._type' kind='empty'"
 * @generated
 */
public interface AvailableMemoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Giga Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Giga Bytes</em>' attribute.
	 * @see #setGigaBytes(BigInteger)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getAvailableMemoryType_GigaBytes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='gigaBytes'"
	 * @generated
	 */
	BigInteger getGigaBytes();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.AvailableMemoryType#getGigaBytes <em>Giga Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Giga Bytes</em>' attribute.
	 * @see #getGigaBytes()
	 * @generated
	 */
	void setGigaBytes(BigInteger value);

} // AvailableMemoryType
