/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.RegisterSize#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getRegisterSize()
 * @model extendedMetaData="name='RegisterSize' kind='empty'"
 * @generated
 */
public interface RegisterSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.SizeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Register size in bits
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(SizeType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getRegisterSize_Size()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	SizeType getSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.RegisterSize#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(SizeType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.RegisterSize#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(SizeType)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.RegisterSize#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(SizeType)
	 * @generated
	 */
	boolean isSetSize();

} // RegisterSize
