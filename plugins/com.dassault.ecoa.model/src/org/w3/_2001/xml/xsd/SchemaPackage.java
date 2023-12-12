/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *     Part 1 version: Id: structures.xsd,v 1.2 2004/01/15 11:34:25 ht Exp 
 *     Part 2 version: Id: datatypes.xsd,v 1.3 2004/01/23 18:11:13 ht Exp 
 *   
 * 
 *    The schema corresponding to this document is normative,
 *    with respect to the syntactic constraints it expresses in the
 *    XML Schema language.  The documentation (within <documentation> elements)
 *    below, is not normative, but rather highlights important aspects of
 *    the W3C Recommendation of which this is a part
 * 
 *    The simpleType element and all of its members are defined
 *       towards the end of this schema document
 * 
 *    simple type for the value of the 'namespace' attr of
 *    'any' and 'anyAttribute'
 * 
 *    Value is
 *               ##any      - - any non-conflicting WFXML/attribute at all
 * 
 *               ##other    - - any non-conflicting WFXML/attribute from
 *                               namespace other than targetNS
 * 
 *               ##local    - - any unqualified non-conflicting WFXML/attribute 
 * 
 *               one or     - - any non-conflicting WFXML/attribute from
 *               more URI        the listed namespaces
 *               references
 *               (space separated)
 * 
 *     ##targetNamespace or ##local may appear in the above list, to
 *         refer to the targetNamespace of the enclosing
 *         schema or an absent targetNamespace respectively
 * 
 *    notations for use within XML Schema schemas
 * 
 *       First the built-in primitive datatypes.  These definitions are for
 *       information only, the real built-in definitions are magic.
 *     
 * 
 *       For each built-in datatype in this schema (both primitive and
 *       derived) can be uniquely addressed via a URI constructed
 *       as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype
 * 
 *       For example, to address the int datatype, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int
 * 
 *       Additionally, each facet definition element can be uniquely
 *       addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the facet
 * 
 *       For example, to address the maxInclusive facet, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#maxInclusive
 * 
 *       Additionally, each facet usage in a built-in datatype definition
 *       can be uniquely addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype, followed
 *            by a period (".") followed by the name of the facet
 * 
 *       For example, to address the usage of the maxInclusive facet in
 *       the definition of int, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int.maxInclusive
 * 
 *     
 * 
 *       Now the derived primitive types
 *     
 * <!-- end-model-doc -->
 * @see org.w3._2001.xml.xsd.SchemaFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='EN'"
 * @generated
 */
public interface SchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xsd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2001/XMLSchema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xsd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaPackage eINSTANCE = org.w3._2001.xml.xsd.impl.SchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.OpenAttrsImpl <em>Open Attrs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.OpenAttrsImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getOpenAttrs()
	 * @generated
	 */
	int OPEN_ATTRS = 34;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ATTRS__ANY_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Open Attrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ATTRS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Open Attrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ATTRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AnnotatedImpl <em>Annotated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AnnotatedImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnnotated()
	 * @generated
	 */
	int ANNOTATED = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED__ID = OPEN_ATTRS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.GroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 18;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARTICLE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ALL = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHOICE = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SEQUENCE = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANY = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MAX_OCCURS = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MIN_OCCURS = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REF = ANNOTATED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ExplicitGroupImpl <em>Explicit Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ExplicitGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getExplicitGroup()
	 * @generated
	 */
	int EXPLICIT_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ANY_ATTRIBUTE = GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ANNOTATION = GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__PARTICLE = GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ELEMENT = GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__GROUP = GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ALL = GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__CHOICE = GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__SEQUENCE = GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__ANY = GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__MAX_OCCURS = GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__MIN_OCCURS = GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP__REF = GROUP__REF;

	/**
	 * The number of structural features of the '<em>Explicit Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Explicit Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AllImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ANY_ATTRIBUTE = EXPLICIT_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ANNOTATION = EXPLICIT_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ID = EXPLICIT_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__PARTICLE = EXPLICIT_GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ELEMENT = EXPLICIT_GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__GROUP = EXPLICIT_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ALL = EXPLICIT_GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__CHOICE = EXPLICIT_GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__SEQUENCE = EXPLICIT_GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ANY = EXPLICIT_GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__MAX_OCCURS = EXPLICIT_GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__MIN_OCCURS = EXPLICIT_GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__NAME = EXPLICIT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__REF = EXPLICIT_GROUP__REF;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = EXPLICIT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OPERATION_COUNT = EXPLICIT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AnnotationTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Appinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__APPINFO = OPEN_ATTRS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DOCUMENTATION = OPEN_ATTRS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.WildcardImpl <em>Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.WildcardImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getWildcard()
	 * @generated
	 */
	int WILDCARD = 54;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__NAMESPACE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__PROCESS_CONTENTS = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AnyTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__ANY_ATTRIBUTE = WILDCARD__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__ANNOTATION = WILDCARD__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__ID = WILDCARD__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__NAMESPACE = WILDCARD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__PROCESS_CONTENTS = WILDCARD__PROCESS_CONTENTS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__MAX_OCCURS = WILDCARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__MIN_OCCURS = WILDCARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_OPERATION_COUNT = WILDCARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AppinfoTypeImpl <em>Appinfo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AppinfoTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAppinfoType()
	 * @generated
	 */
	int APPINFO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Appinfo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Appinfo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPINFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AttributeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FIXED = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FORM = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__USE = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AttributeGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttributeGroup()
	 * @generated
	 */
	int ATTRIBUTE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__GROUP = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__NAME = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__REF = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.AttributeGroupRefImpl <em>Attribute Group Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.AttributeGroupRefImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttributeGroupRef()
	 * @generated
	 */
	int ATTRIBUTE_GROUP_REF = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ANY_ATTRIBUTE = ATTRIBUTE_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ANNOTATION = ATTRIBUTE_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ID = ATTRIBUTE_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__GROUP = ATTRIBUTE_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ATTRIBUTE = ATTRIBUTE_GROUP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ATTRIBUTE_GROUP = ATTRIBUTE_GROUP__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__ANY_ATTRIBUTE1 = ATTRIBUTE_GROUP__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__NAME = ATTRIBUTE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF__REF = ATTRIBUTE_GROUP__REF;

	/**
	 * The number of structural features of the '<em>Attribute Group Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF_FEATURE_COUNT = ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Group Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REF_OPERATION_COUNT = ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ComplexContentTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexContentType()
	 * @generated
	 */
	int COMPLEX_CONTENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__EXTENSION = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__MIXED = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Complex Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.RestrictionTypeImpl <em>Restriction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.RestrictionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRestrictionType()
	 * @generated
	 */
	int RESTRICTION_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__FACETS = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MIN_EXCLUSIVE = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MIN_INCLUSIVE = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MAX_EXCLUSIVE = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MAX_INCLUSIVE = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__TOTAL_DIGITS = ANNOTATED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__FRACTION_DIGITS = ANNOTATED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__LENGTH = ANNOTATED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MIN_LENGTH = ANNOTATED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__MAX_LENGTH = ANNOTATED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ENUMERATION = ANNOTATED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__WHITE_SPACE = ANNOTATED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__PATTERN = ANNOTATED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE__BASE = ANNOTATED_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ComplexRestrictionTypeImpl <em>Complex Restriction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ComplexRestrictionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexRestrictionType()
	 * @generated
	 */
	int COMPLEX_RESTRICTION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ANY_ATTRIBUTE = RESTRICTION_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ANNOTATION = RESTRICTION_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ID = RESTRICTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__GROUP = RESTRICTION_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ALL = RESTRICTION_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__CHOICE = RESTRICTION_TYPE__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__SEQUENCE = RESTRICTION_TYPE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__SIMPLE_TYPE = RESTRICTION_TYPE__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__FACETS = RESTRICTION_TYPE__FACETS;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MIN_EXCLUSIVE = RESTRICTION_TYPE__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MIN_INCLUSIVE = RESTRICTION_TYPE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MAX_EXCLUSIVE = RESTRICTION_TYPE__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MAX_INCLUSIVE = RESTRICTION_TYPE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__TOTAL_DIGITS = RESTRICTION_TYPE__TOTAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__FRACTION_DIGITS = RESTRICTION_TYPE__FRACTION_DIGITS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__LENGTH = RESTRICTION_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MIN_LENGTH = RESTRICTION_TYPE__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__MAX_LENGTH = RESTRICTION_TYPE__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ENUMERATION = RESTRICTION_TYPE__ENUMERATION;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__WHITE_SPACE = RESTRICTION_TYPE__WHITE_SPACE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__PATTERN = RESTRICTION_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__GROUP1 = RESTRICTION_TYPE__GROUP1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ATTRIBUTE = RESTRICTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ATTRIBUTE_GROUP = RESTRICTION_TYPE__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__ANY_ATTRIBUTE1 = RESTRICTION_TYPE__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE__BASE = RESTRICTION_TYPE__BASE;

	/**
	 * The number of structural features of the '<em>Complex Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE_FEATURE_COUNT = RESTRICTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESTRICTION_TYPE_OPERATION_COUNT = RESTRICTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ComplexTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__SIMPLE_CONTENT = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COMPLEX_CONTENT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ABSTRACT = ANNOTATED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__BLOCK = ANNOTATED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FINAL = ANNOTATED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__MIXED = ANNOTATED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.DocumentationTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDocumentationType()
	 * @generated
	 */
	int DOCUMENTATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.DocumentRootImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALL = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANY = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANY_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Appinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPINFO = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOICE = 10;

	/**
	 * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 13;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENUMERATION = 15;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD = 16;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FRACTION_DIGITS = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP = 18;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 19;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE = 20;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY = 21;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYREF = 22;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LENGTH = 23;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 24;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_EXCLUSIVE = 25;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_INCLUSIVE = 26;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_LENGTH = 27;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_EXCLUSIVE = 28;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_INCLUSIVE = 29;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_LENGTH = 30;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTATION = 31;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATTERN = 32;

	/**
	 * The feature id for the '<em><b>Redefine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REDEFINE = 33;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESTRICTION = 34;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA = 35;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECTOR = 36;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE = 37;

	/**
	 * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_CONTENT = 38;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_DIGITS = 40;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNION = 41;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIQUE = 42;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WHITE_SPACE = 43;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 44;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ElementImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPLEX_TYPE = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IDENTITY_CONSTRAINT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNIQUE = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__KEY = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__KEYREF = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ABSTRACT = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BLOCK = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DEFAULT = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FINAL = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FIXED = ANNOTATED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FORM = ANNOTATED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAX_OCCURS = ANNOTATED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MIN_OCCURS = ANNOTATED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ANNOTATED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NILLABLE = ANNOTATED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REF = ANNOTATED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUBSTITUTION_GROUP = ANNOTATED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = ANNOTATED_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ExtensionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__BASE = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.FacetImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 16;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__FIXED = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__VALUE = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.FieldTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__XPATH = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.RealGroupImpl <em>Real Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.RealGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRealGroup()
	 * @generated
	 */
	int REAL_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ANY_ATTRIBUTE = GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ANNOTATION = GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__PARTICLE = GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ELEMENT = GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__GROUP = GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ALL = GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__CHOICE = GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__SEQUENCE = GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ANY = GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__MAX_OCCURS = GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__MIN_OCCURS = GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__REF = GROUP__REF;

	/**
	 * The feature id for the '<em><b>All1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__ALL1 = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choice1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__CHOICE1 = GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP__SEQUENCE1 = GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Real Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Real Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.GroupRefImpl <em>Group Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.GroupRefImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getGroupRef()
	 * @generated
	 */
	int GROUP_REF = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ANY_ATTRIBUTE = REAL_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ANNOTATION = REAL_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ID = REAL_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__PARTICLE = REAL_GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ELEMENT = REAL_GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__GROUP = REAL_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ALL = REAL_GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__CHOICE = REAL_GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__SEQUENCE = REAL_GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ANY = REAL_GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__MAX_OCCURS = REAL_GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__MIN_OCCURS = REAL_GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__NAME = REAL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__REF = REAL_GROUP__REF;

	/**
	 * The feature id for the '<em><b>All1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ALL1 = REAL_GROUP__ALL1;

	/**
	 * The feature id for the '<em><b>Choice1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__CHOICE1 = REAL_GROUP__CHOICE1;

	/**
	 * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__SEQUENCE1 = REAL_GROUP__SEQUENCE1;

	/**
	 * The number of structural features of the '<em>Group Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF_FEATURE_COUNT = REAL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF_OPERATION_COUNT = REAL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ImportTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__NAMESPACE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__SCHEMA_LOCATION = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.IncludeTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__SCHEMA_LOCATION = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.KeybaseImpl <em>Keybase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.KeybaseImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getKeybase()
	 * @generated
	 */
	int KEYBASE = 22;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__SELECTOR = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__FIELD = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE__NAME = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Keybase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Keybase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBASE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.KeyrefTypeImpl <em>Keyref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.KeyrefTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getKeyrefType()
	 * @generated
	 */
	int KEYREF_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__ANY_ATTRIBUTE = KEYBASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__ANNOTATION = KEYBASE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__ID = KEYBASE__ID;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__SELECTOR = KEYBASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__FIELD = KEYBASE__FIELD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__NAME = KEYBASE__NAME;

	/**
	 * The feature id for the '<em><b>Refer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE__REFER = KEYBASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE_FEATURE_COUNT = KEYBASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keyref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYREF_TYPE_OPERATION_COUNT = KEYBASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.ListTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ITEM_TYPE = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.LocalComplexTypeImpl <em>Local Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.LocalComplexTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalComplexType()
	 * @generated
	 */
	int LOCAL_COMPLEX_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ANY_ATTRIBUTE = COMPLEX_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ANNOTATION = COMPLEX_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ID = COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__SIMPLE_CONTENT = COMPLEX_TYPE__SIMPLE_CONTENT;

	/**
	 * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__COMPLEX_CONTENT = COMPLEX_TYPE__COMPLEX_CONTENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__GROUP = COMPLEX_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ALL = COMPLEX_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__CHOICE = COMPLEX_TYPE__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__SEQUENCE = COMPLEX_TYPE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__GROUP1 = COMPLEX_TYPE__GROUP1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ATTRIBUTE = COMPLEX_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ATTRIBUTE_GROUP = COMPLEX_TYPE__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ANY_ATTRIBUTE1 = COMPLEX_TYPE__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__ABSTRACT = COMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__BLOCK = COMPLEX_TYPE__BLOCK;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__FINAL = COMPLEX_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__MIXED = COMPLEX_TYPE__MIXED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Local Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPLEX_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.LocalElementImpl <em>Local Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.LocalElementImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalElement()
	 * @generated
	 */
	int LOCAL_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__ANY_ATTRIBUTE = ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__SIMPLE_TYPE = ELEMENT__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__COMPLEX_TYPE = ELEMENT__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__IDENTITY_CONSTRAINT = ELEMENT__IDENTITY_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__UNIQUE = ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__KEY = ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__KEYREF = ELEMENT__KEYREF;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__ABSTRACT = ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__BLOCK = ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__DEFAULT = ELEMENT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__FINAL = ELEMENT__FINAL;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__FIXED = ELEMENT__FIXED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__FORM = ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__NILLABLE = ELEMENT__NILLABLE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__REF = ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__SUBSTITUTION_GROUP = ELEMENT__SUBSTITUTION_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Local Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SimpleTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__LIST = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__UNION = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__FINAL = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.LocalSimpleTypeImpl <em>Local Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.LocalSimpleTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalSimpleType()
	 * @generated
	 */
	int LOCAL_SIMPLE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__ANY_ATTRIBUTE = SIMPLE_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__ANNOTATION = SIMPLE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__RESTRICTION = SIMPLE_TYPE__RESTRICTION;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__LIST = SIMPLE_TYPE__LIST;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__UNION = SIMPLE_TYPE__UNION;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__FINAL = SIMPLE_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Local Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SIMPLE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NamedAttributeGroupImpl <em>Named Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NamedAttributeGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamedAttributeGroup()
	 * @generated
	 */
	int NAMED_ATTRIBUTE_GROUP = 28;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ANY_ATTRIBUTE = ATTRIBUTE_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ANNOTATION = ATTRIBUTE_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ID = ATTRIBUTE_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__GROUP = ATTRIBUTE_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ATTRIBUTE = ATTRIBUTE_GROUP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = ATTRIBUTE_GROUP__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = ATTRIBUTE_GROUP__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__NAME = ATTRIBUTE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP__REF = ATTRIBUTE_GROUP__REF;

	/**
	 * The number of structural features of the '<em>Named Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP_FEATURE_COUNT = ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_GROUP_OPERATION_COUNT = ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NamedGroupImpl <em>Named Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NamedGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamedGroup()
	 * @generated
	 */
	int NAMED_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ANY_ATTRIBUTE = REAL_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ANNOTATION = REAL_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ID = REAL_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__PARTICLE = REAL_GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ELEMENT = REAL_GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__GROUP = REAL_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ALL = REAL_GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__CHOICE = REAL_GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__SEQUENCE = REAL_GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ANY = REAL_GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__MAX_OCCURS = REAL_GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__MIN_OCCURS = REAL_GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__NAME = REAL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__REF = REAL_GROUP__REF;

	/**
	 * The feature id for the '<em><b>All1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__ALL1 = REAL_GROUP__ALL1;

	/**
	 * The feature id for the '<em><b>Choice1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__CHOICE1 = REAL_GROUP__CHOICE1;

	/**
	 * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP__SEQUENCE1 = REAL_GROUP__SEQUENCE1;

	/**
	 * The number of structural features of the '<em>Named Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP_FEATURE_COUNT = REAL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GROUP_OPERATION_COUNT = REAL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NarrowMaxMinImpl <em>Narrow Max Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NarrowMaxMinImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNarrowMaxMin()
	 * @generated
	 */
	int NARROW_MAX_MIN = 30;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__ANY_ATTRIBUTE = LOCAL_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__ANNOTATION = LOCAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__ID = LOCAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__SIMPLE_TYPE = LOCAL_ELEMENT__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__COMPLEX_TYPE = LOCAL_ELEMENT__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__IDENTITY_CONSTRAINT = LOCAL_ELEMENT__IDENTITY_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__UNIQUE = LOCAL_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__KEY = LOCAL_ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__KEYREF = LOCAL_ELEMENT__KEYREF;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__ABSTRACT = LOCAL_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__BLOCK = LOCAL_ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__DEFAULT = LOCAL_ELEMENT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__FINAL = LOCAL_ELEMENT__FINAL;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__FIXED = LOCAL_ELEMENT__FIXED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__FORM = LOCAL_ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__MAX_OCCURS = LOCAL_ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__MIN_OCCURS = LOCAL_ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__NAME = LOCAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__NILLABLE = LOCAL_ELEMENT__NILLABLE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__REF = LOCAL_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__SUBSTITUTION_GROUP = LOCAL_ELEMENT__SUBSTITUTION_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN__TYPE = LOCAL_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Narrow Max Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN_FEATURE_COUNT = LOCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Narrow Max Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARROW_MAX_MIN_OPERATION_COUNT = LOCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NoFixedFacetImpl <em>No Fixed Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NoFixedFacetImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNoFixedFacet()
	 * @generated
	 */
	int NO_FIXED_FACET = 31;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET__ANNOTATION = FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET__ID = FACET__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET__FIXED = FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET__VALUE = FACET__VALUE;

	/**
	 * The number of structural features of the '<em>No Fixed Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Fixed Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FIXED_FACET_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NotationTypeImpl <em>Notation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NotationTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNotationType()
	 * @generated
	 */
	int NOTATION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__PUBLIC = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__SYSTEM = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Notation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Notation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.NumFacetImpl <em>Num Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.NumFacetImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNumFacet()
	 * @generated
	 */
	int NUM_FACET = 33;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET__ANNOTATION = FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET__ID = FACET__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET__FIXED = FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET__VALUE = FACET__VALUE;

	/**
	 * The number of structural features of the '<em>Num Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Num Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FACET_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.PatternTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getPatternType()
	 * @generated
	 */
	int PATTERN_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ANY_ATTRIBUTE = NO_FIXED_FACET__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ANNOTATION = NO_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ID = NO_FIXED_FACET__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__FIXED = NO_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__VALUE = NO_FIXED_FACET__VALUE;

	/**
	 * The number of structural features of the '<em>Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE_FEATURE_COUNT = NO_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE_OPERATION_COUNT = NO_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.RedefineTypeImpl <em>Redefine Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.RedefineTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRedefineType()
	 * @generated
	 */
	int REDEFINE_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__SIMPLE_TYPE = OPEN_ATTRS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__COMPLEX_TYPE = OPEN_ATTRS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__GROUP1 = OPEN_ATTRS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__ATTRIBUTE_GROUP = OPEN_ATTRS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE__SCHEMA_LOCATION = OPEN_ATTRS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Redefine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Redefine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.RestrictionType1Impl <em>Restriction Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.RestrictionType1Impl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRestrictionType1()
	 * @generated
	 */
	int RESTRICTION_TYPE1 = 39;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__FACETS = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MIN_EXCLUSIVE = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MIN_INCLUSIVE = ANNOTATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MAX_EXCLUSIVE = ANNOTATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MAX_INCLUSIVE = ANNOTATED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__TOTAL_DIGITS = ANNOTATED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__FRACTION_DIGITS = ANNOTATED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__LENGTH = ANNOTATED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MIN_LENGTH = ANNOTATED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__MAX_LENGTH = ANNOTATED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__ENUMERATION = ANNOTATED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__WHITE_SPACE = ANNOTATED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__PATTERN = ANNOTATED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1__BASE = ANNOTATED_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Restriction Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Restriction Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_TYPE1_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SchemaTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SchemaTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__INCLUDE = OPEN_ATTRS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__IMPORT = OPEN_ATTRS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Redefine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__REDEFINE = OPEN_ATTRS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__GROUP1 = OPEN_ATTRS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SIMPLE_TYPE = OPEN_ATTRS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__COMPLEX_TYPE = OPEN_ATTRS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Group2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__GROUP2 = OPEN_ATTRS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ATTRIBUTE_GROUP = OPEN_ATTRS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ELEMENT = OPEN_ATTRS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ATTRIBUTE = OPEN_ATTRS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NOTATION = OPEN_ATTRS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANNOTATION1 = OPEN_ATTRS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Attribute Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Block Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__BLOCK_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Element Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ELEMENT_FORM_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Final Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__FINAL_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__TARGET_NAMESPACE = OPEN_ATTRS_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__VERSION = OPEN_ATTRS_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SelectorTypeImpl <em>Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SelectorTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSelectorType()
	 * @generated
	 */
	int SELECTOR_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE__XPATH = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SimpleContentTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleContentType()
	 * @generated
	 */
	int SIMPLE_CONTENT_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__EXTENSION = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SimpleExplicitGroupImpl <em>Simple Explicit Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SimpleExplicitGroupImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleExplicitGroup()
	 * @generated
	 */
	int SIMPLE_EXPLICIT_GROUP = 43;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ANY_ATTRIBUTE = EXPLICIT_GROUP__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ANNOTATION = EXPLICIT_GROUP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ID = EXPLICIT_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__PARTICLE = EXPLICIT_GROUP__PARTICLE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ELEMENT = EXPLICIT_GROUP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__GROUP = EXPLICIT_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ALL = EXPLICIT_GROUP__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__CHOICE = EXPLICIT_GROUP__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__SEQUENCE = EXPLICIT_GROUP__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__ANY = EXPLICIT_GROUP__ANY;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__MAX_OCCURS = EXPLICIT_GROUP__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__MIN_OCCURS = EXPLICIT_GROUP__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__NAME = EXPLICIT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP__REF = EXPLICIT_GROUP__REF;

	/**
	 * The number of structural features of the '<em>Simple Explicit Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP_FEATURE_COUNT = EXPLICIT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Explicit Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPLICIT_GROUP_OPERATION_COUNT = EXPLICIT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SimpleExtensionTypeImpl <em>Simple Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SimpleExtensionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleExtensionType()
	 * @generated
	 */
	int SIMPLE_EXTENSION_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ANY_ATTRIBUTE = EXTENSION_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ANNOTATION = EXTENSION_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ID = EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__GROUP = EXTENSION_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ALL = EXTENSION_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__CHOICE = EXTENSION_TYPE__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__SEQUENCE = EXTENSION_TYPE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__GROUP1 = EXTENSION_TYPE__GROUP1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ATTRIBUTE = EXTENSION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ATTRIBUTE_GROUP = EXTENSION_TYPE__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__ANY_ATTRIBUTE1 = EXTENSION_TYPE__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE__BASE = EXTENSION_TYPE__BASE;

	/**
	 * The number of structural features of the '<em>Simple Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE_FEATURE_COUNT = EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXTENSION_TYPE_OPERATION_COUNT = EXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.SimpleRestrictionTypeImpl <em>Simple Restriction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.SimpleRestrictionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleRestrictionType()
	 * @generated
	 */
	int SIMPLE_RESTRICTION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ANY_ATTRIBUTE = RESTRICTION_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ANNOTATION = RESTRICTION_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ID = RESTRICTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__GROUP = RESTRICTION_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ALL = RESTRICTION_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__CHOICE = RESTRICTION_TYPE__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__SEQUENCE = RESTRICTION_TYPE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__SIMPLE_TYPE = RESTRICTION_TYPE__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__FACETS = RESTRICTION_TYPE__FACETS;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MIN_EXCLUSIVE = RESTRICTION_TYPE__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MIN_INCLUSIVE = RESTRICTION_TYPE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MAX_EXCLUSIVE = RESTRICTION_TYPE__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MAX_INCLUSIVE = RESTRICTION_TYPE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__TOTAL_DIGITS = RESTRICTION_TYPE__TOTAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__FRACTION_DIGITS = RESTRICTION_TYPE__FRACTION_DIGITS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__LENGTH = RESTRICTION_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MIN_LENGTH = RESTRICTION_TYPE__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__MAX_LENGTH = RESTRICTION_TYPE__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ENUMERATION = RESTRICTION_TYPE__ENUMERATION;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__WHITE_SPACE = RESTRICTION_TYPE__WHITE_SPACE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__PATTERN = RESTRICTION_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__GROUP1 = RESTRICTION_TYPE__GROUP1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ATTRIBUTE = RESTRICTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ATTRIBUTE_GROUP = RESTRICTION_TYPE__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__ANY_ATTRIBUTE1 = RESTRICTION_TYPE__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE__BASE = RESTRICTION_TYPE__BASE;

	/**
	 * The number of structural features of the '<em>Simple Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE_FEATURE_COUNT = RESTRICTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Restriction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESTRICTION_TYPE_OPERATION_COUNT = RESTRICTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.TopLevelAttributeImpl <em>Top Level Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.TopLevelAttributeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelAttribute()
	 * @generated
	 */
	int TOP_LEVEL_ATTRIBUTE = 47;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__ANY_ATTRIBUTE = ATTRIBUTE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__ANNOTATION = ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__SIMPLE_TYPE = ATTRIBUTE__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__DEFAULT = ATTRIBUTE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__FIXED = ATTRIBUTE__FIXED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__FORM = ATTRIBUTE__FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__REF = ATTRIBUTE__REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE__USE = ATTRIBUTE__USE;

	/**
	 * The number of structural features of the '<em>Top Level Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Level Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.TopLevelComplexTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelComplexType()
	 * @generated
	 */
	int TOP_LEVEL_COMPLEX_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ANY_ATTRIBUTE = COMPLEX_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ANNOTATION = COMPLEX_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ID = COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__SIMPLE_CONTENT = COMPLEX_TYPE__SIMPLE_CONTENT;

	/**
	 * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__COMPLEX_CONTENT = COMPLEX_TYPE__COMPLEX_CONTENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__GROUP = COMPLEX_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ALL = COMPLEX_TYPE__ALL;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__CHOICE = COMPLEX_TYPE__CHOICE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__SEQUENCE = COMPLEX_TYPE__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__GROUP1 = COMPLEX_TYPE__GROUP1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ATTRIBUTE = COMPLEX_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ATTRIBUTE_GROUP = COMPLEX_TYPE__ATTRIBUTE_GROUP;

	/**
	 * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ANY_ATTRIBUTE1 = COMPLEX_TYPE__ANY_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__ABSTRACT = COMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__BLOCK = COMPLEX_TYPE__BLOCK;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__FINAL = COMPLEX_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__MIXED = COMPLEX_TYPE__MIXED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Top Level Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Level Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_COMPLEX_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.TopLevelElementImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelElement()
	 * @generated
	 */
	int TOP_LEVEL_ELEMENT = 49;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__ANY_ATTRIBUTE = ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__SIMPLE_TYPE = ELEMENT__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__COMPLEX_TYPE = ELEMENT__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__IDENTITY_CONSTRAINT = ELEMENT__IDENTITY_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__UNIQUE = ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__KEY = ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__KEYREF = ELEMENT__KEYREF;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__ABSTRACT = ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__BLOCK = ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__DEFAULT = ELEMENT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__FINAL = ELEMENT__FINAL;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__FIXED = ELEMENT__FIXED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__FORM = ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__NILLABLE = ELEMENT__NILLABLE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__REF = ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__SUBSTITUTION_GROUP = ELEMENT__SUBSTITUTION_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Top Level Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Level Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.TopLevelSimpleTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelSimpleType()
	 * @generated
	 */
	int TOP_LEVEL_SIMPLE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__ANY_ATTRIBUTE = SIMPLE_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__ANNOTATION = SIMPLE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__RESTRICTION = SIMPLE_TYPE__RESTRICTION;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__LIST = SIMPLE_TYPE__LIST;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__UNION = SIMPLE_TYPE__UNION;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__FINAL = SIMPLE_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Top Level Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Level Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_SIMPLE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.TotalDigitsTypeImpl <em>Total Digits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.TotalDigitsTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTotalDigitsType()
	 * @generated
	 */
	int TOTAL_DIGITS_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE__ANY_ATTRIBUTE = NUM_FACET__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE__ANNOTATION = NUM_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE__ID = NUM_FACET__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE__FIXED = NUM_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE__VALUE = NUM_FACET__VALUE;

	/**
	 * The number of structural features of the '<em>Total Digits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE_FEATURE_COUNT = NUM_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Total Digits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_TYPE_OPERATION_COUNT = NUM_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.UnionTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ID = ANNOTATED__ID;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__MEMBER_TYPES = ANNOTATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.impl.WhiteSpaceTypeImpl <em>White Space Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.impl.WhiteSpaceTypeImpl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getWhiteSpaceType()
	 * @generated
	 */
	int WHITE_SPACE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE__ANNOTATION = FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE__ID = FACET__ID;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE__FIXED = FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE__VALUE = FACET__VALUE;

	/**
	 * The number of structural features of the '<em>White Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>White Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_TYPE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.AllNNIMember1 <em>All NNI Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.AllNNIMember1
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNIMember1()
	 * @generated
	 */
	int ALL_NNI_MEMBER1 = 55;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.BlockSetMember0 <em>Block Set Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.BlockSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember0()
	 * @generated
	 */
	int BLOCK_SET_MEMBER0 = 56;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.BlockSetMember1Item <em>Block Set Member1 Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1Item()
	 * @generated
	 */
	int BLOCK_SET_MEMBER1_ITEM = 57;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.DerivationControl <em>Derivation Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.DerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationControl()
	 * @generated
	 */
	int DERIVATION_CONTROL = 58;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.DerivationSetMember0 <em>Derivation Set Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.DerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember0()
	 * @generated
	 */
	int DERIVATION_SET_MEMBER0 = 59;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.FormChoice <em>Form Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFormChoice()
	 * @generated
	 */
	int FORM_CHOICE = 60;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember0()
	 * @generated
	 */
	int FULL_DERIVATION_SET_MEMBER0 = 61;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.NamespaceListMember0 <em>Namespace List Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.NamespaceListMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember0()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER0 = 62;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1 <em>Namespace List Member1 Item Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1ItemMember1()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER1_ITEM_MEMBER1 = 63;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.ProcessContentsType <em>Process Contents Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.ProcessContentsType
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getProcessContentsType()
	 * @generated
	 */
	int PROCESS_CONTENTS_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.ReducedDerivationControl <em>Reduced Derivation Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getReducedDerivationControl()
	 * @generated
	 */
	int REDUCED_DERIVATION_CONTROL = 65;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember0()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET_MEMBER0 = 66;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1Item()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET_MEMBER1_ITEM = 67;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.TypeDerivationControl <em>Type Derivation Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.TypeDerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTypeDerivationControl()
	 * @generated
	 */
	int TYPE_DERIVATION_CONTROL = 68;

	/**
	 * The meta object id for the '{@link org.w3._2001.xml.xsd.UseType <em>Use Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.UseType
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 69;

	/**
	 * The meta object id for the '<em>All NNI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNI()
	 * @generated
	 */
	int ALL_NNI = 70;

	/**
	 * The meta object id for the '<em>All NNI Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.AllNNIMember1
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNIMember1Object()
	 * @generated
	 */
	int ALL_NNI_MEMBER1_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Block Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSet()
	 * @generated
	 */
	int BLOCK_SET = 72;

	/**
	 * The meta object id for the '<em>Block Set Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.BlockSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember0Object()
	 * @generated
	 */
	int BLOCK_SET_MEMBER0_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Block Set Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1()
	 * @generated
	 */
	int BLOCK_SET_MEMBER1 = 74;

	/**
	 * The meta object id for the '<em>Block Set Member1 Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1ItemObject()
	 * @generated
	 */
	int BLOCK_SET_MEMBER1_ITEM_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Derivation Control Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.DerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationControlObject()
	 * @generated
	 */
	int DERIVATION_CONTROL_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Derivation Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSet()
	 * @generated
	 */
	int DERIVATION_SET = 77;

	/**
	 * The meta object id for the '<em>Derivation Set Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.DerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember0Object()
	 * @generated
	 */
	int DERIVATION_SET_MEMBER0_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Derivation Set Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember1()
	 * @generated
	 */
	int DERIVATION_SET_MEMBER1 = 79;

	/**
	 * The meta object id for the '<em>Form Choice Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFormChoiceObject()
	 * @generated
	 */
	int FORM_CHOICE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Full Derivation Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSet()
	 * @generated
	 */
	int FULL_DERIVATION_SET = 81;

	/**
	 * The meta object id for the '<em>Full Derivation Set Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember0Object()
	 * @generated
	 */
	int FULL_DERIVATION_SET_MEMBER0_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Full Derivation Set Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember1()
	 * @generated
	 */
	int FULL_DERIVATION_SET_MEMBER1 = 83;

	/**
	 * The meta object id for the '<em>Member Types Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getMemberTypesType()
	 * @generated
	 */
	int MEMBER_TYPES_TYPE = 84;

	/**
	 * The meta object id for the '<em>Namespace List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceList()
	 * @generated
	 */
	int NAMESPACE_LIST = 85;

	/**
	 * The meta object id for the '<em>Namespace List Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.NamespaceListMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember0Object()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER0_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Namespace List Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER1 = 87;

	/**
	 * The meta object id for the '<em>Namespace List Member1 Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1Item()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER1_ITEM = 88;

	/**
	 * The meta object id for the '<em>Namespace List Member1 Item Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1ItemMember1Object()
	 * @generated
	 */
	int NAMESPACE_LIST_MEMBER1_ITEM_MEMBER1_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Process Contents Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.ProcessContentsType
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getProcessContentsTypeObject()
	 * @generated
	 */
	int PROCESS_CONTENTS_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Public</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 91;

	/**
	 * The meta object id for the '<em>Reduced Derivation Control Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getReducedDerivationControlObject()
	 * @generated
	 */
	int REDUCED_DERIVATION_CONTROL_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Simple Derivation Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSet()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET = 93;

	/**
	 * The meta object id for the '<em>Simple Derivation Set Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember0Object()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET_MEMBER0_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Simple Derivation Set Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET_MEMBER1 = 95;

	/**
	 * The meta object id for the '<em>Simple Derivation Set Member1 Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1ItemObject()
	 * @generated
	 */
	int SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Type Derivation Control Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.TypeDerivationControl
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTypeDerivationControlObject()
	 * @generated
	 */
	int TYPE_DERIVATION_CONTROL_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Use Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xml.xsd.UseType
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUseTypeObject()
	 * @generated
	 */
	int USE_TYPE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Xpath Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getXpathType()
	 * @generated
	 */
	int XPATH_TYPE = 99;

	/**
	 * The meta object id for the '<em>Xpath Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getXpathType1()
	 * @generated
	 */
	int XPATH_TYPE1 = 100;


	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Annotated <em>Annotated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated</em>'.
	 * @see org.w3._2001.xml.xsd.Annotated
	 * @generated
	 */
	EClass getAnnotated();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.Annotated#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.w3._2001.xml.xsd.Annotated#getAnnotation()
	 * @see #getAnnotated()
	 * @generated
	 */
	EReference getAnnotated_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Annotated#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001.xml.xsd.Annotated#getId()
	 * @see #getAnnotated()
	 * @generated
	 */
	EAttribute getAnnotated_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.w3._2001.xml.xsd.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AnnotationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.AnnotationType#getGroup()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.AnnotationType#getAppinfo <em>Appinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appinfo</em>'.
	 * @see org.w3._2001.xml.xsd.AnnotationType#getAppinfo()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Appinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.AnnotationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.w3._2001.xml.xsd.AnnotationType#getDocumentation()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AnnotationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001.xml.xsd.AnnotationType#getId()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see org.w3._2001.xml.xsd.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AnyType#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.AnyType#getMaxOccurs()
	 * @see #getAnyType()
	 * @generated
	 */
	EAttribute getAnyType_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AnyType#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.AnyType#getMinOccurs()
	 * @see #getAnyType()
	 * @generated
	 */
	EAttribute getAnyType_MinOccurs();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.AppinfoType <em>Appinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appinfo Type</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType
	 * @generated
	 */
	EClass getAppinfoType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AppinfoType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType#getMixed()
	 * @see #getAppinfoType()
	 * @generated
	 */
	EAttribute getAppinfoType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AppinfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType#getGroup()
	 * @see #getAppinfoType()
	 * @generated
	 */
	EAttribute getAppinfoType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AppinfoType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType#getAny()
	 * @see #getAppinfoType()
	 * @generated
	 */
	EAttribute getAppinfoType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AppinfoType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType#getSource()
	 * @see #getAppinfoType()
	 * @generated
	 */
	EAttribute getAppinfoType_Source();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AppinfoType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.AppinfoType#getAnyAttribute()
	 * @see #getAppinfoType()
	 * @generated
	 */
	EAttribute getAppinfoType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.Attribute#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getSimpleType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getFixed()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getForm()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Form();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getRef()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Attribute#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.w3._2001.xml.xsd.Attribute#getUse()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Use();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup
	 * @generated
	 */
	EClass getAttributeGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.AttributeGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getGroup()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.AttributeGroup#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getAttribute()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.AttributeGroup#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getAttributeGroup()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.AttributeGroup#getAnyAttribute1 <em>Any Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getAnyAttribute1()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AnyAttribute1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AttributeGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getName()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.AttributeGroup#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroup#getRef()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Ref();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.AttributeGroupRef <em>Attribute Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group Ref</em>'.
	 * @see org.w3._2001.xml.xsd.AttributeGroupRef
	 * @generated
	 */
	EClass getAttributeGroupRef();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ComplexContentType <em>Complex Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Content Type</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexContentType
	 * @generated
	 */
	EClass getComplexContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexContentType#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexContentType#getRestriction()
	 * @see #getComplexContentType()
	 * @generated
	 */
	EReference getComplexContentType_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexContentType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexContentType#getExtension()
	 * @see #getComplexContentType()
	 * @generated
	 */
	EReference getComplexContentType_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexContentType#isMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexContentType#isMixed()
	 * @see #getComplexContentType()
	 * @generated
	 */
	EAttribute getComplexContentType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ComplexRestrictionType <em>Complex Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Restriction Type</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexRestrictionType
	 * @generated
	 */
	EClass getComplexRestrictionType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getSimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Content</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getSimpleContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_SimpleContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Content</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getComplexContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_ComplexContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getAll()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_All();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getChoice()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getSequence()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Sequence();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.ComplexType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getGroup1()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.ComplexType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getAttribute()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.ComplexType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getAttributeGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ComplexType#getAnyAttribute1 <em>Any Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getAnyAttribute1()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AnyAttribute1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#isAbstract()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexType#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getBlock()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Block();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getFinal()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexType#isMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#isMixed()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.DocumentationType <em>Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Type</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType
	 * @generated
	 */
	EClass getDocumentationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.DocumentationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType#getMixed()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.DocumentationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType#getGroup()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.DocumentationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType#getAny()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.DocumentationType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType#getSource()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Source();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.DocumentationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentationType#getAnyAttribute()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001.xml.xsd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001.xml.xsd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAll()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_All();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAny()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAnyAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnyAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAppinfo <em>Appinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appinfo</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAppinfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Appinfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getAttributeGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getChoice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Content</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getComplexContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getComplexType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getEnumeration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Field();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fraction Digits</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getFractionDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FractionDigits();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getInclude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Include();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getKeyref <em>Keyref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyref</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getKeyref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keyref();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Length();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMaxExclusive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MaxExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMaxInclusive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MaxInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMaxLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MaxLength();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMinExclusive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MinExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMinInclusive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MinInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Length</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getMinLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MinLength();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notation</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getNotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Notation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getPattern()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getRedefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redefine</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getRedefine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Redefine();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getRestriction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getSelector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getSimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Content</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getSimpleContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getSimpleType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Digits</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getTotalDigits()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TotalDigits();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getUnion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Union();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unique</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getUnique()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Unique();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.DocumentRoot#getWhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Space</em>'.
	 * @see org.w3._2001.xml.xsd.DocumentRoot#getWhiteSpace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WhiteSpace();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.w3._2001.xml.xsd.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.Element#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getSimpleType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.Element#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getComplexType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ComplexType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.Element#getIdentityConstraint <em>Identity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identity Constraint</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getIdentityConstraint()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IdentityConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Element#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getUnique()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Unique();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Element#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getKey()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Element#getKeyref <em>Keyref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyref</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getKeyref()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Keyref();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.w3._2001.xml.xsd.Element#isAbstract()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getBlock()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Block();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getFinal()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getFixed()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getForm()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Form();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see org.w3._2001.xml.xsd.Element#isNillable()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Nillable();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getRef()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getSubstitutionGroup <em>Substitution Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitution Group</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getSubstitutionGroup()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_SubstitutionGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2001.xml.xsd.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ExplicitGroup <em>Explicit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Group</em>'.
	 * @see org.w3._2001.xml.xsd.ExplicitGroup
	 * @generated
	 */
	EClass getExplicitGroup();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType
	 * @generated
	 */
	EClass getExtensionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ExtensionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getGroup()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ExtensionType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getAll()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_All();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ExtensionType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getChoice()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ExtensionType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getSequence()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_Sequence();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.ExtensionType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getGroup1()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.ExtensionType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getAttribute()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.ExtensionType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getAttributeGroup()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ExtensionType#getAnyAttribute1 <em>Any Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getAnyAttribute1()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_AnyAttribute1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ExtensionType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.w3._2001.xml.xsd.ExtensionType#getBase()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Base();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see org.w3._2001.xml.xsd.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Facet#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see org.w3._2001.xml.xsd.Facet#isFixed()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Facet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3._2001.xml.xsd.Facet#getValue()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Value();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see org.w3._2001.xml.xsd.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.FieldType#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see org.w3._2001.xml.xsd.FieldType#getXpath()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_Xpath();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.Group#getParticle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Particle</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getParticle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Particle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getElement()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getAll()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_All();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getChoice()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getSequence()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Group#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getAny()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Group#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getMaxOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Group#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getMinOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Group#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.w3._2001.xml.xsd.Group#getRef()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Ref();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.GroupRef <em>Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Ref</em>'.
	 * @see org.w3._2001.xml.xsd.GroupRef
	 * @generated
	 */
	EClass getGroupRef();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see org.w3._2001.xml.xsd.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ImportType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.w3._2001.xml.xsd.ImportType#getNamespace()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ImportType#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see org.w3._2001.xml.xsd.ImportType#getSchemaLocation()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see org.w3._2001.xml.xsd.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.IncludeType#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see org.w3._2001.xml.xsd.IncludeType#getSchemaLocation()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Keybase <em>Keybase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keybase</em>'.
	 * @see org.w3._2001.xml.xsd.Keybase
	 * @generated
	 */
	EClass getKeybase();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.Keybase#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.w3._2001.xml.xsd.Keybase#getSelector()
	 * @see #getKeybase()
	 * @generated
	 */
	EReference getKeybase_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.Keybase#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.w3._2001.xml.xsd.Keybase#getField()
	 * @see #getKeybase()
	 * @generated
	 */
	EReference getKeybase_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Keybase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.Keybase#getName()
	 * @see #getKeybase()
	 * @generated
	 */
	EAttribute getKeybase_Name();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.KeyrefType <em>Keyref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyref Type</em>'.
	 * @see org.w3._2001.xml.xsd.KeyrefType
	 * @generated
	 */
	EClass getKeyrefType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.KeyrefType#getRefer <em>Refer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refer</em>'.
	 * @see org.w3._2001.xml.xsd.KeyrefType#getRefer()
	 * @see #getKeyrefType()
	 * @generated
	 */
	EAttribute getKeyrefType_Refer();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see org.w3._2001.xml.xsd.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.ListType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.ListType#getSimpleType()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_SimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.ListType#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see org.w3._2001.xml.xsd.ListType#getItemType()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_ItemType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.LocalComplexType <em>Local Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.LocalComplexType
	 * @generated
	 */
	EClass getLocalComplexType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.LocalElement <em>Local Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Element</em>'.
	 * @see org.w3._2001.xml.xsd.LocalElement
	 * @generated
	 */
	EClass getLocalElement();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.LocalSimpleType <em>Local Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.LocalSimpleType
	 * @generated
	 */
	EClass getLocalSimpleType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NamedAttributeGroup <em>Named Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.NamedAttributeGroup
	 * @generated
	 */
	EClass getNamedAttributeGroup();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NamedGroup <em>Named Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Group</em>'.
	 * @see org.w3._2001.xml.xsd.NamedGroup
	 * @generated
	 */
	EClass getNamedGroup();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NarrowMaxMin <em>Narrow Max Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrow Max Min</em>'.
	 * @see org.w3._2001.xml.xsd.NarrowMaxMin
	 * @generated
	 */
	EClass getNarrowMaxMin();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NoFixedFacet <em>No Fixed Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Fixed Facet</em>'.
	 * @see org.w3._2001.xml.xsd.NoFixedFacet
	 * @generated
	 */
	EClass getNoFixedFacet();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NotationType <em>Notation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation Type</em>'.
	 * @see org.w3._2001.xml.xsd.NotationType
	 * @generated
	 */
	EClass getNotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.NotationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.NotationType#getName()
	 * @see #getNotationType()
	 * @generated
	 */
	EAttribute getNotationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.NotationType#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see org.w3._2001.xml.xsd.NotationType#getPublic()
	 * @see #getNotationType()
	 * @generated
	 */
	EAttribute getNotationType_Public();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.NotationType#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.w3._2001.xml.xsd.NotationType#getSystem()
	 * @see #getNotationType()
	 * @generated
	 */
	EAttribute getNotationType_System();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.NumFacet <em>Num Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Facet</em>'.
	 * @see org.w3._2001.xml.xsd.NumFacet
	 * @generated
	 */
	EClass getNumFacet();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.OpenAttrs <em>Open Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Attrs</em>'.
	 * @see org.w3._2001.xml.xsd.OpenAttrs
	 * @generated
	 */
	EClass getOpenAttrs();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.OpenAttrs#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.OpenAttrs#getAnyAttribute()
	 * @see #getOpenAttrs()
	 * @generated
	 */
	EAttribute getOpenAttrs_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.PatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Type</em>'.
	 * @see org.w3._2001.xml.xsd.PatternType
	 * @generated
	 */
	EClass getPatternType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.RealGroup <em>Real Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Group</em>'.
	 * @see org.w3._2001.xml.xsd.RealGroup
	 * @generated
	 */
	EClass getRealGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RealGroup#getAll1 <em>All1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All1</em>'.
	 * @see org.w3._2001.xml.xsd.RealGroup#getAll1()
	 * @see #getRealGroup()
	 * @generated
	 */
	EReference getRealGroup_All1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RealGroup#getChoice1 <em>Choice1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice1</em>'.
	 * @see org.w3._2001.xml.xsd.RealGroup#getChoice1()
	 * @see #getRealGroup()
	 * @generated
	 */
	EReference getRealGroup_Choice1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RealGroup#getSequence1 <em>Sequence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence1</em>'.
	 * @see org.w3._2001.xml.xsd.RealGroup#getSequence1()
	 * @see #getRealGroup()
	 * @generated
	 */
	EReference getRealGroup_Sequence1();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.RedefineType <em>Redefine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefine Type</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType
	 * @generated
	 */
	EClass getRedefineType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.RedefineType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getGroup()
	 * @see #getRedefineType()
	 * @generated
	 */
	EAttribute getRedefineType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RedefineType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getAnnotation()
	 * @see #getRedefineType()
	 * @generated
	 */
	EReference getRedefineType_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RedefineType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getSimpleType()
	 * @see #getRedefineType()
	 * @generated
	 */
	EReference getRedefineType_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RedefineType#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getComplexType()
	 * @see #getRedefineType()
	 * @generated
	 */
	EReference getRedefineType_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RedefineType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group1</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getGroup1()
	 * @see #getRedefineType()
	 * @generated
	 */
	EReference getRedefineType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RedefineType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getAttributeGroup()
	 * @see #getRedefineType()
	 * @generated
	 */
	EReference getRedefineType_AttributeGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.RedefineType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getId()
	 * @see #getRedefineType()
	 * @generated
	 */
	EAttribute getRedefineType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.RedefineType#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see org.w3._2001.xml.xsd.RedefineType#getSchemaLocation()
	 * @see #getRedefineType()
	 * @generated
	 */
	EAttribute getRedefineType_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.RestrictionType <em>Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Type</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType
	 * @generated
	 */
	EClass getRestrictionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getGroup()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getAll()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_All();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getChoice()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getSequence()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getSimpleType()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_SimpleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.RestrictionType#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Facets</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getFacets()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EAttribute getRestrictionType_Facets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMinExclusive()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MinExclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMinInclusive()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MinInclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMaxExclusive()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MaxExclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMaxInclusive()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MaxInclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Digits</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getTotalDigits()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_TotalDigits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fraction Digits</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getFractionDigits()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_FractionDigits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getLength()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMinLength()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MinLength();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getMaxLength()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_MaxLength();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getEnumeration()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getWhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>White Space</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getWhiteSpace()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_WhiteSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getPattern()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Pattern();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.RestrictionType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getGroup1()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EAttribute getRestrictionType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getAttribute()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getAttributeGroup()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType#getAnyAttribute1 <em>Any Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getAnyAttribute1()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EReference getRestrictionType_AnyAttribute1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.RestrictionType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType#getBase()
	 * @see #getRestrictionType()
	 * @generated
	 */
	EAttribute getRestrictionType_Base();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.RestrictionType1 <em>Restriction Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Type1</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1
	 * @generated
	 */
	EClass getRestrictionType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.RestrictionType1#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getSimpleType()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_SimpleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.RestrictionType1#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Facets</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getFacets()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EAttribute getRestrictionType1_Facets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMinExclusive()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MinExclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMinInclusive()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MinInclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Exclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMaxExclusive()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MaxExclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Inclusive</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMaxInclusive()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MaxInclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Digits</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getTotalDigits()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_TotalDigits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fraction Digits</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getFractionDigits()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_FractionDigits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getLength()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMinLength()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MinLength();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Length</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getMaxLength()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_MaxLength();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getEnumeration()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getWhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>White Space</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getWhiteSpace()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_WhiteSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.RestrictionType1#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getPattern()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EReference getRestrictionType1_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.RestrictionType1#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.w3._2001.xml.xsd.RestrictionType1#getBase()
	 * @see #getRestrictionType1()
	 * @generated
	 */
	EAttribute getRestrictionType1_Base();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SchemaType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType
	 * @generated
	 */
	EClass getSchemaType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.SchemaType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getGroup()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getInclude()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getImport()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getRedefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redefine</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getRedefine()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Redefine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getAnnotation()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Annotation();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xml.xsd.SchemaType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getGroup1()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getSimpleType()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getComplexType()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getGroup2 <em>Group2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group2</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getGroup2()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Group2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getAttributeGroup()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getElement()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getAttribute()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notation</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getNotation()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Notation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.SchemaType#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getAnnotation1()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Annotation1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Form Default</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_AttributeFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getBlockDefault <em>Block Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Default</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getBlockDefault()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_BlockDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getElementFormDefault <em>Element Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Form Default</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getElementFormDefault()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_ElementFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getFinalDefault <em>Final Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Default</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getFinalDefault()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_FinalDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getId()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getTargetNamespace()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SchemaType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.w3._2001.xml.xsd.SchemaType#getVersion()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Version();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Type</em>'.
	 * @see org.w3._2001.xml.xsd.SelectorType
	 * @generated
	 */
	EClass getSelectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SelectorType#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see org.w3._2001.xml.xsd.SelectorType#getXpath()
	 * @see #getSelectorType()
	 * @generated
	 */
	EAttribute getSelectorType_Xpath();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SimpleContentType <em>Simple Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Content Type</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleContentType
	 * @generated
	 */
	EClass getSimpleContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.SimpleContentType#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleContentType#getRestriction()
	 * @see #getSimpleContentType()
	 * @generated
	 */
	EReference getSimpleContentType_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.SimpleContentType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleContentType#getExtension()
	 * @see #getSimpleContentType()
	 * @generated
	 */
	EReference getSimpleContentType_Extension();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SimpleExplicitGroup <em>Simple Explicit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Explicit Group</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleExplicitGroup
	 * @generated
	 */
	EClass getSimpleExplicitGroup();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SimpleExtensionType <em>Simple Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Extension Type</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleExtensionType
	 * @generated
	 */
	EClass getSimpleExtensionType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SimpleRestrictionType <em>Simple Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Restriction Type</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleRestrictionType
	 * @generated
	 */
	EClass getSimpleRestrictionType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.SimpleType#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType#getRestriction()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.SimpleType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType#getList()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xml.xsd.SimpleType#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType#getUnion()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Union();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SimpleType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType#getFinal()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.SimpleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleType#getName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Name();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.TopLevelAttribute <em>Top Level Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Attribute</em>'.
	 * @see org.w3._2001.xml.xsd.TopLevelAttribute
	 * @generated
	 */
	EClass getTopLevelAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.TopLevelComplexType <em>Top Level Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Complex Type</em>'.
	 * @see org.w3._2001.xml.xsd.TopLevelComplexType
	 * @generated
	 */
	EClass getTopLevelComplexType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.TopLevelElement <em>Top Level Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Element</em>'.
	 * @see org.w3._2001.xml.xsd.TopLevelElement
	 * @generated
	 */
	EClass getTopLevelElement();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.TopLevelSimpleType <em>Top Level Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.TopLevelSimpleType
	 * @generated
	 */
	EClass getTopLevelSimpleType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.TotalDigitsType <em>Total Digits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Digits Type</em>'.
	 * @see org.w3._2001.xml.xsd.TotalDigitsType
	 * @generated
	 */
	EClass getTotalDigitsType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see org.w3._2001.xml.xsd.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.xsd.UnionType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see org.w3._2001.xml.xsd.UnionType#getSimpleType()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_SimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.UnionType#getMemberTypes <em>Member Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Types</em>'.
	 * @see org.w3._2001.xml.xsd.UnionType#getMemberTypes()
	 * @see #getUnionType()
	 * @generated
	 */
	EAttribute getUnionType_MemberTypes();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.WhiteSpaceType <em>White Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Space Type</em>'.
	 * @see org.w3._2001.xml.xsd.WhiteSpaceType
	 * @generated
	 */
	EClass getWhiteSpaceType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xml.xsd.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard</em>'.
	 * @see org.w3._2001.xml.xsd.Wildcard
	 * @generated
	 */
	EClass getWildcard();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Wildcard#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.w3._2001.xml.xsd.Wildcard#getNamespace()
	 * @see #getWildcard()
	 * @generated
	 */
	EAttribute getWildcard_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xml.xsd.Wildcard#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see org.w3._2001.xml.xsd.Wildcard#getProcessContents()
	 * @see #getWildcard()
	 * @generated
	 */
	EAttribute getWildcard_ProcessContents();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.AllNNIMember1 <em>All NNI Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All NNI Member1</em>'.
	 * @see org.w3._2001.xml.xsd.AllNNIMember1
	 * @generated
	 */
	EEnum getAllNNIMember1();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.BlockSetMember0 <em>Block Set Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Set Member0</em>'.
	 * @see org.w3._2001.xml.xsd.BlockSetMember0
	 * @generated
	 */
	EEnum getBlockSetMember0();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.BlockSetMember1Item <em>Block Set Member1 Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Set Member1 Item</em>'.
	 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
	 * @generated
	 */
	EEnum getBlockSetMember1Item();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.DerivationControl <em>Derivation Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Derivation Control</em>'.
	 * @see org.w3._2001.xml.xsd.DerivationControl
	 * @generated
	 */
	EEnum getDerivationControl();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.DerivationSetMember0 <em>Derivation Set Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Derivation Set Member0</em>'.
	 * @see org.w3._2001.xml.xsd.DerivationSetMember0
	 * @generated
	 */
	EEnum getDerivationSetMember0();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.FormChoice <em>Form Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Choice</em>'.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @generated
	 */
	EEnum getFormChoice();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Full Derivation Set Member0</em>'.
	 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
	 * @generated
	 */
	EEnum getFullDerivationSetMember0();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.NamespaceListMember0 <em>Namespace List Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Namespace List Member0</em>'.
	 * @see org.w3._2001.xml.xsd.NamespaceListMember0
	 * @generated
	 */
	EEnum getNamespaceListMember0();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1 <em>Namespace List Member1 Item Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Namespace List Member1 Item Member1</em>'.
	 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
	 * @generated
	 */
	EEnum getNamespaceListMember1ItemMember1();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.ProcessContentsType <em>Process Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Contents Type</em>'.
	 * @see org.w3._2001.xml.xsd.ProcessContentsType
	 * @generated
	 */
	EEnum getProcessContentsType();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.ReducedDerivationControl <em>Reduced Derivation Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reduced Derivation Control</em>'.
	 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
	 * @generated
	 */
	EEnum getReducedDerivationControl();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Derivation Set Member0</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
	 * @generated
	 */
	EEnum getSimpleDerivationSetMember0();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Derivation Set Member1 Item</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
	 * @generated
	 */
	EEnum getSimpleDerivationSetMember1Item();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.TypeDerivationControl <em>Type Derivation Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Derivation Control</em>'.
	 * @see org.w3._2001.xml.xsd.TypeDerivationControl
	 * @generated
	 */
	EEnum getTypeDerivationControl();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xml.xsd.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use Type</em>'.
	 * @see org.w3._2001.xml.xsd.UseType
	 * @generated
	 */
	EEnum getUseType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>All NNI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    for maxOccurs
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>All NNI</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='allNNI' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger allNNI_._member_._1'"
	 * @generated
	 */
	EDataType getAllNNI();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.AllNNIMember1 <em>All NNI Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All NNI Member1 Object</em>'.
	 * @see org.w3._2001.xml.xsd.AllNNIMember1
	 * @model instanceClass="org.w3._2001.xml.xsd.AllNNIMember1"
	 *        extendedMetaData="name='allNNI_._member_._1:Object' baseType='allNNI_._member_._1'"
	 * @generated
	 */
	EDataType getAllNNIMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Block Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *     A utility type, not for public use
     * 
     *     #all or (possibly empty) subset of {substitution, extension,
     *     restriction}
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Block Set</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='blockSet' memberTypes='blockSet_._member_._0 blockSet_._member_._1'"
	 * @generated
	 */
	EDataType getBlockSet();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.BlockSetMember0 <em>Block Set Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Block Set Member0 Object</em>'.
	 * @see org.w3._2001.xml.xsd.BlockSetMember0
	 * @model instanceClass="org.w3._2001.xml.xsd.BlockSetMember0"
	 *        extendedMetaData="name='blockSet_._member_._0:Object' baseType='blockSet_._member_._0'"
	 * @generated
	 */
	EDataType getBlockSetMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Block Set Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Block Set Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='blockSet_._member_._1' itemType='blockSet_._member_._1_._item'"
	 * @generated
	 */
	EDataType getBlockSetMember1();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.BlockSetMember1Item <em>Block Set Member1 Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Block Set Member1 Item Object</em>'.
	 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
	 * @model instanceClass="org.w3._2001.xml.xsd.BlockSetMember1Item"
	 *        extendedMetaData="name='blockSet_._member_._1_._item:Object' baseType='blockSet_._member_._1_._item'"
	 * @generated
	 */
	EDataType getBlockSetMember1ItemObject();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.DerivationControl <em>Derivation Control Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Derivation Control Object</em>'.
	 * @see org.w3._2001.xml.xsd.DerivationControl
	 * @model instanceClass="org.w3._2001.xml.xsd.DerivationControl"
	 *        extendedMetaData="name='derivationControl:Object' baseType='derivationControl'"
	 * @generated
	 */
	EDataType getDerivationControlObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Derivation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    A utility type, not for public use
     * 
     *    #all or (possibly empty) subset of {extension, restriction}
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Derivation Set</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='derivationSet' memberTypes='derivationSet_._member_._0 derivationSet_._member_._1'"
	 * @generated
	 */
	EDataType getDerivationSet();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.DerivationSetMember0 <em>Derivation Set Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Derivation Set Member0 Object</em>'.
	 * @see org.w3._2001.xml.xsd.DerivationSetMember0
	 * @model instanceClass="org.w3._2001.xml.xsd.DerivationSetMember0"
	 *        extendedMetaData="name='derivationSet_._member_._0:Object' baseType='derivationSet_._member_._0'"
	 * @generated
	 */
	EDataType getDerivationSetMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Derivation Set Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Derivation Set Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='derivationSet_._member_._1' itemType='reducedDerivationControl'"
	 * @generated
	 */
	EDataType getDerivationSetMember1();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.FormChoice <em>Form Choice Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Form Choice Object</em>'.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @model instanceClass="org.w3._2001.xml.xsd.FormChoice"
	 *        extendedMetaData="name='formChoice:Object' baseType='formChoice'"
	 * @generated
	 */
	EDataType getFormChoiceObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Full Derivation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    A utility type, not for public use
     * 
     *    #all or (possibly empty) subset of {extension, restriction, list, union}
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Full Derivation Set</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='fullDerivationSet' memberTypes='fullDerivationSet_._member_._0 fullDerivationSet_._member_._1'"
	 * @generated
	 */
	EDataType getFullDerivationSet();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.FullDerivationSetMember0 <em>Full Derivation Set Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Full Derivation Set Member0 Object</em>'.
	 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
	 * @model instanceClass="org.w3._2001.xml.xsd.FullDerivationSetMember0"
	 *        extendedMetaData="name='fullDerivationSet_._member_._0:Object' baseType='fullDerivationSet_._member_._0'"
	 * @generated
	 */
	EDataType getFullDerivationSetMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Full Derivation Set Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Full Derivation Set Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='fullDerivationSet_._member_._1' itemType='typeDerivationControl'"
	 * @generated
	 */
	EDataType getFullDerivationSetMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Member Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Member Types Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='memberTypes_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getMemberTypesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Namespace List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    A utility type, not for public use
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Namespace List</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='namespaceList' memberTypes='namespaceList_._member_._0 namespaceList_._member_._1'"
	 * @generated
	 */
	EDataType getNamespaceList();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.NamespaceListMember0 <em>Namespace List Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace List Member0 Object</em>'.
	 * @see org.w3._2001.xml.xsd.NamespaceListMember0
	 * @model instanceClass="org.w3._2001.xml.xsd.NamespaceListMember0"
	 *        extendedMetaData="name='namespaceList_._member_._0:Object' baseType='namespaceList_._member_._0'"
	 * @generated
	 */
	EDataType getNamespaceListMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Namespace List Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace List Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='namespaceList_._member_._1' itemType='namespaceList_._member_._1_._item'"
	 * @generated
	 */
	EDataType getNamespaceListMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Namespace List Member1 Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace List Member1 Item</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='namespaceList_._member_._1_._item' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI namespaceList_._member_._1_._item_._member_._1'"
	 * @generated
	 */
	EDataType getNamespaceListMember1Item();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1 <em>Namespace List Member1 Item Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace List Member1 Item Member1 Object</em>'.
	 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
	 * @model instanceClass="org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1"
	 *        extendedMetaData="name='namespaceList_._member_._1_._item_._member_._1:Object' baseType='namespaceList_._member_._1_._item_._member_._1'"
	 * @generated
	 */
	EDataType getNamespaceListMember1ItemMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.ProcessContentsType <em>Process Contents Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Process Contents Type Object</em>'.
	 * @see org.w3._2001.xml.xsd.ProcessContentsType
	 * @model instanceClass="org.w3._2001.xml.xsd.ProcessContentsType"
	 *        extendedMetaData="name='processContents_._type:Object' baseType='processContents_._type'"
	 * @generated
	 */
	EDataType getProcessContentsTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    A utility type, not for public use
     * 
     *    A public identifier, per ISO 8879
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Public</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='public' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getPublic();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.ReducedDerivationControl <em>Reduced Derivation Control Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reduced Derivation Control Object</em>'.
	 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
	 * @model instanceClass="org.w3._2001.xml.xsd.ReducedDerivationControl"
	 *        extendedMetaData="name='reducedDerivationControl:Object' baseType='reducedDerivationControl'"
	 * @generated
	 */
	EDataType getReducedDerivationControlObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Simple Derivation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *    #all or (possibly empty) subset of {restriction, union, list}
     *    
     * 
     *    A utility type, not for public use
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Simple Derivation Set</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='simpleDerivationSet' memberTypes='simpleDerivationSet_._member_._0 simpleDerivationSet_._member_._1'"
	 * @generated
	 */
	EDataType getSimpleDerivationSet();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Derivation Set Member0 Object</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
	 * @model instanceClass="org.w3._2001.xml.xsd.SimpleDerivationSetMember0"
	 *        extendedMetaData="name='simpleDerivationSet_._member_._0:Object' baseType='simpleDerivationSet_._member_._0'"
	 * @generated
	 */
	EDataType getSimpleDerivationSetMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Simple Derivation Set Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Derivation Set Member1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='simpleDerivationSet_._member_._1' itemType='simpleDerivationSet_._member_._1_._item'"
	 * @generated
	 */
	EDataType getSimpleDerivationSetMember1();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Derivation Set Member1 Item Object</em>'.
	 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
	 * @model instanceClass="org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item"
	 *        extendedMetaData="name='simpleDerivationSet_._member_._1_._item:Object' baseType='simpleDerivationSet_._member_._1_._item'"
	 * @generated
	 */
	EDataType getSimpleDerivationSetMember1ItemObject();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.TypeDerivationControl <em>Type Derivation Control Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Derivation Control Object</em>'.
	 * @see org.w3._2001.xml.xsd.TypeDerivationControl
	 * @model instanceClass="org.w3._2001.xml.xsd.TypeDerivationControl"
	 *        extendedMetaData="name='typeDerivationControl:Object' baseType='typeDerivationControl'"
	 * @generated
	 */
	EDataType getTypeDerivationControlObject();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xml.xsd.UseType <em>Use Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Use Type Object</em>'.
	 * @see org.w3._2001.xml.xsd.UseType
	 * @model instanceClass="org.w3._2001.xml.xsd.UseType"
	 *        extendedMetaData="name='use_._type:Object' baseType='use_._type'"
	 * @generated
	 */
	EDataType getUseTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Xpath Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A subset of XPath expressions for use
     * in fields
     * A utility type, not for public
     * use
     * The following pattern is intended to allow XPath
     *                            expressions per the same EBNF as for selector,
     *                            with the following change:
     *           Path    ::=    ('.//')? ( Step '/' )* ( Step | '@' NameTest ) 
     *          
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Xpath Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='xpath_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(\\.//)?((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)/)*((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)|((attribute::|@)((\\i\\c*:)?(\\i\\c*|\\*))))(\\|(\\.//)?((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)/)*((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)|((attribute::|@)((\\i\\c*:)?(\\i\\c*|\\*)))))*'"
	 * @generated
	 */
	EDataType getXpathType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Xpath Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A subset of XPath expressions for use
     * in selectors
     * A utility type, not for public
     * use
     * The following pattern is intended to allow XPath
     *                            expressions per the following EBNF:
     *           Selector    ::=    Path ( '|' Path )*  
     *           Path    ::=    ('.//')? Step ( '/' Step )*  
     *           Step    ::=    '.' | NameTest  
     *           NameTest    ::=    QName | '*' | NCName ':' '*'  
     *                            child:: is also allowed
     *          
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Xpath Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='xpath_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(\\.//)?(((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)(/(((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.))*(\\|(\\.//)?(((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)(/(((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.))*)*'"
	 * @generated
	 */
	EDataType getXpathType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaFactory getSchemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AllImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AnnotatedImpl <em>Annotated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AnnotatedImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnnotated()
		 * @generated
		 */
		EClass ANNOTATED = eINSTANCE.getAnnotated();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED__ANNOTATION = eINSTANCE.getAnnotated_Annotation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATED__ID = eINSTANCE.getAnnotated_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AnnotationTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnnotationType()
		 * @generated
		 */
		EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__GROUP = eINSTANCE.getAnnotationType_Group();

		/**
		 * The meta object literal for the '<em><b>Appinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__APPINFO = eINSTANCE.getAnnotationType_Appinfo();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__DOCUMENTATION = eINSTANCE.getAnnotationType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__ID = eINSTANCE.getAnnotationType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AnyTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_TYPE__MAX_OCCURS = eINSTANCE.getAnyType_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_TYPE__MIN_OCCURS = eINSTANCE.getAnyType_MinOccurs();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AppinfoTypeImpl <em>Appinfo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AppinfoTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAppinfoType()
		 * @generated
		 */
		EClass APPINFO_TYPE = eINSTANCE.getAppinfoType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPINFO_TYPE__MIXED = eINSTANCE.getAppinfoType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPINFO_TYPE__GROUP = eINSTANCE.getAppinfoType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPINFO_TYPE__ANY = eINSTANCE.getAppinfoType_Any();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPINFO_TYPE__SOURCE = eINSTANCE.getAppinfoType_Source();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPINFO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAppinfoType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AttributeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SIMPLE_TYPE = eINSTANCE.getAttribute_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__FIXED = eINSTANCE.getAttribute_Fixed();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__FORM = eINSTANCE.getAttribute_Form();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REF = eINSTANCE.getAttribute_Ref();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__USE = eINSTANCE.getAttribute_Use();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AttributeGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttributeGroup()
		 * @generated
		 */
		EClass ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_GROUP__GROUP = eINSTANCE.getAttributeGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP__ATTRIBUTE = eINSTANCE.getAttributeGroup_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = eINSTANCE.getAttributeGroup_AnyAttribute1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_GROUP__NAME = eINSTANCE.getAttributeGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_GROUP__REF = eINSTANCE.getAttributeGroup_Ref();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.AttributeGroupRefImpl <em>Attribute Group Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.AttributeGroupRefImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAttributeGroupRef()
		 * @generated
		 */
		EClass ATTRIBUTE_GROUP_REF = eINSTANCE.getAttributeGroupRef();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ComplexContentTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexContentType()
		 * @generated
		 */
		EClass COMPLEX_CONTENT_TYPE = eINSTANCE.getComplexContentType();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_CONTENT_TYPE__RESTRICTION = eINSTANCE.getComplexContentType_Restriction();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_CONTENT_TYPE__EXTENSION = eINSTANCE.getComplexContentType_Extension();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_CONTENT_TYPE__MIXED = eINSTANCE.getComplexContentType_Mixed();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ComplexRestrictionTypeImpl <em>Complex Restriction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ComplexRestrictionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexRestrictionType()
		 * @generated
		 */
		EClass COMPLEX_RESTRICTION_TYPE = eINSTANCE.getComplexRestrictionType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ComplexTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Simple Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__SIMPLE_CONTENT = eINSTANCE.getComplexType_SimpleContent();

		/**
		 * The meta object literal for the '<em><b>Complex Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__COMPLEX_CONTENT = eINSTANCE.getComplexType_ComplexContent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__GROUP = eINSTANCE.getComplexType_Group();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__ALL = eINSTANCE.getComplexType_All();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__CHOICE = eINSTANCE.getComplexType_Choice();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__SEQUENCE = eINSTANCE.getComplexType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__GROUP1 = eINSTANCE.getComplexType_Group1();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__ATTRIBUTE = eINSTANCE.getComplexType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getComplexType_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getComplexType_AnyAttribute1();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__ABSTRACT = eINSTANCE.getComplexType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__BLOCK = eINSTANCE.getComplexType_Block();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__FINAL = eINSTANCE.getComplexType_Final();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__MIXED = eINSTANCE.getComplexType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.DocumentationTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDocumentationType()
		 * @generated
		 */
		EClass DOCUMENTATION_TYPE = eINSTANCE.getDocumentationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__MIXED = eINSTANCE.getDocumentationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__GROUP = eINSTANCE.getDocumentationType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__ANY = eINSTANCE.getDocumentationType_Any();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__SOURCE = eINSTANCE.getDocumentationType_Source();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDocumentationType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.DocumentRootImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALL = eINSTANCE.getDocumentRoot_All();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANNOTATION = eINSTANCE.getDocumentRoot_Annotation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANY = eINSTANCE.getDocumentRoot_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANY_ATTRIBUTE = eINSTANCE.getDocumentRoot_AnyAttribute();

		/**
		 * The meta object literal for the '<em><b>Appinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPINFO = eINSTANCE.getDocumentRoot_Appinfo();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTE = eINSTANCE.getDocumentRoot_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTE_GROUP = eINSTANCE.getDocumentRoot_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHOICE = eINSTANCE.getDocumentRoot_Choice();

		/**
		 * The meta object literal for the '<em><b>Complex Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPLEX_CONTENT = eINSTANCE.getDocumentRoot_ComplexContent();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPLEX_TYPE = eINSTANCE.getDocumentRoot_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELEMENT = eINSTANCE.getDocumentRoot_Element();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENUMERATION = eINSTANCE.getDocumentRoot_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FIELD = eINSTANCE.getDocumentRoot_Field();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FRACTION_DIGITS = eINSTANCE.getDocumentRoot_FractionDigits();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUP = eINSTANCE.getDocumentRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUDE = eINSTANCE.getDocumentRoot_Include();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY = eINSTANCE.getDocumentRoot_Key();

		/**
		 * The meta object literal for the '<em><b>Keyref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYREF = eINSTANCE.getDocumentRoot_Keyref();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LENGTH = eINSTANCE.getDocumentRoot_Length();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST = eINSTANCE.getDocumentRoot_List();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MAX_EXCLUSIVE = eINSTANCE.getDocumentRoot_MaxExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MAX_INCLUSIVE = eINSTANCE.getDocumentRoot_MaxInclusive();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MAX_LENGTH = eINSTANCE.getDocumentRoot_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MIN_EXCLUSIVE = eINSTANCE.getDocumentRoot_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MIN_INCLUSIVE = eINSTANCE.getDocumentRoot_MinInclusive();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MIN_LENGTH = eINSTANCE.getDocumentRoot_MinLength();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTATION = eINSTANCE.getDocumentRoot_Notation();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PATTERN = eINSTANCE.getDocumentRoot_Pattern();

		/**
		 * The meta object literal for the '<em><b>Redefine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REDEFINE = eINSTANCE.getDocumentRoot_Redefine();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESTRICTION = eINSTANCE.getDocumentRoot_Restriction();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMA = eINSTANCE.getDocumentRoot_Schema();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SELECTOR = eINSTANCE.getDocumentRoot_Selector();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEQUENCE = eINSTANCE.getDocumentRoot_Sequence();

		/**
		 * The meta object literal for the '<em><b>Simple Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_CONTENT = eINSTANCE.getDocumentRoot_SimpleContent();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_TYPE = eINSTANCE.getDocumentRoot_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Total Digits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TOTAL_DIGITS = eINSTANCE.getDocumentRoot_TotalDigits();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNION = eINSTANCE.getDocumentRoot_Union();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNIQUE = eINSTANCE.getDocumentRoot_Unique();

		/**
		 * The meta object literal for the '<em><b>White Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WHITE_SPACE = eINSTANCE.getDocumentRoot_WhiteSpace();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ElementImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SIMPLE_TYPE = eINSTANCE.getElement_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__COMPLEX_TYPE = eINSTANCE.getElement_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Identity Constraint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IDENTITY_CONSTRAINT = eINSTANCE.getElement_IdentityConstraint();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__UNIQUE = eINSTANCE.getElement_Unique();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__KEY = eINSTANCE.getElement_Key();

		/**
		 * The meta object literal for the '<em><b>Keyref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__KEYREF = eINSTANCE.getElement_Keyref();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ABSTRACT = eINSTANCE.getElement_Abstract();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BLOCK = eINSTANCE.getElement_Block();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DEFAULT = eINSTANCE.getElement_Default();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__FINAL = eINSTANCE.getElement_Final();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__FIXED = eINSTANCE.getElement_Fixed();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__FORM = eINSTANCE.getElement_Form();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MAX_OCCURS = eINSTANCE.getElement_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MIN_OCCURS = eINSTANCE.getElement_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NILLABLE = eINSTANCE.getElement_Nillable();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__REF = eINSTANCE.getElement_Ref();

		/**
		 * The meta object literal for the '<em><b>Substitution Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SUBSTITUTION_GROUP = eINSTANCE.getElement_SubstitutionGroup();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ExplicitGroupImpl <em>Explicit Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ExplicitGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getExplicitGroup()
		 * @generated
		 */
		EClass EXPLICIT_GROUP = eINSTANCE.getExplicitGroup();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ExtensionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getExtensionType()
		 * @generated
		 */
		EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__GROUP = eINSTANCE.getExtensionType_Group();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__ALL = eINSTANCE.getExtensionType_All();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__CHOICE = eINSTANCE.getExtensionType_Choice();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__SEQUENCE = eINSTANCE.getExtensionType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__GROUP1 = eINSTANCE.getExtensionType_Group1();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__ATTRIBUTE = eINSTANCE.getExtensionType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getExtensionType_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getExtensionType_AnyAttribute1();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__BASE = eINSTANCE.getExtensionType_Base();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.FacetImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__FIXED = eINSTANCE.getFacet_Fixed();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__VALUE = eINSTANCE.getFacet_Value();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.FieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.FieldTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFieldType()
		 * @generated
		 */
		EClass FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__XPATH = eINSTANCE.getFieldType_Xpath();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.GroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Particle</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PARTICLE = eINSTANCE.getGroup_Particle();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENT = eINSTANCE.getGroup_Element();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP = eINSTANCE.getGroup_Group();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ALL = eINSTANCE.getGroup_All();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CHOICE = eINSTANCE.getGroup_Choice();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SEQUENCE = eINSTANCE.getGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ANY = eINSTANCE.getGroup_Any();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__MAX_OCCURS = eINSTANCE.getGroup_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__MIN_OCCURS = eINSTANCE.getGroup_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__REF = eINSTANCE.getGroup_Ref();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.GroupRefImpl <em>Group Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.GroupRefImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getGroupRef()
		 * @generated
		 */
		EClass GROUP_REF = eINSTANCE.getGroupRef();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ImportTypeImpl <em>Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ImportTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getImportType()
		 * @generated
		 */
		EClass IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__NAMESPACE = eINSTANCE.getImportType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__SCHEMA_LOCATION = eINSTANCE.getImportType_SchemaLocation();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.IncludeTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__SCHEMA_LOCATION = eINSTANCE.getIncludeType_SchemaLocation();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.KeybaseImpl <em>Keybase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.KeybaseImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getKeybase()
		 * @generated
		 */
		EClass KEYBASE = eINSTANCE.getKeybase();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYBASE__SELECTOR = eINSTANCE.getKeybase_Selector();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYBASE__FIELD = eINSTANCE.getKeybase_Field();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBASE__NAME = eINSTANCE.getKeybase_Name();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.KeyrefTypeImpl <em>Keyref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.KeyrefTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getKeyrefType()
		 * @generated
		 */
		EClass KEYREF_TYPE = eINSTANCE.getKeyrefType();

		/**
		 * The meta object literal for the '<em><b>Refer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYREF_TYPE__REFER = eINSTANCE.getKeyrefType_Refer();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.ListTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__SIMPLE_TYPE = eINSTANCE.getListType_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__ITEM_TYPE = eINSTANCE.getListType_ItemType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.LocalComplexTypeImpl <em>Local Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.LocalComplexTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalComplexType()
		 * @generated
		 */
		EClass LOCAL_COMPLEX_TYPE = eINSTANCE.getLocalComplexType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.LocalElementImpl <em>Local Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.LocalElementImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalElement()
		 * @generated
		 */
		EClass LOCAL_ELEMENT = eINSTANCE.getLocalElement();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.LocalSimpleTypeImpl <em>Local Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.LocalSimpleTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getLocalSimpleType()
		 * @generated
		 */
		EClass LOCAL_SIMPLE_TYPE = eINSTANCE.getLocalSimpleType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NamedAttributeGroupImpl <em>Named Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NamedAttributeGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamedAttributeGroup()
		 * @generated
		 */
		EClass NAMED_ATTRIBUTE_GROUP = eINSTANCE.getNamedAttributeGroup();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NamedGroupImpl <em>Named Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NamedGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamedGroup()
		 * @generated
		 */
		EClass NAMED_GROUP = eINSTANCE.getNamedGroup();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NarrowMaxMinImpl <em>Narrow Max Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NarrowMaxMinImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNarrowMaxMin()
		 * @generated
		 */
		EClass NARROW_MAX_MIN = eINSTANCE.getNarrowMaxMin();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NoFixedFacetImpl <em>No Fixed Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NoFixedFacetImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNoFixedFacet()
		 * @generated
		 */
		EClass NO_FIXED_FACET = eINSTANCE.getNoFixedFacet();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NotationTypeImpl <em>Notation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NotationTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNotationType()
		 * @generated
		 */
		EClass NOTATION_TYPE = eINSTANCE.getNotationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION_TYPE__NAME = eINSTANCE.getNotationType_Name();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION_TYPE__PUBLIC = eINSTANCE.getNotationType_Public();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION_TYPE__SYSTEM = eINSTANCE.getNotationType_System();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.NumFacetImpl <em>Num Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.NumFacetImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNumFacet()
		 * @generated
		 */
		EClass NUM_FACET = eINSTANCE.getNumFacet();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.OpenAttrsImpl <em>Open Attrs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.OpenAttrsImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getOpenAttrs()
		 * @generated
		 */
		EClass OPEN_ATTRS = eINSTANCE.getOpenAttrs();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ATTRS__ANY_ATTRIBUTE = eINSTANCE.getOpenAttrs_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.PatternTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getPatternType()
		 * @generated
		 */
		EClass PATTERN_TYPE = eINSTANCE.getPatternType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.RealGroupImpl <em>Real Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.RealGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRealGroup()
		 * @generated
		 */
		EClass REAL_GROUP = eINSTANCE.getRealGroup();

		/**
		 * The meta object literal for the '<em><b>All1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_GROUP__ALL1 = eINSTANCE.getRealGroup_All1();

		/**
		 * The meta object literal for the '<em><b>Choice1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_GROUP__CHOICE1 = eINSTANCE.getRealGroup_Choice1();

		/**
		 * The meta object literal for the '<em><b>Sequence1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_GROUP__SEQUENCE1 = eINSTANCE.getRealGroup_Sequence1();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.RedefineTypeImpl <em>Redefine Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.RedefineTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRedefineType()
		 * @generated
		 */
		EClass REDEFINE_TYPE = eINSTANCE.getRedefineType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINE_TYPE__GROUP = eINSTANCE.getRedefineType_Group();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINE_TYPE__ANNOTATION = eINSTANCE.getRedefineType_Annotation();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINE_TYPE__SIMPLE_TYPE = eINSTANCE.getRedefineType_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINE_TYPE__COMPLEX_TYPE = eINSTANCE.getRedefineType_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINE_TYPE__GROUP1 = eINSTANCE.getRedefineType_Group1();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINE_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getRedefineType_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINE_TYPE__ID = eINSTANCE.getRedefineType_Id();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINE_TYPE__SCHEMA_LOCATION = eINSTANCE.getRedefineType_SchemaLocation();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.RestrictionTypeImpl <em>Restriction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.RestrictionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRestrictionType()
		 * @generated
		 */
		EClass RESTRICTION_TYPE = eINSTANCE.getRestrictionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__GROUP = eINSTANCE.getRestrictionType_Group();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__ALL = eINSTANCE.getRestrictionType_All();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__CHOICE = eINSTANCE.getRestrictionType_Choice();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__SEQUENCE = eINSTANCE.getRestrictionType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__SIMPLE_TYPE = eINSTANCE.getRestrictionType_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_TYPE__FACETS = eINSTANCE.getRestrictionType_Facets();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MIN_EXCLUSIVE = eINSTANCE.getRestrictionType_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MIN_INCLUSIVE = eINSTANCE.getRestrictionType_MinInclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MAX_EXCLUSIVE = eINSTANCE.getRestrictionType_MaxExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MAX_INCLUSIVE = eINSTANCE.getRestrictionType_MaxInclusive();

		/**
		 * The meta object literal for the '<em><b>Total Digits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__TOTAL_DIGITS = eINSTANCE.getRestrictionType_TotalDigits();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__FRACTION_DIGITS = eINSTANCE.getRestrictionType_FractionDigits();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__LENGTH = eINSTANCE.getRestrictionType_Length();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MIN_LENGTH = eINSTANCE.getRestrictionType_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__MAX_LENGTH = eINSTANCE.getRestrictionType_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__ENUMERATION = eINSTANCE.getRestrictionType_Enumeration();

		/**
		 * The meta object literal for the '<em><b>White Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__WHITE_SPACE = eINSTANCE.getRestrictionType_WhiteSpace();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__PATTERN = eINSTANCE.getRestrictionType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_TYPE__GROUP1 = eINSTANCE.getRestrictionType_Group1();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__ATTRIBUTE = eINSTANCE.getRestrictionType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getRestrictionType_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getRestrictionType_AnyAttribute1();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_TYPE__BASE = eINSTANCE.getRestrictionType_Base();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.RestrictionType1Impl <em>Restriction Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.RestrictionType1Impl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getRestrictionType1()
		 * @generated
		 */
		EClass RESTRICTION_TYPE1 = eINSTANCE.getRestrictionType1();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__SIMPLE_TYPE = eINSTANCE.getRestrictionType1_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_TYPE1__FACETS = eINSTANCE.getRestrictionType1_Facets();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MIN_EXCLUSIVE = eINSTANCE.getRestrictionType1_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MIN_INCLUSIVE = eINSTANCE.getRestrictionType1_MinInclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MAX_EXCLUSIVE = eINSTANCE.getRestrictionType1_MaxExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MAX_INCLUSIVE = eINSTANCE.getRestrictionType1_MaxInclusive();

		/**
		 * The meta object literal for the '<em><b>Total Digits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__TOTAL_DIGITS = eINSTANCE.getRestrictionType1_TotalDigits();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__FRACTION_DIGITS = eINSTANCE.getRestrictionType1_FractionDigits();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__LENGTH = eINSTANCE.getRestrictionType1_Length();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MIN_LENGTH = eINSTANCE.getRestrictionType1_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__MAX_LENGTH = eINSTANCE.getRestrictionType1_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__ENUMERATION = eINSTANCE.getRestrictionType1_Enumeration();

		/**
		 * The meta object literal for the '<em><b>White Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__WHITE_SPACE = eINSTANCE.getRestrictionType1_WhiteSpace();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_TYPE1__PATTERN = eINSTANCE.getRestrictionType1_Pattern();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_TYPE1__BASE = eINSTANCE.getRestrictionType1_Base();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SchemaTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SchemaTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSchemaType()
		 * @generated
		 */
		EClass SCHEMA_TYPE = eINSTANCE.getSchemaType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__GROUP = eINSTANCE.getSchemaType_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__INCLUDE = eINSTANCE.getSchemaType_Include();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__IMPORT = eINSTANCE.getSchemaType_Import();

		/**
		 * The meta object literal for the '<em><b>Redefine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__REDEFINE = eINSTANCE.getSchemaType_Redefine();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__ANNOTATION = eINSTANCE.getSchemaType_Annotation();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__GROUP1 = eINSTANCE.getSchemaType_Group1();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__SIMPLE_TYPE = eINSTANCE.getSchemaType_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__COMPLEX_TYPE = eINSTANCE.getSchemaType_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Group2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__GROUP2 = eINSTANCE.getSchemaType_Group2();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getSchemaType_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__ELEMENT = eINSTANCE.getSchemaType_Element();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__ATTRIBUTE = eINSTANCE.getSchemaType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__NOTATION = eINSTANCE.getSchemaType_Notation();

		/**
		 * The meta object literal for the '<em><b>Annotation1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__ANNOTATION1 = eINSTANCE.getSchemaType_Annotation1();

		/**
		 * The meta object literal for the '<em><b>Attribute Form Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT = eINSTANCE.getSchemaType_AttributeFormDefault();

		/**
		 * The meta object literal for the '<em><b>Block Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__BLOCK_DEFAULT = eINSTANCE.getSchemaType_BlockDefault();

		/**
		 * The meta object literal for the '<em><b>Element Form Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ELEMENT_FORM_DEFAULT = eINSTANCE.getSchemaType_ElementFormDefault();

		/**
		 * The meta object literal for the '<em><b>Final Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__FINAL_DEFAULT = eINSTANCE.getSchemaType_FinalDefault();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ID = eINSTANCE.getSchemaType_Id();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__TARGET_NAMESPACE = eINSTANCE.getSchemaType_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__VERSION = eINSTANCE.getSchemaType_Version();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SelectorTypeImpl <em>Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SelectorTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSelectorType()
		 * @generated
		 */
		EClass SELECTOR_TYPE = eINSTANCE.getSelectorType();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR_TYPE__XPATH = eINSTANCE.getSelectorType_Xpath();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SimpleContentTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleContentType()
		 * @generated
		 */
		EClass SIMPLE_CONTENT_TYPE = eINSTANCE.getSimpleContentType();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTENT_TYPE__RESTRICTION = eINSTANCE.getSimpleContentType_Restriction();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTENT_TYPE__EXTENSION = eINSTANCE.getSimpleContentType_Extension();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SimpleExplicitGroupImpl <em>Simple Explicit Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SimpleExplicitGroupImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleExplicitGroup()
		 * @generated
		 */
		EClass SIMPLE_EXPLICIT_GROUP = eINSTANCE.getSimpleExplicitGroup();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SimpleExtensionTypeImpl <em>Simple Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SimpleExtensionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleExtensionType()
		 * @generated
		 */
		EClass SIMPLE_EXTENSION_TYPE = eINSTANCE.getSimpleExtensionType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SimpleRestrictionTypeImpl <em>Simple Restriction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SimpleRestrictionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleRestrictionType()
		 * @generated
		 */
		EClass SIMPLE_RESTRICTION_TYPE = eINSTANCE.getSimpleRestrictionType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.SimpleTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE__RESTRICTION = eINSTANCE.getSimpleType_Restriction();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE__LIST = eINSTANCE.getSimpleType_List();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE__UNION = eINSTANCE.getSimpleType_Union();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__FINAL = eINSTANCE.getSimpleType_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__NAME = eINSTANCE.getSimpleType_Name();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.TopLevelAttributeImpl <em>Top Level Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.TopLevelAttributeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelAttribute()
		 * @generated
		 */
		EClass TOP_LEVEL_ATTRIBUTE = eINSTANCE.getTopLevelAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.TopLevelComplexTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelComplexType()
		 * @generated
		 */
		EClass TOP_LEVEL_COMPLEX_TYPE = eINSTANCE.getTopLevelComplexType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.TopLevelElementImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelElement()
		 * @generated
		 */
		EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.TopLevelSimpleTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTopLevelSimpleType()
		 * @generated
		 */
		EClass TOP_LEVEL_SIMPLE_TYPE = eINSTANCE.getTopLevelSimpleType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.TotalDigitsTypeImpl <em>Total Digits Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.TotalDigitsTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTotalDigitsType()
		 * @generated
		 */
		EClass TOTAL_DIGITS_TYPE = eINSTANCE.getTotalDigitsType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.UnionTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE__SIMPLE_TYPE = eINSTANCE.getUnionType_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Member Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_TYPE__MEMBER_TYPES = eINSTANCE.getUnionType_MemberTypes();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.WhiteSpaceTypeImpl <em>White Space Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.WhiteSpaceTypeImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getWhiteSpaceType()
		 * @generated
		 */
		EClass WHITE_SPACE_TYPE = eINSTANCE.getWhiteSpaceType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.impl.WildcardImpl <em>Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.impl.WildcardImpl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getWildcard()
		 * @generated
		 */
		EClass WILDCARD = eINSTANCE.getWildcard();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILDCARD__NAMESPACE = eINSTANCE.getWildcard_Namespace();

		/**
		 * The meta object literal for the '<em><b>Process Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILDCARD__PROCESS_CONTENTS = eINSTANCE.getWildcard_ProcessContents();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.AllNNIMember1 <em>All NNI Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.AllNNIMember1
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNIMember1()
		 * @generated
		 */
		EEnum ALL_NNI_MEMBER1 = eINSTANCE.getAllNNIMember1();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.BlockSetMember0 <em>Block Set Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.BlockSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember0()
		 * @generated
		 */
		EEnum BLOCK_SET_MEMBER0 = eINSTANCE.getBlockSetMember0();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.BlockSetMember1Item <em>Block Set Member1 Item</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1Item()
		 * @generated
		 */
		EEnum BLOCK_SET_MEMBER1_ITEM = eINSTANCE.getBlockSetMember1Item();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.DerivationControl <em>Derivation Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.DerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationControl()
		 * @generated
		 */
		EEnum DERIVATION_CONTROL = eINSTANCE.getDerivationControl();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.DerivationSetMember0 <em>Derivation Set Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.DerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember0()
		 * @generated
		 */
		EEnum DERIVATION_SET_MEMBER0 = eINSTANCE.getDerivationSetMember0();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.FormChoice <em>Form Choice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.FormChoice
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFormChoice()
		 * @generated
		 */
		EEnum FORM_CHOICE = eINSTANCE.getFormChoice();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember0()
		 * @generated
		 */
		EEnum FULL_DERIVATION_SET_MEMBER0 = eINSTANCE.getFullDerivationSetMember0();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.NamespaceListMember0 <em>Namespace List Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.NamespaceListMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember0()
		 * @generated
		 */
		EEnum NAMESPACE_LIST_MEMBER0 = eINSTANCE.getNamespaceListMember0();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1 <em>Namespace List Member1 Item Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1ItemMember1()
		 * @generated
		 */
		EEnum NAMESPACE_LIST_MEMBER1_ITEM_MEMBER1 = eINSTANCE.getNamespaceListMember1ItemMember1();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.ProcessContentsType <em>Process Contents Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.ProcessContentsType
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getProcessContentsType()
		 * @generated
		 */
		EEnum PROCESS_CONTENTS_TYPE = eINSTANCE.getProcessContentsType();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.ReducedDerivationControl <em>Reduced Derivation Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getReducedDerivationControl()
		 * @generated
		 */
		EEnum REDUCED_DERIVATION_CONTROL = eINSTANCE.getReducedDerivationControl();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember0()
		 * @generated
		 */
		EEnum SIMPLE_DERIVATION_SET_MEMBER0 = eINSTANCE.getSimpleDerivationSetMember0();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1Item()
		 * @generated
		 */
		EEnum SIMPLE_DERIVATION_SET_MEMBER1_ITEM = eINSTANCE.getSimpleDerivationSetMember1Item();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.TypeDerivationControl <em>Type Derivation Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.TypeDerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTypeDerivationControl()
		 * @generated
		 */
		EEnum TYPE_DERIVATION_CONTROL = eINSTANCE.getTypeDerivationControl();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xml.xsd.UseType <em>Use Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.UseType
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUseType()
		 * @generated
		 */
		EEnum USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em>All NNI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNI()
		 * @generated
		 */
		EDataType ALL_NNI = eINSTANCE.getAllNNI();

		/**
		 * The meta object literal for the '<em>All NNI Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.AllNNIMember1
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getAllNNIMember1Object()
		 * @generated
		 */
		EDataType ALL_NNI_MEMBER1_OBJECT = eINSTANCE.getAllNNIMember1Object();

		/**
		 * The meta object literal for the '<em>Block Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSet()
		 * @generated
		 */
		EDataType BLOCK_SET = eINSTANCE.getBlockSet();

		/**
		 * The meta object literal for the '<em>Block Set Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.BlockSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember0Object()
		 * @generated
		 */
		EDataType BLOCK_SET_MEMBER0_OBJECT = eINSTANCE.getBlockSetMember0Object();

		/**
		 * The meta object literal for the '<em>Block Set Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1()
		 * @generated
		 */
		EDataType BLOCK_SET_MEMBER1 = eINSTANCE.getBlockSetMember1();

		/**
		 * The meta object literal for the '<em>Block Set Member1 Item Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.BlockSetMember1Item
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getBlockSetMember1ItemObject()
		 * @generated
		 */
		EDataType BLOCK_SET_MEMBER1_ITEM_OBJECT = eINSTANCE.getBlockSetMember1ItemObject();

		/**
		 * The meta object literal for the '<em>Derivation Control Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.DerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationControlObject()
		 * @generated
		 */
		EDataType DERIVATION_CONTROL_OBJECT = eINSTANCE.getDerivationControlObject();

		/**
		 * The meta object literal for the '<em>Derivation Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSet()
		 * @generated
		 */
		EDataType DERIVATION_SET = eINSTANCE.getDerivationSet();

		/**
		 * The meta object literal for the '<em>Derivation Set Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.DerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember0Object()
		 * @generated
		 */
		EDataType DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getDerivationSetMember0Object();

		/**
		 * The meta object literal for the '<em>Derivation Set Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getDerivationSetMember1()
		 * @generated
		 */
		EDataType DERIVATION_SET_MEMBER1 = eINSTANCE.getDerivationSetMember1();

		/**
		 * The meta object literal for the '<em>Form Choice Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.FormChoice
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFormChoiceObject()
		 * @generated
		 */
		EDataType FORM_CHOICE_OBJECT = eINSTANCE.getFormChoiceObject();

		/**
		 * The meta object literal for the '<em>Full Derivation Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSet()
		 * @generated
		 */
		EDataType FULL_DERIVATION_SET = eINSTANCE.getFullDerivationSet();

		/**
		 * The meta object literal for the '<em>Full Derivation Set Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.FullDerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember0Object()
		 * @generated
		 */
		EDataType FULL_DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getFullDerivationSetMember0Object();

		/**
		 * The meta object literal for the '<em>Full Derivation Set Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getFullDerivationSetMember1()
		 * @generated
		 */
		EDataType FULL_DERIVATION_SET_MEMBER1 = eINSTANCE.getFullDerivationSetMember1();

		/**
		 * The meta object literal for the '<em>Member Types Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getMemberTypesType()
		 * @generated
		 */
		EDataType MEMBER_TYPES_TYPE = eINSTANCE.getMemberTypesType();

		/**
		 * The meta object literal for the '<em>Namespace List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceList()
		 * @generated
		 */
		EDataType NAMESPACE_LIST = eINSTANCE.getNamespaceList();

		/**
		 * The meta object literal for the '<em>Namespace List Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.NamespaceListMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember0Object()
		 * @generated
		 */
		EDataType NAMESPACE_LIST_MEMBER0_OBJECT = eINSTANCE.getNamespaceListMember0Object();

		/**
		 * The meta object literal for the '<em>Namespace List Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1()
		 * @generated
		 */
		EDataType NAMESPACE_LIST_MEMBER1 = eINSTANCE.getNamespaceListMember1();

		/**
		 * The meta object literal for the '<em>Namespace List Member1 Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1Item()
		 * @generated
		 */
		EDataType NAMESPACE_LIST_MEMBER1_ITEM = eINSTANCE.getNamespaceListMember1Item();

		/**
		 * The meta object literal for the '<em>Namespace List Member1 Item Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.NamespaceListMember1ItemMember1
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getNamespaceListMember1ItemMember1Object()
		 * @generated
		 */
		EDataType NAMESPACE_LIST_MEMBER1_ITEM_MEMBER1_OBJECT = eINSTANCE.getNamespaceListMember1ItemMember1Object();

		/**
		 * The meta object literal for the '<em>Process Contents Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.ProcessContentsType
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getProcessContentsTypeObject()
		 * @generated
		 */
		EDataType PROCESS_CONTENTS_TYPE_OBJECT = eINSTANCE.getProcessContentsTypeObject();

		/**
		 * The meta object literal for the '<em>Public</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getPublic()
		 * @generated
		 */
		EDataType PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '<em>Reduced Derivation Control Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.ReducedDerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getReducedDerivationControlObject()
		 * @generated
		 */
		EDataType REDUCED_DERIVATION_CONTROL_OBJECT = eINSTANCE.getReducedDerivationControlObject();

		/**
		 * The meta object literal for the '<em>Simple Derivation Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSet()
		 * @generated
		 */
		EDataType SIMPLE_DERIVATION_SET = eINSTANCE.getSimpleDerivationSet();

		/**
		 * The meta object literal for the '<em>Simple Derivation Set Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember0
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember0Object()
		 * @generated
		 */
		EDataType SIMPLE_DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getSimpleDerivationSetMember0Object();

		/**
		 * The meta object literal for the '<em>Simple Derivation Set Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1()
		 * @generated
		 */
		EDataType SIMPLE_DERIVATION_SET_MEMBER1 = eINSTANCE.getSimpleDerivationSetMember1();

		/**
		 * The meta object literal for the '<em>Simple Derivation Set Member1 Item Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.SimpleDerivationSetMember1Item
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getSimpleDerivationSetMember1ItemObject()
		 * @generated
		 */
		EDataType SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT = eINSTANCE.getSimpleDerivationSetMember1ItemObject();

		/**
		 * The meta object literal for the '<em>Type Derivation Control Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.TypeDerivationControl
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getTypeDerivationControlObject()
		 * @generated
		 */
		EDataType TYPE_DERIVATION_CONTROL_OBJECT = eINSTANCE.getTypeDerivationControlObject();

		/**
		 * The meta object literal for the '<em>Use Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xml.xsd.UseType
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getUseTypeObject()
		 * @generated
		 */
		EDataType USE_TYPE_OBJECT = eINSTANCE.getUseTypeObject();

		/**
		 * The meta object literal for the '<em>Xpath Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getXpathType()
		 * @generated
		 */
		EDataType XPATH_TYPE = eINSTANCE.getXpathType();

		/**
		 * The meta object literal for the '<em>Xpath Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2001.xml.xsd.impl.SchemaPackageImpl#getXpathType1()
		 * @generated
		 */
		EDataType XPATH_TYPE1 = eINSTANCE.getXpathType1();

	}

} //SchemaPackage
