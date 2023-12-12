/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import technology.ecoa.insertion.policy._2.RealtimeCharacteristics;
import technology.ecoa.insertion.policy._2.RegisterSize;
import technology.ecoa.insertion.policy._2.SchedulingPolicyType;
import technology.ecoa.insertion.policy._2.TimeAccuracy;
import technology.ecoa.insertion.policy._2.TransportProtocol;
import technology.ecoa.insertion.policy._2.UseType;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see technology.ecoa.insertion.policy._2.polPackage
 * @generated
 */
public class polSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static polPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polSwitch() {
		if (modelPackage == null) {
			modelPackage = polPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case polPackage.APERIODIC_ACTIVATION_PROFILE: {
				AperiodicActivationProfile aperiodicActivationProfile = (AperiodicActivationProfile)theEObject;
				T result = caseAperiodicActivationProfile(aperiodicActivationProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.COMPILER: {
				technology.ecoa.insertion.policy._2.Compiler compiler = (technology.ecoa.insertion.policy._2.Compiler)theEObject;
				T result = caseCompiler(compiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DEFAULT_PINFO: {
				DefaultPINFO defaultPINFO = (DefaultPINFO)theEObject;
				T result = caseDefaultPINFO(defaultPINFO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DEFAULT_PROPERTIES: {
				DefaultProperties defaultProperties = (DefaultProperties)theEObject;
				T result = caseDefaultProperties(defaultProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DEFAULT_PROPERTY_VALUE: {
				DefaultPropertyValue defaultPropertyValue = (DefaultPropertyValue)theEObject;
				T result = caseDefaultPropertyValue(defaultPropertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DEPLOYMENT_CONSTRAINTS: {
				DeploymentConstraints deploymentConstraints = (DeploymentConstraints)theEObject;
				T result = caseDeploymentConstraints(deploymentConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.DYNAMIC_MEMORY_TYPE: {
				DynamicMemoryType dynamicMemoryType = (DynamicMemoryType)theEObject;
				T result = caseDynamicMemoryType(dynamicMemoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.ECOA_PROFILE: {
				ECOAProfile ecoaProfile = (ECOAProfile)theEObject;
				T result = caseECOAProfile(ecoaProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.EXTRA_CONCERNS: {
				ExtraConcerns extraConcerns = (ExtraConcerns)theEObject;
				T result = caseExtraConcerns(extraConcerns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.HIGHEST_ACTIVATION_RATE: {
				HighestActivationRate highestActivationRate = (HighestActivationRate)theEObject;
				T result = caseHighestActivationRate(highestActivationRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.INSERTION_POLICY: {
				InsertionPolicy insertionPolicy = (InsertionPolicy)theEObject;
				T result = caseInsertionPolicy(insertionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.INSERTION_POLICY_LIST: {
				InsertionPolicyList insertionPolicyList = (InsertionPolicyList)theEObject;
				T result = caseInsertionPolicyList(insertionPolicyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.LANGUAGE_LIBRARIES: {
				LanguageLibraries languageLibraries = (LanguageLibraries)theEObject;
				T result = caseLanguageLibraries(languageLibraries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.LANGUAGE_LIBRARY: {
				LanguageLibrary languageLibrary = (LanguageLibrary)theEObject;
				T result = caseLanguageLibrary(languageLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MEMORY_USAGE: {
				MemoryUsage memoryUsage = (MemoryUsage)theEObject;
				T result = caseMemoryUsage(memoryUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_ACTIVATION_PROFILE: {
				ModuleActivationProfile moduleActivationProfile = (ModuleActivationProfile)theEObject;
				T result = caseModuleActivationProfile(moduleActivationProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_ACTIVATION_PROFILES: {
				ModuleActivationProfiles moduleActivationProfiles = (ModuleActivationProfiles)theEObject;
				T result = caseModuleActivationProfiles(moduleActivationProfiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_COMPILATION_OPTIONS: {
				ModuleCompilationOptions moduleCompilationOptions = (ModuleCompilationOptions)theEObject;
				T result = caseModuleCompilationOptions(moduleCompilationOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_DEPENDENCIES: {
				ModuleDependencies moduleDependencies = (ModuleDependencies)theEObject;
				T result = caseModuleDependencies(moduleDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_MEMORY_USAGE: {
				ModuleMemoryUsage moduleMemoryUsage = (ModuleMemoryUsage)theEObject;
				T result = caseModuleMemoryUsage(moduleMemoryUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULE_PINFO_TYPE: {
				ModulePINFOType modulePINFOType = (ModulePINFOType)theEObject;
				T result = caseModulePINFOType(modulePINFOType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.MODULES_DEPENDENCIES: {
				ModulesDependencies modulesDependencies = (ModulesDependencies)theEObject;
				T result = caseModulesDependencies(modulesDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.OSAPI_TYPE: {
				OSAPIType osapiType = (OSAPIType)theEObject;
				T result = caseOSAPIType(osapiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.PERIODIC_ACTIVATION_PROFILE: {
				PeriodicActivationProfile periodicActivationProfile = (PeriodicActivationProfile)theEObject;
				T result = casePeriodicActivationProfile(periodicActivationProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.PINFO_VALUE: {
				PINFOValue pinfoValue = (PINFOValue)theEObject;
				T result = casePINFOValue(pinfoValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.REALTIME_CHARACTERISTICS: {
				RealtimeCharacteristics realtimeCharacteristics = (RealtimeCharacteristics)theEObject;
				T result = caseRealtimeCharacteristics(realtimeCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.REGISTER_SIZE: {
				RegisterSize registerSize = (RegisterSize)theEObject;
				T result = caseRegisterSize(registerSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.SCHEDULING_POLICY_TYPE: {
				SchedulingPolicyType schedulingPolicyType = (SchedulingPolicyType)theEObject;
				T result = caseSchedulingPolicyType(schedulingPolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.TIME_ACCURACY: {
				TimeAccuracy timeAccuracy = (TimeAccuracy)theEObject;
				T result = caseTimeAccuracy(timeAccuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.TRANSPORT_PROTOCOL: {
				TransportProtocol transportProtocol = (TransportProtocol)theEObject;
				T result = caseTransportProtocol(transportProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case polPackage.USE_TYPE: {
				UseType useType = (UseType)theEObject;
				T result = caseUseType(useType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aperiodic Activation Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aperiodic Activation Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAperiodicActivationProfile(AperiodicActivationProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compiler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompiler(technology.ecoa.insertion.policy._2.Compiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default PINFO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default PINFO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultPINFO(DefaultPINFO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultProperties(DefaultProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultPropertyValue(DefaultPropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConstraints(DeploymentConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Memory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicMemoryType(DynamicMemoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECOA Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECOA Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECOAProfile(ECOAProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Concerns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Concerns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraConcerns(ExtraConcerns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highest Activation Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highest Activation Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighestActivationRate(HighestActivationRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insertion Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insertion Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertionPolicy(InsertionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insertion Policy List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insertion Policy List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertionPolicyList(InsertionPolicyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Libraries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Libraries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageLibraries(LanguageLibraries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageLibrary(LanguageLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryUsage(MemoryUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Activation Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Activation Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleActivationProfile(ModuleActivationProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Activation Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Activation Profiles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleActivationProfiles(ModuleActivationProfiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Compilation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Compilation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleCompilationOptions(ModuleCompilationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDependencies(ModuleDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Memory Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Memory Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMemoryUsage(ModuleMemoryUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module PINFO Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module PINFO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulePINFOType(ModulePINFOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modules Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modules Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulesDependencies(ModulesDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSAPI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSAPI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSAPIType(OSAPIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Activation Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Activation Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicActivationProfile(PeriodicActivationProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PINFO Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PINFO Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePINFOValue(PINFOValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realtime Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realtime Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealtimeCharacteristics(RealtimeCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterSize(RegisterSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Policy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingPolicyType(SchedulingPolicyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAccuracy(TimeAccuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportProtocol(TransportProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseType(UseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //polSwitch
