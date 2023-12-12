/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtimplementation.ComponentImplementation;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationInstance;
import edtimplementation.PropertyValue;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentDefinitionService;
import edtproject.ComponentProperty;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Property;
import edttype.EDTDataType;
import edttype.EnumValue;
import edttype.Field;
import edttype.Library;
import edttype.Union;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDeletionVerification {

	private EcoadtServices ecoaDtServices = new EcoadtServices();

	/**
	 * Verify the Object (at the moment always a Library) is empty, if not display
	 * an error.
	 * 
	 * @param eObject : eObject to delete
	 * @return true if empty, else return false + error message
	 */
	public boolean isEmptyToDelete(EObject eObject) {
		if (eObject instanceof Library library) {
			if (!library.getDataTypes().isEmpty()) {
				EDTLog.displayPopUp("The library '" + library.getName()
						+ "' is not empty. Delete all the contained elements before deleting it.");
			}
			return library.getDataTypes().isEmpty();
		}
		return true;
	}

	/**
	 * Search for objects referencing the objectToDelete
	 * 
	 * @param objectToDelete : object to be verified before deletion
	 * @return true if object never referenced by another, else false + error
	 *         message
	 */
	public static boolean hasNoCrossReferences(EObject objectToDelete) {
		String nameObject = EcoaDtServicesUtils.getObjectName(objectToDelete);
		StringBuilder infoMessage = findCrossReferenceAndCreateMessages(objectToDelete, nameObject);

		if (!infoMessage.isEmpty()) {
			EDTLog.toPopUpAndConsole("The " + objectToDelete.eClass().getName() + " " + nameObject
					+ " can not be deleted, there are other element(s) refering to it. See console to see more details.",
					infoMessage.toString());

			return false;
		}
		return true;
	}

	/**
	 * Creates messages String for crossReferences found
	 * 
	 * @param objectToDelete : object to delete
	 * @param nameObject     : name of object to delete
	 * @return String of error messages (console)
	 */
	public static StringBuilder findCrossReferenceAndCreateMessages(EObject objectToDelete, String nameObject) {
		EList<EObject> findCrossReferences = EcoaDtServicesUtils.findCrossReferences(objectToDelete);
		StringBuilder infoMessage = new StringBuilder();
		if (!findCrossReferences.isEmpty()) {

			for (EObject referingObject : findCrossReferences) {
				if (EcoaDtServicesUtils.doesNotHaveAName(referingObject)) {
					infoMessage.append("A " + errorMessageObjectName(referingObject));
				} else if (crossRefToIgnore(referingObject)) {
					continue;
				} else {
					infoMessage.append("The " + errorMessageObjectName(referingObject));
				}
				infoMessage.append(" is refering to " + nameObject
						+ ". You need to delete the element or change the reference." + System.lineSeparator());
			}

		}
		return infoMessage;
	}

	/**
	 * Search for objects referencing the ComponentDefinitionProperty (can not use
	 * has no crossreference, cause of ComponentProperty)
	 * 
	 * @param propertyToDelete : ComponentDefinitionProperty to be verified before
	 *                         deletion
	 * @return true if object never referenced by another, else false + error
	 *         message
	 */
	public boolean hasNoCrossReferencesForComponentDefinitionProperty(Property propertyToDelete) {
		EList<EObject> findCrossReferences = EcoaDtServicesUtils.findCrossReferences(propertyToDelete);
		boolean noModulePropertyReference = true;
		if (!findCrossReferences.isEmpty()) {
			String nameObject = EcoaDtServicesUtils.getObjectName(propertyToDelete);
			StringBuilder infoMessage = new StringBuilder();

			for (EObject referingObject : findCrossReferences) {
				if (referingObject instanceof edtimplementation.PropertyValue) {
					noModulePropertyReference = false;
					infoMessage.append("The " + errorMessageObjectName(referingObject) + " is refering to " + nameObject
							+ ". You need to delete the element or change the reference." + System.lineSeparator());
				}
			}

			if (!noModulePropertyReference) {
				EDTLog.toPopUpAndConsole("The " + propertyToDelete.eClass().getName() + " " + nameObject
						+ " can not be deleted, there are other element(s) refering to it. See console to see more details.",
						infoMessage.toString());
			}

		}
		return noModulePropertyReference;
	}

	/**
	 * @param object : object that can not have a name
	 * @return true if no name possible for this type of object
	 */
	private static boolean crossRefToIgnore(EObject object) {
		return object instanceof ReferenceOfLinkedComponentDefinition
				|| object instanceof ServiceOfLinkedComponentDefinition;
	}

	static String errorMessageObjectName(EObject object) {
		String className = object.eClass().getName();
		String nameObject = "'" + EcoaDtServicesUtils.getObjectName(object) + "'";
		String errorMessage = "";
		String of = " of ";

//		Types
		if (object instanceof EDTDataType type) {
			Library library = (Library) type.eContainer();
			String libraryName = EcoaDtServicesUtils.getObjectName(library);
			errorMessage = className + " '" + libraryName + ":" + nameObject + "'";

		} else if (object instanceof Field || object instanceof Union || object instanceof EnumValue

//				ServiceDefinition
				|| object instanceof OperationType || object instanceof Parameter

//				ComponentDefinition
				|| object instanceof Property || object instanceof ComponentDefinitionReference
				|| object instanceof ComponentDefinitionService

//				Composite
				|| object instanceof ComponentReference || object instanceof ComponentService
				|| object instanceof ComponentProperty

//				ComponentImplementation				
				|| object instanceof ModuleOperation || object instanceof PropertyValue) {
			errorMessage = className + " " + nameObject + of + errorMessageObjectName(object.eContainer());

		} else if (object instanceof OperationInstance operationInstance) {
			if (operationInstance.eContainer() instanceof ServiceOfLinkedComponentDefinition service) {
				String serviceName = EcoaDtServicesUtils.getObjectName(service);
				String simplifiedClassName = operationInstance.getSimplifiedClassName();
				errorMessage = simplifiedClassName + " " + nameObject + " of the Service '" + serviceName + "'";
			} else if (operationInstance.eContainer() instanceof ReferenceOfLinkedComponentDefinition reference) {
				String serviceName = EcoaDtServicesUtils.getObjectName(reference);
				String simplifiedClassName = operationInstance.getSimplifiedClassName();
				errorMessage = simplifiedClassName + " " + nameObject + " of the Reference '" + serviceName + "'";
			} else {
				errorMessage = operationInstance.getSimplifiedClassName() + " " + nameObject + " of "
						+ errorMessageObjectName(operationInstance.eContainer());
			}

		} else if (object instanceof ModuleTypeProperty moduleProperty) {
			ModuleType moduleType = (ModuleType) moduleProperty.eContainer();
			String moduleTypeName = EcoaDtServicesUtils.getObjectName(moduleType);
			errorMessage = className + " " + nameObject + " of the Module Type '" + moduleTypeName + "'";

		} else if (object instanceof edtimplementation.Parameter) {
			EObject operation = object.eContainer();
			errorMessage = className + " " + nameObject + of + errorMessageObjectName(operation);
		} else if (object instanceof DeployedModuleInstance || object instanceof DeployedTriggerInstance) {
			EObject operation = object.eContainer();
			errorMessage = className + of + errorMessageObjectName(operation);
		} else if (EcoaDtServicesUtils.doesNotHaveAName(object)) {
			errorMessage = className + "";
		} else {
			errorMessage = className + " " + nameObject + "";
		}
		return errorMessage;
	}

	/**
	 * When deleting componentImplemen
	 * 
	 * @param componentImplementation : componentImplementationToDelete
	 */
	public void deleteComponentImplementation(ComponentImplementation componentImplementation) {
		String name = componentImplementation.getName() + " Graphical View";

		Collection<DRepresentationDescriptor> representationDescriptors = DialectManager.INSTANCE
				.getAllRepresentationDescriptors(ecoaDtServices.getSession());

		Iterator<DRepresentationDescriptor> iterator = representationDescriptors.iterator();

		while (iterator.hasNext()) {
			DRepresentationDescriptor next = iterator.next();
			if (Objects.equals(name, next.getName())) {
				DialectManager.INSTANCE.deleteRepresentation(next, ecoaDtServices.getSession());
			}
		}
	}
}
