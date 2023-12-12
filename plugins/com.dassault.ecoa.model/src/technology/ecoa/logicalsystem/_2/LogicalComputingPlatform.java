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
 * A representation of the model object '<em><b>Logical Computing Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNode <em>Logical Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNodeLinks <em>Logical Computing Node Links</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingPlatform()
 * @model extendedMetaData="name='LogicalComputingPlatform' kind='elementOnly'"
 * @generated
 */
public interface LogicalComputingPlatform extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Computing Node</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Computing Node</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingPlatform_LogicalComputingNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logicalComputingNode'"
	 * @generated
	 */
	EList<LogicalComputingNodeType> getLogicalComputingNode();

	/**
	 * Returns the value of the '<em><b>Logical Computing Node Links</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Computing Node Links</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingPlatform_LogicalComputingNodeLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logicalComputingNodeLinks'"
	 * @generated
	 */
	EList<LogicalComputingNodeLinks> getLogicalComputingNodeLinks();

	/**
	 * Returns the value of the '<em><b>ELI Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Define the Id to be used as Logical ELI Platform ID
	 *           in the ELI generic header
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ELI Platform Id</em>' attribute.
	 * @see #isSetELIPlatformId()
	 * @see #unsetELIPlatformId()
	 * @see #setELIPlatformId(long)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingPlatform_ELIPlatformId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='ELIPlatformId'"
	 * @generated
	 */
	long getELIPlatformId();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELI Platform Id</em>' attribute.
	 * @see #isSetELIPlatformId()
	 * @see #unsetELIPlatformId()
	 * @see #getELIPlatformId()
	 * @generated
	 */
	void setELIPlatformId(long value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetELIPlatformId()
	 * @see #getELIPlatformId()
	 * @see #setELIPlatformId(long)
	 * @generated
	 */
	void unsetELIPlatformId();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ELI Platform Id</em>' attribute is set.
	 * @see #unsetELIPlatformId()
	 * @see #getELIPlatformId()
	 * @see #setELIPlatformId(long)
	 * @generated
	 */
	boolean isSetELIPlatformId();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingPlatform_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LogicalComputingPlatform
