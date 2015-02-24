/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.PSSFactory;
import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.action_declaration;
import net.sf.psstools.lang.pSS.action_port;
import net.sf.psstools.lang.pSS.action_portlist;
import net.sf.psstools.lang.pSS.alt_stmt;
import net.sf.psstools.lang.pSS.bin_or_scheme_declaration;
import net.sf.psstools.lang.pSS.bin_range_divide;
import net.sf.psstools.lang.pSS.bin_range_size;
import net.sf.psstools.lang.pSS.bin_scheme_declaration;
import net.sf.psstools.lang.pSS.bin_scheme_specifier;
import net.sf.psstools.lang.pSS.bin_specification;
import net.sf.psstools.lang.pSS.bin_specifier;
import net.sf.psstools.lang.pSS.binary_add_sub_expr;
import net.sf.psstools.lang.pSS.binary_and_expr;
import net.sf.psstools.lang.pSS.binary_exp_expr;
import net.sf.psstools.lang.pSS.binary_mul_div_mod_expr;
import net.sf.psstools.lang.pSS.binary_shift_expr;
import net.sf.psstools.lang.pSS.binary_xor_expr;
import net.sf.psstools.lang.pSS.bins_declaration;
import net.sf.psstools.lang.pSS.condition_expr;
import net.sf.psstools.lang.pSS.constant;
import net.sf.psstools.lang.pSS.constant_expression;
import net.sf.psstools.lang.pSS.constraint_block;
import net.sf.psstools.lang.pSS.constraint_body_item;
import net.sf.psstools.lang.pSS.constraint_declaration;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.data_declaration;
import net.sf.psstools.lang.pSS.data_instantiation;
import net.sf.psstools.lang.pSS.data_type;
import net.sf.psstools.lang.pSS.decimal_number;
import net.sf.psstools.lang.pSS.enum_type;
import net.sf.psstools.lang.pSS.explicit_bin_range;
import net.sf.psstools.lang.pSS.explicit_bin_value;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.expression_or_dist_item;
import net.sf.psstools.lang.pSS.foreach_constraint_item;
import net.sf.psstools.lang.pSS.graph_body_item;
import net.sf.psstools.lang.pSS.graph_data_declaration;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_interface_portmap;
import net.sf.psstools.lang.pSS.graph_interface_portmap_list;
import net.sf.psstools.lang.pSS.graph_or_struct_declaration;
import net.sf.psstools.lang.pSS.graph_struct_ifc_declaration;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.if_constraint_item;
import net.sf.psstools.lang.pSS.instance_override;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.interface_action_definition;
import net.sf.psstools.lang.pSS.interface_action_id;
import net.sf.psstools.lang.pSS.interface_body_item;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.literal;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_inequality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;
import net.sf.psstools.lang.pSS.open_range_list;
import net.sf.psstools.lang.pSS.open_range_value;
import net.sf.psstools.lang.pSS.overides_declaration;
import net.sf.psstools.lang.pSS.override_stmt;
import net.sf.psstools.lang.pSS.overrides_declaration;
import net.sf.psstools.lang.pSS.parameter_list;
import net.sf.psstools.lang.pSS.port_declaration;
import net.sf.psstools.lang.pSS.port_map;
import net.sf.psstools.lang.pSS.portable_stimulus_description;
import net.sf.psstools.lang.pSS.range_expr;
import net.sf.psstools.lang.pSS.rule_production;
import net.sf.psstools.lang.pSS.rule_repeat_stmt;
import net.sf.psstools.lang.pSS.rule_seq_item;
import net.sf.psstools.lang.pSS.rule_sequence;
import net.sf.psstools.lang.pSS.rule_stmt_alt_parallel_seq;
import net.sf.psstools.lang.pSS.rule_stmt_or_block;
import net.sf.psstools.lang.pSS.rule_stmt_parallel;
import net.sf.psstools.lang.pSS.rule_stmt_parallel_alt;
import net.sf.psstools.lang.pSS.rule_stmt_primary;
import net.sf.psstools.lang.pSS.rule_with_clause;
import net.sf.psstools.lang.pSS.size;
import net.sf.psstools.lang.pSS.stmt_alt;
import net.sf.psstools.lang.pSS.struct_body_item;
import net.sf.psstools.lang.pSS.struct_declaration;
import net.sf.psstools.lang.pSS.symbol_decl_item;
import net.sf.psstools.lang.pSS.symbol_declaration;
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.type_inside_clause;
import net.sf.psstools.lang.pSS.type_override;
import net.sf.psstools.lang.pSS.typedef_declaration;
import net.sf.psstools.lang.pSS.user_defined_type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PSSPackageImpl extends EPackageImpl implements PSSPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portable_stimulus_descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_or_struct_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_struct_ifc_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass port_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_body_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_body_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbol_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_action_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_productionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_stmt_or_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_stmt_alt_parallel_seqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_stmt_primaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_stmt_parallel_altEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_stmt_parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_seq_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_with_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rule_repeat_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overrides_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass override_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_overrideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instance_overrideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_instantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_interface_portmap_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_interface_portmapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass user_defined_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedef_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integer_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_inside_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass open_range_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass open_range_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass range_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraint_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraint_body_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_or_dist_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_constraint_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreach_constraint_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraint_setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraint_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_or_scheme_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bins_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicit_bin_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicit_bin_rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_range_divideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_range_sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_scheme_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_scheme_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_body_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass action_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass action_portlistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass action_portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_data_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbol_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbol_decl_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass port_mapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hierarchical_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_action_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimal_numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alt_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmt_altEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overides_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condition_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_or_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_and_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_xor_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_and_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_equality_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_inequality_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_shift_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_add_sub_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_mul_div_mod_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binary_exp_exprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.sf.psstools.lang.pSS.PSSPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PSSPackageImpl()
  {
    super(eNS_URI, PSSFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PSSPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PSSPackage init()
  {
    if (isInited) return (PSSPackage)EPackage.Registry.INSTANCE.getEPackage(PSSPackage.eNS_URI);

    // Obtain or create and register package
    PSSPackageImpl thePSSPackage = (PSSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PSSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PSSPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePSSPackage.createPackageContents();

    // Initialize created meta-data
    thePSSPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePSSPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PSSPackage.eNS_URI, thePSSPackage);
    return thePSSPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Root()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getportable_stimulus_description()
  {
    return portable_stimulus_descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_or_struct_declaration()
  {
    return graph_or_struct_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_struct_ifc_declaration()
  {
    return graph_struct_ifc_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_declaration()
  {
    return graph_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_declaration_Name()
  {
    return (EAttribute)graph_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_declaration_Ports()
  {
    return (EReference)graph_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_declaration_Super()
  {
    return (EReference)graph_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_declaration_Body()
  {
    return (EReference)graph_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getport_declaration()
  {
    return port_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getport_declaration_Ifc_type()
  {
    return (EReference)port_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getport_declaration_Name()
  {
    return (EAttribute)port_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstruct_declaration()
  {
    return struct_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstruct_declaration_Name()
  {
    return (EAttribute)struct_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstruct_declaration_Super()
  {
    return (EReference)struct_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstruct_declaration_Body()
  {
    return (EReference)struct_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstruct_body_item()
  {
    return struct_body_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_body_item()
  {
    return graph_body_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsymbol_definition()
  {
    return symbol_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsymbol_definition_Symbol_name()
  {
    return (EAttribute)symbol_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsymbol_definition_Body_items()
  {
    return (EReference)symbol_definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinterface_action_definition()
  {
    return interface_action_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_action_definition_Action()
  {
    return (EReference)interface_action_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_action_definition_Parameters()
  {
    return (EReference)interface_action_definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_action_definition_Body_items()
  {
    return (EReference)interface_action_definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_production()
  {
    return rule_productionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_stmt_or_block()
  {
    return rule_stmt_or_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_stmt_alt_parallel_seq()
  {
    return rule_stmt_alt_parallel_seqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_stmt_primary()
  {
    return rule_stmt_primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrule_stmt_primary_Param()
  {
    return (EAttribute)rule_stmt_primaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_stmt_primary_Rhs()
  {
    return (EReference)rule_stmt_primaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_stmt_primary_Stmt_list()
  {
    return (EReference)rule_stmt_primaryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_stmt_parallel_alt()
  {
    return rule_stmt_parallel_altEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_stmt_parallel_alt_Left()
  {
    return (EReference)rule_stmt_parallel_altEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_stmt_parallel_alt_Right()
  {
    return (EReference)rule_stmt_parallel_altEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_stmt_parallel()
  {
    return rule_stmt_parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_sequence()
  {
    return rule_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_sequence_Items()
  {
    return (EReference)rule_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_seq_item()
  {
    return rule_seq_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_seq_item_Action()
  {
    return (EReference)rule_seq_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_seq_item_Action_params()
  {
    return (EReference)rule_seq_itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrule_seq_item_Item()
  {
    return (EAttribute)rule_seq_itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_seq_item_With_clause()
  {
    return (EReference)rule_seq_itemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_with_clause()
  {
    return rule_with_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_with_clause_Body()
  {
    return (EReference)rule_with_clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_list()
  {
    return parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_list_Parameters()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrule_repeat_stmt()
  {
    return rule_repeat_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_repeat_stmt_Expr()
  {
    return (EReference)rule_repeat_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrule_repeat_stmt_Stmt()
  {
    return (EReference)rule_repeat_stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoverrides_declaration()
  {
    return overrides_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoverride_stmt()
  {
    return override_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getoverride_stmt_Dest()
  {
    return (EAttribute)override_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_override()
  {
    return type_overrideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettype_override_Src()
  {
    return (EAttribute)type_overrideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinstance_override()
  {
    return instance_overrideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinstance_override_Src()
  {
    return (EReference)instance_overrideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdata_declaration()
  {
    return data_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdata_declaration_Type()
  {
    return (EReference)data_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdata_declaration_Instances()
  {
    return (EReference)data_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdata_instantiation()
  {
    return data_instantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdata_instantiation_Name()
  {
    return (EAttribute)data_instantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdata_instantiation_Portmap()
  {
    return (EReference)data_instantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_interface_portmap_list()
  {
    return graph_interface_portmap_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_interface_portmap_list_Maps()
  {
    return (EReference)graph_interface_portmap_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_interface_portmap()
  {
    return graph_interface_portmapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_interface_portmap_Portname()
  {
    return (EAttribute)graph_interface_portmapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_interface_portmap_Connected_name()
  {
    return (EReference)graph_interface_portmapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdata_type()
  {
    return data_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getuser_defined_type()
  {
    return user_defined_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getuser_defined_type_Typename()
  {
    return (EAttribute)user_defined_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettypedef_declaration()
  {
    return typedef_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettypedef_declaration_Type()
  {
    return (EReference)typedef_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettypedef_declaration_Type_identifier()
  {
    return (EAttribute)typedef_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenum_type()
  {
    return enum_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenum_type_Data_type()
  {
    return (EReference)enum_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getenum_type_Items()
  {
    return (EAttribute)enum_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinteger_type()
  {
    return integer_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteger_type_Atom_type()
  {
    return (EAttribute)integer_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteger_type_Lhs()
  {
    return (EReference)integer_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteger_type_Rhs()
  {
    return (EReference)integer_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteger_type_Inside()
  {
    return (EReference)integer_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_inside_clause()
  {
    return type_inside_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_inside_clause_Domain()
  {
    return (EReference)type_inside_clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getopen_range_list()
  {
    return open_range_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getopen_range_list_Ranges()
  {
    return (EReference)open_range_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getopen_range_value()
  {
    return open_range_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getopen_range_value_Lhs()
  {
    return (EReference)open_range_valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getopen_range_value_Range()
  {
    return (EReference)open_range_valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrange_expr()
  {
    return range_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrange_expr_Lhs()
  {
    return (EReference)range_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrange_expr_Rhs()
  {
    return (EReference)range_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstraint_declaration()
  {
    return constraint_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstraint_declaration_Name()
  {
    return (EAttribute)constraint_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstraint_declaration_Body()
  {
    return (EReference)constraint_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstraint_body_item()
  {
    return constraint_body_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression_or_dist_item()
  {
    return expression_or_dist_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getif_constraint_item()
  {
    return if_constraint_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_constraint_item_If_expr()
  {
    return (EReference)if_constraint_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_constraint_item_True_case()
  {
    return (EReference)if_constraint_itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_constraint_item_False_set()
  {
    return (EReference)if_constraint_itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getforeach_constraint_item()
  {
    return foreach_constraint_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getforeach_constraint_item_Expr()
  {
    return (EReference)foreach_constraint_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getforeach_constraint_item_Body()
  {
    return (EReference)foreach_constraint_itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstraint_set()
  {
    return constraint_setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstraint_set_Items()
  {
    return (EReference)constraint_setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstraint_block()
  {
    return constraint_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_or_scheme_declaration()
  {
    return bin_or_scheme_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbin_or_scheme_declaration_Name()
  {
    return (EAttribute)bin_or_scheme_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbins_declaration()
  {
    return bins_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbins_declaration_Item()
  {
    return (EAttribute)bins_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbins_declaration_Bins()
  {
    return (EReference)bins_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_specification()
  {
    return bin_specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbin_specification_Items()
  {
    return (EReference)bin_specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_specifier()
  {
    return bin_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexplicit_bin_value()
  {
    return explicit_bin_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexplicit_bin_range()
  {
    return explicit_bin_rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexplicit_bin_range_Low()
  {
    return (EReference)explicit_bin_rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexplicit_bin_range_High()
  {
    return (EReference)explicit_bin_rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexplicit_bin_range_Div()
  {
    return (EReference)explicit_bin_rangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexplicit_bin_range_Size()
  {
    return (EReference)explicit_bin_rangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_range_divide()
  {
    return bin_range_divideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_range_size()
  {
    return bin_range_sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_scheme_declaration()
  {
    return bin_scheme_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbin_scheme_declaration_Items()
  {
    return (EReference)bin_scheme_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_scheme_specifier()
  {
    return bin_scheme_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbin_scheme_specifier_Name()
  {
    return (EAttribute)bin_scheme_specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbin_scheme_specifier_Spec()
  {
    return (EReference)bin_scheme_specifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_expression()
  {
    return constant_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Impl_constraint()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Expr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Lhs()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Rhs()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Left()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinterface_declaration()
  {
    return interface_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinterface_declaration_Name()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_declaration_Super()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinterface_declaration_Body()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinterface_body_item()
  {
    return interface_body_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaction_declaration()
  {
    return action_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaction_declaration_Name()
  {
    return (EAttribute)action_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_declaration_Ports()
  {
    return (EReference)action_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaction_portlist()
  {
    return action_portlistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_portlist_Ports()
  {
    return (EReference)action_portlistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaction_port()
  {
    return action_portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_port_Type()
  {
    return (EReference)action_portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaction_port_Name()
  {
    return (EAttribute)action_portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_data_declaration()
  {
    return graph_data_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_data_declaration_Type()
  {
    return (EReference)graph_data_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_data_declaration_Names()
  {
    return (EAttribute)graph_data_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_data_declaration_Portmaps()
  {
    return (EReference)graph_data_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsymbol_declaration()
  {
    return symbol_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsymbol_declaration_Decl_list()
  {
    return (EReference)symbol_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsymbol_declaration_Inline_rule()
  {
    return (EReference)symbol_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsymbol_decl_item()
  {
    return symbol_decl_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsymbol_decl_item_Name()
  {
    return (EAttribute)symbol_decl_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsymbol_decl_item_Parameters()
  {
    return (EReference)symbol_decl_itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getport_map()
  {
    return port_mapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getport_map_Port()
  {
    return (EAttribute)port_mapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getport_map_Map()
  {
    return (EReference)port_mapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethierarchical_id()
  {
    return hierarchical_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gethierarchical_id_Value()
  {
    return (EAttribute)hierarchical_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinterface_action_id()
  {
    return interface_action_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinterface_action_id_Ifc()
  {
    return (EAttribute)interface_action_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinterface_action_id_Action()
  {
    return (EAttribute)interface_action_idEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getliteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_Value()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdecimal_number()
  {
    return decimal_numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdecimal_number_Value()
  {
    return (EAttribute)decimal_numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getalt_stmt()
  {
    return alt_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getalt_stmt_Left()
  {
    return (EReference)alt_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getalt_stmt_Right()
  {
    return (EReference)alt_stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstmt_alt()
  {
    return stmt_altEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoverides_declaration()
  {
    return overides_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoverides_declaration_Overrides()
  {
    return (EReference)overides_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcondition_expr()
  {
    return condition_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcondition_expr_True_expr()
  {
    return (EReference)condition_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcondition_expr_False_expr()
  {
    return (EReference)condition_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_or_expr()
  {
    return logical_or_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_or_expr_Right()
  {
    return (EReference)logical_or_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_and_expr()
  {
    return logical_and_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_and_expr_Right()
  {
    return (EReference)logical_and_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_xor_expr()
  {
    return binary_xor_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_xor_expr_Right()
  {
    return (EReference)binary_xor_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_and_expr()
  {
    return binary_and_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_and_expr_Right()
  {
    return (EReference)binary_and_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_equality_expr()
  {
    return logical_equality_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlogical_equality_expr_Op()
  {
    return (EAttribute)logical_equality_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_equality_expr_Right()
  {
    return (EReference)logical_equality_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_inequality_expr()
  {
    return logical_inequality_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlogical_inequality_expr_Op()
  {
    return (EAttribute)logical_inequality_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_inequality_expr_Right()
  {
    return (EReference)logical_inequality_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_shift_expr()
  {
    return binary_shift_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbinary_shift_expr_Op()
  {
    return (EAttribute)binary_shift_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_shift_expr_Right()
  {
    return (EReference)binary_shift_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_add_sub_expr()
  {
    return binary_add_sub_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbinary_add_sub_expr_Op()
  {
    return (EAttribute)binary_add_sub_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_add_sub_expr_Right()
  {
    return (EReference)binary_add_sub_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_mul_div_mod_expr()
  {
    return binary_mul_div_mod_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbinary_mul_div_mod_expr_Op()
  {
    return (EAttribute)binary_mul_div_mod_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_mul_div_mod_expr_Right()
  {
    return (EReference)binary_mul_div_mod_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbinary_exp_expr()
  {
    return binary_exp_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbinary_exp_expr_Right()
  {
    return (EReference)binary_exp_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSSFactory getPSSFactory()
  {
    return (PSSFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ROOT);

    portable_stimulus_descriptionEClass = createEClass(PORTABLE_STIMULUS_DESCRIPTION);

    graph_or_struct_declarationEClass = createEClass(GRAPH_OR_STRUCT_DECLARATION);

    graph_struct_ifc_declarationEClass = createEClass(GRAPH_STRUCT_IFC_DECLARATION);

    graph_declarationEClass = createEClass(GRAPH_DECLARATION);
    createEAttribute(graph_declarationEClass, GRAPH_DECLARATION__NAME);
    createEReference(graph_declarationEClass, GRAPH_DECLARATION__PORTS);
    createEReference(graph_declarationEClass, GRAPH_DECLARATION__SUPER);
    createEReference(graph_declarationEClass, GRAPH_DECLARATION__BODY);

    port_declarationEClass = createEClass(PORT_DECLARATION);
    createEReference(port_declarationEClass, PORT_DECLARATION__IFC_TYPE);
    createEAttribute(port_declarationEClass, PORT_DECLARATION__NAME);

    struct_declarationEClass = createEClass(STRUCT_DECLARATION);
    createEAttribute(struct_declarationEClass, STRUCT_DECLARATION__NAME);
    createEReference(struct_declarationEClass, STRUCT_DECLARATION__SUPER);
    createEReference(struct_declarationEClass, STRUCT_DECLARATION__BODY);

    struct_body_itemEClass = createEClass(STRUCT_BODY_ITEM);

    graph_body_itemEClass = createEClass(GRAPH_BODY_ITEM);

    symbol_definitionEClass = createEClass(SYMBOL_DEFINITION);
    createEAttribute(symbol_definitionEClass, SYMBOL_DEFINITION__SYMBOL_NAME);
    createEReference(symbol_definitionEClass, SYMBOL_DEFINITION__BODY_ITEMS);

    interface_action_definitionEClass = createEClass(INTERFACE_ACTION_DEFINITION);
    createEReference(interface_action_definitionEClass, INTERFACE_ACTION_DEFINITION__ACTION);
    createEReference(interface_action_definitionEClass, INTERFACE_ACTION_DEFINITION__PARAMETERS);
    createEReference(interface_action_definitionEClass, INTERFACE_ACTION_DEFINITION__BODY_ITEMS);

    rule_productionEClass = createEClass(RULE_PRODUCTION);

    rule_stmt_or_blockEClass = createEClass(RULE_STMT_OR_BLOCK);

    rule_stmt_alt_parallel_seqEClass = createEClass(RULE_STMT_ALT_PARALLEL_SEQ);

    rule_stmt_primaryEClass = createEClass(RULE_STMT_PRIMARY);
    createEAttribute(rule_stmt_primaryEClass, RULE_STMT_PRIMARY__PARAM);
    createEReference(rule_stmt_primaryEClass, RULE_STMT_PRIMARY__RHS);
    createEReference(rule_stmt_primaryEClass, RULE_STMT_PRIMARY__STMT_LIST);

    rule_stmt_parallel_altEClass = createEClass(RULE_STMT_PARALLEL_ALT);
    createEReference(rule_stmt_parallel_altEClass, RULE_STMT_PARALLEL_ALT__LEFT);
    createEReference(rule_stmt_parallel_altEClass, RULE_STMT_PARALLEL_ALT__RIGHT);

    rule_stmt_parallelEClass = createEClass(RULE_STMT_PARALLEL);

    rule_sequenceEClass = createEClass(RULE_SEQUENCE);
    createEReference(rule_sequenceEClass, RULE_SEQUENCE__ITEMS);

    rule_seq_itemEClass = createEClass(RULE_SEQ_ITEM);
    createEReference(rule_seq_itemEClass, RULE_SEQ_ITEM__ACTION);
    createEReference(rule_seq_itemEClass, RULE_SEQ_ITEM__ACTION_PARAMS);
    createEAttribute(rule_seq_itemEClass, RULE_SEQ_ITEM__ITEM);
    createEReference(rule_seq_itemEClass, RULE_SEQ_ITEM__WITH_CLAUSE);

    rule_with_clauseEClass = createEClass(RULE_WITH_CLAUSE);
    createEReference(rule_with_clauseEClass, RULE_WITH_CLAUSE__BODY);

    parameter_listEClass = createEClass(PARAMETER_LIST);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETERS);

    rule_repeat_stmtEClass = createEClass(RULE_REPEAT_STMT);
    createEReference(rule_repeat_stmtEClass, RULE_REPEAT_STMT__EXPR);
    createEReference(rule_repeat_stmtEClass, RULE_REPEAT_STMT__STMT);

    overrides_declarationEClass = createEClass(OVERRIDES_DECLARATION);

    override_stmtEClass = createEClass(OVERRIDE_STMT);
    createEAttribute(override_stmtEClass, OVERRIDE_STMT__DEST);

    type_overrideEClass = createEClass(TYPE_OVERRIDE);
    createEAttribute(type_overrideEClass, TYPE_OVERRIDE__SRC);

    instance_overrideEClass = createEClass(INSTANCE_OVERRIDE);
    createEReference(instance_overrideEClass, INSTANCE_OVERRIDE__SRC);

    data_declarationEClass = createEClass(DATA_DECLARATION);
    createEReference(data_declarationEClass, DATA_DECLARATION__TYPE);
    createEReference(data_declarationEClass, DATA_DECLARATION__INSTANCES);

    data_instantiationEClass = createEClass(DATA_INSTANTIATION);
    createEAttribute(data_instantiationEClass, DATA_INSTANTIATION__NAME);
    createEReference(data_instantiationEClass, DATA_INSTANTIATION__PORTMAP);

    graph_interface_portmap_listEClass = createEClass(GRAPH_INTERFACE_PORTMAP_LIST);
    createEReference(graph_interface_portmap_listEClass, GRAPH_INTERFACE_PORTMAP_LIST__MAPS);

    graph_interface_portmapEClass = createEClass(GRAPH_INTERFACE_PORTMAP);
    createEAttribute(graph_interface_portmapEClass, GRAPH_INTERFACE_PORTMAP__PORTNAME);
    createEReference(graph_interface_portmapEClass, GRAPH_INTERFACE_PORTMAP__CONNECTED_NAME);

    data_typeEClass = createEClass(DATA_TYPE);

    user_defined_typeEClass = createEClass(USER_DEFINED_TYPE);
    createEAttribute(user_defined_typeEClass, USER_DEFINED_TYPE__TYPENAME);

    typedef_declarationEClass = createEClass(TYPEDEF_DECLARATION);
    createEReference(typedef_declarationEClass, TYPEDEF_DECLARATION__TYPE);
    createEAttribute(typedef_declarationEClass, TYPEDEF_DECLARATION__TYPE_IDENTIFIER);

    enum_typeEClass = createEClass(ENUM_TYPE);
    createEReference(enum_typeEClass, ENUM_TYPE__DATA_TYPE);
    createEAttribute(enum_typeEClass, ENUM_TYPE__ITEMS);

    integer_typeEClass = createEClass(INTEGER_TYPE);
    createEAttribute(integer_typeEClass, INTEGER_TYPE__ATOM_TYPE);
    createEReference(integer_typeEClass, INTEGER_TYPE__LHS);
    createEReference(integer_typeEClass, INTEGER_TYPE__RHS);
    createEReference(integer_typeEClass, INTEGER_TYPE__INSIDE);

    type_inside_clauseEClass = createEClass(TYPE_INSIDE_CLAUSE);
    createEReference(type_inside_clauseEClass, TYPE_INSIDE_CLAUSE__DOMAIN);

    open_range_listEClass = createEClass(OPEN_RANGE_LIST);
    createEReference(open_range_listEClass, OPEN_RANGE_LIST__RANGES);

    open_range_valueEClass = createEClass(OPEN_RANGE_VALUE);
    createEReference(open_range_valueEClass, OPEN_RANGE_VALUE__LHS);
    createEReference(open_range_valueEClass, OPEN_RANGE_VALUE__RANGE);

    range_exprEClass = createEClass(RANGE_EXPR);
    createEReference(range_exprEClass, RANGE_EXPR__LHS);
    createEReference(range_exprEClass, RANGE_EXPR__RHS);

    constraint_declarationEClass = createEClass(CONSTRAINT_DECLARATION);
    createEAttribute(constraint_declarationEClass, CONSTRAINT_DECLARATION__NAME);
    createEReference(constraint_declarationEClass, CONSTRAINT_DECLARATION__BODY);

    constraint_body_itemEClass = createEClass(CONSTRAINT_BODY_ITEM);

    expression_or_dist_itemEClass = createEClass(EXPRESSION_OR_DIST_ITEM);

    if_constraint_itemEClass = createEClass(IF_CONSTRAINT_ITEM);
    createEReference(if_constraint_itemEClass, IF_CONSTRAINT_ITEM__IF_EXPR);
    createEReference(if_constraint_itemEClass, IF_CONSTRAINT_ITEM__TRUE_CASE);
    createEReference(if_constraint_itemEClass, IF_CONSTRAINT_ITEM__FALSE_SET);

    foreach_constraint_itemEClass = createEClass(FOREACH_CONSTRAINT_ITEM);
    createEReference(foreach_constraint_itemEClass, FOREACH_CONSTRAINT_ITEM__EXPR);
    createEReference(foreach_constraint_itemEClass, FOREACH_CONSTRAINT_ITEM__BODY);

    constraint_setEClass = createEClass(CONSTRAINT_SET);
    createEReference(constraint_setEClass, CONSTRAINT_SET__ITEMS);

    constraint_blockEClass = createEClass(CONSTRAINT_BLOCK);

    bin_or_scheme_declarationEClass = createEClass(BIN_OR_SCHEME_DECLARATION);
    createEAttribute(bin_or_scheme_declarationEClass, BIN_OR_SCHEME_DECLARATION__NAME);

    bins_declarationEClass = createEClass(BINS_DECLARATION);
    createEAttribute(bins_declarationEClass, BINS_DECLARATION__ITEM);
    createEReference(bins_declarationEClass, BINS_DECLARATION__BINS);

    bin_specificationEClass = createEClass(BIN_SPECIFICATION);
    createEReference(bin_specificationEClass, BIN_SPECIFICATION__ITEMS);

    bin_specifierEClass = createEClass(BIN_SPECIFIER);

    explicit_bin_valueEClass = createEClass(EXPLICIT_BIN_VALUE);

    explicit_bin_rangeEClass = createEClass(EXPLICIT_BIN_RANGE);
    createEReference(explicit_bin_rangeEClass, EXPLICIT_BIN_RANGE__LOW);
    createEReference(explicit_bin_rangeEClass, EXPLICIT_BIN_RANGE__HIGH);
    createEReference(explicit_bin_rangeEClass, EXPLICIT_BIN_RANGE__DIV);
    createEReference(explicit_bin_rangeEClass, EXPLICIT_BIN_RANGE__SIZE);

    bin_range_divideEClass = createEClass(BIN_RANGE_DIVIDE);

    bin_range_sizeEClass = createEClass(BIN_RANGE_SIZE);

    bin_scheme_declarationEClass = createEClass(BIN_SCHEME_DECLARATION);
    createEReference(bin_scheme_declarationEClass, BIN_SCHEME_DECLARATION__ITEMS);

    bin_scheme_specifierEClass = createEClass(BIN_SCHEME_SPECIFIER);
    createEAttribute(bin_scheme_specifierEClass, BIN_SCHEME_SPECIFIER__NAME);
    createEReference(bin_scheme_specifierEClass, BIN_SCHEME_SPECIFIER__SPEC);

    constant_expressionEClass = createEClass(CONSTANT_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__IMPL_CONSTRAINT);
    createEReference(expressionEClass, EXPRESSION__EXPR);
    createEReference(expressionEClass, EXPRESSION__LHS);
    createEReference(expressionEClass, EXPRESSION__RHS);
    createEReference(expressionEClass, EXPRESSION__LEFT);

    interface_declarationEClass = createEClass(INTERFACE_DECLARATION);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__NAME);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__SUPER);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__BODY);

    interface_body_itemEClass = createEClass(INTERFACE_BODY_ITEM);

    action_declarationEClass = createEClass(ACTION_DECLARATION);
    createEAttribute(action_declarationEClass, ACTION_DECLARATION__NAME);
    createEReference(action_declarationEClass, ACTION_DECLARATION__PORTS);

    action_portlistEClass = createEClass(ACTION_PORTLIST);
    createEReference(action_portlistEClass, ACTION_PORTLIST__PORTS);

    action_portEClass = createEClass(ACTION_PORT);
    createEReference(action_portEClass, ACTION_PORT__TYPE);
    createEAttribute(action_portEClass, ACTION_PORT__NAME);

    graph_data_declarationEClass = createEClass(GRAPH_DATA_DECLARATION);
    createEReference(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__TYPE);
    createEAttribute(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__NAMES);
    createEReference(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__PORTMAPS);

    symbol_declarationEClass = createEClass(SYMBOL_DECLARATION);
    createEReference(symbol_declarationEClass, SYMBOL_DECLARATION__DECL_LIST);
    createEReference(symbol_declarationEClass, SYMBOL_DECLARATION__INLINE_RULE);

    symbol_decl_itemEClass = createEClass(SYMBOL_DECL_ITEM);
    createEAttribute(symbol_decl_itemEClass, SYMBOL_DECL_ITEM__NAME);
    createEReference(symbol_decl_itemEClass, SYMBOL_DECL_ITEM__PARAMETERS);

    port_mapEClass = createEClass(PORT_MAP);
    createEAttribute(port_mapEClass, PORT_MAP__PORT);
    createEReference(port_mapEClass, PORT_MAP__MAP);

    constantEClass = createEClass(CONSTANT);

    hierarchical_idEClass = createEClass(HIERARCHICAL_ID);
    createEAttribute(hierarchical_idEClass, HIERARCHICAL_ID__VALUE);

    interface_action_idEClass = createEClass(INTERFACE_ACTION_ID);
    createEAttribute(interface_action_idEClass, INTERFACE_ACTION_ID__IFC);
    createEAttribute(interface_action_idEClass, INTERFACE_ACTION_ID__ACTION);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__VALUE);

    decimal_numberEClass = createEClass(DECIMAL_NUMBER);
    createEAttribute(decimal_numberEClass, DECIMAL_NUMBER__VALUE);

    sizeEClass = createEClass(SIZE);

    alt_stmtEClass = createEClass(ALT_STMT);
    createEReference(alt_stmtEClass, ALT_STMT__LEFT);
    createEReference(alt_stmtEClass, ALT_STMT__RIGHT);

    stmt_altEClass = createEClass(STMT_ALT);

    overides_declarationEClass = createEClass(OVERIDES_DECLARATION);
    createEReference(overides_declarationEClass, OVERIDES_DECLARATION__OVERRIDES);

    condition_exprEClass = createEClass(CONDITION_EXPR);
    createEReference(condition_exprEClass, CONDITION_EXPR__TRUE_EXPR);
    createEReference(condition_exprEClass, CONDITION_EXPR__FALSE_EXPR);

    logical_or_exprEClass = createEClass(LOGICAL_OR_EXPR);
    createEReference(logical_or_exprEClass, LOGICAL_OR_EXPR__RIGHT);

    logical_and_exprEClass = createEClass(LOGICAL_AND_EXPR);
    createEReference(logical_and_exprEClass, LOGICAL_AND_EXPR__RIGHT);

    binary_xor_exprEClass = createEClass(BINARY_XOR_EXPR);
    createEReference(binary_xor_exprEClass, BINARY_XOR_EXPR__RIGHT);

    binary_and_exprEClass = createEClass(BINARY_AND_EXPR);
    createEReference(binary_and_exprEClass, BINARY_AND_EXPR__RIGHT);

    logical_equality_exprEClass = createEClass(LOGICAL_EQUALITY_EXPR);
    createEAttribute(logical_equality_exprEClass, LOGICAL_EQUALITY_EXPR__OP);
    createEReference(logical_equality_exprEClass, LOGICAL_EQUALITY_EXPR__RIGHT);

    logical_inequality_exprEClass = createEClass(LOGICAL_INEQUALITY_EXPR);
    createEAttribute(logical_inequality_exprEClass, LOGICAL_INEQUALITY_EXPR__OP);
    createEReference(logical_inequality_exprEClass, LOGICAL_INEQUALITY_EXPR__RIGHT);

    binary_shift_exprEClass = createEClass(BINARY_SHIFT_EXPR);
    createEAttribute(binary_shift_exprEClass, BINARY_SHIFT_EXPR__OP);
    createEReference(binary_shift_exprEClass, BINARY_SHIFT_EXPR__RIGHT);

    binary_add_sub_exprEClass = createEClass(BINARY_ADD_SUB_EXPR);
    createEAttribute(binary_add_sub_exprEClass, BINARY_ADD_SUB_EXPR__OP);
    createEReference(binary_add_sub_exprEClass, BINARY_ADD_SUB_EXPR__RIGHT);

    binary_mul_div_mod_exprEClass = createEClass(BINARY_MUL_DIV_MOD_EXPR);
    createEAttribute(binary_mul_div_mod_exprEClass, BINARY_MUL_DIV_MOD_EXPR__OP);
    createEReference(binary_mul_div_mod_exprEClass, BINARY_MUL_DIV_MOD_EXPR__RIGHT);

    binary_exp_exprEClass = createEClass(BINARY_EXP_EXPR);
    createEReference(binary_exp_exprEClass, BINARY_EXP_EXPR__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    graph_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    graph_declarationEClass.getESuperTypes().add(this.getgraph_or_struct_declaration());
    graph_declarationEClass.getESuperTypes().add(this.getgraph_struct_ifc_declaration());
    struct_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    struct_declarationEClass.getESuperTypes().add(this.getgraph_or_struct_declaration());
    struct_declarationEClass.getESuperTypes().add(this.getgraph_struct_ifc_declaration());
    symbol_definitionEClass.getESuperTypes().add(this.getgraph_body_item());
    interface_action_definitionEClass.getESuperTypes().add(this.getgraph_body_item());
    rule_stmt_or_blockEClass.getESuperTypes().add(this.getrule_production());
    rule_stmt_alt_parallel_seqEClass.getESuperTypes().add(this.getrule_stmt_or_block());
    rule_stmt_primaryEClass.getESuperTypes().add(this.getrule_stmt_alt_parallel_seq());
    rule_stmt_parallel_altEClass.getESuperTypes().add(this.getrule_stmt_primary());
    rule_stmt_parallelEClass.getESuperTypes().add(this.getrule_stmt_parallel_alt());
    rule_sequenceEClass.getESuperTypes().add(this.getrule_stmt_parallel());
    rule_repeat_stmtEClass.getESuperTypes().add(this.getrule_stmt_or_block());
    overrides_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    type_overrideEClass.getESuperTypes().add(this.getoverride_stmt());
    instance_overrideEClass.getESuperTypes().add(this.getoverride_stmt());
    data_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    data_declarationEClass.getESuperTypes().add(this.getstruct_body_item());
    data_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    user_defined_typeEClass.getESuperTypes().add(this.getdata_type());
    typedef_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    typedef_declarationEClass.getESuperTypes().add(this.getstruct_body_item());
    typedef_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    enum_typeEClass.getESuperTypes().add(this.getdata_type());
    integer_typeEClass.getESuperTypes().add(this.getdata_type());
    constraint_declarationEClass.getESuperTypes().add(this.getstruct_body_item());
    constraint_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    expression_or_dist_itemEClass.getESuperTypes().add(this.getconstraint_body_item());
    if_constraint_itemEClass.getESuperTypes().add(this.getconstraint_body_item());
    foreach_constraint_itemEClass.getESuperTypes().add(this.getconstraint_body_item());
    constraint_setEClass.getESuperTypes().add(this.getconstraint_block());
    bin_or_scheme_declarationEClass.getESuperTypes().add(this.getstruct_body_item());
    bin_or_scheme_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    bins_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    bins_declarationEClass.getESuperTypes().add(this.getbin_or_scheme_declaration());
    explicit_bin_valueEClass.getESuperTypes().add(this.getbin_specifier());
    explicit_bin_rangeEClass.getESuperTypes().add(this.getbin_specifier());
    explicit_bin_rangeEClass.getESuperTypes().add(this.getbin_range_divide());
    explicit_bin_rangeEClass.getESuperTypes().add(this.getbin_range_size());
    bin_range_divideEClass.getESuperTypes().add(this.getbin_specifier());
    bin_range_sizeEClass.getESuperTypes().add(this.getbin_specifier());
    bin_scheme_declarationEClass.getESuperTypes().add(this.getbin_or_scheme_declaration());
    expressionEClass.getESuperTypes().add(this.getexpression_or_dist_item());
    expressionEClass.getESuperTypes().add(this.getconstant_expression());
    interface_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    interface_declarationEClass.getESuperTypes().add(this.getgraph_struct_ifc_declaration());
    action_declarationEClass.getESuperTypes().add(this.getinterface_body_item());
    symbol_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    constantEClass.getESuperTypes().add(this.getexplicit_bin_value());
    literalEClass.getESuperTypes().add(this.getconstant());
    sizeEClass.getESuperTypes().add(this.getdecimal_number());
    alt_stmtEClass.getESuperTypes().add(this.getrule_stmt_alt_parallel_seq());
    stmt_altEClass.getESuperTypes().add(this.getrule_stmt_parallel_alt());
    overides_declarationEClass.getESuperTypes().add(this.getoverrides_declaration());
    condition_exprEClass.getESuperTypes().add(this.getexpression());
    logical_or_exprEClass.getESuperTypes().add(this.getexpression());
    logical_and_exprEClass.getESuperTypes().add(this.getexpression());
    binary_xor_exprEClass.getESuperTypes().add(this.getexpression());
    binary_and_exprEClass.getESuperTypes().add(this.getexpression());
    logical_equality_exprEClass.getESuperTypes().add(this.getexpression());
    logical_inequality_exprEClass.getESuperTypes().add(this.getexpression());
    binary_shift_exprEClass.getESuperTypes().add(this.getexpression());
    binary_add_sub_exprEClass.getESuperTypes().add(this.getexpression());
    binary_mul_div_mod_exprEClass.getESuperTypes().add(this.getexpression());
    binary_exp_exprEClass.getESuperTypes().add(this.getexpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Root(), this.getportable_stimulus_description(), null, "root", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portable_stimulus_descriptionEClass, portable_stimulus_description.class, "portable_stimulus_description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graph_or_struct_declarationEClass, graph_or_struct_declaration.class, "graph_or_struct_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graph_struct_ifc_declarationEClass, graph_struct_ifc_declaration.class, "graph_struct_ifc_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graph_declarationEClass, graph_declaration.class, "graph_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgraph_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, graph_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_declaration_Ports(), this.getport_declaration(), null, "ports", null, 0, -1, graph_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_declaration_Super(), this.getgraph_or_struct_declaration(), null, "super", null, 0, 1, graph_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_declaration_Body(), this.getgraph_body_item(), null, "body", null, 0, -1, graph_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(port_declarationEClass, port_declaration.class, "port_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getport_declaration_Ifc_type(), this.getinterface_declaration(), null, "ifc_type", null, 0, 1, port_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getport_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, port_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_declarationEClass, struct_declaration.class, "struct_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstruct_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, struct_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstruct_declaration_Super(), this.getstruct_declaration(), null, "super", null, 0, 1, struct_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstruct_declaration_Body(), this.getstruct_body_item(), null, "body", null, 0, -1, struct_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_body_itemEClass, struct_body_item.class, "struct_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graph_body_itemEClass, graph_body_item.class, "graph_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbol_definitionEClass, symbol_definition.class, "symbol_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsymbol_definition_Symbol_name(), ecorePackage.getEString(), "symbol_name", null, 0, 1, symbol_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsymbol_definition_Body_items(), this.getrule_production(), null, "body_items", null, 0, -1, symbol_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_action_definitionEClass, interface_action_definition.class, "interface_action_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinterface_action_definition_Action(), this.getinterface_action_id(), null, "action", null, 0, 1, interface_action_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_action_definition_Parameters(), this.getaction_portlist(), null, "parameters", null, 0, 1, interface_action_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_action_definition_Body_items(), this.getgraph_body_item(), null, "body_items", null, 0, -1, interface_action_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_productionEClass, rule_production.class, "rule_production", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rule_stmt_or_blockEClass, rule_stmt_or_block.class, "rule_stmt_or_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rule_stmt_alt_parallel_seqEClass, rule_stmt_alt_parallel_seq.class, "rule_stmt_alt_parallel_seq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rule_stmt_primaryEClass, rule_stmt_primary.class, "rule_stmt_primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrule_stmt_primary_Param(), ecorePackage.getEString(), "param", null, 0, 1, rule_stmt_primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_stmt_primary_Rhs(), this.getexpression(), null, "rhs", null, 0, 1, rule_stmt_primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_stmt_primary_Stmt_list(), this.getrule_stmt_or_block(), null, "stmt_list", null, 0, -1, rule_stmt_primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_stmt_parallel_altEClass, rule_stmt_parallel_alt.class, "rule_stmt_parallel_alt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrule_stmt_parallel_alt_Left(), this.getrule_stmt_parallel_alt(), null, "left", null, 0, 1, rule_stmt_parallel_alt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_stmt_parallel_alt_Right(), this.getrule_stmt_parallel(), null, "right", null, 0, 1, rule_stmt_parallel_alt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_stmt_parallelEClass, rule_stmt_parallel.class, "rule_stmt_parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rule_sequenceEClass, rule_sequence.class, "rule_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrule_sequence_Items(), this.getrule_seq_item(), null, "items", null, 0, -1, rule_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_seq_itemEClass, rule_seq_item.class, "rule_seq_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrule_seq_item_Action(), this.getinterface_action_id(), null, "action", null, 0, 1, rule_seq_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_seq_item_Action_params(), this.getparameter_list(), null, "action_params", null, 0, 1, rule_seq_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrule_seq_item_Item(), ecorePackage.getEString(), "item", null, 0, 1, rule_seq_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_seq_item_With_clause(), this.getrule_with_clause(), null, "with_clause", null, 0, 1, rule_seq_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_with_clauseEClass, rule_with_clause.class, "rule_with_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrule_with_clause_Body(), this.getconstraint_body_item(), null, "body", null, 0, -1, rule_with_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_listEClass, parameter_list.class, "parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_list_Parameters(), this.gethierarchical_id(), null, "parameters", null, 0, -1, parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_repeat_stmtEClass, rule_repeat_stmt.class, "rule_repeat_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrule_repeat_stmt_Expr(), this.getexpression(), null, "expr", null, 0, 1, rule_repeat_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrule_repeat_stmt_Stmt(), this.getrule_stmt_or_block(), null, "stmt", null, 0, 1, rule_repeat_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(overrides_declarationEClass, overrides_declaration.class, "overrides_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(override_stmtEClass, override_stmt.class, "override_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getoverride_stmt_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, override_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_overrideEClass, type_override.class, "type_override", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettype_override_Src(), ecorePackage.getEString(), "src", null, 0, 1, type_override.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instance_overrideEClass, instance_override.class, "instance_override", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinstance_override_Src(), this.gethierarchical_id(), null, "src", null, 0, 1, instance_override.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(data_declarationEClass, data_declaration.class, "data_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdata_declaration_Type(), this.getdata_type(), null, "type", null, 0, 1, data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdata_declaration_Instances(), this.getdata_instantiation(), null, "instances", null, 0, -1, data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(data_instantiationEClass, data_instantiation.class, "data_instantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdata_instantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, data_instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdata_instantiation_Portmap(), this.getgraph_interface_portmap_list(), null, "portmap", null, 0, 1, data_instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graph_interface_portmap_listEClass, graph_interface_portmap_list.class, "graph_interface_portmap_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgraph_interface_portmap_list_Maps(), this.getgraph_interface_portmap(), null, "maps", null, 0, -1, graph_interface_portmap_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graph_interface_portmapEClass, graph_interface_portmap.class, "graph_interface_portmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgraph_interface_portmap_Portname(), ecorePackage.getEString(), "portname", null, 0, 1, graph_interface_portmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_interface_portmap_Connected_name(), this.gethierarchical_id(), null, "connected_name", null, 0, 1, graph_interface_portmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(data_typeEClass, data_type.class, "data_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(user_defined_typeEClass, user_defined_type.class, "user_defined_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getuser_defined_type_Typename(), ecorePackage.getEString(), "typename", null, 0, 1, user_defined_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedef_declarationEClass, typedef_declaration.class, "typedef_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettypedef_declaration_Type(), this.getdata_type(), null, "type", null, 0, 1, typedef_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettypedef_declaration_Type_identifier(), ecorePackage.getEString(), "type_identifier", null, 0, 1, typedef_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_typeEClass, enum_type.class, "enum_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenum_type_Data_type(), this.getinteger_type(), null, "data_type", null, 0, 1, enum_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getenum_type_Items(), ecorePackage.getEString(), "items", null, 0, -1, enum_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integer_typeEClass, integer_type.class, "integer_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinteger_type_Atom_type(), ecorePackage.getEString(), "atom_type", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinteger_type_Lhs(), this.getexpression(), null, "lhs", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinteger_type_Rhs(), this.getexpression(), null, "rhs", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinteger_type_Inside(), this.gettype_inside_clause(), null, "inside", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_inside_clauseEClass, type_inside_clause.class, "type_inside_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_inside_clause_Domain(), this.getopen_range_list(), null, "domain", null, 0, 1, type_inside_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(open_range_listEClass, open_range_list.class, "open_range_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getopen_range_list_Ranges(), this.getopen_range_value(), null, "ranges", null, 0, -1, open_range_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(open_range_valueEClass, open_range_value.class, "open_range_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getopen_range_value_Lhs(), this.getexpression(), null, "lhs", null, 0, 1, open_range_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getopen_range_value_Range(), this.getrange_expr(), null, "range", null, 0, 1, open_range_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(range_exprEClass, range_expr.class, "range_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrange_expr_Lhs(), this.getexpression(), null, "lhs", null, 0, 1, range_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrange_expr_Rhs(), this.getexpression(), null, "rhs", null, 0, 1, range_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_declarationEClass, constraint_declaration.class, "constraint_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstraint_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, constraint_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstraint_declaration_Body(), this.getconstraint_body_item(), null, "body", null, 0, -1, constraint_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_body_itemEClass, constraint_body_item.class, "constraint_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expression_or_dist_itemEClass, expression_or_dist_item.class, "expression_or_dist_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(if_constraint_itemEClass, if_constraint_item.class, "if_constraint_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getif_constraint_item_If_expr(), this.getexpression(), null, "if_expr", null, 0, 1, if_constraint_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_constraint_item_True_case(), this.getconstraint_set(), null, "true_case", null, 0, 1, if_constraint_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_constraint_item_False_set(), this.getconstraint_set(), null, "false_set", null, 0, 1, if_constraint_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreach_constraint_itemEClass, foreach_constraint_item.class, "foreach_constraint_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getforeach_constraint_item_Expr(), this.getexpression(), null, "expr", null, 0, 1, foreach_constraint_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getforeach_constraint_item_Body(), this.getconstraint_set(), null, "body", null, 0, 1, foreach_constraint_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_setEClass, constraint_set.class, "constraint_set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstraint_set_Items(), ecorePackage.getEObject(), null, "items", null, 0, -1, constraint_set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_blockEClass, constraint_block.class, "constraint_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bin_or_scheme_declarationEClass, bin_or_scheme_declaration.class, "bin_or_scheme_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbin_or_scheme_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, bin_or_scheme_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bins_declarationEClass, bins_declaration.class, "bins_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbins_declaration_Item(), ecorePackage.getEString(), "item", null, 0, 1, bins_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbins_declaration_Bins(), this.getbin_specification(), null, "bins", null, 0, 1, bins_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bin_specificationEClass, bin_specification.class, "bin_specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbin_specification_Items(), this.getbin_specifier(), null, "items", null, 0, -1, bin_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bin_specifierEClass, bin_specifier.class, "bin_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(explicit_bin_valueEClass, explicit_bin_value.class, "explicit_bin_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(explicit_bin_rangeEClass, explicit_bin_range.class, "explicit_bin_range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexplicit_bin_range_Low(), this.getconstant(), null, "low", null, 0, 1, explicit_bin_range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexplicit_bin_range_High(), this.getconstant(), null, "high", null, 0, 1, explicit_bin_range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexplicit_bin_range_Div(), this.getconstant(), null, "div", null, 0, 1, explicit_bin_range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexplicit_bin_range_Size(), this.getconstant(), null, "size", null, 0, 1, explicit_bin_range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bin_range_divideEClass, bin_range_divide.class, "bin_range_divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bin_range_sizeEClass, bin_range_size.class, "bin_range_size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bin_scheme_declarationEClass, bin_scheme_declaration.class, "bin_scheme_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbin_scheme_declaration_Items(), this.getbin_scheme_specifier(), null, "items", null, 0, -1, bin_scheme_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bin_scheme_specifierEClass, bin_scheme_specifier.class, "bin_scheme_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbin_scheme_specifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, bin_scheme_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbin_scheme_specifier_Spec(), this.getbin_specifier(), null, "spec", null, 0, 1, bin_scheme_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_expressionEClass, constant_expression.class, "constant_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_Impl_constraint(), this.getconstraint_set(), null, "impl_constraint", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Expr(), ecorePackage.getEObject(), null, "expr", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Lhs(), this.getexpression(), null, "lhs", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Rhs(), this.getexpression(), null, "rhs", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Left(), this.getexpression(), null, "left", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_declarationEClass, interface_declaration.class, "interface_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinterface_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_declaration_Super(), this.getinterface_declaration(), null, "super", null, 0, 1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinterface_declaration_Body(), this.getinterface_body_item(), null, "body", null, 0, -1, interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_body_itemEClass, interface_body_item.class, "interface_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(action_declarationEClass, action_declaration.class, "action_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaction_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, action_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getaction_declaration_Ports(), this.getaction_portlist(), null, "ports", null, 0, 1, action_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(action_portlistEClass, action_portlist.class, "action_portlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaction_portlist_Ports(), this.getaction_port(), null, "ports", null, 0, -1, action_portlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(action_portEClass, action_port.class, "action_port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaction_port_Type(), this.getdata_type(), null, "type", null, 0, 1, action_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaction_port_Name(), ecorePackage.getEString(), "name", null, 0, 1, action_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graph_data_declarationEClass, graph_data_declaration.class, "graph_data_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgraph_data_declaration_Type(), this.getdata_type(), null, "type", null, 0, 1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getgraph_data_declaration_Names(), ecorePackage.getEString(), "names", null, 0, -1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_data_declaration_Portmaps(), this.getport_map(), null, "portmaps", null, 0, -1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbol_declarationEClass, symbol_declaration.class, "symbol_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsymbol_declaration_Decl_list(), this.getsymbol_decl_item(), null, "decl_list", null, 0, -1, symbol_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsymbol_declaration_Inline_rule(), this.getrule_stmt_or_block(), null, "inline_rule", null, 0, 1, symbol_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbol_decl_itemEClass, symbol_decl_item.class, "symbol_decl_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsymbol_decl_item_Name(), ecorePackage.getEString(), "name", null, 0, 1, symbol_decl_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsymbol_decl_item_Parameters(), this.getaction_portlist(), null, "parameters", null, 0, 1, symbol_decl_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(port_mapEClass, port_map.class, "port_map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getport_map_Port(), ecorePackage.getEString(), "port", null, 0, 1, port_map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getport_map_Map(), this.gethierarchical_id(), null, "map", null, 0, 1, port_map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, constant.class, "constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hierarchical_idEClass, hierarchical_id.class, "hierarchical_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gethierarchical_id_Value(), ecorePackage.getEString(), "value", null, 0, 1, hierarchical_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_action_idEClass, interface_action_id.class, "interface_action_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinterface_action_id_Ifc(), ecorePackage.getEString(), "ifc", null, 0, 1, interface_action_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinterface_action_id_Action(), ecorePackage.getEString(), "action", null, 0, 1, interface_action_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, literal.class, "literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getliteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimal_numberEClass, decimal_number.class, "decimal_number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdecimal_number_Value(), ecorePackage.getEInt(), "value", null, 0, 1, decimal_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, size.class, "size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alt_stmtEClass, alt_stmt.class, "alt_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getalt_stmt_Left(), this.getrule_stmt_alt_parallel_seq(), null, "left", null, 0, 1, alt_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getalt_stmt_Right(), this.getrule_stmt_primary(), null, "right", null, 0, 1, alt_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmt_altEClass, stmt_alt.class, "stmt_alt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(overides_declarationEClass, overides_declaration.class, "overides_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getoverides_declaration_Overrides(), this.getoverride_stmt(), null, "overrides", null, 0, -1, overides_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(condition_exprEClass, condition_expr.class, "condition_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcondition_expr_True_expr(), this.getexpression(), null, "true_expr", null, 0, 1, condition_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcondition_expr_False_expr(), this.getexpression(), null, "false_expr", null, 0, 1, condition_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_or_exprEClass, logical_or_expr.class, "logical_or_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_or_expr_Right(), this.getexpression(), null, "right", null, 0, 1, logical_or_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_and_exprEClass, logical_and_expr.class, "logical_and_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_and_expr_Right(), this.getexpression(), null, "right", null, 0, 1, logical_and_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_xor_exprEClass, binary_xor_expr.class, "binary_xor_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbinary_xor_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_xor_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_and_exprEClass, binary_and_expr.class, "binary_and_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbinary_and_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_and_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_equality_exprEClass, logical_equality_expr.class, "logical_equality_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlogical_equality_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, logical_equality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_equality_expr_Right(), this.getexpression(), null, "right", null, 0, 1, logical_equality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_inequality_exprEClass, logical_inequality_expr.class, "logical_inequality_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlogical_inequality_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, logical_inequality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_inequality_expr_Right(), this.getexpression(), null, "right", null, 0, 1, logical_inequality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_shift_exprEClass, binary_shift_expr.class, "binary_shift_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbinary_shift_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, binary_shift_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbinary_shift_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_shift_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_add_sub_exprEClass, binary_add_sub_expr.class, "binary_add_sub_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbinary_add_sub_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, binary_add_sub_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbinary_add_sub_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_add_sub_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_mul_div_mod_exprEClass, binary_mul_div_mod_expr.class, "binary_mul_div_mod_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbinary_mul_div_mod_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, binary_mul_div_mod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbinary_mul_div_mod_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_mul_div_mod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binary_exp_exprEClass, binary_exp_expr.class, "binary_exp_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbinary_exp_expr_Right(), this.getexpression(), null, "right", null, 0, 1, binary_exp_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PSSPackageImpl
