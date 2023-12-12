/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid.provider;

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
import edtinterface.OperationType;
import edtproject.ServiceLink;
import edtuid.EdtuidPackage;
import edtuid.ID;
import edtuid.IDMap;

/**
 * This is the item provider adapter for a {@link edtuid.ID} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class IDItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IDItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addServiceLinkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ID_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ID_value_feature", "_UI_ID_type"),
						EdtuidPackage.Literals.ID__VALUE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ID id = (ID) object;
						int idValue = (int) value;
						if (id.getOperation() != null && id.getServiceLink() != null) {
							IDMap idMap = (IDMap) id.eContainer();
							EList<ID> iDs = idMap.getIDs();
							for (ID id2 : iDs) {
								if (id2.getValue() == idValue && (!Objects.equals(id2.getOperation(), id.getOperation())
										|| !Objects.equals(id.getServiceLink().getTarget(),
												id2.getServiceLink().getTarget()))) {
									EDTLog.toPopUpAndConsole("The ID value is invalid, see console for more details.",
											" The same ID value can only be used, when both IDs have the same destination Component, destination Service Instance and Operation name.");
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Operation feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ID_Operation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ID_Operation_feature", "_UI_ID_type"),
						EdtuidPackage.Literals.ID__OPERATION, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						Collection<Object> filteredChoices = new ArrayList<Object>();
						ID id = (ID) object;
						if (id.getServiceLink() != null && id.getServiceLink().getSource() != null
								&& id.getServiceLink().getSource().getComponentDefinitionReference() != null
								&& id.getServiceLink().getSource().getComponentDefinitionReference()
										.getSyntax() != null) {
							for (Object value : choiceOfValues) {
								if (value == null || id.getServiceLink().getSource().getComponentDefinitionReference()
										.getSyntax().getOperations().contains(value)) {
									filteredChoices.add(value);
								}
							}
						}
						return filteredChoices;
					}

					@Override
					public void setPropertyValue(Object object, Object value) {
						ID id = (ID) object;
						OperationType idOperation = (OperationType) value;
						if (id.getServiceLink() != null) {
							IDMap idMap = (IDMap) id.eContainer();
							EList<ID> iDs = idMap.getIDs();
							for (ID id2 : iDs) {
								if (id2.getValue() == id.getValue() && (!Objects.equals(id2.getOperation(), idOperation)
										|| !Objects.equals(id.getServiceLink().getTarget(),
												id2.getServiceLink().getTarget()))) {
									EDTLog.toPopUpAndConsole(
											"WARNING : The modification of the Operation has created an inconsistency, see console for more details.",
											" The same ID value can only be used, when both IDs have the same destination Component, destination Service Instance and Operation name.");
									break;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Service Link feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addServiceLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ID_ServiceLink_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ID_ServiceLink_feature", "_UI_ID_type"),
						EdtuidPackage.Literals.ID__SERVICE_LINK, true, false, true, null, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						ID id = (ID) object;
						ServiceLink idServiceLink = (ServiceLink) value;
						if (id.getOperation() != null) {
							IDMap idMap = (IDMap) id.eContainer();
							EList<ID> iDs = idMap.getIDs();
							for (ID id2 : iDs) {
								if (id2.getValue() == id.getValue()
										&& (!Objects.equals(id2.getOperation(), id.getOperation()) || !Objects
												.equals(idServiceLink.getTarget(), id2.getServiceLink().getTarget()))) {
									EDTLog.toPopUpAndConsole(
											"WARNING : The modification of the ServiceLink has created an inconsistency, see console for more details.",
											" The same ID value can only be used, when both IDs have the same destination Component, destination Service Instance and Operation name.");
									break;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This returns ID.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ID"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ID id = (ID) object;
		return getString("_UI_ID_type") + " " + id.getValue();
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

		switch (notification.getFeatureID(ID.class)) {
		case EdtuidPackage.ID__VALUE:
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
