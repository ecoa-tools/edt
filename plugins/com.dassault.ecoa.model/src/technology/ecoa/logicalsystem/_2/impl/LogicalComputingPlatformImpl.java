/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks;
import technology.ecoa.logicalsystem._2.LogicalComputingNodeType;
import technology.ecoa.logicalsystem._2.LogicalComputingPlatform;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Computing Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl#getLogicalComputingNode <em>Logical Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl#getLogicalComputingNodeLinks <em>Logical Computing Node Links</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl#getELIPlatformId <em>ELI Platform Id</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LogicalComputingPlatformImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingPlatformImpl extends MinimalEObjectImpl.Container implements LogicalComputingPlatform {
	/**
	 * The cached value of the '{@link #getLogicalComputingNode() <em>Logical Computing Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalComputingNode()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingNodeType> logicalComputingNode;

	/**
	 * The cached value of the '{@link #getLogicalComputingNodeLinks() <em>Logical Computing Node Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalComputingNodeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingNodeLinks> logicalComputingNodeLinks;

	/**
	 * The default value of the '{@link #getELIPlatformId() <em>ELI Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELIPlatformId()
	 * @generated
	 * @ordered
	 */
	protected static final long ELI_PLATFORM_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getELIPlatformId() <em>ELI Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELIPlatformId()
	 * @generated
	 * @ordered
	 */
	protected long eLIPlatformId = ELI_PLATFORM_ID_EDEFAULT;

	/**
	 * This is true if the ELI Platform Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eLIPlatformIdESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComputingPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LOGICAL_COMPUTING_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComputingNodeType> getLogicalComputingNode() {
		if (logicalComputingNode == null) {
			logicalComputingNode = new EObjectContainmentEList<LogicalComputingNodeType>(LogicalComputingNodeType.class, this, logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE);
		}
		return logicalComputingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComputingNodeLinks> getLogicalComputingNodeLinks() {
		if (logicalComputingNodeLinks == null) {
			logicalComputingNodeLinks = new EObjectContainmentEList<LogicalComputingNodeLinks>(LogicalComputingNodeLinks.class, this, logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS);
		}
		return logicalComputingNodeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getELIPlatformId() {
		return eLIPlatformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELIPlatformId(long newELIPlatformId) {
		long oldELIPlatformId = eLIPlatformId;
		eLIPlatformId = newELIPlatformId;
		boolean oldELIPlatformIdESet = eLIPlatformIdESet;
		eLIPlatformIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID, oldELIPlatformId, eLIPlatformId, !oldELIPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetELIPlatformId() {
		long oldELIPlatformId = eLIPlatformId;
		boolean oldELIPlatformIdESet = eLIPlatformIdESet;
		eLIPlatformId = ELI_PLATFORM_ID_EDEFAULT;
		eLIPlatformIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID, oldELIPlatformId, ELI_PLATFORM_ID_EDEFAULT, oldELIPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetELIPlatformId() {
		return eLIPlatformIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LOGICAL_COMPUTING_PLATFORM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE:
				return ((InternalEList<?>)getLogicalComputingNode()).basicRemove(otherEnd, msgs);
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
				return ((InternalEList<?>)getLogicalComputingNodeLinks()).basicRemove(otherEnd, msgs);
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE:
				return getLogicalComputingNode();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
				return getLogicalComputingNodeLinks();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
				return getELIPlatformId();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ID:
				return getId();
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE:
				getLogicalComputingNode().clear();
				getLogicalComputingNode().addAll((Collection<? extends LogicalComputingNodeType>)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
				getLogicalComputingNodeLinks().clear();
				getLogicalComputingNodeLinks().addAll((Collection<? extends LogicalComputingNodeLinks>)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
				setELIPlatformId((Long)newValue);
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ID:
				setId((String)newValue);
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE:
				getLogicalComputingNode().clear();
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
				getLogicalComputingNodeLinks().clear();
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
				unsetELIPlatformId();
				return;
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ID:
				setId(ID_EDEFAULT);
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
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE:
				return logicalComputingNode != null && !logicalComputingNode.isEmpty();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
				return logicalComputingNodeLinks != null && !logicalComputingNodeLinks.isEmpty();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
				return isSetELIPlatformId();
			case logPackage.LOGICAL_COMPUTING_PLATFORM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (eLIPlatformId: ");
		if (eLIPlatformIdESet) result.append(eLIPlatformId); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LogicalComputingPlatformImpl
