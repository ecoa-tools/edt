/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Computing Node Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeLinks()
 * @model extendedMetaData="name='LogicalComputingNodeLinks' kind='elementOnly'"
 * @generated
 */
public interface LogicalComputingNodeLinks extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LinkType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeLinks_Link()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='link'"
	 * @generated
	 */
	EList<LinkType1> getLink();

} // LogicalComputingNodeLinks
