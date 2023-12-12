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

import technology.ecoa.types._2.EnumValue;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.impl.EnumValueImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.EnumValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.EnumValueImpl#getValnum <em>Valnum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumValueImpl extends MinimalEObjectImpl.Container implements EnumValue {
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
	 * The default value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected static final String VALNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected String valnum = VALNUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typPackage.Literals.ENUM_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ENUM_VALUE__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ENUM_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValnum() {
		return valnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValnum(String newValnum) {
		String oldValnum = valnum;
		valnum = newValnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.ENUM_VALUE__VALNUM, oldValnum, valnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typPackage.ENUM_VALUE__COMMENT:
				return getComment();
			case typPackage.ENUM_VALUE__NAME:
				return getName();
			case typPackage.ENUM_VALUE__VALNUM:
				return getValnum();
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
			case typPackage.ENUM_VALUE__COMMENT:
				setComment((String)newValue);
				return;
			case typPackage.ENUM_VALUE__NAME:
				setName((String)newValue);
				return;
			case typPackage.ENUM_VALUE__VALNUM:
				setValnum((String)newValue);
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
			case typPackage.ENUM_VALUE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case typPackage.ENUM_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case typPackage.ENUM_VALUE__VALNUM:
				setValnum(VALNUM_EDEFAULT);
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
			case typPackage.ENUM_VALUE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case typPackage.ENUM_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case typPackage.ENUM_VALUE__VALNUM:
				return VALNUM_EDEFAULT == null ? valnum != null : !VALNUM_EDEFAULT.equals(valnum);
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
		result.append(", name: ");
		result.append(name);
		result.append(", valnum: ");
		result.append(valnum);
		result.append(')');
		return result.toString();
	}

} //EnumValueImpl
