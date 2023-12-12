/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

import edtproject.CompositeReference;
import edtproject.EDTProjectPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Composite Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.CompositeReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edtproject.impl.CompositeReferenceImpl#getPromote <em>Promote</em>}</li>
 *   <li>{@link edtproject.impl.CompositeReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeReferenceImpl extends ContractImpl implements CompositeReference {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity._01;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

	/**
	 * The default value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> PROMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected List<String> promote = PROMOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPOSITE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMultiplicity() {
		Multiplicity oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPromote() {
		return promote;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromote(List<String> newPromote) {
		List<String> oldPromote = promote;
		promote = newPromote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE, oldPromote, promote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPOSITE_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY:
				return getMultiplicity();
			case EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE:
				return getPromote();
			case EDTProjectPackage.COMPOSITE_REFERENCE__NAME:
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
			case EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE:
				setPromote((List<String>)newValue);
				return;
			case EDTProjectPackage.COMPOSITE_REFERENCE__NAME:
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
			case EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE:
				setPromote(PROMOTE_EDEFAULT);
				return;
			case EDTProjectPackage.COMPOSITE_REFERENCE__NAME:
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
			case EDTProjectPackage.COMPOSITE_REFERENCE__MULTIPLICITY:
				return isSetMultiplicity();
			case EDTProjectPackage.COMPOSITE_REFERENCE__PROMOTE:
				return PROMOTE_EDEFAULT == null ? promote != null : !PROMOTE_EDEFAULT.equals(promote);
			case EDTProjectPackage.COMPOSITE_REFERENCE__NAME:
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
		result.append(" (multiplicity: ");
		if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
		result.append(", promote: ");
		result.append(promote);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // CompositeReferenceImpl
