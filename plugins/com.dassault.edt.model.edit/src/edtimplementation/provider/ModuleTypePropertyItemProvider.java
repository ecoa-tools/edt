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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.PropertyValue;
import edtproject.Steps;
import edttype.EDTDataType;
import edttype.util.EDTTypeValidator;

/**
 * This is the item provider adapter for a {@link edtimplementation.ModuleTypeProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleTypePropertyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleTypePropertyItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
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
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModuleTypeProperty_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ModuleTypeProperty_name_feature",
						"_UI_ModuleTypeProperty_type"),
				EdtimplementationPackage.Literals.MODULE_TYPE_PROPERTY__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				ModuleTypeProperty propertyToName = (ModuleTypeProperty) object;
				ModuleType moduleType = (ModuleType) propertyToName.eContainer();
				if (propertyToName.getName() != null && value != null) {

					if (Objects.equals(propertyToName.getName(), value)) {
						return;
					}

					EList<ModuleTypeProperty> allPinfos = moduleType.getProperties();
					for (ModuleTypeProperty property : allPinfos) {
						if (!Objects.equals(property, propertyToName) && Objects.equals(property.getName(), value)) {
							super.setPropertyValue(object, propertyToName.getName());

							EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
									"There is another Property with the name : " + value);
							return;
						}
					}
				}
				super.setPropertyValue(object, value);
			}
		});
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModuleTypeProperty_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ModuleTypeProperty_type_feature",
						"_UI_ModuleTypeProperty_type"),
				EdtimplementationPackage.Literals.MODULE_TYPE_PROPERTY__TYPE, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				for (Object value : choiceOfValues) {
					if (value == null
							|| (value instanceof EDTDataType type && EDTTypeValidator.isAPropertyType(type))) {

						filteredChoices.add(value);
					}
				}
				return filteredChoices;
			}

			@Override
			public void setPropertyValue(Object object, Object value) {
				ModuleTypeProperty moduleTypeProperty = (ModuleTypeProperty) object;
				EDTDataType type = (EDTDataType) value;
				if (type != null) {
					EList<PropertyValue> findPropertyValue = findPropertyValue(moduleTypeProperty);
					for (PropertyValue propertyValue : findPropertyValue) {
						if (propertyValue.getValue() != null) {
							String errorMessageToPopUp = "The value " + propertyValue.getValue()
									+ "of the Property in the ModuleInstance "
									+ ((ModuleInstance) propertyValue.eContainer()).getName()
									+ " is not valid with the new type " + type.getFullName()
									+ ". See console for more details.";

							if (!EDTTypeValidator.validateValueAccordingToType(propertyValue.getValue(), type,
									errorMessageToPopUp)) {
								return;
							}
						}
					}
				}
				super.setPropertyValue(object, value);
			}
		});
	}

	public EList<PropertyValue> findPropertyValue(ModuleTypeProperty moduleTypeProperty) {
		EList<PropertyValue> propertyValues = new BasicEList<>();
		Steps steps = Steps.findStepsContainer(moduleTypeProperty);
		Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(moduleTypeProperty, steps);
		for (Setting crossReference : crossReferences) {
			if (crossReference.getEObject() instanceof PropertyValue propertyValue) {
				propertyValues.add(propertyValue);
			}
		}
		return propertyValues;
	}

	/**
	 * This returns ModuleTypeProperty.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleTypeProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModuleTypeProperty)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModuleTypeProperty_type") :
			getString("_UI_ModuleTypeProperty_type") + " " + label;
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

		switch (notification.getFeatureID(ModuleTypeProperty.class)) {
			case EdtimplementationPackage.MODULE_TYPE_PROPERTY__NAME:
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
