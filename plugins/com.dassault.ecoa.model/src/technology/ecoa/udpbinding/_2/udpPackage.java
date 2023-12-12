/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see technology.ecoa.udpbinding._2.udpFactory
 * @model kind="package"
 * @generated
 */
public interface udpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/udpbinding-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	udpPackage eINSTANCE = technology.ecoa.udpbinding._2.impl.udpPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.udpbinding._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.udpbinding._2.impl.DocumentRootImpl
	 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLATFORM = 3;

	/**
	 * The feature id for the '<em><b>UDP Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UDP_BINDING = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.udpbinding._2.impl.PlatformTypeImpl
	 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Max Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__MAX_CHANNELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__PLATFORM_ID = 2;

	/**
	 * The feature id for the '<em><b>Receiving Multicast Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Receiving Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__RECEIVING_PORT = 4;

	/**
	 * The number of structural features of the '<em>Platform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Platform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.udpbinding._2.impl.UDPBindingTypeImpl <em>UDP Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.udpbinding._2.impl.UDPBindingTypeImpl
	 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getUDPBindingType()
	 * @generated
	 */
	int UDP_BINDING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING_TYPE__PLATFORM = 0;

	/**
	 * The number of structural features of the '<em>UDP Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UDP Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Platform ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformID()
	 * @generated
	 */
	int PLATFORM_ID = 3;

	/**
	 * The meta object id for the '<em>Platform ID Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformIDObject()
	 * @generated
	 */
	int PLATFORM_ID_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.udpbinding._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.udpbinding._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.udpbinding._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.udpbinding._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.udpbinding._2.DocumentRoot#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot#getPlatform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.udpbinding._2.DocumentRoot#getUDPBinding <em>UDP Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDP Binding</em>'.
	 * @see technology.ecoa.udpbinding._2.DocumentRoot#getUDPBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UDPBinding();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.udpbinding._2.PlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Type</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType
	 * @generated
	 */
	EClass getPlatformType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.udpbinding._2.PlatformType#getMaxChannels <em>Max Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Channels</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType#getMaxChannels()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_MaxChannels();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.udpbinding._2.PlatformType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType#getName()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.udpbinding._2.PlatformType#getPlatformId <em>Platform Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Id</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType#getPlatformId()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_PlatformId();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingMulticastAddress <em>Receiving Multicast Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiving Multicast Address</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType#getReceivingMulticastAddress()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_ReceivingMulticastAddress();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingPort <em>Receiving Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiving Port</em>'.
	 * @see technology.ecoa.udpbinding._2.PlatformType#getReceivingPort()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_ReceivingPort();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.udpbinding._2.UDPBindingType <em>UDP Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Binding Type</em>'.
	 * @see technology.ecoa.udpbinding._2.UDPBindingType
	 * @generated
	 */
	EClass getUDPBindingType();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.udpbinding._2.UDPBindingType#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform</em>'.
	 * @see technology.ecoa.udpbinding._2.UDPBindingType#getPlatform()
	 * @see #getUDPBindingType()
	 * @generated
	 */
	EReference getUDPBindingType_Platform();

	/**
	 * Returns the meta object for data type '<em>Platform ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         PlatformID is used to identify uniquely each
     *         platform within ELI-UDP exchanges.
     *         It is assumed that no more than
     *         16 platforms will be connected together.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Platform ID</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='PlatformID' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedInt' minInclusive='0' maxInclusive='15'"
	 * @generated
	 */
	EDataType getPlatformID();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Platform ID Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Platform ID Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='PlatformID:Object' baseType='PlatformID'"
	 * @generated
	 */
	EDataType getPlatformIDObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	udpFactory getudpFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.udpbinding._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.udpbinding._2.impl.DocumentRootImpl
		 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLATFORM = eINSTANCE.getDocumentRoot_Platform();

		/**
		 * The meta object literal for the '<em><b>UDP Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UDP_BINDING = eINSTANCE.getDocumentRoot_UDPBinding();

		/**
		 * The meta object literal for the '{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.udpbinding._2.impl.PlatformTypeImpl
		 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformType()
		 * @generated
		 */
		EClass PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '<em><b>Max Channels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__MAX_CHANNELS = eINSTANCE.getPlatformType_MaxChannels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__NAME = eINSTANCE.getPlatformType_Name();

		/**
		 * The meta object literal for the '<em><b>Platform Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__PLATFORM_ID = eINSTANCE.getPlatformType_PlatformId();

		/**
		 * The meta object literal for the '<em><b>Receiving Multicast Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS = eINSTANCE.getPlatformType_ReceivingMulticastAddress();

		/**
		 * The meta object literal for the '<em><b>Receiving Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__RECEIVING_PORT = eINSTANCE.getPlatformType_ReceivingPort();

		/**
		 * The meta object literal for the '{@link technology.ecoa.udpbinding._2.impl.UDPBindingTypeImpl <em>UDP Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.udpbinding._2.impl.UDPBindingTypeImpl
		 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getUDPBindingType()
		 * @generated
		 */
		EClass UDP_BINDING_TYPE = eINSTANCE.getUDPBindingType();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDP_BINDING_TYPE__PLATFORM = eINSTANCE.getUDPBindingType_Platform();

		/**
		 * The meta object literal for the '<em>Platform ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformID()
		 * @generated
		 */
		EDataType PLATFORM_ID = eINSTANCE.getPlatformID();

		/**
		 * The meta object literal for the '<em>Platform ID Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see technology.ecoa.udpbinding._2.impl.udpPackageImpl#getPlatformIDObject()
		 * @generated
		 */
		EDataType PLATFORM_ID_OBJECT = eINSTANCE.getPlatformIDObject();

	}

} //udpPackage
