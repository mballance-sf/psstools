/**
 */
package net.sf.psstools.lang.pSS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.psstools.lang.pSS.PSSPackage
 * @generated
 */
public interface PSSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PSSFactory eINSTANCE = net.sf.psstools.lang.pSS.impl.PSSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>portable stimulus description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>portable stimulus description</em>'.
   * @generated
   */
  portable_stimulus_description createportable_stimulus_description();

  /**
   * Returns a new object of class '<em>graph or struct declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph or struct declaration</em>'.
   * @generated
   */
  graph_or_struct_declaration creategraph_or_struct_declaration();

  /**
   * Returns a new object of class '<em>graph struct ifc declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph struct ifc declaration</em>'.
   * @generated
   */
  graph_struct_ifc_declaration creategraph_struct_ifc_declaration();

  /**
   * Returns a new object of class '<em>graph declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph declaration</em>'.
   * @generated
   */
  graph_declaration creategraph_declaration();

  /**
   * Returns a new object of class '<em>port declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>port declaration</em>'.
   * @generated
   */
  port_declaration createport_declaration();

  /**
   * Returns a new object of class '<em>struct declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declaration</em>'.
   * @generated
   */
  struct_declaration createstruct_declaration();

  /**
   * Returns a new object of class '<em>struct body item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct body item</em>'.
   * @generated
   */
  struct_body_item createstruct_body_item();

  /**
   * Returns a new object of class '<em>graph body item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph body item</em>'.
   * @generated
   */
  graph_body_item creategraph_body_item();

  /**
   * Returns a new object of class '<em>symbol definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>symbol definition</em>'.
   * @generated
   */
  symbol_definition createsymbol_definition();

  /**
   * Returns a new object of class '<em>interface action definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interface action definition</em>'.
   * @generated
   */
  interface_action_definition createinterface_action_definition();

  /**
   * Returns a new object of class '<em>rule production</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule production</em>'.
   * @generated
   */
  rule_production createrule_production();

  /**
   * Returns a new object of class '<em>rule stmt or block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule stmt or block</em>'.
   * @generated
   */
  rule_stmt_or_block createrule_stmt_or_block();

  /**
   * Returns a new object of class '<em>rule stmt alt parallel seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule stmt alt parallel seq</em>'.
   * @generated
   */
  rule_stmt_alt_parallel_seq createrule_stmt_alt_parallel_seq();

  /**
   * Returns a new object of class '<em>rule stmt primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule stmt primary</em>'.
   * @generated
   */
  rule_stmt_primary createrule_stmt_primary();

  /**
   * Returns a new object of class '<em>rule stmt parallel alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule stmt parallel alt</em>'.
   * @generated
   */
  rule_stmt_parallel_alt createrule_stmt_parallel_alt();

  /**
   * Returns a new object of class '<em>rule stmt parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule stmt parallel</em>'.
   * @generated
   */
  rule_stmt_parallel createrule_stmt_parallel();

  /**
   * Returns a new object of class '<em>rule sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule sequence</em>'.
   * @generated
   */
  rule_sequence createrule_sequence();

  /**
   * Returns a new object of class '<em>rule seq item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule seq item</em>'.
   * @generated
   */
  rule_seq_item createrule_seq_item();

  /**
   * Returns a new object of class '<em>rule with clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule with clause</em>'.
   * @generated
   */
  rule_with_clause createrule_with_clause();

  /**
   * Returns a new object of class '<em>parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter list</em>'.
   * @generated
   */
  parameter_list createparameter_list();

  /**
   * Returns a new object of class '<em>rule repeat stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule repeat stmt</em>'.
   * @generated
   */
  rule_repeat_stmt createrule_repeat_stmt();

  /**
   * Returns a new object of class '<em>overrides declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>overrides declaration</em>'.
   * @generated
   */
  overrides_declaration createoverrides_declaration();

  /**
   * Returns a new object of class '<em>override stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>override stmt</em>'.
   * @generated
   */
  override_stmt createoverride_stmt();

  /**
   * Returns a new object of class '<em>type override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type override</em>'.
   * @generated
   */
  type_override createtype_override();

  /**
   * Returns a new object of class '<em>instance override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>instance override</em>'.
   * @generated
   */
  instance_override createinstance_override();

  /**
   * Returns a new object of class '<em>data declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>data declaration</em>'.
   * @generated
   */
  data_declaration createdata_declaration();

  /**
   * Returns a new object of class '<em>data instantiation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>data instantiation</em>'.
   * @generated
   */
  data_instantiation createdata_instantiation();

  /**
   * Returns a new object of class '<em>graph interface portmap list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph interface portmap list</em>'.
   * @generated
   */
  graph_interface_portmap_list creategraph_interface_portmap_list();

  /**
   * Returns a new object of class '<em>graph interface portmap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph interface portmap</em>'.
   * @generated
   */
  graph_interface_portmap creategraph_interface_portmap();

  /**
   * Returns a new object of class '<em>data type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>data type</em>'.
   * @generated
   */
  data_type createdata_type();

  /**
   * Returns a new object of class '<em>user defined type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>user defined type</em>'.
   * @generated
   */
  user_defined_type createuser_defined_type();

  /**
   * Returns a new object of class '<em>typedef declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typedef declaration</em>'.
   * @generated
   */
  typedef_declaration createtypedef_declaration();

  /**
   * Returns a new object of class '<em>enum type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum type</em>'.
   * @generated
   */
  enum_type createenum_type();

  /**
   * Returns a new object of class '<em>integer type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>integer type</em>'.
   * @generated
   */
  integer_type createinteger_type();

  /**
   * Returns a new object of class '<em>type inside clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type inside clause</em>'.
   * @generated
   */
  type_inside_clause createtype_inside_clause();

  /**
   * Returns a new object of class '<em>open range list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>open range list</em>'.
   * @generated
   */
  open_range_list createopen_range_list();

  /**
   * Returns a new object of class '<em>open range value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>open range value</em>'.
   * @generated
   */
  open_range_value createopen_range_value();

  /**
   * Returns a new object of class '<em>range expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>range expr</em>'.
   * @generated
   */
  range_expr createrange_expr();

  /**
   * Returns a new object of class '<em>constraint declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint declaration</em>'.
   * @generated
   */
  constraint_declaration createconstraint_declaration();

  /**
   * Returns a new object of class '<em>constraint body item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint body item</em>'.
   * @generated
   */
  constraint_body_item createconstraint_body_item();

  /**
   * Returns a new object of class '<em>expression or dist item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression or dist item</em>'.
   * @generated
   */
  expression_or_dist_item createexpression_or_dist_item();

  /**
   * Returns a new object of class '<em>if constraint item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>if constraint item</em>'.
   * @generated
   */
  if_constraint_item createif_constraint_item();

  /**
   * Returns a new object of class '<em>foreach constraint item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>foreach constraint item</em>'.
   * @generated
   */
  foreach_constraint_item createforeach_constraint_item();

  /**
   * Returns a new object of class '<em>constraint set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint set</em>'.
   * @generated
   */
  constraint_set createconstraint_set();

  /**
   * Returns a new object of class '<em>constraint block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint block</em>'.
   * @generated
   */
  constraint_block createconstraint_block();

  /**
   * Returns a new object of class '<em>bin or scheme declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin or scheme declaration</em>'.
   * @generated
   */
  bin_or_scheme_declaration createbin_or_scheme_declaration();

  /**
   * Returns a new object of class '<em>bins declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bins declaration</em>'.
   * @generated
   */
  bins_declaration createbins_declaration();

  /**
   * Returns a new object of class '<em>bin specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin specification</em>'.
   * @generated
   */
  bin_specification createbin_specification();

  /**
   * Returns a new object of class '<em>bin specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin specifier</em>'.
   * @generated
   */
  bin_specifier createbin_specifier();

  /**
   * Returns a new object of class '<em>explicit bin value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>explicit bin value</em>'.
   * @generated
   */
  explicit_bin_value createexplicit_bin_value();

  /**
   * Returns a new object of class '<em>explicit bin range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>explicit bin range</em>'.
   * @generated
   */
  explicit_bin_range createexplicit_bin_range();

  /**
   * Returns a new object of class '<em>bin range divide</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin range divide</em>'.
   * @generated
   */
  bin_range_divide createbin_range_divide();

  /**
   * Returns a new object of class '<em>bin range size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin range size</em>'.
   * @generated
   */
  bin_range_size createbin_range_size();

  /**
   * Returns a new object of class '<em>bin scheme declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin scheme declaration</em>'.
   * @generated
   */
  bin_scheme_declaration createbin_scheme_declaration();

  /**
   * Returns a new object of class '<em>bin scheme specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin scheme specifier</em>'.
   * @generated
   */
  bin_scheme_specifier createbin_scheme_specifier();

  /**
   * Returns a new object of class '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant expression</em>'.
   * @generated
   */
  constant_expression createconstant_expression();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>interface declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interface declaration</em>'.
   * @generated
   */
  interface_declaration createinterface_declaration();

  /**
   * Returns a new object of class '<em>interface body item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interface body item</em>'.
   * @generated
   */
  interface_body_item createinterface_body_item();

  /**
   * Returns a new object of class '<em>action declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action declaration</em>'.
   * @generated
   */
  action_declaration createaction_declaration();

  /**
   * Returns a new object of class '<em>action portlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action portlist</em>'.
   * @generated
   */
  action_portlist createaction_portlist();

  /**
   * Returns a new object of class '<em>action port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action port</em>'.
   * @generated
   */
  action_port createaction_port();

  /**
   * Returns a new object of class '<em>graph data declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph data declaration</em>'.
   * @generated
   */
  graph_data_declaration creategraph_data_declaration();

  /**
   * Returns a new object of class '<em>symbol declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>symbol declaration</em>'.
   * @generated
   */
  symbol_declaration createsymbol_declaration();

  /**
   * Returns a new object of class '<em>symbol decl item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>symbol decl item</em>'.
   * @generated
   */
  symbol_decl_item createsymbol_decl_item();

  /**
   * Returns a new object of class '<em>port map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>port map</em>'.
   * @generated
   */
  port_map createport_map();

  /**
   * Returns a new object of class '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant</em>'.
   * @generated
   */
  constant createconstant();

  /**
   * Returns a new object of class '<em>hierarchical id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>hierarchical id</em>'.
   * @generated
   */
  hierarchical_id createhierarchical_id();

  /**
   * Returns a new object of class '<em>interface action id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interface action id</em>'.
   * @generated
   */
  interface_action_id createinterface_action_id();

  /**
   * Returns a new object of class '<em>literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literal</em>'.
   * @generated
   */
  literal createliteral();

  /**
   * Returns a new object of class '<em>decimal number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>decimal number</em>'.
   * @generated
   */
  decimal_number createdecimal_number();

  /**
   * Returns a new object of class '<em>size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>size</em>'.
   * @generated
   */
  size createsize();

  /**
   * Returns a new object of class '<em>alt stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alt stmt</em>'.
   * @generated
   */
  alt_stmt createalt_stmt();

  /**
   * Returns a new object of class '<em>stmt alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt alt</em>'.
   * @generated
   */
  stmt_alt createstmt_alt();

  /**
   * Returns a new object of class '<em>overides declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>overides declaration</em>'.
   * @generated
   */
  overides_declaration createoverides_declaration();

  /**
   * Returns a new object of class '<em>condition expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>condition expr</em>'.
   * @generated
   */
  condition_expr createcondition_expr();

  /**
   * Returns a new object of class '<em>logical or expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical or expr</em>'.
   * @generated
   */
  logical_or_expr createlogical_or_expr();

  /**
   * Returns a new object of class '<em>logical and expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical and expr</em>'.
   * @generated
   */
  logical_and_expr createlogical_and_expr();

  /**
   * Returns a new object of class '<em>binary xor expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary xor expr</em>'.
   * @generated
   */
  binary_xor_expr createbinary_xor_expr();

  /**
   * Returns a new object of class '<em>binary and expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary and expr</em>'.
   * @generated
   */
  binary_and_expr createbinary_and_expr();

  /**
   * Returns a new object of class '<em>logical equality expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical equality expr</em>'.
   * @generated
   */
  logical_equality_expr createlogical_equality_expr();

  /**
   * Returns a new object of class '<em>logical inequality expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical inequality expr</em>'.
   * @generated
   */
  logical_inequality_expr createlogical_inequality_expr();

  /**
   * Returns a new object of class '<em>binary shift expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary shift expr</em>'.
   * @generated
   */
  binary_shift_expr createbinary_shift_expr();

  /**
   * Returns a new object of class '<em>binary add sub expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary add sub expr</em>'.
   * @generated
   */
  binary_add_sub_expr createbinary_add_sub_expr();

  /**
   * Returns a new object of class '<em>binary mul div mod expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary mul div mod expr</em>'.
   * @generated
   */
  binary_mul_div_mod_expr createbinary_mul_div_mod_expr();

  /**
   * Returns a new object of class '<em>binary exp expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>binary exp expr</em>'.
   * @generated
   */
  binary_exp_expr createbinary_exp_expr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PSSPackage getPSSPackage();

} //PSSFactory
