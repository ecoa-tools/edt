/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import technology.ecoa.implementation._2.ProgrammingLanguage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Implementation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleImplementation#getLanguage <em>Language</em>}</li>
 *   <li>{@link edtimplementation.ModuleImplementation#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.ModuleImplementation#getModuleType <em>Module Type</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleImplementation()
 * @model
 * @generated
 */
public interface ModuleImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute. The literals
	 * are from the enumeration
	 * {@link technology.ecoa.implementation._2.ProgrammingLanguage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see edtimplementation.EdtimplementationPackage#getModuleImplementation_Language()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleImplementation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ModuleImplementation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link edtimplementation.ModuleImplementation#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getModuleImplementation_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Type</em>' reference.
	 * @see #setModuleType(ModuleType)
	 * @see edtimplementation.EdtimplementationPackage#getModuleImplementation_ModuleType()
	 * @model required="true"
	 * @generated
	 */
	ModuleType getModuleType();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleImplementation#getModuleType <em>Module Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Type</em>' reference.
	 * @see #getModuleType()
	 * @generated
	 */
	void setModuleType(ModuleType value);

	/**
	 * Find module instances referencing this ModuleImplementation
	 * 
	 * @return list of ModuleInstances
	 */
	public EList<ModuleInstance> findAssociatedModuleInstance();

	/**
	 * 
	 * @return true if no missing elements
	 */
	boolean isComplete();

} // ModuleImplementation
