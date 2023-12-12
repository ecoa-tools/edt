/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edttype.ArrayPredefined;
import edttype.BasicType;
import edttype.EDTDataType;
import edttype.EDTTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Array
 * Predefined</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.ArrayPredefinedImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.ArrayPredefinedImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.ArrayPredefinedImpl#getMaxNumber <em>Max
 * Number</em>}</li>
 * <li>{@link edttype.impl.ArrayPredefinedImpl#getItemType <em>Item
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayPredefinedImpl extends MinimalEObjectImpl.Container implements ArrayPredefined {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected String maxNumber = MAX_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected EDTDataType itemType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ArrayPredefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.ARRAY_PREDEFINED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ARRAY_PREDEFINED__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ARRAY_PREDEFINED__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getMaxNumber() {
		return maxNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxNumber(String newMaxNumber) {
		String oldMaxNumber = maxNumber;
		maxNumber = newMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ARRAY_PREDEFINED__MAX_NUMBER,
					oldMaxNumber, maxNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDTDataType getItemType() {
		if (itemType != null && itemType.eIsProxy()) {
			InternalEObject oldItemType = (InternalEObject) itemType;
			itemType = (EDTDataType) eResolveProxy(oldItemType);
			if (itemType != oldItemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE, oldItemType, itemType));
			}
		}
		return itemType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDTDataType basicGetItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setItemType(EDTDataType newItemType) {
		EDTDataType oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE,
					oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTTypePackage.ARRAY_PREDEFINED__NAME:
			return getName();
		case EDTTypePackage.ARRAY_PREDEFINED__COMMENT:
			return getComment();
		case EDTTypePackage.ARRAY_PREDEFINED__MAX_NUMBER:
			return getMaxNumber();
		case EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE:
			if (resolve)
				return getItemType();
			return basicGetItemType();
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
		case EDTTypePackage.ARRAY_PREDEFINED__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__MAX_NUMBER:
			setMaxNumber((String) newValue);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE:
			setItemType((EDTDataType) newValue);
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
		case EDTTypePackage.ARRAY_PREDEFINED__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__MAX_NUMBER:
			setMaxNumber(MAX_NUMBER_EDEFAULT);
			return;
		case EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE:
			setItemType((EDTDataType) null);
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
		case EDTTypePackage.ARRAY_PREDEFINED__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.ARRAY_PREDEFINED__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.ARRAY_PREDEFINED__MAX_NUMBER:
			return MAX_NUMBER_EDEFAULT == null ? maxNumber != null : !MAX_NUMBER_EDEFAULT.equals(maxNumber);
		case EDTTypePackage.ARRAY_PREDEFINED__ITEM_TYPE:
			return itemType != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Comment: ");
		result.append(comment);
		result.append(", maxNumber: ");
		result.append(maxNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BasicType getBasicType() {
		if (itemType != null) {
			return itemType.getBasicType();
		} else {
			return null;
		}
	}

	@Override
	public String getFullName() {
		return "ECOA:" + this.getName();
	}

	@Override
	public boolean isComplete() {
		return true;
	}

} // ArrayPredefinedImpl
