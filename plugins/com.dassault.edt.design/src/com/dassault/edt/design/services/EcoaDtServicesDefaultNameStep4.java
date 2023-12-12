/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.dassault.edt.utils.EcoadtServices;

import edtbin.BinDesc;
import edtimplementation.ComponentImplementation;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventReceived;
import edtimplementation.EventSent;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.Instance;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.Parameter;
import edtimplementation.PrivatePinfo;
import edtimplementation.PublicPinfo;
import edtimplementation.RequestReceived;
import edtimplementation.RequestSent;
import edtimplementation.TriggerInstance;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataWritten;
import edtproject.Step4;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDefaultNameStep4 {

	private EcoadtServices service = new EcoadtServices();

	/**
	 * Count the amount of ComponentImplementation contained in Step4.
	 *
	 * @param componentImplementation - active ComponentImplementation
	 * @return the amount of ComponentImplementation contained in Step4
	 */
	public String countComponentImplementation(ComponentImplementation componentImplementation) {
		Step4 step4 = ((Step4) componentImplementation.eContainer());

		String newComponentImplementationName = EcoaDtServicesDefaultName.checkNameWhenCreate(
				"NewComponentImplementation_C" + step4.getComponentImplementations().size(),
				step4.getComponentImplementations().toArray(new ComponentImplementation[0]),
				step4.getComponentImplementations().size());
		createComponentImplementationDiagram(componentImplementation, newComponentImplementationName);
		return newComponentImplementationName;

	}

	/**
	 * Count the amount of BinDesc contained in Step4.
	 *
	 * @param binDesc - active BinDesc
	 * @return the amount of BinDesc contained in Step4
	 */
	public String countBinDesc(BinDesc binDesc) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) binDesc.eContainer());
		if (componentImplementation.getBinDesc().size() == 0) {
			return "bin-desc.xml";
		}
		String newBinDescName = EcoaDtServicesDefaultName.checkNameWhenCreate(
				"bin" + componentImplementation.getBinDesc().size() + ".bin-desc.xml",
				componentImplementation.getBinDesc().toArray(new BinDesc[0]),
				componentImplementation.getBinDesc().size());

		return newBinDescName;

	}

	/**
	 * Count the amount of ModuleType contained in a ComponentImplementation.
	 *
	 * @param moduleType - active ModuleType
	 * @return the amount of ModuleType contained in the ComponentImplementation
	 */
	public String countModuleTypes(ModuleType moduleType) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleType.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Mt_" + componentImplementation.getModuleTypes().size(),
				componentImplementation.getModuleTypes().toArray(new ModuleType[0]),
				componentImplementation.getModuleTypes().size());
	}

	/**
	 * Count the amount of External contained in a ComponentImplementation.
	 *
	 * @param external - active External
	 * @return the amount of External contained in the ComponentImplementation
	 */
	public String countExternal(ExternalSenderOperation external) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) external.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate(
				"External" + componentImplementation.getExternalSenders().size(),
				componentImplementation.getExternalSenders().toArray(new ExternalSenderOperation[0]),
				componentImplementation.getExternalSenders().size());
	}

	/**
	 * Count the amount of Property contained in a ModuleType.
	 *
	 * @param data - active Property
	 * @return the amount of Property contained in the ModuleType
	 */
	public String countModuleTypeProperty(ModuleTypeProperty data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Property" + moduleType.getProperties().size(),
				moduleType.getProperties().toArray(new ModuleTypeProperty[0]), moduleType.getProperties().size());

	}

	/**
	 * Count the amount of PublicPinfo contained in a ModuleType.
	 *
	 * @param data - active PublicPinfo
	 * @return the amount of PublicPinfo contained in the ModuleType
	 */
	public String countModuleTypePublicPinfo(PublicPinfo data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		int publicCount = 0;
		for (int i = 0; i < moduleType.getPinfo().size(); i++) {
			if ((moduleType.getPinfo().get(i)) instanceof PublicPinfo) {
				publicCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("PublicPinfo" + publicCount,
				moduleType.getPinfo().toArray(new ModuleTypePinfo[0]), publicCount);
	}

	/**
	 * Count the amount of PublicPinfo contained in a ModuleType.
	 *
	 * @param data - active PublicPinfo
	 * @return the amount of PublicPinfo contained in the ModuleType
	 */
	public String countModuleTypePrivatePinfo(PrivatePinfo data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		int privateCount = 0;
		for (int i = 0; i < moduleType.getPinfo().size(); i++) {
			if ((moduleType.getPinfo().get(i)) instanceof PrivatePinfo) {
				privateCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("PrivatePinfo" + privateCount,
				moduleType.getPinfo().toArray(new ModuleTypePinfo[0]), privateCount);
	}

	/**
	 * Count the amount of Versioned Data Written contained in a ModuleType.
	 *
	 * @param data - active Versioned Data Written
	 * @return the amount of Versioned Data Written contained in the ModuleType
	 */
	public String countModuleTypeDataWritten(VersionedDataWritten data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		int dataCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof VersionedDataWritten) {
				dataCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("DataWritten" + dataCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), dataCount);
	}

	/**
	 * Count the amount of Versioned Data Read contained in a ModuleType.
	 *
	 * @param data - active Versioned Data Read
	 * @return the amount of Versioned Data Read contained in the ModuleType
	 */
	public String countModuleTypeDataRead(VersionedDataRead data) {
		ModuleType moduleType = ((ModuleType) data.eContainer());
		int dataCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof VersionedDataRead) {
				dataCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("DataRead" + dataCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), dataCount);
	}

	/**
	 * Count the amount of EventSent contained in a ModuleType.
	 *
	 * @param event - active EventSent
	 * @return the amount of EventSent contained in the ModuleType
	 */
	public String countModuleTypeEventSent(EventSent event) {
		ModuleType moduleType = ((ModuleType) event.eContainer());
		int eventCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof EventSent) {
				eventCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("EventSent" + eventCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), eventCount);
	}

	/**
	 * Count the amount of EventReceived contained in a ModuleType.
	 *
	 * @param event - active EventReceived
	 * @return the amount of EventReceived contained in the ModuleType
	 */
	public String countModuleTypeEventReceived(EventReceived event) {
		ModuleType moduleType = ((ModuleType) event.eContainer());
		int eventCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof EventReceived) {
				eventCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("EventReceived" + eventCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), eventCount);
	}

	/**
	 * Count the amount of inputs contained in a EventSent or EventReceived.
	 *
	 * @param eventInput parameter - active Event parameter
	 * @return the amount of inputs contained in the Event
	 */
	public String countModuleTypeEventInputs(Parameter eventInput) {
		EList<Parameter> inputs = new BasicEList<>();
		if (eventInput.eContainer() instanceof EventSent eventSent) {
			inputs = eventSent.getInput();
		} else if (eventInput.eContainer() instanceof EventReceived eventReceived) {
			inputs = eventReceived.getInput();
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Input" + inputs.size(), inputs.toArray(new Parameter[0]),
				inputs.size());
	}

	/**
	 * Count the amount of RequestReceived contained in a ModuleType.
	 *
	 * @param request - active RequestReceived
	 * @return the amount of RequestReceived contained in the ModuleType
	 */
	public String countModuleTypeRequestReceived(RequestReceived request) {
		ModuleType moduleType = ((ModuleType) request.eContainer());
		int requestCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof RequestReceived) {
				requestCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("RequestReceived" + requestCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), requestCount);
	}

	/**
	 * Count the amount of RequestSent contained in a ModuleType.
	 *
	 * @param request - active RequestSent
	 * @return the amount of RequestSent contained in the ModuleType
	 */
	public String countModuleTypeRequestSent(RequestSent request) {
		ModuleType moduleType = ((ModuleType) request.eContainer());
		int requestCount = 0;
		for (int i = 0; i < moduleType.getOperations().size(); i++) {
			if ((moduleType.getOperations().get(i)) instanceof RequestSent) {
				requestCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("RequestSent" + requestCount,
				moduleType.getOperations().toArray(new ModuleOperation[0]), requestCount);
	}

	/**
	 * Count the amount of inputs contained in a RequestReceived or RequestSent.
	 *
	 * @param requestInput parameter - active Request parameter
	 * @return the amount of inputs contained in the Request
	 */
	public String countModuleTypeRequestInputs(Parameter requestInput) {
		EList<Parameter> inputs = new BasicEList<>();
		if (requestInput.eContainer() instanceof RequestSent requestSent) {
			inputs = requestSent.getInput();
		} else if (requestInput.eContainer() instanceof RequestReceived requestReceived) {
			inputs = requestReceived.getInput();
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Input" + inputs.size(), inputs.toArray(new Parameter[0]),
				inputs.size());
	}

	/**
	 * Count the amount of outputs contained in a RequestReceived or RequestSent.
	 *
	 * @param requestOutput parameter - active Request parameter
	 * @return the amount of Outputs contained in the Request
	 */
	public String countModuleTypeRequestOutputs(Parameter requestOutput) {
		EList<Parameter> outputs = new BasicEList<>();
		if (requestOutput.eContainer() instanceof RequestSent requestSent) {
			outputs = requestSent.getOutput();
		} else if (requestOutput.eContainer() instanceof RequestReceived requestReceived) {
			outputs = requestReceived.getOutput();
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Output" + outputs.size(),
				outputs.toArray(new Parameter[0]), outputs.size());
	}

	/**
	 * Count the amount of ModuleImplementation contained in a
	 * ComponentImplementation.
	 *
	 * @param moduleImp - active ModuleImplementation
	 * @return the amount of ModuleImplementation contained in the
	 *         ComponentImplementation
	 */
	public String countModuleImplementations(ModuleImplementation moduleImp) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleImp.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate(
				"M_Im" + componentImplementation.getModuleImplementations().size(),
				componentImplementation.getModuleImplementations().toArray(new ModuleImplementation[0]),
				componentImplementation.getModuleImplementations().size());
	}

	/**
	 * Count the amount of ModuleInstance contained in a ComponentImplementation.
	 *
	 * @param moduleInstance - active ModuleInstance
	 * @return the amount of ModuleInstance contained in the ComponentImplementation
	 */
	public String countModuleInstances(ModuleInstance moduleInstance) {
		ComponentImplementation componentImplementation = ((ComponentImplementation) moduleInstance.eContainer());

		EList<Instance> instances = componentImplementation.getInstances();
		int newNumberOfModuleInstances = 0;
		for (Instance instance : instances) {
			if (instance instanceof ModuleInstance) {
				newNumberOfModuleInstances++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("M" + newNumberOfModuleInstances,
				componentImplementation.getInstances().toArray(new Instance[0]), newNumberOfModuleInstances);
	}

	/**
	 * Count the amount of Parameters contained in a DynamicTriggerInstance.
	 *
	 * @param parameter - active Parameter
	 * @return the amount of Parameters contained in the DynamicTriggerInstance
	 */
	public String countDTriggerParameter(edtimplementation.Parameter parameter) {
		DynamicTriggerInstance dynamicTriggerInstance = ((DynamicTriggerInstance) parameter.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Param" + dynamicTriggerInstance.getParameter().size(),
				dynamicTriggerInstance.getParameter().toArray(new Parameter[0]),
				dynamicTriggerInstance.getParameter().size());
	}

	/**
	 * Count the amount of TriggerInstance contained in a ComponentImplementation
	 * and set Operations
	 * 
	 * @param triggerInstance - active TriggerInstance
	 * @return the amount of TriggerInstance contained in the
	 *         ComponentImplementation
	 */
	public String countAndSetOperationOfTriggerInstance(TriggerInstance triggerInstance) {
		edtimplementation.TriggerSender triggerOperation = EdtimplementationFactory.eINSTANCE.createTriggerSender();
		triggerOperation.setName("out");
		triggerInstance.setOperations(triggerOperation);

		ComponentImplementation componentImplementation = (ComponentImplementation) triggerInstance.eContainer();
		EList<Instance> instances = componentImplementation.getInstances();
		int newNumberOfTriggerInstances = 0;
		for (Instance instance : instances) {
			if (instance instanceof TriggerInstance) {
				newNumberOfTriggerInstances++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Trigger" + newNumberOfTriggerInstances,
				componentImplementation.getInstances().toArray(new Instance[0]), newNumberOfTriggerInstances);
	}

	/**
	 * Count the amount of DynamicTriggerInstance contained in a
	 * ComponentImplementation and set Operations
	 * 
	 * @param dynamicTriggerInstance - active DynamicTriggerInstance
	 * @return the amount of DynamicTriggerInstance contained in the
	 *         ComponentImplementation
	 */
	public String countAndSetOperationOfDynamicTriggerInstance(DynamicTriggerInstance dynamicTriggerInstance) {
		edtimplementation.DynamicTriggerEventReceiverInstance reset = EdtimplementationFactory.eINSTANCE
				.createDynamicTriggerEventReceiverInstance();
		reset.setName("reset");
		edtimplementation.DynamicTriggerEventReceiverInstance in = EdtimplementationFactory.eINSTANCE
				.createDynamicTriggerEventReceiverInstance();
		in.setName("in");
		edtimplementation.DynamicTriggerEventSenderInstance out = EdtimplementationFactory.eINSTANCE
				.createDynamicTriggerEventSenderInstance();
		out.setName("out");
		dynamicTriggerInstance.getOperations().add(reset);
		dynamicTriggerInstance.getOperations().add(in);
		dynamicTriggerInstance.getOperations().add(out);

		ComponentImplementation componentImplementation = (ComponentImplementation) dynamicTriggerInstance.eContainer();
		EList<Instance> instances = componentImplementation.getInstances();
		int newNumberOfDynamicTriggerInstances = 0;
		for (Instance instance : instances) {
			if (instance instanceof DynamicTriggerInstance) {
				newNumberOfDynamicTriggerInstances++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("DynamicTrigger" + newNumberOfDynamicTriggerInstances,
				componentImplementation.getInstances().toArray(new Instance[0]), newNumberOfDynamicTriggerInstances);
	}

	/**
	 * Create ComponentImplementationDiagram
	 * 
	 * @param componentImplementation        : componentImplementation created
	 * @param newComponentImplementationName : componentImplementation name
	 */
	public void createComponentImplementationDiagram(ComponentImplementation componentImplementation,
			String newComponentImplementationName) {
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil
				.getEditingDomain(componentImplementation);
		transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {

			@Override
			protected void doExecute() {
				Collection<RepresentationDescription> descs = DialectManager.INSTANCE
						.getAvailableRepresentationDescriptions(service.getSession().getSelectedViewpoints(false),
								componentImplementation);
				for (RepresentationDescription desc : descs) {
					if (DialectManager.INSTANCE.canCreate(componentImplementation, desc)) {
						DialectManager.INSTANCE.createRepresentation(newComponentImplementationName + " Graphical View",
								componentImplementation, desc, service.getSession(), new NullProgressMonitor());
						service.getSession().save(new NullProgressMonitor());
						IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages();
						for (IWorkbenchPage representationDescription : pages) {
							IEditorReference[] editorReferences = representationDescription.getEditorReferences();
							for (IEditorReference representationDescription2 : editorReferences) {
								if (Objects.equals(newComponentImplementationName + " Graphical View",
										representationDescription2.getName())) {
									DiagramEditPart diagramEditPart = null;
									IEditorPart editor = representationDescription2.getEditor(false);
									if (editor instanceof DiagramEditor) {
										DiagramEditor diagramEditor = (DiagramEditor) editor;
										diagramEditPart = diagramEditor.getDiagramEditPart();

										ArrangeRequest arrangeRequest = new ArrangeRequest(
												ActionIds.ACTION_ARRANGE_ALL);
										ArrayList<Object> partsToArrange = new ArrayList<Object>(1);
										partsToArrange.add(diagramEditPart);
										arrangeRequest.setPartsToArrange(partsToArrange);
										diagramEditPart.performRequest(arrangeRequest);
									}
								}
							}
							service.getSession().save(new NullProgressMonitor());
						}
					}
				}
			}
		});
	}

}
