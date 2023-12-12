/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.provider;

import edtbin.provider.EDTEditPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.PlatformConfiguration;
import edtlogical.LogicalComputingNode;

/**
 * This is the item provider adapter for a {@link edtdeployment.ComputingNodeConfiguration} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class ComputingNodeConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComputingNodeConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addSchedulingInformationPropertyDescriptor(object);
			addComputingNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scheduling Information feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSchedulingInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputingNodeConfiguration_schedulingInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputingNodeConfiguration_schedulingInformation_feature", "_UI_ComputingNodeConfiguration_type"),
				 EdtdeploymentPackage.Literals.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computing Node feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComputingNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComputingNodeConfiguration_computingNode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComputingNodeConfiguration_computingNode_feature",
						"_UI_ComputingNodeConfiguration_type"),
				EdtdeploymentPackage.Literals.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				ComputingNodeConfiguration computingNodeConfiguration = (ComputingNodeConfiguration) object;
				if (computingNodeConfiguration.eContainer() instanceof PlatformConfiguration pc
						&& pc.getComputingPlatform() != null) {
					for (Object choice : choiceOfValues) {
						if (choice == null || (choice instanceof LogicalComputingNode node
								&& Objects.equals(node.eContainer(), pc.getComputingPlatform()))) {
							filteredChoices.add(choice);
						}
					}
					return filteredChoices;
				} else {
					return choiceOfValues;
				}
			}
		});
	}

	/**
	 * This returns ComputingNodeConfiguration.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComputingNodeConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComputingNodeConfiguration)object).getSchedulingInformation();
		return label == null || label.length() == 0 ?
			getString("_UI_ComputingNodeConfiguration_type") :
			getString("_UI_ComputingNodeConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ComputingNodeConfiguration.class)) {
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
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
