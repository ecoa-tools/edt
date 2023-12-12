/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;


import edtbin.provider.EDTEditPlugin;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ReferenceOfLinkedComponentDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

/**
 * This is the item provider adapter for a {@link edtimplementation.ReferenceOfLinkedComponentDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceOfLinkedComponentDefinitionItemProvider 
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
	public ReferenceOfLinkedComponentDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServRefOfLinkedComponentDefinition_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServRefOfLinkedComponentDefinition_name_feature", "_UI_ServRefOfLinkedComponentDefinition_type"),
				 EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__NAME,
				 false,
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
			childrenFeatures.add(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS);
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
	 * This returns ReferenceOfLinkedComponentDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReferenceOfLinkedComponentDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReferenceOfLinkedComponentDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ReferenceOfLinkedComponentDefinition_type") :
			getString("_UI_ReferenceOfLinkedComponentDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(ReferenceOfLinkedComponentDefinition.class)) {
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtimplementationPackage.REFERENCE_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS:
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
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createTriggerSender()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDynamicTriggerEventReceiverInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDynamicTriggerEventSenderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventSenderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventReceiverInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestClientInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestServerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDataWriterInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDataReaderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventDefinitionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestReferenceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataReferenceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.SERV_REF_OF_LINKED_COMPONENT_DEFINITION__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createExternalSenderOperation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EDTEditPlugin.INSTANCE;
	}

}
