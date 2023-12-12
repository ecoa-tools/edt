/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;

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
 * @see technology.ecoa.module.behaviour._2.modFactory
 * @model kind="package"
 * @generated
 */
public interface modPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/module-behaviour-2.0";

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
	modPackage eINSTANCE = technology.ecoa.module.behaviour._2.impl.modPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl <em>Action Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ActionSetImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getActionSet()
	 * @generated
	 */
	int ACTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__LOOP = 1;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__COMPUTING = 2;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__OPERATION_CALL = 3;

	/**
	 * The number of structural features of the '<em>Action Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ComputingImpl <em>Computing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ComputingImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getComputing()
	 * @generated
	 */
	int COMPUTING = 1;

	/**
	 * The feature id for the '<em><b>Max Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__MAX_COMPUTING_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Min Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__MIN_COMPUTING_STEPS = 1;

	/**
	 * The number of structural features of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.EntryPointImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__GROUP = ACTION_SET__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__LOOP = ACTION_SET__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__COMPUTING = ACTION_SET__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OPERATION_CALL = ACTION_SET__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ACTIVATING_CONDITION = ACTION_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__DEADLINE = ACTION_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = ACTION_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = ACTION_SET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = ACTION_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.DataNotificationImpl <em>Data Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.DataNotificationImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getDataNotification()
	 * @generated
	 */
	int DATA_NOTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__GROUP = ENTRY_POINT__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__LOOP = ENTRY_POINT__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__COMPUTING = ENTRY_POINT__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__OPERATION_CALL = ENTRY_POINT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__ACTIVATING_CONDITION = ENTRY_POINT__ACTIVATING_CONDITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__DEADLINE = ENTRY_POINT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION__NAME = ENTRY_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Data Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION_FEATURE_COUNT = ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NOTIFICATION_OPERATION_COUNT = ENTRY_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.DocumentRootImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Module Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODULE_BEHAVIOUR = 3;

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
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.LoopImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__GROUP = ACTION_SET__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP = ACTION_SET__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__COMPUTING = ACTION_SET__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OPERATION_CALL = ACTION_SET__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ITERATIONS = ACTION_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ACTION_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ACTION_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl <em>Module Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getModuleBehaviour()
	 * @generated
	 */
	int MODULE_BEHAVIOUR = 6;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Data Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR__DATA_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Response Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Module Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ModuleLifeCycleNotificationImpl <em>Module Life Cycle Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ModuleLifeCycleNotificationImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getModuleLifeCycleNotification()
	 * @generated
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__GROUP = ENTRY_POINT__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__LOOP = ENTRY_POINT__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__COMPUTING = ENTRY_POINT__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__OPERATION_CALL = ENTRY_POINT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__ACTIVATING_CONDITION = ENTRY_POINT__ACTIVATING_CONDITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__DEADLINE = ENTRY_POINT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION__NAME = ENTRY_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Module Life Cycle Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION_FEATURE_COUNT = ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Module Life Cycle Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIFE_CYCLE_NOTIFICATION_OPERATION_COUNT = ENTRY_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.OperationCallImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 8;

	/**
	 * The feature id for the '<em><b>Max Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__MAX_COMPUTING_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Min Computing Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__MIN_COMPUTING_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Module Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__MODULE_OPERATION_REF = 2;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ResponseNotificationImpl <em>Response Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ResponseNotificationImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getResponseNotification()
	 * @generated
	 */
	int RESPONSE_NOTIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__GROUP = ENTRY_POINT__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__LOOP = ENTRY_POINT__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__COMPUTING = ENTRY_POINT__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__OPERATION_CALL = ENTRY_POINT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__ACTIVATING_CONDITION = ENTRY_POINT__ACTIVATING_CONDITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__DEADLINE = ENTRY_POINT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION__NAME = ENTRY_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Response Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION_FEATURE_COUNT = ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_NOTIFICATION_OPERATION_COUNT = ENTRY_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.ServiceManagementNotificationImpl <em>Service Management Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.ServiceManagementNotificationImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getServiceManagementNotification()
	 * @generated
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__GROUP = ENTRY_POINT__GROUP;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__LOOP = ENTRY_POINT__LOOP;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__COMPUTING = ENTRY_POINT__COMPUTING;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__OPERATION_CALL = ENTRY_POINT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__ACTIVATING_CONDITION = ENTRY_POINT__ACTIVATING_CONDITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__DEADLINE = ENTRY_POINT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION__NAME = ENTRY_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Service Management Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION_FEATURE_COUNT = ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Management Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_NOTIFICATION_OPERATION_COUNT = ENTRY_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.UseTypeImpl
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 11;

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
	 * The meta object id for the '{@link technology.ecoa.module.behaviour._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 12;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 13;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 14;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 15;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 17;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 19;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 21;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 22;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.ActionSet <em>Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set</em>'.
	 * @see technology.ecoa.module.behaviour._2.ActionSet
	 * @generated
	 */
	EClass getActionSet();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.module.behaviour._2.ActionSet#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.module.behaviour._2.ActionSet#getGroup()
	 * @see #getActionSet()
	 * @generated
	 */
	EAttribute getActionSet_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ActionSet#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop</em>'.
	 * @see technology.ecoa.module.behaviour._2.ActionSet#getLoop()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_Loop();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ActionSet#getComputing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computing</em>'.
	 * @see technology.ecoa.module.behaviour._2.ActionSet#getComputing()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_Computing();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ActionSet#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Call</em>'.
	 * @see technology.ecoa.module.behaviour._2.ActionSet#getOperationCall()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_OperationCall();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.Computing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing</em>'.
	 * @see technology.ecoa.module.behaviour._2.Computing
	 * @generated
	 */
	EClass getComputing();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps <em>Max Computing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Computing Steps</em>'.
	 * @see technology.ecoa.module.behaviour._2.Computing#getMaxComputingSteps()
	 * @see #getComputing()
	 * @generated
	 */
	EAttribute getComputing_MaxComputingSteps();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps <em>Min Computing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Computing Steps</em>'.
	 * @see technology.ecoa.module.behaviour._2.Computing#getMinComputingSteps()
	 * @see #getComputing()
	 * @generated
	 */
	EAttribute getComputing_MinComputingSteps();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.DataNotification <em>Data Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.DataNotification
	 * @generated
	 */
	EClass getDataNotification();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.module.behaviour._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.module.behaviour._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.module.behaviour._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.module.behaviour._2.DocumentRoot#getModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Behaviour</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot#getModuleBehaviour()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModuleBehaviour();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.module.behaviour._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.module.behaviour._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see technology.ecoa.module.behaviour._2.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.EntryPoint#getActivatingCondition <em>Activating Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activating Condition</em>'.
	 * @see technology.ecoa.module.behaviour._2.EntryPoint#getActivatingCondition()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EAttribute getEntryPoint_ActivatingCondition();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.EntryPoint#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see technology.ecoa.module.behaviour._2.EntryPoint#getDeadline()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EAttribute getEntryPoint_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.EntryPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.module.behaviour._2.EntryPoint#getName()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EAttribute getEntryPoint_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see technology.ecoa.module.behaviour._2.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.Loop#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see technology.ecoa.module.behaviour._2.Loop#getIterations()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Iterations();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.ModuleBehaviour <em>Module Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Behaviour</em>'.
	 * @see technology.ecoa.module.behaviour._2.ModuleBehaviour
	 * @generated
	 */
	EClass getModuleBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point</em>'.
	 * @see technology.ecoa.module.behaviour._2.ModuleBehaviour#getEntryPoint()
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	EReference getModuleBehaviour_EntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getDataNotification <em>Data Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.ModuleBehaviour#getDataNotification()
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	EReference getModuleBehaviour_DataNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.module.behaviour._2.ModuleBehaviour#getResponseNotification <em>Response Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.ModuleBehaviour#getResponseNotification()
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	EReference getModuleBehaviour_ResponseNotification();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.ModuleLifeCycleNotification <em>Module Life Cycle Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Life Cycle Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.ModuleLifeCycleNotification
	 * @generated
	 */
	EClass getModuleLifeCycleNotification();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see technology.ecoa.module.behaviour._2.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.OperationCall#getMaxComputingSteps <em>Max Computing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Computing Steps</em>'.
	 * @see technology.ecoa.module.behaviour._2.OperationCall#getMaxComputingSteps()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_MaxComputingSteps();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.OperationCall#getMinComputingSteps <em>Min Computing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Computing Steps</em>'.
	 * @see technology.ecoa.module.behaviour._2.OperationCall#getMinComputingSteps()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_MinComputingSteps();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.OperationCall#getModuleOperationRef <em>Module Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Operation Ref</em>'.
	 * @see technology.ecoa.module.behaviour._2.OperationCall#getModuleOperationRef()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_ModuleOperationRef();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.ResponseNotification <em>Response Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.ResponseNotification
	 * @generated
	 */
	EClass getResponseNotification();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.ServiceManagementNotification <em>Service Management Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Management Notification</em>'.
	 * @see technology.ecoa.module.behaviour._2.ServiceManagementNotification
	 * @generated
	 */
	EClass getServiceManagementNotification();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.module.behaviour._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.module.behaviour._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.module.behaviour._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.module.behaviour._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.module.behaviour._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

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
	 * Returns the meta object for data type '{@link technology.ecoa.module.behaviour._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.module.behaviour._2.ProgrammingLanguage"
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
	modFactory getmodFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ActionSetImpl <em>Action Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ActionSetImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getActionSet()
		 * @generated
		 */
		EClass ACTION_SET = eINSTANCE.getActionSet();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_SET__GROUP = eINSTANCE.getActionSet_Group();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET__LOOP = eINSTANCE.getActionSet_Loop();

		/**
		 * The meta object literal for the '<em><b>Computing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET__COMPUTING = eINSTANCE.getActionSet_Computing();

		/**
		 * The meta object literal for the '<em><b>Operation Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET__OPERATION_CALL = eINSTANCE.getActionSet_OperationCall();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ComputingImpl <em>Computing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ComputingImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getComputing()
		 * @generated
		 */
		EClass COMPUTING = eINSTANCE.getComputing();

		/**
		 * The meta object literal for the '<em><b>Max Computing Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING__MAX_COMPUTING_STEPS = eINSTANCE.getComputing_MaxComputingSteps();

		/**
		 * The meta object literal for the '<em><b>Min Computing Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING__MIN_COMPUTING_STEPS = eINSTANCE.getComputing_MinComputingSteps();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.DataNotificationImpl <em>Data Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.DataNotificationImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getDataNotification()
		 * @generated
		 */
		EClass DATA_NOTIFICATION = eINSTANCE.getDataNotification();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.DocumentRootImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Module Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODULE_BEHAVIOUR = eINSTANCE.getDocumentRoot_ModuleBehaviour();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.EntryPointImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Activating Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT__ACTIVATING_CONDITION = eINSTANCE.getEntryPoint_ActivatingCondition();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT__DEADLINE = eINSTANCE.getEntryPoint_Deadline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT__NAME = eINSTANCE.getEntryPoint_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.LoopImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__ITERATIONS = eINSTANCE.getLoop_Iterations();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl <em>Module Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ModuleBehaviourImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getModuleBehaviour()
		 * @generated
		 */
		EClass MODULE_BEHAVIOUR = eINSTANCE.getModuleBehaviour();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_BEHAVIOUR__ENTRY_POINT = eINSTANCE.getModuleBehaviour_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Data Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_BEHAVIOUR__DATA_NOTIFICATION = eINSTANCE.getModuleBehaviour_DataNotification();

		/**
		 * The meta object literal for the '<em><b>Response Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_BEHAVIOUR__RESPONSE_NOTIFICATION = eINSTANCE.getModuleBehaviour_ResponseNotification();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ModuleLifeCycleNotificationImpl <em>Module Life Cycle Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ModuleLifeCycleNotificationImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getModuleLifeCycleNotification()
		 * @generated
		 */
		EClass MODULE_LIFE_CYCLE_NOTIFICATION = eINSTANCE.getModuleLifeCycleNotification();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.OperationCallImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Max Computing Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__MAX_COMPUTING_STEPS = eINSTANCE.getOperationCall_MaxComputingSteps();

		/**
		 * The meta object literal for the '<em><b>Min Computing Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__MIN_COMPUTING_STEPS = eINSTANCE.getOperationCall_MinComputingSteps();

		/**
		 * The meta object literal for the '<em><b>Module Operation Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__MODULE_OPERATION_REF = eINSTANCE.getOperationCall_ModuleOperationRef();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ResponseNotificationImpl <em>Response Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ResponseNotificationImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getResponseNotification()
		 * @generated
		 */
		EClass RESPONSE_NOTIFICATION = eINSTANCE.getResponseNotification();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.ServiceManagementNotificationImpl <em>Service Management Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.ServiceManagementNotificationImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getServiceManagementNotification()
		 * @generated
		 */
		EClass SERVICE_MANAGEMENT_NOTIFICATION = eINSTANCE.getServiceManagementNotification();

		/**
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.UseTypeImpl
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getUseType()
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
		 * The meta object literal for the '{@link technology.ecoa.module.behaviour._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.ProgrammingLanguage
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.module.behaviour._2.impl.modPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //modPackage
