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

import edtproject.Component;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.CompositeReference;
import edtproject.CompositeService;
import edtproject.EDTProjectPackage;
import edtproject.Property;
import edtproject.ServiceLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Composite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.CompositeImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getComponents
 * <em>Components</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getName <em>Name</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getReferences
 * <em>References</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getServices <em>Services</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getTargetNamespace <em>Target
 * Namespace</em>}</li>
 * <li>{@link edtproject.impl.CompositeImpl#getServiceLinks <em>Service
 * Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends MinimalEObjectImpl.Container implements Composite {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeReference> references;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeService> services;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target
	 * Namespace</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target
	 * Namespace</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceLinks() <em>Service Links</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLink> serviceLinks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					EDTProjectPackage.COMPOSITE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					EDTProjectPackage.COMPOSITE__PROPERTIES);
		}
		return properties;
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
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<CompositeReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<CompositeReference>(CompositeReference.class, this,
					EDTProjectPackage.COMPOSITE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<CompositeService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<CompositeService>(CompositeService.class, this,
					EDTProjectPackage.COMPOSITE__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.COMPOSITE__TARGET_NAMESPACE,
					oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> !!! not used
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<ServiceLink> getServiceLinks() {
		if (serviceLinks == null) {
			serviceLinks = new EObjectContainmentEList<ServiceLink>(ServiceLink.class, this,
					EDTProjectPackage.COMPOSITE__SERVICE_LINKS) {
				@Override
				public void addUnique(ServiceLink object) {
					for (ServiceLink serviceLink : serviceLinks) {
						if (!Objects.equals(serviceLink, object) && object.getSource() != null
								&& serviceLink.getSource() != null
								&& Objects.equals(serviceLink.getSource(), object.getSource())) {
							EDTLog.toPopUpAndConsole(
									"Warning : only one Service can be linked to a Reference, the ServiceLink between "
											+ serviceLink.getSource().getWireString() + " and "
											+ serviceLink.getTarget().getWireString() + " has been deleted.",
									"");
						}
					}
					super.addUnique(object);
				}
			};
		}
		return serviceLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.COMPOSITE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPOSITE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPOSITE__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPOSITE__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.COMPOSITE__SERVICE_LINKS:
			return ((InternalEList<?>) getServiceLinks()).basicRemove(otherEnd, msgs);
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
		case EDTProjectPackage.COMPOSITE__PROPERTIES:
			return getProperties();
		case EDTProjectPackage.COMPOSITE__COMPONENTS:
			return getComponents();
		case EDTProjectPackage.COMPOSITE__NAME:
			return getName();
		case EDTProjectPackage.COMPOSITE__REFERENCES:
			return getReferences();
		case EDTProjectPackage.COMPOSITE__SERVICES:
			return getServices();
		case EDTProjectPackage.COMPOSITE__TARGET_NAMESPACE:
			return getTargetNamespace();
		case EDTProjectPackage.COMPOSITE__SERVICE_LINKS:
			return getServiceLinks();
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
		case EDTProjectPackage.COMPOSITE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__NAME:
			setName((String) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__REFERENCES:
			getReferences().clear();
			getReferences().addAll((Collection<? extends CompositeReference>) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends CompositeService>) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__TARGET_NAMESPACE:
			setTargetNamespace((String) newValue);
			return;
		case EDTProjectPackage.COMPOSITE__SERVICE_LINKS:
			getServiceLinks().clear();
			getServiceLinks().addAll((Collection<? extends ServiceLink>) newValue);
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
		case EDTProjectPackage.COMPOSITE__PROPERTIES:
			getProperties().clear();
			return;
		case EDTProjectPackage.COMPOSITE__COMPONENTS:
			getComponents().clear();
			return;
		case EDTProjectPackage.COMPOSITE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTProjectPackage.COMPOSITE__REFERENCES:
			getReferences().clear();
			return;
		case EDTProjectPackage.COMPOSITE__SERVICES:
			getServices().clear();
			return;
		case EDTProjectPackage.COMPOSITE__TARGET_NAMESPACE:
			setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
			return;
		case EDTProjectPackage.COMPOSITE__SERVICE_LINKS:
			getServiceLinks().clear();
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
		case EDTProjectPackage.COMPOSITE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case EDTProjectPackage.COMPOSITE__COMPONENTS:
			return components != null && !components.isEmpty();
		case EDTProjectPackage.COMPOSITE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTProjectPackage.COMPOSITE__REFERENCES:
			return references != null && !references.isEmpty();
		case EDTProjectPackage.COMPOSITE__SERVICES:
			return services != null && !services.isEmpty();
		case EDTProjectPackage.COMPOSITE__TARGET_NAMESPACE:
			return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null
					: !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
		case EDTProjectPackage.COMPOSITE__SERVICE_LINKS:
			return serviceLinks != null && !serviceLinks.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

	/**
	 * Find Component
	 * 
	 * @param name : name of Component to link
	 * @return : Component to link
	 */
	public edtproject.Component findComponentByName(String name) {
		for (edtproject.Component edtComponent : this.getComponents()) {
			if (Objects.equals(edtComponent.getName(), name)) {
				return edtComponent;
			}
		}

		return null;
	}

	/**
	 * Find Component
	 * 
	 * @param name : name of Component to link
	 * @return : Component to link
	 */
	public edtproject.Property findPropertyByName(String name) {
		for (Property edtProperty : this.getProperties()) {
			if (Objects.equals(edtProperty.getName(), name)) {
				return edtProperty;
			}
		}

		return null;
	}

	public edtproject.ComponentReference findComponentReferenceFromWire(String name) {
		String[] split = name.split("/");
		if (split.length != 2) {
			return null;
		}
		for (Component component : this.getComponents()) {
			if (Objects.equals(split[0], component.getName())) {
				EList<ComponentReference> componentReferences = component.getComponentReferences();
				for (ComponentReference componentReference : componentReferences) {
					if (Objects.equals(split[1], componentReference.getName())) {
						return componentReference;
					}
				}
			}
		}
		return null;
	}

	public edtproject.ComponentService findComponentServiceFromWire(String name) {
		String[] split = name.split("/");
		if (split.length != 2) {
			return null;
		}
		for (Component component : this.getComponents()) {
			if (Objects.equals(split[0], component.getName())) {
				EList<ComponentService> componentServices = component.getComponentServices();
				for (ComponentService componentService : componentServices) {
					if (Objects.equals(split[1], componentService.getName())) {
						return componentService;
					}
				}
			}
		}
		return null;
	}

	public edtproject.ServiceLink findServiceLink(ComponentReference ref, ComponentService service) {
		EList<ServiceLink> serviceLinks = ref.getServiceLink();
		for (ServiceLink serviceLink : serviceLinks) {
			if (Objects.equals(service, serviceLink.getTarget())) {
				return serviceLink;
			}
		}
		return null;
	}

} // CompositeImpl
