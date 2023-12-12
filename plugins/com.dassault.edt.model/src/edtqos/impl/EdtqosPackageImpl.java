/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.impl;

import edtbin.EdtbinPackage;
import edtbin.impl.EdtbinPackageImpl;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.impl.EdtdeploymentPackageImpl;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.impl.EdtimplementationPackageImpl;
import edtinterface.EDTInterfacePackage;

import edtinterface.impl.EDTInterfacePackageImpl;

import edtlogical.EdtlogicalPackage;
import edtlogical.impl.EdtlogicalPackageImpl;
import edtproject.EDTProjectPackage;

import edtproject.impl.EDTProjectPackageImpl;

import edtqos.Data;
import edtqos.EdtqosFactory;
import edtqos.EdtqosPackage;
import edtqos.Event;
import edtqos.Operation;
import edtqos.RequestResponse;
import edtqos.ServiceInstanceQos;
import edttype.EDTTypePackage;

import edttype.impl.EDTTypePackageImpl;

import edtudp.EdtudpPackage;
import edtudp.impl.EdtudpPackageImpl;
import edtuid.EdtuidPackage;
import edtuid.impl.EdtuidPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

import technology.ecoa.bin.desc._2.binPackage;
import technology.ecoa.cross.platforms.view._2.viewPackage;
import technology.ecoa.deployment._2.depPackage;
import technology.ecoa.implementation._2.impPackage;
import technology.ecoa.insertion.policy._2.polPackage;
import technology.ecoa.interface_._2.interPackage;

import technology.ecoa.interface_.qos._2.qosPackage;

import technology.ecoa.logicalsystem._2.logPackage;
import technology.ecoa.module.behaviour._2.modPackage;
import technology.ecoa.sca.extension.scaExt.scaExtPackage;

import technology.ecoa.types._2.typPackage;
import technology.ecoa.udpbinding._2.udpPackage;
import technology.ecoa.uid._2.uidPackage;
import temp.TempPackage;
import temp.impl.TempPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtqosPackageImpl extends EPackageImpl implements EdtqosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInstanceQosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestResponseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edtqos.EdtqosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdtqosPackageImpl() {
		super(eNS_URI, EdtqosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EdtqosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdtqosPackage init() {
		if (isInited) return (EdtqosPackage)EPackage.Registry.INSTANCE.getEPackage(EdtqosPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdtqosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdtqosPackageImpl theEdtqosPackage = registeredEdtqosPackage instanceof EdtqosPackageImpl ? (EdtqosPackageImpl)registeredEdtqosPackage : new EdtqosPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		modPackage.eINSTANCE.eClass();
		udpPackage.eINSTANCE.eClass();
		depPackage.eINSTANCE.eClass();
		impPackage.eINSTANCE.eClass();
		interPackage.eINSTANCE.eClass();
		qosPackage.eINSTANCE.eClass();
		logPackage.eINSTANCE.eClass();
		typPackage.eINSTANCE.eClass();
		scaPackage.eINSTANCE.eClass();
		scaExtPackage.eINSTANCE.eClass();
		binPackage.eINSTANCE.eClass();
		polPackage.eINSTANCE.eClass();
		viewPackage.eINSTANCE.eClass();
		uidPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtbinPackage.eNS_URI);
		EdtbinPackageImpl theEdtbinPackage = (EdtbinPackageImpl)(registeredPackage instanceof EdtbinPackageImpl ? registeredPackage : EdtbinPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtdeploymentPackage.eNS_URI);
		EdtdeploymentPackageImpl theEdtdeploymentPackage = (EdtdeploymentPackageImpl)(registeredPackage instanceof EdtdeploymentPackageImpl ? registeredPackage : EdtdeploymentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtimplementationPackage.eNS_URI);
		EdtimplementationPackageImpl theEdtimplementationPackage = (EdtimplementationPackageImpl)(registeredPackage instanceof EdtimplementationPackageImpl ? registeredPackage : EdtimplementationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtlogicalPackage.eNS_URI);
		EdtlogicalPackageImpl theEdtlogicalPackage = (EdtlogicalPackageImpl)(registeredPackage instanceof EdtlogicalPackageImpl ? registeredPackage : EdtlogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTProjectPackage.eNS_URI);
		EDTProjectPackageImpl theEDTProjectPackage = (EDTProjectPackageImpl)(registeredPackage instanceof EDTProjectPackageImpl ? registeredPackage : EDTProjectPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTInterfacePackage.eNS_URI);
		EDTInterfacePackageImpl theEDTInterfacePackage = (EDTInterfacePackageImpl)(registeredPackage instanceof EDTInterfacePackageImpl ? registeredPackage : EDTInterfacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTTypePackage.eNS_URI);
		EDTTypePackageImpl theEDTTypePackage = (EDTTypePackageImpl)(registeredPackage instanceof EDTTypePackageImpl ? registeredPackage : EDTTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TempPackage.eNS_URI);
		TempPackageImpl theTempPackage = (TempPackageImpl)(registeredPackage instanceof TempPackageImpl ? registeredPackage : TempPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtudpPackage.eNS_URI);
		EdtudpPackageImpl theEdtudpPackage = (EdtudpPackageImpl)(registeredPackage instanceof EdtudpPackageImpl ? registeredPackage : EdtudpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtuidPackage.eNS_URI);
		EdtuidPackageImpl theEdtuidPackage = (EdtuidPackageImpl)(registeredPackage instanceof EdtuidPackageImpl ? registeredPackage : EdtuidPackage.eINSTANCE);

		// Create package meta-data objects
		theEdtqosPackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtdeploymentPackage.createPackageContents();
		theEdtimplementationPackage.createPackageContents();
		theEdtlogicalPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theEDTTypePackage.createPackageContents();
		theTempPackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theEdtqosPackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtdeploymentPackage.initializePackageContents();
		theEdtimplementationPackage.initializePackageContents();
		theEdtlogicalPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theEDTTypePackage.initializePackageContents();
		theTempPackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdtqosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdtqosPackage.eNS_URI, theEdtqosPackage);
		return theEdtqosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInstanceQos() {
		return serviceInstanceQosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInstanceQos_Operations() {
		return (EReference)serviceInstanceQosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInstanceQos_ServiceDefinition() {
		return (EReference)serviceInstanceQosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInstanceQos_Name() {
		return (EAttribute)serviceInstanceQosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInstanceQos_InterfaceLink() {
		return (EReference)serviceInstanceQosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_HighestRateNumberOfOccurrences() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_HighestRateTimeFrame() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_LowestRateNumberOfOccurrences() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_LowestRateTimeFrame() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_MaxAgeing() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_NotificationMaxHandlingTime() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_ServiceDefinitionData() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_MaxHandlingTime() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_ServiceDefinitionEvent() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestResponse() {
		return requestResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestResponse_CallbackMaxHandlingTime() {
		return (EAttribute)requestResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestResponse_MaxResponseTime() {
		return (EAttribute)requestResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestResponse_ServiceDefinitionRequestResponse() {
		return (EReference)requestResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtqosFactory getEdtqosFactory() {
		return (EdtqosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceInstanceQosEClass = createEClass(SERVICE_INSTANCE_QOS);
		createEReference(serviceInstanceQosEClass, SERVICE_INSTANCE_QOS__OPERATIONS);
		createEReference(serviceInstanceQosEClass, SERVICE_INSTANCE_QOS__SERVICE_DEFINITION);
		createEAttribute(serviceInstanceQosEClass, SERVICE_INSTANCE_QOS__NAME);
		createEReference(serviceInstanceQosEClass, SERVICE_INSTANCE_QOS__INTERFACE_LINK);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES);
		createEAttribute(operationEClass, OPERATION__HIGHEST_RATE_TIME_FRAME);
		createEAttribute(operationEClass, OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES);
		createEAttribute(operationEClass, OPERATION__LOWEST_RATE_TIME_FRAME);
		createEAttribute(operationEClass, OPERATION__NAME);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__MAX_AGEING);
		createEAttribute(dataEClass, DATA__NOTIFICATION_MAX_HANDLING_TIME);
		createEReference(dataEClass, DATA__SERVICE_DEFINITION_DATA);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__MAX_HANDLING_TIME);
		createEReference(eventEClass, EVENT__SERVICE_DEFINITION_EVENT);

		requestResponseEClass = createEClass(REQUEST_RESPONSE);
		createEAttribute(requestResponseEClass, REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME);
		createEAttribute(requestResponseEClass, REQUEST_RESPONSE__MAX_RESPONSE_TIME);
		createEReference(requestResponseEClass, REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EDTInterfacePackage theEDTInterfacePackage = (EDTInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(EDTInterfacePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EDTProjectPackage theEDTProjectPackage = (EDTProjectPackage)EPackage.Registry.INSTANCE.getEPackage(EDTProjectPackage.eNS_URI);
		qosPackage theqosPackage = (qosPackage)EPackage.Registry.INSTANCE.getEPackage(qosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataEClass.getESuperTypes().add(this.getOperation());
		eventEClass.getESuperTypes().add(this.getOperation());
		requestResponseEClass.getESuperTypes().add(this.getOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceInstanceQosEClass, ServiceInstanceQos.class, "ServiceInstanceQos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInstanceQos_Operations(), this.getOperation(), null, "operations", null, 0, -1, ServiceInstanceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstanceQos_ServiceDefinition(), theEDTInterfacePackage.getServiceDefinition(), null, "ServiceDefinition", null, 1, 1, ServiceInstanceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInstanceQos_Name(), theXMLTypePackage.getNCName(), "Name", null, 1, 1, ServiceInstanceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstanceQos_InterfaceLink(), theEDTProjectPackage.getContract(), theEDTProjectPackage.getContract_Qos(), "InterfaceLink", null, 0, -1, ServiceInstanceQos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_HighestRateNumberOfOccurrences(), theXMLTypePackage.getDecimal(), "highestRateNumberOfOccurrences", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_HighestRateTimeFrame(), theqosPackage.getTimeDuration(), "highestRateTimeFrame", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_LowestRateNumberOfOccurrences(), theXMLTypePackage.getDecimal(), "lowestRateNumberOfOccurrences", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_LowestRateTimeFrame(), theqosPackage.getTimeDuration(), "lowestRateTimeFrame", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), theqosPackage.getNameId(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_MaxAgeing(), theqosPackage.getTimeDuration(), "maxAgeing", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_NotificationMaxHandlingTime(), theqosPackage.getTimeDuration(), "notificationMaxHandlingTime", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_ServiceDefinitionData(), theEDTInterfacePackage.getData(), null, "ServiceDefinitionData", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_MaxHandlingTime(), theqosPackage.getTimeDuration(), "maxHandlingTime", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_ServiceDefinitionEvent(), theEDTInterfacePackage.getEvent(), null, "ServiceDefinitionEvent", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestResponseEClass, RequestResponse.class, "RequestResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestResponse_CallbackMaxHandlingTime(), theqosPackage.getTimeDuration(), "callbackMaxHandlingTime", null, 0, 1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestResponse_MaxResponseTime(), theqosPackage.getTimeDuration(), "maxResponseTime", null, 0, 1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestResponse_ServiceDefinitionRequestResponse(), theEDTInterfacePackage.getRequestResponse(), null, "ServiceDefinitionRequestResponse", null, 1, 1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getServiceInstanceQos_Operations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "operations",
			   "namespace", "##targetNamespace"
		   });
	}

} //EdtqosPackageImpl
