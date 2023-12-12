/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

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
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot()
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
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Mixed()
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
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' containment reference.
	 * @see #setComponentType(ComponentType)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_ComponentType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentType' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComponentType <em>Component Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' containment reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference.
	 * @see #setComposite(Composite)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Composite()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='composite' namespace='##targetNamespace'"
	 * @generated
	 */
	Composite getComposite();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComposite <em>Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' containment reference.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(Composite value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Documentation)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Documentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Documentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Documentation value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Extensions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Implementation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' containment reference.
	 * @see #setImplementationType(ImplementationType)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_ImplementationType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationType getImplementationType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' containment reference.
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(ImplementationType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Interface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace'"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Value()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

	/**
	 * Returns the value of the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Format</em>' containment reference.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_WireFormat()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	WireFormatType getWireFormat();

	/**
	 * Returns the value of the '<em><b>Contribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution</em>' containment reference.
	 * @see #setContribution(ContributionType)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_Contribution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contribution' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributionType getContribution();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getContribution <em>Contribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contribution</em>' containment reference.
	 * @see #getContribution()
	 * @generated
	 */
	void setContribution(ContributionType value);

	/**
	 * Returns the value of the '<em><b>Implementation Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Composite</em>' containment reference.
	 * @see #setImplementationComposite(SCAImplementation)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDocumentRoot_ImplementationComposite()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementation.composite' namespace='##targetNamespace' affiliation='implementation'"
	 * @generated
	 */
	SCAImplementation getImplementationComposite();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Composite</em>' containment reference.
	 * @see #getImplementationComposite()
	 * @generated
	 */
	void setImplementationComposite(SCAImplementation value);

} // DocumentRoot
