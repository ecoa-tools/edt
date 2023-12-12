/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import EcoaCommon20.EcoaCommon20Package;

import EcoaCommon20.impl.EcoaCommon20PackageImpl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl;

import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

import org.w3._2001.xml.xsd.SchemaPackage;

import org.w3._2001.xml.xsd.impl.SchemaPackageImpl;

import technology.ecoa.bin.desc._2.binPackage;

import technology.ecoa.bin.desc._2.impl.binPackageImpl;

import technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl;

import technology.ecoa.cross.platforms.view._2.viewPackage;

import technology.ecoa.deployment._2.ComponentLog;
import technology.ecoa.deployment._2.ComputingNodeConfiguration;
import technology.ecoa.deployment._2.DeployedModuleInstanceType;
import technology.ecoa.deployment._2.DeployedTriggerInstanceType;
import technology.ecoa.deployment._2.Deployment;
import technology.ecoa.deployment._2.DocumentRoot;
import technology.ecoa.deployment._2.ExecuteOnType;
import technology.ecoa.deployment._2.LogPolicy;
import technology.ecoa.deployment._2.ModuleLog;
import technology.ecoa.deployment._2.PlatformConfiguration;
import technology.ecoa.deployment._2.PlatformMessages;
import technology.ecoa.deployment._2.ProgrammingLanguage;
import technology.ecoa.deployment._2.ProtectionDomain;
import technology.ecoa.deployment._2.UseType;
import technology.ecoa.deployment._2.WireMapping;
import technology.ecoa.deployment._2.depFactory;
import technology.ecoa.deployment._2.depPackage;

import technology.ecoa.deployment._2.util.depValidator;

import technology.ecoa.implementation._2.impPackage;

import technology.ecoa.implementation._2.impl.impPackageImpl;

import technology.ecoa.insertion.policy._2.impl.polPackageImpl;

import technology.ecoa.insertion.policy._2.polPackage;

import technology.ecoa.interface_._2.impl.interPackageImpl;

import technology.ecoa.interface_._2.interPackage;

import technology.ecoa.interface_.qos._2.impl.qosPackageImpl;

import technology.ecoa.interface_.qos._2.qosPackage;

import technology.ecoa.logicalsystem._2.impl.logPackageImpl;

import technology.ecoa.logicalsystem._2.logPackage;

import technology.ecoa.module.behaviour._2.impl.modPackageImpl;

import technology.ecoa.module.behaviour._2.modPackage;

import technology.ecoa.project._2.impl.projPackageImpl;

import technology.ecoa.project._2.projPackage;

import technology.ecoa.sca.extension.scaExt.impl.scaExtPackageImpl;

import technology.ecoa.sca.extension.scaExt.scaExtPackage;

import technology.ecoa.types._2.impl.typPackageImpl;

import technology.ecoa.types._2.typPackage;

import technology.ecoa.udpbinding._2.impl.udpPackageImpl;

import technology.ecoa.udpbinding._2.udpPackage;

import technology.ecoa.uid._2.impl.uidPackageImpl;

import technology.ecoa.uid._2.uidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class depPackageImpl extends EPackageImpl implements depPackage {
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
	private EClass computingNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedModuleInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedTriggerInstanceTypeEClass = null;

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
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeOnTypeEClass = null;

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
	private EClass platformMessagesEClass = null;

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
	private EClass useTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programmingLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fifoSizeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hexOrDecValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType libraryNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modulePriorityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType programmingLanguageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stepsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stepsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeDurationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeDurationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeQNameEDataType = null;

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
	 * @see technology.ecoa.deployment._2.depPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private depPackageImpl() {
		super(eNS_URI, depFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link depPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static depPackage init() {
		if (isInited) return (depPackage)EPackage.Registry.INSTANCE.getEPackage(depPackage.eNS_URI);

		// Obtain or create and register package
		Object registereddepPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		depPackageImpl thedepPackage = registereddepPackage instanceof depPackageImpl ? (depPackageImpl)registereddepPackage : new depPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(polPackage.eNS_URI);
		polPackageImpl thepolPackage = (polPackageImpl)(registeredPackage instanceof polPackageImpl ? registeredPackage : polPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(modPackage.eNS_URI);
		modPackageImpl themodPackage = (modPackageImpl)(registeredPackage instanceof modPackageImpl ? registeredPackage : modPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(udpPackage.eNS_URI);
		udpPackageImpl theudpPackage = (udpPackageImpl)(registeredPackage instanceof udpPackageImpl ? registeredPackage : udpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(binPackage.eNS_URI);
		binPackageImpl thebinPackage = (binPackageImpl)(registeredPackage instanceof binPackageImpl ? registeredPackage : binPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcoaCommon20Package.eNS_URI);
		EcoaCommon20PackageImpl theEcoaCommon20Package = (EcoaCommon20PackageImpl)(registeredPackage instanceof EcoaCommon20PackageImpl ? registeredPackage : EcoaCommon20Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(viewPackage.eNS_URI);
		viewPackageImpl theviewPackage = (viewPackageImpl)(registeredPackage instanceof viewPackageImpl ? registeredPackage : viewPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(impPackage.eNS_URI);
		impPackageImpl theimpPackage = (impPackageImpl)(registeredPackage instanceof impPackageImpl ? registeredPackage : impPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(interPackage.eNS_URI);
		interPackageImpl theinterPackage = (interPackageImpl)(registeredPackage instanceof interPackageImpl ? registeredPackage : interPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(qosPackage.eNS_URI);
		qosPackageImpl theqosPackage = (qosPackageImpl)(registeredPackage instanceof qosPackageImpl ? registeredPackage : qosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(logPackage.eNS_URI);
		logPackageImpl thelogPackage = (logPackageImpl)(registeredPackage instanceof logPackageImpl ? registeredPackage : logPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(projPackage.eNS_URI);
		projPackageImpl theprojPackage = (projPackageImpl)(registeredPackage instanceof projPackageImpl ? registeredPackage : projPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(typPackage.eNS_URI);
		typPackageImpl thetypPackage = (typPackageImpl)(registeredPackage instanceof typPackageImpl ? registeredPackage : typPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(uidPackage.eNS_URI);
		uidPackageImpl theuidPackage = (uidPackageImpl)(registeredPackage instanceof uidPackageImpl ? registeredPackage : uidPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scaPackage.eNS_URI);
		scaPackageImpl thescaPackage = (scaPackageImpl)(registeredPackage instanceof scaPackageImpl ? registeredPackage : scaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scaExtPackage.eNS_URI);
		scaExtPackageImpl thescaExtPackage = (scaExtPackageImpl)(registeredPackage instanceof scaExtPackageImpl ? registeredPackage : scaExtPackage.eINSTANCE);

		// Create package meta-data objects
		thedepPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		thepolPackage.createPackageContents();
		themodPackage.createPackageContents();
		theudpPackage.createPackageContents();
		thebinPackage.createPackageContents();
		theEcoaCommon20Package.createPackageContents();
		theviewPackage.createPackageContents();
		theimpPackage.createPackageContents();
		theinterPackage.createPackageContents();
		theqosPackage.createPackageContents();
		thelogPackage.createPackageContents();
		theprojPackage.createPackageContents();
		thetypPackage.createPackageContents();
		theuidPackage.createPackageContents();
		thescaPackage.createPackageContents();
		thescaExtPackage.createPackageContents();

		// Initialize created meta-data
		thedepPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		thepolPackage.initializePackageContents();
		themodPackage.initializePackageContents();
		theudpPackage.initializePackageContents();
		thebinPackage.initializePackageContents();
		theEcoaCommon20Package.initializePackageContents();
		theviewPackage.initializePackageContents();
		theimpPackage.initializePackageContents();
		theinterPackage.initializePackageContents();
		theqosPackage.initializePackageContents();
		thelogPackage.initializePackageContents();
		theprojPackage.initializePackageContents();
		thetypPackage.initializePackageContents();
		theuidPackage.initializePackageContents();
		thescaPackage.initializePackageContents();
		thescaExtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thedepPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return depValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thedepPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(depPackage.eNS_URI, thedepPackage);
		return thedepPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentLog() {
		return componentLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentLog_ModuleLog() {
		return (EReference)componentLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentLog_EnabledLevels() {
		return (EAttribute)componentLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentLog_InstanceName() {
		return (EAttribute)componentLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingNodeConfiguration() {
		return computingNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingNodeConfiguration_ComputingNode() {
		return (EAttribute)computingNodeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingNodeConfiguration_SchedulingInformation() {
		return (EAttribute)computingNodeConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedModuleInstanceType() {
		return deployedModuleInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedModuleInstanceType_ComponentName() {
		return (EAttribute)deployedModuleInstanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedModuleInstanceType_ModuleInstanceName() {
		return (EAttribute)deployedModuleInstanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedModuleInstanceType_ModulePriority() {
		return (EAttribute)deployedModuleInstanceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedTriggerInstanceType() {
		return deployedTriggerInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedTriggerInstanceType_ComponentName() {
		return (EAttribute)deployedTriggerInstanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedTriggerInstanceType_TriggerInstanceName() {
		return (EAttribute)deployedTriggerInstanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedTriggerInstanceType_TriggerPriority() {
		return (EAttribute)deployedTriggerInstanceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_ProtectionDomain() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_LogPolicy() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_PlatformConfiguration() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_WireMapping() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_FinalAssembly() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_LogicalSystem() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Deployment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Use() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteOnType() {
		return executeOnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteOnType_ComputingNode() {
		return (EAttribute)executeOnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteOnType_ComputingPlatform() {
		return (EAttribute)executeOnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogPolicy() {
		return logPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogPolicy_ComponentLog() {
		return (EReference)logPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleLog() {
		return moduleLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleLog_EnabledLevels() {
		return (EAttribute)moduleLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleLog_InstanceName() {
		return (EAttribute)moduleLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformConfiguration() {
		return platformConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformConfiguration_ComputingNodeConfiguration() {
		return (EReference)platformConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformConfiguration_PlatformMessages() {
		return (EReference)platformConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformConfiguration_ComputingPlatform() {
		return (EAttribute)platformConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformConfiguration_EUIDs() {
		return (EAttribute)platformConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformConfiguration_FaultHandlerNotificationMaxNumber() {
		return (EAttribute)platformConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformMessages() {
		return platformMessagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformMessages_MappedOnLinkId() {
		return (EAttribute)platformMessagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionDomain() {
		return protectionDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionDomain_ExecuteOn() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionDomain_Group() {
		return (EAttribute)protectionDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionDomain_DeployedModuleInstance() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionDomain_DeployedTriggerInstance() {
		return (EReference)protectionDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionDomain_Name() {
		return (EAttribute)protectionDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseType() {
		return useTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseType_Library() {
		return (EAttribute)useTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireMapping() {
		return wireMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireMapping_MappedOnLinkId() {
		return (EAttribute)wireMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireMapping_Source() {
		return (EAttribute)wireMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireMapping_Target() {
		return (EAttribute)wireMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProgrammingLanguage() {
		return programmingLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFifoSize() {
		return fifoSizeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHexOrDecValue() {
		return hexOrDecValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLibraryName() {
		return libraryNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModulePriority() {
		return modulePriorityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameId() {
		return nameIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProgrammingLanguageObject() {
		return programmingLanguageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSteps() {
		return stepsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStepsObject() {
		return stepsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeDuration() {
		return timeDurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeDurationObject() {
		return timeDurationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeName() {
		return typeNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeQName() {
		return typeQNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public depFactory getdepFactory() {
		return (depFactory)getEFactoryInstance();
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
		componentLogEClass = createEClass(COMPONENT_LOG);
		createEReference(componentLogEClass, COMPONENT_LOG__MODULE_LOG);
		createEAttribute(componentLogEClass, COMPONENT_LOG__ENABLED_LEVELS);
		createEAttribute(componentLogEClass, COMPONENT_LOG__INSTANCE_NAME);

		computingNodeConfigurationEClass = createEClass(COMPUTING_NODE_CONFIGURATION);
		createEAttribute(computingNodeConfigurationEClass, COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE);
		createEAttribute(computingNodeConfigurationEClass, COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION);

		deployedModuleInstanceTypeEClass = createEClass(DEPLOYED_MODULE_INSTANCE_TYPE);
		createEAttribute(deployedModuleInstanceTypeEClass, DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME);
		createEAttribute(deployedModuleInstanceTypeEClass, DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME);
		createEAttribute(deployedModuleInstanceTypeEClass, DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY);

		deployedTriggerInstanceTypeEClass = createEClass(DEPLOYED_TRIGGER_INSTANCE_TYPE);
		createEAttribute(deployedTriggerInstanceTypeEClass, DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME);
		createEAttribute(deployedTriggerInstanceTypeEClass, DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME);
		createEAttribute(deployedTriggerInstanceTypeEClass, DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__PROTECTION_DOMAIN);
		createEReference(deploymentEClass, DEPLOYMENT__LOG_POLICY);
		createEReference(deploymentEClass, DEPLOYMENT__PLATFORM_CONFIGURATION);
		createEReference(deploymentEClass, DEPLOYMENT__WIRE_MAPPING);
		createEAttribute(deploymentEClass, DEPLOYMENT__FINAL_ASSEMBLY);
		createEAttribute(deploymentEClass, DEPLOYMENT__LOGICAL_SYSTEM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPLOYMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);

		executeOnTypeEClass = createEClass(EXECUTE_ON_TYPE);
		createEAttribute(executeOnTypeEClass, EXECUTE_ON_TYPE__COMPUTING_NODE);
		createEAttribute(executeOnTypeEClass, EXECUTE_ON_TYPE__COMPUTING_PLATFORM);

		logPolicyEClass = createEClass(LOG_POLICY);
		createEReference(logPolicyEClass, LOG_POLICY__COMPONENT_LOG);

		moduleLogEClass = createEClass(MODULE_LOG);
		createEAttribute(moduleLogEClass, MODULE_LOG__ENABLED_LEVELS);
		createEAttribute(moduleLogEClass, MODULE_LOG__INSTANCE_NAME);

		platformConfigurationEClass = createEClass(PLATFORM_CONFIGURATION);
		createEReference(platformConfigurationEClass, PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION);
		createEReference(platformConfigurationEClass, PLATFORM_CONFIGURATION__PLATFORM_MESSAGES);
		createEAttribute(platformConfigurationEClass, PLATFORM_CONFIGURATION__COMPUTING_PLATFORM);
		createEAttribute(platformConfigurationEClass, PLATFORM_CONFIGURATION__EUI_DS);
		createEAttribute(platformConfigurationEClass, PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER);

		platformMessagesEClass = createEClass(PLATFORM_MESSAGES);
		createEAttribute(platformMessagesEClass, PLATFORM_MESSAGES__MAPPED_ON_LINK_ID);

		protectionDomainEClass = createEClass(PROTECTION_DOMAIN);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__EXECUTE_ON);
		createEAttribute(protectionDomainEClass, PROTECTION_DOMAIN__GROUP);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE);
		createEReference(protectionDomainEClass, PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE);
		createEAttribute(protectionDomainEClass, PROTECTION_DOMAIN__NAME);

		useTypeEClass = createEClass(USE_TYPE);
		createEAttribute(useTypeEClass, USE_TYPE__LIBRARY);

		wireMappingEClass = createEClass(WIRE_MAPPING);
		createEAttribute(wireMappingEClass, WIRE_MAPPING__MAPPED_ON_LINK_ID);
		createEAttribute(wireMappingEClass, WIRE_MAPPING__SOURCE);
		createEAttribute(wireMappingEClass, WIRE_MAPPING__TARGET);

		// Create enums
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);

		// Create data types
		fifoSizeEDataType = createEDataType(FIFO_SIZE);
		hexOrDecValueEDataType = createEDataType(HEX_OR_DEC_VALUE);
		libraryNameEDataType = createEDataType(LIBRARY_NAME);
		modulePriorityEDataType = createEDataType(MODULE_PRIORITY);
		nameIdEDataType = createEDataType(NAME_ID);
		programmingLanguageObjectEDataType = createEDataType(PROGRAMMING_LANGUAGE_OBJECT);
		stepsEDataType = createEDataType(STEPS);
		stepsObjectEDataType = createEDataType(STEPS_OBJECT);
		timeDurationEDataType = createEDataType(TIME_DURATION);
		timeDurationObjectEDataType = createEDataType(TIME_DURATION_OBJECT);
		typeNameEDataType = createEDataType(TYPE_NAME);
		typeQNameEDataType = createEDataType(TYPE_QNAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentLogEClass, ComponentLog.class, "ComponentLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentLog_ModuleLog(), this.getModuleLog(), null, "moduleLog", null, 0, -1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentLog_EnabledLevels(), theXMLTypePackage.getString(), "enabledLevels", null, 1, 1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentLog_InstanceName(), theXMLTypePackage.getString(), "instanceName", null, 1, 1, ComponentLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingNodeConfigurationEClass, ComputingNodeConfiguration.class, "ComputingNodeConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingNodeConfiguration_ComputingNode(), this.getNameId(), "computingNode", null, 1, 1, ComputingNodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNodeConfiguration_SchedulingInformation(), theXMLTypePackage.getAnyURI(), "schedulingInformation", null, 0, 1, ComputingNodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedModuleInstanceTypeEClass, DeployedModuleInstanceType.class, "DeployedModuleInstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedModuleInstanceType_ComponentName(), this.getNameId(), "componentName", null, 1, 1, DeployedModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedModuleInstanceType_ModuleInstanceName(), this.getNameId(), "moduleInstanceName", null, 1, 1, DeployedModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedModuleInstanceType_ModulePriority(), this.getModulePriority(), "modulePriority", null, 1, 1, DeployedModuleInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedTriggerInstanceTypeEClass, DeployedTriggerInstanceType.class, "DeployedTriggerInstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedTriggerInstanceType_ComponentName(), this.getNameId(), "componentName", null, 1, 1, DeployedTriggerInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedTriggerInstanceType_TriggerInstanceName(), this.getNameId(), "triggerInstanceName", null, 1, 1, DeployedTriggerInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployedTriggerInstanceType_TriggerPriority(), this.getModulePriority(), "triggerPriority", null, 1, 1, DeployedTriggerInstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_ProtectionDomain(), this.getProtectionDomain(), null, "protectionDomain", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_LogPolicy(), this.getLogPolicy(), null, "logPolicy", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_PlatformConfiguration(), this.getPlatformConfiguration(), null, "platformConfiguration", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_WireMapping(), this.getWireMapping(), null, "wireMapping", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_FinalAssembly(), this.getNameId(), "finalAssembly", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_LogicalSystem(), this.getNameId(), "logicalSystem", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Deployment(), this.getDeployment(), null, "deployment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUseType(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executeOnTypeEClass, ExecuteOnType.class, "ExecuteOnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecuteOnType_ComputingNode(), this.getNameId(), "computingNode", null, 1, 1, ExecuteOnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteOnType_ComputingPlatform(), this.getNameId(), "computingPlatform", null, 1, 1, ExecuteOnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logPolicyEClass, LogPolicy.class, "LogPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogPolicy_ComponentLog(), this.getComponentLog(), null, "componentLog", null, 0, -1, LogPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleLogEClass, ModuleLog.class, "ModuleLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleLog_EnabledLevels(), theXMLTypePackage.getString(), "enabledLevels", null, 1, 1, ModuleLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleLog_InstanceName(), theXMLTypePackage.getString(), "instanceName", null, 1, 1, ModuleLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformConfigurationEClass, PlatformConfiguration.class, "PlatformConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformConfiguration_ComputingNodeConfiguration(), this.getComputingNodeConfiguration(), null, "computingNodeConfiguration", null, 0, -1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformConfiguration_PlatformMessages(), this.getPlatformMessages(), null, "platformMessages", null, 0, -1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformConfiguration_ComputingPlatform(), this.getNameId(), "computingPlatform", null, 1, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformConfiguration_EUIDs(), theXMLTypePackage.getAnyURI(), "eUIDs", null, 0, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformConfiguration_FaultHandlerNotificationMaxNumber(), this.getFifoSize(), "faultHandlerNotificationMaxNumber", "8", 0, 1, PlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformMessagesEClass, PlatformMessages.class, "PlatformMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatformMessages_MappedOnLinkId(), this.getNameId(), "mappedOnLinkId", null, 1, 1, PlatformMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionDomainEClass, ProtectionDomain.class, "ProtectionDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtectionDomain_ExecuteOn(), this.getExecuteOnType(), null, "executeOn", null, 1, 1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionDomain_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionDomain_DeployedModuleInstance(), this.getDeployedModuleInstanceType(), null, "deployedModuleInstance", null, 0, -1, ProtectionDomain.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionDomain_DeployedTriggerInstance(), this.getDeployedTriggerInstanceType(), null, "deployedTriggerInstance", null, 0, -1, ProtectionDomain.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionDomain_Name(), this.getNameId(), "name", null, 1, 1, ProtectionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useTypeEClass, UseType.class, "UseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseType_Library(), this.getLibraryName(), "library", null, 1, 1, UseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireMappingEClass, WireMapping.class, "WireMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWireMapping_MappedOnLinkId(), this.getNameId(), "mappedOnLinkId", null, 1, 1, WireMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireMapping_Source(), theXMLTypePackage.getAnyURI(), "source", null, 1, 1, WireMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWireMapping_Target(), theXMLTypePackage.getAnyURI(), "target", null, 1, 1, WireMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C1);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.ADA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.HI_ADA);

		// Initialize data types
		initEDataType(fifoSizeEDataType, BigDecimal.class, "FifoSize", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hexOrDecValueEDataType, String.class, "HexOrDecValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(libraryNameEDataType, String.class, "LibraryName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modulePriorityEDataType, BigDecimal.class, "ModulePriority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameIdEDataType, String.class, "NameId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(programmingLanguageObjectEDataType, ProgrammingLanguage.class, "ProgrammingLanguageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsEDataType, double.class, "Steps", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsObjectEDataType, Double.class, "StepsObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationEDataType, double.class, "TimeDuration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationObjectEDataType, Double.class, "TimeDurationObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeNameEDataType, String.class, "TypeName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeQNameEDataType, String.class, "TypeQName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (componentLogEClass,
		   source,
		   new String[] {
			   "name", "ComponentLog",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponentLog_ModuleLog(),
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
		  (getComponentLog_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (computingNodeConfigurationEClass,
		   source,
		   new String[] {
			   "name", "ComputingNodeConfiguration",
			   "kind", "empty"
		   });
		addAnnotation
		  (getComputingNodeConfiguration_ComputingNode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "computingNode"
		   });
		addAnnotation
		  (getComputingNodeConfiguration_SchedulingInformation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "schedulingInformation"
		   });
		addAnnotation
		  (deployedModuleInstanceTypeEClass,
		   source,
		   new String[] {
			   "name", "deployedModuleInstance_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDeployedModuleInstanceType_ComponentName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "componentName"
		   });
		addAnnotation
		  (getDeployedModuleInstanceType_ModuleInstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "moduleInstanceName"
		   });
		addAnnotation
		  (getDeployedModuleInstanceType_ModulePriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "modulePriority"
		   });
		addAnnotation
		  (deployedTriggerInstanceTypeEClass,
		   source,
		   new String[] {
			   "name", "deployedTriggerInstance_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDeployedTriggerInstanceType_ComponentName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "componentName"
		   });
		addAnnotation
		  (getDeployedTriggerInstanceType_TriggerInstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "triggerInstanceName"
		   });
		addAnnotation
		  (getDeployedTriggerInstanceType_TriggerPriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "triggerPriority"
		   });
		addAnnotation
		  (deploymentEClass,
		   source,
		   new String[] {
			   "name", "Deployment",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeployment_ProtectionDomain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "protectionDomain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_LogPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_PlatformConfiguration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "platformConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_WireMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wireMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeployment_FinalAssembly(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "finalAssembly"
		   });
		addAnnotation
		  (getDeployment_LogicalSystem(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "logicalSystem"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Deployment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deployment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (executeOnTypeEClass,
		   source,
		   new String[] {
			   "name", "executeOn_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getExecuteOnType_ComputingNode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "computingNode"
		   });
		addAnnotation
		  (getExecuteOnType_ComputingPlatform(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "computingPlatform"
		   });
		addAnnotation
		  (fifoSizeEDataType,
		   source,
		   new String[] {
			   "name", "FifoSize",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "1",
			   "maxInclusive", "255"
		   });
		addAnnotation
		  (hexOrDecValueEDataType,
		   source,
		   new String[] {
			   "name", "HexOrDecValue",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "0x[0-9A-Fa-f]+|[1-9][0-9]*|0"
		   });
		addAnnotation
		  (libraryNameEDataType,
		   source,
		   new String[] {
			   "name", "LibraryName",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[A-Za-z][A-Za-z0-9_\\.]*"
		   });
		addAnnotation
		  (logPolicyEClass,
		   source,
		   new String[] {
			   "name", "LogPolicy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogPolicy_ComponentLog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentLog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (moduleLogEClass,
		   source,
		   new String[] {
			   "name", "ModuleLog",
			   "kind", "empty"
		   });
		addAnnotation
		  (getModuleLog_EnabledLevels(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enabledLevels"
		   });
		addAnnotation
		  (getModuleLog_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (modulePriorityEDataType,
		   source,
		   new String[] {
			   "name", "ModulePriority",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0",
			   "maxInclusive", "255"
		   });
		addAnnotation
		  (nameIdEDataType,
		   source,
		   new String[] {
			   "name", "NameId",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[A-Za-z][A-Za-z0-9_]*"
		   });
		addAnnotation
		  (platformConfigurationEClass,
		   source,
		   new String[] {
			   "name", "PlatformConfiguration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlatformConfiguration_ComputingNodeConfiguration(),
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
		  (getPlatformConfiguration_ComputingPlatform(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "computingPlatform"
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
		  (platformMessagesEClass,
		   source,
		   new String[] {
			   "name", "PlatformMessages",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPlatformMessages_MappedOnLinkId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mappedOnLinkId"
		   });
		addAnnotation
		  (programmingLanguageEEnum,
		   source,
		   new String[] {
			   "name", "ProgrammingLanguage"
		   });
		addAnnotation
		  (programmingLanguageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ProgrammingLanguage:Object",
			   "baseType", "ProgrammingLanguage"
		   });
		addAnnotation
		  (protectionDomainEClass,
		   source,
		   new String[] {
			   "name", "ProtectionDomain",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProtectionDomain_ExecuteOn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "executeOn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProtectionDomain_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getProtectionDomain_DeployedModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deployedModuleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getProtectionDomain_DeployedTriggerInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deployedTriggerInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getProtectionDomain_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (stepsEDataType,
		   source,
		   new String[] {
			   "name", "Steps",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			   "minInclusive", "0.0"
		   });
		addAnnotation
		  (stepsObjectEDataType,
		   source,
		   new String[] {
			   "name", "Steps:Object",
			   "baseType", "Steps"
		   });
		addAnnotation
		  (timeDurationEDataType,
		   source,
		   new String[] {
			   "name", "TimeDuration",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			   "minInclusive", "0.0"
		   });
		addAnnotation
		  (timeDurationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TimeDuration:Object",
			   "baseType", "TimeDuration"
		   });
		addAnnotation
		  (typeNameEDataType,
		   source,
		   new String[] {
			   "name", "TypeName",
			   "baseType", "NameId"
		   });
		addAnnotation
		  (typeQNameEDataType,
		   source,
		   new String[] {
			   "name", "TypeQName",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*"
		   });
		addAnnotation
		  (useTypeEClass,
		   source,
		   new String[] {
			   "name", "use_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getUseType_Library(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "library"
		   });
		addAnnotation
		  (wireMappingEClass,
		   source,
		   new String[] {
			   "name", "WireMapping",
			   "kind", "empty"
		   });
		addAnnotation
		  (getWireMapping_MappedOnLinkId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mappedOnLinkId"
		   });
		addAnnotation
		  (getWireMapping_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (getWireMapping_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "target"
		   });
	}

} //depPackageImpl
