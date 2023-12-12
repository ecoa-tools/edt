/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;
import technology.ecoa.implementation._2.ComponentImplementation;
import technology.ecoa.implementation._2.impFactory;
import technology.ecoa.implementation._2.impPackage;

/**
 * This is the item provider adapter for a {@link technology.ecoa.implementation._2.ComponentImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentImplementationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addComponentDefinitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentImplementation_componentDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_componentDefinition_feature", "_UI_ComponentImplementation_type"),
				 impPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__USE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__SERVICE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__REFERENCE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_TYPE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE);
			childrenFeatures.add(impPackage.Literals.COMPONENT_IMPLEMENTATION__GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentImplementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentImplementation)object).getComponentDefinition();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentImplementation_type") :
			getString("_UI_ComponentImplementation_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentImplementation.class)) {
			case impPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case impPackage.COMPONENT_IMPLEMENTATION__USE:
			case impPackage.COMPONENT_IMPLEMENTATION__SERVICE:
			case impPackage.COMPONENT_IMPLEMENTATION__REFERENCE:
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_TYPE:
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION:
			case impPackage.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE:
			case impPackage.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE:
			case impPackage.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE:
			case impPackage.COMPONENT_IMPLEMENTATION__GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__USE,
				 impFactory.eINSTANCE.createUseType()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__SERVICE,
				 impFactory.eINSTANCE.createServiceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__REFERENCE,
				 impFactory.eINSTANCE.createServiceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_TYPE,
				 impFactory.eINSTANCE.createModuleType()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATION,
				 impFactory.eINSTANCE.createModuleImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_INSTANCE,
				 impFactory.eINSTANCE.createModuleInstance()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__TRIGGER_INSTANCE,
				 impFactory.eINSTANCE.createTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__DYNAMIC_TRIGGER_INSTANCE,
				 impFactory.eINSTANCE.createDynamicTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.COMPONENT_IMPLEMENTATION__DATA_LINK,
					 impFactory.eINSTANCE.createDataLink())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.COMPONENT_IMPLEMENTATION__EVENT_LINK,
					 impFactory.eINSTANCE.createEventLink())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.COMPONENT_IMPLEMENTATION__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.COMPONENT_IMPLEMENTATION__REQUEST_LINK,
					 impFactory.eINSTANCE.createRequestLink())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == impPackage.Literals.COMPONENT_IMPLEMENTATION__SERVICE ||
			childFeature == impPackage.Literals.COMPONENT_IMPLEMENTATION__REFERENCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ECOADTEditPlugin.INSTANCE;
	}

}
