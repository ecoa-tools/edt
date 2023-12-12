/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt;

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
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInstance <em>Instance</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInterface <em>Interface</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot()
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
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_Mixed()
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
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Instance)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_Instance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation'"
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_Interface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#interface'"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' attribute.
	 * @see #setDeployment(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_Deployment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deployment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeployment();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getDeployment <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' attribute.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getDocumentRoot_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // DocumentRoot
