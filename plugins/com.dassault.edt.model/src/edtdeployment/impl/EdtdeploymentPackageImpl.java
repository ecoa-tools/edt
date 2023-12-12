/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtbin.EdtbinPackage;
import edtbin.impl.EdtbinPackageImpl;
import edtdeployment.ComponentLog;
import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.Deployment;
import edtdeployment.EdtdeploymentFactory;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.LogPolicy;
import edtdeployment.ModuleLog;
import edtdeployment.PlatformConfiguration;
import edtdeployment.PlatformMessage;
import edtdeployment.ProtectionDomain;

import edtdeployment.WireMapping;
import edtimplementation.EdtimplementationPackage;

import edtimplementation.impl.EdtimplementationPackageImpl;

import edtinterface.EDTInterfacePackage;

import edtinterface.impl.EDTInterfacePackageImpl;

import edtlogical.EdtlogicalPackage;

import edtlogical.impl.EdtlogicalPackageImpl;

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
public class EdtdeploymentPackageImpl extends EPackageImpl implements EdtdeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedModuleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedTriggerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireMappingEClass = null;

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
	 * @see edtdeployment.EdtdeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdtdeploymentPackageImpl() {
		super(eNS_URI, EdtdeploymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdtdeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdtdeploymentPackage init() {
		if (isInited) return (EdtdeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(EdtdeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdtdeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdtdeploymentPackageImpl theEdtdeploymentPackage = registeredEdtdeploymentPackage instanceof EdtdeploymentPackageImpl ? (EdtdeploymentPackageImpl)registeredEdtdeploymentPackage : new EdtdeploymentPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtimplementationPackage.eNS_URI);
		EdtimplementationPackageImpl theEdtimplementationPackage = (EdtimplementationPackageImpl)(registeredPackage instanceof EdtimplementationPackageImpl ? registeredPackage : EdtimplementationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtlogicalPackage.eNS_URI);
		EdtlogicalPackageImpl theEdtlogicalPackage = (EdtlogicalPackageImpl)(registeredPackage instanceof EdtlogicalPackageImpl ? registeredPackage : EdtlogicalPackage.eINSTANCE);
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
		theEdtdeploymentPackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtimplementationPackage.createPackageContents();
		theEdtlogicalPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEdtqosPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theEDTTypePackage.createPackageContents();
		theTempPackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theEdtdeploymentPackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtimplementationPackage.initializePackageContents();
		theEdtlogicalPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEdtqosPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theEDTTypePackage.initializePackageContents();
		theTempPackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdtdeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdtdeploymentPackage.eNS_URI, theEdtdeploymentPackage);
		return theEdtdeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_Name() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_LogicalSystem() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_FinalAssembly() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_ProtectionDomains() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_LogPolicies() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_PlatformConfigurations() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_WireMappings() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtectionDomain() {
		return protectionDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtectionDomain_DeployedModuleInstances() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtectionDomain_DeployedTriggerInstances() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionDomain_Name() {
		return (EAttribute)protectionDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtectionDomain_ExecuteOnComputingNode() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtectionDomain_ExecuteOnComputingPlatform() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployedModuleInstance() {
		return deployedModuleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedModuleInstance_ModulePriority() {
		return (EAttribute)deployedModuleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedModuleInstance_ModuleInstance() {
		return (EReference)deployedModuleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedModuleInstance_ComponentImplementation() {
		return (EReference)deployedModuleInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedModuleInstance_Component() {
		return (EReference)deployedModuleInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployedTriggerInstance() {
		return deployedTriggerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployedTriggerInstance_TriggerPriority() {
		return (EAttribute)deployedTriggerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedTriggerInstance_TriggerInstance() {
		return (EReference)deployedTriggerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedTriggerInstance_ComponentImplementation() {
		return (EReference)deployedTriggerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployedTriggerInstance_Component() {
		return (EReference)deployedTriggerInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogPolicy() {
		return logPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogPolicy_ComponentLogs() {
		return (EReference)logPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentLog() {
		return componentLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentLog_ModuleLogs() {
		return (EReference)componentLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentLog_EnabledLevels() {
		return (EAttribute)componentLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentLog_ComponentInstance() {
		return (EReference)componentLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentLog_ComponentImplementation() {
		return (EReference)componentLogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleLog() {
		return moduleLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleLog_EnabledLevels() {
		return (EAttribute)moduleLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleLog_ModuleInstance() {
		return (EReference)moduleLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformConfiguration() {
		return platformConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformConfiguration_ComputingNodeConfigurations() {
		return (EReference)platformConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformConfiguration_PlatformMessages() {
		return (EReference)platformConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatformConfiguration_EUIDs() {
		return (EAttribute)platformConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatformConfiguration_FaultHandlerNotificationMaxNumber() {
		return (EAttribute)platformConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformConfiguration_ComputingPlatform() {
		return (EReference)platformConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformMessage() {
		return platformMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformMessage_MappedOnLinkId() {
		return (EReference)platformMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingNodeConfiguration() {
		return computingNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNodeConfiguration_SchedulingInformation() {
		return (EAttribute)computingNodeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingNodeConfiguration_ComputingNode() {
		return (EReference)computingNodeConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWireMapping() {
		return wireMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWireMapping_MappedOnLinkId() {
		return (EReference)wireMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWireMapping_Wire() {
		return (EReference)wireMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtdeploymentFactory getEdtdeploymentFactory() {
		return (EdtdeploymentFactory)getEFactoryInstance();
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
		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
		createEReference(deploymentEClass, DEPLOYMENT__LOGICAL_SYSTEM);
		createEReference(deploymentEClass, DEPLOYMENT__FINAL_ASSEMBLY);
		createEReference(deploymentEClass, DEPLOYMENT__PROTECTION_DOMAINS);
		createEReference(deploymentEClass, DEPLOYMENT__LOG_POLICIES);
		createEReference(deploymentEClass, DEPLOYMENT__PLATFORM_CONFIGURATIONS);
		createEReference(deploymentEClass, DEPLOYMENT__WIRE_MAPPINGS);

		protectionDomainEClass = createEClass(PROTECTION_DOMAIN);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES);
		createEAttribute(protectionDomainEClass, PROTECTION_DOMAIN__NAME);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM);

		deployedModuleInstanceEClass = createEClass(DEPLOYED_MODULE_INSTANCE);
		createEAttribute(deployedModuleInstanceEClass, DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY);
		createEReference(deployedModuleInstanceEClass, DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE);
		createEReference(deployedModuleInstanceEClass, DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION);
		createEReference(deployedModuleInstanceEClass, DEPLOYED_MODULE_INSTANCE__COMPONENT);

		deployedTriggerInstanceEClass = createEClass(DEPLOYED_TRIGGER_INSTANCE);
		createEAttribute(deployedTriggerInstanceEClass, DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY);
		createEReference(deployedTriggerInstanceEClass, DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE);
		createEReference(deployedTriggerInstanceEClass, DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION);
		createEReference(deployedTriggerInstanceEClass, DEPLOYED_TRIGGER_INSTANCE__COMPONENT);

		logPolicyEClass = createEClass(LOG_POLICY);
		createEReference(logPolicyEClass, LOG_POLICY__COMPONENT_LOGS);

		componentLogEClass = createEClass(COMPONENT_LOG);
		createEReference(componentLogEClass, COMPONENT_LOG__MODULE_LOGS);
		createEAttribute(componentLogEClass, COMPONENT_LOG__ENABLED_LEVELS);
		createEReference(componentLogEClass, COMPONENT_LOG__COMPONENT_INSTANCE);
		createEReference(componentLogEClass, COMPONENT_LOG__COMPONENT_IMPLEMENTATION);

		moduleLogEClass = createEClass(MODULE_LOG);
		createEAttribute(moduleLogEClass, MODULE_LOG__ENABLED_LEVELS);
		createEReference(moduleLogEClass, MODULE_LOG__MODULE_INSTANCE);

		platformConfigurationEClass = createEClass(PLATFORM_CONFIGURATION);
		createEReference(platformConfigurationEClass, PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS);
		createEReference(platformConfigurationEClass, PLATFORM_CONFIGURATION__PLATFORM_MESSAGES);
		createEAttribute(platformConfigurationEClass, PLATFORM_CONFIGURATION__EUI_DS);
		createEAttribute(platformConfigurationEClass, PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER);
		createEReference(platformConfigurationEClass, PLATFORM_CONFIGURATION__COMPUTING_PLATFORM);

		platformMessageEClass = createEClass(PLATFORM_MESSAGE);
		createEReference(platformMessageEClass, PLATFORM_MESSAGE__MAPPED_ON_LINK_ID);

		computingNodeConfigurationEClass = createEClass(COMPUTING_NODE_CONFIGURATION);
		createEAttribute(computingNodeConfigurationEClass, COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION);
		createEReference(computingNodeConfigurationEClass, COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE);

		wireMappingEClass = createEClass(WIRE_MAPPING);
		createEReference(wireMappingEClass, WIRE_MAPPING__MAPPED_ON_LINK_ID);
		createEReference(wireMappingEClass, WIRE_MAPPING__WIRE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EdtlogicalPackage theEdtlogicalPackage = (EdtlogicalPackage)EPackage.Registry.INSTANCE.getEPackage(EdtlogicalPackage.eNS_URI);
		EDTProjectPackage theEDTProjectPackage = (EDTProjectPackage)EPackage.Registry.INSTANCE.getEPackage(EDTProjectPackage.eNS_URI);
		depPackage thedepPackage = (depPackage)EPackage.Registry.INSTANCE.getEPackage(depPackage.eNS_URI);
		EdtimplementationPackage theEdtimplementationPackage = (EdtimplementationPackage)EPackage.Registry.INSTANCE.getEPackage(EdtimplementationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Name(), theXMLTypePackage.getName_(), "Name", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_LogicalSystem(), theEdtlogicalPackage.getLogicalSystem(), null, "logicalSystem", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_FinalAssembly(), theEDTProjectPackage.getFinalAssembly(), null, "finalAssembly", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_ProtectionDomains(), this.getProtectionDomain(), null, "protectionDomains", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_LogPolicies(), this.getLogPolicy(), null, "logPolicies", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_PlatformConfigurations(), this.getPlatformConfiguration(), null, "platformConfigurations", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_WireMappings(), this.getWireMapping(), null, "wireMappings", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionDomainEClass, ProtectionDomain.class, "ProtectionDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtectionDomain_DeployedModuleInstances(), this.getDeployedModuleInstance(), null, "deployedModuleInstances", null, 0, -1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionDomain_DeployedTriggerInstances(), this.getDeployedTriggerInstance(), null, "deployedTriggerInstances", null, 0, -1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionDomain_Name(), thedepPackage.getNameId(), "name", null, 1, 1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionDomain_ExecuteOnComputingNode(), theEdtlogicalPackage.getLogicalComputingNode(), theEdtlogicalPackage.getLogicalComputingNode_ProtectionDomainLink(), "executeOnComputingNode", null, 1, 1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionDomain_ExecuteOnComputingPlatform(), theEdtlogicalPackage.getLogicalComputingPlatform(), null, "executeOnComputingPlatform", null, 1, 1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedModuleInstanceEClass, DeployedModuleInstance.class, "DeployedModuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedModuleInstance_ModulePriority(), thedepPackage.getModulePriority(), "modulePriority", null, 1, 1, DeployedModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedModuleInstance_ModuleInstance(), theEdtimplementationPackage.getModuleInstance(), null, "ModuleInstance", null, 1, 1, DeployedModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedModuleInstance_ComponentImplementation(), theEdtimplementationPackage.getComponentImplementation(), null, "ComponentImplementation", null, 1, 1, DeployedModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedModuleInstance_Component(), theEDTProjectPackage.getComponent(), null, "Component", null, 1, 1, DeployedModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedTriggerInstanceEClass, DeployedTriggerInstance.class, "DeployedTriggerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedTriggerInstance_TriggerPriority(), thedepPackage.getModulePriority(), "triggerPriority", null, 1, 1, DeployedTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedTriggerInstance_TriggerInstance(), theEdtimplementationPackage.getTrigger(), null, "TriggerInstance", null, 1, 1, DeployedTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedTriggerInstance_ComponentImplementation(), theEdtimplementationPackage.getComponentImplementation(), null, "ComponentImplementation", null, 1, 1, DeployedTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedTriggerInstance_Component(), theEDTProjectPackage.getComponent(), null, "Component", null, 1, 1, DeployedTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logPolicyEClass, LogPolicy.class, "LogPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogPolicy_ComponentLogs(), this.getComponentLog(), null, "componentLogs", null, 0, -1, LogPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentLogEClass, ComponentLog.class, "ComponentLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentLog_ModuleLogs(), this.getModuleLog(), null, "moduleLogs", null, 0, -1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentLog_EnabledLevels(), theXMLTypePackage.getString(), "enabledLevels", null, 1, 1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentLog_ComponentInstance(), theEDTProjectPackage.getComponent(), null, "ComponentInstance", null, 1, 1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentLog_ComponentImplementation(), theEdtimplementationPackage.getComponentImplementation(), null, "ComponentImplementation", null, 1, 1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleLogEClass, ModuleLog.class, "ModuleLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleLog_EnabledLevels(), theXMLTypePackage.getString(), "enabledLevels", null, 1, 1, ModuleLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleLog_ModuleInstance(), theEdtimplementationPackage.getModuleInstance(), null, "ModuleInstance", null, 1, 1, ModuleLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformConfigurationEClass, PlatformConfiguration.class, "PlatformConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformConfiguration_ComputingNodeConfigurations(), this.getComputingNodeConfiguration(), null, "computingNodeConfigurations", null, 0, -1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformConfiguration_PlatformMessages(), this.getPlatformMessage(), null, "platformMessages", null, 0, -1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformConfiguration_EUIDs(), theXMLTypePackage.getAnyURI(), "eUIDs", null, 0, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformConfiguration_FaultHandlerNotificationMaxNumber(), thedepPackage.getFifoSize(), "faultHandlerNotificationMaxNumber", "8", 0, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformConfiguration_ComputingPlatform(), theEdtlogicalPackage.getLogicalComputingPlatform(), null, "computingPlatform", null, 1, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformMessageEClass, PlatformMessage.class, "PlatformMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformMessage_MappedOnLinkId(), theEdtlogicalPackage.getLogicalComputingPlatformLink(), null, "mappedOnLinkId", null, 1, 1, PlatformMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingNodeConfigurationEClass, ComputingNodeConfiguration.class, "ComputingNodeConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingNodeConfiguration_SchedulingInformation(), theXMLTypePackage.getAnyURI(), "schedulingInformation", null, 0, 1, ComputingNodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingNodeConfiguration_ComputingNode(), theEdtlogicalPackage.getLogicalComputingNode(), null, "computingNode", null, 1, 1, ComputingNodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireMappingEClass, WireMapping.class, "WireMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWireMapping_MappedOnLinkId(), theEdtlogicalPackage.getLogicalComputingPlatformLink(), null, "mappedOnLinkId", null, 1, 1, WireMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWireMapping_Wire(), theEDTProjectPackage.getServiceLink(), null, "Wire", null, 1, 1, WireMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDeployment_ProtectionDomains(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "protectionDomain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_LogPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_PlatformConfigurations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "platformConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_WireMappings(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wireMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployedModuleInstance_ModulePriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "modulePriority"
		   });
		addAnnotation
		  (getDeployedTriggerInstance_TriggerPriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "triggerPriority"
		   });
		addAnnotation
		  (getLogPolicy_ComponentLogs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentLog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentLog_ModuleLogs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleLog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentLog_EnabledLevels(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enabledLevels"
		   });
		addAnnotation
		  (getModuleLog_EnabledLevels(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enabledLevels"
		   });
		addAnnotation
		  (getPlatformConfiguration_ComputingNodeConfigurations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "computingNodeConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPlatformConfiguration_PlatformMessages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "platformMessages",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPlatformConfiguration_EUIDs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "EUIDs"
		   });
		addAnnotation
		  (getPlatformConfiguration_FaultHandlerNotificationMaxNumber(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "faultHandlerNotificationMaxNumber"
		   });
		addAnnotation
		  (getComputingNodeConfiguration_SchedulingInformation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "schedulingInformation"
		   });
	}

} //EdtdeploymentPackageImpl
