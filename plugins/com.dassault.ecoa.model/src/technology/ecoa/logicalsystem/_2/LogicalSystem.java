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
 * A representation of the model object '<em><b>Logical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatform <em>Logical Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalSystem#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalSystem()
 * @model extendedMetaData="name='LogicalSystem' kind='elementOnly'"
 * @generated
 */
public interface LogicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Computing Platform</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Computing Platform</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalSystem_LogicalComputingPlatform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logicalComputingPlatform'"
	 * @generated
	 */
	EList<LogicalComputingPlatform> getLogicalComputingPlatform();

	/**
	 * Returns the value of the '<em><b>Logical Computing Platform Links</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Computing Platform Links</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalSystem_LogicalComputingPlatformLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logicalComputingPlatformLinks'"
	 * @generated
	 */
	EList<LogicalComputingPlatformLinks> getLogicalComputingPlatformLinks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalSystem_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalSystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LogicalSystem
