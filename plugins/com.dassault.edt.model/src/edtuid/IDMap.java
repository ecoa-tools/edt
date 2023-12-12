/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>ID
 * Map</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtuid.IDMap#getName <em>Name</em>}</li>
 * <li>{@link edtuid.IDMap#getIDs <em>IDs</em>}</li>
 * </ul>
 *
 * @see edtuid.EdtuidPackage#getIDMap()
 * @model
 * @generated
 */
public interface IDMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtuid.EdtuidPackage#getIDMap_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtuid.IDMap#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>IDs</b></em>' containment reference list.
	 * The list contents are of type {@link edtuid.ID}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>IDs</em>' containment reference list.
	 * @see edtuid.EdtuidPackage#getIDMap_IDs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ID> getIDs();

} // IDMap
