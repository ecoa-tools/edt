/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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

import com.dassault.edt.log.EDTLog;
import edtbin.provider.EDTEditPlugin;
import edtimplementation.ComponentImplementation;
import edtproject.ComponentDefinition;
import edtqos.EdtqosFactory;
import edtqos.EdtqosPackage;
import edtqos.ServiceInstanceQos;

/**
 * This is the item provider adapter for a {@link edtqos.ServiceInstanceQos} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ServiceInstanceQosItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceInstanceQosItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addServiceDefinitionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service Definition feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addServiceDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInstanceQos_ServiceDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstanceQos_ServiceDefinition_feature", "_UI_ServiceInstanceQos_type"),
				 EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__SERVICE_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ServiceInstanceQos_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstanceQos_Name_feature",
								"_UI_ServiceInstanceQos_type"),
						EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ServiceInstanceQos qosToName = (ServiceInstanceQos) object;
						EList<ServiceInstanceQos> associatedQoS = new BasicEList<>();
						if (qosToName.eContainer() instanceof ComponentDefinition componentDefinition) {
							associatedQoS = componentDefinition.getAssociatedServiceQos();
						} else if (qosToName.eContainer() instanceof ComponentImplementation componentImplementation) {
							associatedQoS = componentImplementation.getAssociatedServiceQos();
						}
						if (value != null) {
							for (ServiceInstanceQos serviceInstanceQos : associatedQoS) {
								if (!Objects.equals(serviceInstanceQos, qosToName)
										&& Objects.equals(serviceInstanceQos.getName(), value)) {
									super.setPropertyValue(object, qosToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ServiceInstanceQoS with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__OPERATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceInstanceQos.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceInstanceQos"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceInstanceQos) object).getName();
		String className = "Service QoS";
		return label == null || label.length() == 0 ? className : className + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServiceInstanceQos.class)) {
			case EdtqosPackage.SERVICE_INSTANCE_QOS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtqosPackage.SERVICE_INSTANCE_QOS__OPERATIONS:
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
				(EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__OPERATIONS,
				 EdtqosFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__OPERATIONS,
				 EdtqosFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EdtqosPackage.Literals.SERVICE_INSTANCE_QOS__OPERATIONS,
				 EdtqosFactory.eINSTANCE.createRequestResponse()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EDTEditPlugin.INSTANCE;
	}

}
