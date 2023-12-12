/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataReaderInstance;
import edtimplementation.EdtimplementationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data
 * Link Activatable Fifo</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#isControlled <em>Controlled</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#getWriter <em>Writer</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#getReaderFifoSize <em>Reader Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.impl.DataLinkActivatableFifoImpl#isReaderActivating <em>Reader Activating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLinkActivatableFifoImpl extends MinimalEObjectImpl.Container implements DataLinkActivatableFifo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean controlled = CONTROLLED_EDEFAULT;

	/**
	 * This is true if the Controlled attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlledESet;

	/**
	 * The cached value of the '{@link #getWriter() <em>Writer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWriter()
	 * @generated
	 * @ordered
	 */
	protected DataLinkWriter writer;

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected DataReaderInstance reader;

	/**
	 * The default value of the '{@link #getReaderFifoSize() <em>Reader Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReaderFifoSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger READER_FIFO_SIZE_EDEFAULT = new BigInteger("8");

	/**
	 * The cached value of the '{@link #getReaderFifoSize() <em>Reader Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReaderFifoSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger readerFifoSize = READER_FIFO_SIZE_EDEFAULT;

	/**
	 * This is true if the Reader Fifo Size attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean readerFifoSizeESet;

	/**
	 * The default value of the '{@link #isReaderActivating() <em>Reader Activating</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReaderActivating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READER_ACTIVATING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReaderActivating() <em>Reader Activating</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReaderActivating()
	 * @generated
	 * @ordered
	 */
	protected boolean readerActivating = READER_ACTIVATING_EDEFAULT;

	/**
	 * This is true if the Reader Activating attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean readerActivatingESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkActivatableFifoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.DATA_LINK_ACTIVATABLE_FIFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlled(boolean newControlled) {
		boolean oldControlled = controlled;
		controlled = newControlled;
		boolean oldControlledESet = controlledESet;
		controlledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED, oldControlled, controlled, !oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetControlled() {
		boolean oldControlled = controlled;
		boolean oldControlledESet = controlledESet;
		controlled = CONTROLLED_EDEFAULT;
		controlledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED, oldControlled, CONTROLLED_EDEFAULT, oldControlledESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetControlled() {
		return controlledESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLinkWriter getWriter() {
		if (writer != null && writer.eIsProxy()) {
			InternalEObject oldWriter = (InternalEObject)writer;
			writer = (DataLinkWriter)eResolveProxy(oldWriter);
			if (writer != oldWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER, oldWriter, writer));
			}
		}
		return writer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataLinkWriter basicGetWriter() {
		return writer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriter(DataLinkWriter newWriter) {
		DataLinkWriter oldWriter = writer;
		writer = newWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER, oldWriter, writer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataReaderInstance getReader() {
		if (reader != null && reader.eIsProxy()) {
			InternalEObject oldReader = (InternalEObject)reader;
			reader = (DataReaderInstance)eResolveProxy(oldReader);
			if (reader != oldReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER, oldReader, reader));
			}
		}
		return reader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataReaderInstance basicGetReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReader(DataReaderInstance newReader) {
		DataReaderInstance oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER, oldReader, reader));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getReaderFifoSize() {
		return readerFifoSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReaderFifoSize(BigInteger newReaderFifoSize) {
		BigInteger oldReaderFifoSize = readerFifoSize;
		readerFifoSize = newReaderFifoSize;
		boolean oldReaderFifoSizeESet = readerFifoSizeESet;
		readerFifoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE, oldReaderFifoSize, readerFifoSize, !oldReaderFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReaderFifoSize() {
		BigInteger oldReaderFifoSize = readerFifoSize;
		boolean oldReaderFifoSizeESet = readerFifoSizeESet;
		readerFifoSize = READER_FIFO_SIZE_EDEFAULT;
		readerFifoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE, oldReaderFifoSize, READER_FIFO_SIZE_EDEFAULT, oldReaderFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReaderFifoSize() {
		return readerFifoSizeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReaderActivating() {
		return readerActivating;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReaderActivating(boolean newReaderActivating) {
		boolean oldReaderActivating = readerActivating;
		readerActivating = newReaderActivating;
		boolean oldReaderActivatingESet = readerActivatingESet;
		readerActivatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING, oldReaderActivating, readerActivating, !oldReaderActivatingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReaderActivating() {
		boolean oldReaderActivating = readerActivating;
		boolean oldReaderActivatingESet = readerActivatingESet;
		readerActivating = READER_ACTIVATING_EDEFAULT;
		readerActivatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING, oldReaderActivating, READER_ACTIVATING_EDEFAULT, oldReaderActivatingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReaderActivating() {
		return readerActivatingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID:
				return getId();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED:
				return isControlled();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER:
				if (resolve) return getWriter();
				return basicGetWriter();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER:
				if (resolve) return getReader();
				return basicGetReader();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE:
				return getReaderFifoSize();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING:
				return isReaderActivating();
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
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED:
				setControlled((Boolean)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER:
				setWriter((DataLinkWriter)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER:
				setReader((DataReaderInstance)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE:
				setReaderFifoSize((BigInteger)newValue);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING:
				setReaderActivating((Boolean)newValue);
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
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID:
				unsetId();
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED:
				unsetControlled();
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER:
				setWriter((DataLinkWriter)null);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER:
				setReader((DataReaderInstance)null);
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE:
				unsetReaderFifoSize();
				return;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING:
				unsetReaderActivating();
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
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__ID:
				return isSetId();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__CONTROLLED:
				return isSetControlled();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__WRITER:
				return writer != null;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER:
				return reader != null;
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_FIFO_SIZE:
				return isSetReaderFifoSize();
			case EdtimplementationPackage.DATA_LINK_ACTIVATABLE_FIFO__READER_ACTIVATING:
				return isSetReaderActivating();
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", controlled: ");
		if (controlledESet) result.append(controlled); else result.append("<unset>");
		result.append(", readerFifoSize: ");
		if (readerFifoSizeESet) result.append(readerFifoSize); else result.append("<unset>");
		result.append(", readerActivating: ");
		if (readerActivatingESet) result.append(readerActivating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DataLinkActivatableFifoImpl
