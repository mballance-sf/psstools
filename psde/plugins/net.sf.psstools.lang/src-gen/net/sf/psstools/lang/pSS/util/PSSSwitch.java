/**
 */
package net.sf.psstools.lang.pSS.util;

import net.sf.psstools.lang.pSS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.psstools.lang.pSS.PSSPackage
 * @generated
 */
public class PSSSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PSSPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSSSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PSSPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PSSPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.PORTABLE_STIMULUS_DESCRIPTION:
      {
        portable_stimulus_description portable_stimulus_description = (portable_stimulus_description)theEObject;
        T result = caseportable_stimulus_description(portable_stimulus_description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_OR_STRUCT_DECLARATION:
      {
        graph_or_struct_declaration graph_or_struct_declaration = (graph_or_struct_declaration)theEObject;
        T result = casegraph_or_struct_declaration(graph_or_struct_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_STRUCT_IFC_DECLARATION:
      {
        graph_struct_ifc_declaration graph_struct_ifc_declaration = (graph_struct_ifc_declaration)theEObject;
        T result = casegraph_struct_ifc_declaration(graph_struct_ifc_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_DECLARATION:
      {
        graph_declaration graph_declaration = (graph_declaration)theEObject;
        T result = casegraph_declaration(graph_declaration);
        if (result == null) result = caseportable_stimulus_description(graph_declaration);
        if (result == null) result = casegraph_or_struct_declaration(graph_declaration);
        if (result == null) result = casegraph_struct_ifc_declaration(graph_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.PORT_DECLARATION:
      {
        port_declaration port_declaration = (port_declaration)theEObject;
        T result = caseport_declaration(port_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STRUCT_DECLARATION:
      {
        struct_declaration struct_declaration = (struct_declaration)theEObject;
        T result = casestruct_declaration(struct_declaration);
        if (result == null) result = caseportable_stimulus_description(struct_declaration);
        if (result == null) result = casegraph_or_struct_declaration(struct_declaration);
        if (result == null) result = casegraph_struct_ifc_declaration(struct_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STRUCT_BODY_ITEM:
      {
        struct_body_item struct_body_item = (struct_body_item)theEObject;
        T result = casestruct_body_item(struct_body_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_BODY_ITEM:
      {
        graph_body_item graph_body_item = (graph_body_item)theEObject;
        T result = casegraph_body_item(graph_body_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SYMBOL_DEFINITION:
      {
        symbol_definition symbol_definition = (symbol_definition)theEObject;
        T result = casesymbol_definition(symbol_definition);
        if (result == null) result = casegraph_body_item(symbol_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTERFACE_ACTION_DEFINITION:
      {
        interface_action_definition interface_action_definition = (interface_action_definition)theEObject;
        T result = caseinterface_action_definition(interface_action_definition);
        if (result == null) result = casegraph_body_item(interface_action_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_PRODUCTION:
      {
        rule_production rule_production = (rule_production)theEObject;
        T result = caserule_production(rule_production);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_STMT_OR_BLOCK:
      {
        rule_stmt_or_block rule_stmt_or_block = (rule_stmt_or_block)theEObject;
        T result = caserule_stmt_or_block(rule_stmt_or_block);
        if (result == null) result = caserule_production(rule_stmt_or_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_STMT_ALT_PARALLEL_SEQ:
      {
        rule_stmt_alt_parallel_seq rule_stmt_alt_parallel_seq = (rule_stmt_alt_parallel_seq)theEObject;
        T result = caserule_stmt_alt_parallel_seq(rule_stmt_alt_parallel_seq);
        if (result == null) result = caserule_stmt_or_block(rule_stmt_alt_parallel_seq);
        if (result == null) result = caserule_production(rule_stmt_alt_parallel_seq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_STMT_PRIMARY:
      {
        rule_stmt_primary rule_stmt_primary = (rule_stmt_primary)theEObject;
        T result = caserule_stmt_primary(rule_stmt_primary);
        if (result == null) result = caserule_stmt_alt_parallel_seq(rule_stmt_primary);
        if (result == null) result = caserule_stmt_or_block(rule_stmt_primary);
        if (result == null) result = caserule_production(rule_stmt_primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_STMT_PARALLEL_ALT:
      {
        rule_stmt_parallel_alt rule_stmt_parallel_alt = (rule_stmt_parallel_alt)theEObject;
        T result = caserule_stmt_parallel_alt(rule_stmt_parallel_alt);
        if (result == null) result = caserule_stmt_primary(rule_stmt_parallel_alt);
        if (result == null) result = caserule_stmt_alt_parallel_seq(rule_stmt_parallel_alt);
        if (result == null) result = caserule_stmt_or_block(rule_stmt_parallel_alt);
        if (result == null) result = caserule_production(rule_stmt_parallel_alt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_STMT_PARALLEL:
      {
        rule_stmt_parallel rule_stmt_parallel = (rule_stmt_parallel)theEObject;
        T result = caserule_stmt_parallel(rule_stmt_parallel);
        if (result == null) result = caserule_stmt_parallel_alt(rule_stmt_parallel);
        if (result == null) result = caserule_stmt_primary(rule_stmt_parallel);
        if (result == null) result = caserule_stmt_alt_parallel_seq(rule_stmt_parallel);
        if (result == null) result = caserule_stmt_or_block(rule_stmt_parallel);
        if (result == null) result = caserule_production(rule_stmt_parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_SEQUENCE:
      {
        rule_sequence rule_sequence = (rule_sequence)theEObject;
        T result = caserule_sequence(rule_sequence);
        if (result == null) result = caserule_stmt_parallel(rule_sequence);
        if (result == null) result = caserule_stmt_parallel_alt(rule_sequence);
        if (result == null) result = caserule_stmt_primary(rule_sequence);
        if (result == null) result = caserule_stmt_alt_parallel_seq(rule_sequence);
        if (result == null) result = caserule_stmt_or_block(rule_sequence);
        if (result == null) result = caserule_production(rule_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_SEQ_ITEM:
      {
        rule_seq_item rule_seq_item = (rule_seq_item)theEObject;
        T result = caserule_seq_item(rule_seq_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_WITH_CLAUSE:
      {
        rule_with_clause rule_with_clause = (rule_with_clause)theEObject;
        T result = caserule_with_clause(rule_with_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.PARAMETER_LIST:
      {
        parameter_list parameter_list = (parameter_list)theEObject;
        T result = caseparameter_list(parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RULE_REPEAT_STMT:
      {
        rule_repeat_stmt rule_repeat_stmt = (rule_repeat_stmt)theEObject;
        T result = caserule_repeat_stmt(rule_repeat_stmt);
        if (result == null) result = caserule_stmt_or_block(rule_repeat_stmt);
        if (result == null) result = caserule_production(rule_repeat_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OVERRIDES_DECLARATION:
      {
        overrides_declaration overrides_declaration = (overrides_declaration)theEObject;
        T result = caseoverrides_declaration(overrides_declaration);
        if (result == null) result = casegraph_body_item(overrides_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OVERRIDE_STMT:
      {
        override_stmt override_stmt = (override_stmt)theEObject;
        T result = caseoverride_stmt(override_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.TYPE_OVERRIDE:
      {
        type_override type_override = (type_override)theEObject;
        T result = casetype_override(type_override);
        if (result == null) result = caseoverride_stmt(type_override);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INSTANCE_OVERRIDE:
      {
        instance_override instance_override = (instance_override)theEObject;
        T result = caseinstance_override(instance_override);
        if (result == null) result = caseoverride_stmt(instance_override);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.DATA_DECLARATION:
      {
        data_declaration data_declaration = (data_declaration)theEObject;
        T result = casedata_declaration(data_declaration);
        if (result == null) result = caseportable_stimulus_description(data_declaration);
        if (result == null) result = casestruct_body_item(data_declaration);
        if (result == null) result = casegraph_body_item(data_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.DATA_INSTANTIATION:
      {
        data_instantiation data_instantiation = (data_instantiation)theEObject;
        T result = casedata_instantiation(data_instantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_INTERFACE_PORTMAP_LIST:
      {
        graph_interface_portmap_list graph_interface_portmap_list = (graph_interface_portmap_list)theEObject;
        T result = casegraph_interface_portmap_list(graph_interface_portmap_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_INTERFACE_PORTMAP:
      {
        graph_interface_portmap graph_interface_portmap = (graph_interface_portmap)theEObject;
        T result = casegraph_interface_portmap(graph_interface_portmap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.DATA_TYPE:
      {
        data_type data_type = (data_type)theEObject;
        T result = casedata_type(data_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.USER_DEFINED_TYPE:
      {
        user_defined_type user_defined_type = (user_defined_type)theEObject;
        T result = caseuser_defined_type(user_defined_type);
        if (result == null) result = casedata_type(user_defined_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.TYPEDEF_DECLARATION:
      {
        typedef_declaration typedef_declaration = (typedef_declaration)theEObject;
        T result = casetypedef_declaration(typedef_declaration);
        if (result == null) result = caseportable_stimulus_description(typedef_declaration);
        if (result == null) result = casestruct_body_item(typedef_declaration);
        if (result == null) result = casegraph_body_item(typedef_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ENUM_TYPE:
      {
        enum_type enum_type = (enum_type)theEObject;
        T result = caseenum_type(enum_type);
        if (result == null) result = casedata_type(enum_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTEGER_TYPE:
      {
        integer_type integer_type = (integer_type)theEObject;
        T result = caseinteger_type(integer_type);
        if (result == null) result = casedata_type(integer_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.TYPE_INSIDE_CLAUSE:
      {
        type_inside_clause type_inside_clause = (type_inside_clause)theEObject;
        T result = casetype_inside_clause(type_inside_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OPEN_RANGE_LIST:
      {
        open_range_list open_range_list = (open_range_list)theEObject;
        T result = caseopen_range_list(open_range_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OPEN_RANGE_VALUE:
      {
        open_range_value open_range_value = (open_range_value)theEObject;
        T result = caseopen_range_value(open_range_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.RANGE_EXPR:
      {
        range_expr range_expr = (range_expr)theEObject;
        T result = caserange_expr(range_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_DECLARATION:
      {
        constraint_declaration constraint_declaration = (constraint_declaration)theEObject;
        T result = caseconstraint_declaration(constraint_declaration);
        if (result == null) result = casestruct_body_item(constraint_declaration);
        if (result == null) result = casegraph_body_item(constraint_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_BODY_ITEM:
      {
        constraint_body_item constraint_body_item = (constraint_body_item)theEObject;
        T result = caseconstraint_body_item(constraint_body_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.EXPRESSION_OR_DIST_ITEM:
      {
        expression_or_dist_item expression_or_dist_item = (expression_or_dist_item)theEObject;
        T result = caseexpression_or_dist_item(expression_or_dist_item);
        if (result == null) result = caseconstraint_body_item(expression_or_dist_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.IF_CONSTRAINT_ITEM:
      {
        if_constraint_item if_constraint_item = (if_constraint_item)theEObject;
        T result = caseif_constraint_item(if_constraint_item);
        if (result == null) result = caseconstraint_body_item(if_constraint_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.FOREACH_CONSTRAINT_ITEM:
      {
        foreach_constraint_item foreach_constraint_item = (foreach_constraint_item)theEObject;
        T result = caseforeach_constraint_item(foreach_constraint_item);
        if (result == null) result = caseconstraint_body_item(foreach_constraint_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_SET:
      {
        constraint_set constraint_set = (constraint_set)theEObject;
        T result = caseconstraint_set(constraint_set);
        if (result == null) result = caseconstraint_block(constraint_set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_BLOCK:
      {
        constraint_block constraint_block = (constraint_block)theEObject;
        T result = caseconstraint_block(constraint_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_OR_SCHEME_DECLARATION:
      {
        bin_or_scheme_declaration bin_or_scheme_declaration = (bin_or_scheme_declaration)theEObject;
        T result = casebin_or_scheme_declaration(bin_or_scheme_declaration);
        if (result == null) result = casestruct_body_item(bin_or_scheme_declaration);
        if (result == null) result = casegraph_body_item(bin_or_scheme_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINS_DECLARATION:
      {
        bins_declaration bins_declaration = (bins_declaration)theEObject;
        T result = casebins_declaration(bins_declaration);
        if (result == null) result = caseportable_stimulus_description(bins_declaration);
        if (result == null) result = casebin_or_scheme_declaration(bins_declaration);
        if (result == null) result = casestruct_body_item(bins_declaration);
        if (result == null) result = casegraph_body_item(bins_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_SPECIFICATION:
      {
        bin_specification bin_specification = (bin_specification)theEObject;
        T result = casebin_specification(bin_specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_SPECIFIER:
      {
        bin_specifier bin_specifier = (bin_specifier)theEObject;
        T result = casebin_specifier(bin_specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.EXPLICIT_BIN_VALUE:
      {
        explicit_bin_value explicit_bin_value = (explicit_bin_value)theEObject;
        T result = caseexplicit_bin_value(explicit_bin_value);
        if (result == null) result = casebin_specifier(explicit_bin_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.EXPLICIT_BIN_RANGE:
      {
        explicit_bin_range explicit_bin_range = (explicit_bin_range)theEObject;
        T result = caseexplicit_bin_range(explicit_bin_range);
        if (result == null) result = casebin_range_divide(explicit_bin_range);
        if (result == null) result = casebin_range_size(explicit_bin_range);
        if (result == null) result = casebin_specifier(explicit_bin_range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_RANGE_DIVIDE:
      {
        bin_range_divide bin_range_divide = (bin_range_divide)theEObject;
        T result = casebin_range_divide(bin_range_divide);
        if (result == null) result = casebin_specifier(bin_range_divide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_RANGE_SIZE:
      {
        bin_range_size bin_range_size = (bin_range_size)theEObject;
        T result = casebin_range_size(bin_range_size);
        if (result == null) result = casebin_specifier(bin_range_size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_SCHEME_DECLARATION:
      {
        bin_scheme_declaration bin_scheme_declaration = (bin_scheme_declaration)theEObject;
        T result = casebin_scheme_declaration(bin_scheme_declaration);
        if (result == null) result = casebin_or_scheme_declaration(bin_scheme_declaration);
        if (result == null) result = casestruct_body_item(bin_scheme_declaration);
        if (result == null) result = casegraph_body_item(bin_scheme_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BIN_SCHEME_SPECIFIER:
      {
        bin_scheme_specifier bin_scheme_specifier = (bin_scheme_specifier)theEObject;
        T result = casebin_scheme_specifier(bin_scheme_specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTANT_EXPRESSION:
      {
        constant_expression constant_expression = (constant_expression)theEObject;
        T result = caseconstant_expression(constant_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseexpression_or_dist_item(expression);
        if (result == null) result = caseconstant_expression(expression);
        if (result == null) result = caseconstraint_body_item(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTERFACE_DECLARATION:
      {
        interface_declaration interface_declaration = (interface_declaration)theEObject;
        T result = caseinterface_declaration(interface_declaration);
        if (result == null) result = caseportable_stimulus_description(interface_declaration);
        if (result == null) result = casegraph_struct_ifc_declaration(interface_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTERFACE_BODY_ITEM:
      {
        interface_body_item interface_body_item = (interface_body_item)theEObject;
        T result = caseinterface_body_item(interface_body_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ACTION_DECLARATION:
      {
        action_declaration action_declaration = (action_declaration)theEObject;
        T result = caseaction_declaration(action_declaration);
        if (result == null) result = caseinterface_body_item(action_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ACTION_PORTLIST:
      {
        action_portlist action_portlist = (action_portlist)theEObject;
        T result = caseaction_portlist(action_portlist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ACTION_PORT:
      {
        action_port action_port = (action_port)theEObject;
        T result = caseaction_port(action_port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_DATA_DECLARATION:
      {
        graph_data_declaration graph_data_declaration = (graph_data_declaration)theEObject;
        T result = casegraph_data_declaration(graph_data_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SYMBOL_DECLARATION:
      {
        symbol_declaration symbol_declaration = (symbol_declaration)theEObject;
        T result = casesymbol_declaration(symbol_declaration);
        if (result == null) result = casegraph_body_item(symbol_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SYMBOL_DECL_ITEM:
      {
        symbol_decl_item symbol_decl_item = (symbol_decl_item)theEObject;
        T result = casesymbol_decl_item(symbol_decl_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.PORT_MAP:
      {
        port_map port_map = (port_map)theEObject;
        T result = caseport_map(port_map);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTANT:
      {
        constant constant = (constant)theEObject;
        T result = caseconstant(constant);
        if (result == null) result = caseexplicit_bin_value(constant);
        if (result == null) result = casebin_specifier(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.HIERARCHICAL_ID:
      {
        hierarchical_id hierarchical_id = (hierarchical_id)theEObject;
        T result = casehierarchical_id(hierarchical_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTERFACE_ACTION_ID:
      {
        interface_action_id interface_action_id = (interface_action_id)theEObject;
        T result = caseinterface_action_id(interface_action_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LITERAL:
      {
        literal literal = (literal)theEObject;
        T result = caseliteral(literal);
        if (result == null) result = caseconstant(literal);
        if (result == null) result = caseexplicit_bin_value(literal);
        if (result == null) result = casebin_specifier(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.DECIMAL_NUMBER:
      {
        decimal_number decimal_number = (decimal_number)theEObject;
        T result = casedecimal_number(decimal_number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SIZE:
      {
        size size = (size)theEObject;
        T result = casesize(size);
        if (result == null) result = casedecimal_number(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ALT_STMT:
      {
        alt_stmt alt_stmt = (alt_stmt)theEObject;
        T result = casealt_stmt(alt_stmt);
        if (result == null) result = caserule_stmt_alt_parallel_seq(alt_stmt);
        if (result == null) result = caserule_stmt_or_block(alt_stmt);
        if (result == null) result = caserule_production(alt_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STMT_ALT:
      {
        stmt_alt stmt_alt = (stmt_alt)theEObject;
        T result = casestmt_alt(stmt_alt);
        if (result == null) result = caserule_stmt_parallel_alt(stmt_alt);
        if (result == null) result = caserule_stmt_primary(stmt_alt);
        if (result == null) result = caserule_stmt_alt_parallel_seq(stmt_alt);
        if (result == null) result = caserule_stmt_or_block(stmt_alt);
        if (result == null) result = caserule_production(stmt_alt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OVERIDES_DECLARATION:
      {
        overides_declaration overides_declaration = (overides_declaration)theEObject;
        T result = caseoverides_declaration(overides_declaration);
        if (result == null) result = caseoverrides_declaration(overides_declaration);
        if (result == null) result = casegraph_body_item(overides_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONDITION_EXPR:
      {
        condition_expr condition_expr = (condition_expr)theEObject;
        T result = casecondition_expr(condition_expr);
        if (result == null) result = caseexpression(condition_expr);
        if (result == null) result = caseexpression_or_dist_item(condition_expr);
        if (result == null) result = caseconstant_expression(condition_expr);
        if (result == null) result = caseconstraint_body_item(condition_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LOGICAL_OR_EXPR:
      {
        logical_or_expr logical_or_expr = (logical_or_expr)theEObject;
        T result = caselogical_or_expr(logical_or_expr);
        if (result == null) result = caseexpression(logical_or_expr);
        if (result == null) result = caseexpression_or_dist_item(logical_or_expr);
        if (result == null) result = caseconstant_expression(logical_or_expr);
        if (result == null) result = caseconstraint_body_item(logical_or_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LOGICAL_AND_EXPR:
      {
        logical_and_expr logical_and_expr = (logical_and_expr)theEObject;
        T result = caselogical_and_expr(logical_and_expr);
        if (result == null) result = caseexpression(logical_and_expr);
        if (result == null) result = caseexpression_or_dist_item(logical_and_expr);
        if (result == null) result = caseconstant_expression(logical_and_expr);
        if (result == null) result = caseconstraint_body_item(logical_and_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_XOR_EXPR:
      {
        binary_xor_expr binary_xor_expr = (binary_xor_expr)theEObject;
        T result = casebinary_xor_expr(binary_xor_expr);
        if (result == null) result = caseexpression(binary_xor_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_xor_expr);
        if (result == null) result = caseconstant_expression(binary_xor_expr);
        if (result == null) result = caseconstraint_body_item(binary_xor_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_AND_EXPR:
      {
        binary_and_expr binary_and_expr = (binary_and_expr)theEObject;
        T result = casebinary_and_expr(binary_and_expr);
        if (result == null) result = caseexpression(binary_and_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_and_expr);
        if (result == null) result = caseconstant_expression(binary_and_expr);
        if (result == null) result = caseconstraint_body_item(binary_and_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LOGICAL_EQUALITY_EXPR:
      {
        logical_equality_expr logical_equality_expr = (logical_equality_expr)theEObject;
        T result = caselogical_equality_expr(logical_equality_expr);
        if (result == null) result = caseexpression(logical_equality_expr);
        if (result == null) result = caseexpression_or_dist_item(logical_equality_expr);
        if (result == null) result = caseconstant_expression(logical_equality_expr);
        if (result == null) result = caseconstraint_body_item(logical_equality_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LOGICAL_INEQUALITY_EXPR:
      {
        logical_inequality_expr logical_inequality_expr = (logical_inequality_expr)theEObject;
        T result = caselogical_inequality_expr(logical_inequality_expr);
        if (result == null) result = caseexpression(logical_inequality_expr);
        if (result == null) result = caseexpression_or_dist_item(logical_inequality_expr);
        if (result == null) result = caseconstant_expression(logical_inequality_expr);
        if (result == null) result = caseconstraint_body_item(logical_inequality_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_SHIFT_EXPR:
      {
        binary_shift_expr binary_shift_expr = (binary_shift_expr)theEObject;
        T result = casebinary_shift_expr(binary_shift_expr);
        if (result == null) result = caseexpression(binary_shift_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_shift_expr);
        if (result == null) result = caseconstant_expression(binary_shift_expr);
        if (result == null) result = caseconstraint_body_item(binary_shift_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_ADD_SUB_EXPR:
      {
        binary_add_sub_expr binary_add_sub_expr = (binary_add_sub_expr)theEObject;
        T result = casebinary_add_sub_expr(binary_add_sub_expr);
        if (result == null) result = caseexpression(binary_add_sub_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_add_sub_expr);
        if (result == null) result = caseconstant_expression(binary_add_sub_expr);
        if (result == null) result = caseconstraint_body_item(binary_add_sub_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_MUL_DIV_MOD_EXPR:
      {
        binary_mul_div_mod_expr binary_mul_div_mod_expr = (binary_mul_div_mod_expr)theEObject;
        T result = casebinary_mul_div_mod_expr(binary_mul_div_mod_expr);
        if (result == null) result = caseexpression(binary_mul_div_mod_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_mul_div_mod_expr);
        if (result == null) result = caseconstant_expression(binary_mul_div_mod_expr);
        if (result == null) result = caseconstraint_body_item(binary_mul_div_mod_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.BINARY_EXP_EXPR:
      {
        binary_exp_expr binary_exp_expr = (binary_exp_expr)theEObject;
        T result = casebinary_exp_expr(binary_exp_expr);
        if (result == null) result = caseexpression(binary_exp_expr);
        if (result == null) result = caseexpression_or_dist_item(binary_exp_expr);
        if (result == null) result = caseconstant_expression(binary_exp_expr);
        if (result == null) result = caseconstraint_body_item(binary_exp_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>portable stimulus description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>portable stimulus description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseportable_stimulus_description(portable_stimulus_description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph or struct declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph or struct declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_or_struct_declaration(graph_or_struct_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph struct ifc declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph struct ifc declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_struct_ifc_declaration(graph_struct_ifc_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_declaration(graph_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>port declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>port declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseport_declaration(port_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestruct_declaration(struct_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct body item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct body item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestruct_body_item(struct_body_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph body item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph body item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_body_item(graph_body_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>symbol definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>symbol definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesymbol_definition(symbol_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interface action definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interface action definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinterface_action_definition(interface_action_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule production</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule production</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_production(rule_production object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule stmt or block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule stmt or block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_stmt_or_block(rule_stmt_or_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule stmt alt parallel seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule stmt alt parallel seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_stmt_alt_parallel_seq(rule_stmt_alt_parallel_seq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule stmt primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule stmt primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_stmt_primary(rule_stmt_primary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule stmt parallel alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule stmt parallel alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_stmt_parallel_alt(rule_stmt_parallel_alt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule stmt parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule stmt parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_stmt_parallel(rule_stmt_parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_sequence(rule_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule seq item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule seq item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_seq_item(rule_seq_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule with clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule with clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_with_clause(rule_with_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter_list(parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule repeat stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule repeat stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserule_repeat_stmt(rule_repeat_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>overrides declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>overrides declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoverrides_declaration(overrides_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>override stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>override stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoverride_stmt(override_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_override(type_override object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>instance override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>instance override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinstance_override(instance_override object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>data declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>data declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedata_declaration(data_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>data instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>data instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedata_instantiation(data_instantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph interface portmap list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph interface portmap list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_interface_portmap_list(graph_interface_portmap_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph interface portmap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph interface portmap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_interface_portmap(graph_interface_portmap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>data type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>data type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedata_type(data_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>user defined type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>user defined type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseuser_defined_type(user_defined_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>typedef declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>typedef declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetypedef_declaration(typedef_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enum type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enum type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenum_type(enum_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>integer type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>integer type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinteger_type(integer_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type inside clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type inside clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_inside_clause(type_inside_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>open range list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>open range list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseopen_range_list(open_range_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>open range value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>open range value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseopen_range_value(open_range_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>range expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>range expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserange_expr(range_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constraint declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constraint declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstraint_declaration(constraint_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constraint body item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constraint body item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstraint_body_item(constraint_body_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression or dist item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression or dist item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression_or_dist_item(expression_or_dist_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>if constraint item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>if constraint item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseif_constraint_item(if_constraint_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>foreach constraint item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>foreach constraint item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforeach_constraint_item(foreach_constraint_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constraint set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constraint set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstraint_set(constraint_set object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constraint block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constraint block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstraint_block(constraint_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin or scheme declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin or scheme declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_or_scheme_declaration(bin_or_scheme_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bins declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bins declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebins_declaration(bins_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_specification(bin_specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_specifier(bin_specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>explicit bin value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>explicit bin value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexplicit_bin_value(explicit_bin_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>explicit bin range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>explicit bin range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexplicit_bin_range(explicit_bin_range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin range divide</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin range divide</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_range_divide(bin_range_divide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin range size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin range size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_range_size(bin_range_size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin scheme declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin scheme declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_scheme_declaration(bin_scheme_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin scheme specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin scheme specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_scheme_specifier(bin_scheme_specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_expression(constant_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interface declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interface declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinterface_declaration(interface_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interface body item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interface body item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinterface_body_item(interface_body_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>action declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>action declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaction_declaration(action_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>action portlist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>action portlist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaction_portlist(action_portlist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>action port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>action port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaction_port(action_port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph data declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph data declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_data_declaration(graph_data_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>symbol declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>symbol declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesymbol_declaration(symbol_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>symbol decl item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>symbol decl item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesymbol_decl_item(symbol_decl_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>port map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>port map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseport_map(port_map object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant(constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>hierarchical id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>hierarchical id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehierarchical_id(hierarchical_id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interface action id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interface action id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinterface_action_id(interface_action_id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteral(literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>decimal number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>decimal number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedecimal_number(decimal_number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesize(size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>alt stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>alt stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casealt_stmt(alt_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stmt alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stmt alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestmt_alt(stmt_alt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>overides declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>overides declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoverides_declaration(overides_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>condition expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>condition expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecondition_expr(condition_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical or expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical or expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_or_expr(logical_or_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical and expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical and expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_and_expr(logical_and_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary xor expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary xor expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_xor_expr(binary_xor_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary and expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary and expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_and_expr(binary_and_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical equality expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical equality expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_equality_expr(logical_equality_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical inequality expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical inequality expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_inequality_expr(logical_inequality_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary shift expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary shift expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_shift_expr(binary_shift_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary add sub expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary add sub expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_add_sub_expr(binary_add_sub_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary mul div mod expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary mul div mod expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_mul_div_mod_expr(binary_mul_div_mod_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binary exp expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binary exp expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinary_exp_expr(binary_exp_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PSSSwitch
