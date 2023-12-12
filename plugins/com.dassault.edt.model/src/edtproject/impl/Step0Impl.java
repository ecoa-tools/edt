/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import com.dassault.edt.log.EDTLog;

import edtproject.EDTProjectPackage;
import edtproject.Step0;
import edttype.BasicType;
import edttype.EDTDataType;
import edttype.Library;
import edttype.PredefinedType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Step0</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.Step0Impl#getFolderName <em>Folder Name</em>}</li>
 * <li>{@link edtproject.impl.Step0Impl#getTypes <em>Types</em>}</li>
 * <li>{@link edtproject.impl.Step0Impl#getBasicTypes <em>Basic Types</em>}</li>
 * <li>{@link edtproject.impl.Step0Impl#getEcoaPredefinedTypes <em>Ecoa
 * Predefined Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Step0Impl extends MinimalEObjectImpl.Container implements Step0 {
	/**
	 * The default value of the '{@link #getFolderName() <em>Folder Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected String folderName = FOLDER_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> types;

	/**
	 * The cached value of the '{@link #getBasicTypes() <em>Basic Types</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBasicTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicType> basicTypes;

	/**
	 * The cached value of the '{@link #getEcoaPredefinedTypes() <em>Ecoa Predefined
	 * Types</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEcoaPredefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PredefinedType> ecoaPredefinedTypes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Step0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEP0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFolderName() {
		return folderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFolderName(String newFolderName) {
		String oldFolderName = folderName;
		folderName = newFolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP0__FOLDER_NAME, oldFolderName,
					folderName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Library> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Library>(Library.class, this, EDTProjectPackage.STEP0__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BasicType> getBasicTypes() {
		if (basicTypes == null) {
			basicTypes = new EObjectContainmentEList<BasicType>(BasicType.class, this,
					EDTProjectPackage.STEP0__BASIC_TYPES);
		}
		return basicTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<PredefinedType> getEcoaPredefinedTypes() {
		if (ecoaPredefinedTypes == null) {
			ecoaPredefinedTypes = new EObjectContainmentEList<PredefinedType>(PredefinedType.class, this,
					EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES);
		}
		return ecoaPredefinedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.STEP0__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.STEP0__BASIC_TYPES:
			return ((InternalEList<?>) getBasicTypes()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES:
			return ((InternalEList<?>) getEcoaPredefinedTypes()).basicRemove(otherEnd, msgs);
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
		case EDTProjectPackage.STEP0__FOLDER_NAME:
			return getFolderName();
		case EDTProjectPackage.STEP0__TYPES:
			return getTypes();
		case EDTProjectPackage.STEP0__BASIC_TYPES:
			return getBasicTypes();
		case EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES:
			return getEcoaPredefinedTypes();
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
		case EDTProjectPackage.STEP0__FOLDER_NAME:
			setFolderName((String) newValue);
			return;
		case EDTProjectPackage.STEP0__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Library>) newValue);
			return;
		case EDTProjectPackage.STEP0__BASIC_TYPES:
			getBasicTypes().clear();
			getBasicTypes().addAll((Collection<? extends BasicType>) newValue);
			return;
		case EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES:
			getEcoaPredefinedTypes().clear();
			getEcoaPredefinedTypes().addAll((Collection<? extends PredefinedType>) newValue);
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
		case EDTProjectPackage.STEP0__FOLDER_NAME:
			setFolderName(FOLDER_NAME_EDEFAULT);
			return;
		case EDTProjectPackage.STEP0__TYPES:
			getTypes().clear();
			return;
		case EDTProjectPackage.STEP0__BASIC_TYPES:
			getBasicTypes().clear();
			return;
		case EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES:
			getEcoaPredefinedTypes().clear();
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
		case EDTProjectPackage.STEP0__FOLDER_NAME:
			return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
		case EDTProjectPackage.STEP0__TYPES:
			return types != null && !types.isEmpty();
		case EDTProjectPackage.STEP0__BASIC_TYPES:
			return basicTypes != null && !basicTypes.isEmpty();
		case EDTProjectPackage.STEP0__ECOA_PREDEFINED_TYPES:
			return ecoaPredefinedTypes != null && !ecoaPredefinedTypes.isEmpty();
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
		result.append(" (FolderName: ");
		result.append(folderName);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find type when ECOA:basicType or Library:type names are used
	 * 
	 * @param nameOfAssociatedLibrary : name of Library to find (split[0])
	 * @param nameOfType              : name of type to find (split[1])
	 * @param typeLibraries           : list of created Libraries
	 * @param basicTypes              : basicTypes
	 * @return EDTDataType corresponding to the name
	 */
	public EDTDataType findInAllLibraries(String nameOfAssociatedLibrary, String nameOfType) {

		if (nameOfAssociatedLibrary.equals("ECOA")) { /* BasicType */
			return findBasicTypeOrPredefined(nameOfType);
		}
		// Loop on all libraries to find the correct NameSpace
		Library findLibrary = this.findLibrary(nameOfAssociatedLibrary);
		if (findLibrary == null) {
			EDTLog.toConsole("No Library has the name :" + nameOfAssociatedLibrary);
			return null;
		}

		// Loop on all the dataType of the good
		EList<EDTDataType> dataTypes = findLibrary.getDataTypes();
		for (EDTDataType dataType : dataTypes) {
			if (nameOfType.equals(dataType.getName())) {
				return dataType;
			}
		}
		EDTLog.toConsole("No Type has the name " + nameOfType + " in the Library " + nameOfAssociatedLibrary);
		return null;
	}

	/**
	 * Find BasicType or predefinedTypes (ECOA namespace)
	 * 
	 * @param nameOfAssociatedType : name to find
	 * @return BasicType corresponding to the name
	 */
	public EDTDataType findBasicTypeOrPredefined(String nameOfAssociatedType) {
		EDTDataType findBasicType = this.findBasicType(nameOfAssociatedType);
		if (findBasicType != null) {
			return findBasicType;
		}
		for (PredefinedType predefinedType : this.getEcoaPredefinedTypes()) {
			if (nameOfAssociatedType.equals(predefinedType.getName())) {
				return predefinedType;
			}
		}
		EDTLog.toConsole("There is no BasicType or predefined type with the name " + nameOfAssociatedType
				+ ". Verify that the name is correct.");
		return null;
	}

	/**
	 * Find BasicType or predefinedTypes
	 * 
	 * @param nameOfAssociatedType : name to find
	 * @return BasicType corresponding to the name
	 */
	public EDTDataType findBasicType(String nameOfAssociatedType) {
		for (BasicType basicType : this.getBasicTypes()) {
			if (nameOfAssociatedType.equals(basicType.getName())) {
				return basicType;
			}
		}
		return null;
	}

	public Library findLibrary(String libraryName) {
		for (Library library : this.getTypes()) {
			if (Objects.equals(library.getName(), libraryName)) {
				return library;
			}
		}
		return null;
	}

} // Step0Impl
