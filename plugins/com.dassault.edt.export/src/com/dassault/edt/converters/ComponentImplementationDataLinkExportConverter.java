/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import edtimplementation.DataLink;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.ModuleInstance;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.ReadersType;
import technology.ecoa.implementation._2.WritersType;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationDataLinkExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationDataLinkExportConverter() {

	}

	/**
	 * Convert EDT DataLinks to ECOA DataLinks
	 * 
	 * @param edtDataLinks : EDT objects to convert
	 * @return ecoaDataLinks : Converted objects
	 */
	public static ArrayList<technology.ecoa.implementation._2.DataLink> recreateDataLinks(
			ArrayList<DataLink> edtDataLinks) {
		ArrayList<technology.ecoa.implementation._2.DataLink> ecoaDataLinks = new ArrayList<>();
		ConcurrentHashMap<OpWriter, ArrayList<OpReader>> dataLinkAssociationFromWriter = new ConcurrentHashMap<>();
		ConcurrentHashMap<OpReader, ArrayList<OpWriter>> dataLinkAssociationFromReader = new ConcurrentHashMap<>();
//		Recreate links
		for (DataLink edtOperationLink : edtDataLinks) {
			convertDataLinksToHashMap(dataLinkAssociationFromWriter, dataLinkAssociationFromReader, edtOperationLink);
		}
		ArrayList<OpWriter> toJump = new ArrayList<>();
		ArrayList<OpWriter> nonUniqueWriters = new ArrayList<>();
		for (Entry<OpWriter, ArrayList<OpReader>> entry : dataLinkAssociationFromWriter.entrySet()) {
			OpWriter writer = entry.getKey();
			if (!toJump.contains(writer)) {
				ArrayList<OpReader> readers = entry.getValue();
				if (writer.writer instanceof DataWriterInstance uniqueWriter) {
					ArrayList<OpWriter> trueWriters = new ArrayList<>();
					trueWriters.add(writer);

					for (OpReader reader : readers) {
						ArrayList<OpWriter> writersOfReader = dataLinkAssociationFromReader.get(reader);

//					Suppose that if DataWriterInstance, contains exactly the same readers, else problem of unicity
						for (OpWriter writerOfReader : writersOfReader) {
							if (!Objects.equals(writer, writerOfReader) && !toJump.contains(writerOfReader)
									&& dataLinkAssociationFromWriter.get(writerOfReader).containsAll(readers)
									&& Objects.equals(writer.id, writerOfReader.id)
									&& Objects.equals(writer.controlled, writerOfReader.controlled)) {
								trueWriters.add(writerOfReader);
								if (Objects.equals(dataLinkAssociationFromWriter.get(writerOfReader), readers)) {
									dataLinkAssociationFromWriter.remove(writerOfReader);
									nonUniqueWriters.remove(writerOfReader);
									toJump.add(writerOfReader);
								} else {
									dataLinkAssociationFromWriter.get(writerOfReader).removeAll(readers);
								}
							}
						}
					}

					if (!readers.isEmpty() && !trueWriters.isEmpty()) {
						technology.ecoa.implementation._2.DataLink ecoaDataLink = recreateECOADataLink(writer, readers,
								trueWriters);
						ecoaDataLinks.add(ecoaDataLink);
					}
				} else {
					nonUniqueWriters.add(writer);
				}
			}

		}
		Iterator<OpWriter> iterator = nonUniqueWriters.iterator();
		while (iterator.hasNext()) {
			OpWriter opWriter = iterator.next();
			if (!toJump.contains(opWriter)) {
				ArrayList<OpReader> readers = dataLinkAssociationFromWriter.get(opWriter);
				ArrayList<OpWriter> trueWriters = new ArrayList<>();
				trueWriters.add(opWriter);
				for (OpReader reader : readers) {
					ArrayList<OpWriter> writersOfReader = dataLinkAssociationFromReader.get(reader);

//				Suppose that if DataWriterInstance, contains exactly the same readers, else problem of unicity

					for (OpWriter writerOfReader : writersOfReader) {
						if (!Objects.equals(opWriter, writerOfReader)
								&& dataLinkAssociationFromWriter.get(writerOfReader) != null
								&& dataLinkAssociationFromWriter.get(writerOfReader).containsAll(readers)
								&& Objects.equals(opWriter.id, writerOfReader.id)
								&& Objects.equals(opWriter.controlled, writerOfReader.controlled)) {
							trueWriters.add(writerOfReader);
							if (Objects.equals(dataLinkAssociationFromWriter.get(writerOfReader), readers)) {
								dataLinkAssociationFromWriter.remove(writerOfReader);
								toJump.add(writerOfReader);
							} else {
								dataLinkAssociationFromWriter.get(writerOfReader).removeAll(readers);
							}
						}
					}
				}
				technology.ecoa.implementation._2.DataLink ecoaDataLink = recreateECOADataLink(opWriter, readers,
						trueWriters);
				ecoaDataLinks.add(ecoaDataLink);
			}
		}

		return ecoaDataLinks;

	}

	/**
	 * @param writer
	 * @param readers
	 * @param trueWriters
	 * @return
	 */
	private static technology.ecoa.implementation._2.DataLink recreateECOADataLink(OpWriter writer,
			ArrayList<OpReader> readers, ArrayList<OpWriter> trueWriters) {
		technology.ecoa.implementation._2.DataLink ecoaDataLink = IMPFACTORY.createDataLink();
		WritersType writersType = IMPFACTORY.createWritersType();
		ReadersType readersType = IMPFACTORY.createReadersType();
		if (writer.id != null) {
			ecoaDataLink.setId(writer.id);
		}

		if (writer.controlled != null) {
			ecoaDataLink.setControlled(writer.controlled);
		}

		for (OpWriter opWriter : trueWriters) {
			if (opWriter.writer instanceof VersionedDataReferenceInstance versionedData) {
				OpRef opRef = IMPFACTORY.createOpRef();

				opRef.setInstanceName(((ReferenceOfLinkedComponentDefinition) versionedData.eContainer()).getName());
				opRef.setOperationName(versionedData.getName());

				writersType.getReference().add(opRef);
			} else if (opWriter.writer instanceof DataWriterInstance dataInstance) {
				OpRef opRef = IMPFACTORY.createOpRef();

				opRef.setInstanceName(((ModuleInstance) dataInstance.eContainer()).getName());
				opRef.setOperationName(dataInstance.getName());

				writersType.getModuleInstance().add(opRef);
			}
		}
		for (OpReader opReader : readers) {
			if (opReader instanceof OpActivatableFifo dataReaderInstance) {
				OpRefActivatableFifo opRefActivatableFifo = IMPFACTORY.createOpRefActivatableFifo();

				if (dataReaderInstance.activating != null) {
					opRefActivatableFifo.setActivating(dataReaderInstance.activating);
				}

				if (dataReaderInstance.fifo != null) {
					opRefActivatableFifo.setFifoSize(dataReaderInstance.fifo);
				}

				opRefActivatableFifo
						.setInstanceName(((ModuleInstance) dataReaderInstance.reader.eContainer()).getName());
				opRefActivatableFifo.setOperationName(dataReaderInstance.reader.getName());

				readersType.getModuleInstance().add(opRefActivatableFifo);
			} else if (opReader instanceof OpServ versionedData) {
				OpRef opRef = IMPFACTORY.createOpRef();

				opRef.setInstanceName(
						((ServiceOfLinkedComponentDefinition) versionedData.reader.eContainer()).getName());
				opRef.setOperationName(versionedData.reader.getName());

				readersType.getService().add(opRef);
			}
		}
		ecoaDataLink.setWriters(writersType);
		ecoaDataLink.setReaders(readersType);
		return ecoaDataLink;
	}

	/**
	 * @param dataLinkAssociationFromWriter
	 * @param dataLinkAssociationFromReader
	 * @param edtOperationLink
	 */
	private static void convertDataLinksToHashMap(
			ConcurrentHashMap<OpWriter, ArrayList<OpReader>> dataLinkAssociationFromWriter,
			ConcurrentHashMap<OpReader, ArrayList<OpWriter>> dataLinkAssociationFromReader, DataLink edtOperationLink) {
		Integer id = null;
		if (edtOperationLink.isSetId()) {
			id = edtOperationLink.getId();
		}

		Boolean controlled = null;
		if (edtOperationLink.isSetControlled()) {
			controlled = edtOperationLink.isControlled();
		}
		if (edtOperationLink instanceof DataLinkToServiceOperation dataLink && dataLink.getWriter() != null
				&& dataLink.getReader() != null) {
			DataWriterInstance writer = dataLink.getWriter();
			OpWriter opServWrite = new OpWriter(id, controlled, writer);
			VersionedDataServiceInstance reader = dataLink.getReader();
			OpServ opServ = new OpServ(reader, id);
			dataLinkAssociationFromWriter.putIfAbsent(opServWrite, new ArrayList<>());
			if (!dataLinkAssociationFromWriter.get(opServWrite).contains(opServ)) {
				dataLinkAssociationFromWriter.get(opServWrite).add(opServ);
			}
			dataLinkAssociationFromReader.putIfAbsent(opServ, new ArrayList<>());
			if (!dataLinkAssociationFromReader.get(opServ).contains(opServWrite)) {
				dataLinkAssociationFromReader.get(opServ).add(opServWrite);
			}

		} else if (edtOperationLink instanceof DataLinkActivatableFifo dataLink && dataLink.getWriter() != null
				&& dataLink.getReader() != null) {
			DataLinkWriter writer = dataLink.getWriter();
			OpWriter opServWrite = new OpWriter(id, controlled, writer);

			BigInteger readerFifoSize = null;
			if (dataLink.isSetReaderFifoSize()) {
				readerFifoSize = dataLink.getReaderFifoSize();
			}

			Boolean activating = null;
			if (dataLink.isSetReaderActivating()) {
				activating = dataLink.isReaderActivating();
			}

			DataReaderInstance reader = dataLink.getReader();
			OpActivatableFifo opRef = new OpActivatableFifo(readerFifoSize, activating, reader, id);
			dataLinkAssociationFromWriter.putIfAbsent(opServWrite, new ArrayList<>());
			dataLinkAssociationFromWriter.get(opServWrite).add(opRef);

			dataLinkAssociationFromReader.putIfAbsent(opRef, new ArrayList<>());
			dataLinkAssociationFromReader.get(opRef).add(opServWrite);

		}
	}

	static class OpActivatableFifo implements OpReader {
		protected Integer id;
		protected Boolean activating;
		protected BigInteger fifo;
		protected edtimplementation.DataReaderInstance reader;

		public OpActivatableFifo(BigInteger fifo, Boolean activating, edtimplementation.DataReaderInstance reader,
				Integer id) {
			this.activating = activating;
			this.fifo = fifo;
			this.reader = reader;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(activating, fifo, id, reader);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpActivatableFifo other = (OpActivatableFifo) obj;
			return Objects.equals(activating, other.activating) && Objects.equals(fifo, other.fifo)
					&& Objects.equals(id, other.id) && Objects.equals(reader, other.reader);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static class OpServ implements OpReader {
		protected edtimplementation.VersionedDataServiceInstance reader;
		protected Integer id;

		public OpServ(VersionedDataServiceInstance reader, Integer id) {
			this.reader = reader;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, reader);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpServ other = (OpServ) obj;
			return Objects.equals(id, other.id) && Objects.equals(reader, other.reader);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static interface OpReader {
		public Integer getId();
	}

	static class OpWriter {
		protected Boolean controlled;
		protected Integer id;
		protected edtimplementation.DataLinkWriter writer;

		public OpWriter(Integer id, Boolean controlled, edtimplementation.DataLinkWriter writer) {
			this.controlled = controlled;
			this.id = id;
			this.writer = writer;
		}

		@Override
		public int hashCode() {
			return Objects.hash(controlled, id, writer);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpWriter other = (OpWriter) obj;
			return Objects.equals(controlled, other.controlled) && Objects.equals(id, other.id)
					&& Objects.equals(writer, other.writer);
		}

	}
}
