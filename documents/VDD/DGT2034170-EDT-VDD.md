# __ECOA Design Tool VDD__

Copyright 2023 Dassault Aviation

MIT License (see LICENSE.txt)


|Reference|Version|Date|
|:------|:-----:|:---------:|
|DGT 2034170|A|May 10, 2023|
|DGT 2034170|B|August 24, 2023|


## __Version Description__

The 1.1.0 version of the ECOA Design Tool introduces those features:
* Project management
* Import, partial import and export of XML files (including coupling with EXVT and log file)
* Editing an ECOA project: see the "ECOA Standard implemented" section for details
* Editing facilities (Zoom, Element & Window resizing, Panning, God's view (Outline), Copy/Paste, Manual layout, Automatic Layout, Layout saving, Textal and Graphical Error display, Undo, Redo, Smart Connect, Search, Display, Expand/collapse)
* On-the-fly check of the legality rules and other ECOA consistency rules


## __Version identification__

### __ECOA Design Tool__

|Product|Version|Description|
|:------|:-----:|:---------:|
|ECOA Design Tool|V1.1.0|Editing an ECOA projet.|

### __Packages__

|Product|Version|Description|
|:------|:-----:|:---------:|
|ECOA Design Tool|V1.1.0|Editing an ECOA projet.|

### __Documentation__

|Product|Version|Description|
|:------|:-----:|:---------:|
|ECOA Design Tool TOR & TOR TC|DGT 2021743 Rev. B|TOR|
|ECOA Design Tool Design Guide|V1.1.0|Design Guide|
|ECOA Design Tool Developer Guide|V1.1.0|Developer Guide|
|ECOA Design Tool User Guide|V1.1.0|User Guide|


## __Evolutions__

Not Applicable


## __Corrections__

Not Applicable


## __Compatibility__

Windows 10\
Linux Debian


## __Scope & Limitations__
 
### __TOR requirements OK__

__General requirements__

TOR_EDT_REQ_100\
TOR_EDT_REQ_110\
TOR_EDT_REQ_120\
TOR_EDT_REQ_130\
TOR_EDT_REQ_135\
TOR_EDT_REQ_140\
TOR_EDT_REQ_150: See the section 'Limitation' of the file [ECOA-standard-implementation.md](../ECOA%20Standard%20Implementation/ECOA-standard-implementation.md)\
TOR_EDT_REQ_160\
TOR_EDT_REQ_170\
TOR_EDT_REQ_180\
TOR_EDT_REQ_190

__Functional requirements__

TOR_EDT_REQ_200\
TOR_EDT_REQ_210\
TOR_EDT_REQ_220\
TOR_EDT_REQ_230\
TOR_EDT_REQ_240\
TOR_EDT_REQ_250\
TOR_EDT_REQ_270\
TOR_EDT_REQ_280\
TOR_EDT_REQ_290\
TOR_EDT_REQ_300\
TOR_EDT_REQ_310\
TOR_EDT_REQ_320\
TOR_EDT_REQ_340\
TOR_EDT_REQ_350\
TOR_EDT_REQ_360\
TOR_EDT_REQ_370\
TOR_EDT_REQ_372\
TOR_EDT_REQ_373\
TOR_EDT_REQ_374\
TOR_EDT_REQ_375\
TOR_EDT_REQ_378\
TOR_EDT_REQ_379\
TOR_EDT_REQ_380\
TOR_EDT_REQ_390\
TOR_EDT_REQ_400\
TOR_EDT_REQ_410: A wait cursor could be added while the tree view is expanding\
TOR_EDT_REQ_480\
TOR_EDT_REQ_490: LogicalSystem & DeploymentSchema graphical view: not all elements can be resized\
TOR_EDT_REQ_500\
TOR_EDT_REQ_502\
TOR_EDT_REQ_506\
TOR_EDT_REQ_510\
TOR_EDT_REQ_520\
TOR_EDT_REQ_530\
TOR_EDT_REQ_535\
TOR_EDT_REQ_540\
TOR_EDT_REQ_550\
TOR_EDT_REQ_551: Graphical Warning And Error Display Menu could be improved\
TOR_EDT_REQ_552: "Enable Only Error" menu does the same thing as "Enable Error + Warning"\
TOR_EDT_REQ_560\
TOR_EDT_REQ_561\
TOR_EDT_REQ_570\
TOR_EDT_REQ_571: Focus when displaying an element from the tree view to the graphic view could be improved

__Design requirements__

TOR_EDT_DESIGN_HLTR_REQ_01\
TOR_EDT_DESIGN_HLTR_REQ_03\
TOR_EDT_DESIGN_HLTR_REQ_04\
TOR_EDT_DESIGN_HLTR_REQ_08\
TOR_EDT_DESIGN_HLTR_REQ_11\
TOR_EDT_DESIGN_HLTR_REQ_12

__Export requirements__

TOR_EDT_EXPORT_HLTR_REQ_01\
TOR_EDT_EXPORT_HLTR_REQ_02\
TOR_EDT_EXPORT_HLTR_REQ_03\
TOR_EDT_EXPORT_HLTR_REQ_04\
TOR_EDT_EXPORT_HLTR_REQ_05\
TOR_EDT_EXPORT_HLTR_REQ_07\
TOR_EDT_EXPORT_HLTR_REQ_09\
TOR_EDT_EXPORT_HLTR_REQ_11\
TOR_EDT_EXPORT_HLTR_REQ_12\
TOR_EDT_EXPORT_HLTR_REQ_14\
TOR_EDT_EXPORT_HLTR_REQ_15

### __TOR requirements partially covered__

__General requirements__

None

__Functional requirements__

None

__Design requirements__

TOR_EDT_DESIGN_HLTR_REQ_02: Some legality rules are not implemented: XML-CPV-1, XML-CPV-2, XML-CPV-3, XML-CO-1, XML-INT-1, XML-INT-2, XML-INT-3, XML-ASF-1, XML-ASF-3, XML-ASF-4 are out of scope of EDT V1.1.0\
TOR_EDT_DESIGN_HLTR_REQ_05: Partially not implemented - Automated In-Memory check and XML generation are out of scope of EDT V1.1.0\

__Export requirements__

TOR_EDT_EXPORT_HLTR_REQ_08: Partially not implemented - It's not possible to use EDT V1.1.0 through a command line prompt without any GUI\
TOR_EDT_EXPORT_HLTR_REQ_10: Partially not implemented - Automated In-Memory check and XML generation are out of scope of EDT V1.1.0

### __TOR requirements KO__

__General requirements__

None

__Functional requirements__

TOR_EDT_REQ_260: Not implemented - Recursive composite is out of scope of EDT V1.1.0\
TOR_EDT_REQ_273: Not implemented - Recursive composite is out of scope of EDT V1.1.0\
TOR_EDT_REQ_274: Not implemented - Recursive composite is out of scope of EDT V1.1.0\
TOR_EDT_REQ_275: Not implemented - Recursive composite is out of scope of EDT V1.1.0\
TOR_EDT_REQ_276: Not implemented - Recursive composite is out of scope of EDT V1.1.0\
TOR_EDT_REQ_376: Not implemented - Cross-platform views is out of scope of EDT V1.1.0\
TOR_EDT_REQ_377: Not implemented - Cross-platform views is out of scope of EDT V1.1.0\
TOR_EDT_REQ_504: Not implemented - Magnifier is out of scope of EDT V1.1.0\
TOR_EDT_REQ_525: Not implemented - International is out of scope of EDT V1.1.0\
TOR_EDT_REQ_562: Not implemented - Not consistent with the suppression logic implemented in EDT V1.1.0\
TOR_EDT_REQ_572: Not implemented - Tree sorting is out of scope of EDT V1.1.0

__Design requirements__

TOR_EDT_DESIGN_HLTR_REQ_06: Not implemented - Errors are detected and disallowed as they are edited. They do not need to be logged in a file by EDT V1.1.0\
TOR_EDT_DESIGN_HLTR_REQ_07: Bug - No warning shown for inconsistent priorities\
TOR_EDT_DESIGN_HLTR_REQ_09: Not implemented - EDT V1.1.0 does not validate batches of ECOA In-Memory models, it validates one action at a time. The user is informed by a pop-up window as soon as an action generates an ECOA legality rule violation\
TOR_EDT_DESIGN_HLTR_REQ_10: Bug - No warning shown for inconsistent priorities

__Export requirements__

TOR_EDT_EXPORT_HLTR_REQ_06: Bug - Differences may appears in XML files on the OperationLinks when exporting two times the same in-memory ECOA project\
TOR_EDT_EXPORT_HLTR_REQ_13: Not implemented - EDT V1.1.0 does not validate batches of ECOA In-Memory models, it validates one action at a time. The user is informed by a pop-up window as soon as an action generates an ECOA legality rule violation


## __ECOA Standard implemented__

The ECOA Standard implemented in the ECOA Design Tool V1.1.0 is detailed in the file [ECOA-standard-implementation.md](../ECOA%20Standard%20Implementation/ECOA-standard-implementation.md)


## __Delivery__
 
Via GitHub (see ECOA Website for more informations) 
