/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.uid._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.uid._2.IDMap#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.uid._2.uidPackage#getIDMap()
 * @model extendedMetaData="name='ID_map' kind='elementOnly'"
 * @generated
 */
public interface IDMap extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.uid._2.ID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' containment reference list.
	 * @see technology.ecoa.uid._2.uidPackage#getIDMap_ID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ID> getID();

} // IDMap
