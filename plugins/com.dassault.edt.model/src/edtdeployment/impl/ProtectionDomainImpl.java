/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

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

import edtdeployment.DeployedModuleInstance;
import edtdeployment.DeployedTriggerInstance;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.ProtectionDomain;
import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingPlatform;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Protection Domain</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtdeployment.impl.ProtectionDomainImpl#getDeployedModuleInstances
 * <em>Deployed Module Instances</em>}</li>
 * <li>{@link edtdeployment.impl.ProtectionDomainImpl#getDeployedTriggerInstances
 * <em>Deployed Trigger Instances</em>}</li>
 * <li>{@link edtdeployment.impl.ProtectionDomainImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link edtdeployment.impl.ProtectionDomainImpl#getExecuteOnComputingNode
 * <em>Execute On Computing Node</em>}</li>
 * <li>{@link edtdeployment.impl.ProtectionDomainImpl#getExecuteOnComputingPlatform
 * <em>Execute On Computing Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionDomainImpl extends MinimalEObjectImpl.Container implements ProtectionDomain {
	/**
	 * The cached value of the '{@link #getDeployedModuleInstances() <em>Deployed
	 * Module Instances</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDeployedModuleInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedModuleInstance> deployedModuleInstances;

	/**
	 * The cached value of the '{@link #getDeployedTriggerInstances() <em>Deployed
	 * Trigger Instances</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDeployedTriggerInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedTriggerInstance> deployedTriggerInstances;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecuteOnComputingNode() <em>Execute On
	 * Computing Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getExecuteOnComputingNode()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingNode executeOnComputingNode;

	/**
	 * The cached value of the '{@link #getExecuteOnComputingPlatform() <em>Execute
	 * On Computing Platform</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExecuteOnComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingPlatform executeOnComputingPlatform;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProtectionDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.PROTECTION_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<DeployedModuleInstance> getDeployedModuleInstances() {
		if (deployedModuleInstances == null) {
			deployedModuleInstances = new EObjectContainmentEList<DeployedModuleInstance>(DeployedModuleInstance.class,
					this, EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES);
		}
		return deployedModuleInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<DeployedTriggerInstance> getDeployedTriggerInstances() {
		if (deployedTriggerInstances == null) {
			deployedTriggerInstances = new EObjectContainmentEList<DeployedTriggerInstance>(
					DeployedTriggerInstance.class, this,
					EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES);
		}
		return deployedTriggerInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.PROTECTION_DOMAIN__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalComputingNode getExecuteOnComputingNode() {
		if (executeOnComputingNode != null && executeOnComputingNode.eIsProxy()) {
			InternalEObject oldExecuteOnComputingNode = (InternalEObject) executeOnComputingNode;
			executeOnComputingNode = (LogicalComputingNode) eResolveProxy(oldExecuteOnComputingNode);
			if (executeOnComputingNode != oldExecuteOnComputingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE,
							oldExecuteOnComputingNode, executeOnComputingNode));
			}
		}
		return executeOnComputingNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingNode basicGetExecuteOnComputingNode() {
		return executeOnComputingNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExecuteOnComputingNode(LogicalComputingNode newExecuteOnComputingNode,
			NotificationChain msgs) {
		LogicalComputingNode oldExecuteOnComputingNode = executeOnComputingNode;
		executeOnComputingNode = newExecuteOnComputingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE, oldExecuteOnComputingNode,
					newExecuteOnComputingNode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExecuteOnComputingNode(LogicalComputingNode newExecuteOnComputingNode) {
		if (newExecuteOnComputingNode != executeOnComputingNode) {
			NotificationChain msgs = null;
			if (executeOnComputingNode != null)
				msgs = ((InternalEObject) executeOnComputingNode).eInverseRemove(this,
						EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK, LogicalComputingNode.class,
						msgs);
			if (newExecuteOnComputingNode != null)
				msgs = ((InternalEObject) newExecuteOnComputingNode).eInverseAdd(this,
						EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK, LogicalComputingNode.class,
						msgs);
			msgs = basicSetExecuteOnComputingNode(newExecuteOnComputingNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE, newExecuteOnComputingNode,
					newExecuteOnComputingNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalComputingPlatform getExecuteOnComputingPlatform() {
		if (executeOnComputingPlatform != null && executeOnComputingPlatform.eIsProxy()) {
			InternalEObject oldExecuteOnComputingPlatform = (InternalEObject) executeOnComputingPlatform;
			executeOnComputingPlatform = (LogicalComputingPlatform) eResolveProxy(oldExecuteOnComputingPlatform);
			if (executeOnComputingPlatform != oldExecuteOnComputingPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM,
							oldExecuteOnComputingPlatform, executeOnComputingPlatform));
			}
		}
		return executeOnComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingPlatform basicGetExecuteOnComputingPlatform() {
		return executeOnComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExecuteOnComputingPlatform(LogicalComputingPlatform newExecuteOnComputingPlatform) {
		LogicalComputingPlatform oldExecuteOnComputingPlatform = executeOnComputingPlatform;
		executeOnComputingPlatform = newExecuteOnComputingPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM,
					oldExecuteOnComputingPlatform, executeOnComputingPlatform));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			if (executeOnComputingNode != null)
				msgs = ((InternalEObject) executeOnComputingNode).eInverseRemove(this,
						EdtlogicalPackage.LOGICAL_COMPUTING_NODE__PROTECTION_DOMAIN_LINK, LogicalComputingNode.class,
						msgs);
			return basicSetExecuteOnComputingNode((LogicalComputingNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			return ((InternalEList<?>) getDeployedModuleInstances()).basicRemove(otherEnd, msgs);
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
			return ((InternalEList<?>) getDeployedTriggerInstances()).basicRemove(otherEnd, msgs);
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			return basicSetExecuteOnComputingNode(null, msgs);
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
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			return getDeployedModuleInstances();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
			return getDeployedTriggerInstances();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__NAME:
			return getName();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			if (resolve)
				return getExecuteOnComputingNode();
			return basicGetExecuteOnComputingNode();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM:
			if (resolve)
				return getExecuteOnComputingPlatform();
			return basicGetExecuteOnComputingPlatform();
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
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			getDeployedModuleInstances().clear();
			getDeployedModuleInstances().addAll((Collection<? extends DeployedModuleInstance>) newValue);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
			getDeployedTriggerInstances().clear();
			getDeployedTriggerInstances().addAll((Collection<? extends DeployedTriggerInstance>) newValue);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__NAME:
			setName((String) newValue);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			setExecuteOnComputingNode((LogicalComputingNode) newValue);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM:
			setExecuteOnComputingPlatform((LogicalComputingPlatform) newValue);
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
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			getDeployedModuleInstances().clear();
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
			getDeployedTriggerInstances().clear();
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			setExecuteOnComputingNode((LogicalComputingNode) null);
			return;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM:
			setExecuteOnComputingPlatform((LogicalComputingPlatform) null);
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
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_MODULE_INSTANCES:
			return deployedModuleInstances != null && !deployedModuleInstances.isEmpty();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__DEPLOYED_TRIGGER_INSTANCES:
			return deployedTriggerInstances != null && !deployedTriggerInstances.isEmpty();
		case EdtdeploymentPackage.PROTECTION_DOMAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_NODE:
			return executeOnComputingNode != null;
		case EdtdeploymentPackage.PROTECTION_DOMAIN__EXECUTE_ON_COMPUTING_PLATFORM:
			return executeOnComputingPlatform != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getExecuteOnComputingNode() != null && this.getExecuteOnComputingPlatform() != null
				&& this.getName() != null && !this.getName().isBlank());
	}

} // ProtectionDomainImpl
