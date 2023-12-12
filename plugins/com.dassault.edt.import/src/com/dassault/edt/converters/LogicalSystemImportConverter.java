/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtlogical.EdtlogicalFactory;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalProcessor;
import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.LinkType1;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatform;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.LogicalProcessorsType;
import technology.ecoa.logicalsystem._2.LogicalSystem;
import technology.ecoa.logicalsystem._2.OsType;

/**
 * Convert imported ECOA LogicalSystem objects to EDT objects
 * 
 */
public class LogicalSystemImportConverter {
	private static final EdtlogicalFactory EDTLOGICALFACTORY = EdtlogicalFactory.eINSTANCE;

	private LogicalSystemImportConverter() {
	}

	/**
	 * Create a EDT model LogicalSystem from a Ecoa model LogicalSystem
	 * 
	 * @param ecoaLogicalSystem : ECOA LogicalSystem object
	 * @param fileName          : name of the file
	 * @return edtServiceDefinition
	 * @throws FailedImportException if node or platform of link not found
	 */
	public static edtlogical.LogicalSystem createEDTLogicalSystem(LogicalSystem ecoaLogicalSystem, String fileName)
			throws FailedImportException {
		// Create empty EDT LogicalSystem
		var edtLogicalSystem = EDTLOGICALFACTORY.createLogicalSystem();
		edtLogicalSystem.setId(ecoaLogicalSystem.getId());
		edtLogicalSystem.setFileNamePrefix(EDTProjectImportConverter.getObjectName(fileName, ".logical-system.xml"));

		EList<LogicalComputingPlatform> ecoaLogicalComputingPlatforms = ecoaLogicalSystem.getLogicalComputingPlatform();
		for (LogicalComputingPlatform ecoaLogicalComputingPlatform : ecoaLogicalComputingPlatforms) {
			edtlogical.LogicalComputingPlatform edtLogicalComputingPlatform = createEDTLogicalComputingPlatform(
					ecoaLogicalComputingPlatform);
			edtLogicalSystem.getLogicalComputingPlatforms().add(edtLogicalComputingPlatform);
		}

		EList<LogicalComputingPlatformLinks> ecoaLogicalComputingPlatformLinks = ecoaLogicalSystem
				.getLogicalComputingPlatformLinks();
		for (LogicalComputingPlatformLinks ecoaLogicalComputingPlatformLink : ecoaLogicalComputingPlatformLinks) {
			LogicalComputingPlatformLink edtLogicalComputingPlatformLink = createEDTLogicalComputingPlatformLinks(
					edtLogicalSystem, ecoaLogicalComputingPlatformLink);
			edtLogicalSystem.getLogicalComputingPlatformLinks().add(edtLogicalComputingPlatformLink);
		}
		return edtLogicalSystem;
	}

	/**
	 * @param ecoaLogicalComputingPlatform
	 * @return
	 * @throws FailedImportException if LogicalComputingNode in link not found
	 */
	private static edtlogical.LogicalComputingPlatform createEDTLogicalComputingPlatform(
			LogicalComputingPlatform ecoaLogicalComputingPlatform) throws FailedImportException {
		edtlogical.LogicalComputingPlatform edtLogicalComputingPlatform = EDTLOGICALFACTORY
				.createLogicalComputingPlatform();
		if (ecoaLogicalComputingPlatform.isSetELIPlatformId()) {
			edtLogicalComputingPlatform.setELIPlatformId(ecoaLogicalComputingPlatform.getELIPlatformId());
		}
		edtLogicalComputingPlatform.setId(ecoaLogicalComputingPlatform.getId());
		EList<LogicalComputingNodeType> ecoaLogicalComputingNodes = ecoaLogicalComputingPlatform
				.getLogicalComputingNode();
		for (LogicalComputingNodeType ecoaLogicalComputingNode : ecoaLogicalComputingNodes) {
			edtlogical.LogicalComputingNode edtLogicalComputingNode = createEDTLogicalComputingNode(
					ecoaLogicalComputingNode);

			edtLogicalComputingPlatform.getLogicalComputingNodes().add(edtLogicalComputingNode);
		}

		EList<LogicalComputingNodeLinks> ecoaLogicalComputingNodeLinks = ecoaLogicalComputingPlatform
				.getLogicalComputingNodeLinks();
		for (LogicalComputingNodeLinks ecoaLogicalComputingNodeLink : ecoaLogicalComputingNodeLinks) {
			LogicalComputingNodeLink edtLogicalComputingNodeLink = createEDTLogicalComputingNodeLinks(
					edtLogicalComputingPlatform, ecoaLogicalComputingNodeLink);

			edtLogicalComputingPlatform.getLogicalComputingNodeLinks().add(edtLogicalComputingNodeLink);
		}
		return edtLogicalComputingPlatform;
	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @param ecoaLogicalComputingPlatformLink
	 * @return
	 * @throws FailedImportException if node of Link does not exist
	 */
	private static edtlogical.LogicalComputingPlatformLink createEDTLogicalComputingPlatformLinks(
			edtlogical.LogicalSystem edtLogicalSystem, LogicalComputingPlatformLinks ecoaLogicalComputingPlatformLink)
			throws FailedImportException {
		edtlogical.LogicalComputingPlatformLink edtLogicalComputingPlatformLink = EDTLOGICALFACTORY
				.createLogicalComputingPlatformLink();
		EList<LinkType> ecoaPlatformLinks = ecoaLogicalComputingPlatformLink.getLink();
		for (LinkType ecoaPlatformLink : ecoaPlatformLinks) {
			edtLogicalComputingPlatformLink.setId(ecoaPlatformLink.getId());
			if (ecoaPlatformLink.getLatency() != null) {
				edtLogicalComputingPlatformLink.setLatencyMicroSeconds(ecoaPlatformLink.getLatency().getMicroSeconds());
			}

			if (ecoaPlatformLink.getThroughput() != null) {
				edtLogicalComputingPlatformLink
						.setThroughputMegaBytesPerSecond(ecoaPlatformLink.getThroughput().getMegaBytesPerSecond());
			}

			if (ecoaPlatformLink.getTransportBinding() != null) {
				edtLogicalComputingPlatformLink
						.setTransportBindingParameters(ecoaPlatformLink.getTransportBinding().getParameters());
				edtLogicalComputingPlatformLink
						.setTransportBindingProtocol(ecoaPlatformLink.getTransportBinding().getProtocol());
			}
			edtlogical.LogicalComputingPlatform fromPlatform = edtLogicalSystem
					.findLogicalComputingPlatformById(ecoaPlatformLink.getFrom());
			edtlogical.LogicalComputingPlatform toPlatform = edtLogicalSystem
					.findLogicalComputingPlatformById(ecoaPlatformLink.getTo());
			if (fromPlatform != null) {
				edtLogicalComputingPlatformLink.setFrom(fromPlatform);
			} else {
				throw new FailedImportException(
						"No LogicalComputingPlatform was found with the name :" + ecoaPlatformLink.getFrom());
			}
			if (toPlatform != null) {
				edtLogicalComputingPlatformLink.setTo(toPlatform);
			} else {
				throw new FailedImportException(
						"No LogicalComputingPlatform was found with the name :" + ecoaPlatformLink.getTo());

			}

		}
		return edtLogicalComputingPlatformLink;
	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @param ecoaLogicalComputingNodeLink
	 * @return
	 * @throws FailedImportException if node of Link does not exist
	 */
	private static edtlogical.LogicalComputingNodeLink createEDTLogicalComputingNodeLinks(
			edtlogical.LogicalComputingPlatform edtLogicalPlatform,
			LogicalComputingNodeLinks ecoaLogicalComputingNodeLink) throws FailedImportException {
		edtlogical.LogicalComputingNodeLink edtLogicalComputingNodeLink = EDTLOGICALFACTORY
				.createLogicalComputingNodeLink();

		EList<LinkType1> ecoaNodeLinks = ecoaLogicalComputingNodeLink.getLink();
		for (LinkType1 ecoaNodeLink : ecoaNodeLinks) {
			edtLogicalComputingNodeLink.setId(ecoaNodeLink.getId());
			if (ecoaNodeLink.getLatency() != null) {
				edtLogicalComputingNodeLink.setLatencyMicroSeconds(ecoaNodeLink.getLatency().getMicroSeconds());
			}

			if (ecoaNodeLink.getThroughput() != null) {
				edtLogicalComputingNodeLink
						.setThroughputMegaBytesPerSecond(ecoaNodeLink.getThroughput().getMegaBytesPerSecond());
			}

			LogicalComputingNode fromNode = edtLogicalPlatform.findLogicalComputingNodeById(ecoaNodeLink.getFrom());
			LogicalComputingNode toNode = edtLogicalPlatform.findLogicalComputingNodeById(ecoaNodeLink.getTo());
			if (fromNode != null) {
				edtLogicalComputingNodeLink.setFrom(fromNode);
			} else {
				throw new FailedImportException(
						"No LogicalComputingNode was found with the name :" + ecoaNodeLink.getFrom());
			}
			if (toNode != null) {
				edtLogicalComputingNodeLink.setTo(toNode);
			} else {
				throw new FailedImportException(
						"No LogicalComputingNode was found with the name :" + ecoaNodeLink.getTo());

			}
		}
		return edtLogicalComputingNodeLink;
	}

	/**
	 * @param ecoaLogicalComputingNode
	 * @return
	 */
	private static edtlogical.LogicalComputingNode createEDTLogicalComputingNode(
			LogicalComputingNodeType ecoaLogicalComputingNode) {
		edtlogical.LogicalComputingNode edtLogicalComputingNode = EDTLOGICALFACTORY.createLogicalComputingNode();

		edtLogicalComputingNode.setId(ecoaLogicalComputingNode.getId());
		if (ecoaLogicalComputingNode.getAvailableMemory() != null) {
			edtLogicalComputingNode
					.setAvailableMemoryGigaBytes(ecoaLogicalComputingNode.getAvailableMemory().getGigaBytes());
		}
		if (ecoaLogicalComputingNode.getEndianess() != null) {
			edtLogicalComputingNode.setEndianessType(ecoaLogicalComputingNode.getEndianess().getType());
		}

		if (ecoaLogicalComputingNode.getModuleSwitchTime() != null) {
			edtLogicalComputingNode
					.setModuleSwitchTimeMicroSeconds(ecoaLogicalComputingNode.getModuleSwitchTime().getMicroSeconds());
		}

		OsType os = ecoaLogicalComputingNode.getOs();
		if (os.isSetName()) {
			edtLogicalComputingNode.setOsName(os.getName());
		}
		edtLogicalComputingNode.setOsVersion(os.getVersion());

		EList<LogicalProcessorsType> ecoaLogicalProcessors = ecoaLogicalComputingNode.getLogicalProcessors();
		for (LogicalProcessorsType ecoaLogicalProcessor : ecoaLogicalProcessors) {
			LogicalProcessor edtLogicalProcessor = createEDTLogicalProcessor(ecoaLogicalProcessor);
			edtLogicalComputingNode.getLogicalProcessors().add(edtLogicalProcessor);
		}
		return edtLogicalComputingNode;
	}

	/**
	 * @param ecoaLogicalProcessor
	 * @return
	 */
	private static edtlogical.LogicalProcessor createEDTLogicalProcessor(LogicalProcessorsType ecoaLogicalProcessor) {
		LogicalProcessor edtLogicalProcessor = EDTLOGICALFACTORY.createLogicalProcessor();
		edtLogicalProcessor.setNumber(ecoaLogicalProcessor.getNumber());
		if (ecoaLogicalProcessor.getStepDuration() != null) {
			edtLogicalProcessor.setStepDurationNanoSeconds(ecoaLogicalProcessor.getStepDuration().getNanoSeconds());
		}
		edtLogicalProcessor.setType(ecoaLogicalProcessor.getType());
		return edtLogicalProcessor;
	}

}
