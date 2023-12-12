/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends CommonExtensionBaseImpl implements ComponentType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, scaPackage.COMPONENT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getService() {
		return getGroup().list(scaPackage.Literals.COMPONENT_TYPE__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentTypeReference> getReference() {
		return getGroup().list(scaPackage.Literals.COMPONENT_TYPE__REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(scaPackage.Literals.COMPONENT_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scaPackage.COMPONENT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT_TYPE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case scaPackage.COMPONENT_TYPE__PROPERTY:
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
			case scaPackage.COMPONENT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case scaPackage.COMPONENT_TYPE__SERVICE:
				return getService();
			case scaPackage.COMPONENT_TYPE__REFERENCE:
				return getReference();
			case scaPackage.COMPONENT_TYPE__PROPERTY:
				return getProperty();
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
			case scaPackage.COMPONENT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case scaPackage.COMPONENT_TYPE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ServiceType>)newValue);
				return;
			case scaPackage.COMPONENT_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ComponentTypeReference>)newValue);
				return;
			case scaPackage.COMPONENT_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
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
			case scaPackage.COMPONENT_TYPE__GROUP:
				getGroup().clear();
				return;
			case scaPackage.COMPONENT_TYPE__SERVICE:
				getService().clear();
				return;
			case scaPackage.COMPONENT_TYPE__REFERENCE:
				getReference().clear();
				return;
			case scaPackage.COMPONENT_TYPE__PROPERTY:
				getProperty().clear();
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
			case scaPackage.COMPONENT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case scaPackage.COMPONENT_TYPE__SERVICE:
				return !getService().isEmpty();
			case scaPackage.COMPONENT_TYPE__REFERENCE:
				return !getReference().isEmpty();
			case scaPackage.COMPONENT_TYPE__PROPERTY:
				return !getProperty().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
