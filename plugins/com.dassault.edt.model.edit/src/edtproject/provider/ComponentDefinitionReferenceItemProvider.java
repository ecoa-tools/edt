/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.dassault.edt.log.EDTLog;

import edtproject.ComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.EDTProjectPackage;

/**
 * This is the item provider adapter for a {@link edtproject.ComponentDefinitionReference} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class ComponentDefinitionReferenceItemProvider extends ContractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentDefinitionReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMultiplicityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDefinitionReference_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDefinitionReference_name_feature",
								"_UI_ComponentDefinitionReference_type"),
						EDTProjectPackage.Literals.COMPONENT_DEFINITION_REFERENCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ComponentDefinitionReference componentDefinitionReferenceToName = (ComponentDefinitionReference) object;
						ComponentDefinition componentDefinition = (ComponentDefinition) componentDefinitionReferenceToName
								.eContainer();
						if (componentDefinitionReferenceToName.getName() != null && value != null) {

							if (Objects.equals(componentDefinitionReferenceToName.getName(), value)) {
								return;
							}

							EList<ComponentDefinitionReference> allComponentDefinitionReferences = componentDefinition
									.getReferences();
							for (ComponentDefinitionReference compDefRef : allComponentDefinitionReferences) {
								if (!Objects.equals(compDefRef, componentDefinitionReferenceToName)
										&& Objects.equals(compDefRef.getName(), value)) {
									super.setPropertyValue(object, componentDefinitionReferenceToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ComponentDefinition Reference with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentDefinitionReference_multiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentDefinitionReference_multiplicity_feature", "_UI_ComponentDefinitionReference_type"),
				 EDTProjectPackage.Literals.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ComponentDefinitionReference.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentDefinitionReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentDefinitionReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentDefinitionReference_type") :
			getString("_UI_ComponentDefinitionReference_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentDefinitionReference.class)) {
			case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME:
			case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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

}
