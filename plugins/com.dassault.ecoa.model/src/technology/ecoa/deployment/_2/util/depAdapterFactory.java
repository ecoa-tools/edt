/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.deployment._2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.deployment._2.depPackage
 * @generated
 */
public class depAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static depPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public depAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = depPackage.eINSTANCE;
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
	protected depSwitch<Adapter> modelSwitch =
		new depSwitch<Adapter>() {
			@Override
			public Adapter caseComponentLog(ComponentLog object) {
				return createComponentLogAdapter();
			}
			@Override
			public Adapter caseComputingNodeConfiguration(ComputingNodeConfiguration object) {
				return createComputingNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseDeployedModuleInstanceType(DeployedModuleInstanceType object) {
				return createDeployedModuleInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDeployedTriggerInstanceType(DeployedTriggerInstanceType object) {
				return createDeployedTriggerInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExecuteOnType(ExecuteOnType object) {
				return createExecuteOnTypeAdapter();
			}
			@Override
			public Adapter caseLogPolicy(LogPolicy object) {
				return createLogPolicyAdapter();
			}
			@Override
			public Adapter caseModuleLog(ModuleLog object) {
				return createModuleLogAdapter();
			}
			@Override
			public Adapter casePlatformConfiguration(PlatformConfiguration object) {
				return createPlatformConfigurationAdapter();
			}
			@Override
			public Adapter casePlatformMessages(PlatformMessages object) {
				return createPlatformMessagesAdapter();
			}
			@Override
			public Adapter caseProtectionDomain(ProtectionDomain object) {
				return createProtectionDomainAdapter();
			}
			@Override
			public Adapter caseUseType(UseType object) {
				return createUseTypeAdapter();
			}
			@Override
			public Adapter caseWireMapping(WireMapping object) {
				return createWireMappingAdapter();
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
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.ComponentLog <em>Component Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.ComponentLog
	 * @generated
	 */
	public Adapter createComponentLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.ComputingNodeConfiguration <em>Computing Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.ComputingNodeConfiguration
	 * @generated
	 */
	public Adapter createComputingNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.DeployedModuleInstanceType <em>Deployed Module Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.DeployedModuleInstanceType
	 * @generated
	 */
	public Adapter createDeployedModuleInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.DeployedTriggerInstanceType <em>Deployed Trigger Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.DeployedTriggerInstanceType
	 * @generated
	 */
	public Adapter createDeployedTriggerInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.ExecuteOnType <em>Execute On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.ExecuteOnType
	 * @generated
	 */
	public Adapter createExecuteOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.LogPolicy <em>Log Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.LogPolicy
	 * @generated
	 */
	public Adapter createLogPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.ModuleLog <em>Module Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.ModuleLog
	 * @generated
	 */
	public Adapter createModuleLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.PlatformConfiguration <em>Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.PlatformConfiguration
	 * @generated
	 */
	public Adapter createPlatformConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.PlatformMessages <em>Platform Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.PlatformMessages
	 * @generated
	 */
	public Adapter createPlatformMessagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.ProtectionDomain
	 * @generated
	 */
	public Adapter createProtectionDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.UseType
	 * @generated
	 */
	public Adapter createUseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.deployment._2.WireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.deployment._2.WireMapping
	 * @generated
	 */
	public Adapter createWireMappingAdapter() {
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

} //depAdapterFactory
