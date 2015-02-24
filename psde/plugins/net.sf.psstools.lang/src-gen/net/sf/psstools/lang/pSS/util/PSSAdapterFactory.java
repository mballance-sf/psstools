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
      public Adapter casestruct_graph_body_item(struct_graph_body_item object)
      {
        return createstruct_graph_body_itemAdapter();
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
      public Adapter caserule_production(rule_production object)
      {
        return createrule_productionAdapter();
      }
      @Override
      public Adapter casestmt_or_block(stmt_or_block object)
      {
        return createstmt_or_blockAdapter();
      }
      @Override
      public Adapter casealt_stmt(alt_stmt object)
      {
        return createalt_stmtAdapter();
      }
      @Override
      public Adapter casestmt_primary(stmt_primary object)
      {
        return createstmt_primaryAdapter();
      }
      @Override
      public Adapter casestmt_alt(stmt_alt object)
      {
        return createstmt_altAdapter();
      }
      @Override
      public Adapter casestmt_parallel(stmt_parallel object)
      {
        return createstmt_parallelAdapter();
      }
      @Override
      public Adapter caseseq(seq object)
      {
        return createseqAdapter();
      }
      @Override
      public Adapter caseseq_item(seq_item object)
      {
        return createseq_itemAdapter();
      }
      @Override
      public Adapter caseifc_call_parameter_list(ifc_call_parameter_list object)
      {
        return createifc_call_parameter_listAdapter();
      }
      @Override
      public Adapter caserepeat_stmt(repeat_stmt object)
      {
        return createrepeat_stmtAdapter();
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
      public Adapter casetypedef_declaration(typedef_declaration object)
      {
        return createtypedef_declarationAdapter();
      }
      @Override
      public Adapter caseenum_declaration(enum_declaration object)
      {
        return createenum_declarationAdapter();
      }
      @Override
      public Adapter casescalar_declaration(scalar_declaration object)
      {
        return createscalar_declarationAdapter();
      }
      @Override
      public Adapter casesigned_scalar(signed_scalar object)
      {
        return createsigned_scalarAdapter();
      }
      @Override
      public Adapter casescalar_signed(scalar_signed object)
      {
        return createscalar_signedAdapter();
      }
      @Override
      public Adapter casedomain_spec(domain_spec object)
      {
        return createdomain_specAdapter();
      }
      @Override
      public Adapter caseconstraint_declaration(constraint_declaration object)
      {
        return createconstraint_declarationAdapter();
      }
      @Override
      public Adapter caseconstraint_body_no_if_item(constraint_body_no_if_item object)
      {
        return createconstraint_body_no_if_itemAdapter();
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
      public Adapter caseport_map(port_map object)
      {
        return createport_mapAdapter();
      }
      @Override
      public Adapter casestruct_data_declaration(struct_data_declaration object)
      {
        return createstruct_data_declarationAdapter();
      }
      @Override
      public Adapter casegraph_datatype(graph_datatype object)
      {
        return creategraph_datatypeAdapter();
      }
      @Override
      public Adapter casestruct_datatype(struct_datatype object)
      {
        return createstruct_datatypeAdapter();
      }
      @Override
      public Adapter caseprimitive_datatype(primitive_datatype object)
      {
        return createprimitive_datatypeAdapter();
      }
      @Override
      public Adapter caseinteger_type(integer_type object)
      {
        return createinteger_typeAdapter();
      }
      @Override
      public Adapter casehierarchical_id(hierarchical_id object)
      {
        return createhierarchical_idAdapter();
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.struct_graph_body_item <em>struct graph body item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.struct_graph_body_item
   * @generated
   */
  public Adapter createstruct_graph_body_itemAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.stmt_or_block <em>stmt or block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.stmt_or_block
   * @generated
   */
  public Adapter createstmt_or_blockAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.stmt_primary <em>stmt primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.stmt_primary
   * @generated
   */
  public Adapter createstmt_primaryAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.stmt_parallel <em>stmt parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.stmt_parallel
   * @generated
   */
  public Adapter createstmt_parallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.seq <em>seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.seq
   * @generated
   */
  public Adapter createseqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.seq_item <em>seq item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.seq_item
   * @generated
   */
  public Adapter createseq_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.ifc_call_parameter_list <em>ifc call parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.ifc_call_parameter_list
   * @generated
   */
  public Adapter createifc_call_parameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.repeat_stmt <em>repeat stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.repeat_stmt
   * @generated
   */
  public Adapter createrepeat_stmtAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.enum_declaration <em>enum declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.enum_declaration
   * @generated
   */
  public Adapter createenum_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.scalar_declaration <em>scalar declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.scalar_declaration
   * @generated
   */
  public Adapter createscalar_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.signed_scalar <em>signed scalar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.signed_scalar
   * @generated
   */
  public Adapter createsigned_scalarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.scalar_signed <em>scalar signed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.scalar_signed
   * @generated
   */
  public Adapter createscalar_signedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.domain_spec <em>domain spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.domain_spec
   * @generated
   */
  public Adapter createdomain_specAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.constraint_body_no_if_item <em>constraint body no if item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.constraint_body_no_if_item
   * @generated
   */
  public Adapter createconstraint_body_no_if_itemAdapter()
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
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.struct_data_declaration <em>struct data declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.struct_data_declaration
   * @generated
   */
  public Adapter createstruct_data_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.graph_datatype <em>graph datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.graph_datatype
   * @generated
   */
  public Adapter creategraph_datatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.struct_datatype <em>struct datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.struct_datatype
   * @generated
   */
  public Adapter createstruct_datatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.psstools.lang.pSS.primitive_datatype <em>primitive datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.psstools.lang.pSS.primitive_datatype
   * @generated
   */
  public Adapter createprimitive_datatypeAdapter()
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
