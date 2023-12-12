/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Logical
 * System</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtlogical.LogicalSystem#getFileNamePrefix <em>File Name Prefix</em>}</li>
 *   <li>{@link edtlogical.LogicalSystem#getLogicalComputingPlatforms <em>Logical Computing Platforms</em>}</li>
 *   <li>{@link edtlogical.LogicalSystem#getLogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}</li>
 *   <li>{@link edtlogical.LogicalSystem#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edtlogical.EdtlogicalPackage#getLogicalSystem()
 * @model
 * @generated
 */
public interface LogicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Name Prefix</em>' attribute.
	 * @see #setFileNamePrefix(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalSystem_FileNamePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFileNamePrefix();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalSystem#getFileNamePrefix <em>File Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>File Name Prefix</em>' attribute.
	 * @see #getFileNamePrefix()
	 * @generated
	 */
	void setFileNamePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Logical Computing Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link edtlogical.LogicalComputingPlatform}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Logical Computing Platforms</em>' containment reference list.
	 * @see edtlogical.EdtlogicalPackage#getLogicalSystem_LogicalComputingPlatforms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LogicalComputingPlatform> getLogicalComputingPlatforms();

	/**
	 * Returns the value of the '<em><b>Logical Computing Platform Links</b></em>' containment reference list.
	 * The list contents are of type {@link edtlogical.LogicalComputingPlatformLink}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Logical Computing Platform Links</em>' containment reference list.
	 * @see edtlogical.EdtlogicalPackage#getLogicalSystem_LogicalComputingPlatformLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalComputingPlatformLink> getLogicalComputingPlatformLinks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalSystem_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalSystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Find LogicalComputingPlatform by Name
	 *
	 * @param logicalComputingPlatformId : name of LogicalComputingPlatform to find
	 * @return LogicalComputingPlatform found
	 */
	public edtlogical.LogicalComputingPlatform findLogicalComputingPlatformById(String logicalComputingPlatformId);

	/**
	 * Find LogicalComputingPlatformLink by Name
	 *
	 * @param logicalComputingPlatformLinkId : name of LogicalComputingPlatform to
	 *                                       find
	 * @return LogicalComputingPlatformLink found
	 */
	LogicalComputingPlatformLink findLogicalComputingPlatformLinkById(String logicalComputingPlatformLinkId);

} // LogicalSystem
