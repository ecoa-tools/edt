/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtproject.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import edtbin.BinDesc;
import edtbin.BinaryModule;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.EventType;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.Parameter;
import edtimplementation.PinfoValue;
import edtimplementation.PropertyValue;
import edtimplementation.RequestResponseType;
import edtimplementation.TriggerInstance;
import edtimplementation.VersionedDataType;
import edtqos.ServiceInstanceQos;
import edttype.Library;
import technology.ecoa.bin.desc._2.BinaryDependency;

public class Step4Validator {

	private static final String OF_THE_COMPONENT_IMPLEMENTATION = " of the ComponentImplementation ";
	private static final String OF_THE_MODULE_TYPE = " of the ModuleType";
	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME = " is missing attributes: it must contain a name.\n";
	private static final String IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE = " is missing attributes: it must contain a name and a type.\n";
	private static final String OF_THE = " of the ";

	private Step4Validator() {

	}

	protected static void verifyComponentImplementation(ComponentImplementation componentImplementation,
			StringBuilder finalConsoleMessage) {
		StringBuilder errorMessageForConsole = new StringBuilder();
		if (componentImplementation.getName() == null || componentImplementation.getName().isBlank()
				|| componentImplementation.getComponentDefinition() == null) {
			errorMessageForConsole.append("The ComponentImplementation " + componentImplementation.getName()
					+ " is missing attributes : it must contain a name and its ComponentDefinition.\n");
		}
		EList<Library> usedLibraries = componentImplementation.getUsedLibraries();
		ArrayList<Library> missingLibrary = new ArrayList<>();

		EList<BinDesc> binDescs = componentImplementation.getBinDesc();
		for (BinDesc binDesc : binDescs) {
			verifyBinDesc(errorMessageForConsole, binDesc);
		}

		EList<ExternalSenderOperation> externalSenders = componentImplementation.getExternalSenders();
		for (ExternalSenderOperation externalSenderOperation : externalSenders) {
			verifyExternalSenderOperation(errorMessageForConsole, externalSenderOperation);
		}
		EList<Instance> instances = componentImplementation.getInstances();
		for (Instance instance : instances) {
			verifyInstance(errorMessageForConsole, instance, missingLibrary, usedLibraries);
		}

		EList<ModuleImplementation> moduleImplementations = componentImplementation.getModuleImplementations();
		for (ModuleImplementation moduleImplementation : moduleImplementations) {
			verifyModuleImplementation(componentImplementation, errorMessageForConsole, moduleImplementation);
		}
		EList<ModuleType> moduleTypes = componentImplementation.getModuleTypes();
		for (ModuleType moduleType : moduleTypes) {
			verifyModuleType(componentImplementation, errorMessageForConsole, moduleType, missingLibrary,
					usedLibraries);
		}
		EList<ComponentImplementationReference> references = componentImplementation.getReferences();
		if (!areAllComponentImplementationReferencesComplete(references)) {
			errorMessageForConsole.append(
					"One or more ComponentImplementationReference are missing attributes : they must contain a ComponentDefinitionReference and a newQoS.\n");
		}
		EList<ComponentImplementationService> services = componentImplementation.getServices();
		if (!areAllComponentImplementationServicesComplete(services)) {
			errorMessageForConsole.append(
					"One or more ComponentImplementationService are missing attributes : they must contain a ComponentDefinitionReference and a newQoS.\n");
		}

		if (!missingLibrary.isEmpty()) {
			for (Library library : missingLibrary) {
				errorMessageForConsole.append("The library/namespace " + library.getName()
						+ " is used by Operations in the Component Implementation " + componentImplementation.getName()
						+ ", but is not in the used libraries\n");
			}
		}
		if (!errorMessageForConsole.isEmpty()) {
			finalConsoleMessage.append("\n\nThe ComponentImplementation " + componentImplementation.getName()
					+ " contains errors. See below for more details.\n" + errorMessageForConsole.toString());
		}
		EList<ServiceInstanceQos> associatedServiceQos = componentImplementation.getAssociatedServiceQos();
		for (ServiceInstanceQos serviceInstanceQos : associatedServiceQos) {
			Step2Validator.verifyServiceQoS(serviceInstanceQos, finalConsoleMessage);
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param binDesc
	 */
	protected static void verifyBinDesc(StringBuilder errorMessageForConsole, BinDesc binDesc) {
		if (!binDesc.isComplete()) {
			errorMessageForConsole.append("The Binary Description " + binDesc.getFileName()
					+ " is missing attributes : it must contain a name, a ProcessorTarget Type and at least a BinaryModule.\n");
		}
		EList<BinaryModule> binaryModules = binDesc.getBinaryModules();
		for (BinaryModule binaryModule : binaryModules) {
			verifyBinaryModule(errorMessageForConsole, binDesc, binaryModule);
		}
	}

	/**
	 * @param componentImplementation
	 * @param errorMessageForConsole
	 * @param moduleType
	 * @param missingLibrary
	 * @param usedLibraries
	 */
	protected static void verifyModuleType(ComponentImplementation componentImplementation,
			StringBuilder errorMessageForConsole, ModuleType moduleType, ArrayList<Library> missingLibrary,
			EList<Library> usedLibraries) {
		if (moduleType.getName() == null || moduleType.getName().isBlank() || moduleType.getOperations().isEmpty()) {
			errorMessageForConsole.append("The ModuleType " + moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION
					+ componentImplementation.getName()
					+ " is missing attributes: it must contain a name and at least one operation.\n");

		}
		EList<ModuleOperation> operations = moduleType.getOperations();
		for (ModuleOperation operation : operations) {
			verifyModuleOperation(componentImplementation, errorMessageForConsole, moduleType, operation,
					missingLibrary, usedLibraries);
		}
		EList<ModuleTypePinfo> pinfo = moduleType.getPinfo();
		for (ModuleTypePinfo moduleTypePinfo : pinfo) {
			if (moduleTypePinfo.getName() == null || moduleTypePinfo.getName().isBlank()) {
				errorMessageForConsole
						.append("The " + moduleTypePinfo.getClass().getSimpleName() + " " + moduleTypePinfo.getName()
								+ OF_THE_MODULE_TYPE + moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION
								+ componentImplementation.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);

			}
		}
		EList<ModuleTypeProperty> properties = moduleType.getProperties();
		for (ModuleTypeProperty moduleTypeProperty : properties) {
			if (!moduleTypeProperty.isComplete()) {
				errorMessageForConsole.append("The Property " + moduleTypeProperty.getName() + OF_THE_MODULE_TYPE
						+ moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION + componentImplementation.getName()
						+ IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);

			}
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, moduleTypeProperty.getType());
		}
	}

	/**
	 * @param componentImplementation
	 * @param errorMessageForConsole
	 * @param moduleType
	 * @param operation
	 * @param missingLibrary
	 * @param usedLibraries
	 */
	protected static void verifyModuleOperation(ComponentImplementation componentImplementation,
			StringBuilder errorMessageForConsole, ModuleType moduleType, ModuleOperation operation,
			ArrayList<Library> missingLibrary, EList<Library> usedLibraries) {
		if (operation instanceof VersionedDataType data) {
			if (!operation.isComplete()) {
				errorMessageForConsole.append("The " + operation.getClass().getSimpleName() + " " + operation.getName()
						+ OF_THE_MODULE_TYPE + moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION
						+ componentImplementation.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);
			}
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, data.getType());

		} else if (operation instanceof EventType event) {
			verifyEventType(componentImplementation, errorMessageForConsole, moduleType, operation, event,
					missingLibrary, usedLibraries);
		} else if (operation instanceof RequestResponseType rr) {
			verifyRequestResponseType(componentImplementation, errorMessageForConsole, moduleType, operation, rr,
					missingLibrary, usedLibraries);
		}
	}

	/**
	 * @param componentImplementation
	 * @param errorMessageForConsole
	 * @param moduleType
	 * @param operation
	 * @param rr
	 * @param usedLibraries
	 * @param missingLibrary
	 */
	protected static void verifyRequestResponseType(ComponentImplementation componentImplementation,
			StringBuilder errorMessageForConsole, ModuleType moduleType, ModuleOperation operation,
			RequestResponseType rr, ArrayList<Library> missingLibrary, EList<Library> usedLibraries) {
		if (!operation.isComplete()) {
			errorMessageForConsole.append("The " + operation.getClass().getSimpleName() + " " + operation.getName()
					+ OF_THE_MODULE_TYPE + moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION
					+ componentImplementation.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);
		}
		EList<Parameter> inputs = rr.getInput();
		for (Parameter parameter : inputs) {
			if (!parameter.isComplete()) {
				errorMessageForConsole.append("The input " + parameter.getName() + OF_THE
						+ operation.getClass().getSimpleName() + " " + operation.getName() + OF_THE_MODULE_TYPE
						+ moduleType.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);

			}
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, parameter.getType());
		}
		EList<Parameter> outputs = rr.getOutput();
		for (Parameter parameter : outputs) {
			if (!parameter.isComplete()) {
				errorMessageForConsole.append("The output " + parameter.getName() + OF_THE
						+ operation.getClass().getSimpleName() + " " + operation.getName() + OF_THE_MODULE_TYPE
						+ moduleType.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);

			}
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, parameter.getType());
		}

	}

	/**
	 * @param componentImplementation
	 * @param errorMessageForConsole
	 * @param moduleType
	 * @param operation
	 * @param event
	 * @param usedLibraries
	 * @param missingLibrary
	 */
	protected static void verifyEventType(ComponentImplementation componentImplementation,
			StringBuilder errorMessageForConsole, ModuleType moduleType, ModuleOperation operation, EventType event,
			ArrayList<Library> missingLibrary, EList<Library> usedLibraries) {
		if (!operation.isComplete()) {
			errorMessageForConsole.append("The " + operation.getClass().getSimpleName() + " " + operation.getName()
					+ OF_THE_MODULE_TYPE + moduleType.getName() + OF_THE_COMPONENT_IMPLEMENTATION
					+ componentImplementation.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME);
		}
		EList<Parameter> inputs = event.getInput();
		for (Parameter parameter : inputs) {
			if (!parameter.isComplete()) {
				errorMessageForConsole.append("The input " + parameter.getName() + OF_THE
						+ operation.getClass().getSimpleName() + " " + operation.getName() + OF_THE_MODULE_TYPE
						+ moduleType.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);

			}
			EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, parameter.getType());
		}
	}

	/**
	 * @param componentImplementation
	 * @param errorMessageForConsole
	 * @param moduleImplementation
	 */
	protected static void verifyModuleImplementation(ComponentImplementation componentImplementation,
			StringBuilder errorMessageForConsole, ModuleImplementation moduleImplementation) {
		if (!moduleImplementation.isComplete()) {
			errorMessageForConsole.append("The ModuleImplementation " + moduleImplementation.getName()
					+ OF_THE_COMPONENT_IMPLEMENTATION + componentImplementation.getName()
					+ " is missing attributes: it must contain a name, a language and its ModuleType.\n");

		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param externalSenderOperation
	 */
	protected static void verifyExternalSenderOperation(StringBuilder errorMessageForConsole,
			ExternalSenderOperation externalSenderOperation) {
		if (externalSenderOperation.getLanguage() == null || externalSenderOperation.getName() == null
				|| externalSenderOperation.getName().isBlank()) {
			errorMessageForConsole.append("The External Sender " + externalSenderOperation.getName()
					+ " is missing attributes : it must contain a name and a Language.\n");

		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param instance
	 * @param usedLibraries
	 * @param missingLibrary
	 */
	protected static void verifyInstance(StringBuilder errorMessageForConsole, Instance instance,
			ArrayList<Library> missingLibrary, EList<Library> usedLibraries) {
		if (instance instanceof ModuleInstance mi) {
			verifyModuleInstane(errorMessageForConsole, instance, mi);
		} else if (instance instanceof TriggerInstance) {
			if (!instance.isComplete()) {
				errorMessageForConsole.append("The TriggerInstance " + instance.getName()
						+ " is missing attributes, it must contain a name and a relative priority.\n");
			}
		} else if (instance instanceof edtimplementation.DynamicTriggerInstance dti) {
			if (!instance.isComplete()) {
				errorMessageForConsole.append("The DynamicTriggerInstance " + instance.getName()
						+ " is missing attributes, it must contain a name and a relative priority.\n");
			}
			EList<Parameter> parameters = dti.getParameter();
			for (Parameter parameter : parameters) {
				if (!parameter.isComplete()) {
					errorMessageForConsole
							.append("The parameter " + parameter.getName() + OF_THE + " DynamicTriggerInstance "
									+ dti.getName() + IS_MISSING_ATTRIBUTES_IT_MUST_CONTAIN_A_NAME_AND_A_TYPE);

				}
				EDTProjectValidator.verifyIfMissingLibrary(usedLibraries, missingLibrary, parameter.getType());

			}
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param instance
	 * @param mi
	 */
	protected static void verifyModuleInstane(StringBuilder errorMessageForConsole, Instance instance,
			ModuleInstance mi) {
		if (!instance.isComplete()) {
			errorMessageForConsole.append("The ModuleInstance " + instance.getName()
					+ " is missing attributes, it must contain a name, a relative priority and a ModuleImplementation.\n");
		}
		EList<PinfoValue> pinfo = mi.getPinfo();
		for (PinfoValue pinfoValue : pinfo) {
			if (!pinfoValue.isComplete()) {
				errorMessageForConsole.append("The " + pinfo.getClass().getSimpleName() + " " + pinfoValue.getName()
						+ " of the ModuleInstance " + instance.getName()
						+ " is missing attributes, it must contain a name and a value.\n");

			}
		}
		EList<PropertyValue> propertyValues = mi.getPropertyValues();
		for (PropertyValue propertyValue : propertyValues) {
			if (!propertyValue.isComplete()) {
				errorMessageForConsole.append("The PropertyValue " + propertyValue.getName() + " of the ModuleInstance "
						+ instance.getName() + " is missing attributes, it must contain a name and a value.\n");

			}
		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param binDesc
	 * @param binaryModule
	 */
	protected static void verifyBinaryModule(StringBuilder errorMessageForConsole, BinDesc binDesc,
			BinaryModule binaryModule) {
		if (!binaryModule.isComplete()) {
			errorMessageForConsole.append("A BinaryModule of the BinaryDescription " + binDesc.getFileName()
					+ " is missing attributes: it must contain a reference, an object, an userContextSize, a warmStartContextSize, a stackSize, a heapSize and a checksum.\n");
		}
		EList<BinaryDependency> binaryDependencies = binaryModule.getBinaryDependencies();
		if (!areAllBinaryDependenciesComplete(binaryDependencies)) {
			errorMessageForConsole.append("One or more Binary Dependency of the Binary Description "
					+ binDesc.getFileName() + " are missing attributes : it must contain a Checksum and an Object.\n");

		}
	}

	/**
	 * @param errorMessageForConsole
	 * @param binDesc
	 * @param binaryDependencies
	 */
	protected static boolean areAllBinaryDependenciesComplete(EList<BinaryDependency> binaryDependencies) {
		for (BinaryDependency binaryDependency : binaryDependencies) {
			if (binaryDependency.getChecksum() == null || binaryDependency.getChecksum().isBlank()
					|| binaryDependency.getObject() == null || binaryDependency.getObject().isBlank()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param componentImplementationReferences
	 */
	protected static boolean areAllComponentImplementationReferencesComplete(
			EList<ComponentImplementationReference> componentImplementationReferences) {
		for (ComponentImplementationReference componentImplementationReference : componentImplementationReferences) {
			if (!componentImplementationReference.isComplete()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param componentImplementationServices
	 */
	protected static boolean areAllComponentImplementationServicesComplete(
			EList<ComponentImplementationService> componentImplementationServices) {
		for (ComponentImplementationService componentImplementationService : componentImplementationServices) {
			if (!componentImplementationService.isComplete()) {
				return false;
			}
		}
		return true;
	}
}
