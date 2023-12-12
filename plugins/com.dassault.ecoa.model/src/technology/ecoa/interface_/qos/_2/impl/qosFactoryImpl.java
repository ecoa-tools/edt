/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.interface_.qos._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class qosFactoryImpl extends EFactoryImpl implements qosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static qosFactory init() {
		try {
			qosFactory theqosFactory = (qosFactory)EPackage.Registry.INSTANCE.getEFactory(qosPackage.eNS_URI);
			if (theqosFactory != null) {
				return theqosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new qosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case qosPackage.DATA: return createData();
			case qosPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case qosPackage.EVENT: return createEvent();
			case qosPackage.OPERATION_RATE: return createOperationRate();
			case qosPackage.OPERATIONS: return createOperations();
			case qosPackage.REQUEST_RESPONSE: return createRequestResponse();
			case qosPackage.SERVICE_INSTANCE_QO_S: return createServiceInstanceQoS();
			case qosPackage.USE_TYPE: return createUseType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case qosPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case qosPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case qosPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case qosPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case qosPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case qosPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case qosPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case qosPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case qosPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case qosPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case qosPackage.TYPE_QNAME:
				return createTypeQNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case qosPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case qosPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case qosPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case qosPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case qosPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case qosPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case qosPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case qosPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case qosPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case qosPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case qosPackage.TYPE_QNAME:
				return convertTypeQNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRate createOperationRate() {
		OperationRateImpl operationRate = new OperationRateImpl();
		return operationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations createOperations() {
		OperationsImpl operations = new OperationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResponse createRequestResponse() {
		RequestResponseImpl requestResponse = new RequestResponseImpl();
		return requestResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstanceQoS createServiceInstanceQoS() {
		ServiceInstanceQoSImpl serviceInstanceQoS = new ServiceInstanceQoSImpl();
		return serviceInstanceQoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseType createUseType() {
		UseTypeImpl useType = new UseTypeImpl();
		return useType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageFromString(EDataType eDataType, String initialValue) {
		ProgrammingLanguage result = ProgrammingLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHexOrDecValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHexOrDecValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLibraryNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageObjectFromString(EDataType eDataType, String initialValue) {
		return createProgrammingLanguageFromString(qosPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(qosPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createStepsFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createStepsObjectFromString(EDataType eDataType, String initialValue) {
		return createStepsFromString(qosPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(qosPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTimeDurationFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTimeDurationObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeDurationFromString(qosPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(qosPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(qosPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(qosPackage.Literals.NAME_ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeQNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeQNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qosPackage getqosPackage() {
		return (qosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static qosPackage getPackage() {
		return qosPackage.eINSTANCE;
	}

} //qosFactoryImpl
