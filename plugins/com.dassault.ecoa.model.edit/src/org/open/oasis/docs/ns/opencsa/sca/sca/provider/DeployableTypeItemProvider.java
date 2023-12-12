/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.provider;


import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;

import technology.ecoa.bin.desc._2.binFactory;
import technology.ecoa.bin.desc._2.binPackage;

import technology.ecoa.cross.platforms.view._2.viewFactory;
import technology.ecoa.cross.platforms.view._2.viewPackage;

import technology.ecoa.deployment._2.depFactory;
import technology.ecoa.deployment._2.depPackage;

import technology.ecoa.implementation._2.impFactory;
import technology.ecoa.implementation._2.impPackage;

import technology.ecoa.insertion.policy._2.polFactory;
import technology.ecoa.insertion.policy._2.polPackage;

import technology.ecoa.interface_._2.interFactory;
import technology.ecoa.interface_._2.interPackage;

import technology.ecoa.interface_.qos._2.qosFactory;
import technology.ecoa.interface_.qos._2.qosPackage;

import technology.ecoa.logicalsystem._2.logFactory;
import technology.ecoa.logicalsystem._2.logPackage;

import technology.ecoa.module.behaviour._2.modFactory;
import technology.ecoa.module.behaviour._2.modPackage;

import technology.ecoa.project._2.projFactory;
import technology.ecoa.project._2.projPackage;

import technology.ecoa.sca.extension.scaExt.scaExtFactory;
import technology.ecoa.sca.extension.scaExt.scaExtPackage;

import technology.ecoa.types._2.typFactory;
import technology.ecoa.types._2.typPackage;

import technology.ecoa.udpbinding._2.udpFactory;
import technology.ecoa.udpbinding._2.udpPackage;

import technology.ecoa.uid._2.uidFactory;
import technology.ecoa.uid._2.uidPackage;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployableTypeItemProvider extends CommonExtensionBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCompositePropertyDescriptor(object);
			addDeploymentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableType_composite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableType_composite_feature", "_UI_DeployableType_type"),
				 scaPackage.Literals.DEPLOYABLE_TYPE__COMPOSITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableType_deployment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableType_deployment_feature", "_UI_DeployableType_type"),
				 scaPackage.Literals.DEPLOYABLE_TYPE__DEPLOYMENT,
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
			childrenFeatures.add(scaPackage.Literals.DEPLOYABLE_TYPE__ANY);
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
	 * This returns DeployableType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeployableType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		QName labelValue = ((DeployableType)object).getComposite();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DeployableType_type") :
			getString("_UI_DeployableType_type") + " " + label;
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

		switch (notification.getFeatureID(DeployableType.class)) {
			case scaPackage.DEPLOYABLE_TYPE__COMPOSITE:
			case scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case scaPackage.DEPLOYABLE_TYPE__ANY:
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
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ALL,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANNOTATION,
					 SchemaFactory.eINSTANCE.createAnnotationType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANY,
					 SchemaFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createWildcard())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__APPINFO,
					 SchemaFactory.eINSTANCE.createAppinfoType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE,
					 SchemaFactory.eINSTANCE.createTopLevelAttribute())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP,
					 SchemaFactory.eINSTANCE.createNamedAttributeGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT,
					 SchemaFactory.eINSTANCE.createComplexContentType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION,
					 SchemaFactory.eINSTANCE.createDocumentationType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ELEMENT,
					 SchemaFactory.eINSTANCE.createTopLevelElement())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__FIELD,
					 SchemaFactory.eINSTANCE.createFieldType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__GROUP,
					 SchemaFactory.eINSTANCE.createNamedGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__IMPORT,
					 SchemaFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__INCLUDE,
					 SchemaFactory.eINSTANCE.createIncludeType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__KEY,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__KEYREF,
					 SchemaFactory.eINSTANCE.createKeyrefType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__LIST,
					 SchemaFactory.eINSTANCE.createListType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNoFixedFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH,
					 SchemaFactory.eINSTANCE.createNumFacet())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__NOTATION,
					 SchemaFactory.eINSTANCE.createNotationType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__PATTERN,
					 SchemaFactory.eINSTANCE.createPatternType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__REDEFINE,
					 SchemaFactory.eINSTANCE.createRedefineType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__RESTRICTION,
					 SchemaFactory.eINSTANCE.createRestrictionType1())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SCHEMA,
					 SchemaFactory.eINSTANCE.createSchemaType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SELECTOR,
					 SchemaFactory.eINSTANCE.createSelectorType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createAll())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
					 SchemaFactory.eINSTANCE.createSimpleExplicitGroup())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT,
					 SchemaFactory.eINSTANCE.createSimpleContentType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelSimpleType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__TOTAL_DIGITS,
					 SchemaFactory.eINSTANCE.createTotalDigitsType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__UNION,
					 SchemaFactory.eINSTANCE.createUnionType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE,
					 SchemaFactory.eINSTANCE.createKeybase())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.DOCUMENT_ROOT__WHITE_SPACE,
					 SchemaFactory.eINSTANCE.createWhiteSpaceType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(polPackage.Literals.DOCUMENT_ROOT__INSERTION_POLICIES,
					 polFactory.eINSTANCE.createInsertionPolicyList())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(polPackage.Literals.DOCUMENT_ROOT__USE,
					 polFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(modPackage.Literals.DOCUMENT_ROOT__MODULE_BEHAVIOUR,
					 modFactory.eINSTANCE.createModuleBehaviour())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(modPackage.Literals.DOCUMENT_ROOT__USE,
					 modFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(udpPackage.Literals.DOCUMENT_ROOT__PLATFORM,
					 udpFactory.eINSTANCE.createPlatformType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(udpPackage.Literals.DOCUMENT_ROOT__UDP_BINDING,
					 udpFactory.eINSTANCE.createUDPBindingType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(binPackage.Literals.DOCUMENT_ROOT__BIN_DESC,
					 binFactory.eINSTANCE.createBinDesc())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(binPackage.Literals.DOCUMENT_ROOT__USE,
					 binFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(viewPackage.Literals.DOCUMENT_ROOT__USE,
					 viewFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(viewPackage.Literals.DOCUMENT_ROOT__VIEW,
					 viewFactory.eINSTANCE.createView())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(depPackage.Literals.DOCUMENT_ROOT__DEPLOYMENT,
					 depFactory.eINSTANCE.createDeployment())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(depPackage.Literals.DOCUMENT_ROOT__USE,
					 depFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.DOCUMENT_ROOT__COMPONENT_IMPLEMENTATION,
					 impFactory.eINSTANCE.createComponentImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(impPackage.Literals.DOCUMENT_ROOT__USE,
					 impFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(interPackage.Literals.DOCUMENT_ROOT__SERVICE_DEFINITION,
					 interFactory.eINSTANCE.createServiceDefinition())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(interPackage.Literals.DOCUMENT_ROOT__USE,
					 interFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(qosPackage.Literals.DOCUMENT_ROOT__SERVICE_INSTANCE_QO_S,
					 qosFactory.eINSTANCE.createServiceInstanceQoS())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(qosPackage.Literals.DOCUMENT_ROOT__USE,
					 qosFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(logPackage.Literals.DOCUMENT_ROOT__LOGICAL_SYSTEM,
					 logFactory.eINSTANCE.createLogicalSystem())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(logPackage.Literals.DOCUMENT_ROOT__USE,
					 logFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.DOCUMENT_ROOT__ECOA_PROJECT,
					 projFactory.eINSTANCE.createEcoaProject())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(projPackage.Literals.DOCUMENT_ROOT__USE,
					 projFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DOCUMENT_ROOT__LIBRARY,
					 typFactory.eINSTANCE.createLibrary())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(typPackage.Literals.DOCUMENT_ROOT__USE,
					 typFactory.eINSTANCE.createUseType())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(uidPackage.Literals.DOCUMENT_ROOT__ID_MAP,
					 uidFactory.eINSTANCE.createIDMap())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(scaExtPackage.Literals.DOCUMENT_ROOT__INSTANCE,
					 scaExtFactory.eINSTANCE.createInstance())));

		newChildDescriptors.add
			(createChildParameter
				(scaPackage.Literals.DEPLOYABLE_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(scaExtPackage.Literals.DOCUMENT_ROOT__INTERFACE,
					 scaExtFactory.eINSTANCE.createInterface())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ALL ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__KEY ||
			childFeature == SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
