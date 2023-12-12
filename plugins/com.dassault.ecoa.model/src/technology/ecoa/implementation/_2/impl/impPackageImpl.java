/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

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

import technology.ecoa.implementation._2.ClientsType;
import technology.ecoa.implementation._2.ComponentImplementation;
import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.DataReadType;
import technology.ecoa.implementation._2.DataWrittenType;
import technology.ecoa.implementation._2.DocumentRoot;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.Event;
import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.EventReceivedType;
import technology.ecoa.implementation._2.Instance;
import technology.ecoa.implementation._2.ModuleImplementation;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.ModuleType;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatable;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.OpRefActivatingFifo;
import technology.ecoa.implementation._2.OpRefExternal;
import technology.ecoa.implementation._2.OpRefTrigger;
import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.Parameter;
import technology.ecoa.implementation._2.PinfoType;
import technology.ecoa.implementation._2.PinfoType1;
import technology.ecoa.implementation._2.PinfoValue;
import technology.ecoa.implementation._2.PrivatePinfo;
import technology.ecoa.implementation._2.ProgrammingLanguage;
import technology.ecoa.implementation._2.PropertiesType;
import technology.ecoa.implementation._2.PropertyValue;
import technology.ecoa.implementation._2.PropertyValues;
import technology.ecoa.implementation._2.PublicPinfo;
import technology.ecoa.implementation._2.ReadersType;
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.RequestReceivedType;
import technology.ecoa.implementation._2.RequestResponse;
import technology.ecoa.implementation._2.RequestSentType;
import technology.ecoa.implementation._2.SendersType;
import technology.ecoa.implementation._2.ServerType;
import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.TriggerInstance;
import technology.ecoa.implementation._2.UseType;
import technology.ecoa.implementation._2.VersionedData;
import technology.ecoa.implementation._2.WritersType;
import technology.ecoa.implementation._2.impFactory;
import technology.ecoa.implementation._2.impPackage;

import technology.ecoa.implementation._2.util.impValidator;

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
public class impPackageImpl extends EPackageImpl implements impPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWrittenTypeEClass = null;

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
	private EClass dynamicTriggerInstanceEClass = null;

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
	private EClass eventLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReceivedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefActivatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefActivatableFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefActivatingFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opRefTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinfoType1EClass = null;

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
	private EClass privatePinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

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
	private EClass propertyValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicPinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiversTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestReceivedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceQoSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerInstanceEClass = null;

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
	private EClass versionedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writersTypeEClass = null;

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
	private EDataType relativePriorityEDataType = null;

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
	 * @see technology.ecoa.implementation._2.impPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private impPackageImpl() {
		super(eNS_URI, impFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link impPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static impPackage init() {
		if (isInited) return (impPackage)EPackage.Registry.INSTANCE.getEPackage(impPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredimpPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		impPackageImpl theimpPackage = registeredimpPackage instanceof impPackageImpl ? (impPackageImpl)registeredimpPackage : new impPackageImpl();

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
		theimpPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		thepolPackage.createPackageContents();
		themodPackage.createPackageContents();
		theudpPackage.createPackageContents();
		thebinPackage.createPackageContents();
		theEcoaCommon20Package.createPackageContents();
		theviewPackage.createPackageContents();
		thedepPackage.createPackageContents();
		theinterPackage.createPackageContents();
		theqosPackage.createPackageContents();
		thelogPackage.createPackageContents();
		theprojPackage.createPackageContents();
		thetypPackage.createPackageContents();
		theuidPackage.createPackageContents();
		thescaPackage.createPackageContents();
		thescaExtPackage.createPackageContents();

		// Initialize created meta-data
		theimpPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		thepolPackage.initializePackageContents();
		themodPackage.initializePackageContents();
		theudpPackage.initializePackageContents();
		thebinPackage.initializePackageContents();
		theEcoaCommon20Package.initializePackageContents();
		theviewPackage.initializePackageContents();
		thedepPackage.initializePackageContents();
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
			(theimpPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return impValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theimpPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(impPackage.eNS_URI, theimpPackage);
		return theimpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientsType() {
		return clientsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientsType_Group() {
		return (EAttribute)clientsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientsType_Service() {
		return (EReference)clientsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientsType_ModuleInstance() {
		return (EReference)clientsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_Use() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_Service() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_Reference() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_ModuleType() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_ModuleImplementation() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_ModuleInstance() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_TriggerInstance() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_DynamicTriggerInstance() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentImplementation_Group() {
		return (EAttribute)componentImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_DataLink() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_EventLink() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_RequestLink() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentImplementation_ComponentDefinition() {
		return (EAttribute)componentImplementationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLink() {
		return dataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Writers() {
		return (EReference)dataLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Readers() {
		return (EReference)dataLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_Controlled() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_Id() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReadType() {
		return dataReadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataReadType_Notifying() {
		return (EAttribute)dataReadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataWrittenType() {
		return dataWrittenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWrittenType_WriteOnly() {
		return (EAttribute)dataWrittenTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_ComponentImplementation() {
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
	public EClass getDynamicTriggerInstance() {
		return dynamicTriggerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicTriggerInstance_Parameter() {
		return (EReference)dynamicTriggerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicTriggerInstance_Size() {
		return (EAttribute)dynamicTriggerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Input() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventLink() {
		return eventLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventLink_Senders() {
		return (EReference)eventLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventLink_Receivers() {
		return (EReference)eventLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventLink_Id() {
		return (EAttribute)eventLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventReceivedType() {
		return eventReceivedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_ModuleBehaviour() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_RelativePriority() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleImplementation() {
		return moduleImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImplementation_Language() {
		return (EAttribute)moduleImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImplementation_ModuleType() {
		return (EAttribute)moduleImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImplementation_Name() {
		return (EAttribute)moduleImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleInstance() {
		return moduleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInstance_PropertyValues() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInstance_Pinfo() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleInstance_ImplementationName() {
		return (EAttribute)moduleInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleType() {
		return moduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleType_Properties() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleType_Pinfo() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleType_Operations() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleType_ActivatingFaultNotifs() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleType_HasUserContext() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleType_HasWarmStartContext() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleType_IsFaultHandler() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleType_Name() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationsType() {
		return operationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationsType_Group() {
		return (EAttribute)operationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_DataWritten() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_DataRead() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_EventSent() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_EventReceived() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_RequestSent() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationsType_RequestReceived() {
		return (EReference)operationsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRef() {
		return opRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRef_InstanceName() {
		return (EAttribute)opRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRef_OperationName() {
		return (EAttribute)opRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRefActivatable() {
		return opRefActivatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefActivatable_Activating() {
		return (EAttribute)opRefActivatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRefActivatableFifo() {
		return opRefActivatableFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefActivatableFifo_FifoSize() {
		return (EAttribute)opRefActivatableFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRefActivatingFifo() {
		return opRefActivatingFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefActivatingFifo_FifoSize() {
		return (EAttribute)opRefActivatingFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRefExternal() {
		return opRefExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefExternal_Language() {
		return (EAttribute)opRefExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefExternal_OperationName() {
		return (EAttribute)opRefExternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpRefTrigger() {
		return opRefTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefTrigger_InstanceName() {
		return (EAttribute)opRefTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpRefTrigger_Period() {
		return (EAttribute)opRefTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinfoType() {
		return pinfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinfoType_PublicPinfo() {
		return (EReference)pinfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinfoType_PrivatePinfo() {
		return (EReference)pinfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinfoType1() {
		return pinfoType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinfoType1_PublicPinfo() {
		return (EReference)pinfoType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinfoType1_PrivatePinfo() {
		return (EReference)pinfoType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinfoValue() {
		return pinfoValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinfoValue_Value() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinfoValue_Name() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivatePinfo() {
		return privatePinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePinfo_Name() {
		return (EAttribute)privatePinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesType_Property() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPropertyValue_Value() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Name() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValues() {
		return propertyValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValues_PropertyValue() {
		return (EReference)propertyValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicPinfo() {
		return publicPinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicPinfo_Name() {
		return (EAttribute)publicPinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadersType() {
		return readersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadersType_Group() {
		return (EAttribute)readersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadersType_Service() {
		return (EReference)readersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadersType_ModuleInstance() {
		return (EReference)readersTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiversType() {
		return receiversTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiversType_Group() {
		return (EAttribute)receiversTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiversType_Service() {
		return (EReference)receiversTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiversType_Reference() {
		return (EReference)receiversTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiversType_ModuleInstance() {
		return (EReference)receiversTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiversType_DynamicTrigger() {
		return (EReference)receiversTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestLink() {
		return requestLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestLink_Clients() {
		return (EReference)requestLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestLink_Server() {
		return (EReference)requestLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestLink_Id() {
		return (EAttribute)requestLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestReceivedType() {
		return requestReceivedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestReceivedType_MaxConcurrentRequests() {
		return (EAttribute)requestReceivedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestResponse() {
		return requestResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestResponse_Input() {
		return (EReference)requestResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestResponse_Output() {
		return (EReference)requestResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestResponse_Name() {
		return (EAttribute)requestResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSentType() {
		return requestSentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSentType_IsSynchronous() {
		return (EAttribute)requestSentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSentType_MaxConcurrentRequests() {
		return (EAttribute)requestSentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSentType_Timeout() {
		return (EAttribute)requestSentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendersType() {
		return sendersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendersType_Group() {
		return (EAttribute)sendersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_Service() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_Reference() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_ModuleInstance() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_Trigger() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_DynamicTrigger() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendersType_External() {
		return (EReference)sendersTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerType() {
		return serverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerType_Reference() {
		return (EReference)serverTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerType_ModuleInstance() {
		return (EReference)serverTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceQoS() {
		return serviceQoSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceQoS_Name() {
		return (EAttribute)serviceQoSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceQoS_NewQoS() {
		return (EAttribute)serviceQoSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerInstance() {
		return triggerInstanceEClass;
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
	public EClass getVersionedData() {
		return versionedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedData_MaxVersions() {
		return (EAttribute)versionedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedData_Name() {
		return (EAttribute)versionedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedData_Type() {
		return (EAttribute)versionedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritersType() {
		return writersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritersType_Group() {
		return (EAttribute)writersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritersType_Reference() {
		return (EReference)writersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritersType_ModuleInstance() {
		return (EReference)writersTypeEClass.getEStructuralFeatures().get(2);
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
	public EDataType getRelativePriority() {
		return relativePriorityEDataType;
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
	public impFactory getimpFactory() {
		return (impFactory)getEFactoryInstance();
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
		clientsTypeEClass = createEClass(CLIENTS_TYPE);
		createEAttribute(clientsTypeEClass, CLIENTS_TYPE__GROUP);
		createEReference(clientsTypeEClass, CLIENTS_TYPE__SERVICE);
		createEReference(clientsTypeEClass, CLIENTS_TYPE__MODULE_INSTANCE);

		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__USE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__SERVICE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__REFERENCE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_TYPE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_INSTANCE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__GROUP);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__DATA_LINK);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__EVENT_LINK);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__REQUEST_LINK);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION);

		dataLinkEClass = createEClass(DATA_LINK);
		createEReference(dataLinkEClass, DATA_LINK__WRITERS);
		createEReference(dataLinkEClass, DATA_LINK__READERS);
		createEAttribute(dataLinkEClass, DATA_LINK__CONTROLLED);
		createEAttribute(dataLinkEClass, DATA_LINK__ID);

		dataReadTypeEClass = createEClass(DATA_READ_TYPE);
		createEAttribute(dataReadTypeEClass, DATA_READ_TYPE__NOTIFYING);

		dataWrittenTypeEClass = createEClass(DATA_WRITTEN_TYPE);
		createEAttribute(dataWrittenTypeEClass, DATA_WRITTEN_TYPE__WRITE_ONLY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPONENT_IMPLEMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);

		dynamicTriggerInstanceEClass = createEClass(DYNAMIC_TRIGGER_INSTANCE);
		createEReference(dynamicTriggerInstanceEClass, DYNAMIC_TRIGGER_INSTANCE__PARAMETER);
		createEAttribute(dynamicTriggerInstanceEClass, DYNAMIC_TRIGGER_INSTANCE__SIZE);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__INPUT);
		createEAttribute(eventEClass, EVENT__NAME);

		eventLinkEClass = createEClass(EVENT_LINK);
		createEReference(eventLinkEClass, EVENT_LINK__SENDERS);
		createEReference(eventLinkEClass, EVENT_LINK__RECEIVERS);
		createEAttribute(eventLinkEClass, EVENT_LINK__ID);

		eventReceivedTypeEClass = createEClass(EVENT_RECEIVED_TYPE);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__MODULE_BEHAVIOUR);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEAttribute(instanceEClass, INSTANCE__RELATIVE_PRIORITY);

		moduleImplementationEClass = createEClass(MODULE_IMPLEMENTATION);
		createEAttribute(moduleImplementationEClass, MODULE_IMPLEMENTATION__LANGUAGE);
		createEAttribute(moduleImplementationEClass, MODULE_IMPLEMENTATION__MODULE_TYPE);
		createEAttribute(moduleImplementationEClass, MODULE_IMPLEMENTATION__NAME);

		moduleInstanceEClass = createEClass(MODULE_INSTANCE);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__PROPERTY_VALUES);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__PINFO);
		createEAttribute(moduleInstanceEClass, MODULE_INSTANCE__IMPLEMENTATION_NAME);

		moduleTypeEClass = createEClass(MODULE_TYPE);
		createEReference(moduleTypeEClass, MODULE_TYPE__PROPERTIES);
		createEReference(moduleTypeEClass, MODULE_TYPE__PINFO);
		createEReference(moduleTypeEClass, MODULE_TYPE__OPERATIONS);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__ACTIVATING_FAULT_NOTIFS);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__HAS_USER_CONTEXT);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__HAS_WARM_START_CONTEXT);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__IS_FAULT_HANDLER);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__NAME);

		operationsTypeEClass = createEClass(OPERATIONS_TYPE);
		createEAttribute(operationsTypeEClass, OPERATIONS_TYPE__GROUP);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__DATA_WRITTEN);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__DATA_READ);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__EVENT_SENT);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__EVENT_RECEIVED);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__REQUEST_SENT);
		createEReference(operationsTypeEClass, OPERATIONS_TYPE__REQUEST_RECEIVED);

		opRefEClass = createEClass(OP_REF);
		createEAttribute(opRefEClass, OP_REF__INSTANCE_NAME);
		createEAttribute(opRefEClass, OP_REF__OPERATION_NAME);

		opRefActivatableEClass = createEClass(OP_REF_ACTIVATABLE);
		createEAttribute(opRefActivatableEClass, OP_REF_ACTIVATABLE__ACTIVATING);

		opRefActivatableFifoEClass = createEClass(OP_REF_ACTIVATABLE_FIFO);
		createEAttribute(opRefActivatableFifoEClass, OP_REF_ACTIVATABLE_FIFO__FIFO_SIZE);

		opRefActivatingFifoEClass = createEClass(OP_REF_ACTIVATING_FIFO);
		createEAttribute(opRefActivatingFifoEClass, OP_REF_ACTIVATING_FIFO__FIFO_SIZE);

		opRefExternalEClass = createEClass(OP_REF_EXTERNAL);
		createEAttribute(opRefExternalEClass, OP_REF_EXTERNAL__LANGUAGE);
		createEAttribute(opRefExternalEClass, OP_REF_EXTERNAL__OPERATION_NAME);

		opRefTriggerEClass = createEClass(OP_REF_TRIGGER);
		createEAttribute(opRefTriggerEClass, OP_REF_TRIGGER__INSTANCE_NAME);
		createEAttribute(opRefTriggerEClass, OP_REF_TRIGGER__PERIOD);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		pinfoTypeEClass = createEClass(PINFO_TYPE);
		createEReference(pinfoTypeEClass, PINFO_TYPE__PUBLIC_PINFO);
		createEReference(pinfoTypeEClass, PINFO_TYPE__PRIVATE_PINFO);

		pinfoType1EClass = createEClass(PINFO_TYPE1);
		createEReference(pinfoType1EClass, PINFO_TYPE1__PUBLIC_PINFO);
		createEReference(pinfoType1EClass, PINFO_TYPE1__PRIVATE_PINFO);

		pinfoValueEClass = createEClass(PINFO_VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__NAME);

		privatePinfoEClass = createEClass(PRIVATE_PINFO);
		createEAttribute(privatePinfoEClass, PRIVATE_PINFO__NAME);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__NAME);

		propertyValuesEClass = createEClass(PROPERTY_VALUES);
		createEReference(propertyValuesEClass, PROPERTY_VALUES__PROPERTY_VALUE);

		publicPinfoEClass = createEClass(PUBLIC_PINFO);
		createEAttribute(publicPinfoEClass, PUBLIC_PINFO__NAME);

		readersTypeEClass = createEClass(READERS_TYPE);
		createEAttribute(readersTypeEClass, READERS_TYPE__GROUP);
		createEReference(readersTypeEClass, READERS_TYPE__SERVICE);
		createEReference(readersTypeEClass, READERS_TYPE__MODULE_INSTANCE);

		receiversTypeEClass = createEClass(RECEIVERS_TYPE);
		createEAttribute(receiversTypeEClass, RECEIVERS_TYPE__GROUP);
		createEReference(receiversTypeEClass, RECEIVERS_TYPE__SERVICE);
		createEReference(receiversTypeEClass, RECEIVERS_TYPE__REFERENCE);
		createEReference(receiversTypeEClass, RECEIVERS_TYPE__MODULE_INSTANCE);
		createEReference(receiversTypeEClass, RECEIVERS_TYPE__DYNAMIC_TRIGGER);

		requestLinkEClass = createEClass(REQUEST_LINK);
		createEReference(requestLinkEClass, REQUEST_LINK__CLIENTS);
		createEReference(requestLinkEClass, REQUEST_LINK__SERVER);
		createEAttribute(requestLinkEClass, REQUEST_LINK__ID);

		requestReceivedTypeEClass = createEClass(REQUEST_RECEIVED_TYPE);
		createEAttribute(requestReceivedTypeEClass, REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS);

		requestResponseEClass = createEClass(REQUEST_RESPONSE);
		createEReference(requestResponseEClass, REQUEST_RESPONSE__INPUT);
		createEReference(requestResponseEClass, REQUEST_RESPONSE__OUTPUT);
		createEAttribute(requestResponseEClass, REQUEST_RESPONSE__NAME);

		requestSentTypeEClass = createEClass(REQUEST_SENT_TYPE);
		createEAttribute(requestSentTypeEClass, REQUEST_SENT_TYPE__IS_SYNCHRONOUS);
		createEAttribute(requestSentTypeEClass, REQUEST_SENT_TYPE__MAX_CONCURRENT_REQUESTS);
		createEAttribute(requestSentTypeEClass, REQUEST_SENT_TYPE__TIMEOUT);

		sendersTypeEClass = createEClass(SENDERS_TYPE);
		createEAttribute(sendersTypeEClass, SENDERS_TYPE__GROUP);
		createEReference(sendersTypeEClass, SENDERS_TYPE__SERVICE);
		createEReference(sendersTypeEClass, SENDERS_TYPE__REFERENCE);
		createEReference(sendersTypeEClass, SENDERS_TYPE__MODULE_INSTANCE);
		createEReference(sendersTypeEClass, SENDERS_TYPE__TRIGGER);
		createEReference(sendersTypeEClass, SENDERS_TYPE__DYNAMIC_TRIGGER);
		createEReference(sendersTypeEClass, SENDERS_TYPE__EXTERNAL);

		serverTypeEClass = createEClass(SERVER_TYPE);
		createEReference(serverTypeEClass, SERVER_TYPE__REFERENCE);
		createEReference(serverTypeEClass, SERVER_TYPE__MODULE_INSTANCE);

		serviceQoSEClass = createEClass(SERVICE_QO_S);
		createEAttribute(serviceQoSEClass, SERVICE_QO_S__NAME);
		createEAttribute(serviceQoSEClass, SERVICE_QO_S__NEW_QO_S);

		triggerInstanceEClass = createEClass(TRIGGER_INSTANCE);

		useTypeEClass = createEClass(USE_TYPE);
		createEAttribute(useTypeEClass, USE_TYPE__LIBRARY);

		versionedDataEClass = createEClass(VERSIONED_DATA);
		createEAttribute(versionedDataEClass, VERSIONED_DATA__MAX_VERSIONS);
		createEAttribute(versionedDataEClass, VERSIONED_DATA__NAME);
		createEAttribute(versionedDataEClass, VERSIONED_DATA__TYPE);

		writersTypeEClass = createEClass(WRITERS_TYPE);
		createEAttribute(writersTypeEClass, WRITERS_TYPE__GROUP);
		createEReference(writersTypeEClass, WRITERS_TYPE__REFERENCE);
		createEReference(writersTypeEClass, WRITERS_TYPE__MODULE_INSTANCE);

		// Create enums
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);

		// Create data types
		hexOrDecValueEDataType = createEDataType(HEX_OR_DEC_VALUE);
		libraryNameEDataType = createEDataType(LIBRARY_NAME);
		nameIdEDataType = createEDataType(NAME_ID);
		programmingLanguageObjectEDataType = createEDataType(PROGRAMMING_LANGUAGE_OBJECT);
		relativePriorityEDataType = createEDataType(RELATIVE_PRIORITY);
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
		dataReadTypeEClass.getESuperTypes().add(this.getVersionedData());
		dataWrittenTypeEClass.getESuperTypes().add(this.getVersionedData());
		dynamicTriggerInstanceEClass.getESuperTypes().add(this.getInstance());
		eventReceivedTypeEClass.getESuperTypes().add(this.getEvent());
		moduleInstanceEClass.getESuperTypes().add(this.getInstance());
		opRefActivatableEClass.getESuperTypes().add(this.getOpRef());
		opRefActivatableFifoEClass.getESuperTypes().add(this.getOpRefActivatable());
		opRefActivatingFifoEClass.getESuperTypes().add(this.getOpRef());
		requestReceivedTypeEClass.getESuperTypes().add(this.getRequestResponse());
		requestSentTypeEClass.getESuperTypes().add(this.getRequestResponse());
		triggerInstanceEClass.getESuperTypes().add(this.getInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientsTypeEClass, ClientsType.class, "ClientsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ClientsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientsType_Service(), this.getOpRef(), null, "service", null, 0, -1, ClientsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClientsType_ModuleInstance(), this.getOpRefActivatable(), null, "moduleInstance", null, 0, -1, ClientsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementation_Use(), this.getUseType(), null, "use", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Service(), this.getServiceQoS(), null, "service", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Reference(), this.getServiceQoS(), null, "reference", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleType(), this.getModuleType(), null, "moduleType", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleImplementation(), this.getModuleImplementation(), null, "moduleImplementation", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleInstance(), this.getModuleInstance(), null, "moduleInstance", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_TriggerInstance(), this.getTriggerInstance(), null, "triggerInstance", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_DynamicTriggerInstance(), this.getDynamicTriggerInstance(), null, "dynamicTriggerInstance", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentImplementation_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_DataLink(), this.getDataLink(), null, "dataLink", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_EventLink(), this.getEventLink(), null, "eventLink", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_RequestLink(), this.getRequestLink(), null, "requestLink", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentImplementation_ComponentDefinition(), this.getNameId(), "componentDefinition", null, 1, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLinkEClass, DataLink.class, "DataLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLink_Writers(), this.getWritersType(), null, "writers", null, 1, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLink_Readers(), this.getReadersType(), null, "readers", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_Controlled(), theXMLTypePackage.getBoolean(), "controlled", "true", 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReadTypeEClass, DataReadType.class, "DataReadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataReadType_Notifying(), theXMLTypePackage.getBoolean(), "notifying", "false", 0, 1, DataReadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataWrittenTypeEClass, DataWrittenType.class, "DataWrittenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataWrittenType_WriteOnly(), theXMLTypePackage.getBoolean(), "writeOnly", "false", 0, 1, DataWrittenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComponentImplementation(), this.getComponentImplementation(), null, "componentImplementation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUseType(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dynamicTriggerInstanceEClass, DynamicTriggerInstance.class, "DynamicTriggerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicTriggerInstance_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, DynamicTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicTriggerInstance_Size(), theXMLTypePackage.getPositiveInteger(), "size", "1", 0, 1, DynamicTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Input(), this.getParameter(), null, "input", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), this.getNameId(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkEClass, EventLink.class, "EventLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventLink_Senders(), this.getSendersType(), null, "senders", null, 0, 1, EventLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLink_Receivers(), this.getReceiversType(), null, "receivers", null, 1, 1, EventLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLink_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, EventLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventReceivedTypeEClass, EventReceivedType.class, "EventReceivedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_ModuleBehaviour(), theXMLTypePackage.getAnyURI(), "moduleBehaviour", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Name(), this.getNameId(), "name", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_RelativePriority(), this.getRelativePriority(), "relativePriority", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleImplementationEClass, ModuleImplementation.class, "ModuleImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleImplementation_Language(), this.getProgrammingLanguage(), "language", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleImplementation_ModuleType(), this.getNameId(), "moduleType", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleImplementation_Name(), this.getNameId(), "name", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleInstanceEClass, ModuleInstance.class, "ModuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstance_PropertyValues(), this.getPropertyValues(), null, "propertyValues", null, 0, 1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstance_Pinfo(), this.getPinfoType(), null, "pinfo", null, 0, 1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleInstance_ImplementationName(), this.getNameId(), "implementationName", null, 1, 1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleTypeEClass, ModuleType.class, "ModuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Pinfo(), this.getPinfoType1(), null, "pinfo", null, 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Operations(), this.getOperationsType(), null, "operations", null, 1, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_ActivatingFaultNotifs(), theXMLTypePackage.getBoolean(), "activatingFaultNotifs", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_HasUserContext(), theXMLTypePackage.getBoolean(), "hasUserContext", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_HasWarmStartContext(), theXMLTypePackage.getBoolean(), "hasWarmStartContext", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_IsFaultHandler(), theXMLTypePackage.getBoolean(), "isFaultHandler", "false", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_Name(), this.getNameId(), "name", null, 1, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationsTypeEClass, OperationsType.class, "OperationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OperationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_DataWritten(), this.getDataWrittenType(), null, "dataWritten", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_DataRead(), this.getDataReadType(), null, "dataRead", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_EventSent(), this.getEvent(), null, "eventSent", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_EventReceived(), this.getEventReceivedType(), null, "eventReceived", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_RequestSent(), this.getRequestSentType(), null, "requestSent", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationsType_RequestReceived(), this.getRequestReceivedType(), null, "requestReceived", null, 0, -1, OperationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(opRefEClass, OpRef.class, "OpRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRef_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, OpRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpRef_OperationName(), this.getNameId(), "operationName", null, 1, 1, OpRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRefActivatableEClass, OpRefActivatable.class, "OpRefActivatable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRefActivatable_Activating(), theXMLTypePackage.getBoolean(), "activating", "true", 0, 1, OpRefActivatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRefActivatableFifoEClass, OpRefActivatableFifo.class, "OpRefActivatableFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRefActivatableFifo_FifoSize(), theXMLTypePackage.getPositiveInteger(), "fifoSize", "8", 0, 1, OpRefActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRefActivatingFifoEClass, OpRefActivatingFifo.class, "OpRefActivatingFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRefActivatingFifo_FifoSize(), theXMLTypePackage.getPositiveInteger(), "fifoSize", "8", 0, 1, OpRefActivatingFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRefExternalEClass, OpRefExternal.class, "OpRefExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRefExternal_Language(), this.getProgrammingLanguage(), "language", null, 1, 1, OpRefExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpRefExternal_OperationName(), this.getNameId(), "operationName", null, 1, 1, OpRefExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opRefTriggerEClass, OpRefTrigger.class, "OpRefTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpRefTrigger_InstanceName(), this.getNameId(), "instanceName", null, 1, 1, OpRefTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpRefTrigger_Period(), this.getTimeDuration(), "period", null, 1, 1, OpRefTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), this.getNameId(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getTypeQName(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinfoTypeEClass, PinfoType.class, "PinfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPinfoType_PublicPinfo(), this.getPinfoValue(), null, "publicPinfo", null, 0, -1, PinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinfoType_PrivatePinfo(), this.getPinfoValue(), null, "privatePinfo", null, 0, -1, PinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinfoType1EClass, PinfoType1.class, "PinfoType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPinfoType1_PublicPinfo(), this.getPublicPinfo(), null, "publicPinfo", null, 0, -1, PinfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinfoType1_PrivatePinfo(), this.getPrivatePinfo(), null, "privatePinfo", null, 0, -1, PinfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinfoValueEClass, PinfoValue.class, "PinfoValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinfoValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPinfoValue_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privatePinfoEClass, PrivatePinfo.class, "PrivatePinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivatePinfo_Name(), this.getNameId(), "name", null, 1, 1, PrivatePinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesType_Property(), this.getParameter(), null, "property", null, 1, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValuesEClass, PropertyValues.class, "PropertyValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyValues_PropertyValue(), this.getPropertyValue(), null, "propertyValue", null, 1, -1, PropertyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicPinfoEClass, PublicPinfo.class, "PublicPinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicPinfo_Name(), this.getNameId(), "name", null, 1, 1, PublicPinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readersTypeEClass, ReadersType.class, "ReadersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadersType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ReadersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadersType_Service(), this.getOpRef(), null, "service", null, 0, -1, ReadersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReadersType_ModuleInstance(), this.getOpRefActivatableFifo(), null, "moduleInstance", null, 0, -1, ReadersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(receiversTypeEClass, ReceiversType.class, "ReceiversType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiversType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ReceiversType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiversType_Service(), this.getOpRef(), null, "service", null, 0, -1, ReceiversType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReceiversType_Reference(), this.getOpRef(), null, "reference", null, 0, -1, ReceiversType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReceiversType_ModuleInstance(), this.getOpRefActivatableFifo(), null, "moduleInstance", null, 0, -1, ReceiversType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReceiversType_DynamicTrigger(), this.getOpRefActivatingFifo(), null, "dynamicTrigger", null, 0, -1, ReceiversType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requestLinkEClass, RequestLink.class, "RequestLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestLink_Clients(), this.getClientsType(), null, "clients", null, 1, 1, RequestLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestLink_Server(), this.getServerType(), null, "server", null, 1, 1, RequestLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLink_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, RequestLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestReceivedTypeEClass, RequestReceivedType.class, "RequestReceivedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestReceivedType_MaxConcurrentRequests(), theXMLTypePackage.getPositiveInteger(), "maxConcurrentRequests", "10", 0, 1, RequestReceivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestResponseEClass, RequestResponse.class, "RequestResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestResponse_Input(), this.getParameter(), null, "input", null, 0, -1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestResponse_Output(), this.getParameter(), null, "output", null, 0, -1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestResponse_Name(), this.getNameId(), "name", null, 1, 1, RequestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSentTypeEClass, RequestSentType.class, "RequestSentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestSentType_IsSynchronous(), theXMLTypePackage.getBoolean(), "isSynchronous", null, 1, 1, RequestSentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSentType_MaxConcurrentRequests(), theXMLTypePackage.getPositiveInteger(), "maxConcurrentRequests", "10", 0, 1, RequestSentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSentType_Timeout(), theXMLTypePackage.getDouble(), "timeout", null, 1, 1, RequestSentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendersTypeEClass, SendersType.class, "SendersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendersType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SendersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_Service(), this.getOpRef(), null, "service", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_Reference(), this.getOpRef(), null, "reference", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_ModuleInstance(), this.getOpRef(), null, "moduleInstance", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_Trigger(), this.getOpRefTrigger(), null, "trigger", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_DynamicTrigger(), this.getOpRef(), null, "dynamicTrigger", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSendersType_External(), this.getOpRefExternal(), null, "external", null, 0, -1, SendersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(serverTypeEClass, ServerType.class, "ServerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerType_Reference(), this.getOpRef(), null, "reference", null, 0, 1, ServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerType_ModuleInstance(), this.getOpRefActivatableFifo(), null, "moduleInstance", null, 0, 1, ServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceQoSEClass, ServiceQoS.class, "ServiceQoS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceQoS_Name(), this.getNameId(), "name", null, 1, 1, ServiceQoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceQoS_NewQoS(), theXMLTypePackage.getAnyURI(), "newQoS", null, 1, 1, ServiceQoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerInstanceEClass, TriggerInstance.class, "TriggerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(useTypeEClass, UseType.class, "UseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseType_Library(), this.getLibraryName(), "library", null, 1, 1, UseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedDataEClass, VersionedData.class, "VersionedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedData_MaxVersions(), theXMLTypePackage.getPositiveInteger(), "maxVersions", "1", 0, 1, VersionedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionedData_Name(), this.getNameId(), "name", null, 1, 1, VersionedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionedData_Type(), this.getTypeQName(), "type", null, 1, 1, VersionedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writersTypeEClass, WritersType.class, "WritersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWritersType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, WritersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWritersType_Reference(), this.getOpRef(), null, "reference", null, 0, -1, WritersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWritersType_ModuleInstance(), this.getOpRef(), null, "moduleInstance", null, 0, -1, WritersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEDataType(relativePriorityEDataType, BigInteger.class, "RelativePriority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (clientsTypeEClass,
		   source,
		   new String[] {
			   "name", "clients_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getClientsType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getClientsType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getClientsType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (componentImplementationEClass,
		   source,
		   new String[] {
			   "name", "ComponentImplementation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponentImplementation_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_ModuleType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_ModuleImplementation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleImplementation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_TriggerInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "triggerInstance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_DynamicTriggerInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dynamicTriggerInstance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentImplementation_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:8"
		   });
		addAnnotation
		  (getComponentImplementation_DataLink(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataLink",
			   "namespace", "##targetNamespace",
			   "group", "#group:8"
		   });
		addAnnotation
		  (getComponentImplementation_EventLink(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eventLink",
			   "namespace", "##targetNamespace",
			   "group", "#group:8"
		   });
		addAnnotation
		  (getComponentImplementation_RequestLink(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requestLink",
			   "namespace", "##targetNamespace",
			   "group", "#group:8"
		   });
		addAnnotation
		  (getComponentImplementation_ComponentDefinition(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "componentDefinition"
		   });
		addAnnotation
		  (dataLinkEClass,
		   source,
		   new String[] {
			   "name", "DataLink",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataLink_Writers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "writers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataLink_Readers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "readers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataLink_Controlled(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "controlled"
		   });
		addAnnotation
		  (getDataLink_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (dataReadTypeEClass,
		   source,
		   new String[] {
			   "name", "dataRead_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDataReadType_Notifying(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "notifying"
		   });
		addAnnotation
		  (dataWrittenTypeEClass,
		   source,
		   new String[] {
			   "name", "dataWritten_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDataWrittenType_WriteOnly(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "writeOnly"
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
		  (getDocumentRoot_ComponentImplementation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "componentImplementation",
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
		  (dynamicTriggerInstanceEClass,
		   source,
		   new String[] {
			   "name", "DynamicTriggerInstance",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDynamicTriggerInstance_Parameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDynamicTriggerInstance_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "name", "Event",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEvent_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEvent_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (eventLinkEClass,
		   source,
		   new String[] {
			   "name", "EventLink",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEventLink_Senders(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "senders",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEventLink_Receivers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "receivers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEventLink_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (eventReceivedTypeEClass,
		   source,
		   new String[] {
			   "name", "eventReceived_._type",
			   "kind", "elementOnly"
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
		  (instanceEClass,
		   source,
		   new String[] {
			   "name", "Instance",
			   "kind", "empty"
		   });
		addAnnotation
		  (getInstance_ModuleBehaviour(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "moduleBehaviour"
		   });
		addAnnotation
		  (getInstance_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getInstance_RelativePriority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "relativePriority"
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
		  (moduleImplementationEClass,
		   source,
		   new String[] {
			   "name", "ModuleImplementation",
			   "kind", "empty"
		   });
		addAnnotation
		  (getModuleImplementation_Language(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "language"
		   });
		addAnnotation
		  (getModuleImplementation_ModuleType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "moduleType"
		   });
		addAnnotation
		  (getModuleImplementation_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (moduleInstanceEClass,
		   source,
		   new String[] {
			   "name", "ModuleInstance",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleInstance_PropertyValues(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "propertyValues",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleInstance_Pinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleInstance_ImplementationName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "implementationName"
		   });
		addAnnotation
		  (moduleTypeEClass,
		   source,
		   new String[] {
			   "name", "ModuleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModuleType_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleType_Pinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleType_Operations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "operations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModuleType_ActivatingFaultNotifs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "activatingFaultNotifs"
		   });
		addAnnotation
		  (getModuleType_HasUserContext(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hasUserContext"
		   });
		addAnnotation
		  (getModuleType_HasWarmStartContext(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hasWarmStartContext"
		   });
		addAnnotation
		  (getModuleType_IsFaultHandler(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isFaultHandler"
		   });
		addAnnotation
		  (getModuleType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
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
		  (operationsTypeEClass,
		   source,
		   new String[] {
			   "name", "operations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOperationsType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getOperationsType_DataWritten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataWritten",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getOperationsType_DataRead(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataRead",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getOperationsType_EventSent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eventSent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getOperationsType_EventReceived(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eventReceived",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getOperationsType_RequestSent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requestSent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getOperationsType_RequestReceived(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requestReceived",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (opRefEClass,
		   source,
		   new String[] {
			   "name", "OpRef",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRef_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (getOpRef_OperationName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "operationName"
		   });
		addAnnotation
		  (opRefActivatableEClass,
		   source,
		   new String[] {
			   "name", "OpRefActivatable",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRefActivatable_Activating(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "activating"
		   });
		addAnnotation
		  (opRefActivatableFifoEClass,
		   source,
		   new String[] {
			   "name", "OpRefActivatableFifo",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRefActivatableFifo_FifoSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fifoSize"
		   });
		addAnnotation
		  (opRefActivatingFifoEClass,
		   source,
		   new String[] {
			   "name", "OpRefActivatingFifo",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRefActivatingFifo_FifoSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fifoSize"
		   });
		addAnnotation
		  (opRefExternalEClass,
		   source,
		   new String[] {
			   "name", "OpRef_External",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRefExternal_Language(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "language"
		   });
		addAnnotation
		  (getOpRefExternal_OperationName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "operationName"
		   });
		addAnnotation
		  (opRefTriggerEClass,
		   source,
		   new String[] {
			   "name", "OpRef_Trigger",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOpRefTrigger_InstanceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "instanceName"
		   });
		addAnnotation
		  (getOpRefTrigger_Period(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "period"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "name", "Parameter",
			   "kind", "empty"
		   });
		addAnnotation
		  (getParameter_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getParameter_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (pinfoTypeEClass,
		   source,
		   new String[] {
			   "name", "pinfo_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPinfoType_PublicPinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicPinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPinfoType_PrivatePinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "privatePinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pinfoType1EClass,
		   source,
		   new String[] {
			   "name", "pinfo_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPinfoType1_PublicPinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicPinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPinfoType1_PrivatePinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "privatePinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pinfoValueEClass,
		   source,
		   new String[] {
			   "name", "PinfoValue",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPinfoValue_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPinfoValue_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (privatePinfoEClass,
		   source,
		   new String[] {
			   "name", "PrivatePinfo",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPrivatePinfo_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
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
		  (propertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "properties_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertiesType_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (propertyValueEClass,
		   source,
		   new String[] {
			   "name", "PropertyValue",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPropertyValue_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPropertyValue_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (propertyValuesEClass,
		   source,
		   new String[] {
			   "name", "PropertyValues",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyValues_PropertyValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "propertyValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (publicPinfoEClass,
		   source,
		   new String[] {
			   "name", "PublicPinfo",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPublicPinfo_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (readersTypeEClass,
		   source,
		   new String[] {
			   "name", "readers_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReadersType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getReadersType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getReadersType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (receiversTypeEClass,
		   source,
		   new String[] {
			   "name", "receivers_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReceiversType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getReceiversType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getReceiversType_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getReceiversType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getReceiversType_DynamicTrigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dynamicTrigger",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (relativePriorityEDataType,
		   source,
		   new String[] {
			   "name", "RelativePriority",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			   "minInclusive", "0",
			   "maxInclusive", "255"
		   });
		addAnnotation
		  (requestLinkEClass,
		   source,
		   new String[] {
			   "name", "RequestLink",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequestLink_Clients(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clients",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestLink_Server(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "server",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestLink_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (requestReceivedTypeEClass,
		   source,
		   new String[] {
			   "name", "requestReceived_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequestReceivedType_MaxConcurrentRequests(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxConcurrentRequests"
		   });
		addAnnotation
		  (requestResponseEClass,
		   source,
		   new String[] {
			   "name", "RequestResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequestResponse_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestResponse_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestResponse_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (requestSentTypeEClass,
		   source,
		   new String[] {
			   "name", "requestSent_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequestSentType_IsSynchronous(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isSynchronous"
		   });
		addAnnotation
		  (getRequestSentType_MaxConcurrentRequests(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxConcurrentRequests"
		   });
		addAnnotation
		  (getRequestSentType_Timeout(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "timeout"
		   });
		addAnnotation
		  (sendersTypeEClass,
		   source,
		   new String[] {
			   "name", "senders_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSendersType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getSendersType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getSendersType_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getSendersType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getSendersType_Trigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "trigger",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getSendersType_DynamicTrigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dynamicTrigger",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getSendersType_External(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "external",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (serverTypeEClass,
		   source,
		   new String[] {
			   "name", "server_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServerType_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServerType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceQoSEClass,
		   source,
		   new String[] {
			   "name", "ServiceQoS",
			   "kind", "empty"
		   });
		addAnnotation
		  (getServiceQoS_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getServiceQoS_NewQoS(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "newQoS"
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
		  (triggerInstanceEClass,
		   source,
		   new String[] {
			   "name", "TriggerInstance",
			   "kind", "empty"
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
		  (versionedDataEClass,
		   source,
		   new String[] {
			   "name", "VersionedData",
			   "kind", "empty"
		   });
		addAnnotation
		  (getVersionedData_MaxVersions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxVersions"
		   });
		addAnnotation
		  (getVersionedData_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getVersionedData_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (writersTypeEClass,
		   source,
		   new String[] {
			   "name", "writers_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWritersType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getWritersType_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getWritersType_ModuleInstance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "moduleInstance",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
	}

} //impPackageImpl
