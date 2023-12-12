/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see technology.ecoa.logicalsystem._2.logFactory
 * @model kind="package"
 * @generated
 */
public interface logPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/logicalsystem-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	logPackage eINSTANCE = technology.ecoa.logicalsystem._2.impl.logPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.AvailableMemoryTypeImpl <em>Available Memory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.AvailableMemoryTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getAvailableMemoryType()
	 * @generated
	 */
	int AVAILABLE_MEMORY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Giga Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_MEMORY_TYPE__GIGA_BYTES = 0;

	/**
	 * The number of structural features of the '<em>Available Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_MEMORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Available Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_MEMORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.DocumentRootImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Logical System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGICAL_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 4;

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
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.EndianessTypeImpl <em>Endianess Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.EndianessTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getEndianessType()
	 * @generated
	 */
	int ENDIANESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDIANESS_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Endianess Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDIANESS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Endianess Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDIANESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LatencyTypeImpl <em>Latency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LatencyTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLatencyType()
	 * @generated
	 */
	int LATENCY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE__MICRO_SECONDS = 0;

	/**
	 * The number of structural features of the '<em>Latency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Latency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LatencyType1Impl <em>Latency Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LatencyType1Impl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLatencyType1()
	 * @generated
	 */
	int LATENCY_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE1__MICRO_SECONDS = 0;

	/**
	 * The number of structural features of the '<em>Latency Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Latency Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LinkTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__THROUGHPUT = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Transport Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TRANSPORT_BINDING = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__FROM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TO = 5;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl <em>Link Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LinkType1Impl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLinkType1()
	 * @generated
	 */
	int LINK_TYPE1 = 6;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1__THROUGHPUT = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1__LATENCY = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1__FROM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1__ID = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1__TO = 4;

	/**
	 * The number of structural features of the '<em>Link Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeLinksImpl <em>Logical Computing Node Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeLinksImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingNodeLinks()
	 * @generated
	 */
	int LOGICAL_COMPUTING_NODE_LINKS = 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINKS__LINK = 0;

	/**
	 * The number of structural features of the '<em>Logical Computing Node Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical Computing Node Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl <em>Logical Computing Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingNodeType()
	 * @generated
	 */
	int LOGICAL_COMPUTING_NODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Endianess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS = 0;

	/**
	 * The feature id for the '<em><b>Logical Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS = 1;

	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__OS = 2;

	/**
	 * The feature id for the '<em><b>Available Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Module Switch Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Logical Computing Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Logical Computing Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl <em>Logical Computing Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingPlatform()
	 * @generated
	 */
	int LOGICAL_COMPUTING_PLATFORM = 9;

	/**
	 * The feature id for the '<em><b>Logical Computing Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE = 0;

	/**
	 * The feature id for the '<em><b>Logical Computing Node Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS = 1;

	/**
	 * The feature id for the '<em><b>ELI Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM__ID = 3;

	/**
	 * The number of structural features of the '<em>Logical Computing Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Logical Computing Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformLinksImpl <em>Logical Computing Platform Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformLinksImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingPlatformLinks()
	 * @generated
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINKS = 10;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINKS__LINK = 0;

	/**
	 * The number of structural features of the '<em>Logical Computing Platform Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical Computing Platform Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl <em>Logical Processors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalProcessorsType()
	 * @generated
	 */
	int LOGICAL_PROCESSORS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Step Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSORS_TYPE__STEP_DURATION = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSORS_TYPE__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSORS_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Logical Processors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSORS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logical Processors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl <em>Logical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalSystem()
	 * @generated
	 */
	int LOGICAL_SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Logical Computing Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Logical Computing Platform Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__ID = 2;

	/**
	 * The number of structural features of the '<em>Logical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.ModuleSwitchTimeTypeImpl <em>Module Switch Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.ModuleSwitchTimeTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getModuleSwitchTimeType()
	 * @generated
	 */
	int MODULE_SWITCH_TIME_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SWITCH_TIME_TYPE__MICRO_SECONDS = 0;

	/**
	 * The number of structural features of the '<em>Module Switch Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SWITCH_TIME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Switch Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SWITCH_TIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.OsTypeImpl <em>Os Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.OsTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getOsType()
	 * @generated
	 */
	int OS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.StepDurationTypeImpl <em>Step Duration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.StepDurationTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getStepDurationType()
	 * @generated
	 */
	int STEP_DURATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Nano Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DURATION_TYPE__NANO_SECONDS = 0;

	/**
	 * The number of structural features of the '<em>Step Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DURATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DURATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.ThroughputTypeImpl <em>Throughput Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.ThroughputTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getThroughputType()
	 * @generated
	 */
	int THROUGHPUT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mega Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE__MEGA_BYTES_PER_SECOND = 0;

	/**
	 * The number of structural features of the '<em>Throughput Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Throughput Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.ThroughputType1Impl <em>Throughput Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.ThroughputType1Impl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getThroughputType1()
	 * @generated
	 */
	int THROUGHPUT_TYPE1 = 17;

	/**
	 * The feature id for the '<em><b>Mega Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND = 0;

	/**
	 * The number of structural features of the '<em>Throughput Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Throughput Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.TransportBindingTypeImpl <em>Transport Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.TransportBindingTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTransportBindingType()
	 * @generated
	 */
	int TRANSPORT_BINDING_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_BINDING_TYPE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_BINDING_TYPE__PROTOCOL = 1;

	/**
	 * The number of structural features of the '<em>Transport Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transport Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.UseTypeImpl
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.NameType <em>Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 20;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 21;

	/**
	 * The meta object id for the '{@link technology.ecoa.logicalsystem._2.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 22;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 23;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 24;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 25;

	/**
	 * The meta object id for the '<em>Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameTypeObject()
	 * @generated
	 */
	int NAME_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 28;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 30;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 32;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 33;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 34;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.AvailableMemoryType <em>Available Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Available Memory Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.AvailableMemoryType
	 * @generated
	 */
	EClass getAvailableMemoryType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.AvailableMemoryType#getGigaBytes <em>Giga Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Giga Bytes</em>'.
	 * @see technology.ecoa.logicalsystem._2.AvailableMemoryType#getGigaBytes()
	 * @see #getAvailableMemoryType()
	 * @generated
	 */
	EAttribute getAvailableMemoryType_GigaBytes();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.logicalsystem._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.logicalsystem._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.logicalsystem._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.DocumentRoot#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical System</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot#getLogicalSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogicalSystem();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.EndianessType <em>Endianess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endianess Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.EndianessType
	 * @generated
	 */
	EClass getEndianessType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.EndianessType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.EndianessType#getType()
	 * @see #getEndianessType()
	 * @generated
	 */
	EAttribute getEndianessType_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LatencyType <em>Latency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.LatencyType
	 * @generated
	 */
	EClass getLatencyType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LatencyType#getMicroSeconds <em>Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro Seconds</em>'.
	 * @see technology.ecoa.logicalsystem._2.LatencyType#getMicroSeconds()
	 * @see #getLatencyType()
	 * @generated
	 */
	EAttribute getLatencyType_MicroSeconds();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LatencyType1 <em>Latency Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Type1</em>'.
	 * @see technology.ecoa.logicalsystem._2.LatencyType1
	 * @generated
	 */
	EClass getLatencyType1();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LatencyType1#getMicroSeconds <em>Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro Seconds</em>'.
	 * @see technology.ecoa.logicalsystem._2.LatencyType1#getMicroSeconds()
	 * @see #getLatencyType1()
	 * @generated
	 */
	EAttribute getLatencyType1_MicroSeconds();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LinkType#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getThroughput()
	 * @see #getLinkType()
	 * @generated
	 */
	EReference getLinkType_Throughput();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LinkType#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getLatency()
	 * @see #getLinkType()
	 * @generated
	 */
	EReference getLinkType_Latency();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LinkType#getTransportBinding <em>Transport Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Binding</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getTransportBinding()
	 * @see #getLinkType()
	 * @generated
	 */
	EReference getLinkType_TransportBinding();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getFrom()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_From();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getId()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Id();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType#getTo()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_To();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LinkType1 <em>Link Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type1</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1
	 * @generated
	 */
	EClass getLinkType1();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LinkType1#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1#getThroughput()
	 * @see #getLinkType1()
	 * @generated
	 */
	EReference getLinkType1_Throughput();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LinkType1#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1#getLatency()
	 * @see #getLinkType1()
	 * @generated
	 */
	EReference getLinkType1_Latency();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType1#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1#getFrom()
	 * @see #getLinkType1()
	 * @generated
	 */
	EAttribute getLinkType1_From();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1#getId()
	 * @see #getLinkType1()
	 * @generated
	 */
	EAttribute getLinkType1_Id();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LinkType1#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see technology.ecoa.logicalsystem._2.LinkType1#getTo()
	 * @see #getLinkType1()
	 * @generated
	 */
	EAttribute getLinkType1_To();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks <em>Logical Computing Node Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Node Links</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks
	 * @generated
	 */
	EClass getLogicalComputingNodeLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks#getLink()
	 * @see #getLogicalComputingNodeLinks()
	 * @generated
	 */
	EReference getLogicalComputingNodeLinks_Link();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType <em>Logical Computing Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Node Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType
	 * @generated
	 */
	EClass getLogicalComputingNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getEndianess <em>Endianess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endianess</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getEndianess()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EReference getLogicalComputingNodeType_Endianess();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getLogicalProcessors <em>Logical Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Processors</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getLogicalProcessors()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EReference getLogicalComputingNodeType_LogicalProcessors();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getOs()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EReference getLogicalComputingNodeType_Os();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getAvailableMemory <em>Available Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Memory</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getAvailableMemory()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EReference getLogicalComputingNodeType_AvailableMemory();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getModuleSwitchTime <em>Module Switch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Switch Time</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getModuleSwitchTime()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EReference getLogicalComputingNodeType_ModuleSwitchTime();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType#getId()
	 * @see #getLogicalComputingNodeType()
	 * @generated
	 */
	EAttribute getLogicalComputingNodeType_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform <em>Logical Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Platform</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform
	 * @generated
	 */
	EClass getLogicalComputingPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNode <em>Logical Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Node</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNode()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EReference getLogicalComputingPlatform_LogicalComputingNode();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNodeLinks <em>Logical Computing Node Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Node Links</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getLogicalComputingNodeLinks()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EReference getLogicalComputingPlatform_LogicalComputingNodeLinks();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELI Platform Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getELIPlatformId()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatform_ELIPlatformId();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform#getId()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatform_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Platform Links</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks
	 * @generated
	 */
	EClass getLogicalComputingPlatformLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks#getLink()
	 * @see #getLogicalComputingPlatformLinks()
	 * @generated
	 */
	EReference getLogicalComputingPlatformLinks_Link();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType <em>Logical Processors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Processors Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalProcessorsType
	 * @generated
	 */
	EClass getLogicalProcessorsType();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getStepDuration <em>Step Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Duration</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalProcessorsType#getStepDuration()
	 * @see #getLogicalProcessorsType()
	 * @generated
	 */
	EReference getLogicalProcessorsType_StepDuration();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalProcessorsType#getNumber()
	 * @see #getLogicalProcessorsType()
	 * @generated
	 */
	EAttribute getLogicalProcessorsType_Number();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalProcessorsType#getType()
	 * @see #getLogicalProcessorsType()
	 * @generated
	 */
	EAttribute getLogicalProcessorsType_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.LogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical System</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalSystem
	 * @generated
	 */
	EClass getLogicalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatform <em>Logical Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Platform</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatform()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EReference getLogicalSystem_LogicalComputingPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Platform Links</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalSystem#getLogicalComputingPlatformLinks()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EReference getLogicalSystem_LogicalComputingPlatformLinks();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.LogicalSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.logicalsystem._2.LogicalSystem#getId()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EAttribute getLogicalSystem_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.ModuleSwitchTimeType <em>Module Switch Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Switch Time Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.ModuleSwitchTimeType
	 * @generated
	 */
	EClass getModuleSwitchTimeType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.ModuleSwitchTimeType#getMicroSeconds <em>Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro Seconds</em>'.
	 * @see technology.ecoa.logicalsystem._2.ModuleSwitchTimeType#getMicroSeconds()
	 * @see #getModuleSwitchTimeType()
	 * @generated
	 */
	EAttribute getModuleSwitchTimeType_MicroSeconds();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.OsType <em>Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.OsType
	 * @generated
	 */
	EClass getOsType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.OsType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.logicalsystem._2.OsType#getName()
	 * @see #getOsType()
	 * @generated
	 */
	EAttribute getOsType_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.OsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see technology.ecoa.logicalsystem._2.OsType#getVersion()
	 * @see #getOsType()
	 * @generated
	 */
	EAttribute getOsType_Version();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.StepDurationType <em>Step Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Duration Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.StepDurationType
	 * @generated
	 */
	EClass getStepDurationType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.StepDurationType#getNanoSeconds <em>Nano Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nano Seconds</em>'.
	 * @see technology.ecoa.logicalsystem._2.StepDurationType#getNanoSeconds()
	 * @see #getStepDurationType()
	 * @generated
	 */
	EAttribute getStepDurationType_NanoSeconds();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.ThroughputType <em>Throughput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType
	 * @generated
	 */
	EClass getThroughputType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.ThroughputType#getMegaBytesPerSecond <em>Mega Bytes Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mega Bytes Per Second</em>'.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType#getMegaBytesPerSecond()
	 * @see #getThroughputType()
	 * @generated
	 */
	EAttribute getThroughputType_MegaBytesPerSecond();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.ThroughputType1 <em>Throughput Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput Type1</em>'.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType1
	 * @generated
	 */
	EClass getThroughputType1();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.ThroughputType1#getMegaBytesPerSecond <em>Mega Bytes Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mega Bytes Per Second</em>'.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType1#getMegaBytesPerSecond()
	 * @see #getThroughputType1()
	 * @generated
	 */
	EAttribute getThroughputType1_MegaBytesPerSecond();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.TransportBindingType <em>Transport Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Binding Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.TransportBindingType
	 * @generated
	 */
	EClass getTransportBindingType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.TransportBindingType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see technology.ecoa.logicalsystem._2.TransportBindingType#getParameters()
	 * @see #getTransportBindingType()
	 * @generated
	 */
	EAttribute getTransportBindingType_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.TransportBindingType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see technology.ecoa.logicalsystem._2.TransportBindingType#getProtocol()
	 * @see #getTransportBindingType()
	 * @generated
	 */
	EAttribute getTransportBindingType_Protocol();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.logicalsystem._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.logicalsystem._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.logicalsystem._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.logicalsystem._2.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @generated
	 */
	EEnum getNameType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.logicalsystem._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.logicalsystem._2.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Or Dec Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         binary value or a decimal-coded binary value.
     *         This hex-encoded binary value contains the mandatory string 0x
     *         followed by a finite-length sequence of characters 0–9 and a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex Or Dec Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexOrDecValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[1-9][0-9]*|0'"
	 * @generated
	 */
	EDataType getHexOrDecValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Library Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LibraryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_\\.]*'"
	 * @generated
	 */
	EDataType getLibraryName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getNameId();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.logicalsystem._2.NameType <em>Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Object</em>'.
	 * @see technology.ecoa.logicalsystem._2.NameType
	 * @model instanceClass="technology.ecoa.logicalsystem._2.NameType"
	 *        extendedMetaData="name='name_._type:Object' baseType='name_._type'"
	 * @generated
	 */
	EDataType getNameTypeObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.logicalsystem._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.logicalsystem._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number of logical steps
     *         This allows to size
     *         durations in an abstract way.
     *         See stepDuration in the logical
     *         system
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steps</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Steps' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getSteps();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Steps Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steps Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Steps:Object' baseType='Steps'"
	 * @generated
	 */
	EDataType getStepsObject();

	/**
	 * Returns the meta object for data type '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit is in seconds
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='TimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTimeDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Time Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='TimeDuration:Object' baseType='TimeDuration'"
	 * @generated
	 */
	EDataType getTimeDurationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeName' baseType='NameId'"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type QName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeQName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getTypeQName();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.logicalsystem._2.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see technology.ecoa.logicalsystem._2.TypeType
	 * @model instanceClass="technology.ecoa.logicalsystem._2.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	logFactory getlogFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.AvailableMemoryTypeImpl <em>Available Memory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.AvailableMemoryTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getAvailableMemoryType()
		 * @generated
		 */
		EClass AVAILABLE_MEMORY_TYPE = eINSTANCE.getAvailableMemoryType();

		/**
		 * The meta object literal for the '<em><b>Giga Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_MEMORY_TYPE__GIGA_BYTES = eINSTANCE.getAvailableMemoryType_GigaBytes();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.DocumentRootImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Logical System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGICAL_SYSTEM = eINSTANCE.getDocumentRoot_LogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.EndianessTypeImpl <em>Endianess Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.EndianessTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getEndianessType()
		 * @generated
		 */
		EClass ENDIANESS_TYPE = eINSTANCE.getEndianessType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDIANESS_TYPE__TYPE = eINSTANCE.getEndianessType_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LatencyTypeImpl <em>Latency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LatencyTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLatencyType()
		 * @generated
		 */
		EClass LATENCY_TYPE = eINSTANCE.getLatencyType();

		/**
		 * The meta object literal for the '<em><b>Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY_TYPE__MICRO_SECONDS = eINSTANCE.getLatencyType_MicroSeconds();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LatencyType1Impl <em>Latency Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LatencyType1Impl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLatencyType1()
		 * @generated
		 */
		EClass LATENCY_TYPE1 = eINSTANCE.getLatencyType1();

		/**
		 * The meta object literal for the '<em><b>Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY_TYPE1__MICRO_SECONDS = eINSTANCE.getLatencyType1_MicroSeconds();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LinkTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE__THROUGHPUT = eINSTANCE.getLinkType_Throughput();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE__LATENCY = eINSTANCE.getLinkType_Latency();

		/**
		 * The meta object literal for the '<em><b>Transport Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE__TRANSPORT_BINDING = eINSTANCE.getLinkType_TransportBinding();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__FROM = eINSTANCE.getLinkType_From();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__ID = eINSTANCE.getLinkType_Id();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__TO = eINSTANCE.getLinkType_To();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl <em>Link Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LinkType1Impl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLinkType1()
		 * @generated
		 */
		EClass LINK_TYPE1 = eINSTANCE.getLinkType1();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE1__THROUGHPUT = eINSTANCE.getLinkType1_Throughput();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE1__LATENCY = eINSTANCE.getLinkType1_Latency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE1__FROM = eINSTANCE.getLinkType1_From();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE1__ID = eINSTANCE.getLinkType1_Id();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE1__TO = eINSTANCE.getLinkType1_To();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeLinksImpl <em>Logical Computing Node Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeLinksImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingNodeLinks()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_NODE_LINKS = eINSTANCE.getLogicalComputingNodeLinks();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_LINKS__LINK = eINSTANCE.getLogicalComputingNodeLinks_Link();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl <em>Logical Computing Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingNodeType()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_NODE_TYPE = eINSTANCE.getLogicalComputingNodeType();

		/**
		 * The meta object literal for the '<em><b>Endianess</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS = eINSTANCE.getLogicalComputingNodeType_Endianess();

		/**
		 * The meta object literal for the '<em><b>Logical Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS = eINSTANCE.getLogicalComputingNodeType_LogicalProcessors();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_TYPE__OS = eINSTANCE.getLogicalComputingNodeType_Os();

		/**
		 * The meta object literal for the '<em><b>Available Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY = eINSTANCE.getLogicalComputingNodeType_AvailableMemory();

		/**
		 * The meta object literal for the '<em><b>Module Switch Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME = eINSTANCE.getLogicalComputingNodeType_ModuleSwitchTime();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE_TYPE__ID = eINSTANCE.getLogicalComputingNodeType_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl <em>Logical Computing Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingPlatform()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_PLATFORM = eINSTANCE.getLogicalComputingPlatform();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE = eINSTANCE.getLogicalComputingPlatform_LogicalComputingNode();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Node Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS = eINSTANCE.getLogicalComputingPlatform_LogicalComputingNodeLinks();

		/**
		 * The meta object literal for the '<em><b>ELI Platform Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID = eINSTANCE.getLogicalComputingPlatform_ELIPlatformId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM__ID = eINSTANCE.getLogicalComputingPlatform_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformLinksImpl <em>Logical Computing Platform Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformLinksImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalComputingPlatformLinks()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_PLATFORM_LINKS = eINSTANCE.getLogicalComputingPlatformLinks();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM_LINKS__LINK = eINSTANCE.getLogicalComputingPlatformLinks_Link();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl <em>Logical Processors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalProcessorsTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalProcessorsType()
		 * @generated
		 */
		EClass LOGICAL_PROCESSORS_TYPE = eINSTANCE.getLogicalProcessorsType();

		/**
		 * The meta object literal for the '<em><b>Step Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_PROCESSORS_TYPE__STEP_DURATION = eINSTANCE.getLogicalProcessorsType_StepDuration();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PROCESSORS_TYPE__NUMBER = eINSTANCE.getLogicalProcessorsType_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PROCESSORS_TYPE__TYPE = eINSTANCE.getLogicalProcessorsType_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl <em>Logical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.LogicalSystemImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLogicalSystem()
		 * @generated
		 */
		EClass LOGICAL_SYSTEM = eINSTANCE.getLogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Platform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM = eINSTANCE.getLogicalSystem_LogicalComputingPlatform();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Platform Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS = eINSTANCE.getLogicalSystem_LogicalComputingPlatformLinks();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_SYSTEM__ID = eINSTANCE.getLogicalSystem_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.ModuleSwitchTimeTypeImpl <em>Module Switch Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.ModuleSwitchTimeTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getModuleSwitchTimeType()
		 * @generated
		 */
		EClass MODULE_SWITCH_TIME_TYPE = eINSTANCE.getModuleSwitchTimeType();

		/**
		 * The meta object literal for the '<em><b>Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_SWITCH_TIME_TYPE__MICRO_SECONDS = eINSTANCE.getModuleSwitchTimeType_MicroSeconds();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.OsTypeImpl <em>Os Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.OsTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getOsType()
		 * @generated
		 */
		EClass OS_TYPE = eINSTANCE.getOsType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TYPE__NAME = eINSTANCE.getOsType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TYPE__VERSION = eINSTANCE.getOsType_Version();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.StepDurationTypeImpl <em>Step Duration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.StepDurationTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getStepDurationType()
		 * @generated
		 */
		EClass STEP_DURATION_TYPE = eINSTANCE.getStepDurationType();

		/**
		 * The meta object literal for the '<em><b>Nano Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DURATION_TYPE__NANO_SECONDS = eINSTANCE.getStepDurationType_NanoSeconds();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.ThroughputTypeImpl <em>Throughput Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.ThroughputTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getThroughputType()
		 * @generated
		 */
		EClass THROUGHPUT_TYPE = eINSTANCE.getThroughputType();

		/**
		 * The meta object literal for the '<em><b>Mega Bytes Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT_TYPE__MEGA_BYTES_PER_SECOND = eINSTANCE.getThroughputType_MegaBytesPerSecond();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.ThroughputType1Impl <em>Throughput Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.ThroughputType1Impl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getThroughputType1()
		 * @generated
		 */
		EClass THROUGHPUT_TYPE1 = eINSTANCE.getThroughputType1();

		/**
		 * The meta object literal for the '<em><b>Mega Bytes Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND = eINSTANCE.getThroughputType1_MegaBytesPerSecond();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.TransportBindingTypeImpl <em>Transport Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.TransportBindingTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTransportBindingType()
		 * @generated
		 */
		EClass TRANSPORT_BINDING_TYPE = eINSTANCE.getTransportBindingType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_BINDING_TYPE__PARAMETERS = eINSTANCE.getTransportBindingType_Parameters();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_BINDING_TYPE__PROTOCOL = eINSTANCE.getTransportBindingType_Protocol();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.UseTypeImpl
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getUseType()
		 * @generated
		 */
		EClass USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_TYPE__LIBRARY = eINSTANCE.getUseType_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.NameType <em>Name Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.NameType
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameType()
		 * @generated
		 */
		EEnum NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link technology.ecoa.logicalsystem._2.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.TypeType
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Name Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.NameType
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getNameTypeObject()
		 * @generated
		 */
		EDataType NAME_TYPE_OBJECT = eINSTANCE.getNameTypeObject();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.ProgrammingLanguage
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.logicalsystem._2.TypeType
		 * @see technology.ecoa.logicalsystem._2.impl.logPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //logPackage
