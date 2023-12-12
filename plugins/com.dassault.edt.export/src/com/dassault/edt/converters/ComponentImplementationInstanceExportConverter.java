/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtimplementation.DynamicTriggerInstance;
import edtimplementation.ModuleInstance;
import edtimplementation.Parameter;
import edtimplementation.PinfoValue;
import edtimplementation.PrivatePinfoValue;
import edtimplementation.PropertyValue;
import edtimplementation.PublicPinfoValue;
import edtimplementation.TriggerInstance;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 *
 */
public class ComponentImplementationInstanceExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationInstanceExportConverter() {

	}

	/**
	 * 
	 * @param edtModuleInstance
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.ModuleInstance recreateECOAModuleInstance(
			ModuleInstance edtModuleInstance) {
		technology.ecoa.implementation._2.ModuleInstance ecoaModuleInstance = IMPFACTORY.createModuleInstance();

		ecoaModuleInstance.setName(edtModuleInstance.getName());
		if (edtModuleInstance.getModuleBehaviour() != null && !edtModuleInstance.getModuleBehaviour().isBlank()) {
			ecoaModuleInstance.setModuleBehaviour(edtModuleInstance.getModuleBehaviour());
		}
		ecoaModuleInstance.setRelativePriority(edtModuleInstance.getRelativePriority());

		if (edtModuleInstance.getModuleImplementation() != null) {
			ecoaModuleInstance.setImplementationName(edtModuleInstance.getModuleImplementation().getName());
		}

		// Recreate PINFOs
		EList<PinfoValue> edtPinfos = edtModuleInstance.getPinfo();
		if (!edtPinfos.isEmpty()) {
			technology.ecoa.implementation._2.PinfoType ecoaPinfoType = IMPFACTORY.createPinfoType();
			for (PinfoValue edtPinfoValue : edtPinfos) {
				technology.ecoa.implementation._2.PinfoValue ecoaPinfoValue = IMPFACTORY.createPinfoValue();
				ecoaPinfoValue.setName(edtPinfoValue.getName());
				if (edtPinfoValue.getValue() != null && !edtPinfoValue.getValue().isBlank()) {
					ecoaPinfoValue.setValue(edtPinfoValue.getValue());
				}
				if (edtPinfoValue instanceof PublicPinfoValue edtPublicPinfo) {
					ecoaPinfoType.getPublicPinfo().add(ecoaPinfoValue);
				} else if (edtPinfoValue instanceof PrivatePinfoValue edtPrivatePinfo) {
					ecoaPinfoType.getPrivatePinfo().add(ecoaPinfoValue);
				}
			}
			ecoaModuleInstance.setPinfo(ecoaPinfoType);
		}

//		Recreate Properties
		EList<PropertyValue> edtProperties = edtModuleInstance.getPropertyValues();
		if (!edtProperties.isEmpty()) {
			technology.ecoa.implementation._2.PropertyValues ecoaPropertiesValues = IMPFACTORY.createPropertyValues();
			for (PropertyValue edtPropertyValue : edtProperties) {
				technology.ecoa.implementation._2.PropertyValue ecoaProperty = IMPFACTORY.createPropertyValue();
				ecoaProperty.setName(edtPropertyValue.getName());
				if (edtPropertyValue.getValue() != null && !edtPropertyValue.getValue().isBlank()) {
					ecoaProperty.setValue(edtPropertyValue.getValue());
				}

				ecoaPropertiesValues.getPropertyValue().add(ecoaProperty);

			}
			ecoaModuleInstance.setPropertyValues(ecoaPropertiesValues);
		}

		return ecoaModuleInstance;
	}

	/**
	 * 
	 * @param edtDynamicTriggerInstance
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.DynamicTriggerInstance recreateECOADynamicTriggerInstance(
			DynamicTriggerInstance edtDynamicTriggerInstance) {
		technology.ecoa.implementation._2.DynamicTriggerInstance ecoaDynamicTriggerInstance = IMPFACTORY
				.createDynamicTriggerInstance();

		ecoaDynamicTriggerInstance.setName(edtDynamicTriggerInstance.getName());
		if (edtDynamicTriggerInstance.getModuleBehaviour() != null
				&& !edtDynamicTriggerInstance.getModuleBehaviour().isBlank()) {
			ecoaDynamicTriggerInstance.setModuleBehaviour(edtDynamicTriggerInstance.getModuleBehaviour());
		}
		if (edtDynamicTriggerInstance.isSetSize()) {
			ecoaDynamicTriggerInstance.setSize(edtDynamicTriggerInstance.getSize());
		}
		EList<Parameter> edtParameters = edtDynamicTriggerInstance.getParameter();
		for (Parameter edtParameter : edtParameters) {
			ecoaDynamicTriggerInstance.getParameter()
					.add(ComponentImplementationExportConverter.recreateECOAParameter(edtParameter));
		}
		ecoaDynamicTriggerInstance.setRelativePriority(edtDynamicTriggerInstance.getRelativePriority());

		return ecoaDynamicTriggerInstance;
	}

	/**
	 * 
	 * @param edtTriggerInstance
	 * @return
	 */
	static technology.ecoa.implementation._2.TriggerInstance recreateECOATriggerInstance(
			TriggerInstance edtTriggerInstance) {
		technology.ecoa.implementation._2.TriggerInstance ecoaTriggerInstance = IMPFACTORY.createTriggerInstance();
		ecoaTriggerInstance.setName(edtTriggerInstance.getName());
		if (edtTriggerInstance.getModuleBehaviour() != null && !edtTriggerInstance.getModuleBehaviour().isBlank()) {
			ecoaTriggerInstance.setModuleBehaviour(edtTriggerInstance.getModuleBehaviour());
		}
		ecoaTriggerInstance.setRelativePriority(edtTriggerInstance.getRelativePriority());

		return ecoaTriggerInstance;
	}

}
