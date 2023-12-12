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
 * A representation of the model object '<em><b>Logical Computing Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getEndianess <em>Endianess</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getLogicalProcessors <em>Logical Processors</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getOs <em>Os</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getModuleSwitchTime <em>Module Switch Time</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType()
 * @model extendedMetaData="name='logicalComputingNode_._type' kind='elementOnly'"
 * @generated
 */
public interface LogicalComputingNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Endianess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endianess</em>' containment reference.
	 * @see #setEndianess(EndianessType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_Endianess()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endianess'"
	 * @generated
	 */
	EndianessType getEndianess();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getEndianess <em>Endianess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianess</em>' containment reference.
	 * @see #getEndianess()
	 * @generated
	 */
	void setEndianess(EndianessType value);

	/**
	 * Returns the value of the '<em><b>Logical Processors</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.logicalsystem._2.LogicalProcessorsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Processors</em>' containment reference list.
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_LogicalProcessors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logicalProcessors'"
	 * @generated
	 */
	EList<LogicalProcessorsType> getLogicalProcessors();

	/**
	 * Returns the value of the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' containment reference.
	 * @see #setOs(OsType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_Os()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='os'"
	 * @generated
	 */
	OsType getOs();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getOs <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' containment reference.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OsType value);

	/**
	 * Returns the value of the '<em><b>Available Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Memory</em>' containment reference.
	 * @see #setAvailableMemory(AvailableMemoryType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_AvailableMemory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='availableMemory'"
	 * @generated
	 */
	AvailableMemoryType getAvailableMemory();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getAvailableMemory <em>Available Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Memory</em>' containment reference.
	 * @see #getAvailableMemory()
	 * @generated
	 */
	void setAvailableMemory(AvailableMemoryType value);

	/**
	 * Returns the value of the '<em><b>Module Switch Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Switch Time</em>' containment reference.
	 * @see #setModuleSwitchTime(ModuleSwitchTimeType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_ModuleSwitchTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleSwitchTime'"
	 * @generated
	 */
	ModuleSwitchTimeType getModuleSwitchTime();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getModuleSwitchTime <em>Module Switch Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Switch Time</em>' containment reference.
	 * @see #getModuleSwitchTime()
	 * @generated
	 */
	void setModuleSwitchTime(ModuleSwitchTimeType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLogicalComputingNodeType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LogicalComputingNodeType
