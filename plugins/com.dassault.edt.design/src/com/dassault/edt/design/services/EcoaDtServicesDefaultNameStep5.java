/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.ecore.EObject;

import edtdeployment.Deployment;
import edtdeployment.ProtectionDomain;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalProcessor;
import edtlogical.LogicalSystem;
import edtproject.Step5;
import edtudp.UDPBinding;
import edtuid.IDMap;
import technology.ecoa.udpbinding._2.PlatformType;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDefaultNameStep5 {

	/**
	 * Find defaultName for object contained in LogicalSystem
	 * 
	 * @param eObject : LogicalComputingPlatform, LogicalComputingNode,
	 *                LogicalComputingPlatformLink
	 * @return name
	 */
	public String countLogicalSystemElements(EObject eObject) {
		if (eObject instanceof LogicalComputingPlatform
				&& eObject.eContainer() instanceof LogicalSystem logicalSystem) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate(
					"LCP" + logicalSystem.getLogicalComputingPlatforms().size(),
					logicalSystem.getLogicalComputingPlatforms().toArray(new LogicalComputingPlatform[0]),
					logicalSystem.getLogicalComputingPlatforms().size());
		} else if (eObject instanceof LogicalComputingPlatformLink
				&& eObject.eContainer() instanceof LogicalSystem logicalSystem) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate(
					"LCPL" + logicalSystem.getLogicalComputingPlatformLinks().size(),
					logicalSystem.getLogicalComputingPlatformLinks().toArray(new LogicalComputingPlatformLink[0]),
					logicalSystem.getLogicalComputingPlatformLinks().size());
		} else if (eObject instanceof LogicalComputingNode
				&& eObject.eContainer() instanceof LogicalComputingPlatform logicalPlatform) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate(
					"LCN" + logicalPlatform.getLogicalComputingNodes().size(),
					logicalPlatform.getLogicalComputingNodes().toArray(new LogicalComputingNode[0]),
					logicalPlatform.getLogicalComputingNodes().size());
		} else if (eObject instanceof LogicalProcessor
				&& eObject.eContainer() instanceof LogicalComputingNode logicalNode) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("LCN" + logicalNode.getLogicalProcessors(),
					logicalNode.getLogicalProcessors().toArray(new LogicalProcessor[0]),
					logicalNode.getLogicalProcessors().size());
		}
		return "";
	}

	/**
	 * Find defaultName for object contained in Deployment
	 * 
	 * @param eObject : ProtectionDomain
	 * 
	 * @return name
	 */
	public String countDeploymentElements(EObject eObject) {
		if (eObject instanceof ProtectionDomain && eObject.eContainer() instanceof Deployment deployment) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("PD" + deployment.getProtectionDomains().size(),
					deployment.getProtectionDomains().toArray(new ProtectionDomain[0]),
					deployment.getProtectionDomains().size());
		}
		return "";
	}

	/**
	 * Find defaultName for object from UDPBindign
	 * 
	 * @param eObject : UDPBinding, Platform
	 * 
	 * @return name
	 */
	public String countUDPBindingElements(EObject eObject) {
		if (eObject instanceof UDPBinding && eObject.eContainer() instanceof Step5 step5) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("udp-binding" + step5.getUDPBindings().size() + ".xml",
					step5.getUDPBindings().toArray(new UDPBinding[0]), step5.getUDPBindings().size());
		} else if (eObject instanceof PlatformType && eObject.eContainer() instanceof UDPBinding udp) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("platform" + udp.getPlatform().size(),
					udp.getPlatform().toArray(new PlatformType[0]), udp.getPlatform().size());

		}
		return "";
	}

	/**
	 * Find defaultName for object from UDPBindign
	 * 
	 * @param eObject : UDPBinding, Platform
	 * 
	 * @return name
	 */
	public String countIDMapElements(EObject eObject) {
		if (eObject instanceof IDMap && eObject.eContainer() instanceof Step5 step5) {
			return EcoaDtServicesDefaultName.checkNameWhenCreate("ID" + step5.getIDS().size(),
					step5.getIDS().toArray(new IDMap[0]), step5.getIDS().size());
		}
		return "";
	}

}
