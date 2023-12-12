/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

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
 * @see technology.ecoa.implementation._2.impFactory
 * @model kind="package"
 * @generated
 */
public interface impPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/implementation-2.0";

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
	impPackage eINSTANCE = technology.ecoa.implementation._2.impl.impPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ClientsTypeImpl <em>Clients Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ClientsTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getClientsType()
	 * @generated
	 */
	int CLIENTS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_TYPE__MODULE_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Clients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Clients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ComponentImplementationImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__USE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Module Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Module Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Trigger Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Dynamic Trigger Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__GROUP = 8;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__DATA_LINK = 9;

	/**
	 * The feature id for the '<em><b>Event Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__EVENT_LINK = 10;

	/**
	 * The feature id for the '<em><b>Request Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__REQUEST_LINK = 11;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION = 12;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.DataLinkImpl <em>Data Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.DataLinkImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataLink()
	 * @generated
	 */
	int DATA_LINK = 2;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__WRITERS = 0;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__READERS = 1;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__CONTROLLED = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__ID = 3;

	/**
	 * The number of structural features of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.VersionedDataImpl <em>Versioned Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.VersionedDataImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getVersionedData()
	 * @generated
	 */
	int VERSIONED_DATA = 41;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA__MAX_VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Versioned Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Versioned Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.DataReadTypeImpl <em>Data Read Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.DataReadTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataReadType()
	 * @generated
	 */
	int DATA_READ_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE__MAX_VERSIONS = VERSIONED_DATA__MAX_VERSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE__NAME = VERSIONED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE__TYPE = VERSIONED_DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Notifying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE__NOTIFYING = VERSIONED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Read Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE_FEATURE_COUNT = VERSIONED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Read Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READ_TYPE_OPERATION_COUNT = VERSIONED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.DataWrittenTypeImpl <em>Data Written Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.DataWrittenTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataWrittenType()
	 * @generated
	 */
	int DATA_WRITTEN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE__MAX_VERSIONS = VERSIONED_DATA__MAX_VERSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE__NAME = VERSIONED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE__TYPE = VERSIONED_DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE__WRITE_ONLY = VERSIONED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Written Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE_FEATURE_COUNT = VERSIONED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Written Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITTEN_TYPE_OPERATION_COUNT = VERSIONED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.DocumentRootImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Component Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_IMPLEMENTATION = 3;

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
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.InstanceImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__MODULE_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__RELATIVE_PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.DynamicTriggerInstanceImpl <em>Dynamic Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.DynamicTriggerInstanceImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDynamicTriggerInstance()
	 * @generated
	 */
	int DYNAMIC_TRIGGER_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR = INSTANCE__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY = INSTANCE__RELATIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__PARAMETER = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__SIZE = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamic Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.EventImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.EventLinkImpl <em>Event Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.EventLinkImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEventLink()
	 * @generated
	 */
	int EVENT_LINK = 8;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK__SENDERS = 0;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK__RECEIVERS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK__ID = 2;

	/**
	 * The number of structural features of the '<em>Event Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.EventReceivedTypeImpl <em>Event Received Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.EventReceivedTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEventReceivedType()
	 * @generated
	 */
	int EVENT_RECEIVED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_TYPE__INPUT = EVENT__INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_TYPE__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Event Received Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_TYPE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Received Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_TYPE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ModuleImplementationImpl <em>Module Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ModuleImplementationImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleImplementation()
	 * @generated
	 */
	int MODULE_IMPLEMENTATION = 11;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__MODULE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ModuleInstanceImpl <em>Module Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ModuleInstanceImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleInstance()
	 * @generated
	 */
	int MODULE_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__MODULE_BEHAVIOUR = INSTANCE__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__RELATIVE_PRIORITY = INSTANCE__RELATIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__PROPERTY_VALUES = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__PINFO = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__IMPLEMENTATION_NAME = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl <em>Module Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ModuleTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleType()
	 * @generated
	 */
	int MODULE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Pinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__PINFO = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Activating Fault Notifs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__ACTIVATING_FAULT_NOTIFS = 3;

	/**
	 * The feature id for the '<em><b>Has User Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__HAS_USER_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Has Warm Start Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__HAS_WARM_START_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Is Fault Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__IS_FAULT_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OperationsTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOperationsType()
	 * @generated
	 */
	int OPERATIONS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Data Written</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__DATA_WRITTEN = 1;

	/**
	 * The feature id for the '<em><b>Data Read</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__DATA_READ = 2;

	/**
	 * The feature id for the '<em><b>Event Sent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__EVENT_SENT = 3;

	/**
	 * The feature id for the '<em><b>Event Received</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__EVENT_RECEIVED = 4;

	/**
	 * The feature id for the '<em><b>Request Sent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__REQUEST_SENT = 5;

	/**
	 * The feature id for the '<em><b>Request Received</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__REQUEST_RECEIVED = 6;

	/**
	 * The number of structural features of the '<em>Operations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Operations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefImpl <em>Op Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRef()
	 * @generated
	 */
	int OP_REF = 15;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF__INSTANCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF__OPERATION_NAME = 1;

	/**
	 * The number of structural features of the '<em>Op Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Op Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatableImpl <em>Op Ref Activatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefActivatableImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatable()
	 * @generated
	 */
	int OP_REF_ACTIVATABLE = 16;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE__INSTANCE_NAME = OP_REF__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE__OPERATION_NAME = OP_REF__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE__ACTIVATING = OP_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Ref Activatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FEATURE_COUNT = OP_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Ref Activatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_OPERATION_COUNT = OP_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatableFifoImpl <em>Op Ref Activatable Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefActivatableFifoImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatableFifo()
	 * @generated
	 */
	int OP_REF_ACTIVATABLE_FIFO = 17;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO__INSTANCE_NAME = OP_REF_ACTIVATABLE__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO__OPERATION_NAME = OP_REF_ACTIVATABLE__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO__ACTIVATING = OP_REF_ACTIVATABLE__ACTIVATING;

	/**
	 * The feature id for the '<em><b>Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO__FIFO_SIZE = OP_REF_ACTIVATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Ref Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO_FEATURE_COUNT = OP_REF_ACTIVATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Ref Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATABLE_FIFO_OPERATION_COUNT = OP_REF_ACTIVATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatingFifoImpl <em>Op Ref Activating Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefActivatingFifoImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatingFifo()
	 * @generated
	 */
	int OP_REF_ACTIVATING_FIFO = 18;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATING_FIFO__INSTANCE_NAME = OP_REF__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATING_FIFO__OPERATION_NAME = OP_REF__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATING_FIFO__FIFO_SIZE = OP_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Ref Activating Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATING_FIFO_FEATURE_COUNT = OP_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Ref Activating Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_ACTIVATING_FIFO_OPERATION_COUNT = OP_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefExternalImpl <em>Op Ref External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefExternalImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefExternal()
	 * @generated
	 */
	int OP_REF_EXTERNAL = 19;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_EXTERNAL__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_EXTERNAL__OPERATION_NAME = 1;

	/**
	 * The number of structural features of the '<em>Op Ref External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_EXTERNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Op Ref External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_EXTERNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.OpRefTriggerImpl <em>Op Ref Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.OpRefTriggerImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefTrigger()
	 * @generated
	 */
	int OP_REF_TRIGGER = 20;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_TRIGGER__INSTANCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_TRIGGER__PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Op Ref Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Op Ref Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_REF_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ParameterImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PinfoTypeImpl <em>Pinfo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PinfoTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoType()
	 * @generated
	 */
	int PINFO_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Public Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE__PUBLIC_PINFO = 0;

	/**
	 * The feature id for the '<em><b>Private Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE__PRIVATE_PINFO = 1;

	/**
	 * The number of structural features of the '<em>Pinfo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pinfo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PinfoType1Impl <em>Pinfo Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PinfoType1Impl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoType1()
	 * @generated
	 */
	int PINFO_TYPE1 = 23;

	/**
	 * The feature id for the '<em><b>Public Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE1__PUBLIC_PINFO = 0;

	/**
	 * The feature id for the '<em><b>Private Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE1__PRIVATE_PINFO = 1;

	/**
	 * The number of structural features of the '<em>Pinfo Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pinfo Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PinfoValueImpl <em>Pinfo Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PinfoValueImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoValue()
	 * @generated
	 */
	int PINFO_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PrivatePinfoImpl <em>Private Pinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PrivatePinfoImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPrivatePinfo()
	 * @generated
	 */
	int PRIVATE_PINFO = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Private Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Private Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PropertiesTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PropertyValueImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PropertyValuesImpl <em>Property Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PropertyValuesImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertyValues()
	 * @generated
	 */
	int PROPERTY_VALUES = 28;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES__PROPERTY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.PublicPinfoImpl <em>Public Pinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.PublicPinfoImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPublicPinfo()
	 * @generated
	 */
	int PUBLIC_PINFO = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Public Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Public Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ReadersTypeImpl <em>Readers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ReadersTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getReadersType()
	 * @generated
	 */
	int READERS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READERS_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READERS_TYPE__MODULE_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Readers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READERS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Readers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ReceiversTypeImpl <em>Receivers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ReceiversTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getReceiversType()
	 * @generated
	 */
	int RECEIVERS_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE__MODULE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Dynamic Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE__DYNAMIC_TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Receivers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Receivers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.RequestLinkImpl <em>Request Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.RequestLinkImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestLink()
	 * @generated
	 */
	int REQUEST_LINK = 32;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK__CLIENTS = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK__SERVER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK__ID = 2;

	/**
	 * The number of structural features of the '<em>Request Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.RequestResponseImpl <em>Request Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.RequestResponseImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestResponse()
	 * @generated
	 */
	int REQUEST_RESPONSE = 34;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.RequestReceivedTypeImpl <em>Request Received Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.RequestReceivedTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestReceivedType()
	 * @generated
	 */
	int REQUEST_RECEIVED_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE__INPUT = REQUEST_RESPONSE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE__OUTPUT = REQUEST_RESPONSE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE__NAME = REQUEST_RESPONSE__NAME;

	/**
	 * The feature id for the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS = REQUEST_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Received Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE_FEATURE_COUNT = REQUEST_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Received Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_TYPE_OPERATION_COUNT = REQUEST_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.RequestSentTypeImpl <em>Request Sent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.RequestSentTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestSentType()
	 * @generated
	 */
	int REQUEST_SENT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__INPUT = REQUEST_RESPONSE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__OUTPUT = REQUEST_RESPONSE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__NAME = REQUEST_RESPONSE__NAME;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__IS_SYNCHRONOUS = REQUEST_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__MAX_CONCURRENT_REQUESTS = REQUEST_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE__TIMEOUT = REQUEST_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Request Sent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE_FEATURE_COUNT = REQUEST_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Request Sent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_TYPE_OPERATION_COUNT = REQUEST_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.SendersTypeImpl <em>Senders Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.SendersTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getSendersType()
	 * @generated
	 */
	int SENDERS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__MODULE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Dynamic Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__DYNAMIC_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE__EXTERNAL = 6;

	/**
	 * The number of structural features of the '<em>Senders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Senders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ServerTypeImpl <em>Server Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ServerTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getServerType()
	 * @generated
	 */
	int SERVER_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TYPE__MODULE_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Server Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Server Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.ServiceQoSImpl <em>Service Qo S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.ServiceQoSImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getServiceQoS()
	 * @generated
	 */
	int SERVICE_QO_S = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QO_S__NAME = 0;

	/**
	 * The feature id for the '<em><b>New Qo S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QO_S__NEW_QO_S = 1;

	/**
	 * The number of structural features of the '<em>Service Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QO_S_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QO_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.TriggerInstanceImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTriggerInstance()
	 * @generated
	 */
	int TRIGGER_INSTANCE = 39;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__MODULE_BEHAVIOUR = INSTANCE__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__RELATIVE_PRIORITY = INSTANCE__RELATIVE_PRIORITY;

	/**
	 * The number of structural features of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.UseTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 40;

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
	 * The meta object id for the '{@link technology.ecoa.implementation._2.impl.WritersTypeImpl <em>Writers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.WritersTypeImpl
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getWritersType()
	 * @generated
	 */
	int WRITERS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITERS_TYPE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITERS_TYPE__MODULE_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Writers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITERS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Writers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.implementation._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 43;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 44;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 45;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 46;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Relative Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRelativePriority()
	 * @generated
	 */
	int RELATIVE_PRIORITY = 48;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 49;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 51;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 53;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 54;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ClientsType <em>Clients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clients Type</em>'.
	 * @see technology.ecoa.implementation._2.ClientsType
	 * @generated
	 */
	EClass getClientsType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.ClientsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.ClientsType#getGroup()
	 * @see #getClientsType()
	 * @generated
	 */
	EAttribute getClientsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ClientsType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see technology.ecoa.implementation._2.ClientsType#getService()
	 * @see #getClientsType()
	 * @generated
	 */
	EReference getClientsType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ClientsType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ClientsType#getModuleInstance()
	 * @see #getClientsType()
	 * @generated
	 */
	EReference getClientsType_ModuleInstance();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getUse()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getService()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getReference()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Type</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getModuleType()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Implementation</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getModuleImplementation()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getModuleInstance()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getTriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Instance</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getTriggerInstance()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_TriggerInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getDynamicTriggerInstance <em>Dynamic Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Trigger Instance</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getDynamicTriggerInstance()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_DynamicTriggerInstance();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.ComponentImplementation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getGroup()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EAttribute getComponentImplementation_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Link</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getDataLink()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_DataLink();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getEventLink <em>Event Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Link</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getEventLink()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_EventLink();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ComponentImplementation#getRequestLink <em>Request Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Link</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getRequestLink()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_RequestLink();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Definition</em>'.
	 * @see technology.ecoa.implementation._2.ComponentImplementation#getComponentDefinition()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EAttribute getComponentImplementation_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link</em>'.
	 * @see technology.ecoa.implementation._2.DataLink
	 * @generated
	 */
	EClass getDataLink();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.DataLink#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Writers</em>'.
	 * @see technology.ecoa.implementation._2.DataLink#getWriters()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Writers();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.DataLink#getReaders <em>Readers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Readers</em>'.
	 * @see technology.ecoa.implementation._2.DataLink#getReaders()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Readers();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.DataLink#isControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlled</em>'.
	 * @see technology.ecoa.implementation._2.DataLink#isControlled()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Controlled();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.DataLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.implementation._2.DataLink#getId()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.DataReadType <em>Data Read Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Read Type</em>'.
	 * @see technology.ecoa.implementation._2.DataReadType
	 * @generated
	 */
	EClass getDataReadType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.DataReadType#isNotifying <em>Notifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notifying</em>'.
	 * @see technology.ecoa.implementation._2.DataReadType#isNotifying()
	 * @see #getDataReadType()
	 * @generated
	 */
	EAttribute getDataReadType_Notifying();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.DataWrittenType <em>Data Written Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Written Type</em>'.
	 * @see technology.ecoa.implementation._2.DataWrittenType
	 * @generated
	 */
	EClass getDataWrittenType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.DataWrittenType#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see technology.ecoa.implementation._2.DataWrittenType#isWriteOnly()
	 * @see #getDataWrittenType()
	 * @generated
	 */
	EAttribute getDataWrittenType_WriteOnly();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.implementation._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.implementation._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.DocumentRoot#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Implementation</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot#getComponentImplementation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.implementation._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.DynamicTriggerInstance <em>Dynamic Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Trigger Instance</em>'.
	 * @see technology.ecoa.implementation._2.DynamicTriggerInstance
	 * @generated
	 */
	EClass getDynamicTriggerInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see technology.ecoa.implementation._2.DynamicTriggerInstance#getParameter()
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 */
	EReference getDynamicTriggerInstance_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.DynamicTriggerInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see technology.ecoa.implementation._2.DynamicTriggerInstance#getSize()
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 */
	EAttribute getDynamicTriggerInstance_Size();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see technology.ecoa.implementation._2.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.Event#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see technology.ecoa.implementation._2.Event#getInput()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Input();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.EventLink <em>Event Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link</em>'.
	 * @see technology.ecoa.implementation._2.EventLink
	 * @generated
	 */
	EClass getEventLink();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.EventLink#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Senders</em>'.
	 * @see technology.ecoa.implementation._2.EventLink#getSenders()
	 * @see #getEventLink()
	 * @generated
	 */
	EReference getEventLink_Senders();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.EventLink#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receivers</em>'.
	 * @see technology.ecoa.implementation._2.EventLink#getReceivers()
	 * @see #getEventLink()
	 * @generated
	 */
	EReference getEventLink_Receivers();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.EventLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.implementation._2.EventLink#getId()
	 * @see #getEventLink()
	 * @generated
	 */
	EAttribute getEventLink_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.EventReceivedType <em>Event Received Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Received Type</em>'.
	 * @see technology.ecoa.implementation._2.EventReceivedType
	 * @generated
	 */
	EClass getEventReceivedType();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see technology.ecoa.implementation._2.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Instance#getModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Behaviour</em>'.
	 * @see technology.ecoa.implementation._2.Instance#getModuleBehaviour()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ModuleBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Instance#getRelativePriority <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Priority</em>'.
	 * @see technology.ecoa.implementation._2.Instance#getRelativePriority()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_RelativePriority();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Implementation</em>'.
	 * @see technology.ecoa.implementation._2.ModuleImplementation
	 * @generated
	 */
	EClass getModuleImplementation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleImplementation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see technology.ecoa.implementation._2.ModuleImplementation#getLanguage()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EAttribute getModuleImplementation_Language();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleImplementation#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Type</em>'.
	 * @see technology.ecoa.implementation._2.ModuleImplementation#getModuleType()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EAttribute getModuleImplementation_ModuleType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.ModuleImplementation#getName()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EAttribute getModuleImplementation_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ModuleInstance
	 * @generated
	 */
	EClass getModuleInstance();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ModuleInstance#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Values</em>'.
	 * @see technology.ecoa.implementation._2.ModuleInstance#getPropertyValues()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_PropertyValues();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ModuleInstance#getPinfo <em>Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.ModuleInstance#getPinfo()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_Pinfo();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleInstance#getImplementationName <em>Implementation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Name</em>'.
	 * @see technology.ecoa.implementation._2.ModuleInstance#getImplementationName()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EAttribute getModuleInstance_ImplementationName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Type</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType
	 * @generated
	 */
	EClass getModuleType();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ModuleType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#getProperties()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ModuleType#getPinfo <em>Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#getPinfo()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Pinfo();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ModuleType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#getOperations()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Operations();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activating Fault Notifs</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_ActivatingFaultNotifs();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleType#isHasUserContext <em>Has User Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has User Context</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#isHasUserContext()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_HasUserContext();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Warm Start Context</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_HasWarmStartContext();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fault Handler</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#isIsFaultHandler()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_IsFaultHandler();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ModuleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.ModuleType#getName()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OperationsType <em>Operations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Type</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType
	 * @generated
	 */
	EClass getOperationsType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.OperationsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getGroup()
	 * @see #getOperationsType()
	 * @generated
	 */
	EAttribute getOperationsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getDataWritten <em>Data Written</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Written</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getDataWritten()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_DataWritten();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getDataRead <em>Data Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Read</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getDataRead()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_DataRead();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getEventSent <em>Event Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Sent</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getEventSent()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_EventSent();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getEventReceived <em>Event Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Received</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getEventReceived()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_EventReceived();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getRequestSent <em>Request Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Sent</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getRequestSent()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_RequestSent();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.OperationsType#getRequestReceived <em>Request Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Received</em>'.
	 * @see technology.ecoa.implementation._2.OperationsType#getRequestReceived()
	 * @see #getOperationsType()
	 * @generated
	 */
	EReference getOperationsType_RequestReceived();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRef <em>Op Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref</em>'.
	 * @see technology.ecoa.implementation._2.OpRef
	 * @generated
	 */
	EClass getOpRef();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRef#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.implementation._2.OpRef#getInstanceName()
	 * @see #getOpRef()
	 * @generated
	 */
	EAttribute getOpRef_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRef#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see technology.ecoa.implementation._2.OpRef#getOperationName()
	 * @see #getOpRef()
	 * @generated
	 */
	EAttribute getOpRef_OperationName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRefActivatable <em>Op Ref Activatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref Activatable</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatable
	 * @generated
	 */
	EClass getOpRefActivatable();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefActivatable#isActivating <em>Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activating</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatable#isActivating()
	 * @see #getOpRefActivatable()
	 * @generated
	 */
	EAttribute getOpRefActivatable_Activating();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRefActivatableFifo <em>Op Ref Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref Activatable Fifo</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatableFifo
	 * @generated
	 */
	EClass getOpRefActivatableFifo();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize <em>Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fifo Size</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize()
	 * @see #getOpRefActivatableFifo()
	 * @generated
	 */
	EAttribute getOpRefActivatableFifo_FifoSize();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRefActivatingFifo <em>Op Ref Activating Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref Activating Fifo</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatingFifo
	 * @generated
	 */
	EClass getOpRefActivatingFifo();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefActivatingFifo#getFifoSize <em>Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fifo Size</em>'.
	 * @see technology.ecoa.implementation._2.OpRefActivatingFifo#getFifoSize()
	 * @see #getOpRefActivatingFifo()
	 * @generated
	 */
	EAttribute getOpRefActivatingFifo_FifoSize();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRefExternal <em>Op Ref External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref External</em>'.
	 * @see technology.ecoa.implementation._2.OpRefExternal
	 * @generated
	 */
	EClass getOpRefExternal();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefExternal#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see technology.ecoa.implementation._2.OpRefExternal#getLanguage()
	 * @see #getOpRefExternal()
	 * @generated
	 */
	EAttribute getOpRefExternal_Language();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefExternal#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see technology.ecoa.implementation._2.OpRefExternal#getOperationName()
	 * @see #getOpRefExternal()
	 * @generated
	 */
	EAttribute getOpRefExternal_OperationName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.OpRefTrigger <em>Op Ref Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Ref Trigger</em>'.
	 * @see technology.ecoa.implementation._2.OpRefTrigger
	 * @generated
	 */
	EClass getOpRefTrigger();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefTrigger#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.implementation._2.OpRefTrigger#getInstanceName()
	 * @see #getOpRefTrigger()
	 * @generated
	 */
	EAttribute getOpRefTrigger_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.OpRefTrigger#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see technology.ecoa.implementation._2.OpRefTrigger#getPeriod()
	 * @see #getOpRefTrigger()
	 * @generated
	 */
	EAttribute getOpRefTrigger_Period();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see technology.ecoa.implementation._2.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.implementation._2.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PinfoType <em>Pinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinfo Type</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType
	 * @generated
	 */
	EClass getPinfoType();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PinfoType#getPublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType#getPublicPinfo()
	 * @see #getPinfoType()
	 * @generated
	 */
	EReference getPinfoType_PublicPinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PinfoType#getPrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType#getPrivatePinfo()
	 * @see #getPinfoType()
	 * @generated
	 */
	EReference getPinfoType_PrivatePinfo();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PinfoType1 <em>Pinfo Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinfo Type1</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType1
	 * @generated
	 */
	EClass getPinfoType1();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PinfoType1#getPublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType1#getPublicPinfo()
	 * @see #getPinfoType1()
	 * @generated
	 */
	EReference getPinfoType1_PublicPinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PinfoType1#getPrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PinfoType1#getPrivatePinfo()
	 * @see #getPinfoType1()
	 * @generated
	 */
	EReference getPinfoType1_PrivatePinfo();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PinfoValue <em>Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinfo Value</em>'.
	 * @see technology.ecoa.implementation._2.PinfoValue
	 * @generated
	 */
	EClass getPinfoValue();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PinfoValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.implementation._2.PinfoValue#getValue()
	 * @see #getPinfoValue()
	 * @generated
	 */
	EAttribute getPinfoValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PinfoValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.PinfoValue#getName()
	 * @see #getPinfoValue()
	 * @generated
	 */
	EAttribute getPinfoValue_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PrivatePinfo
	 * @generated
	 */
	EClass getPrivatePinfo();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PrivatePinfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.PrivatePinfo#getName()
	 * @see #getPrivatePinfo()
	 * @generated
	 */
	EAttribute getPrivatePinfo_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see technology.ecoa.implementation._2.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see technology.ecoa.implementation._2.PropertiesType#getProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see technology.ecoa.implementation._2.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.implementation._2.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PropertyValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.PropertyValue#getName()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Values</em>'.
	 * @see technology.ecoa.implementation._2.PropertyValues
	 * @generated
	 */
	EClass getPropertyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.PropertyValues#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Value</em>'.
	 * @see technology.ecoa.implementation._2.PropertyValues#getPropertyValue()
	 * @see #getPropertyValues()
	 * @generated
	 */
	EReference getPropertyValues_PropertyValue();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.PublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Pinfo</em>'.
	 * @see technology.ecoa.implementation._2.PublicPinfo
	 * @generated
	 */
	EClass getPublicPinfo();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.PublicPinfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.PublicPinfo#getName()
	 * @see #getPublicPinfo()
	 * @generated
	 */
	EAttribute getPublicPinfo_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ReadersType <em>Readers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Readers Type</em>'.
	 * @see technology.ecoa.implementation._2.ReadersType
	 * @generated
	 */
	EClass getReadersType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.ReadersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.ReadersType#getGroup()
	 * @see #getReadersType()
	 * @generated
	 */
	EAttribute getReadersType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReadersType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see technology.ecoa.implementation._2.ReadersType#getService()
	 * @see #getReadersType()
	 * @generated
	 */
	EReference getReadersType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReadersType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ReadersType#getModuleInstance()
	 * @see #getReadersType()
	 * @generated
	 */
	EReference getReadersType_ModuleInstance();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ReceiversType <em>Receivers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receivers Type</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType
	 * @generated
	 */
	EClass getReceiversType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.ReceiversType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType#getGroup()
	 * @see #getReceiversType()
	 * @generated
	 */
	EAttribute getReceiversType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReceiversType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType#getService()
	 * @see #getReceiversType()
	 * @generated
	 */
	EReference getReceiversType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReceiversType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType#getReference()
	 * @see #getReceiversType()
	 * @generated
	 */
	EReference getReceiversType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReceiversType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType#getModuleInstance()
	 * @see #getReceiversType()
	 * @generated
	 */
	EReference getReceiversType_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.ReceiversType#getDynamicTrigger <em>Dynamic Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Trigger</em>'.
	 * @see technology.ecoa.implementation._2.ReceiversType#getDynamicTrigger()
	 * @see #getReceiversType()
	 * @generated
	 */
	EReference getReceiversType_DynamicTrigger();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.RequestLink <em>Request Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link</em>'.
	 * @see technology.ecoa.implementation._2.RequestLink
	 * @generated
	 */
	EClass getRequestLink();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.RequestLink#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clients</em>'.
	 * @see technology.ecoa.implementation._2.RequestLink#getClients()
	 * @see #getRequestLink()
	 * @generated
	 */
	EReference getRequestLink_Clients();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.RequestLink#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see technology.ecoa.implementation._2.RequestLink#getServer()
	 * @see #getRequestLink()
	 * @generated
	 */
	EReference getRequestLink_Server();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see technology.ecoa.implementation._2.RequestLink#getId()
	 * @see #getRequestLink()
	 * @generated
	 */
	EAttribute getRequestLink_Id();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.RequestReceivedType <em>Request Received Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Received Type</em>'.
	 * @see technology.ecoa.implementation._2.RequestReceivedType
	 * @generated
	 */
	EClass getRequestReceivedType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Requests</em>'.
	 * @see technology.ecoa.implementation._2.RequestReceivedType#getMaxConcurrentRequests()
	 * @see #getRequestReceivedType()
	 * @generated
	 */
	EAttribute getRequestReceivedType_MaxConcurrentRequests();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response</em>'.
	 * @see technology.ecoa.implementation._2.RequestResponse
	 * @generated
	 */
	EClass getRequestResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.RequestResponse#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see technology.ecoa.implementation._2.RequestResponse#getInput()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.RequestResponse#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see technology.ecoa.implementation._2.RequestResponse#getOutput()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_Output();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestResponse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.RequestResponse#getName()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.RequestSentType <em>Request Sent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Sent Type</em>'.
	 * @see technology.ecoa.implementation._2.RequestSentType
	 * @generated
	 */
	EClass getRequestSentType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestSentType#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see technology.ecoa.implementation._2.RequestSentType#isIsSynchronous()
	 * @see #getRequestSentType()
	 * @generated
	 */
	EAttribute getRequestSentType_IsSynchronous();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Requests</em>'.
	 * @see technology.ecoa.implementation._2.RequestSentType#getMaxConcurrentRequests()
	 * @see #getRequestSentType()
	 * @generated
	 */
	EAttribute getRequestSentType_MaxConcurrentRequests();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.RequestSentType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see technology.ecoa.implementation._2.RequestSentType#getTimeout()
	 * @see #getRequestSentType()
	 * @generated
	 */
	EAttribute getRequestSentType_Timeout();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.SendersType <em>Senders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Senders Type</em>'.
	 * @see technology.ecoa.implementation._2.SendersType
	 * @generated
	 */
	EClass getSendersType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.SendersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getGroup()
	 * @see #getSendersType()
	 * @generated
	 */
	EAttribute getSendersType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getService()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getReference()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getModuleInstance()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_ModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getTrigger()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getDynamicTrigger <em>Dynamic Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Trigger</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getDynamicTrigger()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_DynamicTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.SendersType#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External</em>'.
	 * @see technology.ecoa.implementation._2.SendersType#getExternal()
	 * @see #getSendersType()
	 * @generated
	 */
	EReference getSendersType_External();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Type</em>'.
	 * @see technology.ecoa.implementation._2.ServerType
	 * @generated
	 */
	EClass getServerType();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ServerType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see technology.ecoa.implementation._2.ServerType#getReference()
	 * @see #getServerType()
	 * @generated
	 */
	EReference getServerType_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.implementation._2.ServerType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.ServerType#getModuleInstance()
	 * @see #getServerType()
	 * @generated
	 */
	EReference getServerType_ModuleInstance();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.ServiceQoS <em>Service Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Qo S</em>'.
	 * @see technology.ecoa.implementation._2.ServiceQoS
	 * @generated
	 */
	EClass getServiceQoS();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ServiceQoS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.ServiceQoS#getName()
	 * @see #getServiceQoS()
	 * @generated
	 */
	EAttribute getServiceQoS_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.ServiceQoS#getNewQoS <em>New Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Qo S</em>'.
	 * @see technology.ecoa.implementation._2.ServiceQoS#getNewQoS()
	 * @see #getServiceQoS()
	 * @generated
	 */
	EAttribute getServiceQoS_NewQoS();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Instance</em>'.
	 * @see technology.ecoa.implementation._2.TriggerInstance
	 * @generated
	 */
	EClass getTriggerInstance();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.implementation._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.implementation._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.VersionedData <em>Versioned Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data</em>'.
	 * @see technology.ecoa.implementation._2.VersionedData
	 * @generated
	 */
	EClass getVersionedData();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.VersionedData#getMaxVersions <em>Max Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Versions</em>'.
	 * @see technology.ecoa.implementation._2.VersionedData#getMaxVersions()
	 * @see #getVersionedData()
	 * @generated
	 */
	EAttribute getVersionedData_MaxVersions();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.VersionedData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.implementation._2.VersionedData#getName()
	 * @see #getVersionedData()
	 * @generated
	 */
	EAttribute getVersionedData_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.implementation._2.VersionedData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.implementation._2.VersionedData#getType()
	 * @see #getVersionedData()
	 * @generated
	 */
	EAttribute getVersionedData_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.implementation._2.WritersType <em>Writers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writers Type</em>'.
	 * @see technology.ecoa.implementation._2.WritersType
	 * @generated
	 */
	EClass getWritersType();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.implementation._2.WritersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.implementation._2.WritersType#getGroup()
	 * @see #getWritersType()
	 * @generated
	 */
	EAttribute getWritersType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.WritersType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see technology.ecoa.implementation._2.WritersType#getReference()
	 * @see #getWritersType()
	 * @generated
	 */
	EReference getWritersType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.implementation._2.WritersType#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Instance</em>'.
	 * @see technology.ecoa.implementation._2.WritersType#getModuleInstance()
	 * @see #getWritersType()
	 * @generated
	 */
	EReference getWritersType_ModuleInstance();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.implementation._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

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
	 * Returns the meta object for data type '{@link technology.ecoa.implementation._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.implementation._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.implementation._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relative Priority</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='RelativePriority' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' minInclusive='0' maxInclusive='255'"
	 * @generated
	 */
	EDataType getRelativePriority();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	impFactory getimpFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ClientsTypeImpl <em>Clients Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ClientsTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getClientsType()
		 * @generated
		 */
		EClass CLIENTS_TYPE = eINSTANCE.getClientsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTS_TYPE__GROUP = eINSTANCE.getClientsType_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTS_TYPE__SERVICE = eINSTANCE.getClientsType_Service();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTS_TYPE__MODULE_INSTANCE = eINSTANCE.getClientsType_ModuleInstance();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ComponentImplementationImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__USE = eINSTANCE.getComponentImplementation_Use();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__SERVICE = eINSTANCE.getComponentImplementation_Service();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__REFERENCE = eINSTANCE.getComponentImplementation_Reference();

		/**
		 * The meta object literal for the '<em><b>Module Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_TYPE = eINSTANCE.getComponentImplementation_ModuleType();

		/**
		 * The meta object literal for the '<em><b>Module Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION = eINSTANCE.getComponentImplementation_ModuleImplementation();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_INSTANCE = eINSTANCE.getComponentImplementation_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Trigger Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE = eINSTANCE.getComponentImplementation_TriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Dynamic Trigger Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE = eINSTANCE.getComponentImplementation_DynamicTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_IMPLEMENTATION__GROUP = eINSTANCE.getComponentImplementation_Group();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__DATA_LINK = eINSTANCE.getComponentImplementation_DataLink();

		/**
		 * The meta object literal for the '<em><b>Event Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__EVENT_LINK = eINSTANCE.getComponentImplementation_EventLink();

		/**
		 * The meta object literal for the '<em><b>Request Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__REQUEST_LINK = eINSTANCE.getComponentImplementation_RequestLink();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION = eINSTANCE.getComponentImplementation_ComponentDefinition();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.DataLinkImpl <em>Data Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.DataLinkImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataLink()
		 * @generated
		 */
		EClass DATA_LINK = eINSTANCE.getDataLink();

		/**
		 * The meta object literal for the '<em><b>Writers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__WRITERS = eINSTANCE.getDataLink_Writers();

		/**
		 * The meta object literal for the '<em><b>Readers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__READERS = eINSTANCE.getDataLink_Readers();

		/**
		 * The meta object literal for the '<em><b>Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__CONTROLLED = eINSTANCE.getDataLink_Controlled();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__ID = eINSTANCE.getDataLink_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.DataReadTypeImpl <em>Data Read Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.DataReadTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataReadType()
		 * @generated
		 */
		EClass DATA_READ_TYPE = eINSTANCE.getDataReadType();

		/**
		 * The meta object literal for the '<em><b>Notifying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_READ_TYPE__NOTIFYING = eINSTANCE.getDataReadType_Notifying();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.DataWrittenTypeImpl <em>Data Written Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.DataWrittenTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDataWrittenType()
		 * @generated
		 */
		EClass DATA_WRITTEN_TYPE = eINSTANCE.getDataWrittenType();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WRITTEN_TYPE__WRITE_ONLY = eINSTANCE.getDataWrittenType_WriteOnly();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.DocumentRootImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPONENT_IMPLEMENTATION = eINSTANCE.getDocumentRoot_ComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.DynamicTriggerInstanceImpl <em>Dynamic Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.DynamicTriggerInstanceImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getDynamicTriggerInstance()
		 * @generated
		 */
		EClass DYNAMIC_TRIGGER_INSTANCE = eINSTANCE.getDynamicTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_TRIGGER_INSTANCE__PARAMETER = eINSTANCE.getDynamicTriggerInstance_Parameter();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_TRIGGER_INSTANCE__SIZE = eINSTANCE.getDynamicTriggerInstance_Size();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.EventImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INPUT = eINSTANCE.getEvent_Input();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.EventLinkImpl <em>Event Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.EventLinkImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEventLink()
		 * @generated
		 */
		EClass EVENT_LINK = eINSTANCE.getEventLink();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK__SENDERS = eINSTANCE.getEventLink_Senders();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK__RECEIVERS = eINSTANCE.getEventLink_Receivers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK__ID = eINSTANCE.getEventLink_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.EventReceivedTypeImpl <em>Event Received Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.EventReceivedTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getEventReceivedType()
		 * @generated
		 */
		EClass EVENT_RECEIVED_TYPE = eINSTANCE.getEventReceivedType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.InstanceImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Module Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__MODULE_BEHAVIOUR = eINSTANCE.getInstance_ModuleBehaviour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Relative Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__RELATIVE_PRIORITY = eINSTANCE.getInstance_RelativePriority();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ModuleImplementationImpl <em>Module Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ModuleImplementationImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleImplementation()
		 * @generated
		 */
		EClass MODULE_IMPLEMENTATION = eINSTANCE.getModuleImplementation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPLEMENTATION__LANGUAGE = eINSTANCE.getModuleImplementation_Language();

		/**
		 * The meta object literal for the '<em><b>Module Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPLEMENTATION__MODULE_TYPE = eINSTANCE.getModuleImplementation_ModuleType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPLEMENTATION__NAME = eINSTANCE.getModuleImplementation_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ModuleInstanceImpl <em>Module Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ModuleInstanceImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleInstance()
		 * @generated
		 */
		EClass MODULE_INSTANCE = eINSTANCE.getModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__PROPERTY_VALUES = eINSTANCE.getModuleInstance_PropertyValues();

		/**
		 * The meta object literal for the '<em><b>Pinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__PINFO = eINSTANCE.getModuleInstance_Pinfo();

		/**
		 * The meta object literal for the '<em><b>Implementation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_INSTANCE__IMPLEMENTATION_NAME = eINSTANCE.getModuleInstance_ImplementationName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl <em>Module Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ModuleTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getModuleType()
		 * @generated
		 */
		EClass MODULE_TYPE = eINSTANCE.getModuleType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__PROPERTIES = eINSTANCE.getModuleType_Properties();

		/**
		 * The meta object literal for the '<em><b>Pinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__PINFO = eINSTANCE.getModuleType_Pinfo();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__OPERATIONS = eINSTANCE.getModuleType_Operations();

		/**
		 * The meta object literal for the '<em><b>Activating Fault Notifs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE__ACTIVATING_FAULT_NOTIFS = eINSTANCE.getModuleType_ActivatingFaultNotifs();

		/**
		 * The meta object literal for the '<em><b>Has User Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE__HAS_USER_CONTEXT = eINSTANCE.getModuleType_HasUserContext();

		/**
		 * The meta object literal for the '<em><b>Has Warm Start Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE__HAS_WARM_START_CONTEXT = eINSTANCE.getModuleType_HasWarmStartContext();

		/**
		 * The meta object literal for the '<em><b>Is Fault Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE__IS_FAULT_HANDLER = eINSTANCE.getModuleType_IsFaultHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE__NAME = eINSTANCE.getModuleType_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OperationsTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOperationsType()
		 * @generated
		 */
		EClass OPERATIONS_TYPE = eINSTANCE.getOperationsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONS_TYPE__GROUP = eINSTANCE.getOperationsType_Group();

		/**
		 * The meta object literal for the '<em><b>Data Written</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__DATA_WRITTEN = eINSTANCE.getOperationsType_DataWritten();

		/**
		 * The meta object literal for the '<em><b>Data Read</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__DATA_READ = eINSTANCE.getOperationsType_DataRead();

		/**
		 * The meta object literal for the '<em><b>Event Sent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__EVENT_SENT = eINSTANCE.getOperationsType_EventSent();

		/**
		 * The meta object literal for the '<em><b>Event Received</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__EVENT_RECEIVED = eINSTANCE.getOperationsType_EventReceived();

		/**
		 * The meta object literal for the '<em><b>Request Sent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__REQUEST_SENT = eINSTANCE.getOperationsType_RequestSent();

		/**
		 * The meta object literal for the '<em><b>Request Received</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_TYPE__REQUEST_RECEIVED = eINSTANCE.getOperationsType_RequestReceived();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefImpl <em>Op Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRef()
		 * @generated
		 */
		EClass OP_REF = eINSTANCE.getOpRef();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF__INSTANCE_NAME = eINSTANCE.getOpRef_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF__OPERATION_NAME = eINSTANCE.getOpRef_OperationName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatableImpl <em>Op Ref Activatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefActivatableImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatable()
		 * @generated
		 */
		EClass OP_REF_ACTIVATABLE = eINSTANCE.getOpRefActivatable();

		/**
		 * The meta object literal for the '<em><b>Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_ACTIVATABLE__ACTIVATING = eINSTANCE.getOpRefActivatable_Activating();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatableFifoImpl <em>Op Ref Activatable Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefActivatableFifoImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatableFifo()
		 * @generated
		 */
		EClass OP_REF_ACTIVATABLE_FIFO = eINSTANCE.getOpRefActivatableFifo();

		/**
		 * The meta object literal for the '<em><b>Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_ACTIVATABLE_FIFO__FIFO_SIZE = eINSTANCE.getOpRefActivatableFifo_FifoSize();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefActivatingFifoImpl <em>Op Ref Activating Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefActivatingFifoImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefActivatingFifo()
		 * @generated
		 */
		EClass OP_REF_ACTIVATING_FIFO = eINSTANCE.getOpRefActivatingFifo();

		/**
		 * The meta object literal for the '<em><b>Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_ACTIVATING_FIFO__FIFO_SIZE = eINSTANCE.getOpRefActivatingFifo_FifoSize();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefExternalImpl <em>Op Ref External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefExternalImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefExternal()
		 * @generated
		 */
		EClass OP_REF_EXTERNAL = eINSTANCE.getOpRefExternal();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_EXTERNAL__LANGUAGE = eINSTANCE.getOpRefExternal_Language();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_EXTERNAL__OPERATION_NAME = eINSTANCE.getOpRefExternal_OperationName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.OpRefTriggerImpl <em>Op Ref Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.OpRefTriggerImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getOpRefTrigger()
		 * @generated
		 */
		EClass OP_REF_TRIGGER = eINSTANCE.getOpRefTrigger();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_TRIGGER__INSTANCE_NAME = eINSTANCE.getOpRefTrigger_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_REF_TRIGGER__PERIOD = eINSTANCE.getOpRefTrigger_Period();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ParameterImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PinfoTypeImpl <em>Pinfo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PinfoTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoType()
		 * @generated
		 */
		EClass PINFO_TYPE = eINSTANCE.getPinfoType();

		/**
		 * The meta object literal for the '<em><b>Public Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINFO_TYPE__PUBLIC_PINFO = eINSTANCE.getPinfoType_PublicPinfo();

		/**
		 * The meta object literal for the '<em><b>Private Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINFO_TYPE__PRIVATE_PINFO = eINSTANCE.getPinfoType_PrivatePinfo();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PinfoType1Impl <em>Pinfo Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PinfoType1Impl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoType1()
		 * @generated
		 */
		EClass PINFO_TYPE1 = eINSTANCE.getPinfoType1();

		/**
		 * The meta object literal for the '<em><b>Public Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINFO_TYPE1__PUBLIC_PINFO = eINSTANCE.getPinfoType1_PublicPinfo();

		/**
		 * The meta object literal for the '<em><b>Private Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINFO_TYPE1__PRIVATE_PINFO = eINSTANCE.getPinfoType1_PrivatePinfo();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PinfoValueImpl <em>Pinfo Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PinfoValueImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPinfoValue()
		 * @generated
		 */
		EClass PINFO_VALUE = eINSTANCE.getPinfoValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINFO_VALUE__VALUE = eINSTANCE.getPinfoValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINFO_VALUE__NAME = eINSTANCE.getPinfoValue_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PrivatePinfoImpl <em>Private Pinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PrivatePinfoImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPrivatePinfo()
		 * @generated
		 */
		EClass PRIVATE_PINFO = eINSTANCE.getPrivatePinfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_PINFO__NAME = eINSTANCE.getPrivatePinfo_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PropertiesTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTY = eINSTANCE.getPropertiesType_Property();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PropertyValueImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__NAME = eINSTANCE.getPropertyValue_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PropertyValuesImpl <em>Property Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PropertyValuesImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPropertyValues()
		 * @generated
		 */
		EClass PROPERTY_VALUES = eINSTANCE.getPropertyValues();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUES__PROPERTY_VALUE = eINSTANCE.getPropertyValues_PropertyValue();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.PublicPinfoImpl <em>Public Pinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.PublicPinfoImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getPublicPinfo()
		 * @generated
		 */
		EClass PUBLIC_PINFO = eINSTANCE.getPublicPinfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_PINFO__NAME = eINSTANCE.getPublicPinfo_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ReadersTypeImpl <em>Readers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ReadersTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getReadersType()
		 * @generated
		 */
		EClass READERS_TYPE = eINSTANCE.getReadersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READERS_TYPE__GROUP = eINSTANCE.getReadersType_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READERS_TYPE__SERVICE = eINSTANCE.getReadersType_Service();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READERS_TYPE__MODULE_INSTANCE = eINSTANCE.getReadersType_ModuleInstance();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ReceiversTypeImpl <em>Receivers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ReceiversTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getReceiversType()
		 * @generated
		 */
		EClass RECEIVERS_TYPE = eINSTANCE.getReceiversType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVERS_TYPE__GROUP = eINSTANCE.getReceiversType_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS_TYPE__SERVICE = eINSTANCE.getReceiversType_Service();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS_TYPE__REFERENCE = eINSTANCE.getReceiversType_Reference();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS_TYPE__MODULE_INSTANCE = eINSTANCE.getReceiversType_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Dynamic Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS_TYPE__DYNAMIC_TRIGGER = eINSTANCE.getReceiversType_DynamicTrigger();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.RequestLinkImpl <em>Request Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.RequestLinkImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestLink()
		 * @generated
		 */
		EClass REQUEST_LINK = eINSTANCE.getRequestLink();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK__CLIENTS = eINSTANCE.getRequestLink_Clients();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK__SERVER = eINSTANCE.getRequestLink_Server();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK__ID = eINSTANCE.getRequestLink_Id();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.RequestReceivedTypeImpl <em>Request Received Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.RequestReceivedTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestReceivedType()
		 * @generated
		 */
		EClass REQUEST_RECEIVED_TYPE = eINSTANCE.getRequestReceivedType();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS = eINSTANCE.getRequestReceivedType_MaxConcurrentRequests();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.RequestResponseImpl <em>Request Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.RequestResponseImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestResponse()
		 * @generated
		 */
		EClass REQUEST_RESPONSE = eINSTANCE.getRequestResponse();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__INPUT = eINSTANCE.getRequestResponse_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__OUTPUT = eINSTANCE.getRequestResponse_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RESPONSE__NAME = eINSTANCE.getRequestResponse_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.RequestSentTypeImpl <em>Request Sent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.RequestSentTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRequestSentType()
		 * @generated
		 */
		EClass REQUEST_SENT_TYPE = eINSTANCE.getRequestSentType();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT_TYPE__IS_SYNCHRONOUS = eINSTANCE.getRequestSentType_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT_TYPE__MAX_CONCURRENT_REQUESTS = eINSTANCE.getRequestSentType_MaxConcurrentRequests();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT_TYPE__TIMEOUT = eINSTANCE.getRequestSentType_Timeout();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.SendersTypeImpl <em>Senders Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.SendersTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getSendersType()
		 * @generated
		 */
		EClass SENDERS_TYPE = eINSTANCE.getSendersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDERS_TYPE__GROUP = eINSTANCE.getSendersType_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__SERVICE = eINSTANCE.getSendersType_Service();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__REFERENCE = eINSTANCE.getSendersType_Reference();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__MODULE_INSTANCE = eINSTANCE.getSendersType_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__TRIGGER = eINSTANCE.getSendersType_Trigger();

		/**
		 * The meta object literal for the '<em><b>Dynamic Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__DYNAMIC_TRIGGER = eINSTANCE.getSendersType_DynamicTrigger();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDERS_TYPE__EXTERNAL = eINSTANCE.getSendersType_External();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ServerTypeImpl <em>Server Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ServerTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getServerType()
		 * @generated
		 */
		EClass SERVER_TYPE = eINSTANCE.getServerType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_TYPE__REFERENCE = eINSTANCE.getServerType_Reference();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_TYPE__MODULE_INSTANCE = eINSTANCE.getServerType_ModuleInstance();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.ServiceQoSImpl <em>Service Qo S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.ServiceQoSImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getServiceQoS()
		 * @generated
		 */
		EClass SERVICE_QO_S = eINSTANCE.getServiceQoS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_QO_S__NAME = eINSTANCE.getServiceQoS_Name();

		/**
		 * The meta object literal for the '<em><b>New Qo S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_QO_S__NEW_QO_S = eINSTANCE.getServiceQoS_NewQoS();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.TriggerInstanceImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTriggerInstance()
		 * @generated
		 */
		EClass TRIGGER_INSTANCE = eINSTANCE.getTriggerInstance();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.UseTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getUseType()
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
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.VersionedDataImpl <em>Versioned Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.VersionedDataImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getVersionedData()
		 * @generated
		 */
		EClass VERSIONED_DATA = eINSTANCE.getVersionedData();

		/**
		 * The meta object literal for the '<em><b>Max Versions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA__MAX_VERSIONS = eINSTANCE.getVersionedData_MaxVersions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA__NAME = eINSTANCE.getVersionedData_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA__TYPE = eINSTANCE.getVersionedData_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.impl.WritersTypeImpl <em>Writers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.WritersTypeImpl
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getWritersType()
		 * @generated
		 */
		EClass WRITERS_TYPE = eINSTANCE.getWritersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITERS_TYPE__GROUP = eINSTANCE.getWritersType_Group();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITERS_TYPE__REFERENCE = eINSTANCE.getWritersType_Reference();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITERS_TYPE__MODULE_INSTANCE = eINSTANCE.getWritersType_ModuleInstance();

		/**
		 * The meta object literal for the '{@link technology.ecoa.implementation._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.ProgrammingLanguage
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.ProgrammingLanguage
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Relative Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getRelativePriority()
		 * @generated
		 */
		EDataType RELATIVE_PRIORITY = eINSTANCE.getRelativePriority();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.implementation._2.impl.impPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //impPackage
