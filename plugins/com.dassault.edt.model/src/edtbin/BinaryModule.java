/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtimplementation.ModuleImplementation;
import technology.ecoa.bin.desc._2.BinaryDependency;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binary
 * Module</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtbin.BinaryModule#getBinaryDependencies <em>Binary
 * Dependencies</em>}</li>
 * <li>{@link edtbin.BinaryModule#getChecksum <em>Checksum</em>}</li>
 * <li>{@link edtbin.BinaryModule#getHeapSize <em>Heap Size</em>}</li>
 * <li>{@link edtbin.BinaryModule#getObject <em>Object</em>}</li>
 * <li>{@link edtbin.BinaryModule#getStackSize <em>Stack Size</em>}</li>
 * <li>{@link edtbin.BinaryModule#getUserContextSize <em>User Context
 * Size</em>}</li>
 * <li>{@link edtbin.BinaryModule#getWarmStartContextSize <em>Warm Start Context
 * Size</em>}</li>
 * <li>{@link edtbin.BinaryModule#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see edtbin.EdtbinPackage#getBinaryModule()
 * @model
 * @generated
 */
public interface BinaryModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Dependencies</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link technology.ecoa.bin.desc._2.BinaryDependency}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binary Dependencies</em>' containment reference
	 *         list.
	 * @see edtbin.EdtbinPackage#getBinaryModule_BinaryDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryDependency> getBinaryDependencies();

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_Checksum()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getChecksum
	 * <em>Checksum</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

	/**
	 * Returns the value of the '<em><b>Heap Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Heap Size</em>' attribute.
	 * @see #setHeapSize(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_HeapSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 * @generated
	 */
	String getHeapSize();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getHeapSize <em>Heap
	 * Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Heap Size</em>' attribute.
	 * @see #getHeapSize()
	 * @generated
	 */
	void setHeapSize(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_Object()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getObject <em>Object</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stack Size</em>' attribute.
	 * @see #setStackSize(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_StackSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 * @generated
	 */
	String getStackSize();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getStackSize <em>Stack
	 * Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Stack Size</em>' attribute.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(String value);

	/**
	 * Returns the value of the '<em><b>User Context Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>User Context Size</em>' attribute.
	 * @see #setUserContextSize(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_UserContextSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 * @generated
	 */
	String getUserContextSize();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getUserContextSize <em>User
	 * Context Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>User Context Size</em>' attribute.
	 * @see #getUserContextSize()
	 * @generated
	 */
	void setUserContextSize(String value);

	/**
	 * Returns the value of the '<em><b>Warm Start Context Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Warm Start Context Size</em>' attribute.
	 * @see #setWarmStartContextSize(String)
	 * @see edtbin.EdtbinPackage#getBinaryModule_WarmStartContextSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 * @generated
	 */
	String getWarmStartContextSize();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getWarmStartContextSize
	 * <em>Warm Start Context Size</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Warm Start Context Size</em>'
	 *              attribute.
	 * @see #getWarmStartContextSize()
	 * @generated
	 */
	void setWarmStartContextSize(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ModuleImplementation)
	 * @see edtbin.EdtbinPackage#getBinaryModule_Reference()
	 * @model required="true"
	 * @generated
	 */
	ModuleImplementation getReference();

	/**
	 * Sets the value of the '{@link edtbin.BinaryModule#getReference
	 * <em>Reference</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ModuleImplementation value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // BinaryModule
