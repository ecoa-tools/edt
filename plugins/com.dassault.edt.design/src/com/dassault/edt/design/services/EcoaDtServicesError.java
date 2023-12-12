/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.dassault.edt.utils.EcoadtServices;

import edtimplementation.ComponentImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.Component;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.Step4;
import edtproject.Steps;

/**
 * Helper functions to verify for errors
 * 
 */
public class EcoaDtServicesError {
	private EcoadtServices service = new EcoadtServices();

	/**
	 * Verifies that ComponentReference and ComponentService to link have same
	 * ServiceDefinition
	 * 
	 * @param reference : ComponentReference
	 * @param service   : ComponentService
	 * @return true if link can be done
	 */
	public static boolean isServiceLinkCorrectFromRef(ComponentReference reference, ComponentService service) {
		if (!Objects.equals(reference.eContainer(), service.eContainer())
				&& reference.getComponentDefinitionReference() != null
				&& service.getComponentDefinitionService() != null
				&& Objects.equals(service.getComponentDefinitionService().getSyntax(),
						reference.getComponentDefinitionReference().getSyntax())) {
			return true;
		}
		return false;
	}

	/**
	 * Check serviceLink coherence whether source is ComponentReference or
	 * ComponentService
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if link is correct
	 */
	public static boolean isServiceLinkCorrect(EObject source, EObject target) {
		if (source instanceof ComponentReference reference && target instanceof ComponentService service) {
			return isServiceLinkCorrectFromRef(reference, service) && reference.getServiceLink().size() <= 1;
		} else if (target instanceof ComponentReference ref && source instanceof ComponentService service) {
			return isServiceLinkCorrectFromRef(ref, service) && ref.getServiceLink().size() <= 1;
		}
		return false;
	}

	/**
	 * Assert if moduleinstance has an implementation
	 * 
	 * @param moduleInstance : moduleinstance to verify
	 * @return true if error
	 */
	public boolean moduleInstanceWithError(ModuleInstance moduleInstance) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return ((moduleInstance.getModuleImplementation() == null)
					|| (moduleInstance.getModuleImplementation().getModuleType() == null));
		}
		return false;
	}

	/**
	 * Return if error conditional style must be applied for ComponentReference
	 * 
	 * @param reference : reference
	 * @return true if error + graphicalErrorDisplay enabled
	 */
	public boolean referenceWithError(ComponentReference reference) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return (reference.getComponentDefinitionReference().getSyntax() == null);
		}
		return false;
	}

	/**
	 * Assert if Service has errors
	 * 
	 * @param service : service to verify
	 * @return true if error + graphicalErrorDisplay enabled
	 */
	public boolean serviceWithError(ComponentService service) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return (service.getComponentDefinitionService().getSyntax() == null);
		}
		return false;
	}

	/**
	 * Assert if Service has errors
	 * 
	 * @param service : service to verify
	 * @return true if error + graphicalErrorDisplay enabled
	 */
	public boolean serviceOfLinkedWithError(ServiceOfLinkedComponentDefinition service) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return (service.getServiceDefinitionLink() == null);
		}
		return false;
	}

	/**
	 * Assert if Reference inherited from ComponentDefinition has a
	 * ServiceDefinition and graphicalErrorDisplay is enabled
	 * 
	 * @param reference : reference to verify
	 * @return true if error + graphicalErrorDisplay enabled
	 */
	public boolean referenceOfLinkedWithError(ReferenceOfLinkedComponentDefinition reference) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return (reference.getServiceDefinitionLink() == null);
		}
		return false;
	}

	/**
	 * Assert if ComponentImplementation has a ComponentDefinition and
	 * graphicalErrorDisplay is enabled
	 * 
	 * @param componentImplementation : componentimplementation to verify
	 * @return true if error + graphicalErrorDisplay enabled
	 */
	public boolean componentImplementationWithError(ComponentImplementation componentImplementation) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {
			return (componentImplementation.getComponentDefinition() == null);
		}
		return false;
	}

	/**
	 * Verify Component (presence of ComponentDefinition and ComponentImplementation
	 * if one is available)
	 * 
	 * @param component : component to verify
	 * @return true if no ComponentDefinition or no ComponentImplementation and one
	 *         exists with the same definition
	 */
	public boolean assemblyGraphicalViewWithError(Component component) {
		if (EcoaDtServicesUtils.isGraphicalErrorDisplayEnabled()) {

			if (component.getComponentDefinition() == null) {
				return true;
			}

			if (component.getComponentImplementation() == null) {
				XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) service.getSession().getSemanticResources()
						.iterator().next();
				Collection<ComponentImplementation> componentImplementations = ((Step4) ((Steps) xmiressourceImpl
						.getContents().get(0)).getStep().get(4)).getComponentImplementations();
				for (ComponentImplementation componentImplementation : componentImplementations) {
					if (Objects.equals(componentImplementation.getComponentDefinition(),
							component.getComponentDefinition())) {
						return true;
					}
				}
			} else {
				return !(Objects.equals(component.getComponentImplementation().getComponentDefinition(),
						component.getComponentDefinition()));
			}
		}
		return false;
	}

	/**
	 * Verify if service link can be created
	 * 
	 * @param source : source of link
	 * @param target : target of link
	 * @return true if can be created
	 */
	public boolean serviceLinkCanBeCreated(Object source, Object target) {
		if (source instanceof ComponentReference reference && target instanceof ComponentService service) {
			boolean b = ((Composite) reference.eContainer().eContainer()).findServiceLink(reference, service) == null
					&& isServiceLinkCorrectFromRef(reference, service);
			return b;
		} else if (target instanceof ComponentReference ref && source instanceof ComponentService service) {
			boolean b = ((Composite) ref.eContainer().eContainer()).findServiceLink(ref, service) == null
					&& isServiceLinkCorrectFromRef(ref, service);
			return b;
		}
		return false;
	}
}
