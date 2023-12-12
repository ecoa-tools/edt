/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.ecore.util.EcoreUtil;

import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalSystem;
import edtproject.Step5;
import edtudp.UDPBinding;
import edtuid.IDMap;
import technology.ecoa.udpbinding._2.PlatformType;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopyStep5 {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Creates copy of Platform of UDPBinding
	 * 
	 * @param platformToCopy : element to copy
	 * @param newPlatform    : copy
	 * @return copy's name
	 */
	public String copyAndRenameUDPBindingPlatform(PlatformType platformToCopy, PlatformType newPlatform) {
		PlatformType copy = EcoreUtil.copy(platformToCopy);
		if (platformToCopy.isSetMaxChannels()) {
			newPlatform.setMaxChannels(copy.getMaxChannels());
		}

		if (platformToCopy.isSetPlatformId()) {
			newPlatform.setPlatformId(copy.getPlatformId());
		}

		newPlatform.setReceivingMulticastAddress(copy.getReceivingMulticastAddress());
		newPlatform.setReceivingPort(copy.getReceivingPort());

		UDPBinding udpBinding = (UDPBinding) platformToCopy.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + platformToCopy.getName(),
				udpBinding.getPlatform().toArray(new PlatformType[0]), 0);
	}

	/**
	 * Creates copy of UDPBinding in Step5
	 * 
	 * @param udpToCopy : element to copy
	 * @param newUDP    : copy
	 * @return copy's name
	 */
	public String copyAndRenameUDPBinding(UDPBinding udpToCopy, UDPBinding newUDP) {
		UDPBinding copy = EcoreUtil.copy(udpToCopy);
		newUDP.getPlatform().addAll(copy.getPlatform());

		Step5 step5 = (Step5) udpToCopy.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + udpToCopy.getName(),
				step5.getUDPBindings().toArray(new UDPBinding[0]), 0);
	}

	/**
	 * Creates copy of LogicalComputingPlatform in LogicalSystem
	 * 
	 * @param platformToCopy : element to copy
	 * @param newPlatform    : copy
	 * @return copy's name
	 */
	public String copyAndRenameLogicalPlatform(LogicalComputingPlatform platformToCopy,
			LogicalComputingPlatform newPlatform) {
		LogicalComputingPlatform copy = EcoreUtil.copy(platformToCopy);
		if (platformToCopy.isSetELIPlatformId()) {
			newPlatform.setELIPlatformId(copy.getELIPlatformId());
		}

		newPlatform.getLogicalComputingNodeLinks().addAll(copy.getLogicalComputingNodeLinks());
		newPlatform.getLogicalComputingNodes().addAll(copy.getLogicalComputingNodes());
		LogicalSystem logicalSystem = (LogicalSystem) platformToCopy.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + platformToCopy.getId(),
				logicalSystem.getLogicalComputingPlatforms().toArray(new LogicalComputingPlatform[0]), 0);
	}

	/**
	 * Creates copy of LogicalComputingNode in LogicalComputingPlatform
	 * 
	 * @param nodeToCopy : element to copy
	 * @param newNode    : copy
	 * @return copy's name
	 */
	public String copyAndRenameLogicalNode(LogicalComputingNode nodeToCopy, LogicalComputingNode newNode) {
		LogicalComputingNode copy = EcoreUtil.copy(nodeToCopy);
		if (nodeToCopy.isSetOsName()) {
			newNode.setOsName(copy.getOsName());
		}

		newNode.setAvailableMemoryGigaBytes(nodeToCopy.getAvailableMemoryGigaBytes());
		newNode.setEndianessType(nodeToCopy.getEndianessType());
		newNode.setModuleSwitchTimeMicroSeconds(nodeToCopy.getModuleSwitchTimeMicroSeconds());
		newNode.setOsVersion(nodeToCopy.getOsVersion());

		newNode.getLogicalProcessors().addAll(copy.getLogicalProcessors());
		LogicalComputingPlatform logicalPlatform = (LogicalComputingPlatform) nodeToCopy.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + nodeToCopy.getId(),
				logicalPlatform.getLogicalComputingNodes().toArray(new LogicalComputingNode[0]), 0);
	}

	/**
	 * Creates copy of IDMap in Step5
	 * 
	 * @param idToCopy : element to copy
	 * @param newID    : copy
	 * @return copy's name
	 */
	public String copyAndRenameIDMap(IDMap idToCopy, IDMap newID) {
		IDMap copy = EcoreUtil.copy(idToCopy);
		newID.getIDs().addAll(copy.getIDs());

		Step5 step5 = (Step5) idToCopy.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + idToCopy.getName(), step5.getIDS().toArray(new IDMap[0]),
				0);
	}
}
