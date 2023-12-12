/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Describes how composites are mapped onto
 *         platforms, how wires
 *         are mapped onto logical links and how IDs
 *         are bound to logical links
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getComposite <em>Composite</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getWireMapping <em>Wire Mapping</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getEuidsBinding <em>Euids Binding</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.View#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView()
 * @model extendedMetaData="name='View' kind='elementOnly'"
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.cross.platforms.view._2.Composite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines where a composite is executed
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference list.
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_Composite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='composite' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Composite> getComposite();

	/**
	 * Returns the value of the '<em><b>Wire Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.cross.platforms.view._2.WireMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the mapping of a wires onto a
	 *               logical
	 *               platform link
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Mapping</em>' containment reference list.
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_WireMapping()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireMapping' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<WireMapping> getWireMapping();

	/**
	 * Returns the value of the '<em><b>Euids Binding</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.cross.platforms.view._2.EUIDsBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the binding of EUIDs onto a
	 *               logical platform link
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Euids Binding</em>' containment reference list.
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_EuidsBinding()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='euidsBinding' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EUIDsBinding> getEuidsBinding();

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the system composite referenced by
	 *           this view
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly</em>' attribute.
	 * @see #setAssembly(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_Assembly()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='assembly'"
	 * @generated
	 */
	String getAssembly();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.View#getAssembly <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' attribute.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(String value);

	/**
	 * Returns the value of the '<em><b>Logical System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the logical system this deployment is
	 *           made on
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical System</em>' attribute.
	 * @see #setLogicalSystem(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_LogicalSystem()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='logicalSystem'"
	 * @generated
	 */
	String getLogicalSystem();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.View#getLogicalSystem <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical System</em>' attribute.
	 * @see #getLogicalSystem()
	 * @generated
	 */
	void setLogicalSystem(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getView_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // View
