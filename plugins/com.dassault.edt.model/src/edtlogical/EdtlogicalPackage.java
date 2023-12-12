/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see edtlogical.EdtlogicalFactory
 * @model kind="package"
 * @generated
 */
public interface EdtlogicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtlogical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edtlogical";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edtlogical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtlogicalPackage eINSTANCE = edtlogical.impl.EdtlogicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtlogical.impl.LogicalSystemImpl <em>Logical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalSystemImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalSystem()
	 * @generated
	 */
	int LOGICAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>File Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__FILE_NAME_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Logical Computing Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS = 1;

	/**
	 * The feature id for the '<em><b>Logical Computing Platform Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM__ID = 3;

	/**
	 * The number of structural features of the '<em>Logical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Logical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtlogical.impl.LogicalComputingPlatformImpl <em>Logical Computing Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalComputingPlatformImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingPlatform()
	 * @generated
	 */
	int LOGICAL_COMPUTING_PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Logical Computing Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES = 0;

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
	 * The meta object id for the '{@link edtlogical.impl.LogicalComputingPlatformLinkImpl <em>Logical Computing Platform Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalComputingPlatformLinkImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingPlatformLink()
	 * @generated
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__ID = 0;

	/**
	 * The feature id for the '<em><b>Throughput Mega Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND = 1;

	/**
	 * The feature id for the '<em><b>Latency Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__LATENCY_MICRO_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__TO = 4;

	/**
	 * The feature id for the '<em><b>Transport Binding Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Transport Binding Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PROTOCOL = 6;

	/**
	 * The number of structural features of the '<em>Logical Computing Platform Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Logical Computing Platform Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_PLATFORM_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtlogical.impl.LogicalComputingNodeLinkImpl <em>Logical Computing Node Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalComputingNodeLinkImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingNodeLink()
	 * @generated
	 */
	int LOGICAL_COMPUTING_NODE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK__ID = 0;

	/**
	 * The feature id for the '<em><b>Throughput Mega Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND = 1;

	/**
	 * The feature id for the '<em><b>Latency Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK__TO = 4;

	/**
	 * The number of structural features of the '<em>Logical Computing Node Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Logical Computing Node Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtlogical.impl.LogicalComputingNodeImpl <em>Logical Computing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalComputingNodeImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingNode()
	 * @generated
	 */
	int LOGICAL_COMPUTING_NODE = 4;

	/**
	 * The feature id for the '<em><b>Logical Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__ID = 1;

	/**
	 * The feature id for the '<em><b>Endianess Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Module Switch Time Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS = 3;

	/**
	 * The feature id for the '<em><b>Available Memory Giga Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES = 4;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__OS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__OS_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Protection Domain Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK = 7;

	/**
	 * The number of structural features of the '<em>Logical Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Logical Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPUTING_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtlogical.impl.LogicalProcessorImpl <em>Logical Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtlogical.impl.LogicalProcessorImpl
	 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalProcessor()
	 * @generated
	 */
	int LOGICAL_PROCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSOR__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Step Duration Nano Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS = 2;

	/**
	 * The number of structural features of the '<em>Logical Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logical Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical System</em>'.
	 * @see edtlogical.LogicalSystem
	 * @generated
	 */
	EClass getLogicalSystem();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalSystem#getFileNamePrefix <em>File Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name Prefix</em>'.
	 * @see edtlogical.LogicalSystem#getFileNamePrefix()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EAttribute getLogicalSystem_FileNamePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link edtlogical.LogicalSystem#getLogicalComputingPlatforms <em>Logical Computing Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Platforms</em>'.
	 * @see edtlogical.LogicalSystem#getLogicalComputingPlatforms()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EReference getLogicalSystem_LogicalComputingPlatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link edtlogical.LogicalSystem#getLogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Platform Links</em>'.
	 * @see edtlogical.LogicalSystem#getLogicalComputingPlatformLinks()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EReference getLogicalSystem_LogicalComputingPlatformLinks();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtlogical.LogicalSystem#getId()
	 * @see #getLogicalSystem()
	 * @generated
	 */
	EAttribute getLogicalSystem_Id();

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalComputingPlatform <em>Logical Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Platform</em>'.
	 * @see edtlogical.LogicalComputingPlatform
	 * @generated
	 */
	EClass getLogicalComputingPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link edtlogical.LogicalComputingPlatform#getLogicalComputingNodes <em>Logical Computing Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Nodes</em>'.
	 * @see edtlogical.LogicalComputingPlatform#getLogicalComputingNodes()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EReference getLogicalComputingPlatform_LogicalComputingNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link edtlogical.LogicalComputingPlatform#getLogicalComputingNodeLinks <em>Logical Computing Node Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Computing Node Links</em>'.
	 * @see edtlogical.LogicalComputingPlatform#getLogicalComputingNodeLinks()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EReference getLogicalComputingPlatform_LogicalComputingNodeLinks();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatform#getELIPlatformId <em>ELI Platform Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELI Platform Id</em>'.
	 * @see edtlogical.LogicalComputingPlatform#getELIPlatformId()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatform_ELIPlatformId();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatform#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtlogical.LogicalComputingPlatform#getId()
	 * @see #getLogicalComputingPlatform()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatform_Id();

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalComputingPlatformLink <em>Logical Computing Platform Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Platform Link</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink
	 * @generated
	 */
	EClass getLogicalComputingPlatformLink();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatformLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getId()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatformLink_Id();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatformLink#getThroughputMegaBytesPerSecond <em>Throughput Mega Bytes Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Mega Bytes Per Second</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getThroughputMegaBytesPerSecond()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatformLink_ThroughputMegaBytesPerSecond();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatformLink#getLatencyMicroSeconds <em>Latency Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Micro Seconds</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getLatencyMicroSeconds()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatformLink_LatencyMicroSeconds();

	/**
	 * Returns the meta object for the reference '{@link edtlogical.LogicalComputingPlatformLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getFrom()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EReference getLogicalComputingPlatformLink_From();

	/**
	 * Returns the meta object for the reference '{@link edtlogical.LogicalComputingPlatformLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getTo()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EReference getLogicalComputingPlatformLink_To();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingParameters <em>Transport Binding Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Binding Parameters</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getTransportBindingParameters()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatformLink_TransportBindingParameters();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingProtocol <em>Transport Binding Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Binding Protocol</em>'.
	 * @see edtlogical.LogicalComputingPlatformLink#getTransportBindingProtocol()
	 * @see #getLogicalComputingPlatformLink()
	 * @generated
	 */
	EAttribute getLogicalComputingPlatformLink_TransportBindingProtocol();

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalComputingNodeLink <em>Logical Computing Node Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Node Link</em>'.
	 * @see edtlogical.LogicalComputingNodeLink
	 * @generated
	 */
	EClass getLogicalComputingNodeLink();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNodeLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtlogical.LogicalComputingNodeLink#getId()
	 * @see #getLogicalComputingNodeLink()
	 * @generated
	 */
	EAttribute getLogicalComputingNodeLink_Id();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNodeLink#getThroughputMegaBytesPerSecond <em>Throughput Mega Bytes Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Mega Bytes Per Second</em>'.
	 * @see edtlogical.LogicalComputingNodeLink#getThroughputMegaBytesPerSecond()
	 * @see #getLogicalComputingNodeLink()
	 * @generated
	 */
	EAttribute getLogicalComputingNodeLink_ThroughputMegaBytesPerSecond();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNodeLink#getLatencyMicroSeconds <em>Latency Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Micro Seconds</em>'.
	 * @see edtlogical.LogicalComputingNodeLink#getLatencyMicroSeconds()
	 * @see #getLogicalComputingNodeLink()
	 * @generated
	 */
	EAttribute getLogicalComputingNodeLink_LatencyMicroSeconds();

	/**
	 * Returns the meta object for the reference '{@link edtlogical.LogicalComputingNodeLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edtlogical.LogicalComputingNodeLink#getFrom()
	 * @see #getLogicalComputingNodeLink()
	 * @generated
	 */
	EReference getLogicalComputingNodeLink_From();

	/**
	 * Returns the meta object for the reference '{@link edtlogical.LogicalComputingNodeLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edtlogical.LogicalComputingNodeLink#getTo()
	 * @see #getLogicalComputingNodeLink()
	 * @generated
	 */
	EReference getLogicalComputingNodeLink_To();

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalComputingNode <em>Logical Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Computing Node</em>'.
	 * @see edtlogical.LogicalComputingNode
	 * @generated
	 */
	EClass getLogicalComputingNode();

	/**
	 * Returns the meta object for the containment reference list '{@link edtlogical.LogicalComputingNode#getLogicalProcessors <em>Logical Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Processors</em>'.
	 * @see edtlogical.LogicalComputingNode#getLogicalProcessors()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EReference getLogicalComputingNode_LogicalProcessors();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtlogical.LogicalComputingNode#getId()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getEndianessType <em>Endianess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianess Type</em>'.
	 * @see edtlogical.LogicalComputingNode#getEndianessType()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_EndianessType();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getModuleSwitchTimeMicroSeconds <em>Module Switch Time Micro Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Switch Time Micro Seconds</em>'.
	 * @see edtlogical.LogicalComputingNode#getModuleSwitchTimeMicroSeconds()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_ModuleSwitchTimeMicroSeconds();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getAvailableMemoryGigaBytes <em>Available Memory Giga Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Memory Giga Bytes</em>'.
	 * @see edtlogical.LogicalComputingNode#getAvailableMemoryGigaBytes()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_AvailableMemoryGigaBytes();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getOsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Name</em>'.
	 * @see edtlogical.LogicalComputingNode#getOsName()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_OsName();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalComputingNode#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see edtlogical.LogicalComputingNode#getOsVersion()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EAttribute getLogicalComputingNode_OsVersion();

	/**
	 * Returns the meta object for the reference list '{@link edtlogical.LogicalComputingNode#getProtectionDomainLink <em>Protection Domain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protection Domain Link</em>'.
	 * @see edtlogical.LogicalComputingNode#getProtectionDomainLink()
	 * @see #getLogicalComputingNode()
	 * @generated
	 */
	EReference getLogicalComputingNode_ProtectionDomainLink();

	/**
	 * Returns the meta object for class '{@link edtlogical.LogicalProcessor <em>Logical Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Processor</em>'.
	 * @see edtlogical.LogicalProcessor
	 * @generated
	 */
	EClass getLogicalProcessor();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalProcessor#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see edtlogical.LogicalProcessor#getNumber()
	 * @see #getLogicalProcessor()
	 * @generated
	 */
	EAttribute getLogicalProcessor_Number();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalProcessor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edtlogical.LogicalProcessor#getType()
	 * @see #getLogicalProcessor()
	 * @generated
	 */
	EAttribute getLogicalProcessor_Type();

	/**
	 * Returns the meta object for the attribute '{@link edtlogical.LogicalProcessor#getStepDurationNanoSeconds <em>Step Duration Nano Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Duration Nano Seconds</em>'.
	 * @see edtlogical.LogicalProcessor#getStepDurationNanoSeconds()
	 * @see #getLogicalProcessor()
	 * @generated
	 */
	EAttribute getLogicalProcessor_StepDurationNanoSeconds();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtlogicalFactory getEdtlogicalFactory();

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
		 * The meta object literal for the '{@link edtlogical.impl.LogicalSystemImpl <em>Logical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalSystemImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalSystem()
		 * @generated
		 */
		EClass LOGICAL_SYSTEM = eINSTANCE.getLogicalSystem();

		/**
		 * The meta object literal for the '<em><b>File Name Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_SYSTEM__FILE_NAME_PREFIX = eINSTANCE.getLogicalSystem_FileNamePrefix();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS = eINSTANCE.getLogicalSystem_LogicalComputingPlatforms();

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
		 * The meta object literal for the '{@link edtlogical.impl.LogicalComputingPlatformImpl <em>Logical Computing Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalComputingPlatformImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingPlatform()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_PLATFORM = eINSTANCE.getLogicalComputingPlatform();

		/**
		 * The meta object literal for the '<em><b>Logical Computing Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES = eINSTANCE.getLogicalComputingPlatform_LogicalComputingNodes();

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
		 * The meta object literal for the '{@link edtlogical.impl.LogicalComputingPlatformLinkImpl <em>Logical Computing Platform Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalComputingPlatformLinkImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingPlatformLink()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_PLATFORM_LINK = eINSTANCE.getLogicalComputingPlatformLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM_LINK__ID = eINSTANCE.getLogicalComputingPlatformLink_Id();

		/**
		 * The meta object literal for the '<em><b>Throughput Mega Bytes Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND = eINSTANCE.getLogicalComputingPlatformLink_ThroughputMegaBytesPerSecond();

		/**
		 * The meta object literal for the '<em><b>Latency Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM_LINK__LATENCY_MICRO_SECONDS = eINSTANCE.getLogicalComputingPlatformLink_LatencyMicroSeconds();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM_LINK__FROM = eINSTANCE.getLogicalComputingPlatformLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_PLATFORM_LINK__TO = eINSTANCE.getLogicalComputingPlatformLink_To();

		/**
		 * The meta object literal for the '<em><b>Transport Binding Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PARAMETERS = eINSTANCE.getLogicalComputingPlatformLink_TransportBindingParameters();

		/**
		 * The meta object literal for the '<em><b>Transport Binding Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PROTOCOL = eINSTANCE.getLogicalComputingPlatformLink_TransportBindingProtocol();

		/**
		 * The meta object literal for the '{@link edtlogical.impl.LogicalComputingNodeLinkImpl <em>Logical Computing Node Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalComputingNodeLinkImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingNodeLink()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_NODE_LINK = eINSTANCE.getLogicalComputingNodeLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE_LINK__ID = eINSTANCE.getLogicalComputingNodeLink_Id();

		/**
		 * The meta object literal for the '<em><b>Throughput Mega Bytes Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND = eINSTANCE.getLogicalComputingNodeLink_ThroughputMegaBytesPerSecond();

		/**
		 * The meta object literal for the '<em><b>Latency Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS = eINSTANCE.getLogicalComputingNodeLink_LatencyMicroSeconds();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_LINK__FROM = eINSTANCE.getLogicalComputingNodeLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE_LINK__TO = eINSTANCE.getLogicalComputingNodeLink_To();

		/**
		 * The meta object literal for the '{@link edtlogical.impl.LogicalComputingNodeImpl <em>Logical Computing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalComputingNodeImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalComputingNode()
		 * @generated
		 */
		EClass LOGICAL_COMPUTING_NODE = eINSTANCE.getLogicalComputingNode();

		/**
		 * The meta object literal for the '<em><b>Logical Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS = eINSTANCE.getLogicalComputingNode_LogicalProcessors();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__ID = eINSTANCE.getLogicalComputingNode_Id();

		/**
		 * The meta object literal for the '<em><b>Endianess Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE = eINSTANCE.getLogicalComputingNode_EndianessType();

		/**
		 * The meta object literal for the '<em><b>Module Switch Time Micro Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS = eINSTANCE.getLogicalComputingNode_ModuleSwitchTimeMicroSeconds();

		/**
		 * The meta object literal for the '<em><b>Available Memory Giga Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES = eINSTANCE.getLogicalComputingNode_AvailableMemoryGigaBytes();

		/**
		 * The meta object literal for the '<em><b>Os Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__OS_NAME = eINSTANCE.getLogicalComputingNode_OsName();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPUTING_NODE__OS_VERSION = eINSTANCE.getLogicalComputingNode_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Protection Domain Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK = eINSTANCE.getLogicalComputingNode_ProtectionDomainLink();

		/**
		 * The meta object literal for the '{@link edtlogical.impl.LogicalProcessorImpl <em>Logical Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtlogical.impl.LogicalProcessorImpl
		 * @see edtlogical.impl.EdtlogicalPackageImpl#getLogicalProcessor()
		 * @generated
		 */
		EClass LOGICAL_PROCESSOR = eINSTANCE.getLogicalProcessor();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PROCESSOR__NUMBER = eINSTANCE.getLogicalProcessor_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PROCESSOR__TYPE = eINSTANCE.getLogicalProcessor_Type();

		/**
		 * The meta object literal for the '<em><b>Step Duration Nano Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS = eINSTANCE.getLogicalProcessor_StepDurationNanoSeconds();

	}

} //EdtlogicalPackage
