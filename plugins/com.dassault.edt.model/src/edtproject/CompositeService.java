/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.CompositeService#getPromote <em>Promote</em>}</li>
 *   <li>{@link edtproject.CompositeService#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getCompositeService()
 * @model
 * @generated
 */
public interface CompositeService extends Contract {
	/**
	 * Returns the value of the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' attribute.
	 * @see #setPromote(String)
	 * @see edtproject.EDTProjectPackage#getCompositeService_Promote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getPromote();

	/**
	 * Sets the value of the '{@link edtproject.CompositeService#getPromote <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' attribute.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getCompositeService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.CompositeService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CompositeService
