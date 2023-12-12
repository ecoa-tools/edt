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

import org.w3._2001.xml.xsd.ComplexType;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.w3._2001.xml.xsd.ComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTypeItemProvider extends AnnotatedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
			addBlockPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addMixedPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_abstract_feature", "_UI_ComplexType_type"),
				 SchemaPackage.Literals.COMPLEX_TYPE__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_block_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_block_feature", "_UI_ComplexType_type"),
				 SchemaPackage.Literals.COMPLEX_TYPE__BLOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_final_feature", "_UI_ComplexType_type"),
				 SchemaPackage.Literals.COMPLEX_TYPE__FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_mixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_mixed_feature", "_UI_ComplexType_type"),
				 SchemaPackage.Literals.COMPLEX_TYPE__MIXED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ComplexType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_name_feature", "_UI_ComplexType_type"),
				 SchemaPackage.Literals.COMPLEX_TYPE__NAME,
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
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__SIMPLE_CONTENT);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__COMPLEX_CONTENT);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__GROUP);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__ALL);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__CHOICE);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__SEQUENCE);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__GROUP1);
			childrenFeatures.add(SchemaPackage.Literals.COMPLEX_TYPE__ANY_ATTRIBUTE1);
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
		String label = ((ComplexType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComplexType_type") :
			getString("_UI_ComplexType_type") + " " + label;
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

		switch (notification.getFeatureID(ComplexType.class)) {
			case SchemaPackage.COMPLEX_TYPE__ABSTRACT:
			case SchemaPackage.COMPLEX_TYPE__BLOCK:
			case SchemaPackage.COMPLEX_TYPE__FINAL:
			case SchemaPackage.COMPLEX_TYPE__MIXED:
			case SchemaPackage.COMPLEX_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.COMPLEX_TYPE__SIMPLE_CONTENT:
			case SchemaPackage.COMPLEX_TYPE__COMPLEX_CONTENT:
			case SchemaPackage.COMPLEX_TYPE__GROUP:
			case SchemaPackage.COMPLEX_TYPE__ALL:
			case SchemaPackage.COMPLEX_TYPE__CHOICE:
			case SchemaPackage.COMPLEX_TYPE__SEQUENCE:
			case SchemaPackage.COMPLEX_TYPE__GROUP1:
			case SchemaPackage.COMPLEX_TYPE__ANY_ATTRIBUTE1:
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
				(SchemaPackage.Literals.COMPLEX_TYPE__SIMPLE_CONTENT,
				 SchemaFactory.eINSTANCE.createSimpleContentType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__COMPLEX_CONTENT,
				 SchemaFactory.eINSTANCE.createComplexContentType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__GROUP,
				 SchemaFactory.eINSTANCE.createGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__ALL,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__CHOICE,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__CHOICE,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__CHOICE,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__SEQUENCE,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__SEQUENCE,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__SEQUENCE,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.COMPLEX_TYPE__ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createAttribute())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.COMPLEX_TYPE__ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createTopLevelAttribute())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.COMPLEX_TYPE__ATTRIBUTE_GROUP,
					 SchemaFactory.eINSTANCE.createAttributeGroupRef())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.COMPLEX_TYPE__ANY_ATTRIBUTE1,
				 SchemaFactory.eINSTANCE.createWildcard()));
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
			childFeature == SchemaPackage.Literals.COMPLEX_TYPE__ALL ||
			childFeature == SchemaPackage.Literals.COMPLEX_TYPE__CHOICE ||
			childFeature == SchemaPackage.Literals.COMPLEX_TYPE__SEQUENCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
