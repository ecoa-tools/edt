/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

import edtbin.BinDesc;
import edtdeployment.ComponentLog;
import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.ModuleLog;
import edtdeployment.PlatformConfiguration;
import edtdeployment.PlatformMessage;
import edtdeployment.WireMapping;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationReference;
import edtimplementation.ComponentImplementationService;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleInstance;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.TriggerInstance;
import edtinterface.Event;
import edtproject.Component;
import edtproject.ComponentReference;
import edtproject.Composite;
import edtproject.FinalAssembly;
import edtproject.ServiceLink;
import edtproject.Steps;
import edtuid.ID;
import technology.ecoa.interface_._2.EEventDirection;

/**
 * Helper functions
 * 
 */
public class EcoaDtServicesUtils {

	/**
	 * Finds all the objects referencing eObject.
	 * 
	 * @param eObject The data type to gather all the cross references
	 * @return the list of all the referencing objects
	 */
	public static EList<EObject> findCrossReferences(EObject eObject) {
		EList<EObject> value = new BasicEList<>();
		Steps steps = Steps.findStepsContainer(eObject);
		Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(eObject, steps);
		crossReferences.forEach(setting -> value.add(setting.getEObject()));

		return value;
	}

	/**
	 * Create label for ID (source:target:operation)
	 * 
	 * @param id : ID to label
	 * @return label
	 */
	public static String getIDKey(ID id) {
		String name = "";
		if (id.getServiceLink() != null) {
			if (id.getServiceLink().getSource() != null) {
				name = name.concat(id.getServiceLink().getSource().getWireString());
			}
			name = name.concat(":");
			if (id.getServiceLink().getTarget() != null) {
				name = name.concat(id.getServiceLink().getTarget().getWireString());
			}
			name = name.concat(":");
			if (id.getOperation() != null) {
				name = name.concat(id.getOperation().getName());
			}
		} else {
			name = "::";
		}
		return name;
	}

	/**
	 * Check direction of defining event
	 * 
	 * @param op : operation
	 * @return true if sent
	 */
	public static Boolean checkDirectionSent(OperationInstance op) {
		return op instanceof EventDefinitionInstance event && event.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.SENTBYPROVIDER);
	}

	/**
	 * Check direction of defining event
	 * 
	 * @param op : operation
	 * @return true if received
	 */
	public static Boolean checkDirectionReceived(OperationInstance op) {
		return op instanceof EventDefinitionInstance event && event.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.RECEIVEDBYPROVIDER);
	}

	/**
	 * Check if Operation is sender
	 * 
	 * @param op : operation
	 * @return false if receiver
	 */
	public static boolean checkSender(OperationInstance op) {
		if (op instanceof EventDefinitionInstance event && checkDirectionSent(op)) {
			return (event.eContainer() instanceof ReferenceOfLinkedComponentDefinition);
		} else if (op instanceof EventDefinitionInstance event && checkDirectionReceived(op)) {
			return (event.eContainer() instanceof ServiceOfLinkedComponentDefinition);
		} else {
			return false;
		}
	}

	/**
	 * Check if Operation is receiver
	 * 
	 * @param op : operation
	 * @return false if sender
	 */
	public static boolean checkReceiver(OperationInstance op) {
		if (op instanceof EventDefinitionInstance event && event.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.SENTBYPROVIDER)) {
			return (event.eContainer() instanceof ServiceOfLinkedComponentDefinition);
		} else if (op instanceof EventDefinitionInstance event && event.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.RECEIVEDBYPROVIDER)) {
			return (event.eContainer() instanceof ReferenceOfLinkedComponentDefinition);
		} else {
			return false;
		}
	}

	/**
	 * Determines if composite is a initialAssembly or finalAssembly
	 * 
	 * @param eObject : composite or finalAssembly to test
	 * @return true if finalAssembly
	 */
	public static boolean implementationSetInComponent(EObject eObject) {
		if (eObject instanceof Composite composite) {
			EList<Component> components = composite.getComponents();
			for (Component component : components) {
				if (component.getComponentImplementation() != null) {
					return true;
				}
			}
		} else if (eObject instanceof FinalAssembly finalAssembly) {
			return implementationSetInComponent(finalAssembly.getFinalAssembly());
		}
		return false;
	}

	/**
	 * Assert if Operation has links
	 * 
	 * @param operationInstance : operation to verify
	 * @return true if no links
	 */
	public static boolean hasNoLinks(OperationInstance operationInstance) {
		Boolean hasNoOperationLinkAssociated = true;
		EList<EObject> operationLinks = EcoaDtServicesUtils.findCrossReferences(operationInstance);
		for (EObject operationLink : operationLinks) {
			if (operationLink instanceof OperationLink) {
				hasNoOperationLinkAssociated = false;
			}
		}
		return hasNoOperationLinkAssociated;
	}

	/**
	 * Find all operation in the ComponentImplementation
	 * 
	 * @param eObject : object that can be linked
	 * @return all operations that can be linked
	 */
	public EList<OperationInstance> findOperationInstance(EObject eObject) {
		EList<OperationInstance> operationInstances = new BasicEList();
		if (eObject.eContainer() != null
				&& eObject.eContainer().eContainer() instanceof ComponentImplementation cptImp) {
			EList<ReferenceOfLinkedComponentDefinition> componentDefinitionReferences = cptImp
					.getComponentDefinitionReferences();
			for (ReferenceOfLinkedComponentDefinition referenceOfLinkedComponentDefinition : componentDefinitionReferences) {
				EList<OperationInstance> operations = referenceOfLinkedComponentDefinition.getOperations();
				operationInstances.addAll(operations);
			}

			EList<ServiceOfLinkedComponentDefinition> componentDefinitionServices = cptImp
					.getComponentDefinitionServices();
			for (ServiceOfLinkedComponentDefinition serviceOfLinkedComponentDefinition : componentDefinitionServices) {
				EList<OperationInstance> operations = serviceOfLinkedComponentDefinition.getOperations();
				operationInstances.addAll(operations);
			}
			EList<ExternalSenderOperation> externalSenders = cptImp.getExternalSenders();
			operationInstances.addAll(externalSenders);
			EList<Instance> instances = cptImp.getInstances();
			for (Instance instance : instances) {
				if (instance instanceof ModuleInstance moduleInstance) {
					operationInstances.addAll(moduleInstance.getOperations());
				} else if (instance instanceof TriggerInstance triggerInstance) {
					operationInstances.add(triggerInstance.getOperations());
				} else if (instance instanceof DynamicTriggerInstance dynamicTriggerInstance) {
					operationInstances.addAll(dynamicTriggerInstance.getOperations());
				}
			}

		}
		return operationInstances;
	}

	/**
	 * Find all ComponentReferences of a Composite
	 * 
	 * @param object : ComponentServices
	 * @return all ComponentReferences
	 */
	public EList<ComponentReference> findComponentReferences(EObject object) {
		Composite composite = (Composite) object.eContainer().eContainer();
		EList<ComponentReference> componentReference = new BasicEList<>();
		EList<Component> components = composite.getComponents();
		for (Component component : components) {
			componentReference.addAll(component.getComponentReferences());
		}

		return componentReference;
	}

	/**
	 * Assert if GraphicalErrorDisplay menu was enabled
	 * 
	 * @return true if GraphicalErrorDisplay is enabled
	 */
	public static boolean isGraphicalErrorDisplayEnabled() {

		QualifiedName test = new QualifiedName("", "toggleGraphicalDisplayError");
		try {
			String persistentProperty = new EcoadtServices().getWorkspaceProject().getPersistentProperty(test);
			if (persistentProperty == null) {
				new EcoadtServices().getWorkspaceProject().setPersistentProperty(test, "NONE");
			}
			return !(new EcoadtServices().getWorkspaceProject().getPersistentProperty(test).equals("NONE"));
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * Assert if GraphicalErrorDisplay menu was enabled
	 * 
	 * @return true if GraphicalErrorDisplay is enabled
	 */
	public static boolean isGraphicalWarningDisplayEnabled() {

		QualifiedName test = new QualifiedName("", "toggleGraphicalDisplayError");
		try {
			String persistentProperty = new EcoadtServices().getWorkspaceProject().getPersistentProperty(test);
			if (persistentProperty == null) {
				new EcoadtServices().getWorkspaceProject().setPersistentProperty(test, "NONE");
			}
			return (new EcoadtServices().getWorkspaceProject().getPersistentProperty(test).equals("WARNING"));
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 
	 * @param object
	 * @return
	 */
	static String getObjectName(EObject object) {
		String nameObject = "";
		if (doesNotHaveAName(object)) {
			return "";
		} else if (object instanceof ServiceLink wire) {
			return " the ServiceLink between " + wire.getSource().getWireString() + " and "
					+ wire.getTarget().getWireString();
		} else if (object instanceof BinDesc binDesc) {
			return binDesc.getFileName();
		}
		try {
			Method declaredMethod = object.getClass().getMethod("getName");
			return (String) declaredMethod.invoke(object);

		} catch (NoSuchMethodException e) {
			try {
				Method declaredMethod = object.getClass().getMethod("getId");
				return (String) declaredMethod.invoke(object);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e1) {
				EDTLog.toConsole("No getName() or getId() function for " + object.eClass().getName());
				e.printStackTrace();
			}
		} catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			EDTLog.toConsole("No getName() function for " + object.eClass().getName());
			e.printStackTrace();
		}

		return nameObject;
	}

	/**
	 * @param object : object that can not have a name
	 * @return true if no name possible for this type of object
	 */
	static boolean doesNotHaveAName(EObject object) {
		return object instanceof PlatformConfiguration || object instanceof PlatformMessage
				|| object instanceof ComputingNodeConfiguration || object instanceof ComponentLog
				|| object instanceof ModuleLog || object instanceof WireMapping || object instanceof ID
				|| object instanceof DeployedModuleInstance || object instanceof DeployedTriggerInstance
				|| object instanceof ComponentImplementationReference
				|| object instanceof ComponentImplementationService;
	}
}
