/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.psstools.lang.pSS.PSSFactory
 * @model kind="package"
 * @generated
 */
public interface PSSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pSS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/psstools/lang/PSS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pSS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PSSPackage eINSTANCE = net.sf.psstools.lang.pSS.impl.PSSPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.ModelImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOT = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.portable_stimulus_descriptionImpl <em>portable stimulus description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.portable_stimulus_descriptionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getportable_stimulus_description()
   * @generated
   */
  int PORTABLE_STIMULUS_DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>portable stimulus description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_or_struct_declarationImpl <em>graph or struct declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_or_struct_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_or_struct_declaration()
   * @generated
   */
  int GRAPH_OR_STRUCT_DECLARATION = 2;

  /**
   * The number of structural features of the '<em>graph or struct declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_OR_STRUCT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_struct_ifc_declarationImpl <em>graph struct ifc declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_struct_ifc_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_struct_ifc_declaration()
   * @generated
   */
  int GRAPH_STRUCT_IFC_DECLARATION = 3;

  /**
   * The number of structural features of the '<em>graph struct ifc declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_STRUCT_IFC_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_declarationImpl <em>graph declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_declaration()
   * @generated
   */
  int GRAPH_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DECLARATION__NAME = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DECLARATION__PORTS = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DECLARATION__SUPER = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DECLARATION__BODY = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>graph declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.port_declarationImpl <em>port declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.port_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getport_declaration()
   * @generated
   */
  int PORT_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Ifc type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION__IFC_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>port declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.struct_declarationImpl <em>struct declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.struct_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_declaration()
   * @generated
   */
  int STRUCT_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__NAME = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__SUPER = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__BODY = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>struct declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.struct_body_itemImpl <em>struct body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.struct_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_body_item()
   * @generated
   */
  int STRUCT_BODY_ITEM = 7;

  /**
   * The number of structural features of the '<em>struct body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_body_itemImpl <em>graph body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_body_item()
   * @generated
   */
  int GRAPH_BODY_ITEM = 8;

  /**
   * The number of structural features of the '<em>graph body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.symbol_definitionImpl <em>symbol definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.symbol_definitionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_definition()
   * @generated
   */
  int SYMBOL_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Symbol name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION__SYMBOL_NAME = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION__BODY_ITEMS = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>symbol definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.interface_action_definitionImpl <em>interface action definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.interface_action_definitionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_action_definition()
   * @generated
   */
  int INTERFACE_ACTION_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_DEFINITION__ACTION = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_DEFINITION__PARAMETERS = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_DEFINITION__BODY_ITEMS = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>interface action definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_DEFINITION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_productionImpl <em>rule production</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_productionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_production()
   * @generated
   */
  int RULE_PRODUCTION = 11;

  /**
   * The number of structural features of the '<em>rule production</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_PRODUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_or_blockImpl <em>rule stmt or block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_stmt_or_blockImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_or_block()
   * @generated
   */
  int RULE_STMT_OR_BLOCK = 12;

  /**
   * The number of structural features of the '<em>rule stmt or block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_OR_BLOCK_FEATURE_COUNT = RULE_PRODUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_alt_parallel_seqImpl <em>rule stmt alt parallel seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_stmt_alt_parallel_seqImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_alt_parallel_seq()
   * @generated
   */
  int RULE_STMT_ALT_PARALLEL_SEQ = 13;

  /**
   * The number of structural features of the '<em>rule stmt alt parallel seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT = RULE_STMT_OR_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_primaryImpl <em>rule stmt primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_stmt_primaryImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_primary()
   * @generated
   */
  int RULE_STMT_PRIMARY = 14;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PRIMARY__PARAM = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PRIMARY__RHS = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PRIMARY__STMT_LIST = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>rule stmt primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PRIMARY_FEATURE_COUNT = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_parallel_altImpl <em>rule stmt parallel alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_stmt_parallel_altImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_parallel_alt()
   * @generated
   */
  int RULE_STMT_PARALLEL_ALT = 15;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT__PARAM = RULE_STMT_PRIMARY__PARAM;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT__RHS = RULE_STMT_PRIMARY__RHS;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT__STMT_LIST = RULE_STMT_PRIMARY__STMT_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT__LEFT = RULE_STMT_PRIMARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT__RIGHT = RULE_STMT_PRIMARY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>rule stmt parallel alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_ALT_FEATURE_COUNT = RULE_STMT_PRIMARY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_parallelImpl <em>rule stmt parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_stmt_parallelImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_parallel()
   * @generated
   */
  int RULE_STMT_PARALLEL = 16;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL__PARAM = RULE_STMT_PARALLEL_ALT__PARAM;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL__RHS = RULE_STMT_PARALLEL_ALT__RHS;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL__STMT_LIST = RULE_STMT_PARALLEL_ALT__STMT_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL__LEFT = RULE_STMT_PARALLEL_ALT__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL__RIGHT = RULE_STMT_PARALLEL_ALT__RIGHT;

  /**
   * The number of structural features of the '<em>rule stmt parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STMT_PARALLEL_FEATURE_COUNT = RULE_STMT_PARALLEL_ALT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_sequenceImpl <em>rule sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_sequenceImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_sequence()
   * @generated
   */
  int RULE_SEQUENCE = 17;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__PARAM = RULE_STMT_PARALLEL__PARAM;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__RHS = RULE_STMT_PARALLEL__RHS;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__STMT_LIST = RULE_STMT_PARALLEL__STMT_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__LEFT = RULE_STMT_PARALLEL__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__RIGHT = RULE_STMT_PARALLEL__RIGHT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE__ITEMS = RULE_STMT_PARALLEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rule sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQUENCE_FEATURE_COUNT = RULE_STMT_PARALLEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_seq_itemImpl <em>rule seq item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_seq_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_seq_item()
   * @generated
   */
  int RULE_SEQ_ITEM = 18;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQ_ITEM__ACTION = 0;

  /**
   * The feature id for the '<em><b>Action params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQ_ITEM__ACTION_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQ_ITEM__ITEM = 2;

  /**
   * The feature id for the '<em><b>With clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQ_ITEM__WITH_CLAUSE = 3;

  /**
   * The number of structural features of the '<em>rule seq item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SEQ_ITEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_with_clauseImpl <em>rule with clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_with_clauseImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_with_clause()
   * @generated
   */
  int RULE_WITH_CLAUSE = 19;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_CLAUSE__BODY = 0;

  /**
   * The number of structural features of the '<em>rule with clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.parameter_listImpl <em>parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.parameter_listImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getparameter_list()
   * @generated
   */
  int PARAMETER_LIST = 20;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.rule_repeat_stmtImpl <em>rule repeat stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.rule_repeat_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_repeat_stmt()
   * @generated
   */
  int RULE_REPEAT_STMT = 21;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPEAT_STMT__EXPR = RULE_STMT_OR_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPEAT_STMT__STMT = RULE_STMT_OR_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>rule repeat stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_REPEAT_STMT_FEATURE_COUNT = RULE_STMT_OR_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.overrides_declarationImpl <em>overrides declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.overrides_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverrides_declaration()
   * @generated
   */
  int OVERRIDES_DECLARATION = 22;

  /**
   * The number of structural features of the '<em>overrides declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDES_DECLARATION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.override_stmtImpl <em>override stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.override_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverride_stmt()
   * @generated
   */
  int OVERRIDE_STMT = 23;

  /**
   * The feature id for the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_STMT__DEST = 0;

  /**
   * The number of structural features of the '<em>override stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.type_overrideImpl <em>type override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.type_overrideImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettype_override()
   * @generated
   */
  int TYPE_OVERRIDE = 24;

  /**
   * The feature id for the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OVERRIDE__DEST = OVERRIDE_STMT__DEST;

  /**
   * The feature id for the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OVERRIDE__SRC = OVERRIDE_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>type override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OVERRIDE_FEATURE_COUNT = OVERRIDE_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.instance_overrideImpl <em>instance override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.instance_overrideImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinstance_override()
   * @generated
   */
  int INSTANCE_OVERRIDE = 25;

  /**
   * The feature id for the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OVERRIDE__DEST = OVERRIDE_STMT__DEST;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OVERRIDE__SRC = OVERRIDE_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>instance override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OVERRIDE_FEATURE_COUNT = OVERRIDE_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.data_declarationImpl <em>data declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.data_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_declaration()
   * @generated
   */
  int DATA_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DECLARATION__TYPE = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DECLARATION__INSTANCES = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>data declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.data_instantiationImpl <em>data instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.data_instantiationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_instantiation()
   * @generated
   */
  int DATA_INSTANTIATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANTIATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Portmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANTIATION__PORTMAP = 1;

  /**
   * The number of structural features of the '<em>data instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANTIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_interface_portmap_listImpl <em>graph interface portmap list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_interface_portmap_listImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_interface_portmap_list()
   * @generated
   */
  int GRAPH_INTERFACE_PORTMAP_LIST = 28;

  /**
   * The feature id for the '<em><b>Maps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_INTERFACE_PORTMAP_LIST__MAPS = 0;

  /**
   * The number of structural features of the '<em>graph interface portmap list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_INTERFACE_PORTMAP_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_interface_portmapImpl <em>graph interface portmap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_interface_portmapImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_interface_portmap()
   * @generated
   */
  int GRAPH_INTERFACE_PORTMAP = 29;

  /**
   * The feature id for the '<em><b>Portname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_INTERFACE_PORTMAP__PORTNAME = 0;

  /**
   * The feature id for the '<em><b>Connected name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_INTERFACE_PORTMAP__CONNECTED_NAME = 1;

  /**
   * The number of structural features of the '<em>graph interface portmap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_INTERFACE_PORTMAP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.data_typeImpl <em>data type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.data_typeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_type()
   * @generated
   */
  int DATA_TYPE = 30;

  /**
   * The number of structural features of the '<em>data type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.user_defined_typeImpl <em>user defined type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.user_defined_typeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getuser_defined_type()
   * @generated
   */
  int USER_DEFINED_TYPE = 31;

  /**
   * The feature id for the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_TYPE__TYPENAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>user defined type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.typedef_declarationImpl <em>typedef declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.typedef_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettypedef_declaration()
   * @generated
   */
  int TYPEDEF_DECLARATION = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_DECLARATION__TYPE = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_DECLARATION__TYPE_IDENTIFIER = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>typedef declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.enum_typeImpl <em>enum type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.enum_typeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getenum_type()
   * @generated
   */
  int ENUM_TYPE = 33;

  /**
   * The feature id for the '<em><b>Data type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__DATA_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__ITEMS = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>enum type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl <em>integer type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.integer_typeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinteger_type()
   * @generated
   */
  int INTEGER_TYPE = 34;

  /**
   * The feature id for the '<em><b>Atom type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__ATOM_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__LHS = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__RHS = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Inside</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__INSIDE = DATA_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>integer type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.type_inside_clauseImpl <em>type inside clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.type_inside_clauseImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettype_inside_clause()
   * @generated
   */
  int TYPE_INSIDE_CLAUSE = 35;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INSIDE_CLAUSE__DOMAIN = 0;

  /**
   * The number of structural features of the '<em>type inside clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INSIDE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.open_range_listImpl <em>open range list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.open_range_listImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getopen_range_list()
   * @generated
   */
  int OPEN_RANGE_LIST = 36;

  /**
   * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_RANGE_LIST__RANGES = 0;

  /**
   * The number of structural features of the '<em>open range list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_RANGE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.open_range_valueImpl <em>open range value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.open_range_valueImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getopen_range_value()
   * @generated
   */
  int OPEN_RANGE_VALUE = 37;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_RANGE_VALUE__LHS = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_RANGE_VALUE__RANGE = 1;

  /**
   * The number of structural features of the '<em>open range value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_RANGE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.range_exprImpl <em>range expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.range_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrange_expr()
   * @generated
   */
  int RANGE_EXPR = 38;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__RHS = 1;

  /**
   * The number of structural features of the '<em>range expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_declarationImpl <em>constraint declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_declaration()
   * @generated
   */
  int CONSTRAINT_DECLARATION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION__NAME = STRUCT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION__BODY = STRUCT_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>constraint declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION_FEATURE_COUNT = STRUCT_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl <em>constraint body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_body_item()
   * @generated
   */
  int CONSTRAINT_BODY_ITEM = 40;

  /**
   * The number of structural features of the '<em>constraint body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl <em>expression or dist item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression_or_dist_item()
   * @generated
   */
  int EXPRESSION_OR_DIST_ITEM = 41;

  /**
   * The number of structural features of the '<em>expression or dist item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl <em>if constraint item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getif_constraint_item()
   * @generated
   */
  int IF_CONSTRAINT_ITEM = 42;

  /**
   * The feature id for the '<em><b>If expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONSTRAINT_ITEM__IF_EXPR = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>True case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONSTRAINT_ITEM__TRUE_CASE = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>False set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONSTRAINT_ITEM__FALSE_SET = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>if constraint item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONSTRAINT_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.foreach_constraint_itemImpl <em>foreach constraint item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.foreach_constraint_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getforeach_constraint_item()
   * @generated
   */
  int FOREACH_CONSTRAINT_ITEM = 43;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM__EXPR = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM__BODY = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>foreach constraint item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_blockImpl <em>constraint block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_blockImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_block()
   * @generated
   */
  int CONSTRAINT_BLOCK = 45;

  /**
   * The number of structural features of the '<em>constraint block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_setImpl <em>constraint set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_setImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_set()
   * @generated
   */
  int CONSTRAINT_SET = 44;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_SET__ITEMS = CONSTRAINT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>constraint set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_SET_FEATURE_COUNT = CONSTRAINT_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_or_scheme_declarationImpl <em>bin or scheme declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_or_scheme_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_or_scheme_declaration()
   * @generated
   */
  int BIN_OR_SCHEME_DECLARATION = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OR_SCHEME_DECLARATION__NAME = STRUCT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>bin or scheme declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OR_SCHEME_DECLARATION_FEATURE_COUNT = STRUCT_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bins_declarationImpl <em>bins declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bins_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbins_declaration()
   * @generated
   */
  int BINS_DECLARATION = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINS_DECLARATION__NAME = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINS_DECLARATION__ITEM = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bins</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINS_DECLARATION__BINS = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>bins declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINS_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_specificationImpl <em>bin specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_specificationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_specification()
   * @generated
   */
  int BIN_SPECIFICATION = 48;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SPECIFICATION__ITEMS = 0;

  /**
   * The number of structural features of the '<em>bin specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_specifierImpl <em>bin specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_specifierImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_specifier()
   * @generated
   */
  int BIN_SPECIFIER = 49;

  /**
   * The number of structural features of the '<em>bin specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SPECIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.explicit_bin_valueImpl <em>explicit bin value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.explicit_bin_valueImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexplicit_bin_value()
   * @generated
   */
  int EXPLICIT_BIN_VALUE = 50;

  /**
   * The number of structural features of the '<em>explicit bin value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_VALUE_FEATURE_COUNT = BIN_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.explicit_bin_rangeImpl <em>explicit bin range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.explicit_bin_rangeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexplicit_bin_range()
   * @generated
   */
  int EXPLICIT_BIN_RANGE = 51;

  /**
   * The feature id for the '<em><b>Low</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_RANGE__LOW = BIN_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_RANGE__HIGH = BIN_SPECIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Div</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_RANGE__DIV = BIN_SPECIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_RANGE__SIZE = BIN_SPECIFIER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>explicit bin range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_BIN_RANGE_FEATURE_COUNT = BIN_SPECIFIER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_range_divideImpl <em>bin range divide</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_range_divideImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_range_divide()
   * @generated
   */
  int BIN_RANGE_DIVIDE = 52;

  /**
   * The number of structural features of the '<em>bin range divide</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_RANGE_DIVIDE_FEATURE_COUNT = BIN_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_range_sizeImpl <em>bin range size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_range_sizeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_range_size()
   * @generated
   */
  int BIN_RANGE_SIZE = 53;

  /**
   * The number of structural features of the '<em>bin range size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_RANGE_SIZE_FEATURE_COUNT = BIN_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_scheme_declarationImpl <em>bin scheme declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_scheme_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_scheme_declaration()
   * @generated
   */
  int BIN_SCHEME_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_DECLARATION__NAME = BIN_OR_SCHEME_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_DECLARATION__ITEMS = BIN_OR_SCHEME_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>bin scheme declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_DECLARATION_FEATURE_COUNT = BIN_OR_SCHEME_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.bin_scheme_specifierImpl <em>bin scheme specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.bin_scheme_specifierImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_scheme_specifier()
   * @generated
   */
  int BIN_SCHEME_SPECIFIER = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_SPECIFIER__NAME = 0;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_SPECIFIER__SPEC = 1;

  /**
   * The number of structural features of the '<em>bin scheme specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_SCHEME_SPECIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constant_expressionImpl <em>constant expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constant_expressionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstant_expression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 56;

  /**
   * The number of structural features of the '<em>constant expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.expressionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IMPL_CONSTRAINT = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LHS = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RHS = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.interface_declarationImpl <em>interface declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.interface_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_declaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__NAME = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__SUPER = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__BODY = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>interface declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = PORTABLE_STIMULUS_DESCRIPTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.interface_body_itemImpl <em>interface body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.interface_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_body_item()
   * @generated
   */
  int INTERFACE_BODY_ITEM = 59;

  /**
   * The number of structural features of the '<em>interface body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.action_declarationImpl <em>action declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.action_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_declaration()
   * @generated
   */
  int ACTION_DECLARATION = 60;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__NAME = INTERFACE_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__PORTS = INTERFACE_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>action declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION_FEATURE_COUNT = INTERFACE_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.action_portlistImpl <em>action portlist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.action_portlistImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_portlist()
   * @generated
   */
  int ACTION_PORTLIST = 61;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORTLIST__PORTS = 0;

  /**
   * The number of structural features of the '<em>action portlist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORTLIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.action_portImpl <em>action port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.action_portImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_port()
   * @generated
   */
  int ACTION_PORT = 62;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORT__NAME = 1;

  /**
   * The number of structural features of the '<em>action port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl <em>graph data declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_data_declaration()
   * @generated
   */
  int GRAPH_DATA_DECLARATION = 63;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__NAMES = 1;

  /**
   * The feature id for the '<em><b>Portmaps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__PORTMAPS = 2;

  /**
   * The number of structural features of the '<em>graph data declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl <em>symbol declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.symbol_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_declaration()
   * @generated
   */
  int SYMBOL_DECLARATION = 64;

  /**
   * The feature id for the '<em><b>Decl list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION__DECL_LIST = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION__INLINE_RULE = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>symbol declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.symbol_decl_itemImpl <em>symbol decl item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.symbol_decl_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_decl_item()
   * @generated
   */
  int SYMBOL_DECL_ITEM = 65;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECL_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECL_ITEM__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>symbol decl item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECL_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.port_mapImpl <em>port map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.port_mapImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getport_map()
   * @generated
   */
  int PORT_MAP = 66;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_MAP__PORT = 0;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_MAP__MAP = 1;

  /**
   * The number of structural features of the '<em>port map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_MAP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constantImpl <em>constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constantImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstant()
   * @generated
   */
  int CONSTANT = 67;

  /**
   * The number of structural features of the '<em>constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = EXPLICIT_BIN_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.hierarchical_idImpl <em>hierarchical id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.hierarchical_idImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gethierarchical_id()
   * @generated
   */
  int HIERARCHICAL_ID = 68;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_ID__VALUE = 0;

  /**
   * The number of structural features of the '<em>hierarchical id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.interface_action_idImpl <em>interface action id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.interface_action_idImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_action_id()
   * @generated
   */
  int INTERFACE_ACTION_ID = 69;

  /**
   * The feature id for the '<em><b>Ifc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_ID__IFC = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_ID__ACTION = 1;

  /**
   * The number of structural features of the '<em>interface action id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACTION_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.literalImpl <em>literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.literalImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getliteral()
   * @generated
   */
  int LITERAL = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.decimal_numberImpl <em>decimal number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.decimal_numberImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdecimal_number()
   * @generated
   */
  int DECIMAL_NUMBER = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_NUMBER__VALUE = 0;

  /**
   * The number of structural features of the '<em>decimal number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_NUMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.sizeImpl <em>size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.sizeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsize()
   * @generated
   */
  int SIZE = 72;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__VALUE = DECIMAL_NUMBER__VALUE;

  /**
   * The number of structural features of the '<em>size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = DECIMAL_NUMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.alt_stmtImpl <em>alt stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.alt_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getalt_stmt()
   * @generated
   */
  int ALT_STMT = 73;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT__LEFT = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT__RIGHT = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>alt stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT_FEATURE_COUNT = RULE_STMT_ALT_PARALLEL_SEQ_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.stmt_altImpl <em>stmt alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.stmt_altImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_alt()
   * @generated
   */
  int STMT_ALT = 74;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__PARAM = RULE_STMT_PARALLEL_ALT__PARAM;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__RHS = RULE_STMT_PARALLEL_ALT__RHS;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__STMT_LIST = RULE_STMT_PARALLEL_ALT__STMT_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__LEFT = RULE_STMT_PARALLEL_ALT__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__RIGHT = RULE_STMT_PARALLEL_ALT__RIGHT;

  /**
   * The number of structural features of the '<em>stmt alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT_FEATURE_COUNT = RULE_STMT_PARALLEL_ALT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.overides_declarationImpl <em>overides declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.overides_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverides_declaration()
   * @generated
   */
  int OVERIDES_DECLARATION = 75;

  /**
   * The feature id for the '<em><b>Overrides</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERIDES_DECLARATION__OVERRIDES = OVERRIDES_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>overides declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERIDES_DECLARATION_FEATURE_COUNT = OVERRIDES_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.condition_exprImpl <em>condition expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.condition_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getcondition_expr()
   * @generated
   */
  int CONDITION_EXPR = 76;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>True expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__TRUE_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>False expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__FALSE_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>condition expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.logical_or_exprImpl <em>logical or expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.logical_or_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_or_expr()
   * @generated
   */
  int LOGICAL_OR_EXPR = 77;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>logical or expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.logical_and_exprImpl <em>logical and expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.logical_and_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_and_expr()
   * @generated
   */
  int LOGICAL_AND_EXPR = 78;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>logical and expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_xor_exprImpl <em>binary xor expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_xor_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_xor_expr()
   * @generated
   */
  int BINARY_XOR_EXPR = 79;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>binary xor expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_XOR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_and_exprImpl <em>binary and expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_and_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_and_expr()
   * @generated
   */
  int BINARY_AND_EXPR = 80;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>binary and expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_AND_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.logical_equality_exprImpl <em>logical equality expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.logical_equality_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_equality_expr()
   * @generated
   */
  int LOGICAL_EQUALITY_EXPR = 81;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>logical equality expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EQUALITY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.logical_inequality_exprImpl <em>logical inequality expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.logical_inequality_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_inequality_expr()
   * @generated
   */
  int LOGICAL_INEQUALITY_EXPR = 82;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>logical inequality expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INEQUALITY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_shift_exprImpl <em>binary shift expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_shift_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_shift_expr()
   * @generated
   */
  int BINARY_SHIFT_EXPR = 83;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>binary shift expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SHIFT_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_add_sub_exprImpl <em>binary add sub expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_add_sub_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_add_sub_expr()
   * @generated
   */
  int BINARY_ADD_SUB_EXPR = 84;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>binary add sub expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_ADD_SUB_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_mul_div_mod_exprImpl <em>binary mul div mod expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_mul_div_mod_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_mul_div_mod_expr()
   * @generated
   */
  int BINARY_MUL_DIV_MOD_EXPR = 85;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>binary mul div mod expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MUL_DIV_MOD_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.binary_exp_exprImpl <em>binary exp expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.binary_exp_exprImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_exp_expr()
   * @generated
   */
  int BINARY_EXP_EXPR = 86;

  /**
   * The feature id for the '<em><b>Impl constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__IMPL_CONSTRAINT = EXPRESSION__IMPL_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__LHS = EXPRESSION__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__RHS = EXPRESSION__RHS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>binary exp expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.sf.psstools.lang.pSS.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.Model#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root</em>'.
   * @see net.sf.psstools.lang.pSS.Model#getRoot()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Root();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.portable_stimulus_description <em>portable stimulus description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>portable stimulus description</em>'.
   * @see net.sf.psstools.lang.pSS.portable_stimulus_description
   * @generated
   */
  EClass getportable_stimulus_description();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_or_struct_declaration <em>graph or struct declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph or struct declaration</em>'.
   * @see net.sf.psstools.lang.pSS.graph_or_struct_declaration
   * @generated
   */
  EClass getgraph_or_struct_declaration();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_struct_ifc_declaration <em>graph struct ifc declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph struct ifc declaration</em>'.
   * @see net.sf.psstools.lang.pSS.graph_struct_ifc_declaration
   * @generated
   */
  EClass getgraph_struct_ifc_declaration();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_declaration <em>graph declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph declaration</em>'.
   * @see net.sf.psstools.lang.pSS.graph_declaration
   * @generated
   */
  EClass getgraph_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.graph_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.graph_declaration#getName()
   * @see #getgraph_declaration()
   * @generated
   */
  EAttribute getgraph_declaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.graph_declaration#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see net.sf.psstools.lang.pSS.graph_declaration#getPorts()
   * @see #getgraph_declaration()
   * @generated
   */
  EReference getgraph_declaration_Ports();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.graph_declaration#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see net.sf.psstools.lang.pSS.graph_declaration#getSuper()
   * @see #getgraph_declaration()
   * @generated
   */
  EReference getgraph_declaration_Super();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.graph_declaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.graph_declaration#getBody()
   * @see #getgraph_declaration()
   * @generated
   */
  EReference getgraph_declaration_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.port_declaration <em>port declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>port declaration</em>'.
   * @see net.sf.psstools.lang.pSS.port_declaration
   * @generated
   */
  EClass getport_declaration();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.port_declaration#getIfc_type <em>Ifc type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ifc type</em>'.
   * @see net.sf.psstools.lang.pSS.port_declaration#getIfc_type()
   * @see #getport_declaration()
   * @generated
   */
  EReference getport_declaration_Ifc_type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.port_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.port_declaration#getName()
   * @see #getport_declaration()
   * @generated
   */
  EAttribute getport_declaration_Name();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.struct_declaration <em>struct declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct declaration</em>'.
   * @see net.sf.psstools.lang.pSS.struct_declaration
   * @generated
   */
  EClass getstruct_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.struct_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.struct_declaration#getName()
   * @see #getstruct_declaration()
   * @generated
   */
  EAttribute getstruct_declaration_Name();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.struct_declaration#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see net.sf.psstools.lang.pSS.struct_declaration#getSuper()
   * @see #getstruct_declaration()
   * @generated
   */
  EReference getstruct_declaration_Super();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.struct_declaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.struct_declaration#getBody()
   * @see #getstruct_declaration()
   * @generated
   */
  EReference getstruct_declaration_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.struct_body_item <em>struct body item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct body item</em>'.
   * @see net.sf.psstools.lang.pSS.struct_body_item
   * @generated
   */
  EClass getstruct_body_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_body_item <em>graph body item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph body item</em>'.
   * @see net.sf.psstools.lang.pSS.graph_body_item
   * @generated
   */
  EClass getgraph_body_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.symbol_definition <em>symbol definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>symbol definition</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_definition
   * @generated
   */
  EClass getsymbol_definition();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.symbol_definition#getSymbol_name <em>Symbol name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol name</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_definition#getSymbol_name()
   * @see #getsymbol_definition()
   * @generated
   */
  EAttribute getsymbol_definition_Symbol_name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.symbol_definition#getBody_items <em>Body items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body items</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_definition#getBody_items()
   * @see #getsymbol_definition()
   * @generated
   */
  EReference getsymbol_definition_Body_items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.interface_action_definition <em>interface action definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interface action definition</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_definition
   * @generated
   */
  EClass getinterface_action_definition();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.interface_action_definition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_definition#getAction()
   * @see #getinterface_action_definition()
   * @generated
   */
  EReference getinterface_action_definition_Action();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.interface_action_definition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_definition#getParameters()
   * @see #getinterface_action_definition()
   * @generated
   */
  EReference getinterface_action_definition_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.interface_action_definition#getBody_items <em>Body items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body items</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_definition#getBody_items()
   * @see #getinterface_action_definition()
   * @generated
   */
  EReference getinterface_action_definition_Body_items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_production <em>rule production</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule production</em>'.
   * @see net.sf.psstools.lang.pSS.rule_production
   * @generated
   */
  EClass getrule_production();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_stmt_or_block <em>rule stmt or block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule stmt or block</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_or_block
   * @generated
   */
  EClass getrule_stmt_or_block();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_stmt_alt_parallel_seq <em>rule stmt alt parallel seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule stmt alt parallel seq</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_alt_parallel_seq
   * @generated
   */
  EClass getrule_stmt_alt_parallel_seq();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_stmt_primary <em>rule stmt primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule stmt primary</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_primary
   * @generated
   */
  EClass getrule_stmt_primary();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.rule_stmt_primary#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_primary#getParam()
   * @see #getrule_stmt_primary()
   * @generated
   */
  EAttribute getrule_stmt_primary_Param();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_stmt_primary#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_primary#getRhs()
   * @see #getrule_stmt_primary()
   * @generated
   */
  EReference getrule_stmt_primary_Rhs();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.rule_stmt_primary#getStmt_list <em>Stmt list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt list</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_primary#getStmt_list()
   * @see #getrule_stmt_primary()
   * @generated
   */
  EReference getrule_stmt_primary_Stmt_list();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel_alt <em>rule stmt parallel alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule stmt parallel alt</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel_alt
   * @generated
   */
  EClass getrule_stmt_parallel_alt();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel_alt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel_alt#getLeft()
   * @see #getrule_stmt_parallel_alt()
   * @generated
   */
  EReference getrule_stmt_parallel_alt_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel_alt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel_alt#getRight()
   * @see #getrule_stmt_parallel_alt()
   * @generated
   */
  EReference getrule_stmt_parallel_alt_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel <em>rule stmt parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule stmt parallel</em>'.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel
   * @generated
   */
  EClass getrule_stmt_parallel();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_sequence <em>rule sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule sequence</em>'.
   * @see net.sf.psstools.lang.pSS.rule_sequence
   * @generated
   */
  EClass getrule_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.rule_sequence#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.rule_sequence#getItems()
   * @see #getrule_sequence()
   * @generated
   */
  EReference getrule_sequence_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_seq_item <em>rule seq item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule seq item</em>'.
   * @see net.sf.psstools.lang.pSS.rule_seq_item
   * @generated
   */
  EClass getrule_seq_item();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_seq_item#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see net.sf.psstools.lang.pSS.rule_seq_item#getAction()
   * @see #getrule_seq_item()
   * @generated
   */
  EReference getrule_seq_item_Action();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_seq_item#getAction_params <em>Action params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action params</em>'.
   * @see net.sf.psstools.lang.pSS.rule_seq_item#getAction_params()
   * @see #getrule_seq_item()
   * @generated
   */
  EReference getrule_seq_item_Action_params();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.rule_seq_item#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item</em>'.
   * @see net.sf.psstools.lang.pSS.rule_seq_item#getItem()
   * @see #getrule_seq_item()
   * @generated
   */
  EAttribute getrule_seq_item_Item();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_seq_item#getWith_clause <em>With clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With clause</em>'.
   * @see net.sf.psstools.lang.pSS.rule_seq_item#getWith_clause()
   * @see #getrule_seq_item()
   * @generated
   */
  EReference getrule_seq_item_With_clause();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_with_clause <em>rule with clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule with clause</em>'.
   * @see net.sf.psstools.lang.pSS.rule_with_clause
   * @generated
   */
  EClass getrule_with_clause();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.rule_with_clause#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.rule_with_clause#getBody()
   * @see #getrule_with_clause()
   * @generated
   */
  EReference getrule_with_clause_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.parameter_list <em>parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter list</em>'.
   * @see net.sf.psstools.lang.pSS.parameter_list
   * @generated
   */
  EClass getparameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.sf.psstools.lang.pSS.parameter_list#getParameters()
   * @see #getparameter_list()
   * @generated
   */
  EReference getparameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.rule_repeat_stmt <em>rule repeat stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule repeat stmt</em>'.
   * @see net.sf.psstools.lang.pSS.rule_repeat_stmt
   * @generated
   */
  EClass getrule_repeat_stmt();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_repeat_stmt#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.psstools.lang.pSS.rule_repeat_stmt#getExpr()
   * @see #getrule_repeat_stmt()
   * @generated
   */
  EReference getrule_repeat_stmt_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.rule_repeat_stmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see net.sf.psstools.lang.pSS.rule_repeat_stmt#getStmt()
   * @see #getrule_repeat_stmt()
   * @generated
   */
  EReference getrule_repeat_stmt_Stmt();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.overrides_declaration <em>overrides declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>overrides declaration</em>'.
   * @see net.sf.psstools.lang.pSS.overrides_declaration
   * @generated
   */
  EClass getoverrides_declaration();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.override_stmt <em>override stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>override stmt</em>'.
   * @see net.sf.psstools.lang.pSS.override_stmt
   * @generated
   */
  EClass getoverride_stmt();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.override_stmt#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dest</em>'.
   * @see net.sf.psstools.lang.pSS.override_stmt#getDest()
   * @see #getoverride_stmt()
   * @generated
   */
  EAttribute getoverride_stmt_Dest();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.type_override <em>type override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type override</em>'.
   * @see net.sf.psstools.lang.pSS.type_override
   * @generated
   */
  EClass gettype_override();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.type_override#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Src</em>'.
   * @see net.sf.psstools.lang.pSS.type_override#getSrc()
   * @see #gettype_override()
   * @generated
   */
  EAttribute gettype_override_Src();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.instance_override <em>instance override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>instance override</em>'.
   * @see net.sf.psstools.lang.pSS.instance_override
   * @generated
   */
  EClass getinstance_override();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.instance_override#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see net.sf.psstools.lang.pSS.instance_override#getSrc()
   * @see #getinstance_override()
   * @generated
   */
  EReference getinstance_override_Src();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.data_declaration <em>data declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>data declaration</em>'.
   * @see net.sf.psstools.lang.pSS.data_declaration
   * @generated
   */
  EClass getdata_declaration();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.data_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.data_declaration#getType()
   * @see #getdata_declaration()
   * @generated
   */
  EReference getdata_declaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.data_declaration#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see net.sf.psstools.lang.pSS.data_declaration#getInstances()
   * @see #getdata_declaration()
   * @generated
   */
  EReference getdata_declaration_Instances();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.data_instantiation <em>data instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>data instantiation</em>'.
   * @see net.sf.psstools.lang.pSS.data_instantiation
   * @generated
   */
  EClass getdata_instantiation();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.data_instantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.data_instantiation#getName()
   * @see #getdata_instantiation()
   * @generated
   */
  EAttribute getdata_instantiation_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.data_instantiation#getPortmap <em>Portmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Portmap</em>'.
   * @see net.sf.psstools.lang.pSS.data_instantiation#getPortmap()
   * @see #getdata_instantiation()
   * @generated
   */
  EReference getdata_instantiation_Portmap();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_interface_portmap_list <em>graph interface portmap list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph interface portmap list</em>'.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap_list
   * @generated
   */
  EClass getgraph_interface_portmap_list();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.graph_interface_portmap_list#getMaps <em>Maps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maps</em>'.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap_list#getMaps()
   * @see #getgraph_interface_portmap_list()
   * @generated
   */
  EReference getgraph_interface_portmap_list_Maps();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_interface_portmap <em>graph interface portmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph interface portmap</em>'.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap
   * @generated
   */
  EClass getgraph_interface_portmap();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.graph_interface_portmap#getPortname <em>Portname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Portname</em>'.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap#getPortname()
   * @see #getgraph_interface_portmap()
   * @generated
   */
  EAttribute getgraph_interface_portmap_Portname();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.graph_interface_portmap#getConnected_name <em>Connected name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Connected name</em>'.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap#getConnected_name()
   * @see #getgraph_interface_portmap()
   * @generated
   */
  EReference getgraph_interface_portmap_Connected_name();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.data_type <em>data type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>data type</em>'.
   * @see net.sf.psstools.lang.pSS.data_type
   * @generated
   */
  EClass getdata_type();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.user_defined_type <em>user defined type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>user defined type</em>'.
   * @see net.sf.psstools.lang.pSS.user_defined_type
   * @generated
   */
  EClass getuser_defined_type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.user_defined_type#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typename</em>'.
   * @see net.sf.psstools.lang.pSS.user_defined_type#getTypename()
   * @see #getuser_defined_type()
   * @generated
   */
  EAttribute getuser_defined_type_Typename();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.typedef_declaration <em>typedef declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>typedef declaration</em>'.
   * @see net.sf.psstools.lang.pSS.typedef_declaration
   * @generated
   */
  EClass gettypedef_declaration();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.typedef_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.typedef_declaration#getType()
   * @see #gettypedef_declaration()
   * @generated
   */
  EReference gettypedef_declaration_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.typedef_declaration#getType_identifier <em>Type identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type identifier</em>'.
   * @see net.sf.psstools.lang.pSS.typedef_declaration#getType_identifier()
   * @see #gettypedef_declaration()
   * @generated
   */
  EAttribute gettypedef_declaration_Type_identifier();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.enum_type <em>enum type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enum type</em>'.
   * @see net.sf.psstools.lang.pSS.enum_type
   * @generated
   */
  EClass getenum_type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.enum_type#getData_type <em>Data type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data type</em>'.
   * @see net.sf.psstools.lang.pSS.enum_type#getData_type()
   * @see #getenum_type()
   * @generated
   */
  EReference getenum_type_Data_type();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.psstools.lang.pSS.enum_type#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.enum_type#getItems()
   * @see #getenum_type()
   * @generated
   */
  EAttribute getenum_type_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.integer_type <em>integer type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>integer type</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type
   * @generated
   */
  EClass getinteger_type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.integer_type#getAtom_type <em>Atom type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom type</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getAtom_type()
   * @see #getinteger_type()
   * @generated
   */
  EAttribute getinteger_type_Atom_type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.integer_type#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getLhs()
   * @see #getinteger_type()
   * @generated
   */
  EReference getinteger_type_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.integer_type#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getRhs()
   * @see #getinteger_type()
   * @generated
   */
  EReference getinteger_type_Rhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.integer_type#getInside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inside</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getInside()
   * @see #getinteger_type()
   * @generated
   */
  EReference getinteger_type_Inside();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.type_inside_clause <em>type inside clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type inside clause</em>'.
   * @see net.sf.psstools.lang.pSS.type_inside_clause
   * @generated
   */
  EClass gettype_inside_clause();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.type_inside_clause#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see net.sf.psstools.lang.pSS.type_inside_clause#getDomain()
   * @see #gettype_inside_clause()
   * @generated
   */
  EReference gettype_inside_clause_Domain();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.open_range_list <em>open range list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>open range list</em>'.
   * @see net.sf.psstools.lang.pSS.open_range_list
   * @generated
   */
  EClass getopen_range_list();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.open_range_list#getRanges <em>Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ranges</em>'.
   * @see net.sf.psstools.lang.pSS.open_range_list#getRanges()
   * @see #getopen_range_list()
   * @generated
   */
  EReference getopen_range_list_Ranges();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.open_range_value <em>open range value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>open range value</em>'.
   * @see net.sf.psstools.lang.pSS.open_range_value
   * @generated
   */
  EClass getopen_range_value();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.open_range_value#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.sf.psstools.lang.pSS.open_range_value#getLhs()
   * @see #getopen_range_value()
   * @generated
   */
  EReference getopen_range_value_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.open_range_value#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see net.sf.psstools.lang.pSS.open_range_value#getRange()
   * @see #getopen_range_value()
   * @generated
   */
  EReference getopen_range_value_Range();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.range_expr <em>range expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>range expr</em>'.
   * @see net.sf.psstools.lang.pSS.range_expr
   * @generated
   */
  EClass getrange_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.range_expr#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.sf.psstools.lang.pSS.range_expr#getLhs()
   * @see #getrange_expr()
   * @generated
   */
  EReference getrange_expr_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.range_expr#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.sf.psstools.lang.pSS.range_expr#getRhs()
   * @see #getrange_expr()
   * @generated
   */
  EReference getrange_expr_Rhs();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constraint_declaration <em>constraint declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constraint declaration</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_declaration
   * @generated
   */
  EClass getconstraint_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.constraint_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_declaration#getName()
   * @see #getconstraint_declaration()
   * @generated
   */
  EAttribute getconstraint_declaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.constraint_declaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_declaration#getBody()
   * @see #getconstraint_declaration()
   * @generated
   */
  EReference getconstraint_declaration_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constraint_body_item <em>constraint body item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constraint body item</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_body_item
   * @generated
   */
  EClass getconstraint_body_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.expression_or_dist_item <em>expression or dist item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression or dist item</em>'.
   * @see net.sf.psstools.lang.pSS.expression_or_dist_item
   * @generated
   */
  EClass getexpression_or_dist_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.if_constraint_item <em>if constraint item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>if constraint item</em>'.
   * @see net.sf.psstools.lang.pSS.if_constraint_item
   * @generated
   */
  EClass getif_constraint_item();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.if_constraint_item#getIf_expr <em>If expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If expr</em>'.
   * @see net.sf.psstools.lang.pSS.if_constraint_item#getIf_expr()
   * @see #getif_constraint_item()
   * @generated
   */
  EReference getif_constraint_item_If_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.if_constraint_item#getTrue_case <em>True case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True case</em>'.
   * @see net.sf.psstools.lang.pSS.if_constraint_item#getTrue_case()
   * @see #getif_constraint_item()
   * @generated
   */
  EReference getif_constraint_item_True_case();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.if_constraint_item#getFalse_set <em>False set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False set</em>'.
   * @see net.sf.psstools.lang.pSS.if_constraint_item#getFalse_set()
   * @see #getif_constraint_item()
   * @generated
   */
  EReference getif_constraint_item_False_set();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.foreach_constraint_item <em>foreach constraint item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>foreach constraint item</em>'.
   * @see net.sf.psstools.lang.pSS.foreach_constraint_item
   * @generated
   */
  EClass getforeach_constraint_item();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.psstools.lang.pSS.foreach_constraint_item#getExpr()
   * @see #getforeach_constraint_item()
   * @generated
   */
  EReference getforeach_constraint_item_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.foreach_constraint_item#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.foreach_constraint_item#getBody()
   * @see #getforeach_constraint_item()
   * @generated
   */
  EReference getforeach_constraint_item_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constraint_set <em>constraint set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constraint set</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_set
   * @generated
   */
  EClass getconstraint_set();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.constraint_set#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_set#getItems()
   * @see #getconstraint_set()
   * @generated
   */
  EReference getconstraint_set_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constraint_block <em>constraint block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constraint block</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_block
   * @generated
   */
  EClass getconstraint_block();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_or_scheme_declaration <em>bin or scheme declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin or scheme declaration</em>'.
   * @see net.sf.psstools.lang.pSS.bin_or_scheme_declaration
   * @generated
   */
  EClass getbin_or_scheme_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.bin_or_scheme_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.bin_or_scheme_declaration#getName()
   * @see #getbin_or_scheme_declaration()
   * @generated
   */
  EAttribute getbin_or_scheme_declaration_Name();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bins_declaration <em>bins declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bins declaration</em>'.
   * @see net.sf.psstools.lang.pSS.bins_declaration
   * @generated
   */
  EClass getbins_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.bins_declaration#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item</em>'.
   * @see net.sf.psstools.lang.pSS.bins_declaration#getItem()
   * @see #getbins_declaration()
   * @generated
   */
  EAttribute getbins_declaration_Item();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.bins_declaration#getBins <em>Bins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bins</em>'.
   * @see net.sf.psstools.lang.pSS.bins_declaration#getBins()
   * @see #getbins_declaration()
   * @generated
   */
  EReference getbins_declaration_Bins();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_specification <em>bin specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin specification</em>'.
   * @see net.sf.psstools.lang.pSS.bin_specification
   * @generated
   */
  EClass getbin_specification();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.bin_specification#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.bin_specification#getItems()
   * @see #getbin_specification()
   * @generated
   */
  EReference getbin_specification_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_specifier <em>bin specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin specifier</em>'.
   * @see net.sf.psstools.lang.pSS.bin_specifier
   * @generated
   */
  EClass getbin_specifier();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.explicit_bin_value <em>explicit bin value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>explicit bin value</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_value
   * @generated
   */
  EClass getexplicit_bin_value();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.explicit_bin_range <em>explicit bin range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>explicit bin range</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range
   * @generated
   */
  EClass getexplicit_bin_range();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.explicit_bin_range#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Low</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range#getLow()
   * @see #getexplicit_bin_range()
   * @generated
   */
  EReference getexplicit_bin_range_Low();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.explicit_bin_range#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>High</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range#getHigh()
   * @see #getexplicit_bin_range()
   * @generated
   */
  EReference getexplicit_bin_range_High();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.explicit_bin_range#getDiv <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Div</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range#getDiv()
   * @see #getexplicit_bin_range()
   * @generated
   */
  EReference getexplicit_bin_range_Div();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.explicit_bin_range#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range#getSize()
   * @see #getexplicit_bin_range()
   * @generated
   */
  EReference getexplicit_bin_range_Size();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_range_divide <em>bin range divide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin range divide</em>'.
   * @see net.sf.psstools.lang.pSS.bin_range_divide
   * @generated
   */
  EClass getbin_range_divide();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_range_size <em>bin range size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin range size</em>'.
   * @see net.sf.psstools.lang.pSS.bin_range_size
   * @generated
   */
  EClass getbin_range_size();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_scheme_declaration <em>bin scheme declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin scheme declaration</em>'.
   * @see net.sf.psstools.lang.pSS.bin_scheme_declaration
   * @generated
   */
  EClass getbin_scheme_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.bin_scheme_declaration#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.bin_scheme_declaration#getItems()
   * @see #getbin_scheme_declaration()
   * @generated
   */
  EReference getbin_scheme_declaration_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.bin_scheme_specifier <em>bin scheme specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin scheme specifier</em>'.
   * @see net.sf.psstools.lang.pSS.bin_scheme_specifier
   * @generated
   */
  EClass getbin_scheme_specifier();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.bin_scheme_specifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.bin_scheme_specifier#getName()
   * @see #getbin_scheme_specifier()
   * @generated
   */
  EAttribute getbin_scheme_specifier_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.bin_scheme_specifier#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see net.sf.psstools.lang.pSS.bin_scheme_specifier#getSpec()
   * @see #getbin_scheme_specifier()
   * @generated
   */
  EReference getbin_scheme_specifier_Spec();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant expression</em>'.
   * @see net.sf.psstools.lang.pSS.constant_expression
   * @generated
   */
  EClass getconstant_expression();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see net.sf.psstools.lang.pSS.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.expression#getImpl_constraint <em>Impl constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Impl constraint</em>'.
   * @see net.sf.psstools.lang.pSS.expression#getImpl_constraint()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Impl_constraint();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.psstools.lang.pSS.expression#getExpr()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.expression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.sf.psstools.lang.pSS.expression#getLhs()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.expression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.sf.psstools.lang.pSS.expression#getRhs()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Rhs();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.psstools.lang.pSS.expression#getLeft()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Left();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.interface_declaration <em>interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interface declaration</em>'.
   * @see net.sf.psstools.lang.pSS.interface_declaration
   * @generated
   */
  EClass getinterface_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.interface_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.interface_declaration#getName()
   * @see #getinterface_declaration()
   * @generated
   */
  EAttribute getinterface_declaration_Name();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.interface_declaration#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see net.sf.psstools.lang.pSS.interface_declaration#getSuper()
   * @see #getinterface_declaration()
   * @generated
   */
  EReference getinterface_declaration_Super();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.interface_declaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see net.sf.psstools.lang.pSS.interface_declaration#getBody()
   * @see #getinterface_declaration()
   * @generated
   */
  EReference getinterface_declaration_Body();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.interface_body_item <em>interface body item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interface body item</em>'.
   * @see net.sf.psstools.lang.pSS.interface_body_item
   * @generated
   */
  EClass getinterface_body_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.action_declaration <em>action declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>action declaration</em>'.
   * @see net.sf.psstools.lang.pSS.action_declaration
   * @generated
   */
  EClass getaction_declaration();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.action_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.action_declaration#getName()
   * @see #getaction_declaration()
   * @generated
   */
  EAttribute getaction_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.action_declaration#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ports</em>'.
   * @see net.sf.psstools.lang.pSS.action_declaration#getPorts()
   * @see #getaction_declaration()
   * @generated
   */
  EReference getaction_declaration_Ports();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.action_portlist <em>action portlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>action portlist</em>'.
   * @see net.sf.psstools.lang.pSS.action_portlist
   * @generated
   */
  EClass getaction_portlist();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.action_portlist#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see net.sf.psstools.lang.pSS.action_portlist#getPorts()
   * @see #getaction_portlist()
   * @generated
   */
  EReference getaction_portlist_Ports();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.action_port <em>action port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>action port</em>'.
   * @see net.sf.psstools.lang.pSS.action_port
   * @generated
   */
  EClass getaction_port();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.action_port#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.action_port#getType()
   * @see #getaction_port()
   * @generated
   */
  EReference getaction_port_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.action_port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.action_port#getName()
   * @see #getaction_port()
   * @generated
   */
  EAttribute getaction_port_Name();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_data_declaration <em>graph data declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph data declaration</em>'.
   * @see net.sf.psstools.lang.pSS.graph_data_declaration
   * @generated
   */
  EClass getgraph_data_declaration();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.graph_data_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.graph_data_declaration#getType()
   * @see #getgraph_data_declaration()
   * @generated
   */
  EReference getgraph_data_declaration_Type();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.psstools.lang.pSS.graph_data_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see net.sf.psstools.lang.pSS.graph_data_declaration#getNames()
   * @see #getgraph_data_declaration()
   * @generated
   */
  EAttribute getgraph_data_declaration_Names();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.graph_data_declaration#getPortmaps <em>Portmaps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Portmaps</em>'.
   * @see net.sf.psstools.lang.pSS.graph_data_declaration#getPortmaps()
   * @see #getgraph_data_declaration()
   * @generated
   */
  EReference getgraph_data_declaration_Portmaps();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.symbol_declaration <em>symbol declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>symbol declaration</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_declaration
   * @generated
   */
  EClass getsymbol_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.symbol_declaration#getDecl_list <em>Decl list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl list</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_declaration#getDecl_list()
   * @see #getsymbol_declaration()
   * @generated
   */
  EReference getsymbol_declaration_Decl_list();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule <em>Inline rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inline rule</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_declaration#getInline_rule()
   * @see #getsymbol_declaration()
   * @generated
   */
  EReference getsymbol_declaration_Inline_rule();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.symbol_decl_item <em>symbol decl item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>symbol decl item</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_decl_item
   * @generated
   */
  EClass getsymbol_decl_item();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.symbol_decl_item#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_decl_item#getName()
   * @see #getsymbol_decl_item()
   * @generated
   */
  EAttribute getsymbol_decl_item_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.symbol_decl_item#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_decl_item#getParameters()
   * @see #getsymbol_decl_item()
   * @generated
   */
  EReference getsymbol_decl_item_Parameters();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.port_map <em>port map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>port map</em>'.
   * @see net.sf.psstools.lang.pSS.port_map
   * @generated
   */
  EClass getport_map();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.port_map#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see net.sf.psstools.lang.pSS.port_map#getPort()
   * @see #getport_map()
   * @generated
   */
  EAttribute getport_map_Port();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.port_map#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see net.sf.psstools.lang.pSS.port_map#getMap()
   * @see #getport_map()
   * @generated
   */
  EReference getport_map_Map();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant</em>'.
   * @see net.sf.psstools.lang.pSS.constant
   * @generated
   */
  EClass getconstant();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.hierarchical_id <em>hierarchical id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>hierarchical id</em>'.
   * @see net.sf.psstools.lang.pSS.hierarchical_id
   * @generated
   */
  EClass gethierarchical_id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.hierarchical_id#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.psstools.lang.pSS.hierarchical_id#getValue()
   * @see #gethierarchical_id()
   * @generated
   */
  EAttribute gethierarchical_id_Value();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.interface_action_id <em>interface action id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interface action id</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_id
   * @generated
   */
  EClass getinterface_action_id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.interface_action_id#getIfc <em>Ifc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ifc</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_id#getIfc()
   * @see #getinterface_action_id()
   * @generated
   */
  EAttribute getinterface_action_id_Ifc();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.interface_action_id#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see net.sf.psstools.lang.pSS.interface_action_id#getAction()
   * @see #getinterface_action_id()
   * @generated
   */
  EAttribute getinterface_action_id_Action();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.literal <em>literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>literal</em>'.
   * @see net.sf.psstools.lang.pSS.literal
   * @generated
   */
  EClass getliteral();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.psstools.lang.pSS.literal#getValue()
   * @see #getliteral()
   * @generated
   */
  EAttribute getliteral_Value();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.decimal_number <em>decimal number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>decimal number</em>'.
   * @see net.sf.psstools.lang.pSS.decimal_number
   * @generated
   */
  EClass getdecimal_number();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.decimal_number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.psstools.lang.pSS.decimal_number#getValue()
   * @see #getdecimal_number()
   * @generated
   */
  EAttribute getdecimal_number_Value();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.size <em>size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>size</em>'.
   * @see net.sf.psstools.lang.pSS.size
   * @generated
   */
  EClass getsize();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.alt_stmt <em>alt stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>alt stmt</em>'.
   * @see net.sf.psstools.lang.pSS.alt_stmt
   * @generated
   */
  EClass getalt_stmt();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.alt_stmt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.psstools.lang.pSS.alt_stmt#getLeft()
   * @see #getalt_stmt()
   * @generated
   */
  EReference getalt_stmt_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.alt_stmt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.alt_stmt#getRight()
   * @see #getalt_stmt()
   * @generated
   */
  EReference getalt_stmt_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.stmt_alt <em>stmt alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stmt alt</em>'.
   * @see net.sf.psstools.lang.pSS.stmt_alt
   * @generated
   */
  EClass getstmt_alt();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.overides_declaration <em>overides declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>overides declaration</em>'.
   * @see net.sf.psstools.lang.pSS.overides_declaration
   * @generated
   */
  EClass getoverides_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.overides_declaration#getOverrides <em>Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Overrides</em>'.
   * @see net.sf.psstools.lang.pSS.overides_declaration#getOverrides()
   * @see #getoverides_declaration()
   * @generated
   */
  EReference getoverides_declaration_Overrides();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.condition_expr <em>condition expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>condition expr</em>'.
   * @see net.sf.psstools.lang.pSS.condition_expr
   * @generated
   */
  EClass getcondition_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.condition_expr#getTrue_expr <em>True expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True expr</em>'.
   * @see net.sf.psstools.lang.pSS.condition_expr#getTrue_expr()
   * @see #getcondition_expr()
   * @generated
   */
  EReference getcondition_expr_True_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.condition_expr#getFalse_expr <em>False expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False expr</em>'.
   * @see net.sf.psstools.lang.pSS.condition_expr#getFalse_expr()
   * @see #getcondition_expr()
   * @generated
   */
  EReference getcondition_expr_False_expr();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.logical_or_expr <em>logical or expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical or expr</em>'.
   * @see net.sf.psstools.lang.pSS.logical_or_expr
   * @generated
   */
  EClass getlogical_or_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.logical_or_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.logical_or_expr#getRight()
   * @see #getlogical_or_expr()
   * @generated
   */
  EReference getlogical_or_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.logical_and_expr <em>logical and expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical and expr</em>'.
   * @see net.sf.psstools.lang.pSS.logical_and_expr
   * @generated
   */
  EClass getlogical_and_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.logical_and_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.logical_and_expr#getRight()
   * @see #getlogical_and_expr()
   * @generated
   */
  EReference getlogical_and_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_xor_expr <em>binary xor expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary xor expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_xor_expr
   * @generated
   */
  EClass getbinary_xor_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_xor_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_xor_expr#getRight()
   * @see #getbinary_xor_expr()
   * @generated
   */
  EReference getbinary_xor_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_and_expr <em>binary and expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary and expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_and_expr
   * @generated
   */
  EClass getbinary_and_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_and_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_and_expr#getRight()
   * @see #getbinary_and_expr()
   * @generated
   */
  EReference getbinary_and_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.logical_equality_expr <em>logical equality expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical equality expr</em>'.
   * @see net.sf.psstools.lang.pSS.logical_equality_expr
   * @generated
   */
  EClass getlogical_equality_expr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.logical_equality_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.sf.psstools.lang.pSS.logical_equality_expr#getOp()
   * @see #getlogical_equality_expr()
   * @generated
   */
  EAttribute getlogical_equality_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.logical_equality_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.logical_equality_expr#getRight()
   * @see #getlogical_equality_expr()
   * @generated
   */
  EReference getlogical_equality_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.logical_inequality_expr <em>logical inequality expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical inequality expr</em>'.
   * @see net.sf.psstools.lang.pSS.logical_inequality_expr
   * @generated
   */
  EClass getlogical_inequality_expr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.logical_inequality_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.sf.psstools.lang.pSS.logical_inequality_expr#getOp()
   * @see #getlogical_inequality_expr()
   * @generated
   */
  EAttribute getlogical_inequality_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.logical_inequality_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.logical_inequality_expr#getRight()
   * @see #getlogical_inequality_expr()
   * @generated
   */
  EReference getlogical_inequality_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_shift_expr <em>binary shift expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary shift expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_shift_expr
   * @generated
   */
  EClass getbinary_shift_expr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.binary_shift_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.sf.psstools.lang.pSS.binary_shift_expr#getOp()
   * @see #getbinary_shift_expr()
   * @generated
   */
  EAttribute getbinary_shift_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_shift_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_shift_expr#getRight()
   * @see #getbinary_shift_expr()
   * @generated
   */
  EReference getbinary_shift_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_add_sub_expr <em>binary add sub expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary add sub expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_add_sub_expr
   * @generated
   */
  EClass getbinary_add_sub_expr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.binary_add_sub_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.sf.psstools.lang.pSS.binary_add_sub_expr#getOp()
   * @see #getbinary_add_sub_expr()
   * @generated
   */
  EAttribute getbinary_add_sub_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_add_sub_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_add_sub_expr#getRight()
   * @see #getbinary_add_sub_expr()
   * @generated
   */
  EReference getbinary_add_sub_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_mul_div_mod_expr <em>binary mul div mod expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary mul div mod expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_mul_div_mod_expr
   * @generated
   */
  EClass getbinary_mul_div_mod_expr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.binary_mul_div_mod_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.sf.psstools.lang.pSS.binary_mul_div_mod_expr#getOp()
   * @see #getbinary_mul_div_mod_expr()
   * @generated
   */
  EAttribute getbinary_mul_div_mod_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_mul_div_mod_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_mul_div_mod_expr#getRight()
   * @see #getbinary_mul_div_mod_expr()
   * @generated
   */
  EReference getbinary_mul_div_mod_expr_Right();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.binary_exp_expr <em>binary exp expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>binary exp expr</em>'.
   * @see net.sf.psstools.lang.pSS.binary_exp_expr
   * @generated
   */
  EClass getbinary_exp_expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.binary_exp_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.psstools.lang.pSS.binary_exp_expr#getRight()
   * @see #getbinary_exp_expr()
   * @generated
   */
  EReference getbinary_exp_expr_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PSSFactory getPSSFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.ModelImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOT = eINSTANCE.getModel_Root();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.portable_stimulus_descriptionImpl <em>portable stimulus description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.portable_stimulus_descriptionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getportable_stimulus_description()
     * @generated
     */
    EClass PORTABLE_STIMULUS_DESCRIPTION = eINSTANCE.getportable_stimulus_description();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_or_struct_declarationImpl <em>graph or struct declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_or_struct_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_or_struct_declaration()
     * @generated
     */
    EClass GRAPH_OR_STRUCT_DECLARATION = eINSTANCE.getgraph_or_struct_declaration();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_struct_ifc_declarationImpl <em>graph struct ifc declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_struct_ifc_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_struct_ifc_declaration()
     * @generated
     */
    EClass GRAPH_STRUCT_IFC_DECLARATION = eINSTANCE.getgraph_struct_ifc_declaration();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_declarationImpl <em>graph declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_declaration()
     * @generated
     */
    EClass GRAPH_DECLARATION = eINSTANCE.getgraph_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH_DECLARATION__NAME = eINSTANCE.getgraph_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DECLARATION__PORTS = eINSTANCE.getgraph_declaration_Ports();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DECLARATION__SUPER = eINSTANCE.getgraph_declaration_Super();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DECLARATION__BODY = eINSTANCE.getgraph_declaration_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.port_declarationImpl <em>port declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.port_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getport_declaration()
     * @generated
     */
    EClass PORT_DECLARATION = eINSTANCE.getport_declaration();

    /**
     * The meta object literal for the '<em><b>Ifc type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_DECLARATION__IFC_TYPE = eINSTANCE.getport_declaration_Ifc_type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT_DECLARATION__NAME = eINSTANCE.getport_declaration_Name();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.struct_declarationImpl <em>struct declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.struct_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_declaration()
     * @generated
     */
    EClass STRUCT_DECLARATION = eINSTANCE.getstruct_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_DECLARATION__NAME = eINSTANCE.getstruct_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__SUPER = eINSTANCE.getstruct_declaration_Super();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__BODY = eINSTANCE.getstruct_declaration_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.struct_body_itemImpl <em>struct body item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.struct_body_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_body_item()
     * @generated
     */
    EClass STRUCT_BODY_ITEM = eINSTANCE.getstruct_body_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_body_itemImpl <em>graph body item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_body_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_body_item()
     * @generated
     */
    EClass GRAPH_BODY_ITEM = eINSTANCE.getgraph_body_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.symbol_definitionImpl <em>symbol definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.symbol_definitionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_definition()
     * @generated
     */
    EClass SYMBOL_DEFINITION = eINSTANCE.getsymbol_definition();

    /**
     * The meta object literal for the '<em><b>Symbol name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_DEFINITION__SYMBOL_NAME = eINSTANCE.getsymbol_definition_Symbol_name();

    /**
     * The meta object literal for the '<em><b>Body items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DEFINITION__BODY_ITEMS = eINSTANCE.getsymbol_definition_Body_items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.interface_action_definitionImpl <em>interface action definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.interface_action_definitionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_action_definition()
     * @generated
     */
    EClass INTERFACE_ACTION_DEFINITION = eINSTANCE.getinterface_action_definition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACTION_DEFINITION__ACTION = eINSTANCE.getinterface_action_definition_Action();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACTION_DEFINITION__PARAMETERS = eINSTANCE.getinterface_action_definition_Parameters();

    /**
     * The meta object literal for the '<em><b>Body items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACTION_DEFINITION__BODY_ITEMS = eINSTANCE.getinterface_action_definition_Body_items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_productionImpl <em>rule production</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_productionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_production()
     * @generated
     */
    EClass RULE_PRODUCTION = eINSTANCE.getrule_production();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_or_blockImpl <em>rule stmt or block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_stmt_or_blockImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_or_block()
     * @generated
     */
    EClass RULE_STMT_OR_BLOCK = eINSTANCE.getrule_stmt_or_block();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_alt_parallel_seqImpl <em>rule stmt alt parallel seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_stmt_alt_parallel_seqImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_alt_parallel_seq()
     * @generated
     */
    EClass RULE_STMT_ALT_PARALLEL_SEQ = eINSTANCE.getrule_stmt_alt_parallel_seq();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_primaryImpl <em>rule stmt primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_stmt_primaryImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_primary()
     * @generated
     */
    EClass RULE_STMT_PRIMARY = eINSTANCE.getrule_stmt_primary();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_STMT_PRIMARY__PARAM = eINSTANCE.getrule_stmt_primary_Param();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STMT_PRIMARY__RHS = eINSTANCE.getrule_stmt_primary_Rhs();

    /**
     * The meta object literal for the '<em><b>Stmt list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STMT_PRIMARY__STMT_LIST = eINSTANCE.getrule_stmt_primary_Stmt_list();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_parallel_altImpl <em>rule stmt parallel alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_stmt_parallel_altImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_parallel_alt()
     * @generated
     */
    EClass RULE_STMT_PARALLEL_ALT = eINSTANCE.getrule_stmt_parallel_alt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STMT_PARALLEL_ALT__LEFT = eINSTANCE.getrule_stmt_parallel_alt_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STMT_PARALLEL_ALT__RIGHT = eINSTANCE.getrule_stmt_parallel_alt_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_stmt_parallelImpl <em>rule stmt parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_stmt_parallelImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_stmt_parallel()
     * @generated
     */
    EClass RULE_STMT_PARALLEL = eINSTANCE.getrule_stmt_parallel();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_sequenceImpl <em>rule sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_sequenceImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_sequence()
     * @generated
     */
    EClass RULE_SEQUENCE = eINSTANCE.getrule_sequence();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SEQUENCE__ITEMS = eINSTANCE.getrule_sequence_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_seq_itemImpl <em>rule seq item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_seq_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_seq_item()
     * @generated
     */
    EClass RULE_SEQ_ITEM = eINSTANCE.getrule_seq_item();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SEQ_ITEM__ACTION = eINSTANCE.getrule_seq_item_Action();

    /**
     * The meta object literal for the '<em><b>Action params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SEQ_ITEM__ACTION_PARAMS = eINSTANCE.getrule_seq_item_Action_params();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_SEQ_ITEM__ITEM = eINSTANCE.getrule_seq_item_Item();

    /**
     * The meta object literal for the '<em><b>With clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SEQ_ITEM__WITH_CLAUSE = eINSTANCE.getrule_seq_item_With_clause();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_with_clauseImpl <em>rule with clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_with_clauseImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_with_clause()
     * @generated
     */
    EClass RULE_WITH_CLAUSE = eINSTANCE.getrule_with_clause();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_WITH_CLAUSE__BODY = eINSTANCE.getrule_with_clause_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.parameter_listImpl <em>parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.parameter_listImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getparameter_list()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getparameter_list();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getparameter_list_Parameters();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.rule_repeat_stmtImpl <em>rule repeat stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.rule_repeat_stmtImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrule_repeat_stmt()
     * @generated
     */
    EClass RULE_REPEAT_STMT = eINSTANCE.getrule_repeat_stmt();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_REPEAT_STMT__EXPR = eINSTANCE.getrule_repeat_stmt_Expr();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_REPEAT_STMT__STMT = eINSTANCE.getrule_repeat_stmt_Stmt();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.overrides_declarationImpl <em>overrides declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.overrides_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverrides_declaration()
     * @generated
     */
    EClass OVERRIDES_DECLARATION = eINSTANCE.getoverrides_declaration();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.override_stmtImpl <em>override stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.override_stmtImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverride_stmt()
     * @generated
     */
    EClass OVERRIDE_STMT = eINSTANCE.getoverride_stmt();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OVERRIDE_STMT__DEST = eINSTANCE.getoverride_stmt_Dest();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.type_overrideImpl <em>type override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.type_overrideImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettype_override()
     * @generated
     */
    EClass TYPE_OVERRIDE = eINSTANCE.gettype_override();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_OVERRIDE__SRC = eINSTANCE.gettype_override_Src();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.instance_overrideImpl <em>instance override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.instance_overrideImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinstance_override()
     * @generated
     */
    EClass INSTANCE_OVERRIDE = eINSTANCE.getinstance_override();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OVERRIDE__SRC = eINSTANCE.getinstance_override_Src();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.data_declarationImpl <em>data declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.data_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_declaration()
     * @generated
     */
    EClass DATA_DECLARATION = eINSTANCE.getdata_declaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DECLARATION__TYPE = eINSTANCE.getdata_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DECLARATION__INSTANCES = eINSTANCE.getdata_declaration_Instances();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.data_instantiationImpl <em>data instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.data_instantiationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_instantiation()
     * @generated
     */
    EClass DATA_INSTANTIATION = eINSTANCE.getdata_instantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_INSTANTIATION__NAME = eINSTANCE.getdata_instantiation_Name();

    /**
     * The meta object literal for the '<em><b>Portmap</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_INSTANTIATION__PORTMAP = eINSTANCE.getdata_instantiation_Portmap();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_interface_portmap_listImpl <em>graph interface portmap list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_interface_portmap_listImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_interface_portmap_list()
     * @generated
     */
    EClass GRAPH_INTERFACE_PORTMAP_LIST = eINSTANCE.getgraph_interface_portmap_list();

    /**
     * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_INTERFACE_PORTMAP_LIST__MAPS = eINSTANCE.getgraph_interface_portmap_list_Maps();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_interface_portmapImpl <em>graph interface portmap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_interface_portmapImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_interface_portmap()
     * @generated
     */
    EClass GRAPH_INTERFACE_PORTMAP = eINSTANCE.getgraph_interface_portmap();

    /**
     * The meta object literal for the '<em><b>Portname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH_INTERFACE_PORTMAP__PORTNAME = eINSTANCE.getgraph_interface_portmap_Portname();

    /**
     * The meta object literal for the '<em><b>Connected name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_INTERFACE_PORTMAP__CONNECTED_NAME = eINSTANCE.getgraph_interface_portmap_Connected_name();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.data_typeImpl <em>data type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.data_typeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdata_type()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getdata_type();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.user_defined_typeImpl <em>user defined type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.user_defined_typeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getuser_defined_type()
     * @generated
     */
    EClass USER_DEFINED_TYPE = eINSTANCE.getuser_defined_type();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_DEFINED_TYPE__TYPENAME = eINSTANCE.getuser_defined_type_Typename();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.typedef_declarationImpl <em>typedef declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.typedef_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettypedef_declaration()
     * @generated
     */
    EClass TYPEDEF_DECLARATION = eINSTANCE.gettypedef_declaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_DECLARATION__TYPE = eINSTANCE.gettypedef_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Type identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF_DECLARATION__TYPE_IDENTIFIER = eINSTANCE.gettypedef_declaration_Type_identifier();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.enum_typeImpl <em>enum type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.enum_typeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getenum_type()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getenum_type();

    /**
     * The meta object literal for the '<em><b>Data type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__DATA_TYPE = eINSTANCE.getenum_type_Data_type();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_TYPE__ITEMS = eINSTANCE.getenum_type_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl <em>integer type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.integer_typeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinteger_type()
     * @generated
     */
    EClass INTEGER_TYPE = eINSTANCE.getinteger_type();

    /**
     * The meta object literal for the '<em><b>Atom type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_TYPE__ATOM_TYPE = eINSTANCE.getinteger_type_Atom_type();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_TYPE__LHS = eINSTANCE.getinteger_type_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_TYPE__RHS = eINSTANCE.getinteger_type_Rhs();

    /**
     * The meta object literal for the '<em><b>Inside</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_TYPE__INSIDE = eINSTANCE.getinteger_type_Inside();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.type_inside_clauseImpl <em>type inside clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.type_inside_clauseImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gettype_inside_clause()
     * @generated
     */
    EClass TYPE_INSIDE_CLAUSE = eINSTANCE.gettype_inside_clause();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_INSIDE_CLAUSE__DOMAIN = eINSTANCE.gettype_inside_clause_Domain();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.open_range_listImpl <em>open range list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.open_range_listImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getopen_range_list()
     * @generated
     */
    EClass OPEN_RANGE_LIST = eINSTANCE.getopen_range_list();

    /**
     * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN_RANGE_LIST__RANGES = eINSTANCE.getopen_range_list_Ranges();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.open_range_valueImpl <em>open range value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.open_range_valueImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getopen_range_value()
     * @generated
     */
    EClass OPEN_RANGE_VALUE = eINSTANCE.getopen_range_value();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN_RANGE_VALUE__LHS = eINSTANCE.getopen_range_value_Lhs();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN_RANGE_VALUE__RANGE = eINSTANCE.getopen_range_value_Range();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.range_exprImpl <em>range expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.range_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrange_expr()
     * @generated
     */
    EClass RANGE_EXPR = eINSTANCE.getrange_expr();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__LHS = eINSTANCE.getrange_expr_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__RHS = eINSTANCE.getrange_expr_Rhs();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constraint_declarationImpl <em>constraint declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constraint_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_declaration()
     * @generated
     */
    EClass CONSTRAINT_DECLARATION = eINSTANCE.getconstraint_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_DECLARATION__NAME = eINSTANCE.getconstraint_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_DECLARATION__BODY = eINSTANCE.getconstraint_declaration_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl <em>constraint body item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_body_item()
     * @generated
     */
    EClass CONSTRAINT_BODY_ITEM = eINSTANCE.getconstraint_body_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl <em>expression or dist item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression_or_dist_item()
     * @generated
     */
    EClass EXPRESSION_OR_DIST_ITEM = eINSTANCE.getexpression_or_dist_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl <em>if constraint item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getif_constraint_item()
     * @generated
     */
    EClass IF_CONSTRAINT_ITEM = eINSTANCE.getif_constraint_item();

    /**
     * The meta object literal for the '<em><b>If expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONSTRAINT_ITEM__IF_EXPR = eINSTANCE.getif_constraint_item_If_expr();

    /**
     * The meta object literal for the '<em><b>True case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONSTRAINT_ITEM__TRUE_CASE = eINSTANCE.getif_constraint_item_True_case();

    /**
     * The meta object literal for the '<em><b>False set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONSTRAINT_ITEM__FALSE_SET = eINSTANCE.getif_constraint_item_False_set();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.foreach_constraint_itemImpl <em>foreach constraint item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.foreach_constraint_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getforeach_constraint_item()
     * @generated
     */
    EClass FOREACH_CONSTRAINT_ITEM = eINSTANCE.getforeach_constraint_item();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_CONSTRAINT_ITEM__EXPR = eINSTANCE.getforeach_constraint_item_Expr();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_CONSTRAINT_ITEM__BODY = eINSTANCE.getforeach_constraint_item_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constraint_setImpl <em>constraint set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constraint_setImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_set()
     * @generated
     */
    EClass CONSTRAINT_SET = eINSTANCE.getconstraint_set();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_SET__ITEMS = eINSTANCE.getconstraint_set_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constraint_blockImpl <em>constraint block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constraint_blockImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_block()
     * @generated
     */
    EClass CONSTRAINT_BLOCK = eINSTANCE.getconstraint_block();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_or_scheme_declarationImpl <em>bin or scheme declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_or_scheme_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_or_scheme_declaration()
     * @generated
     */
    EClass BIN_OR_SCHEME_DECLARATION = eINSTANCE.getbin_or_scheme_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIN_OR_SCHEME_DECLARATION__NAME = eINSTANCE.getbin_or_scheme_declaration_Name();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bins_declarationImpl <em>bins declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bins_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbins_declaration()
     * @generated
     */
    EClass BINS_DECLARATION = eINSTANCE.getbins_declaration();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINS_DECLARATION__ITEM = eINSTANCE.getbins_declaration_Item();

    /**
     * The meta object literal for the '<em><b>Bins</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINS_DECLARATION__BINS = eINSTANCE.getbins_declaration_Bins();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_specificationImpl <em>bin specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_specificationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_specification()
     * @generated
     */
    EClass BIN_SPECIFICATION = eINSTANCE.getbin_specification();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_SPECIFICATION__ITEMS = eINSTANCE.getbin_specification_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_specifierImpl <em>bin specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_specifierImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_specifier()
     * @generated
     */
    EClass BIN_SPECIFIER = eINSTANCE.getbin_specifier();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.explicit_bin_valueImpl <em>explicit bin value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.explicit_bin_valueImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexplicit_bin_value()
     * @generated
     */
    EClass EXPLICIT_BIN_VALUE = eINSTANCE.getexplicit_bin_value();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.explicit_bin_rangeImpl <em>explicit bin range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.explicit_bin_rangeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexplicit_bin_range()
     * @generated
     */
    EClass EXPLICIT_BIN_RANGE = eINSTANCE.getexplicit_bin_range();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_BIN_RANGE__LOW = eINSTANCE.getexplicit_bin_range_Low();

    /**
     * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_BIN_RANGE__HIGH = eINSTANCE.getexplicit_bin_range_High();

    /**
     * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_BIN_RANGE__DIV = eINSTANCE.getexplicit_bin_range_Div();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_BIN_RANGE__SIZE = eINSTANCE.getexplicit_bin_range_Size();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_range_divideImpl <em>bin range divide</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_range_divideImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_range_divide()
     * @generated
     */
    EClass BIN_RANGE_DIVIDE = eINSTANCE.getbin_range_divide();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_range_sizeImpl <em>bin range size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_range_sizeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_range_size()
     * @generated
     */
    EClass BIN_RANGE_SIZE = eINSTANCE.getbin_range_size();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_scheme_declarationImpl <em>bin scheme declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_scheme_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_scheme_declaration()
     * @generated
     */
    EClass BIN_SCHEME_DECLARATION = eINSTANCE.getbin_scheme_declaration();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_SCHEME_DECLARATION__ITEMS = eINSTANCE.getbin_scheme_declaration_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.bin_scheme_specifierImpl <em>bin scheme specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.bin_scheme_specifierImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbin_scheme_specifier()
     * @generated
     */
    EClass BIN_SCHEME_SPECIFIER = eINSTANCE.getbin_scheme_specifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIN_SCHEME_SPECIFIER__NAME = eINSTANCE.getbin_scheme_specifier_Name();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_SCHEME_SPECIFIER__SPEC = eINSTANCE.getbin_scheme_specifier_Spec();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constant_expressionImpl <em>constant expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constant_expressionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstant_expression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getconstant_expression();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.expressionImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Impl constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__IMPL_CONSTRAINT = eINSTANCE.getexpression_Impl_constraint();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR = eINSTANCE.getexpression_Expr();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LHS = eINSTANCE.getexpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RHS = eINSTANCE.getexpression_Rhs();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getexpression_Left();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.interface_declarationImpl <em>interface declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.interface_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_declaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getinterface_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__NAME = eINSTANCE.getinterface_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__SUPER = eINSTANCE.getinterface_declaration_Super();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__BODY = eINSTANCE.getinterface_declaration_Body();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.interface_body_itemImpl <em>interface body item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.interface_body_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_body_item()
     * @generated
     */
    EClass INTERFACE_BODY_ITEM = eINSTANCE.getinterface_body_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.action_declarationImpl <em>action declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.action_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_declaration()
     * @generated
     */
    EClass ACTION_DECLARATION = eINSTANCE.getaction_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DECLARATION__NAME = eINSTANCE.getaction_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DECLARATION__PORTS = eINSTANCE.getaction_declaration_Ports();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.action_portlistImpl <em>action portlist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.action_portlistImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_portlist()
     * @generated
     */
    EClass ACTION_PORTLIST = eINSTANCE.getaction_portlist();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PORTLIST__PORTS = eINSTANCE.getaction_portlist_Ports();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.action_portImpl <em>action port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.action_portImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getaction_port()
     * @generated
     */
    EClass ACTION_PORT = eINSTANCE.getaction_port();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PORT__TYPE = eINSTANCE.getaction_port_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_PORT__NAME = eINSTANCE.getaction_port_Name();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl <em>graph data declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_data_declaration()
     * @generated
     */
    EClass GRAPH_DATA_DECLARATION = eINSTANCE.getgraph_data_declaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DATA_DECLARATION__TYPE = eINSTANCE.getgraph_data_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH_DATA_DECLARATION__NAMES = eINSTANCE.getgraph_data_declaration_Names();

    /**
     * The meta object literal for the '<em><b>Portmaps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DATA_DECLARATION__PORTMAPS = eINSTANCE.getgraph_data_declaration_Portmaps();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl <em>symbol declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.symbol_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_declaration()
     * @generated
     */
    EClass SYMBOL_DECLARATION = eINSTANCE.getsymbol_declaration();

    /**
     * The meta object literal for the '<em><b>Decl list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DECLARATION__DECL_LIST = eINSTANCE.getsymbol_declaration_Decl_list();

    /**
     * The meta object literal for the '<em><b>Inline rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DECLARATION__INLINE_RULE = eINSTANCE.getsymbol_declaration_Inline_rule();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.symbol_decl_itemImpl <em>symbol decl item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.symbol_decl_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_decl_item()
     * @generated
     */
    EClass SYMBOL_DECL_ITEM = eINSTANCE.getsymbol_decl_item();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_DECL_ITEM__NAME = eINSTANCE.getsymbol_decl_item_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DECL_ITEM__PARAMETERS = eINSTANCE.getsymbol_decl_item_Parameters();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.port_mapImpl <em>port map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.port_mapImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getport_map()
     * @generated
     */
    EClass PORT_MAP = eINSTANCE.getport_map();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT_MAP__PORT = eINSTANCE.getport_map_Port();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_MAP__MAP = eINSTANCE.getport_map_Map();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constantImpl <em>constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constantImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getconstant();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.hierarchical_idImpl <em>hierarchical id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.hierarchical_idImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gethierarchical_id()
     * @generated
     */
    EClass HIERARCHICAL_ID = eINSTANCE.gethierarchical_id();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HIERARCHICAL_ID__VALUE = eINSTANCE.gethierarchical_id_Value();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.interface_action_idImpl <em>interface action id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.interface_action_idImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinterface_action_id()
     * @generated
     */
    EClass INTERFACE_ACTION_ID = eINSTANCE.getinterface_action_id();

    /**
     * The meta object literal for the '<em><b>Ifc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_ACTION_ID__IFC = eINSTANCE.getinterface_action_id_Ifc();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_ACTION_ID__ACTION = eINSTANCE.getinterface_action_id_Action();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.literalImpl <em>literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.literalImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getliteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getliteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getliteral_Value();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.decimal_numberImpl <em>decimal number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.decimal_numberImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdecimal_number()
     * @generated
     */
    EClass DECIMAL_NUMBER = eINSTANCE.getdecimal_number();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_NUMBER__VALUE = eINSTANCE.getdecimal_number_Value();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.sizeImpl <em>size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.sizeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getsize();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.alt_stmtImpl <em>alt stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.alt_stmtImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getalt_stmt()
     * @generated
     */
    EClass ALT_STMT = eINSTANCE.getalt_stmt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALT_STMT__LEFT = eINSTANCE.getalt_stmt_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALT_STMT__RIGHT = eINSTANCE.getalt_stmt_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.stmt_altImpl <em>stmt alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.stmt_altImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_alt()
     * @generated
     */
    EClass STMT_ALT = eINSTANCE.getstmt_alt();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.overides_declarationImpl <em>overides declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.overides_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverides_declaration()
     * @generated
     */
    EClass OVERIDES_DECLARATION = eINSTANCE.getoverides_declaration();

    /**
     * The meta object literal for the '<em><b>Overrides</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERIDES_DECLARATION__OVERRIDES = eINSTANCE.getoverides_declaration_Overrides();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.condition_exprImpl <em>condition expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.condition_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getcondition_expr()
     * @generated
     */
    EClass CONDITION_EXPR = eINSTANCE.getcondition_expr();

    /**
     * The meta object literal for the '<em><b>True expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_EXPR__TRUE_EXPR = eINSTANCE.getcondition_expr_True_expr();

    /**
     * The meta object literal for the '<em><b>False expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_EXPR__FALSE_EXPR = eINSTANCE.getcondition_expr_False_expr();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.logical_or_exprImpl <em>logical or expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.logical_or_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_or_expr()
     * @generated
     */
    EClass LOGICAL_OR_EXPR = eINSTANCE.getlogical_or_expr();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPR__RIGHT = eINSTANCE.getlogical_or_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.logical_and_exprImpl <em>logical and expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.logical_and_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_and_expr()
     * @generated
     */
    EClass LOGICAL_AND_EXPR = eINSTANCE.getlogical_and_expr();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPR__RIGHT = eINSTANCE.getlogical_and_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_xor_exprImpl <em>binary xor expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_xor_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_xor_expr()
     * @generated
     */
    EClass BINARY_XOR_EXPR = eINSTANCE.getbinary_xor_expr();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_XOR_EXPR__RIGHT = eINSTANCE.getbinary_xor_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_and_exprImpl <em>binary and expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_and_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_and_expr()
     * @generated
     */
    EClass BINARY_AND_EXPR = eINSTANCE.getbinary_and_expr();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_AND_EXPR__RIGHT = eINSTANCE.getbinary_and_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.logical_equality_exprImpl <em>logical equality expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.logical_equality_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_equality_expr()
     * @generated
     */
    EClass LOGICAL_EQUALITY_EXPR = eINSTANCE.getlogical_equality_expr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_EQUALITY_EXPR__OP = eINSTANCE.getlogical_equality_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_EQUALITY_EXPR__RIGHT = eINSTANCE.getlogical_equality_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.logical_inequality_exprImpl <em>logical inequality expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.logical_inequality_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getlogical_inequality_expr()
     * @generated
     */
    EClass LOGICAL_INEQUALITY_EXPR = eINSTANCE.getlogical_inequality_expr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_INEQUALITY_EXPR__OP = eINSTANCE.getlogical_inequality_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_INEQUALITY_EXPR__RIGHT = eINSTANCE.getlogical_inequality_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_shift_exprImpl <em>binary shift expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_shift_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_shift_expr()
     * @generated
     */
    EClass BINARY_SHIFT_EXPR = eINSTANCE.getbinary_shift_expr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_SHIFT_EXPR__OP = eINSTANCE.getbinary_shift_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_SHIFT_EXPR__RIGHT = eINSTANCE.getbinary_shift_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_add_sub_exprImpl <em>binary add sub expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_add_sub_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_add_sub_expr()
     * @generated
     */
    EClass BINARY_ADD_SUB_EXPR = eINSTANCE.getbinary_add_sub_expr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_ADD_SUB_EXPR__OP = eINSTANCE.getbinary_add_sub_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_ADD_SUB_EXPR__RIGHT = eINSTANCE.getbinary_add_sub_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_mul_div_mod_exprImpl <em>binary mul div mod expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_mul_div_mod_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_mul_div_mod_expr()
     * @generated
     */
    EClass BINARY_MUL_DIV_MOD_EXPR = eINSTANCE.getbinary_mul_div_mod_expr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_MUL_DIV_MOD_EXPR__OP = eINSTANCE.getbinary_mul_div_mod_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_MUL_DIV_MOD_EXPR__RIGHT = eINSTANCE.getbinary_mul_div_mod_expr_Right();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.binary_exp_exprImpl <em>binary exp expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.binary_exp_exprImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getbinary_exp_expr()
     * @generated
     */
    EClass BINARY_EXP_EXPR = eINSTANCE.getbinary_exp_expr();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXP_EXPR__RIGHT = eINSTANCE.getbinary_exp_expr_Right();

  }

} //PSSPackage
