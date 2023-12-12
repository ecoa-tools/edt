/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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

import com.dassault.edt.log.EDTLog;
import edtbin.provider.EDTEditPlugin;
import edtlogical.EdtlogicalFactory;
import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalSystem;

/**
 * This is the item provider adapter for a {@link edtlogical.LogicalComputingPlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalComputingPlatformItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingPlatformItemProvider(AdapterFactory adapterFactory) {
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

			addELIPlatformIdPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ELI Platform Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addELIPlatformIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalComputingPlatform_eLIPlatformId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingPlatform_eLIPlatformId_feature", "_UI_LogicalComputingPlatform_type"),
				 EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingPlatform_id_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingPlatform_id_feature",
						"_UI_LogicalComputingPlatform_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				LogicalComputingPlatform logicalComputingPlatformToName = (LogicalComputingPlatform) object;
				LogicalSystem logicalSystem = (LogicalSystem) logicalComputingPlatformToName.eContainer();
				if (logicalComputingPlatformToName.getId() != null && value != null) {
					if (Objects.equals(logicalComputingPlatformToName.getId(), value)) {
						return;
					}

					EList<LogicalComputingPlatform> allLogicalComputingPlatform = logicalSystem
							.getLogicalComputingPlatforms();
					for (LogicalComputingPlatform platform : allLogicalComputingPlatform) {
						if (!Objects.equals(platform, logicalComputingPlatformToName)
								&& Objects.equals(platform.getId(), value)) {

							EDTLog.toPopUpAndConsole("ERROR : ID is not unique",
									"There is another LogicalComputingPlatform with the id : " + value);
							return;
						}
					}
				}
				super.setPropertyValue(object, value);
			}
		});
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES);
			childrenFeatures.add(EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LogicalComputingPlatform.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalComputingPlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalComputingPlatform)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalComputingPlatform_type") :
			getString("_UI_LogicalComputingPlatform_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalComputingPlatform.class)) {
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
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
				(EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES,
				 EdtlogicalFactory.eINSTANCE.createLogicalComputingNode()));

		newChildDescriptors.add
			(createChildParameter
				(EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS,
				 EdtlogicalFactory.eINSTANCE.createLogicalComputingNodeLink()));
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
