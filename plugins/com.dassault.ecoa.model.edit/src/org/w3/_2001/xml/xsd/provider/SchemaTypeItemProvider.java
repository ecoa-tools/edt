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

import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;
import org.w3._2001.xml.xsd.SchemaType;

/**
 * This is the item provider adapter for a {@link org.w3._2001.xml.xsd.SchemaType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTypeItemProvider extends OpenAttrsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAttributeFormDefaultPropertyDescriptor(object);
			addBlockDefaultPropertyDescriptor(object);
			addElementFormDefaultPropertyDescriptor(object);
			addFinalDefaultPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute Form Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeFormDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_attributeFormDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_attributeFormDefault_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Block Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_blockDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_blockDefault_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__BLOCK_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Form Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementFormDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_elementFormDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_elementFormDefault_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_finalDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_finalDefault_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__FINAL_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_SchemaType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_id_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_targetNamespace_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__TARGET_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaType_version_feature", "_UI_SchemaType_type"),
				 SchemaPackage.Literals.SCHEMA_TYPE__VERSION,
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
			childrenFeatures.add(SchemaPackage.Literals.SCHEMA_TYPE__GROUP);
			childrenFeatures.add(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1);
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
	 * This returns SchemaType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SchemaType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SchemaType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SchemaType_type") :
			getString("_UI_SchemaType_type") + " " + label;
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

		switch (notification.getFeatureID(SchemaType.class)) {
			case SchemaPackage.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT:
			case SchemaPackage.SCHEMA_TYPE__BLOCK_DEFAULT:
			case SchemaPackage.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT:
			case SchemaPackage.SCHEMA_TYPE__FINAL_DEFAULT:
			case SchemaPackage.SCHEMA_TYPE__ID:
			case SchemaPackage.SCHEMA_TYPE__TARGET_NAMESPACE:
			case SchemaPackage.SCHEMA_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.SCHEMA_TYPE__GROUP:
			case SchemaPackage.SCHEMA_TYPE__GROUP1:
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
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__INCLUDE,
					 SchemaFactory.eINSTANCE.createIncludeType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__IMPORT,
					 SchemaFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__REDEFINE,
					 SchemaFactory.eINSTANCE.createRedefineType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__ANNOTATION,
					 SchemaFactory.eINSTANCE.createAnnotationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__SIMPLE_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelSimpleType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__COMPLEX_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__GROUP2,
					 SchemaFactory.eINSTANCE.createNamedGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__ATTRIBUTE_GROUP,
					 SchemaFactory.eINSTANCE.createNamedAttributeGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__ELEMENT,
					 SchemaFactory.eINSTANCE.createTopLevelElement())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createTopLevelAttribute())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__NOTATION,
					 SchemaFactory.eINSTANCE.createNotationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.SCHEMA_TYPE__GROUP1,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.SCHEMA_TYPE__ANNOTATION1,
					 SchemaFactory.eINSTANCE.createAnnotationType())));
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
			childFeature == SchemaPackage.Literals.SCHEMA_TYPE__ANNOTATION ||
			childFeature == SchemaPackage.Literals.SCHEMA_TYPE__ANNOTATION1;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
