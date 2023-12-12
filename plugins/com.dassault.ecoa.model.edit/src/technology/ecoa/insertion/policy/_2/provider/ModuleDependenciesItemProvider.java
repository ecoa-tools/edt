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

import technology.ecoa.insertion.policy._2.ModuleDependencies;
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
 * This is the item provider adapter for a {@link technology.ecoa.insertion.policy._2.ModuleDependencies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleDependenciesItemProvider 
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
	public ModuleDependenciesItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleDependencies_instanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleDependencies_instanceName_feature", "_UI_ModuleDependencies_type"),
				 polPackage.Literals.MODULE_DEPENDENCIES__INSTANCE_NAME,
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
			childrenFeatures.add(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME);
			childrenFeatures.add(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES);
			childrenFeatures.add(polPackage.Literals.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS);
			childrenFeatures.add(polPackage.Literals.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS);
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
	 * This returns ModuleDependencies.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleDependencies"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModuleDependencies)object).getInstanceName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModuleDependencies_type") :
			getString("_UI_ModuleDependencies_type") + " " + label;
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

		switch (notification.getFeatureID(ModuleDependencies.class)) {
			case polPackage.MODULE_DEPENDENCIES__INSTANCE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME:
			case polPackage.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES:
			case polPackage.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS:
			case polPackage.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS:
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
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createAperiodicActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createDefaultPINFO()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createDefaultProperties()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createDefaultPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createDeploymentConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createECOAProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createExtraConcerns()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createHighestActivationRate()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createInsertionPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createInsertionPolicyList()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createLanguageLibraries()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createLanguageLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createMemoryUsage()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModuleActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModuleActivationProfiles()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModuleCompilationOptions()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModuleDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModuleMemoryUsage()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createModulesDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createOSAPIType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createPeriodicActivationProfile()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createPINFOValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createRealtimeCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createRegisterSize()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createTimeAccuracy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 polFactory.eINSTANCE.createTransportProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createOpenAttrs()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createAnnotated()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createAttributeGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createComplexRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createRealGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createGroupRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createKeybase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createLocalComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createLocalElement()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createLocalSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createNamedAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createNamedGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createNarrowMaxMin()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createSimpleExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createSimpleRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createTopLevelAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createTopLevelComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createTopLevelElement()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 SchemaFactory.eINSTANCE.createTopLevelSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createActionSet()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createComputing()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createDataNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createModuleBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createModuleLifeCycleNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createResponseNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 modFactory.eINSTANCE.createServiceManagementNotification()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 binFactory.eINSTANCE.createBinaryDependency()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 binFactory.eINSTANCE.createBinaryModule()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 binFactory.eINSTANCE.createBinDesc()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 binFactory.eINSTANCE.createProcessorTarget()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 viewFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 viewFactory.eINSTANCE.createEUIDsBinding()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 viewFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 viewFactory.eINSTANCE.createWireMapping()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createComponentLog()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createComputingNodeConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createLogPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createModuleLog()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createPlatformConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createPlatformMessages()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createProtectionDomain()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 depFactory.eINSTANCE.createWireMapping()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createComponentImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createDataLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createVersionedData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createDynamicTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createEventLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createModuleImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createModuleInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createModuleType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRef()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRefActivatable()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRefActivatableFifo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRefActivatingFifo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRefExternal()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createOpRefTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createPinfoValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createPrivatePinfo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createPropertyValues()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createPublicPinfo()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createRequestLink()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createServiceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 impFactory.eINSTANCE.createTriggerInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createOperations()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 interFactory.eINSTANCE.createServiceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createOperationRate()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createOperations()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createRequestResponse()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 qosFactory.eINSTANCE.createServiceInstanceQoS()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 logFactory.eINSTANCE.createLogicalComputingNodeLinks()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 logFactory.eINSTANCE.createLogicalComputingPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 logFactory.eINSTANCE.createLogicalComputingPlatformLinks()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 logFactory.eINSTANCE.createLogicalSystem()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 projFactory.eINSTANCE.createEcoaProject()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 projFactory.eINSTANCE.createELIEUIDs()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 projFactory.eINSTANCE.createFiles()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createDataTypes()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createFixedArray()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 typFactory.eINSTANCE.createVariantRecord()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 uidFactory.eINSTANCE.createID()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 uidFactory.eINSTANCE.createIDMap()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createCommonExtensionBase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComponentReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComponentService()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComponentTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createContributionType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createDeployableType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createImplementationType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createSCAPropertyBase()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createSCAImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createValueType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaFactory.eINSTANCE.createWire()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaExtFactory.eINSTANCE.createInstance()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaExtFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 scaExtFactory.eINSTANCE.createWireInformation()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES,
				 polFactory.eINSTANCE.createLanguageLibraries()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS,
				 polFactory.eINSTANCE.createOSAPIType()));

		newChildDescriptors.add
			(createChildParameter
				(polPackage.Literals.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS,
				 polFactory.eINSTANCE.createModuleCompilationOptions()));
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
			childFeature == polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_RUNTIME ||
			childFeature == polPackage.Literals.MODULE_DEPENDENCIES__LANGUAGE_LIBRARIES ||
			childFeature == polPackage.Literals.MODULE_DEPENDENCIES__MODULE_COMPILATION_OPTIONS ||
			childFeature == polPackage.Literals.MODULE_DEPENDENCIES__DIRECT_OS_ACCESS;

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
