/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2;

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
 * @see technology.ecoa.interface_.qos._2.qosFactory
 * @model kind="package"
 * @generated
 */
public interface qosPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/interface-qos-2.0";

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
	qosPackage eINSTANCE = technology.ecoa.interface_.qos._2.impl.qosPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.DataImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The feature id for the '<em><b>Highest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HIGHEST_RATE = 0;

	/**
	 * The feature id for the '<em><b>Lowest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOWEST_RATE = 1;

	/**
	 * The feature id for the '<em><b>Max Ageing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MAX_AGEING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Notification Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NOTIFICATION_MAX_HANDLING_TIME = 4;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.DocumentRootImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Service Instance Qo S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_INSTANCE_QO_S = 3;

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
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.EventImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Highest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HIGHEST_RATE = 0;

	/**
	 * The feature id for the '<em><b>Lowest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOWEST_RATE = 1;

	/**
	 * The feature id for the '<em><b>Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MAX_HANDLING_TIME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.OperationRateImpl <em>Operation Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.OperationRateImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getOperationRate()
	 * @generated
	 */
	int OPERATION_RATE = 3;

	/**
	 * The feature id for the '<em><b>Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RATE__NUMBER_OF_OCCURRENCES = 0;

	/**
	 * The feature id for the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RATE__TIME_FRAME = 1;

	/**
	 * The number of structural features of the '<em>Operation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.OperationsImpl <em>Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.OperationsImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__DATA = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Requestresponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__REQUESTRESPONSE = 3;

	/**
	 * The number of structural features of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl <em>Request Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.RequestResponseImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getRequestResponse()
	 * @generated
	 */
	int REQUEST_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Highest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__HIGHEST_RATE = 0;

	/**
	 * The feature id for the '<em><b>Lowest Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__LOWEST_RATE = 1;

	/**
	 * The feature id for the '<em><b>Callback Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME = 2;

	/**
	 * The feature id for the '<em><b>Max Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__MAX_RESPONSE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.ServiceInstanceQoSImpl <em>Service Instance Qo S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.ServiceInstanceQoSImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getServiceInstanceQoS()
	 * @generated
	 */
	int SERVICE_INSTANCE_QO_S = 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QO_S__OPERATIONS = 0;

	/**
	 * The number of structural features of the '<em>Service Instance Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QO_S_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Instance Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QO_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.UseTypeImpl
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 7;

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
	 * The meta object id for the '{@link technology.ecoa.interface_.qos._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 8;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 9;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 10;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 11;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 13;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 15;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 17;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 18;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.Data#getHighestRate <em>Highest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Highest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data#getHighestRate()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_HighestRate();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.Data#getLowestRate <em>Lowest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lowest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data#getLowestRate()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_LowestRate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.Data#getMaxAgeing <em>Max Ageing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ageing</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data#getMaxAgeing()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_MaxAgeing();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Max Handling Time</em>'.
	 * @see technology.ecoa.interface_.qos._2.Data#getNotificationMaxHandlingTime()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_NotificationMaxHandlingTime();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.interface_.qos._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.interface_.qos._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.interface_.qos._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.DocumentRoot#getServiceInstanceQoS <em>Service Instance Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Instance Qo S</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot#getServiceInstanceQoS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceInstanceQoS();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.interface_.qos._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see technology.ecoa.interface_.qos._2.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.Event#getHighestRate <em>Highest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Highest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.Event#getHighestRate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_HighestRate();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.Event#getLowestRate <em>Lowest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lowest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.Event#getLowestRate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_LowestRate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime <em>Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Handling Time</em>'.
	 * @see technology.ecoa.interface_.qos._2.Event#getMaxHandlingTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_MaxHandlingTime();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.interface_.qos._2.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.OperationRate <em>Operation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.OperationRate
	 * @generated
	 */
	EClass getOperationRate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.OperationRate#getNumberOfOccurrences <em>Number Of Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Occurrences</em>'.
	 * @see technology.ecoa.interface_.qos._2.OperationRate#getNumberOfOccurrences()
	 * @see #getOperationRate()
	 * @generated
	 */
	EAttribute getOperationRate_NumberOfOccurrences();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame <em>Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Frame</em>'.
	 * @see technology.ecoa.interface_.qos._2.OperationRate#getTimeFrame()
	 * @see #getOperationRate()
	 * @generated
	 */
	EAttribute getOperationRate_TimeFrame();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations</em>'.
	 * @see technology.ecoa.interface_.qos._2.Operations
	 * @generated
	 */
	EClass getOperations();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.interface_.qos._2.Operations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.interface_.qos._2.Operations#getGroup()
	 * @see #getOperations()
	 * @generated
	 */
	EAttribute getOperations_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.interface_.qos._2.Operations#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see technology.ecoa.interface_.qos._2.Operations#getData()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.interface_.qos._2.Operations#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see technology.ecoa.interface_.qos._2.Operations#getEvent()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.interface_.qos._2.Operations#getRequestresponse <em>Requestresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requestresponse</em>'.
	 * @see technology.ecoa.interface_.qos._2.Operations#getRequestresponse()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Requestresponse();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse
	 * @generated
	 */
	EClass getRequestResponse();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.RequestResponse#getHighestRate <em>Highest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Highest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse#getHighestRate()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_HighestRate();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.RequestResponse#getLowestRate <em>Lowest Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lowest Rate</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse#getLowestRate()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_LowestRate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback Max Handling Time</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse#getCallbackMaxHandlingTime()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_CallbackMaxHandlingTime();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Response Time</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse#getMaxResponseTime()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_MaxResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.RequestResponse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.interface_.qos._2.RequestResponse#getName()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.ServiceInstanceQoS <em>Service Instance Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance Qo S</em>'.
	 * @see technology.ecoa.interface_.qos._2.ServiceInstanceQoS
	 * @generated
	 */
	EClass getServiceInstanceQoS();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.interface_.qos._2.ServiceInstanceQoS#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see technology.ecoa.interface_.qos._2.ServiceInstanceQoS#getOperations()
	 * @see #getServiceInstanceQoS()
	 * @generated
	 */
	EReference getServiceInstanceQoS_Operations();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.interface_.qos._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.interface_.qos._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.interface_.qos._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.interface_.qos._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.interface_.qos._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
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
	 * Returns the meta object for data type '{@link technology.ecoa.interface_.qos._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.interface_.qos._2.ProgrammingLanguage"
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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	qosFactory getqosFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.DataImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Highest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__HIGHEST_RATE = eINSTANCE.getData_HighestRate();

		/**
		 * The meta object literal for the '<em><b>Lowest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__LOWEST_RATE = eINSTANCE.getData_LowestRate();

		/**
		 * The meta object literal for the '<em><b>Max Ageing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MAX_AGEING = eINSTANCE.getData_MaxAgeing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Notification Max Handling Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NOTIFICATION_MAX_HANDLING_TIME = eINSTANCE.getData_NotificationMaxHandlingTime();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.DocumentRootImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Service Instance Qo S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_INSTANCE_QO_S = eINSTANCE.getDocumentRoot_ServiceInstanceQoS();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.EventImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Highest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__HIGHEST_RATE = eINSTANCE.getEvent_HighestRate();

		/**
		 * The meta object literal for the '<em><b>Lowest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__LOWEST_RATE = eINSTANCE.getEvent_LowestRate();

		/**
		 * The meta object literal for the '<em><b>Max Handling Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MAX_HANDLING_TIME = eINSTANCE.getEvent_MaxHandlingTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.OperationRateImpl <em>Operation Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.OperationRateImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getOperationRate()
		 * @generated
		 */
		EClass OPERATION_RATE = eINSTANCE.getOperationRate();

		/**
		 * The meta object literal for the '<em><b>Number Of Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RATE__NUMBER_OF_OCCURRENCES = eINSTANCE.getOperationRate_NumberOfOccurrences();

		/**
		 * The meta object literal for the '<em><b>Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RATE__TIME_FRAME = eINSTANCE.getOperationRate_TimeFrame();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.OperationsImpl <em>Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.OperationsImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getOperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONS__GROUP = eINSTANCE.getOperations_Group();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__DATA = eINSTANCE.getOperations_Data();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__EVENT = eINSTANCE.getOperations_Event();

		/**
		 * The meta object literal for the '<em><b>Requestresponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__REQUESTRESPONSE = eINSTANCE.getOperations_Requestresponse();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.RequestResponseImpl <em>Request Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.RequestResponseImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getRequestResponse()
		 * @generated
		 */
		EClass REQUEST_RESPONSE = eINSTANCE.getRequestResponse();

		/**
		 * The meta object literal for the '<em><b>Highest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__HIGHEST_RATE = eINSTANCE.getRequestResponse_HighestRate();

		/**
		 * The meta object literal for the '<em><b>Lowest Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__LOWEST_RATE = eINSTANCE.getRequestResponse_LowestRate();

		/**
		 * The meta object literal for the '<em><b>Callback Max Handling Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME = eINSTANCE.getRequestResponse_CallbackMaxHandlingTime();

		/**
		 * The meta object literal for the '<em><b>Max Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RESPONSE__MAX_RESPONSE_TIME = eINSTANCE.getRequestResponse_MaxResponseTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_RESPONSE__NAME = eINSTANCE.getRequestResponse_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.ServiceInstanceQoSImpl <em>Service Instance Qo S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.ServiceInstanceQoSImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getServiceInstanceQoS()
		 * @generated
		 */
		EClass SERVICE_INSTANCE_QO_S = eINSTANCE.getServiceInstanceQoS();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_QO_S__OPERATIONS = eINSTANCE.getServiceInstanceQoS_Operations();

		/**
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.UseTypeImpl
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getUseType()
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
		 * The meta object literal for the '{@link technology.ecoa.interface_.qos._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.ProgrammingLanguage
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.interface_.qos._2.impl.qosPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //qosPackage
