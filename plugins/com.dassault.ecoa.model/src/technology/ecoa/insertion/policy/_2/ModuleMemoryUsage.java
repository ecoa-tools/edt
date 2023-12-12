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
 * A representation of the model object '<em><b>Module Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information on module memory usage
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getUserContextSize <em>User Context Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getWarmStartContextSize <em>Warm Start Context Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getDynamicMemory <em>Dynamic Memory</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getHeapSize <em>Heap Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage()
 * @model extendedMetaData="name='ModuleMemoryUsage' kind='elementOnly'"
 * @generated
 */
public interface ModuleMemoryUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>User Context Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User context size in bytes
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Context Size</em>' containment reference.
	 * @see #setUserContextSize(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_UserContextSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userContextSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUserContextSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getUserContextSize <em>User Context Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Context Size</em>' containment reference.
	 * @see #getUserContextSize()
	 * @generated
	 */
	void setUserContextSize(EObject value);

	/**
	 * Returns the value of the '<em><b>Warm Start Context Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warm start context size in bytes
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warm Start Context Size</em>' containment reference.
	 * @see #setWarmStartContextSize(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_WarmStartContextSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='warmStartContextSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getWarmStartContextSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getWarmStartContextSize <em>Warm Start Context Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warm Start Context Size</em>' containment reference.
	 * @see #getWarmStartContextSize()
	 * @generated
	 */
	void setWarmStartContextSize(EObject value);

	/**
	 * Returns the value of the '<em><b>Dynamic Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about dynamic memory allocation
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Memory</em>' containment reference.
	 * @see #setDynamicMemory(DynamicMemoryType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_DynamicMemory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dynamicMemory' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicMemoryType getDynamicMemory();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getDynamicMemory <em>Dynamic Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Memory</em>' containment reference.
	 * @see #getDynamicMemory()
	 * @generated
	 */
	void setDynamicMemory(DynamicMemoryType value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max stack size in bytes
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stack Size</em>' containment reference.
	 * @see #setStackSize(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_StackSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stackSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStackSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getStackSize <em>Stack Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Size</em>' containment reference.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(EObject value);

	/**
	 * Returns the value of the '<em><b>Heap Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max heap size in bytes
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size</em>' containment reference.
	 * @see #setHeapSize(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_HeapSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='heapSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getHeapSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getHeapSize <em>Heap Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size</em>' containment reference.
	 * @see #getHeapSize()
	 * @generated
	 */
	void setHeapSize(EObject value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Reference to a module instance name
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleMemoryUsage_InstanceName()
	 * @model dataType="technology.ecoa.insertion.policy._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

} // ModuleMemoryUsage
