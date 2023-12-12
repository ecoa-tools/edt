/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.dassault.edt.log.EDTLog;

import edttype.EDTDataType;
import edttype.EDTTypePackage;
import edttype.Library;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Library</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edttype.impl.LibraryImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link edttype.impl.LibraryImpl#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link edttype.impl.LibraryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDTDataType> dataTypes;

	/**
	 * The cached value of the '{@link #getUsedLibraries() <em>Used Libraries</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> usedLibraries;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public EList<EDTDataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<EDTDataType>(EDTDataType.class, this,
					EDTTypePackage.LIBRARY__DATA_TYPES) {
				@Override
				public void addUnique(EDTDataType object) {
					for (EDTDataType edtDataType : dataTypes) {
						if (Objects.equals(edtDataType.getName(), object.getName())) {
							EDTLog.toConsole(
									"There can not be multiple DataType with the name :" + edtDataType.getName());
//							return;
						}
					}
					super.addUnique(object);
				}
			};
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Library> getUsedLibraries() {
		if (usedLibraries == null) {
			usedLibraries = new EObjectResolvingEList<Library>(Library.class, this, EDTTypePackage.LIBRARY__USED_LIBRARIES);
		}
		return usedLibraries;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDTTypePackage.LIBRARY__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTTypePackage.LIBRARY__DATA_TYPES:
				return getDataTypes();
			case EDTTypePackage.LIBRARY__USED_LIBRARIES:
				return getUsedLibraries();
			case EDTTypePackage.LIBRARY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EDTTypePackage.LIBRARY__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends EDTDataType>)newValue);
				return;
			case EDTTypePackage.LIBRARY__USED_LIBRARIES:
				getUsedLibraries().clear();
				getUsedLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case EDTTypePackage.LIBRARY__NAME:
				setName((String)newValue);
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
			case EDTTypePackage.LIBRARY__DATA_TYPES:
				getDataTypes().clear();
				return;
			case EDTTypePackage.LIBRARY__USED_LIBRARIES:
				getUsedLibraries().clear();
				return;
			case EDTTypePackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
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
			case EDTTypePackage.LIBRARY__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case EDTTypePackage.LIBRARY__USED_LIBRARIES:
				return usedLibraries != null && !usedLibraries.isEmpty();
			case EDTTypePackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // LibraryImpl
