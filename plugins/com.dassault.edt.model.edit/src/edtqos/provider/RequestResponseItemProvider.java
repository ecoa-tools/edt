/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.provider;

import edtbin.provider.EDTEditPlugin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import edtqos.EdtqosPackage;
import edtqos.RequestResponse;

/**
 * This is the item provider adapter for a {@link edtqos.RequestResponse} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class RequestResponseItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RequestResponseItemProvider(AdapterFactory adapterFactory) {
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

			addHighestRateNumberOfOccurrencesPropertyDescriptor(object);
			addHighestRateTimeFramePropertyDescriptor(object);
			addLowestRateNumberOfOccurrencesPropertyDescriptor(object);
			addLowestRateTimeFramePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addCallbackMaxHandlingTimePropertyDescriptor(object);
			addMaxResponseTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Highest Rate Number Of Occurrences feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHighestRateNumberOfOccurrencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_highestRateNumberOfOccurrences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_highestRateNumberOfOccurrences_feature", "_UI_Operation_type"),
				 EdtqosPackage.Literals.OPERATION__HIGHEST_RATE_NUMBER_OF_OCCURRENCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Highest Rate Time Frame feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addHighestRateTimeFramePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_highestRateTimeFrame_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_highestRateTimeFrame_feature", "_UI_Operation_type"),
				 EdtqosPackage.Literals.OPERATION__HIGHEST_RATE_TIME_FRAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lowest Rate Number Of Occurrences feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowestRateNumberOfOccurrencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_lowestRateNumberOfOccurrences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_lowestRateNumberOfOccurrences_feature", "_UI_Operation_type"),
				 EdtqosPackage.Literals.OPERATION__LOWEST_RATE_NUMBER_OF_OCCURRENCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lowest Rate Time Frame feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLowestRateTimeFramePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_lowestRateTimeFrame_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_lowestRateTimeFrame_feature", "_UI_Operation_type"),
				 EdtqosPackage.Literals.OPERATION__LOWEST_RATE_TIME_FRAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_Operation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_name_feature", "_UI_Operation_type"),
				 EdtqosPackage.Literals.OPERATION__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Callback Max Handling Time feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallbackMaxHandlingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequestResponse_callbackMaxHandlingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequestResponse_callbackMaxHandlingTime_feature", "_UI_RequestResponse_type"),
				 EdtqosPackage.Literals.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Response Time feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMaxResponseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequestResponse_maxResponseTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequestResponse_maxResponseTime_feature", "_UI_RequestResponse_type"),
				 EdtqosPackage.Literals.REQUEST_RESPONSE__MAX_RESPONSE_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RequestResponse.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequestResponse"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		edtinterface.RequestResponse labelValue = ((RequestResponse) object).getServiceDefinitionRequestResponse();
		String label = ((RequestResponse) object).getName();
		String className = "Operation Request Response";
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

		switch (notification.getFeatureID(RequestResponse.class)) {
			case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME:
			case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME:
			case EdtqosPackage.REQUEST_RESPONSE__NAME:
			case EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
			case EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
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
