/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

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
import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleType;

/**
 * This is the item provider adapter for a {@link edtimplementation.ModuleType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ModuleTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleTypeItemProvider(AdapterFactory adapterFactory) {
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

			addActivatingFaultNotifsPropertyDescriptor(object);
			addHasUserContextPropertyDescriptor(object);
			addHasWarmStartContextPropertyDescriptor(object);
			addIsFaultHandlerPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activating Fault Notifs feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addActivatingFaultNotifsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleType_activatingFaultNotifs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleType_activatingFaultNotifs_feature", "_UI_ModuleType_type"),
				 EdtimplementationPackage.Literals.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has User Context feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addHasUserContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleType_hasUserContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleType_hasUserContext_feature", "_UI_ModuleType_type"),
				 EdtimplementationPackage.Literals.MODULE_TYPE__HAS_USER_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Warm Start Context feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addHasWarmStartContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleType_hasWarmStartContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleType_hasWarmStartContext_feature", "_UI_ModuleType_type"),
				 EdtimplementationPackage.Literals.MODULE_TYPE__HAS_WARM_START_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Fault Handler feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsFaultHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleType_isFaultHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleType_isFaultHandler_feature", "_UI_ModuleType_type"),
				 EdtimplementationPackage.Literals.MODULE_TYPE__IS_FAULT_HANDLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
						getResourceLocator(), getString("_UI_ModuleType_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModuleType_name_feature",
								"_UI_ModuleType_type"),
						EdtimplementationPackage.Literals.MODULE_TYPE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ModuleType moduleTypeToName = (ModuleType) object;
						ComponentImplementation componentImplementation = (ComponentImplementation) moduleTypeToName
								.eContainer();
						if (moduleTypeToName.getName() != null && value != null) {
							if (Objects.equals(moduleTypeToName.getName(), value)) {
								return;
							}

							EList<ModuleType> allModuleType = componentImplementation.getModuleTypes();
							for (ModuleType moduleType : allModuleType) {
								if (!Objects.equals(moduleType, moduleTypeToName)
										&& Objects.equals(moduleType.getName(), value)) {
									super.setPropertyValue(object, moduleTypeToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ModuleType with the name : " + value);
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
			childrenFeatures.add(EdtimplementationPackage.Literals.MODULE_TYPE__PINFO);
			childrenFeatures.add(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS);
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
	 * This returns ModuleType.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModuleType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModuleType_type") :
			getString("_UI_ModuleType_type") + " " + label;
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

		switch (notification.getFeatureID(ModuleType.class)) {
			case EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
			case EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT:
			case EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
			case EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER:
			case EdtimplementationPackage.MODULE_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
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
				(EdtimplementationPackage.Literals.MODULE_TYPE__PINFO,
				 EdtimplementationFactory.eINSTANCE.createPrivatePinfo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__PINFO,
				 EdtimplementationFactory.eINSTANCE.createPublicPinfo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventType()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventSent()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventReceived()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataWritten()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataRead()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestSent()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.MODULE_TYPE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestReceived()));
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
