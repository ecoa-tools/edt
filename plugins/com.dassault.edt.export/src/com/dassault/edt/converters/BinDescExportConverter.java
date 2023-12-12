/**
 * Copyright (c) 2023 Dassault Aviation 
 * 
 * SPDX-License-Identifier: MIT
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtbin.BinDesc;
import edtbin.BinaryModule;
import technology.ecoa.bin.desc._2.DocumentRoot;
import technology.ecoa.bin.desc._2.binFactory;

/**
 * Convert imported ECOA BinDesc objects to EDT objects
 *
 */
public class BinDescExportConverter {
	private static final binFactory ECOABINFACTORY = binFactory.eINSTANCE;

	private BinDescExportConverter() {
	}

	/**
	 * Create a ECOA model BinDesc from a EDT model BinDesc
	 * 
	 * @param edtBinDesc                     : ECOA BinDesc
	 * @param edtComponentImplementationName : name of ComponentImplementation
	 * @return ecoaBinDesc
	 */
	public static technology.ecoa.bin.desc._2.DocumentRoot recreateECOABinDesc(BinDesc edtBinDesc,
			String edtComponentImplementationName) {

// 		Create empty EDT BinDesc
		technology.ecoa.bin.desc._2.BinDesc ecoaBinDesc = ECOABINFACTORY.createBinDesc();

//		Set InsertionPolicies
		if (edtBinDesc.getInsertionPolicy() != null && !edtBinDesc.getInsertionPolicy().isBlank()) {
			ecoaBinDesc.setInsertionPolicy(edtBinDesc.getInsertionPolicy());
		}

//		Set ComponentImplementation
		ecoaBinDesc.setComponentImplementation(edtComponentImplementationName);

//		Set ProcessorTarget Type
		if (edtBinDesc.getProcessorTargetType() != null && !edtBinDesc.getProcessorTargetType().isBlank()) {
			technology.ecoa.bin.desc._2.ProcessorTarget ecoaProcessorTarget = ECOABINFACTORY.createProcessorTarget();
			ecoaProcessorTarget.setType(edtBinDesc.getProcessorTargetType());
			ecoaBinDesc.setProcessorTarget(ecoaProcessorTarget);
		}

//		Set BinaryModules
		EList<BinaryModule> edtBinaryModules = edtBinDesc.getBinaryModules();
		for (BinaryModule edtBinaryModule : edtBinaryModules) {
			ecoaBinDesc.getBinaryModule().add(recreateECOABinaryModule(edtBinaryModule));
		}

		DocumentRoot documentRoot = ECOABINFACTORY.createDocumentRoot();
		documentRoot.setBinDesc(ecoaBinDesc);
		return documentRoot;
	}

	/**
	 * @param edtBinaryModule
	 * @return binary module
	 * @throws FailedImportException
	 */
	private static technology.ecoa.bin.desc._2.BinaryModule recreateECOABinaryModule(BinaryModule edtBinaryModule) {
		technology.ecoa.bin.desc._2.BinaryModule ecoaBinaryModule = ECOABINFACTORY.createBinaryModule();
		if (edtBinaryModule.getChecksum() != null && !edtBinaryModule.getChecksum().isBlank()) {
			ecoaBinaryModule.setChecksum(edtBinaryModule.getChecksum());
		}

		if (edtBinaryModule.getHeapSize() != null && !edtBinaryModule.getHeapSize().isBlank()) {
			ecoaBinaryModule.setHeapSize(edtBinaryModule.getHeapSize());
		}

		if (edtBinaryModule.getObject() != null && !edtBinaryModule.getObject().isBlank()) {
			ecoaBinaryModule.setObject(edtBinaryModule.getObject());
		}

		if (edtBinaryModule.getStackSize() != null && !edtBinaryModule.getStackSize().isBlank()) {
			ecoaBinaryModule.setStackSize(edtBinaryModule.getStackSize());
		}

		if (edtBinaryModule.getUserContextSize() != null && !edtBinaryModule.getUserContextSize().isBlank()) {
			ecoaBinaryModule.setUserContextSize(edtBinaryModule.getUserContextSize());
		}

		if (edtBinaryModule.getWarmStartContextSize() != null && !edtBinaryModule.getWarmStartContextSize().isBlank()) {
			ecoaBinaryModule.setWarmStartContextSize(edtBinaryModule.getWarmStartContextSize());
		}

		ecoaBinaryModule.getBinaryDependency().addAll(EcoreUtil.copyAll(edtBinaryModule.getBinaryDependencies()));
		if (edtBinaryModule.getReference() != null) {
			ecoaBinaryModule.setReference(edtBinaryModule.getReference().getName());
		}
		return ecoaBinaryModule;
	}

}
