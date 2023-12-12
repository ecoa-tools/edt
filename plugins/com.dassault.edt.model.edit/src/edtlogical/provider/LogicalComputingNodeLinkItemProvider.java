/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
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
import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatform;
import edtlogical.LogicalComputingPlatformLink;
import edtlogical.LogicalSystem;

/**
 * This is the item provider adapter for a
 * {@link edtlogical.LogicalComputingNodeLink} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class LogicalComputingNodeLinkItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingNodeLinkItemProvider(AdapterFactory adapterFactory) {
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
			addThroughputMegaBytesPerSecondPropertyDescriptor(object);
			addLatencyMicroSecondsPropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LogicalComputingNodeLink_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeLink_id_feature",
								"_UI_LogicalComputingNodeLink_type"),
						EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null) {
					@Override
					public void setPropertyValue(Object object, Object value) {
						LogicalComputingNodeLink logicalComputingNodeLinkToName = (LogicalComputingNodeLink) object;
						LogicalSystem logicalSystem = (LogicalSystem) logicalComputingNodeLinkToName.eContainer()
								.eContainer();

						if (value != null) {
							if (Objects.equals(logicalComputingNodeLinkToName.getId(), value)) {
								return;
							}

							EList<LogicalComputingPlatformLink> allLogicalComputingPlatformLinks = logicalSystem
									.getLogicalComputingPlatformLinks();
							for (LogicalComputingPlatformLink link : allLogicalComputingPlatformLinks) {
								if (Objects.equals(link.getId(), value)) {

									EDTLog.toPopUpAndConsole("ERROR : ID is not unique",
											"There is a LogicalComputingPlatformLink with the id : " + value);
									return;
								}
							}
						}
						super.setPropertyValue(object, value);
					}
				});
	}

	/**
	 * This adds a property descriptor for the Throughput Mega Bytes Per Second
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addThroughputMegaBytesPerSecondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingNodeLink_throughputMegaBytesPerSecond_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LogicalComputingNodeLink_throughputMegaBytesPerSecond_feature",
						"_UI_LogicalComputingNodeLink_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Latency Micro Seconds feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLatencyMicroSecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LogicalComputingNodeLink_latencyMicroSeconds_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LogicalComputingNodeLink_latencyMicroSeconds_feature",
								"_UI_LogicalComputingNodeLink_type"),
						EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the From feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingNodeLink_from_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeLink_from_feature",
						"_UI_LogicalComputingNodeLink_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__FROM, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				LogicalComputingNodeLink logicalComputingNodeLink = (LogicalComputingNodeLink) object;
				EObject platform = logicalComputingNodeLink.eContainer();
				if (platform instanceof LogicalComputingPlatform logicalComputingPlatform) {
					for (Object value : choiceOfValues) {
						if (value == null || logicalComputingPlatform.getLogicalComputingNodes().contains(value)) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This adds a property descriptor for the To feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingNodeLink_to_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeLink_to_feature",
						"_UI_LogicalComputingNodeLink_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__TO, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				LogicalComputingNodeLink logicalComputingNodeLink = (LogicalComputingNodeLink) object;
				EObject platform = logicalComputingNodeLink.eContainer();
				if (platform instanceof LogicalComputingPlatform logicalComputingPlatform) {
					for (Object value : choiceOfValues) {
						if (value == null || logicalComputingPlatform.getLogicalComputingNodes().contains(value)) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This adds a property descriptor for the From feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addFrom2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingNodeLink_from_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeLink_from_feature",
						"_UI_LogicalComputingNodeLink_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__FROM, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				LogicalComputingNodeLink logicalComputingNodeLink = (LogicalComputingNodeLink) object;
				EObject platform = logicalComputingNodeLink.eContainer();
				if (platform instanceof LogicalComputingPlatform logicalComputingPlatform) {
					for (Object value : choiceOfValues) {
						if (value == null || logicalComputingPlatform.getLogicalComputingNodes().contains(value)) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This adds a property descriptor for the To feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTo2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogicalComputingNodeLink_to_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogicalComputingNodeLink_to_feature",
						"_UI_LogicalComputingNodeLink_type"),
				EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK__TO, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				Collection<Object> filteredChoices = new ArrayList<>();
				LogicalComputingNodeLink logicalComputingNodeLink = (LogicalComputingNodeLink) object;
				EObject platform = logicalComputingNodeLink.eContainer();
				if (platform instanceof LogicalComputingPlatform logicalComputingPlatform) {
					for (Object value : choiceOfValues) {
						if (value == null || logicalComputingPlatform.getLogicalComputingNodes().contains(value)) {
							filteredChoices.add(value);
						}
					}
				}
				return filteredChoices;
			}
		});
	}

	/**
	 * This returns LogicalComputingNodeLink.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalComputingNodeLink"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalComputingNodeLink) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_LogicalComputingNodeLink_type")
				: getString("_UI_LogicalComputingNodeLink_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalComputingNodeLink.class)) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID:
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND:
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS:
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
