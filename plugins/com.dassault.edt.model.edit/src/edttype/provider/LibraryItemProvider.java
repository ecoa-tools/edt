/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.provider;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
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
import edtproject.Step0;
import edttype.EDTTypeFactory;
import edttype.EDTTypePackage;
import edttype.Library;

/**
 * This is the item provider adapter for a {@link edttype.Library} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class LibraryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LibraryItemProvider(AdapterFactory adapterFactory) {
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
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Used Libraries feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addUsedLibrariesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Library_usedLibraries_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Library_usedLibraries_feature",
								"_UI_Library_type"),
						EDTTypePackage.Literals.LIBRARY__USED_LIBRARIES, true, false, false, null, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						Library library = (Library) object;
						EList<Library> librariesWithoutCyclicDependencies = new BasicEList<>();
						EList<Library> librariesToAdd = (EList<Library>) value;
						StringBuilder errorMessageForConsole = new StringBuilder();
						for (Library libraryToAdd : librariesToAdd) {
							if (isLibraryUsedInDependencies(library, libraryToAdd)) {
								errorMessageForConsole.append("The library/namespace " + libraryToAdd.getName()
										+ " has a dependency for the library/namespace " + library.getName() + "\n");
							} else {
								librariesWithoutCyclicDependencies.add(libraryToAdd);
							}
						}
						if (!errorMessageForConsole.isEmpty()) {
							EDTLog.toPopUpAndConsole(
									"ERROR : there can not be cyclic dependencies between used libraries, see console for more details.",
									errorMessageForConsole.toString());
						}
						super.setPropertyValue(object, librariesWithoutCyclicDependencies);
					}

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						choiceOfValues.remove(object);
						return choiceOfValues;
					}
				});
	}

	public static boolean isLibraryUsedInDependencies(Library libraryToFind, Library libraryToVerify) {
		EList<Library> usedLibraries = libraryToVerify.getUsedLibraries();
		if (usedLibraries.contains(libraryToFind)) {
			return true;
		}
		for (Library libraryDependency : usedLibraries) {
			if (isLibraryUsedInDependencies(libraryToFind, libraryDependency)) {
				return true;
			}
		}
		return false;
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
						getResourceLocator(), getString("_UI_Library_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Library_Name_feature", "_UI_Library_type"),
						EDTTypePackage.Literals.LIBRARY__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {

					@Override
					public void setPropertyValue(Object object, Object value) {
						Library libraryToName = (Library) object;
						Step0 step0 = (Step0) libraryToName.eContainer();
						if (value != null) {
							if (Objects.equals(libraryToName.getName(), value)) {
								return;
							}

							EList<Library> allLibraries = step0.getTypes();
							for (Library library : allLibraries) {
								if (!Objects.equals(library, libraryToName)
										&& Objects.equals(library.getName(), value)) {

									EDTLog.toPopUpAndConsole("ERROR : Name is not unique",
											"There is another Library with the name : " + value);

									return;
								}
							}
						}
						super.setPropertyValue(object, value);
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
			childrenFeatures.add(EDTTypePackage.Literals.LIBRARY__DATA_TYPES);
			childrenFeatures.add(EDTTypePackage.Literals.LIBRARY__USED_LIBRARIES);
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
	 * This returns Library.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Library"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Library)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Library_type") :
			getString("_UI_Library_type") + " " + label;
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

		switch (notification.getFeatureID(Library.class)) {
			case EDTTypePackage.LIBRARY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EDTTypePackage.LIBRARY__DATA_TYPES:
			case EDTTypePackage.LIBRARY__USED_LIBRARIES:
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
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createVariantRecord()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createFixedArray()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createBasicType()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createEnumPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createRecordPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createSimplePredefined()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__DATA_TYPES,
				 EDTTypeFactory.eINSTANCE.createArrayPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(EDTTypePackage.Literals.LIBRARY__USED_LIBRARIES,
				 EDTTypeFactory.eINSTANCE.createLibrary()));
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
