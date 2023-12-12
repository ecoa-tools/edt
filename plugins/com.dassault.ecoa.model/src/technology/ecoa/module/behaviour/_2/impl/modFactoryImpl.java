/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.module.behaviour._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modFactoryImpl extends EFactoryImpl implements modFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static modFactory init() {
		try {
			modFactory themodFactory = (modFactory)EPackage.Registry.INSTANCE.getEFactory(modPackage.eNS_URI);
			if (themodFactory != null) {
				return themodFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new modFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modFactoryImpl() {
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
			case modPackage.ACTION_SET: return createActionSet();
			case modPackage.COMPUTING: return createComputing();
			case modPackage.DATA_NOTIFICATION: return createDataNotification();
			case modPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case modPackage.ENTRY_POINT: return createEntryPoint();
			case modPackage.LOOP: return createLoop();
			case modPackage.MODULE_BEHAVIOUR: return createModuleBehaviour();
			case modPackage.MODULE_LIFE_CYCLE_NOTIFICATION: return createModuleLifeCycleNotification();
			case modPackage.OPERATION_CALL: return createOperationCall();
			case modPackage.RESPONSE_NOTIFICATION: return createResponseNotification();
			case modPackage.SERVICE_MANAGEMENT_NOTIFICATION: return createServiceManagementNotification();
			case modPackage.USE_TYPE: return createUseType();
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
			case modPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case modPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case modPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case modPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case modPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case modPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case modPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case modPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case modPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case modPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case modPackage.TYPE_QNAME:
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
			case modPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case modPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case modPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case modPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case modPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case modPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case modPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case modPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case modPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case modPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case modPackage.TYPE_QNAME:
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
	public ActionSet createActionSet() {
		ActionSetImpl actionSet = new ActionSetImpl();
		return actionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computing createComputing() {
		ComputingImpl computing = new ComputingImpl();
		return computing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNotification createDataNotification() {
		DataNotificationImpl dataNotification = new DataNotificationImpl();
		return dataNotification;
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
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleBehaviour createModuleBehaviour() {
		ModuleBehaviourImpl moduleBehaviour = new ModuleBehaviourImpl();
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleLifeCycleNotification createModuleLifeCycleNotification() {
		ModuleLifeCycleNotificationImpl moduleLifeCycleNotification = new ModuleLifeCycleNotificationImpl();
		return moduleLifeCycleNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseNotification createResponseNotification() {
		ResponseNotificationImpl responseNotification = new ResponseNotificationImpl();
		return responseNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceManagementNotification createServiceManagementNotification() {
		ServiceManagementNotificationImpl serviceManagementNotification = new ServiceManagementNotificationImpl();
		return serviceManagementNotification;
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
		return createProgrammingLanguageFromString(modPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(modPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
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
		return createStepsFromString(modPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(modPackage.Literals.STEPS, instanceValue);
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
		return createTimeDurationFromString(modPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(modPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(modPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(modPackage.Literals.NAME_ID, instanceValue);
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
	public modPackage getmodPackage() {
		return (modPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static modPackage getPackage() {
		return modPackage.eINSTANCE;
	}

} //modFactoryImpl
