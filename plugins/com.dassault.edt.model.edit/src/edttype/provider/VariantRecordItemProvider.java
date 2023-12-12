/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.provider;

import edtbin.provider.EDTEditPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import edttype.EDTDataType;
import edttype.EDTTypeFactory;
import edttype.EDTTypePackage;
import edttype.Library;
import edttype.VariantRecord;
import edttype.util.EDTTypeValidator;

/**
 * This is the item provider adapter for a {@link edttype.VariantRecord} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class VariantRecordItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariantRecordItemProvider(AdapterFactory adapterFactory) {
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
			addSelectNamePropertyDescriptor(object);
			addSelectTypePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Select Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSelectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantRecord_selectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantRecord_selectName_feature", "_UI_VariantRecord_type"),
				 EDTTypePackage.Literals.VARIANT_RECORD__SELECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Type feature. <!--
	 * begin-user-doc --> TODO <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSelectTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VariantRecord_SelectType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VariantRecord_SelectType_feature",
								"_UI_VariantRecord_type"),
						EDTTypePackage.Literals.VARIANT_RECORD__SELECT_TYPE, true, false, true, null, null, null) {
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
			childrenFeatures.add(EDTTypePackage.Literals.VARIANT_RECORD__FIELD);
			childrenFeatures.add(EDTTypePackage.Literals.VARIANT_RECORD__UNION);
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
	 * This returns VariantRecord.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariantRecord"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariantRecord) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VariantRecord_type")
				: getString("_UI_VariantRecord_type") + " "
						+ ((Library) ((VariantRecord) object).eContainer()).getName() + ":" + label;
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

		switch (notification.getFeatureID(VariantRecord.class)) {
			case EDTTypePackage.VARIANT_RECORD__NAME:
			case EDTTypePackage.VARIANT_RECORD__COMMENT:
			case EDTTypePackage.VARIANT_RECORD__SELECT_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EDTTypePackage.VARIANT_RECORD__FIELD:
			case EDTTypePackage.VARIANT_RECORD__UNION:
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
				(EDTTypePackage.Literals.VARIANT_RECORD__FIELD,
				 EDTTypeFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.VARIANT_RECORD__UNION,
				 EDTTypeFactory.eINSTANCE.createUnion()));
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
