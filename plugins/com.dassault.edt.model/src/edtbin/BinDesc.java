/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bin
 * Desc</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtbin.BinDesc#getBinaryModules <em>Binary Modules</em>}</li>
 * <li>{@link edtbin.BinDesc#getInsertionPolicy <em>Insertion Policy</em>}</li>
 * <li>{@link edtbin.BinDesc#getProcessorTargetType <em>Processor Target
 * Type</em>}</li>
 * <li>{@link edtbin.BinDesc#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see edtbin.EdtbinPackage#getBinDesc()
 * @model
 * @generated
 */
public interface BinDesc extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Modules</b></em>' containment
	 * reference list. The list contents are of type {@link edtbin.BinaryModule}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binary Modules</em>' containment reference
	 *         list.
	 * @see edtbin.EdtbinPackage#getBinDesc_BinaryModules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BinaryModule> getBinaryModules();

	/**
	 * Returns the value of the '<em><b>Insertion Policy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Insertion Policy</em>' attribute.
	 * @see #setInsertionPolicy(String)
	 * @see edtbin.EdtbinPackage#getBinDesc_InsertionPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getInsertionPolicy();

	/**
	 * Sets the value of the '{@link edtbin.BinDesc#getInsertionPolicy <em>Insertion
	 * Policy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Insertion Policy</em>' attribute.
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	void setInsertionPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Processor Target Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Processor Target Type</em>' attribute.
	 * @see #setProcessorTargetType(String)
	 * @see edtbin.EdtbinPackage#getBinDesc_ProcessorTargetType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getProcessorTargetType();

	/**
	 * Sets the value of the '{@link edtbin.BinDesc#getProcessorTargetType
	 * <em>Processor Target Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Processor Target Type</em>' attribute.
	 * @see #getProcessorTargetType()
	 * @generated
	 */
	void setProcessorTargetType(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see edtbin.EdtbinPackage#getBinDesc_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link edtbin.BinDesc#getFileName <em>File Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	boolean isComplete();

} // BinDesc
