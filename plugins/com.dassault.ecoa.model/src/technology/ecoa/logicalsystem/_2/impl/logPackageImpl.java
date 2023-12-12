/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import EcoaCommon20.EcoaCommon20Package;

import EcoaCommon20.impl.EcoaCommon20PackageImpl;

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

import technology.ecoa.insertion.policy._2.impl.polPackageImpl;

import technology.ecoa.insertion.policy._2.polPackage;

import technology.ecoa.interface_._2.impl.interPackageImpl;

import technology.ecoa.interface_._2.interPackage;

import technology.ecoa.interface_.qos._2.impl.qosPackageImpl;

import technology.ecoa.interface_.qos._2.qosPackage;

import technology.ecoa.logicalsystem._2.AvailableMemoryType;
import technology.ecoa.logicalsystem._2.DocumentRoot;
import technology.ecoa.logicalsystem._2.EndianessType;
import technology.ecoa.logicalsystem._2.LatencyType;
import technology.ecoa.logicalsystem._2.LatencyType1;
import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.LinkType1;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatform;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.LogicalProcessorsType;
import technology.ecoa.logicalsystem._2.LogicalSystem;
import technology.ecoa.logicalsystem._2.ModuleSwitchTimeType;
import technology.ecoa.logicalsystem._2.NameType;
import technology.ecoa.logicalsystem._2.OsType;
import technology.ecoa.logicalsystem._2.ProgrammingLanguage;
import technology.ecoa.logicalsystem._2.StepDurationType;
import technology.ecoa.logicalsystem._2.ThroughputType;
import technology.ecoa.logicalsystem._2.ThroughputType1;
import technology.ecoa.logicalsystem._2.TransportBindingType;
import technology.ecoa.logicalsystem._2.TypeType;
import technology.ecoa.logicalsystem._2.UseType;
import technology.ecoa.logicalsystem._2.logFactory;
import technology.ecoa.logicalsystem._2.logPackage;

import technology.ecoa.logicalsystem._2.util.logValidator;

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
public class logPackageImpl extends EPackageImpl implements logPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableMemoryTypeEClass = null;

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
	private EClass endianessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingNodeLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComputingNodeTypeEClass = null;

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
	private EClass logicalComputingPlatformLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalProcessorsTypeEClass = null;

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
	private EClass moduleSwitchTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepDurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throughputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throughputType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportBindingTypeEClass = null;

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
	private EEnum nameTypeEEnum = null;

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
	private EEnum typeTypeEEnum = null;

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
	private EDataType nameIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeObjectEDataType = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

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
	 * @see technology.ecoa.logicalsystem._2.logPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private logPackageImpl() {
		super(eNS_URI, logFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link logPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static logPackage init() {
		if (isInited) return (logPackage)EPackage.Registry.INSTANCE.getEPackage(logPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredlogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		logPackageImpl thelogPackage = registeredlogPackage instanceof logPackageImpl ? (logPackageImpl)registeredlogPackage : new logPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(depPackage.eNS_URI);
		depPackageImpl thedepPackage = (depPackageImpl)(registeredPackage instanceof depPackageImpl ? registeredPackage : depPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(impPackage.eNS_URI);
		impPackageImpl theimpPackage = (impPackageImpl)(registeredPackage instanceof impPackageImpl ? registeredPackage : impPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(interPackage.eNS_URI);
		interPackageImpl theinterPackage = (interPackageImpl)(registeredPackage instanceof interPackageImpl ? registeredPackage : interPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(qosPackage.eNS_URI);
		qosPackageImpl theqosPackage = (qosPackageImpl)(registeredPackage instanceof qosPackageImpl ? registeredPackage : qosPackage.eINSTANCE);
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
		thelogPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		thepolPackage.createPackageContents();
		themodPackage.createPackageContents();
		theudpPackage.createPackageContents();
		thebinPackage.createPackageContents();
		theEcoaCommon20Package.createPackageContents();
		theviewPackage.createPackageContents();
		thedepPackage.createPackageContents();
		theimpPackage.createPackageContents();
		theinterPackage.createPackageContents();
		theqosPackage.createPackageContents();
		theprojPackage.createPackageContents();
		thetypPackage.createPackageContents();
		theuidPackage.createPackageContents();
		thescaPackage.createPackageContents();
		thescaExtPackage.createPackageContents();

		// Initialize created meta-data
		thelogPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		thepolPackage.initializePackageContents();
		themodPackage.initializePackageContents();
		theudpPackage.initializePackageContents();
		thebinPackage.initializePackageContents();
		theEcoaCommon20Package.initializePackageContents();
		theviewPackage.initializePackageContents();
		thedepPackage.initializePackageContents();
		theimpPackage.initializePackageContents();
		theinterPackage.initializePackageContents();
		theqosPackage.initializePackageContents();
		theprojPackage.initializePackageContents();
		thetypPackage.initializePackageContents();
		theuidPackage.initializePackageContents();
		thescaPackage.initializePackageContents();
		thescaExtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thelogPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return logValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thelogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(logPackage.eNS_URI, thelogPackage);
		return thelogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableMemoryType() {
		return availableMemoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailableMemoryType_GigaBytes() {
		return (EAttribute)availableMemoryTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_LogicalSystem() {
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
	public EClass getEndianessType() {
		return endianessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndianessType_Type() {
		return (EAttribute)endianessTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyType() {
		return latencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyType_MicroSeconds() {
		return (EAttribute)latencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyType1() {
		return latencyType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyType1_MicroSeconds() {
		return (EAttribute)latencyType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkType_Throughput() {
		return (EReference)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkType_Latency() {
		return (EReference)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkType_TransportBinding() {
		return (EReference)linkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_From() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Id() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_To() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType1() {
		return linkType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkType1_Throughput() {
		return (EReference)linkType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkType1_Latency() {
		return (EReference)linkType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType1_From() {
		return (EAttribute)linkType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType1_Id() {
		return (EAttribute)linkType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType1_To() {
		return (EAttribute)linkType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComputingNodeLinks() {
		return logicalComputingNodeLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeLinks_Link() {
		return (EReference)logicalComputingNodeLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComputingNodeType() {
		return logicalComputingNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeType_Endianess() {
		return (EReference)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeType_LogicalProcessors() {
		return (EReference)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeType_Os() {
		return (EReference)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeType_AvailableMemory() {
		return (EReference)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingNodeType_ModuleSwitchTime() {
		return (EReference)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalComputingNodeType_Id() {
		return (EAttribute)logicalComputingNodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComputingPlatform() {
		return logicalComputingPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingPlatform_LogicalComputingNode() {
		return (EReference)logicalComputingPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingPlatform_LogicalComputingNodeLinks() {
		return (EReference)logicalComputingPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalComputingPlatform_ELIPlatformId() {
		return (EAttribute)logicalComputingPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalComputingPlatform_Id() {
		return (EAttribute)logicalComputingPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComputingPlatformLinks() {
		return logicalComputingPlatformLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalComputingPlatformLinks_Link() {
		return (EReference)logicalComputingPlatformLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalProcessorsType() {
		return logicalProcessorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalProcessorsType_StepDuration() {
		return (EReference)logicalProcessorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalProcessorsType_Number() {
		return (EAttribute)logicalProcessorsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalProcessorsType_Type() {
		return (EAttribute)logicalProcessorsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalSystem() {
		return logicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalSystem_LogicalComputingPlatform() {
		return (EReference)logicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalSystem_LogicalComputingPlatformLinks() {
		return (EReference)logicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalSystem_Id() {
		return (EAttribute)logicalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleSwitchTimeType() {
		return moduleSwitchTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleSwitchTimeType_MicroSeconds() {
		return (EAttribute)moduleSwitchTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsType() {
		return osTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsType_Name() {
		return (EAttribute)osTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsType_Version() {
		return (EAttribute)osTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepDurationType() {
		return stepDurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepDurationType_NanoSeconds() {
		return (EAttribute)stepDurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThroughputType() {
		return throughputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughputType_MegaBytesPerSecond() {
		return (EAttribute)throughputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThroughputType1() {
		return throughputType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughputType1_MegaBytesPerSecond() {
		return (EAttribute)throughputType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportBindingType() {
		return transportBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportBindingType_Parameters() {
		return (EAttribute)transportBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportBindingType_Protocol() {
		return (EAttribute)transportBindingTypeEClass.getEStructuralFeatures().get(1);
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
	public EEnum getNameType() {
		return nameTypeEEnum;
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
	public EEnum getTypeType() {
		return typeTypeEEnum;
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
	public EDataType getNameId() {
		return nameIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameTypeObject() {
		return nameTypeObjectEDataType;
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
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logFactory getlogFactory() {
		return (logFactory)getEFactoryInstance();
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
		availableMemoryTypeEClass = createEClass(AVAILABLE_MEMORY_TYPE);
		createEAttribute(availableMemoryTypeEClass, AVAILABLE_MEMORY_TYPE__GIGA_BYTES);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOGICAL_SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);

		endianessTypeEClass = createEClass(ENDIANESS_TYPE);
		createEAttribute(endianessTypeEClass, ENDIANESS_TYPE__TYPE);

		latencyTypeEClass = createEClass(LATENCY_TYPE);
		createEAttribute(latencyTypeEClass, LATENCY_TYPE__MICRO_SECONDS);

		latencyType1EClass = createEClass(LATENCY_TYPE1);
		createEAttribute(latencyType1EClass, LATENCY_TYPE1__MICRO_SECONDS);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEReference(linkTypeEClass, LINK_TYPE__THROUGHPUT);
		createEReference(linkTypeEClass, LINK_TYPE__LATENCY);
		createEReference(linkTypeEClass, LINK_TYPE__TRANSPORT_BINDING);
		createEAttribute(linkTypeEClass, LINK_TYPE__FROM);
		createEAttribute(linkTypeEClass, LINK_TYPE__ID);
		createEAttribute(linkTypeEClass, LINK_TYPE__TO);

		linkType1EClass = createEClass(LINK_TYPE1);
		createEReference(linkType1EClass, LINK_TYPE1__THROUGHPUT);
		createEReference(linkType1EClass, LINK_TYPE1__LATENCY);
		createEAttribute(linkType1EClass, LINK_TYPE1__FROM);
		createEAttribute(linkType1EClass, LINK_TYPE1__ID);
		createEAttribute(linkType1EClass, LINK_TYPE1__TO);

		logicalComputingNodeLinksEClass = createEClass(LOGICAL_COMPUTING_NODE_LINKS);
		createEReference(logicalComputingNodeLinksEClass, LOGICAL_COMPUTING_NODE_LINKS__LINK);

		logicalComputingNodeTypeEClass = createEClass(LOGICAL_COMPUTING_NODE_TYPE);
		createEReference(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS);
		createEReference(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS);
		createEReference(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__OS);
		createEReference(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY);
		createEReference(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME);
		createEAttribute(logicalComputingNodeTypeEClass, LOGICAL_COMPUTING_NODE_TYPE__ID);

		logicalComputingPlatformEClass = createEClass(LOGICAL_COMPUTING_PLATFORM);
		createEReference(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE);
		createEReference(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS);
		createEAttribute(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID);
		createEAttribute(logicalComputingPlatformEClass, LOGICAL_COMPUTING_PLATFORM__ID);

		logicalComputingPlatformLinksEClass = createEClass(LOGICAL_COMPUTING_PLATFORM_LINKS);
		createEReference(logicalComputingPlatformLinksEClass, LOGICAL_COMPUTING_PLATFORM_LINKS__LINK);

		logicalProcessorsTypeEClass = createEClass(LOGICAL_PROCESSORS_TYPE);
		createEReference(logicalProcessorsTypeEClass, LOGICAL_PROCESSORS_TYPE__STEP_DURATION);
		createEAttribute(logicalProcessorsTypeEClass, LOGICAL_PROCESSORS_TYPE__NUMBER);
		createEAttribute(logicalProcessorsTypeEClass, LOGICAL_PROCESSORS_TYPE__TYPE);

		logicalSystemEClass = createEClass(LOGICAL_SYSTEM);
		createEReference(logicalSystemEClass, LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM);
		createEReference(logicalSystemEClass, LOGICAL_SYSTEM__LOGICAL_COMPUTING_PLATFORM_LINKS);
		createEAttribute(logicalSystemEClass, LOGICAL_SYSTEM__ID);

		moduleSwitchTimeTypeEClass = createEClass(MODULE_SWITCH_TIME_TYPE);
		createEAttribute(moduleSwitchTimeTypeEClass, MODULE_SWITCH_TIME_TYPE__MICRO_SECONDS);

		osTypeEClass = createEClass(OS_TYPE);
		createEAttribute(osTypeEClass, OS_TYPE__NAME);
		createEAttribute(osTypeEClass, OS_TYPE__VERSION);

		stepDurationTypeEClass = createEClass(STEP_DURATION_TYPE);
		createEAttribute(stepDurationTypeEClass, STEP_DURATION_TYPE__NANO_SECONDS);

		throughputTypeEClass = createEClass(THROUGHPUT_TYPE);
		createEAttribute(throughputTypeEClass, THROUGHPUT_TYPE__MEGA_BYTES_PER_SECOND);

		throughputType1EClass = createEClass(THROUGHPUT_TYPE1);
		createEAttribute(throughputType1EClass, THROUGHPUT_TYPE1__MEGA_BYTES_PER_SECOND);

		transportBindingTypeEClass = createEClass(TRANSPORT_BINDING_TYPE);
		createEAttribute(transportBindingTypeEClass, TRANSPORT_BINDING_TYPE__PARAMETERS);
		createEAttribute(transportBindingTypeEClass, TRANSPORT_BINDING_TYPE__PROTOCOL);

		useTypeEClass = createEClass(USE_TYPE);
		createEAttribute(useTypeEClass, USE_TYPE__LIBRARY);

		// Create enums
		nameTypeEEnum = createEEnum(NAME_TYPE);
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);

		// Create data types
		hexOrDecValueEDataType = createEDataType(HEX_OR_DEC_VALUE);
		libraryNameEDataType = createEDataType(LIBRARY_NAME);
		nameIdEDataType = createEDataType(NAME_ID);
		nameTypeObjectEDataType = createEDataType(NAME_TYPE_OBJECT);
		programmingLanguageObjectEDataType = createEDataType(PROGRAMMING_LANGUAGE_OBJECT);
		stepsEDataType = createEDataType(STEPS);
		stepsObjectEDataType = createEDataType(STEPS_OBJECT);
		timeDurationEDataType = createEDataType(TIME_DURATION);
		timeDurationObjectEDataType = createEDataType(TIME_DURATION_OBJECT);
		typeNameEDataType = createEDataType(TYPE_NAME);
		typeQNameEDataType = createEDataType(TYPE_QNAME);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
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
		initEClass(availableMemoryTypeEClass, AvailableMemoryType.class, "AvailableMemoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvailableMemoryType_GigaBytes(), theXMLTypePackage.getInteger(), "gigaBytes", null, 1, 1, AvailableMemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LogicalSystem(), this.getLogicalSystem(), null, "logicalSystem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUseType(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endianessTypeEClass, EndianessType.class, "EndianessType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndianessType_Type(), this.getTypeType(), "type", null, 1, 1, EndianessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyTypeEClass, LatencyType.class, "LatencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatencyType_MicroSeconds(), theXMLTypePackage.getInteger(), "microSeconds", null, 1, 1, LatencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyType1EClass, LatencyType1.class, "LatencyType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatencyType1_MicroSeconds(), theXMLTypePackage.getInteger(), "microSeconds", null, 1, 1, LatencyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkType_Throughput(), this.getThroughputType(), null, "throughput", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkType_Latency(), this.getLatencyType(), null, "latency", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkType_TransportBinding(), this.getTransportBindingType(), null, "transportBinding", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_From(), theXMLTypePackage.getString(), "from", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Id(), this.getNameId(), "id", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_To(), theXMLTypePackage.getString(), "to", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkType1EClass, LinkType1.class, "LinkType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkType1_Throughput(), this.getThroughputType1(), null, "throughput", null, 0, 1, LinkType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkType1_Latency(), this.getLatencyType1(), null, "latency", null, 0, 1, LinkType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType1_From(), theXMLTypePackage.getString(), "from", null, 1, 1, LinkType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType1_Id(), this.getNameId(), "id", null, 0, 1, LinkType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType1_To(), theXMLTypePackage.getString(), "to", null, 1, 1, LinkType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingNodeLinksEClass, LogicalComputingNodeLinks.class, "LogicalComputingNodeLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingNodeLinks_Link(), this.getLinkType1(), null, "link", null, 1, -1, LogicalComputingNodeLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingNodeTypeEClass, LogicalComputingNodeType.class, "LogicalComputingNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingNodeType_Endianess(), this.getEndianessType(), null, "endianess", null, 1, 1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeType_LogicalProcessors(), this.getLogicalProcessorsType(), null, "logicalProcessors", null, 1, -1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeType_Os(), this.getOsType(), null, "os", null, 1, 1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeType_AvailableMemory(), this.getAvailableMemoryType(), null, "availableMemory", null, 1, 1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingNodeType_ModuleSwitchTime(), this.getModuleSwitchTimeType(), null, "moduleSwitchTime", null, 1, 1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingNodeType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, LogicalComputingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingPlatformEClass, LogicalComputingPlatform.class, "LogicalComputingPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingPlatform_LogicalComputingNode(), this.getLogicalComputingNodeType(), null, "logicalComputingNode", null, 0, -1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalComputingPlatform_LogicalComputingNodeLinks(), this.getLogicalComputingNodeLinks(), null, "logicalComputingNodeLinks", null, 0, -1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatform_ELIPlatformId(), theXMLTypePackage.getUnsignedInt(), "eLIPlatformId", null, 0, 1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalComputingPlatform_Id(), this.getNameId(), "id", null, 1, 1, LogicalComputingPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComputingPlatformLinksEClass, LogicalComputingPlatformLinks.class, "LogicalComputingPlatformLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalComputingPlatformLinks_Link(), this.getLinkType(), null, "link", null, 1, -1, LogicalComputingPlatformLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalProcessorsTypeEClass, LogicalProcessorsType.class, "LogicalProcessorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalProcessorsType_StepDuration(), this.getStepDurationType(), null, "stepDuration", null, 1, 1, LogicalProcessorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalProcessorsType_Number(), theXMLTypePackage.getInteger(), "number", null, 1, 1, LogicalProcessorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalProcessorsType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, LogicalProcessorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalSystemEClass, LogicalSystem.class, "LogicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalSystem_LogicalComputingPlatform(), this.getLogicalComputingPlatform(), null, "logicalComputingPlatform", null, 1, -1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalSystem_LogicalComputingPlatformLinks(), this.getLogicalComputingPlatformLinks(), null, "logicalComputingPlatformLinks", null, 0, -1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalSystem_Id(), this.getNameId(), "id", null, 1, 1, LogicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleSwitchTimeTypeEClass, ModuleSwitchTimeType.class, "ModuleSwitchTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleSwitchTimeType_MicroSeconds(), theXMLTypePackage.getInteger(), "microSeconds", null, 1, 1, ModuleSwitchTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osTypeEClass, OsType.class, "OsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsType_Name(), this.getNameType(), "name", null, 1, 1, OsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, OsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepDurationTypeEClass, StepDurationType.class, "StepDurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepDurationType_NanoSeconds(), theXMLTypePackage.getInteger(), "nanoSeconds", null, 1, 1, StepDurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throughputTypeEClass, ThroughputType.class, "ThroughputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThroughputType_MegaBytesPerSecond(), theXMLTypePackage.getInteger(), "megaBytesPerSecond", null, 1, 1, ThroughputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throughputType1EClass, ThroughputType1.class, "ThroughputType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThroughputType1_MegaBytesPerSecond(), theXMLTypePackage.getInteger(), "megaBytesPerSecond", null, 1, 1, ThroughputType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportBindingTypeEClass, TransportBindingType.class, "TransportBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportBindingType_Parameters(), theXMLTypePackage.getAnyURI(), "parameters", null, 1, 1, TransportBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportBindingType_Protocol(), theXMLTypePackage.getString(), "protocol", null, 1, 1, TransportBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useTypeEClass, UseType.class, "UseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseType_Library(), this.getLibraryName(), "library", null, 1, 1, UseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nameTypeEEnum, NameType.class, "NameType");
		addEEnumLiteral(nameTypeEEnum, NameType.FASTOS);
		addEEnumLiteral(nameTypeEEnum, NameType.LINUX);
		addEEnumLiteral(nameTypeEEnum, NameType.IMA_INTEGRITY);
		addEEnumLiteral(nameTypeEEnum, NameType.IMS_VXWORKS);
		addEEnumLiteral(nameTypeEEnum, NameType.INTEGRITY);
		addEEnumLiteral(nameTypeEEnum, NameType.PIKEOS);
		addEEnumLiteral(nameTypeEEnum, NameType.RTEMS);
		addEEnumLiteral(nameTypeEEnum, NameType.VXWORKS);
		addEEnumLiteral(nameTypeEEnum, NameType.VXWORKS_ARINC653);
		addEEnumLiteral(nameTypeEEnum, NameType.VXWORKS_CERT);
		addEEnumLiteral(nameTypeEEnum, NameType.WINDOWS);
		addEEnumLiteral(nameTypeEEnum, NameType.ZEPHYR);

		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C1);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.ADA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.HI_ADA);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.BIG);
		addEEnumLiteral(typeTypeEEnum, TypeType.LITTLE);

		// Initialize data types
		initEDataType(hexOrDecValueEDataType, String.class, "HexOrDecValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(libraryNameEDataType, String.class, "LibraryName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameIdEDataType, String.class, "NameId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameTypeObjectEDataType, NameType.class, "NameTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(programmingLanguageObjectEDataType, ProgrammingLanguage.class, "ProgrammingLanguageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsEDataType, double.class, "Steps", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepsObjectEDataType, Double.class, "StepsObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationEDataType, double.class, "TimeDuration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeDurationObjectEDataType, Double.class, "TimeDurationObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeNameEDataType, String.class, "TypeName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeQNameEDataType, String.class, "TypeQName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (availableMemoryTypeEClass,
		   source,
		   new String[] {
			   "name", "availableMemory_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAvailableMemoryType_GigaBytes(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "gigaBytes"
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
		  (getDocumentRoot_LogicalSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalSystem",
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
		  (endianessTypeEClass,
		   source,
		   new String[] {
			   "name", "endianess_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getEndianessType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
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
		  (latencyTypeEClass,
		   source,
		   new String[] {
			   "name", "latency_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLatencyType_MicroSeconds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "microSeconds"
		   });
		addAnnotation
		  (latencyType1EClass,
		   source,
		   new String[] {
			   "name", "latency_._1_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLatencyType1_MicroSeconds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "microSeconds"
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
		  (linkTypeEClass,
		   source,
		   new String[] {
			   "name", "link_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinkType_Throughput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "throughput"
		   });
		addAnnotation
		  (getLinkType_Latency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "latency"
		   });
		addAnnotation
		  (getLinkType_TransportBinding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transportBinding"
		   });
		addAnnotation
		  (getLinkType_From(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "from"
		   });
		addAnnotation
		  (getLinkType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLinkType_To(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "to"
		   });
		addAnnotation
		  (linkType1EClass,
		   source,
		   new String[] {
			   "name", "link_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinkType1_Throughput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "throughput"
		   });
		addAnnotation
		  (getLinkType1_Latency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "latency"
		   });
		addAnnotation
		  (getLinkType1_From(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "from"
		   });
		addAnnotation
		  (getLinkType1_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLinkType1_To(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "to"
		   });
		addAnnotation
		  (logicalComputingNodeLinksEClass,
		   source,
		   new String[] {
			   "name", "LogicalComputingNodeLinks",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalComputingNodeLinks_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link"
		   });
		addAnnotation
		  (logicalComputingNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "logicalComputingNode_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_Endianess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endianess"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_LogicalProcessors(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalProcessors"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_Os(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "os"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_AvailableMemory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "availableMemory"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_ModuleSwitchTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleSwitchTime"
		   });
		addAnnotation
		  (getLogicalComputingNodeType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (logicalComputingPlatformEClass,
		   source,
		   new String[] {
			   "name", "LogicalComputingPlatform",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalComputingPlatform_LogicalComputingNode(),
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
		  (logicalComputingPlatformLinksEClass,
		   source,
		   new String[] {
			   "name", "LogicalComputingPlatformLinks",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalComputingPlatformLinks_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link"
		   });
		addAnnotation
		  (logicalProcessorsTypeEClass,
		   source,
		   new String[] {
			   "name", "logicalProcessors_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalProcessorsType_StepDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stepDuration"
		   });
		addAnnotation
		  (getLogicalProcessorsType_Number(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "number"
		   });
		addAnnotation
		  (getLogicalProcessorsType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (logicalSystemEClass,
		   source,
		   new String[] {
			   "name", "LogicalSystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalSystem_LogicalComputingPlatform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalComputingPlatform"
		   });
		addAnnotation
		  (getLogicalSystem_LogicalComputingPlatformLinks(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalComputingPlatformLinks"
		   });
		addAnnotation
		  (getLogicalSystem_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (moduleSwitchTimeTypeEClass,
		   source,
		   new String[] {
			   "name", "moduleSwitchTime_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getModuleSwitchTimeType_MicroSeconds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "microSeconds"
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
		  (nameTypeEEnum,
		   source,
		   new String[] {
			   "name", "name_._type"
		   });
		addAnnotation
		  (nameTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "name_._type:Object",
			   "baseType", "name_._type"
		   });
		addAnnotation
		  (osTypeEClass,
		   source,
		   new String[] {
			   "name", "os_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOsType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getOsType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
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
		  (stepDurationTypeEClass,
		   source,
		   new String[] {
			   "name", "stepDuration_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getStepDurationType_NanoSeconds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nanoSeconds"
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
		  (throughputTypeEClass,
		   source,
		   new String[] {
			   "name", "throughput_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getThroughputType_MegaBytesPerSecond(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "megaBytesPerSecond"
		   });
		addAnnotation
		  (throughputType1EClass,
		   source,
		   new String[] {
			   "name", "throughput_._1_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getThroughputType1_MegaBytesPerSecond(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "megaBytesPerSecond"
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
		  (transportBindingTypeEClass,
		   source,
		   new String[] {
			   "name", "transportBinding_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTransportBindingType_Parameters(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parameters"
		   });
		addAnnotation
		  (getTransportBindingType_Protocol(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "protocol"
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
		  (typeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "type_._type:Object",
			   "baseType", "type_._type"
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
	}

} //logPackageImpl
