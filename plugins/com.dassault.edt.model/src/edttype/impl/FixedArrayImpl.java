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

import edttype.Array;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Enum;
import edttype.FixedArray;
import edttype.Library;
import edttype.Simple;
import edttype.util.EDTTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Fixed Array</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.FixedArrayImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.FixedArrayImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.FixedArrayImpl#getMaxNumber <em>Max Number</em>}</li>
 * <li>{@link edttype.impl.FixedArrayImpl#getItemType <em>Item Type</em>}</li>
 * <li>{@link edttype.impl.FixedArrayImpl#getMaxNumberType <em>Max Number
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedArrayImpl extends MinimalEObjectImpl.Container implements FixedArray {
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
	 * The cached value of the '{@link #getMaxNumberType() <em>Max Number
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxNumberType()
	 * @generated
	 * @ordered
	 */
	protected Constant maxNumberType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FixedArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.FIXED_ARRAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.FIXED_ARRAY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.FIXED_ARRAY__COMMENT, oldComment,
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
	 * @generated NOT
	 */
	@Override
	public void setMaxNumber(String newMaxNumber) {
		String oldMaxNumber = maxNumber;
		if (newMaxNumber != null && this.eContainer() != null) {
			if (newMaxNumber.contains("%")) {
				Constant constantType = EDTDataType.findConstantValue(newMaxNumber, (Library) this.eContainer());
				if (constantType == null) {
					EDTLog.toPopUpAndConsole(
							"ERROR : there is no Constant with the name "
									+ newMaxNumber.substring(1, newMaxNumber.length() - 1),
							"The MaxNumber has to be a Constant");
					return;
				}
				setMaxNumberType(constantType);
			} else {
				setMaxNumberType(null);
			}
		}
		maxNumber = newMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.FIXED_ARRAY__MAX_NUMBER, oldMaxNumber,
					maxNumber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.FIXED_ARRAY__ITEM_TYPE,
							oldItemType, itemType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.FIXED_ARRAY__ITEM_TYPE, oldItemType,
					itemType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getMaxNumberType() {
		if (maxNumberType != null && maxNumberType.eIsProxy()) {
			InternalEObject oldMaxNumberType = (InternalEObject) maxNumberType;
			maxNumberType = (Constant) eResolveProxy(oldMaxNumberType);
			if (maxNumberType != oldMaxNumberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE, oldMaxNumberType, maxNumberType));
			}
		}
		return maxNumberType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetMaxNumberType() {
		return maxNumberType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxNumberType(Constant newMaxNumberType) {
		Constant oldMaxNumberType = maxNumberType;
		maxNumberType = newMaxNumberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE,
					oldMaxNumberType, maxNumberType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean nameIsUnique(DiagnosticChain chain, Map<?, ?> context) {
		String nameOfDataType = getName();
		if (nameOfDataType != null) {
			edttype.Library edtLibrary = (edttype.Library) eContainer;
			EList<EDTDataType> dataTypes = edtLibrary.getDataTypes();
			for (EDTDataType edtDataType : dataTypes) {
				if (!edtDataType.equals(this) && Objects.equals(edtDataType.getName(), nameOfDataType)) {
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
		case EDTTypePackage.FIXED_ARRAY__NAME:
			return getName();
		case EDTTypePackage.FIXED_ARRAY__COMMENT:
			return getComment();
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER:
			return getMaxNumber();
		case EDTTypePackage.FIXED_ARRAY__ITEM_TYPE:
			if (resolve)
				return getItemType();
			return basicGetItemType();
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE:
			if (resolve)
				return getMaxNumberType();
			return basicGetMaxNumberType();
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
		case EDTTypePackage.FIXED_ARRAY__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.FIXED_ARRAY__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER:
			setMaxNumber((String) newValue);
			return;
		case EDTTypePackage.FIXED_ARRAY__ITEM_TYPE:
			setItemType((EDTDataType) newValue);
			return;
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE:
			setMaxNumberType((Constant) newValue);
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
		case EDTTypePackage.FIXED_ARRAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.FIXED_ARRAY__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER:
			setMaxNumber(MAX_NUMBER_EDEFAULT);
			return;
		case EDTTypePackage.FIXED_ARRAY__ITEM_TYPE:
			setItemType((EDTDataType) null);
			return;
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE:
			setMaxNumberType((Constant) null);
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
		case EDTTypePackage.FIXED_ARRAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.FIXED_ARRAY__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER:
			return MAX_NUMBER_EDEFAULT == null ? maxNumber != null : !MAX_NUMBER_EDEFAULT.equals(maxNumber);
		case EDTTypePackage.FIXED_ARRAY__ITEM_TYPE:
			return itemType != null;
		case EDTTypePackage.FIXED_ARRAY__MAX_NUMBER_TYPE:
			return maxNumberType != null;
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public BasicType getBasicType() {
		if (itemType instanceof BasicType) {
			return (BasicType) itemType;
		} else if (itemType instanceof Array) {
			return ((Array) itemType).getBasicType();
		} else if (itemType instanceof Constant) {
			return ((Constant) itemType).getBasicType();
		} else if (itemType instanceof Enum) {
			return ((Enum) itemType).getBasicType();
		} else if (itemType instanceof FixedArray) {
			return ((FixedArray) itemType).getBasicType();
		} else if (itemType instanceof Simple) {
			return ((Simple) itemType).getBasicType();
		} else {
			EDTLog.toConsole("Record and VariantRecords are not accepted as type for FixedArray");
			return null;
		}
	}

	@Override
	public String getFullName() {
		return ((Library) this.eContainer).getName() + ":" + this.getName();
	}

	public boolean isComplete() {
		return (this.getItemType() != null && !this.getName().isBlank() && this.getName() != null
				&& this.getMaxNumber() != null);
	}

} // FixedArrayImpl
