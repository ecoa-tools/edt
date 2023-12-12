/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getBoundToComputingPlatform <em>Bound To Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getEUIDs <em>EUI Ds</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getSpecificBindingType()
 * @model extendedMetaData="name='specificBinding_._type' kind='empty'"
 * @generated
 */
public interface SpecificBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound To Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of a logical platform
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound To Computing Platform</em>' attribute.
	 * @see #setBoundToComputingPlatform(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getSpecificBindingType_BoundToComputingPlatform()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='boundToComputingPlatform'"
	 * @generated
	 */
	String getBoundToComputingPlatform();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getBoundToComputingPlatform <em>Bound To Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To Computing Platform</em>' attribute.
	 * @see #getBoundToComputingPlatform()
	 * @generated
	 */
	void setBoundToComputingPlatform(String value);

	/**
	 * Returns the value of the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 specific EUIDS file associated to one
	 *                 given peer of the link
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EUI Ds</em>' attribute.
	 * @see #setEUIDs(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getSpecificBindingType_EUIDs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='EUIDs'"
	 * @generated
	 */
	String getEUIDs();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getEUIDs <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUI Ds</em>' attribute.
	 * @see #getEUIDs()
	 * @generated
	 */
	void setEUIDs(String value);

} // SpecificBindingType
