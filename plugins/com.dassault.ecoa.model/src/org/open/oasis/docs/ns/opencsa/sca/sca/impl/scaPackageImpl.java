/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import EcoaCommon20.EcoaCommon20Package;

import EcoaCommon20.impl.EcoaCommon20PackageImpl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase;
import org.open.oasis.docs.ns.opencsa.sca.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Composite;
import org.open.oasis.docs.ns.opencsa.sca.sca.Contract;
import org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType;
import org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType;
import org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot;
import org.open.oasis.docs.ns.opencsa.sca.sca.Documentation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Implementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Interface;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;
import org.open.oasis.docs.ns.opencsa.sca.sca.Reference;
import org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase;
import org.open.oasis.docs.ns.opencsa.sca.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;
import org.open.oasis.docs.ns.opencsa.sca.sca.ValueType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Wire;
import org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

import org.open.oasis.docs.ns.opencsa.sca.sca.util.scaValidator;

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
public class scaPackageImpl extends EPackageImpl implements scaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonExtensionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

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
	private EClass extensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaPropertyBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireFormatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfAnyURIsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfQNamesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiplicityObjectEDataType = null;

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
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private scaPackageImpl() {
		super(eNS_URI, scaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link scaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static scaPackage init() {
		if (isInited) return (scaPackage)EPackage.Registry.INSTANCE.getEPackage(scaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredscaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		scaPackageImpl thescaPackage = registeredscaPackage instanceof scaPackageImpl ? (scaPackageImpl)registeredscaPackage : new scaPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(projPackage.eNS_URI);
		projPackageImpl theprojPackage = (projPackageImpl)(registeredPackage instanceof projPackageImpl ? registeredPackage : projPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(typPackage.eNS_URI);
		typPackageImpl thetypPackage = (typPackageImpl)(registeredPackage instanceof typPackageImpl ? registeredPackage : typPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(uidPackage.eNS_URI);
		uidPackageImpl theuidPackage = (uidPackageImpl)(registeredPackage instanceof uidPackageImpl ? registeredPackage : uidPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scaExtPackage.eNS_URI);
		scaExtPackageImpl thescaExtPackage = (scaExtPackageImpl)(registeredPackage instanceof scaExtPackageImpl ? registeredPackage : scaExtPackage.eINSTANCE);

		// Create package meta-data objects
		thescaPackage.createPackageContents();
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
		theprojPackage.createPackageContents();
		thetypPackage.createPackageContents();
		theuidPackage.createPackageContents();
		thescaExtPackage.createPackageContents();

		// Initialize created meta-data
		thescaPackage.initializePackageContents();
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
		theprojPackage.initializePackageContents();
		thetypPackage.initializePackageContents();
		theuidPackage.initializePackageContents();
		thescaExtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thescaPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return scaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thescaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(scaPackage.eNS_URI, thescaPackage);
		return thescaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonExtensionBase() {
		return commonExtensionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonExtensionBase_Documentation() {
		return (EReference)commonExtensionBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ImplementationGroup() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Implementation() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Group() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Service() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Reference() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Property() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentReference() {
		return componentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Multiplicity() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentService() {
		return componentServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Group() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Service() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Reference() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Property() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentTypeReference() {
		return componentTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposite_Group() {
		return (EAttribute)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Service() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Property() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Component() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Reference() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Wire() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposite_Name() {
		return (EAttribute)compositeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposite_TargetNamespace() {
		return (EAttribute)compositeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Interface() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_Name() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributionType() {
		return contributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionType_Deployable() {
		return (EReference)contributionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployableType() {
		return deployableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableType_Any() {
		return (EAttribute)deployableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableType_Composite() {
		return (EAttribute)deployableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableType_Deployment() {
		return (EAttribute)deployableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Mixed() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Any() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_ComponentType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Composite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Documentation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Extensions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Implementation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImplementationType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Interface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Value() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WireFormat() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Contribution() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImplementationComposite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionsType() {
		return extensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionsType_Any() {
		return (EAttribute)extensionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationType() {
		return implementationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationType_Type() {
		return (EAttribute)implementationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_MustSupply() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_File() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Source() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Multiplicity() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Promote() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCAImplementation() {
		return scaImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAImplementation_Any() {
		return (EAttribute)scaImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAImplementation_Name() {
		return (EAttribute)scaImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCAPropertyBase() {
		return scaPropertyBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAPropertyBase_Mixed() {
		return (EAttribute)scaPropertyBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAPropertyBase_Any() {
		return (EAttribute)scaPropertyBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAPropertyBase_Name() {
		return (EAttribute)scaPropertyBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAPropertyBase_Type() {
		return (EAttribute)scaPropertyBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCAPropertyBase_AnyAttribute() {
		return (EAttribute)scaPropertyBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Promote() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Mixed() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Any() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_AnyAttribute() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWire() {
		return wireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWire_Any() {
		return (EAttribute)wireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWire_Source() {
		return (EAttribute)wireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWire_Target() {
		return (EAttribute)wireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireFormatType() {
		return wireFormatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfAnyURIs() {
		return listOfAnyURIsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfQNames() {
		return listOfQNamesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiplicityObject() {
		return multiplicityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaFactory getscaFactory() {
		return (scaFactory)getEFactoryInstance();
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
		commonExtensionBaseEClass = createEClass(COMMON_EXTENSION_BASE);
		createEReference(commonExtensionBaseEClass, COMMON_EXTENSION_BASE__DOCUMENTATION);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IMPLEMENTATION_GROUP);
		createEReference(componentEClass, COMPONENT__IMPLEMENTATION);
		createEAttribute(componentEClass, COMPONENT__GROUP);
		createEReference(componentEClass, COMPONENT__SERVICE);
		createEReference(componentEClass, COMPONENT__REFERENCE);
		createEReference(componentEClass, COMPONENT__PROPERTY);
		createEAttribute(componentEClass, COMPONENT__NAME);

		componentReferenceEClass = createEClass(COMPONENT_REFERENCE);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__MULTIPLICITY);

		componentServiceEClass = createEClass(COMPONENT_SERVICE);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__GROUP);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SERVICE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__REFERENCE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PROPERTY);

		componentTypeReferenceEClass = createEClass(COMPONENT_TYPE_REFERENCE);

		compositeEClass = createEClass(COMPOSITE);
		createEAttribute(compositeEClass, COMPOSITE__GROUP);
		createEReference(compositeEClass, COMPOSITE__SERVICE);
		createEReference(compositeEClass, COMPOSITE__PROPERTY);
		createEReference(compositeEClass, COMPOSITE__COMPONENT);
		createEReference(compositeEClass, COMPOSITE__REFERENCE);
		createEReference(compositeEClass, COMPOSITE__WIRE);
		createEAttribute(compositeEClass, COMPOSITE__NAME);
		createEAttribute(compositeEClass, COMPOSITE__TARGET_NAMESPACE);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__INTERFACE);
		createEAttribute(contractEClass, CONTRACT__NAME);

		contributionTypeEClass = createEClass(CONTRIBUTION_TYPE);
		createEReference(contributionTypeEClass, CONTRIBUTION_TYPE__DEPLOYABLE);

		deployableTypeEClass = createEClass(DEPLOYABLE_TYPE);
		createEAttribute(deployableTypeEClass, DEPLOYABLE_TYPE__ANY);
		createEAttribute(deployableTypeEClass, DEPLOYABLE_TYPE__COMPOSITE);
		createEAttribute(deployableTypeEClass, DEPLOYABLE_TYPE__DEPLOYMENT);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__MIXED);
		createEAttribute(documentationEClass, DOCUMENTATION__ANY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPONENT_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPOSITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENSIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WIRE_FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRIBUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE);

		extensionsTypeEClass = createEClass(EXTENSIONS_TYPE);
		createEAttribute(extensionsTypeEClass, EXTENSIONS_TYPE__ANY);

		implementationEClass = createEClass(IMPLEMENTATION);

		implementationTypeEClass = createEClass(IMPLEMENTATION_TYPE);
		createEAttribute(implementationTypeEClass, IMPLEMENTATION_TYPE__TYPE);

		interfaceEClass = createEClass(INTERFACE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__MUST_SUPPLY);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__FILE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__SOURCE);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__MULTIPLICITY);
		createEAttribute(referenceEClass, REFERENCE__PROMOTE);

		scaImplementationEClass = createEClass(SCA_IMPLEMENTATION);
		createEAttribute(scaImplementationEClass, SCA_IMPLEMENTATION__ANY);
		createEAttribute(scaImplementationEClass, SCA_IMPLEMENTATION__NAME);

		scaPropertyBaseEClass = createEClass(SCA_PROPERTY_BASE);
		createEAttribute(scaPropertyBaseEClass, SCA_PROPERTY_BASE__MIXED);
		createEAttribute(scaPropertyBaseEClass, SCA_PROPERTY_BASE__ANY);
		createEAttribute(scaPropertyBaseEClass, SCA_PROPERTY_BASE__NAME);
		createEAttribute(scaPropertyBaseEClass, SCA_PROPERTY_BASE__TYPE);
		createEAttribute(scaPropertyBaseEClass, SCA_PROPERTY_BASE__ANY_ATTRIBUTE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__PROMOTE);

		serviceTypeEClass = createEClass(SERVICE_TYPE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__MIXED);
		createEAttribute(valueTypeEClass, VALUE_TYPE__ANY);
		createEAttribute(valueTypeEClass, VALUE_TYPE__ANY_ATTRIBUTE);

		wireEClass = createEClass(WIRE);
		createEAttribute(wireEClass, WIRE__ANY);
		createEAttribute(wireEClass, WIRE__SOURCE);
		createEAttribute(wireEClass, WIRE__TARGET);

		wireFormatTypeEClass = createEClass(WIRE_FORMAT_TYPE);

		// Create enums
		multiplicityEEnum = createEEnum(MULTIPLICITY);

		// Create data types
		listOfAnyURIsEDataType = createEDataType(LIST_OF_ANY_UR_IS);
		listOfQNamesEDataType = createEDataType(LIST_OF_QNAMES);
		multiplicityObjectEDataType = createEDataType(MULTIPLICITY_OBJECT);
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
		scaExtPackage thescaExtPackage = (scaExtPackage)EPackage.Registry.INSTANCE.getEPackage(scaExtPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(this.getCommonExtensionBase());
		componentReferenceEClass.getESuperTypes().add(this.getContract());
		componentServiceEClass.getESuperTypes().add(this.getContract());
		componentTypeEClass.getESuperTypes().add(this.getCommonExtensionBase());
		componentTypeReferenceEClass.getESuperTypes().add(this.getComponentReference());
		compositeEClass.getESuperTypes().add(this.getCommonExtensionBase());
		contractEClass.getESuperTypes().add(this.getCommonExtensionBase());
		contributionTypeEClass.getESuperTypes().add(this.getCommonExtensionBase());
		deployableTypeEClass.getESuperTypes().add(this.getCommonExtensionBase());
		implementationEClass.getESuperTypes().add(this.getCommonExtensionBase());
		implementationTypeEClass.getESuperTypes().add(this.getCommonExtensionBase());
		interfaceEClass.getESuperTypes().add(this.getCommonExtensionBase());
		propertyEClass.getESuperTypes().add(this.getSCAPropertyBase());
		propertyValueEClass.getESuperTypes().add(this.getSCAPropertyBase());
		referenceEClass.getESuperTypes().add(this.getContract());
		scaImplementationEClass.getESuperTypes().add(this.getImplementation());
		serviceEClass.getESuperTypes().add(this.getContract());
		serviceTypeEClass.getESuperTypes().add(this.getComponentService());
		wireEClass.getESuperTypes().add(this.getCommonExtensionBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(commonExtensionBaseEClass, CommonExtensionBase.class, "CommonExtensionBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonExtensionBase_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, CommonExtensionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_ImplementationGroup(), ecorePackage.getEFeatureMapEntry(), "implementationGroup", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Implementation(), this.getImplementation(), null, "implementation", null, 1, 1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Service(), this.getComponentService(), null, "service", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Reference(), this.getComponentReference(), null, "reference", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Property(), this.getPropertyValue(), null, "property", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentReferenceEClass, ComponentReference.class, "ComponentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentReference_Multiplicity(), this.getMultiplicity(), "multiplicity", "1..1", 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentServiceEClass, ComponentService.class, "ComponentService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Service(), this.getServiceType(), null, "service", null, 0, -1, ComponentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Reference(), this.getComponentTypeReference(), null, "reference", null, 0, -1, ComponentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Property(), this.getProperty(), null, "property", null, 0, -1, ComponentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeReferenceEClass, ComponentTypeReference.class, "ComponentTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposite_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Service(), this.getService(), null, "service", null, 0, -1, Composite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Property(), this.getProperty(), null, "property", null, 0, -1, Composite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Component(), this.getComponent(), null, "component", null, 0, -1, Composite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Reference(), this.getReference(), null, "reference", null, 0, -1, Composite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Wire(), this.getWire(), null, "wire", null, 0, -1, Composite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposite_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposite_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 1, 1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_Interface(), thescaExtPackage.getInterface(), null, "interface", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionTypeEClass, ContributionType.class, "ContributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributionType_Deployable(), this.getDeployableType(), null, "deployable", null, 0, -1, ContributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableTypeEClass, DeployableType.class, "DeployableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployableType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DeployableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableType_Composite(), theXMLTypePackage.getQName(), "composite", null, 1, 1, DeployableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableType_Deployment(), theXMLTypePackage.getString(), "deployment", null, 0, 1, DeployableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComponentType(), this.getComponentType(), null, "componentType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Composite(), this.getComposite(), null, "composite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Implementation(), this.getImplementation(), null, "implementation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ImplementationType(), this.getImplementationType(), null, "implementationType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Interface(), this.getInterface(), null, "interface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Value(), this.getValueType(), null, "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WireFormat(), this.getWireFormatType(), null, "wireFormat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Contribution(), this.getContributionType(), null, "contribution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ImplementationComposite(), this.getSCAImplementation(), null, "implementationComposite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionsTypeEClass, ExtensionsType.class, "ExtensionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, ExtensionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationTypeEClass, ImplementationType.class, "ImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationType_Type(), theXMLTypePackage.getQName(), "type", null, 1, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_MustSupply(), theXMLTypePackage.getBoolean(), "mustSupply", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_File(), theXMLTypePackage.getAnyURI(), "file", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Multiplicity(), this.getMultiplicity(), "multiplicity", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Promote(), this.getListOfAnyURIs(), "promote", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaImplementationEClass, SCAImplementation.class, "SCAImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSCAImplementation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SCAImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCAImplementation_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, SCAImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaPropertyBaseEClass, SCAPropertyBase.class, "SCAPropertyBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSCAPropertyBase_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SCAPropertyBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCAPropertyBase_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SCAPropertyBase.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCAPropertyBase_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, SCAPropertyBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCAPropertyBase_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, SCAPropertyBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCAPropertyBase_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SCAPropertyBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Promote(), theXMLTypePackage.getAnyURI(), "promote", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireEClass, Wire.class, "Wire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWire_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWire_Source(), theXMLTypePackage.getAnyURI(), "source", null, 1, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWire_Target(), theXMLTypePackage.getAnyURI(), "target", null, 1, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireFormatTypeEClass, WireFormatType.class, "WireFormatType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity._01);
		addEEnumLiteral(multiplicityEEnum, Multiplicity._11);
		addEEnumLiteral(multiplicityEEnum, Multiplicity._0N);
		addEEnumLiteral(multiplicityEEnum, Multiplicity._1N);

		// Initialize data types
		initEDataType(listOfAnyURIsEDataType, List.class, "ListOfAnyURIs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfQNamesEDataType, List.class, "ListOfQNames", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multiplicityObjectEDataType, Multiplicity.class, "MultiplicityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://java.sun.com/xml/ns/jaxb
		createJaxbAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://java.sun.com/xml/ns/jaxb</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJaxbAnnotations() {
		String source = "http://java.sun.com/xml/ns/jaxb";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "version", "1.0"
		   });
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
		  (commonExtensionBaseEClass,
		   source,
		   new String[] {
			   "name", "CommonExtensionBase",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommonExtensionBase_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "name", "Component",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponent_ImplementationGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "implementation:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponent_Implementation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implementation",
			   "namespace", "##targetNamespace",
			   "group", "implementation:group"
		   });
		addAnnotation
		  (getComponent_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:3"
		   });
		addAnnotation
		  (getComponent_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getComponent_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getComponent_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getComponent_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (componentReferenceEClass,
		   source,
		   new String[] {
			   "name", "ComponentReference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponentReference_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "multiplicity"
		   });
		addAnnotation
		  (componentServiceEClass,
		   source,
		   new String[] {
			   "name", "ComponentService",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (componentTypeEClass,
		   source,
		   new String[] {
			   "name", "ComponentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponentType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getComponentType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComponentType_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComponentType_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (componentTypeReferenceEClass,
		   source,
		   new String[] {
			   "name", "ComponentTypeReference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (compositeEClass,
		   source,
		   new String[] {
			   "name", "Composite",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComposite_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getComposite_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComposite_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComposite_Component(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "component",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComposite_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComposite_Wire(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wire",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getComposite_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getComposite_TargetNamespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetNamespace"
		   });
		addAnnotation
		  (contractEClass,
		   source,
		   new String[] {
			   "name", "Contract",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContract_Interface(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "interface",
			   "namespace", "http://www.ecoa.technology/sca-extension-2.0"
		   });
		addAnnotation
		  (getContract_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (contributionTypeEClass,
		   source,
		   new String[] {
			   "name", "ContributionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContributionType_Deployable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deployable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deployableTypeEClass,
		   source,
		   new String[] {
			   "name", "DeployableType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeployableType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getDeployableType_Composite(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "composite"
		   });
		addAnnotation
		  (getDeployableType_Deployment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "deployment",
			   "namespace", "http://www.ecoa.technology/sca-extension-2.0"
		   });
		addAnnotation
		  (documentationEClass,
		   source,
		   new String[] {
			   "name", "Documentation",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentation_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":1",
			   "processing", "lax"
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
		  (getDocumentRoot_ComponentType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Composite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "composite",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Extensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Implementation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implementation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ImplementationType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implementationType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Interface(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "interface",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WireFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wireFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Contribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ImplementationComposite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implementation.composite",
			   "namespace", "##targetNamespace",
			   "affiliation", "implementation"
		   });
		addAnnotation
		  (extensionsTypeEClass,
		   source,
		   new String[] {
			   "name", "extensions_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtensionsType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (implementationEClass,
		   source,
		   new String[] {
			   "name", "Implementation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (implementationTypeEClass,
		   source,
		   new String[] {
			   "name", "ImplementationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getImplementationType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (interfaceEClass,
		   source,
		   new String[] {
			   "name", "Interface",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (listOfAnyURIsEDataType,
		   source,
		   new String[] {
			   "name", "listOfAnyURIs",
			   "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
		addAnnotation
		  (listOfQNamesEDataType,
		   source,
		   new String[] {
			   "name", "listOfQNames",
			   "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
		   });
		addAnnotation
		  (multiplicityEEnum,
		   source,
		   new String[] {
			   "name", "Multiplicity"
		   });
		addAnnotation
		  (multiplicityObjectEDataType,
		   source,
		   new String[] {
			   "name", "Multiplicity:Object",
			   "baseType", "Multiplicity"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "name", "Property",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getProperty_MustSupply(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mustSupply"
		   });
		addAnnotation
		  (propertyValueEClass,
		   source,
		   new String[] {
			   "name", "PropertyValue",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getPropertyValue_File(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "file"
		   });
		addAnnotation
		  (getPropertyValue_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "name", "Reference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReference_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "multiplicity"
		   });
		addAnnotation
		  (getReference_Promote(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "promote"
		   });
		addAnnotation
		  (scaImplementationEClass,
		   source,
		   new String[] {
			   "name", "SCAImplementation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSCAImplementation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getSCAImplementation_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (scaPropertyBaseEClass,
		   source,
		   new String[] {
			   "name", "SCAPropertyBase",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSCAPropertyBase_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getSCAPropertyBase_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getSCAPropertyBase_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getSCAPropertyBase_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getSCAPropertyBase_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "name", "Service",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getService_Promote(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "promote"
		   });
		addAnnotation
		  (serviceTypeEClass,
		   source,
		   new String[] {
			   "name", "service_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (valueTypeEClass,
		   source,
		   new String[] {
			   "name", "ValueType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getValueType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getValueType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getValueType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":2",
			   "processing", "lax"
		   });
		addAnnotation
		  (wireEClass,
		   source,
		   new String[] {
			   "name", "Wire",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWire_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getWire_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (getWire_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "target"
		   });
		addAnnotation
		  (wireFormatTypeEClass,
		   source,
		   new String[] {
			   "name", "WireFormatType",
			   "kind", "empty"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (getContract_Interface(),
		   source,
		   new String[] {
			   "appinfo", "\r\n          \r\n  <jxb:class name=\"ecoaInterfaceElement\" xmlns:jxb=\"http://java.sun.com/xml/ns/jaxb\"/>\r\n        \r\n"
		   });
	}

} //scaPackageImpl
