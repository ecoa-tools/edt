/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.projFactory;
import technology.ecoa.project._2.projPackage;

/**
 * This is the item provider adapter for a {@link technology.ecoa.project._2.EcoaProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoaProjectItemProvider 
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
	public EcoaProjectItemProvider(AdapterFactory adapterFactory) {
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

			addInitialAssemblyPropertyDescriptor(object);
			addLogicalSystemPropertyDescriptor(object);
			addCrossPlatformsViewPropertyDescriptor(object);
			addDeploymentSchemaPropertyDescriptor(object);
			addOutputDirectoryPropertyDescriptor(object);
			addImplementationAssemblyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial Assembly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialAssemblyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_initialAssembly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_initialAssembly_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__INITIAL_ASSEMBLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_logicalSystem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_logicalSystem_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__LOGICAL_SYSTEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Platforms View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossPlatformsViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_crossPlatformsView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_crossPlatformsView_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__CROSS_PLATFORMS_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployment Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_deploymentSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_deploymentSchema_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__DEPLOYMENT_SCHEMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_outputDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_outputDirectory_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__OUTPUT_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Assembly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationAssemblyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcoaProject_implementationAssembly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_implementationAssembly_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY,
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
				 getString("_UI_EcoaProject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcoaProject_name_feature", "_UI_EcoaProject_type"),
				 projPackage.Literals.ECOA_PROJECT__NAME,
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
			childrenFeatures.add(projPackage.Literals.ECOA_PROJECT__GROUP);
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
	 * This returns EcoaProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EcoaProject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EcoaProject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EcoaProject_type") :
			getString("_UI_EcoaProject_type") + " " + label;
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

		switch (notification.getFeatureID(EcoaProject.class)) {
			case projPackage.ECOA_PROJECT__INITIAL_ASSEMBLY:
			case projPackage.ECOA_PROJECT__LOGICAL_SYSTEM:
			case projPackage.ECOA_PROJECT__CROSS_PLATFORMS_VIEW:
			case projPackage.ECOA_PROJECT__DEPLOYMENT_SCHEMA:
			case projPackage.ECOA_PROJECT__OUTPUT_DIRECTORY:
			case projPackage.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY:
			case projPackage.ECOA_PROJECT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case projPackage.ECOA_PROJECT__GROUP:
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
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__SERVICE_DEFINITIONS,
					 projFactory.eINSTANCE.createFiles())));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__COMPONENT_DEFINITIONS,
					 projFactory.eINSTANCE.createFiles())));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__TYPES,
					 projFactory.eINSTANCE.createFiles())));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__INITIAL_ASSEMBLY,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS,
					 projFactory.eINSTANCE.createFiles())));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__LOGICAL_SYSTEM,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__CROSS_PLATFORMS_VIEW,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__DEPLOYMENT_SCHEMA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__OUTPUT_DIRECTORY,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(projPackage.Literals.ECOA_PROJECT__GROUP,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.ECOA_PROJECT__EUI_DS,
					 projFactory.eINSTANCE.createELIEUIDs())));
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
			childFeature == projPackage.Literals.ECOA_PROJECT__SERVICE_DEFINITIONS ||
			childFeature == projPackage.Literals.ECOA_PROJECT__COMPONENT_DEFINITIONS ||
			childFeature == projPackage.Literals.ECOA_PROJECT__TYPES ||
			childFeature == projPackage.Literals.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS;

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
