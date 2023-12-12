/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.ActivationTypeType;
import technology.ecoa.insertion.policy._2.AperiodicActivationProfile;
import technology.ecoa.insertion.policy._2.ModuleActivationProfile;
import technology.ecoa.insertion.policy._2.PeriodicActivationProfile;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getPeriodic <em>Periodic</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getReactive <em>Reactive</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getActivationType <em>Activation Type</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.ModuleActivationProfileImpl#getQueueDepth <em>Queue Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleActivationProfileImpl extends MinimalEObjectImpl.Container implements ModuleActivationProfile {
	/**
	 * The cached value of the '{@link #getPeriodic() <em>Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodic()
	 * @generated
	 * @ordered
	 */
	protected PeriodicActivationProfile periodic;

	/**
	 * The cached value of the '{@link #getReactive() <em>Reactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive()
	 * @generated
	 * @ordered
	 */
	protected AperiodicActivationProfile reactive;

	/**
	 * The default value of the '{@link #getActivationType() <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationTypeType ACTIVATION_TYPE_EDEFAULT = ActivationTypeType.REACTIVE;

	/**
	 * The cached value of the '{@link #getActivationType() <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationType()
	 * @generated
	 * @ordered
	 */
	protected ActivationTypeType activationType = ACTIVATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Activation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activationTypeESet;

	/**
	 * The default value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected String behaviour = BEHAVIOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNbOfProcessedOpsPerActivation() <em>Max Nb Of Processed Ops Per Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbOfProcessedOpsPerActivation()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMaxNbOfProcessedOpsPerActivation() <em>Max Nb Of Processed Ops Per Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbOfProcessedOpsPerActivation()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxNbOfProcessedOpsPerActivation = MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION_EDEFAULT;

	/**
	 * This is true if the Max Nb Of Processed Ops Per Activation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxNbOfProcessedOpsPerActivationESet;

	/**
	 * The default value of the '{@link #getQueueDepth() <em>Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUEUE_DEPTH_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getQueueDepth() <em>Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger queueDepth = QUEUE_DEPTH_EDEFAULT;

	/**
	 * This is true if the Queue Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueDepthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleActivationProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.MODULE_ACTIVATION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivationProfile getPeriodic() {
		return periodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodic(PeriodicActivationProfile newPeriodic, NotificationChain msgs) {
		PeriodicActivationProfile oldPeriodic = periodic;
		periodic = newPeriodic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC, oldPeriodic, newPeriodic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodic(PeriodicActivationProfile newPeriodic) {
		if (newPeriodic != periodic) {
			NotificationChain msgs = null;
			if (periodic != null)
				msgs = ((InternalEObject)periodic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC, null, msgs);
			if (newPeriodic != null)
				msgs = ((InternalEObject)newPeriodic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC, null, msgs);
			msgs = basicSetPeriodic(newPeriodic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC, newPeriodic, newPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AperiodicActivationProfile getReactive() {
		return reactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactive(AperiodicActivationProfile newReactive, NotificationChain msgs) {
		AperiodicActivationProfile oldReactive = reactive;
		reactive = newReactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE, oldReactive, newReactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive(AperiodicActivationProfile newReactive) {
		if (newReactive != reactive) {
			NotificationChain msgs = null;
			if (reactive != null)
				msgs = ((InternalEObject)reactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE, null, msgs);
			if (newReactive != null)
				msgs = ((InternalEObject)newReactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE, null, msgs);
			msgs = basicSetReactive(newReactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE, newReactive, newReactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationTypeType getActivationType() {
		return activationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationType(ActivationTypeType newActivationType) {
		ActivationTypeType oldActivationType = activationType;
		activationType = newActivationType == null ? ACTIVATION_TYPE_EDEFAULT : newActivationType;
		boolean oldActivationTypeESet = activationTypeESet;
		activationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE, oldActivationType, activationType, !oldActivationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivationType() {
		ActivationTypeType oldActivationType = activationType;
		boolean oldActivationTypeESet = activationTypeESet;
		activationType = ACTIVATION_TYPE_EDEFAULT;
		activationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE, oldActivationType, ACTIVATION_TYPE_EDEFAULT, oldActivationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivationType() {
		return activationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(String newBehaviour) {
		String oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__BEHAVIOUR, oldBehaviour, behaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxNbOfProcessedOpsPerActivation() {
		return maxNbOfProcessedOpsPerActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbOfProcessedOpsPerActivation(BigInteger newMaxNbOfProcessedOpsPerActivation) {
		BigInteger oldMaxNbOfProcessedOpsPerActivation = maxNbOfProcessedOpsPerActivation;
		maxNbOfProcessedOpsPerActivation = newMaxNbOfProcessedOpsPerActivation;
		boolean oldMaxNbOfProcessedOpsPerActivationESet = maxNbOfProcessedOpsPerActivationESet;
		maxNbOfProcessedOpsPerActivationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION, oldMaxNbOfProcessedOpsPerActivation, maxNbOfProcessedOpsPerActivation, !oldMaxNbOfProcessedOpsPerActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxNbOfProcessedOpsPerActivation() {
		BigInteger oldMaxNbOfProcessedOpsPerActivation = maxNbOfProcessedOpsPerActivation;
		boolean oldMaxNbOfProcessedOpsPerActivationESet = maxNbOfProcessedOpsPerActivationESet;
		maxNbOfProcessedOpsPerActivation = MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION_EDEFAULT;
		maxNbOfProcessedOpsPerActivationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION, oldMaxNbOfProcessedOpsPerActivation, MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION_EDEFAULT, oldMaxNbOfProcessedOpsPerActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxNbOfProcessedOpsPerActivation() {
		return maxNbOfProcessedOpsPerActivationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQueueDepth() {
		return queueDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueDepth(BigInteger newQueueDepth) {
		BigInteger oldQueueDepth = queueDepth;
		queueDepth = newQueueDepth;
		boolean oldQueueDepthESet = queueDepthESet;
		queueDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH, oldQueueDepth, queueDepth, !oldQueueDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueDepth() {
		BigInteger oldQueueDepth = queueDepth;
		boolean oldQueueDepthESet = queueDepthESet;
		queueDepth = QUEUE_DEPTH_EDEFAULT;
		queueDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH, oldQueueDepth, QUEUE_DEPTH_EDEFAULT, oldQueueDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueDepth() {
		return queueDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC:
				return basicSetPeriodic(null, msgs);
			case polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE:
				return basicSetReactive(null, msgs);
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
			case polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC:
				return getPeriodic();
			case polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE:
				return getReactive();
			case polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE:
				return getActivationType();
			case polPackage.MODULE_ACTIVATION_PROFILE__BEHAVIOUR:
				return getBehaviour();
			case polPackage.MODULE_ACTIVATION_PROFILE__INSTANCE_NAME:
				return getInstanceName();
			case polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION:
				return getMaxNbOfProcessedOpsPerActivation();
			case polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH:
				return getQueueDepth();
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
			case polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC:
				setPeriodic((PeriodicActivationProfile)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE:
				setReactive((AperiodicActivationProfile)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE:
				setActivationType((ActivationTypeType)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__BEHAVIOUR:
				setBehaviour((String)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION:
				setMaxNbOfProcessedOpsPerActivation((BigInteger)newValue);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH:
				setQueueDepth((BigInteger)newValue);
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
			case polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC:
				setPeriodic((PeriodicActivationProfile)null);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE:
				setReactive((AperiodicActivationProfile)null);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE:
				unsetActivationType();
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__BEHAVIOUR:
				setBehaviour(BEHAVIOUR_EDEFAULT);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION:
				unsetMaxNbOfProcessedOpsPerActivation();
				return;
			case polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH:
				unsetQueueDepth();
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
			case polPackage.MODULE_ACTIVATION_PROFILE__PERIODIC:
				return periodic != null;
			case polPackage.MODULE_ACTIVATION_PROFILE__REACTIVE:
				return reactive != null;
			case polPackage.MODULE_ACTIVATION_PROFILE__ACTIVATION_TYPE:
				return isSetActivationType();
			case polPackage.MODULE_ACTIVATION_PROFILE__BEHAVIOUR:
				return BEHAVIOUR_EDEFAULT == null ? behaviour != null : !BEHAVIOUR_EDEFAULT.equals(behaviour);
			case polPackage.MODULE_ACTIVATION_PROFILE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
			case polPackage.MODULE_ACTIVATION_PROFILE__MAX_NB_OF_PROCESSED_OPS_PER_ACTIVATION:
				return isSetMaxNbOfProcessedOpsPerActivation();
			case polPackage.MODULE_ACTIVATION_PROFILE__QUEUE_DEPTH:
				return isSetQueueDepth();
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
		result.append(" (activationType: ");
		if (activationTypeESet) result.append(activationType); else result.append("<unset>");
		result.append(", behaviour: ");
		result.append(behaviour);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(", maxNbOfProcessedOpsPerActivation: ");
		if (maxNbOfProcessedOpsPerActivationESet) result.append(maxNbOfProcessedOpsPerActivation); else result.append("<unset>");
		result.append(", queueDepth: ");
		if (queueDepthESet) result.append(queueDepth); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModuleActivationProfileImpl
