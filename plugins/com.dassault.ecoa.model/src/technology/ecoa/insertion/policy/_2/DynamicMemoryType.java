/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Memory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getDynamicMemoryType()
 * @model extendedMetaData="name='dynamicMemory_._type' kind='empty'"
 * @generated
 */
public interface DynamicMemoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.AllocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the module allocate dynamically ?
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @see #isSetAllocation()
	 * @see #unsetAllocation()
	 * @see #setAllocation(AllocationType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDynamicMemoryType_Allocation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='allocation'"
	 * @generated
	 */
	AllocationType getAllocation();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @see #isSetAllocation()
	 * @see #unsetAllocation()
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(AllocationType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllocation()
	 * @see #getAllocation()
	 * @see #setAllocation(AllocationType)
	 * @generated
	 */
	void unsetAllocation();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation <em>Allocation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allocation</em>' attribute is set.
	 * @see #unsetAllocation()
	 * @see #getAllocation()
	 * @see #setAllocation(AllocationType)
	 * @generated
	 */
	boolean isSetAllocation();

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max size of the dynamic memory in bytes
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(BigInteger)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDynamicMemoryType_MaxSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='maxSize'"
	 * @generated
	 */
	BigInteger getMaxSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(BigInteger value);

} // DynamicMemoryType
