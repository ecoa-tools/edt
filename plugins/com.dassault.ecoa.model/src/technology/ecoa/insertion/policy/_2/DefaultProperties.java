/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.DefaultProperties#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getDefaultProperties()
 * @model extendedMetaData="name='DefaultProperties' kind='elementOnly'"
 * @generated
 */
public interface DefaultProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.DefaultPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Default Property Value
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDefaultProperties_Property()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefaultPropertyValue> getProperty();

} // DefaultProperties
