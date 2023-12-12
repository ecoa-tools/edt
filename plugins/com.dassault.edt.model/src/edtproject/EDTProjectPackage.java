/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edtproject.EDTProjectFactory
 * @model kind="package"
 * @generated
 */
public interface EDTProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtproject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "EDTProject2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EDTProject2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	EDTProjectPackage eINSTANCE = edtproject.impl.EDTProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtproject.impl.StepsImpl <em>Steps</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.StepsImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__STEP = 0;

	/**
	 * The feature id for the '<em><b>Output Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__OUTPUT_DIRECTORY = 1;

	/**
	 * The number of structural features of the '<em>Steps</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.Step <em>Step</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.Step
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 14;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__FOLDER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step0Impl <em>Step0</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step0Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep0()
	 * @generated
	 */
	int STEP0 = 1;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP0__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP0__TYPES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP0__BASIC_TYPES = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecoa Predefined Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP0__ECOA_PREDEFINED_TYPES = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step0</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP0_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Step0</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP0_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step1Impl <em>Step1</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step1Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep1()
	 * @generated
	 */
	int STEP1 = 2;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP1__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP1__SERVICES = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step1</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP1_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step1</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP1_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step2Impl <em>Step2</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step2Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep2()
	 * @generated
	 */
	int STEP2 = 3;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP2__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Component Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP2__COMPONENT_DEFINITIONS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step2</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP2_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step2</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP2_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step3Impl <em>Step3</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step3Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep3()
	 * @generated
	 */
	int STEP3 = 4;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP3__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Initial Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP3__INITIAL_ASSEMBLY = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step3</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP3_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step3</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP3_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step4Impl <em>Step4</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step4Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep4()
	 * @generated
	 */
	int STEP4 = 5;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP4__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Component Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP4__COMPONENT_IMPLEMENTATIONS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step4</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP4_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step4</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP4_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.Step5Impl <em>Step5</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see edtproject.impl.Step5Impl
	 * @see edtproject.impl.EDTProjectPackageImpl#getStep5()
	 * @generated
	 */
	int STEP5 = 6;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP5__FOLDER_NAME = STEP__FOLDER_NAME;

	/**
	 * The feature id for the '<em><b>Logical System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__LOGICAL_SYSTEM = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__DEPLOYMENT = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>UDP Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__UDP_BINDINGS = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cross Platform View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__CROSS_PLATFORM_VIEW = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IDS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__IDS = STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5__FINAL_ASSEMBLY = STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Step5</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP5_FEATURE_COUNT = STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Step5</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP5_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.CompositeImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET_NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SERVICE_LINKS = 6;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentDefinitionImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinition()
	 * @generated
	 */
	int COMPONENT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Associated Service Qos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS = 4;

	/**
	 * The number of structural features of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Component References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Component Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Component Definition Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_DEFINITION_VERSION = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ContractImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 19;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__QOS = 1;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentDefinitionReferenceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinitionReference()
	 * @generated
	 */
	int COMPONENT_DEFINITION_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__SYNTAX = CONTRACT__SYNTAX;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__QOS = CONTRACT__QOS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__NAME = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentDefinitionServiceImpl <em>Component Definition Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentDefinitionServiceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinitionService()
	 * @generated
	 */
	int COMPONENT_DEFINITION_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_SERVICE__SYNTAX = CONTRACT__SYNTAX;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_SERVICE__QOS = CONTRACT__QOS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_SERVICE__NAME = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Definition Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Definition Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_SERVICE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.PropertyImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Must Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUST_SUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 3;

	/**
	 * The feature id for the '<em><b>ECOASCA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ECOASCA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>ECOASCA Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ECOASCA_LIBRARY = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentPropertyImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentProperty()
	 * @generated
	 */
	int COMPONENT_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Component Definition Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__FILE = 1;

	/**
	 * The feature id for the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__SOURCE_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__NAME = 5;

	/**
	 * The number of structural features of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentReferenceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentReference()
	 * @generated
	 */
	int COMPONENT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Component Definition Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ComponentServiceImpl <em>Component Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ComponentServiceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getComponentService()
	 * @generated
	 */
	int COMPONENT_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Component Definition Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Component Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.CompositeReferenceImpl <em>Composite Reference</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see edtproject.impl.CompositeReferenceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getCompositeReference()
	 * @generated
	 */
	int COMPOSITE_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE__SYNTAX = CONTRACT__SYNTAX;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE__QOS = CONTRACT__QOS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE__PROMOTE = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE__NAME = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Reference</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.CompositeServiceImpl
	 * <em>Composite Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see edtproject.impl.CompositeServiceImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getCompositeService()
	 * @generated
	 */
	int COMPOSITE_SERVICE = 18;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE__SYNTAX = CONTRACT__SYNTAX;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE__QOS = CONTRACT__QOS;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE__PROMOTE = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE__NAME = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Service</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SERVICE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.FinalAssemblyImpl <em>Final Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.FinalAssemblyImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getFinalAssembly()
	 * @generated
	 */
	int FINAL_ASSEMBLY = 20;

	/**
	 * The feature id for the '<em><b>Final Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ASSEMBLY__FINAL_ASSEMBLY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ASSEMBLY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Final Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ASSEMBLY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Final Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ASSEMBLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.OutputDirectoryImpl <em>Output Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.OutputDirectoryImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getOutputDirectory()
	 * @generated
	 */
	int OUTPUT_DIRECTORY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DIRECTORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Output Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DIRECTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DIRECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtproject.impl.ServiceLinkImpl <em>Service Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtproject.impl.ServiceLinkImpl
	 * @see edtproject.impl.EDTProjectPackageImpl#getServiceLink()
	 * @generated
	 */
	int SERVICE_LINK = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Service Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edtproject.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps</em>'.
	 * @see edtproject.Steps
	 * @generated
	 */
	EClass getSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Steps#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see edtproject.Steps#getStep()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Step();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Steps#getOutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Directory</em>'.
	 * @see edtproject.Steps#getOutputDirectory()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_OutputDirectory();

	/**
	 * Returns the meta object for class '{@link edtproject.Step0 <em>Step0</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step0</em>'.
	 * @see edtproject.Step0
	 * @generated
	 */
	EClass getStep0();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step0#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see edtproject.Step0#getTypes()
	 * @see #getStep0()
	 * @generated
	 */
	EReference getStep0_Types();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edtproject.Step0#getBasicTypes <em>Basic Types</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Basic
	 *         Types</em>'.
	 * @see edtproject.Step0#getBasicTypes()
	 * @see #getStep0()
	 * @generated
	 */
	EReference getStep0_BasicTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step0#getEcoaPredefinedTypes <em>Ecoa Predefined Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecoa Predefined Types</em>'.
	 * @see edtproject.Step0#getEcoaPredefinedTypes()
	 * @see #getStep0()
	 * @generated
	 */
	EReference getStep0_EcoaPredefinedTypes();

	/**
	 * Returns the meta object for class '{@link edtproject.Step1 <em>Step1</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step1</em>'.
	 * @see edtproject.Step1
	 * @generated
	 */
	EClass getStep1();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edtproject.Step1#getServices <em>Services</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Services</em>'.
	 * @see edtproject.Step1#getServices()
	 * @see #getStep1()
	 * @generated
	 */
	EReference getStep1_Services();

	/**
	 * Returns the meta object for class '{@link edtproject.Step2 <em>Step2</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step2</em>'.
	 * @see edtproject.Step2
	 * @generated
	 */
	EClass getStep2();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step2#getComponentDefinitions <em>Component Definitions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Definitions</em>'.
	 * @see edtproject.Step2#getComponentDefinitions()
	 * @see #getStep2()
	 * @generated
	 */
	EReference getStep2_ComponentDefinitions();

	/**
	 * Returns the meta object for class '{@link edtproject.Step3 <em>Step3</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step3</em>'.
	 * @see edtproject.Step3
	 * @generated
	 */
	EClass getStep3();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Step3#getInitialAssembly <em>Initial Assembly</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Assembly</em>'.
	 * @see edtproject.Step3#getInitialAssembly()
	 * @see #getStep3()
	 * @generated
	 */
	EReference getStep3_InitialAssembly();

	/**
	 * Returns the meta object for class '{@link edtproject.Step4 <em>Step4</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step4</em>'.
	 * @see edtproject.Step4
	 * @generated
	 */
	EClass getStep4();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step4#getComponentImplementations <em>Component Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Implementations</em>'.
	 * @see edtproject.Step4#getComponentImplementations()
	 * @see #getStep4()
	 * @generated
	 */
	EReference getStep4_ComponentImplementations();

	/**
	 * Returns the meta object for class '{@link edtproject.Step5 <em>Step5</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step5</em>'.
	 * @see edtproject.Step5
	 * @generated
	 */
	EClass getStep5();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Step5#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical System</em>'.
	 * @see edtproject.Step5#getLogicalSystem()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_LogicalSystem();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Step5#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment</em>'.
	 * @see edtproject.Step5#getDeployment()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_Deployment();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step5#getUDPBindings <em>UDP Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UDP Bindings</em>'.
	 * @see edtproject.Step5#getUDPBindings()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_UDPBindings();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Step5#getFinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Assembly</em>'.
	 * @see edtproject.Step5#getFinalAssembly()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_FinalAssembly();

	/**
	 * Returns the meta object for the containment reference '{@link edtproject.Step5#getCrossPlatformView <em>Cross Platform View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cross Platform View</em>'.
	 * @see edtproject.Step5#getCrossPlatformView()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_CrossPlatformView();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Step5#getIDS <em>IDS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDS</em>'.
	 * @see edtproject.Step5#getIDS()
	 * @see #getStep5()
	 * @generated
	 */
	EReference getStep5_IDS();

	/**
	 * Returns the meta object for class '{@link edtproject.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see edtproject.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Composite#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see edtproject.Composite#getComponents()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Composite#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edtproject.Composite#getProperties()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Properties();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Composite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.Composite#getName()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Composite#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see edtproject.Composite#getReferences()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_References();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Composite#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see edtproject.Composite#getServices()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Services();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Composite#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see edtproject.Composite#getTargetNamespace()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Composite#getServiceLinks <em>Service Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Links</em>'.
	 * @see edtproject.Composite#getServiceLinks()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ServiceLinks();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition</em>'.
	 * @see edtproject.ComponentDefinition
	 * @generated
	 */
	EClass getComponentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentDefinition#getName()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EAttribute getComponentDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.ComponentDefinition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edtproject.ComponentDefinition#getProperties()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.ComponentDefinition#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see edtproject.ComponentDefinition#getReferences()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_References();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.ComponentDefinition#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see edtproject.ComponentDefinition#getServices()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.ComponentDefinition#getAssociatedServiceQos <em>Associated Service Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Service Qos</em>'.
	 * @see edtproject.ComponentDefinition#getAssociatedServiceQos()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_AssociatedServiceQos();

	/**
	 * Returns the meta object for class '{@link edtproject.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see edtproject.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Component#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see edtproject.Component#getComponentDefinition()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Component#getComponentReferences <em>Component References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component References</em>'.
	 * @see edtproject.Component#getComponentReferences()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Component#getComponentServices <em>Component Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Services</em>'.
	 * @see edtproject.Component#getComponentServices()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentServices();

	/**
	 * Returns the meta object for the containment reference list '{@link edtproject.Component#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edtproject.Component#getProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Properties();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Component#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Implementation</em>'.
	 * @see edtproject.Component#getComponentImplementation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentImplementation();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Component#getComponentDefinitionVersion <em>Component Definition Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Definition Version</em>'.
	 * @see edtproject.Component#getComponentDefinitionVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentDefinitionVersion();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Reference</em>'.
	 * @see edtproject.ComponentDefinitionReference
	 * @generated
	 */
	EClass getComponentDefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentDefinitionReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentDefinitionReference#getName()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentDefinitionReference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see edtproject.ComponentDefinitionReference#getMultiplicity()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_Multiplicity();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentDefinitionService <em>Component Definition Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Service</em>'.
	 * @see edtproject.ComponentDefinitionService
	 * @generated
	 */
	EClass getComponentDefinitionService();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentDefinitionService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentDefinitionService#getName()
	 * @see #getComponentDefinitionService()
	 * @generated
	 */
	EAttribute getComponentDefinitionService_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edtproject.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property</em>'.
	 * @see edtproject.ComponentProperty
	 * @generated
	 */
	EClass getComponentProperty();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ComponentProperty#getComponentDefinitionProperty <em>Component Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Property</em>'.
	 * @see edtproject.ComponentProperty#getComponentDefinitionProperty()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EReference getComponentProperty_ComponentDefinitionProperty();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentProperty#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see edtproject.ComponentProperty#getFile()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_File();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentProperty#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see edtproject.ComponentProperty#getSource()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_Source();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edtproject.ComponentProperty#getValue()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentProperty#getName()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ComponentProperty#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Property</em>'.
	 * @see edtproject.ComponentProperty#getSourceProperty()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EReference getComponentProperty_SourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Property#isMustSupply <em>Must Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Supply</em>'.
	 * @see edtproject.Property#isMustSupply()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_MustSupply();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edtproject.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edtproject.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Property#getECOASCAType <em>ECOASCA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ECOASCA Type</em>'.
	 * @see edtproject.Property#getECOASCAType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ECOASCAType();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Property#getECOASCALibrary <em>ECOASCA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ECOASCA Library</em>'.
	 * @see edtproject.Property#getECOASCALibrary()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ECOASCALibrary();

	/**
	 * Returns the meta object for class '{@link edtproject.Step <em>Step</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see edtproject.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtproject.Step#getFolderName <em>Folder Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Folder Name</em>'.
	 * @see edtproject.Step#getFolderName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_FolderName();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Reference</em>'.
	 * @see edtproject.ComponentReference
	 * @generated
	 */
	EClass getComponentReference();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ComponentReference#getComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Reference</em>'.
	 * @see edtproject.ComponentReference#getComponentDefinitionReference()
	 * @see #getComponentReference()
	 * @generated
	 */
	EReference getComponentReference_ComponentDefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentReference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see edtproject.ComponentReference#getMultiplicity()
	 * @see #getComponentReference()
	 * @generated
	 */
	EAttribute getComponentReference_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentReference#getName()
	 * @see #getComponentReference()
	 * @generated
	 */
	EAttribute getComponentReference_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.ComponentService <em>Component Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Service</em>'.
	 * @see edtproject.ComponentService
	 * @generated
	 */
	EClass getComponentService();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ComponentService#getComponentDefinitionService <em>Component Definition Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition Service</em>'.
	 * @see edtproject.ComponentService#getComponentDefinitionService()
	 * @see #getComponentService()
	 * @generated
	 */
	EReference getComponentService_ComponentDefinitionService();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.ComponentService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.ComponentService#getName()
	 * @see #getComponentService()
	 * @generated
	 */
	EAttribute getComponentService_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.CompositeReference <em>Composite Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Reference</em>'.
	 * @see edtproject.CompositeReference
	 * @generated
	 */
	EClass getCompositeReference();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.CompositeReference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see edtproject.CompositeReference#getMultiplicity()
	 * @see #getCompositeReference()
	 * @generated
	 */
	EAttribute getCompositeReference_Multiplicity();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtproject.CompositeReference#getPromote <em>Promote</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Promote</em>'.
	 * @see edtproject.CompositeReference#getPromote()
	 * @see #getCompositeReference()
	 * @generated
	 */
	EAttribute getCompositeReference_Promote();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.CompositeReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.CompositeReference#getName()
	 * @see #getCompositeReference()
	 * @generated
	 */
	EAttribute getCompositeReference_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.CompositeService <em>Composite Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Service</em>'.
	 * @see edtproject.CompositeService
	 * @generated
	 */
	EClass getCompositeService();

	/**
	 * Returns the meta object for the attribute
	 * '{@link edtproject.CompositeService#getPromote <em>Promote</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Promote</em>'.
	 * @see edtproject.CompositeService#getPromote()
	 * @see #getCompositeService()
	 * @generated
	 */
	EAttribute getCompositeService_Promote();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.CompositeService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.CompositeService#getName()
	 * @see #getCompositeService()
	 * @generated
	 */
	EAttribute getCompositeService_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see edtproject.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Contract#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Syntax</em>'.
	 * @see edtproject.Contract#getSyntax()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Syntax();

	/**
	 * Returns the meta object for the reference '{@link edtproject.Contract#getQos <em>Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qos</em>'.
	 * @see edtproject.Contract#getQos()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Qos();

	/**
	 * Returns the meta object for class '{@link edtproject.FinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Assembly</em>'.
	 * @see edtproject.FinalAssembly
	 * @generated
	 */
	EClass getFinalAssembly();

	/**
	 * Returns the meta object for the reference '{@link edtproject.FinalAssembly#getFinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Assembly</em>'.
	 * @see edtproject.FinalAssembly#getFinalAssembly()
	 * @see #getFinalAssembly()
	 * @generated
	 */
	EReference getFinalAssembly_FinalAssembly();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.FinalAssembly#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.FinalAssembly#getName()
	 * @see #getFinalAssembly()
	 * @generated
	 */
	EAttribute getFinalAssembly_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.OutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Directory</em>'.
	 * @see edtproject.OutputDirectory
	 * @generated
	 */
	EClass getOutputDirectory();

	/**
	 * Returns the meta object for the attribute '{@link edtproject.OutputDirectory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtproject.OutputDirectory#getName()
	 * @see #getOutputDirectory()
	 * @generated
	 */
	EAttribute getOutputDirectory_Name();

	/**
	 * Returns the meta object for class '{@link edtproject.ServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Link</em>'.
	 * @see edtproject.ServiceLink
	 * @generated
	 */
	EClass getServiceLink();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ServiceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edtproject.ServiceLink#getSource()
	 * @see #getServiceLink()
	 * @generated
	 */
	EReference getServiceLink_Source();

	/**
	 * Returns the meta object for the reference '{@link edtproject.ServiceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edtproject.ServiceLink#getTarget()
	 * @see #getServiceLink()
	 * @generated
	 */
	EReference getServiceLink_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDTProjectFactory getEDTProjectFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edtproject.impl.StepsImpl <em>Steps</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.StepsImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getSteps()
		 * @generated
		 */
		EClass STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__STEP = eINSTANCE.getSteps_Step();

		/**
		 * The meta object literal for the '<em><b>Output Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__OUTPUT_DIRECTORY = eINSTANCE.getSteps_OutputDirectory();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step0Impl <em>Step0</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step0Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep0()
		 * @generated
		 */
		EClass STEP0 = eINSTANCE.getStep0();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP0__TYPES = eINSTANCE.getStep0_Types();

		/**
		 * The meta object literal for the '<em><b>Basic Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP0__BASIC_TYPES = eINSTANCE.getStep0_BasicTypes();

		/**
		 * The meta object literal for the '<em><b>Ecoa Predefined Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP0__ECOA_PREDEFINED_TYPES = eINSTANCE.getStep0_EcoaPredefinedTypes();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step1Impl <em>Step1</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step1Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep1()
		 * @generated
		 */
		EClass STEP1 = eINSTANCE.getStep1();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP1__SERVICES = eINSTANCE.getStep1_Services();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step2Impl <em>Step2</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step2Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep2()
		 * @generated
		 */
		EClass STEP2 = eINSTANCE.getStep2();

		/**
		 * The meta object literal for the '<em><b>Component Definitions</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference STEP2__COMPONENT_DEFINITIONS = eINSTANCE.getStep2_ComponentDefinitions();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step3Impl <em>Step3</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step3Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep3()
		 * @generated
		 */
		EClass STEP3 = eINSTANCE.getStep3();

		/**
		 * The meta object literal for the '<em><b>Initial Assembly</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP3__INITIAL_ASSEMBLY = eINSTANCE.getStep3_InitialAssembly();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step4Impl <em>Step4</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step4Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep4()
		 * @generated
		 */
		EClass STEP4 = eINSTANCE.getStep4();

		/**
		 * The meta object literal for the '<em><b>Component Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP4__COMPONENT_IMPLEMENTATIONS = eINSTANCE.getStep4_ComponentImplementations();

		/**
		 * The meta object literal for the '{@link edtproject.impl.Step5Impl <em>Step5</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.Step5Impl
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep5()
		 * @generated
		 */
		EClass STEP5 = eINSTANCE.getStep5();

		/**
		 * The meta object literal for the '<em><b>Logical System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__LOGICAL_SYSTEM = eINSTANCE.getStep5_LogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__DEPLOYMENT = eINSTANCE.getStep5_Deployment();

		/**
		 * The meta object literal for the '<em><b>UDP Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__UDP_BINDINGS = eINSTANCE.getStep5_UDPBindings();

		/**
		 * The meta object literal for the '<em><b>Final Assembly</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__FINAL_ASSEMBLY = eINSTANCE.getStep5_FinalAssembly();

		/**
		 * The meta object literal for the '<em><b>Cross Platform View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__CROSS_PLATFORM_VIEW = eINSTANCE.getStep5_CrossPlatformView();

		/**
		 * The meta object literal for the '<em><b>IDS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP5__IDS = eINSTANCE.getStep5_IDS();

		/**
		 * The meta object literal for the '{@link edtproject.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.CompositeImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPONENTS = eINSTANCE.getComposite_Components();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PROPERTIES = eINSTANCE.getComposite_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__NAME = eINSTANCE.getComposite_Name();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__REFERENCES = eINSTANCE.getComposite_References();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SERVICES = eINSTANCE.getComposite_Services();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__TARGET_NAMESPACE = eINSTANCE.getComposite_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Service Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SERVICE_LINKS = eINSTANCE.getComposite_ServiceLinks();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentDefinitionImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinition()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__PROPERTIES = eINSTANCE.getComponentDefinition_Properties();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__REFERENCES = eINSTANCE.getComponentDefinition_References();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__SERVICES = eINSTANCE.getComponentDefinition_Services();

		/**
		 * The meta object literal for the '<em><b>Associated Service Qos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__ASSOCIATED_SERVICE_QOS = eINSTANCE.getComponentDefinition_AssociatedServiceQos();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_DEFINITION = eINSTANCE.getComponent_ComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Component References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_REFERENCES = eINSTANCE.getComponent_ComponentReferences();

		/**
		 * The meta object literal for the '<em><b>Component Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_SERVICES = eINSTANCE.getComponent_ComponentServices();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_IMPLEMENTATION = eINSTANCE.getComponent_ComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Component Definition Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_DEFINITION_VERSION = eINSTANCE.getComponent_ComponentDefinitionVersion();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentDefinitionReferenceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinitionReference()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION_REFERENCE = eINSTANCE.getComponentDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION_REFERENCE__NAME = eINSTANCE.getComponentDefinitionReference_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY = eINSTANCE.getComponentDefinitionReference_Multiplicity();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentDefinitionServiceImpl <em>Component Definition Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentDefinitionServiceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentDefinitionService()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION_SERVICE = eINSTANCE.getComponentDefinitionService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION_SERVICE__NAME = eINSTANCE.getComponentDefinitionService_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.PropertyImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentPropertyImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentProperty()
		 * @generated
		 */
		EClass COMPONENT_PROPERTY = eINSTANCE.getComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Component Definition Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY = eINSTANCE.getComponentProperty_ComponentDefinitionProperty();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__FILE = eINSTANCE.getComponentProperty_File();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__SOURCE = eINSTANCE.getComponentProperty_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__VALUE = eINSTANCE.getComponentProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__NAME = eINSTANCE.getComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Source Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY__SOURCE_PROPERTY = eINSTANCE.getComponentProperty_SourceProperty();

		/**
		 * The meta object literal for the '<em><b>Must Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MUST_SUPPLY = eINSTANCE.getProperty_MustSupply();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>ECOASCA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ECOASCA_TYPE = eINSTANCE.getProperty_ECOASCAType();

		/**
		 * The meta object literal for the '<em><b>ECOASCA Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ECOASCA_LIBRARY = eINSTANCE.getProperty_ECOASCALibrary();

		/**
		 * The meta object literal for the '{@link edtproject.Step <em>Step</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.Step
		 * @see edtproject.impl.EDTProjectPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__FOLDER_NAME = eINSTANCE.getStep_FolderName();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentReferenceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentReference()
		 * @generated
		 */
		EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

		/**
		 * The meta object literal for the '<em><b>Component Definition Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE = eINSTANCE.getComponentReference_ComponentDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REFERENCE__MULTIPLICITY = eINSTANCE.getComponentReference_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REFERENCE__NAME = eINSTANCE.getComponentReference_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ComponentServiceImpl <em>Component Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ComponentServiceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getComponentService()
		 * @generated
		 */
		EClass COMPONENT_SERVICE = eINSTANCE.getComponentService();

		/**
		 * The meta object literal for the '<em><b>Component Definition Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SERVICE__COMPONENT_DEFINITION_SERVICE = eINSTANCE.getComponentService_ComponentDefinitionService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SERVICE__NAME = eINSTANCE.getComponentService_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.CompositeReferenceImpl <em>Composite Reference</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see edtproject.impl.CompositeReferenceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getCompositeReference()
		 * @generated
		 */
		EClass COMPOSITE_REFERENCE = eINSTANCE.getCompositeReference();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFERENCE__MULTIPLICITY = eINSTANCE.getCompositeReference_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFERENCE__PROMOTE = eINSTANCE.getCompositeReference_Promote();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFERENCE__NAME = eINSTANCE.getCompositeReference_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.CompositeServiceImpl
		 * <em>Composite Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see edtproject.impl.CompositeServiceImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getCompositeService()
		 * @generated
		 */
		EClass COMPOSITE_SERVICE = eINSTANCE.getCompositeService();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_SERVICE__PROMOTE = eINSTANCE.getCompositeService_Promote();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_SERVICE__NAME = eINSTANCE.getCompositeService_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ContractImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__SYNTAX = eINSTANCE.getContract_Syntax();

		/**
		 * The meta object literal for the '<em><b>Qos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__QOS = eINSTANCE.getContract_Qos();

		/**
		 * The meta object literal for the '{@link edtproject.impl.FinalAssemblyImpl <em>Final Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.FinalAssemblyImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getFinalAssembly()
		 * @generated
		 */
		EClass FINAL_ASSEMBLY = eINSTANCE.getFinalAssembly();

		/**
		 * The meta object literal for the '<em><b>Final Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_ASSEMBLY__FINAL_ASSEMBLY = eINSTANCE.getFinalAssembly_FinalAssembly();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_ASSEMBLY__NAME = eINSTANCE.getFinalAssembly_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.OutputDirectoryImpl <em>Output Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.OutputDirectoryImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getOutputDirectory()
		 * @generated
		 */
		EClass OUTPUT_DIRECTORY = eINSTANCE.getOutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DIRECTORY__NAME = eINSTANCE.getOutputDirectory_Name();

		/**
		 * The meta object literal for the '{@link edtproject.impl.ServiceLinkImpl <em>Service Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtproject.impl.ServiceLinkImpl
		 * @see edtproject.impl.EDTProjectPackageImpl#getServiceLink()
		 * @generated
		 */
		EClass SERVICE_LINK = eINSTANCE.getServiceLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LINK__SOURCE = eINSTANCE.getServiceLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LINK__TARGET = eINSTANCE.getServiceLink_Target();

	}

} // EDTProject2Package
