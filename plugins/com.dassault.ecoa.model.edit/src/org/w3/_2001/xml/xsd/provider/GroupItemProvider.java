/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3._2001.xml.xsd.Group;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.w3._2001.xml.xsd.Group} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupItemProvider extends AnnotatedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupItemProvider(AdapterFactory adapterFactory) {
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

			addMaxOccursPropertyDescriptor(object);
			addMinOccursPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_maxOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_maxOccurs_feature", "_UI_Group_type"),
				 SchemaPackage.Literals.GROUP__MAX_OCCURS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_minOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_minOccurs_feature", "_UI_Group_type"),
				 SchemaPackage.Literals.GROUP__MIN_OCCURS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Group_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_name_feature", "_UI_Group_type"),
				 SchemaPackage.Literals.GROUP__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_ref_feature", "_UI_Group_type"),
				 SchemaPackage.Literals.GROUP__REF,
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
			childrenFeatures.add(SchemaPackage.Literals.GROUP__PARTICLE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Group)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Group_type") :
			getString("_UI_Group_type") + " " + label;
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

		switch (notification.getFeatureID(Group.class)) {
			case SchemaPackage.GROUP__MAX_OCCURS:
			case SchemaPackage.GROUP__MIN_OCCURS:
			case SchemaPackage.GROUP__NAME:
			case SchemaPackage.GROUP__REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.GROUP__PARTICLE:
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
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__ELEMENT,
					 SchemaFactory.eINSTANCE.createLocalElement())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__ELEMENT,
					 SchemaFactory.eINSTANCE.createNarrowMaxMin())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__GROUP,
					 SchemaFactory.eINSTANCE.createGroupRef())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__ALL,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__CHOICE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__CHOICE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__CHOICE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__SEQUENCE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__SEQUENCE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__SEQUENCE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.GROUP__PARTICLE,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.GROUP__ANY,
					 SchemaFactory.eINSTANCE.createAnyType())));
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
			childFeature == SchemaPackage.Literals.GROUP__ALL ||
			childFeature == SchemaPackage.Literals.GROUP__CHOICE ||
			childFeature == SchemaPackage.Literals.GROUP__SEQUENCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
