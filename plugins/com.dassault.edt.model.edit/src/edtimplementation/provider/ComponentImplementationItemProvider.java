/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

import edtbin.EdtbinFactory;
import edtbin.provider.EDTEditPlugin;
import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.Step4;
import temp.TempFactory;

/**
 * This is the item provider adapter for a {@link edtimplementation.ComponentImplementation} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class ComponentImplementationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addUsedLibrariesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addComponentDefinitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Used Libraries feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUsedLibrariesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentImplementation_usedLibraries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_usedLibraries_feature", "_UI_ComponentImplementation_type"),
				 EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__USED_LIBRARIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Definition feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addComponentDefinitionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_componentDefinition_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentImplementation_componentDefinition_feature", "_UI_ComponentImplementation_type"),
				EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION, true, false, false,
				null, null, null) {
			@Override
			public void setPropertyValue(Object object, Object value) {
				ComponentImplementation componentImplementation = (ComponentImplementation) object;
				if (!Objects.equals(componentImplementation.getComponentDefinition(), value)
						&& (!componentImplementation.getComponentDefinitionServices().isEmpty()
								|| !componentImplementation.getComponentDefinitionReferences().isEmpty())) {
					StringBuilder errorMessage = new StringBuilder();
					for (ReferenceOfLinkedComponentDefinition ref : componentImplementation
							.getComponentDefinitionReferences()) {
						errorMessage.append(
								"The References inherited through the new ComponentDefinition being different, all Operation Links linked to previous Reference "
										+ ref.getName() + " are deleted \n");
					}

					for (ServiceOfLinkedComponentDefinition serv : componentImplementation
							.getComponentDefinitionServices()) {
						errorMessage.append(
								"The Services inherited through the new ComponentDefinition being different, all Operation Links linked to previous Service "
										+ serv.getName() + " are deleted \n");
					}

					if (!errorMessage.isEmpty()) {
						EDTLog.toPopUpAndConsole(
								"Warning the modification of the ComponentDefinition has impact on operation links ",
								errorMessage.toString());
					}
				}

				super.setPropertyValue(object, value);
			}
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
						getResourceLocator(), getString("_UI_ComponentImplementation_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_name_feature",
								"_UI_ComponentImplementation_type"),
						EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ComponentImplementation componentImplementationToName = (ComponentImplementation) object;
						Step4 step4 = (Step4) componentImplementationToName.eContainer();
						String oldName = componentImplementationToName.getName();
						if (componentImplementationToName.getName() != null && value != null) {
							if (Objects.equals(componentImplementationToName.getName(), value)) {
								return;
							}

							EList<ComponentImplementation> allComponentImplementation = step4
									.getComponentImplementations();
							for (ComponentImplementation compImp : allComponentImplementation) {
								if (!Objects.equals(compImp, componentImplementationToName)
										&& Objects.equals(compImp.getName(), value)) {
									super.setPropertyValue(object, componentImplementationToName.getName());

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another ComponentImplementation with the name : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
						EcoadtServices service = new EcoadtServices();

						Collection<DRepresentationDescriptor> representationDescriptors = DialectManager.INSTANCE
								.getAllRepresentationDescriptors(service.getSession());

						Iterator<DRepresentationDescriptor> iterator = representationDescriptors.iterator();
						String oldComponentImplementationGraphicalViewName = oldName + " Graphical View";
						String newComponentImplementationGraphicalViewName = value + " Graphical View";
						while (iterator.hasNext()) {
							DRepresentationDescriptor currentRepresentation = iterator.next();
							if (Objects.equals(currentRepresentation.getName(),
									oldComponentImplementationGraphicalViewName)) {
								TransactionalEditingDomain transactionalEditingDomain = TransactionUtil
										.getEditingDomain(componentImplementationToName);
								transactionalEditingDomain.getCommandStack()
										.execute(new RecordingCommand(transactionalEditingDomain) {

											@Override
											protected void doExecute() {
												currentRepresentation
														.setName(newComponentImplementationGraphicalViewName);
											}
										});
							}
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
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__SERVICES);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__REFERENCES);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSTANCES);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__BIN_DESC);
			childrenFeatures.add(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST);
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
	 * This returns ComponentImplementation.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentImplementation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentImplementation_type") :
			getString("_UI_ComponentImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentImplementation.class)) {
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__NAME:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__ASSOCIATED_SERVICE_QOS:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__SERVICES:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__REFERENCES:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSTANCES:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__OPERATION_LINKS:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__MODULE_BEHAVIOURS:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__BIN_DESC:
			case EdtimplementationPackage.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST:
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
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__SERVICES,
				 EdtimplementationFactory.eINSTANCE.createComponentImplementationService()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__REFERENCES,
				 EdtimplementationFactory.eINSTANCE.createComponentImplementationReference()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__MODULE_IMPLEMENTATIONS,
				 EdtimplementationFactory.eINSTANCE.createModuleImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSTANCES,
				 EdtimplementationFactory.eINSTANCE.createTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSTANCES,
				 EdtimplementationFactory.eINSTANCE.createDynamicTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSTANCES,
				 EdtimplementationFactory.eINSTANCE.createModuleInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_REFERENCES,
				 EdtimplementationFactory.eINSTANCE.createReferenceOfLinkedComponentDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__COMPONENT_DEFINITION_SERVICES,
				 EdtimplementationFactory.eINSTANCE.createServiceOfLinkedComponentDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createDataLinkActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createDataLinkToServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkActivatingFifo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkToDefinitionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkToDefinitionOperationFromTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkActivatingFifoFromTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createEventLinkActivatableFifoFromTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createRequestLinkActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createRequestLinkActivatingActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__OPERATION_LINKS,
				 EdtimplementationFactory.eINSTANCE.createRequestLinkActivatingToReferenceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__EXTERNAL_SENDERS,
				 EdtimplementationFactory.eINSTANCE.createExternalSenderOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__BIN_DESC,
				 EdtbinFactory.eINSTANCE.createBinDesc()));

		newChildDescriptors.add
			(createChildParameter
				(EdtimplementationPackage.Literals.COMPONENT_IMPLEMENTATION__INSERTION_POLICY_LIST,
				 TempFactory.eINSTANCE.createInsertionPolicies()));
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
