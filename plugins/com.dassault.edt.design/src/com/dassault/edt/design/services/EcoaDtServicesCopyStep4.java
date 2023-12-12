/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtbin.BinDesc;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventReceived;
import edtimplementation.EventSent;
import edtimplementation.EventType;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationInstance;
import edtimplementation.Parameter;
import edtimplementation.PinfoValue;
import edtimplementation.PrivatePinfo;
import edtimplementation.PropertyValue;
import edtimplementation.PublicPinfo;
import edtimplementation.RequestReceived;
import edtimplementation.RequestResponseType;
import edtimplementation.RequestSent;
import edtimplementation.TriggerInstance;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataWritten;
import edtproject.Step4;
import edtqos.EdtqosFactory;
import edtqos.ServiceInstanceQos;
import technology.ecoa.bin.desc._2.BinaryDependency;
import technology.ecoa.bin.desc._2.binFactory;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesCopyStep4 {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Creates copy of Associated QoS of ComponentImplementation
	 * 
	 * @param componentImplementationToCopy : element copied
	 * 
	 * @return list of copies
	 */
	public EList<ServiceInstanceQos> copyComponentImplementationAssociatedQoS(
			ComponentImplementation componentImplementationToCopy) {
		EList<ServiceInstanceQos> qosToCopy = componentImplementationToCopy.getAssociatedServiceQos();
		EList<ServiceInstanceQos> copiedEList = new BasicEList<>();
		ServiceInstanceQos copied;
		for (ServiceInstanceQos qos : qosToCopy) {
			copied = EdtqosFactory.eINSTANCE.createServiceInstanceQos();
			copied.setName(qos.getName());
			copied.getOperations().addAll(EcoaDtServicesCopy.copyQoSOperations(qos));
			copied.setServiceDefinition(qos.getServiceDefinition());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 *
	 * Creates copy of References of ComponentImplementation
	 * 
	 * @param componentImplementationToCopy : element copied
	 * @param newComponentImplementation    :
	 * @return list of copies
	 */
	public EList<ComponentImplementationReference> copyComponentImplementationReferences(
			ComponentImplementation componentImplementationToCopy, ComponentImplementation newComponentImplementation) {
		EList<ComponentImplementationReference> referencesToCopy = componentImplementationToCopy.getReferences();
		EList<ComponentImplementationReference> copiedEList = new BasicEList<>();
		ComponentImplementationReference copied;
		for (ComponentImplementationReference ref : referencesToCopy) {
			copied = EdtimplementationFactory.eINSTANCE.createComponentImplementationReference();
			copied.setComponentDefinitionReference(ref.getComponentDefinitionReference());
			copied.setNewQos(findQoSInNewComponentImplementation(newComponentImplementation.getAssociatedServiceQos(),
					ref.getNewQos().getName()));
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Services of ComponentImplementation
	 * 
	 * @param componentImplementationToCopy : element to copy
	 * @param newComponentImplementation    : copy
	 * @return list of copies
	 */
	public EList<ComponentImplementationService> copyComponentImplementationServices(
			ComponentImplementation componentImplementationToCopy, ComponentImplementation newComponentImplementation) {
		EList<ComponentImplementationService> servicesToCopy = componentImplementationToCopy.getServices();
		EList<ComponentImplementationService> copiedEList = new BasicEList<>();
		ComponentImplementationService copied;
		for (ComponentImplementationService serv : servicesToCopy) {
			copied = EdtimplementationFactory.eINSTANCE.createComponentImplementationService();
			copied.setComponentDefinitionService(serv.getComponentDefinitionService());
			copied.setNewQos(findQoSInNewComponentImplementation(newComponentImplementation.getAssociatedServiceQos(),
					serv.getNewQos().getName()));
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Find copy of Qos
	 * 
	 * @param qosList : list of copied QoS
	 * @param name    : name of QoS copied
	 * @return copied QoS
	 */
	public ServiceInstanceQos findQoSInNewComponentImplementation(EList<ServiceInstanceQos> qosList, String name) {
		for (ServiceInstanceQos serviceInstanceQos : qosList) {
			if (Objects.equals(serviceInstanceQos.getName(), name)) {
				return serviceInstanceQos;
			}
		}
		return null;
	}

	/**
	 * Creates copy of ModuleTypes of ComponentImplementation
	 * 
	 * @param moduleTypeToCopy : element to copy
	 * @param newModuleType    : copy
	 * @return copy's name
	 */
	public String copyModuleTypeAndRename(ModuleType moduleTypeToCopy, ModuleType newModuleType) {
		if (moduleTypeToCopy.isSetActivatingFaultNotifs()) {
			newModuleType.setActivatingFaultNotifs(moduleTypeToCopy.isActivatingFaultNotifs());
		}

		if (moduleTypeToCopy.isSetHasUserContext()) {
			newModuleType.setHasUserContext(moduleTypeToCopy.isHasUserContext());
		}

		if (moduleTypeToCopy.isSetHasWarmStartContext()) {
			newModuleType.setHasWarmStartContext(moduleTypeToCopy.isHasWarmStartContext());
		}

		if (moduleTypeToCopy.isSetIsFaultHandler()) {
			newModuleType.setIsFaultHandler(moduleTypeToCopy.isIsFaultHandler());
		}

		newModuleType.getPinfo().addAll(EcoreUtil.copyAll(moduleTypeToCopy.getPinfo()));
		newModuleType.getOperations().addAll(EcoreUtil.copyAll(moduleTypeToCopy.getOperations()));
		newModuleType.getProperties().addAll(EcoreUtil.copyAll(moduleTypeToCopy.getProperties()));
		return setNameToCopyOfModuleType(moduleTypeToCopy);
	}

	/**
	 * Creates copy of ModuleImplementations of ComponentImplementation
	 * 
	 * @param moduleImplementationToCopy : element to copy
	 * @param newModuleImplementation    : copy
	 * @return copy's name
	 */
	public String copyModuleImplementationAndRename(ModuleImplementation moduleImplementationToCopy,
			ModuleImplementation newModuleImplementation) {
		newModuleImplementation.setLanguage(moduleImplementationToCopy.getLanguage());
		newModuleImplementation.setModuleType(moduleImplementationToCopy.getModuleType());
		return setNameToCopyOfModuleImplementation(moduleImplementationToCopy);
	}

	/**
	 * Creates copy of ModuleInstance of ComponentImplementation
	 * 
	 * @param moduleInstanceToCopy : element to copy
	 * @param newModuleInstance    : copy
	 * @return copy's name
	 */
	public String copyModuleInstanceAndRename(ModuleInstance moduleInstanceToCopy, ModuleInstance newModuleInstance) {
		newModuleInstance.setModuleImplementation(moduleInstanceToCopy.getModuleImplementation());
		newModuleInstance.setModuleBehaviour(moduleInstanceToCopy.getModuleBehaviour());
		newModuleInstance.setRelativePriority(moduleInstanceToCopy.getRelativePriority());
		Collection<PropertyValue> propertyCopy = EcoreUtil.copyAll(moduleInstanceToCopy.getPropertyValues());
		for (PropertyValue propertyValue : propertyCopy) {
			newModuleInstance.getPropertyValues().add(propertyValue);
		}
		Collection<PinfoValue> pinfoCopy = EcoreUtil.copyAll(moduleInstanceToCopy.getPinfo());
		for (PinfoValue pinfoValue : pinfoCopy) {
			newModuleInstance.getPinfo().add(pinfoValue);
		}
		return setNameToCopyOfModuleInstance(newModuleInstance);
	}

	/**
	 * Creates copy of TriggerInstance of ComponentImplementation
	 * 
	 * @param triggerInstanceToCopy : element to copy
	 * @param newTriggerInstance    : copy
	 * @return copy's name
	 */
	public String copyTriggerInstanceAndRename(TriggerInstance triggerInstanceToCopy,
			TriggerInstance newTriggerInstance) {
		newTriggerInstance.setModuleBehaviour(triggerInstanceToCopy.getModuleBehaviour());
		newTriggerInstance.setRelativePriority(triggerInstanceToCopy.getRelativePriority());
		OperationInstance operation = EcoreUtil.copy(triggerInstanceToCopy.getOperations());
		newTriggerInstance.setOperations(operation);
		return setNameToCopyOfTriggerInstance(triggerInstanceToCopy);
	}

	/**
	 * Creates copy of DynamicTriggerInstance of ComponentImplementation
	 * 
	 * @param dynamicTriggerInstanceToCopy : element to copy
	 * @param newDynamicTriggerInstance    : copy
	 * @return copy's name
	 */
	public String copyDynamicTriggerInstanceAndRename(DynamicTriggerInstance dynamicTriggerInstanceToCopy,
			DynamicTriggerInstance newDynamicTriggerInstance) {
		newDynamicTriggerInstance.setModuleBehaviour(dynamicTriggerInstanceToCopy.getModuleBehaviour());
		newDynamicTriggerInstance.setRelativePriority(dynamicTriggerInstanceToCopy.getRelativePriority());
		newDynamicTriggerInstance.getOperations()
				.addAll(EcoreUtil.copyAll(dynamicTriggerInstanceToCopy.getOperations()));
		newDynamicTriggerInstance.getParameter().addAll(EcoreUtil.copyAll(dynamicTriggerInstanceToCopy.getParameter()));
		return setNameToCopyOfDynamicTriggerInstance(dynamicTriggerInstanceToCopy);
	}

	/**
	 * Find copy of ModuleType
	 * 
	 * @param moduleTypeList : list of copied ModuleType
	 * @param name           : name of ModuleType copied
	 * @return copied ModuleType
	 */
	public ModuleType findModuleTypeInNewComponentImplementation(EList<ModuleType> moduleTypeList, String name) {
		for (ModuleType moduleType : moduleTypeList) {
			if (Objects.equals(moduleType.getName(), name)) {
				return moduleType;
			}
		}
		return null;
	}

	/**
	 * Creates copy of ModuleImplementations of ComponentImplementation
	 * 
	 * @param componentImplementationToCopy : element to copy
	 * @return list of copies
	 */
	public EList<Instance> copyModuleInstance(ComponentImplementation componentImplementationToCopy) {
		EList<Instance> instancesToCopy = componentImplementationToCopy.getInstances();
		EList<Instance> copiedEList = new BasicEList<>();

		ModuleInstance copied;
		for (Instance instance : instancesToCopy) {
			if (instance instanceof ModuleInstance moduleInstance) {
				copied = EdtimplementationFactory.eINSTANCE.createModuleInstance();
				copied.setModuleBehaviour(instance.getModuleBehaviour());
				copied.setModuleImplementation(moduleInstance.getModuleImplementation());
				copied.setName(instance.getName());
				copied.setRelativePriority(instance.getRelativePriority());
				copied.getPropertyValues().addAll(EcoreUtil.copyAll(moduleInstance.getPropertyValues()));
				copied.getPinfo().addAll(EcoreUtil.copyAll(moduleInstance.getPinfo()));
				copiedEList.add(copied);
			} else {
				copiedEList.add(EcoreUtil.copy(instance));
			}
		}
		return copiedEList;
	}

	/**
	 * Find copy of ModuleType
	 * 
	 * @param moduleImplementationList : list of copied ModuleType
	 * @param name                     : name of ModuleType copied
	 * @return copied ModuleType
	 */
	public ModuleImplementation findModuleImplementationInNewComponentImplementation(
			EList<ModuleImplementation> moduleImplementationList, String name) {
		for (ModuleImplementation moduleImplementation : moduleImplementationList) {
			if (Objects.equals(moduleImplementation.getName(), name)) {
				return moduleImplementation;
			}
		}
		return null;
	}

	/**
	 * Set name of a component implementation when performing a "Create Copy Of"
	 * 
	 * @param componentImplementationToCopy : element to copy
	 * @param newComponentImplementation    : copy
	 * @return the new component implementation name
	 */
	public String copyAndRenameComponentImplementation(ComponentImplementation componentImplementationToCopy,
			ComponentImplementation newComponentImplementation) {
		ComponentImplementation copy = EcoreUtil.copy(componentImplementationToCopy);
		newComponentImplementation.getModuleTypes().addAll(copy.getModuleTypes());
		newComponentImplementation.getExternalSenders().addAll(copy.getExternalSenders());
		newComponentImplementation.getModuleBehaviours().addAll(copy.getModuleBehaviours());
		newComponentImplementation.getModuleImplementations().addAll(copy.getModuleImplementations());
		newComponentImplementation.getInstances().addAll(copyModuleInstance(copy));
		newComponentImplementation.getOperationLinks().addAll(EcoaDtServicesCopyOperationLinks
				.copyOperationLinks(componentImplementationToCopy, newComponentImplementation));

		String newName = setNameToCopyOfComponentImplementation(componentImplementationToCopy);
		new EcoaDtServicesDefaultNameStep4().createComponentImplementationDiagram(newComponentImplementation, newName);
		return newName;
	}

	/**
	 * Set name of a component implementation when performing a "Create Copy Of"
	 * 
	 * @param componentImplementation : The component implementation that must
	 *                                receive a name
	 * @return the new component implementation name
	 */

	public String setNameToCopyOfComponentImplementation(ComponentImplementation componentImplementation) {
		Step4 step4 = ((Step4) componentImplementation.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + componentImplementation.getName(),
				step4.getComponentImplementations().toArray(new ComponentImplementation[0]), 0);
	}

	/**
	 * Set name of a module type when performing a "Create Copy Of"
	 * 
	 * @param moduleType : The module type that must receive a name
	 * @return the new module type name
	 */

	public String setNameToCopyOfModuleType(ModuleType moduleType) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleType.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + moduleType.getName(),
				componentImplementation.getModuleTypes().toArray(new ModuleType[0]), 0);

	}

	/**
	 * Set name of a module type data written when performing a "Create Copy Of"
	 * 
	 * @param data : The module type data written that must receive a name
	 * @return the new module type data written name
	 */

	public String setNameToCopyOfModuleTypeDataWritten(VersionedDataWritten data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of a module type data read when performing a "Create Copy Of"
	 * 
	 * @param data : The module type data read that must receive a name
	 * @return the new module type data read name
	 */

	public String setNameToCopyOfModuleTypeDataRead(VersionedDataRead data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of a module type event sent when performing a "Create Copy Of"
	 * 
	 * @param event : The module type even sent that must receive a name
	 * @return the new module type event sent name
	 */

	public String setNameToCopyOfModuleTypeEventSent(EventSent event) {
		ModuleType moduleType = ((ModuleType) event.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + event.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of a module type event received when performing a "Create Copy Of"
	 * 
	 * @param event : The module type even received that must receive a name
	 * @return the new module type event received name
	 */

	public String setNameToCopyOfModuleTypeEventReceived(EventReceived event) {
		ModuleType moduleType = ((ModuleType) event.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + event.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of event input when performing a "Create Copy Of"
	 *
	 * @param eventInput - parameter that must received name
	 * @return the new Input name
	 */
	public String setNameToCopyOfModuleTypeEventInputs(Parameter eventInput) {
		EList<Parameter> inputs = new BasicEList<>();
		if (eventInput.eContainer() instanceof EventSent eventSent) {
			inputs = eventSent.getInput();
		} else if (eventInput.eContainer() instanceof EventReceived eventReceived) {
			inputs = eventReceived.getInput();
		}
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + eventInput.getName(), inputs.toArray(new Parameter[0]),
				0);
	}

	/**
	 * Set name of a module type request received when performing a "Create Copy Of"
	 * 
	 * @param request : The module type request received that must receive a name
	 * @return the new module type request received name
	 */

	public String setNameToCopyOfModuleTypeRequestReceived(RequestReceived request) {
		ModuleType moduleType = ((ModuleType) request.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + request.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of a module type request sent when performing a "Create Copy Of"
	 * 
	 * @param request : The module type request sent that must receive a name
	 * @return the new module type request sent name
	 */

	public String setNameToCopyOfModuleTypeRequestSent(RequestSent request) {
		ModuleType moduleType = ((ModuleType) request.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + request.getName(),
				moduleType.getOperations().toArray(new ModuleOperation[0]), 0);
	}

	/**
	 * Set name of request input when performing a "Create Copy Of"
	 *
	 * @param requestInput - parameter that must received name
	 * @return the new Input name
	 */
	public String setNameToCopyOfModuleTypeRequestInputs(Parameter requestInput) {
		EList<Parameter> inputs = new BasicEList<>();
		if (requestInput.eContainer() instanceof RequestSent requestSent) {
			inputs = requestSent.getInput();
		} else if (requestInput.eContainer() instanceof RequestReceived requestReceived) {
			inputs = requestReceived.getInput();
		}
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + requestInput.getName(), inputs.toArray(new Parameter[0]),
				0);
	}

	/**
	 * Set name of request Output when performing a "Create Copy Of"
	 *
	 * @param requestOutput - parameter that must received name
	 * @return the new Output name
	 */
	public String setNameToCopyOfModuleTypeRequestOutputs(Parameter requestOutput) {
		EList<Parameter> outputs = new BasicEList<>();
		if (requestOutput.eContainer() instanceof RequestSent requestSent) {
			outputs = requestSent.getOutput();
		} else if (requestOutput.eContainer() instanceof RequestReceived requestReceived) {
			outputs = requestReceived.getOutput();
		}
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + requestOutput.getName(),
				outputs.toArray(new Parameter[0]), 0);
	}

	/**
	 * Set name of a module type property when performing a "Create Copy Of"
	 * 
	 * @param data : The module type property that must receive a name
	 * @return the new module type property name
	 */

	public String setNameToCopyOfModuleTypeProperty(ModuleTypeProperty data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				moduleType.getProperties().toArray(new ModuleTypeProperty[0]), 0);
	}

	/**
	 * Set name of a module type public Pinfo when performing a "Create Copy Of"
	 * 
	 * @param data : The module type public Pinfo that must receive a name
	 * @return the new module type public Pinfo name
	 */

	public String setNameToCopyOfModuleTypePublicPinfo(PublicPinfo data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				moduleType.getPinfo().toArray(new ModuleTypePinfo[0]), 0);
	}

	/**
	 * Set name of a module type private Pinfo when performing a "Create Copy Of"
	 * 
	 * @param data : The module type private Pinfo that must receive a name
	 * @return the new module type private Pinfo name
	 */

	public String setNameToCopyOfModuleTypePrivatePinfo(PrivatePinfo data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				moduleType.getPinfo().toArray(new ModuleTypePinfo[0]), 0);
	}

	/**
	 * Set name of a module implementation when performing a "Create Copy Of"
	 * 
	 * @param moduleImplementation : The module implementation that must receive a
	 *                             name
	 * @return the new module implementation name
	 */

	public String setNameToCopyOfModuleImplementation(ModuleImplementation moduleImplementation) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleImplementation.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + moduleImplementation.getName(),
				componentImplementation.getModuleImplementations().toArray(new ModuleImplementation[0]), 0);

	}

	/**
	 * Set name of a module instance when performing a "Create Copy Of"
	 * 
	 * @param moduleInstance : The module instance that must receive a name
	 * @return the new module instance name
	 */

	public String setNameToCopyOfModuleInstance(ModuleInstance moduleInstance) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleInstance.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + moduleInstance.getName(),
				componentImplementation.getInstances().toArray(new Instance[0]), 0);
	}

	/**
	 * Set name of a trigger instance when performing a "Create Copy Of"
	 * 
	 * @param triggerInstance : The trigger instance that must receive a name
	 * @return the new trigger instance name
	 */

	public String setNameToCopyOfTriggerInstance(TriggerInstance triggerInstance) {
		ComponentImplementation componentImplementation = (ComponentImplementation) triggerInstance.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + triggerInstance.getName(),
				componentImplementation.getInstances().toArray(new Instance[0]), 0);
	}

	/**
	 * Set name of a dynamic trigger instance when performing a "Create Copy Of"
	 * 
	 * @param dynamicTriggerInstance : The dynamic trigger instance that must
	 *                               receive a name
	 * @return the new dynamic trigger instance name
	 */

	public String setNameToCopyOfDynamicTriggerInstance(DynamicTriggerInstance dynamicTriggerInstance) {
		ComponentImplementation componentImplementation = (ComponentImplementation) dynamicTriggerInstance.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + dynamicTriggerInstance.getName(),
				componentImplementation.getInstances().toArray(new Instance[0]), 0);
	}

	/**
	 * Set name of an external when performing a "Create Copy Of"
	 * 
	 * @param external : The external that must receive a name
	 * @return the new external name
	 */

	public String setNameToCopyOfExternal(ExternalSenderOperation external) {
		ComponentImplementation componentImplementation = (ComponentImplementation) external.eContainer();
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + external.getName(),
				componentImplementation.getExternalSenders().toArray(new ExternalSenderOperation[0]), 0);
	}

	/**
	 * Creates copy of BinaryModule BinaryDependencies
	 * 
	 * @param binaryModuleToCopy : element copied
	 * @return list of copies
	 */
	public EList<BinaryDependency> copyBinaryModuleDependencies(edtbin.BinaryModule binaryModuleToCopy) {
		EList<BinaryDependency> dependenciesToCopy = binaryModuleToCopy.getBinaryDependencies();
		EList<BinaryDependency> copiedEList = new BasicEList<>();
		BinaryDependency copied;
		for (BinaryDependency dependency : dependenciesToCopy) {
			copied = binFactory.eINSTANCE.createBinaryDependency();
			copied.setChecksum(dependency.getChecksum());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of RequestResponse inputs Parameters
	 * 
	 * @param requestResponseToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyRequestResponseInput(RequestResponseType requestResponseToCopy) {
		EList<Parameter> parametersToCopy = requestResponseToCopy.getInput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = EdtimplementationFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of RequestResponse outputs Parameters
	 * 
	 * @param requestResponseToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyRequestResponseOutput(RequestResponseType requestResponseToCopy) {
		EList<Parameter> parametersToCopy = requestResponseToCopy.getOutput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = EdtimplementationFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Event inputs Parameters
	 * 
	 * @param eventToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyEventInput(EventType eventToCopy) {
		EList<Parameter> parametersToCopy = eventToCopy.getInput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = EdtimplementationFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Copy and set fileName to BinDesc copy
	 * 
	 * @param binDescToCopy : binDesc to copy
	 * @param newBinDesc    : binDesc copied
	 * @return fileName
	 */
	public String copyAndRenameBinDesc(BinDesc binDescToCopy, BinDesc newBinDesc) {
		newBinDesc.setInsertionPolicy(binDescToCopy.getInsertionPolicy());
		newBinDesc.setProcessorTargetType(binDescToCopy.getProcessorTargetType());
		newBinDesc.getBinaryModules().addAll(EcoreUtil.copyAll(binDescToCopy.getBinaryModules()));
		ComponentImplementation componentImplementation = (ComponentImplementation) binDescToCopy.eContainer();
		String name = EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + binDescToCopy.getFileName(),
				componentImplementation.getBinDesc().toArray(new BinDesc[0]), 0);
		if (name.contains("_of_bin-desc.xml")) {
			name = name.replace("_of_bin-desc.xml", ".bin-desc.xml");
		}
		return name;
	}

}
