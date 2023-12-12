/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageRuntime <em>Language Runtime</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageLibraries <em>Language Libraries</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getDirectOSAccess <em>Direct OS Access</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getModuleCompilationOptions <em>Module Compilation Options</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies()
 * @model extendedMetaData="name='ModuleDependencies' kind='elementOnly'"
 * @generated
 */
public interface ModuleDependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Language Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Programming language used for developing the module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Runtime</em>' containment reference.
	 * @see #setLanguageRuntime(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies_LanguageRuntime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='languageRuntime' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLanguageRuntime();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageRuntime <em>Language Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Runtime</em>' containment reference.
	 * @see #getLanguageRuntime()
	 * @generated
	 */
	void setLanguageRuntime(EObject value);

	/**
	 * Returns the value of the '<em><b>Language Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libraries
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Libraries</em>' containment reference.
	 * @see #setLanguageLibraries(LanguageLibraries)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies_LanguageLibraries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='languageLibraries' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageLibraries getLanguageLibraries();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageLibraries <em>Language Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Libraries</em>' containment reference.
	 * @see #getLanguageLibraries()
	 * @generated
	 */
	void setLanguageLibraries(LanguageLibraries value);

	/**
	 * Returns the value of the '<em><b>Direct OS Access</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.OSAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Underlying OS Standard
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct OS Access</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies_DirectOSAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directOSAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OSAPIType> getDirectOSAccess();

	/**
	 * Returns the value of the '<em><b>Module Compilation Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Module specific compilation options
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Compilation Options</em>' containment reference.
	 * @see #setModuleCompilationOptions(ModuleCompilationOptions)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies_ModuleCompilationOptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleCompilationOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleCompilationOptions getModuleCompilationOptions();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getModuleCompilationOptions <em>Module Compilation Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Compilation Options</em>' containment reference.
	 * @see #getModuleCompilationOptions()
	 * @generated
	 */
	void setModuleCompilationOptions(ModuleCompilationOptions value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Reference to the module instance
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleDependencies_InstanceName()
	 * @model dataType="technology.ecoa.insertion.policy._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

} // ModuleDependencies
