/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see technology.ecoa.sca.extension.scaExt.scaExtFactory
 * @model kind="package"
 *        annotation="http://java.sun.com/xml/ns/jaxb version='1.0'"
 * @generated
 */
public interface scaExtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scaExt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/sca-extension-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoa-sca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scaExtPackage eINSTANCE = technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.sca.extension.scaExt.impl.ImplementationTypeImpl <em>Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.sca.extension.scaExt.impl.ImplementationTypeImpl
	 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getImplementationType()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.sca.extension.scaExt.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.sca.extension.scaExt.impl.InstanceImpl
	 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DOCUMENTATION = scaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IMPLEMENTATION = scaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__COMPONENT_TYPE = scaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__VERSION = scaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = scaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = scaPackage.IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.sca.extension.scaExt.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.sca.extension.scaExt.impl.InterfaceImpl
	 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = scaPackage.INTERFACE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__QOS = scaPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SYNTAX = scaPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = scaPackage.INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = scaPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.sca.extension.scaExt.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.sca.extension.scaExt.impl.DocumentRootImpl
	 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPLOYMENT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.sca.extension.scaExt.impl.WireInformationImpl <em>Wire Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.sca.extension.scaExt.impl.WireInformationImpl
	 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getWireInformation()
	 * @generated
	 */
	int WIRE_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_INFORMATION__LINK = 0;

	/**
	 * The number of structural features of the '<em>Wire Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wire Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_INFORMATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.sca.extension.scaExt.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.ImplementationType
	 * @generated
	 */
	EClass getImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.ImplementationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.ImplementationType#getName()
	 * @see #getImplementationType()
	 * @generated
	 */
	EAttribute getImplementationType_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.sca.extension.scaExt.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.sca.extension.scaExt.Instance#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Instance#getImplementation()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.Instance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Instance#getComponentType()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.Instance#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Instance#getVersion()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Version();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.sca.extension.scaExt.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.Interface#getQos <em>Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qos</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Interface#getQos()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Qos();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.Interface#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.Interface#getSyntax()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Syntax();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getInstance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getInterface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Interface();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getDeployment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Deployment();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.sca.extension.scaExt.WireInformation <em>Wire Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Information</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.WireInformation
	 * @generated
	 */
	EClass getWireInformation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.sca.extension.scaExt.WireInformation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see technology.ecoa.sca.extension.scaExt.WireInformation#getLink()
	 * @see #getWireInformation()
	 * @generated
	 */
	EAttribute getWireInformation_Link();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	scaExtFactory getscaExtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link technology.ecoa.sca.extension.scaExt.impl.ImplementationTypeImpl <em>Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.sca.extension.scaExt.impl.ImplementationTypeImpl
		 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getImplementationType()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE = eINSTANCE.getImplementationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE__NAME = eINSTANCE.getImplementationType_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.sca.extension.scaExt.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.sca.extension.scaExt.impl.InstanceImpl
		 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__IMPLEMENTATION = eINSTANCE.getInstance_Implementation();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__COMPONENT_TYPE = eINSTANCE.getInstance_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__VERSION = eINSTANCE.getInstance_Version();

		/**
		 * The meta object literal for the '{@link technology.ecoa.sca.extension.scaExt.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.sca.extension.scaExt.impl.InterfaceImpl
		 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Qos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__QOS = eINSTANCE.getInterface_Qos();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__SYNTAX = eINSTANCE.getInterface_Syntax();

		/**
		 * The meta object literal for the '{@link technology.ecoa.sca.extension.scaExt.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.sca.extension.scaExt.impl.DocumentRootImpl
		 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INSTANCE = eINSTANCE.getDocumentRoot_Instance();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERFACE = eINSTANCE.getDocumentRoot_Interface();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEPLOYMENT = eINSTANCE.getDocumentRoot_Deployment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.sca.extension.scaExt.impl.WireInformationImpl <em>Wire Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.sca.extension.scaExt.impl.WireInformationImpl
		 * @see technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl#getWireInformation()
		 * @generated
		 */
		EClass WIRE_INFORMATION = eINSTANCE.getWireInformation();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_INFORMATION__LINK = eINSTANCE.getWireInformation_Link();

	}

} //scaExtPackage
