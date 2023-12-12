/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.open.oasis.docs.ns.opencsa.sca.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;
import org.open.oasis.docs.ns.opencsa.sca.sca.util.scaResourceFactoryImpl;

import com.dassault.edt.converters.AssemblyImportConverter;
import com.dassault.edt.converters.ComponentDefinitionImportConverter;
import com.dassault.edt.converters.ComponentImplementationImportConverter;
import com.dassault.edt.converters.DeploymentImportConverter;
import com.dassault.edt.converters.LogicalSystemImportConverter;
import com.dassault.edt.converters.ServiceDefinitionImportConverter;
import com.dassault.edt.log.EDTLog;

import edtimplementation.ComponentImplementation;
import edtinterface.ServiceDefinition;
import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.Composite;
import edtproject.EDTProjectFactory;
import edtproject.FinalAssembly;
import technology.ecoa.deployment._2.Deployment;
import technology.ecoa.deployment._2.depPackage;
import technology.ecoa.deployment._2.util.depResourceFactoryImpl;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.TriggerInstance;
import technology.ecoa.implementation._2.impPackage;
import technology.ecoa.implementation._2.util.impResourceFactoryImpl;
import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.LogicalSystem;
import technology.ecoa.logicalsystem._2.TransportBindingType;
import technology.ecoa.logicalsystem._2.logPackage;
import technology.ecoa.logicalsystem._2.util.logResourceFactoryImpl;

/**
 * Class to import XML and convert them to EDT for graphical view
 * 
 */
public class XMLImporterExtracter {
	private static final String IS_NOT_USABLE_IN_ECOA_DESIGN_TOOL_AND_IT_WILL_NOT_BE_IMPORTED_OR_EXPORTED = " can not be imported or exported.\n";
	private static final String WARNING_DOCUMENTATION_ATTRIBUTE_PRESENT_IN = "Warning : Documentation attribute present in ";
	private static final String IS_IMPORTING = " is importing...";
	private static final String COULD_NOT_BE_READ = " could not be read";
	private edtproject.Steps steps;

	/**
	 * Constructor to have Steps available
	 * 
	 * @param steps : EObject containing all elements that can be imported
	 */
	public XMLImporterExtracter(edtproject.Steps steps) {
		this.steps = steps;
	}

	/**
	 * Get all contents from XX.interface.xml
	 * 
	 * @param file : ServiceDefinition file
	 * @return ServiceDefinition
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	public ServiceDefinition extractServiceDefinition(File file) throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("ServiceDefinition " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		var serviceObject = XmlImporter.extractContent(file,
				new technology.ecoa.interface_._2.util.interResourceFactoryImpl(),
				technology.ecoa.interface_._2.interPackage.eNS_URI,
				technology.ecoa.interface_._2.interPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (serviceObject instanceof technology.ecoa.interface_._2.DocumentRoot documentRoot) {
			var serviceDef = documentRoot.getServiceDefinition();
			return ServiceDefinitionImportConverter.createEDTServiceDefinition(serviceDef, file.getName(),
					steps.getStep0());

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Extract content from XX.componentType
	 * 
	 * @param file                 : ComponentDefinition file
	 * @param missingElementsToLog : log Elements (here Documentation and Property
	 *                             any attributes) that are not usable in EDT
	 * @return ComponentDefinition
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	public ComponentDefinition extractComponentDefinition(File file, StringBuilder missingElementsToLog)
			throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("ComponentDefinition " + file.getName() + " is being read...");

		// Read content and convert to ecoa model Library object
		var componentTypeObject = XmlImporter.extractContent(file, new scaResourceFactoryImpl(), scaPackage.eNS_URI,
				scaPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (componentTypeObject instanceof org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot documentRoot) {
			var componentType = documentRoot.getComponentType();
			if (componentType.getDocumentation() != null && !componentType.getDocumentation().isEmpty()) {
				missingElementsToLog.append(WARNING_DOCUMENTATION_ATTRIBUTE_PRESENT_IN + file.getName()
						+ IS_NOT_USABLE_IN_ECOA_DESIGN_TOOL_AND_IT_WILL_NOT_BE_IMPORTED_OR_EXPORTED);
			}
			ArrayList<edtqos.ServiceInstanceQos> edtServiceQosList = new ArrayList<>();

			// First read ComponentDefinition file to create QoS to associate
			// them after
			/*
			 * The QoS file are present in the ComponentDefinition subdirectory
			 */
			EList<ComponentTypeReference> refs = componentType.getReference();
			for (ComponentTypeReference ref : refs) {
				if (ref.getInterface() != null && ref.getInterface().getQos() != null) {
					// Get Service QoS name to be created and ServiceDefinition name
					// to associate and get Ecoa model ServiceInstanceQos
					String interfaceQOSName = ref.getInterface().getQos();
					String interfaceServiceDefinitionName = ref.getInterface().getSyntax();
					ServiceDefinition edtServiceDefinition = steps.getStep1()
							.findServiceDefinitionByName(interfaceServiceDefinitionName);

					// If ServiceDefinition not found throws error
					if (edtServiceDefinition == null) {
						throw new FailedImportException(
								"No ServiceDefinition was found with the name " + interfaceServiceDefinitionName);
					}
					// Read XML and convert it to EDT QoS
					edtqos.ServiceInstanceQos serviceInstanceQOS = XMLImporterSecondaryExtracter
							.extractServiceInstanceQOS(
									new File(file.getParentFile(), interfaceQOSName + ImportUtils.QOS_EXT),
									interfaceQOSName, edtServiceDefinition);
					edtServiceQosList.add(serviceInstanceQOS);
				}

			}

			EList<ServiceType> servs = componentType.getService();
			for (ServiceType serv : servs) {
				if (serv.getInterface() != null && serv.getInterface().getQos() != null) {
					// Get Service QoS name to be created and ServiceDefinition name
					// to associate and get Ecoa model ServiceInstanceQos
					String interfaceQOSName = serv.getInterface().getQos();
					String interfaceServiceDefinitionName = serv.getInterface().getSyntax();

					ServiceDefinition edtServiceDefinition = steps.getStep1()
							.findServiceDefinitionByName(interfaceServiceDefinitionName);

					// If ServiceDefinition not found throws error
					if (edtServiceDefinition == null) {
						throw new FailedImportException(
								"No ServiceDefinition was found with the name " + interfaceServiceDefinitionName);
					}

					// Read XML and convert it to EDT QoS
					edtqos.ServiceInstanceQos serviceInstanceQOS = XMLImporterSecondaryExtracter
							.extractServiceInstanceQOS(
									new File(file.getParentFile(), interfaceQOSName + ImportUtils.QOS_EXT),
									interfaceQOSName, edtServiceDefinition);
					edtServiceQosList.add(serviceInstanceQOS);
				}
			}

			EDTLog.toConsole("ComponentDefinition " + file.getName() + IS_IMPORTING);
			// Convert ecoa ComponentDefinition to Edt ComponentDefinition
			var edtComponentType = ComponentDefinitionImportConverter.createEDTComponentDefinition(componentType,
					file.getName(), steps.getStep0(), edtServiceQosList, steps.getStep1(), missingElementsToLog);
			return edtComponentType;

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.composite.xml
	 * 
	 * WARNING only one main composite in ecoa project will be possible at the
	 * moment
	 * 
	 * @param file                 : Composite file to be read
	 * @param missingElementsToLog : log Elements (here Documentation and Property
	 *                             any attributes) that are not usable in EDT
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	void extractInitialAssembly(File file, StringBuilder missingElementsToLog)
			throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("InitialAssembly " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject initAssemblyContent = XmlImporter.extractContent(file, new scaResourceFactoryImpl(), scaPackage.eNS_URI,
				scaPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (initAssemblyContent instanceof org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot documentRoot) {
			var composite = documentRoot.getComposite();

			if (composite.getDocumentation() != null && !composite.getDocumentation().isEmpty()) {
				missingElementsToLog.append(WARNING_DOCUMENTATION_ATTRIBUTE_PRESENT_IN + file.getName()
						+ IS_NOT_USABLE_IN_ECOA_DESIGN_TOOL_AND_IT_WILL_NOT_BE_IMPORTED_OR_EXPORTED);
			}

			EList<Component> components = composite.getComponent();
			for (Component component : components) {
				if (component.getImplementationGroup() != null) {
					for (var i = 0; i < component.getImplementationGroup().size(); i++) {
						Object value2 = component.getImplementationGroup().get(i).getValue();
						if (value2 instanceof SCAImplementation instance) {
							throw new FailedImportException("The assembly file " + file.getName()
									+ " corresponds to a recursive composite. Only Flat composite can be used in EDT.");
						}
					}

				}
			}

			Composite edtComposite = AssemblyImportConverter.createEDTComposite(composite, steps.getStep2(),
					steps.getStep0(), steps.getStep1(), missingElementsToLog);
			steps.getStep3().setInitialAssembly(edtComposite);
			FinalAssembly finalAssembly = EDTProjectFactory.eINSTANCE.createFinalAssembly();
			finalAssembly.setName(composite.getName());
			finalAssembly.setFinalAssembly(edtComposite);
			steps.getStep5().setFinalAssembly(finalAssembly);

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.impl.xml
	 * 
	 * @param file                 : ComponentImplementation file
	 * @param missingElementsToLog : error message for elements that are not
	 *                             imported/exported/not usable
	 * @param popupToDisplay       : error message for elements that are not
	 *                             imported/exported
	 * @return ComponentImplementation
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	public ComponentImplementation extractComponentImplementation(File file, StringBuilder missingElementsToLog,
			StringBuilder popupToDisplay) throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("ComponentImplementation " + file.getName() + " is being read...");

		// Read content and convert to ecoa model Library object
		var componentImplementationObject = XmlImporter.extractContent(file, new impResourceFactoryImpl(),
				impPackage.eNS_URI, impPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (componentImplementationObject instanceof technology.ecoa.implementation._2.DocumentRoot documentRoot) {
			var ecoaComponentImplementation = documentRoot.getComponentImplementation();

			// Find ComponentDefinition by name
			String componentDefinitionName = ecoaComponentImplementation.getComponentDefinition();
			ComponentDefinition edtComponentDefinition = steps.getStep2()
					.findComponentDefinitionByName(componentDefinitionName);

			// Throws error if no ComponentDefinition found
			if (edtComponentDefinition == null) {
				throw new FailedImportException(
						"No ComponentDefinition was found with the name : " + componentDefinitionName);
			}

			ArrayList<edtqos.ServiceInstanceQos> edtServiceQosList = new ArrayList<>();
			ArrayList<edtproject.ComponentDefinitionReference> edtComponentDefinitionReferences = new ArrayList<>();
			ArrayList<edtproject.ComponentDefinitionService> edtComponentDefinitionServices = new ArrayList<>();
			ArrayList<temp.ModuleBehaviour> edtModuleBehaviours = new ArrayList<>();

			// First read ComponentDefinition file to create QoS to associate
			// them after
			/*
			 * The QoS file are present in the ComponentDefinition subdirectory
			 */
			EList<ServiceQoS> refs = ecoaComponentImplementation.getReference();
			for (ServiceQoS ref : refs) {
				// Get Service QoS name to be created and
				// ComponentDefinitionReference name to associate and get Ecoa
				// model ServiceInstanceQos
				String refQOSName = ref.getNewQoS();
				String componentDefinitionReferenceName = ref.getName();
				if (componentDefinitionReferenceName != null) {
					ComponentDefinitionReference edtComponentDefinitionReference = edtComponentDefinition
							.findComponentDefinitionReferenceByName(componentDefinitionReferenceName);
					// If ComponentDefinitionReference not found throws error
					if (edtComponentDefinitionReference == null) {
						throw new FailedImportException(
								"No Reference exists in the ComponentDefinition '" + componentDefinitionName
										+ "' was found with the name '" + componentDefinitionReferenceName + "'");
					}
					edtComponentDefinitionReferences.add(edtComponentDefinitionReference);
					ServiceDefinition referenceServiceDefinition = edtComponentDefinitionReference.getSyntax();

					if (referenceServiceDefinition == null) {
						throw new FailedImportException("The ComponentDefinitionService '"
								+ componentDefinitionReferenceName + "' has no ServiceDefinition associated");

					}

					if (refQOSName != null) {
						// Read XML and convert it to EDT QoS
						edtqos.ServiceInstanceQos serviceInstanceQOS = XMLImporterSecondaryExtracter
								.extractServiceInstanceQOS(
										new File(file.getParentFile(), refQOSName + ImportUtils.QOS_EXT), refQOSName,
										referenceServiceDefinition);
						edtServiceQosList.add(serviceInstanceQOS);
					}
				}

			}

			EList<ServiceQoS> servs = ecoaComponentImplementation.getService();
			for (ServiceQoS serv : servs) {
				// Get Service QoS name to be created and
				// ComponentDefinitionService name to associate and get Ecoa
				// model ServiceInstanceQos
				String serviceQOSName = serv.getNewQoS();
				String componentDefinitionServiceName = serv.getName();
				if (componentDefinitionServiceName != null) {

					ComponentDefinitionService edtComponentDefinitionService = edtComponentDefinition
							.findComponentDefinitionServiceByName(componentDefinitionServiceName);

					// If ComponentDefinitionService not found throws error
					if (edtComponentDefinitionService == null) {
						throw new FailedImportException(
								"No Service exists in the ComponentDefinition '" + componentDefinitionName
										+ "' was found with the name '" + componentDefinitionServiceName + "'");
					}

					edtComponentDefinitionServices.add(edtComponentDefinitionService);

					ServiceDefinition serviceServiceDefinition = edtComponentDefinitionService.getSyntax();

					if (serviceServiceDefinition == null) {
						throw new FailedImportException("The ComponentDefinitionService '"
								+ componentDefinitionServiceName + "' has no ServiceDefinition associated");
					}

					if (serviceQOSName != null) {
						// Read XML and convert it to EDT QoS
						edtqos.ServiceInstanceQos serviceInstanceQOS = XMLImporterSecondaryExtracter
								.extractServiceInstanceQOS(
										new File(file.getParentFile(), serviceQOSName + ImportUtils.QOS_EXT),
										serviceQOSName, serviceServiceDefinition);
						edtServiceQosList.add(serviceInstanceQOS);
					}
				}
			}

			EList<ModuleInstance> ecoaModuleInstances = ecoaComponentImplementation.getModuleInstance();
			for (ModuleInstance moduleInstance : ecoaModuleInstances) {
				String moduleBehaviour = moduleInstance.getModuleBehaviour();
				if (moduleBehaviour != null) {
					File moduleBehaviourFile = new File(file.getParentFile(),
							moduleBehaviour + ImportUtils.BEHAVIOUR_EXT);
					edtModuleBehaviours.add(XMLImporterSecondaryExtracter.extractModuleBehaviour(moduleBehaviourFile,
							moduleBehaviour, missingElementsToLog));
				}
			}

			EList<TriggerInstance> ecoaTriggerInstances = ecoaComponentImplementation.getTriggerInstance();
			for (TriggerInstance triggerInstance : ecoaTriggerInstances) {
				String moduleBehaviour = triggerInstance.getModuleBehaviour();
				if (moduleBehaviour != null) {
					File moduleBehaviourFile = new File(file.getParentFile(),
							moduleBehaviour + ImportUtils.BEHAVIOUR_EXT);
					edtModuleBehaviours.add(XMLImporterSecondaryExtracter.extractModuleBehaviour(moduleBehaviourFile,
							moduleBehaviour, missingElementsToLog));
				}
			}

			EList<DynamicTriggerInstance> ecoaDynamicTriggerInstances = ecoaComponentImplementation
					.getDynamicTriggerInstance();
			for (DynamicTriggerInstance dynamicTriggerInstance : ecoaDynamicTriggerInstances) {
				String moduleBehaviour = dynamicTriggerInstance.getModuleBehaviour();
				if (moduleBehaviour != null) {
					File moduleBehaviourFile = new File(file.getParentFile(),
							moduleBehaviour + ImportUtils.BEHAVIOUR_EXT);
					edtModuleBehaviours.add(XMLImporterSecondaryExtracter.extractModuleBehaviour(moduleBehaviourFile,
							moduleBehaviour, missingElementsToLog));
				}
			}

			EDTLog.toConsole("ComponentImplementation " + file.getName() + IS_IMPORTING);
			// Convert ecoa ComponentImplementation to Edt
			// ComponentImplementation
			var edtComponentImplementation = ComponentImplementationImportConverter.createEDTComponentImplementation(
					ecoaComponentImplementation, file.getName(), edtComponentDefinition, edtServiceQosList,
					steps.getStep0(), edtModuleBehaviours);

//			Search bin-desc.xml file and if exist add it for export
			XMLImporterSecondaryExtracter.findBinDescAndImport(file, missingElementsToLog, edtComponentImplementation,
					popupToDisplay);

//			Add ComponentImplementation to Step4
			return edtComponentImplementation;

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.composite.xml
	 * 
	 * WARNING only one main composite in ecoa project will be possible at the
	 * moment
	 * 
	 * @param file                  : Composite file to be read
	 * @param missingElementsToLog  : log Elements (here Documentation and Property
	 *                              any attributes) that are not usable in EDT
	 * @param initialAssemblyExists
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	void extractFinalAssembly(File file, StringBuilder missingElementsToLog, boolean initialAssemblyExists)
			throws FailedImportException, FileNotFoundException {
		EDTLog.toConsole("FinalAssembly " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject finalAssemblyContent = XmlImporter.extractContent(file, new scaResourceFactoryImpl(),
				scaPackage.eNS_URI, scaPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (finalAssemblyContent instanceof org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot documentRoot) {
			org.open.oasis.docs.ns.opencsa.sca.sca.Composite composite = documentRoot.getComposite();

			if (composite.getDocumentation() != null && !composite.getDocumentation().isEmpty()) {
				missingElementsToLog.append(WARNING_DOCUMENTATION_ATTRIBUTE_PRESENT_IN + file.getName()
						+ IS_NOT_USABLE_IN_ECOA_DESIGN_TOOL_AND_IT_WILL_NOT_BE_IMPORTED_OR_EXPORTED);
			}

//			Import like a InitialAssembly if absent
			if (!initialAssemblyExists) {
				extractInitialAssembly(file, missingElementsToLog);
			}

			AssemblyImportConverter.addImplementationToInitialAssembly(composite, steps.getStep3().getInitialAssembly(),
					steps.getStep4(), steps.getStep0(), missingElementsToLog);
			FinalAssembly finalAssembly;
			if (steps.getStep5().getFinalAssembly() != null) {
				finalAssembly = steps.getStep5().getFinalAssembly();
			} else {
				finalAssembly = EDTProjectFactory.eINSTANCE.createFinalAssembly();
			}
			finalAssembly.setName(composite.getName());
			finalAssembly.setFinalAssembly(steps.getStep3().getInitialAssembly());
			steps.getStep5().setFinalAssembly(finalAssembly);
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

	/**
	 * Get all contents from XX.logical-system.xml
	 * 
	 * 
	 * @param file                 : LogicalSystem file to be read
	 * @param missingElementsToLog : log Elements that are not usable in EDT
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	void extractLogicalSystem(File file, StringBuilder missingElementsToLog)
			throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("Logical System " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject logicalSystemContent = XmlImporter.extractContent(file, new logResourceFactoryImpl(),
				logPackage.eNS_URI, logPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (logicalSystemContent instanceof technology.ecoa.logicalsystem._2.DocumentRoot documentRoot) {
			LogicalSystem logicalSystem = documentRoot.getLogicalSystem();

			edtlogical.LogicalSystem edtLogicalSystem = LogicalSystemImportConverter
					.createEDTLogicalSystem(logicalSystem, file.getName());

			steps.getStep5().setLogicalSystem(edtLogicalSystem);
			EList<LogicalComputingPlatformLinks> logicalComputingPlatformLinks = logicalSystem
					.getLogicalComputingPlatformLinks();
			for (LogicalComputingPlatformLinks logicalComputingPlatformLinks2 : logicalComputingPlatformLinks) {
				EList<LinkType> links = logicalComputingPlatformLinks2.getLink();
				for (LinkType linkType : links) {
					TransportBindingType transportBinding = linkType.getTransportBinding();
					if (transportBinding != null && transportBinding.getParameters() != null) {
						String parameters = transportBinding.getParameters();
						steps.getStep5().getUDPBindings().add(XMLImporterSecondaryExtracter
								.extractUDPBinding(new File(file.getParentFile(), parameters)));
					}

				}
			}
			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}

	}

	/**
	 * Get all contents from XX.deployment.xml
	 * 
	 * 
	 * @param file                 : Deployment file to be read
	 * @param missingElementsToLog : log Elements that are not usable in EDT
	 * @throws FailedImportException : if error during conversion or reading
	 * @throws FileNotFoundException : if file not found, but present in project.xml
	 */
	edtdeployment.Deployment extractDeployment(File file, StringBuilder missingElementsToLog)
			throws FileNotFoundException, FailedImportException {
		EDTLog.toConsole("Deployment " + file.getName() + IS_IMPORTING);

		// Read content and convert to ecoa model Library object
		EObject deploymentContent = XmlImporter.extractContent(file, new depResourceFactoryImpl(), depPackage.eNS_URI,
				depPackage.eINSTANCE);

		// Convert ecoa to edt object and add to Steps
		if (deploymentContent instanceof technology.ecoa.deployment._2.DocumentRoot documentRoot) {
			Deployment deployment = documentRoot.getDeployment();
			edtdeployment.Deployment edtDeployment = DeploymentImportConverter.createEDTDeployment(deployment,
					file.getName(), steps.getStep5().getFinalAssembly(), steps.getStep5().getLogicalSystem());
			return edtDeployment;

			// Error during reading
		} else {
			throw new FailedImportException(file.getName() + COULD_NOT_BE_READ);
		}
	}

}
