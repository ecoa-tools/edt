/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.Step2;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDefaultNameStep2 {

	/**
	 * Count the amount of ComponentDefinitions contained in Step2.
	 *
	 * @param componentDefinition - active ComponentDefinition
	 * @return the amount of ComponentDefinitions contained in Step2
	 */
	public String countComponentDefinition(ComponentDefinition componentDefinition) {
		Step2 step2 = ((Step2) componentDefinition.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate(
				"ComponentDefinition" + step2.getComponentDefinitions().size(),
				step2.getComponentDefinitions().toArray(new ComponentDefinition[0]),
				step2.getComponentDefinitions().size());
	}

	/**
	 * Count the amount of ComponentDefinitionServices contained in a
	 * ComponentDefinition.
	 *
	 * @param componentDefinitionService - active ComponentDefinitionService
	 * @return the amount of ComponentDefinitionService contained in the
	 *         ComponentDefinition
	 */
	public String countComponentDefinitionServices(ComponentDefinitionService componentDefinitionService) {
		ComponentDefinition componentDefinition = ((ComponentDefinition) componentDefinitionService.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Service" + componentDefinition.getServices().size(),
				componentDefinition.getServices().toArray(new ComponentDefinitionService[0]),
				componentDefinition.getServices().size());
	}

	/**
	 * Count the amount of ComponentDefinitionReferences contained in a
	 * ComponentDefinition.
	 *
	 * @param componentDefinitionReference - active ComponentDefinitionReference
	 * @return the amount of ComponentDefinitionReferences contained in the
	 *         ComponentDefinition
	 */
	public String countComponentDefinitionReferences(ComponentDefinitionReference componentDefinitionReference) {
		ComponentDefinition componentDefinition = ((ComponentDefinition) componentDefinitionReference.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Reference" + componentDefinition.getReferences().size(),
				componentDefinition.getReferences().toArray(new ComponentDefinitionReference[0]),
				componentDefinition.getReferences().size());
	}
}
