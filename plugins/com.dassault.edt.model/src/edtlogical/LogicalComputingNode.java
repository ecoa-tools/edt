/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtdeployment.ProtectionDomain;
import technology.ecoa.logicalsystem._2.NameType;
import technology.ecoa.logicalsystem._2.TypeType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Logical
 * Computing Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtlogical.LogicalComputingNode#getLogicalProcessors <em>Logical
 * Processors</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getId <em>Id</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getEndianessType <em>Endianess
 * Type</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getModuleSwitchTimeMicroSeconds
 * <em>Module Switch Time Micro Seconds</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getAvailableMemoryGigaBytes
 * <em>Available Memory Giga Bytes</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getOsName <em>Os Name</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getOsVersion <em>Os
 * Version</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNode#getProtectionDomainLink
 * <em>Protection Domain Link</em>}</li>
 * </ul>
 *
 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode()
 * @model
 * @generated
 */
public interface LogicalComputingNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Processors</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link edtlogical.LogicalProcessor}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Logical Processors</em>' containment reference
	 *         list.
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_LogicalProcessors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LogicalProcessor> getLogicalProcessors();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNode#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Endianess Type</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link technology.ecoa.logicalsystem._2.TypeType}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Endianess Type</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @see #setEndianessType(TypeType)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_EndianessType()
	 * @model required="true"
	 * @generated
	 */
	TypeType getEndianessType();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingNode#getEndianessType <em>Endianess
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Endianess Type</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @see #getEndianessType()
	 * @generated
	 */
	void setEndianessType(TypeType value);

	/**
	 * Returns the value of the '<em><b>Module Switch Time Micro Seconds</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Switch Time Micro Seconds</em>'
	 *         attribute.
	 * @see #setModuleSwitchTimeMicroSeconds(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_ModuleSwitchTimeMicroSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getModuleSwitchTimeMicroSeconds();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingNode#getModuleSwitchTimeMicroSeconds
	 * <em>Module Switch Time Micro Seconds</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Module Switch Time Micro Seconds</em>'
	 *              attribute.
	 * @see #getModuleSwitchTimeMicroSeconds()
	 * @generated
	 */
	void setModuleSwitchTimeMicroSeconds(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Available Memory Giga Bytes</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Memory Giga Bytes</em>' attribute.
	 * @see #setAvailableMemoryGigaBytes(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_AvailableMemoryGigaBytes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getAvailableMemoryGigaBytes();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingNode#getAvailableMemoryGigaBytes
	 * <em>Available Memory Giga Bytes</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Available Memory Giga Bytes</em>'
	 *              attribute.
	 * @see #getAvailableMemoryGigaBytes()
	 * @generated
	 */
	void setAvailableMemoryGigaBytes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Os Name</b></em>' attribute. The literals
	 * are from the enumeration {@link technology.ecoa.logicalsystem._2.NameType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Os Name</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see #isSetOsName()
	 * @see #unsetOsName()
	 * @see #setOsName(NameType)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_OsName()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	NameType getOsName();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNode#getOsName
	 * <em>Os Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Os Name</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see #isSetOsName()
	 * @see #unsetOsName()
	 * @see #getOsName()
	 * @generated
	 */
	void setOsName(NameType value);

	/**
	 * Unsets the value of the '{@link edtlogical.LogicalComputingNode#getOsName
	 * <em>Os Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetOsName()
	 * @see #getOsName()
	 * @see #setOsName(NameType)
	 * @generated
	 */
	void unsetOsName();

	/**
	 * Returns whether the value of the
	 * '{@link edtlogical.LogicalComputingNode#getOsName <em>Os Name</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Os Name</em>' attribute is set.
	 * @see #unsetOsName()
	 * @see #getOsName()
	 * @see #setOsName(NameType)
	 * @generated
	 */
	boolean isSetOsName();

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_OsVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNode#getOsVersion
	 * <em>Os Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Protection Domain Link</b></em>' reference
	 * list. The list contents are of type {@link edtdeployment.ProtectionDomain}.
	 * It is bidirectional and its opposite is
	 * '{@link edtdeployment.ProtectionDomain#getExecuteOnComputingNode <em>Execute
	 * On Computing Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Protection Domain Link</em>' reference list.
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNode_ProtectionDomainLink()
	 * @see edtdeployment.ProtectionDomain#getExecuteOnComputingNode
	 * @model opposite="executeOnComputingNode"
	 * @generated
	 */
	EList<ProtectionDomain> getProtectionDomainLink();

	/**
	 * 
	 * @return true if no missing elements
	 */
	boolean isComplete();

} // LogicalComputingNode
