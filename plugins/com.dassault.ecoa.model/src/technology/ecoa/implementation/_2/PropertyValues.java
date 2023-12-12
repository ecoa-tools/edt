/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * set of module property values
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.PropertyValues#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getPropertyValues()
 * @model extendedMetaData="name='PropertyValues' kind='elementOnly'"
 * @generated
 */
public interface PropertyValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.PropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getPropertyValues_PropertyValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='propertyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyValue> getPropertyValue();

} // PropertyValues
