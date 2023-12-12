/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.provider;


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
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeType;
import technology.ecoa.logicalsystem._2.logFactory;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * This is the item provider adapter for a {@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalComputingNodeTypeItemProvider 
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
	public LogicalComputingNodeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalComputingNodeType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeType_id_feature", "_UI_LogicalComputingNodeType_type"),
				 logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__ID,
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
			childrenFeatures.add(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS);
			childrenFeatures.add(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS);
			childrenFeatures.add(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__OS);
			childrenFeatures.add(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY);
			childrenFeatures.add(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME);
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
	 * This returns LogicalComputingNodeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalComputingNodeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalComputingNodeType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalComputingNodeType_type") :
			getString("_UI_LogicalComputingNodeType_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalComputingNodeType.class)) {
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS:
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS:
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__OS:
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY:
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME:
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
				(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__ENDIANESS,
				 logFactory.eINSTANCE.createEndianessType()));

		newChildDescriptors.add
			(createChildParameter
				(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__LOGICAL_PROCESSORS,
				 logFactory.eINSTANCE.createLogicalProcessorsType()));

		newChildDescriptors.add
			(createChildParameter
				(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__OS,
				 logFactory.eINSTANCE.createOsType()));

		newChildDescriptors.add
			(createChildParameter
				(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__AVAILABLE_MEMORY,
				 logFactory.eINSTANCE.createAvailableMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(logPackage.Literals.LOGICAL_COMPUTING_NODE_TYPE__MODULE_SWITCH_TIME,
				 logFactory.eINSTANCE.createModuleSwitchTimeType()));
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
