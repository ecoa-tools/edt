/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

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
import edtimplementation.OperationInheritingFromSD;
import edtimplementation.OperationLink;
import edtimplementation.VersionedDataServiceInstance;
import edtinterface.OperationType;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Versioned Data Service Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.VersionedDataServiceInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.VersionedDataServiceInstanceImpl#getSDOperationRef <em>SD Operation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedDataServiceInstanceImpl extends MinimalEObjectImpl.Container
		implements VersionedDataServiceInstance {
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
	 * The cached value of the '{@link #getSDOperationRef() <em>SD Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDOperationRef()
	 * @generated
	 * @ordered
	 */
	protected OperationType sdOperationRef;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedDataServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.VERSIONED_DATA_SERVICE_INSTANCE;
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
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getSDOperationRef() {
		if (sdOperationRef != null && sdOperationRef.eIsProxy()) {
			InternalEObject oldSDOperationRef = (InternalEObject)sdOperationRef;
			sdOperationRef = (OperationType)eResolveProxy(oldSDOperationRef);
			if (sdOperationRef != oldSDOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF, oldSDOperationRef, sdOperationRef));
			}
		}
		return sdOperationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType basicGetSDOperationRef() {
		return sdOperationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDOperationRef(OperationType newSDOperationRef) {
		OperationType oldSDOperationRef = sdOperationRef;
		sdOperationRef = newSDOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF, oldSDOperationRef, sdOperationRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__NAME:
				return getName();
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF:
				if (resolve) return getSDOperationRef();
				return basicGetSDOperationRef();
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
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF:
				setSDOperationRef((OperationType)newValue);
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
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF:
				setSDOperationRef((OperationType)null);
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
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF:
				return sdOperationRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationInheritingFromSD.class) {
			switch (derivedFeatureID) {
				case EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF: return EdtimplementationPackage.OPERATION_INHERITING_FROM_SD__SD_OPERATION_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationInheritingFromSD.class) {
			switch (baseFeatureID) {
				case EdtimplementationPackage.OPERATION_INHERITING_FROM_SD__SD_OPERATION_REF: return EdtimplementationPackage.VERSIONED_DATA_SERVICE_INSTANCE__SD_OPERATION_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

	@Override
	public String getSimplifiedClassName() {
		return "Versioned Data";
	}

	@Override
	public EList<OperationLink> findOperationLink() {
		Steps steps = Steps.findStepsContainer(this);
		EList<OperationLink> operationLink = new BasicEList<>();
		if (steps != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, steps);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationLink component) {
					operationLink.add(component);
				}
			}
		}
		return operationLink;
	}

} // VersionedDataServiceInstanceImpl
