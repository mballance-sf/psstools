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
      case PSSPackage.STRUCT_GRAPH_BODY_ITEM:
      {
        struct_graph_body_item struct_graph_body_item = (struct_graph_body_item)theEObject;
        T result = casestruct_graph_body_item(struct_graph_body_item);
        if (result == null) result = casestruct_body_item(struct_graph_body_item);
        if (result == null) result = casegraph_body_item(struct_graph_body_item);
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
      case PSSPackage.RULE_PRODUCTION:
      {
        rule_production rule_production = (rule_production)theEObject;
        T result = caserule_production(rule_production);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STMT_OR_BLOCK:
      {
        stmt_or_block stmt_or_block = (stmt_or_block)theEObject;
        T result = casestmt_or_block(stmt_or_block);
        if (result == null) result = caserule_production(stmt_or_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.ALT_STMT:
      {
        alt_stmt alt_stmt = (alt_stmt)theEObject;
        T result = casealt_stmt(alt_stmt);
        if (result == null) result = casestmt_or_block(alt_stmt);
        if (result == null) result = caserule_production(alt_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STMT_PRIMARY:
      {
        stmt_primary stmt_primary = (stmt_primary)theEObject;
        T result = casestmt_primary(stmt_primary);
        if (result == null) result = casealt_stmt(stmt_primary);
        if (result == null) result = casestmt_or_block(stmt_primary);
        if (result == null) result = caserule_production(stmt_primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STMT_ALT:
      {
        stmt_alt stmt_alt = (stmt_alt)theEObject;
        T result = casestmt_alt(stmt_alt);
        if (result == null) result = casestmt_primary(stmt_alt);
        if (result == null) result = casealt_stmt(stmt_alt);
        if (result == null) result = casestmt_or_block(stmt_alt);
        if (result == null) result = caserule_production(stmt_alt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STMT_PARALLEL:
      {
        stmt_parallel stmt_parallel = (stmt_parallel)theEObject;
        T result = casestmt_parallel(stmt_parallel);
        if (result == null) result = casestmt_alt(stmt_parallel);
        if (result == null) result = casestmt_primary(stmt_parallel);
        if (result == null) result = casealt_stmt(stmt_parallel);
        if (result == null) result = casestmt_or_block(stmt_parallel);
        if (result == null) result = caserule_production(stmt_parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SEQ:
      {
        seq seq = (seq)theEObject;
        T result = caseseq(seq);
        if (result == null) result = casestmt_parallel(seq);
        if (result == null) result = casestmt_alt(seq);
        if (result == null) result = casestmt_primary(seq);
        if (result == null) result = casealt_stmt(seq);
        if (result == null) result = casestmt_or_block(seq);
        if (result == null) result = caserule_production(seq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.SEQ_ITEM:
      {
        seq_item seq_item = (seq_item)theEObject;
        T result = caseseq_item(seq_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.IFC_CALL_PARAMETER_LIST:
      {
        ifc_call_parameter_list ifc_call_parameter_list = (ifc_call_parameter_list)theEObject;
        T result = caseifc_call_parameter_list(ifc_call_parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.REPEAT_STMT:
      {
        repeat_stmt repeat_stmt = (repeat_stmt)theEObject;
        T result = caserepeat_stmt(repeat_stmt);
        if (result == null) result = casestmt_or_block(repeat_stmt);
        if (result == null) result = caserule_production(repeat_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.OVERRIDES_DECLARATION:
      {
        overrides_declaration overrides_declaration = (overrides_declaration)theEObject;
        T result = caseoverrides_declaration(overrides_declaration);
        if (result == null) result = casestruct_graph_body_item(overrides_declaration);
        if (result == null) result = casestruct_body_item(overrides_declaration);
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
      case PSSPackage.CONSTRAINT_DECLARATION:
      {
        constraint_declaration constraint_declaration = (constraint_declaration)theEObject;
        T result = caseconstraint_declaration(constraint_declaration);
        if (result == null) result = casestruct_graph_body_item(constraint_declaration);
        if (result == null) result = casestruct_body_item(constraint_declaration);
        if (result == null) result = casegraph_body_item(constraint_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_BODY_NO_IF_ITEM:
      {
        constraint_body_no_if_item constraint_body_no_if_item = (constraint_body_no_if_item)theEObject;
        T result = caseconstraint_body_no_if_item(constraint_body_no_if_item);
        if (result == null) result = caseconstraint_body_item(constraint_body_no_if_item);
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
        if (result == null) result = caseconstraint_body_no_if_item(expression_or_dist_item);
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
        if (result == null) result = caseconstraint_body_no_if_item(foreach_constraint_item);
        if (result == null) result = caseconstraint_body_item(foreach_constraint_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.CONSTRAINT_SET:
      {
        constraint_set constraint_set = (constraint_set)theEObject;
        T result = caseconstraint_set(constraint_set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseexpression_or_dist_item(expression);
        if (result == null) result = caseconstraint_body_no_if_item(expression);
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
      case PSSPackage.GRAPH_DATA_DECLARATION:
      {
        graph_data_declaration graph_data_declaration = (graph_data_declaration)theEObject;
        T result = casegraph_data_declaration(graph_data_declaration);
        if (result == null) result = casegraph_body_item(graph_data_declaration);
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
      case PSSPackage.PORT_MAP:
      {
        port_map port_map = (port_map)theEObject;
        T result = caseport_map(port_map);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STRUCT_DATA_DECLARATION:
      {
        struct_data_declaration struct_data_declaration = (struct_data_declaration)theEObject;
        T result = casestruct_data_declaration(struct_data_declaration);
        if (result == null) result = casestruct_body_item(struct_data_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.GRAPH_DATATYPE:
      {
        graph_datatype graph_datatype = (graph_datatype)theEObject;
        T result = casegraph_datatype(graph_datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.STRUCT_DATATYPE:
      {
        struct_datatype struct_datatype = (struct_datatype)theEObject;
        T result = casestruct_datatype(struct_datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.PRIMITIVE_DATATYPE:
      {
        primitive_datatype primitive_datatype = (primitive_datatype)theEObject;
        T result = caseprimitive_datatype(primitive_datatype);
        if (result == null) result = caseaction_portlist(primitive_datatype);
        if (result == null) result = casegraph_datatype(primitive_datatype);
        if (result == null) result = casestruct_datatype(primitive_datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.INTEGER_TYPE:
      {
        integer_type integer_type = (integer_type)theEObject;
        T result = caseinteger_type(integer_type);
        if (result == null) result = caseprimitive_datatype(integer_type);
        if (result == null) result = caseaction_portlist(integer_type);
        if (result == null) result = casegraph_datatype(integer_type);
        if (result == null) result = casestruct_datatype(integer_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.HIERARCHICAL_ID:
      {
        hierarchical_id hierarchical_id = (hierarchical_id)theEObject;
        T result = casehierarchical_id(hierarchical_id);
        if (result == null) result = caseseq_item(hierarchical_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PSSPackage.LITERAL:
      {
        literal literal = (literal)theEObject;
        T result = caseliteral(literal);
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
      case PSSPackage.OVERIDES_DECLARATION:
      {
        overides_declaration overides_declaration = (overides_declaration)theEObject;
        T result = caseoverides_declaration(overides_declaration);
        if (result == null) result = caseoverrides_declaration(overides_declaration);
        if (result == null) result = casestruct_graph_body_item(overides_declaration);
        if (result == null) result = casestruct_body_item(overides_declaration);
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
        if (result == null) result = caseconstraint_body_no_if_item(condition_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(logical_or_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(logical_and_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_xor_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_and_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(logical_equality_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(logical_inequality_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_shift_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_add_sub_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_mul_div_mod_expr);
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
        if (result == null) result = caseconstraint_body_no_if_item(binary_exp_expr);
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
   * Returns the result of interpreting the object as an instance of '<em>struct graph body item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct graph body item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestruct_graph_body_item(struct_graph_body_item object)
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
   * Returns the result of interpreting the object as an instance of '<em>stmt or block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stmt or block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestmt_or_block(stmt_or_block object)
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
   * Returns the result of interpreting the object as an instance of '<em>stmt primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stmt primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestmt_primary(stmt_primary object)
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
   * Returns the result of interpreting the object as an instance of '<em>stmt parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stmt parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestmt_parallel(stmt_parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseseq(seq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>seq item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>seq item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseseq_item(seq_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ifc call parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ifc call parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseifc_call_parameter_list(ifc_call_parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>repeat stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>repeat stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserepeat_stmt(repeat_stmt object)
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
   * Returns the result of interpreting the object as an instance of '<em>constraint body no if item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constraint body no if item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstraint_body_no_if_item(constraint_body_no_if_item object)
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
   * Returns the result of interpreting the object as an instance of '<em>struct data declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct data declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestruct_data_declaration(struct_data_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph_datatype(graph_datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestruct_datatype(struct_datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primitive datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primitive datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimitive_datatype(primitive_datatype object)
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
