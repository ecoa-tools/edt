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

import org.w3._2001.xml.xsd.Element;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.w3._2001.xml.xsd.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider extends AnnotatedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
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
			addDefaultPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addFixedPropertyDescriptor(object);
			addFormPropertyDescriptor(object);
			addMaxOccursPropertyDescriptor(object);
			addMinOccursPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNillablePropertyDescriptor(object);
			addRefPropertyDescriptor(object);
			addSubstitutionGroupPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
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
				 getString("_UI_Element_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_abstract_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__ABSTRACT,
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
				 getString("_UI_Element_block_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_block_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__BLOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_default_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__DEFAULT,
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
				 getString("_UI_Element_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_final_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_fixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_fixed_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__FIXED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_form_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_form_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__FORM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Element_maxOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_maxOccurs_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__MAX_OCCURS,
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
				 getString("_UI_Element_minOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_minOccurs_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__MIN_OCCURS,
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
				 getString("_UI_Element_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nillable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNillablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_nillable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_nillable_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__NILLABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Element_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ref_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substitution Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstitutionGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_substitutionGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_substitutionGroup_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__SUBSTITUTION_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_type_feature", "_UI_Element_type"),
				 SchemaPackage.Literals.ELEMENT__TYPE,
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
			childrenFeatures.add(SchemaPackage.Literals.ELEMENT__SIMPLE_TYPE);
			childrenFeatures.add(SchemaPackage.Literals.ELEMENT__COMPLEX_TYPE);
			childrenFeatures.add(SchemaPackage.Literals.ELEMENT__IDENTITY_CONSTRAINT);
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
		String label = ((Element)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Element_type") :
			getString("_UI_Element_type") + " " + label;
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

		switch (notification.getFeatureID(Element.class)) {
			case SchemaPackage.ELEMENT__ABSTRACT:
			case SchemaPackage.ELEMENT__BLOCK:
			case SchemaPackage.ELEMENT__DEFAULT:
			case SchemaPackage.ELEMENT__FINAL:
			case SchemaPackage.ELEMENT__FIXED:
			case SchemaPackage.ELEMENT__FORM:
			case SchemaPackage.ELEMENT__MAX_OCCURS:
			case SchemaPackage.ELEMENT__MIN_OCCURS:
			case SchemaPackage.ELEMENT__NAME:
			case SchemaPackage.ELEMENT__NILLABLE:
			case SchemaPackage.ELEMENT__REF:
			case SchemaPackage.ELEMENT__SUBSTITUTION_GROUP:
			case SchemaPackage.ELEMENT__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.ELEMENT__SIMPLE_TYPE:
			case SchemaPackage.ELEMENT__COMPLEX_TYPE:
			case SchemaPackage.ELEMENT__IDENTITY_CONSTRAINT:
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
				(SchemaPackage.Literals.ELEMENT__SIMPLE_TYPE,
				 SchemaFactory.eINSTANCE.createLocalSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.ELEMENT__COMPLEX_TYPE,
				 SchemaFactory.eINSTANCE.createLocalComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.ELEMENT__IDENTITY_CONSTRAINT,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.ELEMENT__UNIQUE,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.ELEMENT__IDENTITY_CONSTRAINT,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.ELEMENT__KEY,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.ELEMENT__IDENTITY_CONSTRAINT,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.ELEMENT__KEYREF,
					 SchemaFactory.eINSTANCE.createKeyrefType())));
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
			childFeature == SchemaPackage.Literals.ELEMENT__UNIQUE ||
			childFeature == SchemaPackage.Literals.ELEMENT__KEY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
