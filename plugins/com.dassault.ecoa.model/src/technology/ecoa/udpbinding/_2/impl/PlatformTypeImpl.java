/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.udpbinding._2.PlatformType;
import technology.ecoa.udpbinding._2.udpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl#getMaxChannels <em>Max Channels</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl#getPlatformId <em>Platform Id</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl#getReceivingMulticastAddress <em>Receiving Multicast Address</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.impl.PlatformTypeImpl#getReceivingPort <em>Receiving Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformTypeImpl extends MinimalEObjectImpl.Container implements PlatformType {
	/**
	 * The default value of the '{@link #getMaxChannels() <em>Max Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChannels()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_CHANNELS_EDEFAULT = new BigInteger("256");

	/**
	 * The cached value of the '{@link #getMaxChannels() <em>Max Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChannels()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxChannels = MAX_CHANNELS_EDEFAULT;

	/**
	 * This is true if the Max Channels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxChannelsESet;

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
	 * The default value of the '{@link #getPlatformId() <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformId()
	 * @generated
	 * @ordered
	 */
	protected static final long PLATFORM_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPlatformId() <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformId()
	 * @generated
	 * @ordered
	 */
	protected long platformId = PLATFORM_ID_EDEFAULT;

	/**
	 * This is true if the Platform Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean platformIdESet;

	/**
	 * The default value of the '{@link #getReceivingMulticastAddress() <em>Receiving Multicast Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingMulticastAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVING_MULTICAST_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingMulticastAddress() <em>Receiving Multicast Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingMulticastAddress()
	 * @generated
	 * @ordered
	 */
	protected String receivingMulticastAddress = RECEIVING_MULTICAST_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivingPort() <em>Receiving Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RECEIVING_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingPort() <em>Receiving Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger receivingPort = RECEIVING_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return udpPackage.Literals.PLATFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxChannels() {
		return maxChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxChannels(BigInteger newMaxChannels) {
		BigInteger oldMaxChannels = maxChannels;
		maxChannels = newMaxChannels;
		boolean oldMaxChannelsESet = maxChannelsESet;
		maxChannelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, udpPackage.PLATFORM_TYPE__MAX_CHANNELS, oldMaxChannels, maxChannels, !oldMaxChannelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxChannels() {
		BigInteger oldMaxChannels = maxChannels;
		boolean oldMaxChannelsESet = maxChannelsESet;
		maxChannels = MAX_CHANNELS_EDEFAULT;
		maxChannelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, udpPackage.PLATFORM_TYPE__MAX_CHANNELS, oldMaxChannels, MAX_CHANNELS_EDEFAULT, oldMaxChannelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxChannels() {
		return maxChannelsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, udpPackage.PLATFORM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPlatformId() {
		return platformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformId(long newPlatformId) {
		long oldPlatformId = platformId;
		platformId = newPlatformId;
		boolean oldPlatformIdESet = platformIdESet;
		platformIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, udpPackage.PLATFORM_TYPE__PLATFORM_ID, oldPlatformId, platformId, !oldPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlatformId() {
		long oldPlatformId = platformId;
		boolean oldPlatformIdESet = platformIdESet;
		platformId = PLATFORM_ID_EDEFAULT;
		platformIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, udpPackage.PLATFORM_TYPE__PLATFORM_ID, oldPlatformId, PLATFORM_ID_EDEFAULT, oldPlatformIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlatformId() {
		return platformIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivingMulticastAddress() {
		return receivingMulticastAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingMulticastAddress(String newReceivingMulticastAddress) {
		String oldReceivingMulticastAddress = receivingMulticastAddress;
		receivingMulticastAddress = newReceivingMulticastAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, udpPackage.PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS, oldReceivingMulticastAddress, receivingMulticastAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReceivingPort() {
		return receivingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingPort(BigInteger newReceivingPort) {
		BigInteger oldReceivingPort = receivingPort;
		receivingPort = newReceivingPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, udpPackage.PLATFORM_TYPE__RECEIVING_PORT, oldReceivingPort, receivingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case udpPackage.PLATFORM_TYPE__MAX_CHANNELS:
				return getMaxChannels();
			case udpPackage.PLATFORM_TYPE__NAME:
				return getName();
			case udpPackage.PLATFORM_TYPE__PLATFORM_ID:
				return getPlatformId();
			case udpPackage.PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS:
				return getReceivingMulticastAddress();
			case udpPackage.PLATFORM_TYPE__RECEIVING_PORT:
				return getReceivingPort();
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
			case udpPackage.PLATFORM_TYPE__MAX_CHANNELS:
				setMaxChannels((BigInteger)newValue);
				return;
			case udpPackage.PLATFORM_TYPE__NAME:
				setName((String)newValue);
				return;
			case udpPackage.PLATFORM_TYPE__PLATFORM_ID:
				setPlatformId((Long)newValue);
				return;
			case udpPackage.PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS:
				setReceivingMulticastAddress((String)newValue);
				return;
			case udpPackage.PLATFORM_TYPE__RECEIVING_PORT:
				setReceivingPort((BigInteger)newValue);
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
			case udpPackage.PLATFORM_TYPE__MAX_CHANNELS:
				unsetMaxChannels();
				return;
			case udpPackage.PLATFORM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case udpPackage.PLATFORM_TYPE__PLATFORM_ID:
				unsetPlatformId();
				return;
			case udpPackage.PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS:
				setReceivingMulticastAddress(RECEIVING_MULTICAST_ADDRESS_EDEFAULT);
				return;
			case udpPackage.PLATFORM_TYPE__RECEIVING_PORT:
				setReceivingPort(RECEIVING_PORT_EDEFAULT);
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
			case udpPackage.PLATFORM_TYPE__MAX_CHANNELS:
				return isSetMaxChannels();
			case udpPackage.PLATFORM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case udpPackage.PLATFORM_TYPE__PLATFORM_ID:
				return isSetPlatformId();
			case udpPackage.PLATFORM_TYPE__RECEIVING_MULTICAST_ADDRESS:
				return RECEIVING_MULTICAST_ADDRESS_EDEFAULT == null ? receivingMulticastAddress != null : !RECEIVING_MULTICAST_ADDRESS_EDEFAULT.equals(receivingMulticastAddress);
			case udpPackage.PLATFORM_TYPE__RECEIVING_PORT:
				return RECEIVING_PORT_EDEFAULT == null ? receivingPort != null : !RECEIVING_PORT_EDEFAULT.equals(receivingPort);
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
		result.append(" (maxChannels: ");
		if (maxChannelsESet) result.append(maxChannels); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", platformId: ");
		if (platformIdESet) result.append(platformId); else result.append("<unset>");
		result.append(", receivingMulticastAddress: ");
		result.append(receivingMulticastAddress);
		result.append(", receivingPort: ");
		result.append(receivingPort);
		result.append(')');
		return result.toString();
	}

} //PlatformTypeImpl
