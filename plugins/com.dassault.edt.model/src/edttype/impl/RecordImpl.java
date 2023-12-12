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
import edttype.util.EDTTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EDT
 * Record</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.RecordImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.RecordImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edttype.impl.RecordImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordImpl extends MinimalEObjectImpl.Container implements edttype.Record {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.RECORD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.RECORD__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, EDTTypePackage.RECORD__FIELD);
		}
		return field;
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
		case EDTTypePackage.RECORD__FIELD:
			return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
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
		case EDTTypePackage.RECORD__NAME:
			return getName();
		case EDTTypePackage.RECORD__COMMENT:
			return getComment();
		case EDTTypePackage.RECORD__FIELD:
			return getField();
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
		case EDTTypePackage.RECORD__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.RECORD__COMMENT:
			setComment((String) newValue);
			return;
		case EDTTypePackage.RECORD__FIELD:
			getField().clear();
			getField().addAll((Collection<? extends Field>) newValue);
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
		case EDTTypePackage.RECORD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.RECORD__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTTypePackage.RECORD__FIELD:
			getField().clear();
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
		case EDTTypePackage.RECORD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.RECORD__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTTypePackage.RECORD__FIELD:
			return field != null && !field.isEmpty();
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
		return (this.getName() != null && !this.getName().isBlank() && !this.getField().isEmpty());
	}

} // RecordImpl
