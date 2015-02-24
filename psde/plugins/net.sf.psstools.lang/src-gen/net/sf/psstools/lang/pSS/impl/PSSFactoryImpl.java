/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSSFactoryImpl extends EFactoryImpl implements PSSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PSSFactory init()
  {
    try
    {
      PSSFactory thePSSFactory = (PSSFactory)EPackage.Registry.INSTANCE.getEFactory(PSSPackage.eNS_URI);
      if (thePSSFactory != null)
      {
        return thePSSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PSSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSSFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PSSPackage.MODEL: return createModel();
      case PSSPackage.PORTABLE_STIMULUS_DESCRIPTION: return createportable_stimulus_description();
      case PSSPackage.GRAPH_OR_STRUCT_DECLARATION: return creategraph_or_struct_declaration();
      case PSSPackage.GRAPH_STRUCT_IFC_DECLARATION: return creategraph_struct_ifc_declaration();
      case PSSPackage.GRAPH_DECLARATION: return creategraph_declaration();
      case PSSPackage.PORT_DECLARATION: return createport_declaration();
      case PSSPackage.STRUCT_DECLARATION: return createstruct_declaration();
      case PSSPackage.STRUCT_BODY_ITEM: return createstruct_body_item();
      case PSSPackage.GRAPH_BODY_ITEM: return creategraph_body_item();
      case PSSPackage.SYMBOL_DEFINITION: return createsymbol_definition();
      case PSSPackage.INTERFACE_ACTION_DEFINITION: return createinterface_action_definition();
      case PSSPackage.RULE_PRODUCTION: return createrule_production();
      case PSSPackage.RULE_STMT_OR_BLOCK: return createrule_stmt_or_block();
      case PSSPackage.RULE_STMT_ALT_PARALLEL_SEQ: return createrule_stmt_alt_parallel_seq();
      case PSSPackage.RULE_STMT_PRIMARY: return createrule_stmt_primary();
      case PSSPackage.RULE_STMT_PARALLEL_ALT: return createrule_stmt_parallel_alt();
      case PSSPackage.RULE_STMT_PARALLEL: return createrule_stmt_parallel();
      case PSSPackage.RULE_SEQUENCE: return createrule_sequence();
      case PSSPackage.RULE_SEQ_ITEM: return createrule_seq_item();
      case PSSPackage.RULE_WITH_CLAUSE: return createrule_with_clause();
      case PSSPackage.PARAMETER_LIST: return createparameter_list();
      case PSSPackage.RULE_REPEAT_STMT: return createrule_repeat_stmt();
      case PSSPackage.OVERRIDES_DECLARATION: return createoverrides_declaration();
      case PSSPackage.OVERRIDE_STMT: return createoverride_stmt();
      case PSSPackage.TYPE_OVERRIDE: return createtype_override();
      case PSSPackage.INSTANCE_OVERRIDE: return createinstance_override();
      case PSSPackage.DATA_DECLARATION: return createdata_declaration();
      case PSSPackage.DATA_INSTANTIATION: return createdata_instantiation();
      case PSSPackage.GRAPH_INTERFACE_PORTMAP_LIST: return creategraph_interface_portmap_list();
      case PSSPackage.GRAPH_INTERFACE_PORTMAP: return creategraph_interface_portmap();
      case PSSPackage.DATA_TYPE: return createdata_type();
      case PSSPackage.USER_DEFINED_TYPE: return createuser_defined_type();
      case PSSPackage.TYPEDEF_DECLARATION: return createtypedef_declaration();
      case PSSPackage.ENUM_TYPE: return createenum_type();
      case PSSPackage.INTEGER_TYPE: return createinteger_type();
      case PSSPackage.TYPE_INSIDE_CLAUSE: return createtype_inside_clause();
      case PSSPackage.OPEN_RANGE_LIST: return createopen_range_list();
      case PSSPackage.OPEN_RANGE_VALUE: return createopen_range_value();
      case PSSPackage.RANGE_EXPR: return createrange_expr();
      case PSSPackage.CONSTRAINT_DECLARATION: return createconstraint_declaration();
      case PSSPackage.CONSTRAINT_BODY_ITEM: return createconstraint_body_item();
      case PSSPackage.EXPRESSION_OR_DIST_ITEM: return createexpression_or_dist_item();
      case PSSPackage.IF_CONSTRAINT_ITEM: return createif_constraint_item();
      case PSSPackage.FOREACH_CONSTRAINT_ITEM: return createforeach_constraint_item();
      case PSSPackage.CONSTRAINT_SET: return createconstraint_set();
      case PSSPackage.CONSTRAINT_BLOCK: return createconstraint_block();
      case PSSPackage.BIN_OR_SCHEME_DECLARATION: return createbin_or_scheme_declaration();
      case PSSPackage.BINS_DECLARATION: return createbins_declaration();
      case PSSPackage.BIN_SPECIFICATION: return createbin_specification();
      case PSSPackage.BIN_SPECIFIER: return createbin_specifier();
      case PSSPackage.EXPLICIT_BIN_VALUE: return createexplicit_bin_value();
      case PSSPackage.EXPLICIT_BIN_RANGE: return createexplicit_bin_range();
      case PSSPackage.BIN_RANGE_DIVIDE: return createbin_range_divide();
      case PSSPackage.BIN_RANGE_SIZE: return createbin_range_size();
      case PSSPackage.BIN_SCHEME_DECLARATION: return createbin_scheme_declaration();
      case PSSPackage.BIN_SCHEME_SPECIFIER: return createbin_scheme_specifier();
      case PSSPackage.CONSTANT_EXPRESSION: return createconstant_expression();
      case PSSPackage.EXPRESSION: return createexpression();
      case PSSPackage.INTERFACE_DECLARATION: return createinterface_declaration();
      case PSSPackage.INTERFACE_BODY_ITEM: return createinterface_body_item();
      case PSSPackage.ACTION_DECLARATION: return createaction_declaration();
      case PSSPackage.ACTION_PORTLIST: return createaction_portlist();
      case PSSPackage.ACTION_PORT: return createaction_port();
      case PSSPackage.GRAPH_DATA_DECLARATION: return creategraph_data_declaration();
      case PSSPackage.SYMBOL_DECLARATION: return createsymbol_declaration();
      case PSSPackage.SYMBOL_DECL_ITEM: return createsymbol_decl_item();
      case PSSPackage.PORT_MAP: return createport_map();
      case PSSPackage.CONSTANT: return createconstant();
      case PSSPackage.HIERARCHICAL_ID: return createhierarchical_id();
      case PSSPackage.INTERFACE_ACTION_ID: return createinterface_action_id();
      case PSSPackage.LITERAL: return createliteral();
      case PSSPackage.DECIMAL_NUMBER: return createdecimal_number();
      case PSSPackage.SIZE: return createsize();
      case PSSPackage.ALT_STMT: return createalt_stmt();
      case PSSPackage.STMT_ALT: return createstmt_alt();
      case PSSPackage.OVERIDES_DECLARATION: return createoverides_declaration();
      case PSSPackage.CONDITION_EXPR: return createcondition_expr();
      case PSSPackage.LOGICAL_OR_EXPR: return createlogical_or_expr();
      case PSSPackage.LOGICAL_AND_EXPR: return createlogical_and_expr();
      case PSSPackage.BINARY_XOR_EXPR: return createbinary_xor_expr();
      case PSSPackage.BINARY_AND_EXPR: return createbinary_and_expr();
      case PSSPackage.LOGICAL_EQUALITY_EXPR: return createlogical_equality_expr();
      case PSSPackage.LOGICAL_INEQUALITY_EXPR: return createlogical_inequality_expr();
      case PSSPackage.BINARY_SHIFT_EXPR: return createbinary_shift_expr();
      case PSSPackage.BINARY_ADD_SUB_EXPR: return createbinary_add_sub_expr();
      case PSSPackage.BINARY_MUL_DIV_MOD_EXPR: return createbinary_mul_div_mod_expr();
      case PSSPackage.BINARY_EXP_EXPR: return createbinary_exp_expr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public portable_stimulus_description createportable_stimulus_description()
  {
    portable_stimulus_descriptionImpl portable_stimulus_description = new portable_stimulus_descriptionImpl();
    return portable_stimulus_description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_or_struct_declaration creategraph_or_struct_declaration()
  {
    graph_or_struct_declarationImpl graph_or_struct_declaration = new graph_or_struct_declarationImpl();
    return graph_or_struct_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_struct_ifc_declaration creategraph_struct_ifc_declaration()
  {
    graph_struct_ifc_declarationImpl graph_struct_ifc_declaration = new graph_struct_ifc_declarationImpl();
    return graph_struct_ifc_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_declaration creategraph_declaration()
  {
    graph_declarationImpl graph_declaration = new graph_declarationImpl();
    return graph_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public port_declaration createport_declaration()
  {
    port_declarationImpl port_declaration = new port_declarationImpl();
    return port_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration createstruct_declaration()
  {
    struct_declarationImpl struct_declaration = new struct_declarationImpl();
    return struct_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_body_item createstruct_body_item()
  {
    struct_body_itemImpl struct_body_item = new struct_body_itemImpl();
    return struct_body_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_body_item creategraph_body_item()
  {
    graph_body_itemImpl graph_body_item = new graph_body_itemImpl();
    return graph_body_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public symbol_definition createsymbol_definition()
  {
    symbol_definitionImpl symbol_definition = new symbol_definitionImpl();
    return symbol_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_action_definition createinterface_action_definition()
  {
    interface_action_definitionImpl interface_action_definition = new interface_action_definitionImpl();
    return interface_action_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_production createrule_production()
  {
    rule_productionImpl rule_production = new rule_productionImpl();
    return rule_production;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_or_block createrule_stmt_or_block()
  {
    rule_stmt_or_blockImpl rule_stmt_or_block = new rule_stmt_or_blockImpl();
    return rule_stmt_or_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_alt_parallel_seq createrule_stmt_alt_parallel_seq()
  {
    rule_stmt_alt_parallel_seqImpl rule_stmt_alt_parallel_seq = new rule_stmt_alt_parallel_seqImpl();
    return rule_stmt_alt_parallel_seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_primary createrule_stmt_primary()
  {
    rule_stmt_primaryImpl rule_stmt_primary = new rule_stmt_primaryImpl();
    return rule_stmt_primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_parallel_alt createrule_stmt_parallel_alt()
  {
    rule_stmt_parallel_altImpl rule_stmt_parallel_alt = new rule_stmt_parallel_altImpl();
    return rule_stmt_parallel_alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_stmt_parallel createrule_stmt_parallel()
  {
    rule_stmt_parallelImpl rule_stmt_parallel = new rule_stmt_parallelImpl();
    return rule_stmt_parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_sequence createrule_sequence()
  {
    rule_sequenceImpl rule_sequence = new rule_sequenceImpl();
    return rule_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_seq_item createrule_seq_item()
  {
    rule_seq_itemImpl rule_seq_item = new rule_seq_itemImpl();
    return rule_seq_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_with_clause createrule_with_clause()
  {
    rule_with_clauseImpl rule_with_clause = new rule_with_clauseImpl();
    return rule_with_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list createparameter_list()
  {
    parameter_listImpl parameter_list = new parameter_listImpl();
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rule_repeat_stmt createrule_repeat_stmt()
  {
    rule_repeat_stmtImpl rule_repeat_stmt = new rule_repeat_stmtImpl();
    return rule_repeat_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public overrides_declaration createoverrides_declaration()
  {
    overrides_declarationImpl overrides_declaration = new overrides_declarationImpl();
    return overrides_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public override_stmt createoverride_stmt()
  {
    override_stmtImpl override_stmt = new override_stmtImpl();
    return override_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_override createtype_override()
  {
    type_overrideImpl type_override = new type_overrideImpl();
    return type_override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public instance_override createinstance_override()
  {
    instance_overrideImpl instance_override = new instance_overrideImpl();
    return instance_override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public data_declaration createdata_declaration()
  {
    data_declarationImpl data_declaration = new data_declarationImpl();
    return data_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public data_instantiation createdata_instantiation()
  {
    data_instantiationImpl data_instantiation = new data_instantiationImpl();
    return data_instantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_interface_portmap_list creategraph_interface_portmap_list()
  {
    graph_interface_portmap_listImpl graph_interface_portmap_list = new graph_interface_portmap_listImpl();
    return graph_interface_portmap_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_interface_portmap creategraph_interface_portmap()
  {
    graph_interface_portmapImpl graph_interface_portmap = new graph_interface_portmapImpl();
    return graph_interface_portmap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public data_type createdata_type()
  {
    data_typeImpl data_type = new data_typeImpl();
    return data_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public user_defined_type createuser_defined_type()
  {
    user_defined_typeImpl user_defined_type = new user_defined_typeImpl();
    return user_defined_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typedef_declaration createtypedef_declaration()
  {
    typedef_declarationImpl typedef_declaration = new typedef_declarationImpl();
    return typedef_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enum_type createenum_type()
  {
    enum_typeImpl enum_type = new enum_typeImpl();
    return enum_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public integer_type createinteger_type()
  {
    integer_typeImpl integer_type = new integer_typeImpl();
    return integer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_inside_clause createtype_inside_clause()
  {
    type_inside_clauseImpl type_inside_clause = new type_inside_clauseImpl();
    return type_inside_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public open_range_list createopen_range_list()
  {
    open_range_listImpl open_range_list = new open_range_listImpl();
    return open_range_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public open_range_value createopen_range_value()
  {
    open_range_valueImpl open_range_value = new open_range_valueImpl();
    return open_range_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public range_expr createrange_expr()
  {
    range_exprImpl range_expr = new range_exprImpl();
    return range_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_declaration createconstraint_declaration()
  {
    constraint_declarationImpl constraint_declaration = new constraint_declarationImpl();
    return constraint_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_body_item createconstraint_body_item()
  {
    constraint_body_itemImpl constraint_body_item = new constraint_body_itemImpl();
    return constraint_body_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_or_dist_item createexpression_or_dist_item()
  {
    expression_or_dist_itemImpl expression_or_dist_item = new expression_or_dist_itemImpl();
    return expression_or_dist_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_constraint_item createif_constraint_item()
  {
    if_constraint_itemImpl if_constraint_item = new if_constraint_itemImpl();
    return if_constraint_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public foreach_constraint_item createforeach_constraint_item()
  {
    foreach_constraint_itemImpl foreach_constraint_item = new foreach_constraint_itemImpl();
    return foreach_constraint_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_set createconstraint_set()
  {
    constraint_setImpl constraint_set = new constraint_setImpl();
    return constraint_set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constraint_block createconstraint_block()
  {
    constraint_blockImpl constraint_block = new constraint_blockImpl();
    return constraint_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_or_scheme_declaration createbin_or_scheme_declaration()
  {
    bin_or_scheme_declarationImpl bin_or_scheme_declaration = new bin_or_scheme_declarationImpl();
    return bin_or_scheme_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bins_declaration createbins_declaration()
  {
    bins_declarationImpl bins_declaration = new bins_declarationImpl();
    return bins_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_specification createbin_specification()
  {
    bin_specificationImpl bin_specification = new bin_specificationImpl();
    return bin_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_specifier createbin_specifier()
  {
    bin_specifierImpl bin_specifier = new bin_specifierImpl();
    return bin_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public explicit_bin_value createexplicit_bin_value()
  {
    explicit_bin_valueImpl explicit_bin_value = new explicit_bin_valueImpl();
    return explicit_bin_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public explicit_bin_range createexplicit_bin_range()
  {
    explicit_bin_rangeImpl explicit_bin_range = new explicit_bin_rangeImpl();
    return explicit_bin_range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_range_divide createbin_range_divide()
  {
    bin_range_divideImpl bin_range_divide = new bin_range_divideImpl();
    return bin_range_divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_range_size createbin_range_size()
  {
    bin_range_sizeImpl bin_range_size = new bin_range_sizeImpl();
    return bin_range_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_scheme_declaration createbin_scheme_declaration()
  {
    bin_scheme_declarationImpl bin_scheme_declaration = new bin_scheme_declarationImpl();
    return bin_scheme_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_scheme_specifier createbin_scheme_specifier()
  {
    bin_scheme_specifierImpl bin_scheme_specifier = new bin_scheme_specifierImpl();
    return bin_scheme_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression createconstant_expression()
  {
    constant_expressionImpl constant_expression = new constant_expressionImpl();
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_declaration createinterface_declaration()
  {
    interface_declarationImpl interface_declaration = new interface_declarationImpl();
    return interface_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_body_item createinterface_body_item()
  {
    interface_body_itemImpl interface_body_item = new interface_body_itemImpl();
    return interface_body_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_declaration createaction_declaration()
  {
    action_declarationImpl action_declaration = new action_declarationImpl();
    return action_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_portlist createaction_portlist()
  {
    action_portlistImpl action_portlist = new action_portlistImpl();
    return action_portlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_port createaction_port()
  {
    action_portImpl action_port = new action_portImpl();
    return action_port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph_data_declaration creategraph_data_declaration()
  {
    graph_data_declarationImpl graph_data_declaration = new graph_data_declarationImpl();
    return graph_data_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public symbol_declaration createsymbol_declaration()
  {
    symbol_declarationImpl symbol_declaration = new symbol_declarationImpl();
    return symbol_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public symbol_decl_item createsymbol_decl_item()
  {
    symbol_decl_itemImpl symbol_decl_item = new symbol_decl_itemImpl();
    return symbol_decl_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public port_map createport_map()
  {
    port_mapImpl port_map = new port_mapImpl();
    return port_map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public hierarchical_id createhierarchical_id()
  {
    hierarchical_idImpl hierarchical_id = new hierarchical_idImpl();
    return hierarchical_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interface_action_id createinterface_action_id()
  {
    interface_action_idImpl interface_action_id = new interface_action_idImpl();
    return interface_action_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal createliteral()
  {
    literalImpl literal = new literalImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public decimal_number createdecimal_number()
  {
    decimal_numberImpl decimal_number = new decimal_numberImpl();
    return decimal_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public size createsize()
  {
    sizeImpl size = new sizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public alt_stmt createalt_stmt()
  {
    alt_stmtImpl alt_stmt = new alt_stmtImpl();
    return alt_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stmt_alt createstmt_alt()
  {
    stmt_altImpl stmt_alt = new stmt_altImpl();
    return stmt_alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public overides_declaration createoverides_declaration()
  {
    overides_declarationImpl overides_declaration = new overides_declarationImpl();
    return overides_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public condition_expr createcondition_expr()
  {
    condition_exprImpl condition_expr = new condition_exprImpl();
    return condition_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expr createlogical_or_expr()
  {
    logical_or_exprImpl logical_or_expr = new logical_or_exprImpl();
    return logical_or_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expr createlogical_and_expr()
  {
    logical_and_exprImpl logical_and_expr = new logical_and_exprImpl();
    return logical_and_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_xor_expr createbinary_xor_expr()
  {
    binary_xor_exprImpl binary_xor_expr = new binary_xor_exprImpl();
    return binary_xor_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_and_expr createbinary_and_expr()
  {
    binary_and_exprImpl binary_and_expr = new binary_and_exprImpl();
    return binary_and_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_equality_expr createlogical_equality_expr()
  {
    logical_equality_exprImpl logical_equality_expr = new logical_equality_exprImpl();
    return logical_equality_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_inequality_expr createlogical_inequality_expr()
  {
    logical_inequality_exprImpl logical_inequality_expr = new logical_inequality_exprImpl();
    return logical_inequality_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_shift_expr createbinary_shift_expr()
  {
    binary_shift_exprImpl binary_shift_expr = new binary_shift_exprImpl();
    return binary_shift_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_add_sub_expr createbinary_add_sub_expr()
  {
    binary_add_sub_exprImpl binary_add_sub_expr = new binary_add_sub_exprImpl();
    return binary_add_sub_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_mul_div_mod_expr createbinary_mul_div_mod_expr()
  {
    binary_mul_div_mod_exprImpl binary_mul_div_mod_expr = new binary_mul_div_mod_exprImpl();
    return binary_mul_div_mod_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_exp_expr createbinary_exp_expr()
  {
    binary_exp_exprImpl binary_exp_expr = new binary_exp_exprImpl();
    return binary_exp_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSSPackage getPSSPackage()
  {
    return (PSSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PSSPackage getPackage()
  {
    return PSSPackage.eINSTANCE;
  }

} //PSSFactoryImpl
