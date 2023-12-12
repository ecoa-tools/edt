/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.deployment._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class depFactoryImpl extends EFactoryImpl implements depFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static depFactory init() {
		try {
			depFactory thedepFactory = (depFactory)EPackage.Registry.INSTANCE.getEFactory(depPackage.eNS_URI);
			if (thedepFactory != null) {
				return thedepFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new depFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public depFactoryImpl() {
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
			case depPackage.COMPONENT_LOG: return createComponentLog();
			case depPackage.COMPUTING_NODE_CONFIGURATION: return createComputingNodeConfiguration();
			case depPackage.DEPLOYED_MODULE_INSTANCE_TYPE: return createDeployedModuleInstanceType();
			case depPackage.DEPLOYED_TRIGGER_INSTANCE_TYPE: return createDeployedTriggerInstanceType();
			case depPackage.DEPLOYMENT: return createDeployment();
			case depPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case depPackage.EXECUTE_ON_TYPE: return createExecuteOnType();
			case depPackage.LOG_POLICY: return createLogPolicy();
			case depPackage.MODULE_LOG: return createModuleLog();
			case depPackage.PLATFORM_CONFIGURATION: return createPlatformConfiguration();
			case depPackage.PLATFORM_MESSAGES: return createPlatformMessages();
			case depPackage.PROTECTION_DOMAIN: return createProtectionDomain();
			case depPackage.USE_TYPE: return createUseType();
			case depPackage.WIRE_MAPPING: return createWireMapping();
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
			case depPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case depPackage.FIFO_SIZE:
				return createFifoSizeFromString(eDataType, initialValue);
			case depPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case depPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case depPackage.MODULE_PRIORITY:
				return createModulePriorityFromString(eDataType, initialValue);
			case depPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case depPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case depPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case depPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case depPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case depPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case depPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case depPackage.TYPE_QNAME:
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
			case depPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case depPackage.FIFO_SIZE:
				return convertFifoSizeToString(eDataType, instanceValue);
			case depPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case depPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case depPackage.MODULE_PRIORITY:
				return convertModulePriorityToString(eDataType, instanceValue);
			case depPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case depPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case depPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case depPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case depPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case depPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case depPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case depPackage.TYPE_QNAME:
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
	public ComponentLog createComponentLog() {
		ComponentLogImpl componentLog = new ComponentLogImpl();
		return componentLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingNodeConfiguration createComputingNodeConfiguration() {
		ComputingNodeConfigurationImpl computingNodeConfiguration = new ComputingNodeConfigurationImpl();
		return computingNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedModuleInstanceType createDeployedModuleInstanceType() {
		DeployedModuleInstanceTypeImpl deployedModuleInstanceType = new DeployedModuleInstanceTypeImpl();
		return deployedModuleInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedTriggerInstanceType createDeployedTriggerInstanceType() {
		DeployedTriggerInstanceTypeImpl deployedTriggerInstanceType = new DeployedTriggerInstanceTypeImpl();
		return deployedTriggerInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
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
	public ExecuteOnType createExecuteOnType() {
		ExecuteOnTypeImpl executeOnType = new ExecuteOnTypeImpl();
		return executeOnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogPolicy createLogPolicy() {
		LogPolicyImpl logPolicy = new LogPolicyImpl();
		return logPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleLog createModuleLog() {
		ModuleLogImpl moduleLog = new ModuleLogImpl();
		return moduleLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformConfiguration createPlatformConfiguration() {
		PlatformConfigurationImpl platformConfiguration = new PlatformConfigurationImpl();
		return platformConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformMessages createPlatformMessages() {
		PlatformMessagesImpl platformMessages = new PlatformMessagesImpl();
		return platformMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionDomain createProtectionDomain() {
		ProtectionDomainImpl protectionDomain = new ProtectionDomainImpl();
		return protectionDomain;
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
	public WireMapping createWireMapping() {
		WireMappingImpl wireMapping = new WireMappingImpl();
		return wireMapping;
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
	public BigDecimal createFifoSizeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFifoSizeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
	public BigDecimal createModulePriorityFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModulePriorityToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
		return createProgrammingLanguageFromString(depPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(depPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
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
		return createStepsFromString(depPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(depPackage.Literals.STEPS, instanceValue);
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
		return createTimeDurationFromString(depPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(depPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(depPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(depPackage.Literals.NAME_ID, instanceValue);
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
	public depPackage getdepPackage() {
		return (depPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static depPackage getPackage() {
		return depPackage.eINSTANCE;
	}

} //depFactoryImpl
