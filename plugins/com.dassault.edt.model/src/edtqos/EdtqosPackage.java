/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;

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
 * @see edtqos.EdtqosFactory
 * @model kind="package"
 * @generated
 */
public interface EdtqosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtqos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edtqos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edtqos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtqosPackage eINSTANCE = edtqos.impl.EdtqosPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtqos.impl.ServiceInstanceQosImpl <em>Service Instance Qos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtqos.impl.ServiceInstanceQosImpl
	 * @see edtqos.impl.EdtqosPackageImpl#getServiceInstanceQos()
	 * @generated
	 */
	int SERVICE_INSTANCE_QOS = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS__SERVICE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Interface Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS__INTERFACE_LINK = 3;

	/**
	 * The number of structural features of the '<em>Service Instance Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Instance Qos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_QOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtqos.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtqos.Operation
	 * @see edtqos.impl.EdtqosPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Highest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES = 0;

	/**
	 * The feature id for the '<em><b>Highest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HIGHEST_RATE_TIME_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Lowest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES = 2;

	/**
	 * The feature id for the '<em><b>Lowest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWEST_RATE_TIME_FRAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtqos.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtqos.impl.DataImpl
	 * @see edtqos.impl.EdtqosPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Highest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Highest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HIGHEST_RATE_TIME_FRAME = OPERATION__HIGHEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Lowest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Lowest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOWEST_RATE_TIME_FRAME = OPERATION__LOWEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Max Ageing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MAX_AGEING = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notification Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NOTIFICATION_MAX_HANDLING_TIME = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Definition Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SERVICE_DEFINITION_DATA = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtqos.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtqos.impl.EventImpl
	 * @see edtqos.impl.EdtqosPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Highest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Highest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HIGHEST_RATE_TIME_FRAME = OPERATION__HIGHEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Lowest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Lowest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOWEST_RATE_TIME_FRAME = OPERATION__LOWEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MAX_HANDLING_TIME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Definition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SERVICE_DEFINITION_EVENT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtqos.impl.RequestResponseImpl <em>Request Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtqos.impl.RequestResponseImpl
	 * @see edtqos.impl.EdtqosPackageImpl#getRequestResponse()
	 * @generated
	 */
	int REQUEST_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Highest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Highest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME = OPERATION__HIGHEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Lowest Rate Number Of Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES = OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Lowest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME = OPERATION__LOWEST_RATE_TIME_FRAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Callback Max Handling Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__MAX_RESPONSE_TIME = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Definition Request Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edtqos.ServiceInstanceQos <em>Service Instance Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance Qos</em>'.
	 * @see edtqos.ServiceInstanceQos
	 * @generated
	 */
	EClass getServiceInstanceQos();

	/**
	 * Returns the meta object for the containment reference list '{@link edtqos.ServiceInstanceQos#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtqos.ServiceInstanceQos#getOperations()
	 * @see #getServiceInstanceQos()
	 * @generated
	 */
	EReference getServiceInstanceQos_Operations();

	/**
	 * Returns the meta object for the reference '{@link edtqos.ServiceInstanceQos#getServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Definition</em>'.
	 * @see edtqos.ServiceInstanceQos#getServiceDefinition()
	 * @see #getServiceInstanceQos()
	 * @generated
	 */
	EReference getServiceInstanceQos_ServiceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.ServiceInstanceQos#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtqos.ServiceInstanceQos#getName()
	 * @see #getServiceInstanceQos()
	 * @generated
	 */
	EAttribute getServiceInstanceQos_Name();

	/**
	 * Returns the meta object for the reference list '{@link edtqos.ServiceInstanceQos#getInterfaceLink <em>Interface Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Link</em>'.
	 * @see edtqos.ServiceInstanceQos#getInterfaceLink()
	 * @see #getServiceInstanceQos()
	 * @generated
	 */
	EReference getServiceInstanceQos_InterfaceLink();

	/**
	 * Returns the meta object for class '{@link edtqos.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edtqos.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Operation#getHighestRateNumberOfOccurrences <em>Highest Rate Number Of Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Rate Number Of Occurrences</em>'.
	 * @see edtqos.Operation#getHighestRateNumberOfOccurrences()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_HighestRateNumberOfOccurrences();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Operation#getHighestRateTimeFrame <em>Highest Rate Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Rate Time Frame</em>'.
	 * @see edtqos.Operation#getHighestRateTimeFrame()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_HighestRateTimeFrame();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Operation#getLowestRateNumberOfOccurrences <em>Lowest Rate Number Of Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowest Rate Number Of Occurrences</em>'.
	 * @see edtqos.Operation#getLowestRateNumberOfOccurrences()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_LowestRateNumberOfOccurrences();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Operation#getLowestRateTimeFrame <em>Lowest Rate Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowest Rate Time Frame</em>'.
	 * @see edtqos.Operation#getLowestRateTimeFrame()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_LowestRateTimeFrame();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtqos.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link edtqos.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see edtqos.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Data#getMaxAgeing <em>Max Ageing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ageing</em>'.
	 * @see edtqos.Data#getMaxAgeing()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_MaxAgeing();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Data#getNotificationMaxHandlingTime <em>Notification Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Max Handling Time</em>'.
	 * @see edtqos.Data#getNotificationMaxHandlingTime()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_NotificationMaxHandlingTime();

	/**
	 * Returns the meta object for the reference '{@link edtqos.Data#getServiceDefinitionData <em>Service Definition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Definition Data</em>'.
	 * @see edtqos.Data#getServiceDefinitionData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_ServiceDefinitionData();

	/**
	 * Returns the meta object for class '{@link edtqos.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see edtqos.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.Event#getMaxHandlingTime <em>Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Handling Time</em>'.
	 * @see edtqos.Event#getMaxHandlingTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_MaxHandlingTime();

	/**
	 * Returns the meta object for the reference '{@link edtqos.Event#getServiceDefinitionEvent <em>Service Definition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Definition Event</em>'.
	 * @see edtqos.Event#getServiceDefinitionEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ServiceDefinitionEvent();

	/**
	 * Returns the meta object for class '{@link edtqos.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response</em>'.
	 * @see edtqos.RequestResponse
	 * @generated
	 */
	EClass getRequestResponse();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.RequestResponse#getCallbackMaxHandlingTime <em>Callback Max Handling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback Max Handling Time</em>'.
	 * @see edtqos.RequestResponse#getCallbackMaxHandlingTime()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_CallbackMaxHandlingTime();

	/**
	 * Returns the meta object for the attribute '{@link edtqos.RequestResponse#getMaxResponseTime <em>Max Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Response Time</em>'.
	 * @see edtqos.RequestResponse#getMaxResponseTime()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EAttribute getRequestResponse_MaxResponseTime();

	/**
	 * Returns the meta object for the reference '{@link edtqos.RequestResponse#getServiceDefinitionRequestResponse <em>Service Definition Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Definition Request Response</em>'.
	 * @see edtqos.RequestResponse#getServiceDefinitionRequestResponse()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_ServiceDefinitionRequestResponse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtqosFactory getEdtqosFactory();

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
		 * The meta object literal for the '{@link edtqos.impl.ServiceInstanceQosImpl <em>Service Instance Qos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtqos.impl.ServiceInstanceQosImpl
		 * @see edtqos.impl.EdtqosPackageImpl#getServiceInstanceQos()
		 * @generated
		 */
		EClass SERVICE_INSTANCE_QOS = eINSTANCE.getServiceInstanceQos();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_QOS__OPERATIONS = eINSTANCE.getServiceInstanceQos_Operations();

		/**
		 * The meta object literal for the '<em><b>Service Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_QOS__SERVICE_DEFINITION = eINSTANCE.getServiceInstanceQos_ServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE_QOS__NAME = eINSTANCE.getServiceInstanceQos_Name();

		/**
		 * The meta object literal for the '<em><b>Interface Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_QOS__INTERFACE_LINK = eINSTANCE.getServiceInstanceQos_InterfaceLink();

		/**
		 * The meta object literal for the '{@link edtqos.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtqos.Operation
		 * @see edtqos.impl.EdtqosPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Highest Rate Number Of Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES = eINSTANCE.getOperation_HighestRateNumberOfOccurrences();

		/**
		 * The meta object literal for the '<em><b>Highest Rate Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__HIGHEST_RATE_TIME_FRAME = eINSTANCE.getOperation_HighestRateTimeFrame();

		/**
		 * The meta object literal for the '<em><b>Lowest Rate Number Of Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES = eINSTANCE.getOperation_LowestRateNumberOfOccurrences();

		/**
		 * The meta object literal for the '<em><b>Lowest Rate Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LOWEST_RATE_TIME_FRAME = eINSTANCE.getOperation_LowestRateTimeFrame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link edtqos.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtqos.impl.DataImpl
		 * @see edtqos.impl.EdtqosPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Max Ageing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MAX_AGEING = eINSTANCE.getData_MaxAgeing();

		/**
		 * The meta object literal for the '<em><b>Notification Max Handling Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NOTIFICATION_MAX_HANDLING_TIME = eINSTANCE.getData_NotificationMaxHandlingTime();

		/**
		 * The meta object literal for the '<em><b>Service Definition Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SERVICE_DEFINITION_DATA = eINSTANCE.getData_ServiceDefinitionData();

		/**
		 * The meta object literal for the '{@link edtqos.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtqos.impl.EventImpl
		 * @see edtqos.impl.EdtqosPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Max Handling Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MAX_HANDLING_TIME = eINSTANCE.getEvent_MaxHandlingTime();

		/**
		 * The meta object literal for the '<em><b>Service Definition Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SERVICE_DEFINITION_EVENT = eINSTANCE.getEvent_ServiceDefinitionEvent();

		/**
		 * The meta object literal for the '{@link edtqos.impl.RequestResponseImpl <em>Request Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtqos.impl.RequestResponseImpl
		 * @see edtqos.impl.EdtqosPackageImpl#getRequestResponse()
		 * @generated
		 */
		EClass REQUEST_RESPONSE = eINSTANCE.getRequestResponse();

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
		 * The meta object literal for the '<em><b>Service Definition Request Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE = eINSTANCE.getRequestResponse_ServiceDefinitionRequestResponse();

	}

} //EdtqosPackage
