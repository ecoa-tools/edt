/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;

import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtinterface.ServiceDefinition;
import edtproject.Contract;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service
 * Instance Qos</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtqos.ServiceInstanceQos#getOperations <em>Operations</em>}</li>
 * <li>{@link edtqos.ServiceInstanceQos#getServiceDefinition <em>Service
 * Definition</em>}</li>
 * <li>{@link edtqos.ServiceInstanceQos#getName <em>Name</em>}</li>
 * <li>{@link edtqos.ServiceInstanceQos#getInterfaceLink <em>Interface
 * Link</em>}</li>
 * </ul>
 *
 * @see edtqos.EdtqosPackage#getServiceInstanceQos()
 * @model
 * @generated
 */
public interface ServiceInstanceQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference
	 * list. The list contents are of type {@link edtqos.Operation}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtqos.EdtqosPackage#getServiceInstanceQos_Operations()
	 * @model containment="true" extendedMetaData="kind='element' name='operations'
	 *        namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Service Definition</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Definition</em>' reference.
	 * @see #setServiceDefinition(ServiceDefinition)
	 * @see edtqos.EdtqosPackage#getServiceInstanceQos_ServiceDefinition()
	 * @model required="true"
	 * @generated
	 */
	ServiceDefinition getServiceDefinition();

	/**
	 * Sets the value of the '{@link edtqos.ServiceInstanceQos#getServiceDefinition
	 * <em>Service Definition</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Service Definition</em>' reference.
	 * @see #getServiceDefinition()
	 * @generated
	 */
	void setServiceDefinition(ServiceDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtqos.EdtqosPackage#getServiceInstanceQos_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtqos.ServiceInstanceQos#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Link</b></em>' reference list. The
	 * list contents are of type {@link edtproject.Contract}. It is bidirectional
	 * and its opposite is '{@link edtproject.Contract#getQos <em>Qos</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface Link</em>' reference list.
	 * @see edtqos.EdtqosPackage#getServiceInstanceQos_InterfaceLink()
	 * @see edtproject.Contract#getQos
	 * @model opposite="Qos"
	 * @generated
	 */
	EList<Contract> getInterfaceLink();

	/**
	 * Find ServiceInstanceQoS by name
	 * 
	 * @param edtServiceQosList : list of QoS
	 * @param qosName           : name of QoS to find
	 * @return QoS corresponding to name
	 */
	public static edtqos.ServiceInstanceQos findQoS(List<ServiceInstanceQos> edtServiceQosList, String qosName) {
		for (edtqos.ServiceInstanceQos serviceInstanceQoS : edtServiceQosList) {
			if (Objects.equals(serviceInstanceQoS.getName(), qosName)) {
				return serviceInstanceQoS;
			}
		}
		return null;
	}

} // ServiceInstanceQos
