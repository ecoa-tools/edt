/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.provider;


import edtbin.provider.EDTEditPlugin;
import edtdeployment.EdtdeploymentFactory;
import edtlogical.EdtlogicalFactory;
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

import temp.TempFactory;
import edtproject.EDTProjectPackage;
import edtproject.Step5;
import edtudp.EdtudpFactory;
import edtuid.EdtuidFactory;

/**
 * This is the item provider adapter for a {@link edtproject.Step5} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Step5ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step5ItemProvider(AdapterFactory adapterFactory) {
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

			addFolderNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_FolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_FolderName_feature", "_UI_Step_type"),
				 EDTProjectPackage.Literals.STEP__FOLDER_NAME,
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
			childrenFeatures.add(EDTProjectPackage.Literals.STEP5__LOGICAL_SYSTEM);
			childrenFeatures.add(EDTProjectPackage.Literals.STEP5__DEPLOYMENT);
			childrenFeatures.add(EDTProjectPackage.Literals.STEP5__UDP_BINDINGS);
			childrenFeatures.add(EDTProjectPackage.Literals.STEP5__CROSS_PLATFORM_VIEW);
			childrenFeatures.add(EDTProjectPackage.Literals.STEP5__IDS);
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
	 * This returns Step5.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Step5"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Step5)object).getFolderName();
		return label == null || label.length() == 0 ?
			getString("_UI_Step5_type") :
			getString("_UI_Step5_type") + " " + label;
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

		switch (notification.getFeatureID(Step5.class)) {
			case EDTProjectPackage.STEP5__FOLDER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			case EDTProjectPackage.STEP5__DEPLOYMENT:
			case EDTProjectPackage.STEP5__UDP_BINDINGS:
			case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			case EDTProjectPackage.STEP5__IDS:
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
				(EDTProjectPackage.Literals.STEP5__LOGICAL_SYSTEM,
				 EdtlogicalFactory.eINSTANCE.createLogicalSystem()));

		newChildDescriptors.add
			(createChildParameter
				(EDTProjectPackage.Literals.STEP5__DEPLOYMENT,
				 EdtdeploymentFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(EDTProjectPackage.Literals.STEP5__UDP_BINDINGS,
				 EdtudpFactory.eINSTANCE.createUDPBinding()));

		newChildDescriptors.add
			(createChildParameter
				(EDTProjectPackage.Literals.STEP5__CROSS_PLATFORM_VIEW,
				 TempFactory.eINSTANCE.createCrossPlatformView()));

		newChildDescriptors.add
			(createChildParameter
				(EDTProjectPackage.Literals.STEP5__IDS,
				 EdtuidFactory.eINSTANCE.createIDMap()));
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
