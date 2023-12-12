/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

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

import edtbin.provider.EDTEditPlugin;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Library;
import edttype.Simple;
import edttype.util.EDTTypeValidator;

/**
 * This is the item provider adapter for a {@link edttype.Simple} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimpleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SimpleItemProvider(AdapterFactory adapterFactory) {
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
			addCommentPropertyDescriptor(object);
			addMaxRangePropertyDescriptor(object);
			addMinRangePropertyDescriptor(object);
			addPrecisionPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
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
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EDTDataType_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EDTDataType_Name_feature",
								"_UI_EDTDataType_type"),
						EDTTypePackage.Literals.EDT_DATA_TYPE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						EDTDataType typeToName = (EDTDataType) object;

						if (value != null && Objects.equals(typeToName.getName(), value)) {
							return;
						}

						int validateName = new EDTTypeValidator().validateName(object, value);
						if (validateName == 1 || validateName == 3) {
							return;
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EDTDataType_Comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EDTDataType_Comment_feature", "_UI_EDTDataType_type"),
				 EDTTypePackage.Literals.EDT_DATA_TYPE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Range feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addMaxRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Simple_maxRange_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Simple_maxRange_feature",
								"_UI_Simple_type"),
						EDTTypePackage.Literals.SIMPLE__MAX_RANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						Simple simple = (Simple) object;
						if (simple.getType() != null) {
							final String errorMessageToPopUp = "The value " + value
									+ " entered is not valid with the type " + simple.getType().getFullName()
									+ ". See console for more details.";
							if (!EDTTypeValidator.validateValueAccordingToType(value.toString(), simple.getType(),
									errorMessageToPopUp)) {
								return;
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Min Range feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addMinRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Simple_minRange_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Simple_minRange_feature",
								"_UI_Simple_type"),
						EDTTypePackage.Literals.SIMPLE__MIN_RANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						Simple simple = (Simple) object;
						if (simple.getType() != null) {
							final String errorMessageToPopUp = "The value " + value
									+ " entered is not valid with the type " + simple.getType().getFullName()
									+ ". See console for more details.";
							if (!EDTTypeValidator.validateValueAccordingToType(value.toString(), simple.getType(),
									errorMessageToPopUp)) {
								return;
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Precision feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPrecisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Simple_precision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Simple_precision_feature", "_UI_Simple_type"),
				 EDTTypePackage.Literals.SIMPLE__PRECISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Simple_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Simple_unit_feature", "_UI_Simple_type"),
				 EDTTypePackage.Literals.SIMPLE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc -->
	 * Simple can only reference another simple or basic type <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Simple_Type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Simple_Type_feature", "_UI_Simple_type"),
						EDTTypePackage.Literals.SIMPLE__TYPE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<Object>();
						for (Object value : choiceOfValues) {
							if (value == null || EDTTypeValidator.validateType(value, object))
								filteredChoices.add(value);
						}
						return filteredChoices;
					}

					@Override
					public void setPropertyValue(Object object, Object value) {
						Simple simple = (Simple) object;
						EDTDataType type = (EDTDataType) value;
						if (type != null) {
							if (simple.getMinRange() != null) {
								String errorMessageToPopUp = "The min range value " + simple.getMinRange().toString()
										+ "of the Simple is not valid with the new type " + type.getFullName()
										+ ". See console for more details.";

								if (!EDTTypeValidator.validateValueAccordingToType(simple.getMinRange().toString(),
										type, errorMessageToPopUp)) {
									return;
								}
							}
							if (simple.getMaxRange() != null) {
								String errorMessageToPopUp = "The max range value " + simple.getMaxRange().toString()
										+ "of the Simple is not valid with the new type " + type.getFullName()
										+ ". See console for more details.";

								if (!EDTTypeValidator.validateValueAccordingToType(simple.getMaxRange().toString(),
										type, errorMessageToPopUp)) {
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This returns Simple.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Simple"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * Add namespace <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Simple) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Simple_type")
				: getString("_UI_Simple_type") + " " + ((Library) ((Simple) object).eContainer()).getName() + ":"
						+ label;
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

		switch (notification.getFeatureID(Simple.class)) {
			case EDTTypePackage.SIMPLE__NAME:
			case EDTTypePackage.SIMPLE__COMMENT:
			case EDTTypePackage.SIMPLE__MAX_RANGE:
			case EDTTypePackage.SIMPLE__MIN_RANGE:
			case EDTTypePackage.SIMPLE__PRECISION:
			case EDTTypePackage.SIMPLE__UNIT:
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
