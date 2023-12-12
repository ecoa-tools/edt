/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.ReadersType;
import technology.ecoa.implementation._2.WritersType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.DataLinkImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.DataLinkImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.DataLinkImpl#isControlled <em>Controlled</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.DataLinkImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLinkImpl extends MinimalEObjectImpl.Container implements DataLink {
	/**
	 * The cached value of the '{@link #getWriters() <em>Writers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriters()
	 * @generated
	 * @ordered
	 */
	protected WritersType writers;

	/**
	 * The cached value of the '{@link #getReaders() <em>Readers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaders()
	 * @generated
	 * @ordered
	 */
	protected ReadersType readers;

	/**
	 * The default value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean controlled = CONTROLLED_EDEFAULT;

	/**
	 * This is true if the Controlled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlledESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.DATA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritersType getWriters() {
		return writers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriters(WritersType newWriters, NotificationChain msgs) {
		WritersType oldWriters = writers;
		writers = newWriters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__WRITERS, oldWriters, newWriters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriters(WritersType newWriters) {
		if (newWriters != writers) {
			NotificationChain msgs = null;
			if (writers != null)
				msgs = ((InternalEObject)writers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.DATA_LINK__WRITERS, null, msgs);
			if (newWriters != null)
				msgs = ((InternalEObject)newWriters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.DATA_LINK__WRITERS, null, msgs);
			msgs = basicSetWriters(newWriters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__WRITERS, newWriters, newWriters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadersType getReaders() {
		return readers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaders(ReadersType newReaders, NotificationChain msgs) {
		ReadersType oldReaders = readers;
		readers = newReaders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__READERS, oldReaders, newReaders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaders(ReadersType newReaders) {
		if (newReaders != readers) {
			NotificationChain msgs = null;
			if (readers != null)
				msgs = ((InternalEObject)readers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.DATA_LINK__READERS, null, msgs);
			if (newReaders != null)
				msgs = ((InternalEObject)newReaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.DATA_LINK__READERS, null, msgs);
			msgs = basicSetReaders(newReaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__READERS, newReaders, newReaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlled(boolean newControlled) {
		boolean oldControlled = controlled;
		controlled = newControlled;
		boolean oldControlledESet = controlledESet;
		controlledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__CONTROLLED, oldControlled, controlled, !oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControlled() {
		boolean oldControlled = controlled;
		boolean oldControlledESet = controlledESet;
		controlled = CONTROLLED_EDEFAULT;
		controlledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.DATA_LINK__CONTROLLED, oldControlled, CONTROLLED_EDEFAULT, oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControlled() {
		return controlledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.DATA_LINK__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.DATA_LINK__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.DATA_LINK__WRITERS:
				return basicSetWriters(null, msgs);
			case impPackage.DATA_LINK__READERS:
				return basicSetReaders(null, msgs);
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
			case impPackage.DATA_LINK__WRITERS:
				return getWriters();
			case impPackage.DATA_LINK__READERS:
				return getReaders();
			case impPackage.DATA_LINK__CONTROLLED:
				return isControlled();
			case impPackage.DATA_LINK__ID:
				return getId();
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
			case impPackage.DATA_LINK__WRITERS:
				setWriters((WritersType)newValue);
				return;
			case impPackage.DATA_LINK__READERS:
				setReaders((ReadersType)newValue);
				return;
			case impPackage.DATA_LINK__CONTROLLED:
				setControlled((Boolean)newValue);
				return;
			case impPackage.DATA_LINK__ID:
				setId((Integer)newValue);
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
			case impPackage.DATA_LINK__WRITERS:
				setWriters((WritersType)null);
				return;
			case impPackage.DATA_LINK__READERS:
				setReaders((ReadersType)null);
				return;
			case impPackage.DATA_LINK__CONTROLLED:
				unsetControlled();
				return;
			case impPackage.DATA_LINK__ID:
				unsetId();
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
			case impPackage.DATA_LINK__WRITERS:
				return writers != null;
			case impPackage.DATA_LINK__READERS:
				return readers != null;
			case impPackage.DATA_LINK__CONTROLLED:
				return isSetControlled();
			case impPackage.DATA_LINK__ID:
				return isSetId();
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
		result.append(" (controlled: ");
		if (controlledESet) result.append(controlled); else result.append("<unset>");
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataLinkImpl
