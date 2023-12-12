/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

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
 * @see edtimplementation.EdtimplementationFactory
 * @model kind="package"
 * @generated
 */
public interface EdtimplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtimplementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edtimplementation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edtimplementation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtimplementationPackage eINSTANCE = edtimplementation.impl.EdtimplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ComponentImplementationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Used Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__USED_LIBRARIES = 0;

	/**
	 * The feature id for the '<em><b>Associated Service Qos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Module Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Module Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS = 7;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__INSTANCES = 8;

	/**
	 * The feature id for the '<em><b>Component Definition References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES = 9;

	/**
	 * The feature id for the '<em><b>Component Definition Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES = 10;

	/**
	 * The feature id for the '<em><b>Operation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__OPERATION_LINKS = 11;

	/**
	 * The feature id for the '<em><b>External Senders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS = 12;

	/**
	 * The feature id for the '<em><b>Module Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS = 13;

	/**
	 * The feature id for the '<em><b>Bin Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__BIN_DESC = 14;

	/**
	 * The feature id for the '<em><b>Insertion Policy List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST = 15;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ComponentImplementationReferenceImpl <em>Component Implementation Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ComponentImplementationReferenceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementationReference()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>New Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS = 0;

	/**
	 * The feature id for the '<em><b>Component Definition Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Component Implementation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Implementation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ComponentImplementationServiceImpl <em>Component Implementation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ComponentImplementationServiceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementationService()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>New Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS = 0;

	/**
	 * The feature id for the '<em><b>Component Definition Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Component Implementation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Implementation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ModuleTypeImpl <em>Module Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ModuleTypeImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleType()
	 * @generated
	 */
	int MODULE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE__PINFO = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
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
	 * The meta object id for the '{@link edtimplementation.ModuleOperation <em>Module Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.ModuleOperation
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleOperation()
	 * @generated
	 */
	int MODULE_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventTypeImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = MODULE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__INPUT = MODULE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = MODULE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = MODULE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestResponseTypeImpl <em>Request Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestResponseTypeImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestResponseType()
	 * @generated
	 */
	int REQUEST_RESPONSE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_TYPE__NAME = MODULE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_TYPE__INPUT = MODULE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_TYPE__OUTPUT = MODULE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_TYPE_FEATURE_COUNT = MODULE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Request Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_TYPE_OPERATION_COUNT = MODULE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ParameterImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.VersionedDataTypeImpl <em>Versioned Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.VersionedDataTypeImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataType()
	 * @generated
	 */
	int VERSIONED_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_TYPE__NAME = MODULE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_TYPE__MAX_VERSIONS = MODULE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_TYPE__TYPE = MODULE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_TYPE_FEATURE_COUNT = MODULE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Versioned Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_TYPE_OPERATION_COUNT = MODULE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
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
	 * The meta object id for the '{@link edtimplementation.impl.EventSentImpl <em>Event Sent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventSentImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventSent()
	 * @generated
	 */
	int EVENT_SENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENT__NAME = EVENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENT__INPUT = EVENT_TYPE__INPUT;

	/**
	 * The number of structural features of the '<em>Event Sent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENT_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Sent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENT_OPERATION_COUNT = EVENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventReceivedImpl <em>Event Received</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventReceivedImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventReceived()
	 * @generated
	 */
	int EVENT_RECEIVED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED__NAME = EVENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED__INPUT = EVENT_TYPE__INPUT;

	/**
	 * The number of structural features of the '<em>Event Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_FEATURE_COUNT = EVENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVED_OPERATION_COUNT = EVENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.VersionedDataWrittenImpl <em>Versioned Data Written</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.VersionedDataWrittenImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataWritten()
	 * @generated
	 */
	int VERSIONED_DATA_WRITTEN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN__NAME = VERSIONED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN__MAX_VERSIONS = VERSIONED_DATA_TYPE__MAX_VERSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN__TYPE = VERSIONED_DATA_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN__WRITE_ONLY = VERSIONED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Data Written</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN_FEATURE_COUNT = VERSIONED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Data Written</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_WRITTEN_OPERATION_COUNT = VERSIONED_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.VersionedDataReadImpl <em>Versioned Data Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.VersionedDataReadImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataRead()
	 * @generated
	 */
	int VERSIONED_DATA_READ = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ__NAME = VERSIONED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Max Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ__MAX_VERSIONS = VERSIONED_DATA_TYPE__MAX_VERSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ__TYPE = VERSIONED_DATA_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Notifying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ__NOTIFYING = VERSIONED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Data Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ_FEATURE_COUNT = VERSIONED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Data Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_READ_OPERATION_COUNT = VERSIONED_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestSentImpl <em>Request Sent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestSentImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestSent()
	 * @generated
	 */
	int REQUEST_SENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__NAME = REQUEST_RESPONSE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__INPUT = REQUEST_RESPONSE_TYPE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__OUTPUT = REQUEST_RESPONSE_TYPE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__IS_SYNCHRONOUS = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__MAX_CONCURRENT_REQUESTS = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT__TIMEOUT = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Request Sent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_FEATURE_COUNT = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Request Sent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SENT_OPERATION_COUNT = REQUEST_RESPONSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestReceivedImpl <em>Request Received</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestReceivedImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestReceived()
	 * @generated
	 */
	int REQUEST_RECEIVED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED__NAME = REQUEST_RESPONSE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED__INPUT = REQUEST_RESPONSE_TYPE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED__OUTPUT = REQUEST_RESPONSE_TYPE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED__MAX_CONCURRENT_REQUESTS = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_FEATURE_COUNT = REQUEST_RESPONSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RECEIVED_OPERATION_COUNT = REQUEST_RESPONSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ModuleImplementationImpl <em>Module Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ModuleImplementationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleImplementation()
	 * @generated
	 */
	int MODULE_IMPLEMENTATION = 15;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__MODULE_TYPE = 2;

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
	 * The meta object id for the '{@link edtimplementation.Instance <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.Instance
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 16;

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
	 * The meta object id for the '{@link edtimplementation.impl.ModuleInstanceImpl <em>Module Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ModuleInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleInstance()
	 * @generated
	 */
	int MODULE_INSTANCE = 22;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.TriggerInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTriggerInstance()
	 * @generated
	 */
	int TRIGGER_INSTANCE = 17;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DynamicTriggerInstanceImpl <em>Dynamic Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DynamicTriggerInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerInstance()
	 * @generated
	 */
	int DYNAMIC_TRIGGER_INSTANCE = 19;

	/**
	 * The meta object id for the '{@link edtimplementation.EventLinkReceiver <em>Event Link Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.EventLinkReceiver
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkReceiver()
	 * @generated
	 */
	int EVENT_LINK_RECEIVER = 46;

	/**
	 * The meta object id for the '{@link edtimplementation.OperationInstance <em>Operation Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.OperationInstance
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInstance()
	 * @generated
	 */
	int OPERATION_INSTANCE = 23;

	/**
	 * The meta object id for the '{@link edtimplementation.EventLinkSender <em>Event Link Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.EventLinkSender
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkSender()
	 * @generated
	 */
	int EVENT_LINK_SENDER = 44;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.TriggerSenderImpl <em>Trigger Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.TriggerSenderImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTriggerSender()
	 * @generated
	 */
	int TRIGGER_SENDER = 18;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventSenderInstanceImpl <em>Event Sender Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventSenderInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventSenderInstance()
	 * @generated
	 */
	int EVENT_SENDER_INSTANCE = 24;

	/**
	 * The meta object id for the '{@link edtimplementation.RequestLinkClient <em>Request Link Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.RequestLinkClient
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkClient()
	 * @generated
	 */
	int REQUEST_LINK_CLIENT = 47;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestClientInstanceImpl <em>Request Client Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestClientInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestClientInstance()
	 * @generated
	 */
	int REQUEST_CLIENT_INSTANCE = 26;

	/**
	 * The meta object id for the '{@link edtimplementation.RequestLinkServer <em>Request Link Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.RequestLinkServer
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkServer()
	 * @generated
	 */
	int REQUEST_LINK_SERVER = 48;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestServerInstanceImpl <em>Request Server Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestServerInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestServerInstance()
	 * @generated
	 */
	int REQUEST_SERVER_INSTANCE = 27;

	/**
	 * The meta object id for the '{@link edtimplementation.DataLinkWriter <em>Data Link Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.DataLinkWriter
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkWriter()
	 * @generated
	 */
	int DATA_LINK_WRITER = 42;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DataWriterInstanceImpl <em>Data Writer Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DataWriterInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataWriterInstance()
	 * @generated
	 */
	int DATA_WRITER_INSTANCE = 28;

	/**
	 * The meta object id for the '{@link edtimplementation.DataLinkReader <em>Data Link Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.DataLinkReader
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkReader()
	 * @generated
	 */
	int DATA_LINK_READER = 43;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DataReaderInstanceImpl <em>Data Reader Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DataReaderInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataReaderInstance()
	 * @generated
	 */
	int DATA_READER_INSTANCE = 29;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DynamicTriggerEventReceiverInstanceImpl <em>Dynamic Trigger Event Receiver Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DynamicTriggerEventReceiverInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerEventReceiverInstance()
	 * @generated
	 */
	int DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE = 20;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DynamicTriggerEventSenderInstanceImpl <em>Dynamic Trigger Event Sender Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DynamicTriggerEventSenderInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerEventSenderInstance()
	 * @generated
	 */
	int DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE = 21;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventReceiverInstanceImpl <em>Event Receiver Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventReceiverInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventReceiverInstance()
	 * @generated
	 */
	int EVENT_RECEIVER_INSTANCE = 25;

	/**
	 * The meta object id for the '{@link edtimplementation.ServRefOfLinkedComponentDefinition <em>Serv Ref Of Linked Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getServRefOfLinkedComponentDefinition()
	 * @generated
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION = 30;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl <em>Reference Of Linked Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getReferenceOfLinkedComponentDefinition()
	 * @generated
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION = 31;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl <em>Service Of Linked Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getServiceOfLinkedComponentDefinition()
	 * @generated
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION = 32;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventDefinitionInstanceImpl <em>Event Definition Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventDefinitionInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventDefinitionInstance()
	 * @generated
	 */
	int EVENT_DEFINITION_INSTANCE = 33;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestReferenceInstanceImpl <em>Request Reference Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestReferenceInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestReferenceInstance()
	 * @generated
	 */
	int REQUEST_REFERENCE_INSTANCE = 34;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestServiceInstanceImpl <em>Request Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestServiceInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestServiceInstance()
	 * @generated
	 */
	int REQUEST_SERVICE_INSTANCE = 35;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.VersionedDataReferenceInstanceImpl <em>Versioned Data Reference Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.VersionedDataReferenceInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataReferenceInstance()
	 * @generated
	 */
	int VERSIONED_DATA_REFERENCE_INSTANCE = 36;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.VersionedDataServiceInstanceImpl <em>Versioned Data Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.VersionedDataServiceInstanceImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataServiceInstance()
	 * @generated
	 */
	int VERSIONED_DATA_SERVICE_INSTANCE = 37;

	/**
	 * The meta object id for the '{@link edtimplementation.OperationLink <em>Operation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.OperationLink
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationLink()
	 * @generated
	 */
	int OPERATION_LINK = 38;

	/**
	 * The meta object id for the '{@link edtimplementation.DataLink <em>Data Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.DataLink
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLink()
	 * @generated
	 */
	int DATA_LINK = 39;

	/**
	 * The meta object id for the '{@link edtimplementation.RequestLink <em>Request Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.RequestLink
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLink()
	 * @generated
	 */
	int REQUEST_LINK = 40;

	/**
	 * The meta object id for the '{@link edtimplementation.EventLink <em>Event Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.EventLink
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLink()
	 * @generated
	 */
	int EVENT_LINK = 41;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DataLinkActivatableFifoImpl <em>Data Link Activatable Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DataLinkActivatableFifoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkActivatableFifo()
	 * @generated
	 */
	int DATA_LINK_ACTIVATABLE_FIFO = 49;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.DataLinkToServiceOperationImpl <em>Data Link To Service Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.DataLinkToServiceOperationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkToServiceOperation()
	 * @generated
	 */
	int DATA_LINK_TO_SERVICE_OPERATION = 50;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkActivatableFifoImpl <em>Event Link Activatable Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkActivatableFifoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatableFifo()
	 * @generated
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO = 51;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkActivatingFifoImpl <em>Event Link Activating Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkActivatingFifoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatingFifo()
	 * @generated
	 */
	int EVENT_LINK_ACTIVATING_FIFO = 52;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkToDefinitionOperationImpl <em>Event Link To Definition Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkToDefinitionOperationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkToDefinitionOperation()
	 * @generated
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION = 53;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl <em>Event Link Activating Fifo From Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatingFifoFromTrigger()
	 * @generated
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER = 55;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkActivatableFifoFromTriggerImpl <em>Event Link Activatable Fifo From Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkActivatableFifoFromTriggerImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER = 56;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestLinkActivatableFifoImpl <em>Request Link Activatable Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestLinkActivatableFifoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatableFifo()
	 * @generated
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO = 57;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl <em>Request Link Activating Activatable Fifo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO = 58;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl <em>Request Link Activating To Reference Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatingToReferenceOperation()
	 * @generated
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION = 59;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ExternalSenderOperationImpl <em>External Sender Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ExternalSenderOperationImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getExternalSenderOperation()
	 * @generated
	 */
	int EXTERNAL_SENDER_OPERATION = 45;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.EventLinkToDefinitionOperationFromTriggerImpl <em>Event Link To Definition Operation From Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.EventLinkToDefinitionOperationFromTriggerImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkToDefinitionOperationFromTrigger()
	 * @generated
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER = 54;

	/**
	 * The meta object id for the '{@link edtimplementation.PinfoValue <em>Pinfo Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.PinfoValue
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPinfoValue()
	 * @generated
	 */
	int PINFO_VALUE = 62;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.PublicPinfoValueImpl <em>Public Pinfo Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.PublicPinfoValueImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPublicPinfoValue()
	 * @generated
	 */
	int PUBLIC_PINFO_VALUE = 60;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.PrivatePinfoValueImpl <em>Private Pinfo Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.PrivatePinfoValueImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPrivatePinfoValue()
	 * @generated
	 */
	int PRIVATE_PINFO_VALUE = 61;

	/**
	 * The meta object id for the '{@link edtimplementation.ModuleTypePinfo <em>Module Type Pinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.ModuleTypePinfo
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleTypePinfo()
	 * @generated
	 */
	int MODULE_TYPE_PINFO = 65;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.PrivatePinfoImpl <em>Private Pinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.PrivatePinfoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPrivatePinfo()
	 * @generated
	 */
	int PRIVATE_PINFO = 63;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.PublicPinfoImpl <em>Public Pinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.PublicPinfoImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPublicPinfo()
	 * @generated
	 */
	int PUBLIC_PINFO = 64;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.PropertyValueImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 66;

	/**
	 * The meta object id for the '{@link edtimplementation.impl.ModuleTypePropertyImpl <em>Module Type Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.impl.ModuleTypePropertyImpl
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleTypeProperty()
	 * @generated
	 */
	int MODULE_TYPE_PROPERTY = 67;

	/**
	 * The meta object id for the '{@link edtimplementation.Trigger <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.Trigger
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 68;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MODULE_BEHAVIOUR = INSTANCE__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__RELATIVE_PRIORITY = INSTANCE__RELATIVE_PRIORITY;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__MODULE_BEHAVIOUR = TRIGGER__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__RELATIVE_PRIORITY = TRIGGER__RELATIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__OPERATIONS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_SENDER__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Event Link Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_SENDER_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Link Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_SENDER_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SENDER__NAME = EVENT_LINK_SENDER__NAME;

	/**
	 * The number of structural features of the '<em>Trigger Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SENDER_FEATURE_COUNT = EVENT_LINK_SENDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SENDER_OPERATION_COUNT = EVENT_LINK_SENDER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR = TRIGGER__MODULE_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY = TRIGGER__RELATIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__PARAMETER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__SIZE = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE__OPERATIONS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dynamic Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_INSTANCE_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_RECEIVER__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Event Link Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_RECEIVER_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Link Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_RECEIVER_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME = EVENT_LINK_RECEIVER__NAME;

	/**
	 * The number of structural features of the '<em>Dynamic Trigger Event Receiver Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE_FEATURE_COUNT = EVENT_LINK_RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Trigger Event Receiver Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE_OPERATION_COUNT = EVENT_LINK_RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE__NAME = EVENT_LINK_SENDER__NAME;

	/**
	 * The number of structural features of the '<em>Dynamic Trigger Event Sender Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE_FEATURE_COUNT = EVENT_LINK_SENDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Trigger Event Sender Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE_OPERATION_COUNT = EVENT_LINK_SENDER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__PROPERTY_VALUES = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__PINFO = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__MODULE_TYPE = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__OPERATIONS = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE__MODULE_IMPLEMENTATION = INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENDER_INSTANCE__NAME = EVENT_LINK_SENDER__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENDER_INSTANCE__MT_OPERATION_REF = EVENT_LINK_SENDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Sender Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENDER_INSTANCE_FEATURE_COUNT = EVENT_LINK_SENDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Sender Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SENDER_INSTANCE_OPERATION_COUNT = EVENT_LINK_SENDER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVER_INSTANCE__NAME = EVENT_LINK_RECEIVER__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVER_INSTANCE__MT_OPERATION_REF = EVENT_LINK_RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Receiver Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVER_INSTANCE_FEATURE_COUNT = EVENT_LINK_RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Receiver Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RECEIVER_INSTANCE_OPERATION_COUNT = EVENT_LINK_RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_CLIENT__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Request Link Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_CLIENT_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Link Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_CLIENT_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CLIENT_INSTANCE__NAME = REQUEST_LINK_CLIENT__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CLIENT_INSTANCE__MT_OPERATION_REF = REQUEST_LINK_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Client Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CLIENT_INSTANCE_FEATURE_COUNT = REQUEST_LINK_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Client Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CLIENT_INSTANCE_OPERATION_COUNT = REQUEST_LINK_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_SERVER__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Request Link Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_SERVER_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Link Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_SERVER_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVER_INSTANCE__NAME = REQUEST_LINK_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVER_INSTANCE__MT_OPERATION_REF = REQUEST_LINK_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Server Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVER_INSTANCE_FEATURE_COUNT = REQUEST_LINK_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Server Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVER_INSTANCE_OPERATION_COUNT = REQUEST_LINK_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_WRITER__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Data Link Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_WRITER_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Link Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_WRITER_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_INSTANCE__NAME = DATA_LINK_WRITER__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_INSTANCE__MT_OPERATION_REF = DATA_LINK_WRITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Writer Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_INSTANCE_FEATURE_COUNT = DATA_LINK_WRITER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Writer Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_INSTANCE_OPERATION_COUNT = DATA_LINK_WRITER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_READER__NAME = OPERATION_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Data Link Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_READER_FEATURE_COUNT = OPERATION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Link Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_READER_OPERATION_COUNT = OPERATION_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READER_INSTANCE__NAME = DATA_LINK_READER__NAME;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READER_INSTANCE__MT_OPERATION_REF = DATA_LINK_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Reader Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READER_INSTANCE_FEATURE_COUNT = DATA_LINK_READER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Reader Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READER_INSTANCE_OPERATION_COUNT = DATA_LINK_READER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Definition Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Serv Ref Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Serv Ref Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_REF_OF_LINKED_COMPONENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Service Definition Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Component Definition Reference Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OF_LINKED_COMPONENT_DEFINITION_OPERATION_COUNT = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Service Definition Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION__NAME = SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Component Definition Service Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Of Linked Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OF_LINKED_COMPONENT_DEFINITION_OPERATION_COUNT = SERV_REF_OF_LINKED_COMPONENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_INSTANCE__NAME = EVENT_LINK_RECEIVER__NAME;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_INSTANCE__SD_OPERATION_REF = EVENT_LINK_RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Definition Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_INSTANCE_FEATURE_COUNT = EVENT_LINK_RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Definition Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_INSTANCE_OPERATION_COUNT = EVENT_LINK_RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REFERENCE_INSTANCE__NAME = REQUEST_LINK_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REFERENCE_INSTANCE__SD_OPERATION_REF = REQUEST_LINK_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Reference Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REFERENCE_INSTANCE_FEATURE_COUNT = REQUEST_LINK_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Reference Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REFERENCE_INSTANCE_OPERATION_COUNT = REQUEST_LINK_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_INSTANCE__NAME = REQUEST_LINK_CLIENT__NAME;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_INSTANCE__SD_OPERATION_REF = REQUEST_LINK_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_INSTANCE_FEATURE_COUNT = REQUEST_LINK_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_INSTANCE_OPERATION_COUNT = REQUEST_LINK_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_REFERENCE_INSTANCE__NAME = DATA_LINK_WRITER__NAME;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_REFERENCE_INSTANCE__SD_OPERATION_REF = DATA_LINK_WRITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Data Reference Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_REFERENCE_INSTANCE_FEATURE_COUNT = DATA_LINK_WRITER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Data Reference Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_REFERENCE_INSTANCE_OPERATION_COUNT = DATA_LINK_WRITER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_SERVICE_INSTANCE__NAME = DATA_LINK_READER__NAME;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF = DATA_LINK_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Data Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_SERVICE_INSTANCE_FEATURE_COUNT = DATA_LINK_READER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Data Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_DATA_SERVICE_INSTANCE_OPERATION_COUNT = DATA_LINK_READER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LINK__ID = 0;

	/**
	 * The number of structural features of the '<em>Operation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LINK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__ID = OPERATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__CONTROLLED = OPERATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_FEATURE_COUNT = OPERATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_OPERATION_COUNT = OPERATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK__ID = OPERATION_LINK__ID;

	/**
	 * The number of structural features of the '<em>Request Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_FEATURE_COUNT = OPERATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_OPERATION_COUNT = OPERATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK__ID = OPERATION_LINK__ID;

	/**
	 * The number of structural features of the '<em>Event Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_FEATURE_COUNT = OPERATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_OPERATION_COUNT = OPERATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENDER_OPERATION__NAME = EVENT_LINK_SENDER__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENDER_OPERATION__LANGUAGE = EVENT_LINK_SENDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Sender Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENDER_OPERATION_FEATURE_COUNT = EVENT_LINK_SENDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Sender Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENDER_OPERATION_OPERATION_COUNT = EVENT_LINK_SENDER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__ID = DATA_LINK__ID;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED = DATA_LINK__CONTROLLED;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__WRITER = DATA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__READER = DATA_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reader Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE = DATA_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reader Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING = DATA_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO_FEATURE_COUNT = DATA_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_ACTIVATABLE_FIFO_OPERATION_COUNT = DATA_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION__ID = DATA_LINK__ID;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED = DATA_LINK__CONTROLLED;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION__WRITER = DATA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION__READER = DATA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Link To Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION_FEATURE_COUNT = DATA_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Link To Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_TO_SERVICE_OPERATION_OPERATION_COUNT = DATA_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO__SENDER = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER = EVENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO__RECEIVER_FIFO_SIZE = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO__SENDER = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO__RECEIVER = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Link Activating Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Link Activating Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION__SENDER = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION__RECEIVER = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Link To Definition Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Link To Definition Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__SENDER = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__RECEIVER = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__TRIGGER_PERIOD = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Link To Definition Operation From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Link To Definition Operation From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD = EVENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Link Activating Fifo From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event Link Activating Fifo From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__ID = EVENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE = EVENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_ACTIVATING = EVENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__SENDER = EVENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER = EVENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trigger Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__TRIGGER_PERIOD = EVENT_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event Link Activatable Fifo From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER_FEATURE_COUNT = EVENT_LINK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Event Link Activatable Fifo From Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER_OPERATION_COUNT = EVENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO__ID = REQUEST_LINK__ID;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO__CLIENT = REQUEST_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO__SERVER = REQUEST_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE = REQUEST_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_ACTIVATING = REQUEST_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Request Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO_FEATURE_COUNT = REQUEST_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Request Link Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATABLE_FIFO_OPERATION_COUNT = REQUEST_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID = REQUEST_LINK__ID;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT = REQUEST_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER = REQUEST_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING = REQUEST_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Fifo Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE = REQUEST_LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Server Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING = REQUEST_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Request Link Activating Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO_FEATURE_COUNT = REQUEST_LINK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Request Link Activating Activatable Fifo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO_OPERATION_COUNT = REQUEST_LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID = REQUEST_LINK__ID;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT = REQUEST_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER = REQUEST_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Activating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING = REQUEST_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Request Link Activating To Reference Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION_FEATURE_COUNT = REQUEST_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Request Link Activating To Reference Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION_OPERATION_COUNT = REQUEST_LINK_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_VALUE__VALUE = PINFO_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_VALUE__NAME = PINFO_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Public Pinfo From Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_VALUE__PUBLIC_PINFO_FROM_MODULE_TYPE = PINFO_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_VALUE_FEATURE_COUNT = PINFO_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_VALUE_OPERATION_COUNT = PINFO_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_VALUE__VALUE = PINFO_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_VALUE__NAME = PINFO_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Private Pinfo From Module Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE = PINFO_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_VALUE_FEATURE_COUNT = PINFO_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Private Pinfo Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_VALUE_OPERATION_COUNT = PINFO_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PINFO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module Type Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PINFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Type Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PINFO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO__NAME = MODULE_TYPE_PINFO__NAME;

	/**
	 * The number of structural features of the '<em>Private Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_FEATURE_COUNT = MODULE_TYPE_PINFO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PINFO_OPERATION_COUNT = MODULE_TYPE_PINFO_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO__NAME = MODULE_TYPE_PINFO__NAME;

	/**
	 * The number of structural features of the '<em>Public Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_FEATURE_COUNT = MODULE_TYPE_PINFO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Pinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PINFO_OPERATION_COUNT = MODULE_TYPE_PINFO_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__PROPERTY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value Component Definition Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Module Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TYPE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.OperationInheritingFromSD <em>Operation Inheriting From SD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.OperationInheritingFromSD
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInheritingFromSD()
	 * @generated
	 */
	int OPERATION_INHERITING_FROM_SD = 69;

	/**
	 * The feature id for the '<em><b>SD Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_SD__SD_OPERATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Operation Inheriting From SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_SD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Inheriting From SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_SD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtimplementation.OperationInheritingFromMT <em>Operation Inheriting From MT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtimplementation.OperationInheritingFromMT
	 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInheritingFromMT()
	 * @generated
	 */
	int OPERATION_INHERITING_FROM_MT = 70;

	/**
	 * The feature id for the '<em><b>MT Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_MT__MT_OPERATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Operation Inheriting From MT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_MT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Inheriting From MT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INHERITING_FROM_MT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edtimplementation.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see edtimplementation.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for the reference list '{@link edtimplementation.ComponentImplementation#getUsedLibraries <em>Used Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Libraries</em>'.
	 * @see edtimplementation.ComponentImplementation#getUsedLibraries()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_UsedLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getAssociatedServiceQos <em>Associated Service Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Service Qos</em>'.
	 * @see edtimplementation.ComponentImplementation#getAssociatedServiceQos()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_AssociatedServiceQos();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see edtimplementation.ComponentImplementation#getServices()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see edtimplementation.ComponentImplementation#getReferences()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_References();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see edtimplementation.ComponentImplementation#getComponentDefinition()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getModuleTypes <em>Module Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Types</em>'.
	 * @see edtimplementation.ComponentImplementation#getModuleTypes()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getModuleImplementations <em>Module Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Implementations</em>'.
	 * @see edtimplementation.ComponentImplementation#getModuleImplementations()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleImplementations();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see edtimplementation.ComponentImplementation#getInstances()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getComponentDefinitionReferences <em>Component Definition References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Definition References</em>'.
	 * @see edtimplementation.ComponentImplementation#getComponentDefinitionReferences()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ComponentDefinitionReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getComponentDefinitionServices <em>Component Definition Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Definition Services</em>'.
	 * @see edtimplementation.ComponentImplementation#getComponentDefinitionServices()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ComponentDefinitionServices();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getOperationLinks <em>Operation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Links</em>'.
	 * @see edtimplementation.ComponentImplementation#getOperationLinks()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_OperationLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getExternalSenders <em>External Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Senders</em>'.
	 * @see edtimplementation.ComponentImplementation#getExternalSenders()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ExternalSenders();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getModuleBehaviours <em>Module Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Behaviours</em>'.
	 * @see edtimplementation.ComponentImplementation#getModuleBehaviours()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_ModuleBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ComponentImplementation#getBinDesc <em>Bin Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bin Desc</em>'.
	 * @see edtimplementation.ComponentImplementation#getBinDesc()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_BinDesc();

	/**
	 * Returns the meta object for the containment reference '{@link edtimplementation.ComponentImplementation#getInsertionPolicyList <em>Insertion Policy List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion Policy List</em>'.
	 * @see edtimplementation.ComponentImplementation#getInsertionPolicyList()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_InsertionPolicyList();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ComponentImplementationReference <em>Component Implementation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation Reference</em>'.
	 * @see edtimplementation.ComponentImplementationReference
	 * @generated
	 */
	EClass getComponentImplementationReference();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ComponentImplementationReference#getNewQos <em>New Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Qos</em>'.
	 * @see edtimplementation.ComponentImplementationReference#getNewQos()
	 * @see #getComponentImplementationReference()
	 * @generated
	 */
	EReference getComponentImplementationReference_NewQos();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ComponentImplementationReference#getComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Reference</em>'.
	 * @see edtimplementation.ComponentImplementationReference#getComponentDefinitionReference()
	 * @see #getComponentImplementationReference()
	 * @generated
	 */
	EReference getComponentImplementationReference_ComponentDefinitionReference();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ComponentImplementationService <em>Component Implementation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation Service</em>'.
	 * @see edtimplementation.ComponentImplementationService
	 * @generated
	 */
	EClass getComponentImplementationService();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ComponentImplementationService#getNewQos <em>New Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Qos</em>'.
	 * @see edtimplementation.ComponentImplementationService#getNewQos()
	 * @see #getComponentImplementationService()
	 * @generated
	 */
	EReference getComponentImplementationService_NewQos();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ComponentImplementationService#getComponentDefinitionService <em>Component Definition Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Service</em>'.
	 * @see edtimplementation.ComponentImplementationService#getComponentDefinitionService()
	 * @see #getComponentImplementationService()
	 * @generated
	 */
	EReference getComponentImplementationService_ComponentDefinitionService();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Type</em>'.
	 * @see edtimplementation.ModuleType
	 * @generated
	 */
	EClass getModuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edtimplementation.ModuleType#getProperties()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleType#getPinfo <em>Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinfo</em>'.
	 * @see edtimplementation.ModuleType#getPinfo()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Pinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtimplementation.ModuleType#getOperations()
	 * @see #getModuleType()
	 * @generated
	 */
	EReference getModuleType_Operations();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activating Fault Notifs</em>'.
	 * @see edtimplementation.ModuleType#isActivatingFaultNotifs()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_ActivatingFaultNotifs();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleType#isHasUserContext <em>Has User Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has User Context</em>'.
	 * @see edtimplementation.ModuleType#isHasUserContext()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_HasUserContext();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Warm Start Context</em>'.
	 * @see edtimplementation.ModuleType#isHasWarmStartContext()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_HasWarmStartContext();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fault Handler</em>'.
	 * @see edtimplementation.ModuleType#isIsFaultHandler()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_IsFaultHandler();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ModuleType#getName()
	 * @see #getModuleType()
	 * @generated
	 */
	EAttribute getModuleType_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleOperation <em>Module Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Operation</em>'.
	 * @see edtimplementation.ModuleOperation
	 * @generated
	 */
	EClass getModuleOperation();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ModuleOperation#getName()
	 * @see #getModuleOperation()
	 * @generated
	 */
	EAttribute getModuleOperation_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see edtimplementation.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.EventType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edtimplementation.EventType#getInput()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Input();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestResponseType <em>Request Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response Type</em>'.
	 * @see edtimplementation.RequestResponseType
	 * @generated
	 */
	EClass getRequestResponseType();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.RequestResponseType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edtimplementation.RequestResponseType#getInput()
	 * @see #getRequestResponseType()
	 * @generated
	 */
	EReference getRequestResponseType_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.RequestResponseType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see edtimplementation.RequestResponseType#getOutput()
	 * @see #getRequestResponseType()
	 * @generated
	 */
	EReference getRequestResponseType_Output();

	/**
	 * Returns the meta object for class '{@link edtimplementation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edtimplementation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edtimplementation.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventSent <em>Event Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Sent</em>'.
	 * @see edtimplementation.EventSent
	 * @generated
	 */
	EClass getEventSent();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventReceived <em>Event Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Received</em>'.
	 * @see edtimplementation.EventReceived
	 * @generated
	 */
	EClass getEventReceived();

	/**
	 * Returns the meta object for class '{@link edtimplementation.VersionedDataWritten <em>Versioned Data Written</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data Written</em>'.
	 * @see edtimplementation.VersionedDataWritten
	 * @generated
	 */
	EClass getVersionedDataWritten();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.VersionedDataWritten#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see edtimplementation.VersionedDataWritten#isWriteOnly()
	 * @see #getVersionedDataWritten()
	 * @generated
	 */
	EAttribute getVersionedDataWritten_WriteOnly();

	/**
	 * Returns the meta object for class '{@link edtimplementation.VersionedDataRead <em>Versioned Data Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data Read</em>'.
	 * @see edtimplementation.VersionedDataRead
	 * @generated
	 */
	EClass getVersionedDataRead();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.VersionedDataRead#isNotifying <em>Notifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notifying</em>'.
	 * @see edtimplementation.VersionedDataRead#isNotifying()
	 * @see #getVersionedDataRead()
	 * @generated
	 */
	EAttribute getVersionedDataRead_Notifying();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestSent <em>Request Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Sent</em>'.
	 * @see edtimplementation.RequestSent
	 * @generated
	 */
	EClass getRequestSent();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestSent#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see edtimplementation.RequestSent#isIsSynchronous()
	 * @see #getRequestSent()
	 * @generated
	 */
	EAttribute getRequestSent_IsSynchronous();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestSent#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Requests</em>'.
	 * @see edtimplementation.RequestSent#getMaxConcurrentRequests()
	 * @see #getRequestSent()
	 * @generated
	 */
	EAttribute getRequestSent_MaxConcurrentRequests();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestSent#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see edtimplementation.RequestSent#getTimeout()
	 * @see #getRequestSent()
	 * @generated
	 */
	EAttribute getRequestSent_Timeout();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestReceived <em>Request Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Received</em>'.
	 * @see edtimplementation.RequestReceived
	 * @generated
	 */
	EClass getRequestReceived();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestReceived#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Requests</em>'.
	 * @see edtimplementation.RequestReceived#getMaxConcurrentRequests()
	 * @see #getRequestReceived()
	 * @generated
	 */
	EAttribute getRequestReceived_MaxConcurrentRequests();

	/**
	 * Returns the meta object for class '{@link edtimplementation.VersionedDataType <em>Versioned Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data Type</em>'.
	 * @see edtimplementation.VersionedDataType
	 * @generated
	 */
	EClass getVersionedDataType();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.VersionedDataType#getMaxVersions <em>Max Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Versions</em>'.
	 * @see edtimplementation.VersionedDataType#getMaxVersions()
	 * @see #getVersionedDataType()
	 * @generated
	 */
	EAttribute getVersionedDataType_MaxVersions();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.VersionedDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edtimplementation.VersionedDataType#getType()
	 * @see #getVersionedDataType()
	 * @generated
	 */
	EReference getVersionedDataType_Type();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Implementation</em>'.
	 * @see edtimplementation.ModuleImplementation
	 * @generated
	 */
	EClass getModuleImplementation();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleImplementation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see edtimplementation.ModuleImplementation#getLanguage()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EAttribute getModuleImplementation_Language();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ModuleImplementation#getName()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EAttribute getModuleImplementation_Name();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ModuleImplementation#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Type</em>'.
	 * @see edtimplementation.ModuleImplementation#getModuleType()
	 * @see #getModuleImplementation()
	 * @generated
	 */
	EReference getModuleImplementation_ModuleType();

	/**
	 * Returns the meta object for class '{@link edtimplementation.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see edtimplementation.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.Instance#getModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Behaviour</em>'.
	 * @see edtimplementation.Instance#getModuleBehaviour()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ModuleBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.Instance#getRelativePriority <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Priority</em>'.
	 * @see edtimplementation.Instance#getRelativePriority()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_RelativePriority();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instance</em>'.
	 * @see edtimplementation.ModuleInstance
	 * @generated
	 */
	EClass getModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleInstance#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see edtimplementation.ModuleInstance#getPropertyValues()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_PropertyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleInstance#getPinfo <em>Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinfo</em>'.
	 * @see edtimplementation.ModuleInstance#getPinfo()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_Pinfo();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ModuleInstance#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Type</em>'.
	 * @see edtimplementation.ModuleInstance#getModuleType()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_ModuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ModuleInstance#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtimplementation.ModuleInstance#getOperations()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_Operations();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ModuleInstance#getModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Implementation</em>'.
	 * @see edtimplementation.ModuleInstance#getModuleImplementation()
	 * @see #getModuleInstance()
	 * @generated
	 */
	EReference getModuleInstance_ModuleImplementation();

	/**
	 * Returns the meta object for class '{@link edtimplementation.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Instance</em>'.
	 * @see edtimplementation.TriggerInstance
	 * @generated
	 */
	EClass getTriggerInstance();

	/**
	 * Returns the meta object for the containment reference '{@link edtimplementation.TriggerInstance#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see edtimplementation.TriggerInstance#getOperations()
	 * @see #getTriggerInstance()
	 * @generated
	 */
	EReference getTriggerInstance_Operations();

	/**
	 * Returns the meta object for class '{@link edtimplementation.TriggerSender <em>Trigger Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Sender</em>'.
	 * @see edtimplementation.TriggerSender
	 * @generated
	 */
	EClass getTriggerSender();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DynamicTriggerInstance <em>Dynamic Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Trigger Instance</em>'.
	 * @see edtimplementation.DynamicTriggerInstance
	 * @generated
	 */
	EClass getDynamicTriggerInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.DynamicTriggerInstance#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see edtimplementation.DynamicTriggerInstance#getParameter()
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 */
	EReference getDynamicTriggerInstance_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.DynamicTriggerInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see edtimplementation.DynamicTriggerInstance#getSize()
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 */
	EAttribute getDynamicTriggerInstance_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.DynamicTriggerInstance#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtimplementation.DynamicTriggerInstance#getOperations()
	 * @see #getDynamicTriggerInstance()
	 * @generated
	 */
	EReference getDynamicTriggerInstance_Operations();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventSenderInstance <em>Event Sender Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Sender Instance</em>'.
	 * @see edtimplementation.EventSenderInstance
	 * @generated
	 */
	EClass getEventSenderInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventReceiverInstance <em>Event Receiver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Receiver Instance</em>'.
	 * @see edtimplementation.EventReceiverInstance
	 * @generated
	 */
	EClass getEventReceiverInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestClientInstance <em>Request Client Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Client Instance</em>'.
	 * @see edtimplementation.RequestClientInstance
	 * @generated
	 */
	EClass getRequestClientInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestServerInstance <em>Request Server Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Server Instance</em>'.
	 * @see edtimplementation.RequestServerInstance
	 * @generated
	 */
	EClass getRequestServerInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.OperationInstance <em>Operation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Instance</em>'.
	 * @see edtimplementation.OperationInstance
	 * @generated
	 */
	EClass getOperationInstance();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.OperationInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.OperationInstance#getName()
	 * @see #getOperationInstance()
	 * @generated
	 */
	EAttribute getOperationInstance_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataWriterInstance <em>Data Writer Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Writer Instance</em>'.
	 * @see edtimplementation.DataWriterInstance
	 * @generated
	 */
	EClass getDataWriterInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataReaderInstance <em>Data Reader Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Reader Instance</em>'.
	 * @see edtimplementation.DataReaderInstance
	 * @generated
	 */
	EClass getDataReaderInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ServRefOfLinkedComponentDefinition <em>Serv Ref Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Ref Of Linked Component Definition</em>'.
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition
	 * @generated
	 */
	EClass getServRefOfLinkedComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edtimplementation.ServRefOfLinkedComponentDefinition#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition#getOperations()
	 * @see #getServRefOfLinkedComponentDefinition()
	 * @generated
	 */
	EReference getServRefOfLinkedComponentDefinition_Operations();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ServRefOfLinkedComponentDefinition#getServiceDefinitionLink <em>Service Definition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Definition Link</em>'.
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition#getServiceDefinitionLink()
	 * @see #getServRefOfLinkedComponentDefinition()
	 * @generated
	 */
	EReference getServRefOfLinkedComponentDefinition_ServiceDefinitionLink();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ServRefOfLinkedComponentDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ServRefOfLinkedComponentDefinition#getName()
	 * @see #getServRefOfLinkedComponentDefinition()
	 * @generated
	 */
	EAttribute getServRefOfLinkedComponentDefinition_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DynamicTriggerEventReceiverInstance <em>Dynamic Trigger Event Receiver Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Trigger Event Receiver Instance</em>'.
	 * @see edtimplementation.DynamicTriggerEventReceiverInstance
	 * @generated
	 */
	EClass getDynamicTriggerEventReceiverInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DynamicTriggerEventSenderInstance <em>Dynamic Trigger Event Sender Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Trigger Event Sender Instance</em>'.
	 * @see edtimplementation.DynamicTriggerEventSenderInstance
	 * @generated
	 */
	EClass getDynamicTriggerEventSenderInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ReferenceOfLinkedComponentDefinition <em>Reference Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Of Linked Component Definition</em>'.
	 * @see edtimplementation.ReferenceOfLinkedComponentDefinition
	 * @generated
	 */
	EClass getReferenceOfLinkedComponentDefinition();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ReferenceOfLinkedComponentDefinition#getComponentDefinitionReferenceLink <em>Component Definition Reference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Reference Link</em>'.
	 * @see edtimplementation.ReferenceOfLinkedComponentDefinition#getComponentDefinitionReferenceLink()
	 * @see #getReferenceOfLinkedComponentDefinition()
	 * @generated
	 */
	EReference getReferenceOfLinkedComponentDefinition_ComponentDefinitionReferenceLink();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ServiceOfLinkedComponentDefinition <em>Service Of Linked Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Of Linked Component Definition</em>'.
	 * @see edtimplementation.ServiceOfLinkedComponentDefinition
	 * @generated
	 */
	EClass getServiceOfLinkedComponentDefinition();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ServiceOfLinkedComponentDefinition#getComponentDefinitionServiceLink <em>Component Definition Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Service Link</em>'.
	 * @see edtimplementation.ServiceOfLinkedComponentDefinition#getComponentDefinitionServiceLink()
	 * @see #getServiceOfLinkedComponentDefinition()
	 * @generated
	 */
	EReference getServiceOfLinkedComponentDefinition_ComponentDefinitionServiceLink();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventDefinitionInstance <em>Event Definition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition Instance</em>'.
	 * @see edtimplementation.EventDefinitionInstance
	 * @generated
	 */
	EClass getEventDefinitionInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestReferenceInstance <em>Request Reference Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Reference Instance</em>'.
	 * @see edtimplementation.RequestReferenceInstance
	 * @generated
	 */
	EClass getRequestReferenceInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestServiceInstance <em>Request Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Service Instance</em>'.
	 * @see edtimplementation.RequestServiceInstance
	 * @generated
	 */
	EClass getRequestServiceInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.VersionedDataReferenceInstance <em>Versioned Data Reference Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data Reference Instance</em>'.
	 * @see edtimplementation.VersionedDataReferenceInstance
	 * @generated
	 */
	EClass getVersionedDataReferenceInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.VersionedDataServiceInstance <em>Versioned Data Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Data Service Instance</em>'.
	 * @see edtimplementation.VersionedDataServiceInstance
	 * @generated
	 */
	EClass getVersionedDataServiceInstance();

	/**
	 * Returns the meta object for class '{@link edtimplementation.OperationLink <em>Operation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Link</em>'.
	 * @see edtimplementation.OperationLink
	 * @generated
	 */
	EClass getOperationLink();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.OperationLink#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edtimplementation.OperationLink#getId()
	 * @see #getOperationLink()
	 * @generated
	 */
	EAttribute getOperationLink_Id();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link</em>'.
	 * @see edtimplementation.DataLink
	 * @generated
	 */
	EClass getDataLink();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.DataLink#isControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlled</em>'.
	 * @see edtimplementation.DataLink#isControlled()
	 * @see #getDataLink()
	 * @generated
	 */
	EAttribute getDataLink_Controlled();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLink <em>Request Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link</em>'.
	 * @see edtimplementation.RequestLink
	 * @generated
	 */
	EClass getRequestLink();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLink <em>Event Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link</em>'.
	 * @see edtimplementation.EventLink
	 * @generated
	 */
	EClass getEventLink();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataLinkWriter <em>Data Link Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link Writer</em>'.
	 * @see edtimplementation.DataLinkWriter
	 * @generated
	 */
	EClass getDataLinkWriter();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataLinkReader <em>Data Link Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link Reader</em>'.
	 * @see edtimplementation.DataLinkReader
	 * @generated
	 */
	EClass getDataLinkReader();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkSender <em>Event Link Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Sender</em>'.
	 * @see edtimplementation.EventLinkSender
	 * @generated
	 */
	EClass getEventLinkSender();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkReceiver <em>Event Link Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Receiver</em>'.
	 * @see edtimplementation.EventLinkReceiver
	 * @generated
	 */
	EClass getEventLinkReceiver();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLinkClient <em>Request Link Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link Client</em>'.
	 * @see edtimplementation.RequestLinkClient
	 * @generated
	 */
	EClass getRequestLinkClient();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLinkServer <em>Request Link Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link Server</em>'.
	 * @see edtimplementation.RequestLinkServer
	 * @generated
	 */
	EClass getRequestLinkServer();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataLinkActivatableFifo <em>Data Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link Activatable Fifo</em>'.
	 * @see edtimplementation.DataLinkActivatableFifo
	 * @generated
	 */
	EClass getDataLinkActivatableFifo();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.DataLinkActivatableFifo#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Writer</em>'.
	 * @see edtimplementation.DataLinkActivatableFifo#getWriter()
	 * @see #getDataLinkActivatableFifo()
	 * @generated
	 */
	EReference getDataLinkActivatableFifo_Writer();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.DataLinkActivatableFifo#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reader</em>'.
	 * @see edtimplementation.DataLinkActivatableFifo#getReader()
	 * @see #getDataLinkActivatableFifo()
	 * @generated
	 */
	EReference getDataLinkActivatableFifo_Reader();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.DataLinkActivatableFifo#getReaderFifoSize <em>Reader Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader Fifo Size</em>'.
	 * @see edtimplementation.DataLinkActivatableFifo#getReaderFifoSize()
	 * @see #getDataLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getDataLinkActivatableFifo_ReaderFifoSize();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.DataLinkActivatableFifo#isReaderActivating <em>Reader Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader Activating</em>'.
	 * @see edtimplementation.DataLinkActivatableFifo#isReaderActivating()
	 * @see #getDataLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getDataLinkActivatableFifo_ReaderActivating();

	/**
	 * Returns the meta object for class '{@link edtimplementation.DataLinkToServiceOperation <em>Data Link To Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link To Service Operation</em>'.
	 * @see edtimplementation.DataLinkToServiceOperation
	 * @generated
	 */
	EClass getDataLinkToServiceOperation();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.DataLinkToServiceOperation#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Writer</em>'.
	 * @see edtimplementation.DataLinkToServiceOperation#getWriter()
	 * @see #getDataLinkToServiceOperation()
	 * @generated
	 */
	EReference getDataLinkToServiceOperation_Writer();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.DataLinkToServiceOperation#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reader</em>'.
	 * @see edtimplementation.DataLinkToServiceOperation#getReader()
	 * @see #getDataLinkToServiceOperation()
	 * @generated
	 */
	EReference getDataLinkToServiceOperation_Reader();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkActivatableFifo <em>Event Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Activatable Fifo</em>'.
	 * @see edtimplementation.EventLinkActivatableFifo
	 * @generated
	 */
	EClass getEventLinkActivatableFifo();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Fifo Size</em>'.
	 * @see edtimplementation.EventLinkActivatableFifo#getReceiverFifoSize()
	 * @see #getEventLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getEventLinkActivatableFifo_ReceiverFifoSize();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatableFifo#isReceiverActivating <em>Receiver Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Activating</em>'.
	 * @see edtimplementation.EventLinkActivatableFifo#isReceiverActivating()
	 * @see #getEventLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getEventLinkActivatableFifo_ReceiverActivating();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatableFifo#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkActivatableFifo#getSender()
	 * @see #getEventLinkActivatableFifo()
	 * @generated
	 */
	EReference getEventLinkActivatableFifo_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatableFifo#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkActivatableFifo#getReceiver()
	 * @see #getEventLinkActivatableFifo()
	 * @generated
	 */
	EReference getEventLinkActivatableFifo_Receiver();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkActivatingFifo <em>Event Link Activating Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Activating Fifo</em>'.
	 * @see edtimplementation.EventLinkActivatingFifo
	 * @generated
	 */
	EClass getEventLinkActivatingFifo();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize <em>Receiver Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Fifo Size</em>'.
	 * @see edtimplementation.EventLinkActivatingFifo#getReceiverFifoSize()
	 * @see #getEventLinkActivatingFifo()
	 * @generated
	 */
	EAttribute getEventLinkActivatingFifo_ReceiverFifoSize();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatingFifo#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkActivatingFifo#getSender()
	 * @see #getEventLinkActivatingFifo()
	 * @generated
	 */
	EReference getEventLinkActivatingFifo_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatingFifo#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkActivatingFifo#getReceiver()
	 * @see #getEventLinkActivatingFifo()
	 * @generated
	 */
	EReference getEventLinkActivatingFifo_Receiver();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkToDefinitionOperation <em>Event Link To Definition Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link To Definition Operation</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperation
	 * @generated
	 */
	EClass getEventLinkToDefinitionOperation();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkToDefinitionOperation#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperation#getSender()
	 * @see #getEventLinkToDefinitionOperation()
	 * @generated
	 */
	EReference getEventLinkToDefinitionOperation_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkToDefinitionOperation#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperation#getReceiver()
	 * @see #getEventLinkToDefinitionOperation()
	 * @generated
	 */
	EReference getEventLinkToDefinitionOperation_Receiver();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger <em>Event Link To Definition Operation From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link To Definition Operation From Trigger</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperationFromTrigger
	 * @generated
	 */
	EClass getEventLinkToDefinitionOperationFromTrigger();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperationFromTrigger#getSender()
	 * @see #getEventLinkToDefinitionOperationFromTrigger()
	 * @generated
	 */
	EReference getEventLinkToDefinitionOperationFromTrigger_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperationFromTrigger#getReceiver()
	 * @see #getEventLinkToDefinitionOperationFromTrigger()
	 * @generated
	 */
	EReference getEventLinkToDefinitionOperationFromTrigger_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkToDefinitionOperationFromTrigger#getTriggerPeriod <em>Trigger Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Period</em>'.
	 * @see edtimplementation.EventLinkToDefinitionOperationFromTrigger#getTriggerPeriod()
	 * @see #getEventLinkToDefinitionOperationFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkToDefinitionOperationFromTrigger_TriggerPeriod();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkActivatingFifoFromTrigger <em>Event Link Activating Fifo From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Activating Fifo From Trigger</em>'.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger
	 * @generated
	 */
	EClass getEventLinkActivatingFifoFromTrigger();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Fifo Size</em>'.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize()
	 * @see #getEventLinkActivatingFifoFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkActivatingFifoFromTrigger_ReceiverFifoSize();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger#getSender()
	 * @see #getEventLinkActivatingFifoFromTrigger()
	 * @generated
	 */
	EReference getEventLinkActivatingFifoFromTrigger_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiver()
	 * @see #getEventLinkActivatingFifoFromTrigger()
	 * @generated
	 */
	EReference getEventLinkActivatingFifoFromTrigger_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getTriggerPeriod <em>Trigger Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Period</em>'.
	 * @see edtimplementation.EventLinkActivatingFifoFromTrigger#getTriggerPeriod()
	 * @see #getEventLinkActivatingFifoFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkActivatingFifoFromTrigger_TriggerPeriod();

	/**
	 * Returns the meta object for class '{@link edtimplementation.EventLinkActivatableFifoFromTrigger <em>Event Link Activatable Fifo From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Link Activatable Fifo From Trigger</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger
	 * @generated
	 */
	EClass getEventLinkActivatableFifoFromTrigger();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatableFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Fifo Size</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger#getReceiverFifoSize()
	 * @see #getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkActivatableFifoFromTrigger_ReceiverFifoSize();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatableFifoFromTrigger#isReceiverActivating <em>Receiver Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Activating</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger#isReceiverActivating()
	 * @see #getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkActivatableFifoFromTrigger_ReceiverActivating();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatableFifoFromTrigger#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger#getSender()
	 * @see #getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	EReference getEventLinkActivatableFifoFromTrigger_Sender();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.EventLinkActivatableFifoFromTrigger#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger#getReceiver()
	 * @see #getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	EReference getEventLinkActivatableFifoFromTrigger_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.EventLinkActivatableFifoFromTrigger#getTriggerPeriod <em>Trigger Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Period</em>'.
	 * @see edtimplementation.EventLinkActivatableFifoFromTrigger#getTriggerPeriod()
	 * @see #getEventLinkActivatableFifoFromTrigger()
	 * @generated
	 */
	EAttribute getEventLinkActivatableFifoFromTrigger_TriggerPeriod();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLinkActivatableFifo <em>Request Link Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link Activatable Fifo</em>'.
	 * @see edtimplementation.RequestLinkActivatableFifo
	 * @generated
	 */
	EClass getRequestLinkActivatableFifo();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatableFifo#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see edtimplementation.RequestLinkActivatableFifo#getClient()
	 * @see #getRequestLinkActivatableFifo()
	 * @generated
	 */
	EReference getRequestLinkActivatableFifo_Client();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatableFifo#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see edtimplementation.RequestLinkActivatableFifo#getServer()
	 * @see #getRequestLinkActivatableFifo()
	 * @generated
	 */
	EReference getRequestLinkActivatableFifo_Server();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Fifo Size</em>'.
	 * @see edtimplementation.RequestLinkActivatableFifo#getServerFifoSize()
	 * @see #getRequestLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getRequestLinkActivatableFifo_ServerFifoSize();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatableFifo#isServerActivating <em>Server Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Activating</em>'.
	 * @see edtimplementation.RequestLinkActivatableFifo#isServerActivating()
	 * @see #getRequestLinkActivatableFifo()
	 * @generated
	 */
	EAttribute getRequestLinkActivatableFifo_ServerActivating();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLinkActivatingActivatableFifo <em>Request Link Activating Activatable Fifo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link Activating Activatable Fifo</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo
	 * @generated
	 */
	EClass getRequestLinkActivatingActivatableFifo();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatingActivatableFifo#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo#getClient()
	 * @see #getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	EReference getRequestLinkActivatingActivatableFifo_Client();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatingActivatableFifo#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo#getServer()
	 * @see #getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	EReference getRequestLinkActivatingActivatableFifo_Server();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatingActivatableFifo#isClientActivating <em>Client Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Activating</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo#isClientActivating()
	 * @see #getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	EAttribute getRequestLinkActivatingActivatableFifo_ClientActivating();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatingActivatableFifo#getServerFifoSize <em>Server Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Fifo Size</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo#getServerFifoSize()
	 * @see #getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	EAttribute getRequestLinkActivatingActivatableFifo_ServerFifoSize();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatingActivatableFifo#isServerActivating <em>Server Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Activating</em>'.
	 * @see edtimplementation.RequestLinkActivatingActivatableFifo#isServerActivating()
	 * @see #getRequestLinkActivatingActivatableFifo()
	 * @generated
	 */
	EAttribute getRequestLinkActivatingActivatableFifo_ServerActivating();

	/**
	 * Returns the meta object for class '{@link edtimplementation.RequestLinkActivatingToReferenceOperation <em>Request Link Activating To Reference Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Link Activating To Reference Operation</em>'.
	 * @see edtimplementation.RequestLinkActivatingToReferenceOperation
	 * @generated
	 */
	EClass getRequestLinkActivatingToReferenceOperation();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see edtimplementation.RequestLinkActivatingToReferenceOperation#getClient()
	 * @see #getRequestLinkActivatingToReferenceOperation()
	 * @generated
	 */
	EReference getRequestLinkActivatingToReferenceOperation_Client();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see edtimplementation.RequestLinkActivatingToReferenceOperation#getServer()
	 * @see #getRequestLinkActivatingToReferenceOperation()
	 * @generated
	 */
	EReference getRequestLinkActivatingToReferenceOperation_Server();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating <em>Client Activating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Activating</em>'.
	 * @see edtimplementation.RequestLinkActivatingToReferenceOperation#isClientActivating()
	 * @see #getRequestLinkActivatingToReferenceOperation()
	 * @generated
	 */
	EAttribute getRequestLinkActivatingToReferenceOperation_ClientActivating();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PublicPinfoValue <em>Public Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Pinfo Value</em>'.
	 * @see edtimplementation.PublicPinfoValue
	 * @generated
	 */
	EClass getPublicPinfoValue();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.PublicPinfoValue#getPublicPinfoFromModuleType <em>Public Pinfo From Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Public Pinfo From Module Type</em>'.
	 * @see edtimplementation.PublicPinfoValue#getPublicPinfoFromModuleType()
	 * @see #getPublicPinfoValue()
	 * @generated
	 */
	EReference getPublicPinfoValue_PublicPinfoFromModuleType();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PrivatePinfoValue <em>Private Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Pinfo Value</em>'.
	 * @see edtimplementation.PrivatePinfoValue
	 * @generated
	 */
	EClass getPrivatePinfoValue();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.PrivatePinfoValue#getPrivatePinfoFromModuleType <em>Private Pinfo From Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Private Pinfo From Module Type</em>'.
	 * @see edtimplementation.PrivatePinfoValue#getPrivatePinfoFromModuleType()
	 * @see #getPrivatePinfoValue()
	 * @generated
	 */
	EReference getPrivatePinfoValue_PrivatePinfoFromModuleType();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PinfoValue <em>Pinfo Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinfo Value</em>'.
	 * @see edtimplementation.PinfoValue
	 * @generated
	 */
	EClass getPinfoValue();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.PinfoValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edtimplementation.PinfoValue#getValue()
	 * @see #getPinfoValue()
	 * @generated
	 */
	EAttribute getPinfoValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.PinfoValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.PinfoValue#getName()
	 * @see #getPinfoValue()
	 * @generated
	 */
	EAttribute getPinfoValue_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PrivatePinfo <em>Private Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Pinfo</em>'.
	 * @see edtimplementation.PrivatePinfo
	 * @generated
	 */
	EClass getPrivatePinfo();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PublicPinfo <em>Public Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Pinfo</em>'.
	 * @see edtimplementation.PublicPinfo
	 * @generated
	 */
	EClass getPublicPinfo();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleTypePinfo <em>Module Type Pinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Type Pinfo</em>'.
	 * @see edtimplementation.ModuleTypePinfo
	 * @generated
	 */
	EClass getModuleTypePinfo();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleTypePinfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ModuleTypePinfo#getName()
	 * @see #getModuleTypePinfo()
	 * @generated
	 */
	EAttribute getModuleTypePinfo_Name();

	/**
	 * Returns the meta object for class '{@link edtimplementation.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see edtimplementation.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edtimplementation.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.PropertyValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.PropertyValue#getName()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Name();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.PropertyValue#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Type</em>'.
	 * @see edtimplementation.PropertyValue#getPropertyType()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EReference getPropertyValue_PropertyType();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.PropertyValue#getValueComponentDefinitionProperty <em>Value Component Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Component Definition Property</em>'.
	 * @see edtimplementation.PropertyValue#getValueComponentDefinitionProperty()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EReference getPropertyValue_ValueComponentDefinitionProperty();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ModuleTypeProperty <em>Module Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Type Property</em>'.
	 * @see edtimplementation.ModuleTypeProperty
	 * @generated
	 */
	EClass getModuleTypeProperty();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ModuleTypeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ModuleTypeProperty#getName()
	 * @see #getModuleTypeProperty()
	 * @generated
	 */
	EAttribute getModuleTypeProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.ModuleTypeProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edtimplementation.ModuleTypeProperty#getType()
	 * @see #getModuleTypeProperty()
	 * @generated
	 */
	EReference getModuleTypeProperty_Type();

	/**
	 * Returns the meta object for class '{@link edtimplementation.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see edtimplementation.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link edtimplementation.OperationInheritingFromSD <em>Operation Inheriting From SD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Inheriting From SD</em>'.
	 * @see edtimplementation.OperationInheritingFromSD
	 * @generated
	 */
	EClass getOperationInheritingFromSD();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.OperationInheritingFromSD#getSDOperationRef <em>SD Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SD Operation Ref</em>'.
	 * @see edtimplementation.OperationInheritingFromSD#getSDOperationRef()
	 * @see #getOperationInheritingFromSD()
	 * @generated
	 */
	EReference getOperationInheritingFromSD_SDOperationRef();

	/**
	 * Returns the meta object for class '{@link edtimplementation.OperationInheritingFromMT <em>Operation Inheriting From MT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Inheriting From MT</em>'.
	 * @see edtimplementation.OperationInheritingFromMT
	 * @generated
	 */
	EClass getOperationInheritingFromMT();

	/**
	 * Returns the meta object for the reference '{@link edtimplementation.OperationInheritingFromMT#getMTOperationRef <em>MT Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MT Operation Ref</em>'.
	 * @see edtimplementation.OperationInheritingFromMT#getMTOperationRef()
	 * @see #getOperationInheritingFromMT()
	 * @generated
	 */
	EReference getOperationInheritingFromMT_MTOperationRef();

	/**
	 * Returns the meta object for class '{@link edtimplementation.ExternalSenderOperation <em>External Sender Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Sender Operation</em>'.
	 * @see edtimplementation.ExternalSenderOperation
	 * @generated
	 */
	EClass getExternalSenderOperation();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ExternalSenderOperation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see edtimplementation.ExternalSenderOperation#getLanguage()
	 * @see #getExternalSenderOperation()
	 * @generated
	 */
	EAttribute getExternalSenderOperation_Language();

	/**
	 * Returns the meta object for the attribute '{@link edtimplementation.ComponentImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtimplementation.ComponentImplementation#getName()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EAttribute getComponentImplementation_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtimplementationFactory getEdtimplementationFactory();

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
		 * The meta object literal for the '{@link edtimplementation.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ComponentImplementationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Used Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__USED_LIBRARIES = eINSTANCE.getComponentImplementation_UsedLibraries();

		/**
		 * The meta object literal for the '<em><b>Associated Service Qos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS = eINSTANCE.getComponentImplementation_AssociatedServiceQos();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__SERVICES = eINSTANCE.getComponentImplementation_Services();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__REFERENCES = eINSTANCE.getComponentImplementation_References();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION = eINSTANCE.getComponentImplementation_ComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Module Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_TYPES = eINSTANCE.getComponentImplementation_ModuleTypes();

		/**
		 * The meta object literal for the '<em><b>Module Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS = eINSTANCE.getComponentImplementation_ModuleImplementations();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__INSTANCES = eINSTANCE.getComponentImplementation_Instances();

		/**
		 * The meta object literal for the '<em><b>Component Definition References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES = eINSTANCE.getComponentImplementation_ComponentDefinitionReferences();

		/**
		 * The meta object literal for the '<em><b>Component Definition Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES = eINSTANCE.getComponentImplementation_ComponentDefinitionServices();

		/**
		 * The meta object literal for the '<em><b>Operation Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__OPERATION_LINKS = eINSTANCE.getComponentImplementation_OperationLinks();

		/**
		 * The meta object literal for the '<em><b>External Senders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS = eINSTANCE.getComponentImplementation_ExternalSenders();

		/**
		 * The meta object literal for the '<em><b>Module Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS = eINSTANCE.getComponentImplementation_ModuleBehaviours();

		/**
		 * The meta object literal for the '<em><b>Bin Desc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__BIN_DESC = eINSTANCE.getComponentImplementation_BinDesc();

		/**
		 * The meta object literal for the '<em><b>Insertion Policy List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST = eINSTANCE.getComponentImplementation_InsertionPolicyList();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ComponentImplementationReferenceImpl <em>Component Implementation Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ComponentImplementationReferenceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementationReference()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION_REFERENCE = eINSTANCE.getComponentImplementationReference();

		/**
		 * The meta object literal for the '<em><b>New Qos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS = eINSTANCE.getComponentImplementationReference_NewQos();

		/**
		 * The meta object literal for the '<em><b>Component Definition Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE = eINSTANCE.getComponentImplementationReference_ComponentDefinitionReference();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ComponentImplementationServiceImpl <em>Component Implementation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ComponentImplementationServiceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getComponentImplementationService()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION_SERVICE = eINSTANCE.getComponentImplementationService();

		/**
		 * The meta object literal for the '<em><b>New Qos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS = eINSTANCE.getComponentImplementationService_NewQos();

		/**
		 * The meta object literal for the '<em><b>Component Definition Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE = eINSTANCE.getComponentImplementationService_ComponentDefinitionService();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ModuleTypeImpl <em>Module Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ModuleTypeImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleType()
		 * @generated
		 */
		EClass MODULE_TYPE = eINSTANCE.getModuleType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__PROPERTIES = eINSTANCE.getModuleType_Properties();

		/**
		 * The meta object literal for the '<em><b>Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE__PINFO = eINSTANCE.getModuleType_Pinfo();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link edtimplementation.ModuleOperation <em>Module Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.ModuleOperation
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleOperation()
		 * @generated
		 */
		EClass MODULE_OPERATION = eINSTANCE.getModuleOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_OPERATION__NAME = eINSTANCE.getModuleOperation_Name();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventTypeImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__INPUT = eINSTANCE.getEventType_Input();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestResponseTypeImpl <em>Request Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestResponseTypeImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestResponseType()
		 * @generated
		 */
		EClass REQUEST_RESPONSE_TYPE = eINSTANCE.getRequestResponseType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE_TYPE__INPUT = eINSTANCE.getRequestResponseType_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE_TYPE__OUTPUT = eINSTANCE.getRequestResponseType_Output();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ParameterImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getParameter()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventSentImpl <em>Event Sent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventSentImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventSent()
		 * @generated
		 */
		EClass EVENT_SENT = eINSTANCE.getEventSent();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventReceivedImpl <em>Event Received</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventReceivedImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventReceived()
		 * @generated
		 */
		EClass EVENT_RECEIVED = eINSTANCE.getEventReceived();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.VersionedDataWrittenImpl <em>Versioned Data Written</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.VersionedDataWrittenImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataWritten()
		 * @generated
		 */
		EClass VERSIONED_DATA_WRITTEN = eINSTANCE.getVersionedDataWritten();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA_WRITTEN__WRITE_ONLY = eINSTANCE.getVersionedDataWritten_WriteOnly();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.VersionedDataReadImpl <em>Versioned Data Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.VersionedDataReadImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataRead()
		 * @generated
		 */
		EClass VERSIONED_DATA_READ = eINSTANCE.getVersionedDataRead();

		/**
		 * The meta object literal for the '<em><b>Notifying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA_READ__NOTIFYING = eINSTANCE.getVersionedDataRead_Notifying();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestSentImpl <em>Request Sent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestSentImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestSent()
		 * @generated
		 */
		EClass REQUEST_SENT = eINSTANCE.getRequestSent();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT__IS_SYNCHRONOUS = eINSTANCE.getRequestSent_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT__MAX_CONCURRENT_REQUESTS = eINSTANCE.getRequestSent_MaxConcurrentRequests();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_SENT__TIMEOUT = eINSTANCE.getRequestSent_Timeout();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestReceivedImpl <em>Request Received</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestReceivedImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestReceived()
		 * @generated
		 */
		EClass REQUEST_RECEIVED = eINSTANCE.getRequestReceived();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RECEIVED__MAX_CONCURRENT_REQUESTS = eINSTANCE.getRequestReceived_MaxConcurrentRequests();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.VersionedDataTypeImpl <em>Versioned Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.VersionedDataTypeImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataType()
		 * @generated
		 */
		EClass VERSIONED_DATA_TYPE = eINSTANCE.getVersionedDataType();

		/**
		 * The meta object literal for the '<em><b>Max Versions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_DATA_TYPE__MAX_VERSIONS = eINSTANCE.getVersionedDataType_MaxVersions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_DATA_TYPE__TYPE = eINSTANCE.getVersionedDataType_Type();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ModuleImplementationImpl <em>Module Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ModuleImplementationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleImplementation()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPLEMENTATION__NAME = eINSTANCE.getModuleImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Module Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__MODULE_TYPE = eINSTANCE.getModuleImplementation_ModuleType();

		/**
		 * The meta object literal for the '{@link edtimplementation.Instance <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.Instance
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getInstance()
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
		 * The meta object literal for the '{@link edtimplementation.impl.ModuleInstanceImpl <em>Module Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ModuleInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleInstance()
		 * @generated
		 */
		EClass MODULE_INSTANCE = eINSTANCE.getModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__PROPERTY_VALUES = eINSTANCE.getModuleInstance_PropertyValues();

		/**
		 * The meta object literal for the '<em><b>Pinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__PINFO = eINSTANCE.getModuleInstance_Pinfo();

		/**
		 * The meta object literal for the '<em><b>Module Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__MODULE_TYPE = eINSTANCE.getModuleInstance_ModuleType();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__OPERATIONS = eINSTANCE.getModuleInstance_Operations();

		/**
		 * The meta object literal for the '<em><b>Module Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCE__MODULE_IMPLEMENTATION = eINSTANCE.getModuleInstance_ModuleImplementation();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.TriggerInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTriggerInstance()
		 * @generated
		 */
		EClass TRIGGER_INSTANCE = eINSTANCE.getTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_INSTANCE__OPERATIONS = eINSTANCE.getTriggerInstance_Operations();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.TriggerSenderImpl <em>Trigger Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.TriggerSenderImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTriggerSender()
		 * @generated
		 */
		EClass TRIGGER_SENDER = eINSTANCE.getTriggerSender();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DynamicTriggerInstanceImpl <em>Dynamic Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DynamicTriggerInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerInstance()
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
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_TRIGGER_INSTANCE__OPERATIONS = eINSTANCE.getDynamicTriggerInstance_Operations();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventSenderInstanceImpl <em>Event Sender Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventSenderInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventSenderInstance()
		 * @generated
		 */
		EClass EVENT_SENDER_INSTANCE = eINSTANCE.getEventSenderInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventReceiverInstanceImpl <em>Event Receiver Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventReceiverInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventReceiverInstance()
		 * @generated
		 */
		EClass EVENT_RECEIVER_INSTANCE = eINSTANCE.getEventReceiverInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestClientInstanceImpl <em>Request Client Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestClientInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestClientInstance()
		 * @generated
		 */
		EClass REQUEST_CLIENT_INSTANCE = eINSTANCE.getRequestClientInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestServerInstanceImpl <em>Request Server Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestServerInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestServerInstance()
		 * @generated
		 */
		EClass REQUEST_SERVER_INSTANCE = eINSTANCE.getRequestServerInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.OperationInstance <em>Operation Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.OperationInstance
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInstance()
		 * @generated
		 */
		EClass OPERATION_INSTANCE = eINSTANCE.getOperationInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_INSTANCE__NAME = eINSTANCE.getOperationInstance_Name();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DataWriterInstanceImpl <em>Data Writer Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DataWriterInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataWriterInstance()
		 * @generated
		 */
		EClass DATA_WRITER_INSTANCE = eINSTANCE.getDataWriterInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DataReaderInstanceImpl <em>Data Reader Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DataReaderInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataReaderInstance()
		 * @generated
		 */
		EClass DATA_READER_INSTANCE = eINSTANCE.getDataReaderInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.ServRefOfLinkedComponentDefinition <em>Serv Ref Of Linked Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.ServRefOfLinkedComponentDefinition
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getServRefOfLinkedComponentDefinition()
		 * @generated
		 */
		EClass SERV_REF_OF_LINKED_COMPONENT_DEFINITION = eINSTANCE.getServRefOfLinkedComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS = eINSTANCE.getServRefOfLinkedComponentDefinition_Operations();

		/**
		 * The meta object literal for the '<em><b>Service Definition Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_REF_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK = eINSTANCE.getServRefOfLinkedComponentDefinition_ServiceDefinitionLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME = eINSTANCE.getServRefOfLinkedComponentDefinition_Name();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DynamicTriggerEventReceiverInstanceImpl <em>Dynamic Trigger Event Receiver Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DynamicTriggerEventReceiverInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerEventReceiverInstance()
		 * @generated
		 */
		EClass DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE = eINSTANCE.getDynamicTriggerEventReceiverInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DynamicTriggerEventSenderInstanceImpl <em>Dynamic Trigger Event Sender Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DynamicTriggerEventSenderInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDynamicTriggerEventSenderInstance()
		 * @generated
		 */
		EClass DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE = eINSTANCE.getDynamicTriggerEventSenderInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl <em>Reference Of Linked Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ReferenceOfLinkedComponentDefinitionImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getReferenceOfLinkedComponentDefinition()
		 * @generated
		 */
		EClass REFERENCE_OF_LINKED_COMPONENT_DEFINITION = eINSTANCE.getReferenceOfLinkedComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Component Definition Reference Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK = eINSTANCE.getReferenceOfLinkedComponentDefinition_ComponentDefinitionReferenceLink();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl <em>Service Of Linked Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ServiceOfLinkedComponentDefinitionImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getServiceOfLinkedComponentDefinition()
		 * @generated
		 */
		EClass SERVICE_OF_LINKED_COMPONENT_DEFINITION = eINSTANCE.getServiceOfLinkedComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Component Definition Service Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK = eINSTANCE.getServiceOfLinkedComponentDefinition_ComponentDefinitionServiceLink();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventDefinitionInstanceImpl <em>Event Definition Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventDefinitionInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventDefinitionInstance()
		 * @generated
		 */
		EClass EVENT_DEFINITION_INSTANCE = eINSTANCE.getEventDefinitionInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestReferenceInstanceImpl <em>Request Reference Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestReferenceInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestReferenceInstance()
		 * @generated
		 */
		EClass REQUEST_REFERENCE_INSTANCE = eINSTANCE.getRequestReferenceInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestServiceInstanceImpl <em>Request Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestServiceInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestServiceInstance()
		 * @generated
		 */
		EClass REQUEST_SERVICE_INSTANCE = eINSTANCE.getRequestServiceInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.VersionedDataReferenceInstanceImpl <em>Versioned Data Reference Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.VersionedDataReferenceInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataReferenceInstance()
		 * @generated
		 */
		EClass VERSIONED_DATA_REFERENCE_INSTANCE = eINSTANCE.getVersionedDataReferenceInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.VersionedDataServiceInstanceImpl <em>Versioned Data Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.VersionedDataServiceInstanceImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getVersionedDataServiceInstance()
		 * @generated
		 */
		EClass VERSIONED_DATA_SERVICE_INSTANCE = eINSTANCE.getVersionedDataServiceInstance();

		/**
		 * The meta object literal for the '{@link edtimplementation.OperationLink <em>Operation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.OperationLink
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationLink()
		 * @generated
		 */
		EClass OPERATION_LINK = eINSTANCE.getOperationLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_LINK__ID = eINSTANCE.getOperationLink_Id();

		/**
		 * The meta object literal for the '{@link edtimplementation.DataLink <em>Data Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.DataLink
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLink()
		 * @generated
		 */
		EClass DATA_LINK = eINSTANCE.getDataLink();

		/**
		 * The meta object literal for the '<em><b>Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK__CONTROLLED = eINSTANCE.getDataLink_Controlled();

		/**
		 * The meta object literal for the '{@link edtimplementation.RequestLink <em>Request Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.RequestLink
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLink()
		 * @generated
		 */
		EClass REQUEST_LINK = eINSTANCE.getRequestLink();

		/**
		 * The meta object literal for the '{@link edtimplementation.EventLink <em>Event Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.EventLink
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLink()
		 * @generated
		 */
		EClass EVENT_LINK = eINSTANCE.getEventLink();

		/**
		 * The meta object literal for the '{@link edtimplementation.DataLinkWriter <em>Data Link Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.DataLinkWriter
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkWriter()
		 * @generated
		 */
		EClass DATA_LINK_WRITER = eINSTANCE.getDataLinkWriter();

		/**
		 * The meta object literal for the '{@link edtimplementation.DataLinkReader <em>Data Link Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.DataLinkReader
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkReader()
		 * @generated
		 */
		EClass DATA_LINK_READER = eINSTANCE.getDataLinkReader();

		/**
		 * The meta object literal for the '{@link edtimplementation.EventLinkSender <em>Event Link Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.EventLinkSender
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkSender()
		 * @generated
		 */
		EClass EVENT_LINK_SENDER = eINSTANCE.getEventLinkSender();

		/**
		 * The meta object literal for the '{@link edtimplementation.EventLinkReceiver <em>Event Link Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.EventLinkReceiver
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkReceiver()
		 * @generated
		 */
		EClass EVENT_LINK_RECEIVER = eINSTANCE.getEventLinkReceiver();

		/**
		 * The meta object literal for the '{@link edtimplementation.RequestLinkClient <em>Request Link Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.RequestLinkClient
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkClient()
		 * @generated
		 */
		EClass REQUEST_LINK_CLIENT = eINSTANCE.getRequestLinkClient();

		/**
		 * The meta object literal for the '{@link edtimplementation.RequestLinkServer <em>Request Link Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.RequestLinkServer
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkServer()
		 * @generated
		 */
		EClass REQUEST_LINK_SERVER = eINSTANCE.getRequestLinkServer();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DataLinkActivatableFifoImpl <em>Data Link Activatable Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DataLinkActivatableFifoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkActivatableFifo()
		 * @generated
		 */
		EClass DATA_LINK_ACTIVATABLE_FIFO = eINSTANCE.getDataLinkActivatableFifo();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK_ACTIVATABLE_FIFO__WRITER = eINSTANCE.getDataLinkActivatableFifo_Writer();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK_ACTIVATABLE_FIFO__READER = eINSTANCE.getDataLinkActivatableFifo_Reader();

		/**
		 * The meta object literal for the '<em><b>Reader Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE = eINSTANCE.getDataLinkActivatableFifo_ReaderFifoSize();

		/**
		 * The meta object literal for the '<em><b>Reader Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING = eINSTANCE.getDataLinkActivatableFifo_ReaderActivating();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.DataLinkToServiceOperationImpl <em>Data Link To Service Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.DataLinkToServiceOperationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getDataLinkToServiceOperation()
		 * @generated
		 */
		EClass DATA_LINK_TO_SERVICE_OPERATION = eINSTANCE.getDataLinkToServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK_TO_SERVICE_OPERATION__WRITER = eINSTANCE.getDataLinkToServiceOperation_Writer();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK_TO_SERVICE_OPERATION__READER = eINSTANCE.getDataLinkToServiceOperation_Reader();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkActivatableFifoImpl <em>Event Link Activatable Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkActivatableFifoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatableFifo()
		 * @generated
		 */
		EClass EVENT_LINK_ACTIVATABLE_FIFO = eINSTANCE.getEventLinkActivatableFifo();

		/**
		 * The meta object literal for the '<em><b>Receiver Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE = eINSTANCE.getEventLinkActivatableFifo_ReceiverFifoSize();

		/**
		 * The meta object literal for the '<em><b>Receiver Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING = eINSTANCE.getEventLinkActivatableFifo_ReceiverActivating();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATABLE_FIFO__SENDER = eINSTANCE.getEventLinkActivatableFifo_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER = eINSTANCE.getEventLinkActivatableFifo_Receiver();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkActivatingFifoImpl <em>Event Link Activating Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkActivatingFifoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatingFifo()
		 * @generated
		 */
		EClass EVENT_LINK_ACTIVATING_FIFO = eINSTANCE.getEventLinkActivatingFifo();

		/**
		 * The meta object literal for the '<em><b>Receiver Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATING_FIFO__RECEIVER_FIFO_SIZE = eINSTANCE.getEventLinkActivatingFifo_ReceiverFifoSize();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATING_FIFO__SENDER = eINSTANCE.getEventLinkActivatingFifo_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATING_FIFO__RECEIVER = eINSTANCE.getEventLinkActivatingFifo_Receiver();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkToDefinitionOperationImpl <em>Event Link To Definition Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkToDefinitionOperationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkToDefinitionOperation()
		 * @generated
		 */
		EClass EVENT_LINK_TO_DEFINITION_OPERATION = eINSTANCE.getEventLinkToDefinitionOperation();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_TO_DEFINITION_OPERATION__SENDER = eINSTANCE.getEventLinkToDefinitionOperation_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_TO_DEFINITION_OPERATION__RECEIVER = eINSTANCE.getEventLinkToDefinitionOperation_Receiver();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkToDefinitionOperationFromTriggerImpl <em>Event Link To Definition Operation From Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkToDefinitionOperationFromTriggerImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkToDefinitionOperationFromTrigger()
		 * @generated
		 */
		EClass EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER = eINSTANCE.getEventLinkToDefinitionOperationFromTrigger();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__SENDER = eINSTANCE.getEventLinkToDefinitionOperationFromTrigger_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__RECEIVER = eINSTANCE.getEventLinkToDefinitionOperationFromTrigger_Receiver();

		/**
		 * The meta object literal for the '<em><b>Trigger Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__TRIGGER_PERIOD = eINSTANCE.getEventLinkToDefinitionOperationFromTrigger_TriggerPeriod();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl <em>Event Link Activating Fifo From Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatingFifoFromTrigger()
		 * @generated
		 */
		EClass EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER = eINSTANCE.getEventLinkActivatingFifoFromTrigger();

		/**
		 * The meta object literal for the '<em><b>Receiver Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE = eINSTANCE.getEventLinkActivatingFifoFromTrigger_ReceiverFifoSize();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER = eINSTANCE.getEventLinkActivatingFifoFromTrigger_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER = eINSTANCE.getEventLinkActivatingFifoFromTrigger_Receiver();

		/**
		 * The meta object literal for the '<em><b>Trigger Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD = eINSTANCE.getEventLinkActivatingFifoFromTrigger_TriggerPeriod();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.EventLinkActivatableFifoFromTriggerImpl <em>Event Link Activatable Fifo From Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.EventLinkActivatableFifoFromTriggerImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getEventLinkActivatableFifoFromTrigger()
		 * @generated
		 */
		EClass EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER = eINSTANCE.getEventLinkActivatableFifoFromTrigger();

		/**
		 * The meta object literal for the '<em><b>Receiver Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE = eINSTANCE.getEventLinkActivatableFifoFromTrigger_ReceiverFifoSize();

		/**
		 * The meta object literal for the '<em><b>Receiver Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_ACTIVATING = eINSTANCE.getEventLinkActivatableFifoFromTrigger_ReceiverActivating();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__SENDER = eINSTANCE.getEventLinkActivatableFifoFromTrigger_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER = eINSTANCE.getEventLinkActivatableFifoFromTrigger_Receiver();

		/**
		 * The meta object literal for the '<em><b>Trigger Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__TRIGGER_PERIOD = eINSTANCE.getEventLinkActivatableFifoFromTrigger_TriggerPeriod();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestLinkActivatableFifoImpl <em>Request Link Activatable Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestLinkActivatableFifoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatableFifo()
		 * @generated
		 */
		EClass REQUEST_LINK_ACTIVATABLE_FIFO = eINSTANCE.getRequestLinkActivatableFifo();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATABLE_FIFO__CLIENT = eINSTANCE.getRequestLinkActivatableFifo_Client();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATABLE_FIFO__SERVER = eINSTANCE.getRequestLinkActivatableFifo_Server();

		/**
		 * The meta object literal for the '<em><b>Server Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE = eINSTANCE.getRequestLinkActivatableFifo_ServerFifoSize();

		/**
		 * The meta object literal for the '<em><b>Server Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_ACTIVATING = eINSTANCE.getRequestLinkActivatableFifo_ServerActivating();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl <em>Request Link Activating Activatable Fifo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatingActivatableFifo()
		 * @generated
		 */
		EClass REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO = eINSTANCE.getRequestLinkActivatingActivatableFifo();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT = eINSTANCE.getRequestLinkActivatingActivatableFifo_Client();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER = eINSTANCE.getRequestLinkActivatingActivatableFifo_Server();

		/**
		 * The meta object literal for the '<em><b>Client Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING = eINSTANCE.getRequestLinkActivatingActivatableFifo_ClientActivating();

		/**
		 * The meta object literal for the '<em><b>Server Fifo Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE = eINSTANCE.getRequestLinkActivatingActivatableFifo_ServerFifoSize();

		/**
		 * The meta object literal for the '<em><b>Server Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING = eINSTANCE.getRequestLinkActivatingActivatableFifo_ServerActivating();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl <em>Request Link Activating To Reference Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getRequestLinkActivatingToReferenceOperation()
		 * @generated
		 */
		EClass REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION = eINSTANCE.getRequestLinkActivatingToReferenceOperation();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT = eINSTANCE.getRequestLinkActivatingToReferenceOperation_Client();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER = eINSTANCE.getRequestLinkActivatingToReferenceOperation_Server();

		/**
		 * The meta object literal for the '<em><b>Client Activating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING = eINSTANCE.getRequestLinkActivatingToReferenceOperation_ClientActivating();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.PublicPinfoValueImpl <em>Public Pinfo Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.PublicPinfoValueImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPublicPinfoValue()
		 * @generated
		 */
		EClass PUBLIC_PINFO_VALUE = eINSTANCE.getPublicPinfoValue();

		/**
		 * The meta object literal for the '<em><b>Public Pinfo From Module Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_PINFO_VALUE__PUBLIC_PINFO_FROM_MODULE_TYPE = eINSTANCE.getPublicPinfoValue_PublicPinfoFromModuleType();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.PrivatePinfoValueImpl <em>Private Pinfo Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.PrivatePinfoValueImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPrivatePinfoValue()
		 * @generated
		 */
		EClass PRIVATE_PINFO_VALUE = eINSTANCE.getPrivatePinfoValue();

		/**
		 * The meta object literal for the '<em><b>Private Pinfo From Module Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE = eINSTANCE.getPrivatePinfoValue_PrivatePinfoFromModuleType();

		/**
		 * The meta object literal for the '{@link edtimplementation.PinfoValue <em>Pinfo Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.PinfoValue
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPinfoValue()
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
		 * The meta object literal for the '{@link edtimplementation.impl.PrivatePinfoImpl <em>Private Pinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.PrivatePinfoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPrivatePinfo()
		 * @generated
		 */
		EClass PRIVATE_PINFO = eINSTANCE.getPrivatePinfo();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.PublicPinfoImpl <em>Public Pinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.PublicPinfoImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPublicPinfo()
		 * @generated
		 */
		EClass PUBLIC_PINFO = eINSTANCE.getPublicPinfo();

		/**
		 * The meta object literal for the '{@link edtimplementation.ModuleTypePinfo <em>Module Type Pinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.ModuleTypePinfo
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleTypePinfo()
		 * @generated
		 */
		EClass MODULE_TYPE_PINFO = eINSTANCE.getModuleTypePinfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE_PINFO__NAME = eINSTANCE.getModuleTypePinfo_Name();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.PropertyValueImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getPropertyValue()
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
		 * The meta object literal for the '<em><b>Property Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE__PROPERTY_TYPE = eINSTANCE.getPropertyValue_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Value Component Definition Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY = eINSTANCE.getPropertyValue_ValueComponentDefinitionProperty();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ModuleTypePropertyImpl <em>Module Type Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ModuleTypePropertyImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getModuleTypeProperty()
		 * @generated
		 */
		EClass MODULE_TYPE_PROPERTY = eINSTANCE.getModuleTypeProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TYPE_PROPERTY__NAME = eINSTANCE.getModuleTypeProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TYPE_PROPERTY__TYPE = eINSTANCE.getModuleTypeProperty_Type();

		/**
		 * The meta object literal for the '{@link edtimplementation.Trigger <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.Trigger
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link edtimplementation.OperationInheritingFromSD <em>Operation Inheriting From SD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.OperationInheritingFromSD
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInheritingFromSD()
		 * @generated
		 */
		EClass OPERATION_INHERITING_FROM_SD = eINSTANCE.getOperationInheritingFromSD();

		/**
		 * The meta object literal for the '<em><b>SD Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INHERITING_FROM_SD__SD_OPERATION_REF = eINSTANCE.getOperationInheritingFromSD_SDOperationRef();

		/**
		 * The meta object literal for the '{@link edtimplementation.OperationInheritingFromMT <em>Operation Inheriting From MT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.OperationInheritingFromMT
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getOperationInheritingFromMT()
		 * @generated
		 */
		EClass OPERATION_INHERITING_FROM_MT = eINSTANCE.getOperationInheritingFromMT();

		/**
		 * The meta object literal for the '<em><b>MT Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INHERITING_FROM_MT__MT_OPERATION_REF = eINSTANCE.getOperationInheritingFromMT_MTOperationRef();

		/**
		 * The meta object literal for the '{@link edtimplementation.impl.ExternalSenderOperationImpl <em>External Sender Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtimplementation.impl.ExternalSenderOperationImpl
		 * @see edtimplementation.impl.EdtimplementationPackageImpl#getExternalSenderOperation()
		 * @generated
		 */
		EClass EXTERNAL_SENDER_OPERATION = eINSTANCE.getExternalSenderOperation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_SENDER_OPERATION__LANGUAGE = eINSTANCE.getExternalSenderOperation_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_IMPLEMENTATION__NAME = eINSTANCE.getComponentImplementation_Name();

	}

} //EdtimplementationPackage
