/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.provider;

import java.math.BigDecimal;
import java.math.BigInteger;
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
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtimplementation.Instance;
import edtimplementation.ModuleInstance;
import edtimplementation.Trigger;
import edtproject.Component;

/**
 * This is the item provider adapter for a
 * {@link edtdeployment.DeployedTriggerInstance} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DeployedTriggerInstanceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DeployedTriggerInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addTriggerPriorityPropertyDescriptor(object);
			addTriggerInstancePropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Trigger Priority feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTriggerPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeployedTriggerInstance_triggerPriority_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeployedTriggerInstance_triggerPriority_feature",
						"_UI_DeployedTriggerInstance_type"),
				EdtdeploymentPackage.Literals.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				// TODO Auto-generated method stub
				DeployedTriggerInstance deployed = (DeployedTriggerInstance) object;
				BigDecimal selfModulePriority = (BigDecimal) value;
				if (deployed.getTriggerInstance() != null) {
					Trigger selfTriggerInstance = deployed.getTriggerInstance();
					BigInteger selfRelativePriority = deployed.getTriggerInstance().getRelativePriority();
					BigDecimal decimalSelfRP = new BigDecimal(selfRelativePriority);
					ProtectionDomain pd = (ProtectionDomain) deployed.eContainer();
					EList<DeployedTriggerInstance> deployedTriggerInstances = pd.getDeployedTriggerInstances();
					EList<DeployedModuleInstance> deployedModuleInstances = pd.getDeployedModuleInstances();
					for (DeployedModuleInstance deployedModuleInstance : deployedModuleInstances) {
						BigDecimal otherModulePriority = deployedModuleInstance.getModulePriority();
						if (deployedModuleInstance.getModuleInstance() != null) {
							ModuleInstance otherModuleInstance = deployedModuleInstance.getModuleInstance();
							BigInteger otherRelativePriority = deployedModuleInstance.getModuleInstance()
									.getRelativePriority();
							BigDecimal decimalOtherRP = new BigDecimal(otherRelativePriority);
							int compareToTriggerPriority = selfModulePriority.compareTo(otherModulePriority);
							int compareToRelativePriority = decimalSelfRP.compareTo(decimalOtherRP);
							if (compareToTriggerPriority != compareToRelativePriority && Objects
									.equals(selfTriggerInstance.eContainer(), otherModuleInstance.eContainer())) {
								StringBuilder modulePriorityErrorMessage = createErrorMessage(selfTriggerInstance,
										otherModuleInstance, compareToTriggerPriority, compareToRelativePriority);

								EDTLog.toPopUpAndConsole(
										"ERROR : The Trigger Priority entered is not coherent with the relative priorities entered at the Component Implementation level. See console for more details.",
										modulePriorityErrorMessage.toString());
								return;
							}
						}
					}
					for (DeployedTriggerInstance deployedTriggerInstance : deployedTriggerInstances) {
						if (Objects.equals(deployed, deployedTriggerInstance)) {
							continue;
						}
						BigDecimal otherTriggerPriority = deployedTriggerInstance.getTriggerPriority();
						if (deployedTriggerInstance.getTriggerInstance() != null) {
							Trigger otherTriggerInstance = deployedTriggerInstance.getTriggerInstance();
							BigInteger otherRelativePriority = deployedTriggerInstance.getTriggerInstance()
									.getRelativePriority();
							BigDecimal decimalOtherRP = new BigDecimal(otherRelativePriority);
							int compareToModulePriority = selfModulePriority.compareTo(otherTriggerPriority);
							int compareToRelativePriority = decimalSelfRP.compareTo(decimalOtherRP);
							if (compareToModulePriority != compareToRelativePriority && Objects
									.equals(selfTriggerInstance.eContainer(), otherTriggerInstance.eContainer())) {
								StringBuilder modulePriorityErrorMessage = createErrorMessage(selfTriggerInstance,
										otherTriggerInstance, compareToModulePriority, compareToRelativePriority);

								EDTLog.toPopUpAndConsole(
										"ERROR : The Trigger Priority entered is not coherent with the relative priorities entered at the Component Implementation level. See console for more details.",
										modulePriorityErrorMessage.toString());
								return;
							}
						}
					}
				}
				super.setPropertyValue(object, value);
			}
		});
	}

	/**
	 * Create error message when incoherence between Module/Trigger Priority and
	 * Relative Priority
	 * 
	 * @param selfInstance              : Trigger Instance of Deployed
	 * @param otherInstance             : Trigger/Module Instance compared
	 * @param compareToTriggerPriority  : comparison between Trigger Priorities
	 * @param compareToRelativePriority : Comparison between Relative Priority
	 * @return
	 */
	protected StringBuilder createErrorMessage(Trigger selfInstance, Instance otherInstance,
			int compareToTriggerPriority, int compareToRelativePriority) {
		StringBuilder modulePriorityErrorMessage = new StringBuilder();
		if (compareToTriggerPriority == 0) {
			modulePriorityErrorMessage.append("The Module/Trigger Priorities of the deployed " + selfInstance.getName()
					+ " and  the deployed " + otherInstance.getName() + " are equals.\n");
		} else if (compareToTriggerPriority < 0) {
			modulePriorityErrorMessage.append("The Module/Trigger Priority of the deployed " + selfInstance.getName()
					+ " is lower than the Module/Trigger Priority of the deployed " + otherInstance.getName() + "\n");
		} else {
			modulePriorityErrorMessage.append("The Module/Trigger Priority of the deployed " + selfInstance.getName()
					+ " is higher than the Module/Trigger Priority of the deployed " + otherInstance.getName() + "\n");
		}

		if (compareToRelativePriority == 0) {
			modulePriorityErrorMessage.append(", but the Relative Priorities of " + selfInstance.getName() + " and "
					+ otherInstance.getName() + " are equals\n");
		} else if (compareToTriggerPriority < 0) {
			modulePriorityErrorMessage.append("The Relative Priority of " + selfInstance.getName()
					+ " is lower than the Relative Priority of " + otherInstance.getName() + "\n");
		} else {
			modulePriorityErrorMessage.append("The Relative Priority of " + selfInstance.getName()
					+ " is higher than the Relative Priority of " + otherInstance.getName() + "\n");
		}
		return modulePriorityErrorMessage;
	}

	/**
	 * This adds a property descriptor for the Trigger Instance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTriggerInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeployedTriggerInstance_TriggerInstance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeployedTriggerInstance_TriggerInstance_feature",
						"_UI_DeployedTriggerInstance_type"),
				EdtdeploymentPackage.Literals.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_INSTANCE, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				DeployedTriggerInstance deployed = (DeployedTriggerInstance) object;
				if (deployed.getComponentImplementation() != null) {
					for (Object choice : choiceOfValues) {
						if (choice == null || (choice instanceof Instance instance
								&& Objects.equals(instance.eContainer(), deployed.getComponentImplementation()))) {
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
	 * This adds a property descriptor for the Component feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DeployedTriggerInstance_Component_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DeployedTriggerInstance_Component_feature",
								"_UI_DeployedTriggerInstance_type"),
						EdtdeploymentPackage.Literals.DEPLOYED_TRIGGER_INSTANCE__COMPONENT, true, false, true, null,
						null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<>();
						DeployedTriggerInstance deployed = (DeployedTriggerInstance) object;
						if (deployed.getTriggerInstance() != null) {
							for (Object choice : choiceOfValues) {
								if (choice == null || (choice instanceof Component component
										&& Objects.equals(component.getComponentImplementation(),
												deployed.getTriggerInstance().eContainer()))) {
									filteredChoices.add(choice);
								}
							}
						} else {
							for (Object choice : choiceOfValues) {
								if (choice == null || (choice instanceof Component component
										&& component.getComponentImplementation() != null)) {
									filteredChoices.add(choice);
								}
							}
						}
						return filteredChoices;
					}
				});
	}

	/**
	 * This returns DeployedTriggerInstance.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeployedTriggerInstance"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigDecimal labelValue = ((DeployedTriggerInstance) object).getTriggerPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_DeployedTriggerInstance_type")
				: getString("_UI_DeployedTriggerInstance_type") + " " + label;
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

		switch (notification.getFeatureID(DeployedTriggerInstance.class)) {
		case EdtdeploymentPackage.DEPLOYED_TRIGGER_INSTANCE__TRIGGER_PRIORITY:
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
