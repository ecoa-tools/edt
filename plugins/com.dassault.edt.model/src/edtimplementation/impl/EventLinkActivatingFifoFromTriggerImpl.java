/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.TriggerSender;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Link Activating Fifo From Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl#getReceiverFifoSize <em>Receiver Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link edtimplementation.impl.EventLinkActivatingFifoFromTriggerImpl#getTriggerPeriod <em>Trigger Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventLinkActivatingFifoFromTriggerImpl extends MinimalEObjectImpl.Container implements EventLinkActivatingFifoFromTrigger {
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
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected TriggerSender sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected DynamicTriggerEventReceiverInstance receiver;

	/**
	 * The default value of the '{@link #getTriggerPeriod() <em>Trigger Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double TRIGGER_PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTriggerPeriod() <em>Trigger Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPeriod()
	 * @generated
	 * @ordered
	 */
	protected double triggerPeriod = TRIGGER_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventLinkActivatingFifoFromTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE, oldReceiverFifoSize, receiverFifoSize, !oldReceiverFifoSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE, oldReceiverFifoSize, RECEIVER_FIFO_SIZE_EDEFAULT, oldReceiverFifoSizeESet));
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
	public TriggerSender getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (TriggerSender)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerSender basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSender(TriggerSender newSender) {
		TriggerSender oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicTriggerEventReceiverInstance getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (DynamicTriggerEventReceiverInstance)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicTriggerEventReceiverInstance basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiver(DynamicTriggerEventReceiverInstance newReceiver) {
		DynamicTriggerEventReceiverInstance oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTriggerPeriod() {
		return triggerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerPeriod(double newTriggerPeriod) {
		double oldTriggerPeriod = triggerPeriod;
		triggerPeriod = newTriggerPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD, oldTriggerPeriod, triggerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID:
				return getId();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE:
				return getReceiverFifoSize();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD:
				return getTriggerPeriod();
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE:
				setReceiverFifoSize((BigInteger)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER:
				setSender((TriggerSender)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER:
				setReceiver((DynamicTriggerEventReceiverInstance)newValue);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD:
				setTriggerPeriod((Double)newValue);
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID:
				unsetId();
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE:
				unsetReceiverFifoSize();
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER:
				setSender((TriggerSender)null);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER:
				setReceiver((DynamicTriggerEventReceiverInstance)null);
				return;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD:
				setTriggerPeriod(TRIGGER_PERIOD_EDEFAULT);
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
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__ID:
				return isSetId();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER_FIFO_SIZE:
				return isSetReceiverFifoSize();
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__SENDER:
				return sender != null;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__RECEIVER:
				return receiver != null;
			case EdtimplementationPackage.EVENT_LINK_ACTIVATING_FIFO_FROM_TRIGGER__TRIGGER_PERIOD:
				return triggerPeriod != TRIGGER_PERIOD_EDEFAULT;
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
		result.append(", triggerPeriod: ");
		result.append(triggerPeriod);
		result.append(')');
		return result.toString();
	}

} //EventLinkActivatingFifoFromTriggerImpl
