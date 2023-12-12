/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.project._2.Files;
import technology.ecoa.project._2.projPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecoa Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getServiceDefinitions <em>Service Definitions</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getComponentDefinitions <em>Component Definitions</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getInitialAssembly <em>Initial Assembly</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getComponentImplementations <em>Component Implementations</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getCrossPlatformsView <em>Cross Platforms View</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getDeploymentSchema <em>Deployment Schema</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getImplementationAssembly <em>Implementation Assembly</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getEUIDs <em>EUI Ds</em>}</li>
 *   <li>{@link technology.ecoa.project._2.impl.EcoaProjectImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoaProjectImpl extends MinimalEObjectImpl.Container implements EcoaProject {
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
	protected EcoaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return projPackage.Literals.ECOA_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, projPackage.ECOA_PROJECT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Files> getServiceDefinitions() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__SERVICE_DEFINITIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Files> getComponentDefinitions() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__COMPONENT_DEFINITIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Files> getTypes() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInitialAssembly() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__INITIAL_ASSEMBLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Files> getComponentImplementations() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLogicalSystem() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__LOGICAL_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCrossPlatformsView() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__CROSS_PLATFORMS_VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeploymentSchema() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__DEPLOYMENT_SCHEMA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutputDirectory() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__OUTPUT_DIRECTORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImplementationAssembly() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELIEUIDs> getEUIDs() {
		return getGroup().list(projPackage.Literals.ECOA_PROJECT__EUI_DS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, projPackage.ECOA_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case projPackage.ECOA_PROJECT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case projPackage.ECOA_PROJECT__SERVICE_DEFINITIONS:
				return ((InternalEList<?>)getServiceDefinitions()).basicRemove(otherEnd, msgs);
			case projPackage.ECOA_PROJECT__COMPONENT_DEFINITIONS:
				return ((InternalEList<?>)getComponentDefinitions()).basicRemove(otherEnd, msgs);
			case projPackage.ECOA_PROJECT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case projPackage.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS:
				return ((InternalEList<?>)getComponentImplementations()).basicRemove(otherEnd, msgs);
			case projPackage.ECOA_PROJECT__EUI_DS:
				return ((InternalEList<?>)getEUIDs()).basicRemove(otherEnd, msgs);
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
			case projPackage.ECOA_PROJECT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case projPackage.ECOA_PROJECT__SERVICE_DEFINITIONS:
				return getServiceDefinitions();
			case projPackage.ECOA_PROJECT__COMPONENT_DEFINITIONS:
				return getComponentDefinitions();
			case projPackage.ECOA_PROJECT__TYPES:
				return getTypes();
			case projPackage.ECOA_PROJECT__INITIAL_ASSEMBLY:
				return getInitialAssembly();
			case projPackage.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS:
				return getComponentImplementations();
			case projPackage.ECOA_PROJECT__LOGICAL_SYSTEM:
				return getLogicalSystem();
			case projPackage.ECOA_PROJECT__CROSS_PLATFORMS_VIEW:
				return getCrossPlatformsView();
			case projPackage.ECOA_PROJECT__DEPLOYMENT_SCHEMA:
				return getDeploymentSchema();
			case projPackage.ECOA_PROJECT__OUTPUT_DIRECTORY:
				return getOutputDirectory();
			case projPackage.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY:
				return getImplementationAssembly();
			case projPackage.ECOA_PROJECT__EUI_DS:
				return getEUIDs();
			case projPackage.ECOA_PROJECT__NAME:
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
			case projPackage.ECOA_PROJECT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case projPackage.ECOA_PROJECT__SERVICE_DEFINITIONS:
				getServiceDefinitions().clear();
				getServiceDefinitions().addAll((Collection<? extends Files>)newValue);
				return;
			case projPackage.ECOA_PROJECT__COMPONENT_DEFINITIONS:
				getComponentDefinitions().clear();
				getComponentDefinitions().addAll((Collection<? extends Files>)newValue);
				return;
			case projPackage.ECOA_PROJECT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Files>)newValue);
				return;
			case projPackage.ECOA_PROJECT__INITIAL_ASSEMBLY:
				getInitialAssembly().clear();
				getInitialAssembly().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS:
				getComponentImplementations().clear();
				getComponentImplementations().addAll((Collection<? extends Files>)newValue);
				return;
			case projPackage.ECOA_PROJECT__LOGICAL_SYSTEM:
				getLogicalSystem().clear();
				getLogicalSystem().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__CROSS_PLATFORMS_VIEW:
				getCrossPlatformsView().clear();
				getCrossPlatformsView().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__DEPLOYMENT_SCHEMA:
				getDeploymentSchema().clear();
				getDeploymentSchema().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__OUTPUT_DIRECTORY:
				getOutputDirectory().clear();
				getOutputDirectory().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY:
				getImplementationAssembly().clear();
				getImplementationAssembly().addAll((Collection<? extends String>)newValue);
				return;
			case projPackage.ECOA_PROJECT__EUI_DS:
				getEUIDs().clear();
				getEUIDs().addAll((Collection<? extends ELIEUIDs>)newValue);
				return;
			case projPackage.ECOA_PROJECT__NAME:
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
			case projPackage.ECOA_PROJECT__GROUP:
				getGroup().clear();
				return;
			case projPackage.ECOA_PROJECT__SERVICE_DEFINITIONS:
				getServiceDefinitions().clear();
				return;
			case projPackage.ECOA_PROJECT__COMPONENT_DEFINITIONS:
				getComponentDefinitions().clear();
				return;
			case projPackage.ECOA_PROJECT__TYPES:
				getTypes().clear();
				return;
			case projPackage.ECOA_PROJECT__INITIAL_ASSEMBLY:
				getInitialAssembly().clear();
				return;
			case projPackage.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS:
				getComponentImplementations().clear();
				return;
			case projPackage.ECOA_PROJECT__LOGICAL_SYSTEM:
				getLogicalSystem().clear();
				return;
			case projPackage.ECOA_PROJECT__CROSS_PLATFORMS_VIEW:
				getCrossPlatformsView().clear();
				return;
			case projPackage.ECOA_PROJECT__DEPLOYMENT_SCHEMA:
				getDeploymentSchema().clear();
				return;
			case projPackage.ECOA_PROJECT__OUTPUT_DIRECTORY:
				getOutputDirectory().clear();
				return;
			case projPackage.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY:
				getImplementationAssembly().clear();
				return;
			case projPackage.ECOA_PROJECT__EUI_DS:
				getEUIDs().clear();
				return;
			case projPackage.ECOA_PROJECT__NAME:
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
			case projPackage.ECOA_PROJECT__GROUP:
				return group != null && !group.isEmpty();
			case projPackage.ECOA_PROJECT__SERVICE_DEFINITIONS:
				return !getServiceDefinitions().isEmpty();
			case projPackage.ECOA_PROJECT__COMPONENT_DEFINITIONS:
				return !getComponentDefinitions().isEmpty();
			case projPackage.ECOA_PROJECT__TYPES:
				return !getTypes().isEmpty();
			case projPackage.ECOA_PROJECT__INITIAL_ASSEMBLY:
				return !getInitialAssembly().isEmpty();
			case projPackage.ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS:
				return !getComponentImplementations().isEmpty();
			case projPackage.ECOA_PROJECT__LOGICAL_SYSTEM:
				return !getLogicalSystem().isEmpty();
			case projPackage.ECOA_PROJECT__CROSS_PLATFORMS_VIEW:
				return !getCrossPlatformsView().isEmpty();
			case projPackage.ECOA_PROJECT__DEPLOYMENT_SCHEMA:
				return !getDeploymentSchema().isEmpty();
			case projPackage.ECOA_PROJECT__OUTPUT_DIRECTORY:
				return !getOutputDirectory().isEmpty();
			case projPackage.ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY:
				return !getImplementationAssembly().isEmpty();
			case projPackage.ECOA_PROJECT__EUI_DS:
				return !getEUIDs().isEmpty();
			case projPackage.ECOA_PROJECT__NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EcoaProjectImpl
