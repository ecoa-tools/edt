/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtbin.EdtbinPackage;
import edtbin.impl.EdtbinPackageImpl;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.impl.EdtdeploymentPackageImpl;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.DataLink;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkReader;
import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.DynamicTriggerEventSenderInstance;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLink;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifo;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkReceiver;
import edtimplementation.EventLinkSender;
import edtimplementation.EventLinkToDefinitionOperation;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.EventReceived;
import edtimplementation.EventReceiverInstance;
import edtimplementation.EventSenderInstance;
import edtimplementation.EventSent;
import edtimplementation.EventType;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationInheritingFromMT;
import edtimplementation.OperationInheritingFromSD;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.Parameter;
import edtimplementation.PinfoValue;
import edtimplementation.PrivatePinfo;
import edtimplementation.PrivatePinfoValue;
import edtimplementation.PropertyValue;
import edtimplementation.PublicPinfo;
import edtimplementation.PublicPinfoValue;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLink;
import edtimplementation.RequestLinkActivatableFifo;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.RequestLinkClient;
import edtimplementation.RequestLinkServer;
import edtimplementation.RequestReceived;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestResponseType;
import edtimplementation.RequestSent;
import edtimplementation.RequestServerInstance;
import edtimplementation.RequestServiceInstance;
import edtimplementation.ServRefOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.Trigger;
import edtimplementation.TriggerInstance;
import edtimplementation.TriggerSender;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;
import edtimplementation.VersionedDataType;
import edtimplementation.VersionedDataWritten;
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
public class EdtimplementationPackageImpl extends EPackageImpl implements EdtimplementationPackage {
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
	private EClass componentImplementationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationServiceEClass = null;

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
	private EClass moduleOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestResponseTypeEClass = null;

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
	private EClass eventSentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReceivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedDataWrittenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedDataReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestReceivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedDataTypeEClass = null;

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
	private EClass instanceEClass = null;

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
	private EClass triggerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerSenderEClass = null;

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
	private EClass eventSenderInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReceiverInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestClientInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestServerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWriterInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReaderInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servRefOfLinkedComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicTriggerEventReceiverInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicTriggerEventSenderInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceOfLinkedComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOfLinkedComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefinitionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestReferenceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedDataReferenceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedDataServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationLinkEClass = null;

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
	private EClass requestLinkEClass = null;

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
	private EClass dataLinkWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkActivatableFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkToServiceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkActivatableFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkActivatingFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkToDefinitionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkToDefinitionOperationFromTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkActivatingFifoFromTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLinkActivatableFifoFromTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkActivatableFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkActivatingActivatableFifoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestLinkActivatingToReferenceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicPinfoValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privatePinfoValueEClass = null;

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
	private EClass publicPinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleTypePinfoEClass = null;

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
	private EClass moduleTypePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInheritingFromSDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInheritingFromMTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSenderOperationEClass = null;

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
	 * @see edtimplementation.EdtimplementationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdtimplementationPackageImpl() {
		super(eNS_URI, EdtimplementationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdtimplementationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdtimplementationPackage init() {
		if (isInited) return (EdtimplementationPackage)EPackage.Registry.INSTANCE.getEPackage(EdtimplementationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdtimplementationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdtimplementationPackageImpl theEdtimplementationPackage = registeredEdtimplementationPackage instanceof EdtimplementationPackageImpl ? (EdtimplementationPackageImpl)registeredEdtimplementationPackage : new EdtimplementationPackageImpl();

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
		theEdtimplementationPackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtdeploymentPackage.createPackageContents();
		theEdtlogicalPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEdtqosPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theEDTTypePackage.createPackageContents();
		theTempPackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theEdtimplementationPackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtdeploymentPackage.initializePackageContents();
		theEdtlogicalPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEdtqosPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theEDTTypePackage.initializePackageContents();
		theTempPackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdtimplementationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdtimplementationPackage.eNS_URI, theEdtimplementationPackage);
		return theEdtimplementationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_UsedLibraries() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_AssociatedServiceQos() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Services() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_References() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ComponentDefinition() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ModuleTypes() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ModuleImplementations() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Instances() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ComponentDefinitionReferences() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ComponentDefinitionServices() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OperationLinks() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ExternalSenders() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ModuleBehaviours() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_BinDesc() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_InsertionPolicyList() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementationReference() {
		return componentImplementationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationReference_NewQos() {
		return (EReference)componentImplementationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationReference_ComponentDefinitionReference() {
		return (EReference)componentImplementationReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementationService() {
		return componentImplementationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationService_NewQos() {
		return (EReference)componentImplementationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationService_ComponentDefinitionService() {
		return (EReference)componentImplementationServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleType() {
		return moduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Properties() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Pinfo() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleType_Operations() {
		return (EReference)moduleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleType_ActivatingFaultNotifs() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleType_HasUserContext() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleType_HasWarmStartContext() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleType_IsFaultHandler() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleType_Name() {
		return (EAttribute)moduleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleOperation() {
		return moduleOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleOperation_Name() {
		return (EAttribute)moduleOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Input() {
		return (EReference)eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestResponseType() {
		return requestResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestResponseType_Input() {
		return (EReference)requestResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestResponseType_Output() {
		return (EReference)requestResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventSent() {
		return eventSentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventReceived() {
		return eventReceivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedDataWritten() {
		return versionedDataWrittenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionedDataWritten_WriteOnly() {
		return (EAttribute)versionedDataWrittenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedDataRead() {
		return versionedDataReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionedDataRead_Notifying() {
		return (EAttribute)versionedDataReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestSent() {
		return requestSentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestSent_IsSynchronous() {
		return (EAttribute)requestSentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestSent_MaxConcurrentRequests() {
		return (EAttribute)requestSentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestSent_Timeout() {
		return (EAttribute)requestSentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestReceived() {
		return requestReceivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestReceived_MaxConcurrentRequests() {
		return (EAttribute)requestReceivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedDataType() {
		return versionedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionedDataType_MaxVersions() {
		return (EAttribute)versionedDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersionedDataType_Type() {
		return (EReference)versionedDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleImplementation() {
		return moduleImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleImplementation_Language() {
		return (EAttribute)moduleImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleImplementation_Name() {
		return (EAttribute)moduleImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleImplementation_ModuleType() {
		return (EReference)moduleImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstance_ModuleBehaviour() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstance_Name() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstance_RelativePriority() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleInstance() {
		return moduleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstance_PropertyValues() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstance_Pinfo() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstance_ModuleType() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstance_Operations() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleInstance_ModuleImplementation() {
		return (EReference)moduleInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerInstance() {
		return triggerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerInstance_Operations() {
		return (EReference)triggerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerSender() {
		return triggerSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicTriggerInstance() {
		return dynamicTriggerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicTriggerInstance_Parameter() {
		return (EReference)dynamicTriggerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicTriggerInstance_Size() {
		return (EAttribute)dynamicTriggerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicTriggerInstance_Operations() {
		return (EReference)dynamicTriggerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventSenderInstance() {
		return eventSenderInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventReceiverInstance() {
		return eventReceiverInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestClientInstance() {
		return requestClientInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestServerInstance() {
		return requestServerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInstance() {
		return operationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationInstance_Name() {
		return (EAttribute)operationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataWriterInstance() {
		return dataWriterInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataReaderInstance() {
		return dataReaderInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServRefOfLinkedComponentDefinition() {
		return servRefOfLinkedComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServRefOfLinkedComponentDefinition_Operations() {
		return (EReference)servRefOfLinkedComponentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServRefOfLinkedComponentDefinition_ServiceDefinitionLink() {
		return (EReference)servRefOfLinkedComponentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServRefOfLinkedComponentDefinition_Name() {
		return (EAttribute)servRefOfLinkedComponentDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicTriggerEventReceiverInstance() {
		return dynamicTriggerEventReceiverInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicTriggerEventSenderInstance() {
		return dynamicTriggerEventSenderInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceOfLinkedComponentDefinition() {
		return referenceOfLinkedComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceOfLinkedComponentDefinition_ComponentDefinitionReferenceLink() {
		return (EReference)referenceOfLinkedComponentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceOfLinkedComponentDefinition() {
		return serviceOfLinkedComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOfLinkedComponentDefinition_ComponentDefinitionServiceLink() {
		return (EReference)serviceOfLinkedComponentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDefinitionInstance() {
		return eventDefinitionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestReferenceInstance() {
		return requestReferenceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestServiceInstance() {
		return requestServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedDataReferenceInstance() {
		return versionedDataReferenceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedDataServiceInstance() {
		return versionedDataServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationLink() {
		return operationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationLink_Id() {
		return (EAttribute)operationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLink() {
		return dataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataLink_Controlled() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLink() {
		return requestLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLink() {
		return eventLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLinkWriter() {
		return dataLinkWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLinkReader() {
		return dataLinkReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkSender() {
		return eventLinkSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkReceiver() {
		return eventLinkReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLinkClient() {
		return requestLinkClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLinkServer() {
		return requestLinkServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLinkActivatableFifo() {
		return dataLinkActivatableFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLinkActivatableFifo_Writer() {
		return (EReference)dataLinkActivatableFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLinkActivatableFifo_Reader() {
		return (EReference)dataLinkActivatableFifoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataLinkActivatableFifo_ReaderFifoSize() {
		return (EAttribute)dataLinkActivatableFifoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataLinkActivatableFifo_ReaderActivating() {
		return (EAttribute)dataLinkActivatableFifoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLinkToServiceOperation() {
		return dataLinkToServiceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLinkToServiceOperation_Writer() {
		return (EReference)dataLinkToServiceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataLinkToServiceOperation_Reader() {
		return (EReference)dataLinkToServiceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkActivatableFifo() {
		return eventLinkActivatableFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatableFifo_ReceiverFifoSize() {
		return (EAttribute)eventLinkActivatableFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatableFifo_ReceiverActivating() {
		return (EAttribute)eventLinkActivatableFifoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatableFifo_Sender() {
		return (EReference)eventLinkActivatableFifoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatableFifo_Receiver() {
		return (EReference)eventLinkActivatableFifoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkActivatingFifo() {
		return eventLinkActivatingFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatingFifo_ReceiverFifoSize() {
		return (EAttribute)eventLinkActivatingFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatingFifo_Sender() {
		return (EReference)eventLinkActivatingFifoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatingFifo_Receiver() {
		return (EReference)eventLinkActivatingFifoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkToDefinitionOperation() {
		return eventLinkToDefinitionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkToDefinitionOperation_Sender() {
		return (EReference)eventLinkToDefinitionOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkToDefinitionOperation_Receiver() {
		return (EReference)eventLinkToDefinitionOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkToDefinitionOperationFromTrigger() {
		return eventLinkToDefinitionOperationFromTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkToDefinitionOperationFromTrigger_Sender() {
		return (EReference)eventLinkToDefinitionOperationFromTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkToDefinitionOperationFromTrigger_Receiver() {
		return (EReference)eventLinkToDefinitionOperationFromTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkToDefinitionOperationFromTrigger_TriggerPeriod() {
		return (EAttribute)eventLinkToDefinitionOperationFromTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkActivatingFifoFromTrigger() {
		return eventLinkActivatingFifoFromTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatingFifoFromTrigger_ReceiverFifoSize() {
		return (EAttribute)eventLinkActivatingFifoFromTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatingFifoFromTrigger_Sender() {
		return (EReference)eventLinkActivatingFifoFromTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatingFifoFromTrigger_Receiver() {
		return (EReference)eventLinkActivatingFifoFromTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatingFifoFromTrigger_TriggerPeriod() {
		return (EAttribute)eventLinkActivatingFifoFromTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventLinkActivatableFifoFromTrigger() {
		return eventLinkActivatableFifoFromTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatableFifoFromTrigger_ReceiverFifoSize() {
		return (EAttribute)eventLinkActivatableFifoFromTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatableFifoFromTrigger_ReceiverActivating() {
		return (EAttribute)eventLinkActivatableFifoFromTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatableFifoFromTrigger_Sender() {
		return (EReference)eventLinkActivatableFifoFromTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventLinkActivatableFifoFromTrigger_Receiver() {
		return (EReference)eventLinkActivatableFifoFromTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventLinkActivatableFifoFromTrigger_TriggerPeriod() {
		return (EAttribute)eventLinkActivatableFifoFromTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLinkActivatableFifo() {
		return requestLinkActivatableFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatableFifo_Client() {
		return (EReference)requestLinkActivatableFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatableFifo_Server() {
		return (EReference)requestLinkActivatableFifoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatableFifo_ServerFifoSize() {
		return (EAttribute)requestLinkActivatableFifoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatableFifo_ServerActivating() {
		return (EAttribute)requestLinkActivatableFifoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLinkActivatingActivatableFifo() {
		return requestLinkActivatingActivatableFifoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatingActivatableFifo_Client() {
		return (EReference)requestLinkActivatingActivatableFifoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatingActivatableFifo_Server() {
		return (EReference)requestLinkActivatingActivatableFifoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatingActivatableFifo_ClientActivating() {
		return (EAttribute)requestLinkActivatingActivatableFifoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatingActivatableFifo_ServerFifoSize() {
		return (EAttribute)requestLinkActivatingActivatableFifoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatingActivatableFifo_ServerActivating() {
		return (EAttribute)requestLinkActivatingActivatableFifoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestLinkActivatingToReferenceOperation() {
		return requestLinkActivatingToReferenceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatingToReferenceOperation_Client() {
		return (EReference)requestLinkActivatingToReferenceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestLinkActivatingToReferenceOperation_Server() {
		return (EReference)requestLinkActivatingToReferenceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestLinkActivatingToReferenceOperation_ClientActivating() {
		return (EAttribute)requestLinkActivatingToReferenceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicPinfoValue() {
		return publicPinfoValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicPinfoValue_PublicPinfoFromModuleType() {
		return (EReference)publicPinfoValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivatePinfoValue() {
		return privatePinfoValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrivatePinfoValue_PrivatePinfoFromModuleType() {
		return (EReference)privatePinfoValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPinfoValue() {
		return pinfoValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPinfoValue_Value() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPinfoValue_Name() {
		return (EAttribute)pinfoValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivatePinfo() {
		return privatePinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicPinfo() {
		return publicPinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleTypePinfo() {
		return moduleTypePinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleTypePinfo_Name() {
		return (EAttribute)moduleTypePinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyValue_Value() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyValue_Name() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyValue_PropertyType() {
		return (EReference)propertyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyValue_ValueComponentDefinitionProperty() {
		return (EReference)propertyValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleTypeProperty() {
		return moduleTypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleTypeProperty_Name() {
		return (EAttribute)moduleTypePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleTypeProperty_Type() {
		return (EReference)moduleTypePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInheritingFromSD() {
		return operationInheritingFromSDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationInheritingFromSD_SDOperationRef() {
		return (EReference)operationInheritingFromSDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInheritingFromMT() {
		return operationInheritingFromMTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationInheritingFromMT_MTOperationRef() {
		return (EReference)operationInheritingFromMTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalSenderOperation() {
		return externalSenderOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalSenderOperation_Language() {
		return (EAttribute)externalSenderOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementation_Name() {
		return (EAttribute)componentImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtimplementationFactory getEdtimplementationFactory() {
		return (EdtimplementationFactory)getEFactoryInstance();
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
		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__USED_LIBRARIES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__SERVICES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__REFERENCES);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__NAME);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_TYPES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__INSTANCES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OPERATION_LINKS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__BIN_DESC);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST);

		componentImplementationReferenceEClass = createEClass(COMPONENT_IMPLEMENTATION_REFERENCE);
		createEReference(componentImplementationReferenceEClass, COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS);
		createEReference(componentImplementationReferenceEClass, COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE);

		componentImplementationServiceEClass = createEClass(COMPONENT_IMPLEMENTATION_SERVICE);
		createEReference(componentImplementationServiceEClass, COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS);
		createEReference(componentImplementationServiceEClass, COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE);

		moduleTypeEClass = createEClass(MODULE_TYPE);
		createEReference(moduleTypeEClass, MODULE_TYPE__PROPERTIES);
		createEReference(moduleTypeEClass, MODULE_TYPE__PINFO);
		createEReference(moduleTypeEClass, MODULE_TYPE__OPERATIONS);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__ACTIVATING_FAULT_NOTIFS);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__HAS_USER_CONTEXT);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__HAS_WARM_START_CONTEXT);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__IS_FAULT_HANDLER);
		createEAttribute(moduleTypeEClass, MODULE_TYPE__NAME);

		moduleOperationEClass = createEClass(MODULE_OPERATION);
		createEAttribute(moduleOperationEClass, MODULE_OPERATION__NAME);

		eventTypeEClass = createEClass(EVENT_TYPE);
		createEReference(eventTypeEClass, EVENT_TYPE__INPUT);

		requestResponseTypeEClass = createEClass(REQUEST_RESPONSE_TYPE);
		createEReference(requestResponseTypeEClass, REQUEST_RESPONSE_TYPE__INPUT);
		createEReference(requestResponseTypeEClass, REQUEST_RESPONSE_TYPE__OUTPUT);

		versionedDataTypeEClass = createEClass(VERSIONED_DATA_TYPE);
		createEAttribute(versionedDataTypeEClass, VERSIONED_DATA_TYPE__MAX_VERSIONS);
		createEReference(versionedDataTypeEClass, VERSIONED_DATA_TYPE__TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__TYPE);

		eventSentEClass = createEClass(EVENT_SENT);

		eventReceivedEClass = createEClass(EVENT_RECEIVED);

		versionedDataWrittenEClass = createEClass(VERSIONED_DATA_WRITTEN);
		createEAttribute(versionedDataWrittenEClass, VERSIONED_DATA_WRITTEN__WRITE_ONLY);

		versionedDataReadEClass = createEClass(VERSIONED_DATA_READ);
		createEAttribute(versionedDataReadEClass, VERSIONED_DATA_READ__NOTIFYING);

		requestSentEClass = createEClass(REQUEST_SENT);
		createEAttribute(requestSentEClass, REQUEST_SENT__IS_SYNCHRONOUS);
		createEAttribute(requestSentEClass, REQUEST_SENT__MAX_CONCURRENT_REQUESTS);
		createEAttribute(requestSentEClass, REQUEST_SENT__TIMEOUT);

		requestReceivedEClass = createEClass(REQUEST_RECEIVED);
		createEAttribute(requestReceivedEClass, REQUEST_RECEIVED__MAX_CONCURRENT_REQUESTS);

		moduleImplementationEClass = createEClass(MODULE_IMPLEMENTATION);
		createEAttribute(moduleImplementationEClass, MODULE_IMPLEMENTATION__LANGUAGE);
		createEAttribute(moduleImplementationEClass, MODULE_IMPLEMENTATION__NAME);
		createEReference(moduleImplementationEClass, MODULE_IMPLEMENTATION__MODULE_TYPE);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__MODULE_BEHAVIOUR);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEAttribute(instanceEClass, INSTANCE__RELATIVE_PRIORITY);

		triggerInstanceEClass = createEClass(TRIGGER_INSTANCE);
		createEReference(triggerInstanceEClass, TRIGGER_INSTANCE__OPERATIONS);

		triggerSenderEClass = createEClass(TRIGGER_SENDER);

		dynamicTriggerInstanceEClass = createEClass(DYNAMIC_TRIGGER_INSTANCE);
		createEReference(dynamicTriggerInstanceEClass, DYNAMIC_TRIGGER_INSTANCE__PARAMETER);
		createEAttribute(dynamicTriggerInstanceEClass, DYNAMIC_TRIGGER_INSTANCE__SIZE);
		createEReference(dynamicTriggerInstanceEClass, DYNAMIC_TRIGGER_INSTANCE__OPERATIONS);

		dynamicTriggerEventReceiverInstanceEClass = createEClass(DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE);

		dynamicTriggerEventSenderInstanceEClass = createEClass(DYNAMIC_TRIGGER_EVENT_SENDER_INSTANCE);

		moduleInstanceEClass = createEClass(MODULE_INSTANCE);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__PROPERTY_VALUES);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__PINFO);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__MODULE_TYPE);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__OPERATIONS);
		createEReference(moduleInstanceEClass, MODULE_INSTANCE__MODULE_IMPLEMENTATION);

		operationInstanceEClass = createEClass(OPERATION_INSTANCE);
		createEAttribute(operationInstanceEClass, OPERATION_INSTANCE__NAME);

		eventSenderInstanceEClass = createEClass(EVENT_SENDER_INSTANCE);

		eventReceiverInstanceEClass = createEClass(EVENT_RECEIVER_INSTANCE);

		requestClientInstanceEClass = createEClass(REQUEST_CLIENT_INSTANCE);

		requestServerInstanceEClass = createEClass(REQUEST_SERVER_INSTANCE);

		dataWriterInstanceEClass = createEClass(DATA_WRITER_INSTANCE);

		dataReaderInstanceEClass = createEClass(DATA_READER_INSTANCE);

		servRefOfLinkedComponentDefinitionEClass = createEClass(SERV_REF_OF_LINKED_COMPONENT_DEFINITION);
		createEReference(servRefOfLinkedComponentDefinitionEClass, SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS);
		createEReference(servRefOfLinkedComponentDefinitionEClass, SERV_REF_OF_LINKED_COMPONENT_DEFINITION__SERVICE_DEFINITION_LINK);
		createEAttribute(servRefOfLinkedComponentDefinitionEClass, SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME);

		referenceOfLinkedComponentDefinitionEClass = createEClass(REFERENCE_OF_LINKED_COMPONENT_DEFINITION);
		createEReference(referenceOfLinkedComponentDefinitionEClass, REFERENCE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_REFERENCE_LINK);

		serviceOfLinkedComponentDefinitionEClass = createEClass(SERVICE_OF_LINKED_COMPONENT_DEFINITION);
		createEReference(serviceOfLinkedComponentDefinitionEClass, SERVICE_OF_LINKED_COMPONENT_DEFINITION__COMPONENT_DEFINITION_SERVICE_LINK);

		eventDefinitionInstanceEClass = createEClass(EVENT_DEFINITION_INSTANCE);

		requestReferenceInstanceEClass = createEClass(REQUEST_REFERENCE_INSTANCE);

		requestServiceInstanceEClass = createEClass(REQUEST_SERVICE_INSTANCE);

		versionedDataReferenceInstanceEClass = createEClass(VERSIONED_DATA_REFERENCE_INSTANCE);

		versionedDataServiceInstanceEClass = createEClass(VERSIONED_DATA_SERVICE_INSTANCE);

		operationLinkEClass = createEClass(OPERATION_LINK);
		createEAttribute(operationLinkEClass, OPERATION_LINK__ID);

		dataLinkEClass = createEClass(DATA_LINK);
		createEAttribute(dataLinkEClass, DATA_LINK__CONTROLLED);

		requestLinkEClass = createEClass(REQUEST_LINK);

		eventLinkEClass = createEClass(EVENT_LINK);

		dataLinkWriterEClass = createEClass(DATA_LINK_WRITER);

		dataLinkReaderEClass = createEClass(DATA_LINK_READER);

		eventLinkSenderEClass = createEClass(EVENT_LINK_SENDER);

		externalSenderOperationEClass = createEClass(EXTERNAL_SENDER_OPERATION);
		createEAttribute(externalSenderOperationEClass, EXTERNAL_SENDER_OPERATION__LANGUAGE);

		eventLinkReceiverEClass = createEClass(EVENT_LINK_RECEIVER);

		requestLinkClientEClass = createEClass(REQUEST_LINK_CLIENT);

		requestLinkServerEClass = createEClass(REQUEST_LINK_SERVER);

		dataLinkActivatableFifoEClass = createEClass(DATA_LINK_ACTIVATABLE_FIFO);
		createEReference(dataLinkActivatableFifoEClass, DATA_LINK_ACTIVATABLE_FIFO__WRITER);
		createEReference(dataLinkActivatableFifoEClass, DATA_LINK_ACTIVATABLE_FIFO__READER);
		createEAttribute(dataLinkActivatableFifoEClass, DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE);
		createEAttribute(dataLinkActivatableFifoEClass, DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING);

		dataLinkToServiceOperationEClass = createEClass(DATA_LINK_TO_SERVICE_OPERATION);
		createEReference(dataLinkToServiceOperationEClass, DATA_LINK_TO_SERVICE_OPERATION__WRITER);
		createEReference(dataLinkToServiceOperationEClass, DATA_LINK_TO_SERVICE_OPERATION__READER);

		eventLinkActivatableFifoEClass = createEClass(EVENT_LINK_ACTIVATABLE_FIFO);
		createEAttribute(eventLinkActivatableFifoEClass, EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE);
		createEAttribute(eventLinkActivatableFifoEClass, EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING);
		createEReference(eventLinkActivatableFifoEClass, EVENT_LINK_ACTIVATABLE_FIFO__SENDER);
		createEReference(eventLinkActivatableFifoEClass, EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER);

		eventLinkActivatingFifoEClass = createEClass(EVENT_LINK_ACTIVATING_FIFO);
		createEAttribute(eventLinkActivatingFifoEClass, EVENT_LINK_ACTIVATING_FIFO__RECEIVER_FIFO_SIZE);
		createEReference(eventLinkActivatingFifoEClass, EVENT_LINK_ACTIVATING_FIFO__SENDER);
		createEReference(eventLinkActivatingFifoEClass, EVENT_LINK_ACTIVATING_FIFO__RECEIVER);

		eventLinkToDefinitionOperationEClass = createEClass(EVENT_LINK_TO_DEFINITION_OPERATION);
		createEReference(eventLinkToDefinitionOperationEClass, EVENT_LINK_TO_DEFINITION_OPERATION__SENDER);
		createEReference(eventLinkToDefinitionOperationEClass, EVENT_LINK_TO_DEFINITION_OPERATION__RECEIVER);

		eventLinkToDefinitionOperationFromTriggerEClass = createEClass(EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER);
		createEReference(eventLinkToDefinitionOperationFromTriggerEClass, EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__SENDER);
		createEReference(eventLinkToDefinitionOperationFromTriggerEClass, EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__RECEIVER);
		createEAttribute(eventLinkToDefinitionOperationFromTriggerEClass, EVENT_LINK_TO_DEFINITION_OPERATION_FROM_TRIGGER__TRIGGER_PERIOD);

		eventLinkActivatingFifoFromTriggerEClass = createEClass(EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER);
		createEAttribute(eventLinkActivatingFifoFromTriggerEClass, EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE);
		createEReference(eventLinkActivatingFifoFromTriggerEClass, EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER);
		createEReference(eventLinkActivatingFifoFromTriggerEClass, EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER);
		createEAttribute(eventLinkActivatingFifoFromTriggerEClass, EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD);

		eventLinkActivatableFifoFromTriggerEClass = createEClass(EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER);
		createEAttribute(eventLinkActivatableFifoFromTriggerEClass, EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE);
		createEAttribute(eventLinkActivatableFifoFromTriggerEClass, EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER_ACTIVATING);
		createEReference(eventLinkActivatableFifoFromTriggerEClass, EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__SENDER);
		createEReference(eventLinkActivatableFifoFromTriggerEClass, EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__RECEIVER);
		createEAttribute(eventLinkActivatableFifoFromTriggerEClass, EVENT_LINK_ACTIVATABLE_FIFO_FROM_TRIGGER__TRIGGER_PERIOD);

		requestLinkActivatableFifoEClass = createEClass(REQUEST_LINK_ACTIVATABLE_FIFO);
		createEReference(requestLinkActivatableFifoEClass, REQUEST_LINK_ACTIVATABLE_FIFO__CLIENT);
		createEReference(requestLinkActivatableFifoEClass, REQUEST_LINK_ACTIVATABLE_FIFO__SERVER);
		createEAttribute(requestLinkActivatableFifoEClass, REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE);
		createEAttribute(requestLinkActivatableFifoEClass, REQUEST_LINK_ACTIVATABLE_FIFO__SERVER_ACTIVATING);

		requestLinkActivatingActivatableFifoEClass = createEClass(REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO);
		createEReference(requestLinkActivatingActivatableFifoEClass, REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT);
		createEReference(requestLinkActivatingActivatableFifoEClass, REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER);
		createEAttribute(requestLinkActivatingActivatableFifoEClass, REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING);
		createEAttribute(requestLinkActivatingActivatableFifoEClass, REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE);
		createEAttribute(requestLinkActivatingActivatableFifoEClass, REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING);

		requestLinkActivatingToReferenceOperationEClass = createEClass(REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION);
		createEReference(requestLinkActivatingToReferenceOperationEClass, REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT);
		createEReference(requestLinkActivatingToReferenceOperationEClass, REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER);
		createEAttribute(requestLinkActivatingToReferenceOperationEClass, REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING);

		publicPinfoValueEClass = createEClass(PUBLIC_PINFO_VALUE);
		createEReference(publicPinfoValueEClass, PUBLIC_PINFO_VALUE__PUBLIC_PINFO_FROM_MODULE_TYPE);

		privatePinfoValueEClass = createEClass(PRIVATE_PINFO_VALUE);
		createEReference(privatePinfoValueEClass, PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE);

		pinfoValueEClass = createEClass(PINFO_VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__VALUE);
		createEAttribute(pinfoValueEClass, PINFO_VALUE__NAME);

		privatePinfoEClass = createEClass(PRIVATE_PINFO);

		publicPinfoEClass = createEClass(PUBLIC_PINFO);

		moduleTypePinfoEClass = createEClass(MODULE_TYPE_PINFO);
		createEAttribute(moduleTypePinfoEClass, MODULE_TYPE_PINFO__NAME);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__NAME);
		createEReference(propertyValueEClass, PROPERTY_VALUE__PROPERTY_TYPE);
		createEReference(propertyValueEClass, PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY);

		moduleTypePropertyEClass = createEClass(MODULE_TYPE_PROPERTY);
		createEAttribute(moduleTypePropertyEClass, MODULE_TYPE_PROPERTY__NAME);
		createEReference(moduleTypePropertyEClass, MODULE_TYPE_PROPERTY__TYPE);

		triggerEClass = createEClass(TRIGGER);

		operationInheritingFromSDEClass = createEClass(OPERATION_INHERITING_FROM_SD);
		createEReference(operationInheritingFromSDEClass, OPERATION_INHERITING_FROM_SD__SD_OPERATION_REF);

		operationInheritingFromMTEClass = createEClass(OPERATION_INHERITING_FROM_MT);
		createEReference(operationInheritingFromMTEClass, OPERATION_INHERITING_FROM_MT__MT_OPERATION_REF);
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
		EDTTypePackage theEDTTypePackage = (EDTTypePackage)EPackage.Registry.INSTANCE.getEPackage(EDTTypePackage.eNS_URI);
		EdtqosPackage theEdtqosPackage = (EdtqosPackage)EPackage.Registry.INSTANCE.getEPackage(EdtqosPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EDTProjectPackage theEDTProjectPackage = (EDTProjectPackage)EPackage.Registry.INSTANCE.getEPackage(EDTProjectPackage.eNS_URI);
		TempPackage theTempPackage = (TempPackage)EPackage.Registry.INSTANCE.getEPackage(TempPackage.eNS_URI);
		EdtbinPackage theEdtbinPackage = (EdtbinPackage)EPackage.Registry.INSTANCE.getEPackage(EdtbinPackage.eNS_URI);
		impPackage theimpPackage = (impPackage)EPackage.Registry.INSTANCE.getEPackage(impPackage.eNS_URI);
		typPackage thetypPackage = (typPackage)EPackage.Registry.INSTANCE.getEPackage(typPackage.eNS_URI);
		interPackage theinterPackage = (interPackage)EPackage.Registry.INSTANCE.getEPackage(interPackage.eNS_URI);
		EDTInterfacePackage theEDTInterfacePackage = (EDTInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(EDTInterfacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventTypeEClass.getESuperTypes().add(this.getModuleOperation());
		requestResponseTypeEClass.getESuperTypes().add(this.getModuleOperation());
		versionedDataTypeEClass.getESuperTypes().add(this.getModuleOperation());
		eventSentEClass.getESuperTypes().add(this.getEventType());
		eventReceivedEClass.getESuperTypes().add(this.getEventType());
		versionedDataWrittenEClass.getESuperTypes().add(this.getVersionedDataType());
		versionedDataReadEClass.getESuperTypes().add(this.getVersionedDataType());
		requestSentEClass.getESuperTypes().add(this.getRequestResponseType());
		requestReceivedEClass.getESuperTypes().add(this.getRequestResponseType());
		triggerInstanceEClass.getESuperTypes().add(this.getTrigger());
		triggerSenderEClass.getESuperTypes().add(this.getEventLinkSender());
		dynamicTriggerInstanceEClass.getESuperTypes().add(this.getTrigger());
		dynamicTriggerEventReceiverInstanceEClass.getESuperTypes().add(this.getEventLinkReceiver());
		dynamicTriggerEventSenderInstanceEClass.getESuperTypes().add(this.getEventLinkSender());
		moduleInstanceEClass.getESuperTypes().add(this.getInstance());
		eventSenderInstanceEClass.getESuperTypes().add(this.getEventLinkSender());
		eventSenderInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		eventReceiverInstanceEClass.getESuperTypes().add(this.getEventLinkReceiver());
		eventReceiverInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		requestClientInstanceEClass.getESuperTypes().add(this.getRequestLinkClient());
		requestClientInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		requestServerInstanceEClass.getESuperTypes().add(this.getRequestLinkServer());
		requestServerInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		dataWriterInstanceEClass.getESuperTypes().add(this.getDataLinkWriter());
		dataWriterInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		dataReaderInstanceEClass.getESuperTypes().add(this.getDataLinkReader());
		dataReaderInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromMT());
		referenceOfLinkedComponentDefinitionEClass.getESuperTypes().add(this.getServRefOfLinkedComponentDefinition());
		serviceOfLinkedComponentDefinitionEClass.getESuperTypes().add(this.getServRefOfLinkedComponentDefinition());
		eventDefinitionInstanceEClass.getESuperTypes().add(this.getEventLinkReceiver());
		eventDefinitionInstanceEClass.getESuperTypes().add(this.getEventLinkSender());
		eventDefinitionInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromSD());
		requestReferenceInstanceEClass.getESuperTypes().add(this.getRequestLinkServer());
		requestReferenceInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromSD());
		requestServiceInstanceEClass.getESuperTypes().add(this.getRequestLinkClient());
		requestServiceInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromSD());
		versionedDataReferenceInstanceEClass.getESuperTypes().add(this.getDataLinkWriter());
		versionedDataReferenceInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromSD());
		versionedDataServiceInstanceEClass.getESuperTypes().add(this.getDataLinkReader());
		versionedDataServiceInstanceEClass.getESuperTypes().add(this.getOperationInheritingFromSD());
		dataLinkEClass.getESuperTypes().add(this.getOperationLink());
		requestLinkEClass.getESuperTypes().add(this.getOperationLink());
		eventLinkEClass.getESuperTypes().add(this.getOperationLink());
		dataLinkWriterEClass.getESuperTypes().add(this.getOperationInstance());
		dataLinkReaderEClass.getESuperTypes().add(this.getOperationInstance());
		eventLinkSenderEClass.getESuperTypes().add(this.getOperationInstance());
		externalSenderOperationEClass.getESuperTypes().add(this.getEventLinkSender());
		eventLinkReceiverEClass.getESuperTypes().add(this.getOperationInstance());
		requestLinkClientEClass.getESuperTypes().add(this.getOperationInstance());
		requestLinkServerEClass.getESuperTypes().add(this.getOperationInstance());
		dataLinkActivatableFifoEClass.getESuperTypes().add(this.getDataLink());
		dataLinkToServiceOperationEClass.getESuperTypes().add(this.getDataLink());
		eventLinkActivatableFifoEClass.getESuperTypes().add(this.getEventLink());
		eventLinkActivatingFifoEClass.getESuperTypes().add(this.getEventLink());
		eventLinkToDefinitionOperationEClass.getESuperTypes().add(this.getEventLink());
		eventLinkToDefinitionOperationFromTriggerEClass.getESuperTypes().add(this.getEventLink());
		eventLinkActivatingFifoFromTriggerEClass.getESuperTypes().add(this.getEventLink());
		eventLinkActivatableFifoFromTriggerEClass.getESuperTypes().add(this.getEventLink());
		requestLinkActivatableFifoEClass.getESuperTypes().add(this.getRequestLink());
		requestLinkActivatingActivatableFifoEClass.getESuperTypes().add(this.getRequestLink());
		requestLinkActivatingToReferenceOperationEClass.getESuperTypes().add(this.getRequestLink());
		publicPinfoValueEClass.getESuperTypes().add(this.getPinfoValue());
		privatePinfoValueEClass.getESuperTypes().add(this.getPinfoValue());
		privatePinfoEClass.getESuperTypes().add(this.getModuleTypePinfo());
		publicPinfoEClass.getESuperTypes().add(this.getModuleTypePinfo());
		triggerEClass.getESuperTypes().add(this.getInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementation_UsedLibraries(), theEDTTypePackage.getLibrary(), null, "usedLibraries", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_AssociatedServiceQos(), theEdtqosPackage.getServiceInstanceQos(), null, "AssociatedServiceQos", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Services(), this.getComponentImplementationService(), null, "services", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_References(), this.getComponentImplementationReference(), null, "references", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentImplementation_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ComponentDefinition(), theEDTProjectPackage.getComponentDefinition(), null, "componentDefinition", null, 1, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleTypes(), this.getModuleType(), null, "ModuleTypes", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleImplementations(), this.getModuleImplementation(), null, "moduleImplementations", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Instances(), this.getInstance(), null, "instances", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ComponentDefinitionReferences(), this.getReferenceOfLinkedComponentDefinition(), null, "ComponentDefinitionReferences", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ComponentDefinitionServices(), this.getServiceOfLinkedComponentDefinition(), null, "ComponentDefinitionServices", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_OperationLinks(), this.getOperationLink(), null, "OperationLinks", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ExternalSenders(), this.getExternalSenderOperation(), null, "ExternalSenders", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ModuleBehaviours(), theTempPackage.getModuleBehaviour(), null, "ModuleBehaviours", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_BinDesc(), theEdtbinPackage.getBinDesc(), null, "binDesc", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_InsertionPolicyList(), theTempPackage.getInsertionPolicies(), null, "insertionPolicyList", null, 1, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentImplementationReferenceEClass, ComponentImplementationReference.class, "ComponentImplementationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementationReference_NewQos(), theEdtqosPackage.getServiceInstanceQos(), null, "newQos", null, 1, 1, ComponentImplementationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementationReference_ComponentDefinitionReference(), theEDTProjectPackage.getComponentDefinitionReference(), null, "ComponentDefinitionReference", null, 1, 1, ComponentImplementationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentImplementationServiceEClass, ComponentImplementationService.class, "ComponentImplementationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementationService_NewQos(), theEdtqosPackage.getServiceInstanceQos(), null, "newQos", null, 1, 1, ComponentImplementationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementationService_ComponentDefinitionService(), theEDTProjectPackage.getComponentDefinitionService(), null, "ComponentDefinitionService", null, 1, 1, ComponentImplementationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleTypeEClass, ModuleType.class, "ModuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleType_Properties(), this.getModuleTypeProperty(), null, "Properties", null, 1, -1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Pinfo(), this.getModuleTypePinfo(), null, "pinfo", null, 0, -1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleType_Operations(), this.getModuleOperation(), null, "operations", null, 1, -1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_ActivatingFaultNotifs(), theXMLTypePackage.getBoolean(), "activatingFaultNotifs", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_HasUserContext(), theXMLTypePackage.getBoolean(), "hasUserContext", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_HasWarmStartContext(), theXMLTypePackage.getBoolean(), "hasWarmStartContext", "true", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_IsFaultHandler(), theXMLTypePackage.getBoolean(), "isFaultHandler", "false", 0, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleType_Name(), theimpPackage.getNameId(), "name", null, 1, 1, ModuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleOperationEClass, ModuleOperation.class, "ModuleOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleOperation_Name(), thetypPackage.getNameId(), "name", null, 1, 1, ModuleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventType_Input(), this.getParameter(), null, "input", null, 0, -1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestResponseTypeEClass, RequestResponseType.class, "RequestResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestResponseType_Input(), this.getParameter(), null, "input", null, 0, -1, RequestResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestResponseType_Output(), this.getParameter(), null, "output", null, 0, -1, RequestResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedDataTypeEClass, VersionedDataType.class, "VersionedDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedDataType_MaxVersions(), theXMLTypePackage.getPositiveInteger(), "maxVersions", "1", 0, 1, VersionedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedDataType_Type(), theEDTTypePackage.getEDTDataType(), null, "type", null, 1, 1, VersionedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), theinterPackage.getNameId(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), theEDTTypePackage.getEDTDataType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSentEClass, EventSent.class, "EventSent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventReceivedEClass, EventReceived.class, "EventReceived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionedDataWrittenEClass, VersionedDataWritten.class, "VersionedDataWritten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedDataWritten_WriteOnly(), theXMLTypePackage.getBoolean(), "writeOnly", "false", 0, 1, VersionedDataWritten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedDataReadEClass, VersionedDataRead.class, "VersionedDataRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedDataRead_Notifying(), theXMLTypePackage.getBoolean(), "notifying", "false", 0, 1, VersionedDataRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSentEClass, RequestSent.class, "RequestSent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestSent_IsSynchronous(), theXMLTypePackage.getBoolean(), "isSynchronous", null, 1, 1, RequestSent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSent_MaxConcurrentRequests(), theXMLTypePackage.getPositiveInteger(), "maxConcurrentRequests", "10", 0, 1, RequestSent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSent_Timeout(), theXMLTypePackage.getDouble(), "timeout", null, 1, 1, RequestSent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestReceivedEClass, RequestReceived.class, "RequestReceived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestReceived_MaxConcurrentRequests(), theXMLTypePackage.getPositiveInteger(), "maxConcurrentRequests", "10", 0, 1, RequestReceived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleImplementationEClass, ModuleImplementation.class, "ModuleImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleImplementation_Language(), theimpPackage.getProgrammingLanguage(), "language", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleImplementation_Name(), theimpPackage.getNameId(), "name", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImplementation_ModuleType(), this.getModuleType(), null, "moduleType", null, 1, 1, ModuleImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_ModuleBehaviour(), theXMLTypePackage.getAnyURI(), "moduleBehaviour", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Name(), theimpPackage.getNameId(), "name", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_RelativePriority(), theimpPackage.getRelativePriority(), "relativePriority", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerInstanceEClass, TriggerInstance.class, "TriggerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerInstance_Operations(), this.getOperationInstance(), null, "Operations", null, 1, 1, TriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerSenderEClass, TriggerSender.class, "TriggerSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicTriggerInstanceEClass, DynamicTriggerInstance.class, "DynamicTriggerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicTriggerInstance_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, DynamicTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicTriggerInstance_Size(), theXMLTypePackage.getPositiveInteger(), "size", "1", 0, 1, DynamicTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicTriggerInstance_Operations(), this.getOperationInstance(), null, "Operations", null, 3, 3, DynamicTriggerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicTriggerEventReceiverInstanceEClass, DynamicTriggerEventReceiverInstance.class, "DynamicTriggerEventReceiverInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicTriggerEventSenderInstanceEClass, DynamicTriggerEventSenderInstance.class, "DynamicTriggerEventSenderInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleInstanceEClass, ModuleInstance.class, "ModuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstance_PropertyValues(), this.getPropertyValue(), null, "propertyValues", null, 0, -1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstance_Pinfo(), this.getPinfoValue(), null, "pinfo", null, 0, -1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstance_ModuleType(), this.getModuleType(), null, "moduleType", null, 1, 1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstance_Operations(), this.getOperationInstance(), null, "Operations", null, 1, -1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleInstance_ModuleImplementation(), this.getModuleImplementation(), null, "moduleImplementation", null, 1, 1, ModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationInstanceEClass, OperationInstance.class, "OperationInstance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationInstance_Name(), theimpPackage.getNameId(), "name", null, 1, 1, OperationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSenderInstanceEClass, EventSenderInstance.class, "EventSenderInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventReceiverInstanceEClass, EventReceiverInstance.class, "EventReceiverInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestClientInstanceEClass, RequestClientInstance.class, "RequestClientInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestServerInstanceEClass, RequestServerInstance.class, "RequestServerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataWriterInstanceEClass, DataWriterInstance.class, "DataWriterInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataReaderInstanceEClass, DataReaderInstance.class, "DataReaderInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servRefOfLinkedComponentDefinitionEClass, ServRefOfLinkedComponentDefinition.class, "ServRefOfLinkedComponentDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServRefOfLinkedComponentDefinition_Operations(), this.getOperationInstance(), null, "Operations", null, 1, -1, ServRefOfLinkedComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServRefOfLinkedComponentDefinition_ServiceDefinitionLink(), theEDTInterfacePackage.getServiceDefinition(), null, "ServiceDefinitionLink", null, 1, 1, ServRefOfLinkedComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServRefOfLinkedComponentDefinition_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, ServRefOfLinkedComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceOfLinkedComponentDefinitionEClass, ReferenceOfLinkedComponentDefinition.class, "ReferenceOfLinkedComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceOfLinkedComponentDefinition_ComponentDefinitionReferenceLink(), theEDTProjectPackage.getComponentDefinitionReference(), null, "ComponentDefinitionReferenceLink", null, 1, 1, ReferenceOfLinkedComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOfLinkedComponentDefinitionEClass, ServiceOfLinkedComponentDefinition.class, "ServiceOfLinkedComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOfLinkedComponentDefinition_ComponentDefinitionServiceLink(), theEDTProjectPackage.getComponentDefinitionService(), null, "ComponentDefinitionServiceLink", null, 1, 1, ServiceOfLinkedComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDefinitionInstanceEClass, EventDefinitionInstance.class, "EventDefinitionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestReferenceInstanceEClass, RequestReferenceInstance.class, "RequestReferenceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestServiceInstanceEClass, RequestServiceInstance.class, "RequestServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionedDataReferenceInstanceEClass, VersionedDataReferenceInstance.class, "VersionedDataReferenceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionedDataServiceInstanceEClass, VersionedDataServiceInstance.class, "VersionedDataServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationLinkEClass, OperationLink.class, "OperationLink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationLink_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, OperationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLinkEClass, DataLink.class, "DataLink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataLink_Controlled(), theXMLTypePackage.getBoolean(), "controlled", "true", 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestLinkEClass, RequestLink.class, "RequestLink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventLinkEClass, EventLink.class, "EventLink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLinkWriterEClass, DataLinkWriter.class, "DataLinkWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLinkReaderEClass, DataLinkReader.class, "DataLinkReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventLinkSenderEClass, EventLinkSender.class, "EventLinkSender", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalSenderOperationEClass, ExternalSenderOperation.class, "ExternalSenderOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalSenderOperation_Language(), theimpPackage.getProgrammingLanguage(), "language", null, 1, 1, ExternalSenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkReceiverEClass, EventLinkReceiver.class, "EventLinkReceiver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestLinkClientEClass, RequestLinkClient.class, "RequestLinkClient", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestLinkServerEClass, RequestLinkServer.class, "RequestLinkServer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLinkActivatableFifoEClass, DataLinkActivatableFifo.class, "DataLinkActivatableFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLinkActivatableFifo_Writer(), this.getDataLinkWriter(), null, "writer", null, 1, 1, DataLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLinkActivatableFifo_Reader(), this.getDataReaderInstance(), null, "reader", null, 1, 1, DataLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLinkActivatableFifo_ReaderFifoSize(), theXMLTypePackage.getPositiveInteger(), "readerFifoSize", "8", 0, 1, DataLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLinkActivatableFifo_ReaderActivating(), theXMLTypePackage.getBoolean(), "readerActivating", "true", 0, 1, DataLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLinkToServiceOperationEClass, DataLinkToServiceOperation.class, "DataLinkToServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLinkToServiceOperation_Writer(), this.getDataWriterInstance(), null, "writer", null, 1, 1, DataLinkToServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLinkToServiceOperation_Reader(), this.getVersionedDataServiceInstance(), null, "reader", null, 1, 1, DataLinkToServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkActivatableFifoEClass, EventLinkActivatableFifo.class, "EventLinkActivatableFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventLinkActivatableFifo_ReceiverFifoSize(), theXMLTypePackage.getPositiveInteger(), "receiverFifoSize", "8", 0, 1, EventLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLinkActivatableFifo_ReceiverActivating(), theXMLTypePackage.getBoolean(), "receiverActivating", "true", 0, 1, EventLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatableFifo_Sender(), this.getEventLinkSender(), null, "sender", null, 1, 1, EventLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatableFifo_Receiver(), this.getEventReceiverInstance(), null, "receiver", null, 1, 1, EventLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkActivatingFifoEClass, EventLinkActivatingFifo.class, "EventLinkActivatingFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventLinkActivatingFifo_ReceiverFifoSize(), theXMLTypePackage.getPositiveInteger(), "receiverFifoSize", "8", 0, 1, EventLinkActivatingFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatingFifo_Sender(), this.getEventLinkSender(), null, "sender", null, 1, 1, EventLinkActivatingFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatingFifo_Receiver(), this.getDynamicTriggerEventReceiverInstance(), null, "receiver", null, 1, 1, EventLinkActivatingFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkToDefinitionOperationEClass, EventLinkToDefinitionOperation.class, "EventLinkToDefinitionOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventLinkToDefinitionOperation_Sender(), this.getEventLinkSender(), null, "sender", null, 1, 1, EventLinkToDefinitionOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkToDefinitionOperation_Receiver(), this.getEventDefinitionInstance(), null, "receiver", null, 1, 1, EventLinkToDefinitionOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkToDefinitionOperationFromTriggerEClass, EventLinkToDefinitionOperationFromTrigger.class, "EventLinkToDefinitionOperationFromTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventLinkToDefinitionOperationFromTrigger_Sender(), this.getTriggerSender(), null, "sender", null, 1, 1, EventLinkToDefinitionOperationFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkToDefinitionOperationFromTrigger_Receiver(), this.getEventDefinitionInstance(), null, "receiver", null, 1, 1, EventLinkToDefinitionOperationFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLinkToDefinitionOperationFromTrigger_TriggerPeriod(), theimpPackage.getTimeDuration(), "triggerPeriod", null, 1, 1, EventLinkToDefinitionOperationFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkActivatingFifoFromTriggerEClass, EventLinkActivatingFifoFromTrigger.class, "EventLinkActivatingFifoFromTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventLinkActivatingFifoFromTrigger_ReceiverFifoSize(), theXMLTypePackage.getPositiveInteger(), "receiverFifoSize", "8", 0, 1, EventLinkActivatingFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatingFifoFromTrigger_Sender(), this.getTriggerSender(), null, "sender", null, 1, 1, EventLinkActivatingFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatingFifoFromTrigger_Receiver(), this.getDynamicTriggerEventReceiverInstance(), null, "receiver", null, 1, 1, EventLinkActivatingFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLinkActivatingFifoFromTrigger_TriggerPeriod(), theimpPackage.getTimeDuration(), "triggerPeriod", null, 1, 1, EventLinkActivatingFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventLinkActivatableFifoFromTriggerEClass, EventLinkActivatableFifoFromTrigger.class, "EventLinkActivatableFifoFromTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventLinkActivatableFifoFromTrigger_ReceiverFifoSize(), theXMLTypePackage.getPositiveInteger(), "receiverFifoSize", "8", 0, 1, EventLinkActivatableFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLinkActivatableFifoFromTrigger_ReceiverActivating(), theXMLTypePackage.getBoolean(), "receiverActivating", "true", 0, 1, EventLinkActivatableFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatableFifoFromTrigger_Sender(), this.getTriggerSender(), null, "sender", null, 1, 1, EventLinkActivatableFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventLinkActivatableFifoFromTrigger_Receiver(), this.getEventReceiverInstance(), null, "receiver", null, 1, 1, EventLinkActivatableFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventLinkActivatableFifoFromTrigger_TriggerPeriod(), theimpPackage.getTimeDuration(), "triggerPeriod", null, 1, 1, EventLinkActivatableFifoFromTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestLinkActivatableFifoEClass, RequestLinkActivatableFifo.class, "RequestLinkActivatableFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestLinkActivatableFifo_Client(), this.getRequestServiceInstance(), null, "client", null, 1, 1, RequestLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestLinkActivatableFifo_Server(), this.getRequestServerInstance(), null, "server", null, 1, 1, RequestLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatableFifo_ServerFifoSize(), theXMLTypePackage.getPositiveInteger(), "serverFifoSize", "8", 0, 1, RequestLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatableFifo_ServerActivating(), theXMLTypePackage.getBoolean(), "serverActivating", "true", 0, 1, RequestLinkActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestLinkActivatingActivatableFifoEClass, RequestLinkActivatingActivatableFifo.class, "RequestLinkActivatingActivatableFifo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestLinkActivatingActivatableFifo_Client(), this.getRequestClientInstance(), null, "client", null, 1, 1, RequestLinkActivatingActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestLinkActivatingActivatableFifo_Server(), this.getRequestServerInstance(), null, "server", null, 1, 1, RequestLinkActivatingActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatingActivatableFifo_ClientActivating(), theXMLTypePackage.getBoolean(), "clientActivating", "true", 0, 1, RequestLinkActivatingActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatingActivatableFifo_ServerFifoSize(), theXMLTypePackage.getPositiveInteger(), "serverFifoSize", "8", 0, 1, RequestLinkActivatingActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatingActivatableFifo_ServerActivating(), theXMLTypePackage.getBoolean(), "serverActivating", "true", 0, 1, RequestLinkActivatingActivatableFifo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestLinkActivatingToReferenceOperationEClass, RequestLinkActivatingToReferenceOperation.class, "RequestLinkActivatingToReferenceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestLinkActivatingToReferenceOperation_Client(), this.getRequestClientInstance(), null, "client", null, 1, 1, RequestLinkActivatingToReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestLinkActivatingToReferenceOperation_Server(), this.getRequestReferenceInstance(), null, "server", null, 1, 1, RequestLinkActivatingToReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestLinkActivatingToReferenceOperation_ClientActivating(), theXMLTypePackage.getBoolean(), "clientActivating", "true", 0, 1, RequestLinkActivatingToReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicPinfoValueEClass, PublicPinfoValue.class, "PublicPinfoValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicPinfoValue_PublicPinfoFromModuleType(), this.getPublicPinfo(), null, "PublicPinfoFromModuleType", null, 1, 1, PublicPinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privatePinfoValueEClass, PrivatePinfoValue.class, "PrivatePinfoValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivatePinfoValue_PrivatePinfoFromModuleType(), this.getPrivatePinfo(), null, "PrivatePinfoFromModuleType", null, 1, 1, PrivatePinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinfoValueEClass, PinfoValue.class, "PinfoValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinfoValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPinfoValue_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PinfoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privatePinfoEClass, PrivatePinfo.class, "PrivatePinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicPinfoEClass, PublicPinfo.class, "PublicPinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleTypePinfoEClass, ModuleTypePinfo.class, "ModuleTypePinfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleTypePinfo_Name(), theimpPackage.getNameId(), "name", null, 1, 1, ModuleTypePinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValue_PropertyType(), this.getModuleTypeProperty(), null, "propertyType", null, 1, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValue_ValueComponentDefinitionProperty(), theEDTProjectPackage.getProperty(), null, "ValueComponentDefinitionProperty", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleTypePropertyEClass, ModuleTypeProperty.class, "ModuleTypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleTypeProperty_Name(), theinterPackage.getNameId(), "name", null, 1, 1, ModuleTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleTypeProperty_Type(), theEDTTypePackage.getEDTDataType(), null, "type", null, 1, 1, ModuleTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationInheritingFromSDEClass, OperationInheritingFromSD.class, "OperationInheritingFromSD", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInheritingFromSD_SDOperationRef(), theEDTInterfacePackage.getOperationType(), null, "SDOperationRef", null, 1, 1, OperationInheritingFromSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationInheritingFromMTEClass, OperationInheritingFromMT.class, "OperationInheritingFromMT", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInheritingFromMT_MTOperationRef(), this.getModuleOperation(), null, "MTOperationRef", null, 1, 1, OperationInheritingFromMT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EdtimplementationPackageImpl
