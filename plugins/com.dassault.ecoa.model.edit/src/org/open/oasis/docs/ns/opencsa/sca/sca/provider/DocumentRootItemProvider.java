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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__COMPONENT_TYPE);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__COMPOSITE);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__EXTENSIONS);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_TYPE);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__INTERFACE);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__VALUE);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__WIRE_FORMAT);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__CONTRIBUTION);
			childrenFeatures.add(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
			case scaPackage.DOCUMENT_ROOT__INTERFACE:
			case scaPackage.DOCUMENT_ROOT__VALUE:
			case scaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
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
				(scaPackage.Literals.DOCUMENT_ROOT__COMPONENT_TYPE,
				 scaFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__COMPOSITE,
				 scaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION,
				 scaFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__EXTENSIONS,
				 scaFactory.eINSTANCE.createExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_TYPE,
				 scaFactory.eINSTANCE.createImplementationType()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__VALUE,
				 scaFactory.eINSTANCE.createValueType()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__CONTRIBUTION,
				 scaFactory.eINSTANCE.createContributionType()));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE,
				 scaFactory.eINSTANCE.createSCAImplementation()));
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
