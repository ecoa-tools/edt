/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.ProtectionDomain;
import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.Instance;
import edtimplementation.ModuleInstance;
import edtimplementation.Trigger;
import edtimplementation.TriggerInstance;
import edtproject.Steps;

/**
 * This is the item provider adapter for a {@link edtimplementation.TriggerInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerInstanceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	private static final String IN_THE_PROTECTION_DOMAIN = "In the Protection Domain ";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TriggerInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addModuleBehaviourPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRelativePriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Module Behaviour feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addModuleBehaviourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instance_moduleBehaviour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instance_moduleBehaviour_feature", "_UI_Instance_type"),
				 EdtimplementationPackage.Literals.INSTANCE__MODULE_BEHAVIOUR,
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
						getResourceLocator(), getString("_UI_Instance_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instance_name_feature",
								"_UI_Instance_type"),
						EdtimplementationPackage.Literals.INSTANCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						TriggerInstance triggerInstanceToName = (TriggerInstance) object;
						ComponentImplementation componentImplementation = (ComponentImplementation) triggerInstanceToName
								.eContainer();
						if (triggerInstanceToName.getName() != null && value != null) {
							if (Objects.equals(triggerInstanceToName.getName(), value)) {
								return;
							}

							EList<Instance> allInstances = componentImplementation.getInstances();
							for (Instance instance : allInstances) {
								if (!Objects.equals(instance, triggerInstanceToName)
										&& Objects.equals(instance.getName(), value)) {
									super.setPropertyValue(object, triggerInstanceToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another Instance with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Relative Priority feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addRelativePriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instance_relativePriority_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instance_relativePriority_feature",
								"_UI_Instance_type"),
						EdtimplementationPackage.Literals.INSTANCE__RELATIVE_PRIORITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						TriggerInstance selfTriggerInstance = (TriggerInstance) object;
						BigInteger selfRelativePriority = (BigInteger) value;
						BigDecimal decimalSelfRP = new BigDecimal(selfRelativePriority);
						EList<DeployedTriggerInstance> findDeployed = findDeployed(selfTriggerInstance);
						StringBuilder modulePriorityErrorMessage = new StringBuilder();
						if (!findDeployed.isEmpty()) {
							for (DeployedTriggerInstance deployed : findDeployed) {
								BigDecimal selfTriggerPriority = deployed.getTriggerPriority();
								ProtectionDomain pd = (ProtectionDomain) deployed.eContainer();
								EList<DeployedTriggerInstance> deployedTriggerInstances = pd
										.getDeployedTriggerInstances();
								EList<DeployedModuleInstance> deployedModuleInstances = pd.getDeployedModuleInstances();
								for (DeployedModuleInstance deployedModuleInstance : deployedModuleInstances) {
									compareToModuleInstance(selfTriggerInstance, decimalSelfRP,
											modulePriorityErrorMessage, selfTriggerPriority, pd,
											deployedModuleInstance);
								}
								for (DeployedTriggerInstance deployedTriggerInstance : deployedTriggerInstances) {
									compareToTriggerInstance(selfTriggerInstance, decimalSelfRP,
											modulePriorityErrorMessage, deployed, selfTriggerPriority, pd,
											deployedTriggerInstance);
								}
								EDTLog.toPopUpAndConsole(
										"Warning : The Trigger Priority entered is not coherent with the relative priorities entered at the Component Implementation level. See console for more details.",
										modulePriorityErrorMessage.toString());
							}
						}
						super.setPropertyValue(object, value);
					}

				});

	}

	/**
	 * @param selfTriggerInstance
	 * @param decimalSelfRP
	 * @param modulePriorityErrorMessage
	 * @param selfTriggerPriority
	 * @param pd
	 * @param deployedModuleInstance
	 */
	protected void compareToModuleInstance(TriggerInstance selfTriggerInstance, BigDecimal decimalSelfRP,
			StringBuilder modulePriorityErrorMessage, BigDecimal selfTriggerPriority, ProtectionDomain pd,
			DeployedModuleInstance deployedModuleInstance) {
		BigDecimal otherModulePriority = deployedModuleInstance.getModulePriority();
		if (deployedModuleInstance.getModuleInstance() != null) {
			ModuleInstance otherModuleInstance = deployedModuleInstance.getModuleInstance();
			BigInteger otherRelativePriority = deployedModuleInstance.getModuleInstance().getRelativePriority();
			BigDecimal decimalOtherRP = new BigDecimal(otherRelativePriority);
			int compareToTriggerPriority = selfTriggerPriority.compareTo(otherModulePriority);
			int compareToRelativePriority = decimalSelfRP.compareTo(decimalOtherRP);
			if (compareToTriggerPriority != compareToRelativePriority
					&& Objects.equals(selfTriggerInstance.eContainer(), otherModuleInstance.eContainer())) {
				modulePriorityErrorMessage.append(createErrorMessage(selfTriggerInstance, otherModuleInstance,
						compareToTriggerPriority, compareToRelativePriority, pd));
			}
		}
	}

	/**
	 * Create error message when incoherence between Module Priority and Relative
	 * Priority
	 * 
	 * @param selfInstance              : Trigger Instance of Deployed
	 * @param otherInstance             : Trigger/Module Instance compared
	 * @param compareToTriggerPriority  : comparison between Trigger Priorities
	 * @param compareToRelativePriority : Comparison between Relative Priority
	 * @param pd
	 * @return
	 */
	protected StringBuilder createErrorMessage(Trigger selfInstance, Instance otherInstance,
			int compareToTriggerPriority, int compareToRelativePriority, ProtectionDomain pd) {
		StringBuilder modulePriorityErrorMessage = new StringBuilder();
		if (compareToTriggerPriority == 0) {
			modulePriorityErrorMessage
					.append(IN_THE_PROTECTION_DOMAIN + pd.getName() + ", the Module/Trigger Priorities of "
							+ selfInstance.getName() + " and " + otherInstance.getName() + " are equals\n");
		} else if (compareToTriggerPriority < 0) {
			modulePriorityErrorMessage.append(IN_THE_PROTECTION_DOMAIN + pd.getName()
					+ ", the Module/Trigger Priority of the deployed " + selfInstance.getName()
					+ " is lower than the Module/Trigger Priority of the deployed " + otherInstance.getName() + "\n");
		} else {
			modulePriorityErrorMessage.append(IN_THE_PROTECTION_DOMAIN + pd.getName()
					+ ", the Module/Trigger Priority of the deployed " + selfInstance.getName()
					+ " is higher than the Module/Trigger Priority of the deployed " + otherInstance.getName() + "\n");
		}

		if (compareToRelativePriority == 0) {
			modulePriorityErrorMessage.append(", but the Relative Priorities of " + selfInstance.getName() + " and "
					+ otherInstance.getName() + " are equals.\n");
		} else if (compareToTriggerPriority < 0) {
			modulePriorityErrorMessage.append("The Relative Priority of " + selfInstance.getName()
					+ " is lower than the Relative Priority of " + otherInstance.getName() + "\n");
		} else {
			modulePriorityErrorMessage.append("The Relative Priority of " + selfInstance.getName()
					+ " is higher than the Relative Priority of " + otherInstance.getName() + "\n");
		}
		return modulePriorityErrorMessage;
	}

	public EList<DeployedTriggerInstance> findDeployed(TriggerInstance instance) {
		EList<DeployedTriggerInstance> deployed = new BasicEList<>();
		Steps steps = Steps.findStepsContainer(instance);
		Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(instance, steps);
		for (Setting crossReference : crossReferences) {
			if (crossReference.getEObject() instanceof DeployedTriggerInstance deployedInstance) {
				deployed.add(deployedInstance);
			}
		}
		return deployed;
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
			childrenFeatures.add(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS);
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
	 * This returns TriggerInstance.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TriggerInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TriggerInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TriggerInstance_type") :
			getString("_UI_TriggerInstance_type") + " " + label;
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

		switch (notification.getFeatureID(TriggerInstance.class)) {
			case EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
			case EdtimplementationPackage.TRIGGER_INSTANCE__NAME:
			case EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
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
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createTriggerSender()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDynamicTriggerEventReceiverInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDynamicTriggerEventSenderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventSenderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventReceiverInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestClientInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestServerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDataWriterInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createDataReaderInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createEventDefinitionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestReferenceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createRequestServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataReferenceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createVersionedDataServiceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.TRIGGER_INSTANCE__OPERATIONS,
				 EdtimplementationFactory.eINSTANCE.createExternalSenderOperation()));
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

	/**
	 * @param selfTriggerInstance
	 * @param decimalSelfRP
	 * @param modulePriorityErrorMessage
	 * @param deployed
	 * @param selfTriggerPriority
	 * @param pd
	 * @param deployedTriggerInstance
	 * @return
	 */
	protected void compareToTriggerInstance(TriggerInstance selfTriggerInstance, BigDecimal decimalSelfRP,
			StringBuilder modulePriorityErrorMessage, DeployedTriggerInstance deployed, BigDecimal selfTriggerPriority,
			ProtectionDomain pd, DeployedTriggerInstance deployedTriggerInstance) {
		if (Objects.equals(deployed, deployedTriggerInstance)) {
			return;
		}
		BigDecimal otherTriggerPriority = deployedTriggerInstance.getTriggerPriority();
		if (deployedTriggerInstance.getTriggerInstance() != null) {
			Trigger otherTriggerInstance = deployedTriggerInstance.getTriggerInstance();
			BigInteger otherRelativePriority = deployedTriggerInstance.getTriggerInstance().getRelativePriority();
			BigDecimal decimalOtherRP = new BigDecimal(otherRelativePriority);
			int compareToModulePriority = selfTriggerPriority.compareTo(otherTriggerPriority);
			int compareToRelativePriority = decimalSelfRP.compareTo(decimalOtherRP);
			if (compareToModulePriority != compareToRelativePriority
					&& Objects.equals(selfTriggerInstance.eContainer(), otherTriggerInstance.eContainer())) {
				modulePriorityErrorMessage.append(createErrorMessage(selfTriggerInstance, otherTriggerInstance,
						compareToModulePriority, compareToRelativePriority, pd));

			}
		}
	}

}
