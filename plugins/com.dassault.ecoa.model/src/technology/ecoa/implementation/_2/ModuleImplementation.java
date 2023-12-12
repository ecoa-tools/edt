/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ModuleImplementation#getLanguage <em>Language</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleImplementation#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleImplementation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getModuleImplementation()
 * @model extendedMetaData="name='ModuleImplementation' kind='empty'"
 * @generated
 */
public interface ModuleImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.implementation._2.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Programming language
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleImplementation_Language()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleImplementation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.ModuleImplementation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.ModuleImplementation#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Type</em>' attribute.
	 * @see #setModuleType(String)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleImplementation_ModuleType()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='moduleType'"
	 * @generated
	 */
	String getModuleType();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleImplementation#getModuleType <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Type</em>' attribute.
	 * @see #getModuleType()
	 * @generated
	 */
	void setModuleType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleImplementation_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModuleImplementation
