/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see edtdeployment.EdtdeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface EdtdeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtdeployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edtdeployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edtdeployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdtdeploymentPackage eINSTANCE = edtdeployment.impl.EdtdeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link edtdeployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.DeploymentImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logical System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__LOGICAL_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Final Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__FINAL_ASSEMBLY = 2;

	/**
	 * The feature id for the '<em><b>Protection Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PROTECTION_DOMAINS = 3;

	/**
	 * The feature id for the '<em><b>Log Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__LOG_POLICIES = 4;

	/**
	 * The feature id for the '<em><b>Platform Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PLATFORM_CONFIGURATIONS = 5;

	/**
	 * The feature id for the '<em><b>Wire Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__WIRE_MAPPINGS = 6;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.ProtectionDomainImpl <em>Protection Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.ProtectionDomainImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getProtectionDomain()
	 * @generated
	 */
	int PROTECTION_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Deployed Module Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Deployed Trigger Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Execute On Computing Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE = 3;

	/**
	 * The feature id for the '<em><b>Execute On Computing Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM = 4;

	/**
	 * The number of structural features of the '<em>Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.DeployedModuleInstanceImpl <em>Deployed Module Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.DeployedModuleInstanceImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployedModuleInstance()
	 * @generated
	 */
	int DEPLOYED_MODULE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Module Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE__COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Deployed Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deployed Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.DeployedTriggerInstanceImpl <em>Deployed Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.DeployedTriggerInstanceImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployedTriggerInstance()
	 * @generated
	 */
	int DEPLOYED_TRIGGER_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Trigger Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Trigger Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE__COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Deployed Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deployed Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.LogPolicyImpl <em>Log Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.LogPolicyImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getLogPolicy()
	 * @generated
	 */
	int LOG_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Component Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_POLICY__COMPONENT_LOGS = 0;

	/**
	 * The number of structural features of the '<em>Log Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Log Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.ComponentLogImpl <em>Component Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.ComponentLogImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getComponentLog()
	 * @generated
	 */
	int COMPONENT_LOG = 5;

	/**
	 * The feature id for the '<em><b>Module Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__MODULE_LOGS = 0;

	/**
	 * The feature id for the '<em><b>Enabled Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__ENABLED_LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__COMPONENT_IMPLEMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Component Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.ModuleLogImpl <em>Module Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.ModuleLogImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getModuleLog()
	 * @generated
	 */
	int MODULE_LOG = 6;

	/**
	 * The feature id for the '<em><b>Enabled Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG__ENABLED_LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Module Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG__MODULE_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Module Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.PlatformConfigurationImpl <em>Platform Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.PlatformConfigurationImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getPlatformConfiguration()
	 * @generated
	 */
	int PLATFORM_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Computing Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Platform Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__PLATFORM_MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__EUI_DS = 2;

	/**
	 * The feature id for the '<em><b>Fault Handler Notification Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Computing Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__COMPUTING_PLATFORM = 4;

	/**
	 * The number of structural features of the '<em>Platform Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Platform Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.PlatformMessageImpl <em>Platform Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.PlatformMessageImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getPlatformMessage()
	 * @generated
	 */
	int PLATFORM_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Mapped On Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGE__MAPPED_ON_LINK_ID = 0;

	/**
	 * The number of structural features of the '<em>Platform Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtdeployment.impl.ComputingNodeConfigurationImpl <em>Computing Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.ComputingNodeConfigurationImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getComputingNodeConfiguration()
	 * @generated
	 */
	int COMPUTING_NODE_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Scheduling Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Computing Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE = 1;

	/**
	 * The number of structural features of the '<em>Computing Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Computing Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link edtdeployment.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtdeployment.impl.WireMappingImpl
	 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getWireMapping()
	 * @generated
	 */
	int WIRE_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Mapped On Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__MAPPED_ON_LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__WIRE = 1;

	/**
	 * The number of structural features of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edtdeployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see edtdeployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtdeployment.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.Deployment#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical System</em>'.
	 * @see edtdeployment.Deployment#getLogicalSystem()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_LogicalSystem();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.Deployment#getFinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Assembly</em>'.
	 * @see edtdeployment.Deployment#getFinalAssembly()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_FinalAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.Deployment#getProtectionDomains <em>Protection Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Domains</em>'.
	 * @see edtdeployment.Deployment#getProtectionDomains()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ProtectionDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.Deployment#getLogPolicies <em>Log Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Policies</em>'.
	 * @see edtdeployment.Deployment#getLogPolicies()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_LogPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.Deployment#getPlatformConfigurations <em>Platform Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Configurations</em>'.
	 * @see edtdeployment.Deployment#getPlatformConfigurations()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_PlatformConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.Deployment#getWireMappings <em>Wire Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire Mappings</em>'.
	 * @see edtdeployment.Deployment#getWireMappings()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_WireMappings();

	/**
	 * Returns the meta object for class '{@link edtdeployment.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Domain</em>'.
	 * @see edtdeployment.ProtectionDomain
	 * @generated
	 */
	EClass getProtectionDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.ProtectionDomain#getDeployedModuleInstances <em>Deployed Module Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Module Instances</em>'.
	 * @see edtdeployment.ProtectionDomain#getDeployedModuleInstances()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_DeployedModuleInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.ProtectionDomain#getDeployedTriggerInstances <em>Deployed Trigger Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Trigger Instances</em>'.
	 * @see edtdeployment.ProtectionDomain#getDeployedTriggerInstances()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_DeployedTriggerInstances();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.ProtectionDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtdeployment.ProtectionDomain#getName()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EAttribute getProtectionDomain_Name();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ProtectionDomain#getExecuteOnComputingNode <em>Execute On Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execute On Computing Node</em>'.
	 * @see edtdeployment.ProtectionDomain#getExecuteOnComputingNode()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_ExecuteOnComputingNode();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ProtectionDomain#getExecuteOnComputingPlatform <em>Execute On Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execute On Computing Platform</em>'.
	 * @see edtdeployment.ProtectionDomain#getExecuteOnComputingPlatform()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_ExecuteOnComputingPlatform();

	/**
	 * Returns the meta object for class '{@link edtdeployment.DeployedModuleInstance <em>Deployed Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Module Instance</em>'.
	 * @see edtdeployment.DeployedModuleInstance
	 * @generated
	 */
	EClass getDeployedModuleInstance();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.DeployedModuleInstance#getModulePriority <em>Module Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Priority</em>'.
	 * @see edtdeployment.DeployedModuleInstance#getModulePriority()
	 * @see #getDeployedModuleInstance()
	 * @generated
	 */
	EAttribute getDeployedModuleInstance_ModulePriority();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedModuleInstance#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Instance</em>'.
	 * @see edtdeployment.DeployedModuleInstance#getModuleInstance()
	 * @see #getDeployedModuleInstance()
	 * @generated
	 */
	EReference getDeployedModuleInstance_ModuleInstance();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedModuleInstance#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Implementation</em>'.
	 * @see edtdeployment.DeployedModuleInstance#getComponentImplementation()
	 * @see #getDeployedModuleInstance()
	 * @generated
	 */
	EReference getDeployedModuleInstance_ComponentImplementation();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedModuleInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edtdeployment.DeployedModuleInstance#getComponent()
	 * @see #getDeployedModuleInstance()
	 * @generated
	 */
	EReference getDeployedModuleInstance_Component();

	/**
	 * Returns the meta object for class '{@link edtdeployment.DeployedTriggerInstance <em>Deployed Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Trigger Instance</em>'.
	 * @see edtdeployment.DeployedTriggerInstance
	 * @generated
	 */
	EClass getDeployedTriggerInstance();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.DeployedTriggerInstance#getTriggerPriority <em>Trigger Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Priority</em>'.
	 * @see edtdeployment.DeployedTriggerInstance#getTriggerPriority()
	 * @see #getDeployedTriggerInstance()
	 * @generated
	 */
	EAttribute getDeployedTriggerInstance_TriggerPriority();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedTriggerInstance#getTriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Instance</em>'.
	 * @see edtdeployment.DeployedTriggerInstance#getTriggerInstance()
	 * @see #getDeployedTriggerInstance()
	 * @generated
	 */
	EReference getDeployedTriggerInstance_TriggerInstance();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedTriggerInstance#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Implementation</em>'.
	 * @see edtdeployment.DeployedTriggerInstance#getComponentImplementation()
	 * @see #getDeployedTriggerInstance()
	 * @generated
	 */
	EReference getDeployedTriggerInstance_ComponentImplementation();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.DeployedTriggerInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edtdeployment.DeployedTriggerInstance#getComponent()
	 * @see #getDeployedTriggerInstance()
	 * @generated
	 */
	EReference getDeployedTriggerInstance_Component();

	/**
	 * Returns the meta object for class '{@link edtdeployment.LogPolicy <em>Log Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Policy</em>'.
	 * @see edtdeployment.LogPolicy
	 * @generated
	 */
	EClass getLogPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.LogPolicy#getComponentLogs <em>Component Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Logs</em>'.
	 * @see edtdeployment.LogPolicy#getComponentLogs()
	 * @see #getLogPolicy()
	 * @generated
	 */
	EReference getLogPolicy_ComponentLogs();

	/**
	 * Returns the meta object for class '{@link edtdeployment.ComponentLog <em>Component Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Log</em>'.
	 * @see edtdeployment.ComponentLog
	 * @generated
	 */
	EClass getComponentLog();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.ComponentLog#getModuleLogs <em>Module Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Logs</em>'.
	 * @see edtdeployment.ComponentLog#getModuleLogs()
	 * @see #getComponentLog()
	 * @generated
	 */
	EReference getComponentLog_ModuleLogs();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.ComponentLog#getEnabledLevels <em>Enabled Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Levels</em>'.
	 * @see edtdeployment.ComponentLog#getEnabledLevels()
	 * @see #getComponentLog()
	 * @generated
	 */
	EAttribute getComponentLog_EnabledLevels();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ComponentLog#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see edtdeployment.ComponentLog#getComponentInstance()
	 * @see #getComponentLog()
	 * @generated
	 */
	EReference getComponentLog_ComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ComponentLog#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Implementation</em>'.
	 * @see edtdeployment.ComponentLog#getComponentImplementation()
	 * @see #getComponentLog()
	 * @generated
	 */
	EReference getComponentLog_ComponentImplementation();

	/**
	 * Returns the meta object for class '{@link edtdeployment.ModuleLog <em>Module Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Log</em>'.
	 * @see edtdeployment.ModuleLog
	 * @generated
	 */
	EClass getModuleLog();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.ModuleLog#getEnabledLevels <em>Enabled Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Levels</em>'.
	 * @see edtdeployment.ModuleLog#getEnabledLevels()
	 * @see #getModuleLog()
	 * @generated
	 */
	EAttribute getModuleLog_EnabledLevels();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ModuleLog#getModuleInstance <em>Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Instance</em>'.
	 * @see edtdeployment.ModuleLog#getModuleInstance()
	 * @see #getModuleLog()
	 * @generated
	 */
	EReference getModuleLog_ModuleInstance();

	/**
	 * Returns the meta object for class '{@link edtdeployment.PlatformConfiguration <em>Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Configuration</em>'.
	 * @see edtdeployment.PlatformConfiguration
	 * @generated
	 */
	EClass getPlatformConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.PlatformConfiguration#getComputingNodeConfigurations <em>Computing Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computing Node Configurations</em>'.
	 * @see edtdeployment.PlatformConfiguration#getComputingNodeConfigurations()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EReference getPlatformConfiguration_ComputingNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edtdeployment.PlatformConfiguration#getPlatformMessages <em>Platform Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Messages</em>'.
	 * @see edtdeployment.PlatformConfiguration#getPlatformMessages()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EReference getPlatformConfiguration_PlatformMessages();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.PlatformConfiguration#getEUIDs <em>EUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EUI Ds</em>'.
	 * @see edtdeployment.PlatformConfiguration#getEUIDs()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EAttribute getPlatformConfiguration_EUIDs();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Handler Notification Max Number</em>'.
	 * @see edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EAttribute getPlatformConfiguration_FaultHandlerNotificationMaxNumber();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.PlatformConfiguration#getComputingPlatform <em>Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computing Platform</em>'.
	 * @see edtdeployment.PlatformConfiguration#getComputingPlatform()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EReference getPlatformConfiguration_ComputingPlatform();

	/**
	 * Returns the meta object for class '{@link edtdeployment.PlatformMessage <em>Platform Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Message</em>'.
	 * @see edtdeployment.PlatformMessage
	 * @generated
	 */
	EClass getPlatformMessage();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.PlatformMessage#getMappedOnLinkId <em>Mapped On Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped On Link Id</em>'.
	 * @see edtdeployment.PlatformMessage#getMappedOnLinkId()
	 * @see #getPlatformMessage()
	 * @generated
	 */
	EReference getPlatformMessage_MappedOnLinkId();

	/**
	 * Returns the meta object for class '{@link edtdeployment.ComputingNodeConfiguration <em>Computing Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Node Configuration</em>'.
	 * @see edtdeployment.ComputingNodeConfiguration
	 * @generated
	 */
	EClass getComputingNodeConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edtdeployment.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Information</em>'.
	 * @see edtdeployment.ComputingNodeConfiguration#getSchedulingInformation()
	 * @see #getComputingNodeConfiguration()
	 * @generated
	 */
	EAttribute getComputingNodeConfiguration_SchedulingInformation();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computing Node</em>'.
	 * @see edtdeployment.ComputingNodeConfiguration#getComputingNode()
	 * @see #getComputingNodeConfiguration()
	 * @generated
	 */
	EReference getComputingNodeConfiguration_ComputingNode();

	/**
	 * Returns the meta object for class '{@link edtdeployment.WireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Mapping</em>'.
	 * @see edtdeployment.WireMapping
	 * @generated
	 */
	EClass getWireMapping();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.WireMapping#getMappedOnLinkId <em>Mapped On Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped On Link Id</em>'.
	 * @see edtdeployment.WireMapping#getMappedOnLinkId()
	 * @see #getWireMapping()
	 * @generated
	 */
	EReference getWireMapping_MappedOnLinkId();

	/**
	 * Returns the meta object for the reference '{@link edtdeployment.WireMapping#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wire</em>'.
	 * @see edtdeployment.WireMapping#getWire()
	 * @see #getWireMapping()
	 * @generated
	 */
	EReference getWireMapping_Wire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdtdeploymentFactory getEdtdeploymentFactory();

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
		 * The meta object literal for the '{@link edtdeployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.DeploymentImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Logical System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__LOGICAL_SYSTEM = eINSTANCE.getDeployment_LogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Final Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__FINAL_ASSEMBLY = eINSTANCE.getDeployment_FinalAssembly();

		/**
		 * The meta object literal for the '<em><b>Protection Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PROTECTION_DOMAINS = eINSTANCE.getDeployment_ProtectionDomains();

		/**
		 * The meta object literal for the '<em><b>Log Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__LOG_POLICIES = eINSTANCE.getDeployment_LogPolicies();

		/**
		 * The meta object literal for the '<em><b>Platform Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PLATFORM_CONFIGURATIONS = eINSTANCE.getDeployment_PlatformConfigurations();

		/**
		 * The meta object literal for the '<em><b>Wire Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__WIRE_MAPPINGS = eINSTANCE.getDeployment_WireMappings();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.ProtectionDomainImpl <em>Protection Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.ProtectionDomainImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getProtectionDomain()
		 * @generated
		 */
		EClass PROTECTION_DOMAIN = eINSTANCE.getProtectionDomain();

		/**
		 * The meta object literal for the '<em><b>Deployed Module Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES = eINSTANCE.getProtectionDomain_DeployedModuleInstances();

		/**
		 * The meta object literal for the '<em><b>Deployed Trigger Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES = eINSTANCE.getProtectionDomain_DeployedTriggerInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_DOMAIN__NAME = eINSTANCE.getProtectionDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Execute On Computing Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE = eINSTANCE.getProtectionDomain_ExecuteOnComputingNode();

		/**
		 * The meta object literal for the '<em><b>Execute On Computing Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM = eINSTANCE.getProtectionDomain_ExecuteOnComputingPlatform();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.DeployedModuleInstanceImpl <em>Deployed Module Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.DeployedModuleInstanceImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployedModuleInstance()
		 * @generated
		 */
		EClass DEPLOYED_MODULE_INSTANCE = eINSTANCE.getDeployedModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Module Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_MODULE_INSTANCE__MODULE_PRIORITY = eINSTANCE.getDeployedModuleInstance_ModulePriority();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_MODULE_INSTANCE__MODULE_INSTANCE = eINSTANCE.getDeployedModuleInstance_ModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_MODULE_INSTANCE__COMPONENT_IMPLEMENTATION = eINSTANCE.getDeployedModuleInstance_ComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_MODULE_INSTANCE__COMPONENT = eINSTANCE.getDeployedModuleInstance_Component();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.DeployedTriggerInstanceImpl <em>Deployed Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.DeployedTriggerInstanceImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getDeployedTriggerInstance()
		 * @generated
		 */
		EClass DEPLOYED_TRIGGER_INSTANCE = eINSTANCE.getDeployedTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Trigger Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY = eINSTANCE.getDeployedTriggerInstance_TriggerPriority();

		/**
		 * The meta object literal for the '<em><b>Trigger Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE = eINSTANCE.getDeployedTriggerInstance_TriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_TRIGGER_INSTANCE__COMPONENT_IMPLEMENTATION = eINSTANCE.getDeployedTriggerInstance_ComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_TRIGGER_INSTANCE__COMPONENT = eINSTANCE.getDeployedTriggerInstance_Component();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.LogPolicyImpl <em>Log Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.LogPolicyImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getLogPolicy()
		 * @generated
		 */
		EClass LOG_POLICY = eINSTANCE.getLogPolicy();

		/**
		 * The meta object literal for the '<em><b>Component Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_POLICY__COMPONENT_LOGS = eINSTANCE.getLogPolicy_ComponentLogs();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.ComponentLogImpl <em>Component Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.ComponentLogImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getComponentLog()
		 * @generated
		 */
		EClass COMPONENT_LOG = eINSTANCE.getComponentLog();

		/**
		 * The meta object literal for the '<em><b>Module Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_LOG__MODULE_LOGS = eINSTANCE.getComponentLog_ModuleLogs();

		/**
		 * The meta object literal for the '<em><b>Enabled Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_LOG__ENABLED_LEVELS = eINSTANCE.getComponentLog_EnabledLevels();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_LOG__COMPONENT_INSTANCE = eINSTANCE.getComponentLog_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_LOG__COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentLog_ComponentImplementation();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.ModuleLogImpl <em>Module Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.ModuleLogImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getModuleLog()
		 * @generated
		 */
		EClass MODULE_LOG = eINSTANCE.getModuleLog();

		/**
		 * The meta object literal for the '<em><b>Enabled Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_LOG__ENABLED_LEVELS = eINSTANCE.getModuleLog_EnabledLevels();

		/**
		 * The meta object literal for the '<em><b>Module Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_LOG__MODULE_INSTANCE = eINSTANCE.getModuleLog_ModuleInstance();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.PlatformConfigurationImpl <em>Platform Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.PlatformConfigurationImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getPlatformConfiguration()
		 * @generated
		 */
		EClass PLATFORM_CONFIGURATION = eINSTANCE.getPlatformConfiguration();

		/**
		 * The meta object literal for the '<em><b>Computing Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS = eINSTANCE.getPlatformConfiguration_ComputingNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Platform Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONFIGURATION__PLATFORM_MESSAGES = eINSTANCE.getPlatformConfiguration_PlatformMessages();

		/**
		 * The meta object literal for the '<em><b>EUI Ds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_CONFIGURATION__EUI_DS = eINSTANCE.getPlatformConfiguration_EUIDs();

		/**
		 * The meta object literal for the '<em><b>Fault Handler Notification Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER = eINSTANCE.getPlatformConfiguration_FaultHandlerNotificationMaxNumber();

		/**
		 * The meta object literal for the '<em><b>Computing Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONFIGURATION__COMPUTING_PLATFORM = eINSTANCE.getPlatformConfiguration_ComputingPlatform();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.PlatformMessageImpl <em>Platform Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.PlatformMessageImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getPlatformMessage()
		 * @generated
		 */
		EClass PLATFORM_MESSAGE = eINSTANCE.getPlatformMessage();

		/**
		 * The meta object literal for the '<em><b>Mapped On Link Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MESSAGE__MAPPED_ON_LINK_ID = eINSTANCE.getPlatformMessage_MappedOnLinkId();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.ComputingNodeConfigurationImpl <em>Computing Node Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.ComputingNodeConfigurationImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getComputingNodeConfiguration()
		 * @generated
		 */
		EClass COMPUTING_NODE_CONFIGURATION = eINSTANCE.getComputingNodeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Scheduling Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION = eINSTANCE.getComputingNodeConfiguration_SchedulingInformation();

		/**
		 * The meta object literal for the '<em><b>Computing Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE = eINSTANCE.getComputingNodeConfiguration_ComputingNode();

		/**
		 * The meta object literal for the '{@link edtdeployment.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtdeployment.impl.WireMappingImpl
		 * @see edtdeployment.impl.EdtdeploymentPackageImpl#getWireMapping()
		 * @generated
		 */
		EClass WIRE_MAPPING = eINSTANCE.getWireMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped On Link Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_MAPPING__MAPPED_ON_LINK_ID = eINSTANCE.getWireMapping_MappedOnLinkId();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE_MAPPING__WIRE = eINSTANCE.getWireMapping_Wire();

	}

} //EdtdeploymentPackage
