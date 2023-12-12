Copyright 2023 Dassault Aviation

MIT License (see LICENSE.txt)


# ECOA Standard
http://www.ecoa.technology/

# Version of ECOA Standard
Architecture Specification, Issue 6

# Limitations

## General limitations
1) Some properties (see table below) are displayed with default values, even if they are not set. They will not be exported until the user clicks on the field and enter a value.

|Main Object |Object with the concerned attribute|Attribute|
| ------ | ------ |------ |
|Service Instance QoS |Operations|- Rate Time Frame <br>- Max Ageing <br> - Notification Max Handling Time|
|ComponentImplementation | ModuleType's VersionedDataRead and VersionedDataWritten | - maxVersions 
|| RequestResponseReceived | - Max Concurrents Requests
||RequestResponseSent |  - Max Concurrents Requests <br> - TimeOut|
||DynamicTriggerInstance|- Size|
||TriggerInstance|- Period|
|Deployment|PlatformConfiguration| - Fault Handler Notification Max Number|
|UDPBinding|Platform|- Max Channels <br> - Platform id|

2) The multiplicity attribute (ComponentDefinitionReference and ComponentReference) is modifiable, but its value is not exploited.

3) It is possible to create multiple Platforms in the LogicalSystem, but no verifications specific to multiplatform projects are done. For example, no verification is done on the ECOA Logical Interface (ELI).

4) Some objects do not have a name, thus in the Tree View their label corresponds to a composition of their attributes. When creating such objects, their label can contain 'invalid', their attributes being not set.

5) Properties of Composites (Assembly objects) and ComponentDefinition can only have type and library as SCA-extended ("ecoa-sca") attributes.
   ```xml
   <property name="xxx" type="xsd:string" ecoa-sca:library="xxx" ecoa-sca:type="xxx">
      <value>xxx</value>
   </property>
   ```

6) The documentation attribute that can be found in the Composites (Assembly objects) and the ComponentDefinitions is not available and can not be imported or exported.

7) All the comments present in the XML are lost during the import.

8) The Standalone Document Declaration (a priori always standalone="no") can not be stored and thus is neither imported or exported.

9) ECOA Design Tool use pre-established XML namespace prefixes that are not editable and can differ from the prefixes in the imported files:

|NameSpace |Prefix|
| ------ | ------ |  
|http://docs.oasis-open.org/ns/opencsa/sca/200912 | csa|  
|http://www.ecoa.technology/logicalsystem-2.0 | ecoa|  
|http://www.ecoa.technology/sca-extension-2.0 | ecoa-sca|  
|http://www.w3.org/2001/XMLSchema| xsd|
|Others| no prefix|

## File-specific limitations

| XML file | XSD file | ECOA Model object | Referenced by the ECOA project.xml file ? | Required in an ECOA project ? |Managed by ECOA Design Tool ?|ECOA Design Tool Limitations
| ------ | ------ |------ |------ |------ |------ |------ |
|*.project.xml|ecoa-types-2.0.xsd||
|**0-Types**|| 
| *.types.xml |ecoa-types-2.0.xsd| Library | Yes | No (Can use only BasicTypes) | Fully |
| **1-Services** |  |
| *.interface.xml |ecoa-interface-2.0.xsd| ServiceDefinition | Yes | Yes | Fully |
| **2-ComponentDefinitions** |  |
|*.componentType|sca-1.1-cd06-subset-2.0.xsd|ComponentDefinition|Yes | Yes | Fully |
|*.interface.qos.xml| ecoa-interface-qos-2.0.xsd|ServiceInstanceQoS| Referenced in ComponentDefinition Reference or Service| No | Fully | 
| **3-InitialAssembly** |  |
|*.composite|sca-1.1-cd06-subset-2.0.xsd|Composite| Yes | No (only FinalAssembly is required)| With limitations | 1) If multiple initialAssembly present in the project.xml, only the first one will be imported <br>2) Even if no initialAssembly, but only a finalAssembly existed in the imported project, an initialAssembly will be exported with all the attributes present in the FinalAssembly outside of the ComponentImplementation association. <br> 3) The file attribute of the ComponentProperty is fillable, but will not be verified
| **4-ComponentImplementation** |  |
|*.impl.xml|ecoa-implementation-2.0.xsd|ComponentImplementation| Yes | Yes | With limitations | 1) The GraphicalView requires the links to be one-to-one, thus for example a DataLink with multiple Writers and multiple Readers will be converted to readers_number*writers_number links. It has two consequences : <br> a)  The Operation Links are aggregated when exported, causing possible differences between file imported and exported <br>b) When creating links, no verification is done for EventReceived, DataWritten, DataRead, RequestReceived, RequestSent that they are in only one operation link<br> 2) The ModuleInstance Pinfo (Private or Public) Values are fillable, but not verified
|*.interface.qos.xml| ecoa-interface-qos-2.0.xsd|ServiceInstanceQoS| Referenced in ComponentImplementation Reference or Service  | No| Fully |
|*.behaviour.xml|ecoa-module-behaviour-2.0.xsd|ModuleBehaviour| Reference in ComponentImplementation Instance | No| Imported/exported but not editable |
|bin-desc.xml||BinDesc| Search for file containing "bin-desc.xml" | No| Imported/exported but not editable | |
|*_insertions_policies.xml|ecoa-insertion-policy-2.0.xsd|InsertionsPolicies| Referenced in BinDesc | No|  No |
| **5-Integration** |  |
|*.impl.composite|sca-1.1-cd06-subset-2.0.xsd|Composite| Yes | Yes | With limitations | If multiple Final Assemblies present in the project.xml, only the first one will be imported. <br>
|*.logical-system.xml|ecoa-logicalsystem-2.0.xsd|LogicalSystem| Yes | Yes| With limitations | If multiple logicalSystem present in the project.xml, only the first one will be imported <br>
|udp-binding.xml|ecoa-udpbinding-2.0.xsd|UDPBinding|Referenced in LogicalSystem TransportBinding | No | Fully| Can not be linked to LogicalSystem, thus no verification of coherence between UDPBinding and LogicalSystem is done
|*.deployment.xml|ecoa-deployment-2.0.xsd|Deployment| Yes | Yes| With limitations | If multiple DeploymentSchema present in the project.xml, only the first one will be imported
| sca-contribution.xml |sca-contribution-1.1-cd06-subset-2.0.xsd| Contribution | Search for "sca-contribution.xml" | No | No |
|*.ids.xml|ecoa-uid-2.0.xsd|ID_map| Yes | No | Fully |
|*.cross_platform_view.xml |ecoa-cross-platforms-view-2.0.xsd| CrossPlatformView | Yes | No | No |




## Legality Rules implemented 

All the legality rules can be found in ECOA Specification Part 7 : Metamodel, § 7. Legality Rules.

|Identifiers |Description| Concerned Object |
| ------ | ------ | ------ |
|XML-TYP-1 |DataTypes may have identical names as long as they are declared in different NameSpaces.| DataTypes |
|XML-TYP-2 |DataTypes may overload basic ECOA types. <br> The ECOA Infrastructure shall lookup DataTypes in the local namespace first, then in the ECOA namespace if no match is found in local namespace.| DataTypes |
|XML-AS-1 |Each component property defined in an assembly schema shall use the type xsd:string for its attribute “type”. <br> The actual ECOA type of the property is defined by the mandatory attribute “@{ecoa-sca}type”.| ComponentDefinition Properties and Composite Properties|
|XML-AS-2 | To be valid, an assembly schema does not require that all service instances are connected with service links. <br> In other words, provided services or required services do not necessarily need to be connected as long as the expected behaviour of the involved components allows it.| Assembly Schema|
|XML-AS-3|If connected, a required service (reference) shall be connected to at most one provided service. <br>However, a provided service may be connected to several required services. | ServiceLink|
|XML-CI-1| "Every service operation of every service provided by a component shall be connected to at least one module operation provided by one of the component modules through an operation link.
In other words, a component implementation shall provide at least one entry point for each service operation of the services it provides."
 |Service Operation (ComponentImplementation level)|
|XML-CI-2| It is possible for a module operation (i.e RequestReceived, EventReceived) not to be connected through an operation link. <br> It is possible for a container operation (i.e RequestSent, DataRead, DataWritten, EventSent) not to be connected through an operation link. |OperationLink|
|XML-INT-4| For a given logical computing platform link, the same ID value can be allocated to more than one Component level interaction in the final assembly, only if these interactions have the same Destination Component Instance, Destination Service Instance and ServiceOperationName.
| ID |
|XML-INT-5| The same ID values may be used in different logical computing platform links| LogicalComputingPlatformLink|
|XML-ASF-2|For a given Logical Computing Platform, the Final Assembly schema shall describe the final assembly of all ASCs deployed onto that Logical Computing Platform. |Protection Domain|
|XML-LS-1|Name Ids used for Logical Computing Platform Links shall be different from name Ids used for Logical Computing Node Links| Logical Computing Platform and Node Links|

## Software Development standard used to generate ECOA XML files
- Encoding = "UTF8"
- XML version = "1.0"
- Indentation = 2 spaces
- Maximal line length = none
- New line = CR+LF
- Comments = none
