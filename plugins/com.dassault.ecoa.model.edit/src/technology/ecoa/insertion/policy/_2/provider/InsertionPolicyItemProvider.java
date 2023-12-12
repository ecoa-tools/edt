/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.provider.ECOADTEditPlugin;
import technology.ecoa.bin.desc._2.binFactory;

import technology.ecoa.cross.platforms.view._2.viewFactory;

import technology.ecoa.deployment._2.depFactory;

import technology.ecoa.implementation._2.impFactory;

import technology.ecoa.insertion.policy._2.InsertionPolicy;
import technology.ecoa.insertion.policy._2.polFactory;
import technology.ecoa.insertion.policy._2.polPackage;

import technology.ecoa.interface_._2.interFactory;

import technology.ecoa.interface_.qos._2.qosFactory;

import technology.ecoa.logicalsystem._2.logFactory;

import technology.ecoa.module.behaviour._2.modFactory;

import technology.ecoa.project._2.projFactory;

import technology.ecoa.sca.extension.scaExt.scaExtFactory;

import technology.ecoa.types._2.typFactory;

import technology.ecoa.uid._2.uidFactory;

/**
 * This is the item provider adapter for a {@link technology.ecoa.insertion.policy._2.InsertionPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertionPolicyItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionPolicyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetPropertyDescriptor(object);
			addGenericCompilationOptionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InsertionPolicy_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InsertionPolicy_target_feature", "_UI_InsertionPolicy_type"),
				 polPackage.Literals.INSERTION_POLICY__TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generic Compilation Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenericCompilationOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InsertionPolicy_genericCompilationOptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InsertionPolicy_genericCompilationOptions_feature", "_UI_InsertionPolicy_type"),
				 polPackage.Literals.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__REGISTER_SIZE);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__MEMORY_USAGE);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__REALTIME_CHARACTERISTICS);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__TIME_ACCURACY);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__TRANSPORT_PROTOCOL);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__ECOA_PROFILE);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__COMPILER);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__MODULES_DEPENDENCIES);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__EXTRA_CONCERNS);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__DEFAULT_PINFO);
			childrenFeatures.add(polPackage.Literals.INSERTION_POLICY__DEFAULT_PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InsertionPolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InsertionPolicy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InsertionPolicy)object).getTarget();
		return label == null || label.length() == 0 ?
			getString("_UI_InsertionPolicy_type") :
			getString("_UI_InsertionPolicy_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(InsertionPolicy.class)) {
			case polPackage.INSERTION_POLICY__TARGET:
			case polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
			case polPackage.INSERTION_POLICY__COMPILER:
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
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
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createAperiodicActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createDefaultPINFO()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createDefaultProperties()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createDefaultPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createDeploymentConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createECOAProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createExtraConcerns()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createHighestActivationRate()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createInsertionPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createInsertionPolicyList()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createLanguageLibraries()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createLanguageLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createMemoryUsage()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModuleActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModuleActivationProfiles()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModuleCompilationOptions()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModuleDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModuleMemoryUsage()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createModulesDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createOSAPIType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createPeriodicActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createPINFOValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createRealtimeCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createRegisterSize()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createTimeAccuracy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 polFactory.eINSTANCE.createTransportProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createOpenAttrs()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createAnnotated()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createAttributeGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createComplexRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createRealGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createKeybase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createLocalComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createLocalElement()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createLocalSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createNamedAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createNamedGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createNarrowMaxMin()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createSimpleExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createSimpleRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createTopLevelAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createTopLevelComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createTopLevelElement()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 SchemaFactory.eINSTANCE.createTopLevelSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createActionSet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createComputing()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createDataNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createModuleBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createModuleLifeCycleNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createResponseNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 modFactory.eINSTANCE.createServiceManagementNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 binFactory.eINSTANCE.createBinaryDependency()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 binFactory.eINSTANCE.createBinaryModule()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 binFactory.eINSTANCE.createBinDesc()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 binFactory.eINSTANCE.createProcessorTarget()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 viewFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 viewFactory.eINSTANCE.createEUIDsBinding()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 viewFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 viewFactory.eINSTANCE.createWireMapping()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createComponentLog()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createComputingNodeConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createLogPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createModuleLog()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createPlatformConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createPlatformMessages()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createProtectionDomain()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 depFactory.eINSTANCE.createWireMapping()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createComponentImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createDataLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createVersionedData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createDynamicTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createEventLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createModuleImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createModuleInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createModuleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRefActivatable()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRefActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRefActivatingFifo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRefExternal()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createOpRefTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createPinfoValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createPrivatePinfo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createPropertyValues()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createPublicPinfo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createRequestLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createServiceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 impFactory.eINSTANCE.createTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createOperations()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 interFactory.eINSTANCE.createServiceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createOperationRate()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createOperations()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 qosFactory.eINSTANCE.createServiceInstanceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 logFactory.eINSTANCE.createLogicalComputingNodeLinks()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 logFactory.eINSTANCE.createLogicalComputingPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 logFactory.eINSTANCE.createLogicalComputingPlatformLinks()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 logFactory.eINSTANCE.createLogicalSystem()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 projFactory.eINSTANCE.createEcoaProject()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 projFactory.eINSTANCE.createELIEUIDs()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 projFactory.eINSTANCE.createFiles()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createFixedArray()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 typFactory.eINSTANCE.createVariantRecord()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 uidFactory.eINSTANCE.createID()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 uidFactory.eINSTANCE.createIDMap()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createCommonExtensionBase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComponentReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComponentService()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComponentTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createContributionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createDeployableType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createImplementationType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createSCAPropertyBase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createSCAImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createValueType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaFactory.eINSTANCE.createWire()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaExtFactory.eINSTANCE.createInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaExtFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 scaExtFactory.eINSTANCE.createWireInformation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__REGISTER_SIZE,
				 polFactory.eINSTANCE.createRegisterSize()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__MEMORY_USAGE,
				 polFactory.eINSTANCE.createMemoryUsage()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__REALTIME_CHARACTERISTICS,
				 polFactory.eINSTANCE.createRealtimeCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__TIME_ACCURACY,
				 polFactory.eINSTANCE.createTimeAccuracy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__TRANSPORT_PROTOCOL,
				 polFactory.eINSTANCE.createTransportProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS,
				 polFactory.eINSTANCE.createDeploymentConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__ECOA_PROFILE,
				 polFactory.eINSTANCE.createECOAProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__COMPILER,
				 polFactory.eINSTANCE.createCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__MODULES_DEPENDENCIES,
				 polFactory.eINSTANCE.createModulesDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__EXTRA_CONCERNS,
				 polFactory.eINSTANCE.createExtraConcerns()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__DEFAULT_PINFO,
				 polFactory.eINSTANCE.createDefaultPINFO()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.INSERTION_POLICY__DEFAULT_PROPERTIES,
				 polFactory.eINSTANCE.createDefaultProperties()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == polPackage.Literals.INSERTION_POLICY__PROCESSOR_TARGET ||
			childFeature == polPackage.Literals.INSERTION_POLICY__COMPILER ||
			childFeature == polPackage.Literals.INSERTION_POLICY__DEFAULT_PINFO ||
			childFeature == polPackage.Literals.INSERTION_POLICY__DEFAULT_PROPERTIES ||
			childFeature == polPackage.Literals.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS ||
			childFeature == polPackage.Literals.INSERTION_POLICY__ECOA_PROFILE ||
			childFeature == polPackage.Literals.INSERTION_POLICY__EXTRA_CONCERNS ||
			childFeature == polPackage.Literals.INSERTION_POLICY__MEMORY_USAGE ||
			childFeature == polPackage.Literals.INSERTION_POLICY__MODULES_DEPENDENCIES ||
			childFeature == polPackage.Literals.INSERTION_POLICY__REALTIME_CHARACTERISTICS ||
			childFeature == polPackage.Literals.INSERTION_POLICY__REGISTER_SIZE ||
			childFeature == polPackage.Literals.INSERTION_POLICY__TIME_ACCURACY ||
			childFeature == polPackage.Literals.INSERTION_POLICY__TRANSPORT_PROTOCOL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ECOADTEditPlugin.INSTANCE;
	}

}
