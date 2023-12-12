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
import edtimplementation.ComponentImplementationReference;
import edtimplementation.EdtimplementationPackage;
import edtproject.ComponentDefinitionReference;
import edtqos.ServiceInstanceQos;

/**
 * This is the item provider adapter for a
 * {@link edtimplementation.ComponentImplementationReference} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComponentImplementationReferenceItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentImplementationReferenceItemProvider(AdapterFactory adapterFactory) {
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
			addComponentDefinitionReferencePropertyDescriptor(object);
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
				getString("_UI_ComponentImplementationReference_newQos_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementationReference_newQos_feature",
						"_UI_ComponentImplementationReference_type"),
				EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_REFERENCE__NEW_QOS, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<Object>();
				ComponentImplementationReference reference = (ComponentImplementationReference) object;
				EObject eContainer = reference.eContainer();
				if (eContainer instanceof ComponentImplementation componentImplementation) {
					for (Object value : choiceOfValues) {
						ServiceInstanceQos qos = (ServiceInstanceQos) value;
						if (value == null || (componentImplementation.getAssociatedServiceQos().contains(value)
								&& qos.getServiceDefinition() != null
								&& reference.getComponentDefinitionReference() != null
								&& reference.getComponentDefinitionReference().getSyntax() != null
								&& Objects.equals(qos.getServiceDefinition(),
										reference.getComponentDefinitionReference().getSyntax()))) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Component Definition Reference
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComponentDefinitionReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementationReference_ComponentDefinitionReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentImplementationReference_ComponentDefinitionReference_feature",
						"_UI_ComponentImplementationReference_type"),
				EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION_REFERENCE__COMPONENT_DEFINITION_REFERENCE,
				true, false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				ComponentImplementationReference componentImplementationReference = (ComponentImplementationReference) object;
				EObject eContainer = componentImplementationReference.eContainer();
				if (eContainer instanceof ComponentImplementation componentImplementation) {
					for (Object value : choiceOfValues) {
						ComponentDefinitionReference componentDefinitionReference = (ComponentDefinitionReference) value;
						if (value == null || (componentImplementation.getComponentDefinition().getReferences()
								.contains(componentDefinitionReference)
								&& (Objects.equals(componentImplementationReference.getComponentDefinitionReference(),
										componentDefinitionReference)
										|| !isComponentDefinitionReferenceAlreadyUsed(componentImplementation,
												componentDefinitionReference)))) {
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
	 * @param componentDefinitionReference
	 */
	private boolean isComponentDefinitionReferenceAlreadyUsed(ComponentImplementation componentImplementation,
			ComponentDefinitionReference componentDefinitionReference) {
		for (ComponentImplementationReference reference : componentImplementation.getReferences()) {
			if (Objects.equals(reference.getComponentDefinitionReference(), componentDefinitionReference)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This returns ComponentImplementationReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentImplementationReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentImplementationReference_type");
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
