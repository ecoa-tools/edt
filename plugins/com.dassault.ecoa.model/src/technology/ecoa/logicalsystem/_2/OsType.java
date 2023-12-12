/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.OsType#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.OsType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getOsType()
 * @model extendedMetaData="name='os_._type' kind='empty'"
 * @generated
 */
public interface OsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.logicalsystem._2.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(NameType)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getOsType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.OsType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.logicalsystem._2.OsType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.logicalsystem._2.OsType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getOsType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.OsType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // OsType
