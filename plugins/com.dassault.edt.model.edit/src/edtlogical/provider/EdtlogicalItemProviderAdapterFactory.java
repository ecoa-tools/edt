/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.provider;

import edtlogical.util.EdtlogicalAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtlogicalItemProviderAdapterFactory extends EdtlogicalAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtlogicalItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalSystemItemProvider logicalSystemItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalSystemAdapter() {
		if (logicalSystemItemProvider == null) {
			logicalSystemItemProvider = new LogicalSystemItemProvider(this);
		}

		return logicalSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalComputingPlatform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingPlatformItemProvider logicalComputingPlatformItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalComputingPlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComputingPlatformAdapter() {
		if (logicalComputingPlatformItemProvider == null) {
			logicalComputingPlatformItemProvider = new LogicalComputingPlatformItemProvider(this);
		}

		return logicalComputingPlatformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalComputingPlatformLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingPlatformLinkItemProvider logicalComputingPlatformLinkItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalComputingPlatformLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComputingPlatformLinkAdapter() {
		if (logicalComputingPlatformLinkItemProvider == null) {
			logicalComputingPlatformLinkItemProvider = new LogicalComputingPlatformLinkItemProvider(this);
		}

		return logicalComputingPlatformLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalComputingNodeLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingNodeLinkItemProvider logicalComputingNodeLinkItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalComputingNodeLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComputingNodeLinkAdapter() {
		if (logicalComputingNodeLinkItemProvider == null) {
			logicalComputingNodeLinkItemProvider = new LogicalComputingNodeLinkItemProvider(this);
		}

		return logicalComputingNodeLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalComputingNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingNodeItemProvider logicalComputingNodeItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalComputingNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalComputingNodeAdapter() {
		if (logicalComputingNodeItemProvider == null) {
			logicalComputingNodeItemProvider = new LogicalComputingNodeItemProvider(this);
		}

		return logicalComputingNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edtlogical.LogicalProcessor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalProcessorItemProvider logicalProcessorItemProvider;

	/**
	 * This creates an adapter for a {@link edtlogical.LogicalProcessor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalProcessorAdapter() {
		if (logicalProcessorItemProvider == null) {
			logicalProcessorItemProvider = new LogicalProcessorItemProvider(this);
		}

		return logicalProcessorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (logicalSystemItemProvider != null) logicalSystemItemProvider.dispose();
		if (logicalComputingPlatformItemProvider != null) logicalComputingPlatformItemProvider.dispose();
		if (logicalComputingPlatformLinkItemProvider != null) logicalComputingPlatformLinkItemProvider.dispose();
		if (logicalComputingNodeLinkItemProvider != null) logicalComputingNodeLinkItemProvider.dispose();
		if (logicalComputingNodeItemProvider != null) logicalComputingNodeItemProvider.dispose();
		if (logicalProcessorItemProvider != null) logicalProcessorItemProvider.dispose();
	}

}