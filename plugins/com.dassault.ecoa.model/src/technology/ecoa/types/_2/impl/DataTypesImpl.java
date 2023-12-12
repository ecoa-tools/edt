/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.types._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.types._2.Array;
import technology.ecoa.types._2.Constant;
import technology.ecoa.types._2.DataTypes;
import technology.ecoa.types._2.FixedArray;
import technology.ecoa.types._2.Simple;
import technology.ecoa.types._2.VariantRecord;
import technology.ecoa.types._2.typPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getVariantRecord <em>Variant Record</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getArray <em>Array</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getFixedArray <em>Fixed Array</em>}</li>
 *   <li>{@link technology.ecoa.types._2.impl.DataTypesImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypesImpl extends MinimalEObjectImpl.Container implements DataTypes {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typPackage.Literals.DATA_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, typPackage.DATA_TYPES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Simple> getSimple() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__SIMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<technology.ecoa.types._2.Record> getRecord() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__RECORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__CONSTANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariantRecord> getVariantRecord() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__VARIANT_RECORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getArray() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__ARRAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedArray> getFixedArray() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__FIXED_ARRAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<technology.ecoa.types._2.Enum> getEnum() {
		return getGroup().list(typPackage.Literals.DATA_TYPES__ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case typPackage.DATA_TYPES__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__SIMPLE:
				return ((InternalEList<?>)getSimple()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__VARIANT_RECORD:
				return ((InternalEList<?>)getVariantRecord()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__FIXED_ARRAY:
				return ((InternalEList<?>)getFixedArray()).basicRemove(otherEnd, msgs);
			case typPackage.DATA_TYPES__ENUM:
				return ((InternalEList<?>)getEnum()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typPackage.DATA_TYPES__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case typPackage.DATA_TYPES__SIMPLE:
				return getSimple();
			case typPackage.DATA_TYPES__RECORD:
				return getRecord();
			case typPackage.DATA_TYPES__CONSTANT:
				return getConstant();
			case typPackage.DATA_TYPES__VARIANT_RECORD:
				return getVariantRecord();
			case typPackage.DATA_TYPES__ARRAY:
				return getArray();
			case typPackage.DATA_TYPES__FIXED_ARRAY:
				return getFixedArray();
			case typPackage.DATA_TYPES__ENUM:
				return getEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case typPackage.DATA_TYPES__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case typPackage.DATA_TYPES__SIMPLE:
				getSimple().clear();
				getSimple().addAll((Collection<? extends Simple>)newValue);
				return;
			case typPackage.DATA_TYPES__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends technology.ecoa.types._2.Record>)newValue);
				return;
			case typPackage.DATA_TYPES__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case typPackage.DATA_TYPES__VARIANT_RECORD:
				getVariantRecord().clear();
				getVariantRecord().addAll((Collection<? extends VariantRecord>)newValue);
				return;
			case typPackage.DATA_TYPES__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Array>)newValue);
				return;
			case typPackage.DATA_TYPES__FIXED_ARRAY:
				getFixedArray().clear();
				getFixedArray().addAll((Collection<? extends FixedArray>)newValue);
				return;
			case typPackage.DATA_TYPES__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends technology.ecoa.types._2.Enum>)newValue);
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
			case typPackage.DATA_TYPES__GROUP:
				getGroup().clear();
				return;
			case typPackage.DATA_TYPES__SIMPLE:
				getSimple().clear();
				return;
			case typPackage.DATA_TYPES__RECORD:
				getRecord().clear();
				return;
			case typPackage.DATA_TYPES__CONSTANT:
				getConstant().clear();
				return;
			case typPackage.DATA_TYPES__VARIANT_RECORD:
				getVariantRecord().clear();
				return;
			case typPackage.DATA_TYPES__ARRAY:
				getArray().clear();
				return;
			case typPackage.DATA_TYPES__FIXED_ARRAY:
				getFixedArray().clear();
				return;
			case typPackage.DATA_TYPES__ENUM:
				getEnum().clear();
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
			case typPackage.DATA_TYPES__GROUP:
				return group != null && !group.isEmpty();
			case typPackage.DATA_TYPES__SIMPLE:
				return !getSimple().isEmpty();
			case typPackage.DATA_TYPES__RECORD:
				return !getRecord().isEmpty();
			case typPackage.DATA_TYPES__CONSTANT:
				return !getConstant().isEmpty();
			case typPackage.DATA_TYPES__VARIANT_RECORD:
				return !getVariantRecord().isEmpty();
			case typPackage.DATA_TYPES__ARRAY:
				return !getArray().isEmpty();
			case typPackage.DATA_TYPES__FIXED_ARRAY:
				return !getFixedArray().isEmpty();
			case typPackage.DATA_TYPES__ENUM:
				return !getEnum().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //DataTypesImpl
