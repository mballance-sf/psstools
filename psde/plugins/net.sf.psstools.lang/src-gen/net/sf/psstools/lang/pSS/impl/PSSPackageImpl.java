/**
 */
package net.sf.psstools.lang.pSS.impl;

import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.PSSFactory;
import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.action_declaration;
import net.sf.psstools.lang.pSS.action_portlist;
import net.sf.psstools.lang.pSS.alt_stmt;
import net.sf.psstools.lang.pSS.binary_add_sub_expr;
import net.sf.psstools.lang.pSS.binary_and_expr;
import net.sf.psstools.lang.pSS.binary_exp_expr;
import net.sf.psstools.lang.pSS.binary_mul_div_mod_expr;
import net.sf.psstools.lang.pSS.binary_shift_expr;
import net.sf.psstools.lang.pSS.binary_xor_expr;
import net.sf.psstools.lang.pSS.condition_expr;
import net.sf.psstools.lang.pSS.constraint_body_item;
import net.sf.psstools.lang.pSS.constraint_body_no_if_item;
import net.sf.psstools.lang.pSS.constraint_declaration;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.decimal_number;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.expression_or_dist_item;
import net.sf.psstools.lang.pSS.foreach_constraint_item;
import net.sf.psstools.lang.pSS.graph_body_item;
import net.sf.psstools.lang.pSS.graph_data_declaration;
import net.sf.psstools.lang.pSS.graph_datatype;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_or_struct_declaration;
import net.sf.psstools.lang.pSS.graph_struct_ifc_declaration;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.if_constraint_item;
import net.sf.psstools.lang.pSS.ifc_call_parameter_list;
import net.sf.psstools.lang.pSS.instance_override;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.interface_body_item;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.literal;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_inequality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;
import net.sf.psstools.lang.pSS.overides_declaration;
import net.sf.psstools.lang.pSS.override_stmt;
import net.sf.psstools.lang.pSS.overrides_declaration;
import net.sf.psstools.lang.pSS.port_declaration;
import net.sf.psstools.lang.pSS.port_map;
import net.sf.psstools.lang.pSS.portable_stimulus_description;
import net.sf.psstools.lang.pSS.primitive_datatype;
import net.sf.psstools.lang.pSS.repeat_stmt;
import net.sf.psstools.lang.pSS.rule_production;
import net.sf.psstools.lang.pSS.seq;
import net.sf.psstools.lang.pSS.seq_item;
import net.sf.psstools.lang.pSS.size;
import net.sf.psstools.lang.pSS.stmt_alt;
import net.sf.psstools.lang.pSS.stmt_or_block;
import net.sf.psstools.lang.pSS.stmt_parallel;
import net.sf.psstools.lang.pSS.stmt_primary;
import net.sf.psstools.lang.pSS.struct_body_item;
import net.sf.psstools.lang.pSS.struct_data_declaration;
import net.sf.psstools.lang.pSS.struct_datatype;
import net.sf.psstools.lang.pSS.struct_declaration;
import net.sf.psstools.lang.pSS.struct_graph_body_item;
import net.sf.psstools.lang.pSS.symbol_declaration;
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.type_override;

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
  private EClass struct_graph_body_itemEClass = null;

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
  private EClass rule_productionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmt_or_blockEClass = null;

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
  private EClass stmt_primaryEClass = null;

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
  private EClass stmt_parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seq_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifc_call_parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeat_stmtEClass = null;

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
  private EClass constraint_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraint_body_no_if_itemEClass = null;

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
  private EClass port_mapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_data_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graph_datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitive_datatypeEClass = null;

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
  private EClass hierarchical_idEClass = null;

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
  public EReference getModel_TopLevel()
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
  public EClass getstruct_graph_body_item()
  {
    return struct_graph_body_itemEClass;
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
  public EAttribute getsymbol_definition_Name()
  {
    return (EAttribute)symbol_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsymbol_definition_Rule()
  {
    return (EReference)symbol_definitionEClass.getEStructuralFeatures().get(1);
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
  public EClass getstmt_or_block()
  {
    return stmt_or_blockEClass;
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
  public EClass getstmt_primary()
  {
    return stmt_primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstmt_primary_Stmt_list()
  {
    return (EReference)stmt_primaryEClass.getEStructuralFeatures().get(0);
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
  public EClass getstmt_parallel()
  {
    return stmt_parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getseq()
  {
    return seqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getseq_Items()
  {
    return (EReference)seqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getseq_item()
  {
    return seq_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getifc_call_parameter_list()
  {
    return ifc_call_parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getifc_call_parameter_list_Parameters()
  {
    return (EReference)ifc_call_parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrepeat_stmt()
  {
    return repeat_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepeat_stmt_Stmt()
  {
    return (EReference)repeat_stmtEClass.getEStructuralFeatures().get(0);
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
  public EClass getconstraint_body_no_if_item()
  {
    return constraint_body_no_if_itemEClass;
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
  public EReference getaction_portlist_Type()
  {
    return (EReference)action_portlistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaction_portlist_Name()
  {
    return (EAttribute)action_portlistEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getsymbol_declaration_Name()
  {
    return (EAttribute)symbol_declarationEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getsymbol_declaration_Names()
  {
    return (EAttribute)symbol_declarationEClass.getEStructuralFeatures().get(2);
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
  public EClass getstruct_data_declaration()
  {
    return struct_data_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstruct_data_declaration_Type()
  {
    return (EReference)struct_data_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstruct_data_declaration_Names()
  {
    return (EAttribute)struct_data_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph_datatype()
  {
    return graph_datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_datatype_Graph_typename()
  {
    return (EReference)graph_datatypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstruct_datatype()
  {
    return struct_datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstruct_datatype_Struct_typename()
  {
    return (EReference)struct_datatypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprimitive_datatype()
  {
    return primitive_datatypeEClass;
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
  public EAttribute getinteger_type_Range_lhs()
  {
    return (EAttribute)integer_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteger_type_Range_rhs()
  {
    return (EAttribute)integer_typeEClass.getEStructuralFeatures().get(1);
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
  public EReference gethierarchical_id_Parameters()
  {
    return (EReference)hierarchical_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gethierarchical_id_Value()
  {
    return (EAttribute)hierarchical_idEClass.getEStructuralFeatures().get(1);
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
    createEReference(modelEClass, MODEL__TOP_LEVEL);

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

    struct_graph_body_itemEClass = createEClass(STRUCT_GRAPH_BODY_ITEM);

    struct_body_itemEClass = createEClass(STRUCT_BODY_ITEM);

    graph_body_itemEClass = createEClass(GRAPH_BODY_ITEM);

    symbol_definitionEClass = createEClass(SYMBOL_DEFINITION);
    createEAttribute(symbol_definitionEClass, SYMBOL_DEFINITION__NAME);
    createEReference(symbol_definitionEClass, SYMBOL_DEFINITION__RULE);

    rule_productionEClass = createEClass(RULE_PRODUCTION);

    stmt_or_blockEClass = createEClass(STMT_OR_BLOCK);

    alt_stmtEClass = createEClass(ALT_STMT);
    createEReference(alt_stmtEClass, ALT_STMT__LEFT);
    createEReference(alt_stmtEClass, ALT_STMT__RIGHT);

    stmt_primaryEClass = createEClass(STMT_PRIMARY);
    createEReference(stmt_primaryEClass, STMT_PRIMARY__STMT_LIST);

    stmt_altEClass = createEClass(STMT_ALT);

    stmt_parallelEClass = createEClass(STMT_PARALLEL);

    seqEClass = createEClass(SEQ);
    createEReference(seqEClass, SEQ__ITEMS);

    seq_itemEClass = createEClass(SEQ_ITEM);

    ifc_call_parameter_listEClass = createEClass(IFC_CALL_PARAMETER_LIST);
    createEReference(ifc_call_parameter_listEClass, IFC_CALL_PARAMETER_LIST__PARAMETERS);

    repeat_stmtEClass = createEClass(REPEAT_STMT);
    createEReference(repeat_stmtEClass, REPEAT_STMT__STMT);

    overrides_declarationEClass = createEClass(OVERRIDES_DECLARATION);

    override_stmtEClass = createEClass(OVERRIDE_STMT);
    createEAttribute(override_stmtEClass, OVERRIDE_STMT__DEST);

    type_overrideEClass = createEClass(TYPE_OVERRIDE);
    createEAttribute(type_overrideEClass, TYPE_OVERRIDE__SRC);

    instance_overrideEClass = createEClass(INSTANCE_OVERRIDE);
    createEReference(instance_overrideEClass, INSTANCE_OVERRIDE__SRC);

    constraint_declarationEClass = createEClass(CONSTRAINT_DECLARATION);
    createEAttribute(constraint_declarationEClass, CONSTRAINT_DECLARATION__NAME);
    createEReference(constraint_declarationEClass, CONSTRAINT_DECLARATION__BODY);

    constraint_body_no_if_itemEClass = createEClass(CONSTRAINT_BODY_NO_IF_ITEM);

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
    createEReference(action_portlistEClass, ACTION_PORTLIST__TYPE);
    createEAttribute(action_portlistEClass, ACTION_PORTLIST__NAME);

    graph_data_declarationEClass = createEClass(GRAPH_DATA_DECLARATION);
    createEReference(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__TYPE);
    createEAttribute(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__NAMES);
    createEReference(graph_data_declarationEClass, GRAPH_DATA_DECLARATION__PORTMAPS);

    symbol_declarationEClass = createEClass(SYMBOL_DECLARATION);
    createEAttribute(symbol_declarationEClass, SYMBOL_DECLARATION__NAME);
    createEReference(symbol_declarationEClass, SYMBOL_DECLARATION__INLINE_RULE);
    createEAttribute(symbol_declarationEClass, SYMBOL_DECLARATION__NAMES);

    port_mapEClass = createEClass(PORT_MAP);
    createEAttribute(port_mapEClass, PORT_MAP__PORT);
    createEReference(port_mapEClass, PORT_MAP__MAP);

    struct_data_declarationEClass = createEClass(STRUCT_DATA_DECLARATION);
    createEReference(struct_data_declarationEClass, STRUCT_DATA_DECLARATION__TYPE);
    createEAttribute(struct_data_declarationEClass, STRUCT_DATA_DECLARATION__NAMES);

    graph_datatypeEClass = createEClass(GRAPH_DATATYPE);
    createEReference(graph_datatypeEClass, GRAPH_DATATYPE__GRAPH_TYPENAME);

    struct_datatypeEClass = createEClass(STRUCT_DATATYPE);
    createEReference(struct_datatypeEClass, STRUCT_DATATYPE__STRUCT_TYPENAME);

    primitive_datatypeEClass = createEClass(PRIMITIVE_DATATYPE);

    integer_typeEClass = createEClass(INTEGER_TYPE);
    createEAttribute(integer_typeEClass, INTEGER_TYPE__RANGE_LHS);
    createEAttribute(integer_typeEClass, INTEGER_TYPE__RANGE_RHS);

    hierarchical_idEClass = createEClass(HIERARCHICAL_ID);
    createEReference(hierarchical_idEClass, HIERARCHICAL_ID__PARAMETERS);
    createEAttribute(hierarchical_idEClass, HIERARCHICAL_ID__VALUE);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__VALUE);

    decimal_numberEClass = createEClass(DECIMAL_NUMBER);
    createEAttribute(decimal_numberEClass, DECIMAL_NUMBER__VALUE);

    sizeEClass = createEClass(SIZE);

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
    struct_graph_body_itemEClass.getESuperTypes().add(this.getstruct_body_item());
    struct_graph_body_itemEClass.getESuperTypes().add(this.getgraph_body_item());
    symbol_definitionEClass.getESuperTypes().add(this.getgraph_body_item());
    stmt_or_blockEClass.getESuperTypes().add(this.getrule_production());
    alt_stmtEClass.getESuperTypes().add(this.getstmt_or_block());
    stmt_primaryEClass.getESuperTypes().add(this.getalt_stmt());
    stmt_altEClass.getESuperTypes().add(this.getstmt_primary());
    stmt_parallelEClass.getESuperTypes().add(this.getstmt_alt());
    seqEClass.getESuperTypes().add(this.getstmt_parallel());
    repeat_stmtEClass.getESuperTypes().add(this.getstmt_or_block());
    overrides_declarationEClass.getESuperTypes().add(this.getstruct_graph_body_item());
    type_overrideEClass.getESuperTypes().add(this.getoverride_stmt());
    instance_overrideEClass.getESuperTypes().add(this.getoverride_stmt());
    constraint_declarationEClass.getESuperTypes().add(this.getstruct_graph_body_item());
    constraint_body_no_if_itemEClass.getESuperTypes().add(this.getconstraint_body_item());
    expression_or_dist_itemEClass.getESuperTypes().add(this.getconstraint_body_no_if_item());
    if_constraint_itemEClass.getESuperTypes().add(this.getconstraint_body_item());
    foreach_constraint_itemEClass.getESuperTypes().add(this.getconstraint_body_no_if_item());
    expressionEClass.getESuperTypes().add(this.getexpression_or_dist_item());
    interface_declarationEClass.getESuperTypes().add(this.getportable_stimulus_description());
    interface_declarationEClass.getESuperTypes().add(this.getgraph_struct_ifc_declaration());
    action_declarationEClass.getESuperTypes().add(this.getinterface_body_item());
    graph_data_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    symbol_declarationEClass.getESuperTypes().add(this.getgraph_body_item());
    struct_data_declarationEClass.getESuperTypes().add(this.getstruct_body_item());
    primitive_datatypeEClass.getESuperTypes().add(this.getaction_portlist());
    primitive_datatypeEClass.getESuperTypes().add(this.getgraph_datatype());
    primitive_datatypeEClass.getESuperTypes().add(this.getstruct_datatype());
    integer_typeEClass.getESuperTypes().add(this.getprimitive_datatype());
    hierarchical_idEClass.getESuperTypes().add(this.getseq_item());
    sizeEClass.getESuperTypes().add(this.getdecimal_number());
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
    initEReference(getModel_TopLevel(), this.getportable_stimulus_description(), null, "topLevel", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(struct_graph_body_itemEClass, struct_graph_body_item.class, "struct_graph_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(struct_body_itemEClass, struct_body_item.class, "struct_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graph_body_itemEClass, graph_body_item.class, "graph_body_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbol_definitionEClass, symbol_definition.class, "symbol_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsymbol_definition_Name(), ecorePackage.getEString(), "name", null, 0, 1, symbol_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsymbol_definition_Rule(), this.getrule_production(), null, "rule", null, 0, 1, symbol_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rule_productionEClass, rule_production.class, "rule_production", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stmt_or_blockEClass, stmt_or_block.class, "stmt_or_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alt_stmtEClass, alt_stmt.class, "alt_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getalt_stmt_Left(), this.getalt_stmt(), null, "left", null, 0, 1, alt_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getalt_stmt_Right(), this.getstmt_primary(), null, "right", null, 0, 1, alt_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmt_primaryEClass, stmt_primary.class, "stmt_primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstmt_primary_Stmt_list(), this.getstmt_or_block(), null, "stmt_list", null, 0, -1, stmt_primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmt_altEClass, stmt_alt.class, "stmt_alt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stmt_parallelEClass, stmt_parallel.class, "stmt_parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seqEClass, seq.class, "seq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getseq_Items(), this.getseq_item(), null, "items", null, 0, -1, seq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seq_itemEClass, seq_item.class, "seq_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifc_call_parameter_listEClass, ifc_call_parameter_list.class, "ifc_call_parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getifc_call_parameter_list_Parameters(), this.gethierarchical_id(), null, "parameters", null, 0, -1, ifc_call_parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeat_stmtEClass, repeat_stmt.class, "repeat_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrepeat_stmt_Stmt(), this.getstmt_or_block(), null, "stmt", null, 0, 1, repeat_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(overrides_declarationEClass, overrides_declaration.class, "overrides_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(override_stmtEClass, override_stmt.class, "override_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getoverride_stmt_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, override_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_overrideEClass, type_override.class, "type_override", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettype_override_Src(), ecorePackage.getEString(), "src", null, 0, 1, type_override.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instance_overrideEClass, instance_override.class, "instance_override", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinstance_override_Src(), this.gethierarchical_id(), null, "src", null, 0, 1, instance_override.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_declarationEClass, constraint_declaration.class, "constraint_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstraint_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, constraint_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstraint_declaration_Body(), this.getconstraint_body_item(), null, "body", null, 0, -1, constraint_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraint_body_no_if_itemEClass, constraint_body_no_if_item.class, "constraint_body_no_if_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
    initEReference(getconstraint_set_Items(), this.getconstraint_body_item(), null, "items", null, 0, -1, constraint_set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getaction_declaration_Ports(), this.getaction_portlist(), null, "ports", null, 0, -1, action_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(action_portlistEClass, action_portlist.class, "action_portlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaction_portlist_Type(), this.getstruct_declaration(), null, "type", null, 0, 1, action_portlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaction_portlist_Name(), ecorePackage.getEString(), "name", null, 0, 1, action_portlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graph_data_declarationEClass, graph_data_declaration.class, "graph_data_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgraph_data_declaration_Type(), this.getgraph_datatype(), null, "type", null, 0, 1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getgraph_data_declaration_Names(), ecorePackage.getEString(), "names", null, 0, -1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_data_declaration_Portmaps(), this.getport_map(), null, "portmaps", null, 0, -1, graph_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbol_declarationEClass, symbol_declaration.class, "symbol_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsymbol_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, symbol_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsymbol_declaration_Inline_rule(), this.getstmt_or_block(), null, "inline_rule", null, 0, 1, symbol_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsymbol_declaration_Names(), ecorePackage.getEString(), "names", null, 0, -1, symbol_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(port_mapEClass, port_map.class, "port_map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getport_map_Port(), ecorePackage.getEString(), "port", null, 0, 1, port_map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getport_map_Map(), this.gethierarchical_id(), null, "map", null, 0, 1, port_map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_data_declarationEClass, struct_data_declaration.class, "struct_data_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstruct_data_declaration_Type(), this.getstruct_datatype(), null, "type", null, 0, 1, struct_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstruct_data_declaration_Names(), ecorePackage.getEString(), "names", null, 0, -1, struct_data_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graph_datatypeEClass, graph_datatype.class, "graph_datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgraph_datatype_Graph_typename(), this.getgraph_struct_ifc_declaration(), null, "graph_typename", null, 0, 1, graph_datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_datatypeEClass, struct_datatype.class, "struct_datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstruct_datatype_Struct_typename(), this.getstruct_declaration(), null, "struct_typename", null, 0, 1, struct_datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitive_datatypeEClass, primitive_datatype.class, "primitive_datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integer_typeEClass, integer_type.class, "integer_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinteger_type_Range_lhs(), ecorePackage.getEInt(), "range_lhs", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinteger_type_Range_rhs(), ecorePackage.getEInt(), "range_rhs", null, 0, 1, integer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hierarchical_idEClass, hierarchical_id.class, "hierarchical_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gethierarchical_id_Parameters(), this.getifc_call_parameter_list(), null, "parameters", null, 0, 1, hierarchical_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gethierarchical_id_Value(), ecorePackage.getEString(), "value", null, 0, 1, hierarchical_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, literal.class, "literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getliteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimal_numberEClass, decimal_number.class, "decimal_number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdecimal_number_Value(), ecorePackage.getEInt(), "value", null, 0, 1, decimal_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, size.class, "size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
