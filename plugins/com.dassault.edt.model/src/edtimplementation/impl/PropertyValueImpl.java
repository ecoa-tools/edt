/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.dassault.edt.log.EDTLog;

import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.PropertyValue;
import edtproject.ComponentDefinition;
import edtproject.Property;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.PropertyValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edtimplementation.impl.PropertyValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.PropertyValueImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link edtimplementation.impl.PropertyValueImpl#getValueComponentDefinitionProperty <em>Value Component Definition Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyValueImpl extends MinimalEObjectImpl.Container implements PropertyValue {
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
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected ModuleTypeProperty propertyType;

	/**
	 * The cached value of the '{@link #getValueComponentDefinitionProperty() <em>Value Component Definition Property</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getValueComponentDefinitionProperty()
	 * @generated
	 * @ordered
	 */
	protected Property valueComponentDefinitionProperty;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (newValue != null && this.eContainer() != null) {
			if (newValue.contains("$") && this.eContainer() != null
					&& this.eContainer().eContainer() instanceof ComponentImplementation componentImplementation) {
				Property propertyInComponentDefinition = findPropertyInComponentDefinition(newValue,
						componentImplementation);
				if (propertyInComponentDefinition == null) {
					EDTLog.toPopUpAndConsole(
							"ERROR : there is no property in the ComponentDefinition and thus in the Component with the name "
									+ newValue.substring(1, newValue.length()),
							"The value should be a property");
					return;
				}
				setValueComponentDefinitionProperty(propertyInComponentDefinition);
			} else {
				setValueComponentDefinitionProperty(null);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PROPERTY_VALUE__VALUE,
					oldValue, value));
	}

	/**
	 * Should be ComponentProperty, but ComponentProperties are herited from
	 * ComponentDefinition, thus seems to be equivalent
	 * 
	 * 
	 * @param value                   : name of Source
	 * @param componentImplementation : ComponentImplementation that gives
	 *                                ComponentDefinition information
	 * @generated NOT
	 */
	private Property findPropertyInComponentDefinition(String value, ComponentImplementation componentImplementation) {
		String propertyNameWoDollar = value.substring(1, value.length());

		if (componentImplementation.getComponentDefinition() != null) {
			ComponentDefinition componentDefinition = componentImplementation.getComponentDefinition();
			EList<Property> properties = componentDefinition.getProperties();
			for (Property property : properties) {
				if (Objects.equals(property.getName(), propertyNameWoDollar)) {
					return property;
				}
			}
		}

		return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PROPERTY_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleTypeProperty getPropertyType() {
		if (propertyType != null && propertyType.eIsProxy()) {
			InternalEObject oldPropertyType = (InternalEObject)propertyType;
			propertyType = (ModuleTypeProperty)eResolveProxy(oldPropertyType);
			if (propertyType != oldPropertyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE, oldPropertyType, propertyType));
			}
		}
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleTypeProperty basicGetPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyType(ModuleTypeProperty newPropertyType) {
		ModuleTypeProperty oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getValueComponentDefinitionProperty() {
		if (valueComponentDefinitionProperty != null && valueComponentDefinitionProperty.eIsProxy()) {
			InternalEObject oldValueComponentDefinitionProperty = (InternalEObject)valueComponentDefinitionProperty;
			valueComponentDefinitionProperty = (Property)eResolveProxy(oldValueComponentDefinitionProperty);
			if (valueComponentDefinitionProperty != oldValueComponentDefinitionProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY, oldValueComponentDefinitionProperty, valueComponentDefinitionProperty));
			}
		}
		return valueComponentDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetValueComponentDefinitionProperty() {
		return valueComponentDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueComponentDefinitionProperty(Property newValueComponentDefinitionProperty) {
		Property oldValueComponentDefinitionProperty = valueComponentDefinitionProperty;
		valueComponentDefinitionProperty = newValueComponentDefinitionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY, oldValueComponentDefinitionProperty, valueComponentDefinitionProperty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE:
				return getValue();
			case EdtimplementationPackage.PROPERTY_VALUE__NAME:
				return getName();
			case EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE:
				if (resolve) return getPropertyType();
				return basicGetPropertyType();
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY:
				if (resolve) return getValueComponentDefinitionProperty();
				return basicGetValueComponentDefinitionProperty();
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
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE:
				setPropertyType((ModuleTypeProperty)newValue);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY:
				setValueComponentDefinitionProperty((Property)newValue);
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
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE:
				setPropertyType((ModuleTypeProperty)null);
				return;
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY:
				setValueComponentDefinitionProperty((Property)null);
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
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdtimplementationPackage.PROPERTY_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.PROPERTY_VALUE__PROPERTY_TYPE:
				return propertyType != null;
			case EdtimplementationPackage.PROPERTY_VALUE__VALUE_COMPONENT_DEFINITION_PROPERTY:
				return valueComponentDefinitionProperty != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getValue() != null
				&& !this.getValue().isBlank());
	}

} // PropertyValueImpl
