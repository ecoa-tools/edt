/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtdeployment.EdtdeploymentFactory;
import edtimplementation.ComponentImplementation;
import edtimplementation.Instance;
import edtimplementation.ModuleInstance;
import edtimplementation.Trigger;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalSystem;
import edtproject.Component;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.FinalAssembly;
import edtproject.ServiceLink;
import technology.ecoa.deployment._2.ComponentLog;
import technology.ecoa.deployment._2.ComputingNodeConfiguration;
import technology.ecoa.deployment._2.DeployedModuleInstanceType;
import technology.ecoa.deployment._2.DeployedTriggerInstanceType;
import technology.ecoa.deployment._2.Deployment;
import technology.ecoa.deployment._2.ExecuteOnType;
import technology.ecoa.deployment._2.LogPolicy;
import technology.ecoa.deployment._2.ModuleLog;
import technology.ecoa.deployment._2.PlatformConfiguration;
import technology.ecoa.deployment._2.PlatformMessages;
import technology.ecoa.deployment._2.ProtectionDomain;
import technology.ecoa.deployment._2.WireMapping;

/**
 * Convert imported ECOA Deployment objects to EDT objects
 *
 */
public class DeploymentImportConverter {
	private static final String THERE_IS_NO_COMPONENT_IMPLEMENTATION_ASSOCIATED_TO_THE_COMPONENT = "There is no ComponentImplementation associated to the Component";
	private static final String IN_THE_FINAL_ASSEMBLY = "  in the FinalAssembly";
	private static final String DOES_NOT_CORRESPOND_TO_ANY_COMPONENT_IN_THE_ASSEMBLY = " does not correspond to any Component in the Assembly";
	private static final String THE_NAME = "The name ";
	private static final EdtdeploymentFactory EDTDEPLOYMENTFACTORY = EdtdeploymentFactory.eINSTANCE;

	private DeploymentImportConverter() {
	}

	/**
	 * Create a EDT model Deployment from a Ecoa model Deployment
	 * 
	 * @param ecoaDeployment   : ECOA LogicalSystem object
	 * @param fileName         : name of the file
	 * @param finalAssembly    : finalAssembly
	 * @param edtLogicalSystem : logicalSystem
	 * @return edtDeployment
	 * @throws FailedImportException if referenced element not found
	 */
	public static edtdeployment.Deployment createEDTDeployment(Deployment ecoaDeployment, String fileName,
			FinalAssembly finalAssembly, LogicalSystem edtLogicalSystem) throws FailedImportException {

// 		Create empty EDT Deployment
		var edtDeployment = EDTDEPLOYMENTFACTORY.createDeployment();
		edtDeployment.setName(EDTProjectImportConverter.getObjectName(fileName, ".deployment.xml"));

//		Set finalAssembly
		String ecoaFinalAssembly = ecoaDeployment.getFinalAssembly();
		if (finalAssembly != null && Objects.equals(finalAssembly.getName(), ecoaFinalAssembly)
				&& finalAssembly.getFinalAssembly() != null) {
			edtDeployment.setFinalAssembly(finalAssembly);
		} else if (finalAssembly != null && finalAssembly.getFinalAssembly() == null) {
			throw new FailedImportException("Problem with FinalAssembly, it has no Components");
		} else {
			throw new FailedImportException(
					THE_NAME + ecoaFinalAssembly + " does not correspond to the name of the FinalAssembly");
		}

//		Set LogicalSystem
		String ecoaLogicalSystem = ecoaDeployment.getLogicalSystem();
		if (edtLogicalSystem != null && Objects.equals(edtLogicalSystem.getFileNamePrefix(), ecoaLogicalSystem)) {
			edtDeployment.setLogicalSystem(edtLogicalSystem);
		} else {
			throw new FailedImportException(
					THE_NAME + ecoaLogicalSystem + " does not correspond to the name of the LogicalSystem");
		}

//		Convert Protecting Domain
		EList<ProtectionDomain> ecoaProtectionDomains = ecoaDeployment.getProtectionDomain();
		for (ProtectionDomain ecoaProtectionDomain : ecoaProtectionDomains) {
			edtdeployment.ProtectionDomain edtProtectionDomain = createEDTProtectionDomain(finalAssembly,
					edtLogicalSystem, ecoaProtectionDomain);
			edtDeployment.getProtectionDomains().add(edtProtectionDomain);
		}

//		Convert LogPolicy
		EList<LogPolicy> ecoaLogPolicies = ecoaDeployment.getLogPolicy();
		for (LogPolicy ecoaLogPolicy : ecoaLogPolicies) {
			edtdeployment.LogPolicy edtLogPolicy = createEDTLogPolicy(finalAssembly, ecoaLogPolicy);
			edtDeployment.getLogPolicies().add(edtLogPolicy);
		}

//		Convert PlatformConfiguration
		EList<PlatformConfiguration> ecoaPlatformConfigurations = ecoaDeployment.getPlatformConfiguration();
		for (PlatformConfiguration ecoaPlatformConfiguration : ecoaPlatformConfigurations) {
			edtdeployment.PlatformConfiguration edtPlatformConfiguration = createEDTPlatformConfiguration(
					edtLogicalSystem, ecoaPlatformConfiguration);
			edtDeployment.getPlatformConfigurations().add(edtPlatformConfiguration);
		}

//		Convert WireMapping
		EList<WireMapping> ecoaWireMappings = ecoaDeployment.getWireMapping();
		for (WireMapping ecoaWireMapping : ecoaWireMappings) {
			edtdeployment.WireMapping edtWireMapping = createEDTWireMapping(finalAssembly, ecoaWireMapping,
					edtLogicalSystem);
			edtDeployment.getWireMappings().add(edtWireMapping);
		}

		return edtDeployment;
	}

	/**
	 * @param finalAssembly
	 * @param ecoaWireMapping
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.WireMapping createEDTWireMapping(FinalAssembly finalAssembly,
			WireMapping ecoaWireMapping, edtlogical.LogicalSystem edtLogicalSystem) throws FailedImportException {
		edtdeployment.WireMapping edtWireMapping = EDTDEPLOYMENTFACTORY.createWireMapping();
		LogicalComputingPlatformLink edtLogicalPlatformLink = edtLogicalSystem
				.findLogicalComputingPlatformLinkById(ecoaWireMapping.getMappedOnLinkId());
		if (edtLogicalPlatformLink != null) {
			edtWireMapping.setMappedOnLinkId(edtLogicalPlatformLink);
		} else {
			throw new FailedImportException("There is no LogicalComputingPlatformLink with the name :"
					+ ecoaWireMapping.getMappedOnLinkId() + "in the LogicalSystem. ");

		}

//		Find source and target of wire
		ComponentReference componentReferenceFromWire = finalAssembly.getFinalAssembly()
				.findComponentReferenceFromWire(ecoaWireMapping.getSource());
		ComponentService componentServiceFromWire = finalAssembly.getFinalAssembly()
				.findComponentServiceFromWire(ecoaWireMapping.getTarget());

//		Verify Reference and Service are not null and the Wire exists
		if (componentReferenceFromWire != null && componentServiceFromWire != null) {
			ServiceLink findServiceLink = finalAssembly.getFinalAssembly().findServiceLink(componentReferenceFromWire,
					componentServiceFromWire);
			if (findServiceLink == null) {
				throw new FailedImportException("There is no Wire between :" + ecoaWireMapping.getTarget() + " and "
						+ ecoaWireMapping.getTarget() + IN_THE_FINAL_ASSEMBLY);
			}
			edtWireMapping.setWire(findServiceLink);
		} else if (componentReferenceFromWire == null) {
			throw new FailedImportException("There is no ComponentReference with the name :"
					+ ecoaWireMapping.getSource() + IN_THE_FINAL_ASSEMBLY);

		} else {
			throw new FailedImportException("There is no ComponentService with the name :" + ecoaWireMapping.getTarget()
					+ IN_THE_FINAL_ASSEMBLY);
		}
		return edtWireMapping;
	}

	/**
	 * @param edtLogicalSystem
	 * @param ecoaPlatformConfiguration
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.PlatformConfiguration createEDTPlatformConfiguration(LogicalSystem edtLogicalSystem,
			PlatformConfiguration ecoaPlatformConfiguration) throws FailedImportException {
		edtdeployment.PlatformConfiguration edtPlatformConfiguration = EDTDEPLOYMENTFACTORY
				.createPlatformConfiguration();

		if (ecoaPlatformConfiguration.isSetFaultHandlerNotificationMaxNumber()) {
			edtPlatformConfiguration.setFaultHandlerNotificationMaxNumber(
					ecoaPlatformConfiguration.getFaultHandlerNotificationMaxNumber());
		}
		edtPlatformConfiguration.setEUIDs(ecoaPlatformConfiguration.getEUIDs());

//			Find LogicalComputingPlatform
		LogicalComputingPlatform edtLogicalComputingPlatform = edtLogicalSystem
				.findLogicalComputingPlatformById(ecoaPlatformConfiguration.getComputingPlatform());
		if (edtLogicalComputingPlatform != null) {
			edtPlatformConfiguration.setComputingPlatform(edtLogicalComputingPlatform);
//				Convert ComputingNodeConfiguration
			EList<ComputingNodeConfiguration> ecoaComputingNodeConfigurations = ecoaPlatformConfiguration
					.getComputingNodeConfiguration();
			for (ComputingNodeConfiguration ecoaComputingNodeConfiguration : ecoaComputingNodeConfigurations) {
				edtdeployment.ComputingNodeConfiguration edtComputingNodeConfiguration = createEDTComputingNodeConfiguration(
						edtLogicalComputingPlatform, ecoaComputingNodeConfiguration);
				edtPlatformConfiguration.getComputingNodeConfigurations().add(edtComputingNodeConfiguration);
			}

//			No Platform found
		} else {
			throw new FailedImportException("There is no LogicalComputingPlatform with the name :"
					+ ecoaPlatformConfiguration.getComputingPlatform() + "in the LogicalSystem");

		}

//			Convert PlatformMessages
		EList<PlatformMessages> ecoaPlatformMessages = ecoaPlatformConfiguration.getPlatformMessages();
		for (PlatformMessages ecoaPlatformMessage : ecoaPlatformMessages) {
			edtdeployment.PlatformMessage edtPlatformMessage = EDTDEPLOYMENTFACTORY.createPlatformMessage();
			LogicalComputingPlatformLink edtLogicalPlatformLink = edtLogicalSystem
					.findLogicalComputingPlatformLinkById(ecoaPlatformMessage.getMappedOnLinkId());
			if (edtLogicalPlatformLink != null) {
				edtPlatformMessage.setMappedOnLinkId(edtLogicalPlatformLink);
			} else {
				throw new FailedImportException("There is no LogicalComputingPlatformLink with the name :"
						+ ecoaPlatformMessage.getMappedOnLinkId() + "in the LogicalSystem. ");

			}
			edtPlatformConfiguration.getPlatformMessages().add(edtPlatformMessage);
		}
		return edtPlatformConfiguration;
	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @param ecoaComputingNodeConfiguration
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.ComputingNodeConfiguration createEDTComputingNodeConfiguration(
			LogicalComputingPlatform edtLogicalComputingPlatform,
			ComputingNodeConfiguration ecoaComputingNodeConfiguration) throws FailedImportException {
		edtdeployment.ComputingNodeConfiguration edtComputingNodeConfiguration = EDTDEPLOYMENTFACTORY
				.createComputingNodeConfiguration();

		edtComputingNodeConfiguration
				.setSchedulingInformation(ecoaComputingNodeConfiguration.getSchedulingInformation());

		LogicalComputingNode edtLogicalComputingNode = edtLogicalComputingPlatform
				.findLogicalComputingNodeById(ecoaComputingNodeConfiguration.getComputingNode());
		if (edtLogicalComputingNode != null) {
			edtComputingNodeConfiguration.setComputingNode(edtLogicalComputingNode);
		} else {
			throw new FailedImportException("There is no LogicalComputingNode with the name :"
					+ edtComputingNodeConfiguration.getComputingNode() + "in the LogicalComputingPlatform "
					+ edtLogicalComputingPlatform.getId());

		}
		return edtComputingNodeConfiguration;
	}

	/**
	 * @param finalAssembly
	 * @param ecoaLogPolicy
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.LogPolicy createEDTLogPolicy(FinalAssembly finalAssembly, LogPolicy ecoaLogPolicy)
			throws FailedImportException {
		edtdeployment.LogPolicy edtLogPolicy = EDTDEPLOYMENTFACTORY.createLogPolicy();

//		Convert ComponentLogs
		EList<ComponentLog> ecoaComponentLogs = ecoaLogPolicy.getComponentLog();
		for (ComponentLog ecoaComponentLog : ecoaComponentLogs) {
			edtdeployment.ComponentLog edtComponentLog = createEDTComponentLog(finalAssembly, ecoaComponentLog);
			edtLogPolicy.getComponentLogs().add(edtComponentLog);
		}
		return edtLogPolicy;
	}

	/**
	 * @param finalAssembly
	 * @param ecoaComponentLog
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.ComponentLog createEDTComponentLog(FinalAssembly finalAssembly,
			ComponentLog ecoaComponentLog) throws FailedImportException {
		edtdeployment.ComponentLog edtComponentLog = EDTDEPLOYMENTFACTORY.createComponentLog();

//		Set EnabledLevels
		edtComponentLog.setEnabledLevels(ecoaComponentLog.getEnabledLevels());

//		FindComponent
		Component edtComponent = finalAssembly.getFinalAssembly()
				.findComponentByName(ecoaComponentLog.getInstanceName());
		if (edtComponent != null) {
//			Verify presence of ComponentImplementation and set Component
			ComponentImplementation edtComponentImplementation = edtComponent.getComponentImplementation();
			if (edtComponentImplementation != null) {
				edtComponentLog.setComponentInstance(edtComponent);
				edtComponentLog.setComponentImplementation(edtComponentImplementation);

//				Convert ModuleLog
				EList<ModuleLog> ecoaModuleLogs = ecoaComponentLog.getModuleLog();
				for (ModuleLog ecoaModuleLog : ecoaModuleLogs) {
					edtdeployment.ModuleLog edtModuleLog = createEDTModuleLog(edtComponentImplementation,
							ecoaModuleLog);
					edtComponentLog.getModuleLogs().add(edtModuleLog);
				}
//			No ComponentImplementation
			} else {
				throw new FailedImportException(THERE_IS_NO_COMPONENT_IMPLEMENTATION_ASSOCIATED_TO_THE_COMPONENT
						+ ecoaComponentLog.getInstanceName() + IN_THE_FINAL_ASSEMBLY);
			}
//		Component not found by name
		} else {
			throw new FailedImportException(THE_NAME + ecoaComponentLog.getInstanceName()
					+ DOES_NOT_CORRESPOND_TO_ANY_COMPONENT_IN_THE_ASSEMBLY);
		}
		return edtComponentLog;
	}

	/**
	 * @param edtComponentImplementation
	 * @param ecoaModuleLog
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.ModuleLog createEDTModuleLog(ComponentImplementation edtComponentImplementation,
			ModuleLog ecoaModuleLog) throws FailedImportException {
		edtdeployment.ModuleLog edtModuleLog = EDTDEPLOYMENTFACTORY.createModuleLog();

//		Set EnabledLevels
		edtModuleLog.setEnabledLevels(ecoaModuleLog.getEnabledLevels());

//		FindModuleInstance and set it
		Instance instance = edtComponentImplementation.findInstanceByName(ecoaModuleLog.getInstanceName());
		if (instance instanceof ModuleInstance edtModuleInstance) {
			edtModuleLog.setModuleInstance(edtModuleInstance);

//			No ModuleInstance found
		} else {
			throw new FailedImportException(THE_NAME + ecoaModuleLog.getInstanceName()
					+ " does not correspond to any ModuleInstance in the ComponentImplementation "
					+ edtComponentImplementation.getName());
		}
		return edtModuleLog;
	}

	/**
	 * @param finalAssembly
	 * @param logicalSystem
	 * @param ecoaProtectionDomain
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.ProtectionDomain createEDTProtectionDomain(FinalAssembly finalAssembly,
			LogicalSystem logicalSystem, ProtectionDomain ecoaProtectionDomain) throws FailedImportException {
		edtdeployment.ProtectionDomain edtProtectionDomain = EDTDEPLOYMENTFACTORY.createProtectionDomain();
		edtProtectionDomain.setName(ecoaProtectionDomain.getName());

//			Convert ExecuteOn
		convertExecuteOnType(logicalSystem, ecoaProtectionDomain, edtProtectionDomain);

//			Convert DeployedModuleInstance
		EList<DeployedModuleInstanceType> ecoaDeployedModuleInstances = ecoaProtectionDomain
				.getDeployedModuleInstance();
		for (DeployedModuleInstanceType ecoaDeployedModuleInstance : ecoaDeployedModuleInstances) {
			edtdeployment.DeployedModuleInstance edtDeployedModuleInstance = createEDTDeployedModuleInstance(
					finalAssembly, ecoaDeployedModuleInstance);
			edtProtectionDomain.getDeployedModuleInstances().add(edtDeployedModuleInstance);
		}

//			Convert DeployedTriggerInstance
		EList<DeployedTriggerInstanceType> ecoaDeployedTriggerInstances = ecoaProtectionDomain
				.getDeployedTriggerInstance();
		for (DeployedTriggerInstanceType ecoaDeployedTriggerInstance : ecoaDeployedTriggerInstances) {
			edtdeployment.DeployedTriggerInstance edtDeployedTriggerInstance = createEDTDeployedTriggerInstance(
					finalAssembly, ecoaDeployedTriggerInstance);
			edtProtectionDomain.getDeployedTriggerInstances().add(edtDeployedTriggerInstance);

		}
		return edtProtectionDomain;
	}

	/**
	 * @param finalAssembly
	 * @param ecoaDeployedModuleInstance
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.DeployedModuleInstance createEDTDeployedModuleInstance(FinalAssembly finalAssembly,
			DeployedModuleInstanceType ecoaDeployedModuleInstance) throws FailedImportException {
		edtdeployment.DeployedModuleInstance edtDeployedModuleInstance = EDTDEPLOYMENTFACTORY
				.createDeployedModuleInstance();

//		Set ModulePriority
		edtDeployedModuleInstance.setModulePriority(ecoaDeployedModuleInstance.getModulePriority());

//		Find instance
		Component edtComponent = finalAssembly.getFinalAssembly()
				.findComponentByName(ecoaDeployedModuleInstance.getComponentName());

//		Component not found by name
		if (edtComponent == null) {
			new FailedImportException(THE_NAME + ecoaDeployedModuleInstance.getComponentName()
					+ DOES_NOT_CORRESPOND_TO_ANY_COMPONENT_IN_THE_ASSEMBLY);

//		No ComponentImplementation associated
		} else if (edtComponent.getComponentImplementation() == null) {
			throw new FailedImportException(THERE_IS_NO_COMPONENT_IMPLEMENTATION_ASSOCIATED_TO_THE_COMPONENT
					+ ecoaDeployedModuleInstance.getComponentName() + IN_THE_FINAL_ASSEMBLY);

//		Set Component and find ModuleInstance
		} else {
			edtDeployedModuleInstance.setComponent(edtComponent);

			ComponentImplementation edtComponentImplementation = edtComponent.getComponentImplementation();
			edtDeployedModuleInstance.setComponentImplementation(edtComponentImplementation);

//			Find ModuleInstance and set it
			Instance edtInstance = edtComponentImplementation
					.findInstanceByName(ecoaDeployedModuleInstance.getModuleInstanceName());
			if (edtInstance instanceof ModuleInstance edtModuleInstance) {
				edtDeployedModuleInstance.setModuleInstance(edtModuleInstance);
			} else {
				throw new FailedImportException(THE_NAME + ecoaDeployedModuleInstance.getModuleInstanceName()
						+ " does not correspond to any ModuleInstance in the ComponentImplementation "
						+ edtComponentImplementation.getName());
			}
		}
		return edtDeployedModuleInstance;
	}

	/**
	 * @param finalAssembly
	 * @param ecoaDeployedTriggerInstance
	 * @return
	 * @throws FailedImportException
	 */
	private static edtdeployment.DeployedTriggerInstance createEDTDeployedTriggerInstance(FinalAssembly finalAssembly,
			DeployedTriggerInstanceType ecoaDeployedTriggerInstance) throws FailedImportException {
		edtdeployment.DeployedTriggerInstance edtDeployedTriggerInstance = EDTDEPLOYMENTFACTORY
				.createDeployedTriggerInstance();

//		Set TriggerPriority
		edtDeployedTriggerInstance.setTriggerPriority(ecoaDeployedTriggerInstance.getTriggerPriority());

//		Find Instance
		Component edtComponent = finalAssembly.getFinalAssembly()
				.findComponentByName(ecoaDeployedTriggerInstance.getComponentName());

//		Component not found by name
		if (edtComponent == null) {
			new FailedImportException(THE_NAME + ecoaDeployedTriggerInstance.getComponentName()
					+ DOES_NOT_CORRESPOND_TO_ANY_COMPONENT_IN_THE_ASSEMBLY);

//		No ComponentImplementation associated
		} else if (edtComponent.getComponentImplementation() == null) {
			throw new FailedImportException(THERE_IS_NO_COMPONENT_IMPLEMENTATION_ASSOCIATED_TO_THE_COMPONENT
					+ ecoaDeployedTriggerInstance.getComponentName() + IN_THE_FINAL_ASSEMBLY);

//		Set Component and find TriggerInstance
		} else {
			edtDeployedTriggerInstance.setComponent(edtComponent);

			ComponentImplementation edtComponentImplementation = edtComponent.getComponentImplementation();
			edtDeployedTriggerInstance.setComponentImplementation(edtComponentImplementation);

//			Find TriggerInstance and set it
			Instance edtInstance = edtComponentImplementation
					.findInstanceByName(ecoaDeployedTriggerInstance.getTriggerInstanceName());
			if (edtInstance instanceof Trigger trigger) {
				edtDeployedTriggerInstance.setTriggerInstance(trigger);
			} else {
				throw new FailedImportException(THE_NAME + ecoaDeployedTriggerInstance.getTriggerInstanceName()
						+ " does not correspond to any Trigger or DynamicTriggerInstance in the ComponentImplementation "
						+ edtComponentImplementation.getName());
			}
		}

		return edtDeployedTriggerInstance;
	}

	/**
	 * @param logicalSystem
	 * @param ecoaProtectionDomain
	 * @param edtProtectionDomain
	 * @throws FailedImportException
	 */
	private static void convertExecuteOnType(LogicalSystem logicalSystem, ProtectionDomain ecoaProtectionDomain,
			edtdeployment.ProtectionDomain edtProtectionDomain) throws FailedImportException {
		ExecuteOnType ecoaExecuteOn = ecoaProtectionDomain.getExecuteOn();

		// Set executeOn : Platform
		String computingPlatform = ecoaExecuteOn.getComputingPlatform();
		LogicalComputingPlatform logicalComputingPlatformById = logicalSystem
				.findLogicalComputingPlatformById(computingPlatform);
		if (logicalComputingPlatformById != null) {
			edtProtectionDomain.setExecuteOnComputingPlatform(logicalComputingPlatformById);
		} else {
			throw new FailedImportException(
					"No LogicalComputingPlatform was found with the name :" + computingPlatform);
		}

		// Set executeOn : Node
		String computingNode = ecoaExecuteOn.getComputingNode();
		LogicalComputingNode logicalComputingNodeById = logicalComputingPlatformById
				.findLogicalComputingNodeById(computingNode);
		if (logicalComputingNodeById != null) {
			edtProtectionDomain.setExecuteOnComputingNode(logicalComputingNodeById);
		} else {
			throw new FailedImportException("There is no LogicalComputingNode with the name :" + computingNode
					+ "in the LogicalComputingPlatform " + logicalComputingPlatformById.getId());
		}
	}

}
