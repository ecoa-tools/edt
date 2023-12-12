/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

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
 * @see technology.ecoa.deployment._2.depFactory
 * @model kind="package"
 * @generated
 */
public interface depPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/deployment-2.0";

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
	depPackage eINSTANCE = technology.ecoa.deployment._2.impl.depPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.ComponentLogImpl <em>Component Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.ComponentLogImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getComponentLog()
	 * @generated
	 */
	int COMPONENT_LOG = 0;

	/**
	 * The feature id for the '<em><b>Module Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__MODULE_LOG = 0;

	/**
	 * The feature id for the '<em><b>Enabled Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__ENABLED_LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG__INSTANCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Component Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl <em>Computing Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getComputingNodeConfiguration()
	 * @generated
	 */
	int COMPUTING_NODE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Computing Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE = 0;

	/**
	 * The feature id for the '<em><b>Scheduling Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION = 1;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl <em>Deployed Module Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployedModuleInstanceType()
	 * @generated
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Module Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Deployed Module Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deployed Module Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_MODULE_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl <em>Deployed Trigger Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployedTriggerInstanceType()
	 * @generated
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Trigger Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Trigger Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Deployed Trigger Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deployed Trigger Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_TRIGGER_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.DeploymentImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Protection Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PROTECTION_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Log Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__LOG_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Platform Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PLATFORM_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Wire Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__WIRE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Final Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__FINAL_ASSEMBLY = 4;

	/**
	 * The feature id for the '<em><b>Logical System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__LOGICAL_SYSTEM = 5;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.DocumentRootImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPLOYMENT = 3;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl <em>Execute On Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getExecuteOnType()
	 * @generated
	 */
	int EXECUTE_ON_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Computing Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_ON_TYPE__COMPUTING_NODE = 0;

	/**
	 * The feature id for the '<em><b>Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_ON_TYPE__COMPUTING_PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>Execute On Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_ON_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execute On Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_ON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.LogPolicyImpl <em>Log Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.LogPolicyImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getLogPolicy()
	 * @generated
	 */
	int LOG_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Component Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_POLICY__COMPONENT_LOG = 0;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.ModuleLogImpl <em>Module Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.ModuleLogImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getModuleLog()
	 * @generated
	 */
	int MODULE_LOG = 8;

	/**
	 * The feature id for the '<em><b>Enabled Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG__ENABLED_LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LOG__INSTANCE_NAME = 1;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl <em>Platform Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.PlatformConfigurationImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getPlatformConfiguration()
	 * @generated
	 */
	int PLATFORM_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Computing Node Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Platform Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__PLATFORM_MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__COMPUTING_PLATFORM = 2;

	/**
	 * The feature id for the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__EUI_DS = 3;

	/**
	 * The feature id for the '<em><b>Fault Handler Notification Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER = 4;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.PlatformMessagesImpl <em>Platform Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.PlatformMessagesImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getPlatformMessages()
	 * @generated
	 */
	int PLATFORM_MESSAGES = 10;

	/**
	 * The feature id for the '<em><b>Mapped On Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGES__MAPPED_ON_LINK_ID = 0;

	/**
	 * The number of structural features of the '<em>Platform Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MESSAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl <em>Protection Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.ProtectionDomainImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProtectionDomain()
	 * @generated
	 */
	int PROTECTION_DOMAIN = 11;

	/**
	 * The feature id for the '<em><b>Execute On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__EXECUTE_ON = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Deployed Module Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Deployed Trigger Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__NAME = 4;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.UseTypeImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 12;

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
	 * The meta object id for the '{@link technology.ecoa.deployment._2.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.WireMappingImpl
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getWireMapping()
	 * @generated
	 */
	int WIRE_MAPPING = 13;

	/**
	 * The feature id for the '<em><b>Mapped On Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__MAPPED_ON_LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.deployment._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.ProgrammingLanguage
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 14;

	/**
	 * The meta object id for the '<em>Fifo Size</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getFifoSize()
	 * @generated
	 */
	int FIFO_SIZE = 15;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 16;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 17;

	/**
	 * The meta object id for the '<em>Module Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getModulePriority()
	 * @generated
	 */
	int MODULE_PRIORITY = 18;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 19;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.ProgrammingLanguage
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 21;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 23;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 25;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 26;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.ComponentLog <em>Component Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Log</em>'.
	 * @see technology.ecoa.deployment._2.ComponentLog
	 * @generated
	 */
	EClass getComponentLog();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.ComponentLog#getModuleLog <em>Module Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Log</em>'.
	 * @see technology.ecoa.deployment._2.ComponentLog#getModuleLog()
	 * @see #getComponentLog()
	 * @generated
	 */
	EReference getComponentLog_ModuleLog();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ComponentLog#getEnabledLevels <em>Enabled Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Levels</em>'.
	 * @see technology.ecoa.deployment._2.ComponentLog#getEnabledLevels()
	 * @see #getComponentLog()
	 * @generated
	 */
	EAttribute getComponentLog_EnabledLevels();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ComponentLog#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.deployment._2.ComponentLog#getInstanceName()
	 * @see #getComponentLog()
	 * @generated
	 */
	EAttribute getComponentLog_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration <em>Computing Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Node Configuration</em>'.
	 * @see technology.ecoa.deployment._2.ComputingNodeConfiguration
	 * @generated
	 */
	EClass getComputingNodeConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getComputingNode <em>Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing Node</em>'.
	 * @see technology.ecoa.deployment._2.ComputingNodeConfiguration#getComputingNode()
	 * @see #getComputingNodeConfiguration()
	 * @generated
	 */
	EAttribute getComputingNodeConfiguration_ComputingNode();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration#getSchedulingInformation <em>Scheduling Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Information</em>'.
	 * @see technology.ecoa.deployment._2.ComputingNodeConfiguration#getSchedulingInformation()
	 * @see #getComputingNodeConfiguration()
	 * @generated
	 */
	EAttribute getComputingNodeConfiguration_SchedulingInformation();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType <em>Deployed Module Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Module Instance Type</em>'.
	 * @see technology.ecoa.deployment._2.DeployedModuleInstanceType
	 * @generated
	 */
	EClass getDeployedModuleInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see technology.ecoa.deployment._2.DeployedModuleInstanceType#getComponentName()
	 * @see #getDeployedModuleInstanceType()
	 * @generated
	 */
	EAttribute getDeployedModuleInstanceType_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModuleInstanceName <em>Module Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Instance Name</em>'.
	 * @see technology.ecoa.deployment._2.DeployedModuleInstanceType#getModuleInstanceName()
	 * @see #getDeployedModuleInstanceType()
	 * @generated
	 */
	EAttribute getDeployedModuleInstanceType_ModuleInstanceName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType#getModulePriority <em>Module Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Priority</em>'.
	 * @see technology.ecoa.deployment._2.DeployedModuleInstanceType#getModulePriority()
	 * @see #getDeployedModuleInstanceType()
	 * @generated
	 */
	EAttribute getDeployedModuleInstanceType_ModulePriority();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType <em>Deployed Trigger Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Trigger Instance Type</em>'.
	 * @see technology.ecoa.deployment._2.DeployedTriggerInstanceType
	 * @generated
	 */
	EClass getDeployedTriggerInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see technology.ecoa.deployment._2.DeployedTriggerInstanceType#getComponentName()
	 * @see #getDeployedTriggerInstanceType()
	 * @generated
	 */
	EAttribute getDeployedTriggerInstanceType_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerInstanceName <em>Trigger Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Instance Name</em>'.
	 * @see technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerInstanceName()
	 * @see #getDeployedTriggerInstanceType()
	 * @generated
	 */
	EAttribute getDeployedTriggerInstanceType_TriggerInstanceName();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerPriority <em>Trigger Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Priority</em>'.
	 * @see technology.ecoa.deployment._2.DeployedTriggerInstanceType#getTriggerPriority()
	 * @see #getDeployedTriggerInstanceType()
	 * @generated
	 */
	EAttribute getDeployedTriggerInstanceType_TriggerPriority();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see technology.ecoa.deployment._2.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.Deployment#getProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Domain</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getProtectionDomain()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ProtectionDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.Deployment#getLogPolicy <em>Log Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Policy</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getLogPolicy()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_LogPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.Deployment#getPlatformConfiguration <em>Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Configuration</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getPlatformConfiguration()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_PlatformConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.Deployment#getWireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire Mapping</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getWireMapping()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_WireMapping();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.Deployment#getFinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Assembly</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getFinalAssembly()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_FinalAssembly();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.Deployment#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical System</em>'.
	 * @see technology.ecoa.deployment._2.Deployment#getLogicalSystem()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_LogicalSystem();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.deployment._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.deployment._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.deployment._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.deployment._2.DocumentRoot#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot#getDeployment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Deployment();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.deployment._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.deployment._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.ExecuteOnType <em>Execute On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute On Type</em>'.
	 * @see technology.ecoa.deployment._2.ExecuteOnType
	 * @generated
	 */
	EClass getExecuteOnType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingNode <em>Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing Node</em>'.
	 * @see technology.ecoa.deployment._2.ExecuteOnType#getComputingNode()
	 * @see #getExecuteOnType()
	 * @generated
	 */
	EAttribute getExecuteOnType_ComputingNode();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingPlatform <em>Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing Platform</em>'.
	 * @see technology.ecoa.deployment._2.ExecuteOnType#getComputingPlatform()
	 * @see #getExecuteOnType()
	 * @generated
	 */
	EAttribute getExecuteOnType_ComputingPlatform();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.LogPolicy <em>Log Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Policy</em>'.
	 * @see technology.ecoa.deployment._2.LogPolicy
	 * @generated
	 */
	EClass getLogPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.LogPolicy#getComponentLog <em>Component Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Log</em>'.
	 * @see technology.ecoa.deployment._2.LogPolicy#getComponentLog()
	 * @see #getLogPolicy()
	 * @generated
	 */
	EReference getLogPolicy_ComponentLog();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.ModuleLog <em>Module Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Log</em>'.
	 * @see technology.ecoa.deployment._2.ModuleLog
	 * @generated
	 */
	EClass getModuleLog();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ModuleLog#getEnabledLevels <em>Enabled Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Levels</em>'.
	 * @see technology.ecoa.deployment._2.ModuleLog#getEnabledLevels()
	 * @see #getModuleLog()
	 * @generated
	 */
	EAttribute getModuleLog_EnabledLevels();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ModuleLog#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see technology.ecoa.deployment._2.ModuleLog#getInstanceName()
	 * @see #getModuleLog()
	 * @generated
	 */
	EAttribute getModuleLog_InstanceName();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.PlatformConfiguration <em>Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Configuration</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration
	 * @generated
	 */
	EClass getPlatformConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.PlatformConfiguration#getComputingNodeConfiguration <em>Computing Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computing Node Configuration</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration#getComputingNodeConfiguration()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EReference getPlatformConfiguration_ComputingNodeConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.PlatformConfiguration#getPlatformMessages <em>Platform Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Messages</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration#getPlatformMessages()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EReference getPlatformConfiguration_PlatformMessages();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.PlatformConfiguration#getComputingPlatform <em>Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing Platform</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration#getComputingPlatform()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EAttribute getPlatformConfiguration_ComputingPlatform();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.PlatformConfiguration#getEUIDs <em>EUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EUI Ds</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration#getEUIDs()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EAttribute getPlatformConfiguration_EUIDs();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Handler Notification Max Number</em>'.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration#getFaultHandlerNotificationMaxNumber()
	 * @see #getPlatformConfiguration()
	 * @generated
	 */
	EAttribute getPlatformConfiguration_FaultHandlerNotificationMaxNumber();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.PlatformMessages <em>Platform Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Messages</em>'.
	 * @see technology.ecoa.deployment._2.PlatformMessages
	 * @generated
	 */
	EClass getPlatformMessages();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.PlatformMessages#getMappedOnLinkId <em>Mapped On Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped On Link Id</em>'.
	 * @see technology.ecoa.deployment._2.PlatformMessages#getMappedOnLinkId()
	 * @see #getPlatformMessages()
	 * @generated
	 */
	EAttribute getPlatformMessages_MappedOnLinkId();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Domain</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain
	 * @generated
	 */
	EClass getProtectionDomain();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.deployment._2.ProtectionDomain#getExecuteOn <em>Execute On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execute On</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain#getExecuteOn()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_ExecuteOn();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.deployment._2.ProtectionDomain#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain#getGroup()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EAttribute getProtectionDomain_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.ProtectionDomain#getDeployedModuleInstance <em>Deployed Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Module Instance</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain#getDeployedModuleInstance()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_DeployedModuleInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.deployment._2.ProtectionDomain#getDeployedTriggerInstance <em>Deployed Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Trigger Instance</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain#getDeployedTriggerInstance()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_DeployedTriggerInstance();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.ProtectionDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.deployment._2.ProtectionDomain#getName()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EAttribute getProtectionDomain_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.deployment._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.deployment._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.deployment._2.WireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Mapping</em>'.
	 * @see technology.ecoa.deployment._2.WireMapping
	 * @generated
	 */
	EClass getWireMapping();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.WireMapping#getMappedOnLinkId <em>Mapped On Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped On Link Id</em>'.
	 * @see technology.ecoa.deployment._2.WireMapping#getMappedOnLinkId()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_MappedOnLinkId();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.WireMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see technology.ecoa.deployment._2.WireMapping#getSource()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_Source();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.deployment._2.WireMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see technology.ecoa.deployment._2.WireMapping#getTarget()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_Target();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.deployment._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.deployment._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fifo Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fifo Size</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='FifoSize' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getFifoSize();

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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Module Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Module Priority</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ModulePriority' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0' maxInclusive='255'"
	 * @generated
	 */
	EDataType getModulePriority();

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
	 * Returns the meta object for data type '{@link technology.ecoa.deployment._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.deployment._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.deployment._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	depFactory getdepFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.ComponentLogImpl <em>Component Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.ComponentLogImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getComponentLog()
		 * @generated
		 */
		EClass COMPONENT_LOG = eINSTANCE.getComponentLog();

		/**
		 * The meta object literal for the '<em><b>Module Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_LOG__MODULE_LOG = eINSTANCE.getComponentLog_ModuleLog();

		/**
		 * The meta object literal for the '<em><b>Enabled Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_LOG__ENABLED_LEVELS = eINSTANCE.getComponentLog_EnabledLevels();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_LOG__INSTANCE_NAME = eINSTANCE.getComponentLog_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl <em>Computing Node Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getComputingNodeConfiguration()
		 * @generated
		 */
		EClass COMPUTING_NODE_CONFIGURATION = eINSTANCE.getComputingNodeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Computing Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE = eINSTANCE.getComputingNodeConfiguration_ComputingNode();

		/**
		 * The meta object literal for the '<em><b>Scheduling Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION = eINSTANCE.getComputingNodeConfiguration_SchedulingInformation();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl <em>Deployed Module Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.DeployedModuleInstanceTypeImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployedModuleInstanceType()
		 * @generated
		 */
		EClass DEPLOYED_MODULE_INSTANCE_TYPE = eINSTANCE.getDeployedModuleInstanceType();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_MODULE_INSTANCE_TYPE__COMPONENT_NAME = eINSTANCE.getDeployedModuleInstanceType_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Module Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_INSTANCE_NAME = eINSTANCE.getDeployedModuleInstanceType_ModuleInstanceName();

		/**
		 * The meta object literal for the '<em><b>Module Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_MODULE_INSTANCE_TYPE__MODULE_PRIORITY = eINSTANCE.getDeployedModuleInstanceType_ModulePriority();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl <em>Deployed Trigger Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.DeployedTriggerInstanceTypeImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployedTriggerInstanceType()
		 * @generated
		 */
		EClass DEPLOYED_TRIGGER_INSTANCE_TYPE = eINSTANCE.getDeployedTriggerInstanceType();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_TRIGGER_INSTANCE_TYPE__COMPONENT_NAME = eINSTANCE.getDeployedTriggerInstanceType_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Trigger Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_INSTANCE_NAME = eINSTANCE.getDeployedTriggerInstanceType_TriggerInstanceName();

		/**
		 * The meta object literal for the '<em><b>Trigger Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_TRIGGER_INSTANCE_TYPE__TRIGGER_PRIORITY = eINSTANCE.getDeployedTriggerInstanceType_TriggerPriority();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.DeploymentImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Protection Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PROTECTION_DOMAIN = eINSTANCE.getDeployment_ProtectionDomain();

		/**
		 * The meta object literal for the '<em><b>Log Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__LOG_POLICY = eINSTANCE.getDeployment_LogPolicy();

		/**
		 * The meta object literal for the '<em><b>Platform Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PLATFORM_CONFIGURATION = eINSTANCE.getDeployment_PlatformConfiguration();

		/**
		 * The meta object literal for the '<em><b>Wire Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__WIRE_MAPPING = eINSTANCE.getDeployment_WireMapping();

		/**
		 * The meta object literal for the '<em><b>Final Assembly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__FINAL_ASSEMBLY = eINSTANCE.getDeployment_FinalAssembly();

		/**
		 * The meta object literal for the '<em><b>Logical System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__LOGICAL_SYSTEM = eINSTANCE.getDeployment_LogicalSystem();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.DocumentRootImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPLOYMENT = eINSTANCE.getDocumentRoot_Deployment();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl <em>Execute On Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getExecuteOnType()
		 * @generated
		 */
		EClass EXECUTE_ON_TYPE = eINSTANCE.getExecuteOnType();

		/**
		 * The meta object literal for the '<em><b>Computing Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_ON_TYPE__COMPUTING_NODE = eINSTANCE.getExecuteOnType_ComputingNode();

		/**
		 * The meta object literal for the '<em><b>Computing Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_ON_TYPE__COMPUTING_PLATFORM = eINSTANCE.getExecuteOnType_ComputingPlatform();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.LogPolicyImpl <em>Log Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.LogPolicyImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getLogPolicy()
		 * @generated
		 */
		EClass LOG_POLICY = eINSTANCE.getLogPolicy();

		/**
		 * The meta object literal for the '<em><b>Component Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_POLICY__COMPONENT_LOG = eINSTANCE.getLogPolicy_ComponentLog();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.ModuleLogImpl <em>Module Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.ModuleLogImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getModuleLog()
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
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_LOG__INSTANCE_NAME = eINSTANCE.getModuleLog_InstanceName();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl <em>Platform Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.PlatformConfigurationImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getPlatformConfiguration()
		 * @generated
		 */
		EClass PLATFORM_CONFIGURATION = eINSTANCE.getPlatformConfiguration();

		/**
		 * The meta object literal for the '<em><b>Computing Node Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION = eINSTANCE.getPlatformConfiguration_ComputingNodeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Platform Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONFIGURATION__PLATFORM_MESSAGES = eINSTANCE.getPlatformConfiguration_PlatformMessages();

		/**
		 * The meta object literal for the '<em><b>Computing Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_CONFIGURATION__COMPUTING_PLATFORM = eINSTANCE.getPlatformConfiguration_ComputingPlatform();

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
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.PlatformMessagesImpl <em>Platform Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.PlatformMessagesImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getPlatformMessages()
		 * @generated
		 */
		EClass PLATFORM_MESSAGES = eINSTANCE.getPlatformMessages();

		/**
		 * The meta object literal for the '<em><b>Mapped On Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_MESSAGES__MAPPED_ON_LINK_ID = eINSTANCE.getPlatformMessages_MappedOnLinkId();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.ProtectionDomainImpl <em>Protection Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.ProtectionDomainImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProtectionDomain()
		 * @generated
		 */
		EClass PROTECTION_DOMAIN = eINSTANCE.getProtectionDomain();

		/**
		 * The meta object literal for the '<em><b>Execute On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__EXECUTE_ON = eINSTANCE.getProtectionDomain_ExecuteOn();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_DOMAIN__GROUP = eINSTANCE.getProtectionDomain_Group();

		/**
		 * The meta object literal for the '<em><b>Deployed Module Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCE = eINSTANCE.getProtectionDomain_DeployedModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Deployed Trigger Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCE = eINSTANCE.getProtectionDomain_DeployedTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_DOMAIN__NAME = eINSTANCE.getProtectionDomain_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.UseTypeImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getUseType()
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
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.WireMappingImpl
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getWireMapping()
		 * @generated
		 */
		EClass WIRE_MAPPING = eINSTANCE.getWireMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped On Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__MAPPED_ON_LINK_ID = eINSTANCE.getWireMapping_MappedOnLinkId();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__SOURCE = eINSTANCE.getWireMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__TARGET = eINSTANCE.getWireMapping_Target();

		/**
		 * The meta object literal for the '{@link technology.ecoa.deployment._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.ProgrammingLanguage
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Fifo Size</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getFifoSize()
		 * @generated
		 */
		EDataType FIFO_SIZE = eINSTANCE.getFifoSize();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Module Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getModulePriority()
		 * @generated
		 */
		EDataType MODULE_PRIORITY = eINSTANCE.getModulePriority();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.ProgrammingLanguage
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.deployment._2.impl.depPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //depPackage
