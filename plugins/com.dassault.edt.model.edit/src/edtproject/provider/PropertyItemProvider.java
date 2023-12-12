/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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

import com.dassault.edt.log.EDTLog;

import edtbin.provider.EDTEditPlugin;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.ComponentProperty;
import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.Property;
import edttype.EDTDataType;
import edttype.Library;
import edttype.util.EDTTypeValidator;

/**
 * This is the item provider adapter for a {@link edtproject.Property} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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

			addMustSupplyPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addECOASCATypePropertyDescriptor(object);
			addECOASCALibraryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Must Supply feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMustSupplyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_mustSupply_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_mustSupply_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__MUST_SUPPLY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_type_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__TYPE, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {

				});
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
						getResourceLocator(), getString("_UI_Property_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_name_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						Property propertyToName = (Property) object;
						if (value != null) {

							if (Objects.equals(propertyToName.getName(), value)) {
								return;
							}

							EList<Property> allProperties;
							String container;
							if (propertyToName.eContainer() instanceof Composite composite) {
								allProperties = composite.getProperties();
								container = " in the Composite";
							} else {
								ComponentDefinition componentDefinition = (ComponentDefinition) propertyToName
										.eContainer();
								allProperties = componentDefinition.getProperties();
								container = " in the ComponentDefinition";
							}
							for (Property property : allProperties) {
								if (!Objects.equals(propertyToName, property)
										&& Objects.equals(property.getName(), propertyToName.getName())) {

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another Property with the name : " + value + container);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Value feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_Value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_Value_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__VALUE, true, true, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						Property componentDefinitionProperty = (Property) object;
						String str = (String) value;
						if (value != null && componentDefinitionProperty.getECOASCAType() != null) {
							final String errorMessageToPopUp = "The value " + value
									+ " entered is not valid with the ecoa-sca type "
									+ componentDefinitionProperty.getECOASCAType().getFullName()
									+ ". See console for more details.";
							if (!EDTTypeValidator.validateValueAccordingToType(str,
									componentDefinitionProperty.getECOASCAType(), errorMessageToPopUp)) {
								return;
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the ECOASCA Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addECOASCATypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_ECOASCAType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_ECOASCAType_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__ECOASCA_TYPE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Property property = (Property) object;
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						for (Object value : choiceOfValues) {
							if (value == null || (value instanceof EDTDataType type
									&& EDTTypeValidator.isAPropertyType(type)
									&& (property.getECOASCALibrary() == null || Objects
											.equals(property.getECOASCALibrary(), Library.getLibrary(value))))) {

								filteredChoices.add(value);
							}
						}
						return filteredChoices;
					}

					@Override
					public void setPropertyValue(Object object, Object value) {
						Property property = (Property) object;
						EDTDataType type = (EDTDataType) value;
						if (type != null) {
							EList<ComponentProperty> findComponentProperties = property
									.findAssociatedComponentProperty();
							for (ComponentProperty componentProperty : findComponentProperties) {
								if (componentProperty.getValue() != null) {
									String errorMessageToPopUp = "The value " + componentProperty.getValue()
											+ " of the Property in the Component "
											+ ((Component) componentProperty.eContainer()).getName()
											+ " is not valid with the new ecoa-sca type " + type.getFullName()
											+ ". See console for more details.";

									if (!EDTTypeValidator.validateValueAccordingToType(componentProperty.getValue(),
											type, errorMessageToPopUp)) {
										return;
									}
								}
							}
							if (property.getValue() != null && !property.getValue().isBlank()) {
								String errorMessageToPopUp = "The value " + property.getValue() + " of the Property "
										+ property.getName() + " is not valid with the new ecoa-sca type "
										+ type.getFullName() + ". See console for more details.";

								if (!EDTTypeValidator.validateValueAccordingToType(property.getValue(), type,
										errorMessageToPopUp)) {
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the ECOASCA Library feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addECOASCALibraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Property_ECOASCALibrary_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Property_ECOASCALibrary_feature",
								"_UI_Property_type"),
						EDTProjectPackage.Literals.PROPERTY__ECOASCA_LIBRARY, true, false, true, null, null, null));
	}

	/**
	 * This returns Property.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Property) object).getName();
		String className;
		if (((Property) object).eContainer() instanceof ComponentDefinition) {
			className = "Component Definition Property";
		} else {
			className = ((Property) object).eContainer().eClass().getName() + " Property";
		}
		return label == null || label.length() == 0 ? className : className + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update
	 * any cached children and by creating a viewer notification, which it passes to
	 * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Property.class)) {
		case EDTProjectPackage.PROPERTY__MUST_SUPPLY:
		case EDTProjectPackage.PROPERTY__TYPE:
		case EDTProjectPackage.PROPERTY__NAME:
		case EDTProjectPackage.PROPERTY__VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing
	 * the children that can be created under this object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
