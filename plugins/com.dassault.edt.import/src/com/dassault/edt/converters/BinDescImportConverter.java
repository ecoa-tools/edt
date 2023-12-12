/**
 * Copyright (c) 2023 Dassault Aviation 
 * 
 * SPDX-License-Identifier: MIT
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtbin.EdtbinFactory;
import edtimplementation.ComponentImplementation;
import edtimplementation.ModuleImplementation;
import technology.ecoa.bin.desc._2.BinDesc;
import technology.ecoa.bin.desc._2.BinaryModule;

/**
 * Convert imported ECOA BinDesc objects to EDT objects
 *
 */
public class BinDescImportConverter {
	private static final EdtbinFactory EDTBINFACTORY = EdtbinFactory.eINSTANCE;

	private BinDescImportConverter() {
	}

	/**
	 * Create a EDT model BinDesc from a Ecoa model BinDesc
	 * 
	 * @param ecoaBinDesc                : ECOA BinDesc object
	 * @param edtComponentImplementation : ComponentImplementation
	 * @param fileName                   : name of file
	 * @return edtBinDesc
	 * @throws FailedImportException : failure if ModuleImplementation not found for
	 *                               attribute reference
	 */
	public static edtbin.BinDesc createEDTBinDesc(BinDesc ecoaBinDesc,
			ComponentImplementation edtComponentImplementation, String fileName) throws FailedImportException {

// 		Create empty EDT BinDesc
		var edtBinDesc = EDTBINFACTORY.createBinDesc();
		edtBinDesc.setFileName(fileName);

//		Set InsertionPolicies
		edtBinDesc.setInsertionPolicy(ecoaBinDesc.getInsertionPolicy());

//		Set ProcessorTarget Type
		if (ecoaBinDesc.getProcessorTarget() != null) {
			edtBinDesc.setProcessorTargetType(ecoaBinDesc.getProcessorTarget().getType());
		}

//		Set BinaryModules
		EList<BinaryModule> ecoaBinaryModules = ecoaBinDesc.getBinaryModule();
		for (BinaryModule ecoaBinaryModule : ecoaBinaryModules) {
			edtBinDesc.getBinaryModules().add(createEDTBinaryModule(edtComponentImplementation, ecoaBinaryModule));
		}

		return edtBinDesc;
	}

	/**
	 * @param edtComponentImplementation
	 * @param ecoaBinaryModule
	 * @return binary module
	 * @throws FailedImportException
	 */
	private static edtbin.BinaryModule createEDTBinaryModule(ComponentImplementation edtComponentImplementation,
			BinaryModule ecoaBinaryModule) throws FailedImportException {
		edtbin.BinaryModule edtBinaryModule = EDTBINFACTORY.createBinaryModule();
		edtBinaryModule.setChecksum(ecoaBinaryModule.getChecksum());
		edtBinaryModule.setHeapSize(ecoaBinaryModule.getHeapSize());
		edtBinaryModule.setObject(ecoaBinaryModule.getObject());
		edtBinaryModule.setStackSize(ecoaBinaryModule.getStackSize());
		edtBinaryModule.setUserContextSize(ecoaBinaryModule.getUserContextSize());
		edtBinaryModule.setWarmStartContextSize(ecoaBinaryModule.getWarmStartContextSize());
		edtBinaryModule.getBinaryDependencies().addAll(ecoaBinaryModule.getBinaryDependency());
		ModuleImplementation findModuleImplementationByName = edtComponentImplementation
				.findModuleImplementationByName(ecoaBinaryModule.getReference());
		if (findModuleImplementationByName != null) {
			edtBinaryModule.setReference(findModuleImplementationByName);
		} else {
			throw new FailedImportException("The name" + ecoaBinaryModule.getReference()
					+ " does not correspond to the name of a ModuleImplementation in "
					+ edtComponentImplementation.getName());
		}
		return edtBinaryModule;
	}

}
