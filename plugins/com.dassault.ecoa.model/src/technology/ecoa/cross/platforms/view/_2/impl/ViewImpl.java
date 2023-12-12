/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2.impl;

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

import technology.ecoa.cross.platforms.view._2.Composite;
import technology.ecoa.cross.platforms.view._2.EUIDsBinding;
import technology.ecoa.cross.platforms.view._2.View;
import technology.ecoa.cross.platforms.view._2.WireMapping;
import technology.ecoa.cross.platforms.view._2.viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getWireMapping <em>Wire Mapping</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getEuidsBinding <em>Euids Binding</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
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
	 * The default value of the '{@link #getAssembly() <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected String assembly = ASSEMBLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalSystem() <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalSystem() <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected String logicalSystem = LOGICAL_SYSTEM_EDEFAULT;

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
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return viewPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, viewPackage.VIEW__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getComposite() {
		return getGroup().list(viewPackage.Literals.VIEW__COMPOSITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireMapping> getWireMapping() {
		return getGroup().list(viewPackage.Literals.VIEW__WIRE_MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EUIDsBinding> getEuidsBinding() {
		return getGroup().list(viewPackage.Literals.VIEW__EUIDS_BINDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembly(String newAssembly) {
		String oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.VIEW__ASSEMBLY, oldAssembly, assembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalSystem() {
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalSystem(String newLogicalSystem) {
		String oldLogicalSystem = logicalSystem;
		logicalSystem = newLogicalSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.VIEW__LOGICAL_SYSTEM, oldLogicalSystem, logicalSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case viewPackage.VIEW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case viewPackage.VIEW__COMPOSITE:
				return ((InternalEList<?>)getComposite()).basicRemove(otherEnd, msgs);
			case viewPackage.VIEW__WIRE_MAPPING:
				return ((InternalEList<?>)getWireMapping()).basicRemove(otherEnd, msgs);
			case viewPackage.VIEW__EUIDS_BINDING:
				return ((InternalEList<?>)getEuidsBinding()).basicRemove(otherEnd, msgs);
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
			case viewPackage.VIEW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case viewPackage.VIEW__COMPOSITE:
				return getComposite();
			case viewPackage.VIEW__WIRE_MAPPING:
				return getWireMapping();
			case viewPackage.VIEW__EUIDS_BINDING:
				return getEuidsBinding();
			case viewPackage.VIEW__ASSEMBLY:
				return getAssembly();
			case viewPackage.VIEW__LOGICAL_SYSTEM:
				return getLogicalSystem();
			case viewPackage.VIEW__NAME:
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
			case viewPackage.VIEW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case viewPackage.VIEW__COMPOSITE:
				getComposite().clear();
				getComposite().addAll((Collection<? extends Composite>)newValue);
				return;
			case viewPackage.VIEW__WIRE_MAPPING:
				getWireMapping().clear();
				getWireMapping().addAll((Collection<? extends WireMapping>)newValue);
				return;
			case viewPackage.VIEW__EUIDS_BINDING:
				getEuidsBinding().clear();
				getEuidsBinding().addAll((Collection<? extends EUIDsBinding>)newValue);
				return;
			case viewPackage.VIEW__ASSEMBLY:
				setAssembly((String)newValue);
				return;
			case viewPackage.VIEW__LOGICAL_SYSTEM:
				setLogicalSystem((String)newValue);
				return;
			case viewPackage.VIEW__NAME:
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
			case viewPackage.VIEW__GROUP:
				getGroup().clear();
				return;
			case viewPackage.VIEW__COMPOSITE:
				getComposite().clear();
				return;
			case viewPackage.VIEW__WIRE_MAPPING:
				getWireMapping().clear();
				return;
			case viewPackage.VIEW__EUIDS_BINDING:
				getEuidsBinding().clear();
				return;
			case viewPackage.VIEW__ASSEMBLY:
				setAssembly(ASSEMBLY_EDEFAULT);
				return;
			case viewPackage.VIEW__LOGICAL_SYSTEM:
				setLogicalSystem(LOGICAL_SYSTEM_EDEFAULT);
				return;
			case viewPackage.VIEW__NAME:
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
			case viewPackage.VIEW__GROUP:
				return group != null && !group.isEmpty();
			case viewPackage.VIEW__COMPOSITE:
				return !getComposite().isEmpty();
			case viewPackage.VIEW__WIRE_MAPPING:
				return !getWireMapping().isEmpty();
			case viewPackage.VIEW__EUIDS_BINDING:
				return !getEuidsBinding().isEmpty();
			case viewPackage.VIEW__ASSEMBLY:
				return ASSEMBLY_EDEFAULT == null ? assembly != null : !ASSEMBLY_EDEFAULT.equals(assembly);
			case viewPackage.VIEW__LOGICAL_SYSTEM:
				return LOGICAL_SYSTEM_EDEFAULT == null ? logicalSystem != null : !LOGICAL_SYSTEM_EDEFAULT.equals(logicalSystem);
			case viewPackage.VIEW__NAME:
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
		result.append(", assembly: ");
		result.append(assembly);
		result.append(", logicalSystem: ");
		result.append(logicalSystem);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
