/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalProcessor;
import edtlogical.LogicalSystem;
import technology.ecoa.logicalsystem._2.LatencyType1;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.ThroughputType1;
import technology.ecoa.logicalsystem._2.logFactory;

/**
 * Convert imported ECOA LogicalSystem objects to EDT objects
 * 
 */
public class LogicalSystemExportConverter {
	private static final logFactory ECOALOGICALFACTORY = logFactory.eINSTANCE;

	private LogicalSystemExportConverter() {
	}

	/**
	 * Convert EDT LogicalSystem to ECOA LogicalSystem
	 * 
	 * @param edtLogicalSystem : EDT LogicalSystem object
	 * @return DocumentRoot
	 */
	public static technology.ecoa.logicalsystem._2.DocumentRoot recreateECOALogicalSystem(
			LogicalSystem edtLogicalSystem) {
		// Create empty ECOA LogicalSystem
		technology.ecoa.logicalsystem._2.DocumentRoot documentRoot = ECOALOGICALFACTORY.createDocumentRoot();
		var ecoaLogicalSystem = ECOALOGICALFACTORY.createLogicalSystem();
		ecoaLogicalSystem.setId(edtLogicalSystem.getId());

		EList<LogicalComputingPlatform> edtLogicalComputingPlatforms = edtLogicalSystem.getLogicalComputingPlatforms();
		for (LogicalComputingPlatform edtPlatform : edtLogicalComputingPlatforms) {
			technology.ecoa.logicalsystem._2.LogicalComputingPlatform ecoaLogicalComputingPlatform = recreateECOALogicalComputingPlatform(
					edtPlatform);
			ecoaLogicalSystem.getLogicalComputingPlatform().add(ecoaLogicalComputingPlatform);
		}

		EList<LogicalComputingPlatformLink> edtLogicalComputingPlatformLinks = edtLogicalSystem
				.getLogicalComputingPlatformLinks();
		if (!edtLogicalComputingPlatformLinks.isEmpty()) {
			LogicalComputingPlatformLinks logicalComputingPlatformLinks = ECOALOGICALFACTORY
					.createLogicalComputingPlatformLinks();
			for (LogicalComputingPlatformLink edtLogicalComputingPlatformLink : edtLogicalComputingPlatformLinks) {
				logicalComputingPlatformLinks.getLink()
						.add(recreateECOALogicalComputingPlatformLinks(edtLogicalComputingPlatformLink));
			}
			ecoaLogicalSystem.getLogicalComputingPlatformLinks().add(logicalComputingPlatformLinks);
		}
		documentRoot.setLogicalSystem(ecoaLogicalSystem);
		return documentRoot;
	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @return @ if LogicalComputingNode in link not found
	 */
	private static technology.ecoa.logicalsystem._2.LogicalComputingPlatform recreateECOALogicalComputingPlatform(
			LogicalComputingPlatform edtLogicalComputingPlatform) {
		technology.ecoa.logicalsystem._2.LogicalComputingPlatform ecoaLogicalComputingPlatform = ECOALOGICALFACTORY
				.createLogicalComputingPlatform();
		if (edtLogicalComputingPlatform.isSetELIPlatformId()) {
			ecoaLogicalComputingPlatform.setELIPlatformId(edtLogicalComputingPlatform.getELIPlatformId());
		}
		ecoaLogicalComputingPlatform.setId(edtLogicalComputingPlatform.getId());
		EList<LogicalComputingNode> edtLogicalComputingNodes = edtLogicalComputingPlatform.getLogicalComputingNodes();
		for (LogicalComputingNode edtLogicalComputingNode : edtLogicalComputingNodes) {
			technology.ecoa.logicalsystem._2.LogicalComputingNodeType ecoaLogicalComputingNode = recreateECOALogicalComputingNode(
					edtLogicalComputingNode);

			ecoaLogicalComputingPlatform.getLogicalComputingNode().add(ecoaLogicalComputingNode);
		}

		EList<LogicalComputingNodeLink> edtLogicalComputingNodeLinks = edtLogicalComputingPlatform
				.getLogicalComputingNodeLinks();
		if (!edtLogicalComputingNodeLinks.isEmpty()) {
			LogicalComputingNodeLinks logicalComputingNodeLinks = ECOALOGICALFACTORY.createLogicalComputingNodeLinks();
			for (LogicalComputingNodeLink edtLogicalComputingNodeLink : edtLogicalComputingNodeLinks) {
				logicalComputingNodeLinks.getLink().add(recreateECOALinkType1(edtLogicalComputingNodeLink));

			}
			ecoaLogicalComputingPlatform.getLogicalComputingNodeLinks().add(logicalComputingNodeLinks);
		}
		return ecoaLogicalComputingPlatform;
	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @param edtLogicalComputingPlatformLink
	 * @return @ if node of Link does not exist
	 */
	private static technology.ecoa.logicalsystem._2.LinkType recreateECOALogicalComputingPlatformLinks(
			LogicalComputingPlatformLink edtLogicalComputingPlatformLink) {
		technology.ecoa.logicalsystem._2.LinkType ecoaLogicalComputingPlatformLink = ECOALOGICALFACTORY
				.createLinkType();
		ecoaLogicalComputingPlatformLink.setId(edtLogicalComputingPlatformLink.getId());

		if (edtLogicalComputingPlatformLink.getFrom() != null) {
			ecoaLogicalComputingPlatformLink.setFrom(edtLogicalComputingPlatformLink.getFrom().getId());
		}

		if (edtLogicalComputingPlatformLink.getTo() != null) {
			ecoaLogicalComputingPlatformLink.setTo(edtLogicalComputingPlatformLink.getTo().getId());
		}

		if (edtLogicalComputingPlatformLink.getLatencyMicroSeconds() != null) {
			technology.ecoa.logicalsystem._2.LatencyType latencyType = ECOALOGICALFACTORY.createLatencyType();
			latencyType.setMicroSeconds(edtLogicalComputingPlatformLink.getLatencyMicroSeconds());
			ecoaLogicalComputingPlatformLink.setLatency(latencyType);
		}

		if (edtLogicalComputingPlatformLink.getThroughputMegaBytesPerSecond() != null) {
			technology.ecoa.logicalsystem._2.ThroughputType throughputType = ECOALOGICALFACTORY.createThroughputType();
			throughputType.setMegaBytesPerSecond(edtLogicalComputingPlatformLink.getThroughputMegaBytesPerSecond());
			ecoaLogicalComputingPlatformLink.setThroughput(throughputType);
		}

		if (edtLogicalComputingPlatformLink.getTransportBindingProtocol() != null
				|| edtLogicalComputingPlatformLink.getTransportBindingParameters() != null) {
			technology.ecoa.logicalsystem._2.TransportBindingType transportBindingType = ECOALOGICALFACTORY
					.createTransportBindingType();
			transportBindingType.setParameters(edtLogicalComputingPlatformLink.getTransportBindingParameters());
			transportBindingType.setProtocol(edtLogicalComputingPlatformLink.getTransportBindingProtocol());
			ecoaLogicalComputingPlatformLink.setTransportBinding(transportBindingType);
		}

		return ecoaLogicalComputingPlatformLink;

	}

	/**
	 * @param edtLogicalComputingPlatform
	 * @param edtLogicalComputingNodeLink
	 * @return @ if node of Link does not exist
	 */
	private static technology.ecoa.logicalsystem._2.LinkType1 recreateECOALinkType1(
			LogicalComputingNodeLink edtLogicalComputingNodeLink) {
		technology.ecoa.logicalsystem._2.LinkType1 ecoaLogicalComputingNodeLink = ECOALOGICALFACTORY.createLinkType1();

		if (edtLogicalComputingNodeLink.getFrom() != null) {
			ecoaLogicalComputingNodeLink.setFrom(edtLogicalComputingNodeLink.getFrom().getId());
		}

		if (edtLogicalComputingNodeLink.getTo() != null) {
			ecoaLogicalComputingNodeLink.setTo(edtLogicalComputingNodeLink.getTo().getId());
		}

		if (edtLogicalComputingNodeLink.getLatencyMicroSeconds() != null) {
			LatencyType1 latencyType1 = ECOALOGICALFACTORY.createLatencyType1();
			latencyType1.setMicroSeconds(edtLogicalComputingNodeLink.getLatencyMicroSeconds());
			ecoaLogicalComputingNodeLink.setLatency(latencyType1);
		}

		if (edtLogicalComputingNodeLink.getThroughputMegaBytesPerSecond() != null) {
			ThroughputType1 throughputType1 = ECOALOGICALFACTORY.createThroughputType1();
			throughputType1.setMegaBytesPerSecond(edtLogicalComputingNodeLink.getThroughputMegaBytesPerSecond());
			ecoaLogicalComputingNodeLink.setThroughput(throughputType1);
		}

		if (edtLogicalComputingNodeLink.getId() != null) {
			ecoaLogicalComputingNodeLink.setId(edtLogicalComputingNodeLink.getId());
		}
		return ecoaLogicalComputingNodeLink;
	}

	/**
	 * @param edtLogicalComputingNode
	 * @return
	 */
	private static technology.ecoa.logicalsystem._2.LogicalComputingNodeType recreateECOALogicalComputingNode(
			LogicalComputingNode edtLogicalComputingNode) {
		technology.ecoa.logicalsystem._2.LogicalComputingNodeType ecoaLogicalComputingNode = ECOALOGICALFACTORY
				.createLogicalComputingNodeType();

		ecoaLogicalComputingNode.setId(edtLogicalComputingNode.getId());
		if (edtLogicalComputingNode.getAvailableMemoryGigaBytes() != null) {
			technology.ecoa.logicalsystem._2.AvailableMemoryType availableMemoryType = ECOALOGICALFACTORY
					.createAvailableMemoryType();
			availableMemoryType.setGigaBytes(edtLogicalComputingNode.getAvailableMemoryGigaBytes());
			ecoaLogicalComputingNode.setAvailableMemory(availableMemoryType);
		}
		if (edtLogicalComputingNode.getEndianessType() != null) {
			technology.ecoa.logicalsystem._2.EndianessType endianessType = ECOALOGICALFACTORY.createEndianessType();
			endianessType.setType(edtLogicalComputingNode.getEndianessType());
			ecoaLogicalComputingNode.setEndianess(endianessType);
		}

		if (edtLogicalComputingNode.getModuleSwitchTimeMicroSeconds() != null) {
			technology.ecoa.logicalsystem._2.ModuleSwitchTimeType moduleSwitchTimeType = ECOALOGICALFACTORY
					.createModuleSwitchTimeType();
			moduleSwitchTimeType.setMicroSeconds(edtLogicalComputingNode.getModuleSwitchTimeMicroSeconds());
			ecoaLogicalComputingNode.setModuleSwitchTime(moduleSwitchTimeType);
		}

		if (edtLogicalComputingNode.isSetOsName()) {
			technology.ecoa.logicalsystem._2.OsType osType = ECOALOGICALFACTORY.createOsType();
			osType.setName(edtLogicalComputingNode.getOsName());
			osType.setVersion(edtLogicalComputingNode.getOsVersion());
			ecoaLogicalComputingNode.setOs(osType);
		}

		EList<LogicalProcessor> edtLogicalProcessors = edtLogicalComputingNode.getLogicalProcessors();
		for (LogicalProcessor edtLogicalProcessor : edtLogicalProcessors) {
			technology.ecoa.logicalsystem._2.LogicalProcessorsType ecoaLogicalProcessor = recreateECOALogicalProcessor(
					edtLogicalProcessor);
			ecoaLogicalComputingNode.getLogicalProcessors().add(ecoaLogicalProcessor);
		}
		return ecoaLogicalComputingNode;
	}

	/**
	 * @param edtLogicalProcessor
	 * @return
	 */
	private static technology.ecoa.logicalsystem._2.LogicalProcessorsType recreateECOALogicalProcessor(
			LogicalProcessor edtLogicalProcessor) {
		technology.ecoa.logicalsystem._2.LogicalProcessorsType ecoaLogicalProcessor = ECOALOGICALFACTORY
				.createLogicalProcessorsType();
		ecoaLogicalProcessor.setNumber(edtLogicalProcessor.getNumber());

		if (edtLogicalProcessor.getStepDurationNanoSeconds() != null) {
			technology.ecoa.logicalsystem._2.StepDurationType stepDurationType = ECOALOGICALFACTORY
					.createStepDurationType();
			stepDurationType.setNanoSeconds(edtLogicalProcessor.getStepDurationNanoSeconds());
			ecoaLogicalProcessor.setStepDuration(stepDurationType);
		}
		ecoaLogicalProcessor.setType(edtLogicalProcessor.getType());
		return ecoaLogicalProcessor;
	}

}
