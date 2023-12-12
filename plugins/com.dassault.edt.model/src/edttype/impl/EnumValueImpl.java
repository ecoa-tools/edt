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

import com.dassault.edt.log.EDTLog;

import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.EnumValue;
import edttype.Library;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enum
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.EnumValueImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.EnumValueImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.EnumValueImpl#getValnum <em>Valnum</em>}</li>
 * <li>{@link edttype.impl.EnumValueImpl#getValnumType <em>Valnum
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumValueImpl extends MinimalEObjectImpl.Container implements EnumValue {
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
	 * The default value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected static final String VALNUM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected String valnum = VALNUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValnumType() <em>Valnum Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValnumType()
	 * @generated
	 * @ordered
	 */
	protected Constant valnumType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.ENUM_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE__COMMENT, oldComment,
					comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getValnum() {
		return valnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setValnum(String newValnum) {
		String oldValnum = valnum;
		if (newValnum != null && this.eContainer() != null && this.eContainer().eContainer() != null) {
			if (newValnum.contains("%")) {
				Constant constantType = EDTDataType.findConstantValue(newValnum,
						(Library) this.eContainer().eContainer());
				if (constantType == null) {
					EDTLog.toPopUpAndConsole(
							"ERROR : there is no Constant with the name "
									+ newValnum.substring(1, newValnum.length() - 1),
							"The ValNum has to be a Constant");
					return;
				}
				setValnumType(constantType);
			} else {
				setValnumType(null);
			}
		}
		valnum = newValnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE__VALNUM, oldValnum,
					valnum));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getValnumType() {
		if (valnumType != null && valnumType.eIsProxy()) {
			InternalEObject oldValnumType = (InternalEObject) valnumType;
			valnumType = (Constant) eResolveProxy(oldValnumType);
			if (valnumType != oldValnumType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.ENUM_VALUE__VALNUM_TYPE,
							oldValnumType, valnumType));
			}
		}
		return valnumType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetValnumType() {
		return valnumType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValnumType(Constant newValnumType) {
		Constant oldValnumType = valnumType;
		valnumType = newValnumType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE__VALNUM_TYPE, oldValnumType,
					valnumType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE__COMMENT:
			return getComment();
		case EDTTypePackage.ENUM_VALUE__NAME:
			return getName();
		case EDTTypePackage.ENUM_VALUE__VALNUM:
			return getValnum();
		case EDTTypePackage.ENUM_VALUE__VALNUM_TYPE:
			if (resolve)
				return getValnumType();
			return basicGetValnumType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.ENUM_VALUE__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.ENUM_VALUE__VALNUM:
			setValnum((String) newValue);
			return;
		case EDTTypePackage.ENUM_VALUE__VALNUM_TYPE:
			setValnumType((Constant) newValue);
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
		case EDTTypePackage.ENUM_VALUE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.ENUM_VALUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.ENUM_VALUE__VALNUM:
			setValnum(VALNUM_EDEFAULT);
			return;
		case EDTTypePackage.ENUM_VALUE__VALNUM_TYPE:
			setValnumType((Constant) null);
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
		case EDTTypePackage.ENUM_VALUE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.ENUM_VALUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.ENUM_VALUE__VALNUM:
			return VALNUM_EDEFAULT == null ? valnum != null : !VALNUM_EDEFAULT.equals(valnum);
		case EDTTypePackage.ENUM_VALUE__VALNUM_TYPE:
			return valnumType != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", name: ");
		result.append(name);
		result.append(", valnum: ");
		result.append(valnum);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

} // EnumValueImpl
