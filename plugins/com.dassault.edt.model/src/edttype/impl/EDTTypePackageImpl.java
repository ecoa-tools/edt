/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

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
import edttype.Array;
import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypeFactory;
import edttype.EDTTypePackage;
import edttype.EnumPredefined;
import edttype.EnumValue;
import edttype.EnumValuePredefined;
import edttype.Field;
import edttype.FieldPredefined;
import edttype.FixedArray;
import edttype.Library;
import edttype.PredefinedType;
import edttype.RecordPredefined;
import edttype.Simple;
import edttype.SimplePredefined;
import edttype.Union;
import edttype.VariantRecord;
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
public class EDTTypePackageImpl extends EPackageImpl implements EDTTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edtDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumPredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValuePredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordPredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldPredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayPredefinedEClass = null;

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
	 * @see edttype.EDTTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EDTTypePackageImpl() {
		super(eNS_URI, EDTTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EDTTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EDTTypePackage init() {
		if (isInited) return (EDTTypePackage)EPackage.Registry.INSTANCE.getEPackage(EDTTypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEDTTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EDTTypePackageImpl theEDTTypePackage = registeredEDTTypePackage instanceof EDTTypePackageImpl ? (EDTTypePackageImpl)registeredEDTTypePackage : new EDTTypePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TempPackage.eNS_URI);
		TempPackageImpl theTempPackage = (TempPackageImpl)(registeredPackage instanceof TempPackageImpl ? registeredPackage : TempPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtudpPackage.eNS_URI);
		EdtudpPackageImpl theEdtudpPackage = (EdtudpPackageImpl)(registeredPackage instanceof EdtudpPackageImpl ? registeredPackage : EdtudpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdtuidPackage.eNS_URI);
		EdtuidPackageImpl theEdtuidPackage = (EdtuidPackageImpl)(registeredPackage instanceof EdtuidPackageImpl ? registeredPackage : EdtuidPackage.eINSTANCE);

		// Create package meta-data objects
		theEDTTypePackage.createPackageContents();
		theEdtbinPackage.createPackageContents();
		theEdtdeploymentPackage.createPackageContents();
		theEdtimplementationPackage.createPackageContents();
		theEdtlogicalPackage.createPackageContents();
		theEDTProjectPackage.createPackageContents();
		theEdtqosPackage.createPackageContents();
		theEDTInterfacePackage.createPackageContents();
		theTempPackage.createPackageContents();
		theEdtudpPackage.createPackageContents();
		theEdtuidPackage.createPackageContents();

		// Initialize created meta-data
		theEDTTypePackage.initializePackageContents();
		theEdtbinPackage.initializePackageContents();
		theEdtdeploymentPackage.initializePackageContents();
		theEdtimplementationPackage.initializePackageContents();
		theEdtlogicalPackage.initializePackageContents();
		theEDTProjectPackage.initializePackageContents();
		theEdtqosPackage.initializePackageContents();
		theEDTInterfacePackage.initializePackageContents();
		theTempPackage.initializePackageContents();
		theEdtudpPackage.initializePackageContents();
		theEdtuidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEDTTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EDTTypePackage.eNS_URI, theEDTTypePackage);
		return theEDTTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDTDataType() {
		return edtDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDTDataType_Name() {
		return (EAttribute)edtDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDTDataType_Comment() {
		return (EAttribute)edtDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_MaxRange() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_MinRange() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Precision() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Unit() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_Type() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_MaxRangeType() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_MinRangeType() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_PrecisionType() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecord_Field() {
		return (EReference)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstant_Type() {
		return (EReference)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstant_ValueType() {
		return (EReference)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantRecord() {
		return variantRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantRecord_Field() {
		return (EReference)variantRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantRecord_Union() {
		return (EReference)variantRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantRecord_SelectName() {
		return (EAttribute)variantRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantRecord_SelectType() {
		return (EReference)variantRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArray_MaxNumber() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArray_ItemType() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArray_MaxNumberType() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedArray() {
		return fixedArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedArray_MaxNumber() {
		return (EAttribute)fixedArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedArray_ItemType() {
		return (EReference)fixedArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedArray_MaxNumberType() {
		return (EReference)fixedArrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum_Value() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum_Type() {
		return (EReference)enumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicType() {
		return basicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_DataTypes() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_UsedLibraries() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnion_Comment() {
		return (EAttribute)unionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnion_Name() {
		return (EAttribute)unionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnion_When() {
		return (EAttribute)unionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnion_Type() {
		return (EReference)unionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Comment() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValue_Comment() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValue_Name() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValue_Valnum() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumValue_ValnumType() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredefinedType() {
		return predefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumPredefined() {
		return enumPredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumPredefined_Value() {
		return (EReference)enumPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumPredefined_Type() {
		return (EReference)enumPredefinedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumValuePredefined() {
		return enumValuePredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValuePredefined_Name() {
		return (EAttribute)enumValuePredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValuePredefined_Valnum() {
		return (EAttribute)enumValuePredefinedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordPredefined() {
		return recordPredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordPredefined_Field() {
		return (EReference)recordPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldPredefined() {
		return fieldPredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFieldPredefined_Name() {
		return (EAttribute)fieldPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldPredefined_Type() {
		return (EReference)fieldPredefinedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimplePredefined() {
		return simplePredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimplePredefined_Type() {
		return (EReference)simplePredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayPredefined() {
		return arrayPredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayPredefined_MaxNumber() {
		return (EAttribute)arrayPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayPredefined_ItemType() {
		return (EReference)arrayPredefinedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDTTypeFactory getEDTTypeFactory() {
		return (EDTTypeFactory)getEFactoryInstance();
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
		edtDataTypeEClass = createEClass(EDT_DATA_TYPE);
		createEAttribute(edtDataTypeEClass, EDT_DATA_TYPE__NAME);
		createEAttribute(edtDataTypeEClass, EDT_DATA_TYPE__COMMENT);

		simpleEClass = createEClass(SIMPLE);
		createEAttribute(simpleEClass, SIMPLE__MAX_RANGE);
		createEAttribute(simpleEClass, SIMPLE__MIN_RANGE);
		createEAttribute(simpleEClass, SIMPLE__PRECISION);
		createEAttribute(simpleEClass, SIMPLE__UNIT);
		createEReference(simpleEClass, SIMPLE__TYPE);
		createEReference(simpleEClass, SIMPLE__MAX_RANGE_TYPE);
		createEReference(simpleEClass, SIMPLE__MIN_RANGE_TYPE);
		createEReference(simpleEClass, SIMPLE__PRECISION_TYPE);

		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__FIELD);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);
		createEReference(constantEClass, CONSTANT__TYPE);
		createEReference(constantEClass, CONSTANT__VALUE_TYPE);

		variantRecordEClass = createEClass(VARIANT_RECORD);
		createEReference(variantRecordEClass, VARIANT_RECORD__FIELD);
		createEReference(variantRecordEClass, VARIANT_RECORD__UNION);
		createEAttribute(variantRecordEClass, VARIANT_RECORD__SELECT_NAME);
		createEReference(variantRecordEClass, VARIANT_RECORD__SELECT_TYPE);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__MAX_NUMBER);
		createEReference(arrayEClass, ARRAY__ITEM_TYPE);
		createEReference(arrayEClass, ARRAY__MAX_NUMBER_TYPE);

		fixedArrayEClass = createEClass(FIXED_ARRAY);
		createEAttribute(fixedArrayEClass, FIXED_ARRAY__MAX_NUMBER);
		createEReference(fixedArrayEClass, FIXED_ARRAY__ITEM_TYPE);
		createEReference(fixedArrayEClass, FIXED_ARRAY__MAX_NUMBER_TYPE);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__VALUE);
		createEReference(enumEClass, ENUM__TYPE);

		basicTypeEClass = createEClass(BASIC_TYPE);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__DATA_TYPES);
		createEReference(libraryEClass, LIBRARY__USED_LIBRARIES);
		createEAttribute(libraryEClass, LIBRARY__NAME);

		unionEClass = createEClass(UNION);
		createEAttribute(unionEClass, UNION__COMMENT);
		createEAttribute(unionEClass, UNION__NAME);
		createEAttribute(unionEClass, UNION__WHEN);
		createEReference(unionEClass, UNION__TYPE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__COMMENT);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__COMMENT);
		createEAttribute(enumValueEClass, ENUM_VALUE__NAME);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALNUM);
		createEReference(enumValueEClass, ENUM_VALUE__VALNUM_TYPE);

		predefinedTypeEClass = createEClass(PREDEFINED_TYPE);

		enumPredefinedEClass = createEClass(ENUM_PREDEFINED);
		createEReference(enumPredefinedEClass, ENUM_PREDEFINED__VALUE);
		createEReference(enumPredefinedEClass, ENUM_PREDEFINED__TYPE);

		enumValuePredefinedEClass = createEClass(ENUM_VALUE_PREDEFINED);
		createEAttribute(enumValuePredefinedEClass, ENUM_VALUE_PREDEFINED__NAME);
		createEAttribute(enumValuePredefinedEClass, ENUM_VALUE_PREDEFINED__VALNUM);

		recordPredefinedEClass = createEClass(RECORD_PREDEFINED);
		createEReference(recordPredefinedEClass, RECORD_PREDEFINED__FIELD);

		fieldPredefinedEClass = createEClass(FIELD_PREDEFINED);
		createEAttribute(fieldPredefinedEClass, FIELD_PREDEFINED__NAME);
		createEReference(fieldPredefinedEClass, FIELD_PREDEFINED__TYPE);

		simplePredefinedEClass = createEClass(SIMPLE_PREDEFINED);
		createEReference(simplePredefinedEClass, SIMPLE_PREDEFINED__TYPE);

		arrayPredefinedEClass = createEClass(ARRAY_PREDEFINED);
		createEAttribute(arrayPredefinedEClass, ARRAY_PREDEFINED__MAX_NUMBER);
		createEReference(arrayPredefinedEClass, ARRAY_PREDEFINED__ITEM_TYPE);
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
		typPackage thetypPackage = (typPackage)EPackage.Registry.INSTANCE.getEPackage(typPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleEClass.getESuperTypes().add(this.getEDTDataType());
		recordEClass.getESuperTypes().add(this.getEDTDataType());
		constantEClass.getESuperTypes().add(this.getEDTDataType());
		variantRecordEClass.getESuperTypes().add(this.getEDTDataType());
		arrayEClass.getESuperTypes().add(this.getEDTDataType());
		fixedArrayEClass.getESuperTypes().add(this.getEDTDataType());
		enumEClass.getESuperTypes().add(this.getEDTDataType());
		basicTypeEClass.getESuperTypes().add(this.getEDTDataType());
		predefinedTypeEClass.getESuperTypes().add(this.getEDTDataType());
		enumPredefinedEClass.getESuperTypes().add(this.getPredefinedType());
		recordPredefinedEClass.getESuperTypes().add(this.getPredefinedType());
		simplePredefinedEClass.getESuperTypes().add(this.getPredefinedType());
		arrayPredefinedEClass.getESuperTypes().add(this.getPredefinedType());

		// Initialize classes, features, and operations; add parameters
		initEClass(edtDataTypeEClass, EDTDataType.class, "EDTDataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDTDataType_Name(), thetypPackage.getTypeName(), "Name", null, 1, 1, EDTDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDTDataType_Comment(), theXMLTypePackage.getString(), "Comment", null, 0, 1, EDTDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple_MaxRange(), thetypPackage.getConstantReferenceOrValue(), "maxRange", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_MinRange(), thetypPackage.getConstantReferenceOrValue(), "minRange", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Precision(), thetypPackage.getConstantReferenceOrValue(), "precision", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_MaxRangeType(), this.getConstant(), null, "maxRangeType", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_MinRangeType(), this.getConstant(), null, "minRangeType", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_PrecisionType(), this.getConstant(), null, "precisionType", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordEClass, edttype.Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_Field(), this.getField(), null, "field", null, 1, -1, edttype.Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), thetypPackage.getConstantReferenceOrValue(), "value", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstant_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstant_ValueType(), this.getConstant(), null, "valueType", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantRecordEClass, VariantRecord.class, "VariantRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariantRecord_Field(), this.getField(), null, "field", null, 0, -1, VariantRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariantRecord_Union(), this.getUnion(), null, "union", null, 1, -1, VariantRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariantRecord_SelectName(), thetypPackage.getNameId(), "selectName", null, 1, 1, VariantRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariantRecord_SelectType(), this.getEDTDataType(), null, "SelectType", null, 1, 1, VariantRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_MaxNumber(), thetypPackage.getConstantReferenceOrPositiveIntegerValue(), "maxNumber", null, 1, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_ItemType(), this.getEDTDataType(), null, "ItemType", null, 1, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_MaxNumberType(), this.getConstant(), null, "maxNumberType", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedArrayEClass, FixedArray.class, "FixedArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedArray_MaxNumber(), thetypPackage.getConstantReferenceOrPositiveIntegerValue(), "maxNumber", null, 1, 1, FixedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedArray_ItemType(), this.getEDTDataType(), null, "ItemType", null, 1, 1, FixedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedArray_MaxNumberType(), this.getConstant(), null, "maxNumberType", null, 0, 1, FixedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, edttype.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Value(), this.getEnumValue(), null, "value", null, 1, -1, edttype.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnum_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, edttype.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_DataTypes(), this.getEDTDataType(), null, "DataTypes", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_UsedLibraries(), this.getLibrary(), null, "usedLibraries", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_Name(), thetypPackage.getLibraryName(), "Name", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnion_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnion_Name(), thetypPackage.getNameId(), "name", null, 1, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnion_When(), theXMLTypePackage.getString(), "when", null, 1, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_Type(), this.getEDTDataType(), null, "type", null, 1, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Name(), thetypPackage.getNameId(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValue_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValue_Name(), thetypPackage.getTypeName(), "name", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValue_Valnum(), thetypPackage.getConstantReferenceOrIntegerValue(), "valnum", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumValue_ValnumType(), this.getConstant(), null, "valnumType", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedTypeEClass, PredefinedType.class, "PredefinedType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumPredefinedEClass, EnumPredefined.class, "EnumPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumPredefined_Value(), this.getEnumValuePredefined(), null, "value", null, 1, -1, EnumPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumPredefined_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, EnumPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValuePredefinedEClass, EnumValuePredefined.class, "EnumValuePredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValuePredefined_Name(), thetypPackage.getTypeName(), "name", null, 1, 1, EnumValuePredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValuePredefined_Valnum(), thetypPackage.getConstantReferenceOrIntegerValue(), "valnum", null, 0, 1, EnumValuePredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordPredefinedEClass, RecordPredefined.class, "RecordPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordPredefined_Field(), this.getFieldPredefined(), null, "field", null, 1, -1, RecordPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldPredefinedEClass, FieldPredefined.class, "FieldPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldPredefined_Name(), thetypPackage.getNameId(), "name", null, 1, 1, FieldPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldPredefined_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, FieldPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePredefinedEClass, SimplePredefined.class, "SimplePredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePredefined_Type(), this.getEDTDataType(), null, "Type", null, 1, 1, SimplePredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayPredefinedEClass, ArrayPredefined.class, "ArrayPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayPredefined_MaxNumber(), thetypPackage.getConstantReferenceOrPositiveIntegerValue(), "maxNumber", null, 1, 1, ArrayPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayPredefined_ItemType(), this.getEDTDataType(), null, "ItemType", null, 1, 1, ArrayPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EDTTypesPackageImpl
