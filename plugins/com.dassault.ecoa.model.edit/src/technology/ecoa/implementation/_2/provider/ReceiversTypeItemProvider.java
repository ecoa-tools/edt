/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
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
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.implementation._2.impFactory;
import technology.ecoa.implementation._2.impPackage;

/**
 * This is the item provider adapter for a {@link technology.ecoa.implementation._2.ReceiversType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReceiversTypeItemProvider 
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
	public ReceiversTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(impPackage.Literals.RECEIVERS_TYPE__GROUP);
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
	 * This returns ReceiversType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReceiversType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ReceiversType_type");
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

		switch (notification.getFeatureID(ReceiversType.class)) {
			case impPackage.RECEIVERS_TYPE__GROUP:
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
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__SERVICE,
					 impFactory.eINSTANCE.createOpRef())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__SERVICE,
					 impFactory.eINSTANCE.createOpRefActivatable())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__SERVICE,
					 impFactory.eINSTANCE.createOpRefActivatableFifo())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__SERVICE,
					 impFactory.eINSTANCE.createOpRefActivatingFifo())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__REFERENCE,
					 impFactory.eINSTANCE.createOpRef())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__REFERENCE,
					 impFactory.eINSTANCE.createOpRefActivatable())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__REFERENCE,
					 impFactory.eINSTANCE.createOpRefActivatableFifo())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__REFERENCE,
					 impFactory.eINSTANCE.createOpRefActivatingFifo())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__MODULE_INSTANCE,
					 impFactory.eINSTANCE.createOpRefActivatableFifo())));

		newChildDescriptors.add
			(createChildParameter
				(impPackage.Literals.RECEIVERS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.RECEIVERS_TYPE__DYNAMIC_TRIGGER,
					 impFactory.eINSTANCE.createOpRefActivatingFifo())));
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
			childFeature == impPackage.Literals.RECEIVERS_TYPE__SERVICE ||
			childFeature == impPackage.Literals.RECEIVERS_TYPE__REFERENCE ||
			childFeature == impPackage.Literals.RECEIVERS_TYPE__MODULE_INSTANCE ||
			childFeature == impPackage.Literals.RECEIVERS_TYPE__DYNAMIC_TRIGGER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
