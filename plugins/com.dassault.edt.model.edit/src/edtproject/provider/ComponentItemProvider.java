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
import edtproject.Component;
import edtproject.Composite;
import edtproject.EDTProjectFactory;
import edtproject.EDTProjectPackage;

/**
 * This is the item provider adapter for a {@link edtproject.Component} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addComponentDefinitionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addComponentImplementationPropertyDescriptor(object);
			addComponentDefinitionVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component Definition feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addComponentDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_ComponentDefinition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_ComponentDefinition_feature",
								"_UI_Component_type"),
						EDTProjectPackage.Literals.COMPONENT__COMPONENT_DEFINITION, true, false, true, null, null,
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
						getResourceLocator(), getString("_UI_Component_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_Name_feature",
								"_UI_Component_type"),
						EDTProjectPackage.Literals.COMPONENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {

					@Override
					public void setPropertyValue(Object object, Object value) {
						Component componentToName = (Component) object;
						Composite composite = (Composite) componentToName.eContainer();
						if (value != null) {

							if (Objects.equals(componentToName.getName(), value)) {
								return;
							}

							EList<Component> allComponent = composite.getComponents();
							for (Component component : allComponent) {
								if (!Objects.equals(component, componentToName)
										&& Objects.equals(component.getName(), value)) {
									super.setPropertyValue(object, componentToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another Component with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Component Implementation feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComponentImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_ComponentImplementation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_ComponentImplementation_feature",
								"_UI_Component_type"),
						EDTProjectPackage.Literals.COMPONENT__COMPONENT_IMPLEMENTATION, true, false, true, null, null,
						null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Component component = (Component) object;
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						if (component.getComponentDefinition() != null) {
							for (Object choice : choiceOfValues) {
								if (choice == null || (choice instanceof ComponentImplementation ci && Objects
										.equals(ci.getComponentDefinition(), component.getComponentDefinition()))) {
									filteredChoices.add(choice);
								}
							}
						}
						return filteredChoices;
					}
				});
	}

	/**
	 * This adds a property descriptor for the Component Definition Version feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addComponentDefinitionVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_ComponentDefinitionVersion_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_ComponentDefinitionVersion_feature",
						"_UI_Component_type"),
				EDTProjectPackage.Literals.COMPONENT__COMPONENT_DEFINITION_VERSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an
	 * appropriate feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EDTProjectPackage.Literals.COMPONENT__COMPONENT_REFERENCES);
			childrenFeatures.add(EDTProjectPackage.Literals.COMPONENT__COMPONENT_SERVICES);
			childrenFeatures.add(EDTProjectPackage.Literals.COMPONENT__PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to
		// use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Component.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
		case EDTProjectPackage.COMPONENT__NAME:
		case EDTProjectPackage.COMPONENT__COMPONENT_DEFINITION_VERSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EDTProjectPackage.COMPONENT__COMPONENT_REFERENCES:
		case EDTProjectPackage.COMPONENT__COMPONENT_SERVICES:
		case EDTProjectPackage.COMPONENT__PROPERTIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(EDTProjectPackage.Literals.COMPONENT__COMPONENT_REFERENCES,
				EDTProjectFactory.eINSTANCE.createComponentReference()));

		newChildDescriptors.add(createChildParameter(EDTProjectPackage.Literals.COMPONENT__COMPONENT_SERVICES,
				EDTProjectFactory.eINSTANCE.createComponentService()));

		newChildDescriptors.add(createChildParameter(EDTProjectPackage.Literals.COMPONENT__PROPERTIES,
				EDTProjectFactory.eINSTANCE.createComponentProperty()));
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
