/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp.impl;

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
import temp.CrossPlatformView;
import temp.InsertionPolicies;
import temp.ModuleBehaviour;
import temp.TempFactory;
import temp.TempPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TempPackageImpl extends EPackageImpl implements TempPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionPoliciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossPlatformViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass euidEClass = null;

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
	 * @see temp.TempPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TempPackageImpl() {
		super(eNS_URI, TempFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TempPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TempPackage init() {
		if (isInited) return (TempPackage)EPackage.Registry.INSTANCE.getEPackage(TempPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTempPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TempPackageImpl theTempPackage = registeredTempPackage instanceof TempPackageImpl ? (TempPackageImpl)registeredTempPackage : new TempPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtqosPackage.eNS_URI);
		EdtqosPackageImpl theEdtqosPackage = (EdtqosPackageImpl)(registeredPackage instanceof EdtqosPackageImpl ? registeredPackage : EdtqosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTInterfacePackage.eNS_URI);
		EDTInterfacePackageImpl theEDTInterfacePackage = (EDTInterfacePackageImpl)(registeredPackage instanceof EDTInterfacePackageImpl ? registeredPackage : EDTInterfacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EDTTypePackage.eNS_URI);
		EDTTypePackageImpl theEDTTypePackage = (EDTTypePackageImpl)(registeredPackage instanceof EDTTypePackageImpl ? registeredPackage : EDTTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtudpPackage.eNS_URI);
		EdtudpPackageImpl theEdtudpPackage = (EdtudpPackageImpl)(registeredPackage instanceof EdtudpPackageImpl ? registeredPackage : EdtudpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtuidPackage.eNS_URI);
		EdtuidPackageImpl theEdtuidPackage = (EdtuidPackageImpl)(registeredPackage instanceof EdtuidPackageImpl ? registeredPackage : EdtuidPackage.eINSTANCE);

		// Create package meta-data objects
		theTempPackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtdeploymentPackage.createPackageContents();
		theEdtimplementationPackage.createPackageContents();
		theEdtlogicalPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEdtqosPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theEDTTypePackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theTempPackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtdeploymentPackage.initializePackageContents();
		theEdtimplementationPackage.initializePackageContents();
		theEdtlogicalPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEdtqosPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theEDTTypePackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTempPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TempPackage.eNS_URI, theTempPackage);
		return theTempPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleBehaviour() {
		return moduleBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleBehaviour_Name() {
		return (EAttribute)moduleBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleBehaviour_ModuleBehaviour() {
		return (EReference)moduleBehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertionPolicies() {
		return insertionPoliciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertionPolicies_Name() {
		return (EAttribute)insertionPoliciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossPlatformView() {
		return crossPlatformViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossPlatformView_ECOACrossPlatformView() {
		return (EReference)crossPlatformViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossPlatformView_Name() {
		return (EAttribute)crossPlatformViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEUID() {
		return euidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEUID_UID() {
		return (EReference)euidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEUID_Name() {
		return (EAttribute)euidEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertionPolicies_InsertionPolicy() {
		return (EReference)insertionPoliciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TempFactory getTempFactory() {
		return (TempFactory)getEFactoryInstance();
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
		moduleBehaviourEClass = createEClass(MODULE_BEHAVIOUR);
		createEAttribute(moduleBehaviourEClass, MODULE_BEHAVIOUR__NAME);
		createEReference(moduleBehaviourEClass, MODULE_BEHAVIOUR__MODULE_BEHAVIOUR);

		insertionPoliciesEClass = createEClass(INSERTION_POLICIES);
		createEReference(insertionPoliciesEClass, INSERTION_POLICIES__INSERTION_POLICY);
		createEAttribute(insertionPoliciesEClass, INSERTION_POLICIES__NAME);

		crossPlatformViewEClass = createEClass(CROSS_PLATFORM_VIEW);
		createEReference(crossPlatformViewEClass, CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW);
		createEAttribute(crossPlatformViewEClass, CROSS_PLATFORM_VIEW__NAME);

		euidEClass = createEClass(EUID);
		createEReference(euidEClass, EUID__UID);
		createEAttribute(euidEClass, EUID__NAME);
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
		modPackage themodPackage = (modPackage)EPackage.Registry.INSTANCE.getEPackage(modPackage.eNS_URI);
		polPackage thepolPackage = (polPackage)EPackage.Registry.INSTANCE.getEPackage(polPackage.eNS_URI);
		viewPackage theviewPackage = (viewPackage)EPackage.Registry.INSTANCE.getEPackage(viewPackage.eNS_URI);
		uidPackage theuidPackage = (uidPackage)EPackage.Registry.INSTANCE.getEPackage(uidPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleBehaviourEClass, ModuleBehaviour.class, "ModuleBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleBehaviour_Name(), theXMLTypePackage.getName_(), "Name", null, 1, 1, ModuleBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleBehaviour_ModuleBehaviour(), themodPackage.getModuleBehaviour(), null, "ModuleBehaviour", null, 1, 1, ModuleBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertionPoliciesEClass, InsertionPolicies.class, "InsertionPolicies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertionPolicies_InsertionPolicy(), thepolPackage.getInsertionPolicyList(), null, "InsertionPolicy", null, 1, 1, InsertionPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionPolicies_Name(), theXMLTypePackage.getName_(), "Name", null, 1, 1, InsertionPolicies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossPlatformViewEClass, CrossPlatformView.class, "CrossPlatformView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossPlatformView_ECOACrossPlatformView(), theviewPackage.getView(), null, "ECOACrossPlatformView", null, 0, 1, CrossPlatformView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossPlatformView_Name(), theXMLTypePackage.getName_(), "Name", null, 1, 1, CrossPlatformView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(euidEClass, temp.EUID.class, "EUID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEUID_UID(), theuidPackage.getIDMap(), null, "UID", null, 1, 1, temp.EUID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEUID_Name(), theXMLTypePackage.getName_(), "Name", null, 1, 1, temp.EUID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TempPackageImpl
