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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edttype.BasicType;
import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Field;
import edttype.Library;
import edttype.Union;
import edttype.VariantRecord;
import edttype.util.EDTTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Variant Record</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.VariantRecordImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.VariantRecordImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.VariantRecordImpl#getField <em>Field</em>}</li>
 * <li>{@link edttype.impl.VariantRecordImpl#getUnion <em>Union</em>}</li>
 * <li>{@link edttype.impl.VariantRecordImpl#getSelectName <em>Select
 * Name</em>}</li>
 * <li>{@link edttype.impl.VariantRecordImpl#getSelectType <em>Select
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantRecordImpl extends MinimalEObjectImpl.Container implements VariantRecord {
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
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<Union> union;

	/**
	 * The default value of the '{@link #getSelectName() <em>Select Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSelectName()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectName() <em>Select Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSelectName()
	 * @generated
	 * @ordered
	 */
	protected String selectName = SELECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectType() <em>Select Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSelectType()
	 * @generated
	 * @ordered
	 */
	protected EDTDataType selectType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariantRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.VARIANT_RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.VARIANT_RECORD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.VARIANT_RECORD__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, EDTTypePackage.VARIANT_RECORD__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Union> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<Union>(Union.class, this, EDTTypePackage.VARIANT_RECORD__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSelectName() {
		return selectName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSelectName(String newSelectName) {
		String oldSelectName = selectName;
		selectName = newSelectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.VARIANT_RECORD__SELECT_NAME,
					oldSelectName, selectName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDTDataType getSelectType() {
		if (selectType != null && selectType.eIsProxy()) {
			InternalEObject oldSelectType = (InternalEObject) selectType;
			selectType = (EDTDataType) eResolveProxy(oldSelectType);
			if (selectType != oldSelectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTTypePackage.VARIANT_RECORD__SELECT_TYPE, oldSelectType, selectType));
			}
		}
		return selectType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDTDataType basicGetSelectType() {
		return selectType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSelectType(EDTDataType newSelectType) {
		EDTDataType oldSelectType = selectType;
		selectType = newSelectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.VARIANT_RECORD__SELECT_TYPE,
					oldSelectType, selectType));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTTypePackage.VARIANT_RECORD__FIELD:
			return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
		case EDTTypePackage.VARIANT_RECORD__UNION:
			return ((InternalEList<?>) getUnion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTTypePackage.VARIANT_RECORD__NAME:
			return getName();
		case EDTTypePackage.VARIANT_RECORD__COMMENT:
			return getComment();
		case EDTTypePackage.VARIANT_RECORD__FIELD:
			return getField();
		case EDTTypePackage.VARIANT_RECORD__UNION:
			return getUnion();
		case EDTTypePackage.VARIANT_RECORD__SELECT_NAME:
			return getSelectName();
		case EDTTypePackage.VARIANT_RECORD__SELECT_TYPE:
			if (resolve)
				return getSelectType();
			return basicGetSelectType();
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
		case EDTTypePackage.VARIANT_RECORD__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.VARIANT_RECORD__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.VARIANT_RECORD__FIELD:
			getField().clear();
			getField().addAll((Collection<? extends Field>) newValue);
			return;
		case EDTTypePackage.VARIANT_RECORD__UNION:
			getUnion().clear();
			getUnion().addAll((Collection<? extends Union>) newValue);
			return;
		case EDTTypePackage.VARIANT_RECORD__SELECT_NAME:
			setSelectName((String) newValue);
			return;
		case EDTTypePackage.VARIANT_RECORD__SELECT_TYPE:
			setSelectType((EDTDataType) newValue);
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
		case EDTTypePackage.VARIANT_RECORD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.VARIANT_RECORD__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.VARIANT_RECORD__FIELD:
			getField().clear();
			return;
		case EDTTypePackage.VARIANT_RECORD__UNION:
			getUnion().clear();
			return;
		case EDTTypePackage.VARIANT_RECORD__SELECT_NAME:
			setSelectName(SELECT_NAME_EDEFAULT);
			return;
		case EDTTypePackage.VARIANT_RECORD__SELECT_TYPE:
			setSelectType((EDTDataType) null);
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
		case EDTTypePackage.VARIANT_RECORD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.VARIANT_RECORD__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.VARIANT_RECORD__FIELD:
			return field != null && !field.isEmpty();
		case EDTTypePackage.VARIANT_RECORD__UNION:
			return union != null && !union.isEmpty();
		case EDTTypePackage.VARIANT_RECORD__SELECT_NAME:
			return SELECT_NAME_EDEFAULT == null ? selectName != null : !SELECT_NAME_EDEFAULT.equals(selectName);
		case EDTTypePackage.VARIANT_RECORD__SELECT_TYPE:
			return selectType != null;
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
		result.append(", selectName: ");
		result.append(selectName);
		result.append(')');
		return result.toString();
	}

	/**
	 * Created to facilitate verification
	 * 
	 * Returns always null
	 * 
	 * @generated NOT
	 */
	@Override
	public BasicType getBasicType() {
		return null;
	}

	@Override
	public String getFullName() {
		return ((Library) this.eContainer).getName() + ":" + this.getName();
	}

	public boolean isComplete() {
		return (this.getSelectName() != null && !this.getSelectName().isBlank() && this.getSelectType() != null
				&& this.getName() != null && !this.getName().isBlank() && !this.getUnion().isEmpty());
	}

} // VariantRecordImpl
