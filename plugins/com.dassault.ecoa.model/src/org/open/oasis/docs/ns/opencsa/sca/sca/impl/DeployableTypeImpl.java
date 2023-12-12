/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployableTypeImpl extends CommonExtensionBaseImpl implements DeployableType {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getComposite() <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected static final QName COMPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected QName composite = COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployment() <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected String deployment = DEPLOYMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.DEPLOYABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, scaPackage.DEPLOYABLE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getComposite() {
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposite(QName newComposite) {
		QName oldComposite = composite;
		composite = newComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.DEPLOYABLE_TYPE__COMPOSITE, oldComposite, composite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(String newDeployment) {
		String oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT, oldDeployment, deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scaPackage.DEPLOYABLE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case scaPackage.DEPLOYABLE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case scaPackage.DEPLOYABLE_TYPE__COMPOSITE:
				return getComposite();
			case scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT:
				return getDeployment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scaPackage.DEPLOYABLE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case scaPackage.DEPLOYABLE_TYPE__COMPOSITE:
				setComposite((QName)newValue);
				return;
			case scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT:
				setDeployment((String)newValue);
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
			case scaPackage.DEPLOYABLE_TYPE__ANY:
				getAny().clear();
				return;
			case scaPackage.DEPLOYABLE_TYPE__COMPOSITE:
				setComposite(COMPOSITE_EDEFAULT);
				return;
			case scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT:
				setDeployment(DEPLOYMENT_EDEFAULT);
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
			case scaPackage.DEPLOYABLE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case scaPackage.DEPLOYABLE_TYPE__COMPOSITE:
				return COMPOSITE_EDEFAULT == null ? composite != null : !COMPOSITE_EDEFAULT.equals(composite);
			case scaPackage.DEPLOYABLE_TYPE__DEPLOYMENT:
				return DEPLOYMENT_EDEFAULT == null ? deployment != null : !DEPLOYMENT_EDEFAULT.equals(deployment);
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
		result.append(" (any: ");
		result.append(any);
		result.append(", composite: ");
		result.append(composite);
		result.append(", deployment: ");
		result.append(deployment);
		result.append(')');
		return result.toString();
	}

} //DeployableTypeImpl
