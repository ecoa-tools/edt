/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
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
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleType;

/**
 * This is the item provider adapter for a {@link edtimplementation.ModuleImplementation} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class ModuleImplementationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addLanguagePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addModuleTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleImplementation_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleImplementation_language_feature", "_UI_ModuleImplementation_type"),
				 EdtimplementationPackage.Literals.MODULE_IMPLEMENTATION__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModuleImplementation_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ModuleImplementation_name_feature",
						"_UI_ModuleImplementation_type"),
				EdtimplementationPackage.Literals.MODULE_IMPLEMENTATION__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				ModuleImplementation moduleImplementationToName = (ModuleImplementation) object;
				ComponentImplementation componentImplementation = (ComponentImplementation) moduleImplementationToName
						.eContainer();
				if (moduleImplementationToName.getName() != null && value != null) {
					if (Objects.equals(moduleImplementationToName.getName(), value)) {
						return;
					}

					EList<ModuleImplementation> allModuleImplementation = componentImplementation
							.getModuleImplementations();
					for (ModuleImplementation moduleImplementation : allModuleImplementation) {
						if (!Objects.equals(moduleImplementation, moduleImplementationToName)
								&& Objects.equals(moduleImplementation.getName(), value)) {
							super.setPropertyValue(object, moduleImplementationToName.getName());

							EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
									"There is another ModuleImplementation with the name : " + value);
							return;
						}
					}
				}
				super.setPropertyValue(object, value);
			}
		});
	}

	/**
	 * This adds a property descriptor for the Module Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addModuleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModuleImplementation_moduleType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModuleImplementation_moduleType_feature",
								"_UI_ModuleImplementation_type"),
						EdtimplementationPackage.Literals.MODULE_IMPLEMENTATION__MODULE_TYPE, true, false, true, null,
						null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						ModuleImplementation moduleImplementation = (ModuleImplementation) object;
						EObject eContainer = moduleImplementation.eContainer();
						if (eContainer instanceof ComponentImplementation componentImplementation) {
							for (Object value : choiceOfValues) {
								ModuleType moduleType = (ModuleType) value;
								if (value == null || componentImplementation.getModuleTypes().contains(moduleType)) {
									filteredChoices.add(value);
								}
							}
						}
						return filteredChoices;
					}

					@Override
					public void setPropertyValue(Object object, Object value) {
						ModuleImplementation moduleImplementation = (ModuleImplementation) object;
						if (!Objects.equals(moduleImplementation.getModuleType(), value)
								&& !moduleImplementation.findAssociatedModuleInstance().isEmpty()) {
							StringBuilder errorMessage = new StringBuilder();
							for (ModuleInstance moduleInstance : moduleImplementation.findAssociatedModuleInstance()) {
								if (!moduleInstance.getOperations().isEmpty()) {
									errorMessage.append(
											"The Operations inherited through the new ModuleImplementation being different, all Operation Links of "
													+ moduleInstance.getName() + " are deleted \n");
								}
							}
							if (!errorMessage.isEmpty()) {
								EDTLog.toPopUpAndConsole(
										"Warning the modification of the ModuleType has impact on operation links ",
										errorMessage.toString());
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This returns ModuleImplementation.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModuleImplementation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModuleImplementation_type") :
			getString("_UI_ModuleImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(ModuleImplementation.class)) {
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__LANGUAGE:
			case EdtimplementationPackage.MODULE_IMPLEMENTATION__NAME:
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
