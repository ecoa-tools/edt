/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtproject.ComponentProperty;
import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.Property;
import edtproject.Steps;
import edttype.EDTDataType;
import edttype.Library;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.PropertyImpl#isMustSupply <em>Must
 * Supply</em>}</li>
 * <li>{@link edtproject.impl.PropertyImpl#getType <em>Type</em>}</li>
 * <li>{@link edtproject.impl.PropertyImpl#getName <em>Name</em>}</li>
 * <li>{@link edtproject.impl.PropertyImpl#getValue <em>Value</em>}</li>
 * <li>{@link edtproject.impl.PropertyImpl#getECOASCAType <em>ECOASCA
 * Type</em>}</li>
 * <li>{@link edtproject.impl.PropertyImpl#getECOASCALibrary <em>ECOASCA
 * Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #isMustSupply() <em>Must Supply</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMustSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustSupply() <em>Must Supply</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMustSupply()
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupply = MUST_SUPPLY_EDEFAULT;

	/**
	 * This is true if the Must Supply attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupplyESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getECOASCAType() <em>ECOASCA Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getECOASCAType()
	 * @generated
	 * @ordered
	 */
	protected EDTDataType ecoascaType;

	/**
	 * The cached value of the '{@link #getECOASCALibrary() <em>ECOASCA
	 * Library</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getECOASCALibrary()
	 * @generated
	 * @ordered
	 */
	protected Library ecoascaLibrary;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setECOASCAType(EDTDataType newECOASCAType) {
		EDTDataType oldECOASCAType = ecoascaType;
		ecoascaType = newECOASCAType;
		if (newECOASCAType != null && !EDTDataType.isBasicOrPredefined(newECOASCAType)) {
			Library library = Library.getLibrary(newECOASCAType);
			setECOASCALibrary(library);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__ECOASCA_TYPE,
					oldECOASCAType, ecoascaType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isMustSupply() {
		return mustSupply;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMustSupply(boolean newMustSupply) {
		boolean oldMustSupply = mustSupply;
		mustSupply = newMustSupply;
		boolean oldMustSupplyESet = mustSupplyESet;
		mustSupplyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__MUST_SUPPLY,
					oldMustSupply, mustSupply, !oldMustSupplyESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetMustSupply() {
		boolean oldMustSupply = mustSupply;
		boolean oldMustSupplyESet = mustSupplyESet;
		mustSupply = MUST_SUPPLY_EDEFAULT;
		mustSupplyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDTProjectPackage.PROPERTY__MUST_SUPPLY,
					oldMustSupply, MUST_SUPPLY_EDEFAULT, oldMustSupplyESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetMustSupply() {
		return mustSupplyESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__TYPE, oldType, type));
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
		findAssociatedPropertyToRename(newName);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDTDataType getECOASCAType() {
		if (ecoascaType != null && ecoascaType.eIsProxy()) {
			InternalEObject oldECOASCAType = (InternalEObject) ecoascaType;
			ecoascaType = (EDTDataType) eResolveProxy(oldECOASCAType);
			if (ecoascaType != oldECOASCAType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.PROPERTY__ECOASCA_TYPE,
							oldECOASCAType, ecoascaType));
			}
		}
		return ecoascaType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDTDataType basicGetECOASCAType() {
		return ecoascaType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Library getECOASCALibrary() {
		if (ecoascaLibrary != null && ecoascaLibrary.eIsProxy()) {
			InternalEObject oldECOASCALibrary = (InternalEObject) ecoascaLibrary;
			ecoascaLibrary = (Library) eResolveProxy(oldECOASCALibrary);
			if (ecoascaLibrary != oldECOASCALibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY, oldECOASCALibrary, ecoascaLibrary));
			}
		}
		return ecoascaLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library basicGetECOASCALibrary() {
		return ecoascaLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setECOASCALibrary(Library newECOASCALibrary) {
		Library oldECOASCALibrary = ecoascaLibrary;
		ecoascaLibrary = newECOASCALibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY,
					oldECOASCALibrary, ecoascaLibrary));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTProjectPackage.PROPERTY__MUST_SUPPLY:
			return isMustSupply();
		case EDTProjectPackage.PROPERTY__TYPE:
			return getType();
		case EDTProjectPackage.PROPERTY__NAME:
			return getName();
		case EDTProjectPackage.PROPERTY__VALUE:
			return getValue();
		case EDTProjectPackage.PROPERTY__ECOASCA_TYPE:
			if (resolve)
				return getECOASCAType();
			return basicGetECOASCAType();
		case EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY:
			if (resolve)
				return getECOASCALibrary();
			return basicGetECOASCALibrary();
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
		case EDTProjectPackage.PROPERTY__MUST_SUPPLY:
			setMustSupply((Boolean) newValue);
			return;
		case EDTProjectPackage.PROPERTY__TYPE:
			setType((String) newValue);
			return;
		case EDTProjectPackage.PROPERTY__NAME:
			setName((String) newValue);
			return;
		case EDTProjectPackage.PROPERTY__VALUE:
			setValue((String) newValue);
			return;
		case EDTProjectPackage.PROPERTY__ECOASCA_TYPE:
			setECOASCAType((EDTDataType) newValue);
			return;
		case EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY:
			setECOASCALibrary((Library) newValue);
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
		case EDTProjectPackage.PROPERTY__MUST_SUPPLY:
			unsetMustSupply();
			return;
		case EDTProjectPackage.PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case EDTProjectPackage.PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTProjectPackage.PROPERTY__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case EDTProjectPackage.PROPERTY__ECOASCA_TYPE:
			setECOASCAType((EDTDataType) null);
			return;
		case EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY:
			setECOASCALibrary((Library) null);
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
		case EDTProjectPackage.PROPERTY__MUST_SUPPLY:
			return isSetMustSupply();
		case EDTProjectPackage.PROPERTY__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case EDTProjectPackage.PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTProjectPackage.PROPERTY__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case EDTProjectPackage.PROPERTY__ECOASCA_TYPE:
			return ecoascaType != null;
		case EDTProjectPackage.PROPERTY__ECOASCA_LIBRARY:
			return ecoascaLibrary != null;
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
		result.append(" (mustSupply: ");
		if (mustSupplyESet)
			result.append(mustSupply);
		else
			result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find all ComponentProperty associated to the ComponentDefinitionProperty
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<ComponentProperty> findAssociatedComponentProperty() {
		EList<ComponentProperty> componentPropertyAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ComponentProperty componentProperty) {
					componentPropertyAssociated.add(componentProperty);
				}
			}
		}
		return componentPropertyAssociated;
	}

	/**
	 * Find all ComponentProperty and ModuleProperty associated to the
	 * ComponentDefinitionProperty to rename reference
	 * 
	 * @return
	 * @generated NOT
	 */
	public void findAssociatedPropertyToRename(String newName) {
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ComponentProperty componentProperty) {
					if (this.eContainer instanceof Composite) {
						componentProperty.setSource("$" + newName);
					} else {
						componentProperty.setName(newName);
					}
				} else if (crossReference
						.getEObject() instanceof edtimplementation.PropertyValue moduleInstanceProperty) {
					moduleInstanceProperty.setValue("$" + newName);
				}
			}
		}
	}

	@Override
	public boolean isComplete() {
		return (this.getECOASCAType() != null && this.getName() != null && !this.getName().isBlank()
				&& (EDTDataType.isBasicOrPredefined(this.getECOASCAType()) || (this.getECOASCALibrary() != null
						&& Objects.equals(this.getECOASCAType().eContainer(), this.getECOASCALibrary()))));
	}

} // PropertyImpl
