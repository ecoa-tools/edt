/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtdeployment.ComponentLog;
import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.Deployment;
import edtdeployment.LogPolicy;
import edtdeployment.ModuleLog;
import edtdeployment.PlatformConfiguration;
import edtdeployment.PlatformMessage;
import edtdeployment.ProtectionDomain;
import edtdeployment.WireMapping;
import technology.ecoa.deployment._2.ExecuteOnType;
import technology.ecoa.deployment._2.depFactory;

/**
 * Convert EDT Objects to ECOA Objects
 *
 */
public class DeploymentExportConverter {
	private static final depFactory ECOADEPLOYMENTFACTORY = depFactory.eINSTANCE;

	private DeploymentExportConverter() {
	}

	/**
	 * Create a EDT model Deployment from a Ecoa model Deployment
	 * 
	 * @param edtDeployment : ECOA LogicalSystem object
	 * @param fileName      : name of the file
	 * @param finalAssembly : finalAssembly
	 * @param logicalSystem : logicalSystem
	 * @return edtDeployment @ if referenced element not found
	 */
	public static technology.ecoa.deployment._2.DocumentRoot recreateECOADeployment(Deployment edtDeployment) {

// 		Create empty ECOA Deployment
		technology.ecoa.deployment._2.DocumentRoot documentRoot = ECOADEPLOYMENTFACTORY.createDocumentRoot();
		var ecoaDeployment = ECOADEPLOYMENTFACTORY.createDeployment();

//		Set finalAssembly
		if (edtDeployment.getFinalAssembly() != null) {
			ecoaDeployment.setFinalAssembly(edtDeployment.getFinalAssembly().getName());
		}

//		Set LogicalSystem
		if (edtDeployment.getLogicalSystem() != null) {
			ecoaDeployment.setLogicalSystem(edtDeployment.getLogicalSystem().getFileNamePrefix());
		}

//		Convert Protecting Domain
		EList<ProtectionDomain> edtProtectionDomains = edtDeployment.getProtectionDomains();
		for (ProtectionDomain edtProtectionDomain : edtProtectionDomains) {
			ecoaDeployment.getProtectionDomain().add(recreateECOAProtectionDomain(edtProtectionDomain));
		}

//		Convert LogPolicy
		EList<LogPolicy> edtLogPolicies = edtDeployment.getLogPolicies();
		for (LogPolicy edtLogPolicy : edtLogPolicies) {
			ecoaDeployment.getLogPolicy().add(recreateECOALogPolicy(edtLogPolicy));
		}

//		Convert PlatformConfiguration
		EList<PlatformConfiguration> edtPlatformConfigurations = edtDeployment.getPlatformConfigurations();
		for (PlatformConfiguration edtPlatformConfiguration : edtPlatformConfigurations) {
			ecoaDeployment.getPlatformConfiguration().add(recreateECOAPlatformConfiguration(edtPlatformConfiguration));
		}

//		Convert WireMapping
		EList<WireMapping> edtWireMappings = edtDeployment.getWireMappings();
		for (WireMapping edtWireMapping : edtWireMappings) {
			ecoaDeployment.getWireMapping().add(recreateECOAWireMapping(edtWireMapping));
		}

		documentRoot.setDeployment(ecoaDeployment);
		return documentRoot;
	}

	/**
	 * @param edtWireMapping
	 * @return
	 */
	private static technology.ecoa.deployment._2.WireMapping recreateECOAWireMapping(WireMapping edtWireMapping) {
		technology.ecoa.deployment._2.WireMapping ecoaWireMapping = ECOADEPLOYMENTFACTORY.createWireMapping();

		if (edtWireMapping.getMappedOnLinkId() != null) {
			ecoaWireMapping.setMappedOnLinkId(edtWireMapping.getMappedOnLinkId().getId());
		}

//		Convert Wire reference and service to String
		if (edtWireMapping.getWire() != null && edtWireMapping.getWire().getSource() != null) {
			ecoaWireMapping.setSource(edtWireMapping.getWire().getSource().getWireString());
		}
		if (edtWireMapping.getWire() != null && edtWireMapping.getWire().getTarget() != null) {
			ecoaWireMapping.setTarget(edtWireMapping.getWire().getTarget().getWireString());
		}
		return ecoaWireMapping;
	}

	/**
	 * @param edtPlatformConfiguration
	 * @return
	 */
	private static technology.ecoa.deployment._2.PlatformConfiguration recreateECOAPlatformConfiguration(
			PlatformConfiguration edtPlatformConfiguration) {
		technology.ecoa.deployment._2.PlatformConfiguration ecoaPlatformConfiguration = ECOADEPLOYMENTFACTORY
				.createPlatformConfiguration();

//		Set if necessary FaultHandlerNotificationMaxNumber
		if (edtPlatformConfiguration.isSetFaultHandlerNotificationMaxNumber()) {
			ecoaPlatformConfiguration.setFaultHandlerNotificationMaxNumber(
					edtPlatformConfiguration.getFaultHandlerNotificationMaxNumber());
		}

//		Set EUIDS
		ecoaPlatformConfiguration.setEUIDs(edtPlatformConfiguration.getEUIDs());

//		Convert ComputingPlatform
		if (edtPlatformConfiguration.getComputingPlatform() != null) {
			ecoaPlatformConfiguration.setComputingPlatform(edtPlatformConfiguration.getComputingPlatform().getId());
		}

//		Convert ComputingNodeConfiguration
		EList<ComputingNodeConfiguration> edtComputingNodeConfigurations = edtPlatformConfiguration
				.getComputingNodeConfigurations();
		for (ComputingNodeConfiguration edtComputingNodeConfiguration : edtComputingNodeConfigurations) {
			ecoaPlatformConfiguration.getComputingNodeConfiguration()
					.add(recreateECOAComputingNodeConfiguration(edtComputingNodeConfiguration));
		}

//		Convert PlatformMessages
		EList<PlatformMessage> edtPlatformMessages = edtPlatformConfiguration.getPlatformMessages();
		for (PlatformMessage edtPlatformMessage : edtPlatformMessages) {
			technology.ecoa.deployment._2.PlatformMessages ecoaPlatformMessage = ECOADEPLOYMENTFACTORY
					.createPlatformMessages();
			if (edtPlatformMessage.getMappedOnLinkId() != null) {
				ecoaPlatformMessage.setMappedOnLinkId(edtPlatformMessage.getMappedOnLinkId().getId());
			}
			ecoaPlatformConfiguration.getPlatformMessages().add(ecoaPlatformMessage);
		}
		return ecoaPlatformConfiguration;
	}

	/**
	 * @param edtComputingNodeConfiguration
	 * @return
	 */
	private static technology.ecoa.deployment._2.ComputingNodeConfiguration recreateECOAComputingNodeConfiguration(
			ComputingNodeConfiguration edtComputingNodeConfiguration) {
		technology.ecoa.deployment._2.ComputingNodeConfiguration ecoaComputingNodeConfiguration = ECOADEPLOYMENTFACTORY
				.createComputingNodeConfiguration();

//		Set SchedulingInformation
		if (edtComputingNodeConfiguration.getSchedulingInformation() != null
				&& !edtComputingNodeConfiguration.getSchedulingInformation().isBlank()) {
			ecoaComputingNodeConfiguration
					.setSchedulingInformation(edtComputingNodeConfiguration.getSchedulingInformation());
		}

//		Convert Computing Node
		if (edtComputingNodeConfiguration.getComputingNode() != null) {
			ecoaComputingNodeConfiguration.setComputingNode(edtComputingNodeConfiguration.getComputingNode().getId());

		}
		return ecoaComputingNodeConfiguration;
	}

	/**
	 * @param edtLogPolicy
	 * @return
	 */
	private static technology.ecoa.deployment._2.LogPolicy recreateECOALogPolicy(LogPolicy edtLogPolicy) {
		technology.ecoa.deployment._2.LogPolicy ecoaLogPolicy = ECOADEPLOYMENTFACTORY.createLogPolicy();

//		Convert ComponentLogs
		EList<ComponentLog> edtComponentLogs = edtLogPolicy.getComponentLogs();
		for (ComponentLog edtComponentLog : edtComponentLogs) {
			ecoaLogPolicy.getComponentLog().add(recreateECOAComponentLog(edtComponentLog));
		}
		return ecoaLogPolicy;
	}

	/**
	 * @param edtComponentLog
	 * @return
	 */
	private static technology.ecoa.deployment._2.ComponentLog recreateECOAComponentLog(ComponentLog edtComponentLog) {
		technology.ecoa.deployment._2.ComponentLog ecoaComponentLog = ECOADEPLOYMENTFACTORY.createComponentLog();

//		Set EnabledLevels
		if (edtComponentLog.getEnabledLevels() != null && !edtComponentLog.getEnabledLevels().isBlank()) {
			ecoaComponentLog.setEnabledLevels(edtComponentLog.getEnabledLevels());
		}

//		Convert InstanceName
		if (edtComponentLog.getComponentInstance() != null) {
			ecoaComponentLog.setInstanceName(edtComponentLog.getComponentInstance().getName());
		}

//		Convert ModuleLog
		EList<ModuleLog> edtModuleLogs = edtComponentLog.getModuleLogs();
		for (ModuleLog edtModuleLog : edtModuleLogs) {
			ecoaComponentLog.getModuleLog().add(recreateECOAModuleLog(edtModuleLog));
		}
		return ecoaComponentLog;
	}

	/**
	 * @param edtModuleLog
	 * @return
	 */
	private static technology.ecoa.deployment._2.ModuleLog recreateECOAModuleLog(ModuleLog edtModuleLog) {
		technology.ecoa.deployment._2.ModuleLog ecoaModuleLog = ECOADEPLOYMENTFACTORY.createModuleLog();

//		Set EnabledLevels
		if (edtModuleLog.getEnabledLevels() != null && !edtModuleLog.getEnabledLevels().isBlank()) {
			ecoaModuleLog.setEnabledLevels(edtModuleLog.getEnabledLevels());
		}

//		Convert InstanceName
		if (edtModuleLog.getModuleInstance() != null) {
			ecoaModuleLog.setInstanceName(edtModuleLog.getModuleInstance().getName());
		}

		return ecoaModuleLog;
	}

	/**
	 * @param edtProtectionDomain
	 * @return
	 */
	private static technology.ecoa.deployment._2.ProtectionDomain recreateECOAProtectionDomain(
			ProtectionDomain edtProtectionDomain) {
		technology.ecoa.deployment._2.ProtectionDomain ecoaProtectionDomain = ECOADEPLOYMENTFACTORY
				.createProtectionDomain();
		ecoaProtectionDomain.setName(edtProtectionDomain.getName());

//			Convert ExecuteOn
		ExecuteOnType executeOnType = ECOADEPLOYMENTFACTORY.createExecuteOnType();
		if (edtProtectionDomain.getExecuteOnComputingNode() != null) {
			executeOnType.setComputingNode(edtProtectionDomain.getExecuteOnComputingNode().getId());
		}
		if (edtProtectionDomain.getExecuteOnComputingPlatform() != null) {
			executeOnType.setComputingPlatform(edtProtectionDomain.getExecuteOnComputingPlatform().getId());
		}
		ecoaProtectionDomain.setExecuteOn(executeOnType);
//			Convert DeployedModuleInstance
		EList<DeployedModuleInstance> edtDeployedModuleInstances = edtProtectionDomain.getDeployedModuleInstances();
		for (DeployedModuleInstance edtDeployedModuleInstance : edtDeployedModuleInstances) {
			ecoaProtectionDomain.getDeployedModuleInstance()
					.add(recreateECOADeployedModuleInstance(edtDeployedModuleInstance));
		}

//			Convert DeployedTriggerInstance
		EList<DeployedTriggerInstance> edtDeployedTriggerInstances = edtProtectionDomain.getDeployedTriggerInstances();
		for (DeployedTriggerInstance edtDeployedTriggerInstance : edtDeployedTriggerInstances) {
			ecoaProtectionDomain.getDeployedTriggerInstance()
					.add(recreateECOADeployedTriggerInstance(edtDeployedTriggerInstance));
		}
		return ecoaProtectionDomain;
	}

	/**
	 * @param edtDeployedModuleInstance
	 * @return
	 */
	private static technology.ecoa.deployment._2.DeployedModuleInstanceType recreateECOADeployedModuleInstance(
			DeployedModuleInstance edtDeployedModuleInstance) {
		technology.ecoa.deployment._2.DeployedModuleInstanceType ecoaDeployedModuleInstance = ECOADEPLOYMENTFACTORY
				.createDeployedModuleInstanceType();

//		Set ModulePriority
		ecoaDeployedModuleInstance.setModulePriority(edtDeployedModuleInstance.getModulePriority());

//		Convert ComponentName
		if (edtDeployedModuleInstance.getComponent() != null) {
			ecoaDeployedModuleInstance.setComponentName(edtDeployedModuleInstance.getComponent().getName());
		}

//		Convert InstanceName
		if (edtDeployedModuleInstance.getModuleInstance() != null) {
			ecoaDeployedModuleInstance.setModuleInstanceName(edtDeployedModuleInstance.getModuleInstance().getName());
		}

		return ecoaDeployedModuleInstance;
	}

	/**
	 * @param ecoaDeployedTriggerInstance
	 * @return
	 */
	private static technology.ecoa.deployment._2.DeployedTriggerInstanceType recreateECOADeployedTriggerInstance(
			DeployedTriggerInstance edtDeployedTriggerInstance) {
		technology.ecoa.deployment._2.DeployedTriggerInstanceType ecoaDeployedTriggerInstance = ECOADEPLOYMENTFACTORY
				.createDeployedTriggerInstanceType();

//		Set TriggerPriority
		ecoaDeployedTriggerInstance.setTriggerPriority(edtDeployedTriggerInstance.getTriggerPriority());

//		Convert ComponentName
		if (edtDeployedTriggerInstance.getComponent() != null) {
			ecoaDeployedTriggerInstance.setComponentName(edtDeployedTriggerInstance.getComponent().getName());
		}

//		Convert InstanceName
		if (edtDeployedTriggerInstance.getTriggerInstance() != null) {
			ecoaDeployedTriggerInstance
					.setTriggerInstanceName(edtDeployedTriggerInstance.getTriggerInstance().getName());
		}

		return ecoaDeployedTriggerInstance;
	}

}
