/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtdeployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtdeploymentFactoryImpl extends EFactoryImpl implements EdtdeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdtdeploymentFactory init() {
		try {
			EdtdeploymentFactory theEdtdeploymentFactory = (EdtdeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(EdtdeploymentPackage.eNS_URI);
			if (theEdtdeploymentFactory != null) {
				return theEdtdeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtdeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtdeploymentFactoryImpl() {
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
			case EdtdeploymentPackage.DEPLOYMENT: return createDeployment();
			case EdtdeploymentPackage.PROTECTION_DOMAIN: return createProtectionDomain();
			case EdtdeploymentPackage.DEPLOYED_MODULE_INSTANCE: return createDeployedModuleInstance();
			case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE: return createDeployedTriggerInstance();
			case EdtdeploymentPackage.LOG_POLICY: return createLogPolicy();
			case EdtdeploymentPackage.COMPONENT_LOG: return createComponentLog();
			case EdtdeploymentPackage.MODULE_LOG: return createModuleLog();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION: return createPlatformConfiguration();
			case EdtdeploymentPackage.PLATFORM_MESSAGE: return createPlatformMessage();
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION: return createComputingNodeConfiguration();
			case EdtdeploymentPackage.WIRE_MAPPING: return createWireMapping();
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
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectionDomain createProtectionDomain() {
		ProtectionDomainImpl protectionDomain = new ProtectionDomainImpl();
		return protectionDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedModuleInstance createDeployedModuleInstance() {
		DeployedModuleInstanceImpl deployedModuleInstance = new DeployedModuleInstanceImpl();
		return deployedModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployedTriggerInstance createDeployedTriggerInstance() {
		DeployedTriggerInstanceImpl deployedTriggerInstance = new DeployedTriggerInstanceImpl();
		return deployedTriggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogPolicy createLogPolicy() {
		LogPolicyImpl logPolicy = new LogPolicyImpl();
		return logPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentLog createComponentLog() {
		ComponentLogImpl componentLog = new ComponentLogImpl();
		return componentLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleLog createModuleLog() {
		ModuleLogImpl moduleLog = new ModuleLogImpl();
		return moduleLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformConfiguration createPlatformConfiguration() {
		PlatformConfigurationImpl platformConfiguration = new PlatformConfigurationImpl();
		return platformConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformMessage createPlatformMessage() {
		PlatformMessageImpl platformMessage = new PlatformMessageImpl();
		return platformMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingNodeConfiguration createComputingNodeConfiguration() {
		ComputingNodeConfigurationImpl computingNodeConfiguration = new ComputingNodeConfigurationImpl();
		return computingNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WireMapping createWireMapping() {
		WireMappingImpl wireMapping = new WireMappingImpl();
		return wireMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtdeploymentPackage getEdtdeploymentPackage() {
		return (EdtdeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtdeploymentPackage getPackage() {
		return EdtdeploymentPackage.eINSTANCE;
	}

} //EdtdeploymentFactoryImpl
