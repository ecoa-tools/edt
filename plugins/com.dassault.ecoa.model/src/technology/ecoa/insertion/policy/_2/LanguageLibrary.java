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
 * A representation of the model object '<em><b>Language Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getType <em>Type</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibrary()
 * @model extendedMetaData="name='LanguageLibrary' kind='empty'"
 * @generated
 */
public interface LanguageLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the library
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibrary_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.TypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of library
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType1)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibrary_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic version number of the library
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getLanguageLibrary_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // LanguageLibrary
