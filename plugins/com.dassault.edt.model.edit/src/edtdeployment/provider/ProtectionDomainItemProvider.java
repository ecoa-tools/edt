/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.provider;

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
import edtdeployment.Deployment;
import edtdeployment.EdtdeploymentFactory;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtlogical.LogicalComputingNode;

/**
 * This is the item provider adapter for a {@link edtdeployment.ProtectionDomain} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ProtectionDomainItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProtectionDomainItemProvider(AdapterFactory adapterFactory) {
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
			addExecuteOnComputingNodePropertyDescriptor(object);
			addExecuteOnComputingPlatformPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_ProtectionDomain_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProtectionDomain_name_feature",
								"_UI_ProtectionDomain_type"),
						EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ProtectionDomain protectionDomainToName = (ProtectionDomain) object;
						Deployment deployment = (Deployment) protectionDomainToName.eContainer();
						if (protectionDomainToName.getName() != null && value != null) {
							if (Objects.equals(protectionDomainToName.getName(), value)) {
								return;
							}

							EList<ProtectionDomain> allProtectionDomain = deployment.getProtectionDomains();
							for (ProtectionDomain protectionDomain : allProtectionDomain) {
								if (!Objects.equals(protectionDomain, protectionDomainToName)
										&& Objects.equals(protectionDomain.getName(), value)) {
									super.setPropertyValue(object, protectionDomainToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ProtectionDomain with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Execute On Computing Node feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addExecuteOnComputingNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProtectionDomain_executeOnComputingNode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ProtectionDomain_executeOnComputingNode_feature", "_UI_ProtectionDomain_type"),
						EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE, true, false, true,
						null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						ProtectionDomain protectionDomain = (ProtectionDomain) object;
						if (protectionDomain.getExecuteOnComputingPlatform() != null) {
							for (Object choice : choiceOfValues) {
								if (choice == null || (choice instanceof LogicalComputingNode node && Objects
										.equals(node.eContainer(), protectionDomain.getExecuteOnComputingPlatform()))) {
									filteredChoices.add(choice);
								}
							}
							return filteredChoices;
						} else {
							return choiceOfValues;
						}
					}
				});
	}

	/**
	 * This adds a property descriptor for the Execute On Computing Platform
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addExecuteOnComputingPlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProtectionDomain_executeOnComputingPlatform_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ProtectionDomain_executeOnComputingPlatform_feature", "_UI_ProtectionDomain_type"),
						EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM, true, false,
						true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						ProtectionDomain protectionDomain = (ProtectionDomain) object;
						if (protectionDomain.getExecuteOnComputingNode() != null) {
							filteredChoices.add(null);
							filteredChoices.add(protectionDomain.getExecuteOnComputingNode().eContainer());
							return filteredChoices;
						} else {
							return choiceOfValues;
						}
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
			childrenFeatures.add(EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES);
			childrenFeatures.add(EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES);
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
	 * This returns ProtectionDomain.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProtectionDomain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProtectionDomain)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProtectionDomain_type") :
			getString("_UI_ProtectionDomain_type") + " " + label;
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

		switch (notification.getFeatureID(ProtectionDomain.class)) {
			case EdtdeploymentPackage.PROTECTION_DOMAIN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
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
				(EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES,
				 EdtdeploymentFactory.eINSTANCE.createDeployedModuleInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtdeploymentPackage.Literals.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES,
				 EdtdeploymentFactory.eINSTANCE.createDeployedTriggerInstance()));
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
