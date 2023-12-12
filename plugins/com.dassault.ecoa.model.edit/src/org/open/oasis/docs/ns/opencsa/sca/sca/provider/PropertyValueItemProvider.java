/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.provider;


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

import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;
import org.w3._2001.xml.xsd.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyValueItemProvider extends SCAPropertyBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueItemProvider(AdapterFactory adapterFactory) {
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

			addFilePropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyValue_file_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyValue_file_feature", "_UI_PropertyValue_type"),
				 scaPackage.Literals.PROPERTY_VALUE__FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyValue_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyValue_source_feature", "_UI_PropertyValue_type"),
				 scaPackage.Literals.PROPERTY_VALUE__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PropertyValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropertyValue)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PropertyValue_type") :
			getString("_UI_PropertyValue_type") + " " + label;
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

		switch (notification.getFeatureID(PropertyValue.class)) {
			case scaPackage.PROPERTY_VALUE__FILE:
			case scaPackage.PROPERTY_VALUE__SOURCE:
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
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ALL ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__KEY ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
