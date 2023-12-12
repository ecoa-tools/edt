/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.dassault.edt.log.EDTLog;

import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Library;
import edttype.Simple;
import edttype.util.EDTTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Simple</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.SimpleImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getMaxRange <em>Max Range</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getMinRange <em>Min Range</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getPrecision <em>Precision</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getType <em>Type</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getMaxRangeType <em>Max Range
 * Type</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getMinRangeType <em>Min Range
 * Type</em>}</li>
 * <li>{@link edttype.impl.SimpleImpl#getPrecisionType <em>Precision
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleImpl extends MinimalEObjectImpl.Container implements Simple {
	private static final String ERROR_THERE_IS_NO_CONSTANT_WITH_THE_NAME = "ERROR : there is no Constant with the name ";

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
	 * The default value of the '{@link #getMaxRange() <em>Max Range</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRange() <em>Max Range</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected Object maxRange = MAX_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRange() <em>Min Range</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIN_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRange() <em>Min Range</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected Object minRange = MIN_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Object PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Object precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDTDataType type;

	/**
	 * The cached value of the '{@link #getMaxRangeType() <em>Max Range Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxRangeType()
	 * @generated
	 * @ordered
	 */
	protected Constant maxRangeType;

	/**
	 * The cached value of the '{@link #getMinRangeType() <em>Min Range Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinRangeType()
	 * @generated
	 * @ordered
	 */
	protected Constant minRangeType;

	/**
	 * The cached value of the '{@link #getPrecisionType() <em>Precision Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrecisionType()
	 * @generated
	 * @ordered
	 */
	protected Constant precisionType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.SIMPLE;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Verification of uniqueness of
	 * name
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getMaxRange() {
		return maxRange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setMaxRange(Object newMaxRange) {
		Object oldMaxRange = maxRange;
		if (newMaxRange instanceof String maxRangeValue && maxRangeValue.contains("%") && this.eContainer() != null) {
			Constant constantType = EDTDataType.findConstantValue(maxRangeValue, (Library) this.eContainer());
			if (constantType == null) {
				EDTLog.toPopUpAndConsole(
						ERROR_THERE_IS_NO_CONSTANT_WITH_THE_NAME
								+ maxRangeValue.substring(1, maxRangeValue.length() - 1),
						"The Max Range has to be a Constant");
				return;
			}
			setMaxRangeType(constantType);
		} else {
			setMaxRangeType(null);
		}
		maxRange = newMaxRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__MAX_RANGE, oldMaxRange,
					maxRange));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getMinRange() {
		return minRange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setMinRange(Object newMinRange) {
		Object oldMinRange = minRange;
		if (newMinRange instanceof String minRangeValue && minRangeValue.contains("%") && this.eContainer() != null) {
			Constant constantType = EDTDataType.findConstantValue(minRangeValue, (Library) this.eContainer());
			if (constantType == null) {
				EDTLog.toPopUpAndConsole(
						ERROR_THERE_IS_NO_CONSTANT_WITH_THE_NAME
								+ minRangeValue.substring(1, minRangeValue.length() - 1),
						"The Min Range has to be a Constant");
				return;
			}
			setMinRangeType(constantType);
		} else {
			setMinRangeType(null);
		}
		minRange = newMinRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__MIN_RANGE, oldMinRange,
					minRange));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setPrecision(Object newPrecision) {
		Object oldPrecision = precision;
		if (newPrecision instanceof String precisionValue && precisionValue.contains("%")
				&& this.eContainer() != null) {
			Constant constantType = EDTDataType.findConstantValue(precisionValue, (Library) this.eContainer());
			if (constantType == null) {
				EDTLog.toPopUpAndConsole(
						ERROR_THERE_IS_NO_CONSTANT_WITH_THE_NAME
								+ precisionValue.substring(1, precisionValue.length() - 1),
						"The Precision has to be a Constant");
				return;
			}
			setPrecisionType(constantType);

		} else {
			setPrecisionType(null);
		}

		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__PRECISION, oldPrecision,
					precision));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDTDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EDTDataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.SIMPLE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public BasicType getBasicType() {
		if (type instanceof BasicType basicType) {
			return basicType;
		} else if (type instanceof Simple simple) {
			return simple.getBasicType();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDTDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> Verification of Type, can only be basicType or
	 * Simple<!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(EDTDataType newType) {
		EDTDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getMaxRangeType() {
		if (maxRangeType != null && maxRangeType.eIsProxy()) {
			InternalEObject oldMaxRangeType = (InternalEObject) maxRangeType;
			maxRangeType = (Constant) eResolveProxy(oldMaxRangeType);
			if (maxRangeType != oldMaxRangeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.SIMPLE__MAX_RANGE_TYPE,
							oldMaxRangeType, maxRangeType));
			}
		}
		return maxRangeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetMaxRangeType() {
		return maxRangeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxRangeType(Constant newMaxRangeType) {
		Constant oldMaxRangeType = maxRangeType;
		maxRangeType = newMaxRangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__MAX_RANGE_TYPE,
					oldMaxRangeType, maxRangeType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getMinRangeType() {
		if (minRangeType != null && minRangeType.eIsProxy()) {
			InternalEObject oldMinRangeType = (InternalEObject) minRangeType;
			minRangeType = (Constant) eResolveProxy(oldMinRangeType);
			if (minRangeType != oldMinRangeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.SIMPLE__MIN_RANGE_TYPE,
							oldMinRangeType, minRangeType));
			}
		}
		return minRangeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetMinRangeType() {
		return minRangeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMinRangeType(Constant newMinRangeType) {
		Constant oldMinRangeType = minRangeType;
		minRangeType = newMinRangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__MIN_RANGE_TYPE,
					oldMinRangeType, minRangeType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getPrecisionType() {
		if (precisionType != null && precisionType.eIsProxy()) {
			InternalEObject oldPrecisionType = (InternalEObject) precisionType;
			precisionType = (Constant) eResolveProxy(oldPrecisionType);
			if (precisionType != oldPrecisionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.SIMPLE__PRECISION_TYPE,
							oldPrecisionType, precisionType));
			}
		}
		return precisionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetPrecisionType() {
		return precisionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrecisionType(Constant newPrecisionType) {
		Constant oldPrecisionType = precisionType;
		precisionType = newPrecisionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.SIMPLE__PRECISION_TYPE,
					oldPrecisionType, precisionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean nameIsUnique(DiagnosticChain chain, Map<?, ?> context) {
		String nameOfDataType = getName();
		if (nameOfDataType != null) {
			var edtLibrary = (edttype.Library) eContainer;
			EList<EDTDataType> dataTypes = edtLibrary.getDataTypes();
			for (EDTDataType edtDataType : dataTypes) {
				if (!Objects.equals(edtDataType, this) && Objects.equals(edtDataType.getName(), nameOfDataType)) {
					if (chain != null) {
						chain.add(new BasicDiagnostic(Diagnostic.ERROR, EDTTypeValidator.DIAGNOSTIC_SOURCE,
								EDTTypeValidator.EDT_DATA_TYPE__NAME_IS_UNIQUE,
								"There are multiple DataTypes with the name " + nameOfDataType,
								new Object[] { this, EDTTypePackage.eINSTANCE.getEDTDataType_Name() }));
					}
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTTypePackage.SIMPLE__NAME:
			return getName();
		case EDTTypePackage.SIMPLE__COMMENT:
			return getComment();
		case EDTTypePackage.SIMPLE__MAX_RANGE:
			return getMaxRange();
		case EDTTypePackage.SIMPLE__MIN_RANGE:
			return getMinRange();
		case EDTTypePackage.SIMPLE__PRECISION:
			return getPrecision();
		case EDTTypePackage.SIMPLE__UNIT:
			return getUnit();
		case EDTTypePackage.SIMPLE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case EDTTypePackage.SIMPLE__MAX_RANGE_TYPE:
			if (resolve)
				return getMaxRangeType();
			return basicGetMaxRangeType();
		case EDTTypePackage.SIMPLE__MIN_RANGE_TYPE:
			if (resolve)
				return getMinRangeType();
			return basicGetMinRangeType();
		case EDTTypePackage.SIMPLE__PRECISION_TYPE:
			if (resolve)
				return getPrecisionType();
			return basicGetPrecisionType();
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
		case EDTTypePackage.SIMPLE__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.SIMPLE__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.SIMPLE__MAX_RANGE:
			setMaxRange(newValue);
			return;
		case EDTTypePackage.SIMPLE__MIN_RANGE:
			setMinRange(newValue);
			return;
		case EDTTypePackage.SIMPLE__PRECISION:
			setPrecision(newValue);
			return;
		case EDTTypePackage.SIMPLE__UNIT:
			setUnit((String) newValue);
			return;
		case EDTTypePackage.SIMPLE__TYPE:
			setType((EDTDataType) newValue);
			return;
		case EDTTypePackage.SIMPLE__MAX_RANGE_TYPE:
			setMaxRangeType((Constant) newValue);
			return;
		case EDTTypePackage.SIMPLE__MIN_RANGE_TYPE:
			setMinRangeType((Constant) newValue);
			return;
		case EDTTypePackage.SIMPLE__PRECISION_TYPE:
			setPrecisionType((Constant) newValue);
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
		case EDTTypePackage.SIMPLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__MAX_RANGE:
			setMaxRange(MAX_RANGE_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__MIN_RANGE:
			setMinRange(MIN_RANGE_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case EDTTypePackage.SIMPLE__TYPE:
			setType((EDTDataType) null);
			return;
		case EDTTypePackage.SIMPLE__MAX_RANGE_TYPE:
			setMaxRangeType((Constant) null);
			return;
		case EDTTypePackage.SIMPLE__MIN_RANGE_TYPE:
			setMinRangeType((Constant) null);
			return;
		case EDTTypePackage.SIMPLE__PRECISION_TYPE:
			setPrecisionType((Constant) null);
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
		case EDTTypePackage.SIMPLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.SIMPLE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.SIMPLE__MAX_RANGE:
			return MAX_RANGE_EDEFAULT == null ? maxRange != null : !MAX_RANGE_EDEFAULT.equals(maxRange);
		case EDTTypePackage.SIMPLE__MIN_RANGE:
			return MIN_RANGE_EDEFAULT == null ? minRange != null : !MIN_RANGE_EDEFAULT.equals(minRange);
		case EDTTypePackage.SIMPLE__PRECISION:
			return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
		case EDTTypePackage.SIMPLE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case EDTTypePackage.SIMPLE__TYPE:
			return type != null;
		case EDTTypePackage.SIMPLE__MAX_RANGE_TYPE:
			return maxRangeType != null;
		case EDTTypePackage.SIMPLE__MIN_RANGE_TYPE:
			return minRangeType != null;
		case EDTTypePackage.SIMPLE__PRECISION_TYPE:
			return precisionType != null;
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
		result.append(", maxRange: ");
		result.append(maxRange);
		result.append(", minRange: ");
		result.append(minRange);
		result.append(", precision: ");
		result.append(precision);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getFullName() {
		return ((Library) this.eContainer).getName() + ":" + this.getName();
	}

	public boolean isComplete() {
		return (this.getType() != null && this.getName() != null && !this.getName().isBlank());
	}

} // SimpleImpl
