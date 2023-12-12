/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.dassault.edt.log.EDTLog;

import edtproject.ComponentProperty;
import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.Property;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getComponentDefinitionProperty <em>Component Definition Property</em>}</li>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getFile <em>File</em>}</li>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edtproject.impl.ComponentPropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPropertyImpl extends MinimalEObjectImpl.Container implements ComponentProperty {
	/**
	 * The cached value of the '{@link #getComponentDefinitionProperty() <em>Component Definition Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionProperty()
	 * @generated
	 * @ordered
	 */
	protected Property componentDefinitionProperty;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected Property sourceProperty;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPONENT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getComponentDefinitionProperty() {
		if (componentDefinitionProperty != null && componentDefinitionProperty.eIsProxy()) {
			InternalEObject oldComponentDefinitionProperty = (InternalEObject)componentDefinitionProperty;
			componentDefinitionProperty = (Property)eResolveProxy(oldComponentDefinitionProperty);
			if (componentDefinitionProperty != oldComponentDefinitionProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY, oldComponentDefinitionProperty, componentDefinitionProperty));
			}
		}
		return componentDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetComponentDefinitionProperty() {
		return componentDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setComponentDefinitionProperty(Property newComponentDefinitionProperty) {
		Property oldComponentDefinitionProperty = componentDefinitionProperty;
		componentDefinitionProperty = newComponentDefinitionProperty;
		/*
		 * The ComponentDefinitionProperty property shall become null, only if it is
		 * removed (Sirius deletes the crossreference before, removing from the list
		 */
		if (componentDefinitionProperty != null) {
			name = componentDefinitionProperty.getName();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY, oldComponentDefinitionProperty,
					componentDefinitionProperty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_PROPERTY__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		if (newSource != null && this.eContainer() != null) {
			if (newSource.contains("$") && this.eContainer() != null
					&& this.eContainer().eContainer() instanceof Composite composite) {
				Property propertyInComposite = findPropertyInComposite(newSource, composite);
				if (propertyInComposite == null) {
					EDTLog.toPopUpAndConsole(
							"ERROR : there is no property in the Assembly with the name "
									+ newSource.substring(1, newSource.length()),
							"The source should be a Composite property");
					return;
				}
				setSourceProperty(propertyInComposite);
			} else {
				setSourceProperty(null);
			}
		}
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_PROPERTY__SOURCE,
					oldSource, source));
	}

	/**
	 * @param newSource : name of Source
	 * @param composite : Composite that should contain property ?
	 * @generated NOT
	 */
	private Property findPropertyInComposite(String newSource, Composite composite) {
		String propertyNameWoDollar = newSource.substring(1, newSource.length());

		EList<Property> properties = composite.getProperties();
		for (Property property : properties) {
			if (Objects.equals(property.getName(), propertyNameWoDollar)) {
				return property;
			}
		}

		return null;
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
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_PROPERTY__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getSourceProperty() {
		if (sourceProperty != null && sourceProperty.eIsProxy()) {
			InternalEObject oldSourceProperty = (InternalEObject)sourceProperty;
			sourceProperty = (Property)eResolveProxy(oldSourceProperty);
			if (sourceProperty != oldSourceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
			}
		}
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceProperty(Property newSourceProperty) {
		Property oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY:
				if (resolve) return getComponentDefinitionProperty();
				return basicGetComponentDefinitionProperty();
			case EDTProjectPackage.COMPONENT_PROPERTY__FILE:
				return getFile();
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY:
				if (resolve) return getSourceProperty();
				return basicGetSourceProperty();
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE:
				return getSource();
			case EDTProjectPackage.COMPONENT_PROPERTY__VALUE:
				return getValue();
			case EDTProjectPackage.COMPONENT_PROPERTY__NAME:
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
			case EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY:
				setComponentDefinitionProperty((Property)newValue);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__FILE:
				setFile((String)newValue);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY:
				setSourceProperty((Property)newValue);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE:
				setSource((String)newValue);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__NAME:
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
			case EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY:
				setComponentDefinitionProperty((Property)null);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY:
				setSourceProperty((Property)null);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EDTProjectPackage.COMPONENT_PROPERTY__NAME:
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
			case EDTProjectPackage.COMPONENT_PROPERTY__COMPONENT_DEFINITION_PROPERTY:
				return componentDefinitionProperty != null;
			case EDTProjectPackage.COMPONENT_PROPERTY__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE_PROPERTY:
				return sourceProperty != null;
			case EDTProjectPackage.COMPONENT_PROPERTY__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EDTProjectPackage.COMPONENT_PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EDTProjectPackage.COMPONENT_PROPERTY__NAME:
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
		result.append(" (file: ");
		result.append(file);
		result.append(", source: ");
		result.append(source);
		result.append(", Value: ");
		result.append(value);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ComponentPropertyImpl
