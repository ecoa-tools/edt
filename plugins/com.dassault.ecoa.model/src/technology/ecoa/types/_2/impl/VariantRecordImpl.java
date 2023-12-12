/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.types._2.Field;
import technology.ecoa.types._2.Union;
import technology.ecoa.types._2.VariantRecord;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getField <em>Field</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getSelectName <em>Select Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.VariantRecordImpl#getSelectType <em>Select Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantRecordImpl extends MinimalEObjectImpl.Container implements VariantRecord {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<Union> union;

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
	 * The default value of the '{@link #getSelectName() <em>Select Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectName()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectName() <em>Select Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectName()
	 * @generated
	 * @ordered
	 */
	protected String selectName = SELECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectType() <em>Select Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectType()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectType() <em>Select Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectType()
	 * @generated
	 * @ordered
	 */
	protected String selectType = SELECT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typPackage.Literals.VARIANT_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, typPackage.VARIANT_RECORD__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Union> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<Union>(Union.class, this, typPackage.VARIANT_RECORD__UNION);
		}
		return union;
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.VARIANT_RECORD__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.VARIANT_RECORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectName() {
		return selectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectName(String newSelectName) {
		String oldSelectName = selectName;
		selectName = newSelectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.VARIANT_RECORD__SELECT_NAME, oldSelectName, selectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectType() {
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectType(String newSelectType) {
		String oldSelectType = selectType;
		selectType = newSelectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.VARIANT_RECORD__SELECT_TYPE, oldSelectType, selectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case typPackage.VARIANT_RECORD__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
			case typPackage.VARIANT_RECORD__UNION:
				return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
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
			case typPackage.VARIANT_RECORD__FIELD:
				return getField();
			case typPackage.VARIANT_RECORD__UNION:
				return getUnion();
			case typPackage.VARIANT_RECORD__COMMENT:
				return getComment();
			case typPackage.VARIANT_RECORD__NAME:
				return getName();
			case typPackage.VARIANT_RECORD__SELECT_NAME:
				return getSelectName();
			case typPackage.VARIANT_RECORD__SELECT_TYPE:
				return getSelectType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case typPackage.VARIANT_RECORD__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends Field>)newValue);
				return;
			case typPackage.VARIANT_RECORD__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends Union>)newValue);
				return;
			case typPackage.VARIANT_RECORD__COMMENT:
				setComment((String)newValue);
				return;
			case typPackage.VARIANT_RECORD__NAME:
				setName((String)newValue);
				return;
			case typPackage.VARIANT_RECORD__SELECT_NAME:
				setSelectName((String)newValue);
				return;
			case typPackage.VARIANT_RECORD__SELECT_TYPE:
				setSelectType((String)newValue);
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
			case typPackage.VARIANT_RECORD__FIELD:
				getField().clear();
				return;
			case typPackage.VARIANT_RECORD__UNION:
				getUnion().clear();
				return;
			case typPackage.VARIANT_RECORD__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case typPackage.VARIANT_RECORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case typPackage.VARIANT_RECORD__SELECT_NAME:
				setSelectName(SELECT_NAME_EDEFAULT);
				return;
			case typPackage.VARIANT_RECORD__SELECT_TYPE:
				setSelectType(SELECT_TYPE_EDEFAULT);
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
			case typPackage.VARIANT_RECORD__FIELD:
				return field != null && !field.isEmpty();
			case typPackage.VARIANT_RECORD__UNION:
				return union != null && !union.isEmpty();
			case typPackage.VARIANT_RECORD__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case typPackage.VARIANT_RECORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case typPackage.VARIANT_RECORD__SELECT_NAME:
				return SELECT_NAME_EDEFAULT == null ? selectName != null : !SELECT_NAME_EDEFAULT.equals(selectName);
			case typPackage.VARIANT_RECORD__SELECT_TYPE:
				return SELECT_TYPE_EDEFAULT == null ? selectType != null : !SELECT_TYPE_EDEFAULT.equals(selectType);
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
		result.append(", selectName: ");
		result.append(selectName);
		result.append(", selectType: ");
		result.append(selectType);
		result.append(')');
		return result.toString();
	}

} //VariantRecordImpl
