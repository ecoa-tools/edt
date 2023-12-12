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

import technology.ecoa.logicalsystem._2.LinkType1;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Computing Node Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingNodeLinksImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingNodeLinksImpl extends MinimalEObjectImpl.Container implements LogicalComputingNodeLinks {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType1> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingNodeLinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_COMPUTING_NODE_LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType1> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType1>(LinkType1.class, this, logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK);
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
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK:
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
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK:
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
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType1>)newValue);
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
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK:
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
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalComputingNodeLinksImpl
