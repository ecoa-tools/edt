/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DataWriterInstance;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.VersionedDataServiceInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Link To Service Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.DataLinkToServiceOperationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkToServiceOperationImpl#isControlled <em>Controlled</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkToServiceOperationImpl#getWriter <em>Writer</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkToServiceOperationImpl#getReader <em>Reader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLinkToServiceOperationImpl extends MinimalEObjectImpl.Container implements DataLinkToServiceOperation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean controlled = CONTROLLED_EDEFAULT;

	/**
	 * This is true if the Controlled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlledESet;

	/**
	 * The cached value of the '{@link #getWriter() <em>Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriter()
	 * @generated
	 * @ordered
	 */
	protected DataWriterInstance writer;

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected VersionedDataServiceInstance reader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkToServiceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.DATA_LINK_TO_SERVICE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlled(boolean newControlled) {
		boolean oldControlled = controlled;
		controlled = newControlled;
		boolean oldControlledESet = controlledESet;
		controlledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED, oldControlled, controlled, !oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetControlled() {
		boolean oldControlled = controlled;
		boolean oldControlledESet = controlledESet;
		controlled = CONTROLLED_EDEFAULT;
		controlledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED, oldControlled, CONTROLLED_EDEFAULT, oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetControlled() {
		return controlledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataWriterInstance getWriter() {
		if (writer != null && writer.eIsProxy()) {
			InternalEObject oldWriter = (InternalEObject)writer;
			writer = (DataWriterInstance)eResolveProxy(oldWriter);
			if (writer != oldWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER, oldWriter, writer));
			}
		}
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWriterInstance basicGetWriter() {
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriter(DataWriterInstance newWriter) {
		DataWriterInstance oldWriter = writer;
		writer = newWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER, oldWriter, writer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDataServiceInstance getReader() {
		if (reader != null && reader.eIsProxy()) {
			InternalEObject oldReader = (InternalEObject)reader;
			reader = (VersionedDataServiceInstance)eResolveProxy(oldReader);
			if (reader != oldReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER, oldReader, reader));
			}
		}
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedDataServiceInstance basicGetReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReader(VersionedDataServiceInstance newReader) {
		VersionedDataServiceInstance oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER, oldReader, reader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID:
				return getId();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED:
				return isControlled();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER:
				if (resolve) return getWriter();
				return basicGetWriter();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER:
				if (resolve) return getReader();
				return basicGetReader();
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
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED:
				setControlled((Boolean)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER:
				setWriter((DataWriterInstance)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER:
				setReader((VersionedDataServiceInstance)newValue);
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
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID:
				unsetId();
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED:
				unsetControlled();
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER:
				setWriter((DataWriterInstance)null);
				return;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER:
				setReader((VersionedDataServiceInstance)null);
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
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__ID:
				return isSetId();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__CONTROLLED:
				return isSetControlled();
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__WRITER:
				return writer != null;
			case EdtimplementationPackage.DATA_LINK_TO_SERVICE_OPERATION__READER:
				return reader != null;
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", controlled: ");
		if (controlledESet) result.append(controlled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataLinkToServiceOperationImpl
