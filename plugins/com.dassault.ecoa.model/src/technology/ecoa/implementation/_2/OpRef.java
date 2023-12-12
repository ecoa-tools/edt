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
 * A representation of the model object '<em><b>Op Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OpRef#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.OpRef#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOpRef()
 * @model extendedMetaData="name='OpRef' kind='empty'"
 * @generated
 */
public interface OpRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a module instance, a service, or
	 *           a reference
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRef_InstanceName()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRef#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRef_OperationName()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRef#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // OpRef
