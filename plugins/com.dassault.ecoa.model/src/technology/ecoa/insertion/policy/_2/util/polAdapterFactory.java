/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.insertion.policy._2.polPackage
 * @generated
 */
public class polAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static polPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public polAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = polPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected polSwitch<Adapter> modelSwitch =
		new polSwitch<Adapter>() {
			@Override
			public Adapter caseAperiodicActivationProfile(AperiodicActivationProfile object) {
				return createAperiodicActivationProfileAdapter();
			}
			@Override
			public Adapter caseCompiler(technology.ecoa.insertion.policy._2.Compiler object) {
				return createCompilerAdapter();
			}
			@Override
			public Adapter caseDefaultPINFO(DefaultPINFO object) {
				return createDefaultPINFOAdapter();
			}
			@Override
			public Adapter caseDefaultProperties(DefaultProperties object) {
				return createDefaultPropertiesAdapter();
			}
			@Override
			public Adapter caseDefaultPropertyValue(DefaultPropertyValue object) {
				return createDefaultPropertyValueAdapter();
			}
			@Override
			public Adapter caseDeploymentConstraints(DeploymentConstraints object) {
				return createDeploymentConstraintsAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicMemoryType(DynamicMemoryType object) {
				return createDynamicMemoryTypeAdapter();
			}
			@Override
			public Adapter caseECOAProfile(ECOAProfile object) {
				return createECOAProfileAdapter();
			}
			@Override
			public Adapter caseExtraConcerns(ExtraConcerns object) {
				return createExtraConcernsAdapter();
			}
			@Override
			public Adapter caseHighestActivationRate(HighestActivationRate object) {
				return createHighestActivationRateAdapter();
			}
			@Override
			public Adapter caseInsertionPolicy(InsertionPolicy object) {
				return createInsertionPolicyAdapter();
			}
			@Override
			public Adapter caseInsertionPolicyList(InsertionPolicyList object) {
				return createInsertionPolicyListAdapter();
			}
			@Override
			public Adapter caseLanguageLibraries(LanguageLibraries object) {
				return createLanguageLibrariesAdapter();
			}
			@Override
			public Adapter caseLanguageLibrary(LanguageLibrary object) {
				return createLanguageLibraryAdapter();
			}
			@Override
			public Adapter caseMemoryUsage(MemoryUsage object) {
				return createMemoryUsageAdapter();
			}
			@Override
			public Adapter caseModuleActivationProfile(ModuleActivationProfile object) {
				return createModuleActivationProfileAdapter();
			}
			@Override
			public Adapter caseModuleActivationProfiles(ModuleActivationProfiles object) {
				return createModuleActivationProfilesAdapter();
			}
			@Override
			public Adapter caseModuleCompilationOptions(ModuleCompilationOptions object) {
				return createModuleCompilationOptionsAdapter();
			}
			@Override
			public Adapter caseModuleDependencies(ModuleDependencies object) {
				return createModuleDependenciesAdapter();
			}
			@Override
			public Adapter caseModuleMemoryUsage(ModuleMemoryUsage object) {
				return createModuleMemoryUsageAdapter();
			}
			@Override
			public Adapter caseModulePINFOType(ModulePINFOType object) {
				return createModulePINFOTypeAdapter();
			}
			@Override
			public Adapter caseModulesDependencies(ModulesDependencies object) {
				return createModulesDependenciesAdapter();
			}
			@Override
			public Adapter caseOSAPIType(OSAPIType object) {
				return createOSAPITypeAdapter();
			}
			@Override
			public Adapter casePeriodicActivationProfile(PeriodicActivationProfile object) {
				return createPeriodicActivationProfileAdapter();
			}
			@Override
			public Adapter casePINFOValue(PINFOValue object) {
				return createPINFOValueAdapter();
			}
			@Override
			public Adapter caseRealtimeCharacteristics(RealtimeCharacteristics object) {
				return createRealtimeCharacteristicsAdapter();
			}
			@Override
			public Adapter caseRegisterSize(RegisterSize object) {
				return createRegisterSizeAdapter();
			}
			@Override
			public Adapter caseSchedulingPolicyType(SchedulingPolicyType object) {
				return createSchedulingPolicyTypeAdapter();
			}
			@Override
			public Adapter caseTimeAccuracy(TimeAccuracy object) {
				return createTimeAccuracyAdapter();
			}
			@Override
			public Adapter caseTransportProtocol(TransportProtocol object) {
				return createTransportProtocolAdapter();
			}
			@Override
			public Adapter caseUseType(UseType object) {
				return createUseTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile <em>Aperiodic Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.AperiodicActivationProfile
	 * @generated
	 */
	public Adapter createAperiodicActivationProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.Compiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.Compiler
	 * @generated
	 */
	public Adapter createCompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DefaultPINFO <em>Default PINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DefaultPINFO
	 * @generated
	 */
	public Adapter createDefaultPINFOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DefaultProperties
	 * @generated
	 */
	public Adapter createDefaultPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DefaultPropertyValue <em>Default Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DefaultPropertyValue
	 * @generated
	 */
	public Adapter createDefaultPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DeploymentConstraints
	 * @generated
	 */
	public Adapter createDeploymentConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.DynamicMemoryType <em>Dynamic Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.DynamicMemoryType
	 * @generated
	 */
	public Adapter createDynamicMemoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ECOAProfile <em>ECOA Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ECOAProfile
	 * @generated
	 */
	public Adapter createECOAProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ExtraConcerns <em>Extra Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ExtraConcerns
	 * @generated
	 */
	public Adapter createExtraConcernsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.HighestActivationRate <em>Highest Activation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.HighestActivationRate
	 * @generated
	 */
	public Adapter createHighestActivationRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.InsertionPolicy <em>Insertion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicy
	 * @generated
	 */
	public Adapter createInsertionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.InsertionPolicyList <em>Insertion Policy List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.InsertionPolicyList
	 * @generated
	 */
	public Adapter createInsertionPolicyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.LanguageLibraries <em>Language Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibraries
	 * @generated
	 */
	public Adapter createLanguageLibrariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.LanguageLibrary <em>Language Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.LanguageLibrary
	 * @generated
	 */
	public Adapter createLanguageLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.MemoryUsage <em>Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.MemoryUsage
	 * @generated
	 */
	public Adapter createMemoryUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile <em>Module Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfile
	 * @generated
	 */
	public Adapter createModuleActivationProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles <em>Module Activation Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModuleActivationProfiles
	 * @generated
	 */
	public Adapter createModuleActivationProfilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions <em>Module Compilation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModuleCompilationOptions
	 * @generated
	 */
	public Adapter createModuleCompilationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModuleDependencies <em>Module Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModuleDependencies
	 * @generated
	 */
	public Adapter createModuleDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage <em>Module Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModuleMemoryUsage
	 * @generated
	 */
	public Adapter createModuleMemoryUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModulePINFOType <em>Module PINFO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModulePINFOType
	 * @generated
	 */
	public Adapter createModulePINFOTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.ModulesDependencies <em>Modules Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.ModulesDependencies
	 * @generated
	 */
	public Adapter createModulesDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.OSAPIType <em>OSAPI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.OSAPIType
	 * @generated
	 */
	public Adapter createOSAPITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile <em>Periodic Activation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.PeriodicActivationProfile
	 * @generated
	 */
	public Adapter createPeriodicActivationProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.PINFOValue <em>PINFO Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.PINFOValue
	 * @generated
	 */
	public Adapter createPINFOValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics <em>Realtime Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.RealtimeCharacteristics
	 * @generated
	 */
	public Adapter createRealtimeCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.RegisterSize <em>Register Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.RegisterSize
	 * @generated
	 */
	public Adapter createRegisterSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.SchedulingPolicyType <em>Scheduling Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.SchedulingPolicyType
	 * @generated
	 */
	public Adapter createSchedulingPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.TimeAccuracy <em>Time Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.TimeAccuracy
	 * @generated
	 */
	public Adapter createTimeAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.TransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.TransportProtocol
	 * @generated
	 */
	public Adapter createTransportProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.insertion.policy._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.insertion.policy._2.UseType
	 * @generated
	 */
	public Adapter createUseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //polAdapterFactory
