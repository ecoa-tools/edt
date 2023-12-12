/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DocumentRoot#getComponentImplementation <em>Component Implementation</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DocumentRoot#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementation</em>' containment reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot_ComponentImplementation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentImplementation' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DocumentRoot#getComponentImplementation <em>Component Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation</em>' containment reference.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declares the use of a library of data types. A
	 *         type T defined in a library L will be denoted "L:T".
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(UseType)
	 * @see technology.ecoa.implementation._2.impPackage#getDocumentRoot_Use()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	UseType getUse();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DocumentRoot#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(UseType value);

} // DocumentRoot
