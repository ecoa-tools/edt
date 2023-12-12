/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of an ECOA service, including a
 *         set of
 *         operations.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.ServiceDefinition#getUse <em>Use</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.ServiceDefinition#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.interface_._2.interPackage#getServiceDefinition()
 * @model extendedMetaData="name='ServiceDefinition' kind='elementOnly'"
 * @generated
 */
public interface ServiceDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.interface_._2.UseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declares the use of a library of data types. A
	 *         type T defined in a library L will be denoted "L:T".
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see technology.ecoa.interface_._2.interPackage#getServiceDefinition_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UseType> getUse();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(Operations)
	 * @see technology.ecoa.interface_._2.interPackage#getServiceDefinition_Operations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operations' namespace='##targetNamespace'"
	 * @generated
	 */
	Operations getOperations();

	/**
	 * Sets the value of the '{@link technology.ecoa.interface_._2.ServiceDefinition#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(Operations value);

} // ServiceDefinition
