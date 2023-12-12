/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see edtinterface.EDTInterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface EDTInterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edtinterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "EDTService";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EDTService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDTInterfacePackage eINSTANCE = edtinterface.impl.EDTInterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link edtinterface.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.impl.ServiceDefinitionImpl
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getServiceDefinition()
	 * @generated
	 */
	int SERVICE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Used Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__USED_LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edtinterface.OperationType <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.OperationType
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Name Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link edtinterface.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.impl.DataImpl
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__COMMENT = OPERATION_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = OPERATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = OPERATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = OPERATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = OPERATION_TYPE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = OPERATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtinterface.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.impl.EventImpl
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__COMMENT = OPERATION_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = OPERATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INPUT = OPERATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DIRECTION = OPERATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OPERATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = OPERATION_TYPE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = OPERATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtinterface.impl.RequestResponseImpl <em>Request Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.impl.RequestResponseImpl
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getRequestResponse()
	 * @generated
	 */
	int REQUEST_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__COMMENT = OPERATION_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__NAME = OPERATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__INPUT = OPERATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE__OUTPUT = OPERATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_FEATURE_COUNT = OPERATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = OPERATION_TYPE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_OPERATION_COUNT = OPERATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edtinterface.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edtinterface.impl.ParameterImpl
	 * @see edtinterface.impl.EDTInterfacePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edtinterface.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Definition</em>'.
	 * @see edtinterface.ServiceDefinition
	 * @generated
	 */
	EClass getServiceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edtinterface.ServiceDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtinterface.ServiceDefinition#getName()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edtinterface.ServiceDefinition#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edtinterface.ServiceDefinition#getOperations()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_Operations();

	/**
	 * Returns the meta object for the reference list '{@link edtinterface.ServiceDefinition#getUsedLibraries <em>Used Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Libraries</em>'.
	 * @see edtinterface.ServiceDefinition#getUsedLibraries()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_UsedLibraries();

	/**
	 * Returns the meta object for class '{@link edtinterface.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see edtinterface.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for the attribute '{@link edtinterface.OperationType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edtinterface.OperationType#getComment()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link edtinterface.OperationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtinterface.OperationType#getName()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Name();

	/**
	 * Returns the meta object for the '{@link edtinterface.OperationType#nameIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Is Unique</em>' operation.
	 * @see edtinterface.OperationType#nameIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperationType__NameIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link edtinterface.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see edtinterface.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference '{@link edtinterface.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edtinterface.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Type();

	/**
	 * Returns the meta object for class '{@link edtinterface.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see edtinterface.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link edtinterface.Event#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edtinterface.Event#getInput()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Input();

	/**
	 * Returns the meta object for the attribute '{@link edtinterface.Event#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see edtinterface.Event#getDirection()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Direction();

	/**
	 * Returns the meta object for class '{@link edtinterface.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response</em>'.
	 * @see edtinterface.RequestResponse
	 * @generated
	 */
	EClass getRequestResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link edtinterface.RequestResponse#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see edtinterface.RequestResponse#getInput()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link edtinterface.RequestResponse#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see edtinterface.RequestResponse#getOutput()
	 * @see #getRequestResponse()
	 * @generated
	 */
	EReference getRequestResponse_Output();

	/**
	 * Returns the meta object for class '{@link edtinterface.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edtinterface.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link edtinterface.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edtinterface.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link edtinterface.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edtinterface.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDTInterfaceFactory getEDTInterfaceFactory();

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
		 * The meta object literal for the '{@link edtinterface.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.impl.ServiceDefinitionImpl
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getServiceDefinition()
		 * @generated
		 */
		EClass SERVICE_DEFINITION = eINSTANCE.getServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__NAME = eINSTANCE.getServiceDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__OPERATIONS = eINSTANCE.getServiceDefinition_Operations();

		/**
		 * The meta object literal for the '<em><b>Used Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__USED_LIBRARIES = eINSTANCE.getServiceDefinition_UsedLibraries();

		/**
		 * The meta object literal for the '{@link edtinterface.OperationType <em>Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.OperationType
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getOperationType()
		 * @generated
		 */
		EClass OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__COMMENT = eINSTANCE.getOperationType_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__NAME = eINSTANCE.getOperationType_Name();

		/**
		 * The meta object literal for the '<em><b>Name Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_TYPE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperationType__NameIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link edtinterface.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.impl.DataImpl
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '{@link edtinterface.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.impl.EventImpl
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INPUT = eINSTANCE.getEvent_Input();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DIRECTION = eINSTANCE.getEvent_Direction();

		/**
		 * The meta object literal for the '{@link edtinterface.impl.RequestResponseImpl <em>Request Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.impl.RequestResponseImpl
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getRequestResponse()
		 * @generated
		 */
		EClass REQUEST_RESPONSE = eINSTANCE.getRequestResponse();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__INPUT = eINSTANCE.getRequestResponse_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_RESPONSE__OUTPUT = eINSTANCE.getRequestResponse_Output();

		/**
		 * The meta object literal for the '{@link edtinterface.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edtinterface.impl.ParameterImpl
		 * @see edtinterface.impl.EDTInterfacePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

	}

} //EDTServicePackage
