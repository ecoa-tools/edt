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
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService;
import org.open.oasis.docs.ns.opencsa.sca.sca.Implementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getImplementationGroup <em>Implementation Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends CommonExtensionBaseImpl implements Component {
	/**
	 * The cached value of the '{@link #getImplementationGroup() <em>Implementation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap implementationGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getImplementationGroup() {
		if (implementationGroup == null) {
			implementationGroup = new BasicFeatureMap(this, scaPackage.COMPONENT__IMPLEMENTATION_GROUP);
		}
		return implementationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		return (Implementation)getImplementationGroup().get(scaPackage.Literals.COMPONENT__IMPLEMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getImplementationGroup()).basicAdd(scaPackage.Literals.COMPONENT__IMPLEMENTATION, newImplementation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, scaPackage.COMPONENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentService> getService() {
		return getGroup().list(scaPackage.Literals.COMPONENT__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentReference> getReference() {
		return getGroup().list(scaPackage.Literals.COMPONENT__REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValue> getProperty() {
		return getGroup().list(scaPackage.Literals.COMPONENT__PROPERTY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				return ((InternalEList<?>)getImplementationGroup()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case scaPackage.COMPONENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case scaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				if (coreType) return getImplementationGroup();
				return ((FeatureMap.Internal)getImplementationGroup()).getWrapper();
			case scaPackage.COMPONENT__IMPLEMENTATION:
				return getImplementation();
			case scaPackage.COMPONENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case scaPackage.COMPONENT__SERVICE:
				return getService();
			case scaPackage.COMPONENT__REFERENCE:
				return getReference();
			case scaPackage.COMPONENT__PROPERTY:
				return getProperty();
			case scaPackage.COMPONENT__NAME:
				return getName();
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
			case scaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				((FeatureMap.Internal)getImplementationGroup()).set(newValue);
				return;
			case scaPackage.COMPONENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case scaPackage.COMPONENT__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ComponentService>)newValue);
				return;
			case scaPackage.COMPONENT__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ComponentReference>)newValue);
				return;
			case scaPackage.COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyValue>)newValue);
				return;
			case scaPackage.COMPONENT__NAME:
				setName((String)newValue);
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
			case scaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				getImplementationGroup().clear();
				return;
			case scaPackage.COMPONENT__GROUP:
				getGroup().clear();
				return;
			case scaPackage.COMPONENT__SERVICE:
				getService().clear();
				return;
			case scaPackage.COMPONENT__REFERENCE:
				getReference().clear();
				return;
			case scaPackage.COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case scaPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
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
			case scaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				return implementationGroup != null && !implementationGroup.isEmpty();
			case scaPackage.COMPONENT__IMPLEMENTATION:
				return getImplementation() != null;
			case scaPackage.COMPONENT__GROUP:
				return group != null && !group.isEmpty();
			case scaPackage.COMPONENT__SERVICE:
				return !getService().isEmpty();
			case scaPackage.COMPONENT__REFERENCE:
				return !getReference().isEmpty();
			case scaPackage.COMPONENT__PROPERTY:
				return !getProperty().isEmpty();
			case scaPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (implementationGroup: ");
		result.append(implementationGroup);
		result.append(", group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
