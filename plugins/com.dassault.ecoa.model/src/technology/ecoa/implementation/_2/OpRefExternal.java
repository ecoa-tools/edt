/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Ref External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference used for asynchronous notfication
 *         coming the legacy code (driver component)
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OpRefExternal#getLanguage <em>Language</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OpRefExternal#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOpRefExternal()
 * @model extendedMetaData="name='OpRef_External' kind='empty'"
 * @generated
 */
public interface OpRefExternal extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.implementation._2.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Programming language in which the external
	 *           API will be generated for the non-ECOA SW part of the driver
	 *           component
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefExternal_Language()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefExternal#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.OpRefExternal#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.OpRefExternal#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(ProgrammingLanguage)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefExternal_OperationName()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefExternal#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // OpRefExternal
