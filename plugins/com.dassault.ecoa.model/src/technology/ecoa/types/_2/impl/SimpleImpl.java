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

import technology.ecoa.types._2.Simple;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getMaxRange <em>Max Range</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getMinRange <em>Min Range</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getType <em>Type</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.SimpleImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleImpl extends MinimalEObjectImpl.Container implements Simple {
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
	 * The default value of the '{@link #getMaxRange() <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRange() <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected Object maxRange = MAX_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRange() <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIN_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRange() <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected Object minRange = MIN_RANGE_EDEFAULT;

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
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Object PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Object precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typPackage.Literals.SIMPLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxRange() {
		return maxRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRange(Object newMaxRange) {
		Object oldMaxRange = maxRange;
		maxRange = newMaxRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__MAX_RANGE, oldMaxRange, maxRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinRange() {
		return minRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRange(Object newMinRange) {
		Object oldMinRange = minRange;
		minRange = newMinRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__MIN_RANGE, oldMinRange, minRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Object newPrecision) {
		Object oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typPackage.SIMPLE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typPackage.SIMPLE__COMMENT:
				return getComment();
			case typPackage.SIMPLE__MAX_RANGE:
				return getMaxRange();
			case typPackage.SIMPLE__MIN_RANGE:
				return getMinRange();
			case typPackage.SIMPLE__NAME:
				return getName();
			case typPackage.SIMPLE__PRECISION:
				return getPrecision();
			case typPackage.SIMPLE__TYPE:
				return getType();
			case typPackage.SIMPLE__UNIT:
				return getUnit();
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
			case typPackage.SIMPLE__COMMENT:
				setComment((String)newValue);
				return;
			case typPackage.SIMPLE__MAX_RANGE:
				setMaxRange(newValue);
				return;
			case typPackage.SIMPLE__MIN_RANGE:
				setMinRange(newValue);
				return;
			case typPackage.SIMPLE__NAME:
				setName((String)newValue);
				return;
			case typPackage.SIMPLE__PRECISION:
				setPrecision(newValue);
				return;
			case typPackage.SIMPLE__TYPE:
				setType((String)newValue);
				return;
			case typPackage.SIMPLE__UNIT:
				setUnit((String)newValue);
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
			case typPackage.SIMPLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case typPackage.SIMPLE__MAX_RANGE:
				setMaxRange(MAX_RANGE_EDEFAULT);
				return;
			case typPackage.SIMPLE__MIN_RANGE:
				setMinRange(MIN_RANGE_EDEFAULT);
				return;
			case typPackage.SIMPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case typPackage.SIMPLE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case typPackage.SIMPLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case typPackage.SIMPLE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case typPackage.SIMPLE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case typPackage.SIMPLE__MAX_RANGE:
				return MAX_RANGE_EDEFAULT == null ? maxRange != null : !MAX_RANGE_EDEFAULT.equals(maxRange);
			case typPackage.SIMPLE__MIN_RANGE:
				return MIN_RANGE_EDEFAULT == null ? minRange != null : !MIN_RANGE_EDEFAULT.equals(minRange);
			case typPackage.SIMPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case typPackage.SIMPLE__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case typPackage.SIMPLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case typPackage.SIMPLE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(", maxRange: ");
		result.append(maxRange);
		result.append(", minRange: ");
		result.append(minRange);
		result.append(", name: ");
		result.append(name);
		result.append(", precision: ");
		result.append(precision);
		result.append(", type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //SimpleImpl
