/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.types._2.Array;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.impl.ArrayImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.ArrayImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.ArrayImpl#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.ArrayImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayImpl extends MinimalEObjectImpl.Container implements Array {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected String itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected String maxNumber = MAX_NUMBER_EDEFAULT;

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
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ARRAY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(String newItemType) {
		String oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ARRAY__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxNumber() {
		return maxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumber(String newMaxNumber) {
		String oldMaxNumber = maxNumber;
		maxNumber = newMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ARRAY__MAX_NUMBER, oldMaxNumber, maxNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ARRAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typPackage.ARRAY__COMMENT:
				return getComment();
			case typPackage.ARRAY__ITEM_TYPE:
				return getItemType();
			case typPackage.ARRAY__MAX_NUMBER:
				return getMaxNumber();
			case typPackage.ARRAY__NAME:
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
			case typPackage.ARRAY__COMMENT:
				setComment((String)newValue);
				return;
			case typPackage.ARRAY__ITEM_TYPE:
				setItemType((String)newValue);
				return;
			case typPackage.ARRAY__MAX_NUMBER:
				setMaxNumber((String)newValue);
				return;
			case typPackage.ARRAY__NAME:
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
			case typPackage.ARRAY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case typPackage.ARRAY__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
				return;
			case typPackage.ARRAY__MAX_NUMBER:
				setMaxNumber(MAX_NUMBER_EDEFAULT);
				return;
			case typPackage.ARRAY__NAME:
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
			case typPackage.ARRAY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case typPackage.ARRAY__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
			case typPackage.ARRAY__MAX_NUMBER:
				return MAX_NUMBER_EDEFAULT == null ? maxNumber != null : !MAX_NUMBER_EDEFAULT.equals(maxNumber);
			case typPackage.ARRAY__NAME:
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(", maxNumber: ");
		result.append(maxNumber);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArrayImpl
