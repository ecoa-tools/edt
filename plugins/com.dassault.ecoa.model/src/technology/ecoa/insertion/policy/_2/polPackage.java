/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see technology.ecoa.insertion.policy._2.polFactory
 * @model kind="package"
 * @generated
 */
public interface polPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/insertion-policy-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	polPackage eINSTANCE = technology.ecoa.insertion.policy._2.impl.polPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl <em>Aperiodic Activation Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAperiodicActivationProfile()
	 * @generated
	 */
	int APERIODIC_ACTIVATION_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE__RATE = 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE__DEADLINE = 1;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE__WCET = 3;

	/**
	 * The number of structural features of the '<em>Aperiodic Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Aperiodic Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_ACTIVATION_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.CompilerImpl <em>Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.CompilerImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getCompiler()
	 * @generated
	 */
	int COMPILER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPINFOImpl <em>Default PINFO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DefaultPINFOImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultPINFO()
	 * @generated
	 */
	int DEFAULT_PINFO = 2;

	/**
	 * The feature id for the '<em><b>Module PINFO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PINFO__MODULE_PINFO = 0;

	/**
	 * The number of structural features of the '<em>Default PINFO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PINFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Default PINFO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PINFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPropertiesImpl <em>Default Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DefaultPropertiesImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultProperties()
	 * @generated
	 */
	int DEFAULT_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTIES__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Default Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Default Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPropertyValueImpl <em>Default Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DefaultPropertyValueImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultPropertyValue()
	 * @generated
	 */
	int DEFAULT_PROPERTY_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTY_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Default Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Default Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeploymentConstraints()
	 * @generated
	 */
	int DEPLOYMENT_CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Deployment Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Unique Protection Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DocumentRootImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Insertion Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERTION_POLICIES = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl <em>Dynamic Memory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDynamicMemoryType()
	 * @generated
	 */
	int DYNAMIC_MEMORY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MEMORY_TYPE__ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MEMORY_TYPE__MAX_SIZE = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MEMORY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MEMORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ECOAProfileImpl <em>ECOA Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ECOAProfileImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getECOAProfile()
	 * @generated
	 */
	int ECOA_PROFILE = 8;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROFILE__PROFILE = 0;

	/**
	 * The number of structural features of the '<em>ECOA Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ECOA Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ExtraConcernsImpl <em>Extra Concerns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ExtraConcernsImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getExtraConcerns()
	 * @generated
	 */
	int EXTRA_CONCERNS = 9;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_CONCERNS__FILE = 0;

	/**
	 * The number of structural features of the '<em>Extra Concerns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_CONCERNS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extra Concerns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_CONCERNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl <em>Highest Activation Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getHighestActivationRate()
	 * @generated
	 */
	int HIGHEST_ACTIVATION_RATE = 10;

	/**
	 * The feature id for the '<em><b>Number Of Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS = 0;

	/**
	 * The feature id for the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_ACTIVATION_RATE__TIME_FRAME = 1;

	/**
	 * The number of structural features of the '<em>Highest Activation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_ACTIVATION_RATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Highest Activation Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_ACTIVATION_RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl <em>Insertion Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getInsertionPolicy()
	 * @generated
	 */
	int INSERTION_POLICY = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Processor Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__PROCESSOR_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Register Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__REGISTER_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Memory Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__MEMORY_USAGE = 3;

	/**
	 * The feature id for the '<em><b>Realtime Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__REALTIME_CHARACTERISTICS = 4;

	/**
	 * The feature id for the '<em><b>Time Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__TIME_ACCURACY = 5;

	/**
	 * The feature id for the '<em><b>Transport Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__TRANSPORT_PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Deployment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>ECOA Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__ECOA_PROFILE = 8;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__COMPILER = 9;

	/**
	 * The feature id for the '<em><b>Generic Compilation Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Modules Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__MODULES_DEPENDENCIES = 11;

	/**
	 * The feature id for the '<em><b>Extra Concerns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__EXTRA_CONCERNS = 12;

	/**
	 * The feature id for the '<em><b>Default PINFO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__DEFAULT_PINFO = 13;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY__DEFAULT_PROPERTIES = 14;

	/**
	 * The number of structural features of the '<em>Insertion Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Insertion Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl <em>Insertion Policy List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getInsertionPolicyList()
	 * @generated
	 */
	int INSERTION_POLICY_LIST = 12;

	/**
	 * The feature id for the '<em><b>Insertion Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_LIST__INSERTION_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Insertion Policy List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Insertion Policy List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_POLICY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.LanguageLibrariesImpl <em>Language Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.LanguageLibrariesImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLanguageLibraries()
	 * @generated
	 */
	int LANGUAGE_LIBRARIES = 13;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARIES__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Language Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Language Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.LanguageLibraryImpl <em>Language Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.LanguageLibraryImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLanguageLibrary()
	 * @generated
	 */
	int LANGUAGE_LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARY__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Language Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Language Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.MemoryUsageImpl <em>Memory Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.MemoryUsageImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getMemoryUsage()
	 * @generated
	 */
	int MEMORY_USAGE = 15;

	/**
	 * The feature id for the '<em><b>Module Memory Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_USAGE__MODULE_MEMORY_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_USAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl <em>Module Activation Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleActivationProfile()
	 * @generated
	 */
	int MODULE_ACTIVATION_PROFILE = 16;

	/**
	 * The feature id for the '<em><b>Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__PERIODIC = 0;

	/**
	 * The feature id for the '<em><b>Reactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__REACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Activation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__BEHAVIOUR = 3;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__INSTANCE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Max Nb Of Processed Ops Per Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Queue Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH = 6;

	/**
	 * The number of structural features of the '<em>Module Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Module Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfilesImpl <em>Module Activation Profiles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModuleActivationProfilesImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleActivationProfiles()
	 * @generated
	 */
	int MODULE_ACTIVATION_PROFILES = 17;

	/**
	 * The feature id for the '<em><b>Activation Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE = 0;

	/**
	 * The number of structural features of the '<em>Module Activation Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Activation Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ACTIVATION_PROFILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleCompilationOptionsImpl <em>Module Compilation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModuleCompilationOptionsImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleCompilationOptions()
	 * @generated
	 */
	int MODULE_COMPILATION_OPTIONS = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COMPILATION_OPTIONS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COMPILATION_OPTIONS__INSTANCE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Module Compilation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COMPILATION_OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Compilation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_COMPILATION_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl <em>Module Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleDependencies()
	 * @generated
	 */
	int MODULE_DEPENDENCIES = 19;

	/**
	 * The feature id for the '<em><b>Language Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES__LANGUAGE_RUNTIME = 0;

	/**
	 * The feature id for the '<em><b>Language Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Direct OS Access</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES__DIRECT_OS_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Module Compilation Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES__INSTANCE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Module Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Module Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl <em>Module Memory Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleMemoryUsage()
	 * @generated
	 */
	int MODULE_MEMORY_USAGE = 20;

	/**
	 * The feature id for the '<em><b>User Context Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Warm Start Context Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Dynamic Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__DYNAMIC_MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Stack Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__STACK_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Heap Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__HEAP_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE__INSTANCE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Module Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Module Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MEMORY_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl <em>Module PINFO Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModulePINFOType()
	 * @generated
	 */
	int MODULE_PINFO_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Public PINFO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PINFO_TYPE__PUBLIC_PINFO = 0;

	/**
	 * The feature id for the '<em><b>Private PINFO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PINFO_TYPE__PRIVATE_PINFO = 1;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PINFO_TYPE__INSTANCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Module PINFO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PINFO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module PINFO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PINFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.ModulesDependenciesImpl <em>Modules Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.ModulesDependenciesImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModulesDependencies()
	 * @generated
	 */
	int MODULES_DEPENDENCIES = 22;

	/**
	 * The feature id for the '<em><b>Module Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_DEPENDENCIES__MODULE_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Modules Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modules Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.OSAPITypeImpl <em>OSAPI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.OSAPITypeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getOSAPIType()
	 * @generated
	 */
	int OSAPI_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSAPI_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>OSAPI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSAPI_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OSAPI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSAPI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.PeriodicActivationProfileImpl <em>Periodic Activation Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.PeriodicActivationProfileImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriodicActivationProfile()
	 * @generated
	 */
	int PERIODIC_ACTIVATION_PROFILE = 24;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE__WCET = 3;

	/**
	 * The number of structural features of the '<em>Periodic Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Periodic Activation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.PINFOValueImpl <em>PINFO Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.PINFOValueImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPINFOValue()
	 * @generated
	 */
	int PINFO_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>PINFO Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PINFO Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINFO_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl <em>Realtime Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRealtimeCharacteristics()
	 * @generated
	 */
	int REALTIME_CHARACTERISTICS = 26;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_CHARACTERISTICS__SCHEDULING_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Module Activation Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES = 1;

	/**
	 * The number of structural features of the '<em>Realtime Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_CHARACTERISTICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realtime Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_CHARACTERISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.RegisterSizeImpl <em>Register Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.RegisterSizeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRegisterSize()
	 * @generated
	 */
	int REGISTER_SIZE = 27;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_SIZE__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Register Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_SIZE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Register Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.SchedulingPolicyTypeImpl <em>Scheduling Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.SchedulingPolicyTypeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicyType()
	 * @generated
	 */
	int SCHEDULING_POLICY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_TYPE__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Scheduling Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scheduling Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.TimeAccuracyImpl <em>Time Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.TimeAccuracyImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeAccuracy()
	 * @generated
	 */
	int TIME_ACCURACY = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACCURACY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Time Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACCURACY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ACCURACY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl <em>Transport Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTransportProtocol()
	 * @generated
	 */
	int TRANSPORT_PROTOCOL = 30;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL__INTEGRITY = 0;

	/**
	 * The feature id for the '<em><b>Max Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL__MAX_LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Min Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL__MIN_BANDWIDTH = 2;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL__QUALITY = 3;

	/**
	 * The number of structural features of the '<em>Transport Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transport Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.UseTypeImpl
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.ActivationTypeType <em>Activation Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getActivationTypeType()
	 * @generated
	 */
	int ACTIVATION_TYPE_TYPE = 32;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.AllocationType <em>Allocation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAllocationType()
	 * @generated
	 */
	int ALLOCATION_TYPE = 33;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.IntegrityType <em>Integrity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getIntegrityType()
	 * @generated
	 */
	int INTEGRITY_TYPE = 34;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.ProfileType <em>Profile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProfileType()
	 * @generated
	 */
	int PROFILE_TYPE = 35;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 36;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.QualityType <em>Quality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getQualityType()
	 * @generated
	 */
	int QUALITY_TYPE = 37;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 38;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.SizeType <em>Size Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSizeType()
	 * @generated
	 */
	int SIZE_TYPE = 39;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.TypeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 40;

	/**
	 * The meta object id for the '{@link technology.ecoa.insertion.policy._2.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 41;

	/**
	 * The meta object id for the '<em>Activation Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getActivationTypeTypeObject()
	 * @generated
	 */
	int ACTIVATION_TYPE_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Allocation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAllocationTypeObject()
	 * @generated
	 */
	int ALLOCATION_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Deadline</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeadline()
	 * @generated
	 */
	int DEADLINE = 44;

	/**
	 * The meta object id for the '<em>Deadline Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeadlineObject()
	 * @generated
	 */
	int DEADLINE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>File Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 46;

	/**
	 * The meta object id for the '<em>Generic Compilation Options</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getGenericCompilationOptions()
	 * @generated
	 */
	int GENERIC_COMPILATION_OPTIONS = 47;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 48;

	/**
	 * The meta object id for the '<em>Integrity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getIntegrityTypeObject()
	 * @generated
	 */
	int INTEGRITY_TYPE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 50;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 51;

	/**
	 * The meta object id for the '<em>Period</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 52;

	/**
	 * The meta object id for the '<em>Period Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriodObject()
	 * @generated
	 */
	int PERIOD_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Profile Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProfileTypeObject()
	 * @generated
	 */
	int PROFILE_TYPE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Quality Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getQualityTypeObject()
	 * @generated
	 */
	int QUALITY_TYPE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Relative Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRelativePriority()
	 * @generated
	 */
	int RELATIVE_PRIORITY = 57;

	/**
	 * The meta object id for the '<em>Scheduling Policy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicyObject()
	 * @generated
	 */
	int SCHEDULING_POLICY_OBJECT = 58;

	/**
	 * The meta object id for the '<em>Size Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSizeTypeObject()
	 * @generated
	 */
	int SIZE_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 60;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Target</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 62;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 63;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 64;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 65;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 66;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.TypeType
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 68;

	/**
	 * The meta object id for the '<em>WCET</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getWCET()
	 * @generated
	 */
	int WCET = 69;

	/**
	 * The meta object id for the '<em>WCET Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getWCETObject()
	 * @generated
	 */
	int WCET_OBJECT = 70;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile <em>Aperiodic Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aperiodic Activation Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile
	 * @generated
	 */
	EClass getAperiodicActivationProfile();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRate()
	 * @see #getAperiodicActivationProfile()
	 * @generated
	 */
	EReference getAperiodicActivationProfile_Rate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getDeadline()
	 * @see #getAperiodicActivationProfile()
	 * @generated
	 */
	EAttribute getAperiodicActivationProfile_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRelativePriority <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Priority</em>'.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getRelativePriority()
	 * @see #getAperiodicActivationProfile()
	 * @generated
	 */
	EAttribute getAperiodicActivationProfile_RelativePriority();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile#getWcet()
	 * @see #getAperiodicActivationProfile()
	 * @generated
	 */
	EAttribute getAperiodicActivationProfile_Wcet();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.Compiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler</em>'.
	 * @see technology.ecoa.insertion.policy._2.Compiler
	 * @generated
	 */
	EClass getCompiler();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.Compiler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.Compiler#getName()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DefaultPINFO <em>Default PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default PINFO</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultPINFO
	 * @generated
	 */
	EClass getDefaultPINFO();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.DefaultPINFO#getModulePINFO <em>Module PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module PINFO</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultPINFO#getModulePINFO()
	 * @see #getDefaultPINFO()
	 * @generated
	 */
	EReference getDefaultPINFO_ModulePINFO();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Properties</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultProperties
	 * @generated
	 */
	EClass getDefaultProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.DefaultProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultProperties#getProperty()
	 * @see #getDefaultProperties()
	 * @generated
	 */
	EReference getDefaultProperties_Property();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DefaultPropertyValue <em>Default Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Property Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultPropertyValue
	 * @generated
	 */
	EClass getDefaultPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DefaultPropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultPropertyValue#getValue()
	 * @see #getDefaultPropertyValue()
	 * @generated
	 */
	EAttribute getDefaultPropertyValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DefaultPropertyValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.DefaultPropertyValue#getName()
	 * @see #getDefaultPropertyValue()
	 * @generated
	 */
	EAttribute getDefaultPropertyValue_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Constraints</em>'.
	 * @see technology.ecoa.insertion.policy._2.DeploymentConstraints
	 * @generated
	 */
	EClass getDeploymentConstraints();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#getDeploymentExample <em>Deployment Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Example</em>'.
	 * @see technology.ecoa.insertion.policy._2.DeploymentConstraints#getDeploymentExample()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_DeploymentExample();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain <em>Unique Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Protection Domain</em>'.
	 * @see technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_UniqueProtectionDomain();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.insertion.policy._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.insertion.policy._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.insertion.policy._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.DocumentRoot#getInsertionPolicies <em>Insertion Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertion Policies</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot#getInsertionPolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InsertionPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType <em>Dynamic Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Memory Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.DynamicMemoryType
	 * @generated
	 */
	EClass getDynamicMemoryType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see technology.ecoa.insertion.policy._2.DynamicMemoryType#getAllocation()
	 * @see #getDynamicMemoryType()
	 * @generated
	 */
	EAttribute getDynamicMemoryType_Allocation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.DynamicMemoryType#getMaxSize()
	 * @see #getDynamicMemoryType()
	 * @generated
	 */
	EAttribute getDynamicMemoryType_MaxSize();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ECOAProfile <em>ECOA Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECOA Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.ECOAProfile
	 * @generated
	 */
	EClass getECOAProfile();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ECOAProfile#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.ECOAProfile#getProfile()
	 * @see #getECOAProfile()
	 * @generated
	 */
	EAttribute getECOAProfile_Profile();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ExtraConcerns <em>Extra Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Concerns</em>'.
	 * @see technology.ecoa.insertion.policy._2.ExtraConcerns
	 * @generated
	 */
	EClass getExtraConcerns();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ExtraConcerns#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see technology.ecoa.insertion.policy._2.ExtraConcerns#getFile()
	 * @see #getExtraConcerns()
	 * @generated
	 */
	EAttribute getExtraConcerns_File();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.HighestActivationRate <em>Highest Activation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highest Activation Rate</em>'.
	 * @see technology.ecoa.insertion.policy._2.HighestActivationRate
	 * @generated
	 */
	EClass getHighestActivationRate();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations <em>Number Of Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Activations</em>'.
	 * @see technology.ecoa.insertion.policy._2.HighestActivationRate#getNumberOfActivations()
	 * @see #getHighestActivationRate()
	 * @generated
	 */
	EAttribute getHighestActivationRate_NumberOfActivations();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame <em>Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Frame</em>'.
	 * @see technology.ecoa.insertion.policy._2.HighestActivationRate#getTimeFrame()
	 * @see #getHighestActivationRate()
	 * @generated
	 */
	EAttribute getHighestActivationRate_TimeFrame();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.InsertionPolicy <em>Insertion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Policy</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy
	 * @generated
	 */
	EClass getInsertionPolicy();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getTarget()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EAttribute getInsertionPolicy_Target();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getProcessorTarget <em>Processor Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Target</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getProcessorTarget()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_ProcessorTarget();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRegisterSize <em>Register Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Register Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getRegisterSize()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_RegisterSize();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getMemoryUsage <em>Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Usage</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getMemoryUsage()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_MemoryUsage();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRealtimeCharacteristics <em>Realtime Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realtime Characteristics</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getRealtimeCharacteristics()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_RealtimeCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTimeAccuracy <em>Time Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Accuracy</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getTimeAccuracy()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_TimeAccuracy();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Protocol</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getTransportProtocol()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_TransportProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Constraints</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getDeploymentConstraints()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_DeploymentConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getECOAProfile <em>ECOA Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECOA Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getECOAProfile()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_ECOAProfile();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getCompiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compiler</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getCompiler()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_Compiler();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getGenericCompilationOptions <em>Generic Compilation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Compilation Options</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getGenericCompilationOptions()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EAttribute getInsertionPolicy_GenericCompilationOptions();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getModulesDependencies <em>Modules Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modules Dependencies</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getModulesDependencies()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_ModulesDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getExtraConcerns <em>Extra Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Concerns</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getExtraConcerns()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_ExtraConcerns();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultPINFO <em>Default PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default PINFO</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultPINFO()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_DefaultPINFO();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultProperties()
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	EReference getInsertionPolicy_DefaultProperties();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.InsertionPolicyList <em>Insertion Policy List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Policy List</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicyList
	 * @generated
	 */
	EClass getInsertionPolicyList();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.InsertionPolicyList#getInsertionPolicy <em>Insertion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insertion Policy</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicyList#getInsertionPolicy()
	 * @see #getInsertionPolicyList()
	 * @generated
	 */
	EReference getInsertionPolicyList_InsertionPolicy();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.InsertionPolicyList#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Implementation</em>'.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicyList#getComponentImplementation()
	 * @see #getInsertionPolicyList()
	 * @generated
	 */
	EAttribute getInsertionPolicyList_ComponentImplementation();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.LanguageLibraries <em>Language Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Libraries</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibraries
	 * @generated
	 */
	EClass getLanguageLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.LanguageLibraries#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibraries#getLibrary()
	 * @see #getLanguageLibraries()
	 * @generated
	 */
	EReference getLanguageLibraries_Library();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.LanguageLibrary <em>Language Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Library</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibrary
	 * @generated
	 */
	EClass getLanguageLibrary();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibrary#getName()
	 * @see #getLanguageLibrary()
	 * @generated
	 */
	EAttribute getLanguageLibrary_Name();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibrary#getType()
	 * @see #getLanguageLibrary()
	 * @generated
	 */
	EAttribute getLanguageLibrary_Type();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.LanguageLibrary#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibrary#getVersion()
	 * @see #getLanguageLibrary()
	 * @generated
	 */
	EAttribute getLanguageLibrary_Version();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.MemoryUsage <em>Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Usage</em>'.
	 * @see technology.ecoa.insertion.policy._2.MemoryUsage
	 * @generated
	 */
	EClass getMemoryUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.MemoryUsage#getModuleMemoryUsage <em>Module Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Memory Usage</em>'.
	 * @see technology.ecoa.insertion.policy._2.MemoryUsage#getModuleMemoryUsage()
	 * @see #getMemoryUsage()
	 * @generated
	 */
	EReference getMemoryUsage_ModuleMemoryUsage();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile <em>Module Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Activation Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile
	 * @generated
	 */
	EClass getModuleActivationProfile();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getPeriodic <em>Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodic</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getPeriodic()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EReference getModuleActivationProfile_Periodic();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getReactive <em>Reactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reactive</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getReactive()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EReference getModuleActivationProfile_Reactive();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EAttribute getModuleActivationProfile_ActivationType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getBehaviour()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EAttribute getModuleActivationProfile_Behaviour();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getInstanceName()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EAttribute getModuleActivationProfile_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nb Of Processed Ops Per Activation</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EAttribute getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth <em>Queue Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Depth</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth()
	 * @see #getModuleActivationProfile()
	 * @generated
	 */
	EAttribute getModuleActivationProfile_QueueDepth();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles <em>Module Activation Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Activation Profiles</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfiles
	 * @generated
	 */
	EClass getModuleActivationProfiles();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles#getActivationProfile <em>Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfiles#getActivationProfile()
	 * @see #getModuleActivationProfiles()
	 * @generated
	 */
	EReference getModuleActivationProfiles_ActivationProfile();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions <em>Module Compilation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Compilation Options</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleCompilationOptions
	 * @generated
	 */
	EClass getModuleCompilationOptions();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleCompilationOptions#getValue()
	 * @see #getModuleCompilationOptions()
	 * @generated
	 */
	EAttribute getModuleCompilationOptions_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleCompilationOptions#getInstanceName()
	 * @see #getModuleCompilationOptions()
	 * @generated
	 */
	EAttribute getModuleCompilationOptions_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModuleDependencies <em>Module Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Dependencies</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies
	 * @generated
	 */
	EClass getModuleDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageRuntime <em>Language Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Runtime</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageRuntime()
	 * @see #getModuleDependencies()
	 * @generated
	 */
	EReference getModuleDependencies_LanguageRuntime();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageLibraries <em>Language Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Libraries</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies#getLanguageLibraries()
	 * @see #getModuleDependencies()
	 * @generated
	 */
	EReference getModuleDependencies_LanguageLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getDirectOSAccess <em>Direct OS Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Direct OS Access</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies#getDirectOSAccess()
	 * @see #getModuleDependencies()
	 * @generated
	 */
	EReference getModuleDependencies_DirectOSAccess();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getModuleCompilationOptions <em>Module Compilation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Compilation Options</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies#getModuleCompilationOptions()
	 * @see #getModuleDependencies()
	 * @generated
	 */
	EReference getModuleDependencies_ModuleCompilationOptions();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleDependencies#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies#getInstanceName()
	 * @see #getModuleDependencies()
	 * @generated
	 */
	EAttribute getModuleDependencies_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage <em>Module Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Memory Usage</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage
	 * @generated
	 */
	EClass getModuleMemoryUsage();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getUserContextSize <em>User Context Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Context Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getUserContextSize()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EReference getModuleMemoryUsage_UserContextSize();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getWarmStartContextSize <em>Warm Start Context Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warm Start Context Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getWarmStartContextSize()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EReference getModuleMemoryUsage_WarmStartContextSize();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getDynamicMemory <em>Dynamic Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Memory</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getDynamicMemory()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EReference getModuleMemoryUsage_DynamicMemory();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getStackSize <em>Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stack Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getStackSize()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EReference getModuleMemoryUsage_StackSize();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getHeapSize <em>Heap Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heap Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getHeapSize()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EReference getModuleMemoryUsage_HeapSize();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage#getInstanceName()
	 * @see #getModuleMemoryUsage()
	 * @generated
	 */
	EAttribute getModuleMemoryUsage_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModulePINFOType <em>Module PINFO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module PINFO Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulePINFOType
	 * @generated
	 */
	EClass getModulePINFOType();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getPublicPINFO <em>Public PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public PINFO</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulePINFOType#getPublicPINFO()
	 * @see #getModulePINFOType()
	 * @generated
	 */
	EReference getModulePINFOType_PublicPINFO();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getPrivatePINFO <em>Private PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private PINFO</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulePINFOType#getPrivatePINFO()
	 * @see #getModulePINFOType()
	 * @generated
	 */
	EReference getModulePINFOType_PrivatePINFO();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.ModulePINFOType#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulePINFOType#getInstanceName()
	 * @see #getModulePINFOType()
	 * @generated
	 */
	EAttribute getModulePINFOType_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.ModulesDependencies <em>Modules Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules Dependencies</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulesDependencies
	 * @generated
	 */
	EClass getModulesDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.insertion.policy._2.ModulesDependencies#getModuleDependencies <em>Module Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Dependencies</em>'.
	 * @see technology.ecoa.insertion.policy._2.ModulesDependencies#getModuleDependencies()
	 * @see #getModulesDependencies()
	 * @generated
	 */
	EReference getModulesDependencies_ModuleDependencies();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.OSAPIType <em>OSAPI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSAPI Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.OSAPIType
	 * @generated
	 */
	EClass getOSAPIType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.OSAPIType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.OSAPIType#getType()
	 * @see #getOSAPIType()
	 * @generated
	 */
	EAttribute getOSAPIType_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile <em>Periodic Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Activation Profile</em>'.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile
	 * @generated
	 */
	EClass getPeriodicActivationProfile();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getDeadline()
	 * @see #getPeriodicActivationProfile()
	 * @generated
	 */
	EAttribute getPeriodicActivationProfile_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getPeriod()
	 * @see #getPeriodicActivationProfile()
	 * @generated
	 */
	EAttribute getPeriodicActivationProfile_Period();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getRelativePriority <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Priority</em>'.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getRelativePriority()
	 * @see #getPeriodicActivationProfile()
	 * @generated
	 */
	EAttribute getPeriodicActivationProfile_RelativePriority();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile#getWcet()
	 * @see #getPeriodicActivationProfile()
	 * @generated
	 */
	EAttribute getPeriodicActivationProfile_Wcet();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.PINFOValue <em>PINFO Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PINFO Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.PINFOValue
	 * @generated
	 */
	EClass getPINFOValue();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PINFOValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.PINFOValue#getValue()
	 * @see #getPINFOValue()
	 * @generated
	 */
	EAttribute getPINFOValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.PINFOValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.insertion.policy._2.PINFOValue#getName()
	 * @see #getPINFOValue()
	 * @generated
	 */
	EAttribute getPINFOValue_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics <em>Realtime Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Characteristics</em>'.
	 * @see technology.ecoa.insertion.policy._2.RealtimeCharacteristics
	 * @generated
	 */
	EClass getRealtimeCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduling Policy</em>'.
	 * @see technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getSchedulingPolicy()
	 * @see #getRealtimeCharacteristics()
	 * @generated
	 */
	EReference getRealtimeCharacteristics_SchedulingPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getModuleActivationProfiles <em>Module Activation Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Activation Profiles</em>'.
	 * @see technology.ecoa.insertion.policy._2.RealtimeCharacteristics#getModuleActivationProfiles()
	 * @see #getRealtimeCharacteristics()
	 * @generated
	 */
	EReference getRealtimeCharacteristics_ModuleActivationProfiles();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.RegisterSize <em>Register Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.RegisterSize
	 * @generated
	 */
	EClass getRegisterSize();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.RegisterSize#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see technology.ecoa.insertion.policy._2.RegisterSize#getSize()
	 * @see #getRegisterSize()
	 * @generated
	 */
	EAttribute getRegisterSize_Size();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType <em>Scheduling Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Policy Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicyType
	 * @generated
	 */
	EClass getSchedulingPolicyType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicyType#getPolicy()
	 * @see #getSchedulingPolicyType()
	 * @generated
	 */
	EAttribute getSchedulingPolicyType_Policy();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.TimeAccuracy <em>Time Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Accuracy</em>'.
	 * @see technology.ecoa.insertion.policy._2.TimeAccuracy
	 * @generated
	 */
	EClass getTimeAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.TimeAccuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see technology.ecoa.insertion.policy._2.TimeAccuracy#getValue()
	 * @see #getTimeAccuracy()
	 * @generated
	 */
	EAttribute getTimeAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.TransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Protocol</em>'.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol
	 * @generated
	 */
	EClass getTransportProtocol();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity()
	 * @see #getTransportProtocol()
	 * @generated
	 */
	EAttribute getTransportProtocol_Integrity();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency <em>Max Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Latency</em>'.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency()
	 * @see #getTransportProtocol()
	 * @generated
	 */
	EAttribute getTransportProtocol_MaxLatency();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMinBandwidth <em>Min Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Bandwidth</em>'.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol#getMinBandwidth()
	 * @see #getTransportProtocol()
	 * @generated
	 */
	EAttribute getTransportProtocol_MinBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol#getQuality()
	 * @see #getTransportProtocol()
	 * @generated
	 */
	EAttribute getTransportProtocol_Quality();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.insertion.policy._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.insertion.policy._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.insertion.policy._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.ActivationTypeType <em>Activation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Type Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @generated
	 */
	EEnum getActivationTypeType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.AllocationType <em>Allocation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allocation Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @generated
	 */
	EEnum getAllocationType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.IntegrityType <em>Integrity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrity Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @generated
	 */
	EEnum getIntegrityType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.ProfileType <em>Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @generated
	 */
	EEnum getProfileType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.QualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @generated
	 */
	EEnum getQualityType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy</em>'.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @generated
	 */
	EEnum getSchedulingPolicy();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @generated
	 */
	EEnum getSizeType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see technology.ecoa.insertion.policy._2.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.insertion.policy._2.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.ActivationTypeType <em>Activation Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activation Type Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.ActivationTypeType"
	 *        extendedMetaData="name='activationType_._type:Object' baseType='activationType_._type'"
	 * @generated
	 */
	EDataType getActivationTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.AllocationType <em>Allocation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Allocation Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.AllocationType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.AllocationType"
	 *        extendedMetaData="name='allocation_._type:Object' baseType='allocation_._type'"
	 * @generated
	 */
	EDataType getAllocationTypeObject();

	/**
	 * Returns the meta object for data type '<em>Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Deadline</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Deadline' baseType='Steps'"
	 * @generated
	 */
	EDataType getDeadline();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Deadline Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Deadline Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Deadline:Object' baseType='Deadline'"
	 * @generated
	 */
	EDataType getDeadlineObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *             URI to an external file
     *           
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>File Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='file_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getFileType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Generic Compilation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generic Compilation Options</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='GenericCompilationOptions' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getGenericCompilationOptions();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Or Dec Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         binary value or a decimal-coded binary value.
     *         This hex-encoded binary value contains the mandatory string 0x
     *         followed by a finite-length sequence of characters 0–9 and a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex Or Dec Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexOrDecValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[1-9][0-9]*|0'"
	 * @generated
	 */
	EDataType getHexOrDecValue();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.IntegrityType <em>Integrity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integrity Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.IntegrityType"
	 *        extendedMetaData="name='integrity_._type:Object' baseType='integrity_._type'"
	 * @generated
	 */
	EDataType getIntegrityTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Library Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LibraryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_\\.]*'"
	 * @generated
	 */
	EDataType getLibraryName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getNameId();

	/**
	 * Returns the meta object for data type '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Period</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Period' baseType='Steps'"
	 * @generated
	 */
	EDataType getPeriod();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Period Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Period Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Period:Object' baseType='Period'"
	 * @generated
	 */
	EDataType getPeriodObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.ProfileType <em>Profile Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Profile Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.ProfileType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.ProfileType"
	 *        extendedMetaData="name='profile_._type:Object' baseType='profile_._type'"
	 * @generated
	 */
	EDataType getProfileTypeObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.insertion.policy._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.QualityType <em>Quality Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Quality Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.QualityType"
	 *        extendedMetaData="name='quality_._type:Object' baseType='quality_._type'"
	 * @generated
	 */
	EDataType getQualityTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relative Priority</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='RelativePriority' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getRelativePriority();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.SchedulingPolicy <em>Scheduling Policy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheduling Policy Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
	 * @model instanceClass="technology.ecoa.insertion.policy._2.SchedulingPolicy"
	 *        extendedMetaData="name='SchedulingPolicy:Object' baseType='SchedulingPolicy'"
	 * @generated
	 */
	EDataType getSchedulingPolicyObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.SizeType <em>Size Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.SizeType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.SizeType"
	 *        extendedMetaData="name='size_._type:Object' baseType='size_._type'"
	 * @generated
	 */
	EDataType getSizeTypeObject();

	/**
	 * Returns the meta object for data type '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number of logical steps
     *         This allows to size
     *         durations in an abstract way.
     *         See stepDuration in the logical
     *         system
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steps</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Steps' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getSteps();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Steps Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steps Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Steps:Object' baseType='Steps'"
	 * @generated
	 */
	EDataType getStepsObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Target</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Target' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTarget();

	/**
	 * Returns the meta object for data type '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit is in seconds
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='TimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTimeDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Time Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='TimeDuration:Object' baseType='TimeDuration'"
	 * @generated
	 */
	EDataType getTimeDurationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeName' baseType='NameId'"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type QName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeQName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getTypeQName();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see technology.ecoa.insertion.policy._2.TypeType
	 * @model instanceClass="technology.ecoa.insertion.policy._2.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.insertion.policy._2.TypeType1 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see technology.ecoa.insertion.policy._2.TypeType1
	 * @model instanceClass="technology.ecoa.insertion.policy._2.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '<em>WCET</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WCET</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='WCET' baseType='Steps'"
	 * @generated
	 */
	EDataType getWCET();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>WCET Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WCET Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='WCET:Object' baseType='WCET'"
	 * @generated
	 */
	EDataType getWCETObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	polFactory getpolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl <em>Aperiodic Activation Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.AperiodicActivationProfileImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAperiodicActivationProfile()
		 * @generated
		 */
		EClass APERIODIC_ACTIVATION_PROFILE = eINSTANCE.getAperiodicActivationProfile();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APERIODIC_ACTIVATION_PROFILE__RATE = eINSTANCE.getAperiodicActivationProfile_Rate();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APERIODIC_ACTIVATION_PROFILE__DEADLINE = eINSTANCE.getAperiodicActivationProfile_Deadline();

		/**
		 * The meta object literal for the '<em><b>Relative Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY = eINSTANCE.getAperiodicActivationProfile_RelativePriority();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APERIODIC_ACTIVATION_PROFILE__WCET = eINSTANCE.getAperiodicActivationProfile_Wcet();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.CompilerImpl <em>Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.CompilerImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getCompiler()
		 * @generated
		 */
		EClass COMPILER = eINSTANCE.getCompiler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__NAME = eINSTANCE.getCompiler_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPINFOImpl <em>Default PINFO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DefaultPINFOImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultPINFO()
		 * @generated
		 */
		EClass DEFAULT_PINFO = eINSTANCE.getDefaultPINFO();

		/**
		 * The meta object literal for the '<em><b>Module PINFO</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PINFO__MODULE_PINFO = eINSTANCE.getDefaultPINFO_ModulePINFO();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPropertiesImpl <em>Default Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DefaultPropertiesImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultProperties()
		 * @generated
		 */
		EClass DEFAULT_PROPERTIES = eINSTANCE.getDefaultProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROPERTIES__PROPERTY = eINSTANCE.getDefaultProperties_Property();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DefaultPropertyValueImpl <em>Default Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DefaultPropertyValueImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDefaultPropertyValue()
		 * @generated
		 */
		EClass DEFAULT_PROPERTY_VALUE = eINSTANCE.getDefaultPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROPERTY_VALUE__VALUE = eINSTANCE.getDefaultPropertyValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROPERTY_VALUE__NAME = eINSTANCE.getDefaultPropertyValue_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeploymentConstraints()
		 * @generated
		 */
		EClass DEPLOYMENT_CONSTRAINTS = eINSTANCE.getDeploymentConstraints();

		/**
		 * The meta object literal for the '<em><b>Deployment Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE = eINSTANCE.getDeploymentConstraints_DeploymentExample();

		/**
		 * The meta object literal for the '<em><b>Unique Protection Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN = eINSTANCE.getDeploymentConstraints_UniqueProtectionDomain();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DocumentRootImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Insertion Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INSERTION_POLICIES = eINSTANCE.getDocumentRoot_InsertionPolicies();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl <em>Dynamic Memory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.DynamicMemoryTypeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDynamicMemoryType()
		 * @generated
		 */
		EClass DYNAMIC_MEMORY_TYPE = eINSTANCE.getDynamicMemoryType();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_MEMORY_TYPE__ALLOCATION = eINSTANCE.getDynamicMemoryType_Allocation();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_MEMORY_TYPE__MAX_SIZE = eINSTANCE.getDynamicMemoryType_MaxSize();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ECOAProfileImpl <em>ECOA Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ECOAProfileImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getECOAProfile()
		 * @generated
		 */
		EClass ECOA_PROFILE = eINSTANCE.getECOAProfile();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROFILE__PROFILE = eINSTANCE.getECOAProfile_Profile();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ExtraConcernsImpl <em>Extra Concerns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ExtraConcernsImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getExtraConcerns()
		 * @generated
		 */
		EClass EXTRA_CONCERNS = eINSTANCE.getExtraConcerns();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_CONCERNS__FILE = eINSTANCE.getExtraConcerns_File();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl <em>Highest Activation Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getHighestActivationRate()
		 * @generated
		 */
		EClass HIGHEST_ACTIVATION_RATE = eINSTANCE.getHighestActivationRate();

		/**
		 * The meta object literal for the '<em><b>Number Of Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS = eINSTANCE.getHighestActivationRate_NumberOfActivations();

		/**
		 * The meta object literal for the '<em><b>Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHEST_ACTIVATION_RATE__TIME_FRAME = eINSTANCE.getHighestActivationRate_TimeFrame();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl <em>Insertion Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getInsertionPolicy()
		 * @generated
		 */
		EClass INSERTION_POLICY = eINSTANCE.getInsertionPolicy();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_POLICY__TARGET = eINSTANCE.getInsertionPolicy_Target();

		/**
		 * The meta object literal for the '<em><b>Processor Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__PROCESSOR_TARGET = eINSTANCE.getInsertionPolicy_ProcessorTarget();

		/**
		 * The meta object literal for the '<em><b>Register Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__REGISTER_SIZE = eINSTANCE.getInsertionPolicy_RegisterSize();

		/**
		 * The meta object literal for the '<em><b>Memory Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__MEMORY_USAGE = eINSTANCE.getInsertionPolicy_MemoryUsage();

		/**
		 * The meta object literal for the '<em><b>Realtime Characteristics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__REALTIME_CHARACTERISTICS = eINSTANCE.getInsertionPolicy_RealtimeCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Time Accuracy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__TIME_ACCURACY = eINSTANCE.getInsertionPolicy_TimeAccuracy();

		/**
		 * The meta object literal for the '<em><b>Transport Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__TRANSPORT_PROTOCOL = eINSTANCE.getInsertionPolicy_TransportProtocol();

		/**
		 * The meta object literal for the '<em><b>Deployment Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS = eINSTANCE.getInsertionPolicy_DeploymentConstraints();

		/**
		 * The meta object literal for the '<em><b>ECOA Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__ECOA_PROFILE = eINSTANCE.getInsertionPolicy_ECOAProfile();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__COMPILER = eINSTANCE.getInsertionPolicy_Compiler();

		/**
		 * The meta object literal for the '<em><b>Generic Compilation Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS = eINSTANCE.getInsertionPolicy_GenericCompilationOptions();

		/**
		 * The meta object literal for the '<em><b>Modules Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__MODULES_DEPENDENCIES = eINSTANCE.getInsertionPolicy_ModulesDependencies();

		/**
		 * The meta object literal for the '<em><b>Extra Concerns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__EXTRA_CONCERNS = eINSTANCE.getInsertionPolicy_ExtraConcerns();

		/**
		 * The meta object literal for the '<em><b>Default PINFO</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__DEFAULT_PINFO = eINSTANCE.getInsertionPolicy_DefaultPINFO();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY__DEFAULT_PROPERTIES = eINSTANCE.getInsertionPolicy_DefaultProperties();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl <em>Insertion Policy List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.InsertionPolicyListImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getInsertionPolicyList()
		 * @generated
		 */
		EClass INSERTION_POLICY_LIST = eINSTANCE.getInsertionPolicyList();

		/**
		 * The meta object literal for the '<em><b>Insertion Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_POLICY_LIST__INSERTION_POLICY = eINSTANCE.getInsertionPolicyList_InsertionPolicy();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_POLICY_LIST__COMPONENT_IMPLEMENTATION = eINSTANCE.getInsertionPolicyList_ComponentImplementation();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.LanguageLibrariesImpl <em>Language Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.LanguageLibrariesImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLanguageLibraries()
		 * @generated
		 */
		EClass LANGUAGE_LIBRARIES = eINSTANCE.getLanguageLibraries();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_LIBRARIES__LIBRARY = eINSTANCE.getLanguageLibraries_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.LanguageLibraryImpl <em>Language Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.LanguageLibraryImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLanguageLibrary()
		 * @generated
		 */
		EClass LANGUAGE_LIBRARY = eINSTANCE.getLanguageLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_LIBRARY__NAME = eINSTANCE.getLanguageLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_LIBRARY__TYPE = eINSTANCE.getLanguageLibrary_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_LIBRARY__VERSION = eINSTANCE.getLanguageLibrary_Version();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.MemoryUsageImpl <em>Memory Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.MemoryUsageImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getMemoryUsage()
		 * @generated
		 */
		EClass MEMORY_USAGE = eINSTANCE.getMemoryUsage();

		/**
		 * The meta object literal for the '<em><b>Module Memory Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_USAGE__MODULE_MEMORY_USAGE = eINSTANCE.getMemoryUsage_ModuleMemoryUsage();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl <em>Module Activation Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleActivationProfile()
		 * @generated
		 */
		EClass MODULE_ACTIVATION_PROFILE = eINSTANCE.getModuleActivationProfile();

		/**
		 * The meta object literal for the '<em><b>Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ACTIVATION_PROFILE__PERIODIC = eINSTANCE.getModuleActivationProfile_Periodic();

		/**
		 * The meta object literal for the '<em><b>Reactive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ACTIVATION_PROFILE__REACTIVE = eINSTANCE.getModuleActivationProfile_Reactive();

		/**
		 * The meta object literal for the '<em><b>Activation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE = eINSTANCE.getModuleActivationProfile_ActivationType();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ACTIVATION_PROFILE__BEHAVIOUR = eINSTANCE.getModuleActivationProfile_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ACTIVATION_PROFILE__INSTANCE_NAME = eINSTANCE.getModuleActivationProfile_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Max Nb Of Processed Ops Per Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION = eINSTANCE.getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation();

		/**
		 * The meta object literal for the '<em><b>Queue Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH = eINSTANCE.getModuleActivationProfile_QueueDepth();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfilesImpl <em>Module Activation Profiles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModuleActivationProfilesImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleActivationProfiles()
		 * @generated
		 */
		EClass MODULE_ACTIVATION_PROFILES = eINSTANCE.getModuleActivationProfiles();

		/**
		 * The meta object literal for the '<em><b>Activation Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ACTIVATION_PROFILES__ACTIVATION_PROFILE = eINSTANCE.getModuleActivationProfiles_ActivationProfile();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleCompilationOptionsImpl <em>Module Compilation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModuleCompilationOptionsImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleCompilationOptions()
		 * @generated
		 */
		EClass MODULE_COMPILATION_OPTIONS = eINSTANCE.getModuleCompilationOptions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_COMPILATION_OPTIONS__VALUE = eINSTANCE.getModuleCompilationOptions_Value();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_COMPILATION_OPTIONS__INSTANCE_NAME = eINSTANCE.getModuleCompilationOptions_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl <em>Module Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModuleDependenciesImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleDependencies()
		 * @generated
		 */
		EClass MODULE_DEPENDENCIES = eINSTANCE.getModuleDependencies();

		/**
		 * The meta object literal for the '<em><b>Language Runtime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEPENDENCIES__LANGUAGE_RUNTIME = eINSTANCE.getModuleDependencies_LanguageRuntime();

		/**
		 * The meta object literal for the '<em><b>Language Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES = eINSTANCE.getModuleDependencies_LanguageLibraries();

		/**
		 * The meta object literal for the '<em><b>Direct OS Access</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEPENDENCIES__DIRECT_OS_ACCESS = eINSTANCE.getModuleDependencies_DirectOSAccess();

		/**
		 * The meta object literal for the '<em><b>Module Compilation Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS = eINSTANCE.getModuleDependencies_ModuleCompilationOptions();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCIES__INSTANCE_NAME = eINSTANCE.getModuleDependencies_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl <em>Module Memory Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModuleMemoryUsageImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModuleMemoryUsage()
		 * @generated
		 */
		EClass MODULE_MEMORY_USAGE = eINSTANCE.getModuleMemoryUsage();

		/**
		 * The meta object literal for the '<em><b>User Context Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_MEMORY_USAGE__USER_CONTEXT_SIZE = eINSTANCE.getModuleMemoryUsage_UserContextSize();

		/**
		 * The meta object literal for the '<em><b>Warm Start Context Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_MEMORY_USAGE__WARM_START_CONTEXT_SIZE = eINSTANCE.getModuleMemoryUsage_WarmStartContextSize();

		/**
		 * The meta object literal for the '<em><b>Dynamic Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_MEMORY_USAGE__DYNAMIC_MEMORY = eINSTANCE.getModuleMemoryUsage_DynamicMemory();

		/**
		 * The meta object literal for the '<em><b>Stack Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_MEMORY_USAGE__STACK_SIZE = eINSTANCE.getModuleMemoryUsage_StackSize();

		/**
		 * The meta object literal for the '<em><b>Heap Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_MEMORY_USAGE__HEAP_SIZE = eINSTANCE.getModuleMemoryUsage_HeapSize();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_MEMORY_USAGE__INSTANCE_NAME = eINSTANCE.getModuleMemoryUsage_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl <em>Module PINFO Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModulePINFOTypeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModulePINFOType()
		 * @generated
		 */
		EClass MODULE_PINFO_TYPE = eINSTANCE.getModulePINFOType();

		/**
		 * The meta object literal for the '<em><b>Public PINFO</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PINFO_TYPE__PUBLIC_PINFO = eINSTANCE.getModulePINFOType_PublicPINFO();

		/**
		 * The meta object literal for the '<em><b>Private PINFO</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PINFO_TYPE__PRIVATE_PINFO = eINSTANCE.getModulePINFOType_PrivatePINFO();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PINFO_TYPE__INSTANCE_NAME = eINSTANCE.getModulePINFOType_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.ModulesDependenciesImpl <em>Modules Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.ModulesDependenciesImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getModulesDependencies()
		 * @generated
		 */
		EClass MODULES_DEPENDENCIES = eINSTANCE.getModulesDependencies();

		/**
		 * The meta object literal for the '<em><b>Module Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES_DEPENDENCIES__MODULE_DEPENDENCIES = eINSTANCE.getModulesDependencies_ModuleDependencies();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.OSAPITypeImpl <em>OSAPI Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.OSAPITypeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getOSAPIType()
		 * @generated
		 */
		EClass OSAPI_TYPE = eINSTANCE.getOSAPIType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSAPI_TYPE__TYPE = eINSTANCE.getOSAPIType_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.PeriodicActivationProfileImpl <em>Periodic Activation Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.PeriodicActivationProfileImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriodicActivationProfile()
		 * @generated
		 */
		EClass PERIODIC_ACTIVATION_PROFILE = eINSTANCE.getPeriodicActivationProfile();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVATION_PROFILE__DEADLINE = eINSTANCE.getPeriodicActivationProfile_Deadline();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVATION_PROFILE__PERIOD = eINSTANCE.getPeriodicActivationProfile_Period();

		/**
		 * The meta object literal for the '<em><b>Relative Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVATION_PROFILE__RELATIVE_PRIORITY = eINSTANCE.getPeriodicActivationProfile_RelativePriority();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVATION_PROFILE__WCET = eINSTANCE.getPeriodicActivationProfile_Wcet();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.PINFOValueImpl <em>PINFO Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.PINFOValueImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPINFOValue()
		 * @generated
		 */
		EClass PINFO_VALUE = eINSTANCE.getPINFOValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINFO_VALUE__VALUE = eINSTANCE.getPINFOValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINFO_VALUE__NAME = eINSTANCE.getPINFOValue_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl <em>Realtime Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.RealtimeCharacteristicsImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRealtimeCharacteristics()
		 * @generated
		 */
		EClass REALTIME_CHARACTERISTICS = eINSTANCE.getRealtimeCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_CHARACTERISTICS__SCHEDULING_POLICY = eINSTANCE.getRealtimeCharacteristics_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Module Activation Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_CHARACTERISTICS__MODULE_ACTIVATION_PROFILES = eINSTANCE.getRealtimeCharacteristics_ModuleActivationProfiles();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.RegisterSizeImpl <em>Register Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.RegisterSizeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRegisterSize()
		 * @generated
		 */
		EClass REGISTER_SIZE = eINSTANCE.getRegisterSize();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER_SIZE__SIZE = eINSTANCE.getRegisterSize_Size();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.SchedulingPolicyTypeImpl <em>Scheduling Policy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.SchedulingPolicyTypeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicyType()
		 * @generated
		 */
		EClass SCHEDULING_POLICY_TYPE = eINSTANCE.getSchedulingPolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_POLICY_TYPE__POLICY = eINSTANCE.getSchedulingPolicyType_Policy();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.TimeAccuracyImpl <em>Time Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.TimeAccuracyImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeAccuracy()
		 * @generated
		 */
		EClass TIME_ACCURACY = eINSTANCE.getTimeAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ACCURACY__VALUE = eINSTANCE.getTimeAccuracy_Value();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl <em>Transport Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTransportProtocol()
		 * @generated
		 */
		EClass TRANSPORT_PROTOCOL = eINSTANCE.getTransportProtocol();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_PROTOCOL__INTEGRITY = eINSTANCE.getTransportProtocol_Integrity();

		/**
		 * The meta object literal for the '<em><b>Max Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_PROTOCOL__MAX_LATENCY = eINSTANCE.getTransportProtocol_MaxLatency();

		/**
		 * The meta object literal for the '<em><b>Min Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_PROTOCOL__MIN_BANDWIDTH = eINSTANCE.getTransportProtocol_MinBandwidth();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_PROTOCOL__QUALITY = eINSTANCE.getTransportProtocol_Quality();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.UseTypeImpl
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getUseType()
		 * @generated
		 */
		EClass USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_TYPE__LIBRARY = eINSTANCE.getUseType_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.ActivationTypeType <em>Activation Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getActivationTypeType()
		 * @generated
		 */
		EEnum ACTIVATION_TYPE_TYPE = eINSTANCE.getActivationTypeType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.AllocationType <em>Allocation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.AllocationType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAllocationType()
		 * @generated
		 */
		EEnum ALLOCATION_TYPE = eINSTANCE.getAllocationType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.IntegrityType <em>Integrity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.IntegrityType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getIntegrityType()
		 * @generated
		 */
		EEnum INTEGRITY_TYPE = eINSTANCE.getIntegrityType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.ProfileType <em>Profile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ProfileType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProfileType()
		 * @generated
		 */
		EEnum PROFILE_TYPE = eINSTANCE.getProfileType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.QualityType <em>Quality Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.QualityType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getQualityType()
		 * @generated
		 */
		EEnum QUALITY_TYPE = eINSTANCE.getQualityType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.SizeType <em>Size Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.SizeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSizeType()
		 * @generated
		 */
		EEnum SIZE_TYPE = eINSTANCE.getSizeType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.TypeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link technology.ecoa.insertion.policy._2.TypeType1 <em>Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.TypeType1
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeType1()
		 * @generated
		 */
		EEnum TYPE_TYPE1 = eINSTANCE.getTypeType1();

		/**
		 * The meta object literal for the '<em>Activation Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getActivationTypeTypeObject()
		 * @generated
		 */
		EDataType ACTIVATION_TYPE_TYPE_OBJECT = eINSTANCE.getActivationTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Allocation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.AllocationType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getAllocationTypeObject()
		 * @generated
		 */
		EDataType ALLOCATION_TYPE_OBJECT = eINSTANCE.getAllocationTypeObject();

		/**
		 * The meta object literal for the '<em>Deadline</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeadline()
		 * @generated
		 */
		EDataType DEADLINE = eINSTANCE.getDeadline();

		/**
		 * The meta object literal for the '<em>Deadline Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getDeadlineObject()
		 * @generated
		 */
		EDataType DEADLINE_OBJECT = eINSTANCE.getDeadlineObject();

		/**
		 * The meta object literal for the '<em>File Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getFileType()
		 * @generated
		 */
		EDataType FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '<em>Generic Compilation Options</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getGenericCompilationOptions()
		 * @generated
		 */
		EDataType GENERIC_COMPILATION_OPTIONS = eINSTANCE.getGenericCompilationOptions();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Integrity Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.IntegrityType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getIntegrityTypeObject()
		 * @generated
		 */
		EDataType INTEGRITY_TYPE_OBJECT = eINSTANCE.getIntegrityTypeObject();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Period</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriod()
		 * @generated
		 */
		EDataType PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em>Period Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getPeriodObject()
		 * @generated
		 */
		EDataType PERIOD_OBJECT = eINSTANCE.getPeriodObject();

		/**
		 * The meta object literal for the '<em>Profile Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ProfileType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProfileTypeObject()
		 * @generated
		 */
		EDataType PROFILE_TYPE_OBJECT = eINSTANCE.getProfileTypeObject();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.ProgrammingLanguage
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Quality Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.QualityType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getQualityTypeObject()
		 * @generated
		 */
		EDataType QUALITY_TYPE_OBJECT = eINSTANCE.getQualityTypeObject();

		/**
		 * The meta object literal for the '<em>Relative Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getRelativePriority()
		 * @generated
		 */
		EDataType RELATIVE_PRIORITY = eINSTANCE.getRelativePriority();

		/**
		 * The meta object literal for the '<em>Scheduling Policy Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.SchedulingPolicy
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSchedulingPolicyObject()
		 * @generated
		 */
		EDataType SCHEDULING_POLICY_OBJECT = eINSTANCE.getSchedulingPolicyObject();

		/**
		 * The meta object literal for the '<em>Size Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.SizeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSizeTypeObject()
		 * @generated
		 */
		EDataType SIZE_TYPE_OBJECT = eINSTANCE.getSizeTypeObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Target</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTarget()
		 * @generated
		 */
		EDataType TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.TypeType
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.TypeType1
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getTypeTypeObject1()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT1 = eINSTANCE.getTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>WCET</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getWCET()
		 * @generated
		 */
		EDataType WCET = eINSTANCE.getWCET();

		/**
		 * The meta object literal for the '<em>WCET Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.insertion.policy._2.impl.polPackageImpl#getWCETObject()
		 * @generated
		 */
		EDataType WCET_OBJECT = eINSTANCE.getWCETObject();

	}

} //polPackage
