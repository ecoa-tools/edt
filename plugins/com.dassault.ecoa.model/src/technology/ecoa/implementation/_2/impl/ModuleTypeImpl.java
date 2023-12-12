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

import technology.ecoa.implementation._2.ModuleType;
import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.PinfoType1;
import technology.ecoa.implementation._2.PropertiesType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#isHasUserContext <em>Has User Context</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#isHasWarmStartContext <em>Has Warm Start Context</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#isIsFaultHandler <em>Is Fault Handler</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleTypeImpl extends MinimalEObjectImpl.Container implements ModuleType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getPinfo() <em>Pinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinfo()
	 * @generated
	 * @ordered
	 */
	protected PinfoType1 pinfo;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected OperationsType operations;

	/**
	 * The default value of the '{@link #isActivatingFaultNotifs() <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATING_FAULT_NOTIFS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivatingFaultNotifs() <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 * @ordered
	 */
	protected boolean activatingFaultNotifs = ACTIVATING_FAULT_NOTIFS_EDEFAULT;

	/**
	 * This is true if the Activating Fault Notifs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activatingFaultNotifsESet;

	/**
	 * The default value of the '{@link #isHasUserContext() <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasUserContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_USER_CONTEXT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasUserContext() <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasUserContext()
	 * @generated
	 * @ordered
	 */
	protected boolean hasUserContext = HAS_USER_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Has User Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasUserContextESet;

	/**
	 * The default value of the '{@link #isHasWarmStartContext() <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasWarmStartContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_WARM_START_CONTEXT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasWarmStartContext() <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasWarmStartContext()
	 * @generated
	 * @ordered
	 */
	protected boolean hasWarmStartContext = HAS_WARM_START_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Has Warm Start Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasWarmStartContextESet;

	/**
	 * The default value of the '{@link #isIsFaultHandler() <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFaultHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAULT_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFaultHandler() <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFaultHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean isFaultHandler = IS_FAULT_HANDLER_EDEFAULT;

	/**
	 * This is true if the Is Fault Handler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isFaultHandlerESet;

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
	protected ModuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.MODULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinfoType1 getPinfo() {
		return pinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPinfo(PinfoType1 newPinfo, NotificationChain msgs) {
		PinfoType1 oldPinfo = pinfo;
		pinfo = newPinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__PINFO, oldPinfo, newPinfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinfo(PinfoType1 newPinfo) {
		if (newPinfo != pinfo) {
			NotificationChain msgs = null;
			if (pinfo != null)
				msgs = ((InternalEObject)pinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__PINFO, null, msgs);
			if (newPinfo != null)
				msgs = ((InternalEObject)newPinfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__PINFO, null, msgs);
			msgs = basicSetPinfo(newPinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__PINFO, newPinfo, newPinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsType getOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperations(OperationsType newOperations, NotificationChain msgs) {
		OperationsType oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__OPERATIONS, oldOperations, newOperations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperations(OperationsType newOperations) {
		if (newOperations != operations) {
			NotificationChain msgs = null;
			if (operations != null)
				msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__OPERATIONS, null, msgs);
			if (newOperations != null)
				msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_TYPE__OPERATIONS, null, msgs);
			msgs = basicSetOperations(newOperations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__OPERATIONS, newOperations, newOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivatingFaultNotifs() {
		return activatingFaultNotifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatingFaultNotifs(boolean newActivatingFaultNotifs) {
		boolean oldActivatingFaultNotifs = activatingFaultNotifs;
		activatingFaultNotifs = newActivatingFaultNotifs;
		boolean oldActivatingFaultNotifsESet = activatingFaultNotifsESet;
		activatingFaultNotifsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS, oldActivatingFaultNotifs, activatingFaultNotifs, !oldActivatingFaultNotifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivatingFaultNotifs() {
		boolean oldActivatingFaultNotifs = activatingFaultNotifs;
		boolean oldActivatingFaultNotifsESet = activatingFaultNotifsESet;
		activatingFaultNotifs = ACTIVATING_FAULT_NOTIFS_EDEFAULT;
		activatingFaultNotifsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS, oldActivatingFaultNotifs, ACTIVATING_FAULT_NOTIFS_EDEFAULT, oldActivatingFaultNotifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivatingFaultNotifs() {
		return activatingFaultNotifsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasUserContext() {
		return hasUserContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasUserContext(boolean newHasUserContext) {
		boolean oldHasUserContext = hasUserContext;
		hasUserContext = newHasUserContext;
		boolean oldHasUserContextESet = hasUserContextESet;
		hasUserContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__HAS_USER_CONTEXT, oldHasUserContext, hasUserContext, !oldHasUserContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasUserContext() {
		boolean oldHasUserContext = hasUserContext;
		boolean oldHasUserContextESet = hasUserContextESet;
		hasUserContext = HAS_USER_CONTEXT_EDEFAULT;
		hasUserContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.MODULE_TYPE__HAS_USER_CONTEXT, oldHasUserContext, HAS_USER_CONTEXT_EDEFAULT, oldHasUserContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasUserContext() {
		return hasUserContextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasWarmStartContext() {
		return hasWarmStartContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasWarmStartContext(boolean newHasWarmStartContext) {
		boolean oldHasWarmStartContext = hasWarmStartContext;
		hasWarmStartContext = newHasWarmStartContext;
		boolean oldHasWarmStartContextESet = hasWarmStartContextESet;
		hasWarmStartContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT, oldHasWarmStartContext, hasWarmStartContext, !oldHasWarmStartContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasWarmStartContext() {
		boolean oldHasWarmStartContext = hasWarmStartContext;
		boolean oldHasWarmStartContextESet = hasWarmStartContextESet;
		hasWarmStartContext = HAS_WARM_START_CONTEXT_EDEFAULT;
		hasWarmStartContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT, oldHasWarmStartContext, HAS_WARM_START_CONTEXT_EDEFAULT, oldHasWarmStartContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasWarmStartContext() {
		return hasWarmStartContextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFaultHandler() {
		return isFaultHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFaultHandler(boolean newIsFaultHandler) {
		boolean oldIsFaultHandler = isFaultHandler;
		isFaultHandler = newIsFaultHandler;
		boolean oldIsFaultHandlerESet = isFaultHandlerESet;
		isFaultHandlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__IS_FAULT_HANDLER, oldIsFaultHandler, isFaultHandler, !oldIsFaultHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsFaultHandler() {
		boolean oldIsFaultHandler = isFaultHandler;
		boolean oldIsFaultHandlerESet = isFaultHandlerESet;
		isFaultHandler = IS_FAULT_HANDLER_EDEFAULT;
		isFaultHandlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.MODULE_TYPE__IS_FAULT_HANDLER, oldIsFaultHandler, IS_FAULT_HANDLER_EDEFAULT, oldIsFaultHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsFaultHandler() {
		return isFaultHandlerESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.MODULE_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case impPackage.MODULE_TYPE__PINFO:
				return basicSetPinfo(null, msgs);
			case impPackage.MODULE_TYPE__OPERATIONS:
				return basicSetOperations(null, msgs);
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
			case impPackage.MODULE_TYPE__PROPERTIES:
				return getProperties();
			case impPackage.MODULE_TYPE__PINFO:
				return getPinfo();
			case impPackage.MODULE_TYPE__OPERATIONS:
				return getOperations();
			case impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				return isActivatingFaultNotifs();
			case impPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				return isHasUserContext();
			case impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				return isHasWarmStartContext();
			case impPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				return isIsFaultHandler();
			case impPackage.MODULE_TYPE__NAME:
				return getName();
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
			case impPackage.MODULE_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case impPackage.MODULE_TYPE__PINFO:
				setPinfo((PinfoType1)newValue);
				return;
			case impPackage.MODULE_TYPE__OPERATIONS:
				setOperations((OperationsType)newValue);
				return;
			case impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				setActivatingFaultNotifs((Boolean)newValue);
				return;
			case impPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				setHasUserContext((Boolean)newValue);
				return;
			case impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				setHasWarmStartContext((Boolean)newValue);
				return;
			case impPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				setIsFaultHandler((Boolean)newValue);
				return;
			case impPackage.MODULE_TYPE__NAME:
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
			case impPackage.MODULE_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case impPackage.MODULE_TYPE__PINFO:
				setPinfo((PinfoType1)null);
				return;
			case impPackage.MODULE_TYPE__OPERATIONS:
				setOperations((OperationsType)null);
				return;
			case impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				unsetActivatingFaultNotifs();
				return;
			case impPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				unsetHasUserContext();
				return;
			case impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				unsetHasWarmStartContext();
				return;
			case impPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				unsetIsFaultHandler();
				return;
			case impPackage.MODULE_TYPE__NAME:
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
			case impPackage.MODULE_TYPE__PROPERTIES:
				return properties != null;
			case impPackage.MODULE_TYPE__PINFO:
				return pinfo != null;
			case impPackage.MODULE_TYPE__OPERATIONS:
				return operations != null;
			case impPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				return isSetActivatingFaultNotifs();
			case impPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				return isSetHasUserContext();
			case impPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				return isSetHasWarmStartContext();
			case impPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				return isSetIsFaultHandler();
			case impPackage.MODULE_TYPE__NAME:
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
		result.append(" (activatingFaultNotifs: ");
		if (activatingFaultNotifsESet) result.append(activatingFaultNotifs); else result.append("<unset>");
		result.append(", hasUserContext: ");
		if (hasUserContextESet) result.append(hasUserContext); else result.append("<unset>");
		result.append(", hasWarmStartContext: ");
		if (hasWarmStartContextESet) result.append(hasWarmStartContext); else result.append("<unset>");
		result.append(", isFaultHandler: ");
		if (isFaultHandlerESet) result.append(isFaultHandler); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleTypeImpl
