/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import org.eclipse.emf.common.util.BasicEList;
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
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalProcessor;
import edtlogical.LogicalSystem;
import edtuid.ID;
import edtuid.IDMap;

public class Step5Validator {

	private static final String CONTAINS_ERRORS_SEE_BELOW_FOR_MORE_DETAILS = " contains errors. See below for more details.\n";

	private Step5Validator() {

	}

	protected static void verifyIDs(IDMap idMap, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (idMap.getName() == null || idMap.getName().isBlank()) {
			errorMessageForConsole
					.append("The ID Map " + idMap.getName() + " is missing the value for the name attribute.\n");

		}

		EList<ID> iDs = idMap.getIDs();
		if (!areAllIdsComplete(iDs)) {
			errorMessageForConsole.append("One or more ID of the ID Map " + idMap.getName()
					+ " are missing attributes, the following attributes must be filled : ServiceLink, Operation, Value.\n");

		}

		if (!errorMessageForConsole.isEmpty()) {
			finalConsoleMessage.append("\n\nThe IDMap " + idMap.getName() + CONTAINS_ERRORS_SEE_BELOW_FOR_MORE_DETAILS
					+ errorMessageForConsole.toString());
		}

	}

	protected static void verifyDeployment(Deployment deployment, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (deployment.getName() == null || deployment.getName().isBlank() || deployment.getFinalAssembly() == null
				|| deployment.getLogicalSystem() == null || deployment.getProtectionDomains().isEmpty()
				|| deployment.getPlatformConfigurations().isEmpty()) {
			errorMessageForConsole.append("The Deployment " + deployment.getName()
					+ " is missing attributes, there must be at least one ProtectionDomain, one PlatformConfiguration and the name, LogicalSystem and the FinalAssembly attribute must be filled.\n");
		}

		EList<ProtectionDomain> protectionDomains = deployment.getProtectionDomains();
		for (ProtectionDomain protectionDomain : protectionDomains) {
			verifyProtectionDomain(errorMessageForConsole, protectionDomain);
		}

		EList<LogPolicy> logPolicies = deployment.getLogPolicies();
		verifyAllLogPolicies(errorMessageForConsole, logPolicies);

		EList<PlatformConfiguration> platformConfigurations = deployment.getPlatformConfigurations();
		verifyAllPlatformConfigurations(platformConfigurations, errorMessageForConsole);

		EList<WireMapping> wireMappings = deployment.getWireMappings();
		if (!areAllWireMappingComplete(wireMappings)) {
			errorMessageForConsole.append(
					"One or more WireMapping are missing attributes, the following attributes must be filled : Wire, MappedOnLinkId.\n");

		}

		if (!errorMessageForConsole.isEmpty()) {
			finalConsoleMessage.append("\n\nThe Deployment " + deployment.getName()
					+ CONTAINS_ERRORS_SEE_BELOW_FOR_MORE_DETAILS + errorMessageForConsole.toString());
		}
	}

	/**
	 * @param deployment
	 * @param errorMessageForConsole
	 */
	protected static void verifyAllPlatformConfigurations(EList<PlatformConfiguration> platformConfigurations,
			StringBuilder errorMessageForConsole) {
		if (!areAllPlatformConfigurationComplete(platformConfigurations)) {
			errorMessageForConsole.append(
					"One or more PlatformConfiguration are missing the value of the ComputingPlatform attribute.\n");
		}
		EList<ComputingNodeConfiguration> allComputingNodeConfigurations = new BasicEList<>();
		EList<PlatformMessage> allPlatformMessages = new BasicEList<>();
		for (PlatformConfiguration platformConfiguration : platformConfigurations) {
			allComputingNodeConfigurations.addAll(platformConfiguration.getComputingNodeConfigurations());
			allPlatformMessages.addAll(platformConfiguration.getPlatformMessages());
		}

		if (!areAllComputingNodeConfigurationComplete(allComputingNodeConfigurations)) {
			errorMessageForConsole.append(
					"One or more ComputingNodeConfiguration are missing the value of the ComputingNode attribute.\n");

		}

		if (!areAllPlatformMessagesComplete(allPlatformMessages)) {
			errorMessageForConsole
					.append("One or more PlatformMessages are missing the value of the MappedOnLinkId attribute.\n");

		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param logPolicies
	 */
	protected static void verifyAllLogPolicies(StringBuilder errorMessageForConsole, EList<LogPolicy> logPolicies) {
		EList<ComponentLog> allComponentLogs = new BasicEList<>();
		EList<ModuleLog> allModuleLogs = new BasicEList<>();
		for (LogPolicy logPolicy : logPolicies) {
			EList<ComponentLog> componentLogs = logPolicy.getComponentLogs();
			for (ComponentLog componentLog : componentLogs) {
				allModuleLogs.addAll(componentLog.getModuleLogs());
			}
			allComponentLogs.addAll(logPolicy.getComponentLogs());
		}
		if (!areAllComponentLogComplete(allComponentLogs)) {
			errorMessageForConsole.append(
					"One or more ComponentLog are missing attributes, the following attributes must be filled : ComponentInstance, enabledLevels.\n");

		}

		if (!areAllModuleLogComplete(allModuleLogs)) {
			errorMessageForConsole.append(
					"One or more ModuleLog are missing attributes, the following attributes must be filled : ModuleInstance, enabledLevels.\n");

		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param protectionDomain
	 */
	protected static void verifyProtectionDomain(StringBuilder errorMessageForConsole,
			ProtectionDomain protectionDomain) {
		if (!protectionDomain.isComplete()) {
			errorMessageForConsole.append("The ProtectionDomain " + protectionDomain.getName()
					+ " is missing attributes, the following attributes must be filled : name, executeOnComputingNode, executeOnComputingPlatform.\n");
		}
		EList<DeployedModuleInstance> deployedModuleInstances = protectionDomain.getDeployedModuleInstances();
		if (!areAllDeployedModuleInstanceComplete(deployedModuleInstances)) {
			errorMessageForConsole.append("One or more DeployedModuleInstance of the ProtectionDomain "
					+ protectionDomain.getName()
					+ " are missing attributes, the following attributes must be filled : Component, ModuleInstance, ModulePriority.\n");

		}
		EList<DeployedTriggerInstance> deployedTriggerInstances = protectionDomain.getDeployedTriggerInstances();
		if (!areAllDeployedTriggerInstanceComplete(deployedTriggerInstances)) {
			errorMessageForConsole.append("One or more DeployedTriggerInstance of the ProtectionDomain "
					+ protectionDomain.getName()
					+ " are missing attributes, the following attributes must be filled : Component, TriggerInstance, TriggerPriority.\n");

		}
	}

	protected static void verifyLogicalSystem(LogicalSystem logicalSystem, StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (logicalSystem.getFileNamePrefix() == null || logicalSystem.getFileNamePrefix().isBlank()
				|| logicalSystem.getId() == null || logicalSystem.getId().isBlank()
				|| logicalSystem.getLogicalComputingPlatforms().isEmpty()) {
			errorMessageForConsole.append("The LogicalSystem " + logicalSystem.getFileNamePrefix()
					+ " is missing attributes, there must be at least one LogicalComputingPlatform and the following attributes must be filled : fileNamePrefix, id.\n");
		}
		EList<LogicalComputingPlatform> logicalComputingPlatforms = logicalSystem.getLogicalComputingPlatforms();
		for (LogicalComputingPlatform logicalComputingPlatform : logicalComputingPlatforms) {
			verifyLogicalComputingPlatform(errorMessageForConsole, logicalComputingPlatform);
		}
		EList<LogicalComputingPlatformLink> logicalComputingPlatformLinks = logicalSystem
				.getLogicalComputingPlatformLinks();
		for (LogicalComputingPlatformLink logicalComputingPlatformLink : logicalComputingPlatformLinks) {
			if (!logicalComputingPlatformLink.isComplete()) {
				errorMessageForConsole.append("The LogicalComputingPlatformLink " + logicalComputingPlatformLink.getId()
						+ " is missing attributes, the following attributes must be filled : id, from, to, latencyMicroSeconds, throughputMegaBytesPerSecond and either both TransportBinding attributes are filled or none.\n");

			}
		}
		if (!errorMessageForConsole.isEmpty()) {
			finalConsoleMessage.append("\n\nThe Logical System " + logicalSystem.getFileNamePrefix()
					+ CONTAINS_ERRORS_SEE_BELOW_FOR_MORE_DETAILS + errorMessageForConsole.toString());
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param logicalComputingPlatform
	 */
	protected static void verifyLogicalComputingPlatform(StringBuilder errorMessageForConsole,
			LogicalComputingPlatform logicalComputingPlatform) {
		if (logicalComputingPlatform.getId() == null || logicalComputingPlatform.getId().isBlank()) {
			errorMessageForConsole.append("The LogicalComputingPlatform " + logicalComputingPlatform.getId()
					+ " is missing attributes : the id must be filled.\n");
		}
		EList<LogicalComputingNode> logicalComputingNodes = logicalComputingPlatform.getLogicalComputingNodes();
		for (LogicalComputingNode logicalComputingNode : logicalComputingNodes) {
			verifyLogicalComputingNode(errorMessageForConsole, logicalComputingPlatform, logicalComputingNode);
		}
		EList<LogicalComputingNodeLink> logicalComputingNodeLinks = logicalComputingPlatform
				.getLogicalComputingNodeLinks();
		if (!areAllLogicalComputingNodeLinkComplete(logicalComputingNodeLinks)) {
			errorMessageForConsole.append(
					"One or more LogicalComputingNodeLink are missing attributes, the following attributes must be filled : from, to, latencyMicroSeconds, throughputMegaBytesPerSecond.\n");

		}

	}

	/**
	 * @param errorMessageForConsole
	 * @param logicalComputingPlatform
	 * @param logicalComputingNode
	 */
	protected static void verifyLogicalComputingNode(StringBuilder errorMessageForConsole,
			LogicalComputingPlatform logicalComputingPlatform, LogicalComputingNode logicalComputingNode) {
		if (!logicalComputingNode.isComplete()) {
			errorMessageForConsole.append("The LogicalComputingNode " + logicalComputingNode.getId()
					+ " of the LogicalComputingPlatform " + logicalComputingPlatform.getId()
					+ " is missing attributes, it must contain at least one LogicalProcessor and the following attributes must be filled : id, EndianesType, OsName, AvailableMemoryGigaByte, ModuleSwitchTimeMicrosecond.\n");
		}
		EList<LogicalProcessor> logicalProcessors = logicalComputingNode.getLogicalProcessors();
		if (!areAllLogicalProcessorsComplete(logicalProcessors)) {
			errorMessageForConsole.append("One or more Logical Processor of the LogicalComputingNode "
					+ logicalComputingNode.getId() + " of the LogicalComputingPlatform "
					+ logicalComputingPlatform.getId()
					+ " are missing attributes, the following attributes must be filled : StepDurationNanoseconds, type and number.\n");
		}
	}

	/**
	 * @param logicalProcessors
	 */
	protected static boolean areAllLogicalProcessorsComplete(EList<LogicalProcessor> logicalProcessors) {
		for (LogicalProcessor logicalProcessor : logicalProcessors) {
			if (!logicalProcessor.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param logicalComputingNodeLinks
	 */
	protected static boolean areAllLogicalComputingNodeLinkComplete(
			EList<LogicalComputingNodeLink> logicalComputingNodeLinks) {
		for (LogicalComputingNodeLink lcnl : logicalComputingNodeLinks) {
			if (!lcnl.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param deployedModuleInstances
	 */
	protected static boolean areAllDeployedModuleInstanceComplete(
			EList<DeployedModuleInstance> deployedModuleInstances) {
		for (DeployedModuleInstance deployedModuleInstance : deployedModuleInstances) {
			if (!deployedModuleInstance.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param deployedTriggerInstances
	 */
	protected static boolean areAllDeployedTriggerInstanceComplete(
			EList<DeployedTriggerInstance> deployedTriggerInstances) {
		for (DeployedTriggerInstance deployedTriggerInstance : deployedTriggerInstances) {
			if (!deployedTriggerInstance.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param componentLogs
	 */
	protected static boolean areAllComponentLogComplete(EList<ComponentLog> componentLogs) {
		for (ComponentLog componentLog : componentLogs) {
			if (!componentLog.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param moduleLogs
	 */
	protected static boolean areAllModuleLogComplete(EList<ModuleLog> moduleLogs) {
		for (ModuleLog moduleLog : moduleLogs) {
			if (!moduleLog.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param platformConfigurations
	 */
	protected static boolean areAllPlatformConfigurationComplete(EList<PlatformConfiguration> platformConfigurations) {
		for (PlatformConfiguration platformConfiguration : platformConfigurations) {
			if (platformConfiguration.getComputingPlatform() == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param computingNodeConfigurations
	 */
	protected static boolean areAllComputingNodeConfigurationComplete(
			EList<ComputingNodeConfiguration> computingNodeConfigurations) {
		for (ComputingNodeConfiguration computingNodeConfiguration : computingNodeConfigurations) {
			if (computingNodeConfiguration.getComputingNode() == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param platformMessages
	 */
	protected static boolean areAllPlatformMessagesComplete(EList<PlatformMessage> platformMessages) {
		for (PlatformMessage platformMessage : platformMessages) {
			if (platformMessage.getMappedOnLinkId() == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param wireMappings
	 */
	protected static boolean areAllWireMappingComplete(EList<WireMapping> wireMappings) {
		for (WireMapping wireMapping : wireMappings) {
			if (wireMapping.getMappedOnLinkId() == null || wireMapping.getWire() == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param ids
	 */
	protected static boolean areAllIdsComplete(EList<ID> ids) {
		for (ID id : ids) {
			if (id.getServiceLink() == null || id.getOperation() == null) {
				return false;
			}
		}
		return true;
	}

}
