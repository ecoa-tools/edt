/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;
import technology.ecoa.types._2.DataTypes;
import technology.ecoa.types._2.typFactory;
import technology.ecoa.types._2.typPackage;

/**
 * This is the item provider adapter for a {@link technology.ecoa.types._2.DataTypes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesItemProvider 
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
	public DataTypesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(typPackage.Literals.DATA_TYPES__GROUP);
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
	 * This returns DataTypes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTypes"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataTypes_type");
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

		switch (notification.getFeatureID(DataTypes.class)) {
			case typPackage.DATA_TYPES__GROUP:
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
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__SIMPLE,
					 typFactory.eINSTANCE.createSimple())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__RECORD,
					 typFactory.eINSTANCE.createRecord())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__CONSTANT,
					 typFactory.eINSTANCE.createConstant())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__VARIANT_RECORD,
					 typFactory.eINSTANCE.createVariantRecord())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__ARRAY,
					 typFactory.eINSTANCE.createArray())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__FIXED_ARRAY,
					 typFactory.eINSTANCE.createFixedArray())));

		newChildDescriptors.add
			(createChildParameter
				(typPackage.Literals.DATA_TYPES__GROUP,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DATA_TYPES__ENUM,
					 typFactory.eINSTANCE.createEnum())));
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
