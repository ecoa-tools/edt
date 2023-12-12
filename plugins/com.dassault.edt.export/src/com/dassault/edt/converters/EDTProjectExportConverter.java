/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.ValueType;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory;
import org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage;

import edtimplementation.ComponentImplementation;
import edtinterface.ServiceDefinition;
import edtproject.Component;
import edtproject.ComponentDefinition;
import edtproject.Composite;
import edtproject.OutputDirectory;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step3;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;
import edttype.EDTDataType;
import edttype.Library;
import edtuid.IDMap;
import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.EcoaProject;
import technology.ecoa.sca.extension.scaExt.Interface;
import technology.ecoa.sca.extension.scaExt.scaExtFactory;
import technology.ecoa.sca.extension.scaExt.scaExtPackage;
import temp.CrossPlatformView;

/**
 * Convert EDT Objects that can be present in multiples types of object to ECOA
 * Objects
 * 
 */
public class EDTProjectExportConverter {

	private EDTProjectExportConverter() {

	}

	/**
	 * Convert EDT Steps to ECOA Project (= project.xml class)
	 * 
	 * @param edtSteps    : EDT main container
	 * @param projectName : name of project
	 * @return EcoaProject
	 */
	public static EcoaProject recreateEcoaProject(Steps edtSteps, String projectName) {
//		Create empty ECOA Project
		technology.ecoa.project._2.projFactory projFactory = technology.ecoa.project._2.projFactory.eINSTANCE;
		EcoaProject ecoaProject = projFactory.createEcoaProject();

//		Set Name from Name given to Project by user.
		ecoaProject.setName(projectName);

//		Set outputDirectory
		OutputDirectory outputDirectory = edtSteps.getOutputDirectory();
		if (outputDirectory != null && outputDirectory.getName() != null) {
			ecoaProject.getOutputDirectory().add(outputDirectory.getName());
		}

//		Export Step0
		exportStep0(edtSteps, projFactory, ecoaProject);

//		Get ServiceDefinition files relative path
		exportStep1(edtSteps, projFactory, ecoaProject);

//		Get ComponentDefinition files relative path
		exportStep2(edtSteps, projFactory, ecoaProject);

//		Get InitialAssembly file relative path
		exportStep3(edtSteps, ecoaProject);

//		Get ComponentImplementation file relative path
		exportStep4(edtSteps, projFactory, ecoaProject);

//		Export integration
		exportStep5(edtSteps, projFactory, ecoaProject);
		return ecoaProject;
	}

	/**
	 * @param edtSteps
	 * @param projFactory
	 * @param ecoaProject
	 */
	private static void exportStep5(Steps edtSteps, technology.ecoa.project._2.projFactory projFactory,
			EcoaProject ecoaProject) {
		Step5 step5 = edtSteps.getStep5();
		if (step5 != null && step5.getFolderName() != null) {
			Composite composite = step5.getFinalAssembly().getFinalAssembly();
			if (composite != null && implementationSetInComponent(composite)) {
				String fileRelativePath = new File(step5.getFolderName(),
						step5.getFinalAssembly().getName() + ".impl.composite").getPath();
				ecoaProject.getImplementationAssembly().add(fileRelativePath);
			}

			if (step5.getLogicalSystem() != null) {
				String fileRelativePath = new File(step5.getFolderName(),
						step5.getLogicalSystem().getFileNamePrefix() + ".logical-system.xml").getPath();
				ecoaProject.getLogicalSystem().add(fileRelativePath);
			}

			edtdeployment.Deployment deployment = step5.getDeployment();
			if (deployment != null) {
				String fileRelativePath = new File(step5.getFolderName(), deployment.getName() + ".deployment.xml")
						.getPath();
				ecoaProject.getDeploymentSchema().add(fileRelativePath);
			}

			CrossPlatformView crossPlatformView = step5.getCrossPlatformView();
			if (crossPlatformView != null) {
				String fileRelativePath = new File(step5.getFolderName(), crossPlatformView.getName()).getPath();
				ecoaProject.getCrossPlatformsView().add(fileRelativePath);
			}

			EList<IDMap> ids = step5.getIDS();
			if (ids != null && !ids.isEmpty()) {
				ELIEUIDs elieuiDs = projFactory.createELIEUIDs();
				for (IDMap id : ids) {
					String fileRelativePath = new File(step5.getFolderName(), id.getName() + ".ids.xml").getPath();
					elieuiDs.getEUID().add(fileRelativePath);
				}
				ecoaProject.getEUIDs().add(elieuiDs);

			}

		}
	}

	/**
	 * @param edtSteps
	 * @param projFactory
	 * @param ecoaProject
	 */
	private static void exportStep4(Steps edtSteps, technology.ecoa.project._2.projFactory projFactory,
			EcoaProject ecoaProject) {
		var ciFiles = projFactory.createFiles();
		EList<String> ciFilesList = ciFiles.getFile();
		Step4 step4 = edtSteps.getStep4();
		if (step4 != null && step4.getFolderName() != null) {
			EList<ComponentImplementation> ci = step4.getComponentImplementations();
			if (!ci.isEmpty()) {
				for (ComponentImplementation componentImplementation : ci) {
					File componentImplementationSubdir = new File(step4.getFolderName(),
							componentImplementation.getName());
					String fileRelativePath = new File(componentImplementationSubdir,
							componentImplementation.getName() + ".impl.xml").getPath();
					ciFilesList.add(fileRelativePath);
				}
				ecoaProject.getComponentImplementations().add(ciFiles);
			}
		}
	}

	/**
	 * @param edtSteps
	 * @param ecoaProject
	 */
	private static void exportStep3(Steps edtSteps, EcoaProject ecoaProject) {
		Step3 step3 = edtSteps.getStep3();
		if (step3 != null && step3.getFolderName() != null) {
			Composite composite = step3.getInitialAssembly();
			if (composite != null && !(composite.getComponents().isEmpty())) {
				String fileRelativePath = new File(step3.getFolderName(), composite.getName() + ".composite").getPath();
				ecoaProject.getInitialAssembly().add(fileRelativePath);
			}
		}
	}

	/**
	 * @param edtSteps
	 * @param projFactory
	 * @param ecoaProject
	 */
	private static void exportStep2(Steps edtSteps, technology.ecoa.project._2.projFactory projFactory,
			EcoaProject ecoaProject) {
		var cdFiles = projFactory.createFiles();
		EList<String> cdFilesList = cdFiles.getFile();

		Step2 step2 = edtSteps.getStep2();
		if (step2 != null && step2.getFolderName() != null) {
			EList<ComponentDefinition> cd = step2.getComponentDefinitions();
			if (!cd.isEmpty()) {
				for (ComponentDefinition componentDefinition : cd) {
					File componentDefinitionSubdir = new File(step2.getFolderName(), componentDefinition.getName());
					String fileRelativePath = new File(componentDefinitionSubdir,
							componentDefinition.getName() + ".componentType").getPath();
					cdFilesList.add(fileRelativePath);
				}
				ecoaProject.getComponentDefinitions().add(cdFiles);
			}
		}
	}

	/**
	 * @param edtSteps
	 * @param projFactory
	 * @param ecoaProject
	 */
	private static void exportStep1(Steps edtSteps, technology.ecoa.project._2.projFactory projFactory,
			EcoaProject ecoaProject) {
		var sdFiles = projFactory.createFiles();
		EList<String> sdFilesList = sdFiles.getFile();

		Step1 step1 = edtSteps.getStep1();
		if (step1 != null && step1.getFolderName() != null) {
			EList<ServiceDefinition> sd = step1.getServices();
			if (!sd.isEmpty()) {
				for (ServiceDefinition serviceDefinition : sd) {
					String fileRelativePath = new File(step1.getFolderName(),
							serviceDefinition.getName() + ".interface.xml").getPath();
					sdFilesList.add(fileRelativePath);
				}
				ecoaProject.getServiceDefinitions().add(sdFiles);
			}
		}
	}

	/**
	 * @param edtSteps
	 * @param projFactory
	 * @param ecoaProject
	 */
	private static void exportStep0(Steps edtSteps, technology.ecoa.project._2.projFactory projFactory,
			EcoaProject ecoaProject) {
		// Get Library files relative path
		var typesFiles = projFactory.createFiles();
		EList<String> typesFilesList = typesFiles.getFile();

		Step0 step0 = edtSteps.getStep0();
		if (step0 != null && step0.getFolderName() != null) {
			EList<Library> types = step0.getTypes();
			if (!types.isEmpty()) {
				for (Library library : types) {
					String fileRelativePath = new File(step0.getFolderName(),
							library.getName().replaceAll("\\.", "__") + ".types.xml").getPath();
					typesFilesList.add(fileRelativePath);
				}
				ecoaProject.getTypes().add(typesFiles);
			}
		}
	}

	/**
	 * Reconverts the EDT Value string to a ECOA ValueType
	 * 
	 * @param value
	 * @return
	 */
	static ValueType recreateValueType(String value) {
//		Create empty ValueType
		var valueType = scaFactory.eINSTANCE.createValueType();

//		Add as FeatureMap, as there is no getValue
		valueType.getMixed().add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, value);

		return valueType;
	}

	/**
	 * Convert EDT Property to ECOA Property
	 * 
	 * @param edtProperty
	 * @return
	 */
	static Property recreateProperty(edtproject.Property edtProperty) {
//		Create empty ECOA Property
		scaFactory factory = scaFactory.eINSTANCE;
		Property property = factory.createProperty();

//		Fill attributes from EDT Property
		property.setName(edtProperty.getName());

		if (edtProperty.isSetMustSupply()) {
			property.setMustSupply(edtProperty.isMustSupply());
		}

//		Recreate type
		var scaType = XMLTypeFactory.eINSTANCE.createQName("http://www.w3.org/2001/XMLSchema", "string");
		property.setType(scaType);

//		Recreate Property Value by adding as a FeatureMap, as there is no getValue
		if (edtProperty.getValue() != null && !edtProperty.getValue().isBlank()) {
			property.getAny().add(scaPackage.Literals.DOCUMENT_ROOT__VALUE, recreateValueType(edtProperty.getValue()));
		}

//		Recreate anyAttributes through FeatureMap
		EDTDataType ecoaScaType = edtProperty.getECOASCAType();

//		Add ecoa-sca:type if filled
		if (ecoaScaType != null) {
			String ecoaScaTypeValue;
			if (EDTDataType.isBasicOrPredefined(ecoaScaType)) {
				ecoaScaTypeValue = "ECOA:" + ecoaScaType.getName();
			} else {
				String namespace = ((edttype.Library) ecoaScaType.eContainer()).getName();
				ecoaScaTypeValue = namespace + ":" + ecoaScaType.getName();
			}
			property.getAnyAttribute().add(scaExtPackage.Literals.DOCUMENT_ROOT__TYPE, ecoaScaTypeValue);
		}

//		Add ecoa-sca:library if filled
		if (edtProperty.getECOASCALibrary() != null) {
//			Demand library EStructuralFeature, as an any attribute can be anything it is a wildcard
			ExtendedMetaData modelMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
			EStructuralFeature eStructuralFeature = modelMetaData
					.demandFeature("http://www.ecoa.technology/sca-extension-2.0", "library", false);
			property.getAnyAttribute().add(eStructuralFeature, edtProperty.getECOASCALibrary().getName());
		}

		return property;
	}

	/**
	 * Convert ECOA Contract attributes to EDT Interface
	 * 
	 * @param edtContract : Service or reference where to transfer ecoa interface
	 *                    attributes
	 * @return ecoaInterface
	 */
	public static Interface recreateInterface(edtproject.Contract edtContract) {
//		Create empty ECOA Interface
		Interface ecoaInterface = scaExtFactory.eINSTANCE.createInterface();

//		Fill attributes
		if (edtContract.getQos() != null) {
			ecoaInterface.setQos(edtContract.getQos().getName());
		}

		if (edtContract.getSyntax() != null) {
			ecoaInterface.setSyntax(edtContract.getSyntax().getName());
		}

		return ecoaInterface;
	}

	/**
	 * Determines if composite is a initialAssembly or finalAssembly
	 * 
	 * @param composite : composite to test
	 * @return true if finalAssembly
	 */
	public static boolean implementationSetInComponent(Composite composite) {
		EList<Component> components = composite.getComponents();
		for (Component component : components) {
			if (component.getComponentImplementation() != null) {
				return true;
			}
		}
		return false;
	}
}
