/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EUI Ds Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getSpecificBinding <em>Specific Binding</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getBoundToLinkId <em>Bound To Link Id</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getEUIDs <em>EUI Ds</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getEUIDsBinding()
 * @model extendedMetaData="name='EUIDsBinding' kind='elementOnly'"
 * @generated
 */
public interface EUIDsBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Specific Binding</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.cross.platforms.view._2.SpecificBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             specific EUIDS file associated to one given
	 *             peer of the link
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Binding</em>' containment reference list.
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getEUIDsBinding_SpecificBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecificBindingType> getSpecificBinding();

	/**
	 * Returns the value of the '<em><b>Bound To Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Reference an inter-platform link
	 *           identified in
	 *           the logical system
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound To Link Id</em>' attribute.
	 * @see #setBoundToLinkId(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getEUIDsBinding_BoundToLinkId()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='boundToLinkId'"
	 * @generated
	 */
	String getBoundToLinkId();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getBoundToLinkId <em>Bound To Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To Link Id</em>' attribute.
	 * @see #getBoundToLinkId()
	 * @generated
	 */
	void setBoundToLinkId(String value);

	/**
	 * Returns the value of the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Bind an EUIDS file to a given logical
	 *           computing platform link
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EUI Ds</em>' attribute.
	 * @see #setEUIDs(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getEUIDsBinding_EUIDs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='EUIDs'"
	 * @generated
	 */
	String getEUIDs();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getEUIDs <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUI Ds</em>' attribute.
	 * @see #getEUIDs()
	 * @generated
	 */
	void setEUIDs(String value);

} // EUIDsBinding
