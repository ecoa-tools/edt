/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkSender;
import edtimplementation.EventReceiverInstance;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Link Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.EventLinkActivatableFifoImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatableFifoImpl#getReceiverFifoSize <em>Receiver Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatableFifoImpl#isReceiverActivating <em>Receiver Activating</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatableFifoImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatableFifoImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventLinkActivatableFifoImpl extends MinimalEObjectImpl.Container implements EventLinkActivatableFifo {
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
	 * The default value of the '{@link #getReceiverFifoSize() <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverFifoSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RECEIVER_FIFO_SIZE_EDEFAULT = new BigInteger("8");

	/**
	 * The cached value of the '{@link #getReceiverFifoSize() <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverFifoSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger receiverFifoSize = RECEIVER_FIFO_SIZE_EDEFAULT;

	/**
	 * This is true if the Receiver Fifo Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiverFifoSizeESet;

	/**
	 * The default value of the '{@link #isReceiverActivating() <em>Receiver Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceiverActivating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECEIVER_ACTIVATING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReceiverActivating() <em>Receiver Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceiverActivating()
	 * @generated
	 * @ordered
	 */
	protected boolean receiverActivating = RECEIVER_ACTIVATING_EDEFAULT;

	/**
	 * This is true if the Receiver Activating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiverActivatingESet;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected EventLinkSender sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EventReceiverInstance receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventLinkActivatableFifoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.EVENT_LINK_ACTIVATABLE_FIFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getReceiverFifoSize() {
		return receiverFifoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverFifoSize(BigInteger newReceiverFifoSize) {
		BigInteger oldReceiverFifoSize = receiverFifoSize;
		receiverFifoSize = newReceiverFifoSize;
		boolean oldReceiverFifoSizeESet = receiverFifoSizeESet;
		receiverFifoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE, oldReceiverFifoSize, receiverFifoSize, !oldReceiverFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReceiverFifoSize() {
		BigInteger oldReceiverFifoSize = receiverFifoSize;
		boolean oldReceiverFifoSizeESet = receiverFifoSizeESet;
		receiverFifoSize = RECEIVER_FIFO_SIZE_EDEFAULT;
		receiverFifoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE, oldReceiverFifoSize, RECEIVER_FIFO_SIZE_EDEFAULT, oldReceiverFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReceiverFifoSize() {
		return receiverFifoSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReceiverActivating() {
		return receiverActivating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverActivating(boolean newReceiverActivating) {
		boolean oldReceiverActivating = receiverActivating;
		receiverActivating = newReceiverActivating;
		boolean oldReceiverActivatingESet = receiverActivatingESet;
		receiverActivatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING, oldReceiverActivating, receiverActivating, !oldReceiverActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReceiverActivating() {
		boolean oldReceiverActivating = receiverActivating;
		boolean oldReceiverActivatingESet = receiverActivatingESet;
		receiverActivating = RECEIVER_ACTIVATING_EDEFAULT;
		receiverActivatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING, oldReceiverActivating, RECEIVER_ACTIVATING_EDEFAULT, oldReceiverActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReceiverActivating() {
		return receiverActivatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLinkSender getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (EventLinkSender)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventLinkSender basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSender(EventLinkSender newSender) {
		EventLinkSender oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventReceiverInstance getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (EventReceiverInstance)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReceiverInstance basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiver(EventReceiverInstance newReceiver) {
		EventReceiverInstance oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID:
				return getId();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE:
				return getReceiverFifoSize();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING:
				return isReceiverActivating();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE:
				setReceiverFifoSize((BigInteger)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING:
				setReceiverActivating((Boolean)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER:
				setSender((EventLinkSender)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER:
				setReceiver((EventReceiverInstance)newValue);
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID:
				unsetId();
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE:
				unsetReceiverFifoSize();
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING:
				unsetReceiverActivating();
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER:
				setSender((EventLinkSender)null);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER:
				setReceiver((EventReceiverInstance)null);
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__ID:
				return isSetId();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_FIFO_SIZE:
				return isSetReceiverFifoSize();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER_ACTIVATING:
				return isSetReceiverActivating();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__SENDER:
				return sender != null;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATABLE_FIFO__RECEIVER:
				return receiver != null;
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", receiverFifoSize: ");
		if (receiverFifoSizeESet) result.append(receiverFifoSize); else result.append("<unset>");
		result.append(", receiverActivating: ");
		if (receiverActivatingESet) result.append(receiverActivating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventLinkActivatableFifoImpl
