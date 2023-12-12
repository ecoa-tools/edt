/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

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
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.insertion.policy._2.polPackage
 * @generated
 */
public class polValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final polValidator INSTANCE = new polValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "technology.ecoa.insertion.policy._2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return polPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case polPackage.APERIODIC_ACTIVATION_PROFILE:
				return validateAperiodicActivationProfile((AperiodicActivationProfile)value, diagnostics, context);
			case polPackage.COMPILER:
				return validateCompiler((technology.ecoa.insertion.policy._2.Compiler)value, diagnostics, context);
			case polPackage.DEFAULT_PINFO:
				return validateDefaultPINFO((DefaultPINFO)value, diagnostics, context);
			case polPackage.DEFAULT_PROPERTIES:
				return validateDefaultProperties((DefaultProperties)value, diagnostics, context);
			case polPackage.DEFAULT_PROPERTY_VALUE:
				return validateDefaultPropertyValue((DefaultPropertyValue)value, diagnostics, context);
			case polPackage.DEPLOYMENT_CONSTRAINTS:
				return validateDeploymentConstraints((DeploymentConstraints)value, diagnostics, context);
			case polPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case polPackage.DYNAMIC_MEMORY_TYPE:
				return validateDynamicMemoryType((DynamicMemoryType)value, diagnostics, context);
			case polPackage.ECOA_PROFILE:
				return validateECOAProfile((ECOAProfile)value, diagnostics, context);
			case polPackage.EXTRA_CONCERNS:
				return validateExtraConcerns((ExtraConcerns)value, diagnostics, context);
			case polPackage.HIGHEST_ACTIVATION_RATE:
				return validateHighestActivationRate((HighestActivationRate)value, diagnostics, context);
			case polPackage.INSERTION_POLICY:
				return validateInsertionPolicy((InsertionPolicy)value, diagnostics, context);
			case polPackage.INSERTION_POLICY_LIST:
				return validateInsertionPolicyList((InsertionPolicyList)value, diagnostics, context);
			case polPackage.LANGUAGE_LIBRARIES:
				return validateLanguageLibraries((LanguageLibraries)value, diagnostics, context);
			case polPackage.LANGUAGE_LIBRARY:
				return validateLanguageLibrary((LanguageLibrary)value, diagnostics, context);
			case polPackage.MEMORY_USAGE:
				return validateMemoryUsage((MemoryUsage)value, diagnostics, context);
			case polPackage.MODULE_ACTIVATION_PROFILE:
				return validateModuleActivationProfile((ModuleActivationProfile)value, diagnostics, context);
			case polPackage.MODULE_ACTIVATION_PROFILES:
				return validateModuleActivationProfiles((ModuleActivationProfiles)value, diagnostics, context);
			case polPackage.MODULE_COMPILATION_OPTIONS:
				return validateModuleCompilationOptions((ModuleCompilationOptions)value, diagnostics, context);
			case polPackage.MODULE_DEPENDENCIES:
				return validateModuleDependencies((ModuleDependencies)value, diagnostics, context);
			case polPackage.MODULE_MEMORY_USAGE:
				return validateModuleMemoryUsage((ModuleMemoryUsage)value, diagnostics, context);
			case polPackage.MODULE_PINFO_TYPE:
				return validateModulePINFOType((ModulePINFOType)value, diagnostics, context);
			case polPackage.MODULES_DEPENDENCIES:
				return validateModulesDependencies((ModulesDependencies)value, diagnostics, context);
			case polPackage.OSAPI_TYPE:
				return validateOSAPIType((OSAPIType)value, diagnostics, context);
			case polPackage.PERIODIC_ACTIVATION_PROFILE:
				return validatePeriodicActivationProfile((PeriodicActivationProfile)value, diagnostics, context);
			case polPackage.PINFO_VALUE:
				return validatePINFOValue((PINFOValue)value, diagnostics, context);
			case polPackage.REALTIME_CHARACTERISTICS:
				return validateRealtimeCharacteristics((RealtimeCharacteristics)value, diagnostics, context);
			case polPackage.REGISTER_SIZE:
				return validateRegisterSize((RegisterSize)value, diagnostics, context);
			case polPackage.SCHEDULING_POLICY_TYPE:
				return validateSchedulingPolicyType((SchedulingPolicyType)value, diagnostics, context);
			case polPackage.TIME_ACCURACY:
				return validateTimeAccuracy((TimeAccuracy)value, diagnostics, context);
			case polPackage.TRANSPORT_PROTOCOL:
				return validateTransportProtocol((TransportProtocol)value, diagnostics, context);
			case polPackage.USE_TYPE:
				return validateUseType((UseType)value, diagnostics, context);
			case polPackage.ACTIVATION_TYPE_TYPE:
				return validateActivationTypeType((ActivationTypeType)value, diagnostics, context);
			case polPackage.ALLOCATION_TYPE:
				return validateAllocationType((AllocationType)value, diagnostics, context);
			case polPackage.INTEGRITY_TYPE:
				return validateIntegrityType((IntegrityType)value, diagnostics, context);
			case polPackage.PROFILE_TYPE:
				return validateProfileType((ProfileType)value, diagnostics, context);
			case polPackage.PROGRAMMING_LANGUAGE:
				return validateProgrammingLanguage((ProgrammingLanguage)value, diagnostics, context);
			case polPackage.QUALITY_TYPE:
				return validateQualityType((QualityType)value, diagnostics, context);
			case polPackage.SCHEDULING_POLICY:
				return validateSchedulingPolicy((SchedulingPolicy)value, diagnostics, context);
			case polPackage.SIZE_TYPE:
				return validateSizeType((SizeType)value, diagnostics, context);
			case polPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case polPackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case polPackage.ACTIVATION_TYPE_TYPE_OBJECT:
				return validateActivationTypeTypeObject((ActivationTypeType)value, diagnostics, context);
			case polPackage.ALLOCATION_TYPE_OBJECT:
				return validateAllocationTypeObject((AllocationType)value, diagnostics, context);
			case polPackage.DEADLINE:
				return validateDeadline((Double)value, diagnostics, context);
			case polPackage.DEADLINE_OBJECT:
				return validateDeadlineObject((Double)value, diagnostics, context);
			case polPackage.FILE_TYPE:
				return validateFileType((String)value, diagnostics, context);
			case polPackage.GENERIC_COMPILATION_OPTIONS:
				return validateGenericCompilationOptions((String)value, diagnostics, context);
			case polPackage.HEX_OR_DEC_VALUE:
				return validateHexOrDecValue((String)value, diagnostics, context);
			case polPackage.INTEGRITY_TYPE_OBJECT:
				return validateIntegrityTypeObject((IntegrityType)value, diagnostics, context);
			case polPackage.LIBRARY_NAME:
				return validateLibraryName((String)value, diagnostics, context);
			case polPackage.NAME_ID:
				return validateNameId((String)value, diagnostics, context);
			case polPackage.PERIOD:
				return validatePeriod((Double)value, diagnostics, context);
			case polPackage.PERIOD_OBJECT:
				return validatePeriodObject((Double)value, diagnostics, context);
			case polPackage.PROFILE_TYPE_OBJECT:
				return validateProfileTypeObject((ProfileType)value, diagnostics, context);
			case polPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return validateProgrammingLanguageObject((ProgrammingLanguage)value, diagnostics, context);
			case polPackage.QUALITY_TYPE_OBJECT:
				return validateQualityTypeObject((QualityType)value, diagnostics, context);
			case polPackage.RELATIVE_PRIORITY:
				return validateRelativePriority((BigInteger)value, diagnostics, context);
			case polPackage.SCHEDULING_POLICY_OBJECT:
				return validateSchedulingPolicyObject((SchedulingPolicy)value, diagnostics, context);
			case polPackage.SIZE_TYPE_OBJECT:
				return validateSizeTypeObject((SizeType)value, diagnostics, context);
			case polPackage.STEPS:
				return validateSteps((Double)value, diagnostics, context);
			case polPackage.STEPS_OBJECT:
				return validateStepsObject((Double)value, diagnostics, context);
			case polPackage.TARGET:
				return validateTarget((String)value, diagnostics, context);
			case polPackage.TIME_DURATION:
				return validateTimeDuration((Double)value, diagnostics, context);
			case polPackage.TIME_DURATION_OBJECT:
				return validateTimeDurationObject((Double)value, diagnostics, context);
			case polPackage.TYPE_NAME:
				return validateTypeName((String)value, diagnostics, context);
			case polPackage.TYPE_QNAME:
				return validateTypeQName((String)value, diagnostics, context);
			case polPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case polPackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType1)value, diagnostics, context);
			case polPackage.WCET:
				return validateWCET((Double)value, diagnostics, context);
			case polPackage.WCET_OBJECT:
				return validateWCETObject((Double)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAperiodicActivationProfile(AperiodicActivationProfile aperiodicActivationProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aperiodicActivationProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompiler(technology.ecoa.insertion.policy._2.Compiler compiler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compiler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultPINFO(DefaultPINFO defaultPINFO, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultPINFO, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultProperties(DefaultProperties defaultProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultPropertyValue(DefaultPropertyValue defaultPropertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultPropertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConstraints(DeploymentConstraints deploymentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deploymentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMemoryType(DynamicMemoryType dynamicMemoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicMemoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECOAProfile(ECOAProfile ecoaProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ecoaProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtraConcerns(ExtraConcerns extraConcerns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extraConcerns, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestActivationRate(HighestActivationRate highestActivationRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(highestActivationRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertionPolicy(InsertionPolicy insertionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertionPolicyList(InsertionPolicyList insertionPolicyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertionPolicyList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageLibraries(LanguageLibraries languageLibraries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageLibraries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageLibrary(LanguageLibrary languageLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryUsage(MemoryUsage memoryUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleActivationProfile(ModuleActivationProfile moduleActivationProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleActivationProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleActivationProfiles(ModuleActivationProfiles moduleActivationProfiles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleActivationProfiles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleCompilationOptions(ModuleCompilationOptions moduleCompilationOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleCompilationOptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDependencies(ModuleDependencies moduleDependencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDependencies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMemoryUsage(ModuleMemoryUsage moduleMemoryUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMemoryUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulePINFOType(ModulePINFOType modulePINFOType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modulePINFOType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulesDependencies(ModulesDependencies modulesDependencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modulesDependencies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSAPIType(OSAPIType osapiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osapiType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicActivationProfile(PeriodicActivationProfile periodicActivationProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicActivationProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePINFOValue(PINFOValue pinfoValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinfoValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeCharacteristics(RealtimeCharacteristics realtimeCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realtimeCharacteristics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterSize(RegisterSize registerSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicyType(SchedulingPolicyType schedulingPolicyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulingPolicyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAccuracy(TimeAccuracy timeAccuracy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAccuracy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportProtocol(TransportProtocol transportProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseType(UseType useType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationTypeType(ActivationTypeType activationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationType(AllocationType allocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegrityType(IntegrityType integrityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileType(ProfileType profileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguage(ProgrammingLanguage programmingLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityType(QualityType qualityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicy(SchedulingPolicy schedulingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeType(SizeType sizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationTypeTypeObject(ActivationTypeType activationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationTypeObject(AllocationType allocationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadline(double deadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(deadline, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadlineObject(Double deadlineObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(deadlineObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(String fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericCompilationOptions(String genericCompilationOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexOrDecValue_Pattern(hexOrDecValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexOrDecValue_Pattern
	 */
	public static final  PatternMatcher [][] HEX_OR_DEC_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]+|[1-9][0-9]*|0")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hex Or Dec Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue_Pattern(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(polPackage.Literals.HEX_OR_DEC_VALUE, hexOrDecValue, HEX_OR_DEC_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegrityTypeObject(IntegrityType integrityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLibraryName_Pattern(libraryName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLibraryName_Pattern
	 */
	public static final  PatternMatcher [][] LIBRARY_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_\\.]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Library Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName_Pattern(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(polPackage.Literals.LIBRARY_NAME, libraryName, LIBRARY_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(nameId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNameId_Pattern
	 */
	public static final  PatternMatcher [][] NAME_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId_Pattern(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(polPackage.Literals.NAME_ID, nameId, NAME_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(double period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(period, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodObject(Double periodObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(periodObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileTypeObject(ProfileType profileTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguageObject(ProgrammingLanguage programmingLanguageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityTypeObject(QualityType qualityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePriority(BigInteger relativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(relativePriority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicyObject(SchedulingPolicy schedulingPolicyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeTypeObject(SizeType sizeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(steps, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSteps_Min
	 */
	public static final double STEPS__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps_Min(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = steps >= STEPS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(polPackage.Literals.STEPS, steps, STEPS__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepsObject(Double stepsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(stepsObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(String target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDuration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeDuration_Min
	 */
	public static final double TIME_DURATION__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration_Min(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeDuration >= TIME_DURATION__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(polPackage.Literals.TIME_DURATION, timeDuration, TIME_DURATION__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDurationObject(Double timeDurationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDurationObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeName(String typeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(typeName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeQName_Pattern(typeQName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeQName_Pattern
	 */
	public static final  PatternMatcher [][] TYPE_QNAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Type QName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName_Pattern(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(polPackage.Literals.TYPE_QNAME, typeQName, TYPE_QNAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType1 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWCET(double wcet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(wcet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWCETObject(Double wcetObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(wcetObject, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //polValidator
