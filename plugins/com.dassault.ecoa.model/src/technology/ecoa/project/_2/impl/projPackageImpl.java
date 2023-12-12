/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2.impl;

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

import technology.ecoa.logicalsystem._2.impl.logPackageImpl;

import technology.ecoa.logicalsystem._2.logPackage;

import technology.ecoa.module.behaviour._2.impl.modPackageImpl;

import technology.ecoa.module.behaviour._2.modPackage;

import technology.ecoa.project._2.DocumentRoot;
import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;
import technology.ecoa.project._2.ProgrammingLanguage;
import technology.ecoa.project._2.UseType;
import technology.ecoa.project._2.projFactory;
import technology.ecoa.project._2.projPackage;

import technology.ecoa.project._2.util.projValidator;

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
public class projPackageImpl extends EPackageImpl implements projPackage {
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
	private EClass ecoaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elieuiDsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesEClass = null;

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
	private EEnum programmingLanguageEEnum = null;

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
	 * @see technology.ecoa.project._2.projPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private projPackageImpl() {
		super(eNS_URI, projFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link projPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static projPackage init() {
		if (isInited) return (projPackage)EPackage.Registry.INSTANCE.getEPackage(projPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredprojPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		projPackageImpl theprojPackage = registeredprojPackage instanceof projPackageImpl ? (projPackageImpl)registeredprojPackage : new projPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(logPackage.eNS_URI);
		logPackageImpl thelogPackage = (logPackageImpl)(registeredPackage instanceof logPackageImpl ? registeredPackage : logPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(typPackage.eNS_URI);
		typPackageImpl thetypPackage = (typPackageImpl)(registeredPackage instanceof typPackageImpl ? registeredPackage : typPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(uidPackage.eNS_URI);
		uidPackageImpl theuidPackage = (uidPackageImpl)(registeredPackage instanceof uidPackageImpl ? registeredPackage : uidPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scaPackage.eNS_URI);
		scaPackageImpl thescaPackage = (scaPackageImpl)(registeredPackage instanceof scaPackageImpl ? registeredPackage : scaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scaExtPackage.eNS_URI);
		scaExtPackageImpl thescaExtPackage = (scaExtPackageImpl)(registeredPackage instanceof scaExtPackageImpl ? registeredPackage : scaExtPackage.eINSTANCE);

		// Create package meta-data objects
		theprojPackage.createPackageContents();
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
		thelogPackage.createPackageContents();
		thetypPackage.createPackageContents();
		theuidPackage.createPackageContents();
		thescaPackage.createPackageContents();
		thescaExtPackage.createPackageContents();

		// Initialize created meta-data
		theprojPackage.initializePackageContents();
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
		thelogPackage.initializePackageContents();
		thetypPackage.initializePackageContents();
		theuidPackage.initializePackageContents();
		thescaPackage.initializePackageContents();
		thescaExtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theprojPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return projValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theprojPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(projPackage.eNS_URI, theprojPackage);
		return theprojPackage;
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
	public EReference getDocumentRoot_ECOAProject() {
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
	public EClass getEcoaProject() {
		return ecoaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_Group() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoaProject_ServiceDefinitions() {
		return (EReference)ecoaProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoaProject_ComponentDefinitions() {
		return (EReference)ecoaProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoaProject_Types() {
		return (EReference)ecoaProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_InitialAssembly() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoaProject_ComponentImplementations() {
		return (EReference)ecoaProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_LogicalSystem() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_CrossPlatformsView() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_DeploymentSchema() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_OutputDirectory() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_ImplementationAssembly() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoaProject_EUIDs() {
		return (EReference)ecoaProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoaProject_Name() {
		return (EAttribute)ecoaProjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELIEUIDs() {
		return elieuiDsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELIEUIDs_EUID() {
		return (EAttribute)elieuiDsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiles_File() {
		return (EAttribute)filesEClass.getEStructuralFeatures().get(0);
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
	public EEnum getProgrammingLanguage() {
		return programmingLanguageEEnum;
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
	public projFactory getprojFactory() {
		return (projFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ECOA_PROJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);

		ecoaProjectEClass = createEClass(ECOA_PROJECT);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__GROUP);
		createEReference(ecoaProjectEClass, ECOA_PROJECT__SERVICE_DEFINITIONS);
		createEReference(ecoaProjectEClass, ECOA_PROJECT__COMPONENT_DEFINITIONS);
		createEReference(ecoaProjectEClass, ECOA_PROJECT__TYPES);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__INITIAL_ASSEMBLY);
		createEReference(ecoaProjectEClass, ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__LOGICAL_SYSTEM);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__CROSS_PLATFORMS_VIEW);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__DEPLOYMENT_SCHEMA);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__OUTPUT_DIRECTORY);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY);
		createEReference(ecoaProjectEClass, ECOA_PROJECT__EUI_DS);
		createEAttribute(ecoaProjectEClass, ECOA_PROJECT__NAME);

		elieuiDsEClass = createEClass(ELIEUI_DS);
		createEAttribute(elieuiDsEClass, ELIEUI_DS__EUID);

		filesEClass = createEClass(FILES);
		createEAttribute(filesEClass, FILES__FILE);

		useTypeEClass = createEClass(USE_TYPE);
		createEAttribute(useTypeEClass, USE_TYPE__LIBRARY);

		// Create enums
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);

		// Create data types
		hexOrDecValueEDataType = createEDataType(HEX_OR_DEC_VALUE);
		libraryNameEDataType = createEDataType(LIBRARY_NAME);
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
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ECOAProject(), this.getEcoaProject(), null, "eCOAProject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUseType(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ecoaProjectEClass, EcoaProject.class, "EcoaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcoaProject_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EcoaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoaProject_ServiceDefinitions(), this.getFiles(), null, "serviceDefinitions", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEcoaProject_ComponentDefinitions(), this.getFiles(), null, "componentDefinitions", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEcoaProject_Types(), this.getFiles(), null, "types", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_InitialAssembly(), theXMLTypePackage.getAnyURI(), "initialAssembly", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEcoaProject_ComponentImplementations(), this.getFiles(), null, "componentImplementations", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_LogicalSystem(), theXMLTypePackage.getAnyURI(), "logicalSystem", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_CrossPlatformsView(), theXMLTypePackage.getAnyURI(), "crossPlatformsView", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_DeploymentSchema(), theXMLTypePackage.getAnyURI(), "deploymentSchema", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_OutputDirectory(), theXMLTypePackage.getAnyURI(), "outputDirectory", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_ImplementationAssembly(), theXMLTypePackage.getAnyURI(), "implementationAssembly", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEcoaProject_EUIDs(), this.getELIEUIDs(), null, "eUIDs", null, 0, -1, EcoaProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoaProject_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EcoaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elieuiDsEClass, ELIEUIDs.class, "ELIEUIDs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELIEUIDs_EUID(), theXMLTypePackage.getAnyURI(), "eUID", null, 1, -1, ELIEUIDs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filesEClass, Files.class, "Files", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiles_File(), theXMLTypePackage.getAnyURI(), "file", null, 1, -1, Files.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useTypeEClass, UseType.class, "UseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseType_Library(), this.getLibraryName(), "library", null, 1, 1, UseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C1);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.ADA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.HI_ADA);

		// Initialize data types
		initEDataType(hexOrDecValueEDataType, String.class, "HexOrDecValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(libraryNameEDataType, String.class, "LibraryName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (getDocumentRoot_ECOAProject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ECOAProject",
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
		  (ecoaProjectEClass,
		   source,
		   new String[] {
			   "name", "ECOAProject",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEcoaProject_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getEcoaProject_ServiceDefinitions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "serviceDefinitions",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_ComponentDefinitions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentDefinitions",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_Types(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "types",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_InitialAssembly(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "initialAssembly",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_ComponentImplementations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentImplementations",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_LogicalSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "logicalSystem",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_CrossPlatformsView(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "crossPlatformsView",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_DeploymentSchema(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deploymentSchema",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_OutputDirectory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputDirectory",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_ImplementationAssembly(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implementationAssembly",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_EUIDs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EUIDs",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getEcoaProject_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (elieuiDsEClass,
		   source,
		   new String[] {
			   "name", "ELI_EUIDs",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getELIEUIDs_EUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (filesEClass,
		   source,
		   new String[] {
			   "name", "Files",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFiles_File(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "file",
			   "namespace", "##targetNamespace"
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
		  (nameIdEDataType,
		   source,
		   new String[] {
			   "name", "NameId",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[A-Za-z][A-Za-z0-9_]*"
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
	}

} //projPackageImpl
