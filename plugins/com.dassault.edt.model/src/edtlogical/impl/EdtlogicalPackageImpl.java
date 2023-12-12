/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import edtbin.EdtbinPackage;
import edtbin.impl.EdtbinPackageImpl;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.impl.EdtdeploymentPackageImpl;
import edtimplementation.EdtimplementationPackage;

import edtimplementation.impl.EdtimplementationPackageImpl;

import edtinterface.EDTInterfacePackage;

import edtinterface.impl.EDTInterfacePackageImpl;

import edtlogical.EdtlogicalFactory;
import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalProcessor;
import edtlogical.LogicalSystem;

import edtproject.EDTProjectPackage;

import edtproject.impl.EDTProjectPackageImpl;

import edtqos.EdtqosPackage;

import edtqos.impl.EdtqosPackageImpl;

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
public class EdtlogicalPackageImpl extends EPackageImpl implements EdtlogicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingPlatformLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingNodeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalProcessorEClass = null;

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
	 * @see edtlogical.EdtlogicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdtlogicalPackageImpl() {
		super(eNS_URI, EdtlogicalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdtlogicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdtlogicalPackage init() {
		if (isInited) return (EdtlogicalPackage)EPackage.Registry.INSTANCE.getEPackage(EdtlogicalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdtlogicalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdtlogicalPackageImpl theEdtlogicalPackage = registeredEdtlogicalPackage instanceof EdtlogicalPackageImpl ? (EdtlogicalPackageImpl)registeredEdtlogicalPackage : new EdtlogicalPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTProjectPackage.eNS_URI);
		EDTProjectPackageImpl theEDTProjectPackage = (EDTProjectPackageImpl)(registeredPackage instanceof EDTProjectPackageImpl ? registeredPackage : EDTProjectPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtqosPackage.eNS_URI);
		EdtqosPackageImpl theEdtqosPackage = (EdtqosPackageImpl)(registeredPackage instanceof EdtqosPackageImpl ? registeredPackage : EdtqosPackage.eINSTANCE);
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
		theEdtlogicalPackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtdeploymentPackage.createPackageContents();
		theEdtimplementationPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEdtqosPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theEDTTypePackage.createPackageContents();
		theTempPackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theEdtlogicalPackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtdeploymentPackage.initializePackageContents();
		theEdtimplementationPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEdtqosPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theEDTTypePackage.initializePackageContents();
		theTempPackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdtlogicalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdtlogicalPackage.eNS_URI, theEdtlogicalPackage);
		return theEdtlogicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalSystem() {
		return logicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalSystem_FileNamePrefix() {
		return (EAttribute)logicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalSystem_LogicalComputingPlatforms() {
		return (EReference)logicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalSystem_LogicalComputingPlatformLinks() {
		return (EReference)logicalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalSystem_Id() {
		return (EAttribute)logicalSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalComputingPlatform() {
		return logicalComputingPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingPlatform_LogicalComputingNodes() {
		return (EReference)logicalComputingPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingPlatform_LogicalComputingNodeLinks() {
		return (EReference)logicalComputingPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatform_ELIPlatformId() {
		return (EAttribute)logicalComputingPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatform_Id() {
		return (EAttribute)logicalComputingPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalComputingPlatformLink() {
		return logicalComputingPlatformLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatformLink_Id() {
		return (EAttribute)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatformLink_ThroughputMegaBytesPerSecond() {
		return (EAttribute)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatformLink_LatencyMicroSeconds() {
		return (EAttribute)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingPlatformLink_From() {
		return (EReference)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingPlatformLink_To() {
		return (EReference)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatformLink_TransportBindingParameters() {
		return (EAttribute)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingPlatformLink_TransportBindingProtocol() {
		return (EAttribute)logicalComputingPlatformLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalComputingNodeLink() {
		return logicalComputingNodeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNodeLink_Id() {
		return (EAttribute)logicalComputingNodeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNodeLink_ThroughputMegaBytesPerSecond() {
		return (EAttribute)logicalComputingNodeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNodeLink_LatencyMicroSeconds() {
		return (EAttribute)logicalComputingNodeLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingNodeLink_From() {
		return (EReference)logicalComputingNodeLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingNodeLink_To() {
		return (EReference)logicalComputingNodeLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalComputingNode() {
		return logicalComputingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingNode_LogicalProcessors() {
		return (EReference)logicalComputingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_Id() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_EndianessType() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_ModuleSwitchTimeMicroSeconds() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_AvailableMemoryGigaBytes() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_OsName() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalComputingNode_OsVersion() {
		return (EAttribute)logicalComputingNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalComputingNode_ProtectionDomainLink() {
		return (EReference)logicalComputingNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalProcessor() {
		return logicalProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalProcessor_Number() {
		return (EAttribute)logicalProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalProcessor_Type() {
		return (EAttribute)logicalProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalProcessor_StepDurationNanoSeconds() {
		return (EAttribute)logicalProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtlogicalFactory getEdtlogicalFactory() {
		return (EdtlogicalFactory)getEFactoryInstance();
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
		logicalSystemEClass = createEClass(LOGICAL_SYSTEM);
		createEAttribute(logicalSystemEClass, LOGICAL_SYSTEM__FILE_NAME_PREFIX);
		createEReference(logicalSystemEClass, LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORMS);
		createEReference(logicalSystemEClass, LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS);
		createEAttribute(logicalSystemEClass, LOGICAL_SYSTEM__ID);

		logicalComputingPlatformEClass = createEClass(LOGICAL_COMPUTING_PLATFORM);
		createEReference(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES);
		createEReference(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS);
		createEAttribute(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID);
		createEAttribute(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__ID);

		logicalComputingPlatformLinkEClass = createEClass(LOGICAL_COMPUTING_PLATFORM_LINK);
		createEAttribute(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__ID);
		createEAttribute(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND);
		createEAttribute(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__LATENCY_MICRO_SECONDS);
		createEReference(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__FROM);
		createEReference(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__TO);
		createEAttribute(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PARAMETERS);
		createEAttribute(logicalComputingPlatformLinkEClass, LOGICAL_COMPUTING_PLATFORM_LINK__TRANSPORT_BINDING_PROTOCOL);

		logicalComputingNodeLinkEClass = createEClass(LOGICAL_COMPUTING_NODE_LINK);
		createEAttribute(logicalComputingNodeLinkEClass, LOGICAL_COMPUTING_NODE_LINK__ID);
		createEAttribute(logicalComputingNodeLinkEClass, LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND);
		createEAttribute(logicalComputingNodeLinkEClass, LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS);
		createEReference(logicalComputingNodeLinkEClass, LOGICAL_COMPUTING_NODE_LINK__FROM);
		createEReference(logicalComputingNodeLinkEClass, LOGICAL_COMPUTING_NODE_LINK__TO);

		logicalComputingNodeEClass = createEClass(LOGICAL_COMPUTING_NODE);
		createEReference(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__LOGICAL_PROCESSORS);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__ID);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__ENDIANESS_TYPE);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__MODULE_SWITCH_TIME_MICRO_SECONDS);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__AVAILABLE_MEMORY_GIGA_BYTES);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__OS_NAME);
		createEAttribute(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__OS_VERSION);
		createEReference(logicalComputingNodeEClass, LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK);

		logicalProcessorEClass = createEClass(LOGICAL_PROCESSOR);
		createEAttribute(logicalProcessorEClass, LOGICAL_PROCESSOR__NUMBER);
		createEAttribute(logicalProcessorEClass, LOGICAL_PROCESSOR__TYPE);
		createEAttribute(logicalProcessorEClass, LOGICAL_PROCESSOR__STEP_DURATION_NANO_SECONDS);
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
		logPackage thelogPackage = (logPackage)EPackage.Registry.INSTANCE.getEPackage(logPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EdtdeploymentPackage theEdtdeploymentPackage = (EdtdeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(EdtdeploymentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(logicalSystemEClass, LogicalSystem.class, "LogicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalSystem_FileNamePrefix(), thelogPackage.getNameId(), "FileNamePrefix", null, 1, 1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalSystem_LogicalComputingPlatforms(), this.getLogicalComputingPlatform(), null, "logicalComputingPlatforms", null, 1, -1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalSystem_LogicalComputingPlatformLinks(), this.getLogicalComputingPlatformLink(), null, "logicalComputingPlatformLinks", null, 0, -1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalSystem_Id(), thelogPackage.getNameId(), "id", null, 1, 1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingPlatformEClass, LogicalComputingPlatform.class, "LogicalComputingPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingPlatform_LogicalComputingNodes(), this.getLogicalComputingNode(), null, "logicalComputingNodes", null, 0, -1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingPlatform_LogicalComputingNodeLinks(), this.getLogicalComputingNodeLink(), null, "logicalComputingNodeLinks", null, 0, -1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatform_ELIPlatformId(), theXMLTypePackage.getUnsignedInt(), "eLIPlatformId", null, 0, 1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatform_Id(), thelogPackage.getNameId(), "id", null, 1, 1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingPlatformLinkEClass, LogicalComputingPlatformLink.class, "LogicalComputingPlatformLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalComputingPlatformLink_Id(), thelogPackage.getNameId(), "id", null, 1, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatformLink_ThroughputMegaBytesPerSecond(), theXMLTypePackage.getInteger(), "throughputMegaBytesPerSecond", null, 0, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatformLink_LatencyMicroSeconds(), theXMLTypePackage.getInteger(), "latencyMicroSeconds", null, 0, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingPlatformLink_From(), this.getLogicalComputingPlatform(), null, "from", null, 1, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingPlatformLink_To(), this.getLogicalComputingPlatform(), null, "to", null, 1, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatformLink_TransportBindingParameters(), theXMLTypePackage.getAnyURI(), "TransportBindingParameters", null, 1, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatformLink_TransportBindingProtocol(), theXMLTypePackage.getString(), "TransportBindingProtocol", null, 1, 1, LogicalComputingPlatformLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingNodeLinkEClass, LogicalComputingNodeLink.class, "LogicalComputingNodeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalComputingNodeLink_Id(), thelogPackage.getNameId(), "id", null, 0, 1, LogicalComputingNodeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNodeLink_ThroughputMegaBytesPerSecond(), theXMLTypePackage.getInteger(), "throughputMegaBytesPerSecond", null, 0, 1, LogicalComputingNodeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNodeLink_LatencyMicroSeconds(), theXMLTypePackage.getInteger(), "latencyMicroSeconds", null, 0, 1, LogicalComputingNodeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeLink_From(), this.getLogicalComputingNode(), null, "from", null, 1, 1, LogicalComputingNodeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeLink_To(), this.getLogicalComputingNode(), null, "to", null, 1, 1, LogicalComputingNodeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingNodeEClass, LogicalComputingNode.class, "LogicalComputingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingNode_LogicalProcessors(), this.getLogicalProcessor(), null, "logicalProcessors", null, 1, -1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_EndianessType(), thelogPackage.getTypeType(), "EndianessType", null, 1, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_ModuleSwitchTimeMicroSeconds(), theXMLTypePackage.getInteger(), "ModuleSwitchTimeMicroSeconds", null, 1, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_AvailableMemoryGigaBytes(), theXMLTypePackage.getInteger(), "AvailableMemoryGigaBytes", null, 1, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_OsName(), thelogPackage.getNameType(), "osName", null, 1, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNode_OsVersion(), theXMLTypePackage.getString(), "osVersion", null, 0, 1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNode_ProtectionDomainLink(), theEdtdeploymentPackage.getProtectionDomain(), theEdtdeploymentPackage.getProtectionDomain_ExecuteOnComputingNode(), "ProtectionDomainLink", null, 0, -1, LogicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalProcessorEClass, LogicalProcessor.class, "LogicalProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalProcessor_Number(), theXMLTypePackage.getInteger(), "number", null, 1, 1, LogicalProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalProcessor_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, LogicalProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalProcessor_StepDurationNanoSeconds(), theXMLTypePackage.getInteger(), "StepDurationNanoSeconds", null, 1, 1, LogicalProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getLogicalSystem_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLogicalComputingPlatform_LogicalComputingNodes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalComputingNode"
		   });
		addAnnotation
		  (getLogicalComputingPlatform_LogicalComputingNodeLinks(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalComputingNodeLinks"
		   });
		addAnnotation
		  (getLogicalComputingPlatform_ELIPlatformId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ELIPlatformId"
		   });
		addAnnotation
		  (getLogicalComputingPlatform_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLogicalComputingPlatformLink_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (logicalProcessorEClass,
		   source,
		   new String[] {
			   "name", "logicalProcessors_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalProcessor_Number(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "number"
		   });
		addAnnotation
		  (getLogicalProcessor_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getLogicalProcessor_StepDurationNanoSeconds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nanoSeconds"
		   });
	}

} //EdtlogicalPackageImpl
