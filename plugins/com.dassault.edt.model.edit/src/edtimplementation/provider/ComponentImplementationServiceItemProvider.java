/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import edtbin.provider.EDTEditPlugin;
import edtimplementation.ComponentImplementation;
import edtimplementation.ComponentImplementationService;
import edtimplementation.EdtimplementationPackage;
import edtproject.ComponentDefinitionService;
import edtqos.ServiceInstanceQos;

/**
 * This is the item provider adapter for a
 * {@link edtimplementation.ComponentImplementationService} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComponentImplementationServiceItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentImplementationServiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNewQosPropertyDescriptor(object);
			addComponentDefinitionServicePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the New Qos feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addNewQosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementationService_newQos_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementationService_newQos_feature",
						"_UI_ComponentImplementationService_type"),
				EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_SERVICE__NEW_QOS, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<Object>();
				ComponentImplementationService service = (ComponentImplementationService) object;
				EObject eContainer = service.eContainer();
				if (eContainer instanceof ComponentImplementation componentImplementation) {
					for (Object value : choiceOfValues) {
						ServiceInstanceQos qos = (ServiceInstanceQos) value;
						if (value == null || (componentImplementation.getAssociatedServiceQos().contains(value)
								&& qos.getServiceDefinition() != null && service.getComponentDefinitionService() != null
								&& service.getComponentDefinitionService().getSyntax() != null
								&& Objects.equals(qos.getServiceDefinition(),
										service.getComponentDefinitionService().getSyntax()))) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Component Definition Service feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComponentDefinitionServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementationService_ComponentDefinitionService_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentImplementationService_ComponentDefinitionService_feature",
						"_UI_ComponentImplementationService_type"),
				EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_SERVICE__COMPONENT_DEFINITION_SERVICE, true,
				false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				ComponentImplementationService componentImplementationReference = (ComponentImplementationService) object;
				EObject eContainer = componentImplementationReference.eContainer();
				if (eContainer instanceof ComponentImplementation componentImplementation) {
					for (Object value : choiceOfValues) {
						ComponentDefinitionService componentDefinitionService = (ComponentDefinitionService) value;
						if (value == null || (componentImplementation.getComponentDefinition().getServices()
								.contains(componentDefinitionService)
								&& !isComponentDefinitionServiceAlreadyUsed(componentImplementation,
										componentDefinitionService))) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}

		});
	}

	/**
	 * Verify that componentDefinitionReference not already overloaded
	 * 
	 * @param componentImplementation
	 * @param componentDefinitionService
	 */
	private boolean isComponentDefinitionServiceAlreadyUsed(ComponentImplementation componentImplementation,
			ComponentDefinitionService componentDefinitionService) {
		for (ComponentImplementationService reference : componentImplementation.getServices()) {
			if (Objects.equals(reference.getComponentDefinitionService(), componentDefinitionService)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This returns ComponentImplementationService.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentImplementationService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentImplementationService_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EDTEditPlugin.INSTANCE;
	}

}
