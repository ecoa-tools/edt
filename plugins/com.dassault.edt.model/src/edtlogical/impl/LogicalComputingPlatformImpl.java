/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;
import edtlogical.LogicalComputingPlatform;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Logical
 * Computing Platform</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtlogical.impl.LogicalComputingPlatformImpl#getLogicalComputingNodes
 * <em>Logical Computing Nodes</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingPlatformImpl#getLogicalComputingNodeLinks
 * <em>Logical Computing Node Links</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingPlatformImpl#getELIPlatformId
 * <em>ELI Platform Id</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingPlatformImpl#getId
 * <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingPlatformImpl extends MinimalEObjectImpl.Container implements LogicalComputingPlatform {
	/**
	 * The cached value of the '{@link #getLogicalComputingNodes() <em>Logical
	 * Computing Nodes</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLogicalComputingNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingNode> logicalComputingNodes;

	/**
	 * The cached value of the '{@link #getLogicalComputingNodeLinks() <em>Logical
	 * Computing Node Links</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLogicalComputingNodeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComputingNodeLink> logicalComputingNodeLinks;

	/**
	 * The default value of the '{@link #getELIPlatformId() <em>ELI Platform
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getELIPlatformId()
	 * @generated
	 * @ordered
	 */
	protected static final long ELI_PLATFORM_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getELIPlatformId() <em>ELI Platform
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getELIPlatformId()
	 * @generated
	 * @ordered
	 */
	protected long eLIPlatformId = ELI_PLATFORM_ID_EDEFAULT;

	/**
	 * This is true if the ELI Platform Id attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean eLIPlatformIdESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalComputingPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtlogicalPackage.Literals.LOGICAL_COMPUTING_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalComputingNode> getLogicalComputingNodes() {
		if (logicalComputingNodes == null) {
			logicalComputingNodes = new EObjectContainmentEList<LogicalComputingNode>(LogicalComputingNode.class, this,
					EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES);
		}
		return logicalComputingNodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalComputingNodeLink> getLogicalComputingNodeLinks() {
		if (logicalComputingNodeLinks == null) {
			logicalComputingNodeLinks = new EObjectContainmentEList<LogicalComputingNodeLink>(
					LogicalComputingNodeLink.class, this,
					EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS);
		}
		return logicalComputingNodeLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public long getELIPlatformId() {
		return eLIPlatformId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setELIPlatformId(long newELIPlatformId) {
		long oldELIPlatformId = eLIPlatformId;
		eLIPlatformId = newELIPlatformId;
		boolean oldELIPlatformIdESet = eLIPlatformIdESet;
		eLIPlatformIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID, oldELIPlatformId, eLIPlatformId,
					!oldELIPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetELIPlatformId() {
		long oldELIPlatformId = eLIPlatformId;
		boolean oldELIPlatformIdESet = eLIPlatformIdESet;
		eLIPlatformId = ELI_PLATFORM_ID_EDEFAULT;
		eLIPlatformIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID, oldELIPlatformId,
					ELI_PLATFORM_ID_EDEFAULT, oldELIPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetELIPlatformId() {
		return eLIPlatformIdESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			return ((InternalEList<?>) getLogicalComputingNodes()).basicRemove(otherEnd, msgs);
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
			return ((InternalEList<?>) getLogicalComputingNodeLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			return getLogicalComputingNodes();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
			return getLogicalComputingNodeLinks();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
			return getELIPlatformId();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			getLogicalComputingNodes().clear();
			getLogicalComputingNodes().addAll((Collection<? extends LogicalComputingNode>) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
			getLogicalComputingNodeLinks().clear();
			getLogicalComputingNodeLinks().addAll((Collection<? extends LogicalComputingNodeLink>) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
			setELIPlatformId((Long) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			getLogicalComputingNodes().clear();
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
			getLogicalComputingNodeLinks().clear();
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
			unsetELIPlatformId();
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODES:
			return logicalComputingNodes != null && !logicalComputingNodes.isEmpty();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__LOGICAL_COMPUTING_NODE_LINKS:
			return logicalComputingNodeLinks != null && !logicalComputingNodeLinks.isEmpty();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ELI_PLATFORM_ID:
			return isSetELIPlatformId();
		case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (eLIPlatformId: ");
		if (eLIPlatformIdESet)
			result.append(eLIPlatformId);
		else
			result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find LogicalComputingNode by Name
	 *
	 * @param logicalComputingNodeId : name of LogicalComputingNode to find
	 * @return LogicalComputingNode found
	 */
	@Override
	public LogicalComputingNode findLogicalComputingNodeById(String logicalComputingNodeId) {
		for (LogicalComputingNode logicalComputingNode : logicalComputingNodes) {
			if (Objects.equals(logicalComputingNode.getId(), logicalComputingNodeId)) {
				return logicalComputingNode;
			}
		}
		return null;
	}

} // LogicalComputingPlatformImpl
