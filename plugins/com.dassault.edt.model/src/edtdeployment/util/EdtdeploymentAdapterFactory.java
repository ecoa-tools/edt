/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.util;

import edtdeployment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edtdeployment.EdtdeploymentPackage
 * @generated
 */
public class EdtdeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtdeploymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtdeploymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdtdeploymentPackage.eINSTANCE;
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
	protected EdtdeploymentSwitch<Adapter> modelSwitch =
		new EdtdeploymentSwitch<Adapter>() {
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseProtectionDomain(ProtectionDomain object) {
				return createProtectionDomainAdapter();
			}
			@Override
			public Adapter caseDeployedModuleInstance(DeployedModuleInstance object) {
				return createDeployedModuleInstanceAdapter();
			}
			@Override
			public Adapter caseDeployedTriggerInstance(DeployedTriggerInstance object) {
				return createDeployedTriggerInstanceAdapter();
			}
			@Override
			public Adapter caseLogPolicy(LogPolicy object) {
				return createLogPolicyAdapter();
			}
			@Override
			public Adapter caseComponentLog(ComponentLog object) {
				return createComponentLogAdapter();
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
			public Adapter casePlatformMessage(PlatformMessage object) {
				return createPlatformMessageAdapter();
			}
			@Override
			public Adapter caseComputingNodeConfiguration(ComputingNodeConfiguration object) {
				return createComputingNodeConfigurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link edtdeployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.ProtectionDomain
	 * @generated
	 */
	public Adapter createProtectionDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.DeployedModuleInstance <em>Deployed Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.DeployedModuleInstance
	 * @generated
	 */
	public Adapter createDeployedModuleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.DeployedTriggerInstance <em>Deployed Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.DeployedTriggerInstance
	 * @generated
	 */
	public Adapter createDeployedTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.LogPolicy <em>Log Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.LogPolicy
	 * @generated
	 */
	public Adapter createLogPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.ComponentLog <em>Component Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.ComponentLog
	 * @generated
	 */
	public Adapter createComponentLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.ModuleLog <em>Module Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.ModuleLog
	 * @generated
	 */
	public Adapter createModuleLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.PlatformConfiguration <em>Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.PlatformConfiguration
	 * @generated
	 */
	public Adapter createPlatformConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.PlatformMessage <em>Platform Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.PlatformMessage
	 * @generated
	 */
	public Adapter createPlatformMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.ComputingNodeConfiguration <em>Computing Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.ComputingNodeConfiguration
	 * @generated
	 */
	public Adapter createComputingNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtdeployment.WireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtdeployment.WireMapping
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

} //EdtdeploymentAdapterFactory
