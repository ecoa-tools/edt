/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.dassault.edt.log.EDTLog;

import edtproject.Composite;
import edtproject.CompositeReference;
import edtproject.EDTProjectPackage;

/**
 * This is the item provider adapter for a {@link edtproject.CompositeReference} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class CompositeReferenceItemProvider extends ContractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompositeReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addMultiplicityPropertyDescriptor(object);
			addPromotePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeReference_multiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeReference_multiplicity_feature", "_UI_CompositeReference_type"),
				 EDTProjectPackage.Literals.COMPOSITE_REFERENCE__MULTIPLICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Promote feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPromotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeReference_promote_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeReference_promote_feature", "_UI_CompositeReference_type"),
				 EDTProjectPackage.Literals.COMPOSITE_REFERENCE__PROMOTE,
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
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CompositeReference_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CompositeReference_name_feature",
								"_UI_CompositeReference_type"),
						EDTProjectPackage.Literals.COMPOSITE_REFERENCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						CompositeReference compositeReferenceToName = (CompositeReference) object;
						Composite composite = (Composite) compositeReferenceToName.eContainer();
						if (value != null) {

							if (Objects.equals(compositeReferenceToName.getName(), value)) {
								return;
							}

							EList<CompositeReference> allCompositeReferences = composite.getReferences();
							for (CompositeReference compRef : allCompositeReferences) {
								if (!Objects.equals(compRef, compositeReferenceToName)
										&& Objects.equals(compRef.getName(), value)) {
									super.setPropertyValue(object, compositeReferenceToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another Composite Reference with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This returns CompositeReference.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeReference_type") :
			getString("_UI_CompositeReference_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeReference.class)) {
			case EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY:
			case EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE:
			case EDTProjectPackage.COMPOSITE_REFERENCE__NAME:
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

}
