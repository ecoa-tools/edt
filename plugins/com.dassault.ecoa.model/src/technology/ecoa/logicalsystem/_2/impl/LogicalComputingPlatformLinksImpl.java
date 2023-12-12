/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Computing Platform Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformLinksImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingPlatformLinksImpl extends MinimalEObjectImpl.Container implements LogicalComputingPlatformLinks {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingPlatformLinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_COMPUTING_PLATFORM_LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType>(LinkType.class, this, logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK:
				return getLink();
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK:
				getLink().clear();
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalComputingPlatformLinksImpl
