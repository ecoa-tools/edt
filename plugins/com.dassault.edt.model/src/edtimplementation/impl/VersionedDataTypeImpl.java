/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.OperationInstance;
import edtimplementation.VersionedDataType;
import edtproject.Steps;
import edttype.EDTDataType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Versioned Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.VersionedDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.VersionedDataTypeImpl#getMaxVersions <em>Max Versions</em>}</li>
 *   <li>{@link edtimplementation.impl.VersionedDataTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedDataTypeImpl extends MinimalEObjectImpl.Container implements VersionedDataType {
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
	 * The default value of the '{@link #getMaxVersions() <em>Max Versions</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxVersions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_VERSIONS_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMaxVersions() <em>Max Versions</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxVersions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxVersions = MAX_VERSIONS_EDEFAULT;

	/**
	 * This is true if the Max Versions attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxVersionsESet;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.VERSIONED_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;

		EList<OperationInstance> associatedDataInstance = findAssociatedDataInstance();
		for (OperationInstance operationInstance : associatedDataInstance) {
			operationInstance.setName(newName);
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_TYPE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxVersions() {
		return maxVersions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxVersions(BigInteger newMaxVersions) {
		BigInteger oldMaxVersions = maxVersions;
		maxVersions = newMaxVersions;
		boolean oldMaxVersionsESet = maxVersionsESet;
		maxVersionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS, oldMaxVersions, maxVersions, !oldMaxVersionsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxVersions() {
		BigInteger oldMaxVersions = maxVersions;
		boolean oldMaxVersionsESet = maxVersionsESet;
		maxVersions = MAX_VERSIONS_EDEFAULT;
		maxVersionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS, oldMaxVersions, MAX_VERSIONS_EDEFAULT, oldMaxVersionsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxVersions() {
		return maxVersionsESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDTDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EDTDataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDTDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EDTDataType newType) {
		EDTDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__NAME:
				return getName();
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS:
				return getMaxVersions();
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS:
				setMaxVersions((BigInteger)newValue);
				return;
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE:
				setType((EDTDataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS:
				unsetMaxVersions();
				return;
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE:
				setType((EDTDataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__MAX_VERSIONS:
				return isSetMaxVersions();
			case EdtimplementationPackage.VERSIONED_DATA_TYPE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", maxVersions: ");
		if (maxVersionsESet) result.append(maxVersions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/**
	 * Find all DataInstance associated to the DataType
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<OperationInstance> findAssociatedDataInstance() {
		EList<OperationInstance> dataInstanceAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationInstance operationInstance) {
					dataInstanceAssociated.add(operationInstance);
				}
			}
		}
		return dataInstanceAssociated;
	}

	/**
	 * 
	 * @return true if no missing attributes
	 */
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getType() != null);
	}

} // VersionedDataTypeImpl
