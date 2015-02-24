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
   * Returns a new object of class '<em>struct graph body item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct graph body item</em>'.
   * @generated
   */
  struct_graph_body_item createstruct_graph_body_item();

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
   * Returns a new object of class '<em>rule production</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule production</em>'.
   * @generated
   */
  rule_production createrule_production();

  /**
   * Returns a new object of class '<em>stmt or block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt or block</em>'.
   * @generated
   */
  stmt_or_block createstmt_or_block();

  /**
   * Returns a new object of class '<em>alt stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alt stmt</em>'.
   * @generated
   */
  alt_stmt createalt_stmt();

  /**
   * Returns a new object of class '<em>stmt primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt primary</em>'.
   * @generated
   */
  stmt_primary createstmt_primary();

  /**
   * Returns a new object of class '<em>stmt alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt alt</em>'.
   * @generated
   */
  stmt_alt createstmt_alt();

  /**
   * Returns a new object of class '<em>stmt parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt parallel</em>'.
   * @generated
   */
  stmt_parallel createstmt_parallel();

  /**
   * Returns a new object of class '<em>seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>seq</em>'.
   * @generated
   */
  seq createseq();

  /**
   * Returns a new object of class '<em>seq item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>seq item</em>'.
   * @generated
   */
  seq_item createseq_item();

  /**
   * Returns a new object of class '<em>ifc call parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ifc call parameter list</em>'.
   * @generated
   */
  ifc_call_parameter_list createifc_call_parameter_list();

  /**
   * Returns a new object of class '<em>repeat stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>repeat stmt</em>'.
   * @generated
   */
  repeat_stmt createrepeat_stmt();

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
   * Returns a new object of class '<em>typedef declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typedef declaration</em>'.
   * @generated
   */
  typedef_declaration createtypedef_declaration();

  /**
   * Returns a new object of class '<em>enum declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum declaration</em>'.
   * @generated
   */
  enum_declaration createenum_declaration();

  /**
   * Returns a new object of class '<em>scalar declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>scalar declaration</em>'.
   * @generated
   */
  scalar_declaration createscalar_declaration();

  /**
   * Returns a new object of class '<em>signed scalar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>signed scalar</em>'.
   * @generated
   */
  signed_scalar createsigned_scalar();

  /**
   * Returns a new object of class '<em>scalar signed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>scalar signed</em>'.
   * @generated
   */
  scalar_signed createscalar_signed();

  /**
   * Returns a new object of class '<em>domain spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>domain spec</em>'.
   * @generated
   */
  domain_spec createdomain_spec();

  /**
   * Returns a new object of class '<em>constraint declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint declaration</em>'.
   * @generated
   */
  constraint_declaration createconstraint_declaration();

  /**
   * Returns a new object of class '<em>constraint body no if item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constraint body no if item</em>'.
   * @generated
   */
  constraint_body_no_if_item createconstraint_body_no_if_item();

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
   * Returns a new object of class '<em>port map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>port map</em>'.
   * @generated
   */
  port_map createport_map();

  /**
   * Returns a new object of class '<em>struct data declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct data declaration</em>'.
   * @generated
   */
  struct_data_declaration createstruct_data_declaration();

  /**
   * Returns a new object of class '<em>graph datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph datatype</em>'.
   * @generated
   */
  graph_datatype creategraph_datatype();

  /**
   * Returns a new object of class '<em>struct datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct datatype</em>'.
   * @generated
   */
  struct_datatype createstruct_datatype();

  /**
   * Returns a new object of class '<em>primitive datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primitive datatype</em>'.
   * @generated
   */
  primitive_datatype createprimitive_datatype();

  /**
   * Returns a new object of class '<em>integer type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>integer type</em>'.
   * @generated
   */
  integer_type createinteger_type();

  /**
   * Returns a new object of class '<em>hierarchical id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>hierarchical id</em>'.
   * @generated
   */
  hierarchical_id createhierarchical_id();

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
