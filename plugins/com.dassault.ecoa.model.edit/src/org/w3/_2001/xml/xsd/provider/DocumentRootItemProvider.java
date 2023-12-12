/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3._2001.xml.xsd.DocumentRoot;
import org.w3._2001.xml.xsd.SchemaFactory;
import org.w3._2001.xml.xsd.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.w3._2001.xml.xsd.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ALL);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ANNOTATION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ANY);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__APPINFO);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_TYPE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ELEMENT);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__FIELD);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__GROUP);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__IMPORT);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__INCLUDE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__KEY);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__KEYREF);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__LIST);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__NOTATION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__PATTERN);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__REDEFINE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__RESTRICTION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__SCHEMA);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__SELECTOR);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_TYPE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__TOTAL_DIGITS);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__UNION);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE);
			childrenFeatures.add(SchemaPackage.Literals.DOCUMENT_ROOT__WHITE_SPACE);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case SchemaPackage.DOCUMENT_ROOT__ALL:
			case SchemaPackage.DOCUMENT_ROOT__ANNOTATION:
			case SchemaPackage.DOCUMENT_ROOT__ANY:
			case SchemaPackage.DOCUMENT_ROOT__ANY_ATTRIBUTE:
			case SchemaPackage.DOCUMENT_ROOT__APPINFO:
			case SchemaPackage.DOCUMENT_ROOT__ATTRIBUTE:
			case SchemaPackage.DOCUMENT_ROOT__ATTRIBUTE_GROUP:
			case SchemaPackage.DOCUMENT_ROOT__CHOICE:
			case SchemaPackage.DOCUMENT_ROOT__COMPLEX_CONTENT:
			case SchemaPackage.DOCUMENT_ROOT__COMPLEX_TYPE:
			case SchemaPackage.DOCUMENT_ROOT__DOCUMENTATION:
			case SchemaPackage.DOCUMENT_ROOT__ELEMENT:
			case SchemaPackage.DOCUMENT_ROOT__ENUMERATION:
			case SchemaPackage.DOCUMENT_ROOT__FIELD:
			case SchemaPackage.DOCUMENT_ROOT__FRACTION_DIGITS:
			case SchemaPackage.DOCUMENT_ROOT__GROUP:
			case SchemaPackage.DOCUMENT_ROOT__IMPORT:
			case SchemaPackage.DOCUMENT_ROOT__INCLUDE:
			case SchemaPackage.DOCUMENT_ROOT__KEY:
			case SchemaPackage.DOCUMENT_ROOT__KEYREF:
			case SchemaPackage.DOCUMENT_ROOT__LENGTH:
			case SchemaPackage.DOCUMENT_ROOT__LIST:
			case SchemaPackage.DOCUMENT_ROOT__MAX_EXCLUSIVE:
			case SchemaPackage.DOCUMENT_ROOT__MAX_INCLUSIVE:
			case SchemaPackage.DOCUMENT_ROOT__MAX_LENGTH:
			case SchemaPackage.DOCUMENT_ROOT__MIN_EXCLUSIVE:
			case SchemaPackage.DOCUMENT_ROOT__MIN_INCLUSIVE:
			case SchemaPackage.DOCUMENT_ROOT__MIN_LENGTH:
			case SchemaPackage.DOCUMENT_ROOT__NOTATION:
			case SchemaPackage.DOCUMENT_ROOT__PATTERN:
			case SchemaPackage.DOCUMENT_ROOT__REDEFINE:
			case SchemaPackage.DOCUMENT_ROOT__RESTRICTION:
			case SchemaPackage.DOCUMENT_ROOT__SCHEMA:
			case SchemaPackage.DOCUMENT_ROOT__SELECTOR:
			case SchemaPackage.DOCUMENT_ROOT__SEQUENCE:
			case SchemaPackage.DOCUMENT_ROOT__SIMPLE_CONTENT:
			case SchemaPackage.DOCUMENT_ROOT__SIMPLE_TYPE:
			case SchemaPackage.DOCUMENT_ROOT__TOTAL_DIGITS:
			case SchemaPackage.DOCUMENT_ROOT__UNION:
			case SchemaPackage.DOCUMENT_ROOT__UNIQUE:
			case SchemaPackage.DOCUMENT_ROOT__WHITE_SPACE:
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
				(SchemaPackage.Literals.DOCUMENT_ROOT__ALL,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ANNOTATION,
				 SchemaFactory.eINSTANCE.createAnnotationType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ANY,
				 SchemaFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE,
				 SchemaFactory.eINSTANCE.createWildcard()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__APPINFO,
				 SchemaFactory.eINSTANCE.createAppinfoType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE,
				 SchemaFactory.eINSTANCE.createTopLevelAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP,
				 SchemaFactory.eINSTANCE.createNamedAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__CHOICE,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT,
				 SchemaFactory.eINSTANCE.createComplexContentType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__COMPLEX_TYPE,
				 SchemaFactory.eINSTANCE.createTopLevelComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION,
				 SchemaFactory.eINSTANCE.createDocumentationType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ELEMENT,
				 SchemaFactory.eINSTANCE.createTopLevelElement()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__ENUMERATION,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__FIELD,
				 SchemaFactory.eINSTANCE.createFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__FRACTION_DIGITS,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__GROUP,
				 SchemaFactory.eINSTANCE.createNamedGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__IMPORT,
				 SchemaFactory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__INCLUDE,
				 SchemaFactory.eINSTANCE.createIncludeType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__KEY,
				 SchemaFactory.eINSTANCE.createKeybase()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__KEYREF,
				 SchemaFactory.eINSTANCE.createKeyrefType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__LENGTH,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__LIST,
				 SchemaFactory.eINSTANCE.createListType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MAX_LENGTH,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createNoFixedFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__MIN_LENGTH,
				 SchemaFactory.eINSTANCE.createNumFacet()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__NOTATION,
				 SchemaFactory.eINSTANCE.createNotationType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__PATTERN,
				 SchemaFactory.eINSTANCE.createPatternType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__REDEFINE,
				 SchemaFactory.eINSTANCE.createRedefineType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__RESTRICTION,
				 SchemaFactory.eINSTANCE.createRestrictionType1()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SCHEMA,
				 SchemaFactory.eINSTANCE.createSchemaType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SELECTOR,
				 SchemaFactory.eINSTANCE.createSelectorType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
				 SchemaFactory.eINSTANCE.createExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
				 SchemaFactory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SEQUENCE,
				 SchemaFactory.eINSTANCE.createSimpleExplicitGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT,
				 SchemaFactory.eINSTANCE.createSimpleContentType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__SIMPLE_TYPE,
				 SchemaFactory.eINSTANCE.createTopLevelSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__TOTAL_DIGITS,
				 SchemaFactory.eINSTANCE.createTotalDigitsType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__UNION,
				 SchemaFactory.eINSTANCE.createUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__UNIQUE,
				 SchemaFactory.eINSTANCE.createKeybase()));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.DOCUMENT_ROOT__WHITE_SPACE,
				 SchemaFactory.eINSTANCE.createWhiteSpaceType()));
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
