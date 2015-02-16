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
   * The feature id for the '<em><b>Top Level</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TOP_LEVEL = 0;

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
  int STRUCT_BODY_ITEM = 8;

  /**
   * The number of structural features of the '<em>struct body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.struct_graph_body_itemImpl <em>struct graph body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.struct_graph_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_graph_body_item()
   * @generated
   */
  int STRUCT_GRAPH_BODY_ITEM = 7;

  /**
   * The number of structural features of the '<em>struct graph body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_GRAPH_BODY_ITEM_FEATURE_COUNT = STRUCT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_body_itemImpl <em>graph body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_body_item()
   * @generated
   */
  int GRAPH_BODY_ITEM = 9;

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
  int SYMBOL_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION__NAME = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION__RULE = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>symbol definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DEFINITION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

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
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.stmt_or_blockImpl <em>stmt or block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.stmt_or_blockImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_or_block()
   * @generated
   */
  int STMT_OR_BLOCK = 12;

  /**
   * The number of structural features of the '<em>stmt or block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_OR_BLOCK_FEATURE_COUNT = RULE_PRODUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.alt_stmtImpl <em>alt stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.alt_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getalt_stmt()
   * @generated
   */
  int ALT_STMT = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT__LEFT = STMT_OR_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT__RIGHT = STMT_OR_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>alt stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_STMT_FEATURE_COUNT = STMT_OR_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.stmt_primaryImpl <em>stmt primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.stmt_primaryImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_primary()
   * @generated
   */
  int STMT_PRIMARY = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PRIMARY__LEFT = ALT_STMT__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PRIMARY__RIGHT = ALT_STMT__RIGHT;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PRIMARY__STMT_LIST = ALT_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>stmt primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PRIMARY_FEATURE_COUNT = ALT_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.stmt_altImpl <em>stmt alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.stmt_altImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_alt()
   * @generated
   */
  int STMT_ALT = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__LEFT = STMT_PRIMARY__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__RIGHT = STMT_PRIMARY__RIGHT;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT__STMT_LIST = STMT_PRIMARY__STMT_LIST;

  /**
   * The number of structural features of the '<em>stmt alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_ALT_FEATURE_COUNT = STMT_PRIMARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.stmt_parallelImpl <em>stmt parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.stmt_parallelImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_parallel()
   * @generated
   */
  int STMT_PARALLEL = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PARALLEL__LEFT = STMT_ALT__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PARALLEL__RIGHT = STMT_ALT__RIGHT;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PARALLEL__STMT_LIST = STMT_ALT__STMT_LIST;

  /**
   * The number of structural features of the '<em>stmt parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_PARALLEL_FEATURE_COUNT = STMT_ALT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.seqImpl <em>seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.seqImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getseq()
   * @generated
   */
  int SEQ = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ__LEFT = STMT_PARALLEL__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ__RIGHT = STMT_PARALLEL__RIGHT;

  /**
   * The feature id for the '<em><b>Stmt list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ__STMT_LIST = STMT_PARALLEL__STMT_LIST;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ__ITEMS = STMT_PARALLEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_FEATURE_COUNT = STMT_PARALLEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.seq_itemImpl <em>seq item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.seq_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getseq_item()
   * @generated
   */
  int SEQ_ITEM = 18;

  /**
   * The number of structural features of the '<em>seq item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.ifc_call_parameter_listImpl <em>ifc call parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.ifc_call_parameter_listImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getifc_call_parameter_list()
   * @generated
   */
  int IFC_CALL_PARAMETER_LIST = 19;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFC_CALL_PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>ifc call parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFC_CALL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.repeat_stmtImpl <em>repeat stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.repeat_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrepeat_stmt()
   * @generated
   */
  int REPEAT_STMT = 20;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__STMT = STMT_OR_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>repeat stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT_FEATURE_COUNT = STMT_OR_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.overrides_declarationImpl <em>overrides declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.overrides_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverrides_declaration()
   * @generated
   */
  int OVERRIDES_DECLARATION = 21;

  /**
   * The number of structural features of the '<em>overrides declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDES_DECLARATION_FEATURE_COUNT = STRUCT_GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.override_stmtImpl <em>override stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.override_stmtImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverride_stmt()
   * @generated
   */
  int OVERRIDE_STMT = 22;

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
  int TYPE_OVERRIDE = 23;

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
  int INSTANCE_OVERRIDE = 24;

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
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_declarationImpl <em>constraint declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_declaration()
   * @generated
   */
  int CONSTRAINT_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION__NAME = STRUCT_GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION__BODY = STRUCT_GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>constraint declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_DECLARATION_FEATURE_COUNT = STRUCT_GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl <em>constraint body item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_body_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_body_item()
   * @generated
   */
  int CONSTRAINT_BODY_ITEM = 27;

  /**
   * The number of structural features of the '<em>constraint body item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BODY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_body_no_if_itemImpl <em>constraint body no if item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_body_no_if_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_body_no_if_item()
   * @generated
   */
  int CONSTRAINT_BODY_NO_IF_ITEM = 26;

  /**
   * The number of structural features of the '<em>constraint body no if item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BODY_NO_IF_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl <em>expression or dist item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.expression_or_dist_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression_or_dist_item()
   * @generated
   */
  int EXPRESSION_OR_DIST_ITEM = 28;

  /**
   * The number of structural features of the '<em>expression or dist item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_DIST_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_NO_IF_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl <em>if constraint item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.if_constraint_itemImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getif_constraint_item()
   * @generated
   */
  int IF_CONSTRAINT_ITEM = 29;

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
  int FOREACH_CONSTRAINT_ITEM = 30;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM__EXPR = CONSTRAINT_BODY_NO_IF_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM__BODY = CONSTRAINT_BODY_NO_IF_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>foreach constraint item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_CONSTRAINT_ITEM_FEATURE_COUNT = CONSTRAINT_BODY_NO_IF_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.constraint_setImpl <em>constraint set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.constraint_setImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_set()
   * @generated
   */
  int CONSTRAINT_SET = 31;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_SET__ITEMS = 0;

  /**
   * The number of structural features of the '<em>constraint set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.expressionImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 32;

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
  int INTERFACE_DECLARATION = 33;

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
  int INTERFACE_BODY_ITEM = 34;

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
  int ACTION_DECLARATION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__NAME = INTERFACE_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
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
  int ACTION_PORTLIST = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORTLIST__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORTLIST__NAME = 1;

  /**
   * The number of structural features of the '<em>action portlist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PORTLIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl <em>graph data declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_data_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_data_declaration()
   * @generated
   */
  int GRAPH_DATA_DECLARATION = 37;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__TYPE = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__NAMES = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Portmaps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION__PORTMAPS = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>graph data declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATA_DECLARATION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.symbol_declarationImpl <em>symbol declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.symbol_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getsymbol_declaration()
   * @generated
   */
  int SYMBOL_DECLARATION = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION__NAME = GRAPH_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION__INLINE_RULE = GRAPH_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION__NAMES = GRAPH_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>symbol declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_DECLARATION_FEATURE_COUNT = GRAPH_BODY_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.port_mapImpl <em>port map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.port_mapImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getport_map()
   * @generated
   */
  int PORT_MAP = 39;

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
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.struct_data_declarationImpl <em>struct data declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.struct_data_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_data_declaration()
   * @generated
   */
  int STRUCT_DATA_DECLARATION = 40;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DATA_DECLARATION__TYPE = STRUCT_BODY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DATA_DECLARATION__NAMES = STRUCT_BODY_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>struct data declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DATA_DECLARATION_FEATURE_COUNT = STRUCT_BODY_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.graph_datatypeImpl <em>graph datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.graph_datatypeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_datatype()
   * @generated
   */
  int GRAPH_DATATYPE = 41;

  /**
   * The feature id for the '<em><b>Graph typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATATYPE__GRAPH_TYPENAME = 0;

  /**
   * The number of structural features of the '<em>graph datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_DATATYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.struct_datatypeImpl <em>struct datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.struct_datatypeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_datatype()
   * @generated
   */
  int STRUCT_DATATYPE = 42;

  /**
   * The feature id for the '<em><b>Struct typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DATATYPE__STRUCT_TYPENAME = 0;

  /**
   * The number of structural features of the '<em>struct datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DATATYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl <em>primitive datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getprimitive_datatype()
   * @generated
   */
  int PRIMITIVE_DATATYPE = 43;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATATYPE__TYPE = ACTION_PORTLIST__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATATYPE__NAME = ACTION_PORTLIST__NAME;

  /**
   * The feature id for the '<em><b>Graph typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATATYPE__GRAPH_TYPENAME = ACTION_PORTLIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Struct typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATATYPE__STRUCT_TYPENAME = ACTION_PORTLIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>primitive datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATATYPE_FEATURE_COUNT = ACTION_PORTLIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.integer_typeImpl <em>integer type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.integer_typeImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getinteger_type()
   * @generated
   */
  int INTEGER_TYPE = 44;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__TYPE = PRIMITIVE_DATATYPE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__NAME = PRIMITIVE_DATATYPE__NAME;

  /**
   * The feature id for the '<em><b>Graph typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__GRAPH_TYPENAME = PRIMITIVE_DATATYPE__GRAPH_TYPENAME;

  /**
   * The feature id for the '<em><b>Struct typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__STRUCT_TYPENAME = PRIMITIVE_DATATYPE__STRUCT_TYPENAME;

  /**
   * The feature id for the '<em><b>Range lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__RANGE_LHS = PRIMITIVE_DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range rhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__RANGE_RHS = PRIMITIVE_DATATYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>integer type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_FEATURE_COUNT = PRIMITIVE_DATATYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.hierarchical_idImpl <em>hierarchical id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.hierarchical_idImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#gethierarchical_id()
   * @generated
   */
  int HIERARCHICAL_ID = 45;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_ID__PARAMETERS = SEQ_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_ID__VALUE = SEQ_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>hierarchical id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_ID_FEATURE_COUNT = SEQ_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.literalImpl <em>literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.literalImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getliteral()
   * @generated
   */
  int LITERAL = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.decimal_numberImpl <em>decimal number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.decimal_numberImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getdecimal_number()
   * @generated
   */
  int DECIMAL_NUMBER = 47;

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
  int SIZE = 48;

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
   * The meta object id for the '{@link net.sf.psstools.lang.pSS.impl.overides_declarationImpl <em>overides declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.psstools.lang.pSS.impl.overides_declarationImpl
   * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getoverides_declaration()
   * @generated
   */
  int OVERIDES_DECLARATION = 49;

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
  int CONDITION_EXPR = 50;

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
  int LOGICAL_OR_EXPR = 51;

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
  int LOGICAL_AND_EXPR = 52;

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
  int BINARY_XOR_EXPR = 53;

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
  int BINARY_AND_EXPR = 54;

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
  int LOGICAL_EQUALITY_EXPR = 55;

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
  int LOGICAL_INEQUALITY_EXPR = 56;

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
  int BINARY_SHIFT_EXPR = 57;

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
  int BINARY_ADD_SUB_EXPR = 58;

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
  int BINARY_MUL_DIV_MOD_EXPR = 59;

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
  int BINARY_EXP_EXPR = 60;

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
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.Model#getTopLevel <em>Top Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Top Level</em>'.
   * @see net.sf.psstools.lang.pSS.Model#getTopLevel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_TopLevel();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.struct_graph_body_item <em>struct graph body item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct graph body item</em>'.
   * @see net.sf.psstools.lang.pSS.struct_graph_body_item
   * @generated
   */
  EClass getstruct_graph_body_item();

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
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.symbol_definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_definition#getName()
   * @see #getsymbol_definition()
   * @generated
   */
  EAttribute getsymbol_definition_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.symbol_definition#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_definition#getRule()
   * @see #getsymbol_definition()
   * @generated
   */
  EReference getsymbol_definition_Rule();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.stmt_or_block <em>stmt or block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stmt or block</em>'.
   * @see net.sf.psstools.lang.pSS.stmt_or_block
   * @generated
   */
  EClass getstmt_or_block();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.stmt_primary <em>stmt primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stmt primary</em>'.
   * @see net.sf.psstools.lang.pSS.stmt_primary
   * @generated
   */
  EClass getstmt_primary();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.stmt_primary#getStmt_list <em>Stmt list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt list</em>'.
   * @see net.sf.psstools.lang.pSS.stmt_primary#getStmt_list()
   * @see #getstmt_primary()
   * @generated
   */
  EReference getstmt_primary_Stmt_list();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.stmt_parallel <em>stmt parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stmt parallel</em>'.
   * @see net.sf.psstools.lang.pSS.stmt_parallel
   * @generated
   */
  EClass getstmt_parallel();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.seq <em>seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>seq</em>'.
   * @see net.sf.psstools.lang.pSS.seq
   * @generated
   */
  EClass getseq();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.seq#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.sf.psstools.lang.pSS.seq#getItems()
   * @see #getseq()
   * @generated
   */
  EReference getseq_Items();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.seq_item <em>seq item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>seq item</em>'.
   * @see net.sf.psstools.lang.pSS.seq_item
   * @generated
   */
  EClass getseq_item();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.ifc_call_parameter_list <em>ifc call parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ifc call parameter list</em>'.
   * @see net.sf.psstools.lang.pSS.ifc_call_parameter_list
   * @generated
   */
  EClass getifc_call_parameter_list();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.ifc_call_parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.sf.psstools.lang.pSS.ifc_call_parameter_list#getParameters()
   * @see #getifc_call_parameter_list()
   * @generated
   */
  EReference getifc_call_parameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.repeat_stmt <em>repeat stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>repeat stmt</em>'.
   * @see net.sf.psstools.lang.pSS.repeat_stmt
   * @generated
   */
  EClass getrepeat_stmt();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.repeat_stmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see net.sf.psstools.lang.pSS.repeat_stmt#getStmt()
   * @see #getrepeat_stmt()
   * @generated
   */
  EReference getrepeat_stmt_Stmt();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.constraint_body_no_if_item <em>constraint body no if item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constraint body no if item</em>'.
   * @see net.sf.psstools.lang.pSS.constraint_body_no_if_item
   * @generated
   */
  EClass getconstraint_body_no_if_item();

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
   * Returns the meta object for the containment reference list '{@link net.sf.psstools.lang.pSS.action_declaration#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
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
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.action_portlist#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.action_portlist#getType()
   * @see #getaction_portlist()
   * @generated
   */
  EReference getaction_portlist_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.action_portlist#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.action_portlist#getName()
   * @see #getaction_portlist()
   * @generated
   */
  EAttribute getaction_portlist_Name();

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
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.graph_data_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
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
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.symbol_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_declaration#getName()
   * @see #getsymbol_declaration()
   * @generated
   */
  EAttribute getsymbol_declaration_Name();

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
   * Returns the meta object for the attribute list '{@link net.sf.psstools.lang.pSS.symbol_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see net.sf.psstools.lang.pSS.symbol_declaration#getNames()
   * @see #getsymbol_declaration()
   * @generated
   */
  EAttribute getsymbol_declaration_Names();

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
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.struct_data_declaration <em>struct data declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct data declaration</em>'.
   * @see net.sf.psstools.lang.pSS.struct_data_declaration
   * @generated
   */
  EClass getstruct_data_declaration();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.struct_data_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.psstools.lang.pSS.struct_data_declaration#getType()
   * @see #getstruct_data_declaration()
   * @generated
   */
  EReference getstruct_data_declaration_Type();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.psstools.lang.pSS.struct_data_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see net.sf.psstools.lang.pSS.struct_data_declaration#getNames()
   * @see #getstruct_data_declaration()
   * @generated
   */
  EAttribute getstruct_data_declaration_Names();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.graph_datatype <em>graph datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph datatype</em>'.
   * @see net.sf.psstools.lang.pSS.graph_datatype
   * @generated
   */
  EClass getgraph_datatype();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.graph_datatype#getGraph_typename <em>Graph typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Graph typename</em>'.
   * @see net.sf.psstools.lang.pSS.graph_datatype#getGraph_typename()
   * @see #getgraph_datatype()
   * @generated
   */
  EReference getgraph_datatype_Graph_typename();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.struct_datatype <em>struct datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct datatype</em>'.
   * @see net.sf.psstools.lang.pSS.struct_datatype
   * @generated
   */
  EClass getstruct_datatype();

  /**
   * Returns the meta object for the reference '{@link net.sf.psstools.lang.pSS.struct_datatype#getStruct_typename <em>Struct typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Struct typename</em>'.
   * @see net.sf.psstools.lang.pSS.struct_datatype#getStruct_typename()
   * @see #getstruct_datatype()
   * @generated
   */
  EReference getstruct_datatype_Struct_typename();

  /**
   * Returns the meta object for class '{@link net.sf.psstools.lang.pSS.primitive_datatype <em>primitive datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>primitive datatype</em>'.
   * @see net.sf.psstools.lang.pSS.primitive_datatype
   * @generated
   */
  EClass getprimitive_datatype();

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
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.integer_type#getRange_lhs <em>Range lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range lhs</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getRange_lhs()
   * @see #getinteger_type()
   * @generated
   */
  EAttribute getinteger_type_Range_lhs();

  /**
   * Returns the meta object for the attribute '{@link net.sf.psstools.lang.pSS.integer_type#getRange_rhs <em>Range rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range rhs</em>'.
   * @see net.sf.psstools.lang.pSS.integer_type#getRange_rhs()
   * @see #getinteger_type()
   * @generated
   */
  EAttribute getinteger_type_Range_rhs();

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
   * Returns the meta object for the containment reference '{@link net.sf.psstools.lang.pSS.hierarchical_id#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see net.sf.psstools.lang.pSS.hierarchical_id#getParameters()
   * @see #gethierarchical_id()
   * @generated
   */
  EReference gethierarchical_id_Parameters();

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
     * The meta object literal for the '<em><b>Top Level</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TOP_LEVEL = eINSTANCE.getModel_TopLevel();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.struct_graph_body_itemImpl <em>struct graph body item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.struct_graph_body_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_graph_body_item()
     * @generated
     */
    EClass STRUCT_GRAPH_BODY_ITEM = eINSTANCE.getstruct_graph_body_item();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_DEFINITION__NAME = eINSTANCE.getsymbol_definition_Name();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DEFINITION__RULE = eINSTANCE.getsymbol_definition_Rule();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.stmt_or_blockImpl <em>stmt or block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.stmt_or_blockImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_or_block()
     * @generated
     */
    EClass STMT_OR_BLOCK = eINSTANCE.getstmt_or_block();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.stmt_primaryImpl <em>stmt primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.stmt_primaryImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_primary()
     * @generated
     */
    EClass STMT_PRIMARY = eINSTANCE.getstmt_primary();

    /**
     * The meta object literal for the '<em><b>Stmt list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT_PRIMARY__STMT_LIST = eINSTANCE.getstmt_primary_Stmt_list();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.stmt_parallelImpl <em>stmt parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.stmt_parallelImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstmt_parallel()
     * @generated
     */
    EClass STMT_PARALLEL = eINSTANCE.getstmt_parallel();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.seqImpl <em>seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.seqImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getseq()
     * @generated
     */
    EClass SEQ = eINSTANCE.getseq();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ__ITEMS = eINSTANCE.getseq_Items();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.seq_itemImpl <em>seq item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.seq_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getseq_item()
     * @generated
     */
    EClass SEQ_ITEM = eINSTANCE.getseq_item();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.ifc_call_parameter_listImpl <em>ifc call parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.ifc_call_parameter_listImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getifc_call_parameter_list()
     * @generated
     */
    EClass IFC_CALL_PARAMETER_LIST = eINSTANCE.getifc_call_parameter_list();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFC_CALL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getifc_call_parameter_list_Parameters();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.repeat_stmtImpl <em>repeat stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.repeat_stmtImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getrepeat_stmt()
     * @generated
     */
    EClass REPEAT_STMT = eINSTANCE.getrepeat_stmt();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STMT__STMT = eINSTANCE.getrepeat_stmt_Stmt();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.constraint_body_no_if_itemImpl <em>constraint body no if item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.constraint_body_no_if_itemImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getconstraint_body_no_if_item()
     * @generated
     */
    EClass CONSTRAINT_BODY_NO_IF_ITEM = eINSTANCE.getconstraint_body_no_if_item();

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
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PORTLIST__TYPE = eINSTANCE.getaction_portlist_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_PORTLIST__NAME = eINSTANCE.getaction_portlist_Name();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_DECLARATION__NAME = eINSTANCE.getsymbol_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Inline rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_DECLARATION__INLINE_RULE = eINSTANCE.getsymbol_declaration_Inline_rule();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_DECLARATION__NAMES = eINSTANCE.getsymbol_declaration_Names();

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
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.struct_data_declarationImpl <em>struct data declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.struct_data_declarationImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_data_declaration()
     * @generated
     */
    EClass STRUCT_DATA_DECLARATION = eINSTANCE.getstruct_data_declaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DATA_DECLARATION__TYPE = eINSTANCE.getstruct_data_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_DATA_DECLARATION__NAMES = eINSTANCE.getstruct_data_declaration_Names();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.graph_datatypeImpl <em>graph datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.graph_datatypeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getgraph_datatype()
     * @generated
     */
    EClass GRAPH_DATATYPE = eINSTANCE.getgraph_datatype();

    /**
     * The meta object literal for the '<em><b>Graph typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_DATATYPE__GRAPH_TYPENAME = eINSTANCE.getgraph_datatype_Graph_typename();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.struct_datatypeImpl <em>struct datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.struct_datatypeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getstruct_datatype()
     * @generated
     */
    EClass STRUCT_DATATYPE = eINSTANCE.getstruct_datatype();

    /**
     * The meta object literal for the '<em><b>Struct typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DATATYPE__STRUCT_TYPENAME = eINSTANCE.getstruct_datatype_Struct_typename();

    /**
     * The meta object literal for the '{@link net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl <em>primitive datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.psstools.lang.pSS.impl.primitive_datatypeImpl
     * @see net.sf.psstools.lang.pSS.impl.PSSPackageImpl#getprimitive_datatype()
     * @generated
     */
    EClass PRIMITIVE_DATATYPE = eINSTANCE.getprimitive_datatype();

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
     * The meta object literal for the '<em><b>Range lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_TYPE__RANGE_LHS = eINSTANCE.getinteger_type_Range_lhs();

    /**
     * The meta object literal for the '<em><b>Range rhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_TYPE__RANGE_RHS = eINSTANCE.getinteger_type_Range_rhs();

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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIERARCHICAL_ID__PARAMETERS = eINSTANCE.gethierarchical_id_Parameters();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HIERARCHICAL_ID__VALUE = eINSTANCE.gethierarchical_id_Value();

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
