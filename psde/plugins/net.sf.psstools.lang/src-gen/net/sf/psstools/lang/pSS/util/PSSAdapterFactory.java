/**
 */
package net.sf.psstools.lang.pSS.util;

import net.sf.psstools.lang.pSS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.psstools.lang.pSS.PSSPackage
 * @generated
 */
public class PSSAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PSSPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSSAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PSSPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PSSSwitch<Adapter> modelSwitch =
    new PSSSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseportable_stimulus_description(portable_stimulus_description object)
      {
        return createportable_stimulus_descriptionAdapter();
      }
      @Override
      public Adapter casegraph_or_struct_declaration(graph_or_struct_declaration object)
      {
        return creategraph_or_struct_declarationAdapter();
      }
      @Override
      public Adapter casegraph_struct_ifc_declaration(graph_struct_ifc_declaration object)
      {
        return creategraph_struct_ifc_declarationAdapter();
      }
      @Override
      public Adapter casegraph_declaration(graph_declaration object)
      {
        return creategraph_declarationAdapter();
      }
      @Override
      public Adapter caseport_declaration(port_declaration object)
      {
        return createport_declarationAdapter();
      }
      @Override
      public Adapter casestruct_declaration(struct_declaration object)
      {
        return createstruct_declarationAdapter();
      }
      @Override
      public Adapter casestruct_body_item(struct_body_item object)
      {
        return createstruct_body_itemAdapter();
      }
      @Override
      public Adapter casegraph_body_item(graph_body_item object)
      {
        return creategraph_body_itemAdapter();
      }
      @Override
      public Adapter casesymbol_definition(symbol_definition object)
      {
        return createsymbol_definitionAdapter();
      }
      @Override
      public Adapter caseinterface_action_definition(interface_action_definition object)
      {
        return createinterface_action_definitionAdapter();
      }
      @Override
      public Adapter caserule_production(rule_production object)
      {
        return createrule_productionAdapter();
      }
      @Override
      public Adapter caserule_stmt_or_block(rule_stmt_or_block object)
      {
        return createrule_stmt_or_blockAdapter();
      }
      @Override
      public Adapter caserule_stmt_alt_parallel_seq(rule_stmt_alt_parallel_seq object)
      {
        return createrule_stmt_alt_parallel_seqAdapter();
      }
      @Override
      public Adapter caserule_stmt_primary(rule_stmt_primary object)
      {
        return createrule_stmt_primaryAdapter();
      }
      @Override
      public Adapter caserule_stmt_parallel_alt(rule_stmt_parallel_alt object)
      {
        return createrule_stmt_parallel_altAdapter();
      }
      @Override
      public Adapter caserule_stmt_parallel(rule_stmt_parallel object)
      {
        return createrule_stmt_parallelAdapter();
      }
      @Override
      public Adapter caserule_sequence(rule_sequence object)
      {
        return createrule_sequenceAdapter();
      }
      @Override
      public Adapter caserule_seq_item(rule_seq_item object)
      {
        return createrule_seq_itemAdapter();
      }
      @Override
      public Adapter caserule_with_clause(rule_with_clause object)
      {
        return createrule_with_clauseAdapter();
      }
      @Override
      public Adapter caseparameter_list(parameter_list object)
      {
        return createparameter_listAdapter();
      }
      @Override
      public Adapter caserule_repeat_stmt(rule_repeat_stmt object)
      {
        return createrule_repeat_stmtAdapter();
      }
      @Override
      public Adapter caseoverrides_declaration(overrides_declaration object)
      {
        return createoverrides_declarationAdapter();
      }
      @Override
      public Adapter caseoverride_stmt(override_stmt object)
      {
        return createoverride_stmtAdapter();
      }
      @Override
      public Adapter casetype_override(type_override object)
      {
        return createtype_overrideAdapter();
      }
      @Override
      public Adapter caseinstance_override(instance_override object)
      {
        return createinstance_overrideAdapter();
      }
      @Override
      public Adapter casedata_declaration(data_declaration object)
      {
        return createdata_declarationAdapter();
      }
      @Override
      public Adapter casedata_instantiation(data_instantiation object)
      {
        return createdata_instantiationAdapter();
      }
      @Override
      public Adapter casegraph_interface_portmap_list(graph_interface_portmap_list object)
      {
        return creategraph_interface_portmap_listAdapter();
      }
      @Override
      public Adapter casegraph_interface_portmap(graph_interface_portmap object)
      {
        return creategraph_interface_portmapAdapter();
      }
      @Override
      public Adapter casedata_type(data_type object)
      {
        return createdata_typeAdapter();
      }
      @Override
      public Adapter caseuser_defined_type(user_defined_type object)
      {
        return createuser_defined_typeAdapter();
      }
      @Override
      public Adapter casetypedef_declaration(typedef_declaration object)
      {
        return createtypedef_declarationAdapter();
      }
      @Override
      public Adapter caseenum_type(enum_type object)
      {
        return createenum_typeAdapter();
      }
      @Override
      public Adapter caseinteger_type(integer_type object)
      {
        return createinteger_typeAdapter();
      }
      @Override
      public Adapter casetype_inside_clause(type_inside_clause object)
      {
        return createtype_inside_clauseAdapter();
      }
      @Override
      public Adapter caseopen_range_list(open_range_list object)
      {
        return createopen_range_listAdapter();
      }
      @Override
      public Adapter caseopen_range_value(open_range_value object)
      {
        return createopen_range_valueAdapter();
      }
      @Override
      public Adapter caserange_expr(range_expr object)
      {
        return createrange_exprAdapter();
      }
      @Override
      public Adapter caseconstraint_declaration(constraint_declaration object)
      {
        return createconstraint_declarationAdapter();
      }
      @Override
      public Adapter caseconstraint_body_item(constraint_body_item object)
      {
        return createconstraint_body_itemAdapter();
      }
      @Override
      public Adapter caseexpression_or_dist_item(expression_or_dist_item object)
      {
        return createexpression_or_dist_itemAdapter();
      }
      @Override
      public Adapter caseif_constraint_item(if_constraint_item object)
      {
        return createif_constraint_itemAdapter();
      }
      @Override
      public Adapter caseforeach_constraint_item(foreach_constraint_item object)
      {
        return createforeach_constraint_itemAdapter();
      }
      @Override
      public Adapter caseconstraint_set(constraint_set object)
      {
        return createconstraint_setAdapter();
      }
      @Override
      public Adapter caseconstraint_block(constraint_block object)
      {
        return createconstraint_blockAdapter();
      }
      @Override
      public Adapter casebin_or_scheme_declaration(bin_or_scheme_declaration object)
      {
        return createbin_or_scheme_declarationAdapter();
      }
      @Override
      public Adapter casebins_declaration(bins_declaration object)
      {
        return createbins_declarationAdapter();
      }
      @Override
      public Adapter casebin_specification(bin_specification object)
      {
        return createbin_specificationAdapter();
      }
      @Override
      public Adapter casebin_specifier(bin_specifier object)
      {
        return createbin_specifierAdapter();
      }
      @Override
      public Adapter caseexplicit_bin_value(explicit_bin_value object)
      {
        return createexplicit_bin_valueAdapter();
      }
      @Override
      public Adapter caseexplicit_bin_range(explicit_bin_range object)
      {
        return createexplicit_bin_rangeAdapter();
      }
      @Override
      public Adapter casebin_range_divide(bin_range_divide object)
      {
        return createbin_range_divideAdapter();
      }
      @Override
      public Adapter casebin_range_size(bin_range_size object)
      {
        return createbin_range_sizeAdapter();
      }
      @Override
      public Adapter casebin_scheme_declaration(bin_scheme_declaration object)
      {
        return createbin_scheme_declarationAdapter();
      }
      @Override
      public Adapter casebin_scheme_specifier(bin_scheme_specifier object)
      {
        return createbin_scheme_specifierAdapter();
      }
      @Override
      public Adapter caseconstant_expression(constant_expression object)
      {
        return createconstant_expressionAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter caseinterface_declaration(interface_declaration object)
      {
        return createinterface_declarationAdapter();
      }
      @Override
      public Adapter caseinterface_body_item(interface_body_item object)
      {
        return createinterface_body_itemAdapter();
      }
      @Override
      public Adapter caseaction_declaration(action_declaration object)
      {
        return createaction_declarationAdapter();
      }
      @Override
      public Adapter caseaction_portlist(action_portlist object)
      {
        return createaction_portlistAdapter();
      }
      @Override
      public Adapter caseaction_port(action_port object)
      {
        return createaction_portAdapter();
      }
      @Override
      public Adapter casegraph_data_declaration(graph_data_declaration object)
      {
        return creategraph_data_declarationAdapter();
      }
      @Override
      public Adapter casesymbol_declaration(symbol_declaration object)
      {
        return createsymbol_declarationAdapter();
      }
      @Override
      public Adapter casesymbol_decl_item(symbol_decl_item object)
      {
        return createsymbol_decl_itemAdapter();
      }
      @Override
      public Adapter caseport_map(port_map object)
      {
        return createport_mapAdapter();
      }
      @Override
      public Adapter caseconstant(constant object)
      {
        return createconstantAdapter();
      }
      @Override
      public Adapter casehierarchical_id(hierarchical_id object)
      {
        return createhierarchical_idAdapter();
      }
      @Override
      public Adapter caseinterface_action_id(interface_action_id object)
      {
        return createinterface_action_idAdapter();
      }
      @Override
      public Adapter caseliteral(literal object)
      {
        return createliteralAdapter();
      }
      @Override
      public Adapter casedecimal_number(decimal_number object)
      {
        return createdecimal_numberAdapter();
      }
      @Override
      public Adapter casesize(size object)
      {
        return createsizeAdapter();
      }
      @Override
      public Adapter casealt_stmt(alt_stmt object)
      {
        return createalt_stmtAdapter();
      }
      @Override
      public Adapter casestmt_alt(stmt_alt object)
      {
        return createstmt_altAdapter();
      }
      @Override
      public Adapter caseoverides_declaration(overides_declaration object)
      {
        return createoverides_declarationAdapter();
      }
      @Override
      public Adapter casecondition_expr(condition_expr object)
      {
        return createcondition_exprAdapter();
      }
      @Override
      public Adapter caselogical_or_expr(logical_or_expr object)
      {
        return createlogical_or_exprAdapter();
      }
      @Override
      public Adapter caselogical_and_expr(logical_and_expr object)
      {
        return createlogical_and_exprAdapter();
      }
      @Override
      public Adapter casebinary_xor_expr(binary_xor_expr object)
      {
        return createbinary_xor_exprAdapter();
      }
      @Override
      public Adapter casebinary_and_expr(binary_and_expr object)
      {
        return createbinary_and_exprAdapter();
      }
      @Override
      public Adapter caselogical_equality_expr(logical_equality_expr object)
      {
        return createlogical_equality_exprAdapter();
      }
      @Override
      public Adapter caselogical_inequality_expr(logical_inequality_expr object)
      {
        return createlogical_inequality_exprAdapter();
      }
      @Override
      public Adapter casebinary_shift_expr(binary_shift_expr object)
      {
        return createbinary_shift_exprAdapter();
      }
      @Override
      public Adapter casebinary_add_sub_expr(binary_add_sub_expr object)
      {
        return createbinary_add_sub_exprAdapter();
      }
      @Override
      public Adapter casebinary_mul_div_mod_expr(binary_mul_div_mod_expr object)
      {
        return createbinary_mul_div_mod_exprAdapter();
      }
      @Override
      public Adapter casebinary_exp_expr(binary_exp_expr object)
      {
        return createbinary_exp_exprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.portable_stimulus_description <em>portable stimulus description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.portable_stimulus_description
   * @generated
   */
  public Adapter createportable_stimulus_descriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_or_struct_declaration <em>graph or struct declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_or_struct_declaration
   * @generated
   */
  public Adapter creategraph_or_struct_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_struct_ifc_declaration <em>graph struct ifc declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_struct_ifc_declaration
   * @generated
   */
  public Adapter creategraph_struct_ifc_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_declaration <em>graph declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_declaration
   * @generated
   */
  public Adapter creategraph_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.port_declaration <em>port declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.port_declaration
   * @generated
   */
  public Adapter createport_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.struct_declaration <em>struct declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.struct_declaration
   * @generated
   */
  public Adapter createstruct_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.struct_body_item <em>struct body item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.struct_body_item
   * @generated
   */
  public Adapter createstruct_body_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_body_item <em>graph body item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_body_item
   * @generated
   */
  public Adapter creategraph_body_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.symbol_definition <em>symbol definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.symbol_definition
   * @generated
   */
  public Adapter createsymbol_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.interface_action_definition <em>interface action definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.interface_action_definition
   * @generated
   */
  public Adapter createinterface_action_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_production <em>rule production</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_production
   * @generated
   */
  public Adapter createrule_productionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_stmt_or_block <em>rule stmt or block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_stmt_or_block
   * @generated
   */
  public Adapter createrule_stmt_or_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_stmt_alt_parallel_seq <em>rule stmt alt parallel seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_stmt_alt_parallel_seq
   * @generated
   */
  public Adapter createrule_stmt_alt_parallel_seqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_stmt_primary <em>rule stmt primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_stmt_primary
   * @generated
   */
  public Adapter createrule_stmt_primaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel_alt <em>rule stmt parallel alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel_alt
   * @generated
   */
  public Adapter createrule_stmt_parallel_altAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_stmt_parallel <em>rule stmt parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_stmt_parallel
   * @generated
   */
  public Adapter createrule_stmt_parallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_sequence <em>rule sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_sequence
   * @generated
   */
  public Adapter createrule_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_seq_item <em>rule seq item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_seq_item
   * @generated
   */
  public Adapter createrule_seq_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_with_clause <em>rule with clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_with_clause
   * @generated
   */
  public Adapter createrule_with_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.parameter_list <em>parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.parameter_list
   * @generated
   */
  public Adapter createparameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.rule_repeat_stmt <em>rule repeat stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.rule_repeat_stmt
   * @generated
   */
  public Adapter createrule_repeat_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.overrides_declaration <em>overrides declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.overrides_declaration
   * @generated
   */
  public Adapter createoverrides_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.override_stmt <em>override stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.override_stmt
   * @generated
   */
  public Adapter createoverride_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.type_override <em>type override</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.type_override
   * @generated
   */
  public Adapter createtype_overrideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.instance_override <em>instance override</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.instance_override
   * @generated
   */
  public Adapter createinstance_overrideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.data_declaration <em>data declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.data_declaration
   * @generated
   */
  public Adapter createdata_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.data_instantiation <em>data instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.data_instantiation
   * @generated
   */
  public Adapter createdata_instantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_interface_portmap_list <em>graph interface portmap list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap_list
   * @generated
   */
  public Adapter creategraph_interface_portmap_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_interface_portmap <em>graph interface portmap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_interface_portmap
   * @generated
   */
  public Adapter creategraph_interface_portmapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.data_type <em>data type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.data_type
   * @generated
   */
  public Adapter createdata_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.user_defined_type <em>user defined type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.user_defined_type
   * @generated
   */
  public Adapter createuser_defined_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.typedef_declaration <em>typedef declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.typedef_declaration
   * @generated
   */
  public Adapter createtypedef_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.enum_type <em>enum type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.enum_type
   * @generated
   */
  public Adapter createenum_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.integer_type <em>integer type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.integer_type
   * @generated
   */
  public Adapter createinteger_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.type_inside_clause <em>type inside clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.type_inside_clause
   * @generated
   */
  public Adapter createtype_inside_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.open_range_list <em>open range list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.open_range_list
   * @generated
   */
  public Adapter createopen_range_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.open_range_value <em>open range value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.open_range_value
   * @generated
   */
  public Adapter createopen_range_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.range_expr <em>range expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.range_expr
   * @generated
   */
  public Adapter createrange_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constraint_declaration <em>constraint declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constraint_declaration
   * @generated
   */
  public Adapter createconstraint_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constraint_body_item <em>constraint body item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constraint_body_item
   * @generated
   */
  public Adapter createconstraint_body_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.expression_or_dist_item <em>expression or dist item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.expression_or_dist_item
   * @generated
   */
  public Adapter createexpression_or_dist_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.if_constraint_item <em>if constraint item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.if_constraint_item
   * @generated
   */
  public Adapter createif_constraint_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.foreach_constraint_item <em>foreach constraint item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.foreach_constraint_item
   * @generated
   */
  public Adapter createforeach_constraint_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constraint_set <em>constraint set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constraint_set
   * @generated
   */
  public Adapter createconstraint_setAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constraint_block <em>constraint block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constraint_block
   * @generated
   */
  public Adapter createconstraint_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_or_scheme_declaration <em>bin or scheme declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_or_scheme_declaration
   * @generated
   */
  public Adapter createbin_or_scheme_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bins_declaration <em>bins declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bins_declaration
   * @generated
   */
  public Adapter createbins_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_specification <em>bin specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_specification
   * @generated
   */
  public Adapter createbin_specificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_specifier <em>bin specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_specifier
   * @generated
   */
  public Adapter createbin_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.explicit_bin_value <em>explicit bin value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.explicit_bin_value
   * @generated
   */
  public Adapter createexplicit_bin_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.explicit_bin_range <em>explicit bin range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.explicit_bin_range
   * @generated
   */
  public Adapter createexplicit_bin_rangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_range_divide <em>bin range divide</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_range_divide
   * @generated
   */
  public Adapter createbin_range_divideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_range_size <em>bin range size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_range_size
   * @generated
   */
  public Adapter createbin_range_sizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_scheme_declaration <em>bin scheme declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_scheme_declaration
   * @generated
   */
  public Adapter createbin_scheme_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.bin_scheme_specifier <em>bin scheme specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.bin_scheme_specifier
   * @generated
   */
  public Adapter createbin_scheme_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constant_expression
   * @generated
   */
  public Adapter createconstant_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.interface_declaration <em>interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.interface_declaration
   * @generated
   */
  public Adapter createinterface_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.interface_body_item <em>interface body item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.interface_body_item
   * @generated
   */
  public Adapter createinterface_body_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.action_declaration <em>action declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.action_declaration
   * @generated
   */
  public Adapter createaction_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.action_portlist <em>action portlist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.action_portlist
   * @generated
   */
  public Adapter createaction_portlistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.action_port <em>action port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.action_port
   * @generated
   */
  public Adapter createaction_portAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_data_declaration <em>graph data declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_data_declaration
   * @generated
   */
  public Adapter creategraph_data_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.symbol_declaration <em>symbol declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.symbol_declaration
   * @generated
   */
  public Adapter createsymbol_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.symbol_decl_item <em>symbol decl item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.symbol_decl_item
   * @generated
   */
  public Adapter createsymbol_decl_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.port_map <em>port map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.port_map
   * @generated
   */
  public Adapter createport_mapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constant
   * @generated
   */
  public Adapter createconstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.hierarchical_id <em>hierarchical id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.hierarchical_id
   * @generated
   */
  public Adapter createhierarchical_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.interface_action_id <em>interface action id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.interface_action_id
   * @generated
   */
  public Adapter createinterface_action_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.literal <em>literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.literal
   * @generated
   */
  public Adapter createliteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.decimal_number <em>decimal number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.decimal_number
   * @generated
   */
  public Adapter createdecimal_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.size <em>size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.size
   * @generated
   */
  public Adapter createsizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.alt_stmt <em>alt stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.alt_stmt
   * @generated
   */
  public Adapter createalt_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.stmt_alt <em>stmt alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.stmt_alt
   * @generated
   */
  public Adapter createstmt_altAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.overides_declaration <em>overides declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.overides_declaration
   * @generated
   */
  public Adapter createoverides_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.condition_expr <em>condition expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.condition_expr
   * @generated
   */
  public Adapter createcondition_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.logical_or_expr <em>logical or expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.logical_or_expr
   * @generated
   */
  public Adapter createlogical_or_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.logical_and_expr <em>logical and expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.logical_and_expr
   * @generated
   */
  public Adapter createlogical_and_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_xor_expr <em>binary xor expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_xor_expr
   * @generated
   */
  public Adapter createbinary_xor_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_and_expr <em>binary and expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_and_expr
   * @generated
   */
  public Adapter createbinary_and_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.logical_equality_expr <em>logical equality expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.logical_equality_expr
   * @generated
   */
  public Adapter createlogical_equality_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.logical_inequality_expr <em>logical inequality expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.logical_inequality_expr
   * @generated
   */
  public Adapter createlogical_inequality_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_shift_expr <em>binary shift expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_shift_expr
   * @generated
   */
  public Adapter createbinary_shift_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_add_sub_expr <em>binary add sub expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_add_sub_expr
   * @generated
   */
  public Adapter createbinary_add_sub_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_mul_div_mod_expr <em>binary mul div mod expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_mul_div_mod_expr
   * @generated
   */
  public Adapter createbinary_mul_div_mod_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.binary_exp_expr <em>binary exp expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.binary_exp_expr
   * @generated
   */
  public Adapter createbinary_exp_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PSSAdapterFactory
