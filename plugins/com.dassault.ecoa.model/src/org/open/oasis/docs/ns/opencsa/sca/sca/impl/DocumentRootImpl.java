/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Composite;
import org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType;
import org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot;
import org.open.oasis.docs.ns.opencsa.sca.sca.Documentation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Implementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType;
import org.open.oasis.docs.ns.opencsa.sca.sca.Interface;
import org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.ValueType;
import org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl#getImplementationComposite <em>Implementation Composite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scaPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, scaPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponentType() {
		return (ComponentType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__COMPONENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(ComponentType newComponentType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__COMPONENT_TYPE, newComponentType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentType newComponentType) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getComposite() {
		return (Composite)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposite(Composite newComposite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__COMPOSITE, newComposite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposite(Composite newComposite) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__COMPOSITE, newComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation() {
		return (Documentation)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return (ExtensionsType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__EXTENSIONS, newExtensions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__EXTENSIONS, newExtensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		return (Implementation)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION, newImplementation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return (ImplementationType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationType(ImplementationType newImplementationType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_TYPE, newImplementationType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(ImplementationType newImplementationType) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_TYPE, newImplementationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return (Interface)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__INTERFACE, newInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValue() {
		return (ValueType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__VALUE, newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType newValue) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireFormatType getWireFormat() {
		return (WireFormatType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__WIRE_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireFormat(WireFormatType newWireFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__WIRE_FORMAT, newWireFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType getContribution() {
		return (ContributionType)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__CONTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContribution(ContributionType newContribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__CONTRIBUTION, newContribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContribution(ContributionType newContribution) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__CONTRIBUTION, newContribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAImplementation getImplementationComposite() {
		return (SCAImplementation)getMixed().get(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationComposite(SCAImplementation newImplementationComposite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE, newImplementationComposite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationComposite(SCAImplementation newImplementationComposite) {
		((FeatureMap.Internal)getMixed()).set(scaPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE, newImplementationComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scaPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
				return basicSetComposite(null, msgs);
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
				return basicSetImplementationType(null, msgs);
			case scaPackage.DOCUMENT_ROOT__INTERFACE:
				return basicSetInterface(null, msgs);
			case scaPackage.DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
			case scaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
				return basicSetWireFormat(null, msgs);
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
				return basicSetContribution(null, msgs);
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
				return basicSetImplementationComposite(null, msgs);
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
			case scaPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
				return getComponentType();
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
				return getComposite();
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
				return getExtensions();
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return getImplementation();
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case scaPackage.DOCUMENT_ROOT__INTERFACE:
				return getInterface();
			case scaPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case scaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
				return getWireFormat();
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
				return getContribution();
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
				return getImplementationComposite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scaPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
				setComponentType((ComponentType)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
				setComposite((Composite)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__VALUE:
				setValue((ValueType)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
				setContribution((ContributionType)newValue);
				return;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
				setImplementationComposite((SCAImplementation)newValue);
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
			case scaPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
				setComponentType((ComponentType)null);
				return;
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
				setComposite((Composite)null);
				return;
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)null);
				return;
			case scaPackage.DOCUMENT_ROOT__VALUE:
				setValue((ValueType)null);
				return;
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
				setContribution((ContributionType)null);
				return;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
				setImplementationComposite((SCAImplementation)null);
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
			case scaPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case scaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case scaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case scaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
				return getComponentType() != null;
			case scaPackage.DOCUMENT_ROOT__COMPOSITE:
				return getComposite() != null;
			case scaPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case scaPackage.DOCUMENT_ROOT__EXTENSIONS:
				return getExtensions() != null;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
				return getImplementation() != null;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
				return getImplementationType() != null;
			case scaPackage.DOCUMENT_ROOT__INTERFACE:
				return getInterface() != null;
			case scaPackage.DOCUMENT_ROOT__VALUE:
				return getValue() != null;
			case scaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
				return getWireFormat() != null;
			case scaPackage.DOCUMENT_ROOT__CONTRIBUTION:
				return getContribution() != null;
			case scaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
				return getImplementationComposite() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
