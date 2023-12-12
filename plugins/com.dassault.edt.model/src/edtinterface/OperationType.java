/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtinterface.OperationType#getComment <em>Comment</em>}</li>
 * <li>{@link edtinterface.OperationType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtinterface.EDTInterfacePackage#getOperationType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see edtinterface.EDTInterfacePackage#getOperationType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link edtinterface.OperationType#getComment
	 * <em>Comment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtinterface.EDTInterfacePackage#getOperationType_Name()
	 * @model dataType="technology.ecoa.interface_._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtinterface.OperationType#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean nameIsUnique(DiagnosticChain chain, Map<?, ?> context);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // OperationType
