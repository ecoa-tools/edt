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
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.PropertiesType#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getPropertiesType()
 * @model extendedMetaData="name='properties_._type' kind='elementOnly'"
 * @generated
 */
public interface PropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of each module property is
	 *                   set at design time at instance definition level.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getPropertiesType_Property()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getProperty();

} // PropertiesType
