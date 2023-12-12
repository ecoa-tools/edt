/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import EcoaCommon20.EcoaCommon20Package;

import EcoaCommon20.impl.EcoaCommon20PackageImpl;

import java.math.BigInteger;

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

import technology.ecoa.deployment._2.depPackage;

import technology.ecoa.deployment._2.impl.depPackageImpl;

import technology.ecoa.implementation._2.impPackage;

import technology.ecoa.implementation._2.impl.impPackageImpl;

import technology.ecoa.insertion.policy._2.ActivationTypeType;
import technology.ecoa.insertion.policy._2.AllocationType;
import technology.ecoa.insertion.policy._2.AperiodicActivationProfile;
import technology.ecoa.insertion.policy._2.DefaultPINFO;
import technology.ecoa.insertion.policy._2.DefaultProperties;
import technology.ecoa.insertion.policy._2.DefaultPropertyValue;
import technology.ecoa.insertion.policy._2.DeploymentConstraints;
import technology.ecoa.insertion.policy._2.DocumentRoot;
import technology.ecoa.insertion.policy._2.DynamicMemoryType;
import technology.ecoa.insertion.policy._2.ECOAProfile;
import technology.ecoa.insertion.policy._2.ExtraConcerns;
import technology.ecoa.insertion.policy._2.HighestActivationRate;
import technology.ecoa.insertion.policy._2.InsertionPolicy;
import technology.ecoa.insertion.policy._2.InsertionPolicyList;
import technology.ecoa.insertion.policy._2.IntegrityType;
import technology.ecoa.insertion.policy._2.LanguageLibraries;
import technology.ecoa.insertion.policy._2.LanguageLibrary;
import technology.ecoa.insertion.policy._2.MemoryUsage;
import technology.ecoa.insertion.policy._2.ModuleActivationProfile;
import technology.ecoa.insertion.policy._2.ModuleActivationProfiles;
import technology.ecoa.insertion.policy._2.ModuleCompilationOptions;
import technology.ecoa.insertion.policy._2.ModuleDependencies;
import technology.ecoa.insertion.policy._2.ModuleMemoryUsage;
import technology.ecoa.insertion.policy._2.ModulePINFOType;
import technology.ecoa.insertion.policy._2.ModulesDependencies;
import technology.ecoa.insertion.policy._2.OSAPIType;
import technology.ecoa.insertion.policy._2.PINFOValue;
import technology.ecoa.insertion.policy._2.PeriodicActivationProfile;
import technology.ecoa.insertion.policy._2.ProfileType;
import technology.ecoa.insertion.policy._2.ProgrammingLanguage;
import technology.ecoa.insertion.policy._2.QualityType;
import technology.ecoa.insertion.policy._2.RealtimeCharacteristics;
import technology.ecoa.insertion.policy._2.RegisterSize;
import technology.ecoa.insertion.policy._2.SchedulingPolicy;
import technology.ecoa.insertion.policy._2.SchedulingPolicyType;
import technology.ecoa.insertion.policy._2.SizeType;
import technology.ecoa.insertion.policy._2.TimeAccuracy;
import technology.ecoa.insertion.policy._2.TransportProtocol;
import technology.ecoa.insertion.policy._2.TypeType;
import technology.ecoa.insertion.policy._2.TypeType1;
import technology.ecoa.insertion.policy._2.UseType;
import technology.ecoa.insertion.policy._2.polFactory;
import technology.ecoa.insertion.policy._2.polPackage;

import technology.ecoa.insertion.policy._2.util.polValidator;

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
public class polPackageImpl extends EPackageImpl implements polPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aperiodicActivationProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultPINFOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConstraintsEClass = null;

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
	private EClass dynamicMemoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoaProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraConcernsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highestActivationRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionPolicyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageLibrariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleActivationProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleActivationProfilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleCompilationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleMemoryUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePINFOTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulesDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osapiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicActivationProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinfoValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingPolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAccuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportProtocolEClass = null;

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
	private EEnum activationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum profileTypeEEnum = null;

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
	private EEnum qualityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activationTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allocationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deadlineEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deadlineObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genericCompilationOptionsEDataType = null;

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
	private EDataType integrityTypeObjectEDataType = null;

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
	private EDataType nameIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType periodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType periodObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType profileTypeObjectEDataType = null;

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
	private EDataType qualityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativePriorityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schedulingPolicyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeTypeObjectEDataType = null;

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
	private EDataType targetEDataType = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wcetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wcetObjectEDataType = null;

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
	 * @see technology.ecoa.insertion.policy._2.polPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private polPackageImpl() {
		super(eNS_URI, polFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link polPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static polPackage init() {
		if (isInited) return (polPackage)EPackage.Registry.INSTANCE.getEPackage(polPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredpolPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		polPackageImpl thepolPackage = registeredpolPackage instanceof polPackageImpl ? (polPackageImpl)registeredpolPackage : new polPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(depPackage.eNS_URI);
		depPackageImpl thedepPackage = (depPackageImpl)(registeredPackage instanceof depPackageImpl ? registeredPackage : depPackage.eINSTANCE);
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
		thepolPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		themodPackage.createPackageContents();
		theudpPackage.createPackageContents();
		thebinPackage.createPackageContents();
		theEcoaCommon20Package.createPackageContents();
		theviewPackage.createPackageContents();
		thedepPackage.createPackageContents();
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
		thepolPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		themodPackage.initializePackageContents();
		theudpPackage.initializePackageContents();
		thebinPackage.initializePackageContents();
		theEcoaCommon20Package.initializePackageContents();
		theviewPackage.initializePackageContents();
		thedepPackage.initializePackageContents();
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
			(thepolPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return polValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thepolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(polPackage.eNS_URI, thepolPackage);
		return thepolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAperiodicActivationProfile() {
		return aperiodicActivationProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAperiodicActivationProfile_Rate() {
		return (EReference)aperiodicActivationProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAperiodicActivationProfile_Deadline() {
		return (EAttribute)aperiodicActivationProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAperiodicActivationProfile_RelativePriority() {
		return (EAttribute)aperiodicActivationProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAperiodicActivationProfile_Wcet() {
		return (EAttribute)aperiodicActivationProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompiler() {
		return compilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompiler_Name() {
		return (EAttribute)compilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultPINFO() {
		return defaultPINFOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultPINFO_ModulePINFO() {
		return (EReference)defaultPINFOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultProperties() {
		return defaultPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultProperties_Property() {
		return (EReference)defaultPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultPropertyValue() {
		return defaultPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultPropertyValue_Value() {
		return (EAttribute)defaultPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultPropertyValue_Name() {
		return (EAttribute)defaultPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentConstraints() {
		return deploymentConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConstraints_DeploymentExample() {
		return (EAttribute)deploymentConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConstraints_UniqueProtectionDomain() {
		return (EAttribute)deploymentConstraintsEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_InsertionPolicies() {
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
	public EClass getDynamicMemoryType() {
		return dynamicMemoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicMemoryType_Allocation() {
		return (EAttribute)dynamicMemoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicMemoryType_MaxSize() {
		return (EAttribute)dynamicMemoryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECOAProfile() {
		return ecoaProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECOAProfile_Profile() {
		return (EAttribute)ecoaProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraConcerns() {
		return extraConcernsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraConcerns_File() {
		return (EAttribute)extraConcernsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighestActivationRate() {
		return highestActivationRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighestActivationRate_NumberOfActivations() {
		return (EAttribute)highestActivationRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighestActivationRate_TimeFrame() {
		return (EAttribute)highestActivationRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionPolicy() {
		return insertionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionPolicy_Target() {
		return (EAttribute)insertionPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_ProcessorTarget() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_RegisterSize() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_MemoryUsage() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_RealtimeCharacteristics() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_TimeAccuracy() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_TransportProtocol() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_DeploymentConstraints() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_ECOAProfile() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_Compiler() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionPolicy_GenericCompilationOptions() {
		return (EAttribute)insertionPolicyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_ModulesDependencies() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_ExtraConcerns() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_DefaultPINFO() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicy_DefaultProperties() {
		return (EReference)insertionPolicyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionPolicyList() {
		return insertionPolicyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionPolicyList_InsertionPolicy() {
		return (EReference)insertionPolicyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionPolicyList_ComponentImplementation() {
		return (EAttribute)insertionPolicyListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageLibraries() {
		return languageLibrariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageLibraries_Library() {
		return (EReference)languageLibrariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageLibrary() {
		return languageLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageLibrary_Name() {
		return (EAttribute)languageLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageLibrary_Type() {
		return (EAttribute)languageLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageLibrary_Version() {
		return (EAttribute)languageLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryUsage() {
		return memoryUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryUsage_ModuleMemoryUsage() {
		return (EReference)memoryUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleActivationProfile() {
		return moduleActivationProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleActivationProfile_Periodic() {
		return (EReference)moduleActivationProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleActivationProfile_Reactive() {
		return (EReference)moduleActivationProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleActivationProfile_ActivationType() {
		return (EAttribute)moduleActivationProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleActivationProfile_Behaviour() {
		return (EAttribute)moduleActivationProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleActivationProfile_InstanceName() {
		return (EAttribute)moduleActivationProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation() {
		return (EAttribute)moduleActivationProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleActivationProfile_QueueDepth() {
		return (EAttribute)moduleActivationProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleActivationProfiles() {
		return moduleActivationProfilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleActivationProfiles_ActivationProfile() {
		return (EReference)moduleActivationProfilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleCompilationOptions() {
		return moduleCompilationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleCompilationOptions_Value() {
		return (EAttribute)moduleCompilationOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleCompilationOptions_InstanceName() {
		return (EAttribute)moduleCompilationOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDependencies() {
		return moduleDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDependencies_LanguageRuntime() {
		return (EReference)moduleDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDependencies_LanguageLibraries() {
		return (EReference)moduleDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDependencies_DirectOSAccess() {
		return (EReference)moduleDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDependencies_ModuleCompilationOptions() {
		return (EReference)moduleDependenciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleDependencies_InstanceName() {
		return (EAttribute)moduleDependenciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleMemoryUsage() {
		return moduleMemoryUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMemoryUsage_UserContextSize() {
		return (EReference)moduleMemoryUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMemoryUsage_WarmStartContextSize() {
		return (EReference)moduleMemoryUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMemoryUsage_DynamicMemory() {
		return (EReference)moduleMemoryUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMemoryUsage_StackSize() {
		return (EReference)moduleMemoryUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMemoryUsage_HeapSize() {
		return (EReference)moduleMemoryUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMemoryUsage_InstanceName() {
		return (EAttribute)moduleMemoryUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulePINFOType() {
		return modulePINFOTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePINFOType_PublicPINFO() {
		return (EReference)modulePINFOTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePINFOType_PrivatePINFO() {
		return (EReference)modulePINFOTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePINFOType_InstanceName() {
		return (EAttribute)modulePINFOTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulesDependencies() {
		return modulesDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulesDependencies_ModuleDependencies() {
		return (EReference)modulesDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSAPIType() {
		return osapiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSAPIType_Type() {
		return (EAttribute)osapiTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicActivationProfile() {
		return periodicActivationProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivationProfile_Deadline() {
		return (EAttribute)periodicActivationProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivationProfile_Period() {
		return (EAttribute)periodicActivationProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivationProfile_RelativePriority() {
		return (EAttribute)periodicActivationProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivationProfile_Wcet() {
		return (EAttribute)periodicActivationProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPINFOValue() {
		return pinfoValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPINFOValue_Value() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPINFOValue_Name() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeCharacteristics() {
		return realtimeCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeCharacteristics_SchedulingPolicy() {
		return (EReference)realtimeCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeCharacteristics_ModuleActivationProfiles() {
		return (EReference)realtimeCharacteristicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterSize() {
		return registerSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterSize_Size() {
		return (EAttribute)registerSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingPolicyType() {
		return schedulingPolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingPolicyType_Policy() {
		return (EAttribute)schedulingPolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAccuracy() {
		return timeAccuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAccuracy_Value() {
		return (EAttribute)timeAccuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportProtocol() {
		return transportProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportProtocol_Integrity() {
		return (EAttribute)transportProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportProtocol_MaxLatency() {
		return (EAttribute)transportProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportProtocol_MinBandwidth() {
		return (EAttribute)transportProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportProtocol_Quality() {
		return (EAttribute)transportProtocolEClass.getEStructuralFeatures().get(3);
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
	public EEnum getActivationTypeType() {
		return activationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllocationType() {
		return allocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegrityType() {
		return integrityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProfileType() {
		return profileTypeEEnum;
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
	public EEnum getQualityType() {
		return qualityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingPolicy() {
		return schedulingPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeType() {
		return sizeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType1() {
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivationTypeTypeObject() {
		return activationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllocationTypeObject() {
		return allocationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeadline() {
		return deadlineEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeadlineObject() {
		return deadlineObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFileType() {
		return fileTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenericCompilationOptions() {
		return genericCompilationOptionsEDataType;
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
	public EDataType getIntegrityTypeObject() {
		return integrityTypeObjectEDataType;
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
	public EDataType getNameId() {
		return nameIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeriod() {
		return periodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeriodObject() {
		return periodObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProfileTypeObject() {
		return profileTypeObjectEDataType;
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
	public EDataType getQualityTypeObject() {
		return qualityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativePriority() {
		return relativePriorityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSchedulingPolicyObject() {
		return schedulingPolicyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSizeTypeObject() {
		return sizeTypeObjectEDataType;
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
	public EDataType getTarget() {
		return targetEDataType;
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
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject1() {
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWCET() {
		return wcetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWCETObject() {
		return wcetObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polFactory getpolFactory() {
		return (polFactory)getEFactoryInstance();
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
		aperiodicActivationProfileEClass = createEClass(APERIODIC_ACTIVATION_PROFILE);
		createEReference(aperiodicActivationProfileEClass, APERIODIC_ACTIVATION_PROFILE__RATE);
		createEAttribute(aperiodicActivationProfileEClass, APERIODIC_ACTIVATION_PROFILE__DEADLINE);
		createEAttribute(aperiodicActivationProfileEClass, APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY);
		createEAttribute(aperiodicActivationProfileEClass, APERIODIC_ACTIVATION_PROFILE__WCET);

		compilerEClass = createEClass(COMPILER);
		createEAttribute(compilerEClass, COMPILER__NAME);

		defaultPINFOEClass = createEClass(DEFAULT_PINFO);
		createEReference(defaultPINFOEClass, DEFAULT_PINFO__MODULE_PINFO);

		defaultPropertiesEClass = createEClass(DEFAULT_PROPERTIES);
		createEReference(defaultPropertiesEClass, DEFAULT_PROPERTIES__PROPERTY);

		defaultPropertyValueEClass = createEClass(DEFAULT_PROPERTY_VALUE);
		createEAttribute(defaultPropertyValueEClass, DEFAULT_PROPERTY_VALUE__VALUE);
		createEAttribute(defaultPropertyValueEClass, DEFAULT_PROPERTY_VALUE__NAME);

		deploymentConstraintsEClass = createEClass(DEPLOYMENT_CONSTRAINTS);
		createEAttribute(deploymentConstraintsEClass, DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE);
		createEAttribute(deploymentConstraintsEClass, DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INSERTION_POLICIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);

		dynamicMemoryTypeEClass = createEClass(DYNAMIC_MEMORY_TYPE);
		createEAttribute(dynamicMemoryTypeEClass, DYNAMIC_MEMORY_TYPE__ALLOCATION);
		createEAttribute(dynamicMemoryTypeEClass, DYNAMIC_MEMORY_TYPE__MAX_SIZE);

		ecoaProfileEClass = createEClass(ECOA_PROFILE);
		createEAttribute(ecoaProfileEClass, ECOA_PROFILE__PROFILE);

		extraConcernsEClass = createEClass(EXTRA_CONCERNS);
		createEAttribute(extraConcernsEClass, EXTRA_CONCERNS__FILE);

		highestActivationRateEClass = createEClass(HIGHEST_ACTIVATION_RATE);
		createEAttribute(highestActivationRateEClass, HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS);
		createEAttribute(highestActivationRateEClass, HIGHEST_ACTIVATION_RATE__TIME_FRAME);

		insertionPolicyEClass = createEClass(INSERTION_POLICY);
		createEAttribute(insertionPolicyEClass, INSERTION_POLICY__TARGET);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__PROCESSOR_TARGET);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__REGISTER_SIZE);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__MEMORY_USAGE);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__REALTIME_CHARACTERISTICS);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__TIME_ACCURACY);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__TRANSPORT_PROTOCOL);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__ECOA_PROFILE);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__COMPILER);
		createEAttribute(insertionPolicyEClass, INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__MODULES_DEPENDENCIES);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__EXTRA_CONCERNS);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__DEFAULT_PINFO);
		createEReference(insertionPolicyEClass, INSERTION_POLICY__DEFAULT_PROPERTIES);

		insertionPolicyListEClass = createEClass(INSERTION_POLICY_LIST);
		createEReference(insertionPolicyListEClass, INSERTION_POLICY_LIST__INSERTION_POLICY);
		createEAttribute(insertionPolicyListEClass, INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION);

		languageLibrariesEClass = createEClass(LANGUAGE_LIBRARIES);
		createEReference(languageLibrariesEClass, LANGUAGE_LIBRARIES__LIBRARY);

		languageLibraryEClass = createEClass(LANGUAGE_LIBRARY);
		createEAttribute(languageLibraryEClass, LANGUAGE_LIBRARY__NAME);
		createEAttribute(languageLibraryEClass, LANGUAGE_LIBRARY__TYPE);
		createEAttribute(languageLibraryEClass, LANGUAGE_LIBRARY__VERSION);

		memoryUsageEClass = createEClass(MEMORY_USAGE);
		createEReference(memoryUsageEClass, MEMORY_USAGE__MODULE_MEMORY_USAGE);

		moduleActivationProfileEClass = createEClass(MODULE_ACTIVATION_PROFILE);
		createEReference(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__PERIODIC);
		createEReference(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__REACTIVE);
		createEAttribute(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE);
		createEAttribute(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__BEHAVIOUR);
		createEAttribute(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__INSTANCE_NAME);
		createEAttribute(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION);
		createEAttribute(moduleActivationProfileEClass, MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH);

		moduleActivationProfilesEClass = createEClass(MODULE_ACTIVATION_PROFILES);
		createEReference(moduleActivationProfilesEClass, MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE);

		moduleCompilationOptionsEClass = createEClass(MODULE_COMPILATION_OPTIONS);
		createEAttribute(moduleCompilationOptionsEClass, MODULE_COMPILATION_OPTIONS__VALUE);
		createEAttribute(moduleCompilationOptionsEClass, MODULE_COMPILATION_OPTIONS__INSTANCE_NAME);

		moduleDependenciesEClass = createEClass(MODULE_DEPENDENCIES);
		createEReference(moduleDependenciesEClass, MODULE_DEPENDENCIES__LANGUAGE_RUNTIME);
		createEReference(moduleDependenciesEClass, MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES);
		createEReference(moduleDependenciesEClass, MODULE_DEPENDENCIES__DIRECT_OS_ACCESS);
		createEReference(moduleDependenciesEClass, MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS);
		createEAttribute(moduleDependenciesEClass, MODULE_DEPENDENCIES__INSTANCE_NAME);

		moduleMemoryUsageEClass = createEClass(MODULE_MEMORY_USAGE);
		createEReference(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE);
		createEReference(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE);
		createEReference(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__DYNAMIC_MEMORY);
		createEReference(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__STACK_SIZE);
		createEReference(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__HEAP_SIZE);
		createEAttribute(moduleMemoryUsageEClass, MODULE_MEMORY_USAGE__INSTANCE_NAME);

		modulePINFOTypeEClass = createEClass(MODULE_PINFO_TYPE);
		createEReference(modulePINFOTypeEClass, MODULE_PINFO_TYPE__PUBLIC_PINFO);
		createEReference(modulePINFOTypeEClass, MODULE_PINFO_TYPE__PRIVATE_PINFO);
		createEAttribute(modulePINFOTypeEClass, MODULE_PINFO_TYPE__INSTANCE_NAME);

		modulesDependenciesEClass = createEClass(MODULES_DEPENDENCIES);
		createEReference(modulesDependenciesEClass, MODULES_DEPENDENCIES__MODULE_DEPENDENCIES);

		osapiTypeEClass = createEClass(OSAPI_TYPE);
		createEAttribute(osapiTypeEClass, OSAPI_TYPE__TYPE);

		periodicActivationProfileEClass = createEClass(PERIODIC_ACTIVATION_PROFILE);
		createEAttribute(periodicActivationProfileEClass, PERIODIC_ACTIVATION_PROFILE__DEADLINE);
		createEAttribute(periodicActivationProfileEClass, PERIODIC_ACTIVATION_PROFILE__PERIOD);
		createEAttribute(periodicActivationProfileEClass, PERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY);
		createEAttribute(periodicActivationProfileEClass, PERIODIC_ACTIVATION_PROFILE__WCET);

		pinfoValueEClass = createEClass(PINFO_VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__NAME);

		realtimeCharacteristicsEClass = createEClass(REALTIME_CHARACTERISTICS);
		createEReference(realtimeCharacteristicsEClass, REALTIME_CHARACTERISTICS__SCHEDULING_POLICY);
		createEReference(realtimeCharacteristicsEClass, REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES);

		registerSizeEClass = createEClass(REGISTER_SIZE);
		createEAttribute(registerSizeEClass, REGISTER_SIZE__SIZE);

		schedulingPolicyTypeEClass = createEClass(SCHEDULING_POLICY_TYPE);
		createEAttribute(schedulingPolicyTypeEClass, SCHEDULING_POLICY_TYPE__POLICY);

		timeAccuracyEClass = createEClass(TIME_ACCURACY);
		createEAttribute(timeAccuracyEClass, TIME_ACCURACY__VALUE);

		transportProtocolEClass = createEClass(TRANSPORT_PROTOCOL);
		createEAttribute(transportProtocolEClass, TRANSPORT_PROTOCOL__INTEGRITY);
		createEAttribute(transportProtocolEClass, TRANSPORT_PROTOCOL__MAX_LATENCY);
		createEAttribute(transportProtocolEClass, TRANSPORT_PROTOCOL__MIN_BANDWIDTH);
		createEAttribute(transportProtocolEClass, TRANSPORT_PROTOCOL__QUALITY);

		useTypeEClass = createEClass(USE_TYPE);
		createEAttribute(useTypeEClass, USE_TYPE__LIBRARY);

		// Create enums
		activationTypeTypeEEnum = createEEnum(ACTIVATION_TYPE_TYPE);
		allocationTypeEEnum = createEEnum(ALLOCATION_TYPE);
		integrityTypeEEnum = createEEnum(INTEGRITY_TYPE);
		profileTypeEEnum = createEEnum(PROFILE_TYPE);
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);
		qualityTypeEEnum = createEEnum(QUALITY_TYPE);
		schedulingPolicyEEnum = createEEnum(SCHEDULING_POLICY);
		sizeTypeEEnum = createEEnum(SIZE_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);
		typeType1EEnum = createEEnum(TYPE_TYPE1);

		// Create data types
		activationTypeTypeObjectEDataType = createEDataType(ACTIVATION_TYPE_TYPE_OBJECT);
		allocationTypeObjectEDataType = createEDataType(ALLOCATION_TYPE_OBJECT);
		deadlineEDataType = createEDataType(DEADLINE);
		deadlineObjectEDataType = createEDataType(DEADLINE_OBJECT);
		fileTypeEDataType = createEDataType(FILE_TYPE);
		genericCompilationOptionsEDataType = createEDataType(GENERIC_COMPILATION_OPTIONS);
		hexOrDecValueEDataType = createEDataType(HEX_OR_DEC_VALUE);
		integrityTypeObjectEDataType = createEDataType(INTEGRITY_TYPE_OBJECT);
		libraryNameEDataType = createEDataType(LIBRARY_NAME);
		nameIdEDataType = createEDataType(NAME_ID);
		periodEDataType = createEDataType(PERIOD);
		periodObjectEDataType = createEDataType(PERIOD_OBJECT);
		profileTypeObjectEDataType = createEDataType(PROFILE_TYPE_OBJECT);
		programmingLanguageObjectEDataType = createEDataType(PROGRAMMING_LANGUAGE_OBJECT);
		qualityTypeObjectEDataType = createEDataType(QUALITY_TYPE_OBJECT);
		relativePriorityEDataType = createEDataType(RELATIVE_PRIORITY);
		schedulingPolicyObjectEDataType = createEDataType(SCHEDULING_POLICY_OBJECT);
		sizeTypeObjectEDataType = createEDataType(SIZE_TYPE_OBJECT);
		stepsEDataType = createEDataType(STEPS);
		stepsObjectEDataType = createEDataType(STEPS_OBJECT);
		targetEDataType = createEDataType(TARGET);
		timeDurationEDataType = createEDataType(TIME_DURATION);
		timeDurationObjectEDataType = createEDataType(TIME_DURATION_OBJECT);
		typeNameEDataType = createEDataType(TYPE_NAME);
		typeQNameEDataType = createEDataType(TYPE_QNAME);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		typeTypeObject1EDataType = createEDataType(TYPE_TYPE_OBJECT1);
		wcetEDataType = createEDataType(WCET);
		wcetObjectEDataType = createEDataType(WCET_OBJECT);
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
		initEClass(aperiodicActivationProfileEClass, AperiodicActivationProfile.class, "AperiodicActivationProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAperiodicActivationProfile_Rate(), this.getHighestActivationRate(), null, "rate", null, 0, 1, AperiodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAperiodicActivationProfile_Deadline(), this.getDeadline(), "deadline", null, 0, 1, AperiodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAperiodicActivationProfile_RelativePriority(), this.getRelativePriority(), "relativePriority", null, 0, 1, AperiodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAperiodicActivationProfile_Wcet(), this.getWCET(), "wcet", null, 0, 1, AperiodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilerEClass, technology.ecoa.insertion.policy._2.Compiler.class, "Compiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompiler_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, technology.ecoa.insertion.policy._2.Compiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultPINFOEClass, DefaultPINFO.class, "DefaultPINFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultPINFO_ModulePINFO(), this.getModulePINFOType(), null, "modulePINFO", null, 1, -1, DefaultPINFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultPropertiesEClass, DefaultProperties.class, "DefaultProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultProperties_Property(), this.getDefaultPropertyValue(), null, "property", null, 1, -1, DefaultProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultPropertyValueEClass, DefaultPropertyValue.class, "DefaultPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultPropertyValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DefaultPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultPropertyValue_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DefaultPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentConstraintsEClass, DeploymentConstraints.class, "DeploymentConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentConstraints_DeploymentExample(), theXMLTypePackage.getAnyURI(), "deploymentExample", null, 0, 1, DeploymentConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentConstraints_UniqueProtectionDomain(), theXMLTypePackage.getBoolean(), "uniqueProtectionDomain", null, 0, 1, DeploymentConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InsertionPolicies(), this.getInsertionPolicyList(), null, "insertionPolicies", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUseType(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dynamicMemoryTypeEClass, DynamicMemoryType.class, "DynamicMemoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicMemoryType_Allocation(), this.getAllocationType(), "allocation", null, 1, 1, DynamicMemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicMemoryType_MaxSize(), theXMLTypePackage.getNonNegativeInteger(), "maxSize", null, 1, 1, DynamicMemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoaProfileEClass, ECOAProfile.class, "ECOAProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECOAProfile_Profile(), this.getProfileType(), "profile", null, 1, 1, ECOAProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraConcernsEClass, ExtraConcerns.class, "ExtraConcerns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraConcerns_File(), this.getFileType(), "file", null, 0, 1, ExtraConcerns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highestActivationRateEClass, HighestActivationRate.class, "HighestActivationRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighestActivationRate_NumberOfActivations(), theXMLTypePackage.getDecimal(), "numberOfActivations", "1", 0, 1, HighestActivationRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighestActivationRate_TimeFrame(), this.getTimeDuration(), "timeFrame", null, 0, 1, HighestActivationRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertionPolicyEClass, InsertionPolicy.class, "InsertionPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertionPolicy_Target(), this.getTarget(), "target", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_ProcessorTarget(), ecorePackage.getEObject(), null, "processorTarget", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_RegisterSize(), this.getRegisterSize(), null, "registerSize", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_MemoryUsage(), this.getMemoryUsage(), null, "memoryUsage", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_RealtimeCharacteristics(), this.getRealtimeCharacteristics(), null, "realtimeCharacteristics", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_TimeAccuracy(), this.getTimeAccuracy(), null, "timeAccuracy", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_TransportProtocol(), this.getTransportProtocol(), null, "transportProtocol", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_DeploymentConstraints(), this.getDeploymentConstraints(), null, "deploymentConstraints", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_ECOAProfile(), this.getECOAProfile(), null, "eCOAProfile", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_Compiler(), this.getCompiler(), null, "compiler", null, 1, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionPolicy_GenericCompilationOptions(), this.getGenericCompilationOptions(), "genericCompilationOptions", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_ModulesDependencies(), this.getModulesDependencies(), null, "modulesDependencies", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_ExtraConcerns(), this.getExtraConcerns(), null, "extraConcerns", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_DefaultPINFO(), this.getDefaultPINFO(), null, "defaultPINFO", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionPolicy_DefaultProperties(), this.getDefaultProperties(), null, "defaultProperties", null, 0, 1, InsertionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertionPolicyListEClass, InsertionPolicyList.class, "InsertionPolicyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertionPolicyList_InsertionPolicy(), this.getInsertionPolicy(), null, "insertionPolicy", null, 1, -1, InsertionPolicyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionPolicyList_ComponentImplementation(), this.getNameId(), "componentImplementation", null, 1, 1, InsertionPolicyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageLibrariesEClass, LanguageLibraries.class, "LanguageLibraries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageLibraries_Library(), this.getLanguageLibrary(), null, "library", null, 1, -1, LanguageLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageLibraryEClass, LanguageLibrary.class, "LanguageLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageLibrary_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageLibrary_Type(), this.getTypeType1(), "type", null, 0, 1, LanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageLibrary_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, LanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryUsageEClass, MemoryUsage.class, "MemoryUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryUsage_ModuleMemoryUsage(), this.getModuleMemoryUsage(), null, "moduleMemoryUsage", null, 1, -1, MemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleActivationProfileEClass, ModuleActivationProfile.class, "ModuleActivationProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleActivationProfile_Periodic(), this.getPeriodicActivationProfile(), null, "periodic", null, 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleActivationProfile_Reactive(), this.getAperiodicActivationProfile(), null, "reactive", null, 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleActivationProfile_ActivationType(), this.getActivationTypeType(), "activationType", null, 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleActivationProfile_Behaviour(), theXMLTypePackage.getAnyURI(), "behaviour", null, 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleActivationProfile_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation(), theXMLTypePackage.getPositiveInteger(), "maxNbOfProcessedOpsPerActivation", "1", 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleActivationProfile_QueueDepth(), theXMLTypePackage.getPositiveInteger(), "queueDepth", "1", 0, 1, ModuleActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleActivationProfilesEClass, ModuleActivationProfiles.class, "ModuleActivationProfiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleActivationProfiles_ActivationProfile(), this.getModuleActivationProfile(), null, "activationProfile", null, 1, -1, ModuleActivationProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleCompilationOptionsEClass, ModuleCompilationOptions.class, "ModuleCompilationOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleCompilationOptions_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ModuleCompilationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCompilationOptions_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, ModuleCompilationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDependenciesEClass, ModuleDependencies.class, "ModuleDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDependencies_LanguageRuntime(), ecorePackage.getEObject(), null, "languageRuntime", null, 1, 1, ModuleDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleDependencies_LanguageLibraries(), this.getLanguageLibraries(), null, "languageLibraries", null, 0, 1, ModuleDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleDependencies_DirectOSAccess(), this.getOSAPIType(), null, "directOSAccess", null, 0, -1, ModuleDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleDependencies_ModuleCompilationOptions(), this.getModuleCompilationOptions(), null, "moduleCompilationOptions", null, 0, 1, ModuleDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleDependencies_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, ModuleDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleMemoryUsageEClass, ModuleMemoryUsage.class, "ModuleMemoryUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleMemoryUsage_UserContextSize(), ecorePackage.getEObject(), null, "userContextSize", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMemoryUsage_WarmStartContextSize(), ecorePackage.getEObject(), null, "warmStartContextSize", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMemoryUsage_DynamicMemory(), this.getDynamicMemoryType(), null, "dynamicMemory", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMemoryUsage_StackSize(), ecorePackage.getEObject(), null, "stackSize", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMemoryUsage_HeapSize(), ecorePackage.getEObject(), null, "heapSize", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleMemoryUsage_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, ModuleMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulePINFOTypeEClass, ModulePINFOType.class, "ModulePINFOType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulePINFOType_PublicPINFO(), this.getPINFOValue(), null, "publicPINFO", null, 0, -1, ModulePINFOType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulePINFOType_PrivatePINFO(), this.getPINFOValue(), null, "privatePINFO", null, 0, -1, ModulePINFOType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePINFOType_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, ModulePINFOType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulesDependenciesEClass, ModulesDependencies.class, "ModulesDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulesDependencies_ModuleDependencies(), this.getModuleDependencies(), null, "moduleDependencies", null, 1, -1, ModulesDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osapiTypeEClass, OSAPIType.class, "OSAPIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSAPIType_Type(), this.getTypeType(), "type", null, 1, 1, OSAPIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicActivationProfileEClass, PeriodicActivationProfile.class, "PeriodicActivationProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicActivationProfile_Deadline(), this.getDeadline(), "deadline", null, 0, 1, PeriodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivationProfile_Period(), this.getPeriod(), "period", null, 0, 1, PeriodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivationProfile_RelativePriority(), this.getRelativePriority(), "relativePriority", null, 0, 1, PeriodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivationProfile_Wcet(), this.getWCET(), "wcet", null, 0, 1, PeriodicActivationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinfoValueEClass, PINFOValue.class, "PINFOValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPINFOValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PINFOValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPINFOValue_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PINFOValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeCharacteristicsEClass, RealtimeCharacteristics.class, "RealtimeCharacteristics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeCharacteristics_SchedulingPolicy(), this.getSchedulingPolicyType(), null, "schedulingPolicy", null, 1, 1, RealtimeCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeCharacteristics_ModuleActivationProfiles(), this.getModuleActivationProfiles(), null, "moduleActivationProfiles", null, 1, 1, RealtimeCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registerSizeEClass, RegisterSize.class, "RegisterSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisterSize_Size(), this.getSizeType(), "size", null, 1, 1, RegisterSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingPolicyTypeEClass, SchedulingPolicyType.class, "SchedulingPolicyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingPolicyType_Policy(), this.getSchedulingPolicy(), "policy", null, 1, 1, SchedulingPolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeAccuracyEClass, TimeAccuracy.class, "TimeAccuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeAccuracy_Value(), this.getTimeDuration(), "value", null, 0, 1, TimeAccuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportProtocolEClass, TransportProtocol.class, "TransportProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportProtocol_Integrity(), this.getIntegrityType(), "integrity", "high", 0, 1, TransportProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportProtocol_MaxLatency(), this.getTimeDuration(), "maxLatency", null, 0, 1, TransportProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportProtocol_MinBandwidth(), theXMLTypePackage.getNonNegativeInteger(), "minBandwidth", null, 0, 1, TransportProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportProtocol_Quality(), this.getQualityType(), "quality", "lossless", 0, 1, TransportProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useTypeEClass, UseType.class, "UseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseType_Library(), this.getLibraryName(), "library", null, 1, 1, UseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activationTypeTypeEEnum, ActivationTypeType.class, "ActivationTypeType");
		addEEnumLiteral(activationTypeTypeEEnum, ActivationTypeType.REACTIVE);
		addEEnumLiteral(activationTypeTypeEEnum, ActivationTypeType.PERIODIC);
		addEEnumLiteral(activationTypeTypeEEnum, ActivationTypeType.OTHER);

		initEEnum(allocationTypeEEnum, AllocationType.class, "AllocationType");
		addEEnumLiteral(allocationTypeEEnum, AllocationType.YES);
		addEEnumLiteral(allocationTypeEEnum, AllocationType.NO);

		initEEnum(integrityTypeEEnum, IntegrityType.class, "IntegrityType");
		addEEnumLiteral(integrityTypeEEnum, IntegrityType.HIGH);
		addEEnumLiteral(integrityTypeEEnum, IntegrityType.NONE);

		initEEnum(profileTypeEEnum, ProfileType.class, "ProfileType");
		addEEnumLiteral(profileTypeEEnum, ProfileType.CORE);
		addEEnumLiteral(profileTypeEEnum, ProfileType.EXTENDED);
		addEEnumLiteral(profileTypeEEnum, ProfileType.OTHER);

		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C1);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.ADA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.HI_ADA);

		initEEnum(qualityTypeEEnum, QualityType.class, "QualityType");
		addEEnumLiteral(qualityTypeEEnum, QualityType.LOSSLESS);
		addEEnumLiteral(qualityTypeEEnum, QualityType.NONE);

		initEEnum(schedulingPolicyEEnum, SchedulingPolicy.class, "SchedulingPolicy");
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.RTFIFO);
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.ROUNDROBIN);
		addEEnumLiteral(schedulingPolicyEEnum, SchedulingPolicy.ARINC653);

		initEEnum(sizeTypeEEnum, SizeType.class, "SizeType");
		addEEnumLiteral(sizeTypeEEnum, SizeType._16);
		addEEnumLiteral(sizeTypeEEnum, SizeType._32);
		addEEnumLiteral(sizeTypeEEnum, SizeType._64);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.POSIX);
		addEEnumLiteral(typeTypeEEnum, TypeType.ASAAC);
		addEEnumLiteral(typeTypeEEnum, TypeType.A653);
		addEEnumLiteral(typeTypeEEnum, TypeType.FACE);
		addEEnumLiteral(typeTypeEEnum, TypeType.OTHER);

		initEEnum(typeType1EEnum, TypeType1.class, "TypeType1");
		addEEnumLiteral(typeType1EEnum, TypeType1.MATH);
		addEEnumLiteral(typeType1EEnum, TypeType1.GRAPHICS);
		addEEnumLiteral(typeType1EEnum, TypeType1.GEODESIC);
		addEEnumLiteral(typeType1EEnum, TypeType1.OTHER);

		// Initialize data types
		initEDataType(activationTypeTypeObjectEDataType, ActivationTypeType.class, "ActivationTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(allocationTypeObjectEDataType, AllocationType.class, "AllocationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deadlineEDataType, double.class, "Deadline", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deadlineObjectEDataType, Double.class, "DeadlineObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileTypeEDataType, String.class, "FileType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(genericCompilationOptionsEDataType, String.class, "GenericCompilationOptions", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hexOrDecValueEDataType, String.class, "HexOrDecValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integrityTypeObjectEDataType, IntegrityType.class, "IntegrityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(libraryNameEDataType, String.class, "LibraryName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameIdEDataType, String.class, "NameId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(periodEDataType, double.class, "Period", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(periodObjectEDataType, Double.class, "PeriodObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(profileTypeObjectEDataType, ProfileType.class, "ProfileTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(programmingLanguageObjectEDataType, ProgrammingLanguage.class, "ProgrammingLanguageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qualityTypeObjectEDataType, QualityType.class, "QualityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relativePriorityEDataType, BigInteger.class, "RelativePriority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schedulingPolicyObjectEDataType, SchedulingPolicy.class, "SchedulingPolicyObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sizeTypeObjectEDataType, SizeType.class, "SizeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsEDataType, double.class, "Steps", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsObjectEDataType, Double.class, "StepsObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(targetEDataType, String.class, "Target", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationEDataType, double.class, "TimeDuration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationObjectEDataType, Double.class, "TimeDurationObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeNameEDataType, String.class, "TypeName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeQNameEDataType, String.class, "TypeQName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject1EDataType, TypeType1.class, "TypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wcetEDataType, double.class, "WCET", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wcetObjectEDataType, Double.class, "WCETObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (activationTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "activationType_._type"
		   });
		addAnnotation
		  (activationTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "activationType_._type:Object",
			   "baseType", "activationType_._type"
		   });
		addAnnotation
		  (allocationTypeEEnum,
		   source,
		   new String[] {
			   "name", "allocation_._type"
		   });
		addAnnotation
		  (allocationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "allocation_._type:Object",
			   "baseType", "allocation_._type"
		   });
		addAnnotation
		  (aperiodicActivationProfileEClass,
		   source,
		   new String[] {
			   "name", "AperiodicActivationProfile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAperiodicActivationProfile_Rate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAperiodicActivationProfile_Deadline(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "deadline"
		   });
		addAnnotation
		  (getAperiodicActivationProfile_RelativePriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "relativePriority"
		   });
		addAnnotation
		  (getAperiodicActivationProfile_Wcet(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "wcet"
		   });
		addAnnotation
		  (compilerEClass,
		   source,
		   new String[] {
			   "name", "Compiler",
			   "kind", "empty"
		   });
		addAnnotation
		  (getCompiler_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (deadlineEDataType,
		   source,
		   new String[] {
			   "name", "Deadline",
			   "baseType", "Steps"
		   });
		addAnnotation
		  (deadlineObjectEDataType,
		   source,
		   new String[] {
			   "name", "Deadline:Object",
			   "baseType", "Deadline"
		   });
		addAnnotation
		  (defaultPINFOEClass,
		   source,
		   new String[] {
			   "name", "DefaultPINFO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDefaultPINFO_ModulePINFO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modulePINFO",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (defaultPropertiesEClass,
		   source,
		   new String[] {
			   "name", "DefaultProperties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDefaultProperties_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (defaultPropertyValueEClass,
		   source,
		   new String[] {
			   "name", "defaultPropertyValue",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDefaultPropertyValue_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDefaultPropertyValue_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (deploymentConstraintsEClass,
		   source,
		   new String[] {
			   "name", "DeploymentConstraints",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDeploymentConstraints_DeploymentExample(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "deploymentExample"
		   });
		addAnnotation
		  (getDeploymentConstraints_UniqueProtectionDomain(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uniqueProtectionDomain"
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
		  (getDocumentRoot_InsertionPolicies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "insertionPolicies",
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
		  (dynamicMemoryTypeEClass,
		   source,
		   new String[] {
			   "name", "dynamicMemory_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDynamicMemoryType_Allocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "allocation"
		   });
		addAnnotation
		  (getDynamicMemoryType_MaxSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxSize"
		   });
		addAnnotation
		  (ecoaProfileEClass,
		   source,
		   new String[] {
			   "name", "ECOAProfile",
			   "kind", "empty"
		   });
		addAnnotation
		  (getECOAProfile_Profile(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "profile"
		   });
		addAnnotation
		  (extraConcernsEClass,
		   source,
		   new String[] {
			   "name", "ExtraConcerns",
			   "kind", "empty"
		   });
		addAnnotation
		  (getExtraConcerns_File(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "file"
		   });
		addAnnotation
		  (fileTypeEDataType,
		   source,
		   new String[] {
			   "name", "file_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
		addAnnotation
		  (genericCompilationOptionsEDataType,
		   source,
		   new String[] {
			   "name", "GenericCompilationOptions",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
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
		  (highestActivationRateEClass,
		   source,
		   new String[] {
			   "name", "HighestActivationRate",
			   "kind", "empty"
		   });
		addAnnotation
		  (getHighestActivationRate_NumberOfActivations(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "numberOfActivations"
		   });
		addAnnotation
		  (getHighestActivationRate_TimeFrame(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "timeFrame"
		   });
		addAnnotation
		  (insertionPolicyEClass,
		   source,
		   new String[] {
			   "name", "InsertionPolicy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsertionPolicy_Target(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "target",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_ProcessorTarget(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "processorTarget",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_RegisterSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "registerSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_MemoryUsage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "memoryUsage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_RealtimeCharacteristics(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "realtimeCharacteristics",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_TimeAccuracy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timeAccuracy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_TransportProtocol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transportProtocol",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_DeploymentConstraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deploymentConstraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_ECOAProfile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ECOAProfile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_Compiler(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compiler",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_GenericCompilationOptions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "genericCompilationOptions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_ModulesDependencies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modulesDependencies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_ExtraConcerns(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extraConcerns",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_DefaultPINFO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defaultPINFO",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicy_DefaultProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defaultProperties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (insertionPolicyListEClass,
		   source,
		   new String[] {
			   "name", "InsertionPolicyList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsertionPolicyList_InsertionPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "insertionPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsertionPolicyList_ComponentImplementation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "componentImplementation"
		   });
		addAnnotation
		  (integrityTypeEEnum,
		   source,
		   new String[] {
			   "name", "integrity_._type"
		   });
		addAnnotation
		  (integrityTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "integrity_._type:Object",
			   "baseType", "integrity_._type"
		   });
		addAnnotation
		  (languageLibrariesEClass,
		   source,
		   new String[] {
			   "name", "LanguageLibraries",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLanguageLibraries_Library(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "library",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (languageLibraryEClass,
		   source,
		   new String[] {
			   "name", "LanguageLibrary",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLanguageLibrary_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getLanguageLibrary_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getLanguageLibrary_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
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
		  (memoryUsageEClass,
		   source,
		   new String[] {
			   "name", "MemoryUsage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMemoryUsage_ModuleMemoryUsage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleMemoryUsage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (moduleActivationProfileEClass,
		   source,
		   new String[] {
			   "name", "ModuleActivationProfile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleActivationProfile_Periodic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "periodic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleActivationProfile_Reactive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reactive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleActivationProfile_ActivationType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "activationType"
		   });
		addAnnotation
		  (getModuleActivationProfile_Behaviour(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "behaviour"
		   });
		addAnnotation
		  (getModuleActivationProfile_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxNbOfProcessedOpsPerActivation"
		   });
		addAnnotation
		  (getModuleActivationProfile_QueueDepth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "queueDepth"
		   });
		addAnnotation
		  (moduleActivationProfilesEClass,
		   source,
		   new String[] {
			   "name", "ModuleActivationProfiles",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleActivationProfiles_ActivationProfile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activationProfile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (moduleCompilationOptionsEClass,
		   source,
		   new String[] {
			   "name", "ModuleCompilationOptions",
			   "kind", "simple"
		   });
		addAnnotation
		  (getModuleCompilationOptions_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getModuleCompilationOptions_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (moduleDependenciesEClass,
		   source,
		   new String[] {
			   "name", "ModuleDependencies",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleDependencies_LanguageRuntime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "languageRuntime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleDependencies_LanguageLibraries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "languageLibraries",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleDependencies_DirectOSAccess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "directOSAccess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleDependencies_ModuleCompilationOptions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleCompilationOptions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleDependencies_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (moduleMemoryUsageEClass,
		   source,
		   new String[] {
			   "name", "ModuleMemoryUsage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleMemoryUsage_UserContextSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "userContextSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleMemoryUsage_WarmStartContextSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "warmStartContextSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleMemoryUsage_DynamicMemory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dynamicMemory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleMemoryUsage_StackSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stackSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleMemoryUsage_HeapSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "heapSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleMemoryUsage_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (modulePINFOTypeEClass,
		   source,
		   new String[] {
			   "name", "modulePINFO_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModulePINFOType_PublicPINFO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicPINFO",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModulePINFOType_PrivatePINFO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "privatePINFO",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModulePINFOType_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (modulesDependenciesEClass,
		   source,
		   new String[] {
			   "name", "ModulesDependencies",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModulesDependencies_ModuleDependencies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleDependencies",
			   "namespace", "##targetNamespace"
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
		  (osapiTypeEClass,
		   source,
		   new String[] {
			   "name", "OSAPIType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOSAPIType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (periodEDataType,
		   source,
		   new String[] {
			   "name", "Period",
			   "baseType", "Steps"
		   });
		addAnnotation
		  (periodicActivationProfileEClass,
		   source,
		   new String[] {
			   "name", "PeriodicActivationProfile",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPeriodicActivationProfile_Deadline(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "deadline"
		   });
		addAnnotation
		  (getPeriodicActivationProfile_Period(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "period"
		   });
		addAnnotation
		  (getPeriodicActivationProfile_RelativePriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "relativePriority"
		   });
		addAnnotation
		  (getPeriodicActivationProfile_Wcet(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "wcet"
		   });
		addAnnotation
		  (periodObjectEDataType,
		   source,
		   new String[] {
			   "name", "Period:Object",
			   "baseType", "Period"
		   });
		addAnnotation
		  (pinfoValueEClass,
		   source,
		   new String[] {
			   "name", "PINFOValue",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPINFOValue_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPINFOValue_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (profileTypeEEnum,
		   source,
		   new String[] {
			   "name", "profile_._type"
		   });
		addAnnotation
		  (profileTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "profile_._type:Object",
			   "baseType", "profile_._type"
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
		  (qualityTypeEEnum,
		   source,
		   new String[] {
			   "name", "quality_._type"
		   });
		addAnnotation
		  (qualityTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "quality_._type:Object",
			   "baseType", "quality_._type"
		   });
		addAnnotation
		  (realtimeCharacteristicsEClass,
		   source,
		   new String[] {
			   "name", "RealtimeCharacteristics",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealtimeCharacteristics_SchedulingPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "schedulingPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRealtimeCharacteristics_ModuleActivationProfiles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleActivationProfiles",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (registerSizeEClass,
		   source,
		   new String[] {
			   "name", "RegisterSize",
			   "kind", "empty"
		   });
		addAnnotation
		  (getRegisterSize_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size"
		   });
		addAnnotation
		  (relativePriorityEDataType,
		   source,
		   new String[] {
			   "name", "RelativePriority",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });
		addAnnotation
		  (schedulingPolicyEEnum,
		   source,
		   new String[] {
			   "name", "SchedulingPolicy"
		   });
		addAnnotation
		  (schedulingPolicyObjectEDataType,
		   source,
		   new String[] {
			   "name", "SchedulingPolicy:Object",
			   "baseType", "SchedulingPolicy"
		   });
		addAnnotation
		  (schedulingPolicyTypeEClass,
		   source,
		   new String[] {
			   "name", "schedulingPolicy_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSchedulingPolicyType_Policy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "policy"
		   });
		addAnnotation
		  (sizeTypeEEnum,
		   source,
		   new String[] {
			   "name", "size_._type"
		   });
		addAnnotation
		  (sizeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "size_._type:Object",
			   "baseType", "size_._type"
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
		  (targetEDataType,
		   source,
		   new String[] {
			   "name", "Target",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (timeAccuracyEClass,
		   source,
		   new String[] {
			   "name", "TimeAccuracy",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTimeAccuracy_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
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
		  (transportProtocolEClass,
		   source,
		   new String[] {
			   "name", "TransportProtocol",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTransportProtocol_Integrity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "integrity"
		   });
		addAnnotation
		  (getTransportProtocol_MaxLatency(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxLatency"
		   });
		addAnnotation
		  (getTransportProtocol_MinBandwidth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "minBandwidth"
		   });
		addAnnotation
		  (getTransportProtocol_Quality(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "quality"
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
		  (typeTypeEEnum,
		   source,
		   new String[] {
			   "name", "type_._type"
		   });
		addAnnotation
		  (typeType1EEnum,
		   source,
		   new String[] {
			   "name", "type_._1_._type"
		   });
		addAnnotation
		  (typeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "type_._type:Object",
			   "baseType", "type_._type"
		   });
		addAnnotation
		  (typeTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "type_._1_._type:Object",
			   "baseType", "type_._1_._type"
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
		  (wcetEDataType,
		   source,
		   new String[] {
			   "name", "WCET",
			   "baseType", "Steps"
		   });
		addAnnotation
		  (wcetObjectEDataType,
		   source,
		   new String[] {
			   "name", "WCET:Object",
			   "baseType", "WCET"
		   });
	}

} //polPackageImpl
