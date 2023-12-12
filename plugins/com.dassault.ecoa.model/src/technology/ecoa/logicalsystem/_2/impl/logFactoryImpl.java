/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.logicalsystem._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class logFactoryImpl extends EFactoryImpl implements logFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static logFactory init() {
		try {
			logFactory thelogFactory = (logFactory)EPackage.Registry.INSTANCE.getEFactory(logPackage.eNS_URI);
			if (thelogFactory != null) {
				return thelogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new logFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logFactoryImpl() {
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
			case logPackage.AVAILABLE_MEMORY_TYPE: return createAvailableMemoryType();
			case logPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case logPackage.ENDIANESS_TYPE: return createEndianessType();
			case logPackage.LATENCY_TYPE: return createLatencyType();
			case logPackage.LATENCY_TYPE1: return createLatencyType1();
			case logPackage.LINK_TYPE: return createLinkType();
			case logPackage.LINK_TYPE1: return createLinkType1();
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS: return createLogicalComputingNodeLinks();
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE: return createLogicalComputingNodeType();
			case logPackage.LOGICAL_COMPUTING_PLATFORM: return createLogicalComputingPlatform();
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS: return createLogicalComputingPlatformLinks();
			case logPackage.LOGICAL_PROCESSORS_TYPE: return createLogicalProcessorsType();
			case logPackage.LOGICAL_SYSTEM: return createLogicalSystem();
			case logPackage.MODULE_SWITCH_TIME_TYPE: return createModuleSwitchTimeType();
			case logPackage.OS_TYPE: return createOsType();
			case logPackage.STEP_DURATION_TYPE: return createStepDurationType();
			case logPackage.THROUGHPUT_TYPE: return createThroughputType();
			case logPackage.THROUGHPUT_TYPE1: return createThroughputType1();
			case logPackage.TRANSPORT_BINDING_TYPE: return createTransportBindingType();
			case logPackage.USE_TYPE: return createUseType();
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
			case logPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case logPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case logPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case logPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case logPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case logPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case logPackage.NAME_TYPE_OBJECT:
				return createNameTypeObjectFromString(eDataType, initialValue);
			case logPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case logPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case logPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case logPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case logPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case logPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case logPackage.TYPE_QNAME:
				return createTypeQNameFromString(eDataType, initialValue);
			case logPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
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
			case logPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case logPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case logPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case logPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case logPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case logPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case logPackage.NAME_TYPE_OBJECT:
				return convertNameTypeObjectToString(eDataType, instanceValue);
			case logPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case logPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case logPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case logPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case logPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case logPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case logPackage.TYPE_QNAME:
				return convertTypeQNameToString(eDataType, instanceValue);
			case logPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableMemoryType createAvailableMemoryType() {
		AvailableMemoryTypeImpl availableMemoryType = new AvailableMemoryTypeImpl();
		return availableMemoryType;
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
	public EndianessType createEndianessType() {
		EndianessTypeImpl endianessType = new EndianessTypeImpl();
		return endianessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyType createLatencyType() {
		LatencyTypeImpl latencyType = new LatencyTypeImpl();
		return latencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyType1 createLatencyType1() {
		LatencyType1Impl latencyType1 = new LatencyType1Impl();
		return latencyType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType1 createLinkType1() {
		LinkType1Impl linkType1 = new LinkType1Impl();
		return linkType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingNodeLinks createLogicalComputingNodeLinks() {
		LogicalComputingNodeLinksImpl logicalComputingNodeLinks = new LogicalComputingNodeLinksImpl();
		return logicalComputingNodeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingNodeType createLogicalComputingNodeType() {
		LogicalComputingNodeTypeImpl logicalComputingNodeType = new LogicalComputingNodeTypeImpl();
		return logicalComputingNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingPlatform createLogicalComputingPlatform() {
		LogicalComputingPlatformImpl logicalComputingPlatform = new LogicalComputingPlatformImpl();
		return logicalComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingPlatformLinks createLogicalComputingPlatformLinks() {
		LogicalComputingPlatformLinksImpl logicalComputingPlatformLinks = new LogicalComputingPlatformLinksImpl();
		return logicalComputingPlatformLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalProcessorsType createLogicalProcessorsType() {
		LogicalProcessorsTypeImpl logicalProcessorsType = new LogicalProcessorsTypeImpl();
		return logicalProcessorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSystem createLogicalSystem() {
		LogicalSystemImpl logicalSystem = new LogicalSystemImpl();
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSwitchTimeType createModuleSwitchTimeType() {
		ModuleSwitchTimeTypeImpl moduleSwitchTimeType = new ModuleSwitchTimeTypeImpl();
		return moduleSwitchTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsType createOsType() {
		OsTypeImpl osType = new OsTypeImpl();
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDurationType createStepDurationType() {
		StepDurationTypeImpl stepDurationType = new StepDurationTypeImpl();
		return stepDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputType createThroughputType() {
		ThroughputTypeImpl throughputType = new ThroughputTypeImpl();
		return throughputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputType1 createThroughputType1() {
		ThroughputType1Impl throughputType1 = new ThroughputType1Impl();
		return throughputType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportBindingType createTransportBindingType() {
		TransportBindingTypeImpl transportBindingType = new TransportBindingTypeImpl();
		return transportBindingType;
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
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public NameType createNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameTypeFromString(logPackage.Literals.NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameTypeToString(logPackage.Literals.NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageObjectFromString(EDataType eDataType, String initialValue) {
		return createProgrammingLanguageFromString(logPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(logPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
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
		return createStepsFromString(logPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(logPackage.Literals.STEPS, instanceValue);
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
		return createTimeDurationFromString(logPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(logPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(logPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(logPackage.Literals.NAME_ID, instanceValue);
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
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(logPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(logPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logPackage getlogPackage() {
		return (logPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static logPackage getPackage() {
		return logPackage.eINSTANCE;
	}

} //logFactoryImpl
