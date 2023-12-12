/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Union</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Union#getComment <em>Comment</em>}</li>
 *   <li>{@link edttype.Union#getName <em>Name</em>}</li>
 *   <li>{@link edttype.Union#getWhen <em>When</em>}</li>
 *   <li>{@link edttype.Union#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see edttype.EDTTypePackage#getUnion_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link edttype.Union#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see edttype.EDTTypePackage#getUnion_Name()
	 * @model dataType="technology.ecoa.types._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edttype.Union#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(String)
	 * @see edttype.EDTTypePackage#getUnion_When()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getWhen();

	/**
	 * Sets the value of the '{@link edttype.Union#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getUnion_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Sets the value of the '{@link edttype.Union#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

	/**
	 * 
	 * @return true if all the required fields are filled
	 */
	boolean isComplete();

} // Union
