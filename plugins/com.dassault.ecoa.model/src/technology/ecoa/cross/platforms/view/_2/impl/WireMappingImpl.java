/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.cross.platforms.view._2.WireMapping;
import technology.ecoa.cross.platforms.view._2.viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireMappingImpl extends MinimalEObjectImpl.Container implements WireMapping {
	/**
	 * The default value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_ON_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedOnLinkId() <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOnLinkId()
	 * @generated
	 * @ordered
	 */
	protected String mappedOnLinkId = MAPPED_ON_LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return viewPackage.Literals.WIRE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedOnLinkId() {
		return mappedOnLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedOnLinkId(String newMappedOnLinkId) {
		String oldMappedOnLinkId = mappedOnLinkId;
		mappedOnLinkId = newMappedOnLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID, oldMappedOnLinkId, mappedOnLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.WIRE_MAPPING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.WIRE_MAPPING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case viewPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				return getMappedOnLinkId();
			case viewPackage.WIRE_MAPPING__SOURCE:
				return getSource();
			case viewPackage.WIRE_MAPPING__TARGET:
				return getTarget();
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
			case viewPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				setMappedOnLinkId((String)newValue);
				return;
			case viewPackage.WIRE_MAPPING__SOURCE:
				setSource((String)newValue);
				return;
			case viewPackage.WIRE_MAPPING__TARGET:
				setTarget((String)newValue);
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
			case viewPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				setMappedOnLinkId(MAPPED_ON_LINK_ID_EDEFAULT);
				return;
			case viewPackage.WIRE_MAPPING__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case viewPackage.WIRE_MAPPING__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case viewPackage.WIRE_MAPPING__MAPPED_ON_LINK_ID:
				return MAPPED_ON_LINK_ID_EDEFAULT == null ? mappedOnLinkId != null : !MAPPED_ON_LINK_ID_EDEFAULT.equals(mappedOnLinkId);
			case viewPackage.WIRE_MAPPING__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case viewPackage.WIRE_MAPPING__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
		result.append(" (mappedOnLinkId: ");
		result.append(mappedOnLinkId);
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //WireMappingImpl
