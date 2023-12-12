/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.insertion.policy._2.ActivationTypeType;
import technology.ecoa.insertion.policy._2.AllocationType;
import technology.ecoa.insertion.policy._2.AperiodicActivationProfile;
import technology.ecoa.insertion.policy._2.DefaultPINFO;
import technology.ecoa.insertion.policy._2.DefaultProperties;
import technology.ecoa.insertion.policy._2.DefaultPropertyValue;
import technology.ecoa.insertion.policy._2.DeploymentConstraints;
import technology.ecoa.insertion.policy._2.DocumentRoot;
import technology.ecoa.insertion.policy._2.DynamicMemoryType;
import technology.ecoa.insertion.policy._2.ECOAProfile;
import technology.ecoa.insertion.policy._2.ExtraConcerns;
import technology.ecoa.insertion.policy._2.HighestActivationRate;
import technology.ecoa.insertion.policy._2.InsertionPolicy;
import technology.ecoa.insertion.policy._2.InsertionPolicyList;
import technology.ecoa.insertion.policy._2.IntegrityType;
import technology.ecoa.insertion.policy._2.LanguageLibraries;
import technology.ecoa.insertion.policy._2.LanguageLibrary;
import technology.ecoa.insertion.policy._2.MemoryUsage;
import technology.ecoa.insertion.policy._2.ModuleActivationProfile;
import technology.ecoa.insertion.policy._2.ModuleActivationProfiles;
import technology.ecoa.insertion.policy._2.ModuleCompilationOptions;
import technology.ecoa.insertion.policy._2.ModuleDependencies;
import technology.ecoa.insertion.policy._2.ModuleMemoryUsage;
import technology.ecoa.insertion.policy._2.ModulePINFOType;
import technology.ecoa.insertion.policy._2.ModulesDependencies;
import technology.ecoa.insertion.policy._2.OSAPIType;
import technology.ecoa.insertion.policy._2.PINFOValue;
import technology.ecoa.insertion.policy._2.PeriodicActivationProfile;
import technology.ecoa.insertion.policy._2.ProfileType;
import technology.ecoa.insertion.policy._2.ProgrammingLanguage;
import technology.ecoa.insertion.policy._2.QualityType;
import technology.ecoa.insertion.policy._2.RealtimeCharacteristics;
import technology.ecoa.insertion.policy._2.RegisterSize;
import technology.ecoa.insertion.policy._2.SchedulingPolicy;
import technology.ecoa.insertion.policy._2.SchedulingPolicyType;
import technology.ecoa.insertion.policy._2.SizeType;
import technology.ecoa.insertion.policy._2.TimeAccuracy;
import technology.ecoa.insertion.policy._2.TransportProtocol;
import technology.ecoa.insertion.policy._2.TypeType;
import technology.ecoa.insertion.policy._2.TypeType1;
import technology.ecoa.insertion.policy._2.UseType;
import technology.ecoa.insertion.policy._2.polFactory;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class polFactoryImpl extends EFactoryImpl implements polFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static polFactory init() {
		try {
			polFactory thepolFactory = (polFactory)EPackage.Registry.INSTANCE.getEFactory(polPackage.eNS_URI);
			if (thepolFactory != null) {
				return thepolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new polFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polFactoryImpl() {
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
			case polPackage.APERIODIC_ACTIVATION_PROFILE: return createAperiodicActivationProfile();
			case polPackage.COMPILER: return createCompiler();
			case polPackage.DEFAULT_PINFO: return createDefaultPINFO();
			case polPackage.DEFAULT_PROPERTIES: return createDefaultProperties();
			case polPackage.DEFAULT_PROPERTY_VALUE: return createDefaultPropertyValue();
			case polPackage.DEPLOYMENT_CONSTRAINTS: return createDeploymentConstraints();
			case polPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case polPackage.DYNAMIC_MEMORY_TYPE: return createDynamicMemoryType();
			case polPackage.ECOA_PROFILE: return createECOAProfile();
			case polPackage.EXTRA_CONCERNS: return createExtraConcerns();
			case polPackage.HIGHEST_ACTIVATION_RATE: return createHighestActivationRate();
			case polPackage.INSERTION_POLICY: return createInsertionPolicy();
			case polPackage.INSERTION_POLICY_LIST: return createInsertionPolicyList();
			case polPackage.LANGUAGE_LIBRARIES: return createLanguageLibraries();
			case polPackage.LANGUAGE_LIBRARY: return createLanguageLibrary();
			case polPackage.MEMORY_USAGE: return createMemoryUsage();
			case polPackage.MODULE_ACTIVATION_PROFILE: return createModuleActivationProfile();
			case polPackage.MODULE_ACTIVATION_PROFILES: return createModuleActivationProfiles();
			case polPackage.MODULE_COMPILATION_OPTIONS: return createModuleCompilationOptions();
			case polPackage.MODULE_DEPENDENCIES: return createModuleDependencies();
			case polPackage.MODULE_MEMORY_USAGE: return createModuleMemoryUsage();
			case polPackage.MODULE_PINFO_TYPE: return createModulePINFOType();
			case polPackage.MODULES_DEPENDENCIES: return createModulesDependencies();
			case polPackage.OSAPI_TYPE: return createOSAPIType();
			case polPackage.PERIODIC_ACTIVATION_PROFILE: return createPeriodicActivationProfile();
			case polPackage.PINFO_VALUE: return createPINFOValue();
			case polPackage.REALTIME_CHARACTERISTICS: return createRealtimeCharacteristics();
			case polPackage.REGISTER_SIZE: return createRegisterSize();
			case polPackage.SCHEDULING_POLICY_TYPE: return createSchedulingPolicyType();
			case polPackage.TIME_ACCURACY: return createTimeAccuracy();
			case polPackage.TRANSPORT_PROTOCOL: return createTransportProtocol();
			case polPackage.USE_TYPE: return createUseType();
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
			case polPackage.ACTIVATION_TYPE_TYPE:
				return createActivationTypeTypeFromString(eDataType, initialValue);
			case polPackage.ALLOCATION_TYPE:
				return createAllocationTypeFromString(eDataType, initialValue);
			case polPackage.INTEGRITY_TYPE:
				return createIntegrityTypeFromString(eDataType, initialValue);
			case polPackage.PROFILE_TYPE:
				return createProfileTypeFromString(eDataType, initialValue);
			case polPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case polPackage.QUALITY_TYPE:
				return createQualityTypeFromString(eDataType, initialValue);
			case polPackage.SCHEDULING_POLICY:
				return createSchedulingPolicyFromString(eDataType, initialValue);
			case polPackage.SIZE_TYPE:
				return createSizeTypeFromString(eDataType, initialValue);
			case polPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case polPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case polPackage.ACTIVATION_TYPE_TYPE_OBJECT:
				return createActivationTypeTypeObjectFromString(eDataType, initialValue);
			case polPackage.ALLOCATION_TYPE_OBJECT:
				return createAllocationTypeObjectFromString(eDataType, initialValue);
			case polPackage.DEADLINE:
				return createDeadlineFromString(eDataType, initialValue);
			case polPackage.DEADLINE_OBJECT:
				return createDeadlineObjectFromString(eDataType, initialValue);
			case polPackage.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			case polPackage.GENERIC_COMPILATION_OPTIONS:
				return createGenericCompilationOptionsFromString(eDataType, initialValue);
			case polPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case polPackage.INTEGRITY_TYPE_OBJECT:
				return createIntegrityTypeObjectFromString(eDataType, initialValue);
			case polPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case polPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case polPackage.PERIOD:
				return createPeriodFromString(eDataType, initialValue);
			case polPackage.PERIOD_OBJECT:
				return createPeriodObjectFromString(eDataType, initialValue);
			case polPackage.PROFILE_TYPE_OBJECT:
				return createProfileTypeObjectFromString(eDataType, initialValue);
			case polPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case polPackage.QUALITY_TYPE_OBJECT:
				return createQualityTypeObjectFromString(eDataType, initialValue);
			case polPackage.RELATIVE_PRIORITY:
				return createRelativePriorityFromString(eDataType, initialValue);
			case polPackage.SCHEDULING_POLICY_OBJECT:
				return createSchedulingPolicyObjectFromString(eDataType, initialValue);
			case polPackage.SIZE_TYPE_OBJECT:
				return createSizeTypeObjectFromString(eDataType, initialValue);
			case polPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case polPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case polPackage.TARGET:
				return createTargetFromString(eDataType, initialValue);
			case polPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case polPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case polPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case polPackage.TYPE_QNAME:
				return createTypeQNameFromString(eDataType, initialValue);
			case polPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case polPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case polPackage.WCET:
				return createWCETFromString(eDataType, initialValue);
			case polPackage.WCET_OBJECT:
				return createWCETObjectFromString(eDataType, initialValue);
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
			case polPackage.ACTIVATION_TYPE_TYPE:
				return convertActivationTypeTypeToString(eDataType, instanceValue);
			case polPackage.ALLOCATION_TYPE:
				return convertAllocationTypeToString(eDataType, instanceValue);
			case polPackage.INTEGRITY_TYPE:
				return convertIntegrityTypeToString(eDataType, instanceValue);
			case polPackage.PROFILE_TYPE:
				return convertProfileTypeToString(eDataType, instanceValue);
			case polPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case polPackage.QUALITY_TYPE:
				return convertQualityTypeToString(eDataType, instanceValue);
			case polPackage.SCHEDULING_POLICY:
				return convertSchedulingPolicyToString(eDataType, instanceValue);
			case polPackage.SIZE_TYPE:
				return convertSizeTypeToString(eDataType, instanceValue);
			case polPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case polPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case polPackage.ACTIVATION_TYPE_TYPE_OBJECT:
				return convertActivationTypeTypeObjectToString(eDataType, instanceValue);
			case polPackage.ALLOCATION_TYPE_OBJECT:
				return convertAllocationTypeObjectToString(eDataType, instanceValue);
			case polPackage.DEADLINE:
				return convertDeadlineToString(eDataType, instanceValue);
			case polPackage.DEADLINE_OBJECT:
				return convertDeadlineObjectToString(eDataType, instanceValue);
			case polPackage.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			case polPackage.GENERIC_COMPILATION_OPTIONS:
				return convertGenericCompilationOptionsToString(eDataType, instanceValue);
			case polPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case polPackage.INTEGRITY_TYPE_OBJECT:
				return convertIntegrityTypeObjectToString(eDataType, instanceValue);
			case polPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case polPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case polPackage.PERIOD:
				return convertPeriodToString(eDataType, instanceValue);
			case polPackage.PERIOD_OBJECT:
				return convertPeriodObjectToString(eDataType, instanceValue);
			case polPackage.PROFILE_TYPE_OBJECT:
				return convertProfileTypeObjectToString(eDataType, instanceValue);
			case polPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case polPackage.QUALITY_TYPE_OBJECT:
				return convertQualityTypeObjectToString(eDataType, instanceValue);
			case polPackage.RELATIVE_PRIORITY:
				return convertRelativePriorityToString(eDataType, instanceValue);
			case polPackage.SCHEDULING_POLICY_OBJECT:
				return convertSchedulingPolicyObjectToString(eDataType, instanceValue);
			case polPackage.SIZE_TYPE_OBJECT:
				return convertSizeTypeObjectToString(eDataType, instanceValue);
			case polPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case polPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case polPackage.TARGET:
				return convertTargetToString(eDataType, instanceValue);
			case polPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case polPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case polPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case polPackage.TYPE_QNAME:
				return convertTypeQNameToString(eDataType, instanceValue);
			case polPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case polPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case polPackage.WCET:
				return convertWCETToString(eDataType, instanceValue);
			case polPackage.WCET_OBJECT:
				return convertWCETObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AperiodicActivationProfile createAperiodicActivationProfile() {
		AperiodicActivationProfileImpl aperiodicActivationProfile = new AperiodicActivationProfileImpl();
		return aperiodicActivationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public technology.ecoa.insertion.policy._2.Compiler createCompiler() {
		CompilerImpl compiler = new CompilerImpl();
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultPINFO createDefaultPINFO() {
		DefaultPINFOImpl defaultPINFO = new DefaultPINFOImpl();
		return defaultPINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProperties createDefaultProperties() {
		DefaultPropertiesImpl defaultProperties = new DefaultPropertiesImpl();
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultPropertyValue createDefaultPropertyValue() {
		DefaultPropertyValueImpl defaultPropertyValue = new DefaultPropertyValueImpl();
		return defaultPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConstraints createDeploymentConstraints() {
		DeploymentConstraintsImpl deploymentConstraints = new DeploymentConstraintsImpl();
		return deploymentConstraints;
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
	public DynamicMemoryType createDynamicMemoryType() {
		DynamicMemoryTypeImpl dynamicMemoryType = new DynamicMemoryTypeImpl();
		return dynamicMemoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECOAProfile createECOAProfile() {
		ECOAProfileImpl ecoaProfile = new ECOAProfileImpl();
		return ecoaProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraConcerns createExtraConcerns() {
		ExtraConcernsImpl extraConcerns = new ExtraConcernsImpl();
		return extraConcerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestActivationRate createHighestActivationRate() {
		HighestActivationRateImpl highestActivationRate = new HighestActivationRateImpl();
		return highestActivationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionPolicy createInsertionPolicy() {
		InsertionPolicyImpl insertionPolicy = new InsertionPolicyImpl();
		return insertionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionPolicyList createInsertionPolicyList() {
		InsertionPolicyListImpl insertionPolicyList = new InsertionPolicyListImpl();
		return insertionPolicyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageLibraries createLanguageLibraries() {
		LanguageLibrariesImpl languageLibraries = new LanguageLibrariesImpl();
		return languageLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageLibrary createLanguageLibrary() {
		LanguageLibraryImpl languageLibrary = new LanguageLibraryImpl();
		return languageLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryUsage createMemoryUsage() {
		MemoryUsageImpl memoryUsage = new MemoryUsageImpl();
		return memoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleActivationProfile createModuleActivationProfile() {
		ModuleActivationProfileImpl moduleActivationProfile = new ModuleActivationProfileImpl();
		return moduleActivationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleActivationProfiles createModuleActivationProfiles() {
		ModuleActivationProfilesImpl moduleActivationProfiles = new ModuleActivationProfilesImpl();
		return moduleActivationProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCompilationOptions createModuleCompilationOptions() {
		ModuleCompilationOptionsImpl moduleCompilationOptions = new ModuleCompilationOptionsImpl();
		return moduleCompilationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDependencies createModuleDependencies() {
		ModuleDependenciesImpl moduleDependencies = new ModuleDependenciesImpl();
		return moduleDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMemoryUsage createModuleMemoryUsage() {
		ModuleMemoryUsageImpl moduleMemoryUsage = new ModuleMemoryUsageImpl();
		return moduleMemoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePINFOType createModulePINFOType() {
		ModulePINFOTypeImpl modulePINFOType = new ModulePINFOTypeImpl();
		return modulePINFOType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesDependencies createModulesDependencies() {
		ModulesDependenciesImpl modulesDependencies = new ModulesDependenciesImpl();
		return modulesDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSAPIType createOSAPIType() {
		OSAPITypeImpl osapiType = new OSAPITypeImpl();
		return osapiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivationProfile createPeriodicActivationProfile() {
		PeriodicActivationProfileImpl periodicActivationProfile = new PeriodicActivationProfileImpl();
		return periodicActivationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PINFOValue createPINFOValue() {
		PINFOValueImpl pinfoValue = new PINFOValueImpl();
		return pinfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeCharacteristics createRealtimeCharacteristics() {
		RealtimeCharacteristicsImpl realtimeCharacteristics = new RealtimeCharacteristicsImpl();
		return realtimeCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterSize createRegisterSize() {
		RegisterSizeImpl registerSize = new RegisterSizeImpl();
		return registerSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyType createSchedulingPolicyType() {
		SchedulingPolicyTypeImpl schedulingPolicyType = new SchedulingPolicyTypeImpl();
		return schedulingPolicyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAccuracy createTimeAccuracy() {
		TimeAccuracyImpl timeAccuracy = new TimeAccuracyImpl();
		return timeAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol createTransportProtocol() {
		TransportProtocolImpl transportProtocol = new TransportProtocolImpl();
		return transportProtocol;
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
	public ActivationTypeType createActivationTypeTypeFromString(EDataType eDataType, String initialValue) {
		ActivationTypeType result = ActivationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationType createAllocationTypeFromString(EDataType eDataType, String initialValue) {
		AllocationType result = AllocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityType createIntegrityTypeFromString(EDataType eDataType, String initialValue) {
		IntegrityType result = IntegrityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileType createProfileTypeFromString(EDataType eDataType, String initialValue) {
		ProfileType result = ProfileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileTypeToString(EDataType eDataType, Object instanceValue) {
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
	public QualityType createQualityTypeFromString(EDataType eDataType, String initialValue) {
		QualityType result = QualityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy createSchedulingPolicyFromString(EDataType eDataType, String initialValue) {
		SchedulingPolicy result = SchedulingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType createSizeTypeFromString(EDataType eDataType, String initialValue) {
		SizeType result = SizeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationTypeType createActivationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActivationTypeTypeFromString(polPackage.Literals.ACTIVATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivationTypeTypeToString(polPackage.Literals.ACTIVATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationType createAllocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAllocationTypeFromString(polPackage.Literals.ALLOCATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllocationTypeToString(polPackage.Literals.ALLOCATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDeadlineFromString(EDataType eDataType, String initialValue) {
		return createStepsFromString(polPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadlineToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(polPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDeadlineObjectFromString(EDataType eDataType, String initialValue) {
		return createDeadlineFromString(polPackage.Literals.DEADLINE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadlineObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeadlineToString(polPackage.Literals.DEADLINE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFileTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGenericCompilationOptionsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericCompilationOptionsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
	public IntegrityType createIntegrityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegrityTypeFromString(polPackage.Literals.INTEGRITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegrityTypeToString(polPackage.Literals.INTEGRITY_TYPE, instanceValue);
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
	public Double createPeriodFromString(EDataType eDataType, String initialValue) {
		return createStepsFromString(polPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(polPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPeriodObjectFromString(EDataType eDataType, String initialValue) {
		return createPeriodFromString(polPackage.Literals.PERIOD, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPeriodToString(polPackage.Literals.PERIOD, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileType createProfileTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProfileTypeFromString(polPackage.Literals.PROFILE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProfileTypeToString(polPackage.Literals.PROFILE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageObjectFromString(EDataType eDataType, String initialValue) {
		return createProgrammingLanguageFromString(polPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(polPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType createQualityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createQualityTypeFromString(polPackage.Literals.QUALITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQualityTypeToString(polPackage.Literals.QUALITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRelativePriorityFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativePriorityToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy createSchedulingPolicyObjectFromString(EDataType eDataType, String initialValue) {
		return createSchedulingPolicyFromString(polPackage.Literals.SCHEDULING_POLICY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchedulingPolicyToString(polPackage.Literals.SCHEDULING_POLICY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType createSizeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSizeTypeFromString(polPackage.Literals.SIZE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSizeTypeToString(polPackage.Literals.SIZE_TYPE, instanceValue);
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
		return createStepsFromString(polPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(polPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTargetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
		return createTimeDurationFromString(polPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(polPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(polPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(polPackage.Literals.NAME_ID, instanceValue);
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
		return createTypeTypeFromString(polPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(polPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(polPackage.Literals.TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(polPackage.Literals.TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createWCETFromString(EDataType eDataType, String initialValue) {
		return createStepsFromString(polPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWCETToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(polPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createWCETObjectFromString(EDataType eDataType, String initialValue) {
		return createWCETFromString(polPackage.Literals.WCET, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWCETObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWCETToString(polPackage.Literals.WCET, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polPackage getpolPackage() {
		return (polPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static polPackage getPackage() {
		return polPackage.eINSTANCE;
	}

} //polFactoryImpl
