/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ns.opencsa.sca.sca.Component;
import org.open.oasis.docs.ns.opencsa.sca.sca.Composite;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.Reference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Service;
import org.open.oasis.docs.ns.opencsa.sca.sca.Wire;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends CommonExtensionBaseImpl implements Composite {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, scaPackage.COMPOSITE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		return getGroup().list(scaPackage.Literals.COMPOSITE__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(scaPackage.Literals.COMPOSITE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(scaPackage.Literals.COMPOSITE__COMPONENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		return getGroup().list(scaPackage.Literals.COMPOSITE__REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWire() {
		return getGroup().list(scaPackage.Literals.COMPOSITE__WIRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.COMPOSITE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scaPackage.COMPOSITE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPOSITE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPOSITE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPOSITE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPOSITE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPOSITE__WIRE:
				return ((InternalEList<?>)getWire()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scaPackage.COMPOSITE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case scaPackage.COMPOSITE__SERVICE:
				return getService();
			case scaPackage.COMPOSITE__PROPERTY:
				return getProperty();
			case scaPackage.COMPOSITE__COMPONENT:
				return getComponent();
			case scaPackage.COMPOSITE__REFERENCE:
				return getReference();
			case scaPackage.COMPOSITE__WIRE:
				return getWire();
			case scaPackage.COMPOSITE__NAME:
				return getName();
			case scaPackage.COMPOSITE__TARGET_NAMESPACE:
				return getTargetNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scaPackage.COMPOSITE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case scaPackage.COMPOSITE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case scaPackage.COMPOSITE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case scaPackage.COMPOSITE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case scaPackage.COMPOSITE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case scaPackage.COMPOSITE__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case scaPackage.COMPOSITE__NAME:
				setName((String)newValue);
				return;
			case scaPackage.COMPOSITE__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case scaPackage.COMPOSITE__GROUP:
				getGroup().clear();
				return;
			case scaPackage.COMPOSITE__SERVICE:
				getService().clear();
				return;
			case scaPackage.COMPOSITE__PROPERTY:
				getProperty().clear();
				return;
			case scaPackage.COMPOSITE__COMPONENT:
				getComponent().clear();
				return;
			case scaPackage.COMPOSITE__REFERENCE:
				getReference().clear();
				return;
			case scaPackage.COMPOSITE__WIRE:
				getWire().clear();
				return;
			case scaPackage.COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scaPackage.COMPOSITE__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case scaPackage.COMPOSITE__GROUP:
				return group != null && !group.isEmpty();
			case scaPackage.COMPOSITE__SERVICE:
				return !getService().isEmpty();
			case scaPackage.COMPOSITE__PROPERTY:
				return !getProperty().isEmpty();
			case scaPackage.COMPOSITE__COMPONENT:
				return !getComponent().isEmpty();
			case scaPackage.COMPOSITE__REFERENCE:
				return !getReference().isEmpty();
			case scaPackage.COMPOSITE__WIRE:
				return !getWire().isEmpty();
			case scaPackage.COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scaPackage.COMPOSITE__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl
