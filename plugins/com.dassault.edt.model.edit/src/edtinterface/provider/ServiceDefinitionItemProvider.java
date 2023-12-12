/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import edtinterface.EDTInterfaceFactory;
import edtinterface.EDTInterfacePackage;
import edtinterface.ServiceDefinition;
import edtproject.Step1;
import edttype.EDTTypeFactory;

/**
 * This is the item provider adapter for a {@link edtinterface.ServiceDefinition} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ServiceDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addUsedLibrariesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_ServiceDefinition_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ServiceDefinition_Name_feature",
								"_UI_ServiceDefinition_type"),
						EDTInterfacePackage.Literals.SERVICE_DEFINITION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ServiceDefinition serviceDefinitionToName = (ServiceDefinition) object;
						Step1 step1 = (Step1) serviceDefinitionToName.eContainer();
						if (value != null) {

							if (Objects.equals(serviceDefinitionToName.getName(), value)) {
								return;
							}

							EList<ServiceDefinition> allServices = step1.getServices();
							for (ServiceDefinition service : allServices) {
								if (!Objects.equals(service, serviceDefinitionToName)
										&& Objects.equals(service.getName(), value)) {
									super.setPropertyValue(object, serviceDefinitionToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ServiceDefinition with the name " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Used Libraries feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUsedLibrariesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDefinition_usedLibraries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDefinition_usedLibraries_feature", "_UI_ServiceDefinition_type"),
				 EDTInterfacePackage.Literals.SERVICE_DEFINITION__USED_LIBRARIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(EDTInterfacePackage.Literals.SERVICE_DEFINITION__OPERATIONS);
			childrenFeatures.add(EDTInterfacePackage.Literals.SERVICE_DEFINITION__USED_LIBRARIES);
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
	 * This returns ServiceDefinition.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceDefinition_type") :
			getString("_UI_ServiceDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceDefinition.class)) {
			case EDTInterfacePackage.SERVICE_DEFINITION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EDTInterfacePackage.SERVICE_DEFINITION__OPERATIONS:
			case EDTInterfacePackage.SERVICE_DEFINITION__USED_LIBRARIES:
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
				(EDTInterfacePackage.Literals.SERVICE_DEFINITION__OPERATIONS,
				 EDTInterfaceFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(EDTInterfacePackage.Literals.SERVICE_DEFINITION__OPERATIONS,
				 EDTInterfaceFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EDTInterfacePackage.Literals.SERVICE_DEFINITION__OPERATIONS,
				 EDTInterfaceFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(EDTInterfacePackage.Literals.SERVICE_DEFINITION__USED_LIBRARIES,
				 EDTTypeFactory.eINSTANCE.createLibrary()));
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
