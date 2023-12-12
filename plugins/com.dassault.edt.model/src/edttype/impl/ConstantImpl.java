/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.dassault.edt.log.EDTLog;

import edtproject.Steps;
import edttype.BasicType;
import edttype.Constant;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Library;
import edttype.Simple;
import edttype.util.EDTTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Constant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.ConstantImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.ConstantImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.ConstantImpl#getValue <em>Value</em>}</li>
 * <li>{@link edttype.impl.ConstantImpl#getType <em>Type</em>}</li>
 * <li>{@link edttype.impl.ConstantImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantImpl extends MinimalEObjectImpl.Container implements Constant {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected Constant valueType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.CONSTANT;
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
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (this.eContainer() != null && this.eContainer().eContainer() != null
				&& this.eContainer().eContainer().eContainer() != null) {
			findAssociatedObjectsAndRenameReference(newName);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.CONSTANT__NAME, oldName, name));
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public void findAssociatedObjectsAndRenameReference(String newName) {
		String refName = "%" + newName + "%";
		Steps findStepsContainer = Steps.findStepsContainer(this);

		Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
		for (Setting crossReference : crossReferences) {
			if (crossReference.getEObject() instanceof edttype.Array array) {
				array.setMaxNumber(refName);

			} else if (crossReference.getEObject() instanceof edttype.Constant constant) {
				constant.setValue(refName);

			} else if (crossReference.getEObject() instanceof edttype.EnumValue enumValue) {
				enumValue.setValnum(refName);

			} else if (crossReference.getEObject() instanceof edttype.FixedArray fixedArray) {
				fixedArray.setMaxNumber(refName);

			} else if (crossReference.getEObject() instanceof edttype.Simple simple) {

				if (Objects.equals(simple.getMaxRangeType(), this)) {
					simple.setMaxRange(refName);
				} else if (Objects.equals(simple.getMinRangeType(), this)) {
					simple.setMinRange(refName);
				} else if (Objects.equals(simple.getPrecisionType(), this)) {
					simple.setPrecision(refName);
				}
			}
		}

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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.CONSTANT__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setValue(Object newValue) {
		Object oldValue = value;
		if (newValue instanceof String valueToChange && this.eContainer() != null) {
			if (valueToChange.contains("%")) {
				Constant constantType = EDTDataType.findConstantValue(valueToChange, (Library) this.eContainer());
				if (constantType == null) {
					EDTLog.toPopUpAndConsole(
							"ERROR : there is no Constant with the name "
									+ valueToChange.substring(1, valueToChange.length() - 1),
							"The Value has to be a Constant");
					return;
				}
				setValueType(constantType);
			}
		} else {
			setValueType(null);
		}
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.CONSTANT__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.CONSTANT__TYPE, oldType,
							type));
			}
		}
		return type;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(EDTDataType newType) {
		EDTDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.CONSTANT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Constant getValueType() {
		if (valueType != null && valueType.eIsProxy()) {
			InternalEObject oldValueType = (InternalEObject) valueType;
			valueType = (Constant) eResolveProxy(oldValueType);
			if (valueType != oldValueType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTTypePackage.CONSTANT__VALUE_TYPE,
							oldValueType, valueType));
			}
		}
		return valueType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constant basicGetValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValueType(Constant newValueType) {
		Constant oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.CONSTANT__VALUE_TYPE, oldValueType,
					valueType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean nameIsUnique(DiagnosticChain chain, Map<?, ?> context) {
		String nameOfDataType = getName();
		if (nameOfDataType != null) {
			edttype.Library edtLibrary = (Library) eContainer;
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
		case EDTTypePackage.CONSTANT__NAME:
			return getName();
		case EDTTypePackage.CONSTANT__COMMENT:
			return getComment();
		case EDTTypePackage.CONSTANT__VALUE:
			return getValue();
		case EDTTypePackage.CONSTANT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case EDTTypePackage.CONSTANT__VALUE_TYPE:
			if (resolve)
				return getValueType();
			return basicGetValueType();
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
		case EDTTypePackage.CONSTANT__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.CONSTANT__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.CONSTANT__VALUE:
			setValue(newValue);
			return;
		case EDTTypePackage.CONSTANT__TYPE:
			setType((EDTDataType) newValue);
			return;
		case EDTTypePackage.CONSTANT__VALUE_TYPE:
			setValueType((Constant) newValue);
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
		case EDTTypePackage.CONSTANT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.CONSTANT__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.CONSTANT__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case EDTTypePackage.CONSTANT__TYPE:
			setType((EDTDataType) null);
			return;
		case EDTTypePackage.CONSTANT__VALUE_TYPE:
			setValueType((Constant) null);
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
		case EDTTypePackage.CONSTANT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.CONSTANT__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.CONSTANT__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case EDTTypePackage.CONSTANT__TYPE:
			return type != null;
		case EDTTypePackage.CONSTANT__VALUE_TYPE:
			return valueType != null;
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
		result.append(", value: ");
		result.append(value);
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
		if (type instanceof BasicType) {
			return (BasicType) type;
		} else if (type instanceof Simple) {
			return ((Simple) type).getBasicType();
		} else {
			EDTLog.toConsole("Only BasicType and Simple are accepted as type for Constant");
			return null;
		}
	}

	@Override
	public String getFullName() {
		return ((Library) this.eContainer).getName() + ":" + this.getName();
	}

	public boolean isComplete() {
		return (this.getType() != null && this.getName() != null && !this.getName().isBlank()
				&& this.getValue() != null);
	}

} // ConstantImpl
