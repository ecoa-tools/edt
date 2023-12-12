/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentReference;
import edtproject.EDTProjectPackage;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Definition Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.ComponentDefinitionReferenceImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link edtproject.impl.ComponentDefinitionReferenceImpl#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionReferenceImpl extends ContractImpl implements ComponentDefinitionReference {
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
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity._11;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT_DEFINITION_REFERENCE;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		EList<EObject> associatedDerivedReference = findAssociatedDerivedReference();
		for (EObject eObject : associatedDerivedReference) {
			if (eObject instanceof ComponentReference componentReference) {
				componentReference.setName(newName);
			} else if (eObject instanceof ReferenceOfLinkedComponentDefinition ciRef) {
				ciRef.setName(newName);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME, oldName, name));
	}

	/**
	 * Find all derivedReference associated to the ComponentDefinitionReference
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<EObject> findAssociatedDerivedReference() {
		EList<EObject> derivedReferenceAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ComponentReference
						|| crossReference.getEObject() instanceof ReferenceOfLinkedComponentDefinition) {
					derivedReferenceAssociated.add(crossReference.getEObject());
				}
			}
		}
		return derivedReferenceAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity,
					!oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetMultiplicity() {
		Multiplicity oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY, oldMultiplicity,
					MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME:
			return getName();
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY:
			return getMultiplicity();
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
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME:
			setName((String) newValue);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY:
			setMultiplicity((Multiplicity) newValue);
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
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY:
			unsetMultiplicity();
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
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE__MULTIPLICITY:
			return isSetMultiplicity();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", multiplicity: ");
		if (multiplicityESet)
			result.append(multiplicity);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getSyntax() != null);
	}

} // ComponentDefinitionReferenceImpl
