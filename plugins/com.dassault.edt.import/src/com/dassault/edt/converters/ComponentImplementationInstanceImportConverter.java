/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.EdtimplementationFactory;
import edtproject.Step0;
import edttype.EDTDataType;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.Parameter;
import technology.ecoa.implementation._2.PinfoType;
import technology.ecoa.implementation._2.PinfoValue;
import technology.ecoa.implementation._2.PropertyValue;
import technology.ecoa.implementation._2.PropertyValues;
import technology.ecoa.implementation._2.TriggerInstance;

/**
 * 
 * Helper class to convert ECOA Model Objects to EDT.
 * 
 */
public class ComponentImplementationInstanceImportConverter {
	private static final String WITH_THE_NAME = " with the name :";
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationInstanceImportConverter() {
	}

	/**
	 * 
	 * @param ecoaParameter
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.Parameter createEDTParameter(Parameter ecoaParameter, Step0 typeStep)
			throws FailedImportException {
		edtimplementation.Parameter edtParameter = EDTIMPFACTORY.createParameter();
		edtParameter.setName(ecoaParameter.getName());
		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaParameter.getType());
		if (edtDataType != null) {
			edtParameter.setType(edtDataType);
		} else {
			throw new FailedImportException("No Type was found with the name :" + ecoaParameter.getType());
		}

		return edtParameter;
	}

	/**
	 * 
	 * @param ecoaModuleInstance
	 * @param edtModuleImplementations
	 * @return
	 * @throws FailedImportException
	 */
	static edtimplementation.ModuleInstance createEDTModuleInstance(ModuleInstance ecoaModuleInstance,
			edtimplementation.ComponentImplementation edtComponentImplementation) throws FailedImportException {
		edtimplementation.ModuleInstance edtModuleInstance = EDTIMPFACTORY.createModuleInstance();

		edtModuleInstance.setName(ecoaModuleInstance.getName());
		edtModuleInstance.setModuleBehaviour(ecoaModuleInstance.getModuleBehaviour());

		edtModuleInstance.setRelativePriority(ecoaModuleInstance.getRelativePriority());

		String moduleImplementationName = ecoaModuleInstance.getImplementationName();
		edtimplementation.ModuleImplementation moduleImplementation = edtComponentImplementation
				.findModuleImplementationByName(moduleImplementationName);
		if (moduleImplementation != null) {
			edtModuleInstance.setModuleImplementation(moduleImplementation);
			edtModuleInstance.setModuleType(moduleImplementation.getModuleType());
		} else {
			throw new FailedImportException(
					"No ModuleImplementation was found with the name :" + moduleImplementationName);
		}

		if (ecoaModuleInstance.getPinfo() != null && edtModuleInstance.getModuleType() != null
				&& edtModuleInstance.getModuleType().getPinfo() != null) {
			edtimplementation.ModuleType edtModuleType = edtModuleInstance.getModuleType();
			PinfoType ecoaPinfoValueInstance = ecoaModuleInstance.getPinfo();
			createEDTPinfoValue(edtModuleInstance, edtModuleType, ecoaPinfoValueInstance);
		}

		if (ecoaModuleInstance.getPropertyValues() != null && edtModuleInstance.getModuleType() != null
				&& edtModuleInstance.getModuleType().getProperties() != null) {
			edtimplementation.ModuleType edtModuleType = edtModuleInstance.getModuleType();
			PropertyValues ecoaPropertyValueInstance = ecoaModuleInstance.getPropertyValues();
			createEDTPropertyValue(edtModuleInstance, edtModuleType, ecoaPropertyValueInstance);
		}

		return edtModuleInstance;
	}

	/**
	 * @param edtModuleInstance
	 * @param edtPinfoType
	 * @param ecoaPinfoValueInstance
	 * @throws FailedImportException
	 */
	private static void createEDTPinfoValue(edtimplementation.ModuleInstance edtModuleInstance,
			edtimplementation.ModuleType edtModuleType, PinfoType ecoaPinfoValueInstance) throws FailedImportException {
		EList<PinfoValue> ecoaPrivatePinfo = ecoaPinfoValueInstance.getPrivatePinfo();
		for (PinfoValue pinfoValue : ecoaPrivatePinfo) {
			String name = pinfoValue.getName();
			edtimplementation.PrivatePinfo privatePinfoType = edtModuleType.findPrivatePinfoByName(name);
			if (privatePinfoType == null) {
				throw new FailedImportException("No PrivatePinfo was found in "
						+ edtModuleInstance.getModuleType().getName() + WITH_THE_NAME + name);
			}
			edtimplementation.PrivatePinfoValue privatePinfoValue = EDTIMPFACTORY.createPrivatePinfoValue();
			privatePinfoValue.setPrivatePinfoFromModuleType(privatePinfoType);
			privatePinfoValue.setName(name);
			privatePinfoValue.setValue(pinfoValue.getValue());
			edtModuleInstance.getPinfo().add(privatePinfoValue);
		}

		EList<PinfoValue> ecoaPublicPinfo = ecoaPinfoValueInstance.getPublicPinfo();
		for (PinfoValue pinfoValue : ecoaPublicPinfo) {
			String name = pinfoValue.getName();
			edtimplementation.PublicPinfo publicPinfoType = edtModuleType.findPublicPinfoByName(name);
			if (publicPinfoType == null) {
				throw new FailedImportException("No PublicPinfo was found in "
						+ edtModuleInstance.getModuleType().getName() + WITH_THE_NAME + name);
			}
			edtimplementation.PublicPinfoValue publicPinfoValue = EDTIMPFACTORY.createPublicPinfoValue();
			publicPinfoValue.setPublicPinfoFromModuleType(publicPinfoType);
			publicPinfoValue.setName(name);
			publicPinfoValue.setValue(pinfoValue.getValue());
			edtModuleInstance.getPinfo().add(publicPinfoValue);
		}
	}

	/**
	 * @param edtModuleInstance
	 * @param edtPropertyTypes
	 * @param ecoaPropertyValuesInstance
	 * @throws FailedImportException
	 */
	private static void createEDTPropertyValue(edtimplementation.ModuleInstance edtModuleInstance,
			edtimplementation.ModuleType edtModuleType, PropertyValues ecoaPropertyValuesInstance)
			throws FailedImportException {
		EList<PropertyValue> ecoaPropertyValues = ecoaPropertyValuesInstance.getPropertyValue();
		for (PropertyValue ecoaPropertyValue : ecoaPropertyValues) {
			String name = ecoaPropertyValue.getName();
			edtimplementation.ModuleTypeProperty propertyType = edtModuleType.findPropertyTypeByName(name);
			if (propertyType == null) {
				throw new FailedImportException("No Property was found in "
						+ edtModuleInstance.getModuleType().getName() + WITH_THE_NAME + name);
			}
			edtimplementation.PropertyValue edtPropertyValue = EDTIMPFACTORY.createPropertyValue();
			edtPropertyValue.setPropertyType(propertyType);
			edtPropertyValue.setName(name);
			edtPropertyValue.setValue(ecoaPropertyValue.getValue());
			edtModuleInstance.getPropertyValues().add(edtPropertyValue);
		}
	}

	/**
	 * 
	 * @param ecoaDynamicTriggerInstance
	 * @return
	 * @throws FailedImportException
	 */
	static edtimplementation.DynamicTriggerInstance createEDTDynamicTriggerInstance(
			DynamicTriggerInstance ecoaDynamicTriggerInstance, Step0 typeStep) throws FailedImportException {
		edtimplementation.DynamicTriggerInstance edtDynamicTriggerInstance = EDTIMPFACTORY
				.createDynamicTriggerInstance();

		edtDynamicTriggerInstance.setName(ecoaDynamicTriggerInstance.getName());
		edtDynamicTriggerInstance.setModuleBehaviour(ecoaDynamicTriggerInstance.getModuleBehaviour());
		if (ecoaDynamicTriggerInstance.isSetSize()) {
			edtDynamicTriggerInstance.setSize(ecoaDynamicTriggerInstance.getSize());
		}
		EList<Parameter> ecoaParameters = ecoaDynamicTriggerInstance.getParameter();
		for (Parameter parameter : ecoaParameters) {
			edtDynamicTriggerInstance.getParameter().add(createEDTParameter(parameter, typeStep));
		}
		edtDynamicTriggerInstance.setRelativePriority(ecoaDynamicTriggerInstance.getRelativePriority());
		edtimplementation.DynamicTriggerEventReceiverInstance reset = EDTIMPFACTORY
				.createDynamicTriggerEventReceiverInstance();
		reset.setName("reset");
		edtimplementation.DynamicTriggerEventReceiverInstance in = EDTIMPFACTORY
				.createDynamicTriggerEventReceiverInstance();
		in.setName("in");
		edtimplementation.DynamicTriggerEventSenderInstance out = EDTIMPFACTORY
				.createDynamicTriggerEventSenderInstance();
		out.setName("out");
		edtDynamicTriggerInstance.getOperations().add(reset);
		edtDynamicTriggerInstance.getOperations().add(in);
		edtDynamicTriggerInstance.getOperations().add(out);

		return edtDynamicTriggerInstance;
	}

	/**
	 * 
	 * @param ecoaTriggerInstance
	 * @return
	 */
	static edtimplementation.TriggerInstance createEDTTriggerInstance(TriggerInstance ecoaTriggerInstance) {
		edtimplementation.TriggerInstance edtTriggerInstance = EDTIMPFACTORY.createTriggerInstance();

		edtTriggerInstance.setName(ecoaTriggerInstance.getName());
		edtTriggerInstance.setModuleBehaviour(ecoaTriggerInstance.getModuleBehaviour());
		edtTriggerInstance.setRelativePriority(ecoaTriggerInstance.getRelativePriority());
		edtimplementation.TriggerSender triggerOperation = EDTIMPFACTORY.createTriggerSender();
		triggerOperation.setName("out");
		edtTriggerInstance.setOperations(triggerOperation);
		return edtTriggerInstance;
	}

}
