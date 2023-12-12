/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataWriterInstance;
import edtimplementation.EdtimplementationPackage;

/**
 * This is the item provider adapter for a {@link edtimplementation.DataLinkActivatableFifo} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class DataLinkActivatableFifoItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataLinkActivatableFifoItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addControlledPropertyDescriptor(object);
			addWriterPropertyDescriptor(object);
			addReaderPropertyDescriptor(object);
			addReaderFifoSizePropertyDescriptor(object);
			addReaderActivatingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationLink_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationLink_id_feature", "_UI_OperationLink_type"),
				 EdtimplementationPackage.Literals.OPERATION_LINK__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Controlled feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addControlledPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataLink_controlled_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataLink_controlled_feature",
								"_UI_DataLink_type"),
						EdtimplementationPackage.Literals.DATA_LINK__CONTROLLED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						DataLinkActivatableFifo dataLink = (DataLinkActivatableFifo) object;
						DataLinkWriter writer = dataLink.getWriter();
						if (value instanceof Boolean isControlled && !isControlled
								&& !(writer instanceof DataWriterInstance)) {
							EDTLog.toPopUpAndConsole(
									"ERROR : When controlled is false, the Data Link can only be between ModuleInstance Operations",
									"The writer of the DataLink is a Reference Operation");
							return;
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Writer feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataLinkActivatableFifo_writer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataLinkActivatableFifo_writer_feature", "_UI_DataLinkActivatableFifo_type"),
				 EdtimplementationPackage.Literals.DATA_LINK_ACTIVATABLE_FIFO__WRITER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reader feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataLinkActivatableFifo_reader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataLinkActivatableFifo_reader_feature", "_UI_DataLinkActivatableFifo_type"),
				 EdtimplementationPackage.Literals.DATA_LINK_ACTIVATABLE_FIFO__READER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reader Fifo Size feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReaderFifoSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataLinkActivatableFifo_readerFifoSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataLinkActivatableFifo_readerFifoSize_feature", "_UI_DataLinkActivatableFifo_type"),
				 EdtimplementationPackage.Literals.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reader Activating feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addReaderActivatingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataLinkActivatableFifo_readerActivating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataLinkActivatableFifo_readerActivating_feature", "_UI_DataLinkActivatableFifo_type"),
				 EdtimplementationPackage.Literals.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DataLinkActivatableFifo.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataLinkActivatableFifo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DataLinkActivatableFifo dataLinkActivatableFifo = (DataLinkActivatableFifo)object;
		return getString("_UI_DataLinkActivatableFifo_type") + " " + dataLinkActivatableFifo.getId();
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

		switch (notification.getFeatureID(DataLinkActivatableFifo.class)) {
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID:
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED:
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE:
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
