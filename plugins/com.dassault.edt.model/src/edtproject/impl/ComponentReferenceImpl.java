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
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

import edtproject.Component;
import edtproject.ComponentDefinitionReference;
import edtproject.ComponentReference;
import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.ComponentReferenceImpl#getComponentDefinitionReference <em>Component Definition Reference</em>}</li>
 *   <li>{@link edtproject.impl.ComponentReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edtproject.impl.ComponentReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentReferenceImpl extends MinimalEObjectImpl.Container implements ComponentReference {
	/**
	 * The cached value of the '{@link #getComponentDefinitionReference() <em>Component Definition Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionReference componentDefinitionReference;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity._11;

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
	protected ComponentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionReference getComponentDefinitionReference() {
		if (componentDefinitionReference != null && componentDefinitionReference.eIsProxy()) {
			InternalEObject oldComponentDefinitionReference = (InternalEObject)componentDefinitionReference;
			componentDefinitionReference = (ComponentDefinitionReference)eResolveProxy(oldComponentDefinitionReference);
			if (componentDefinitionReference != oldComponentDefinitionReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE, oldComponentDefinitionReference, componentDefinitionReference));
			}
		}
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference basicGetComponentDefinitionReference() {
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionReference(ComponentDefinitionReference newComponentDefinitionReference) {
		ComponentDefinitionReference oldComponentDefinitionReference = componentDefinitionReference;
		componentDefinitionReference = newComponentDefinitionReference;

		/*
		 * The ComponentDefinitionReference property shall become null, only if it is
		 * removed (Sirius deletes the crossreference before, removing from the list
		 */
		if (componentDefinitionReference != null) {
			name = componentDefinitionReference.getName();
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE,
					oldComponentDefinitionReference, componentDefinitionReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				if (resolve) return getComponentDefinitionReference();
				return basicGetComponentDefinitionReference();
			case EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY:
				return getMultiplicity();
			case EDTProjectPackage.COMPONENT_REFERENCE__NAME:
				return getName();
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
			case EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				setComponentDefinitionReference((ComponentDefinitionReference)newValue);
				return;
			case EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case EDTProjectPackage.COMPONENT_REFERENCE__NAME:
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
			case EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				setComponentDefinitionReference((ComponentDefinitionReference)null);
				return;
			case EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case EDTProjectPackage.COMPONENT_REFERENCE__NAME:
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
			case EDTProjectPackage.COMPONENT_REFERENCE__COMPONENT_DEFINITION_REFERENCE:
				return componentDefinitionReference != null;
			case EDTProjectPackage.COMPONENT_REFERENCE__MULTIPLICITY:
				return isSetMultiplicity();
			case EDTProjectPackage.COMPONENT_REFERENCE__NAME:
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
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * return name of ComponentDefinitionReference
	 * 
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_REFERENCE__NAME, oldName, name));
	}

	/**
	 * get Name as component_Name/reference_Name
	 */
	public String getWireString() {
		return ((Component) eContainer).getName() + "/" + getName();
	}

	/**
	 * 
	 */
	public EList<ServiceLink> getServiceLink() {
		EList<ServiceLink> serviceLinks = new BasicEList<>();
		if (this.eContainer() != null && this.eContainer().eContainer() != null) {
			Composite composite = (Composite) this.eContainer().eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, composite);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ServiceLink serviceLink) {
					serviceLinks.add(serviceLink);
				}
			}
		}
		return serviceLinks;
	}

} // ComponentReferenceImpl
